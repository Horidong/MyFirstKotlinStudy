package com.example.kotlinproject01

import android.content.Context
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

interface Shape{
    fun onDraw()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var person:Person = Person("jame", 30)
        val oldone:Person = person.copy(age=45)


        /*
        val webView = WebView(mCtx)
        webView.setWebViewClient(object: WebViewClient(){
            override fun onPageStarted(view:WebView?, url:String?, favicon: Bitmap?){
                super.onPageStarted(view, url, favicon)
            }
        })
        */

        val triangle = object:Shape{
            override fun onDraw(){}
        }

    }
}