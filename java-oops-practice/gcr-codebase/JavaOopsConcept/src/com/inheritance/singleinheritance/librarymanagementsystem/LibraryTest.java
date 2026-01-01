package com.inheritance.singleinheritance.librarymanagementsystem;


public class LibraryTest {

    public static void main(String[] args) {

        Author book = new Author(
                "How to Win Friends and Influence People",
                1936,
                "Dale Carnegie",
                "Author"
        );

        book.displayInfo();
    }
}
