# Java Core Concepts & Practice Repository

A organized collection of Java programs covering Object-Oriented Programming (OOP), Data Structures & Collections, Concurrency, Generics, Exception Handling, Database Connectivity (JDBC), and Utility classes.

---

## Workspace Directory

Each folder contains focused code examples and its own dedicated `README.md` explaining specific concepts:

| Topic / Folder | Description |
|---|---|
| [`abstraction`](./abstraction/) | Abstract classes, abstract methods, and interface implementation |
| [`binarySearchInArrayList`](./binarySearchInArrayList/) | Binary search algorithms and array list min/max search exercises |
| [`COLLECTION`](./COLLECTION/) | Java Collections Framework (`List`, `Set`, `Map`, `Queue`) |
| ├── [`HASHSET`](./COLLECTION/HASHSET/) | `HashSet`, `LinkedHashSet`, and `TreeSet` set implementations |
| ├── [`LIST`](./COLLECTION/LIST/) | `List` interface methods and `ArrayList` operations |
| │   └── [`LinkedList`](./COLLECTION/LIST/LinkedList/) | `LinkedList` node manipulation and operations |
| ├── [`MAP`](./COLLECTION/MAP/) | Key-value pairs using `HashMap` and map traversal |
| ├── [`QUEUE`](./COLLECTION/QUEUE/) | FIFO `Queue` implementations |
| │   └── [`DEQUE`](./COLLECTION/QUEUE/DEQUE/) | Double-Ended Queue (`ArrayDeque`/`Deque`) operations |
| └── [`SET`](./COLLECTION/SET/) | `TreeSet`, `Comparable`, `Comparator`, and multi-level sorting |
| [`exceptionHandling`](./exceptionHandling/) | `try-catch-finally`, `throw`/`throws`, and custom exceptions |
| [`GENERIC`](./GENERIC/) | Java Generics (`<T>`, `<E>`, `<K, V>`), generic classes, and methods |
| [`inheritance`](./inheritance/) | Hierarchical inheritance and multiple inheritance using interfaces |
| [`JBDC`](./JBDC/) | Java Database Connectivity (JDBC), `PreparedStatement`, and CRUD operations |
| [`methodOverloading`](./methodOverloading/) | Compile-time polymorphism and method overloading |
| [`staticAndNon-static`](./staticAndNon-static/) | `static` vs instance members, inner classes, and anonymous classes |
| [`thread`](./thread/) | Multithreading, `Thread` vs `Runnable`, race conditions, and synchronization |
| [`todoApp`](./todoApp/) | Console CLI Todo List application with object serialization persistence (`tasks.dat`) |
| [`utilityClass`](./utilityClass/) | Utility classes (`DateTimeFormatter`, `Math`, `String` helpers) |
| [`WildCard`](./WildCard/) | Generic wildcards (`?`, `? extends T`, `? super T`) |
| └── [`I`](./WildCard/I/) | Java I/O streams and interactive console inputs |

---

## Root Level Programs

Core Java fundamentals demonstrated directly in the root directory:

- **`typeOfConstructor.java`**: Default, parameterized, and copy constructors.
- **`thisAndsuper.java`**: `this` keyword for instance variables and `super` keyword for parent constructors.
- **`methodOverriding.java`**: Dynamic polymorphism and method overriding with `@Override`.
- **`functionalInterface.java`**: Single Abstract Method (SAM) interfaces and lambda expressions (`() -> {}`).
- **`object.java`**: Object instantiation and class basics.

---

## Getting Started

### Prerequisites

- Java Development Kit (JDK 8 or higher)
- Any terminal or Java IDE (VS Code, IntelliJ IDEA, Eclipse)

### Compilation and Execution

To compile and run any Java file:

```bash
# Navigate to desired directory
cd abstraction

# Compile the Java source file
javac abstractionANDinterface.java

# Run the compiled Main class
java Main
```

For programs requiring database connectivity (in [`JBDC/`](./JBDC/)):

```bash
javac -cp ".;mysql-connector.jar" JdbcExample.java
java -cp ".;mysql-connector.jar" Main
```
