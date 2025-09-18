import java.util.Scanner;

public class TriangleAreaConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input base and height in cm
        System.out.print("Enter base of triangle (in cm): ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter height of triangle (in cm): ");
        double height = scanner.nextDouble();
        
        // Calculate area in square centimeters
        double areaSqCm = 0.5 * base * height;
        
        // Convert to square inches (1 inch = 2.54 cm, so 1 sq in = 6.4516 sq cm)
        double areaSqIn = areaSqCm / 6.4516;
        
        // Print results
        System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);
        
        scanner.close();
    }
}
