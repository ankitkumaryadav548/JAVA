// CRUD operation -> 
// C->create /insert 
// R-> read/fetch 
// U-> update 
// D-> delete 

// Crud operatios Database -> table -> 
// first step connection with Database 

import java.sql.*;

// import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
//import java.sql.ResultSet; 
class Main {
    public static void main(String[] args) {
        // first step create Connection with Database

        try {
            String url = "jdbc:mysql://localhost/ri_db";
            String user = "test";
            String pass = "test123";
            Connection conn = DriverManager.getConnection(url, user, pass);
            // after creating Connection we can perform CRUD operations
            // create the variable of Statement class -> it will used to execute
            // sql query
            Statement st = conn.createStatement();

            // check if given table is present perform the CRUD operations
            // if table is not present then create table after that perform Crud
            // operations
            String createTable = "CREATE TABLE IF NOT EXISTS student(" + " id INT PRIMARY KEY ," + " name VARCHAR(50))";

            st.executeUpdate(createTable);
            System.out.println("table is created ");
            // st.executeUpdate(query); -> insertion deletion updation creation
            // st.executeQuery(query);-> reading or fetching

            // Insertion
            String insert1 = "INSERT INTO student VALUES(1,'Arun')";
            // insert1 is Sql query
            st.executeUpdate(insert1);

            String insert2 = "INSERT INTO student VALUES(2,'shivam')";
            st.executeUpdate(insert2);

            // student
            // id name
            // 1 arun 
            // 2 Ankit 

            // read/fetch
            String query = "SELECT * FROM student";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) { // initial rs before first row
                System.out.println("id is " + rs.getInt("id") + " name " + rs.getString("name"));

            }

            // updation

            String updateQuery = "UPDATE student SET name='rahul' WHERE id=2";
            st.executeUpdate(updateQuery);

            String query1 = "SELECT * FROM student";

            ResultSet rs1 = st.executeQuery(query1);
            System.out.println("table after updation ");
            while (rs1.next()) { // initial rs before first row
                System.out.println("id is " + rs1.getInt("id") + " name " + rs1.getString("name"));

            }

            // deletion

            String deleteQuery = "DELETE FROM student WHERE id=2";
            st.executeUpdate(deleteQuery);
            String query2 = "SELECT * FROM student";

            ResultSet rs2 = st.executeQuery(query2);
            System.out.println("table after Deletion ");
            while (rs2.next()) { // initial rs before first row
                System.out.println("id is " + rs2.getInt("id") + " name " + rs2.getString("name"));
            }
            conn.close() ;

        } catch (Exception e) {
            System.out.println(e);
        }
        // catch (SQLEXception e)
        // {
        // System.out.println(e);
        // }catch(ClassNotFoundException e)
        // {
        // System.out.println(e);
        // }

    }
}