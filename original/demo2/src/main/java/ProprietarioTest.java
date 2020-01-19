import org.junit.jupiter.api.Test;

import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class ProprietarioTest {

    @Test
    void testEquals() {
        Proprietario p1 = new Proprietario("Roger Bro", "123123","pi@pi.pt","1111","avenida de braga", new GregorianCalendar());
        Proprietario p2 = new Proprietario();

        assertNotEquals(p1,p2);
    }
}