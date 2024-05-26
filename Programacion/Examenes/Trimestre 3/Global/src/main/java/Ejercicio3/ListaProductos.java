package Ejercicio3;
import Metodos.ConexionDataBaseEjercicio3;

import java.security.PublicKey;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * Clase gestión de lista de Productos
 */
/**
 *
 *
 */
public class ListaProductos {

    private ArrayList<Producto> lista;

    public ArrayList<Producto> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Producto> lista) {
        this.lista = lista;
    }

    public ListaProductos() {
        lista = new ArrayList();
    }

    public void anadirProducto(Producto p) {
        lista.add(p);
    }

    public void mostrarProductos() {
        ConexionDataBaseEjercicio3 conexionDataBaseEjercicio3 = new ConexionDataBaseEjercicio3();
        Producto producto = new Producto();

        try (Connection connection = conexionDataBaseEjercicio3.connect()) {
            String listarProductos = "select * from productos";
            PreparedStatement listarProductosPs = connection.prepareStatement(listarProductos);
            ResultSet listarProductosRs = listarProductosPs.executeQuery();

            while (listarProductosRs.next()) {
                String codigo = listarProductosRs.getString(1);
                String nombre = listarProductosRs.getString(2);
                String descripcion = listarProductosRs.getString(3);
                String marca = listarProductosRs.getString(4);
                double precio = listarProductosRs.getDouble(5);

                lista.add(producto = new Producto(codigo, nombre, descripcion, marca, precio));
                System.out.println(producto);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int numeroProductos() {
        return (lista.size());
    }

    public void mostrarProductosNombre(String nombre) {
        for (Producto p : lista) {
            if (p.getNombre().equals(nombre)) {
                System.out.println(p);
            }
        }
    }

    public Producto productoPosicionI(int i) {
        return (lista.get(i));
    }

    public double precioLista() {
        double suma = 0.0;
        for (Producto p : lista) {
            suma = suma + p.getPrecio();
        }
        return suma;
    }

    @Override
    public String toString() {
        return "ListaProductos{" + "lista=" + lista + '}';
    }

    public Producto buscarProcuctoCodigo(String codigo) {
        Producto resultado = null;
        for (Producto p : lista) {
            if (p.getCodigo().equals(codigo)) {
                resultado = p;
            }
        }
        return resultado;
    }
}
