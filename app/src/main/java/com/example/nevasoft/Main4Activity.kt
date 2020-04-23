package com.example.nevasoft

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main4.*

class Main4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        perrr.setOnClickListener{
            perehod()
        }
    }
    fun perehod() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
