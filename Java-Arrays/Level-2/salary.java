import java.util.Scanner;
import java.util.InputMismatchException;

public class salary {
    public static void main(String[] args) {
        // Define arrays
        double[] salaries = new double[10];
        double[] years = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        // Variables for totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Scanner for input
        Scanner sc = new Scanner(System.in);

        // Input loop with validation
        for (int i = 0; i < 10; i++) {
            try {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                salaries[i] = sc.nextDouble();
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                years[i] = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numbers only.");
                sc.nextLine(); // Clear the invalid input
                i--; // Decrement to retry
            }
        }

        // Calculation loop
        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonuses[i] = salaries[i] * 0.05;
            } else {
                bonuses[i] = salaries[i] * 0.02;
            }
            newSalaries[i] = salaries[i] + bonuses[i];
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Print results
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);

        sc.close();
    }
}
