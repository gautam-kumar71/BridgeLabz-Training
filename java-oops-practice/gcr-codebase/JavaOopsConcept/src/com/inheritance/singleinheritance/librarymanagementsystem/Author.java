package com.inheritance.singleinheritance.librarymanagementsystem;

public class Author extends Book {

    private String name;
    private String bio;

    // Constructor
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // calling Book constructor
        this.name = name;
        this.bio = bio;
    }

    // Overriding method
    @Override
    public void displayInfo() {
        super.displayInfo(); // display book details
        System.out.println("Author Name      : " + name);
        System.out.println("Author Bio       : " + bio);
    }
}
