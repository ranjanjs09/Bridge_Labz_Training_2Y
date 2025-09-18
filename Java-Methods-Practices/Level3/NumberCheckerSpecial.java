public class NumberCheckerSpecial {
    public static void main(String[] args) {
        int number = 5; // Sample number for demonstration

        System.out.println("Checking number: " + number);

        // Check if prime
        boolean prime = isPrime(number);
        System.out.println("Is prime: " + prime);

        // Check if neon
        boolean neon = isNeon(number);
        System.out.println("Is neon: " + neon);

        // Check if spy
        boolean spy = isSpy(number);
        System.out.println("Is spy: " + spy);

        // Check if automorphic
        boolean automorphic = isAutomorphic(number);
        System.out.println("Is automorphic: " + automorphic);

        // Check if buzz
        boolean buzz = isBuzz(number);
        System.out.println("Is buzz: " + buzz);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int num) {
        int sum = 0;
        int product = 1;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        int temp = num;
        while (temp != 0) {
            if (square % 10 != temp % 10) return false;
            square /= 10;
            temp /= 10;
        }
        return true;
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }
}
