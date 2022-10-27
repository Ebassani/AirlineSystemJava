package src;

import java.sql.*;

public class ConnectionManager {

    private static String url = "jdbc:mysql://localhost:3306/airways";
    private static String username = "root";
    private static String password = "Bussi69!";

    public static Connection getConn() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, username, password);
        return con;
    }
}
