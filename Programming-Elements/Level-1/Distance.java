import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user for distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();
        
        // Convert kilometers to miles using 1 mile = 1.6 km
        double miles = km / 1.6;
        
        // Display the result
        System.out.printf("The total miles is %.2f mile for the given %.2f km\n", miles, km);
        
        // Close the scanner
        input.close();
    }
}
