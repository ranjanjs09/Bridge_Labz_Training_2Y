public class NumberCheckerPalindrome {
    public static void main(String[] args) {
        int number = 121; // Sample number for demonstration (palindrome)

        // Count digits
        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);

        // Store digits
        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Reverse digits
        int[] reversed = reverseDigits(digits);
        System.out.print("Reversed digits: ");
        for (int digit : reversed) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Check if arrays equal
        boolean equal = arraysEqual(digits, reversed);
        System.out.println("Original and reversed arrays equal: " + equal);

        // Check if palindrome
        boolean isPalin = isPalindrome(digits);
        System.out.println("Is palindrome: " + isPalin);

        // Check if duck number
        boolean isDuck = isDuckNumber(digits);
        System.out.println("Is duck number: " + isDuck);
    }

    // Method to find the count of digits in the number
    public static int countDigits(int num) {
        if (num == 0) return 1;
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return arraysEqual(digits, reversed);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }
}
