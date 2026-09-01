# Abstraction & Interfaces in Java

Examples demonstrating data abstraction using abstract classes and interfaces in Java.

## Code Overview

- **`abstractionANDinterface.java`**: Implements a banking scenario with an abstract `Account` class and a `Transaction` interface.
  - Abstract class `Account`: Defines common attributes (`accountHolder`, `balance`), concrete `showDetails()`, and abstract `calculateInterest()`.
  - Interface `Transaction`: Defines `deposit(double)` and `withdraw(double)` behavior.
  - Class `SavingsAccount`: Extends `Account` and implements `Transaction`, overriding all abstract methods.

## How to Run

```bash
javac abstractionANDinterface.java
java Main
```
