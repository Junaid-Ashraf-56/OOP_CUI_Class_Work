package OOP_CUI_Class_Work.src.Lab1.Task;
class Time{
    public int hours;
    public int minutes;
    public int seconds;
    public int format;
    public void display(){
        System.out.println(hours+" "+minutes+" "+seconds+" "+format);
    }
}
class Task2{
    public static void main(String[] args) {
           Time S1 = new Time();
           S1.hours = 5;
           S1.minutes = 56;
           S1.seconds = 45;
           S1.format = 12;
           S1.display();
    }
}