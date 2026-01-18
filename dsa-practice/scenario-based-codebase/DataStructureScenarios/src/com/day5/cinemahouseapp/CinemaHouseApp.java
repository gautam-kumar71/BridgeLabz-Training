/*
7. CinemaHouse – Movie Time Sorting (Bubble Sort)
Story: 
	● A small local cinema lists daily movie shows. 
	● The screen manager updates showtimes manually and prefers a simple sorting logic. 
	● Since the number of shows is small (~10), Bubble Sort is used.
Key Concepts:
	● Manual data entry, simple logic
	● Small dataset
	● Minimal code complexity
*/

package com.day5.cinemahouseapp;

public class CinemaHouseApp {
	public static void main(String[] args) {
		System.out.println("================= CinemaHouse =================\n");

		ShowSchedule schedule = new ShowSchedule();

		// Movie shows
		schedule.addShow(new MovieShow("Bahubali 2", "10:00"));
		schedule.addShow(new MovieShow("Pushpa", "13:30"));
		schedule.addShow(new MovieShow("Jawan", "17:15"));
		schedule.addShow(new MovieShow("Inception", "11:45"));
		schedule.addShow(new MovieShow("Animal", "19:00"));
		schedule.addShow(new MovieShow("Rockstar", "15:20"));

		System.out.println("\nBefore sorting:");
		schedule.printSchedule();

		schedule.sortByTime();

		System.out.println("\nAfter sorting:");
		schedule.printSchedule();

		System.out.println("=============== Enjoy the Show ==============");
	}
}