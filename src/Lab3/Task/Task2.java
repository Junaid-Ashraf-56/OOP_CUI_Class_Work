package OOP_CUI_Class_Work.src.Lab3.Task;

import java.util.Scanner;

class Account{
    private int balance;
    private final int totalbalance = 50000;
    public Account(){
        balance = 404;
    }
    public void setBalance(int a){
        balance = a;
    }
    public void getBalance(Scanner abc){
        int balance = abc.nextInt();
        setBalance(balance);
    }
    public int Withdraw(){
            return totalbalance-balance;
    }
    public int Deposit(){
        return totalbalance+balance;
    }
    public void display(){
        System.out.println(Deposit()+" "+Withdraw());
    }
}
class Task2{
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        Account a1 = new Account();
        a1.getBalance(abc);
        a1.Deposit();
        a1.Withdraw();
        a1.display();
        Account a2 = new Account();
        a2.getBalance(abc);
        a2.Deposit();
        a2.Withdraw();
        a2.display();
    }
}