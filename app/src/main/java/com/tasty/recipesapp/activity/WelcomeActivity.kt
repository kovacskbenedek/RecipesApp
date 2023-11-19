package com.tasty.recipesapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.HandlerThread
import android.util.Log
import com.tasty.recipesapp.R

class WelcomeActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "WelcomeActivity"
    }
    private val SPLASH_TIME_OUT: Long
        get() = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val handlerThread = HandlerThread("SplashHandlerThread", -10)
        handlerThread.start() // Create a Handler on the new HandlerThread
        val handler = Handler(handlerThread.looper)
        handler.postDelayed({

            val intent = Intent(this, SplashActivity::class.java)
            startActivity(intent)
            finish() },
            SPLASH_TIME_OUT)

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
}