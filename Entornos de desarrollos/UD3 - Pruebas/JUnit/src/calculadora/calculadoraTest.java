package calculadora;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class calculadoraTest {
    @Test
    public void testSuma() {
        calculadora calcu = new calculadora(20, 10);
        int resultado = calcu.suma();
        assertEquals(30, resultado);
    }

    @Test
    public void testResta() {
        calculadora calcu = new calculadora(20, 10);
        int resultado = calcu.resta();
        assertEquals(10, resultado);
    }
    @Test
    public void testmultiplica() {
        calculadora calcu = new calculadora(20, 10);
        int resultado = calcu.multiplica();
        assertEquals(200, resultado);
    }
    @Test
    public void testdivide() {
        calculadora calcu = new calculadora(20, 10);
        int resultado = calcu.divide2();
        assertEquals(2, resultado);
    }
}