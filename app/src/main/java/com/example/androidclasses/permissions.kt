package com.example.androidclasses

import android.app.Instrumentation
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts

class permissions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permissions)

        val btnCam: Button = findViewById(R.id.camera)

        val requestCamera = registerForActivityResult(ActivityResultContracts.RequestPermission()) {
            if (it) {
                Toast.makeText(applicationContext, "Permission Granted", Toast.LENGTH_SHORT).show()
                setActivityResult()
                finish()
            }
            else {
                Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show()
            }
        }

        btnCam.setOnClickListener {
            requestCamera.launch(android.Manifest.permission.CAMERA)
        }
    }
    private fun setActivityResult() {
        val camera_intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivity(camera_intent)
    }
}