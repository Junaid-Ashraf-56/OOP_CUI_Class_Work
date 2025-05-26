package OOP_CUI_Class_Work.src.Lab11.Task;

import java.io.*;
import java.util.*;

public class Task4 {
    static final String FILE_NAME = "accounts.dat";

    public static void writeInitialAccounts() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            for (int i = 1; i <= 10; i++) {
                oos.writeObject(new Account(1000 + i, "User" + i, 1000.0 * i));
            }
            System.out.println("10 Accounts created and saved.");
        } catch (IOException e) {
            System.out.println("Error writing accounts: " + e.getMessage());
        }
    }

    public static List<Account> readAccounts() {
        List<Account> list = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            while (true) {
                list.add((Account) ois.readObject());
            }
        } catch (EOFException e) {

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading accounts: " + e.getMessage());
        }
        return list;
    }

    public static void saveAccounts(List<Account> list) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            for (Account a : list) {
                oos.writeObject(a);
            }
        } catch (IOException e) {
            System.out.println("Error saving accounts: " + e.getMessage());
        }
    }

    public static Account findAccount(List<Account> list, int accNo) {
        for (Account a : list) {
            if (a.getAccountNumber() == accNo) return a;
        }
        return null;
    }

    public static void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        List<Account> accounts = readAccounts();
        Account acc = findAccount(accounts, accNo);
        if (acc != null) {
            acc.deposit(amount);
            saveAccounts(accounts);
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Account not found.");
        }
    }

    public static void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        List<Account> accounts = readAccounts();
        Account acc = findAccount(accounts, accNo);
        if (acc != null) {
            if (acc.withdraw(amount)) {
                saveAccounts(accounts);
                System.out.println("Withdrawal successful!");
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    public static void transfer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sender account number: ");
        int senderNo = sc.nextInt();
        System.out.print("Enter receiver account number: ");
        int receiverNo = sc.nextInt();
        System.out.print("Enter amount to transfer: ");
        double amount = sc.nextDouble();

        List<Account> accounts = readAccounts();
        Account sender = findAccount(accounts, senderNo);
        Account receiver = findAccount(accounts, receiverNo);

        if (sender != null && receiver != null) {
            if (sender.withdraw(amount)) {
                receiver.deposit(amount);
                saveAccounts(accounts);
                System.out.println("Transfer successful!");
            } else {
                System.out.println("Sender has insufficient balance.");
            }
        } else {
            System.out.println("Invalid account(s).");
        }
    }

    public static void balanceInquiry() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();

        List<Account> accounts = readAccounts();
        Account acc = findAccount(accounts, accNo);
        if (acc != null) {
            System.out.println("Current Balance: " + acc.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        writeInitialAccounts(); // Only run this once or comment it after initial creation

        while (true) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Balance Inquiry");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> deposit();
                case 2 -> withdraw();
                case 3 -> transfer();
                case 4 -> balanceInquiry();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}

