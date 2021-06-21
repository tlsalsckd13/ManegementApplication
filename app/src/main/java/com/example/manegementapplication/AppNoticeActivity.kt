package com.example.manegementapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.manegementapplication.NoticeListAdapter.Contacts
import com.example.manegementapplication.NoticeListAdapter.ContactsListAdapter
import kotlinx.android.synthetic.main.activity_app_notice.*

class AppNoticeActivity : AppCompatActivity() {

    val contactsList : List<Contacts> = listOf(
        Contacts("공지사항","앱 출시"),
        Contacts("ver1.01","버거킹 추가"),
        Contacts("ver1.01","60계 추가"),
        Contacts("ver1.01","홍콩반점 추가"),
        Contacts("ver1.1","기능 추가 예정"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_notice)

        val adapter = ContactsListAdapter(contactsList)
        mRecyclerView.adapter = adapter
    }
}


