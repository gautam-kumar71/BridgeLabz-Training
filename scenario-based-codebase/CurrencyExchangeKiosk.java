import java.util.Scanner;

public class CurrencyExchangeKiosk {

    public static void main(String[] args) {

        // Taking input from user
        Scanner sc = new Scanner(System.in);

        // Variable to control do-while loop
        char choice;

        
        do {
            // Taking INR amount from user
            System.out.print("Enter amount in INR: ");
            double inrAmount = sc.nextDouble();

            // Display currency options
            System.out.println("Choose target currency:");
            System.out.println("1. USD");
            System.out.println("2. EUR");
            System.out.println("3. GBP");

            // Taking user choice
            int currencyChoice = sc.nextInt();
            double convertedAmount = 0;

            // Switch-case to apply correct conversion rate
            switch (currencyChoice) {
                case 1:
                    convertedAmount = inrAmount * 0.012; // INR to USD
                    System.out.println("Converted amount in USD: " + convertedAmount);
                    break;

                case 2:
                    convertedAmount = inrAmount * 0.011; // INR to EUR
                    System.out.println("Converted amount in EUR: " + convertedAmount);
                    break;

                case 3:
                    convertedAmount = inrAmount * 0.0095; // INR to GBP
                    System.out.println("Converted amount in GBP: " + convertedAmount);
                    break;

                default:
                    System.out.println("Invalid currency selection!");
            }

            // Ask user if they want another conversion
            System.out.print("Do you want another conversion? (y/n): ");
            choice = sc.next().toLowerCase().charAt(0);

        } while (choice == 'y'); 

        System.out.println("Thank you for using Currency Exchange Kiosk!");
    }
}
