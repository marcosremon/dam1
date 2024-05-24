package Ejercicio3;
import java.util.Scanner;

public class Principal {
//    En el zip encontrarás un archivo sql y programa funcional que debes modificar. Ejecuta y entiende dicho programa.
//    Crea la base datos supermercado, e importa el script sql.
//    Se desea modificar dicho programa para que cuando arranque cargue desde la base de datos
//    los datos existentes, y acabe guardando en la misma, para ello se pide:
//           Cargar la lista de Clientes (tabla clientes) (0,5 puntos)
//           Cargar la lista de Productos (tabla productos) (0,25 puntos)
//           Incorporar una opción al programa principal que solicite un importe al usuario y que muestre los
//              productos que tienen un importe superior al introducido (1 punto)
//           Cargar la lista de Carros. Para ello, tenéis la tabla carro en la BBDD que asocia un cliente con los
//              productos que tiene en su carro. Vamos a suponer que un cliente no
//              puede tener más de un carro. (3 puntos)
//           Implementa la opción de añadir un producto, guardando el producto dado de alta en la BBDD. (0.25 puntos)
//           Implementa la opción añadir un cliente, guardando el producto dado de alta en la BBDD. (0.25 puntos)
//           Implementa la opción “Realiza una compra” guardando los datos en la base de datos. (1,5 puntos)

    public static final int OPCION_ANADE_PRODUCTO = 1;
    public static final int OPCION_MUESTRA_PRODUCTOS = 2;
    public static final int OPCION_ANADE_CLIENTE = 3;
    public static final int OPCION_MUESTRA_CLIENTES = 4;
    public static final int OPCION_COMPRA = 5;
    public static final int OPCION_MUESTRA_CARROS = 6;
    public static final int OPCION_MUESTRA_CARROS_PRECIO = 7;
    public static final int OPCION_SALIR = 8;

    public static void mostrarMenu() {
        System.out.println("==================================================");
        System.out.println(" Chomon ONLINE ");
        System.out.println("==================================================");
        System.out.println("1.-  Añade producto");
        System.out.println("2.-  Muestra productos");
        System.out.println("3.-  Añade cliente");
        System.out.println("4.-  Muestra clientes");
        System.out.println("5.-  Realiza compra");
        System.out.println("6.-  Muestra carros");
        System.out.println("7.-  Muestra carros precio");
        System.out.println("8.-  Salir");
        System.out.println("==================================================");
        System.out.print("Introduce una opción: ");
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc;
        int opcion;
        ListaProductos miListaProductos = new ListaProductos();
        ListaPersonas miListaClientes = new ListaPersonas();
        ListaCarros miListaCarros = new ListaCarros();

        Producto productoAux;
        Persona clienteAux;
        Carro carroAux;

        do {
            mostrarMenu();
            sc = new Scanner(System.in);
            opcion = sc.nextInt();
            switch (opcion) {
                case OPCION_ANADE_PRODUCTO: {
                    System.out.println("Alta de producto: ");
                    productoAux = new Producto();
                    productoAux.alta();
                    miListaProductos.anadirProducto(productoAux);
                    break;
                }
                case OPCION_MUESTRA_PRODUCTOS: {
                    System.out.println("Listado de productos: ");
                    miListaProductos.mostrarProductos();
                    break;
                }
                case OPCION_ANADE_CLIENTE : {
                    System.out.println("Alta de cliente: ");
                    clienteAux = new Persona();
                    clienteAux.alta();
                    miListaClientes.anadirPersona(clienteAux);
                    break;
                }
                case OPCION_MUESTRA_CLIENTES : {
                    System.out.println("Listado de personas: ");
                    miListaClientes.mostrarPersonas();
                    break;
                }
                case OPCION_COMPRA : {
                    System.out.println("Selecciona un cliente de la lista: ");
                    miListaClientes.mostrarPersonas();
                    int numero = sc.nextInt();
                    if (numero >= 0 && numero <= miListaClientes.numeroPersonas()) {
                        carroAux = new Carro();
                        carroAux.setCliente(miListaClientes.personaPosicionI(numero));
                        carroAux.compra(miListaProductos);
                        miListaCarros.anadirCarro(carroAux);
                    } else {
                        System.out.println("Introduce un número de producto válido");
                    }
                    break;
                }
                case OPCION_MUESTRA_CARROS : {
                    System.out.println("Carros dados de alta");
                    miListaCarros.mostrarCarros();
                    break;
                }
                case OPCION_MUESTRA_CARROS_PRECIO : {
                    System.out.println("Carros con información específica: ");
                    miListaCarros.mostrarCarrosPrecio();
                    break;
                }
                case OPCION_SALIR : {
                    System.out.println("Fin del programa. Recuerda pulsar ALT+F4 para cerrar la ventana");
                    break;
                }
                default : {
                    System.out.println("Introduce una opción válida");
                    break;
                }
            }

        } while (opcion != OPCION_SALIR);

    }

}
