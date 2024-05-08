package Taller.Main;

import Taller.Clase.*;

public class main {
    public static void main(String[] args) {
        Propietario propietario = new Propietario("12345678A","juan","gutierrez",
                " avAmerica 6");
        ServiTaller taller = new ServiTaller("talleres juan","avSagunto 7", propietario);
        Clientes cliente = new Clientes("23456789B","manuel","ibañez","123456789");
        Clientes cliente2 = new Clientes("32165498C","antonio","mandingo","1234567");
        Coches coche = new Coches("ajhao55","civic","honda",300,100);
        Motos moto = new Motos("ahoñañga555","c-300-gt", "bmw",false);

        taller.anyadirCliente(cliente);
        taller.anyadirCliente(cliente2);
        cliente.anyadirVehiculo(coche);
        cliente.anyadirVehiculo(moto);
        cliente2.anyadirVehiculo(moto);

        taller.mostrarInfo();
        System.out.println();
        propietario.mostrarInfo();
        System.out.println();
        cliente.mostrarInfo();
        System.out.println();
        cliente2.mostrarInfo();

        System.out.println();
        coche.mostrarInfo();
        moto.mostrarInfo();
    }
}
