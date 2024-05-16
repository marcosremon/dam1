package Utilizacion_de_objetos_Ejercicios_1.Ejercicio3;

public class Operaciones {
    int numero;

    public Operaciones(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

   public void raizCuadrada() {
       System.out.println("la raiz cuadrada del numero " + this.numero + " es " + Math.sqrt(this.numero));
   }
}
