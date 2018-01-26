package com.nwuensche.bookinventory.model

/**
 * Created by nwuensche on 26.01.18.
 */
typealias DrawableID = Int
data class Book(val title: String, val author: String, val description: String, val genre: String, val icon: DrawableID)