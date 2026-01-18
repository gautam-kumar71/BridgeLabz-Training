/*
5. ExamCell – Student Rank Generator (Merge Sort)
Story: 
	● An online exam system collects scores from multiple test centers. 
	● To publish a state-level rank list, student scores are merged and 
	● sorted using Merge Sort, ensuring performance and accuracy.
Key Concepts:
	● Merging pre-sorted center-wise scores
	● Sorting across centers
	● High efficiency for big data
 */
package com.day4.examcell;

import java.util.Arrays;
import java.util.List;

public class ExamCellApp {

    public static void main(String[] args) {
        ExamCell examCell = new ExamCell();

        System.out.println("==================== ExamCell – State Level Rank Generator ====================");
        System.out.println("Merging & sorting scores from all test centers using Merge Sort\n");

        // Added three test centers
        // each already sorted internally (by roll no or local rank)
        List<Score> centerDhanbad = Arrays.asList(
                new Score("MP04C556", "Sameer Gupta", 489, "DHANBAD-01"),
                new Score("MP04D557", "Pritam Kumar", 412, "DHANBAD-01"),
                new Score("MP04E547", "Sanya Kumari", 378, "DHANBAD-01"),
                new Score("MP04F549", "Nivesh Verma", 445, "DHANBAD-01")
        );

        List<Score> centerIndore = Arrays.asList(
                new Score("MP01A101", "Rohit Malviya", 445, "INDORE-01"),
                new Score("MP01A102", "Kavya Jain", 392, "INDORE-01"),
                new Score("MP01A103", "Neha Choudhary", 468, "INDORE-01"),
                new Score("MP01A104", "Aman Verma", 381, "INDORE-01")
        );

        List<Score> centerRaipur = Arrays.asList(
                new Score("CG02D201", "Saurabh Mishra", 426, "RAIPUR-02"),
                new Score("CG02D202", "Isha Patel", 459, "RAIPUR-02"),
                new Score("CG02D203", "Harsh Tiwari", 404, "RAIPUR-02"),
                new Score("CG02D204", "Pooja Sen", 418, "RAIPUR-02")
        );

        System.out.println("Receiving sorted score lists from centers...");

        examCell.addCenterScores(centerDhanbad);
        examCell.addCenterScores(centerIndore);
        examCell.addCenterScores(centerRaipur);

        System.out.println("\nTotal students collected: " + examCell.getTotalStudents());
        System.out.println("Generating state-wide merit list using Merge Sort...");

        // Perform merge sort - highest marks first
        examCell.generateStateRankList();

        // Show top ranks
        examCell.displayTopRanks(10);
        System.out.println("Rank list published successfully.");
    }
}
