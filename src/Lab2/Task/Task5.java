package OOP_CUI_Class_Work.src.Lab2.Task;
class Time {
    public int Hours;
    public int Minutes;
    public int Seconds;

    public void Argument1(){

        System.out.println("Hours , Minutes and Seconds  are");
    }
    public void Argument2(int Hours,int Minutes,int Seconds)
    {
        if (Hours>=0&&Hours<=24&&Minutes>=0&&Minutes<=60&&Seconds>=0&&Seconds<=60){
            System.out.println("Valid Time");
        }
        else {
            System.out.println("Invalid Time");
        }

    }
    public void display(){
        Argument1();
        Argument2(5,54,56);
    }
}
class Task5{
    public static void main(String[] args) {
        Time c1 = new Time();
        c1.display();

    }
}