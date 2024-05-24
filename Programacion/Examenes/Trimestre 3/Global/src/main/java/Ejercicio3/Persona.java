package Ejercicio3;
import Metodos.ConexionDataBaseEjercicio3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class Persona {
    private String DNI;
    private String nombre;
    private String apellidos;

    public Persona() {
    }

    public Persona(String DNI, String nombre, String apellidos) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI + '}';
    }
    
    public void alta() {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Alta de persona");
        System.out.print("Nombre: ");         nombre = sc.next();
        System.out.print("Apellidos: ");      apellidos = sc.next();
        System.out.print("DNI: ");            DNI = sc.next();

        ConexionDataBaseEjercicio3 conexionDataBase = new ConexionDataBaseEjercicio3();
        try (Connection connection = conexionDataBase.connect()) {
            String insertarUsuario = "insert into clientes values (?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertarUsuario);
            preparedStatement.setString(1,DNI);
            preparedStatement.setString(2,nombre);
            preparedStatement.setString(3,apellidos);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    
}
