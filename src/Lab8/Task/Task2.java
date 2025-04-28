package OOP_CUI_Class_Work.src.Lab8.Task;

abstract class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    abstract boolean isOutstanding();
}
class Student extends Person{
    private double CGPA;

    public Student(String name, double CGPA) {
        super(name);
        this.CGPA = CGPA;
    }

    public double getCGPA() {return CGPA;}

    public void setCGPA(double CGPA) {this.CGPA = CGPA;}
    @Override
    public boolean isOutstanding(){
        return getCGPA()>3.5;
    }
}
class Professor extends Person{
    private int numberOfPublications;

    public Professor(String name, int numberOfPublications) {
        super(name);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {return numberOfPublications;}
    public void setNumberOfPublications(int numberOfPublications) {this.numberOfPublications = numberOfPublications;}
    @Override
    boolean isOutstanding() {
        return getNumberOfPublications()>50;
    }
}
public class Task2 {
    public static void main(String[] args) {
        Person p1 = new Student("Noman",3.4);
        Person p2 = new Professor("Abida ",60);
        Person[] p = new Person[2];
        p[0] = p1;
        p[1] = p2;

            if (p1 instanceof Student) {
                Student student = (Student)p1;
                System.out.println(student.isOutstanding());
            }
            else {
                System.out.println("Not instance");
            }
        if (p2 instanceof Professor) {
            Professor professor = (Professor) p2;
            System.out.println(professor.isOutstanding());
        }
        else {
            System.out.println("Not instance");
        }
    }
}
