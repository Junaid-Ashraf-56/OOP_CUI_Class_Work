package OOP_CUI_Class_Work.src.Lab2.Activity;
class Rectangle {
    public int length, width;
    public int Calculatearea() {
        return (length * width);
    }
}
public class Activi1 {
    public static void main(String[] args) {
        Rectangle1 rect = new Rectangle1();
        rect.length = 10;
        rect.width = 5;
        System.out.println(rect.Calculatearea());
    }
}