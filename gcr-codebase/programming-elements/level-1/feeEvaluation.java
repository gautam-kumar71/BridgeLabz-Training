//Create feeEvaluation Class to divide pens among students
public class feeEvaluation{
    public static void main(String args[])
    {
        //Create a variable discount and discountPercent
        int fee=125000;
        int disocuntPercent=10;
        
        //Calculate discount
        int discount=(discountPercent/100)*fee;
        int discountedFee=fee-discount;
        
        //Display the result
        System.out.println("The discount amount is INR "+discount+ " and final discounted fee is INR " + discountedFee);
    }
}
