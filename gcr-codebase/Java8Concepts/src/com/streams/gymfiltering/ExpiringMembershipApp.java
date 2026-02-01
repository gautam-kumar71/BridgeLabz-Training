package com.streams.gymfiltering;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ExpiringMembershipApp {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();

        // sample data (some already expired, some future, some within 30 days)
        members.add(new Member("Kunal Sharma", LocalDate.now().plusDays(12)));
        members.add(new Member("Pratik Jain", LocalDate.now().plusDays(45)));
        members.add(new Member("Amita Patel", LocalDate.now().plusDays(5)));
        members.add(new Member("Soumya Verma", LocalDate.now().minusDays(10)));
        members.add(new Member("Vedansh Singh", LocalDate.now().plusDays(28)));
        members.add(new Member("Nitin Gupta", LocalDate.now().plusDays(60)));

        System.out.println("Gym Members - Expiring in next 30 days");
        System.out.println("----------------------------------------");

        members.stream()
                .filter(Member::expiresWithin30Days)
                .forEach(System.out::println);

        System.out.println("----------------------------------------");

        long count = members.stream()
                .filter(Member::expiresWithin30Days)
                .count();

        System.out.println("Number of members expiring soon: " + count);
    }
}