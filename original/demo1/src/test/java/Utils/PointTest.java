package Utils;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PointTest {
    @Test
    public void distanceTest0() {
        Point p1 = new Point(0.0, 0.0);
        assertEquals(0.0, p1.distanceBetweenPoints(new Point(0.0,0.0)));
    }

    @Test
    public void distanceTest1() {
        Point p1 = new Point(0.0, 1.0);
        assertEquals(1.0, p1.distanceBetweenPoints(new Point(0.0,0.0)));
    }

    
}