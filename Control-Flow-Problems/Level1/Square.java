import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user for perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();
        
        // Calculate side length (side = perimeter / 4)
        double side = perimeter / 4;
        
        // Display the results
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f\n", side, perimeter);
        
        // Close the scanner
        input.close();
    }
}
