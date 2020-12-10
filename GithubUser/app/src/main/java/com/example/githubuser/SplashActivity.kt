package com.example.githubuser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.WindowManager.LayoutParams.*

@Suppress("DEPRECATION")
class SplashActivity : AppCompatActivity() {
    private val splashTime : Long = 3000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        with(window) {
            setFlags(
                FLAG_FULLSCREEN, FLAG_FULLSCREEN
            )
        }

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, splashTime)
    }
    }
