package com.example.manegementapplication.EventListAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.manegementapplication.R

class EventsListAdapter(private val itemList : List<Events>) : RecyclerView.Adapter<EventsViewHolder>() {

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventsViewHolder {
        val inflatedView = LayoutInflater.from(parent.context).inflate(R.layout.item_contacts, parent, false)
        return EventsViewHolder(inflatedView);
    }

    override fun onBindViewHolder(holder: EventsViewHolder, position: Int) {
        val item = itemList[position]
        holder.apply {
            bind(item)
        }
    }

}