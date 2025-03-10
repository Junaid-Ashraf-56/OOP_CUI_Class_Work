package OOP_CUI_Class_Work.src.Lab5.Task;

class Point{
    private double x_cord ;
    private double y_cord;
    public Point(int a, int b){
        this.x_cord = a;
        this.y_cord = b;
    }
    public void setPoint(double x_cord,double y_cord){
        this.x_cord = x_cord;
        this.y_cord = y_cord;
    }
    public Double getX_cord(){
        return x_cord;
    }
    public Double getY_cord(){
        return y_cord;
    }
    public void display(){
        System.out.println(" Coordintes are \n"+" X cordinate "+getX_cord()+"\n"+" Y cordinate "+getY_cord());
    }
}
class Line{
 private final Point startPoint;
 private final Point endPoint;

 public Line(Point startPoint,Point endPoint){
     this.startPoint = startPoint;
     this.endPoint = endPoint;
 }
 public double Length(){
     double XDiff = endPoint.getX_cord() - startPoint.getX_cord();
     double YDiff = endPoint.getY_cord() - startPoint.getX_cord();
     return Math.sqrt(XDiff*XDiff + YDiff*YDiff);
 }
 public void display(){
     System.out.println("Start Point");
     startPoint.display();
     System.out.println("End Point");
     endPoint.display();
     System.out.println("Length is"+Length());
 }
}
public class Task3 {
    public static void main(String[] args) {
       Point p1 = new Point(10,11);
       Point p2 = new Point(11,10);
       Line l1 = new Line(p1,p2);

       Point p3 = new Point(12,13);
       Point p4 = new Point(13,12);
       Line l2 = new Line(p3,p4);

        System.out.println("Line 1");
        l1.display();

        System.out.println("Line 2");
        l2.display();
    }
}
