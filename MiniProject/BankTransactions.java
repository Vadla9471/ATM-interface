package com.eduBridge.MiniProject;

import java.util.Date;

public class BankTransactions {
    char type;

    public char getType() {
        return type;
    }

    double amount ;
    double balance ;

    Date date;

    public BankTransactions(char type, double amount, double balance) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;

        date = new Date();
    }

    @Override
    public String toString() {
        return "BankTransactions{" +
                "type=" + type +
                ", amount=" + amount +
                ", balance=" + balance +
                ", date=" + date +
                '}' + "\n";
    }
}
