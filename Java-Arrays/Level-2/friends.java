import java.util.Scanner;

public class friends {
    public static void main(String[] args) {
        // Define arrays for names, ages, heights
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Scanner for input
        Scanner sc = new Scanner(System.in);

        // Input loop
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height for " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        // Find youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("Youngest friend: " + names[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("Tallest friend: " + names[tallestIndex] + " with height " + heights[tallestIndex]);

        sc.close();
    }
}
