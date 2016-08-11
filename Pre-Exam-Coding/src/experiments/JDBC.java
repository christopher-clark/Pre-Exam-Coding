package experiments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

    public static void main(String[] args) {
    
        try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/contact","cclark","cclark");
            Statement stmt = con.createStatement()) {
            
            String query = "SELECT * FROM COLLEAGUES";
            
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()){
                System.out.println("ID = " + rs.getInt("ID"));
                System.out.println("First Name = " + rs.getString("FIRSTNAME"));
                System.out.println("Last Name = " + rs.getString("LASTNAME"));
                System.out.println("Title = " + rs.getString("TITLE"));
                System.out.println("Department = " + rs.getString("DEPARTMENT"));
                System.out.println("Email = " + rs.getString("EMAIL") + "\n");
            }
            
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
    
}

