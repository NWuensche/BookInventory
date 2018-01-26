package com.nwuensche.bookinventory.presenter

import com.nwuensche.bookinventory.model.Book
import com.nwuensche.bookinventory.model.DataStorage
import com.nwuensche.bookinventory.view.ItemView

/**
 * Created by nwuensche on 26.01.18.
 */
class ItemPresenter(private val view: ItemView) : Presenter {
    lateinit private var model: Book

    override fun onCreate() {
        this.model = DataStorage.text[view.id]
        view.showItem(model)
    }

}