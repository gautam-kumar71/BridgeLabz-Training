import java.util.Scanner;

public class PhoneRechargeSimulator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double balance = 0;
        char continueRecharge;

        // Loop to allow repeated recharges
        do {
            System.out.print("Enter Mobile Operator (Jio/Airtel/VI): ");
            String operator = input.next();

            System.out.print("Enter Recharge Amount: ");
            double amount = input.nextDouble();

            balance += amount;

            // switch-case for offers
            switch (operator.toLowerCase()) {
                case "jio":
                    System.out.println("Offer: 1.5GB/day for 28 days");
                    break;

                case "airtel":
                    System.out.println("Offer: Unlimited calls + 2GB/day");
                    break;

                case "vi":
                    System.out.println("Offer: Weekend data rollover");
                    break;

                default:
                    System.out.println("No offers available for this operator");
            }

            System.out.println("Current Balance: Rs." + balance);

            System.out.print("Do you want to recharge again? (Y/N): ");
            continueRecharge = input.next().charAt(0);

        } while (continueRecharge == 'Y' || continueRecharge == 'y');

        System.out.println("Thank you for using Phone Recharge Simulator!");
        input.close();
    }
}
