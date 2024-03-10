package Utilizacion_de_objetos_Ejercicios_1.ejercicio5;

public class ProductoSinOverFlow {
    int numero1;
    int numero2;

    public ProductoSinOverFlow() {
    }

    public int getNumero1() {
        return numero1;
    }
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
    public int getNumero2() {
        return numero2;
    }
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    public void productoSinOverflow(int numero1, int numero2) {
        int producto = Math.multiplyExact(numero1, numero2);
        System.out.println("el producto entre " + numero1 + " y " +  numero2 + " es: " + producto);
    }
}
