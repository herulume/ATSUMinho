import org.junit.jupiter.api.Test;

import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class UtilizadorTest {

    @Test
    void testEquals() {
        Utilizador u1 = new Utilizador();
        Utilizador u2 = new Utilizador("Roger Bro", "123", "pi@pi.pt", "1111","avenida de braga", new GregorianCalendar());

        assertFalse(u1.equals(u2));
    }
}