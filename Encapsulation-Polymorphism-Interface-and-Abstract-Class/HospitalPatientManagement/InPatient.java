package HospitalPatientManagement;

public class InPatient extends Patient {
    private double dailyRate;
    private int numberOfDays;

    public InPatient(int patientId, String name, int age, double dailyRate, int numberOfDays) {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.numberOfDays = numberOfDays;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    @Override
    public double calculateBill() {
        return dailyRate * numberOfDays;
    }
}
