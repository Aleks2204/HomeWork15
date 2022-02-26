package com.example.less15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.less15.prasintation.MainFragment
import com.example.less15.prasintation.Navigation.navigateToFragmentFromActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigateToFragmentFromActivity(this, MainFragment())
    }
}