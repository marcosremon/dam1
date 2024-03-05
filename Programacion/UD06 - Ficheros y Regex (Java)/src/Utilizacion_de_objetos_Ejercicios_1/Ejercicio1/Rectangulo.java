package Utilizacion_de_objetos_Ejercicios_1.Ejercicio1;

public class Rectangulo {
    int base = 0;
    int altura = 0;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void calcularArea() {
        System.out.println("el area del rectangulo es " + this.base * this.altura);
    }
}