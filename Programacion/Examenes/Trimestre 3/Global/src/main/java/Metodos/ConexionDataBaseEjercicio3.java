package Metodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDataBaseEjercicio3 {
    private final String URL = "jdbc:mysql://127.0.0.1:3306/supermercado";
    private final String USER = "root";
    private final String PASSWD = "1234";
    public Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWD);
    }
}