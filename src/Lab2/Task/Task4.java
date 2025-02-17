package OOP_CUI_Class_Work.src.Lab2.Task;
class Marks{
    public int OOP;
    public int Math;
    public int Physics;

    public void Argument1(){

        System.out.println("Numbers of OOP , Math and Physics are");
    }
    public void Argument2(int x,int y,int z)
    {
        OOP = x;
        Math = y;
        Physics = z;
        System.out.println(x+" "+y+" "+z);

    }
    public void display(){
        Argument1();
        Argument2(89,90,81);
    }
}
class Task4{
    public static void main(String[] args) {
        Marks c1 = new Marks();
        c1.display();

    }
}