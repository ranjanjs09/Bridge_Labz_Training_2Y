public class UniversityFeeDiscount {
    public static void main(String[] args) {
        // Define the course fee and discount percentage
        double fee = 125000;
        double discountPercent = 10;

        // Calculate discount amount and final fee
        double discount = fee * discountPercent / 100;
        double finalFee = fee - discount;

        // Display the results
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f\n",
                          discount, finalFee);
    }
}
