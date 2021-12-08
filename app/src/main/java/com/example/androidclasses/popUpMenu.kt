package com.example.androidclasses

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class popUpMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pop_up_menu)

        val btn: Button = findViewById(R.id.btnPopUP)
        btn.setOnClickListener {
            val popup = PopupMenu(this, btn)
            popup.menuInflater.inflate(R.menu.popupmenu, popup.menu)

            popup.setOnMenuItemClickListener {
                Toast.makeText(applicationContext, "item pressed : " + it.title, Toast.LENGTH_LONG)
                    .show()
                    if (it.title == "Search"){
                    val url = "http://www.google.com"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                true
            }



            popup.show()
        }


    }
}