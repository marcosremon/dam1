package Utilizacion_de_objetos_Ejercicios_1.Ejercicio4;

import java.util.Random;

public class Operaciones {
    Random random = new Random();
    public Operaciones() {
        this.random = random;
    }


    //a)
    public void ejercicioA() {
        System.out.println("el numero aleatorio entre 0 y 100 es: " + random.nextInt(101));
    }
    public void ejercicioB(int numero1){
        System.out.println("los tres numeros aleatorios son");
        for (int i = 1; i < 3+1; i++) {
            System.out.println("numero " + i + ": " + random.nextInt(numero1+1) + ", ");
        }
    }
    public void ejercicioC(int numero1, int numero2){
        System.out.println("los tres numeros aleatorios son");
        for (int i = 1; i < 3+1; i++) {
            System.out.println("numero " + i + ": " + random.nextInt(numero1, numero2) + ", ");
        }
    }
}
