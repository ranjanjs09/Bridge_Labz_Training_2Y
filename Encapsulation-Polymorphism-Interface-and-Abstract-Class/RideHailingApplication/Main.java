package RideHailingApplication;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        Car car = new Car("V001", "John", 15.0);
        Bike bike = new Bike("V002", "Mike", 10.0);
        Auto auto = new Auto("V003", "Raj", 8.0);

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();
            System.out.println("Fare for 10 km: " + vehicle.calculateFare(10));

            if (vehicle instanceof GPS) {
                GPS gpsVehicle = (GPS) vehicle;
                gpsVehicle.updateLocation("Downtown");
                gpsVehicle.getCurrentLocation();
            }
            System.out.println("-------------------------");
        }
    }
}
