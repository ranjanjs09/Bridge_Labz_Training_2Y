import java.util.Scanner;

public class digitfrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Find count of digits
        int count = 0;
        int temp = number;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

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

        // Frequency array for digits 0-9
        int[] frequency = new int[10];
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency of each digit
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

        sc.close();
    }
}
