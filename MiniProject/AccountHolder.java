package com.eduBridge.MiniProject;

public class AccountHolder {
     public String accountHolderName;
     private int pin ;

    public AccountHolder(String accountHolderName, int pin) {
        this.accountHolderName = accountHolderName;
        this.pin = pin;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getPin() {
        return pin;
    }
}
