# Java Generics

Examples demonstrating compile-time type safety and reusability with Java Generics.

## Core Concepts

Generics allow classes, interfaces, and methods to take types as parameters (`<T>`, `<E>`, `<K, V>`), preventing runtime `ClassCastException` and eliminating explicit casting.

## Files

- **`basicOfGeneric.java` & `basic.java`**: Introduction to generic classes (`Box<T>`, `Storage<T>`).
- **`generic.java`**: Generic method definitions and type parameters.
- **`genericForThreeVariable.java`**: Multiple type parameter classes (`<T, U, V>`).
- **`exampleOnGeneric.java`**: Storing custom objects (`Student`, `StudentData`) inside generic containers.
- **`activityOngeneric.java` & `anotherexOnGeneric.java`**: Practice exercises using generic calculators and storage wrappers.

## Example Usage

```java
// Generic class with single type parameter
class Box<T> {
    private T item;
    public void set(T item) { this.item = item; }
    public T get() { return item; }
}

Box<Integer> numBox = new Box<>();
numBox.set(100);
```

## How to Run

```bash
javac basicOfGeneric.java
java Main
```
