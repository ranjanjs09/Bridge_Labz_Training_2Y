public class ConvertKMToMiles {
    public static void main(String[] args) {
        // Distance in kilometers
        double kilometers = 10.8;
        
        // Conversion factor: 1 km = 1.6 miles
        double conversionFactor = 1.6;
        
        // Convert to miles
        double miles = kilometers * conversionFactor;
        
        // Display the result
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}
