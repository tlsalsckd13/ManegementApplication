package com.example.manegementapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        store_event.setOnClickListener {
            val nextIntent = Intent(this, StoreEventActivity::class.java)
            startActivity(nextIntent)
        }

        store_qrcode.setOnClickListener {
            val nextIntent = Intent(this, StoreQrcodeActivity::class.java)
            startActivity(nextIntent)
        }


    }
}