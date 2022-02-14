package com.example.cse225


import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RateUs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rate_us)

        val rb1: RatingBar = findViewById(R.id.r1)
        val rb2: RatingBar = findViewById(R.id.r2)
        var txt = findViewById<TextView>(R.id.overall)
        val sub: Button = findViewById(R.id.btn2)

        sub.setOnClickListener() {

            var r1 = rb1.rating
            var r2 = rb2.rating

            var avg = (r1 + r2) / 2

            when (avg.toInt()) {
                5 -> {
                    txt.setText("Excellent")
                }

                4 -> {
                    txt.setText("Good")
                }
                3 -> {
                    txt.setText("Ok")
                }
                2 -> {
                    txt.setText("Bad")
                }
                else ->
                    txt.setText("Not Satisfied")
            }
            val vg: ViewGroup? = findViewById(R.id.custom_toast)
            val inflater = layoutInflater

            val layout: View = inflater.inflate(R.layout.custoast, vg)

            val tv = layout.findViewById<TextView>(R.id.txtVw)
            tv.text = " Feedback Submitted :) "

            val toast = Toast(applicationContext)
            toast.setGravity(Gravity.BOTTOM, 30, 100)
            toast.duration = Toast.LENGTH_LONG
            toast.setView(layout)
            toast.show()
        }
    }

}