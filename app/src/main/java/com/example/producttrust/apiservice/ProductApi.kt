package com.example.producttrust.apiservice

import com.google.android.datatransport.ProductData

interface ProductApi {
    @GET("product/{id}")
    suspend fun getProductDetails(@Path("id") id: String): ProductData
}