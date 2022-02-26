package com.example.less15.prasintation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.less15.R
import com.example.less15.prasintation.Navigation.navigateToWebFragment
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        btnYandex.setOnClickListener {
            val yandex = "https://yandex.ru/"
            navigateToWebFragment(
              targetUrl = yandex,
                requireActivity()
            )
        }

        btnGoogle.setOnClickListener {
            val google = "https://www.google.ru/"
            navigateToWebFragment(
                targetUrl = google,
                requireActivity()
            )
        }
    }
}