package OOP_CUI_Class_Work.src.Lab2.Task;
class Marks{
    public int OOP;
    public int Math;
    public int Physics;

    public Marks(){

        System.out.println("Numbers of OOP , Math and Physics are");
    }
    public Marks(int x,int y,int z)
    {
        OOP = x;
        Math = y;
        Physics = z;
        System.out.println(x+" "+y+" "+z);

    }
}
class Task4{
    public static void main(String[] args) {
        new Marks();
        new Marks(85,86,89);
    }
}