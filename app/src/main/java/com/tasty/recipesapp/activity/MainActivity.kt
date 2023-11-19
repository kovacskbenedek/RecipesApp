package com.tasty.recipesapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.findNavController
import com.google.android.material.navigation.NavigationBarView
import com.tasty.recipesapp.R
import com.tasty.recipesapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        Log.d(TAG, "onCreate")

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigation.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener setOnItemSelectedListener@{
            when(it.itemId){
                R.id.homeFragment -> {
                    findNavController(R.id.nav_host_fragment).navigate(R.id.homeFragment)
                    return@setOnItemSelectedListener true
                }

                R.id.recipesFragment -> {
                    findNavController(R.id.nav_host_fragment).navigate(R.id.recipesFragment)
                    return@setOnItemSelectedListener true
                }

                R.id.profileFragment -> {
                    findNavController(R.id.nav_host_fragment).navigate(R.id.profileFragment)
                    return@setOnItemSelectedListener true
                }

                else -> true
            }
        })
//        val receivedMessage = intent.getStringExtra("message")
//
//        if (receivedMessage != null) {
//            Log.d(TAG, "MainActivity - Received message from SplashActivity: $receivedMessage")
//
//            // Find the TextView by its ID
////            val messageTextView = findViewById<TextView>(R.id.messageTextView)
////            messageTextView.text = "Welcome, $receivedMessage!"
//        } else {
//            Log.d(TAG, "MainActivity - No message received from SplashActivity")
//        }
//
//        Log.d(TAG, "$receivedMessage")
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