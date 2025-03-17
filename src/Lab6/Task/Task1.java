package OOP_CUI_Class_Work.src.Lab6.Task;


import java.time.LocalDate;

class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", Phone: " + phoneNumber + ", Email: " + email;
    }
}

class Student extends Person {
    private final String status;

    public Student(String name, String address, String phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() + ", Status: " + status;
    }
}

// Employee class extending Person
class Employee extends Person {
    private final String office;
    private final int salary;
    private final LocalDate dateHired;

    public Employee(String name, String address, String phoneNumber, String email, String office, int salary, LocalDate dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return super.toString() + ", Office: " + office + ", Salary: " + salary + ", Date Hired: " + dateHired;
    }
}

// Faculty class extending Employee
class Faculty extends Employee {
    private final int officeHours;
    private final int rank;

    public Faculty(String name, String address, String phoneNumber, String email, String office, int salary, LocalDate dateHired, int officeHours, int rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() + ", Office Hours: " + officeHours + ", Rank: " + rank;
    }
}

// Staff class extending Employee
class Staff extends Employee {
    private final String title;

    public Staff(String name, String address, String phoneNumber, String email, String office, int salary, LocalDate dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() + ", Title: " + title;
    }
}

// Main class
public class Task1 {
    public static void main(String[] args) {
        // Create objects
        Student s1 = new Student("Junaid", "Faisalabad", "0300", "junaidashraf.code@gmail.com", "Active");
        Faculty f1 = new Faculty("Ali", "Lahore", "0311", "ali.code@gmail.com", "CS Dept", 70000, LocalDate.of(2023, 5, 15), 8, 2);
        Staff s2 = new Staff("Sara", "Islamabad", "0322", "sara.code@gmail.com", "Admin", 60000, LocalDate.of(2022, 3, 10), "Manager");

        // Print details using toString()
        System.out.println(s1);
        System.out.println(f1);
        System.out.println(s2);
    }
}
