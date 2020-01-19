import org.junit.jupiter.api.Test;

import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void testEquals() {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente("dwd","212","2wdw","dwdaw","wdwadwad", new GregorianCalendar(), new Coordinate(15,0), 0, 12, 200);

        assertFalse(c1.equals(c2));
    }
}