# Java Generics Wildcards

Examples demonstrating generic wildcards (`?`) for flexible, type-safe method parameters.

## Core Concepts

- **Unbounded Wildcard (`<?>`)**: Accepts any type parameter.
- **Upper Bounded Wildcard (`<? extends T>`)**: Restricts type to `T` or sub-types of `T` (read-only operations / Producer Extends).
- **Lower Bounded Wildcard (`<? super T>`)**: Restricts type to `T` or super-types of `T` (write operations / Consumer Super).

## Files

- **`wildCard.java`**: Basic wildcard syntax and unbounded collection processing.
- **`upperAndlowerBound.java`**: Upper bounded (`<? extends Number>`) and lower bounded (`<? super Integer>`) method parameter examples.
- **`exOnWildCard.java`**: Practical exercises processing collections of polymorphic objects.

## Subdirectory

- **`I/`**: Java Input/Output (I/O) stream examples.

## How to Run

```bash
javac wildCard.java
java Main
```
