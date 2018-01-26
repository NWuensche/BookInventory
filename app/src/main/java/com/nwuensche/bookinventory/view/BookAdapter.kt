package com.nwuensche.bookinventory.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.nwuensche.bookinventory.R
import com.nwuensche.bookinventory.model.Book
import kotlinx.android.synthetic.main.book_element.view.*
import org.jetbrains.anko.imageResource


/**
 * Created by nwuensche on 24.01.18.
 */
class BookAdapter(context: Context, books: ArrayList<Book>): ArrayAdapter<Book>(context, 0, books) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val book = this.getItem(position)

        var inflateView = convertView ?: this.inflateLayout(context, parent)

        inflateView.apply {
            imageView.imageResource = book.icon
            titleItemView.text = book.title
            authorItemView.text = book.author
        }

        return inflateView
    }

    private fun inflateLayout(context: Context, parent: ViewGroup?): View {
        return LayoutInflater.from(context).inflate(R.layout.book_element, parent, false)
    }
}