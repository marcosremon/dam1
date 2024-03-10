package EjerciciosPOO_Bloque_01.ejercicio1;

public class Persona {
    String nombre;
    int edad;
    String dni;

    public Persona() {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
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
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                '}';
    }

    public void mayorEdad(){
        if (this.edad >= 18) {
            System.out.println("es mayora deedad");
        } else System.out.println("no es mayor deedad");
    }
}
