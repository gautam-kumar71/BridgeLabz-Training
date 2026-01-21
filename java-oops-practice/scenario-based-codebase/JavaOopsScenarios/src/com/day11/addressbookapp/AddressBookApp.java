/*
Smart Contact Manager
OOP Concepts:
    Classes, Objects, Encapsulation, Constructors, Access Modifiers, Collections

Scenario:
    You are working with ConnectSphere Solutions, a startup developing tools to
    manage personal and professional contacts digitally.

Each Contact includes:
    ● First Name, Last Name
    ● Phone Number, Email
    ● Address (optional: City, State, Zip)

Problem Statement:
    Develop a Java application that:
        ● Adds a new contact (with duplicate validation)
        ● Edits an existing contact by name
        ● Deletes a contact by name
        ● Searches contacts by city or state
        ● Displays all contacts sorted alphabetically
        ● Stores contacts in an in-memory structure like ArrayList<Contact>

Uses:
    ● Classes and constructors
    ● Encapsulation
    ● Composition (Address class)
*/

package com.day11.addressbookapp;

public class AddressBookApp {

    public static void main(String[] args) {

        AddressBook book = new AddressBook();

        // Added example contacts
        book.addContact(new Contact(
                "Aman", "Sharma", "9234567890", "aman.sharma@gmail.com",
                new Address("Jaipur", "Rajasthan", "302001")
        ));

        book.addContact(new Contact(
                "Priya", "Deshmukh", "9988776655", "priya.d@gmail.com",
                new Address("Nagpur", "Maharashtra", "440001")
        ));

        book.addContact(new Contact(
                "Karthik", "Rao", "9123098765", "karthik.rao@yahoo.com",
                new Address("Bengaluru", "Karnataka", "560001")
        ));

        book.addContact(new Contact(
                "Anjali", "Verma", "8800112233", "anjali.verma@gmail.com",
                null   // no address
        ));

        System.out.println("All Contacts (sorted):");
        System.out.println("---------------------------------------------------------------");
        for (Contact c : book.getSortedContacts()) {
            System.out.println(c);
        }
        System.out.println("Total contacts: " + book.getContactCount() + "\n");

        // Try adding duplicate
        boolean added = book.addContact(
                new Contact("Aman", "Sharma", "7000000000", "duplicate@gmail.com", null)
        );
        System.out.println("Trying to add duplicate Aman Sharma -> " +
                (added ? "Success" : "Failed (duplicate)"));

        // Search by city/state
        System.out.println("\nContacts from Maharashtra:");
        for (Contact c : book.searchByLocation("Maharashtra")) {
            System.out.println(c);
        }

        // Edit example
        Contact updated = new Contact("", "", "9991118887", "anjali.updated@gmail.com", null);
        boolean edited = book.editContact("Anjali", "Verma", updated);
        System.out.println("\nEditing Anjali Verma phone & email -> " +
                (edited ? "Success" : "Failed"));

        // Show updated list
        System.out.println("\nUpdated Contact List:");
        for (Contact c : book.getSortedContacts()) {
            System.out.println(c);
        }

        // Delete
        boolean deleted = book.deleteContact("Karthik", "Rao");
        System.out.println("\nDeleting Karthik Rao -> " +
                (deleted ? "Success" : "Failed"));

        System.out.println("Remaining contacts: " + book.getContactCount());
    }
}
