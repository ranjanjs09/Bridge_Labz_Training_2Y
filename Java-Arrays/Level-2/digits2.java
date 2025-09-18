import java.util.Scanner;

public class digits2 {
    public static void main(String[] args) {
        // Scanner for input
        Scanner sc = new Scanner(System.in);

        // Take user input for number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Define array to store digits, max size 10
        int maxDigit = 10;
        int[] digitsArray = new int[maxDigit];
        int index = 0;

        // Loop to extract digits
        while (number != 0 && index < maxDigit) {
            digitsArray[index] = number % 10;
            number = number / 10;
            index++;
        }

        // Variables for largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // Loop to find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digitsArray[i] > largest) {
                secondLargest = largest;
                largest = digitsArray[i];
            } else if (digitsArray[i] > secondLargest) {
                secondLargest = digitsArray[i];
            }
        }

        // Display results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}
