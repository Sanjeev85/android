package com.example.androidclasses

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class explicit_intent : AppCompatActivity() {

    val id:Int = 100
    val msg:String = "kotlin"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent)

        var btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener{
            val intent = Intent(this, explicityintent_2::class.java)
//            key value pair
            intent.putExtra("id_value", id)
            intent.putExtra("msg_", msg)
            startActivity(intent)
        }
    }
}