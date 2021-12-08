package com.example.androidclasses

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.marginBottom

class DynamicView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_view)

        var linearLayout_ = findViewById<LinearLayout>(R.id.LinearLayout)
        var b1 = findViewById<Button>(R.id.b1)

        b1.setOnClickListener {
            var b2: Button = Button(this)
            b2.text = "New Button"
            b2.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )

            var tv: TextView = TextView(this)
            tv.text = "New Button Created!"
            tv.setTextColor(Color.parseColor("RED"))

            tv.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )

            b2.setOnClickListener {
                Toast.makeText(this, "New Dynamic Button",
                Toast.LENGTH_SHORT).show()
            }

            linearLayout_.addView(b2)
            linearLayout_.addView(tv)
        }

    }
}