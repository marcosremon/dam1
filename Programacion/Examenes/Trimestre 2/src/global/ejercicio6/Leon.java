package global.ejercicio6;

public class Leon extends Animales implements Carnivoro{
    public Leon(String nombre) {
        super(nombre);
    }

    @Override
    public Object comunicarse() {
        return null;
    }

    @Override
    public String dieta() {
        return "el leon " + getNombre() + " se alimenta de carne";
    }
}
