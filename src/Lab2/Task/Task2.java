package OOP_CUI_Class_Work.src.Lab2.Task;

import java.util.Scanner;

class Acconut{
    public int  balance;

    public void Withdraw(){
        Scanner abc = new Scanner(System.in);
        int withdraw = abc.nextInt();
        System.out.println("Withdraw amount "+withdraw);
    }
    public void Deposit(int balance){
        Scanner abc = new Scanner(System.in);
        int deposit = abc.nextInt();
        int amount = balance+deposit;
        System.out.println("The amount of deposit"+ amount);

    }
}
class Task2{
    public static void main(String[] args) {
        Acconut c1 = new Acconut();
        c1.Withdraw();
         c1.Deposit(50000);
    }
}