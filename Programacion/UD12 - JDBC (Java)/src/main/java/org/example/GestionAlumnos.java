package org.example;

import com.mysql.cj.MysqlConnection;

import javax.swing.*;
import java.sql.*;

public class GestionAlumnos {
    private String URL = "jdbc:mysql://localhost:3306/jdbc";
    private String USER = "root";
    private String PASSWORD = "1234";

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    public void anyadirDiezAlumnos() {
        try (Connection connection = connect()) {
            String consulaSql = "insert into alumnos (nombre, apellidos, direccion) values (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(consulaSql);

            for (int i = 0; i < 10; i++) {
                statement.setString(1, "nombre " + i);
                statement.setString(2, "apellidos " + i);
                statement.setString(3, "direccion " + i);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void insertarAlumnos() {
        try (Connection connection = connect()) {
            String consultaSql = "insert into alumnos (nombre, apellidos, direccion) values (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(consultaSql);

            String nombre = JOptionPane.showInputDialog("introduzca un nombre");
            String apellido = JOptionPane.showInputDialog("introduzca un apellido");
            String direccion = JOptionPane.showInputDialog("introduzca una direccion");

            statement.setString(1, nombre);
            statement.setString(2, apellido);
            statement.setString(3, direccion);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void editarAlumnos() {
        try (Connection connection = connect()) {

            Statement statement = connection.createStatement();
            int id = Integer.parseInt(JOptionPane.showInputDialog("introduce el id del alumno a buscar"));
            String buscarId = "select count(*) from alumnos where id = " + id;
            ResultSet resultSet = statement.executeQuery(buscarId);

            if (resultSet.next()) {
                String eleccion = JOptionPane.showInputDialog("que quieres modificar el nombre, el apellido o " +
                        "la direccion?");
                eleccion.toLowerCase();
                if (eleccion.equals("nombre")){
                    String nuevoNombre = JOptionPane.showInputDialog("introduce el nuevo nombre");
                    String consultaSql = "UPDATE alumnos SET name = '" + nuevoNombre + "' WHERE id = " + id;
                    statement.executeUpdate(consultaSql);
                    JOptionPane.showMessageDialog(null, "el nombre se cambio correctamente");
                } else if (eleccion.equals("apellido")) {
                    String nuevoApellido = JOptionPane.showInputDialog("introduce el nuevo apellido");
                    String consultaSql = "update alumnos set apellidos = '" + nuevoApellido + "' where id = " + id;
                    statement.executeUpdate(consultaSql);
                    JOptionPane.showMessageDialog(null, "el apellido se cambio correctamente");
                } else if (eleccion.equals("direccion")){
                    String nuevaDireccion = JOptionPane.showInputDialog("introduce la nueva direccion");
                    String consultaSql = "update alumnos set direccion = '" + nuevaDireccion + "' where id = " + id;
                    statement.executeUpdate(consultaSql);
                    JOptionPane.showMessageDialog(null, "la direccion se cambio correctamente");
                } else JOptionPane.showMessageDialog(null, "no introduciste lo correcto");
            } else JOptionPane.showMessageDialog(null, "no existe ese id en la database");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void eliminarAlumnos() {
        try (Connection connection = connect()) {
            Statement statement = connection.createStatement();
            int id = Integer.parseInt(JOptionPane.showInputDialog("introduzca el id del alumno a eliminar"));

            String buscarId = "select count(*) from alumnos where id = " + id;
            ResultSet resultSet = statement.executeQuery(buscarId);

            if (resultSet.next()){
                String consultaSql = "delete from alumnos where id = " + id;
                statement.executeUpdate(consultaSql);
                JOptionPane.showMessageDialog(null, "se borro el usuario correctamente");
            } else JOptionPane.showMessageDialog(null, "el id introducido es incorrecto");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void listarAlumnos() {
        try (Connection connection = connect()) {
            Statement statement = connection.createStatement();
            String consultaSql = "select * from alumnos";
            ResultSet resultSet = statement.executeQuery(consultaSql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellidos");
                String direccion = resultSet.getString("direccion");

                System.out.println("el id es: " + id + " el nombre es: " + nombre + " el apellido es: " + apellido +
                        " y la direccion es: " + direccion);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}