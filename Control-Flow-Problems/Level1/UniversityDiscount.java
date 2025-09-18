import java.util.Scanner;

public class UniversityDiscount {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user for student fee
        System.out.print("Enter the student fee in INR: ");
        double fee = input.nextDouble();
        
        // Prompt user for discount percentage
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();
        
        // Calculate discount amount and final fee
        double discount = fee * discountPercent / 100;
        double finalFee = fee - discount;
        
        // Display the results
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f\n", discount, finalFee);
        
        // Close the scanner
        input.close();
    }
}
