package OOP_CUI_Class_Work.src.Lab5.Activity;

import java.util.Scanner;

class studentRecord {
    private String degree;
    public studentRecord() {
    }
    public void setDegree(Scanner abc) {
        degree = abc.nextLine();
    }
    public String getDegree() {
        return degree;
    }
}
class employeeRecord {
    private int emp_id;
    private double salary;
    public employeeRecord() {
    }
    public void setEmp_id(Scanner abc) {
        emp_id = abc.nextInt();
    }
    public int getEmp_id() {
        return emp_id;
    }
    public void setSalary(Scanner abc) {
        salary = abc.nextInt();
    }
    public double getSalary() {
        return salary;
    }
}
class Manager {
    private final String title;
    private final double dues;
    private final employeeRecord emp;
    private final studentRecord stu;
    public Manager(Scanner abc, employeeRecord e,studentRecord s) {
        title = abc.nextLine();
        abc.nextLine();
        dues = abc.nextInt();
        emp = e;
        stu = s;
    }
    public void display() {
        System.out.println("Title is : " + title);
        System.out.println("Dues are : " + dues);
        System.out.println("Emplyoyee record is as under:");
        System.out.println("EmployeeId is : " + emp.getEmp_id());
        System.out.println("EmployeeId is : " + emp.getSalary());
        System.out.println("Student record is as under: ");
        System.out.println("Degree is : " +stu.getDegree());
    }
}
public class Activi1 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        studentRecord s = new studentRecord();
        s.setDegree( abc);
        employeeRecord e = new employeeRecord();
        e.setEmp_id(abc);
        e.setSalary(abc);
        Manager m1 = new Manager( abc, e, s);
        m1.display();
    }
}

