package OOP_CUI_Class_Work.src.Class_Assignment;

import java.util.Scanner;

class BankAccount{
    private String AccountHolder;
    private String AccountNumber;
    private int Balance;

    BankAccount(){
        this.AccountHolder = "404";
        this.AccountNumber = "404";
        this.Balance = 404;
    }
    BankAccount(String Accountholder,String AccountNumber,int Balance){
        this.AccountHolder = Accountholder;
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }
    public void setInfo(String Accountholder,String AccountNumber,int Balance){
        this.AccountHolder = Accountholder;
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }
    public String getAccountHolder(){
        return AccountHolder;
    }
    public String getAccountNumber(){
        return AccountNumber;
    }
    public int getBalance(){
        return Balance;
    }

    public void deposit(int balance){
        if (balance>0){
            Balance += balance;
        }
        else {
            System.out.println("Invalid entry");
        }
    }
    public void withdraw(int balance){
        if (balance<Balance&&balance>0){
             Balance -= balance;
        }
        else {
            System.out.println("Invalid Entry");
        }
    }


    public boolean CompareAccount(BankAccount a2){
        return    this.AccountHolder.equalsIgnoreCase(a2.getAccountHolder());
    }
    public static void CompareBalance(BankAccount a1 ,BankAccount a2){
           if (a1.Balance>a2.getBalance()){
               System.out.println("Account 1 has more balance "+a1.AccountHolder);
           }
           else if (a1.Balance<a2.getBalance()){
               System.out.println("Account 2 has more balance "+a2.AccountHolder);
           }
           else {
               System.out.println("Same Balance");
           }
    }

    public void display(){
        System.out.println("Account Number " + getAccountNumber() + "\nAccount Holder "+getAccountHolder()+"\n Balance "+ getBalance());
    }
}
public class Question1 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);

        System.out.println("Enter for user 1");
        String AccountHolder1 = abc.nextLine();
        String AccountNumber1 = abc.nextLine();
        int Balance1 = abc.nextInt();
        BankAccount a1 = new BankAccount(AccountHolder1,AccountNumber1,Balance1);
        System.out.println("Enter deposit amount");
        int deposit = abc.nextInt();
        a1.deposit(deposit);
        System.out.println("Enter withdraw amount");
        int withdraw1 = abc.nextInt();
        a1.withdraw(withdraw1);

        System.out.println("Enter for user 2");
        String AccountHolder2 = abc.nextLine();
        String AccountNumber2 = abc.nextLine();
        abc.nextLine();
        int Balance2 = abc.nextInt();
        BankAccount a2 = new BankAccount();
        a2.setInfo(AccountHolder2,AccountNumber2,Balance2);
        System.out.println("Enter withdraw amount");
        int withdraw2 = abc.nextInt();
        a2.withdraw(withdraw2);
        System.out.println("Enter deposit amount");
        int deposit2 = abc.nextInt();
        a2.deposit(deposit2);

        boolean SameHolder = a1.CompareAccount(a2);
        if (!SameHolder){
            System.out.println("Different Account Holder");
        }
        else {
            System.out.println("Same Account Holder");
        }

        BankAccount.CompareBalance(a1,a2);
        a1.display();
        a2.display();

    }
}
