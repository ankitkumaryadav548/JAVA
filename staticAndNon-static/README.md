# Static Members & Nested Classes in Java

Examples illustrating `static` variables, static methods, nested classes, and lambda expressions.

## Files

- **`basicstatic.java`**: Differences between static (class-level) and non-static (instance-level) variables and methods.
- **`nestedclass.java` & `nestedclass1.java`**: Static nested classes vs non-static inner classes.
- **`anonymousnestedclass.java`**: Anonymous inner class creation for instant interface or abstract class implementation.
- **`questionOnnestedClass.java`**: Practice problem utilizing inner and static nested classes.
- **`lambda.java`**: Replacing anonymous inner classes with functional lambda expressions.

## Key Concepts

- **Static Variable**: Shared across all instances of a class.
- **Static Method**: Belongs to class, can only directly access static data.
- **Static Nested Class**: Does not need an instance of outer class.
- **Inner Class**: Requires an instance of outer class (`outerObj.new Inner()`).

## How to Run

```bash
javac basicstatic.java
java Main
```
