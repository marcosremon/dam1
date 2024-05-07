package Utilizacion_de_objetos_Ejercicios_1.Ejercicio4;

//Ejercicio 4:
//El método ramdom de la clase Math devuelve números reales aleatorios entre 0 y 1.
//  a. Basándote en este comportamiento crea un programa que devuelva un
//     número entero aleatorio entero entre 0 y 100.
//  b. Modifica el programa para pedir al usuario un número entero positivo y el
//     programa devuelva tres números enteros aleatorios entre 0 y el número
//     elegido por el usuario.
//  c. Modifica el programa para pedir al usuario dos números enteros positivos y el
//     programa devuelva tres números enteros aleatorios entre los dos números
//     elegidos por el usuario.

public class main {
    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
        operaciones.ejercicioA();
        operaciones.ejercicioB(50);
        operaciones.ejercicioC(50, 100);
    }
}
