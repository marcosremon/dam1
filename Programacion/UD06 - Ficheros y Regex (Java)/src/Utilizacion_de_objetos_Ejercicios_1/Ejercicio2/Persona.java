package Utilizacion_de_objetos_Ejercicios_1.Ejercicio2;

public class Persona {
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void saludo() {
        System.out.println("hola!! " + this.nombre);
    }
}
