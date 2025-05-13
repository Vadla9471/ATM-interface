package com.eduBridge.MiniProject;

import java.util.ArrayList;

public class Account extends AccountHolder{

    public int id ;
    private double balance;
    ArrayList<BankTransactions> transactions ;

    Account(String accountHolderName , int pin , int id , double balance){
        super(accountHolderName,pin);
        this.id = id;
        this.balance = balance;

        transactions = new ArrayList<>();
    }

    public boolean withdraw(double amount){
        if (balance>=amount){
            balance -= amount;
            transactions.add(new BankTransactions('W',amount,balance));
            return true;
        }
        return false;
    }

    public void deposit(double amount){
        balance += amount;
        transactions.add(new BankTransactions('D',amount,balance));
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public int getPin() {
        return super.getPin();
    }

    @Override
    public String getAccountHolderName() {
        return super.getAccountHolderName();
    }

    public ArrayList<BankTransactions> getTransactions() {
        return this.transactions ;
    }

    public int countTransaction(char type){
        int count = 0;
        for (BankTransactions transaction : transactions){
            if (transaction.getType() == type){
                count++;
            }
        }
        return count;
    }





    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", accountHolderName='" + accountHolderName + '\'' +
                '}';
    }
}
