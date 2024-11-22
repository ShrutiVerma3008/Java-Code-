import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableDemoGSV1 extends JFrame {

    public static void main(String[] args) {
        JTableDemoGSV1 jdv = new JTableDemoGSV1();
        jdv.setVisible(true);
        jdv.setSize(500, 500);
        jdv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    JTable jtd = null;

    public JTableDemoGSV1() {

        Object data[][] = {{12, "Amit Kumar", 45.6f},
                {14, "Amitesh Kumar", 65.6f},
                {15, "Kiran Kumar", 65.6f}};
        String header[] = {"Sid", "SName", "Marks"};

        DefaultTableModel dtm = new DefaultTableModel(data, header);
        jtd = new JTable(dtm);
        jtd.setRowHeight(20);
        JScrollPane jsp = new JScrollPane(jtd);
        add(jsp);

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String pass = "root";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        String sqldql = "SELECT * FROM student";

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pass);
            stmt = con.createStatement();
            rs = stmt.executeQuery(sqldql);

            while (rs.next()) {
                System.out.println("Sname " + rs.getString("SName") + " Branch " + rs.getString("Branch"));
                dtm.addRow(new Object[]{rs.getInt("Sid"), rs.getString("SName"), rs.getFloat("Marks"), rs.getString("Branch")});
            }

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
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

        add(jsp);
    }
}
