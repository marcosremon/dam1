package EjerciciosPOO_Bloque_01.ejercicio4;

public class Triangulo {
    double base;
    double ladoIzquierda;
    double ladoDerecha;
    public Triangulo(double base, double ladoIzquierda, double ladoDerecha) {
        this.base = base;
        this.ladoIzquierda = ladoIzquierda;
        this.ladoDerecha = ladoDerecha;
    }

    public double getbase() {
        return base;
    }

    public void setbase(double base) {
        this.base = base;
    }

    public double getladoIzquierda() {
        return ladoIzquierda;
    }

    public void setladoIzquierda(double ladoIzquierda) {
        this.ladoIzquierda = ladoIzquierda;
    }

    public double getladoDerecha() {
        return ladoDerecha;
    }

    public void setladoDerecha(double ladoDerecha) {
        this.ladoDerecha = ladoDerecha;
    }
    public String ladoMasGrande(){
        double ladoMasGrande = Math.max(Math.max(this.base, this.ladoIzquierda), this.ladoDerecha);
        return "el lado mas grande es de: " + ladoMasGrande;
    }
    public String tipoTriangulo(){
        if (this.base == this.ladoIzquierda && this.base == this.ladoDerecha) {
            return "este triangulo es equilatero";
        } else if (this.base != this.ladoIzquierda && this.base != this.ladoDerecha) {
            return "este es un triangulo escaleno";
        } else return "este triangulo es isosceles";
    }
}
