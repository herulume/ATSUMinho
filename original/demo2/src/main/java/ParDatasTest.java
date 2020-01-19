import org.junit.jupiter.api.Test;

import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class ParDatasTest {

    @Test
    void isAvailable1() {
        ParDatas data2 = new ParDatas(new GregorianCalendar(1998,2,28), new GregorianCalendar(2020,1,10));
        ParDatas data1 = new ParDatas(new GregorianCalendar(2000,6,10), new GregorianCalendar(2019,2,14));

        assertTrue(data1.isAvailable(data2));
    }

    @Test
    void isAvailable2() {
        ParDatas data1 = new ParDatas(new GregorianCalendar(1998,2,28), new GregorianCalendar(2020,1,10));
        ParDatas data2 = new ParDatas(new GregorianCalendar(1997,6,10), new GregorianCalendar(2001,2,14));

        assertFalse(data1.isAvailable(data2));
    }

    @Test
    void testEquals1() {
        ParDatas data1 = new ParDatas(new GregorianCalendar(1998,2,28), new GregorianCalendar(2020,1,10));
        ParDatas data2 = new ParDatas(new GregorianCalendar(1997,6,10), new GregorianCalendar(2001,2,14));

        assertFalse(data1.equals(data2));
    }

    @Test
    void testEquals2() {
        ParDatas data1 = new ParDatas(new GregorianCalendar(1998,2,28), new GregorianCalendar(2020,1,10));
        ParDatas data2 = new ParDatas(new GregorianCalendar(1998,2,28), new GregorianCalendar(2020,1,10));

        assertTrue(data1.equals(data2));
    }

    @Test
    void testEquals3() {
        ParDatas data1 = new ParDatas(new GregorianCalendar(1998,2,28), new GregorianCalendar(2020,1,10));
        ParDatas data2 = new ParDatas(data1.clone());

        assertTrue(data1.equals(data2));
    }
}