package OOP_CUI_Class_Work.src.Lab2.Task;
class Circle{
 public double radius;

 public void Argument1(){
     System.out.println("Radius is ");
 }
 public double Argument2(double radius){
   return  (3.14)*(radius);
 }
}
class Task1{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.Argument1();
        double Result = c1.Argument2(5);
        System.out.println(Result);

    }
}