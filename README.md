ATM Interface Documentation

1.Title of the Project
ATM Interface Simulation using Java
2.Objective
The objective of this project is to create a simple console-based ATM Interface using Java, where a user can perform basic banking operations such as Balance Enquire , Deposit Amount , Withdraw Amount , Transfer Amount , and Transaction History. 
3. Introduction
This ATM Interface project replicates real ATM operations by providing a secure and interactive environment for users. It allows users to log in using a user ID and PIN, and access a variety of banking features. The project uses Java to implement these functionalities using multiple classes and logical structures.

4.Project Structure
Mini project 
|--AccountHolder.java
|	|-Account(String, int , int, double)
|	|-boolean withdraw(double)
|	|-void deposit(double)
|	|-ArrayList<BankTransactions> getTransactions()
|	|_getters
|-- Account.java
|	|-AccountHolder(String, int)
|	|_getters
|-- BankTransaction.java
|	|-BankTransactions(char, double, double)
|	|_getters
|__ ATM.java (Main class)
	|-ArrayList<Account> dummyAccounts()
	|_startMenu()

5.Project Working
5.1 : verifying account
When we start running ATM.java (Main class) which contains main method. It will open a console window, on that it will asks user to Enter Account Id , after that it asks Enter Account Pin .
After giving these two details I am using If statement to check user given details are valid or not. If details or not matching it will asks try again if details are matching, we are moving next step.
5.2 : ATM Interface
After matching details , I am creating an do-while loop to iterate menu and do some tasks based on choice provided by user. Now, I am displaying an menu by using startMenu() . After providing menu, I am asking user choice  I am performing some tasks by using switch according to user choice.
5.2.1 : Balance Enquire
I am providing choice  1 to Balance Enquire. In this I am displaying message by using getBalance() method -> from Account class .
5.2.2 :  Deposit Amount
I am providing choice 2 to Deposit Amount. In this firstly I am asking user to enter amount and depositing this amount , adding this amount to balance by using deposit() method -> Account class after adding , providing an option to do another transaction or back to menu . 
If user chooses YES doing same task until user to enter NO.
5.2.3 :  Withdraw Amount
I am providing choice 3 Withdraw Amount. In this firstly I am asking user to enter amount and depositing this amount, after entering amount checking Balance is grater than amount or not this will be check by withdraw() method -> Account class , if amount is grater than it will displays Insufficient Funds , If balance is grater than amount it will withdraws amount from balance.. In this also we are providing an to do another transaction like deposit.
5.2.4 :  Transfer Amount
I am providing choice 4 Transfer Amount. In this I am asking user to provide to transfer account Id , when user providing a transfer account Id I am using for loop to check this user is available or not. if account is not found providing another chance to choose another account. 
If account is found asking user to enter amount to transfer and checking by using withdraw () method and withdraw amount and deposit amount to transfer account by using deposit () method.
5.2.5 :  Transaction History
I am providing choice 5 Transaction History. This will be done by creating an BankTransaction class to be get transaction details by using constructor.
	Creating an ArrrayList in Account to store all transactions  in it. Adding Transactions in withdraw() and deposit() methods when we using this method that data will be store in ArrayList and this will be called by using getTransaction() metod -> Account class . 
5.2.6 :  Exit
I am providing choice 6 Exit. Starting we are proving an do-while loop to display menu in that iam providing an Boolean value which is exit == true that why loop is showing. 
	In this am changing exit==false and loop condition is false loop is stops iterating and displays message “ Thank You....🤝\nVisit Again....🙏 “ and stops running main() method.
6. Conclusion
This project provides a simple and effective replicates of ATM operations. It is useful for understanding Java OOP principles such as classes, objects . This mini project serves as a strong foundation for building more complex financial applications in the future.

