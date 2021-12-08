package com.example.androidclasses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class contextMenu : AppCompatActivity() {

    var listView: ListView? = null
    var adapter: ArrayAdapter<String>? = null
    var contacts: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context_menu)

        contacts.add("Akash")
        contacts.add("Sachin")
        contacts.add("Martha")
        contacts.add("Vimal")

//        its a list view
        listView = findViewById(R.id.context_View)
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, contacts)
//        this line same as listView.setAdapter(adapter)
        listView?.adapter = adapter

//        Register the listview for context menu

        registerForContextMenu(listView)
    }


    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
//        object creation
        val inflater = menuInflater
        inflater.inflate(R.menu.contextmenu, menu)
        menu?.setHeaderTitle("Select The Action")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.call) {
            Toast.makeText(applicationContext, "Calling mode",Toast.LENGTH_LONG).show()
            return true 
        }
        else if (item.title == "Sms") {
            Toast.makeText(applicationContext, "Sms mode",Toast.LENGTH_LONG).show()
            return true
        }
        else
            return false
    }
}