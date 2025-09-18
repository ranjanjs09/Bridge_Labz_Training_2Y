import java.util.Scanner;

public class SquareSideFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input perimeter from user
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();
        
        // Calculate side length (side = perimeter / 4)
        double side = perimeter / 4.0;
        
        // Print results in the required format
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        
        scanner.close();
    }
}
