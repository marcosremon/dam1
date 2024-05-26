package org.iesch;
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

    public ListaProductos() {
        lista = new ArrayList();
    }

    public void anadirProducto(Producto p) {
        lista.add(p);
    }

    public void mostrarProductos() {
        int i = 0;
        for (Producto p : lista) {
            System.out.println("" + i + " - " + p);
            i++;
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
