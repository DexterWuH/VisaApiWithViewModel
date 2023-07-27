package com.example.wellcomebusiness.model

import com.google.gson.annotations.SerializedName

data class BusinessModelResponse(
    val results: List<BusinessCampaign>,
    @SerializedName("last_range_key")
    val lastRangeKey:String?
)
