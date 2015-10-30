package com.example.suhaas.mybank;

/**
 * Created by ravindrakumar on 30/10/15.
 */
public class BankAccount {
    private double balance;
    public void withdraw(double amount){
        balance-=amount;

    }

    public void deposit(double amount){
        balance+=amount;

    }

    public double getBalance(){
        return balance;
    }
}
