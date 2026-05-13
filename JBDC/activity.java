//CRUD opertion 

import java.sql.*;

class Main{
    public static void main(String[] args){
        try{
            String url = "jdbc:mysql://localhost/ri_db";
            String user = "user" ;
            String pass = "ankit123" ;
            Connection conn = DriverManager.getConnection(url,user,pass);
        //after creating connection , we will perform crud opertions 
        //create the variable of Statement class => it will used to execute sql Query
        Statement st = conn.createStatement();
        String createTable = "CREATE TABLE IF EXITS Student("+" id INT PRIMARY KEY, "+" name VARCHAR(50))" ;

        st.executeUpdate(createTable);
        System.out.println("Table is created");

        //st.executeUpdate(query) => insertion deletion updation creation 
        //st.executeQuery(query) => readinh or fetching data 

        //Insertion 
        String insert1 = "INSERT INTO Student VALUES(1, 'Ankit')" ;
        //insert1 is sql query 
        st.executeUpdate(insert1) ;
        
        String insert2 = "INSERT INTO Student VALUES(2, 'Gautam')" ;
        st.executeUpdate(insert2) ;

        //read/fetch 
        String readingdata = "SELECT * FROM Student" ;
        ResultSet rs = st.executeQuery(readingdata) ;
        while (rs.next()) 
        {
            System.out.println("id is " + rs.getInt("id") + "name is " + rs.getString("name"));
            
        }
        //updation
        

    }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}