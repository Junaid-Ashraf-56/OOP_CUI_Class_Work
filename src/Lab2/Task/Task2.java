package OOP_CUI_Class_Work.src.Lab2.Task;

import java.util.Scanner;

class Acconut{
    public int  balance;

    public void Withdraw(){
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter Withdraw amount");
        int withdraw = abc.nextInt();
        System.out.println("Withdraw amount "+withdraw);
    }
    public void Deposit(int x){
        Scanner abc = new Scanner(System.in);
        balance = x;
        System.out.println("Enter Deposit amount");
        int deposit = abc.nextInt();
        int amount = x+deposit;
        System.out.println("The amount of deposit "+ amount);

    }
    public void display(){
        Withdraw();
        Deposit(50000);
    }
}
class Task2{
    public static void main(String[] args) {
        Acconut c1 = new Acconut();
        c1.display();
    }
}