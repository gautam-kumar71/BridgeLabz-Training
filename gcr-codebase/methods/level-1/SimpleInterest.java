import java.util.Scanner;
//Create SimpleInterest class to computer the simple interest
public class SimpleInterest{
     
	 //Create method simpleInterestCalculate to calculate simple interest program
	 public static double simpleInterestCalculate(double principle,double rate,double time)
     {
        double simpleInterestValue=principle*rate*time;
        return simpleInterestValue;
     }
	 
	 public static void main(String args[])
	 {
		System.out.println("Enter principal,rate,and time respectively");
		Scanner sc=new Scanner(System.in);
		double principal=sc.nextDouble();
		double rate=sc.nextDouble();
		double time=sc.nextDouble();
		double value=simpleInterestCalculate(principal,rate,time);
	    System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %f",value,principal,rate,time);
	 }
}