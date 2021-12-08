package com.example.androidclasses

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class CaptureImage : AppCompatActivity() {

    lateinit var requestCamera: ActivityResultLauncher<String>
    lateinit var imageCapture: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capture_image)


        var btnCamera: Button = findViewById(R.id.imagebutton)

        requestCamera = registerForActivityResult(ActivityResultContracts.RequestPermission()) {
            Toast.makeText(this, "Inside request Camera", Toast.LENGTH_LONG).show()
            if (it) {
                Log.v(this.toString(), "Inside request camera")
                Toast.makeText(applicationContext, "Permission Granted", Toast.LENGTH_LONG).show()
                cameraCall()
            } else
                Toast.makeText(applicationContext, "Permission Denied", Toast.LENGTH_LONG).show()
        }


//        image capture contract
        imageCapture = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            if (it.resultCode == Activity.RESULT_OK) {
                handleCameraImage(it.data)
            }
        }

        btnCamera.setOnClickListener {
            Log.v("Onclick listener", "button Clicked")
            checkPermissions()
        }


    }

    private fun cameraCall() {
        val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//                setting up another contract through image capture
        imageCapture.launch(cameraIntent)
    }

    private fun handleCameraImage(intent: Intent?) {
        var imageCamera = findViewById<ImageView>(R.id.imageView)
        val bitmap = intent?.extras?.get("data") as Bitmap
        imageCamera.setImageBitmap(bitmap)
    }


    private fun checkPermissions() {
        when {
            ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA)
                    == PackageManager.PERMISSION_GRANTED -> {
                Toast.makeText(applicationContext, "Permission Granted Already", Toast.LENGTH_LONG)
                    .show()
                    cameraCall()
            }
            else -> {
                Log.v("request camera", "Requesting camera")
                requestCamera.launch(android.Manifest.permission.CAMERA)
            }
        }
    }
}