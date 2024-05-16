package Utilizacion_de_objetos_Ejercicios_1.ejercicio6;

import java.util.Scanner;

public class Potencia {
    double numero1;
    double numero2;

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void potencia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("introduce el primer numero: ");
        numero1 = scanner.nextDouble();
        System.out.print("introduce el segundo numero: ");
        numero2 = scanner.nextDouble();
        System.out.println("la potencia de elevar " + numero2 + " a " + numero1 + " es " + (Math.pow(numero1, numero2)));
    }
}
