package com.example.androidclasses

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class OptionMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option_menu)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.popupmenu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        return when (id) {
            R.id.search_item -> {
                Toast.makeText(applicationContext, "search Item", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.upload_item -> {
                Toast.makeText(applicationContext, "upload Item", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.copy_item -> {
                Toast.makeText(applicationContext, "copy Item", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.share_item -> {
                Toast.makeText(applicationContext, "share Item", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.print_item -> {
                Toast.makeText(applicationContext, "print Item", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.exit -> {
                Toast.makeText(applicationContext, "Exiting in 5 sec", Toast.LENGTH_SHORT).show()
                finish()
                System.exit(0)
                true
            }

            else ->
                true

        }
    }

}