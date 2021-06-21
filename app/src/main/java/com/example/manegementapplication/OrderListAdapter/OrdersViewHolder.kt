package com.example.manegementapplication.OrderListAdapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_contacts.view.*

class OrdersViewHolder(v: View) : RecyclerView.ViewHolder(v) {
    var view : View = v

    fun bind(item: Orders) {
        view.mName.text = item.title
        view.mTel.text = item.content
    }
}