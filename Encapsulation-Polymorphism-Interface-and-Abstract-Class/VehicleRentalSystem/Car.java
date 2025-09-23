package VehicleRentalSystem;

public class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    private static final double INSURANCE_RATE = 50.0;

    public Car(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy Number: " + insurancePolicyNumber;
    }
}
