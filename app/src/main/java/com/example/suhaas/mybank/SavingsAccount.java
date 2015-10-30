package com.example.suhaas.mybank;

public class SavingsAccount extends BankAccount {

    private static final String TAG="SavingsAccount";
    @Override
    public void withdraw(double amount) {
        if(numberOfWithdrawals() >= 3){
            return;
        }
        super.withdraw(amount);
    }

}
