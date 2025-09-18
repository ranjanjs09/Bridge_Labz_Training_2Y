import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        double[] heights = new double[11];
        Scanner scanner = new Scanner(System.in);

        // Take user input for heights
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Calculate sum
        double sum = 0.0;
        for (double height : heights) {
            sum += height;
        }

        // Calculate mean
        double mean = sum / 11;
        System.out.println("Mean height of the football team: " + mean);

        scanner.close();
    }
}
