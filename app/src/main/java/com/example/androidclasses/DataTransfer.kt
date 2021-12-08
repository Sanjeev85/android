package com.example.androidclasses

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class DataTransfer : AppCompatActivity() {

//    lateinit var opr = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_transfer)

        //hooks
        val no_1 = findViewById<EditText>(R.id.first_no)
        val no_2 = findViewById<EditText>(R.id.sec_no)
//        val submit = findViewById<Button>(R.id.sub_)


        val pl = findViewById<Button>(R.id.plu)
            val mi = findViewById<Button>(R.id.min)
            val div = findViewById<Button>(R.id.div)
            val mul = findViewById<Button>(R.id.mult_)
            var output = 0

            pl.setOnClickListener{
                output = no_1.text.toString().toInt() + no_2.text.toString().toInt()
                Log.v("plus", output.toString())
                val intent = Intent(applicationContext, output_calc::class.java)
                intent.putExtra("operation", "+")
                intent.putExtra("output", output)
                startActivity(intent)
            }
            mi.setOnClickListener{
                val intent = Intent(applicationContext, output_calc::class.java)
                output = no_1.text.toString().toInt() - no_2.text.toString().toInt()
                Log.v("minus", output.toString())
                intent.putExtra("operation", "-")
                intent.putExtra("output", output)
                startActivity(intent)
            }
            div.setOnClickListener{
                val intent = Intent(applicationContext, output_calc::class.java)
                output = no_1.text.toString().toInt() / no_2.text.toString().toInt()
                Log.v("divide", output.toString())
                intent.putExtra("operation", "/")
                intent.putExtra("output", output)
                startActivity(intent)
            }
            mul.setOnClickListener{
                val intent = Intent(applicationContext, output_calc::class.java)
                output = no_1.text.toString().toInt() * no_2.text.toString().toInt()
                Log.v("multiply", output.toString())
                intent.putExtra("operation", "X")
                intent.putExtra("output", output)
                startActivity(intent)
            }
            Log.v("Output", output.toString())
//            submit.setOnClickListener {
//                val oo = findViewById<TextView>(R.id.outputt)
//                oo.setText(output.toString())
//                val intent = Intent(applicationContext, output_calc::class.java)
//                intent.putExtra("operation", )
//            }

    }

//    fun selected_opr()  {
//
//
//    }
}