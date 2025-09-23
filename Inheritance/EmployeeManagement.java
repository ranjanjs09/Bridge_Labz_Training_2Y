/**
 * EmployeeManagement.java
 * Demonstrates inheritance with Employee superclass and Manager, Developer, Intern subclasses.
 */

class Employee {
    protected String name;
    protected int id;
    protected double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    private String school;

    public Intern(String name, int id, double salary, String school) {
        super(name, id, salary);
        this.school = school;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("School: " + school);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 90000, 10);
        Developer developer = new Developer("Bob", 102, 80000, "Java");
        Intern intern = new Intern("Charlie", 103, 30000, "State University");

        manager.displayDetails();
        System.out.println();
        developer.displayDetails();
        System.out.println();
        intern.displayDetails();
    }
}
