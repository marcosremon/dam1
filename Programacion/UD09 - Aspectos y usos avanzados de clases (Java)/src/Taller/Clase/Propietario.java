package Taller.Clase;

import Taller.Abstract_Class.Persona;

public class Propietario extends Persona {
    protected String direccion;

    public Propietario(String dni, String nombre, String primerApellido, String direccion) {
        super(dni, nombre, primerApellido);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("soy el propietario con dni " + getDni() + " mi nombre es " + getNombre() + " mi primer " +
                " apaellido es " + getPrimerApellido() + " y mi direccion es " + getDireccion());
    }
}
