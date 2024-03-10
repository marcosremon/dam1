package Ejercicio2_Ejercicios_Repaso_Java;

public class main {

    //Ejercicio 2:
    //Crea una clase base Figura que tenga dos métodos: área y perímetro, ambos deben retornar 0
    //por defecto. Esta clase debe tener un constructor que acepte un nombre para la figura.
    //Luego, crea dos clases: Círculo y Rectángulo. Ambas deben heredar de Figura y sobrescribir los
    //métodos área y perímetro para que retornen los valores correctos para cada figura.
    //Para Círculo, el constructor debe aceptar el radio del círculo. Para Rectángulo, el constructor
    //debe aceptar la longitud y el ancho. Finalmente, crea una función imprimir_info_figura que acepte
    //una instancia de Figura, e imprima el nombre, el área y el perímetro de la figura. Esta
    //función debe ser capaz de aceptar cualquier subclase de Figura. También debes implementar el método
    //toString para todas las clases y los métodos get y set.

    public static void main(String[] args) {
        Circulo circulo = new Circulo("circulo1", 4);
        Rectangulo rectangulo = new Rectangulo("rectangulo", 4, 3);
        circulo.mostrarInfo();
        rectangulo.mostrarInfo();
    }
}
