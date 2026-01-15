/*
4. CallCenter – Customer Queue Manager (Queue + HashMap)
Story: 
	● In a telecom call center, customers are queued based on the time of call. 
	● Priority customers have a special queue. 
	● A HashMap keeps track of the number of times each user has called this month.
Requirements:
	● Use Queue for managing incoming calls.
	● Use HashMap for customer data.
	● Priority Queue for VIP customers.
*/

package com.day2.callcenterapp;

public class CallCenterApp {
	
	public static void main(String[] args) {
		
		CallCenter callCenter = new CallCenter();
		System.out.println("===== Call Center =====\n");

		// Incoming calls
		callCenter.receiveCall(new Call("AL342", "Rohit Verma", false, "Recharge failed"));
		callCenter.receiveCall(new Call("AL118", "Ananya Singh", true, "New broadband connection"));
		callCenter.receiveCall(new Call("AL256", "Suresh Patel", true, "Internet disconnected suddenly"));
		callCenter.receiveCall(new Call("AL342", "Rohit Verma", false, "Billing amount incorrect"));
		callCenter.receiveCall(new Call("AL901", "Neha Gupta", true, "Urgent - very slow internet speed"));
		callCenter.receiveCall(new Call("AL118", "Ananya Singh", true, "Installation delay issue"));


		callCenter.showQueueStatus();

		// Agent starts attending calls
		System.out.println("\nAgent starts attending calls...");

		callCenter.attendNextCall();
		callCenter.attendNextCall();
		callCenter.attendNextCall();
		callCenter.attendNextCall();
		
		callCenter.showQueueStatus();

		// Show statistics at the end
		callCenter.showCallStatistics();

		System.out.println("\n===== Thanks for calling =====");
	}
}
