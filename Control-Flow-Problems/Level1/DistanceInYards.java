import java.util.Scanner;

public class DistanceInYards {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user for distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();
        
        // Convert feet to yards (1 yard = 3 feet)
        double yards = distanceInFeet / 3;
        
        // Convert feet to miles (1 mile = 1760 yards = 5280 feet)
        double miles = distanceInFeet / 5280;
        
        // Display the results
        System.out.printf("The distance in yards is %.2f and in miles is %.2f for the given %.2f feet\n",
                          yards, miles, distanceInFeet);
        
        // Close the scanner
        input.close();
    }
}
