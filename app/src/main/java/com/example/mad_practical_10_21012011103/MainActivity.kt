package com.example.mad_practical_10_21012011103

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fav1:FloatingActionButton=findViewById(R.id.fav1)
        fav1.setOnClickListener {
            SendDataToListview()
            Intent(this,MapsActivity::class.java).apply { startActivity(this) }
        }
    }
    fun SendDataToListview() {
        val personlistview = findViewById<ListView>(R.id.listview1)
        val personlist = arrayListOf<Contact>(
            Contact("1", "Rohan", "rohan@gmail.com", "9265248766", "deesa", 24.2585, 72.1907),
            Contact("2", "Rushi", "rushi@gmail.com", "9724050500", "bhavnagar", 21.7645, 72.1519),
            Contact("3", "Vinit", "vinit@gmail.com", "9975641266", "surat", 21.1702, 72.8311),
            Contact("4", "Raj", "raj@gmail.com", "9898546799", "ransipur", 23.7448, 72.7851),
            Contact("5", "Smit", "smit@gmail.com", "8152084599", "gondal", 21.9612, 70.7939)
        )
        personlistview.adapter = ContactAdapter(this, personlist)
    }

}