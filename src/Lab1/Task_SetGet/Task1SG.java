package OOP_CUI_Class_Work.src.Lab1.Task_SetGet;

import java.util.Scanner;

class Student {
    private int StudentId;
    private String StudentName;
    private String Program;
    private double GPA; // Changed from int to double

    public void setInfo(int id, String name, String program, double gpa) {
        StudentId = id;
        StudentName = name;
        Program = program;
        GPA = gpa;
    }

    public int getStudentId() {
        return StudentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public String getProgram() {
        return Program;
    }

    public double getGPA() {
        return GPA;
    }

    public void getInfo(Scanner scanner) {
        System.out.println("Enter Student ID:");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Student Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Program:");
        String program = scanner.nextLine();

        System.out.println("Enter GPA:");
        double gpa = scanner.nextDouble();

        setInfo(id, name, program, gpa);
    }

    public void display() {
        System.out.println(getStudentId() + " " + getStudentName() + " " + getProgram() + " " + getGPA());
    }
}

public class Task1SG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        student.getInfo(scanner);
        student.display();

        scanner.close();
    }
}
