package com.example.suhaas.mybank;


import java.util.ArrayList;

public class BankAccount {
    private static final String TAG= "BankAccount";
    private ArrayList<Double> mTransactions;
    public static final double OVERDRAFT_FEE =30;
//OVERDRAFT_FEE is the fee that is charged by myBank when withdraw exceeds deposited balance.

    BankAccount(){
        mTransactions = new ArrayList<Double>();
    }

    public void withdraw(double amount){
        mTransactions.add(-amount);

        if (getBalance() < 0){
            mTransactions.add(-OVERDRAFT_FEE);
        }
    }

    protected int numberOfWithdrawals(){
        int count=0;
        for (int i = 0; i <mTransactions.size() ; i++) {
            if (mTransactions.get(i) < 0){
                count++;
            }

        }
        return count;
    }

    public void deposit(double amount){
        mTransactions.add(amount);

    }

    public double getBalance(){
        double total=0;
        for(int i=0; i < mTransactions.size(); i++){
            total+=mTransactions.get(i);
        }
        return total;
    }
}
