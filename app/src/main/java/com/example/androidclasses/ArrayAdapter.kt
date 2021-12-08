package com.example.androidclasses

import android.graphics.Color
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ArrayAdapter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_array_adapter)

        val listView: ListView = findViewById(R.id.list_view)
//        var fruits = arrayOf("Apple", "Banana", "Carrot")
//
//        var array_adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, fruits)
//        listView.adapter = array_adapter;
//
//        listView.setOnItemClickListener{
//            adapterView, view, position, id ->
//            val str = adapterView.getItemAtPosition(position) as String
//            Toast.makeText(this, "you selected $str", Toast.LENGTH_LONG).show()
//        }

        val colors = arrayOf(Color.RED, Color.CYAN, Color.DKGRAY, Color.LTGRAY, Color.WHITE)
        val b = arrayOf("RED", "CYAN", "DKGRAY", "LTGRAY")
        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, b)
        listView.adapter = adapter
        var counter: Int = 0
        listView.setOnItemClickListener { adapterView, view, pos, id ->
            if (counter == 0) {
                counter++
                view.setBackgroundColor(colors[pos])
            } else {
                counter--
                view.setBackgroundColor(colors[colors.size - 1])
            }

        }


    }
}