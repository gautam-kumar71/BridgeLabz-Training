// 9. School Bus Attendance System 🚍
// Track 10 students' presence.
// ● Use for-each loop on names.
// ● Ask "Present or Absent?"
// ● Print total present and absent counts.
import java.util.*;

//Create class SchoolBusAttendanceSystem to calculate discount
public class SchoolBusAttendanceSystem{
	static int presentCount=0;
	static int absentCount=0;
	public static void inputNames()
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		String names[]=new String[10];
		String check;
		while(i!=10)
		{
          System.out.println("Enter the name ");
          names[i++]=sc.next();
		}
		for (String name : names) {
		   System.out.printf("%s is present or absent?",name);
           check=sc.next();
           if(check.trim().toLowerCase().equals("present"))
           {
              presentCount++;
           }
           else if(check.trim().toLowerCase().equals("absent"))
           {
           	  absentCount++;
           }
		}
        
	}
	public static void display()
	{
       System.out.println("==============ATTENDANCE SYSTEM================");
       System.out.printf("Total present : %d",presentCount);
       System.out.printf("Total absent : %d",absentCount);
	}
	public static void main(String args[])
	{
		inputNames();
		display();
	}
}
