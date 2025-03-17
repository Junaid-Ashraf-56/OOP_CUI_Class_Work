package OOP_CUI_Class_Work.src.Lab6.Task;

class Computer{
    protected int wordsize;
    protected int memorysize;
    protected int storagesize;
    protected int speed;

    public Computer(){
        this.wordsize = 404;
        this.memorysize = 404;
        this.storagesize = 404;
        this.speed = 404;
    }

    public Computer(int wordsize ,int memorysize,int storagesize,int speed){
        this.wordsize = wordsize;
        this.memorysize = memorysize;
        this.storagesize = storagesize;
        this.speed = speed;
    }
@Override
    public String toString(){
        return "Word Size "+wordsize+" Memory Size " + memorysize + " Storage Size "+storagesize + " Speed "+speed;
    }
}
class Laptop extends Computer{
    protected int length;
    protected int width;
    protected int height;
    protected int weight;

    public Laptop(){
        this.length = 404;
        this.width = 404;
        this.height = 404;
        this.weight = 404;
    }
    public Laptop(int a , int b,int c ,int d,int wordsize,int memorysize,int storagesize,int speed){
        super(wordsize,memorysize,storagesize,speed);
        this.length = a;
        this.width = b;
        this.height = c;
        this.weight = d;
    }

    @Override
    public String toString(){
        return super.toString() + "Length "+length+" Width "+ width + " Height "+ height + " Weight "+ weight;
    }
}
public class Task3 {
    public static void main(String[] args) {
        Computer c1 = new Computer(1,2,3,4);
        Laptop a1 = new Laptop(1,2,3,4,5,6,7,8);

        System.out.println("For Computer \n"+c1);
        System.out.println("For Laptop \n"+a1);

    }
}
