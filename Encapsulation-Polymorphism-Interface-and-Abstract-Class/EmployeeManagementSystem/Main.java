package EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee fte = new FullTimeEmployee(1, "Alice", 0, 5000);
        PartTimeEmployee pte = new PartTimeEmployee(2, "Bob", 0, 80, 20);

        employees.add(fte);
        employees.add(pte);

        EmployeeDepartment dept = new EmployeeDepartment();
        dept.assignDepartment("IT");

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println(dept.getDepartmentDetails());
            System.out.println("-------------------------");
        }
    }
}
