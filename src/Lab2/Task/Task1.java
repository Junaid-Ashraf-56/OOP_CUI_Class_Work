package OOP_CUI_Class_Work.src.Lab2.Task;
class Circle{
 public double radius;

 public Circle(){
     radius = 10;
 }
 public Circle(int x ){
         radius =x;
 }
 public void display(){
     System.out.println("The Circumference are "+(3.14)*(radius));
 }
}
class Task1{
    public static void main(String[] args) {
         Circle c1 = new Circle();
          c1.display();
         Circle c2 = new Circle(5);
         c2.display();

    }
}