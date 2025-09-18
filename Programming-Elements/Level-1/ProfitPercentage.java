public class ProfitPercentage {
    public static void main(String[] args) {
        // Define cost price and selling price
        double costPrice = 129;
        double sellingPrice = 191;

        // Calculate profit and profit percentage
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        // Display the results
        System.out.printf("The Cost Price is INR %.2f and Selling Price is INR %.2f\n" +
                          "The Profit is INR %.2f and the Profit Percentage is %.2f%%\n",
                          costPrice, sellingPrice, profit, profitPercentage);
    }
}
