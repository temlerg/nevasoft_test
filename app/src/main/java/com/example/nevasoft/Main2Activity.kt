package com.example.nevasoft

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        num_00.setOnClickListener { setTextNumTel("0") }
        num_11.setOnClickListener { setTextNumTel("1") }
        num_22.setOnClickListener { setTextNumTel("2") }
        num_33.setOnClickListener { setTextNumTel("3") }
        num_44.setOnClickListener { setTextNumTel("4") }
        num_55.setOnClickListener { setTextNumTel("5") }
        num_66.setOnClickListener { setTextNumTel("6") }
        num_77.setOnClickListener { setTextNumTel("7") }
        num_88.setOnClickListener { setTextNumTel("8") }
        num_99.setOnClickListener { setTextNumTel("9") }

        backk.setOnClickListener {
            val str = keyy.text.toString()
            if (str.isNotEmpty()) {
                keyy.setText(str.substring(0, str.length-1))
            }
        }
        Okk.setOnClickListener{
            val str = keyy.text.toString()
            if (str.isNotEmpty()) {
                if (str == "000000" || str.length > 6 || str.length <= 5) {
                    perehod2()
                } else {
                    perehod()
                }
            }
        }
    }

    fun setTextNumTel(str: String) {
        keyy.append(str)
    }

    fun perehod() {
        val intent = Intent(this, Main4Activity::class.java)
        startActivity(intent)
    }

    fun perehod2() {
        val intent = Intent(this, Main5Activity::class.java)
        startActivity(intent)
    }

}
