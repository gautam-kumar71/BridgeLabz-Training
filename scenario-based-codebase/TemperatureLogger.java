// 11. Temperature Logger 🌡️
// Record temperatures over 7 days.
// ● Use array and for-loop.
// ● Find average and max temperature.
// ● Use if for comparisons. Maintain readable naming and modular code blocks.

import java.util.*;

//Create class TemperatureLogger for logging the temperature
public class TemperatureLogger{
	static double temp[]=new double[7];
	//method to find the average and maxTemp
	public static List<Double> temperatureOperation(double temp[])
	{
		List <Double> pair=new ArrayList<Double>();
		double average=0.0;
		double sumTemperature=0.0;
		double maxTemp=Integer.MIN_VALUE;
		for(double x:temp)
		{
			if(x>maxTemp)
				maxTemp=x;
			sumTemperature+=x;
		} 
		average=sumTemperature/7;
		pair.add(average);
		pair.add(maxTemp);
		return pair;
	}

    //method to display the temperature
	public static void displayTempeature(List<Double>pair)
	{
		int i=0;
		System.out.printf("====================Temperature======================\n");
		while(i<7)
		{
			System.out.printf("Temperature of Day %d : %.2f\n",++i,temp[i-1]);
		}
		System.out.println("Average of temperature of 7 days : "+pair.get(0));
		System.out.println("Maximum temperature of 7 days : "+pair.get(1));
	}

	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		//Recording the temperature from the user
		System.out.println("Enter the temperature of first to 7 days respectively");
		for(int i=0;i<7;i++)
		{
			System.out.printf("Enter temperature of the day\n");
			temp[i]=sc.nextDouble();
		}
		List<Double>store=temperatureOperation(temp);
		displayTempeature(store);
		sc.close();

	}
}