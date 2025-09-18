public class VolumeOfEarth {
    public static void main(String[] args) {
        // Define the radius of Earth in kilometers
        double radiusKm = 6378;
        
        // Calculate volume in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        
        // Convert volume to cubic miles (1 km = 0.621371 miles)
        double radiusMiles = radiusKm * 0.621371;
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
        
        // Display the results
        System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f\n",
                          volumeKm3, volumeMiles3);
    }
}
