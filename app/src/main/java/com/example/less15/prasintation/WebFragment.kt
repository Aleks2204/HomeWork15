package com.example.less15.prasintation

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import com.example.less15.R
import kotlinx.android.synthetic.main.fragment_web.*

class WebFragment : Fragment(R.layout.fragment_web) {


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val targetUrl = arguments?.getString("TARGET_URL")
        if (targetUrl != null) {
            setUpWebView(targetUrl)
        }
    }

    @SuppressLint("SetJavaScriptEnabled")
    @RequiresApi(Build.VERSION_CODES.O)
    private fun setUpWebView(url: String) {
        wbView.webViewClient = WebViewClient()

        wbView.apply {
            loadUrl(url)
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true

        }

    }

}

