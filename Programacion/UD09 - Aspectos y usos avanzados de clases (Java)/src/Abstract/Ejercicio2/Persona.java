package Abstract.Ejercicio2;

public class Persona {
    String nombre;
    String dni;

    public Persona() {
    }
    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ",dni='" + dni + '\'' +
                '}';
    }
}