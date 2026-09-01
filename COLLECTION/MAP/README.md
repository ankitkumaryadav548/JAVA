# Java Map & HashMap

Key-value data mapping using Java's `Map` interface and `HashMap` implementation.

## Files

- **`hashmap.java`**: Basic key-value pair operations (`put`, `get`, `containsKey`, `remove`).
- **`methodOfMap.java`**: Map traversal techniques (`keySet()`, `values()`, `entrySet()`) and utility methods.

## Quick Reference

```java
Map<String, Integer> map = new HashMap<>();
map.put("Alice", 90);
map.get("Alice");            // returns 90
map.containsKey("Bob");     // returns false
map.keySet();                // returns Set of keys
```

## How to Run

```bash
javac hashmap.java
java Main
```
