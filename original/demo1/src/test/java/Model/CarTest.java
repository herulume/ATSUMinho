package Model;

import Utils.Point;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CarTest {

    @Test
    public void testCarType(){
        Car c = new Car("", new Owner("", "", "", 0, ""),
                Car.CarType.electric, 1,1,1,1, new Point(1.1,1.1),
                "");
        assertEquals(Car.CarType.electric, c.getType());
    }

    @Test
    public void testHasRange(){
        Car c = new Car("", new Owner("", "", "", 0, ""),
                Car.CarType.electric, 1,1,1,1, new Point(1.1,1.1),
                "");
        assertFalse(c.hasRange(new Point(50.1, 50.1)));
    }
}
