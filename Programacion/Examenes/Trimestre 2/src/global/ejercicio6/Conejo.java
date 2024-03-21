package global.ejercicio6;

public class Conejo extends Animales implements Herbivoro{
    public Conejo(String nombre) {
        super(nombre);
    }

    @Override
    public Object comunicarse() {
        return false;
    }

    @Override
    public String dieta() {
        return "el conejo " + getNombre() + " se alimenta de pasto";
    }
}
