// Implementation of abstraction and interface 

//1. Create an abstract class Account
// variables: accountHolder, balance
// abstract method: calculateInterest()
// normal method: showDetails()

// 2.Create an interface Transaction
// methods: deposit(double amount)
// withdraw(double amount)

// 3.Create a class SavingsAccount
// extends Account
// implements Transaction
// interest = 4%



// Abstract class
abstract class Account {

    String accountHolder;
    double balance;

    // Constructor
    Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Abstract method (no body)
    abstract void calculateInterest();

    // Normal method
    void showDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}


// Interface
interface Transaction {

    void deposit(double amount);   // abstract method
    void withdraw(double amount);  // abstract method
}


// Child class
class SavingsAccount extends Account implements Transaction {

    // Constructor
    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    // Implement abstract method from Account
    void calculateInterest() {
        double interest = balance * 0.04; // 4% interest
        System.out.println("Interest: " + interest);
    }

    // Implement deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Implement withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}


// Main class
class Main {
    public static void main(String[] args) {

        // Create object
        SavingsAccount acc = new SavingsAccount("Ankit", 10000);

        acc.showDetails();        // from abstract class
        acc.deposit(2000);        // from interface
        acc.withdraw(5000);       // from interface
        acc.calculateInterest();  // abstract method implementation
    }
}