package com.nwuensche.bookinventory.model

/**
 * @author nwuensche
 */
typealias DrawableID = Int
data class Book(val title: String, val author: String, val description: String, val genre: String, val icon: DrawableID)