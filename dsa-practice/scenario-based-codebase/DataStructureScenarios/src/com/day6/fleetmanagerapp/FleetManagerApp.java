/*
10. FleetManager – Vehicle Maintenance Scheduler (Merge Sort)
Story: 
	● A fleet company schedules vehicle maintenance based on mileage. 
	● Each depot sends a sorted list of vehicles. 
	● To create a master schedule, Merge Sort is used to combine these depot lists efficiently.
Key Concepts:
	● Sorted sublists from multiple sources
	● Merge sort for final master list
	● Efficient memory usage for large lists
*/

package com.day6.fleetmanagerapp;

public class FleetManagerApp {
	public static void main(String[] args) {

		System.out.println("=========================== FLEETMANAGER ==============================\n");
		// Added example depots with pre-sorted vehicles list by mileage
		Depot[] depots = new Depot[] {
				new Depot("Jamshedpur",
						new Vehicle("JH05AA4321", "Tata Intra", 13280, "2025-10-18"),
						new Vehicle("JH05BB8765", "Mahindra Jeeto", 17540, "2025-11-22"),
						new Vehicle("JH05CC1098", "Isuzu S-Cab", 24990, "2025-12-09")),
				new Depot("Hazaribagh",
						new Vehicle("JH02DD5566", "Ashok Dost", 10450, "2025-09-30"),
						new Vehicle("JH02EE7788", "Tata 407", 15820, "2025-12-14"),
						new Vehicle("JH02FF9900", "Eicher Polaris", 21460, "2025-11-06"),
						new Vehicle("JH02GG2233", "BharatBenz 1217", 28970, "2025-10-25")),
				new Depot("Bokaro",
						new Vehicle("JH09HH4455", "Tata Signa", 17230, "2025-12-01"),
						new Vehicle("JH09II6677", "Volvo FM", 23180, "2025-11-12")),
				new Depot("Latehar") 
		};

		// Display depots
		printDepots(depots);

		// Vehicle[][] for the merge function
		Vehicle[][] lists = new Vehicle[depots.length][];
		for (int i = 0; i < depots.length; i++) {
			lists[i] = depots[i].getVehicles();
		}

		// Merge all lists
		Vehicle[] schedule = FleetMergeSort.mergeMultipleSortedLists(lists);

		// Display sorted schedule
		FleetMergeSort.printSchedule(schedule);
		System.out.println("======================= THANKS FOR VISITING ===========================\n");
	}

	private static void printDepots(Depot[] depots) {
		System.out.println("Pre-sorted lists from each depot:");
		System.out.println("-----------------------------------------------------------------------");

		for (Depot depot : depots) {
			System.out.printf("Depot: %s%n", depot);
			if (depot.size() == 0) {
				System.out.println("(empty)");
			} else {
				for (Vehicle v : depot.getVehicles()) {
					System.out.println(v);
				}
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------------------\n");
	}
}