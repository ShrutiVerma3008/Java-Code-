import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableDemoGSV extends JFrame {
    public static void main(String[] args) {
        JTableDemoGSV jdv = new JTableDemoGSV();
        jdv.setVisible(true);
        jdv.setSize(500, 500);
        jdv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    JTable jtd = null;

    public JTableDemoGSV() {
        String driver = "com.mysql.cj.jdbc.Driver"; // Updated driver class
        String url = "jdbc:mysql://localhost:3306/test"; // Make sure the DB name is correct
        String user = "root";
        String pass = "Abhinav258963";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        String sqldql = "select *from student;"; // Query your student table

        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("SName");
        dtm.addColumn("Branch");
        JTable jtd = new JTable(dtm);

        try {
            Class.forName(driver); // Load the MySQL driver
            con = DriverManager.getConnection(url, user, pass); // Establish a connection
            stmt = con.createStatement();
            rs = stmt.executeQuery(sqldql); // Execute the query

            while (rs.next()) {
                System.out.println("SName: " + rs.getString(1) + " Branch: " + rs.getString(2));
                dtm.addRow(new Object[] { rs.getString(1), rs.getString(2) });
            }

            JScrollPane jsp = new JScrollPane(jtd);
            add(jsp);

        } catch (ClassNotFoundException ex) {
            System.out.println("Driver class not found!");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("SQL Exception occurred!");
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                    rs = null;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            try {
                if (stmt != null) {
                    stmt.close();
                    stmt = null;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            try {
                if (con != null) {
                    con.close();
                    con = null;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
