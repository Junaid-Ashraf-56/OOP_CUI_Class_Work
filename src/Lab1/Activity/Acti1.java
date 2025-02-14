package OOP_CUI_Class_Work.src.Lab1.Activity;

class  Student1{
    public String studentname;
    public String coursename;
    public String grade;
    public void display(){
        System.out.println( " Student name "+ studentname+" Course name "+coursename+" Grade "+grade);
    }
}

public class Acti1 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.studentname = "Junaid";
        s1.coursename = "SE";
        s1.grade = "A";
        s1.display();
        Student1 s2 = new Student1();
        s2.studentname ="Manan";
        s2.coursename = "SE";
        s2.grade ="A";
        s2.display();

    }
}
