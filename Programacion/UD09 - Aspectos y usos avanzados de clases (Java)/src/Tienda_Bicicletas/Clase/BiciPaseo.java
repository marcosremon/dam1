package Tienda_Bicicletas.Clase;

import Tienda_Bicicletas.Abstract_Class.Bicicleta;

public class BiciPaseo extends Bicicleta {
    double velocidadDeCirculacion;

    public BiciPaseo(String tipo, String color, double precio, double velocidadDeCirculacion) {
        super(tipo, color, precio);
        this.velocidadDeCirculacion = velocidadDeCirculacion;
    }
    public double getVelocidadDeCirculacion() {
        return velocidadDeCirculacion;
    }

    public void setVelocidadDeCirculacion(double velocidadDeCirculacion) {
        this.velocidadDeCirculacion = velocidadDeCirculacion;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("soy una bici de paseo mi tipo es " + getTipo() + " mi color es " + getColor() +
                " y valgo " + getPrecio() + " voy a " + getVelocidadDeCirculacion() + " de velocidad");
    }
}
