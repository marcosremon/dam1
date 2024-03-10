package Taller.Clase;

import Taller.Abstract_Class.Persona;
import Taller.Abstract_Class.Vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Clientes extends Persona {
    protected String telefono;
    List<Vehiculos> vehiculos = new ArrayList<>();

    public Clientes(String dni, String nombre, String primerApellido, String telefono) {
        super(dni, nombre, primerApellido);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        System.out.println("soy un cliente con dni " + getDni() + " mi nombre es " + getNombre() + " mi primer " +
                "apaellido es " + getPrimerApellido() + " y mi telefono es " + getTelefono());
        return null;
    }

    @Override
    public void mostrarInfo() {
        System.out.println();
        System.out.println("soy un cliente con dni " + getDni() + " mi nombre es " + getNombre() + " mi primer " +
                "apaellido es " + getPrimerApellido() + " y mi telefono es " + getTelefono());
        System.out.println("los vehiculos que tiene el cliente: " + getNombre() + " son:");
        for (Vehiculos j : vehiculos) {
            System.out.print("    +");
            j.mostrarInfo();
        }
    }
    public void anyadirVehiculo(Vehiculos vehiculo) {
        if (!vehiculos.contains(vehiculo)) {
            vehiculos.add(vehiculo);
        } else System.out.println("ya tienes el vehiculo en la lista");
    }
}
