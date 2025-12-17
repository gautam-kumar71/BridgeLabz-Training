//Create penDivision Class to divide pens among students
public class penDivision{
    public static void main(String args[])
    {
        //Create a variable totalPens and totalStudents
        int totalPens=14;
        int totalStudents=3;
        
        //Calculate equally divided and non-divided pens
        int totallyDivided=totalPens/totalStudents;
        int remainingPens=totalPens%totalStudents;
        
        //Display the result
        System.out.println("The Pen Per Student is "+totallyDivided+" and the remaining pen not distributed is "+remainingPens);
    }
}
