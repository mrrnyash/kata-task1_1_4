package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
Singleton Class
 */
public class Util {
    private static Connection conn = null;

    static {
        String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/test_db";
        String USERNAME = "root";
        String PASSWORD = "root";
        try {
            Class.forName(DB_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection error");
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return conn;
    }
}
