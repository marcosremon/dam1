package Utilizacion_de_objetos_Ejercicios_1.ejercicio8;

public class main {

    //Ejercicio 8:
    //Crea un programa para procesar datos de viviendas; define las siguientes variables
    //enteras precio y superficie y la variable booleana tieneGaraje. El programa deberá
    //pedir al usuario que introduzca los valores para estas tres variables. Declara la variable
    //booleana meInteresa cuyo valor será:
    //   Verdadero. Si el precio es menor a 150.000 €, la superficie es mayor que 80m cuadrados y la
    //     vivienda tiene garaje.
    //   Falso. En caso contrario.
    //     El programa mostrará el valor de meInteresa por consola para visualizar si estamos o
    //     no interesados en la vivienda.

    public static void main(String[] args) {
        Vivienda vivienda = new Vivienda(130000, 90,true);
        System.out.println("el interes en la vivienda es: " + vivienda.meInteresa());
    }
}
