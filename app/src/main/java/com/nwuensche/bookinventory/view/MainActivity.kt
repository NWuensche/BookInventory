package com.nwuensche.bookinventory.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.nwuensche.bookinventory.R
import com.nwuensche.bookinventory.model.DataStorage
import com.nwuensche.bookinventory.presenter.MainPresenter
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.sdk25.coroutines.onItemClick
import org.jetbrains.anko.singleTop

class MainActivity : AppCompatActivity(), MainView {

    lateinit private var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(this).apply { onCreate() }

        val arrayAdapter = BookAdapter(this, DataStorage.text)
        bookList.adapter = arrayAdapter

        bookList.onItemClick { _, _, _, bookID -> presenter.onItemClicked(bookID.toInt())  }
    }

    override fun showDetailedItem(bookID: Int) {
        startActivity(intentFor<ItemActivity>("id" to bookID).singleTop())
    }
}
