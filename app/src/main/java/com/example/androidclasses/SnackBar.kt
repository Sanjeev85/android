package com.example.androidclasses

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class SnackBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack_bar)
        val snack = findViewById<Button>(R.id.button)


       snack.setOnClickListener {
         val snackBar = Snackbar.make(
            it, "Kya Hua",
            Snackbar.LENGTH_LONG
         ).setAction("Action") {Toast.makeText(this, "Toast Text", Toast.LENGTH_SHORT).show()}
         snackBar.setActionTextColor(Color.BLUE)
         val snackBarView = snackBar.view
         snackBarView.setBackgroundColor(Color.CYAN)
         val textView = snackBarView.findViewById(com.google.android.material.R.id.snackbar_text) as TextView
         textView.setTextColor(Color.BLUE)
         snackBar.show()
      }
    }
}