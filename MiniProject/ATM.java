package com.eduBridge.MiniProject;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        ArrayList<Account> accounts = dummyAccounts();
        Scanner s = new Scanner(System.in);
        int tryAcc = 0;
        while (tryAcc<5){
            System.out.print("Enter Account Id : ");
            int checkId = s.nextInt();
            System.out.print("Enter Account Pin : ");
            int checkPin = s.nextInt();
            boolean accFound = false;
            for (int i = 0 ; i<accounts.size() ;i++){
                if (checkId==accounts.get(i).getId()&&checkPin==accounts.get(i).getPin()){
                    boolean exit = true;
                    System.out.println("Welcome to ATM interface");
                    do {
                        startMenu();
                        int choice = s.nextInt();
                        switch (choice){
                            case 1 :
                                System.out.println("Current Balance : ₹" + accounts.get(i).getBalance());
                                break;
                            case 2 :
                                do {
                                    System.out.print("Enter amount : ");
                                    accounts.get(i).deposit(s.nextDouble());
                                    System.out.println("Amount Deposited Successfully");

                                    System.out.print("Do you wont another Transaction (y/n) : ");
                                    if (s.next().toLowerCase().charAt(0) != 'y'){
                                        break;
                                    }
                                }while (true);
                                System.out.println("Current Balance : ₹" + accounts.get(i).getBalance());
                                break;
                            case 3 :
                                do {
                                    System.out.print("Enter amount : ");
                                    if (accounts.get(i).withdraw(s.nextDouble())){
                                        System.out.println("Amount Withdraw Successfully");
                                    }else {
                                        System.out.println("Insufficient Funds");
                                    }

                                    System.out.print("Do you wont another Transaction (y/n) : ");
                                    if (s.next().toLowerCase().charAt(0) != 'y'){
                                        break;
                                    }
                                }while (true);
                                System.out.println("Current Balance : ₹" + accounts.get(i).getBalance());
                                break;
                            case 4 :
                                System.out.print("Enter ID : ");
                                int checkToAccId = s.nextInt();
                                for (int j = 0 ; j<accounts.size() ; j++){
                                    if (checkToAccId == accounts.get(j).getId()){
                                        System.out.print("Enter Amount : ");
                                        double transAmount = s.nextDouble();
                                        accounts.get(i).withdraw(transAmount);
                                        accounts.get(j).deposit(transAmount);
                                        System.out.println("Amount Transfer to " + "\n" +
                                                "Account ID : " + accounts.get(j).getId()+"\n"+
                                                "Account Holder Name : " + accounts.get(j).getAccountHolderName());
                                    }
                                }
                                break;
                            case 5 :
                                System.out.println("Withdraw : " + accounts.get(i).countTransaction('W'));
                                System.out.println("Deposit : " + accounts.get(i).countTransaction('D'));
                                System.out.println(accounts.get(i).getTransactions());
                                break;
                            case 6 :
                                System.out.println("Thank You....🤝\nVisit Again....🙏");
                                exit = false;
                                break;
                            default:
                                System.out.println("Entered invalid input \nTry Again...");
                        }

                    }while (exit);

                    accFound = true;
                    break;
                }

            }

            if (accFound){
                break;
            }


            System.out.println("You have last " + (4-tryAcc) + " chances \nTry Again..");
            tryAcc++;
        }



//        startMenu();
        s.close();
    }


    public static ArrayList<Account> dummyAccounts(){
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account("Vineeth kumar",1234,101,50000));
        accounts.add(new Account("Goutham",4567,102,50000));
        accounts.add(new Account("Navakanth",6789,103,50000));
        return accounts;
    }


    public static void startMenu(){
        System.out.print("***********************" + "\n" +
                    "1.Balance Enquire " + "\n" +
                    "2.Deposit Amount " + "\n" +
                    "3.Withdraw Amount " + "\n" +
                    "4.Transfer Amount " + "\n" +
                    "5.Transaction History " + "\n" +
                    "6.Exit " + "\n" +
                    "***********************" + "\n" +
                    "Choose option : "
                );
    }
}
