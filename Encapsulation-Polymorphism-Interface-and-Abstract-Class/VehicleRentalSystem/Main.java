package VehicleRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        Car car = new Car("CAR123", "Car", 100, "INS123");
        Bike bike = new Bike("BIKE456", "Bike", 50, "INS456");
        Truck truck = new Truck("TRUCK789", "Truck", 200, "INS789");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Type: " + vehicle.getType());
            System.out.println("Rental Cost for 5 days: " + vehicle.calculateRentalCost(5));

            if (vehicle instanceof Insurable) {
                Insurable insurableVehicle = (Insurable) vehicle;
                System.out.println(insurableVehicle.getInsuranceDetails());
                System.out.println("Insurance Cost: " + insurableVehicle.calculateInsurance());
            }
            System.out.println("-------------------------");
        }
    }
}
