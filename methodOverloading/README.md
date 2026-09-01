# Method Overloading in Java

Demonstrates compile-time polymorphism (static binding) via Method Overloading.

## Files

- **`methodOverloading.java`**: Multiple methods defined with the same name in the same class, differentiated by:
  - Number of parameters
  - Types of parameters
  - Sequence/Order of parameters

## Example

```java
class Calculator {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
}
```

## How to Run

```bash
javac methodOverloading.java
java Main
```
