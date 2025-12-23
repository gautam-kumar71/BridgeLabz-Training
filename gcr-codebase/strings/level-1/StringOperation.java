//Create a StringOperation class to perform String Operations
import java.util.*;
public class StringOperation{

	//User-defined method to return the characters of String 
	public static char[] stringToArray(String inputString)
  {
    char [] charArray=new char[inputString.length()];
    
    int i=0;
    while(i<inputString.length())
    {
      charArray[i]=inputString.charAt(i);
      i++;
    }
    return charArray;
  }
  
  //Method to compare two arrays
  public static boolean compareStrings(char []charArray,char []charArrayII)
  {
    if(charArray.length!=charArrayII.length)
    {
      return false;
    }
    for(int i=0;i<charArray.length;i++)
    {
       if(charArray[i]!=charArrayII[i])
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
    System.out.println("Enter the input string");
    String inputString=sc.next();  
    
    boolean check=compareStrings(stringToArray(inputString), inputString.toCharArray());   
    
    //Displaying the result
    if(check)
    {
      System.out.println("The arrays are equal");
    }
    
    else  
    {
      System.out.println("The arrays are not equal");
    }
    

    sc.close();
	}
}

