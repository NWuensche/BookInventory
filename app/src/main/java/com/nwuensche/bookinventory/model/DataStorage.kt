package com.nwuensche.bookinventory.model

import com.nwuensche.bookinventory.R

/**
 * @author nwuensche
 */
class DataStorage {
    companion object {
        val text = arrayListOf(
                Book(title = "The Sound and the Fury", author = "William Faulkner", description = "Famiily of Aristocrats", genre = "Southern Gothic novel", icon = R.drawable.red_book),
                Book(title = "Don Quixote", author = "Miguel de Cervantes", description = "It's about Windwills!", genre = "Novel", icon = R.drawable.blue_book),
                Book(title = "Ulysses", author = "James Joyce", description = "Life of Leopold Bloom in Dublin", genre = "Novel", icon = R.drawable.green_book),
                Book(title = "Odyssey", author = "Homer", description = "Sequel to Iliad", genre = "Epic Poem", icon = R.drawable.yellow_book),
                Book(title = "War and Peace", author = "Leo Tolstoy", description = "History of the French Invasion of Russia", genre = "Historical Novel", icon = R.drawable.cyan_book),
                Book(title = "Hamlet", author = "William Shakespeare", description = " Revenge of Prince Hamlet", genre = "Tragedy", icon = R.drawable.white_book),
                Book(title = "The Great Gatsby", author = "F. Scott Fitzgerald", description = "Life on Long Island in 1922", genre = "Novel", icon = R.drawable.pink_book),
                Book(title = "Pride and Prejudice", author = "Jane Austen", description = "Development of Elizabeth Bennet", genre = "Romantic Novel", icon = R.drawable.dark_green_book)
        )
    }


}