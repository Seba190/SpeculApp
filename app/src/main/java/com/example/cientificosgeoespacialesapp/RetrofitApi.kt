package com.example.cientificosgeoespacialesapp

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitApi {
        @GET("ae9c2c3b464112d9988e5dd0c9a31d10")
        fun getAssetInfo(
                @Query("assetId") assetId: String
        ): Call<AssetInfoResponse>

}