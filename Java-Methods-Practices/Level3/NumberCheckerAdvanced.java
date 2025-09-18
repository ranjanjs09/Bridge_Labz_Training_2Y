public class NumberCheckerAdvanced {
    public static void main(String[] args) {
        int number = 6; // Sample number for demonstration (perfect number)

        System.out.println("Checking number: " + number);

        // Check if perfect
        boolean perfect = isPerfect(number);
        System.out.println("Is perfect: " + perfect);

        // Check if abundant
        boolean abundant = isAbundant(number);
        System.out.println("Is abundant: " + abundant);

        // Check if deficient
        boolean deficient = isDeficient(number);
        System.out.println("Is deficient: " + deficient);

        // Check if strong
        boolean strong = isStrong(number);
        System.out.println("Is strong: " + strong);
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum == num;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundant(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum > num;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficient(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum < num;
    }

    // Method to check if a number is a strong number
    public static boolean isStrong(int num) {
        int sum = 0;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    // Helper method for factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
