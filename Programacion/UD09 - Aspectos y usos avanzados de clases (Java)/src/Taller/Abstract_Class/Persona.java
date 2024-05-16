package Taller.Abstract_Class;

public abstract class Persona {
    protected String dni;
    protected String nombre;
    protected String primerApellido;

    public Persona(String dni, String nombre, String primerApellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    public abstract void mostrarInfo();
}
