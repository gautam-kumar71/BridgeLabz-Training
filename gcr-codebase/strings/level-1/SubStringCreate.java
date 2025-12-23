//Create a SubStringCreation to create a substring from a given string
import java.util.*;
public class SubStringCreate{

	//Method to create subString using charAt() method
	public static String SubStringCreation(String inputString,int startIndex,int endIndex)
	{
       String newString="";
       for(int i=startIndex;i<endIndex;i++)
       {
         newString+=inputString.charAt(i);
       }
       System.out.printf("The new string from the method I is: %s\n",newString);
       return newString;
	}

    //Method to create subString using substring method
	public static String subStringCreationII(String inputString,int startIndex,int endIndex)
	{
		
		return inputString.substring(startIndex,endIndex);
	}

	public static void main(String args[])
	{
		//Taking input from the user
		Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the input string");
        String inputString=sc.next();  
        System.out.println("Enter the start and end index");
        int startIndex=sc.nextInt();
        int endIndex=sc.nextInt();

        //Checking if the both the strings are equal or not
        if(SubStringCreation(inputString, startIndex, endIndex).equals(subStringCreationII(inputString, startIndex, endIndex)))
        {
        	System.out.println("The string is equal");
        }
        else
        {
        	System.out.println("The string is not equal");
        }

        sc.close();
	}
}




