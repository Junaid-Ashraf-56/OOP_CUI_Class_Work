package OOP_CUI_Class_Work.src.Lab3.Activity;
class Rectangle {
    private int length, width;
    public Rectangle() {
        length = 5;
        width = 2;
    }
    public Rectangle(int l, int w) {
        length = l;
        width = w;
    }
    public void setLength(int l)
    {
        length = l;
    }
    public void setWidth(int w)
    {
        width = w;
    }
    public int getLength()
    {
        return length;
    }
    public int getWidth()
    {
        return width;
    }
    public int area() {
        return (length * width);
    }
}
public class Activity2 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setLength(5);
        rect.setWidth(10);
        System.out.println("Area of Rectangle is: " + rect.area());
        System.out.println("Width of Rectangle is: " + rect.getWidth());
        System.out.println("Length of Rectangle is: " + rect.getLength());

        Rectangle rect1 = new Rectangle(5,11);
        System.out.println("Area of Rectangle is: " + rect1.area());
        System.out.println("Width of Rectangle is: " + rect1.getWidth());
        System.out.println("Length of Rectangle is: " + rect1.getLength());

    }
}