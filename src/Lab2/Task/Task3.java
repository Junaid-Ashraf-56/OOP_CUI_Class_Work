package OOP_CUI_Class_Work.src.Lab2.Task;
class Distance{
    public int feet;
    public int inches;

    public  Distance(){
        System.out.println("Feet and Inches ");
    }
    public Distance(int x,int y){
        feet = x;
        inches = y;
        System.out.println(x+ " " + y);
    }
}
class Task3{
    public static void main(String[] args) {
       new Distance();
       new Distance(56,5);


    }
}