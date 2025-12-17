import java.util.*;
class AddTwoNumbers{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
	  double num1=0.0;
	  double num2=0.0;
	  System.out.println("enter first number");
	  num1=sc.nextDouble();
	  System.out.println("enter second number");
	  num2=sc.nextDouble();
	  double sum=num1+num2;
	  System.out.println("Sum of "+num1+" and "+num2+" is: "+sum);
   }
}