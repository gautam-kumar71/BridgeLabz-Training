//Create profitAndLossAndPercentage Class to calculate profit, loss and percentage
public class profitAndLossAndPercentage{
    public static void main(String args[])
    {
        //Create a variable costPrice and sellingPrice to store the cost price and selling price of item
        int costPrice=129;
        int sellingPrice=191;
        
        //Calculate profit and it's percentage
        int profit=sellingPrice-costPrice;
        float profitPercent=((float)profit/(float)costPrice)*100;
        
        //Display the result
        System.out.println("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice+"\n"+"The Profit is INR "+profit+" and the Profit Percentage is "+profitPercent);
    }
}
