import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ComparadorAutonomiaTest {

    private final ComparadorAutonomia comparator = new ComparadorAutonomia();

    @Test
    public void negative1()
    {
        Veiculo car1 = new Veiculo();

        try
        {
            comparator.compare(null, car1);
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
        Veiculo car1 = new Veiculo();

        try
        {
            comparator.compare(car1, null);
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
        Veiculo car1 = new CarroGasolina("tes","tadw","2e2",12,1,300,15,new Coordinate(0,15),false, 15, new ArrayList<ParDatas>());
        Veiculo car2 = new CarroEletrico("tes","tadw","2e2",12,1,300,40,new Coordinate(0,15),false, 15, new ArrayList<ParDatas>());

        assertEquals(-1, comparator.compare(car1, car2));
        assertEquals(1, comparator.compare(car2,car1));
        car2.setAutonomia(15);
        assertEquals(true,car2.getAutonomia() == 15);
        assertEquals(-1, comparator.compare(car1,car2));
    }
}