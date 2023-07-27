package com.example.wellcomebusiness.di

import com.example.wellcomebusiness.api.BusinessCampaignApi
import com.example.wellcomebusiness.repository.BusinessCampaignRepository
import com.example.wellcomebusiness.repository.BusinessCampaignRepositoryContract
import com.google.gson.Gson
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object DIModule {

    private val okhttp by lazy {
        OkHttpClient.Builder()
            .addInterceptor(apiIntercepter)
            .build()
    }

    private val retrofit:Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://o9ffjbad4h.execute-api.us-east-2.amazonaws.com/dev/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(okhttp)
            .build()
    }

    val api:BusinessCampaignApi by lazy {
        retrofit.create(BusinessCampaignApi::class.java)
    }

    val repository:BusinessCampaignRepositoryContract by lazy {
        BusinessCampaignRepository(
            api,
            Gson()
        )
    }
}