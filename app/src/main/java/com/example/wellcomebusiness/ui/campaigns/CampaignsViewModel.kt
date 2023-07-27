package com.example.wellcomebusiness.ui.campaigns

import androidx.lifecycle.ViewModel
import com.example.wellcomebusiness.repository.BusinessCampaignRepositoryContract

class CampaignsViewModel(
    private val campaignRepository: BusinessCampaignRepositoryContract
) : ViewModel() {
    fun fetchCampaign() {
     campaignRepository.fetchCampaignDisplayModel("91c0fb1f-8364-4cd0-8f76-dacd1e37e2d4", "cincinnatiai")
    }
}