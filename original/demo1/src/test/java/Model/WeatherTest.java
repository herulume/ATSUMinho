package Model;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WeatherTest {

    @Test
    public void weatherTest(){
        assertEquals("Winter", (new Weather()).getSeason());
    }
}