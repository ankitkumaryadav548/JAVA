# Java Multithreading & Concurrency

Code examples covering thread creation, execution, race conditions, and thread synchronization.

## Files

- **`extendingThread.java`**: Creating threads by extending the `Thread` class and overriding `run()`.
- **`creatThread.java`**: Creating threads by implementing the `Runnable` interface.
- **`raceCondition.java`**: Simulating race conditions during concurrent access to shared resources (e.g. `BankAccount` withdrawals).
- **`questionONthread.java`**: Concurrency exercise fixing race conditions using synchronized blocks/methods.

## Thread Creation Techniques

```java
// Method 1: Extending Thread
class MyThread extends Thread {
    public void run() { System.out.println("Running Thread"); }
}

// Method 2: Implementing Runnable
class MyRunnable implements Runnable {
    public void run() { System.out.println("Running Runnable"); }
}
```

## How to Run

```bash
javac raceCondition.java
java Main
```
