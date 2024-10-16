package com.diu.dailytools;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class About_Me_Web_View extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me_web_view);
        webView=findViewById(R.id.MyProfileWebView);

        webView.loadUrl("https://sites.google.com/diu.edu.bd/mdrazib/profile");

        WebSettings webSettings=webView.getSettings();//javaScript Enable
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient()); //object create

    }
}