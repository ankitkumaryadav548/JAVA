//JBDC => Java Database Connectivity

// 1.import package
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

// 2.Load the driver

class.forName("com.mysql.jdbc.Driver");
//you can skip this one in your program

// 3.create the connection of your java program with Database
// for that Connection and DriverManager class 
//create the variable of Connection 
Connection conn = DriverManager.getConnection(url,user,password);

//1 way to create connection with Database
//  String url = "" ;
// String user = "" ;
// String pass = "";
// Connection conn = DriverManager.getConnection(url,user,password);

//2 way => dirctly pass ulr , user and password
Connection conn = DriverManager.getConnection(url,user,password);

//4. crate the Statement => with the help of Statement we run sql queries 
Statement st = conn.createStatement() ; // creating object 
// prepareStatement => for dynamic query
//Statement => static query

//5.Write the SQL query
String query = "SELECT * FROM Student" ;

//6. after excecuting This query => its return some Result 
// ResultSet -> its store the output of queries 
ResultSet rs = st.executeQuery(query);

//st.executeQuery(query); => only for fetching (SELECT)
//st.executeUpdate(query); => INSERTION DELETION UPDATION 

//7.after excuting any queries atlast ,we remove(close) the connection with Database
conn.close();


