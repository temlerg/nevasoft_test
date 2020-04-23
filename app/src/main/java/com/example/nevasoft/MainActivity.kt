package com.example.nevasoft

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import kotlinx.android.synthetic.main.activity_main.*
import com.example.nevasoft.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num_0.setOnClickListener { setTextNumTel("0") }
        num_1.setOnClickListener { setTextNumTel("1") }
        num_2.setOnClickListener { setTextNumTel("2") }
        num_3.setOnClickListener { setTextNumTel("3") }
        num_4.setOnClickListener { setTextNumTel("4") }
        num_5.setOnClickListener { setTextNumTel("5") }
        num_6.setOnClickListener { setTextNumTel("6") }
        num_7.setOnClickListener { setTextNumTel("7") }
        num_8.setOnClickListener { setTextNumTel("8") }
        num_9.setOnClickListener { setTextNumTel("9") }

        back.setOnClickListener{
            val str = tel_num.text.toString()
            if (str.isNotEmpty()) {
                tel_num.setText(str.substring(0, str.length-1))
            }
        }

        Ok.setOnClickListener{
            val str = tel_num.text.toString()
            if (str.isNotEmpty()) {
                if (str == "+79000000000" || str.length > 12 || str.length <= 11) {
                    perehod2()
                } else {
                    perehod()
                }
            }
        }


    }

    fun setTextNumTel(str: String) {
        tel_num.append(str)
    }

    fun perehod() {
        val intent = Intent(this, Main2Activity::class.java)
        startActivity(intent)
    }

    fun perehod2() {
        val intent = Intent(this, Main3Activity::class.java)
        startActivity(intent)
    }
}
