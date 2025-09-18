import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input distance in feet from user
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();
        
        // Convert to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3.0;
        
        // Convert to miles (1 mile = 1760 yards = 5280 feet)
        double distanceInMiles = distanceInFeet / 5280.0;
        
        // Print results in the required format
        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);
        
        scanner.close();
    }
}
