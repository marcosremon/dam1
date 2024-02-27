package Ejercicio2;

import java.util.Random;

public class Gato extends Animal {
    String raza;

    public Gato() {
        super("hembra");
        this.raza = "siames";
    }

    public Gato(String raza) {
        super("hembra");
        this.raza = raza;
    }

    public Gato(String sexo, String raza) {
        super(sexo);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "raza='" + raza + '\'' +
                '}';
    }
    public Gato Gato (Gato gato) {
        if (this.sexo.equals(gato.sexo)) {
            //Excepcion
            //throw new apareaminetoImoposibleExcepcion("los gatos deben ser de diferente sexo");
        }
        String sexoCria = new Random().nextBoolean() ? "macho" : "hembra";
        return new Gato(sexoCria, this.raza);
    }

    public static void main(String[] args) {
        Gato gato1 = new Gato("machno","persa");
        Gato gato2 = new Gato("hembra","siames");

        //ry {
        //   Gato gato = gato1.a
        //}
    }
}
