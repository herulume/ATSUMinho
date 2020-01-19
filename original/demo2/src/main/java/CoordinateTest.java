import org.evosuite.shaded.org.mockito.internal.matchers.Null;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoordinateTest {

    @Test
    void getDistancia1() {
        Coordinate c1 = new Coordinate(20,20);
        Coordinate c2 = new Coordinate(5,5);

        assertEquals(21.2132, c1.getDistancia(c2));
    }

    @Test
    void getDistancia2() {
        Coordinate c1 = new Coordinate(20,20);
        Coordinate c2 = null;

        try {
            double t = c1.getDistancia(c2);
            assertFalse(true);
        }
        catch (NullPointerException exception) {
            assertTrue(true);
        }
    }

    @Test
    void testEquals1() {
        Coordinate c1 = new Coordinate(15,20);
        Coordinate c2 = new Coordinate(10,2);

        assertFalse(c1.equals(c2));
    }

    @Test
    void testEquals2() {
        Coordinate c1 = new Coordinate(15,20);
        Coordinate c2 = null;

        try {
            assertFalse(c1.equals(c2));
        }
        catch(NullPointerException exception){
            assertTrue(true);
            }
    }

    @Test
    void testEquals3() {
        Coordinate c1 = new Coordinate(15,20);
        Coordinate c2 = null;

        try {
            assertFalse(c2.equals(c1));
        }
        catch(NullPointerException exception){
            assertTrue(true);
        }
    }

}