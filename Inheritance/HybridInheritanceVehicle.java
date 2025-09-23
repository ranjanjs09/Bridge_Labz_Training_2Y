/**
 * HybridInheritanceVehicle.java
 * Demonstrates hybrid inheritance using interfaces with Vehicle superclass,
 * Refuelable interface, ElectricVehicle and PetrolVehicle subclasses.
 */

interface Refuelable {
    void refuel();
}

class VehicleBase {
    protected int maxSpeed;
    protected String model;

    public VehicleBase(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends VehicleBase {
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge() {
        System.out.println(model + " is charging.");
    }
}

class PetrolVehicle extends VehicleBase implements Refuelable {
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling with petrol.");
    }
}

public class HybridInheritanceVehicle {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3");
        PetrolVehicle pv = new PetrolVehicle(180, "Ford Mustang");

        ev.displayInfo();
        ev.charge();
        System.out.println();

        pv.displayInfo();
        pv.refuel();
    }
}
