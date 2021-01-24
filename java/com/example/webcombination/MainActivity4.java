package com.example.webcombination;


import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.example.webcombination.R;

public class MainActivity4 extends AppCompatActivity {
    private WebView webView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView2 = (WebView) findViewById(R.id.webview);
        webView2.setWebViewClient(new WebViewClient());
        webView2.loadUrl("https://www.google.com/maps");

        WebSettings webSettings = webView2.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (webView2.canGoBack()) {
            webView2.goBack();
        } else {
            super.onBackPressed();
        }
    }
}