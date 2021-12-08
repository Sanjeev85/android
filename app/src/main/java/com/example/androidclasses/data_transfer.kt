package com.example.androidclasses

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class data_transfer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_transfer2)

        var tv: TextView = findViewById(R.id.textView)
        val i = intent
        val b = i.getBundleExtra("info")
        val x = b?.getInt("First")
        val y = b?.getInt("Second")
        var res = 0
        val op = b?.getString("operation")

        Toast.makeText(this, " " + x + y + op, Toast.LENGTH_SHORT).show()
        when (op) {
            "+" -> if (x != null && y != null)
                res = x + y
            "-" -> if (x != null && y != null)
                res = x - y
            "*" -> if (x != null && y != null)
                res = x * y
            "/" -> if (x != null && y != null)
                res = x / y
        }

        tv.text = res.toString()
    }

}