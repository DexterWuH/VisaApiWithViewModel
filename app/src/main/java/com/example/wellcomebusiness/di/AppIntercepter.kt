package com.example.wellcomebusiness.di

import okhttp3.Interceptor

private const val API_KEY="7f1PDFinSyaNeZjsJj6Qq3CMYh7pKMZw4E2wkXT7"

val apiIntercepter = Interceptor{
    val originalRequest=it.request()
    val updated = originalRequest.newBuilder().addHeader(
            "x-api-key", API_KEY
            ).build()
    it.proceed(updated)
}