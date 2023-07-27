package com.example.wellcomebusiness.repository

import com.example.wellcomebusiness.api.BusinessCampaignApi
import com.example.wellcomebusiness.model.CampaignDisplayModel
import com.example.wellcomebusiness.model.UserProfile
import com.google.gson.Gson
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.security.PrivateKey


interface  BusinessCampaignRepositoryContract{
    suspend fun fetchCampaignDisplayModel(
        pipelineId:String,
        businessId:String
    ):List<CampaignDisplayModel>
}
class BusinessCampaignRepository (
    private val api:BusinessCampaignApi,
    private val gson:Gson,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
        ):BusinessCampaignRepositoryContract {
    override suspend fun fetchCampaignDisplayModel(
        pipelineId: String,
        businessId: String
    ): List<CampaignDisplayModel> = withContext(dispatcher) {
        val response = api.fetchBusinessCampaign(pipelineId, businessId)
        return@withContext response.results.map {
            CampaignDisplayModel(
                it.partitionKey,
                it.rangeKey,
                gson.fromJson(it.profileInfo, UserProfile::class.java),
                it.pipelineIndexKey
            )
        }
    }


}