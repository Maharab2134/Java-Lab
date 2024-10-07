// Create a Bank class and add attributes to the class. Make sure to have getter and setter functions for every variable. Then, create an object of the Bank class and call any function.

import java.util.Scanner;

public class Bank {
    private String name;
    private int accountNumber;
    private double balance;

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        bank.setName(sc.nextLine());
        System.out.println("Enter the account number: ");
        bank.setAccountNumber(sc.nextInt());
        System.out.println("Enter the balance: ");
        bank.setBalance(sc.nextDouble());
        System.out.println("Name: " + bank.getName());
        System.out.println("Account Number: " + bank.getAccountNumber());
        System.out.println("Balance: " + bank.getBalance());

        sc.close();
    }
}
