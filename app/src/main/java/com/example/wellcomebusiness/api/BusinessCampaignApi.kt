package com.example.wellcomebusiness.api

import com.example.wellcomebusiness.model.BusinessModelResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface BusinessCampaignApi {
    @GET("businesscampaigns")
    suspend fun fetchBusinessCampaign(
        @Query("pipelineId") pipelineId:String,
        @Query("businessId") businessId:String,
        @Query("lastRangeKey") lastRangeKey:String? = null,
        @Query("action") action:String = "fetchAll"

    ):BusinessModelResponse
}