// Create a Java program for a bank system.
// Requirements
// Create a class InsufficientBalanceException that extends Exception.
// Create a class BankAccount with:
// accountHolder
// balance
// Create methods:
// deposit(double amount)
// withdraw(double amount)
// Rules:
// If withdrawal amount is greater than balance, throw InsufficientBalanceException.
// If deposit amount is negative, throw IllegalArgumentException.
// Display updated balance after successful transaction.
// In main():
// Take account holder name and initial balance from user.
// Ask user whether they want to deposit or withdraw.
// Handle all exceptions using try-catch.

// class InsufficientBalanceException extends Exception{
//     InsufficientBalanceException()
// }

import java.util.*;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount cannot be negative");
        }

        balance += amount;
        System.out.println("Updated Balance: " + balance);
    }

    void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }

        balance -= amount;
        System.out.println("Updated Balance: " + balance);
    }
}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double balance = sc.nextDouble();
        sc.nextLine();

        BankAccount obj = new BankAccount(name, balance);

        String operation = sc.nextLine();
        double amount = sc.nextDouble();

        try {

            if (operation.equalsIgnoreCase("deposit")) {
                obj.deposit(amount);
            } 
            else if (operation.equalsIgnoreCase("withdraw")) {
                obj.withdraw(amount);
            } 
            else {
                System.out.println("Invalid operation");
            }

        } 
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } 
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}