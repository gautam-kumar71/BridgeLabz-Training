/*
 5. FitnessTracker – Daily Step Count Ranking (Bubble Sort)
Story: 
	● A fitness app tracks steps taken by each user in a small group (less than 20 people). 
	● At the end of the day, it displays rankings. Since the list is small and frequently shuffled 
	  due to last-minute step syncing, a simple Bubble Sort runs quickly to generate the leaderboard.
Concepts Involved:
	● Bubble Sort
	● Frequent updates
	● Real-time re-sorting
*/

package com.day7.fitnesstracker;

import java.util.ArrayList;
import java.util.List;

public class FitnessTrackerApp {
    public static void main(String[] args) {
        // Small group of users
        List<UserSteps> dailySteps = new ArrayList<>();

        dailySteps.add(new UserSteps("Mukul", 12450));
        dailySteps.add(new UserSteps("Nayan", 9870));
        dailySteps.add(new UserSteps("Ishaan", 15680));
        dailySteps.add(new UserSteps("Vikram", 11230));
        dailySteps.add(new UserSteps("Shivam", 8750));
        dailySteps.add(new UserSteps("Harsh", 14320));
        dailySteps.add(new UserSteps("Jay", 9200));
        dailySteps.add(new UserSteps("Sourav", 10890));

        System.out.println("Today's step counts (unsorted):");
        System.out.println("-------------------------------------");
        for (UserSteps user : dailySteps) {
            System.out.println(user);
        }

        System.out.println("\nSorting leaderboard...");
        BubbleSortLeaderboard.sortByStepsDescending(dailySteps);

        System.out.println("\nDaily Leaderboard - Most Steps First");
        System.out.println("=====================================");
        System.out.println(" Rank   |  Name             |  Steps    ");
        System.out.println("-------------------------------------");

        for (int rank = 1; rank <= dailySteps.size(); rank++) {
            UserSteps user = dailySteps.get(rank - 1);
            System.out.printf("  %2d    | %s%n", rank, user);
        }

        System.out.println("\nNote: Bubble Sort is simple and good enough for small lists (<20 people)");
        System.out.println("      New steps sync? Just add/update and sort again - very fast!");
    }
}