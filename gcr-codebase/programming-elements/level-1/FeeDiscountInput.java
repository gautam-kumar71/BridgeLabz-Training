import java.util.Scanner;

// Creating class FeeDiscountInput indicating fee discount calculation
class FeeDiscountInput {

    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create variable fee and take user input
        double fee = input.nextDouble();

        // Create variable discountPercent and take user input
        double discountPercent = input.nextDouble();

        // Compute discount amount
        double discountAmount = (fee * discountPercent) / 100;

        // Compute final fee after discount
        double finalDiscountedFee = fee - discountAmount;

        // Display the result
        System.out.println(
            "The discount amount is INR " + discountAmount +
            " and final discounted fee is INR " + finalDiscountedFee
        );

        // Close scanner
        input.close();
    }
}

