import java.util.Scanner;

public class IntOperationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input three integers
        System.out.print("Enter first integer (a): ");
        int a = scanner.nextInt();
        
        System.out.print("Enter second integer (b): ");
        int b = scanner.nextInt();
        
        System.out.print("Enter third integer (c): ");
        int c = scanner.nextInt();
        
        // Calculate the four integer operations
        int result1 = a + b * c;      // Multiplication has higher precedence than addition
        int result2 = a * b + c;      // Multiplication has higher precedence than addition
        int result3 = c + a / b;      // Division has higher precedence than addition
        int result4 = a % b + c;      // Modulus has higher precedence than addition
        
        // Print results
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
        
        scanner.close();
    }
}
