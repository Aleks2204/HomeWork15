package com.example.less15.prasintation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.less15.R

object Navigation {
    fun navigateToFragmentFromActivity(activity: AppCompatActivity, fragment: Fragment){
        activity.supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
    fun navigateToWebFragment(targetUrl: String = "", activity: FragmentActivity) {
        val bundle = Bundle()
        bundle.putString("TARGET_URL", targetUrl)


        val fragment = WebFragment()
        fragment.arguments = bundle

        activity.supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .addToBackStack(null)
            .commit()
    }
}