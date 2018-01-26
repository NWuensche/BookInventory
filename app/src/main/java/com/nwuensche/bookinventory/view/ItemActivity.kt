package com.nwuensche.bookinventory.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.nwuensche.bookinventory.R
import com.nwuensche.bookinventory.model.Book
import com.nwuensche.bookinventory.presenter.ItemPresenter
import kotlinx.android.synthetic.main.activity_item.*
import org.jetbrains.anko.imageResource

class ItemActivity : AppCompatActivity(), ItemView {
    lateinit private var presenter: ItemPresenter

    override var id = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)

        id = intent.extras["id"] as Int

        presenter = ItemPresenter(this).apply { onCreate() }
    }

    override fun showItem(book: Book) {
        this.title = book.title

        imageItemView.imageResource = book.icon

        titleItemView.text = book.title
        authorItemView.text = book.author
        descriptionItemView.text = book.description
        genreItemView.text = book.genre
    }
}
