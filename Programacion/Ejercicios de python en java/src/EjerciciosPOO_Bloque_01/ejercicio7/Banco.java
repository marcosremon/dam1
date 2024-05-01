package EjerciciosPOO_Bloque_01.ejercicio7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Banco {
    Cliente cliente1 = new Cliente("jose", 256);
    Cliente cliente2 = new Cliente("maricarmen", 654);
    Cliente cliente3 = new Cliente("antonio", 897);
    List<Cliente> clientes = new ArrayList<>(Arrays.asList(cliente1, cliente2, cliente3));
    public Cliente buscarCliente(String aBuscar){
        for (Cliente i : clientes) {
            if (i.getNombre().equals(aBuscar)){
                return i;
            }
            if (i.getCantidad()  == Double.parseDouble(aBuscar)){
                return i;
            }
        }
        return null;
    }
    public void operar(Cliente cliente) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("que operacion quieres realizar ¿un ingreso o una retirada? ");
            switch (scanner.nextLine().toLowerCase()) {
                case "ingreso" -> {
                    System.out.print("cuanto quieres ingresar? ");
                    double ingreso = scanner.nextDouble();
                    cliente.setCantidad(cliente.cantidad + ingreso);
                    return;
                }
                case "retirada" -> {
                    System.out.print("cuanto quieres retirar? ");
                    double retirada = scanner.nextDouble();
                    cliente.setCantidad(cliente.cantidad - retirada);
                    return;
                }
                default -> System.out.println("opcion incorrecta");
            }
        }
    }
    public void depositoTotal() {
        System.out.println("el banco tiene un deposito total de: " + (this.cliente1.cantidad + this.cliente2.cantidad
                + this.cliente3.cantidad) + " euros");
    }
}
