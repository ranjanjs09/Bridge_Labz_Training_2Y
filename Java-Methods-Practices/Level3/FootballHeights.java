import java.util.Random;

public class FootballHeights {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random random = new Random();

        // Generate random heights between 150 and 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150; // 150 to 250 inclusive
        }

        // Display heights
        System.out.println("Player heights (in cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        // Compute and display results
        int sum = sum(heights);
        double mean = mean(heights);
        int shortest = shortest(heights);
        int tallest = tallest(heights);

        System.out.println("Sum of heights: " + sum + " cm");
        System.out.println("Mean height: " + String.format("%.2f", mean) + " cm");
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
    }

    // Method to find the sum of all elements in the array
    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }

    // Method to find the mean height
    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    // Method to find the shortest height
    public static int shortest(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Method to find the tallest height
    public static int tallest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
