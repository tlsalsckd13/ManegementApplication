package com.example.manegementapplication.OrderListAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.manegementapplication.R

class OrdersListAdapter(private val itemList : List<Orders>) : RecyclerView.Adapter<OrdersViewHolder>() {

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrdersViewHolder {
        val inflatedView = LayoutInflater.from(parent.context).inflate(R.layout.item_contacts, parent, false)
        return OrdersViewHolder(inflatedView);
    }

    override fun onBindViewHolder(holder: OrdersViewHolder, position: Int) {
        val item = itemList[position]
        holder.apply {
            bind(item)
        }
    }

}