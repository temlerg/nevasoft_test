package com.example.nevasoft
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        per.setOnClickListener{
            perehod()
        }
    }
    fun perehod() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
