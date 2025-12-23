//Create class StringIndexOutOfBoundsExceptionDemo to demonstarate the string out of bounds exception 
public class StringIndexOutOfBoundsExceptionDemo{
	//Method to generate Exceptions
	public static void generateException(String text)
	{
      System.out.printf("The string text is :%s",text.charAt(text.length()+1));
	}

    //Method to handleExceptions
	public static void handleException(String text)
	{
		try{
          System.out.printf("The string text is :%s",text.charAt(text.length()+1));
		}
		catch(Exception e)
		{
            System.out.println("Exception occurred"+e.getMessage());         
            System.out.println("Attemped to access index out of the range of string");
		}
	}

	public static void main(String args[])
	{
	  String text="Modesty";
	   
	   try{
	   	generateException(text);
	   }	
	   catch(Exception e){
	   	handleException(text);
	   }

	   //Handling the exception
	   handleException(text);
	}
}
