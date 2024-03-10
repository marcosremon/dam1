package Taller.Clase;

import Taller.Abstract_Class.Vehiculos;

public class Motos extends Vehiculos {
    boolean limitador;

    public Motos(String matricula, String marca, String modelo, boolean limitador) {
        super(matricula, marca, modelo);
        this.limitador = limitador;
    }

    public boolean isLimitador() {
        return limitador;
    }

    public void setLimitador(boolean limitador) {
        this.limitador = limitador;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("la matricula de la moto es " + getMatricula() + " la marca es " + getMarca() +
                " el modelo es " + getModelo() + " ,¿el vehiculo tiene limitador? -> " + isLimitador());
    }
}
