// Question: Print Numbers Using Two Threads

// Create a Java program that uses two threads:

// Thread 1 should print the numbers from 1 to 5.
// Thread 2 should print the numbers from 6 to 10.
// Use the start() method to run both threads concurrently.
// Add a small delay (Thread.sleep(500)) between each number printed so that the thread execution can be observed.

// Program to demonstrate two threads in Java
// Thread 1 is created by extending the Thread class
// Thread 2 is created by implementing the Runnable interface


// Thread class using inheritance
class NumberThread1 extends Thread {

    @Override
    public void run() {
        // Print numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread-1: " + i);

            try {
                // Pause the thread for 500 milliseconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread-1 interrupted");
            }
        }
    }
}

// Runnable class using interface implementation
class NumberThread2 implements Runnable {

    @Override
    public void run() {
        // Print numbers from 6 to 10
        for (int i = 6; i <= 10; i++) {
            System.out.println("Thread-2: " + i);

            try {
                // Pause the thread for 500 milliseconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread-2 interrupted");
            }
        }
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        // Create object of Thread class
        NumberThread1 t1 = new NumberThread1();

        // Create Runnable object
        NumberThread2 runnableObj = new NumberThread2();

        // Pass Runnable object to Thread
        Thread t2 = new Thread(runnableObj);

        // Start both threads
        t1.start();
        t2.start();

        try {
            // Wait for both threads to finish execution
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        // This statement executes after both threads complete
        System.out.println("All threads completed.");
    }
}

