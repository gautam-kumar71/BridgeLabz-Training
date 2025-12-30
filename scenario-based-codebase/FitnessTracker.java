// 13. Sandeep’s Fitness Challenge Tracker 🏋️
// ♂Each day Sandeep completes a number of push-ups.
// ● Store counts for a week.
// ● Use for-each to calculate total and average.
// ● Use continue to skip rest days.

import java.util.*;

public class FitnessTracker{
	static int [] trackPushups;
	static int totalPushups=0;
	public static double calculate(int[]trackPushups)
	{

		double average=0.0;
		for(int pushup:trackPushups)
		{
          if(pushup==0)//rest day
          	continue;
          totalPushups+=pushup;
      }
      average=(double)totalPushups/7.0;
      return average;
  }

  public static void display(double averagePushup)
  {
  	System.out.printf("Total push-ups : %d\n",totalPushups);
  	System.out.printf("Average pushup : %.2f\n",averagePushup);
  }

  public static void main(String[] args) 
  {
  	Scanner sc=new Scanner(System.in);
  	trackPushups=new int[7];
  	int j=0;
  	System.out.printf("\n=============Fitness Challenge Tracker=================\n");
  	for(int i=0;i<7;i++)
  	{
  		System.out.println("Enter the number of push-ups of Day "+(++j));
  		trackPushups[i]=sc.nextInt();
  	}
  	double store=calculate(trackPushups);
  	display(store);
  }
}