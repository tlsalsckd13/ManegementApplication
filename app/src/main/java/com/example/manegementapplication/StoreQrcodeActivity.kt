package com.example.manegementapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.manegementapplication.QrListAdapter.QrListViewAdapter
import com.example.manegementapplication.QrListAdapter.QrViewItem
import kotlinx.android.synthetic.main.activity_store_qrcode.*

class StoreQrcodeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store_qrcode)

        val items = mutableListOf<QrViewItem>()
        items.add(QrViewItem(ContextCompat.getDrawable(this, R.drawable.jjajang)!!, "짜장면", "가격:5000원"))
        items.add(QrViewItem(ContextCompat.getDrawable(this, R.drawable.jjam)!!, "짬뽕", "가격:6000원"))
        items.add(QrViewItem(ContextCompat.getDrawable(this, R.drawable.gojjajang)!!, "고추짜장", "가격:6000원"))
        items.add(QrViewItem(ContextCompat.getDrawable(this, R.drawable.gojjam)!!, "고추짬뽕", "가격:7000원"))
        items.add(QrViewItem(ContextCompat.getDrawable(this, R.drawable.bigjjajang)!!, "쟁반짜장", "가격:13000원"))
        items.add(QrViewItem(ContextCompat.getDrawable(this, R.drawable.jjajangrice)!!, "짜장밥", "가격:7000원"))
        items.add(QrViewItem(ContextCompat.getDrawable(this, R.drawable.tang)!!, "탕수육", "가격:13000/15000/17000원"))
        items.add(QrViewItem(ContextCompat.getDrawable(this, R.drawable.mandu)!!, "만두", "가격:4500원"))

        val adapter = QrListViewAdapter(items)
        listView1.adapter = adapter
        listView1.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->
            val item = parent.getItemAtPosition(position) as QrViewItem
            Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show() } } }

