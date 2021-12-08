package com.example.androidclasses

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class DialogAlert : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog_alert)

        val btnAlert = findViewById<Button>(R.id.btnalert)
        btnAlert.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Login Alert")
                .setMessage("Are you Sure ?")
                .setCancelable(true)
                .setIcon(android.R.drawable.ic_btn_speak_now)

//        performing positive action
            builder.setPositiveButton("Yes") { dialogInterface, which ->
                Toast.makeText(applicationContext, "Clicked Yes", Toast.LENGTH_LONG).show()
                callDialer(this)
            }
            //        performing neutral action
            builder.setNeutralButton("Cancel") { dialogInterface, which ->
                Toast.makeText(applicationContext, "Clicked Cancel", Toast.LENGTH_LONG).show()
                callDialer(this)
            }

            //        performing negative action
            builder.setNegativeButton("No") { dialogInterface, which ->
                Toast.makeText(applicationContext, "Clicked No", Toast.LENGTH_LONG).show()
                callDialer(this)
            }

            val alertDialog: AlertDialog = builder.create()
            alertDialog.show()

        }
    }
        private fun callDialer(context : Context) {
            val alert = AlertDialog.Builder(this)
            alert.setTitle("another Alert")
                .setMessage("This is another alert ?")
                .setCancelable(true)
                .setIcon(android.R.drawable.ic_lock_idle_alarm)

              alert.setPositiveButton("Yes") { dialogInterface, which ->
                    Toast.makeText(applicationContext, "Clicked Yes Again", Toast.LENGTH_LONG).show()
                }
                //        performing neutral action
                alert.setNeutralButton("Cancel") { dialogInterface, which ->
                    Toast.makeText(applicationContext, "Clicked Cancel Again", Toast.LENGTH_LONG).show()
                }

                //        performing negative action
                alert.setNegativeButton("No") { dialogInterface, which ->
                    Toast.makeText(applicationContext, "Clicked No Again", Toast.LENGTH_LONG).show()
                }
            val alertDialog: AlertDialog = alert.create()
            alertDialog.show()
        }
}