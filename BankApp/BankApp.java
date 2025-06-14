package com.souhard;
import java.util.Scanner;
class BankAccount{
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Deposited $" + amount +"." + " New balance: $" + this.balance);
    }
    public void withdraw(double amount){
        if (amount > this.balance){
            System.out.println("Insufficient Balance.");
        }
        else {
            this.balance -= amount;
            System.out.println("Withdrew $"+ amount+ "." + " New balance: $" + this.balance);
        }
    }
    public void checkBalance(){
        System.out.println("Current Balance: $" + this.balance);
    }
}

public class BankApp {
    public static void main(String[] args){
        BankAccount ba = new BankAccount("Souhard", "001122", 0);
        Scanner sc = new Scanner(System.in);
        System.out.println("     Welcome to SBI.  ");
        System.out.println("------------------------");
        while (true){
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. exit");
            System.out.print("What do you want to do ? ");
            String choice = sc.next();
            choice = choice.trim();
            choice = choice.toLowerCase();
            System.out.println();
            if (choice.equals("deposit") || choice.equals("1")){
                System.out.print("How much do you want to deposit? ");
                double amount = sc.nextDouble();
                ba.deposit(amount);
            }
            else if (choice.equals("withdraw") || choice.equals("2") ){
                System.out.print("How much do you want to withdraw? ");
                double amount = sc.nextDouble();
                ba.withdraw(amount);
            }
            else if (choice.equals("check balance") || choice.equals("3")){
                ba.checkBalance();
            }
            else if (choice.equals("exit") || choice.equals("4")) {
                System.out.println("Thank you for using us!!");
                break;
            }
            else{
                System.out.println("Invalid command.");
            }
        }
    }
}
