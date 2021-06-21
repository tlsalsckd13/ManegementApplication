package com.example.manegementapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.manegementapplication.EventListAdapter.Events
import com.example.manegementapplication.EventListAdapter.EventsListAdapter
import kotlinx.android.synthetic.main.activity_store_event.*

class StoreEventActivity : AppCompatActivity() {


    val eventList : List<Events> = listOf(
        Events("주문번호:21243","짜장:1 짬뽕:1"),
        Events("주문번호:21244","짜장:2 탕수육(대):1"),
        Events("주문번호:21245","짬뽕:2 탕수육(중):2 군만두:1"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store_event)

        val adapter = EventsListAdapter(eventList)
        mRecyclerView.adapter = adapter
    }

}