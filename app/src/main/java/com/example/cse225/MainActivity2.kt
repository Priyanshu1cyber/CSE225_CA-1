package com.example.cse225

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val about=findViewById<Button>(R.id.about)
        val rate=findViewById<Button>(R.id.rate)
        val booking=findViewById<Button>(R.id.booking)

        about.setOnClickListener {
            val intent= Intent(this,AboutUs::class.java)
            startActivity(intent)
        }
        rate.setOnClickListener {
            val intent= Intent(this,RateUs::class.java)
            startActivity(intent)
        }
        booking.setOnClickListener {
            val intent= Intent(this,Booking::class.java)
            startActivity(intent)
        }
    }
}