package com.toaster.repoaslibrarytesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.repoaslibrarytesting.R
import com.toaster.mylibrary.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler(Looper.getMainLooper()).postDelayed({
            Toaster.teraMeraKiRishta(this, "Hello")
        },2000)
    }
}