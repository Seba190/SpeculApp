package com.example.cientificosgeoespacialesapp

import android.app.Activity
import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.common.api.Scope
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.SupportMapFragment
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport
import com.google.api.client.json.gson.GsonFactory
import com.google.auth.http.HttpCredentialsAdapter
import com.google.auth.oauth2.GoogleCredentials
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.tasks.Task
import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.FileInputStream
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Color
import android.content.Context
import android.graphics.BitmapFactory
import android.webkit.WebChromeClient
import android.widget.Button
import android.widget.ImageView
import java.io.FileOutputStream
import retrofit2.http.GET
import retrofit2.http.Query
import com.squareup.picasso.Picasso
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.common.api.GoogleApiClient
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets
import com.google.api.client.json.JsonFactory
import java.io.File
import java.io.FileReader
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow



abstract class MainActivity : AppCompatActivity() {
    private val RC_SIGN_IN = 1001
    private lateinit var mMap: GoogleMap
    private lateinit var signInLauncher: ActivityResultLauncher<Intent>
    private lateinit var googleSignInClient: GoogleSignInClient
    private lateinit var webView: WebView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        /*val imageView= findViewById<ImageView>(R.id.imageView)
        Picasso.get()
            .load(R.drawable.ndvi)
            .resize(800, 800) // Redimensionar la imagen
            .centerInside()// URL de la imagen o archivo local
            .into(imageView)*/
        webView = findViewById(R.id.webView)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)

        button1.setOnClickListener {

        }

        button2.setOnClickListener {

        }

        // Configurar WebView
        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true // Habilita JavaScript
        webSettings.cacheMode = WebSettings.LOAD_DEFAULT // Cargar desde caché si es posible
        webSettings.domStorageEnabled = true // Habilita el almacenamiento DOM
        webSettings.mediaPlaybackRequiresUserGesture = false // Permite la reproducción automática
        webSettings.setSupportMultipleWindows(true) // Soporta múltiples ventanas
        webSettings.allowUniversalAccessFromFileURLs
        webSettings.javaScriptCanOpenWindowsAutomatically = true
        webSettings.setGeolocationEnabled(true)
        webSettings.setSupportZoom(true)
        webSettings.databaseEnabled = true
        webSettings.domStorageEnabled = true
        webSettings.layoutAlgorithm





        // webSettings.userAgentString = "Your custom user agent string" // Opcional

        webView.webChromeClient = WebChromeClient()
        val desktopUserAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36"
        webSettings.userAgentString = desktopUserAgent
        // Cargar la URL de tu Google Earth Engine App modificado
        val googleEarthEngineAppUrl = "https://sentinel-indiced.projects.earthengine.app/view/ndvi"
        webView.loadUrl(googleEarthEngineAppUrl)
    }
}








