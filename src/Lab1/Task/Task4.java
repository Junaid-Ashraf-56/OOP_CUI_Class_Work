package OOP_CUI_Class_Work.src.Lab1.Task;
class Rectangle{
    public int length;
    public int width;
    public int angles;
    public void display(){
        System.out.println(length+" "+width+" "+angles);
    }
}
class Task4{
    public static void main(String[] args) {
         Rectangle R1 = new Rectangle();
         R1.length = 56;
         R1.width = 45;
         R1.angles = 145;
         R1.display();
    }
}