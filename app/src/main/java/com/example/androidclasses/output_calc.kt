package com.example.androidclasses

import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.util.Base64
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import java.net.URI

class output_calc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_output_calc)


        val imgV: ImageView = findViewById(R.id.img)
        val bundle:Bundle? = intent.extras
        val extraa = intent.extras
        val id = extraa?.get("imageUri")
//        val id = bundle?.get("imageUri")

        imgV.setImageURI(id as Uri?)



    }

}