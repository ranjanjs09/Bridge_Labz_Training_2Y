import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user for height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();
        
        // Convert centimeters to inches (1 inch = 2.54 cm)
        double totalInches = heightCm / 2.54;
        
        // Calculate feet and remaining inches
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;
        
        // Display the results
        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f\n", 
                          heightCm, feet, inches);
        
        // Close the scanner
        input.close();
    }
}
