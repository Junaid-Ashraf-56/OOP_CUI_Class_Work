package OOP_CUI_Class_Work.src.Lab2.Task;
class Time {
    public int Hours;
    public int Minutes;
    public int Seconds;

    public Time(){

        System.out.println("Hours , Minutes and Seconds  are");
        Hours = 6;
        Minutes = 51;
        Seconds = 46;
    }
    public Time(int x,int y,int z)
    {
        Hours = x;
        Minutes = y;
        Seconds = z;

        if (Hours>=0&&Hours<=24&&Minutes>=0&&Minutes<=60&&Seconds>=0&&Seconds<=60){
            System.out.println("Valid Time");
        }
        else {
            System.out.println("Invalid Time");
        }

    }
    public void display() {
        System.out.printf("Time: %02d:%02d:%02d\n", Hours, Minutes, Seconds);
    }
}
class Task5{
    public static void main(String[] args) {
        Time c1 = new Time();
        c1.display();
        Time c2 = new Time(5,56,50);
        c2.display();

    }
}