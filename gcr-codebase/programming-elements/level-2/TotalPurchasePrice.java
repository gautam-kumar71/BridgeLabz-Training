import java.util.Scanner;
//Create TotalPurchasePrice to calculate total price
public class TotalPurchasePrice {
    public static void main(String[] args) {
        //Taking input from user
        Scanner input = new Scanner(System.in);
        int unitPrice = input.nextInt();
        int quantity = input.nextInt();

        // Calculate total price
        int totalPrice = unitPrice * quantity;

        // Display the result
        System.out.println(
            "The total purchase price is INR " + totalPrice +
            " if the quantity " + quantity +
            " and unit price is INR " + unitPrice);
		input.close();
    }
}
