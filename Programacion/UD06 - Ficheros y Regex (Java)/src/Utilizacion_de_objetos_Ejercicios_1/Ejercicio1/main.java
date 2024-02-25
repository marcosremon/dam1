package Utilizacion_de_objetos_Ejercicios_1.Ejercicio1;

//Ejercicio 1:
//Realiza un programa que pida al usuario introducir los lados de un rectángulo y calcule su área.

public class main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(4,2);
        rectangulo.setAltura(100);
        System.out.println(rectangulo.getAltura());
        rectangulo.calcularArea();

    }
}