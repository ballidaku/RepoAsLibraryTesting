package com.ballidaku.repoaslibrarytesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.ballidaku.mylibrary.CommonMethods
import com.example.repoaslibrarytesting.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler(Looper.getMainLooper()).postDelayed({
            CommonMethods.showToast(this, "Hello")
        },2000)
    }
}