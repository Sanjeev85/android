package com.example.androidclasses

import android.content.DialogInterface
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import kotlin.collections.ArrayList

class CustomAlertDialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_alert_dialog)


        val btnSimpleAlert = findViewById<Button>(R.id.simplealert)
        val btnAlertWithItems = findViewById<Button>(R.id.alertwithitems)
        val btnAlertWithMultiChoiceItems = findViewById<Button>(R.id.alertwithmultichoice)
        val btnAlertWithEditText = findViewById<Button>(R.id.alertwithedittext)

        btnSimpleAlert.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Simple alert")
                .setMessage("We have a message")
                .setPositiveButton("OK") { dialog, which ->
                    Toast.makeText(applicationContext, "OK clicked", Toast.LENGTH_LONG).show()
                }
                .setNegativeButton("NO") { dialog, which ->
                    Toast.makeText(applicationContext, "NO", Toast.LENGTH_LONG).show()
                }
                .setCancelable(false)
                .show()
        }

        btnAlertWithItems.setOnClickListener {
            val items = arrayOf("Apple", "Banana", "Orange", "Grapes")
            val builder = AlertDialog.Builder(this)
            builder.setTitle("List of items")
                .setItems(items) { dialog, index ->
                    Toast.makeText(
                        applicationContext,
                        items[index] + "is clicked",
                        Toast.LENGTH_LONG
                    ).show()
                }
                .setPositiveButton("OK", null)
                .setNegativeButton("NO", null)
                .setNeutralButton("NEUTRAL", null)

            val alertDialog = builder.create()
            alertDialog.show()
            val buttonP = alertDialog.getButton(DialogInterface.BUTTON_POSITIVE)
            val buttonN = alertDialog.getButton(DialogInterface.BUTTON_NEGATIVE)

            buttonN.setBackgroundColor(Color.RED)
            buttonP.setBackgroundColor(Color.BLUE)
            buttonN.setPadding(0, 0, 0, 0)
            buttonP.setPadding(0, 0, 0, 0)

            buttonN.setTextColor(Color.BLUE)
            buttonP.setTextColor(Color.BLUE)
        }

        btnAlertWithMultiChoiceItems.setOnClickListener {
            val items = arrayOf("Apple", "Banana", "Orange", "Grapes")
            val selectedList = ArrayList<Int>()

            val builder = AlertDialog.Builder(this)
                .setTitle("This is Multi Choice")
                .setMultiChoiceItems(items, null) { dialog, which, isChecked ->
                    if (isChecked)
                        selectedList.add(which)
                    else if (selectedList.contains(which))
                        selectedList.remove(which)
                }
                .setPositiveButton("Done") { dialog, i ->
                    val selectedString = ArrayList<String>()
                    for (j in selectedList.indices)
                        selectedString.add(items[selectedList[j]])
                    Toast.makeText(
                        applicationContext,
                        "items selected are: " + Arrays.toString(
                            selectedString.toTypedArray()
                        ), Toast.LENGTH_LONG
                    ).show()
                }
            builder.show()
        }

        btnAlertWithEditText.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("With Edit Text")
            val input = EditText(this)
            val lp = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT)
            input.layoutParams = lp
            builder.setView(input)
            builder.setPositiveButton("OK") {
                dialogInterface, i->
                    Toast.makeText(
                        applicationContext,
                        "Text enterd is " + input.text.toString(),
                        Toast.LENGTH_LONG
                    ).show()
            }
            builder.show()
        }

    }
}