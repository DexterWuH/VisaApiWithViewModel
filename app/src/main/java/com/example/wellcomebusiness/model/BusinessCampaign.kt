package com.example.wellcomebusiness.model

import com.google.gson.annotations.SerializedName

data class BusinessCampaign(
    @SerializedName("partition_key")
    val partitionKey:String,
    @SerializedName("range_key")
    val rangeKey:String,
    @SerializedName("profile_info")
    val profileInfo:String,
    val created:String,
    val modified:String,
    val status:String,
    @SerializedName("pipeline_index_key")
    val pipelineIndexKey:String

)
