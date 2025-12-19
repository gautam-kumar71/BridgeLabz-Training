import java.util.Scanner;

//Create ZaraEmployeeBonus class to calculate bonus and new salary of employees
public class ZaraEmployeeBonus {
    public static void main(String[] args) {

        //Create Scanner object
        Scanner sc = new Scanner(System.in);

        //Create arrays to store salary and years of service
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];

        //Create arrays to store bonus amount and new salary
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        //Variables to store totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        //Taking input for 10 employees
        System.out.println("Enter salary and years of service for 10 employees:");
        for (int i = 0; i < 10; i++) {

            System.out.println("Employee " + (i + 1));

            System.out.print("Enter salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter years of service: ");
            yearsOfService[i] = sc.nextDouble();

            //Validating input
            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.err.println("Invalid input. Please enter again.");
                i--; //Decrement index to take input again
            }
        }

        //Calculating bonus and new salary
        for (int i = 0; i < 10; i++) {

            //Calculating bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            //Calculating new salary
            newSalary[i] = salary[i] + bonus[i];

            //Calculating totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        //Displaying final results
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary of employees: " + totalOldSalary);
        System.out.println("Total new salary of employees: " + totalNewSalary);
    }
}
