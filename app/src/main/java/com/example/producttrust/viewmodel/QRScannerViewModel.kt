package com.example.producttrust.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.producttrust.apiservice.ProductApi
import com.example.producttrust.model.ProductData
import kotlinx.coroutines.launch

class QRScannerViewModel : ViewModel() {
    private val api = Retrofit.Builder()
        .baseUrl("https://api.example.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ProductApi::class.java)

    private val _productData = mutableStateOf<ProductData?>(null)
    val productData = _productData

    fun fetchProductData(qrCode: String) {
        viewModelScope.launch {
            try {
                val product = api.getProductDetails(qrCode)
                _productData.value = product
            } catch (e: Exception) {
                _productData.value = null
            }
        }
    }
}
