package com.loomverse.app.data.repository

import com.revenuecat.purchases.Purchases
import com.revenuecat.purchases.getCustomerInfoWith
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
import com.revenuecat.purchases.CustomerInfo
import com.revenuecat.purchases.PurchasesError
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SubscriptionRepositoryImpl @Inject constructor() : SubscriptionRepository {

    private val _isPremium = MutableStateFlow(false)
    override val isPremium: StateFlow<Boolean> = _isPremium.asStateFlow()

    init {
        // Initial check (Dormant mode: defaults to false)
        // checkSubscriptionStatus()
    }

    override fun checkSubscriptionStatus() {
        // RevenueCat Logic (Dormant)
        /*
        Purchases.sharedInstance.getCustomerInfo(object : ReceiveCustomerInfoCallback {
            override fun onReceived(customerInfo: CustomerInfo) {
                val premium = customerInfo.entitlements["pro_storyteller"]?.isActive == true
                _isPremium.value = premium
            }

            override fun onError(error: PurchasesError) {
                // Handle error
                _isPremium.value = false
            }
        })
        */
        
        // For now, strictly False to enable Ad testing
        _isPremium.value = false
    }
}
