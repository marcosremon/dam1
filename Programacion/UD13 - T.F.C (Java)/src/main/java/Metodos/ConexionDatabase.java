package Metodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDatabase {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/banco";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";
    public Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}