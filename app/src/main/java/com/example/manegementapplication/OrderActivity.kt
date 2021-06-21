package com.example.manegementapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.manegementapplication.OrderListAdapter.Orders
import com.example.manegementapplication.OrderListAdapter.OrdersListAdapter
import kotlinx.android.synthetic.main.activity_order.*

class OrderActivity : AppCompatActivity() {


    val eventList : List<Orders> = listOf(
        Orders("주문번호:21243","짜장:1 짬뽕:1"),
        Orders("주문번호:21244","짜장:2 탕수육(대):1"),
        Orders("주문번호:21245","짬뽕:2 탕수육(중):2 군만두:1"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val adapter = OrdersListAdapter(eventList)
        mRecyclerView.adapter = adapter
    }

}