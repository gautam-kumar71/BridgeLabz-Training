//Create StringCompare class to compare two strings
import java.util.*;
public class StringCompare{
	
    public static boolean StringComparison(String stringFirst,String stringSecond){
      if(stringFirst.length()!=stringSecond.length())
      {
      	return false;
      }

      for(int i=0;i<stringFirst.length();i++)
      {
      	if(stringFirst.charAt(i)!=stringSecond.charAt(i))
      	{
      		return false;
      	}
      }
     return true;
    }


	public static void main(String args[])
	{
        //Taking input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two strings");
        String stringFirst=sc.next();
        String stringSecond=sc.next();

        boolean result=StringComparison(stringFirst,stringSecond);
        if(result)
        {
        	System.out.println("The strings are same");
        }
        else
        {
        	System.out.println("The strings are not same");
        }
	}

}