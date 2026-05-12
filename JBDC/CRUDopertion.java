//CRUD opertions 
//create , update , delete , insert
// first we check given table is present or not inside database
//if table is present we perform CRUD opertions otherwise we create 
//the table after that perform CRUD opertions 

import java.sql.*;

class JDBCExample {
    public static void main(String[] args) {

        try {

            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",
                "password"
            );

            // 3. Create Statement
            Statement st = con.createStatement();

            // 4. Insert Data
            String insertQuery =
                "INSERT INTO student VALUES(1,'Ankit')";

            st.executeUpdate(insertQuery);

            System.out.println("Data inserted successfully");

            // 5. Fetch Data
            ResultSet rs =
                st.executeQuery("SELECT * FROM student");

            // 6. Display Data
            while(rs.next()) {

                // getInt(1) -> first column
                // getString(2) -> second column

                System.out.println(
                    rs.getInt(1) + " " +
                    rs.getString(2)
                );
            }

            // 7. Close Connection
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
