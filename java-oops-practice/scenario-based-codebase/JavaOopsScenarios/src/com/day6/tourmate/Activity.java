package com.day6.tourmate;

public class Activity {

	private double cost;

	public Activity(int choice, boolean international) {
		if (international) {
			cost = (choice == 1) ? 20000 : 12000; 
		} else {
			cost = (choice == 1) ? 8000 : 4000;
		}
	}

	double getCost() {
		return cost;
	}
}
