package Utilizacion_de_objetos_Ejercicios_1.ejercicio5;

import Utilizacion_de_objetos_Ejercicios_1.Ejercicio4.Operaciones;

public class main {

    //Ejercicio 5:
    //¿Qué método de la clase Math utilizarías para realizar el producto de dos enteros y
    //asegurarte de que el resultado no hace overflow? Haz un programa que lo pruebe.

    public static void main(String[] args) {
        ProductoSinOverFlow productoSinOverFlow = new ProductoSinOverFlow();
        productoSinOverFlow.productoSinOverflow(5,5);
    }
}
