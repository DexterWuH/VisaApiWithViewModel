package com.example.wellcomebusiness.model

import com.google.gson.annotations.SerializedName

data class CampaignDisplayModel (
val partitionKey:String,
val rangeKey:String,
val profileInfo:UserProfile,
val pipelineIndexKey:String
)

