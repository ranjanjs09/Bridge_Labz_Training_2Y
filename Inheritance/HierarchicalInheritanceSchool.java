/**
 * HierarchicalInheritanceSchool.java
 * Demonstrates hierarchical inheritance with Person superclass and Teacher, Student, Staff subclasses.
 */

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayRole() {
        System.out.println("Generic Person");
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println("Teacher");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        System.out.println("Student");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayRole() {
        System.out.println("Staff");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

public class HierarchicalInheritanceSchool {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Smith", 40, "Mathematics");
        Student student = new Student("Jane Doe", 16, "10th Grade");
        Staff staff = new Staff("John Brown", 35, "Administration");

        teacher.displayRole();
        teacher.displayDetails();
        System.out.println();

        student.displayRole();
        student.displayDetails();
        System.out.println();

        staff.displayRole();
        staff.displayDetails();
    }
}
