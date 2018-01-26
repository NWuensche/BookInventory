package com.nwuensche.bookinventory.view

import com.nwuensche.bookinventory.model.Book

/**
 * Created by nwuensche on 26.01.18.
 */
interface ItemView {
    fun showItem(book: Book)

    val id: Int
}