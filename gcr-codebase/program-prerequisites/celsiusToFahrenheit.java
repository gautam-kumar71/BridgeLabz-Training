import java.util.*;
class celsiusToFahrenheit{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
	  double tempCelsius=0.0;
	  System.out.println("enter the temperature in celsius");
	  tempCelsius=sc.nextDouble();
	  double value=(tempCelsius*9/5)+32;
	  System.out.println("The temperature in Fahrenheit is :"+value);
   }
}