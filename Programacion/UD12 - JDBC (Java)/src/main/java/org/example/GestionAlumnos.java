package org.example;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class GestionAlumnos {
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    public void anyadirDiezAlumnos(String nombreDeLaTabla) {
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement("INSERT INTO `" + nombreDeLaTabla + "` " +
                     "(nombre, apellido, direccion) VALUES (?,?,?)")) {
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
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement("INSERT INTO `" + nombreDeLaTabla + "` " +
                     "(nombre, apellido, direccion) VALUES (?,?,?)")) {
            String nombre = JOptionPane.showInputDialog("Introduce un nombre");
            String apellido = JOptionPane.showInputDialog("Introduce un apellido");
            String direccion = JOptionPane.showInputDialog("Introduce una dirección");

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
            String buscarId = "SELECT COUNT(*) FROM `" + nombreDeLaTabla + "` WHERE id = " + id;
            ResultSet resultSet = statement.executeQuery(buscarId);

            if (resultSet.next()) {
                String eleccion = JOptionPane.showInputDialog("¿Qué quieres modificar: nombre, apellido o " +
                        "dirección?").toLowerCase();
                if (eleccion.equals("nombre")) {
                    String nuevoNombre = JOptionPane.showInputDialog("introduce el nuevo nombre");
                    String consultaSql = "UPDATE `" + nombreDeLaTabla + "` SET nombre = '" + nuevoNombre + "' " +
                            "WHERE id = " + id;
                    statement.executeUpdate(consultaSql);
                    JOptionPane.showMessageDialog(null, "El nombre se cambió correctamente");
                } else if (eleccion.equals("apellido")) {
                    String nuevoApellido = JOptionPane.showInputDialog("introduce el nuevo apellido");
                    String consultaSql = "UPDATE `" + nombreDeLaTabla + "` SET apellido = '" + nuevoApellido + "' " +
                            "WHERE id = " + id;
                    statement.executeUpdate(consultaSql);
                    JOptionPane.showMessageDialog(null, "El apellido se cambió correctamente");
                } else if (eleccion.equals("direccion")) {
                    String nuevaDireccion = JOptionPane.showInputDialog("introduce la nueva dirección");
                    String consultaSql = "UPDATE `" + nombreDeLaTabla + "` SET direccion = '" + nuevaDireccion + "' " +
                            "WHERE id = " + id;
                    statement.executeUpdate(consultaSql);
                    JOptionPane.showMessageDialog(null, "La dirección se cambió " +
                            "correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "No introdujiste lo correcto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existe ese ID en la base de datos");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void eliminarAlumnos(String nombreDeLaTabla) {
        try (Connection connection = connect();
             Statement statement = connection.createStatement()) {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Introduce el id del alumno a eliminar"));
            String buscarId = "SELECT count(*) FROM `" + nombreDeLaTabla + "` WHERE id = " + id;
            ResultSet resultSet = statement.executeQuery(buscarId);

            if (resultSet.next()) {
                statement.executeUpdate("DELETE FROM `" + nombreDeLaTabla + "` WHERE id = " + id);
                JOptionPane.showMessageDialog(null, "Se borró el usuario correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "El id introducido es incorrecto");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void listarAlumnos(String nombreDeLaTabla) {
        try (Connection connection = connect()) {
            Statement statement = connection.createStatement();
            String consultaSql = "select * from " + nombreDeLaTabla;
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
                consultaSql = "select * from `" + nombreDeLaTabla + "` where id = '" + eleccion + "'";
            } else if (busqueda.equals("nombre")) {
                String eleccion = JOptionPane.showInputDialog("Introduce el nombre del usuario");
                consultaSql = "select * from `" + nombreDeLaTabla + "` where nombre = '" + eleccion + "'";
            } else if (busqueda.equals("apellido")) {
                String eleccion = JOptionPane.showInputDialog("Introduce el apellido del usuario");
                consultaSql = "select * from `" + nombreDeLaTabla + "` where apellido = '" + eleccion + "'";
            } else if (busqueda.equals("nombre y apellido")) {
                String nombre = JOptionPane.showInputDialog("Introduce parte del nombre del usuario");
                String apellido = JOptionPane.showInputDialog("Introduce parte del apellido del usuario");
                consultaSql = "select * from `" + nombreDeLaTabla + "` where nombre like '%" + nombre + "%' and " +
                        "apellido like '%" + apellido + "%'";
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
        String eleccion = JOptionPane.showInputDialog("que quieres hacer: \n      +Añadir curso()\n      " +
                "+Eliminar curso\n      +Editar curso\n      +Listar cursos").toLowerCase();
        if (eleccion.equals("añadir curso")) {
            try (Connection connection = connect();
                 PreparedStatement statement = connection.prepareStatement("INSERT INTO `" + nombreDeLaTabla +
                         "` (nombre, instructor) VALUES (?,?)")) {
                String nombre = JOptionPane.showInputDialog("Introduce un nombre");
                String instructor = JOptionPane.showInputDialog("Introduce el instructor");

                statement.setString(1, nombre);
                statement.setString(2, instructor);
                statement.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else if (eleccion.equals("eliminar curso")) {
            try (Connection connection = connect();
                 Statement statement = connection.createStatement()) {
                int id = Integer.parseInt(JOptionPane.showInputDialog("Introduce el id del curso a eliminar"));
                String buscarId = "SELECT count(*) FROM `" + nombreDeLaTabla + "` WHERE id = " + id;
                ResultSet resultSet = statement.executeQuery(buscarId);

                if (resultSet.next()) {
                    statement.executeUpdate("DELETE FROM `" + nombreDeLaTabla + "` WHERE id = " + id);
                    JOptionPane.showMessageDialog(null, "Se borró el curso correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "El id introducido es incorrecto");
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        } else if (eleccion.equals("editar curso")) {
            try (Connection connection = connect()) {
                Statement statement = connection.createStatement();
                int id = Integer.parseInt(JOptionPane.showInputDialog("introduce el id del curso a buscar"));
                String buscarId = "SELECT COUNT(*) FROM `" + nombreDeLaTabla + "` WHERE id = " + id;
                ResultSet resultSet = statement.executeQuery(buscarId);

                if (resultSet.next()) {
                    String elecciones = JOptionPane.showInputDialog("¿Qué quieres modificar: nombre o " +
                            "instructor?").toLowerCase();
                    if (elecciones.equals("nombre")) {
                        String nuevoNombre = JOptionPane.showInputDialog("introduce el nuevo nombre");
                        String consultaSql = "UPDATE `" + nombreDeLaTabla + "` SET nombre = '" + nuevoNombre + "' " +
                                "WHERE id = " + id;
                        statement.executeUpdate(consultaSql);
                        JOptionPane.showMessageDialog(null, "El nombre se cambió " +
                                "correctamente");
                    } else if (elecciones.equals("instructor")) {
                        String nuevoInstructor = JOptionPane.showInputDialog("introduce el nuevo instructor");
                        String consultaSql = "UPDATE `" + nombreDeLaTabla + "` SET instructor = '" +
                                nuevoInstructor + "' WHERE id = " + id;
                        statement.executeUpdate(consultaSql);
                        JOptionPane.showMessageDialog(null, "El instructor se cambió " +
                                "correctamente");
                    } else JOptionPane.showMessageDialog(null, "No introdujiste lo correcto");
                } else {
                    JOptionPane.showMessageDialog(null, "No existe ese ID en la base de " +
                            "datos");
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else {
            try (Connection connection = connect()) {
                Statement statement = connection.createStatement();
                String consultaSql = "select * from " + nombreDeLaTabla;
                ResultSet resultSet = statement.executeQuery(consultaSql);

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String nombre = resultSet.getString("nombre");
                    String instructor = resultSet.getString("instructor");

                    System.out.println("el id es: " + id + " el nombre es: " + nombre + " el apellido es: " +
                            instructor);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}