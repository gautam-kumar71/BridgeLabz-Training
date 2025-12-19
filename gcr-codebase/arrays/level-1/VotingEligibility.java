import java.util.Scanner;
//Create VotingEligibility class to check if students can vote or not
public class VotingEligibility{
    public static void main(String[] args) {
      //Defining array age to hold the age of ten students
      int [] age=new int[10];
      
      //Taking ten inputs from the user
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter ten ages");
      int i=0;
      while(i<10)
      {
        age[i++]=sc.nextInt();
      }

      //Checking if he/she can vote or not and displaying the result
      for(int j=0;j<age.length;j++)
      {
        if(age[j]<0)
        {
            System.err.println("Invalid age");
        }
        else if (age[j]>=18)
        {
            System.out.println("The student with the age "+age[j]+" can vote");
        }
        else
        {
            System.out.println("The student with the age "+age[j]+" cannot vote");
        }
      }
    }
}