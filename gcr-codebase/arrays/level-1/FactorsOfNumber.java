import java.util.Scanner;

//Create FactorsOfNumber class to find and store factors of a number
public class FactorsOfNumber {
    public static void main(String[] args) {

        //Create Scanner object
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        //Initialize maxFactor size
        int maxFactor = 10;

        //Create factors array
        int[] factors = new int[maxFactor];

        //Index to track factors array
        int index = 0;

        //Finding factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {

                //If array size is full, increase its size
                if (index == maxFactor) {
                    maxFactor = maxFactor * 2;

                    //Create temporary array with increased size
                    int[] temp = new int[maxFactor];

                    //Copy old array elements to new array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    //Assign temp array to factors
                    factors = temp;
                }

                //Store factor and increment index
                factors[index++] = i;
            }
        }

        //Displaying the factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
