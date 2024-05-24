package Ejercicio3;



import Metodos.ConexionDataBaseEjercicio3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;



public class Producto {
    
    private String codigo;
    private String nombre;
    private String descripcion;
    private String marca;
    private double precio;
    
    /**
     * Constructor sin parámetros
     */
    public Producto() {
    }
        
    /**
    * Constructor con parámetros
    */
    public Producto(String codigo, String nombre, String descripcion, String marca, double precio) {    
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.marca = marca;
        this.precio = precio;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void alta() {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Alta de producto");
        System.out.print("Nombre: ");         nombre = sc.next();
        System.out.print("Descripción: ");    marca = sc.next();
        System.out.print("Código: ");         codigo = sc.next();
        System.out.print("Marca:");           marca = sc.next();
        System.out.print("Precio: ");         precio = sc.nextDouble();

        ConexionDataBaseEjercicio3 conexionDataBase = new ConexionDataBaseEjercicio3();
        try (Connection connection = conexionDataBase.connect()) {
            String insertarUsuario = "insert into productos values (?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertarUsuario);
            preparedStatement.setString(1,"37843-ASW");
            preparedStatement.setString(2,nombre);
            preparedStatement.setString(3,descripcion);
            preparedStatement.setString(4,marca);
            preparedStatement.setDouble(5, precio);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", marca=" + marca + ", codigo=" + codigo + ", precio=" + precio + '}';
    }

    
}
