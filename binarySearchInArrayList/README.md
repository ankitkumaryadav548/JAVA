# Binary Search in ArrayList

Code examples for searching and array list operations using Java's `Collections` utility.

## Files

- **`binarySearch.java`**: Demonstrates sorting an `ArrayList` with `Collections.sort()` and performing binary search using `Collections.binarySearch()`.
- **`questionOnBinarySearch.java`**: Solves a list processing problem to find min, max, 2nd largest, and 2nd smallest elements from user input after sorting.

## Notes

- **Precondition for Binary Search**: The `ArrayList` must be sorted prior to calling `Collections.binarySearch(list, key)`.
- If `key` is present, the function returns a non-negative index (`>= 0`).
- If `key` is missing, it returns a negative insertion index code.

## How to Run

```bash
javac binarySearch.java
java Main

javac questionOnBinarySearch.java
java Main
```
