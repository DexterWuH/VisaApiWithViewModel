package com.example.wellcomebusiness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.wellcomebusiness.di.DIModule
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch {
            withContext(Dispatchers.IO) {
                val response = DIModule.api.fetchBusinessCampaign(
                    pipelineId = "91c0fb1f-8364-4cd0-8f76-dacd1e37e2d4",
                    businessId = "cincinnatiai"
                )
                Log.d("API response", "${response.results}")
            }
        }
    }
}