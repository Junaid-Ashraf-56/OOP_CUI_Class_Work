package OOP_CUI_Class_Work.src.Lab2.Task;
class Distance{
    public int feet;
    public int inches;

    public void Argument1(){
        System.out.println("Feet and Inches ");
    }
    public void Argument2(int x,int y){
        feet = x;
        inches = y;
        System.out.println(x+ " " + y);
    }
    public void display(){
        Argument1();
        Argument2(5,25);
    }
}
class Task3{
    public static void main(String[] args) {
        Distance c1 = new Distance();
        c1.display();

    }
}