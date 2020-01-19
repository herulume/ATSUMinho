import java.util.GregorianCalendar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class AluguerTest {

    @Test
    void testEquals() {
        Aluguer al1 = new Aluguer();
        Aluguer al2 = new Aluguer("a","b", new GregorianCalendar(), new GregorianCalendar(), 0,0,0, new Coordinate(0,1), 1, false, true, false, true, 5);

        assertFalse(al1.equals(al2));
    }
}