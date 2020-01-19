import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CarroGasolinaTest {

    @Test
    void testEquals() {
        CarroGasolina car1 = new CarroGasolina();
        CarroGasolina car2 = new CarroGasolina("tes","tadw","2e2",12,1,300,15,new Coordinate(0,15),false, 15, new ArrayList<ParDatas>());

        assertFalse(car1.equals(car2));
    }
}