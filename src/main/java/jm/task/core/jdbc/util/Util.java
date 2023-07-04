package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/my_test";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static Connection connection = null;

    static {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Не удалось установить соединение");
            //e.printStackTrace();
        }
    }

    public static Connection getConnect() {
        return connection;
    }
}
