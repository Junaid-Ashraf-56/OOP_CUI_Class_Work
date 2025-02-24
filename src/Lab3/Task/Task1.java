package OOP_CUI_Class_Work.src.Lab3.Task;

import java.util.Scanner;

class Marks{
    private int Math;
    private int OOP;
    private int Physics;

    public Marks(){
        Math = 404;
        OOP = 404;
        Physics = 404;
    }
    public void setMarks(int a,int y,int z){
        Math = a;
        OOP = y;
        Physics = z;
    }
    public int getMath(){
        return Math;
    }
    public int getOOP(){
        return OOP;
    }
    public int getPhysics(){
        return Physics;
    }
    public void getMarks(Scanner abc){
        int math = abc.nextInt();
        int oop = abc.nextInt();
        int physics = abc.nextInt();
        setMarks(math,oop,physics);
    }
    public void display(){
        System.out.println(getMath()+" "+getOOP()+" "+getPhysics());
    }
}
public class Task1{
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        Marks m1 = new Marks();
        m1.getMarks(abc);
        m1.display();

    }
}
