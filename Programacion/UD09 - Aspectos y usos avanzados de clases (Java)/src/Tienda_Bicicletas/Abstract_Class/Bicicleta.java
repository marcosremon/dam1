package Tienda_Bicicletas.Abstract_Class;

import Tienda_Bicicletas.Interf.Pintar;

public abstract class Bicicleta implements Pintar {
    String tipo;
    String color;
    double precio;

    public Bicicleta(String tipo, String color, double precio) {
        this.tipo = tipo;
        this.color = color;
        this.precio = precio;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public abstract void mostrarInfo();

    @Override
    public void pintar(String color) {
        this.color = color;
        this.precio += PRECIO;
    }
}
