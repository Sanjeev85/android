package com.example.androidclasses

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class ImagePicker : AppCompatActivity() {

    lateinit var ImageurI: Uri


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_picker)

        val imgV = findViewById<ImageView>(R.id.imgV)
        val btnP = findViewById<Button>(R.id.BtnP)
        val send = findViewById<Button>(R.id.send)

        val getI = registerForActivityResult(
            ActivityResultContracts.GetContent(),
            ActivityResultCallback {
                ImageurI = it
                imgV.setImageURI(it)
            }
        )

        btnP.setOnClickListener {
            getI.launch("image/*")
        }

        send.setOnClickListener {
            val intent = Intent(this, output_calc::class.java)
//            val b = Bundle()
//            b.putString("image", imgV.toString())
//            intent.putExtra("info", b)
            intent.putExtra("imageUri", ImageurI)
            startActivity(intent)

        }
    }
}