package OOP_CUI_Class_Work.src.Lab2.Task;

import java.util.Scanner;

class Account{
    public int  balance;

    public  Account(){
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter Withdraw amount");
        int withdraw = abc.nextInt();
        System.out.println("Withdraw amount "+withdraw);
    }
    public  Account(int x){
        Scanner abc = new Scanner(System.in);
        balance = x;
        System.out.println("Enter Deposit amount");
        int deposit = abc.nextInt();
        int amount = x+deposit;
        System.out.println("The amount of deposit "+ amount);

    }

}
class Task2{
    public static void main(String[] args) {
        new Account();
        new Account(50000);
    }
}