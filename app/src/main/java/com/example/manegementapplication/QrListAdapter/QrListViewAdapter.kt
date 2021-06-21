package com.example.manegementapplication.QrListAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.manegementapplication.R
import com.example.manegementapplication.StoreListAdapter.ListViewItem
import kotlinx.android.synthetic.main.custom_list_qr.view.*

class QrListViewAdapter (private val items: MutableList<QrViewItem>): BaseAdapter() {
    override fun getCount(): Int = items.size
    override fun getItem(position: Int): QrViewItem = items[position]
    override fun getItemId(position: Int): Long = position.toLong()
    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {
        var convertView1 = view
        if (convertView1 == null) convertView1 = LayoutInflater.from(parent?.context).inflate(R.layout.custom_list_qr, parent, false)

        val item: QrViewItem = items[position]
        convertView1!!.qrimage.setImageDrawable(item.qr)
        convertView1.text_title.text = item.title
        convertView1.text_sub_title.text = item.subTitle

        return convertView1
    }
}