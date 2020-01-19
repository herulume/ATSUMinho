import com.sun.security.ntlm.Client;
import com.sun.security.ntlm.NTLMException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class ComparadorKmTest {

    private final ComparadorKm comparator = new ComparadorKm();

    @Test
    public void negative1()
    {
        try
        {
            Cliente cl1 = new Cliente();
            comparator.compare(null, cl1);
            assertFalse(true);
        }
        catch(NullPointerException exception)
        {
            // The NullPointerException is the expected result.
            assertTrue(true);
        }
    }

    @Test
    public void negative2()
    {
        Cliente cl1 = new Cliente();

        try
        {
            comparator.compare(cl1, null);
            assertFalse(true);
        }
        catch(NullPointerException exception)
        {
            // The NullPointerException is the expected result.
            assertTrue(true);
        }
    }

    @Test
    public void negative3()
    {
        try
        {
            comparator.compare(null, null);
            assertFalse(true);
        }
        catch(NullPointerException exception)
        {
            // The NullPointerException is the expected result.
            assertTrue(true);
        }
    }



    @Test
    void compare1() {
        Cliente cl1 = new Cliente("dwd","212","2wdw","dwdaw","wdwadwad", new GregorianCalendar(), new Coordinate(15,0), 0, 12, 200);
        Cliente cl2 = new Cliente("dwd","212","2wdw","dwdaw","wdwadwad", new GregorianCalendar(), new Coordinate(15,0), 0, 12, 200.1);

        assertEquals(1, comparator.compare(cl1, cl2));
        assertEquals(-1, comparator.compare(cl2,cl1));
        cl1.setNKM(200.1);
        assertEquals(true,cl1.getNKm() == 200.1);
        assertEquals(-1, comparator.compare(cl1,cl2));
    }
}