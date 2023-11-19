package com.tasty.recipesapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tasty.recipesapp.R
import com.tasty.recipesapp.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "SplashActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Log.d(TAG, "onCreate")

        val binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.StartButton.setOnClickListener{
            Log.d(TAG, "SplashActivity -Input Text is:" + binding.userEditText.text)

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("message",binding.userEditText.text.toString())

            startActivity(intent)
        }


    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
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
}