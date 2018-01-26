package com.nwuensche.bookinventory.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.nwuensche.bookinventory.R
import com.nwuensche.bookinventory.model.DataStorage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayAdapter = BookAdapter(this, DataStorage.text)
        bookList.adapter = arrayAdapter
    }
}
