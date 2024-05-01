package Tienda_Bicicletas.Clase;

import Tienda_Bicicletas.Abstract_Class.Bicicleta;

public class BiciMontanya extends Bicicleta {
    int marcha = 1;
    public BiciMontanya(String tipo, String color, double precio, int marcha) {
        super(tipo, color, precio);
        setMarcha(marcha);
    }
    public int getMarcha() {
        return marcha;
    }
    public void setMarcha(int marcha) {
        if (marcha >= 1 && marcha <= 6){
            this.marcha = marcha;
        } else if (marcha > 6) {
            System.out.println("la marcha maxima es la 'sexta' por ende como introdujiste una marcha mas elevada" +
                    " a 6 se te aplicara la marcha mas alta: '6'");
            this.marcha = 6;
        } else if (marcha < 1) {
            System.out.println("la marcha minima es la 'uno' por ende como introdujiste una marcha menor" +
                    " a '1' se te aplicara la marcha mas baja: '1'");
            this.marcha = 1;
        }
    }
    @Override
    public void mostrarInfo() {
        System.out.println("soy una bici de montaña mi tipo es " + getTipo() + " mi color es " + getColor() +
                " y valgo " + getPrecio() + " voy en marcha " + getMarcha());
    }
    public void aumentarMarcha() {
        if (marcha < 6) {
            marcha++;
        }
    }
    public void dismionuirMarcha() {
        if (marcha > 1) {
            marcha--;
        }
    }
}
