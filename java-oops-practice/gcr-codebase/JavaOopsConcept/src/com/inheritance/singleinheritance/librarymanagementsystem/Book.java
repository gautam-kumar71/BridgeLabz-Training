package com.inheritance.singleinheritance.librarymanagementsystem;

public class Book {

    protected String title;
    protected int publicationYear;

    // Constructor
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book info
    public void displayInfo() {
        System.out.println("Book Title       : " + title);
        System.out.println("Publication Year : " + publicationYear);
    }
}
