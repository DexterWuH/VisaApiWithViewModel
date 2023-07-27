package com.example.wellcomebusiness.model

import com.google.gson.annotations.SerializedName

data class UserProfile(
    @SerializedName("first_name")
    val firstName:String,
    @SerializedName("last_name")
    val lastName:String,
    @SerializedName("middle_name")
    val middleName:String?,
    val email:String,
    val phone:String,
    @SerializedName("date_of_birth")
    val dateOfBirth:String,
    val nationality: String
)
