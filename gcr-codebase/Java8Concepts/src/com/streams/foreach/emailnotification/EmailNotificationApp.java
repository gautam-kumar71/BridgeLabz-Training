package com.streams.foreach.emailnotification;

import java.util.ArrayList;
import java.util.List;

public class EmailNotificationApp {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Rahul", "rahul.mehta@gmail.com"));
        users.add(new User("Ananya", "ananya.iyer@yahoo.com"));
        users.add(new User("Karan", "karan.malhotra@outlook.com"));
        users.add(new User("Pooja", "pooja.nair@hotmail.com"));
        users.add(new User("Suresh", "suresh.reddy@proton.me"));
        users.add(new User("Kavita", "kavita.shah@gmail.com"));
        users.add(new User("Manish", "manish.kapoor@yahoo.com"));
        users.add(new User("Divya", "divya.bansal@outlook.com"));
        users.add(new User("Arjun", "arjun.khanna@hotmail.com"));
        users.add(new User("Meena", "meena.chopra@proton.me"));


        System.out.println("Sending Welcome / Update Notification Emails");
        System.out.println("---------------------------------------------");

        users.stream()
             .forEach(user -> {
                 String email = user.getEmail();
                 String name = user.getName();

                 System.out.println("To: " + email);
                 System.out.println("Subject: Important Update - Gym Membership / Event / Offer");
                 System.out.println("Dear " + name + ",");
                 System.out.println("We hope you're doing well!");
                 System.out.println("This is a quick notification from our team.");
                 System.out.println("Stay tuned for more updates.");
                 System.out.println("Best regards,");
                 System.out.println("Team Support");
                 System.out.println("---------------------------------------------");
             });

        System.out.println("All " + users.size() + " notification emails sent.");
    }
}