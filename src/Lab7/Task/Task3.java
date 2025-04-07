package OOP_CUI_Class_Work.src.Lab7.Task;
abstract class Shape{
    int numberoflines;
    String pencolor;
    String fillcolor;
    Shape(int numberoflines,String pencolor,String fillcolor){
        this.numberoflines = numberoflines;
        this.pencolor = pencolor;
        this.fillcolor = fillcolor;
    }
    abstract void draw();

}
class Circle extends Shape{
    Circle(String pencolor,String fillcolor){
        super(0,pencolor,fillcolor);
    }

    @Override
    void draw() {
        System.out.println("Lines of circle "+numberoflines);
        System.out.println("Pen color for circle "+pencolor);
        System.out.println(" Fill color for circle "+fillcolor);
    }
}
class Triangle extends Shape{
    Triangle(String pencolor,String fillcolor){
        super(3,pencolor,fillcolor);
    }
    @Override
    void draw() {
        System.out.println("Lines of circle "+numberoflines);
        System.out.println("Pen color for circle "+pencolor);
        System.out.println(" Fill color for circle "+fillcolor);
    }
}
class Rectangle extends Shape {
    Rectangle (String pencolor,String fillcolor){
        super(4,pencolor,fillcolor);
    }
    @Override
    void draw() {
        System.out.println("Lines of circle "+numberoflines);
        System.out.println("Pen color for circle "+pencolor);
        System.out.println(" Fill color for circle "+fillcolor);
    }
}
public class Task3 {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", "Blue");
        Shape square = new Rectangle("Black", "Yellow");
        Shape triangle = new Triangle("Green", "White");

        // Displaying properties and drawing shapes
        circle.draw();
        System.out.println(); // Separator

        square.draw();
        System.out.println(); // Separator

        triangle.draw();
    }

}
