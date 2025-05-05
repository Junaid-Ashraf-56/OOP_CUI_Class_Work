package OOP_CUI_Class_Work.src.Lab9.Task;

 interface Shape
{
    double getArea();
}
class Circle implements Shape{
     double r = 5;

     @Override
     public double getArea(){
         return (3.14159)*r*r;
     }
}
class Rectangle implements Shape{
     double length = 5;
     double width = 5;

     @Override
    public double getArea(){
         return length*width;
     }
}
public class Task1 {
    public static void main(String[] args) {
     Shape s1 = new Circle();
     Shape s2 = new Rectangle();

        System.out.printf("%.2f",s1.getArea());
        System.out.println();
        System.out.printf("%.2f",s2.getArea());
    }
}
