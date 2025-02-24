package OOP_CUI_Class_Work.src.Lab3.Task;
import java.util.Scanner;

class Student {
    private String Name;
    private int[] Array;

    public Student() {
        Name = "Unknown";
        Array = new int[]{404, 404, 404, 404, 404};
    }

    public void setStudent(String a, int[] b) {
        Name = a;
        Array = b.clone();
    }

    public String getName() {
        return Name;
    }

    public int[] getArray() {
        return Array;
    }

    public void getStudent(Scanner abc) {
        System.out.print("Enter Name: ");
        String a = abc.nextLine();

        int[] b = new int[5];
        System.out.println("Enter 5 Marks: ");
        for (int i = 0; i < 5; i++) {
            b[i] = abc.nextInt();
        }
        abc.nextLine();

        setStudent(a, b);
    }

    public int Average() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += Array[i];
        }
        return sum / 5;
    }
}

class Task3 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        Student s1 = new Student();
        s1.getStudent(abc);

       Student s2 = new Student();
       s2.getStudent(abc);

       if (s1.Average()>s2.Average()){
           System.out.println("Student 1 has more number ");
       }
       else {
           System.out.println("Student 2 has has more number");
       }
        Student student3 = new Student();
        System.out.println("Student 3 created with name: " + student3.getName() + " and marks of " + s2.getArray());

        abc.close();
    }
}
