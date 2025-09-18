import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input two numbers
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        
        // Calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        
        // Print results in the required format
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + number1 + " and " + number2);
        
        scanner.close();
    }
}
