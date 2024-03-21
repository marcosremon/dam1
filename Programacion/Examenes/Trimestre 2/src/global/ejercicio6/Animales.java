package global.ejercicio6;

public abstract class Animales {
    String nombre;

    public Animales(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public abstract Object comunicarse();
    public abstract String dieta();

}
