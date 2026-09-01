# Java Deque (Double-Ended Queue)

Examples using `Deque` interface and `ArrayDeque` implementation for double-ended queue functionality.

## Files

- **`deque.java`**: Insertion and removal operations at both front and back (`addFirst`, `addLast`, `removeFirst`, `removeLast`).
- **`question.java`**: Practice problem solving using a deque for stack/queue hybrid behavior.

## Key Operations

```java
Deque<Integer> deque = new ArrayDeque<>();
deque.addFirst(10);  // Add to front
deque.addLast(20);   // Add to back
deque.removeFirst(); // Remove from front
deque.removeLast();  // Remove from back
```

## How to Run

```bash
javac deque.java
java Main
```
