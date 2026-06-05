class BankAccount {
    int balance = 1000;

    void withdraw(int amount) {
        if (balance >= amount) {
            balance = balance - amount; // NOT thread-safe
        }
    }
}

class Customer extends Thread {
    BankAccount account;

    Customer(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.withdraw(700);
    }
}

class BankRaceCondition {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();

        Customer t1 = new Customer(account);
        Customer t2 = new Customer(account);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Balance: " + account.balance);
    }
}