package com.example.androidclasses

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val hook = findViewById<Button>(R.id.Button1)
        val hook1 = findViewById<TextView>(R.id.textView1)

        hook.setOnClickListener( View.OnClickListener {
            hook1.setTextColor(Color.parseColor("Green"))
        })

    }
}