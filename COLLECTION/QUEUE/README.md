# Queue Interface in Java

Queue data structure implementations following FIFO (First-In, First-Out) ordering.

## Files

- **`queue.java`**: Basic operations on `Queue` using `LinkedList` or `ArrayDeque` (`offer`, `poll`, `peek`).

## Subdirectory

- **`DEQUE/`**: Double-Ended Queue (`ArrayDeque`/`Deque`) operations allowing insertion/deletion from both ends.

## Common Methods

- `offer(e)`: Inserts element into the queue.
- `poll()`: Retrieves and removes the head of the queue.
- `peek()`: Retrieves without removing the head.

## How to Run

```bash
javac queue.java
java Main
```
