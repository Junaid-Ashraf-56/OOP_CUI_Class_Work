package OOP_CUI_Class_Work.src.Lab1.Task_SetGet;

class Time {
    public int hours;
    public int minutes;
    public int seconds;
    public int format;

    public Time(int hours,int minutes,int seconds,int format){
         this.hours = hours;
         this.minutes = minutes;
         this.seconds = seconds;
        this.format = format;
    }


    public void display() {
        System.out.println(hours+" "+minutes+" "+seconds+" "+format);
    }
}

public class Task2SG {
    public static void main(String[] args) {
        Time s1 = new Time(5,56,56,12);
        s1.display();
    }
}
