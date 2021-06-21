package com.example.manegementapplication

import com.example.manegementapplication.StoreListAdapter.ListViewAdapter
import com.example.manegementapplication.StoreListAdapter.ListViewItem
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_search_store.*

class SearchStoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_store)

        val items = mutableListOf<ListViewItem>()

        items.add(ListViewItem(ContextCompat.getDrawable(this, R.drawable.honkong)!!, "홍콩반점", "홍콩반점 입니다"))
        items.add(ListViewItem(ContextCompat.getDrawable(this, R.drawable.burgerking)!!, "버거킹", "버거킹 입니다"))
        items.add(ListViewItem(ContextCompat.getDrawable(this, R.drawable.chicken)!!, "60계치킨", "60계치킨 입니다"))

        val adapter = ListViewAdapter(items)
        listView.adapter = adapter
        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->
            val item = parent.getItemAtPosition(position) as ListViewItem
            Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show() } } }

