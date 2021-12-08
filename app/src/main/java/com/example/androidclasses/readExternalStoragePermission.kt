package com.example.androidclasses

import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class readExternalStoragePermission : AppCompatActivity() {
    lateinit var requestStorage: ActivityResultLauncher<String>
    lateinit var getImage: ActivityResultLauncher<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_read_external_storage_permission)

        val readFromGallery: Button = findViewById(R.id.gallery)
        val image: ImageView = findViewById(R.id.imagePicker)

//        request storage contract
        requestStorage = registerForActivityResult(ActivityResultContracts.RequestPermission()) {
            if (it) {
                Toast.makeText(applicationContext, "permission Granted", Toast.LENGTH_LONG).show()
//                openStorage function called if permission granted
                openStorage()
            } else {
                Toast.makeText(applicationContext, "permission Denied", Toast.LENGTH_LONG).show()
            }
        }

//        set image contract
        getImage =
            registerForActivityResult(ActivityResultContracts.GetContent(), ActivityResultCallback {
                image.setImageURI(it)
            })


//        Flow starts here
        readFromGallery.setOnClickListener {
            Log.v(this.toString(), "Flow starts")
            checkPermissions()
        }


    }

    private fun openStorage() {
        getImage.launch("image/*")
    }

    /**
     * Checks permission if already granted call openStorage()
     * else request permission through requestStorage contract
     */
    private fun checkPermissions() {
        when {
            ContextCompat.checkSelfPermission(
                this,
                android.Manifest.permission.READ_EXTERNAL_STORAGE
            )
                    == PackageManager.PERMISSION_GRANTED -> {
                Toast.makeText(applicationContext, "Permission Granted Already", Toast.LENGTH_LONG)
                    .show()
//                function call if permission already granted
                openStorage()
            }
            else -> {
//                request permission if not granted from requestStorage Contract
                requestStorage.launch(android.Manifest.permission.READ_EXTERNAL_STORAGE)
            }
        }
    }
}