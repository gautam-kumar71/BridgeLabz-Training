package com.designprinciples.librarycasestudy;

public class SmartLibraryApp {

    public static void main(String[] args) {
	System.out.println("====================================================================================");
	System.out.println("		DIGITAL CAMPUS LIBRARY MANAGEMENT SYSTEM");
	System.out.println("====================================================================================\n");
	
        // Get the singleton catalog
        LibraryCatalog catalog = LibraryCatalog.getInstance();

        // Create books using Builder pattern
        Book algoBook = new Book.BookBuilder("978-1492056305", "Data Structures and Algorithms Made Easy")
                .withAuthors("Narasimha Karumanchi")
                .withEdition(1)
                .withPublisher("CareerMonk Publications")
                .withGenre("Computer Science")
                .build();

        Book pythonBook = new Book.BookBuilder("978-1593279929", "Automate the Boring Stuff with Python")
                .withAuthors("Al Sweigart")
                .withEdition(2)
                .withPublisher("No Starch Press")
                .withGenre("Programming")
                .build();

        catalog.addBook(algoBook);
        catalog.addBook(pythonBook);

        // Create users using Factory pattern
        User rahul = UserFactory.createUser("Rahul", "Student");
        User priya = UserFactory.createUser("Priya", "Faculty");
        User librarian1 = UserFactory.createUser("Mr. Mehta", "Librarian");
        User librarian2 = UserFactory.createUser("Ms. Kapoor", "Librarian");

        // Subscribe to notifications (Observer pattern)
        algoBook.attach(rahul);
        algoBook.attach(priya);

        // Librarian one subscribed
        algoBook.attach(librarian1);

        System.out.println("\n--> Someone borrowed 'Data Structures and Algorithms Made Easy' (Subscribed librarian notified)");
        catalog.updateBookAvailability("978-1492056305", false);

        System.out.println("\n--> Book returned (All subscribers notified)");
        catalog.updateBookAvailability("978-1492056305", true);

        // Librarian two subscribed later
        algoBook.attach(librarian2);

        System.out.println("\n--> Book borrowed again (Subscribed librarians notified)");
        catalog.updateBookAvailability("978-1492056305", false);
        
	System.out.println("\n====================================================================================");
	System.out.println("		  THANK YOU FOR VISITING, KEEP LEARNING!");
	System.out.println("====================================================================================");

    }
}
