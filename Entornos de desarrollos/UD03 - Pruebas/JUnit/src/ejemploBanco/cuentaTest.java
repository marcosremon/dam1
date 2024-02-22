
import ejemploBanco.cuenta;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class cuentaTest {

    @Test
    void testGetSaldo() {
        cuenta cuenta1 = new cuenta("ES21099865462528660871295",100);
        float saldo = cuenta1.getSaldo();
        //assertEquals(100, saldo)
        assertEquals(10, saldo, "ojo no va");
    }

    @Test
    void testSetSaldo() {
        cuenta cuenta1 = new cuenta("ES21099865462528660871295",0);
        cuenta1.setSaldo(100);
        assertEquals(100, cuenta1.getSaldo());
    }
}
