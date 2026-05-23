import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcExample {

    public static void main(String[] args) {

       
        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "password";

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

           
            Connection conn = DriverManager.getConnection(url, username, password);

            Statement stmt = conn.createStatement();

            String sql = "SELECT id, name FROM students";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                System.out.println("ID: " + id + ", Name: " + name);
            }

          
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}