package Taller.Clase;

import Taller.Abstract_Class.Vehiculos;

public class Coches extends Vehiculos {
    int altura; //en cm
    int anchura; //en cm

    public Coches(String matricula, String marca, String modelo, int altura, int anchura) {
        super(matricula, marca, modelo);
        this.altura = altura;
        this.anchura = anchura;
    }
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("la matricula del coche es " + getMatricula() + " la marca es " + getMarca() +
                " el modelo es " + getModelo() + " la altura del coche en centimetros es " + getAltura() +
                " y la anchura en centimetros es " + getAnchura());
    }
}
