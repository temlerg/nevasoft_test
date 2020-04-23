package com.example.nevasoft

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main5.*

class Main5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        perr.setOnClickListener{
            perehod()
        }
    }
    fun perehod() {
        val intent = Intent(this, Main2Activity::class.java)
        startActivity(intent)
    }
}
