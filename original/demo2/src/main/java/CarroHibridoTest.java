import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CarroHibridoTest {

    @Test
    void testEquals() {
        CarroHibrido car1 = new CarroHibrido();
        CarroHibrido car2 = new CarroHibrido("tes","tadw","2e2",12,1,300,15,new Coordinate(0,15),false, 15, new ArrayList<ParDatas>());

        assertFalse(car1.equals(car2));
    }

}