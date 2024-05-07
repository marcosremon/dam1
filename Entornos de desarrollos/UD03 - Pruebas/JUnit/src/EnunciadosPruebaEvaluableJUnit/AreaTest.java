package EnunciadosPruebaEvaluableJUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AreaTest {

    private Rectangulo rectangulo;
    private Triangulo triangulo;

    @BeforeEach
    public void crearRectanguloYTriangulo() {
        rectangulo = new Rectangulo(4, 5);
        triangulo = new Triangulo(3, 4);
    }

    @Test
    public void rectanguloGetterSetters() {
        rectangulo.setBase(6);
        rectangulo.setAltura(7);
        assertEquals(6, rectangulo.getBase(), 0);
        assertEquals(7, rectangulo.getAltura(), 0);
    }

    @Test
    public void rectanguloArea() {
        assertEquals(20, rectangulo.CalcularAreaRectangulo(), 0);
    }

    @Test
    public void rectanguloLadosIguales() {
        assertFalse(rectangulo.sonLadosIguales());
    }

    @Test
    public void rectanguloMensajeLadosIguales() {
        rectangulo.setBase(3);
        rectangulo.setAltura(3);
        assertTrue(rectangulo.sonLadosIguales());
        System.out.println("El rectángulo es un cuadrado");
    }

    @Test
    public void trianguloGetterSetter() {
        triangulo.setBase(5);
        triangulo.setAltura(6);
        assertEquals(5, triangulo.getBase(), 0);
        assertEquals(6, triangulo.getAltura(), 0);
    }

    @Test
    public void testTrianguloArea() {
        assertEquals(6, triangulo.CalcularAreaTriangulo(), 0);
    }

    @Test
    public void testCuadradoArea() {
        Cuadrado cuadrado = new Cuadrado(4);
        assertEquals(16, cuadrado.CalcularAreaCuadrado(), 0);
    }

    @Test
    public void testCirculoArea() {
        Circulo circulo = new Circulo(3);
        assertEquals(28.27, circulo.CalcularAreaCirculo(), 0.01);
    }
}