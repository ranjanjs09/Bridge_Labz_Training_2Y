package HospitalPatientManagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        InPatient inPatient = new InPatient(1, "Alice", 30, 500, 5);
        OutPatient outPatient = new OutPatient(2, "Bob", 25, 200);

        patients.add(inPatient);
        patients.add(outPatient);

        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Bill Amount: " + patient.calculateBill());
            System.out.println("-------------------------");
        }
    }
}
