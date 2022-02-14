package com.example.cse225

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.WindowManager
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    private var i = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val p1 = findViewById<ProgressBar>(R.id.pBarCircular)
        p1.visibility = View.VISIBLE
        Thread{
            while(i<1000){
                Handler(Looper.getMainLooper()).post {
                    if (i == 1000) {
                        p1.visibility = View.INVISIBLE
                    }
                }
                try {
                    Thread.sleep(1000)
                }
                catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
        }.start()
        if (getSupportActionBar() != null) {
            getSupportActionBar()?.hide();
        }
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
                    Handler().postDelayed({
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
                finish()
            }, 3000)
    }
}