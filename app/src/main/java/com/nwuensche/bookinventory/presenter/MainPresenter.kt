package com.nwuensche.bookinventory.presenter

import com.nwuensche.bookinventory.model.Book
import com.nwuensche.bookinventory.model.DataStorage
import com.nwuensche.bookinventory.view.MainView

/**
 * @author nwuensche
 */
class MainPresenter(private val view: MainView) : Presenter {
    private var model: ArrayList<Book> = DataStorage.text


    override fun onCreate() {
        this.model = DataStorage.text
    }

    fun onItemClicked(bookID: Int) {
        view.showDetailedItem(bookID)
    }
}