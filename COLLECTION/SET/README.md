# Java Set & Custom Sorting

Examples demonstrating `Set` implementations (`TreeSet`) along with custom sorting techniques in Java.

## Files

- **`treeSet.java`**: Basic `TreeSet` usage for naturally ordered element storage.
- **`methodsOftreeSet.java`**: Specific `TreeSet` methods (`first`, `last`, `headSet`, `tailSet`, `subSet`).
- **`ComparablewithtreeSet.java`**: Sorting custom objects by implementing `Comparable` (`compareTo`).
- **`comparator.java`**: Custom sorting logic using external `Comparator` objects (`compare`).
- **`mutilLevelSortingusingComparable.java`**: Sorting custom models (e.g. Students/Employees) by multiple attributes (e.g. name, then age/marks).
- **`questionONcomparable.java`**: Practice problem applying `Comparable` interface to custom classes.
- **`lambdaExpression.java`**: Writing clean, inline `Comparator` sorting functions using modern Java Lambda expressions.

## Comparison: Comparable vs Comparator

- **`Comparable`**: Defines natural/default sorting inside the class (`compareTo` method).
- **`Comparator`**: Defines custom/multiple sorting rules outside the class (`compare` method or lambdas).

## How to Run

```bash
javac ComparablewithtreeSet.java
java Main
```
