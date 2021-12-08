package com.example.androidclasses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ActivityLifeCycle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
        Log.d("Lifecycle", "oncreate invoked")
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCycle", "onstart invoked")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycle", "onResume invoked")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycle", "onPause invoked")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycle", "onStop invoked")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LifeCycle", "onRestart invoked")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycle", "onDestroy invoked")
    }
}