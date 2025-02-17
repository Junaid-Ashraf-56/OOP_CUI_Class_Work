package OOP_CUI_Class_Work.src.Lab1.Task_SetGet;
// Student class
class Student1 {
    private String name;
    private int id;
    private String department;
    private double cgpa;

    // Constructor
    public Student1(String name, int id, String department, double cgpa) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.cgpa = cgpa;
    }

    // Student behaviors (methods)
    public void study() {
        System.out.println(name + " is studying.");
    }

    public void attendClass() {
        System.out.println(name + " is attending class.");
    }

    public void takeExam() {
        System.out.println(name + " is taking an exam.");
    }

    public void displayInfo() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", Department: " + department + ", CGPA: " + cgpa);
    }

}
public class Task1_1SG {
    public static void main(String[] args) {
        // Creating Student objects
        Student1 student1 = new Student1("Ali", 101, "Computer Science", 3.8);
        Student1 student2 = new Student1("Ayesha", 102, "Software Engineering", 3.6);

        // Displaying student information
        student1.displayInfo();
        student2.displayInfo();

        // Calling student behaviors (methods)
        student1.study();
        student1.attendClass();
        student1.takeExam();
    }
}