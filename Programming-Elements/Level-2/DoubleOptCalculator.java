import java.util.Scanner;

public class DoubleOptCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input three double values
        System.out.print("Enter first double value (a): ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter second double value (b): ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter third double value (c): ");
        double c = scanner.nextDouble();
        
        // Calculate the four double operations
        double result1 = a + b * c;      // Multiplication has higher precedence than addition
        double result2 = a * b + c;      // Multiplication has higher precedence than addition
        double result3 = c + a / b;      // Division has higher precedence than addition
        double result4 = a % b + c;      // Modulus has higher precedence than addition
        
        // Print results
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
        
        scanner.close();
    }
}
