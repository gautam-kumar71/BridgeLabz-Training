package com.linkedlists.doubly.librarymanagementsystem;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();

        library.addFirst(101, "The Guide", "R.K. Narayan",
                "Fiction", true);
        library.addLast(102, "Wings of Fire", "A.P.J. Abdul Kalam",
                "Autobiography", true);
        library.addLast(103, "The Palace of Illusions", "Chitra Banerjee Divakaruni",
                "Mythology", false);

        library.addAtPosition(1, 104, "Malgudi Days",
                "R.K. Narayan", "Fiction", true);

        System.out.println("Library (Forward):");
        library.displayForward();

        System.out.println("Library (Reverse):");
        library.displayReverse();

        System.out.println("Search by Author: R.K. Narayan");
        library.searchByAuthor("R.K. Narayan");

        System.out.println("Update Availability (Book ID 103):");
        library.updateAvailability(103, true);

        System.out.println("Remove Book ID 102:");
        library.removeByBookId(102);

        System.out.println("Final Library:");
        library.displayForward();

        System.out.println("Total Books: " + library.getTotalBooks());
    }
}
