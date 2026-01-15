/*
7. TrafficManager – Roundabout Vehicle Flow (Circular Linked List + Queue)
Story: 
	● A smart city roundabout allows vehicles to enter and exit dynamically. 
	● Each vehicle is a node in a Circular Linked List. 
	● A Queue manages vehicles waiting to enter.
Requirements:
	● Add or remove cars in a circular path.
	● Queue overflow/underflow handling.
	● Print state of roundabout at any time.
*/

package com.day2.trafficmanagerapp;

public class TrafficManagerApp {
	public static void main(String[] args) {
		Roundabout traffic = new Roundabout();

		System.out.println("===== Smart Roundabout Traffic Manager =====");
		traffic.arrive("JK-66-LO-1634");
		traffic.arrive("JK-99-DC-7978");
		traffic.arrive("JK-40-HI-7013");
		traffic.arrive("JK-10-MN-8559");
		traffic.arrive("JK-15-PO-5590");
		traffic.arrive("JK-11-QR-6822");
		traffic.printState();

		traffic.tryEnter();
		traffic.tryEnter();
		traffic.tryEnter();
		traffic.tryEnter();
		traffic.tryEnter();
		traffic.printState();

		System.out.println("--- Some vehicles exit ---");
		traffic.exit("JK-66-LO-1634");
		traffic.exit("JK-11-QR-6822");
		traffic.printState();

		traffic.exit("JK-99-DC-7978");
		traffic.tryEnter();
		traffic.printState();
	}
}