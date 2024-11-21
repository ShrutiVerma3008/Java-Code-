import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseManager {
    public static void main(String[] args) {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "Abhinav258963";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        // String sqlddl = "CREATE TABLE student (sname VARCHAR(30), branch VARCHAR(30))";
        // String sqlinserts = "INSERT INTO student VALUES ('amit', 'AIDS')";
        // String sqlinserts1 = "INSERT INTO student VALUES ('sumit', 'AIDS')";
        // String sqlinserts2 = "INSERT INTO student VALUES ('mita', 'Civil')";
        String sqldql = "SELECT * FROM student";  // Query to fetch data from student table

        try {
            // Load MySQL JDBC driver
            Class.forName(driver);

            // Establish the connection
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();

            // Execute the query to fetch data from the table
            rs = stmt.executeQuery(sqldql);

            // Iterate through the result set
            while (rs.next()) {
                String sname = rs.getString("sname");
                String branch = rs.getString("brach"); 
                System.out.println("Sname: " + sname + " : Branch: " + branch);
            }

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace(); 
        } catch (SQLException ex) {
            ex.printStackTrace(); 
        } finally {
            try {
                if (rs != null) rs.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            try {
                if (stmt != null) stmt.close(); 
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            try {
                if (con != null) con.close(); 
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
