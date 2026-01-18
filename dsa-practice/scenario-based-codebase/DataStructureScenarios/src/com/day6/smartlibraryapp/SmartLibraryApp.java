/*
2. SmartLibrary – Auto-Sort Borrowed Books (Insertion Sort)
Story: 
	● A digital kiosk in a library maintains a list of books a user has borrowed. 
	● Every time a new book is issued, the system adds it to the user's list 
	  while keeping it alphabetically sorted by title. 
	● Since insertions are done one at a time, and the list is usually already sorted, 
	  Insertion Sort is the perfect fit.
Concepts Involved:
	● Insertion Sort
	● Dynamic list insertion
	● Nearly sorted data
*/

package com.day6.smartlibraryapp;

import java.util.ArrayList;

public class SmartLibraryApp {
	public static void main(String[] args) {
		System.out.println("========================= SmartLibrary ==========================\n");

		ArrayList<Book> borrowed = new ArrayList<>();

		// Initial empty list
		InsertionSort.printBorrowedBooks(borrowed, "Initial Borrowed List");

		Book[] issueBooks = {
				new Book("The Alchemist", "Paulo Coelho"),
				new Book("Crime and Punishment", "Fyodor Dostoevsky"),
				new Book("The Kite Runner", "Khaled Hosseini"),
				new Book("Fahrenheit 451", "Ray Bradbury"),
				new Book("Moby-Dick", "Herman Melville"),
				new Book("The Book Thief", "Markus Zusak"),
				new Book("Brave New World", "Aldous Huxley"),
				new Book("The Hobbit", "J.R.R. Tolkien")
		};

		// Issue each book and show updated sorted list
		for (Book newBook : issueBooks) {
			System.out.printf("%n>> Issuing new book: %s by %s%n%n", newBook.getTitle(), newBook.getAuthor());
			InsertionSort.insertBook(borrowed, newBook);
			InsertionSort.printBorrowedBooks(borrowed, "Updated Borrowed List (always sorted)");
		}

		// Display the results
		InsertionSort.printBorrowedBooks(borrowed, "\nFinal Borrowed Books List");
		System.out.println("\n===================== Thanks for using ==========================");
	}
}