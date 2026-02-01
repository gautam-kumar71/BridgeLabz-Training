package com.streams.foreach.welcomeattendee;

import java.util.ArrayList;
import java.util.List;

public class EventWelcomeApp {
    public static void main(String[] args) {
        List<Attendee> attendees = new ArrayList<>();

        attendees.add(new Attendee("Rahul Mehta", "Indore"));
        attendees.add(new Attendee("Ananya Iyer", "Bhopal"));
        attendees.add(new Attendee("Karan Malhotra", "Ujjain"));
        attendees.add(new Attendee("Pooja Nair", "Jabalpur"));
        attendees.add(new Attendee("Suresh Reddy", "Gwalior"));
        attendees.add(new Attendee("Kavita Shah", "Rewa"));
        attendees.add(new Attendee("Manish Kapoor", "Indore"));
        attendees.add(new Attendee("Divya Bansal", "Bhopal"));
        attendees.add(new Attendee("Arjun Khanna", "Ujjain"));
        attendees.add(new Attendee("Meena Chopra", "Jabalpur"));


        System.out.println("Event Attendee Welcome Messages");
        System.out.println("-------------------------------");

        attendees.stream()
                .forEach(att -> {
                    System.out.println("Welcome " + att.getName() + "!");
                    System.out.println("Glad to have you with us from " + att.getCity() + ".");
                    System.out.println("Enjoy the event!");
                    System.out.println("-------------------------------");
                });

        System.out.println("Total attendees welcomed: " + attendees.size());
    }
}