package com.example.cientificosgeoespacialesapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport
import com.google.api.client.json.gson.GsonFactory
import com.google.auth.http.HttpCredentialsAdapter
import com.google.auth.oauth2.GoogleCredentials
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Call

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.FileInputStream

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
         val webView: WebView = findViewById(R.id.webView)
        webView.webViewClient = WebViewClient() // Permite que la navegación ocurra en el WebView

        // Habilita JavaScript para Felt si es necesario
        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true

        // Carga la URL de Felt en el WebView
        //webView.loadUrl("https://felt.com/map/Example-Hurricane-Sandy-Inundation-Zone-IUnrYOBaQp6atRiI9BtVsZD")
        webView.loadUrl("https://sentinel-indiced.projects.earthengine.app/view/indicessentinel")

        //val transport = GoogleNetHttpTransport.newTrustedTransport()
        // val jsonFactory = GsonFactory.getDefaultInstance()

        /* val earthEngineService = EarthEngine.Builder(transport, jsonFactory, HttpCredentialsAdapter(credentials))
            .setApplicationName("Cientificos GeoEspaciales")
            .build()

        val imageCollection = earthEngineService.imageCollection().list()
            .setId("MODIS/006/MOD13Q1")  // Dataset de ejemplo
            .execute()

        val images = imageCollection.images*/

        /* val retrofit = Retrofit.Builder()
            .baseUrl("https://code.earthengine.google.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val credentials = GoogleCredentials.fromStream(FileInputStream("app/client_secret_571528682835-1jm3u7shi8gstrj05olgi2bhkhh0i5g9.apps.googleusercontent.com.json"))
            .createScoped(listOf("https://www.googleapis.com/auth/earthengine.readonly"))

// Obtén el token de acceso
        val token = credentials.refreshAccessToken().tokenValue

        val authInterceptor = Interceptor { chain ->
            val newRequest = chain.request().newBuilder()
                .addHeader("Authorization", "Bearer $token")
                .build()
            chain.proceed(newRequest)
        }

        val client = OkHttpClient.Builder()
            .addInterceptor(authInterceptor)
            .build()

// Agregar el cliente a Retrofit
        val retrofitWithAuth = Retrofit.Builder()
            .baseUrl("https://code.earthengine.google.com/")
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }*/

        /* suspend fun fetchEarthEngineData(): GeeResponse? {

        val retrofit = Retrofit.Builder()
            .baseUrl("https://code.earthengine.google.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val response = retrofit.create(RetrofitApi::class.java)
            .getEarthEngineData("ae9c2c3b464112d9988e5dd0c9a31d10")
        return if (response.isSuccessful) {
            response.body()
        } else {
            null
        }
    }*/
     /*   val assetId = "projects/earthengine-legacy/assets/users/tu_usuario/tu_imagen"
        fetchAssetInfo(assetId)

    }
    fun fetchAssetInfo(assetId: String) {

        val credentialsPath =
            "app/client_secret_571528682835-1jm3u7shi8gstrj05olgi2bhkhh0i5g9.apps.googleusercontent.com.json"

        val credentials = GoogleCredentials.fromStream(FileInputStream(credentialsPath))
            .createScoped(listOf("https://www.googleapis.com/auth/earthengine.readonly"))

        val token = credentials.refreshAccessToken().tokenValue

        val authInterceptor = Interceptor { chain ->
            val newRequest = chain.request().newBuilder()
                .addHeader("Authorization", "Bearer $token")
                .build()
            chain.proceed(newRequest)
        }

// Crear el cliente OkHttp con el interceptor de autenticación
        val client = OkHttpClient.Builder()
            .addInterceptor(authInterceptor)
            .build()

// Configurar Retrofit
        val retrofit = Retrofit.Builder()
            .baseUrl("https://code.earthengine.google.com/")
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val earthEngineApi = retrofit.create(RetrofitApi::class.java)

        // Realiza la llamada a la API para obtener la información del asset
        val call = earthEngineApi.getAssetInfo(assetId)

        call.enqueue(object : retrofit2.Callback<AssetInfoResponse> {
            override fun onResponse(call: Call<AssetInfoResponse>, response: retrofit2.Response<AssetInfoResponse>) {
                if (response.isSuccessful) {
                    // Procesa la respuesta de éxito
                    val assetInfo = response.body()
                    if (assetInfo != null) {
                        // Hacer algo con assetInfo
                        println("Asset Name: ${assetInfo.name}")
                    }
                } else {
                    // Manejar error de API
                    println("Error: ${response.errorBody()?.string()}")
                }
            }

            override fun onFailure(call: Call<AssetInfoResponse>, t: Throwable) {
                // Manejar error de red o falla de la solicitud
                println("Failed to fetch asset info: ${t.message}")
            }
        })*/
    }
}
