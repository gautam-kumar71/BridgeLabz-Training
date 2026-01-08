package com.day4.eventease;

public class EventEaseMain {

    public static void main(String[] args) {

        User organizer = new User(
                "Aryaman",
                "aryaman@gmail.com",
                "9876543210"
        );

        Event birthday = new BirthdayEvent(
                "Suresh Birthday",
                "Mumbai",
                "13-04-2026",
                40,
                organizer,
                16000,
                6000
        );

        Event conference = new ConferenceEvent(
                "Google Cloud Conference",
                "Pune",
                "20-06-2026",
                300,
                organizer,
                60000,
                30000
        );

        birthday.schedule();
        conference.schedule();
    }
}