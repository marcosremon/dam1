package Utilizacion_de_objetos_Ejercicios_1.ejercicio8;

public class Vivienda {
    int precio;
    int superficie;
    boolean tieneGaraje;

    public Vivienda(int precio, int superficie, boolean tieneGaraje) {
        this.precio = precio;
        this.superficie = superficie;
        this.tieneGaraje = tieneGaraje;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public boolean isTieneGaraje() {
        return tieneGaraje;
    }

    public void setTieneGaraje(boolean tieneGaraje) {
        this.tieneGaraje = tieneGaraje;
    }
    public boolean meInteresa() {
        if (this.precio < 150000 && this.superficie > 80 && this.tieneGaraje) {
            return true;
        } else return false;
    }
}
