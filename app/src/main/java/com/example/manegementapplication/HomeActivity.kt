package com.example.manegementapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val store_num = intent.getStringExtra("store_num").toString()
        store_event.setOnClickListener {
            val nextIntent = Intent(this, OrderActivity::class.java)
            startActivity(nextIntent)
        }

        store_qrcode.setOnClickListener {
            val nextIntent = Intent(this, MenuActivity::class.java)
            nextIntent.putExtra("store_num", store_num)
            startActivity(nextIntent)
        }


    }
}