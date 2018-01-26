package com.nwuensche.bookinventory.view

import com.nwuensche.bookinventory.model.Book

/**
 * @author nwuensche
 */
interface ItemView {
    fun showItem(book: Book)

    val id: Int
}