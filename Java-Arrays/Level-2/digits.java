import java.util.Scanner;

public class digits {
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
        while (number != 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int j = 0; j < index; j++) {
                    temp[j] = digitsArray[j];
                }
                digitsArray = temp;
            }
            digitsArray[index] = number % 10;
            number = number / 10;
            index++;
        }

        // Variables for largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Loop to find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digitsArray[i] > largest) {
                secondLargest = largest;
                largest = digitsArray[i];
            } else if (digitsArray[i] > secondLargest && digitsArray[i] != largest) {
                secondLargest = digitsArray[i];
            }
        }

        // Display results
        if (index == 0) {
            System.out.println("No digits entered.");
        } else {
            System.out.println("Largest digit: " + largest);
            if (secondLargest != Integer.MIN_VALUE) {
                System.out.println("Second largest digit: " + secondLargest);
            } else {
                System.out.println("No second largest digit.");
            }
        }

        sc.close();
    }
}
