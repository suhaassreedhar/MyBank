package com.example.suhaas.mybank;

/**
 * Created by ravindrakumar on 30/10/15.
 */
public class BankAccount {
    private double mBalance;
    public static final double OVERDRAFT_FEE =30;

    public void withdraw(double amount){
        mBalance -=amount;

    }

    public void deposit(double amount){
        mBalance +=amount;

    }

    public double getBalance(){
        return mBalance;
    }
}
