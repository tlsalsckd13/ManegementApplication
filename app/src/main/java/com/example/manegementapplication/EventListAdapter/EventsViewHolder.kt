package com.example.manegementapplication.EventListAdapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_contacts.view.*

class EventsViewHolder(v: View) : RecyclerView.ViewHolder(v) {
    var view : View = v

    fun bind(item: Events) {
        view.mName.text = item.title
        view.mTel.text = item.content
    }
}