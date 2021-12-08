package com.example.androidclasses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class explicityintent_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicityintent_2)


        val bundle:Bundle? = intent.extras
        val id = bundle?.get("id_value")
        val msg = bundle?.get("msg_")
        val id__:String = id.toString() + " " + msg.toString()
        Toast.makeText(applicationContext, id__, Toast.LENGTH_LONG).show()
//        Toast.makeText(applicationContext, msg.toString(), Toast.LENGTH_LONG).show()
    }
}