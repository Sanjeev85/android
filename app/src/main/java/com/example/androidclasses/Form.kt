package com.example.androidclasses

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import org.w3c.dom.Text

class Form : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        val otp = findViewById<TextView>(R.id.otp)
        val otp_button = findViewById<Button>(R.id.otp_button)
        val first_name = findViewById<EditText>(R.id.firstName)
        val result = findViewById<TextView>(R.id.result)
        val submit = findViewById<Button>(R.id.submit)
        val phone = findViewById<EditText>(R.id.phone)
        val last_name = findViewById<EditText>(R.id.lastName)
        val checkBox = findViewById<CheckBox>(R.id.checkbox)
        val gender = findViewById<RadioGroup>(R.id.radio_container)

        fun clear() {
            otp.text = " "
            first_name.text.clear()
            last_name.text.clear()
            phone.text.clear()
            checkBox.isChecked = false
            gender.clearCheck()

        }

        submit.setOnClickListener{
            if(first_name.text.isEmpty()) {
                result.text = "Enter all details"
                Toast.makeText(this, "Enter all details", Toast.LENGTH_SHORT).show()
            }
            else {
                result.text =
                    """
                        Name : ${first_name.text}
                        phone : ${phone.text}
                    """.trimIndent()
                Toast.makeText(this, "SuccessFully Submitted", Toast.LENGTH_SHORT).show()

               clear()
            }
        }




        otp_button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                otp.setText("123445")
            }
        })


    }
}



//    fun createTv(): TextView {
//        var params: LinearLayout.LayoutParams = LinearLayout.LayoutParams(
//            LinearLayout.LayoutParams.WRAP_CONTENT,
//            LinearLayout.LayoutParams.WRAP_CONTENT
//        )
//        params.setMargins(5, 5, 5, 5)
//        val newTextView: TextView = TextView(this)
//        newTextView.layoutParams = params
//        newTextView.setText("Form SUbmitted Successfully") //text =
//        Log.e("form", "chala")
//
//        return newTextView
//    }
