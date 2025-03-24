package OOP_CUI_Class_Work.src.Lab7.Task;

class Simple{
    int num1;
    int num2 ;

    Simple(int num1 , int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    void add(){
        System.out.println("Addition "+(num1+num2));
    }
    void sub(){
        System.out.println("Subtraction "+(num1-num2));
    }
    void mul(){
        System.out.println("Multiplication "+(num1*num2));
    }
    void div() {
    if (num2 != 0){
            System.out.println("Division " + (num1 / num2));
        }
    else {
        System.out.println("Num 2 can not be zero");
    }
    }
}
class VerifiedSimple extends Simple{
    VerifiedSimple(int num1 , int num2 ){
        super(num1,num2);
    }

    @Override
    void add() {
        if (num1>0&&num2>0){super.add();}
       else {System.out.println("Error: Numbers must be greater than 0");}
    }
    @Override
    void sub() {if (num1>0&&num2>0){super.sub();}
    else {System.out.println("Error: Numbers must be greater than 0");}
    }
    @Override
    void mul() {if (num1>0&&num2>0){super.mul();}
    else {System.out.println("Error: Numbers must be greater than 0");}
    }
    @Override void div() {if (num1>0&&num2>0){super.div();}
    else {System.out.println("Error: Numbers must be greater than 0");}
    }
}
public class Task2 {
    public static void main(String[] args) {
        VerifiedSimple s1 = new VerifiedSimple(5,5);
        s1.add();
        s1.sub();
        s1.mul();
        s1.div();

        VerifiedSimple s2 = new VerifiedSimple(5,0);
        s2.add();
        s2.sub();
        s2.mul();
        s2.div();
    }
}
