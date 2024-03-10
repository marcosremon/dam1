package EjerciciosPOO_Bloque_01.ejercicio5;

import java.util.Scanner;

public class Calculadora {
    Scanner scanner = new Scanner(System.in);
    double numero1;
    double numero2;
    public Calculadora() {
        System.out.print("introduce el primer numero: ");
        this.numero1 = scanner.nextDouble();
        System.out.print("introduce el segundo numero: ");
        this.numero2 = scanner.nextDouble();
    }
    public String suma() {
        return "la suma de los numeros es: " + (this.numero1 + this.numero2);
    }
    public String resta() {
        return "la suma de los numeros es: " + (this.numero1 - this.numero2);
    }
    public String division() {
        return "la division de los numeros es: " + (this.numero1 / this.numero2);
    }
    public String multiplicacion() {
        return "la multiplicacion de los numeros es: " + (this.numero1 * this.numero2);
    }
}
