package OOP_CUI_Class_Work.src.Lab2.Task;
class Circle{
 public double radius;

 public void Argument1(){
     radius = 5;
 }
 public void Argument2(int x ){
         radius =x;
 }
 public void display(){
     System.out.println("The Circumference are "+(3.14)*(radius));
 }
}
class Task1{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.Argument1();
        c1.display();
         c1.Argument2(5);
        c1.display();

    }
}