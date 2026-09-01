# LinkedList in Java

Demonstrates doubly-linked list data structure operations using Java's `LinkedList` class (`java.util.LinkedList`).

## Files

- **`linkedlist.java`**: Insertion (`add`), size calculation (`size`), element removal by index and by value (`remove`), and element existence checks (`contains`).

## Key Operations

```java
LinkedList<Integer> list = new LinkedList<>();
list.add(10);
list.remove(0);                       // remove by index
list.remove(Integer.valueOf(30));     // remove by object value
boolean exists = list.contains(40);   // check existence
```

## How to Run

```bash
javac linkedlist.java
java Main
```
