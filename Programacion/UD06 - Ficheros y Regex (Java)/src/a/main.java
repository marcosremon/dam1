package a;

public class main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("circulo1", 4);
        Rectangulo rectangulo = new Rectangulo("rectangulo", 4, 3);
        circulo.mostrarInfo();
        rectangulo.mostrarInfo();
    }
}
