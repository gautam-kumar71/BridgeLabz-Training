//Create AveragePercentMark Class to calculate average marks of Sam
public class AveragePercentMark{
    public static void main(String args[])
    {
        //Create a variable maths,physics,chemistry to store the marks of different subjects
        int maths=94;
        int physics=95;
        int chemistry=96;
        
        // Calculate Sams's average marks
        int samMarks=(maths+physics+chemistry)/3;
        
        //Display the average marks of Sam
        System.out.println("Sam's average mark in PCM is "+samMarks);
    }
}
