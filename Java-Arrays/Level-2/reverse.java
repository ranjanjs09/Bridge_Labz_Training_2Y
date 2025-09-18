import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        // Scanner for input
        Scanner sc = new Scanner(System.in);

        // Take user input for number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Find count of digits
        int count = 0;
        int temp = number;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // If number is 0, count is 1
        if (count == 0) {
            count = 1;
        }

        // Array to store digits
        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Array to store reverse
        int[] reverseDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reverseDigits[i] = digits[count - 1 - i];
        }

        // Display the reversed number
        System.out.print("Reversed number: ");
        for (int digit : reverseDigits) {
            System.out.print(digit);
        }
        System.out.println();

        sc.close();
    }
}
