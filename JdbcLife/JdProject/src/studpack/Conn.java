package studpack;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {
    static Connection con;

    public static Connection createConn() {
        try {
            // load the driver
            Class.forName("com.mysql.jdbc.Driver");

            // create the connection..
            String user = "root";
            String password = "Lufa@7917";
            String url = "jdbc:mysql://localhost:3307/student_manage";
            con = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
