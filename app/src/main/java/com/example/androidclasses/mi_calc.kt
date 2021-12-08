package com.example.androidclasses

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class mi_calc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ml_calc)

        //keys
        val key_1 = findViewById<TextView>(R.id.one)
        val key_2 = findViewById<TextView>(R.id.two)
        val key_3 = findViewById<TextView>(R.id.three)
        val key_4 = findViewById<TextView>(R.id.four)
        val key_5 = findViewById<TextView>(R.id.five)
        val key_6 = findViewById<TextView>(R.id.six)
        val key_7 = findViewById<TextView>(R.id.seven)
        val key_8 = findViewById<TextView>(R.id.eight)
        val key_9 = findViewById<TextView>(R.id.nine)
        val key_0 = findViewById<TextView>(R.id.zero)
        val key_00 = findViewById<TextView>(R.id.double_zero)
        val key_point = findViewById<TextView>(R.id.point)
        val key_percentage = findViewById<TextView>(R.id.percentage)
        val key_clear = findViewById<TextView>(R.id.clear)
        val key_plus = findViewById<TextView>(R.id.plus)
        val key_minus = findViewById<TextView>(R.id.minus)
        val key_divide = findViewById<TextView>(R.id.divide)
        val key_multiply = findViewById<TextView>(R.id.multiply)
        val key_equals = findViewById<TextView>(R.id.equals)

        //output
        val out = findViewById<TextView>(R.id.input)

        var output = 0;
        var to_show :String = "";
        //numeric keys
        key_1.setOnClickListener {
            to_show += "1"
            out.setText(to_show)
        }
        key_2.setOnClickListener {
            to_show += "2"
            out.setText(to_show)
        }
        key_3.setOnClickListener {
            to_show += "3"
            out.setText(to_show)
        }
        key_4.setOnClickListener {
            to_show += "4"
            out.setText(to_show)
        }
        key_5.setOnClickListener {
            to_show += "5"
            out.setText(to_show)
        }
        key_6.setOnClickListener {
            to_show += "6"
            out.setText(to_show)
        }
        key_7.setOnClickListener {
            to_show += "7"
            out.setText(to_show)
        }
        key_8.setOnClickListener {
            to_show += "8"
            out.setText(to_show)
        }
        key_9.setOnClickListener {
            to_show += "9"
            out.setText(to_show)
        }


        key_plus.setOnClickListener {
            output = to_show.toInt()
            to_show += "+"
            out.setText(to_show)
        }
    }
}