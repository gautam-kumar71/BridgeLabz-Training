import java.util.Scanner;

public class ShopkeepersDiscountDashboard {

    // Constants
    public static final double DISCOUNT_20 = 0.20;
    public static final double DISCOUNT_10 = 0.10;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int itemCount = input.nextInt();

        double totalBill = 0;

        // Taking item prices using for-loop
        for (int i = 1; i <= itemCount; i++) {
            System.out.print("Enter price of item " + i + ": ");
            totalBill += input.nextDouble();
        }

        double discountAmount = 0;

        // Discount logic using if-else
        if (totalBill >= 5000) {
            discountAmount = totalBill * DISCOUNT_20;
        } else if (totalBill >= 3000) {
            discountAmount = totalBill * DISCOUNT_10;
        } else {
            discountAmount = 0;
        }

        double finalAmount = totalBill - discountAmount;

        System.out.println("\nTotal Bill: Rs." + totalBill);
        System.out.println("Discount: Rs." + discountAmount);
        System.out.println("Final Amount to Pay: Rs." + finalAmount);

        input.close();
    }
}
