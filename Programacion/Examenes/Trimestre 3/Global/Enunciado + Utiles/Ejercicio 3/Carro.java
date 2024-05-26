package org.iesch;
import java.util.Scanner;


/**
 *
 * @author admin
 */
public class Carro {
    
  
    private Persona cliente;
    private ListaProductos misProductos;
    
    public Carro () {
        misProductos = new ListaProductos();
    }
    

    /**
     * @return the cliente
     */
    public Persona getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the productos
     */
    public ListaProductos getProductos() {
        return misProductos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(ListaProductos productos) {
        this.misProductos = productos;
    }
    
    public void compra (ListaProductos todos) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce los datos para esta compra ---> ");
        char opcionChar = 's';
        int numero;
        while (opcionChar != 'n') {
            System.out.print("Quieres introducir un nuevo producto(S/N):");
            opcionChar = sc.next().toLowerCase().charAt(0);
            if (opcionChar != 'n') {
                System.out.println("Estos son los productos disponibles:");
                todos.mostrarProductos();
                System.out.print("Selecciona un producto de la lista: ");
                numero = sc.nextInt();
                if (numero >= 0 && numero <= todos.numeroProductos()) {
                    misProductos.anadirProducto(todos.productoPosicionI(numero));
                } else {
                    System.out.println("Introduce un número de producto válido");
                }
            }
        }
        
    }
    
    public void anadirProducto(Producto p) {
        misProductos.anadirProducto(p);
    }
    

    @Override
    public String toString() {
        return "Carro{" + "cliente=" + cliente + ", misProductos=" + misProductos + '}';
    }
    
    
    
    public double precioCarro() {
        return misProductos.precioLista();
    }
    
}
