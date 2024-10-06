package com.example.cientificosgeoespacialesapp

data class AssetListResponse(
    val assets: List<Asset>
)

data class Asset(
    val name: String,
    val type: String
)
