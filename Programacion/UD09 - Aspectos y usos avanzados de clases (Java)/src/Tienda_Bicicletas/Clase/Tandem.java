package Tienda_Bicicletas.Clase;

import Tienda_Bicicletas.Abstract_Class.Bicicleta;

public class Tandem extends Bicicleta {
    int asientos = 2;

    public Tandem(String tipo, String color, double precio, int asientos) {
        super(tipo, color, precio);
        setAsientos(asientos);
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        if (asientos >= 2 && asientos <= 3){
            this.asientos = asientos;
        } else if (asientos > 3) {
            this.asientos = 3;
        } else if (asientos < 2) {
            this.asientos = 2;
        }
    }
    @Override
    public void mostrarInfo() {
        System.out.println("soy una bici tandem mi tipo es " + getTipo() + " mi color es " + getColor() +
                " y valgo " + getPrecio() + " y tengo " + getAsientos() + " asientos");
    }
}
