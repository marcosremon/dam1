
import ejemploBanco2.cuenta2;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class cuentaTest2 {
    private cuenta2 cta;

    @BeforeEach
    public void nuevacuenta2() {
        cta = new cuenta2("ES21099865462528660871295",100);
    }

    @Test
    void testGetSaldo() {
        cuenta2 cuenta2 = new cuenta2("ES21099865462528660871295",100);
        float saldo = cuenta2.getSaldo();
        //assertEquals(100, saldo)
        assertEquals(10, saldo, "ojo no va");
    }

    @Test
    void testSetSaldo() {
        cuenta2 cuenta1 = new cuenta2("ES21099865462528660871295",0);
        cuenta1.setSaldo(100);
        assertEquals(100, cuenta1.getSaldo());
    }
}
