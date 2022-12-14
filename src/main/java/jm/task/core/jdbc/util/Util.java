package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static String DB_URL = "jdbc:mysql://localhost:3306/jdbc-hibernate";
    private static String DB_USERNAME = "root";
    private static String DB_PASSWORD = "root";

    public static Connection getConnection () {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;

    }
}
