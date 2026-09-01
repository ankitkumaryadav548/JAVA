# Exception Handling in Java

Code examples covering Java exception handling mechanisms, built-in exception types, and custom user-defined exceptions.

## Core Concepts Covered

1. **`try-catch-finally` Blocks**: Handling runtime errors gracefully without breaking execution flow.
2. **Built-in Exceptions**: `ArithmeticException` (division by zero), `ArrayIndexOutOfBoundsException`, `NullPointerException`, etc.
3. **Custom Exceptions**: Creating custom exception classes extending `Exception` or `RuntimeException`.
4. **Keywords**: `throw` (explicitly throw exception) and `throws` (method signature declaration).

## Files Overview

- **`exception.java`**: Introduction to basic `try-catch` blocks and handling division errors.
- **`typesOfExceptionHandling.java`**: Checked vs Unchecked exception handling strategies.
- **`arrayIndexOutOfBoundsException.java`**: Handling invalid array indexing.
- **`customException.java`**: Constructing custom exception classes.
- **`activityOnCustomException.java` & `activity2OnCustomExcepyion.java`**: Practical exercises (e.g. login authentication, mark validation, password checks).
- **`questionONcustomException.java`**: Custom exception challenge problems (`IllegalMarksException`, `WrongPasswordException`).

## How to Run

```bash
javac exception.java
java Main

javac customException.java
java Main
```
