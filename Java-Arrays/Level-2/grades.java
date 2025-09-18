import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; // 0: physics, 1: chemistry, 2: maths
        double[] percentages = new double[n];
        char[] grades = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                int mark;
                do {
                    if (j == 0) System.out.print("Physics: ");
                    else if (j == 1) System.out.print("Chemistry: ");
                    else System.out.print("Maths: ");
                    mark = sc.nextInt();
                    if (mark < 0) {
                        System.out.println("Marks must be positive. Please enter again.");
                    }
                } while (mark < 0);
                marks[i][j] = mark;
            }
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (total / 300.0) * 100;

            double p = percentages[i];
            if (p >= 80) grades[i] = 'A';
            else if (p >= 70) grades[i] = 'B';
            else if (p >= 60) grades[i] = 'C';
            else if (p >= 50) grades[i] = 'D';
            else if (p >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }

        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": Physics=" + marks[i][0] + ", Chemistry=" + marks[i][1] + ", Maths=" + marks[i][2] +
                ", Percentage=" + String.format("%.2f", percentages[i]) + "%, Grade=" + grades[i]);
        }

        sc.close();
    }
}
