package com.example.androidclasses

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
/*
        //hooks
        val firstNo = findViewById<EditText>(R.id.first_no)
        val secondNo = findViewById<EditText>(R.id.second_no)
        val symbol = findViewById<TextView>(R.id.symbol)
        //buttoms
        val plus = findViewById<Button>(R.id.plus)
        val minus = findViewById<Button>(R.id.minus)
        val divide = findViewById<Button>(R.id.divide)
        val multiply = findViewById<Button>(R.id.multiply)
        val equalto = findViewById<Button>(R.id.equals_to)

        //ans
        val ans = findViewById<TextView>(R.id.ans)


        //plus
        plus.setOnClickListener {
            if (firstNo.text.toString().isEmpty() || secondNo.text.toString().isEmpty()) {
                Toast.makeText(this, "Enter both numbers", Toast.LENGTH_SHORT).show()
            } else {
                symbol.setText("+")
                symbol.setTextColor(Color.parseColor("Green"))
                val a: Double = firstNo.text.toString().toDouble()
                val b: Double = secondNo.text.toString().toDouble()
                val res: Double = a + b
                ans.setText(res.toString())
            }
        }
        //minus
        minus.setOnClickListener {
            if (firstNo.text.toString().isEmpty() || secondNo.text.toString().isEmpty()) {
                Toast.makeText(this, "Enter both numbers", Toast.LENGTH_SHORT).show()
            } else {
                symbol.setText("-")
                symbol.setTextColor(Color.parseColor("Green"))
                val a: Double = firstNo.text.toString().toDouble()
                val b: Double = secondNo.text.toString().toDouble()
                val res: Double = a - b
                ans.setText(res.toString())
            }
        }


        multiply.setOnClickListener {
            if (firstNo.text.toString().isEmpty() || secondNo.text.toString().isEmpty()) {
                Toast.makeText(this, "Enter both numbers", Toast.LENGTH_SHORT).show()
            } else {
                symbol.setText("*")
                symbol.setTextColor(Color.parseColor("Green"))
                val a: Double = firstNo.text.toString().toDouble()
                val b: Double = secondNo.text.toString().toDouble()
                val res: Double = a * b
                ans.setText(res.toString())
            }
        }
        //divide
        divide.setOnClickListener {
            if (firstNo.text.toString().isEmpty() || secondNo.text.toString().isEmpty()) {
                Toast.makeText(this, "Enter both numbers", Toast.LENGTH_SHORT).show()
            } else {
                symbol.setText("/")
                symbol.setTextColor(Color.parseColor("Green"))
                val a: Double = firstNo.text.toString().toDouble()
                val b: Double = secondNo.text.toString().toDouble()
                if (b.toInt() == 0) {
                    Toast.makeText(this, "divide by 0 exception", Toast.LENGTH_SHORT).show()
                }
                val res: Double = a / b
                val textTo_showD = String.format("%.3d", res)
                ans.setText(res.toString())
            }
        }

        equalto.setOnClickListener{
            if(firstNo.text.toString().isEmpty() || secondNo.text.toString().isEmpty()) {
                Toast.makeText(this, "Enter both numbers", Toast.LENGTH_SHORT).show()
            }
            else {
                symbol.setTextColor(Color.parseColor("violet"))
                val a:Double = firstNo.text.toString().toDouble()
                val b:Double = secondNo.text.toString().toDouble()
                val res:Double = a*b
                ans.setText(res.toString())
            }
        }*/
    }
}