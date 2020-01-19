import org.junit.jupiter.api.Test;

import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.*;

class CarroEletricoTest {

    @Test
    void testEquals() {
        CarroEletrico car1 = new CarroEletrico();
        CarroEletrico car2 = new CarroEletrico("tes","tadw","2e2",12,1,300,15,new Coordinate(0,15),false, 15, new ArrayList<ParDatas>());

        assertFalse(car1.equals(car2));
    }
}