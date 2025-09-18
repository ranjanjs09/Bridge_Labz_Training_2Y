import java.util.Scanner;

public class UnitPrice {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user for unit price
        System.out.print("Enter the unit price in INR: ");
        double unitPrice = input.nextDouble();
        
        // Prompt user for quantity
        System.out.print("Enter the quantity to be bought: ");
        int quantity = input.nextInt();
        
        // Calculate total price
        double totalPrice = unitPrice * quantity;
        
        // Display the results
        System.out.printf("The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f\n",
                          totalPrice, quantity, unitPrice);
        
        // Close the scanner
        input.close();
    }
}
