package Ejercicio2;

import Metodos.ConexionDataBaseEjercicio2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Des {
    public static void main(String[] args) {
        ConexionDataBaseEjercicio2 conexionDataBaseEjercicio2 = new ConexionDataBaseEjercicio2();
        Datos datos = new Datos();
        try (Connection connection = conexionDataBaseEjercicio2.connect()) {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from datos");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String localidad = resultSet.getString(2);
                Float tasa_graduacion = resultSet.getFloat(3);
                Float media_cursos_matriculados = resultSet.getFloat(4);
                String tipo_estudio = resultSet.getString(5);
                String estudio = resultSet.getString(6);
                String sexo = resultSet.getString(7);
                Float tasa_abandono_inicial = resultSet.getFloat(8);
                int alumnos_graduados = resultSet.getInt(9);
                int curso_academico = resultSet.getInt(10);
                int alumnos_graduados_en_tiempo = resultSet.getInt(11);
                Float tasa_abandono = resultSet.getFloat(12);
                int alumnos_interrumpen_estudios = resultSet.getInt(13);
                int alumnos_interrumpen_estudios_est_ano1 = resultSet.getInt(14);
                Estudios estudios = new Estudios(localidad, tasa_graduacion, media_cursos_matriculados
                        , tipo_estudio, estudio, sexo, tasa_abandono_inicial, alumnos_graduados, curso_academico, alumnos_graduados_en_tiempo
                        , tasa_abandono, alumnos_interrumpen_estudios, alumnos_interrumpen_estudios_est_ano1);
                datos.setDatos(estudios);
            }
            System.out.println(datos.getDatos());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
