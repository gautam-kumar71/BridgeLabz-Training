package com.day4.fittrack;

public class FitTrackMain {
	public static void main(String[] args) {
		UserProfile user = new UserProfile("Gautam", 22, 48, "Muscle Gain");
		
		Workout cardio = new CardioWorkout(40);
		Workout strength = new StrengthWorkout(30);
		
		cardio.startWorkout();
		cardio.calculateCalories(user.getWeight());
		cardio.stopWorkout();
		
		strength.startWorkout();
		strength.calculateCalories(user.getWeight());
		strength.stopWorkout();
		
		double dailyTarget = 600;
		double totalBurned = cardio.getCaloriesBurned() + strength.getCaloriesBurned();
		double remaining = dailyTarget - totalBurned;
		
		System.out.println("User: " + user.getName());
		System.out.println("Goal: " + user.getGoal());
		System.out.println("Calories burned today: " + totalBurned);
		System.out.println("Remaining target: " + remaining);

	}
}
