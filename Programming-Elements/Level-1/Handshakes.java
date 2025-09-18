import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        
        // Calculate maximum number of handshakes using combination formula
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        // Display the result
        System.out.printf("The maximum number of possible handshakes among %d students is %d\n",
                          numberOfStudents, handshakes);
        
        // Close the scanner
        input.close();
    }
}
