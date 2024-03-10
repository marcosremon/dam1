package Taller.Clase;

import Taller.Clase.Clientes;
import Taller.Clase.Propietario;

import java.util.ArrayList;
import java.util.List;

public class ServiTaller {
    private Propietario propietario;
    private String nombre;
    private String direccion;
    List<Clientes> clientes = new ArrayList<>();

    public ServiTaller(String nombre, String direccion, Propietario propietario) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.propietario = propietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void mostrarInfo() {
        System.out.println();
        System.out.println("el nombre del taller es " + getNombre() + " la direccion del taller es " + getDireccion() +
                " el nombre del propietario es " + propietario.getNombre());
        System.out.println("los clientes son los siguientes:");
        for (Clientes j : clientes) {
            System.out.print("    +");
            j.toString();
        }
    }
    public void anyadirCliente(Clientes cliente) {
        if (!clientes.contains(cliente)) {
            clientes.add(cliente);
        } else System.out.println("el cliente ya esta en la lista de clientes");
    }
}
