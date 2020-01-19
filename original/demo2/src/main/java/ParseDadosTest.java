import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class ParseDadosTest {

    @Test
    void parseProprietario1() {
        String in = "Roger Bro,1234,pi@pi.pt,avenida de braga";
        Proprietario p = ParseDados.parseProprietario(in);
        assertEquals(p.getNIF(), "1234");
        assertEquals(p.getEmail(), "pi@pi.pt");
        assertEquals(p.getMorada(), "avenida de braga");
        assertEquals(p.getNome(), "Roger Bro");
    }

    @Test
    void parseProprietario2() {
        String in = "Roger Bro,pi@pi.pt,1234,avenida de braga";
        Proprietario p = ParseDados.parseProprietario(in);
        assertEquals(p.getNome(),"Roger Bro");
        assertNotEquals(p.getNIF(),"1234");
        assertNotEquals(p.getEmail(), "pi@pi.pt");
        assertEquals(p.getMorada(), "avenida de braga");
    }

    @Test
    void parseProprietario3() {
        String in = "";
        try{
            Proprietario p = ParseDados.parseProprietario(in);
            fail();
        }
        catch (ArrayIndexOutOfBoundsException exception){
            assertTrue(true);
        }

    }

    @Test
    void parseCliente1() {
        String in = "Roger Bro,1234,pi@pi.pt,avenida de braga,14,32";
        Cliente c = ParseDados.parseCliente(in);
        assertEquals("1234", c.getNIF());
        assertEquals(c.getEmail(),"pi@pi.pt");
        assertEquals(c.getMorada(), "avenida de braga");
        assertEquals(c.getNome(), "Roger Bro");
        assertEquals(c.getPosicao(),new Coordinate(14,32));
    }

    @Test
    void parseCliente2() {
        String in = "Roger Bro,1234,pi@pi.pt,14,avenida de braga,32";

        try {
            Cliente c = ParseDados.parseCliente(in);
            fail();
        } catch (NumberFormatException exception){
            assertTrue(true);
        }
    }

    @Test
    void parseCliente3() {
        String in = "";
        try{
            Cliente c = ParseDados.parseCliente(in);
            fail();
        } catch (ArrayIndexOutOfBoundsException exception){
            assertTrue(true);
        }
    }

    @Test
    void parseVeiculo1() {
        String in = "Electrico,volvo,ax-2e-xw,123123,1,2,3,4,5,6";
        Veiculo v = ParseDados.parseVeiculo(in);

        assertTrue(v instanceof CarroEletrico);
        assertEquals("volvo",v.getMarca());
        assertEquals("ax-2e-xw",v.getMatricula());
        assertEquals("123123",v.getNIF());
        assertEquals(1,v.getVelocidade());
        assertEquals(2,v.getPreco());
        assertEquals(3,v.getConsumo());
        assertEquals(4,v.getAutonomia());
        assertEquals(new Coordinate(5,6),v.getPosicao());
    }

    @Test
    void parseVeiculo2() {
        String in = "Hibrido,volvo,ax-2e-xw,123123,1,2,3,4,5,6";
        Veiculo v = ParseDados.parseVeiculo(in);

        assertTrue(v instanceof CarroHibrido);
        assertEquals("volvo",v.getMarca());
        assertEquals("ax-2e-xw",v.getMatricula());
        assertEquals("123123",v.getNIF());
        assertEquals(1,v.getVelocidade());
        assertEquals(2,v.getPreco());
        assertEquals(3,v.getConsumo());
        assertEquals(4,v.getAutonomia());
        assertEquals(new Coordinate(5,6),v.getPosicao());
    }

    @Test
    void parseVeiculo3() {
        String in = "Gasolina,volvo,ax-2e-xw,123123,1,2,3,4,5,6";
        Veiculo v = ParseDados.parseVeiculo(in);

        assertTrue(v instanceof CarroGasolina);
        assertEquals("volvo",v.getMarca());
        assertEquals("ax-2e-xw",v.getMatricula());
        assertEquals("123123",v.getNIF());
        assertEquals(1,v.getVelocidade());
        assertEquals(2,v.getPreco());
        assertEquals(3,v.getConsumo());
        assertEquals(4,v.getAutonomia());
        assertEquals(new Coordinate(5,6),v.getPosicao());
    }

    @Test
    void parseVeiculo4() {
        String in = "";
        try{
            Veiculo v = ParseDados.parseVeiculo(in);
            assertEquals(new CarroEletrico(), v);
        }catch (IndexOutOfBoundsException exception){
            fail();
        }
    }

}