import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user for base and height
        System.out.print("Enter the base of the triangle in inches: ");
        double base = input.nextDouble();
        
        System.out.print("Enter the height of the triangle in inches: ");
        double height = input.nextDouble();
        
        // Calculate area in square inches
        double areaInches = 0.5 * base * height;
        
        // Convert to square centimeters (1 inch = 2.54 cm, so 1 sq inch = 6.4516 sq cm)
        double areaCm = areaInches * 6.4516;
        
        // Display the results
        System.out.printf("The area of triangle in square inches is %.2f and in square centimeters is %.2f\n",
                          areaInches, areaCm);
        
        // Close the scanner
        input.close();
    }
}
