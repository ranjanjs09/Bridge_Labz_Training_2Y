import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input two floating point numbers
        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();
        
        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = 0.0;
        
        // Handle division by zero
        if (number2 != 0) {
            division = number1 / number2;
        } else {
            System.out.println("Warning: Division by zero is undefined!");
        }
        
        // Print results in the required format
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + 
                          number1 + " and " + number2 + " is " + addition + ", " + subtraction + 
                          ", " + multiplication + ", and " + division);
        
        scanner.close();
    }
}
