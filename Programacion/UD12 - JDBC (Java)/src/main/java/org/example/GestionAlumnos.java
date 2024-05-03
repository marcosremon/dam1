package org.example;

import com.mysql.cj.MysqlConnection;
import com.sun.management.UnixOperatingSystemMXBean;

import javax.swing.*;
import java.awt.*;
import java.nio.channels.SelectableChannel;
import java.sql.*;

public class GestionAlumnos {
    private String URL = "jdbc:mysql://localhost:3306/jdbc";
    private String USER = "root";
    private String PASSWORD = "1234";

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    public void anyadirDiezAlumnos(String nombreDeLaTabla) {
        try (Connection connection = connect()) {
            String consulaSql = "insert into '" + nombreDeLaTabla + "' (nombre, apellido, direccion) values (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(consulaSql);

            for (int i = 0; i < 10; i++) {
                statement.setString(1, "nombre " + i);
                statement.setString(2, "apellido " + i);
                statement.setString(3, "direccion " + i);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void insertarAlumnos(String nombreDeLaTabla) {
        try (Connection connection = connect()) {
            String consultaSql = "insert into '" + nombreDeLaTabla + "' (nombre, apellido, direccion) values (?, ?, ?)";
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
    public void editarAlumnos(String nombreDeLaTabla) {
        try (Connection connection = connect()) {

            Statement statement = connection.createStatement();
            int id = Integer.parseInt(JOptionPane.showInputDialog("introduce el id del alumno a buscar"));
            String buscarId = "select count(*) from '" + nombreDeLaTabla + "' where id = " + id;
            ResultSet resultSet = statement.executeQuery(buscarId);

            if (resultSet.next()) {
                String eleccion = JOptionPane.showInputDialog("que quieres modificar el nombre, el apellido o " +
                        "la direccion?").toLowerCase();
                if (eleccion.equals("nombre")){
                    String nuevoNombre = JOptionPane.showInputDialog("introduce el nuevo nombre");
                    String consultaSql = "UPDATE '" + nombreDeLaTabla + "' SET nombre = '" + nuevoNombre + "' WHERE id = " + id;
                    statement.executeUpdate(consultaSql);
                    JOptionPane.showMessageDialog(null, "el nombre se cambio correctamente");
                } else if (eleccion.equals("apellido")) {
                    String nuevoApellido = JOptionPane.showInputDialog("introduce el nuevo apellido");
                    String consultaSql = "update '" + nombreDeLaTabla + "' set apellido = '" + nuevoApellido + "' where id = " + id;
                    statement.executeUpdate(consultaSql);
                    JOptionPane.showMessageDialog(null, "el apellido se cambio correctamente");
                } else if (eleccion.equals("direccion")){
                    String nuevaDireccion = JOptionPane.showInputDialog("introduce la nueva direccion");
                    String consultaSql = "update '" + nombreDeLaTabla + "' set direccion = '" + nuevaDireccion + "' where id = " + id;
                    statement.executeUpdate(consultaSql);
                    JOptionPane.showMessageDialog(null, "la direccion se cambio correctamente");
                } else JOptionPane.showMessageDialog(null, "no introduciste lo correcto");
            } else JOptionPane.showMessageDialog(null, "no existe ese id en la database");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void eliminarAlumnos(String nombreDeLaTabla) {
        try (Connection connection = connect()) {
            Statement statement = connection.createStatement();
            int id = Integer.parseInt(JOptionPane.showInputDialog("introduzca el id del alumno a eliminar"));

            String buscarId = "select count(*) from '" + nombreDeLaTabla + "' where id = " + id;
            ResultSet resultSet = statement.executeQuery(buscarId);

            if (resultSet.next()){
                String consultaSql = "delete from '" + nombreDeLaTabla + "' where id = " + id;
                statement.executeUpdate(consultaSql);
                JOptionPane.showMessageDialog(null, "se borro el usuario correctamente");
            } else JOptionPane.showMessageDialog(null, "el id introducido es incorrecto");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void listarAlumnos(String nombreDeLaTabla) {
        try (Connection connection = connect()) {
            Statement statement = connection.createStatement();
            String consultaSql = "select * from '" + nombreDeLaTabla + "'";
            ResultSet resultSet = statement.executeQuery(consultaSql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                String direccion = resultSet.getString("direccion");

                System.out.println("el id es: " + id + " el nombre es: " + nombre + " el apellido es: " + apellido +
                        " y la direccion es: " + direccion);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void buscarAlumno(String nombreDeLaTabla) {
        String busqueda = JOptionPane.showInputDialog("Por qué campo quieres buscar: Id, nombre, apellido, " +
                "nombre y apellido").toLowerCase();
        try (Connection connection = connect()) {
            Statement statement = connection.createStatement();
            String consultaSql = "";

            if (busqueda.equals("id")) {
                int eleccion = Integer.parseInt(JOptionPane.showInputDialog("Introduce el id del usuario"));
                consultaSql = "select * from '" + nombreDeLaTabla + "' where id = '" + eleccion + "'";
            } else if (busqueda.equals("nombre")) {
                String eleccion = JOptionPane.showInputDialog("Introduce el nombre del usuario");
                consultaSql = "select * from '" + nombreDeLaTabla + "' where nombre = '" + eleccion + "'";
            } else if (busqueda.equals("apellido")) {
                String eleccion = JOptionPane.showInputDialog("Introduce el apellido del usuario");
                consultaSql = "select * from '" + nombreDeLaTabla + "' where apellido = '" + eleccion + "'";
            } else if (busqueda.equals("nombre y apellido")) {
                String nombre = JOptionPane.showInputDialog("Introduce parte del nombre del usuario");
                String apellido = JOptionPane.showInputDialog("Introduce parte del apellido del usuario");
                consultaSql = "select * from '" + nombreDeLaTabla + "' where nombre like '%" + nombre + "%' and apellido like" +
                        " '%" + apellido + "%'";
            }
            ResultSet resultSet = statement.executeQuery(consultaSql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                String direccion = resultSet.getString("direccion");
                System.out.println("El id es: " + id + ", el nombre es: " + nombre + ", el apellido es: " + apellido +
                        " y la dirección es: " + direccion);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void crud(String nombreDeLaTabla) {
        String eleccion = JOptionPane.showInputDialog("que quieres hacer: \n      +Añadir alumno()\n      " +
                "+Eliminar alumno\n      +Editar alumno\n      +Listar alumnos").toLowerCase();
        if (eleccion.equals("añadir alumno")) {
            insertarAlumnos(nombreDeLaTabla);
        } else if (eleccion.equals("eliminar alumno")) {
            eliminarAlumnos(nombreDeLaTabla);
        } else if (eleccion.equals("editar alumno")) {
            editarAlumnos(nombreDeLaTabla);
        } else {
            listarAlumnos(nombreDeLaTabla);
        }
    }
}