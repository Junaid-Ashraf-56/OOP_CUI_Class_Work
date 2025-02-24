package OOP_CUI_Class_Work.src.Lab3.Activity;
class Circle{
    private int radius;
    public Circle(){
        radius = 7;
    }

    public  Circle(int r){
        radius = r;
    }
    public  void setRadius(int r){
        radius =r;
    }
    public int getRadius(int radius){
        return radius;
    }
    public  void display(){
        System.out.println(radius);
    }
    public double CalculateCircumference(){
        return radius*radius*3.14;
    }
}
public class Activity1 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(5);
        System.out.println("Circumference of Circle 1 is: " + c1.CalculateCircumference());
        int r = c1.getRadius(10);
        Circle c2 = new Circle(r);
        c2.setRadius(r);
        System.out.println("Circumference of Circle 2 is: " + c2.CalculateCircumference());
    }
}