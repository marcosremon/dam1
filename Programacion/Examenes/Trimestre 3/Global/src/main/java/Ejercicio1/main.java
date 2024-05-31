package Ejercicio1;

import Metodos.ConexionDataBaseEjercicio1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        ConexionDataBaseEjercicio1 conexionDataBaseEjercicio1 = new ConexionDataBaseEjercicio1();
        List<String> listaDatabases = new ArrayList<>();

        try (Connection connection = conexionDataBaseEjercicio1.connect()) {
            String listarDatabases = "show databases";
            PreparedStatement listarDatabasesPs = connection.prepareStatement(listarDatabases);
            ResultSet listarDatabasesRs = listarDatabasesPs.executeQuery();

            while (listarDatabasesRs.next()) {
                listaDatabases.add(listarDatabasesRs.getNString(1));
            }

            if (!listaDatabases.contains("supernivel")) {
                String anyadirDatabase = "create database supernivel";
                PreparedStatement anyadirDatabasePs = connection.prepareStatement(anyadirDatabase);
                anyadirDatabasePs.executeUpdate();
                System.out.println("database creada correctamente");
            } else {
                System.out.println("la database supernivel ya existe en la sgbd");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}