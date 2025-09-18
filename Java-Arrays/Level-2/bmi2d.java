import java.util.Scanner;

public class bmi2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3]; // 0: weight, 1: height, 2: BMI
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            double weight;
            do {
                System.out.print("Enter positive weight for person " + (i + 1) + " (kg): ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be positive. Please enter again.");
                }
            } while (weight <= 0);
            personData[i][0] = weight;

            double height;
            do {
                System.out.print("Enter positive height for person " + (i + 1) + " (m): ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be positive. Please enter again.");
                }
            } while (height <= 0);
            personData[i][1] = height;

            // Calculate BMI
            personData[i][2] = weight / (height * height);

            // Determine weight status
            double bmi = personData[i][2];
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nBMI Results:");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ": Weight=" + personData[i][0] + " kg, Height=" + personData[i][1] + " m, BMI=" + String.format("%.2f", personData[i][2]) + ", Status=" + weightStatus[i]);
        }

        sc.close();
    }
}
