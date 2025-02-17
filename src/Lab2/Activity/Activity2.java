package OOP_CUI_Class_Work.src.Lab2.Activity;
class Rectangle1 {
    public int length, width;
    public Rectangle1() {
        length = 5;
        width = 2;
    }
    public Rectangle1(int l, int w) {
        length = l;
        width = w;
    }
    public int Calculatearea() {
        return (length * width);
    }
}
public class Activity2 {
    public static void main(String[] args) {
        Rectangle1 rect = new Rectangle1();
        System.out.println(rect.Calculatearea());
        Rectangle1 rect1 = new Rectangle1(10, 20);
        System.out.println(rect1.Calculatearea());
    }
}
