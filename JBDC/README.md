# JDBC (Java Database Connectivity)

Programs demonstrating relational database connectivity and SQL operations from Java.

## Files

- **`jbdc.java` & `JdbcExample.java`**: Registering database drivers, establishing connection using `DriverManager.getConnection()`, creating statements, and executing queries.
- **`InsertEmployee.java`**: Inserting records into a database using `PreparedStatement` to avoid SQL injection.
- **`CRUDopertion.java`**: Complete CRUD workflow (Create, Read, Update, Delete) on database tables.
- **`activity.java`**: Database practice task executing custom SQL queries.

## Prerequisites

- Java Database Driver JAR (e.g., MySQL Connector/J or PostgreSQL driver) in classpath.
- Running relational database instance with connection credentials configured.

## Basic Workflow

1. Load Driver: `Class.forName("com.mysql.cj.jdbc.Driver")`
2. Connect: `Connection con = DriverManager.getConnection(url, user, password)`
3. Execute: `PreparedStatement pstmt = con.prepareStatement(query)`
4. Close: Close statement and connection resources.

## How to Run

```bash
javac -cp ".;mysql-connector.jar" JdbcExample.java
java -cp ".;mysql-connector.jar" Main
```
