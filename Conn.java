package employeems;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    public Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeems", "root", "root");
//             String url = "jdbc:mysql://localhost:3306/employeems?useSSL=false";
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
