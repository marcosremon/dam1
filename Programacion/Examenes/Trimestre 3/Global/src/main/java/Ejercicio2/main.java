package Ejercicio2;

import Metodos.ConexionDataBaseEjercicio2;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class main {
    public static void main(String[] args) {
        ConexionDataBaseEjercicio2 conexionDataBaseEjercicio2 = new ConexionDataBaseEjercicio2();
        ObjectMapper objectMapper = new ObjectMapper();
        File jsonFile = new File("Uz.json");

        try  (Connection connection = conexionDataBaseEjercicio2.connect()){
            Datos listaDatos = objectMapper.readValue(jsonFile, Datos.class);
            System.out.println(listaDatos);
            for (Estudios i : listaDatos.getDatos()) {
                System.out.println(i);
                String insertar = "insert into datos values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(insertar);
                preparedStatement.setString(1, i.getLocalidad());
                preparedStatement.setFloat(2, i.getTasa_graduacion());
                preparedStatement.setFloat(3, i.getMedia_cursos_matriculados());
                preparedStatement.setString(4, i.getTipo_estudio());
                preparedStatement.setString(5, i.getEstudio());
                preparedStatement.setString(6, i.getSexo());
                preparedStatement.setFloat(7, i.getTasa_abandono_inicial());
                preparedStatement.setInt(8, i.getAlumnos_graduados());
                preparedStatement.setInt(9, i.getCurso_academico());
                preparedStatement.setInt(10, i.getAlumnos_graduados_en_tiempo());
                preparedStatement.setFloat(11, i.getTasa_abandono());
                preparedStatement.setInt(12, i.getAlumnos_interrumpen_estudios());
                preparedStatement.setInt(13, i.getAlumnos_interrumpen_est_ano1());
                preparedStatement.executeUpdate();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}