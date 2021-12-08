package com.example.androidclasses

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class data_transfer_intents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_transfer_intents)

        var b1: Button = findViewById(R.id.show_out)
        var rg1: RadioGroup = findViewById(R.id.radioGrp)
        var rb = arrayOfNulls<RadioButton>(4)
        var et1: EditText = findViewById(R.id.no_1)
        var et2: EditText = findViewById(R.id.no_2)

        rb[0] = findViewById(R.id.radioButton)
        rb[1] = findViewById(R.id.radioButton1)
        rb[2] = findViewById(R.id.radioButton2)
        rb[3] = findViewById(R.id.radioButton3)


        b1.setOnClickListener {
            val intent = Intent(this, data_transfer::class.java)
            val b = Bundle()
            var x: Int = et1.getText().toString().toInt()
            var y: Int = et2.getText().toString().toInt()

            if (rg1.checkedRadioButtonId == R.id.radioButton) {
                b.putString("operation", "+")
            } else if (rg1.checkedRadioButtonId == R.id.radioButton1) {
                b.putString("operation", "-")
            } else if (rg1.checkedRadioButtonId == R.id.radioButton2) {
                b.putString("opeartion", "/")
            } else if (rg1.checkedRadioButtonId == R.id.radioButton3)
                b.putString("operation", "*")

            b.putInt("First", x)
            b.putInt("Second", y)
            intent.putExtra("info", b)

            startActivity(intent)
        }


    }
}