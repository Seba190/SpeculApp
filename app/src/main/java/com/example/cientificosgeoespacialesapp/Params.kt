package com.example.cientificosgeoespacialesapp

data class Params(val isDebug: Boolean,
                  val mapsApiKey: String,
                  val mapsVersion: String,
                  val prodRealm: String,
                  val stagingRealm: String,
                  val appName: String,
                  val ownerId: String,
                  val authClientId: String,
                  val authToken: String,
                  val authTokenExpiresInMs: Long,
                  val appIdToken: String)
