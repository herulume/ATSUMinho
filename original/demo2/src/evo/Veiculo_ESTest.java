/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 18 19:34:57 GMT 2020
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Veiculo_ESTest extends Veiculo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      Veiculo veiculo1 = new Veiculo(veiculo0);
      veiculo1.setClassificacao(101);
      boolean boolean0 = veiculo1.equals(veiculo0);
      assertEquals(101, veiculo1.getClassificacao());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      veiculo0.setAutonomia(1142);
      Veiculo veiculo1 = new Veiculo();
      boolean boolean0 = veiculo0.equals(veiculo1);
      assertEquals(1142, veiculo0.getAutonomia());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      Veiculo veiculo1 = veiculo0.clone();
      veiculo1.setConsumo((-1175));
      boolean boolean0 = veiculo0.equals(veiculo1);
      assertEquals((-1175.0), veiculo1.getConsumo(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      Veiculo veiculo1 = new Veiculo(veiculo0);
      veiculo0.setPreco((-1));
      boolean boolean0 = veiculo1.equals(veiculo0);
      assertEquals((-1.0), veiculo0.getPreco(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      Veiculo veiculo1 = veiculo0.clone();
      veiculo0.setVelocidade(144);
      boolean boolean0 = veiculo0.equals(veiculo1);
      assertEquals(144, veiculo0.getVelocidade());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1772, 1772, 3512);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      veiculo0.addDatas(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(veiculo0.getDisponibilidade());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      boolean boolean0 = veiculo0.verificaAutonomia(0, 1023);
      assertEquals(0, veiculo0.getAutonomia());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      boolean boolean0 = veiculo0.verificaAutonomia((-1222), (-4814));
      assertEquals(0, veiculo0.getAutonomia());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      veiculo0.setConsumo(1269.7991087448797);
      veiculo0.abastecerVeiculo(0);
      assertEquals(1269.7991087448797, veiculo0.getConsumo(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate((-1581.6248119932297), (-1.0));
      Veiculo veiculo0 = new Veiculo();
      List<ParDatas> list0 = veiculo0.getDatasAlugueres();
      Veiculo veiculo1 = new Veiculo((String) null, "humidity", (String) null, 0, 0, 1.0, 0, coordinate0, false, 0, list0);
      veiculo1.abastecerVeiculo(1.0);
      assertEquals(1, veiculo1.getAutonomia());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate(2607.797405, (-351));
      LinkedList<ParDatas> linkedList0 = new LinkedList<ParDatas>();
      Veiculo veiculo0 = new Veiculo("9}M!CK_#[RcF]|DEx", "9}M!CK_#[RcF]|DEx", "9}M!CK_#[RcF]|DEx", (-351), (-351), (-351), (-351), coordinate0, true, (-351), linkedList0);
      Coordinate coordinate1 = new Coordinate((-351), 70.0);
      int int0 = veiculo0.tempoViagemCarroJa(coordinate1);
      assertEquals(175722, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      Coordinate coordinate0 = new Coordinate(2143781089, 2.0);
      int int0 = veiculo0.tempoViagemCarroJa(coordinate0);
      assertEquals((-222153540), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate(2382.5824262, (-1.0));
      Veiculo veiculo0 = new Veiculo();
      int int0 = veiculo0.tempoAteVeiculoPéJa(coordinate0);
      assertEquals(35739, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate((-922337203685477580L), (-1010.8435));
      Veiculo veiculo0 = new Veiculo();
      int int0 = veiculo0.tempoAteVeiculoPéJa(coordinate0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate((-1.0), (-725.329));
      Veiculo veiculo0 = new Veiculo();
      List<ParDatas> list0 = veiculo0.getDatasAlugueres();
      Veiculo veiculo1 = new Veiculo("", "", "d{~", 1078, 0.15, (-1970.58), (-1115), coordinate0, false, 0, list0);
      int int0 = veiculo1.getVelocidade();
      assertEquals(1078, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      veiculo0.setVelocidade((-614));
      int int0 = veiculo0.getVelocidade();
      assertEquals((-614), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate((-1.0), (-725.329));
      Veiculo veiculo0 = new Veiculo();
      List<ParDatas> list0 = veiculo0.getDatasAlugueres();
      Veiculo veiculo1 = new Veiculo("", "", "d{~", 1078, 0.15, (-1970.58), (-1115), coordinate0, false, 0, list0);
      double double0 = veiculo1.getPreco();
      assertEquals(0.15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate(1341, (-271.06));
      Veiculo veiculo0 = new Veiculo();
      List<ParDatas> list0 = veiculo0.getDatasAlugueres();
      Veiculo veiculo1 = new Veiculo("4Cji", "4Cji", "W{tq+ZQ&i^|", 1341, (-271.06), (-1.0), 1341, coordinate0, true, (-1917), list0);
      double double0 = veiculo1.getPreco();
      assertEquals((-271.06), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      List<ParDatas> list0 = veiculo0.getDatasAlugueres();
      Veiculo veiculo1 = new Veiculo((String) null, (String) null, "", 2464, 2464, 2464, 0, (Coordinate) null, true, 0, list0);
      Veiculo veiculo2 = new Veiculo(veiculo1);
      veiculo2.getPosicao();
      assertEquals(2464.0, veiculo1.getPreco(), 0.01);
      assertEquals(0, veiculo2.getClassificacao());
      assertEquals(2464.0, veiculo1.getConsumo(), 0.01);
      assertEquals(0, veiculo2.getAutonomia());
      assertEquals(2464, veiculo1.getVelocidade());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate(0, 670);
      Veiculo veiculo0 = new Veiculo();
      List<ParDatas> list0 = veiculo0.getDatasAlugueres();
      Veiculo veiculo1 = new Veiculo("}:]s{1?|3h+?UP", "~3H+z", "}:]s{1?|3h+?UP", 0, 0, 0, 670, coordinate0, false, 0, list0);
      Coordinate coordinate1 = veiculo1.getPosicao();
      assertSame(coordinate1, coordinate0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      Coordinate coordinate0 = new Coordinate(1162.04478, (-297.45471504056));
      veiculo0.setPosicao(coordinate0);
      Coordinate coordinate1 = veiculo0.getPosicao();
      assertEquals((-297.45471504056), coordinate1.getLongitude(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      Coordinate coordinate0 = new Coordinate(0, (-1766.3056));
      coordinate0.setLatitude((-1.0));
      veiculo0.setPosicao(coordinate0);
      Coordinate coordinate1 = veiculo0.getPosicao();
      assertSame(coordinate1, coordinate0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate((-1581.6248119932297), (-1.0));
      Veiculo veiculo0 = new Veiculo();
      List<ParDatas> list0 = veiculo0.getDatasAlugueres();
      Veiculo veiculo1 = new Veiculo((String) null, "humidity", (String) null, 0, 0, 1.0, 0, coordinate0, false, 0, list0);
      String string0 = veiculo1.getNIF();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate((-1.0), (-725.329));
      Veiculo veiculo0 = new Veiculo();
      List<ParDatas> list0 = veiculo0.getDatasAlugueres();
      Veiculo veiculo1 = new Veiculo("", "", "d{~", 1078, 0.15, (-1970.58), (-1115), coordinate0, false, 0, list0);
      String string0 = veiculo1.getNIF();
      assertEquals("d{~", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      veiculo0.setMatricula((String) null);
      String string0 = veiculo0.getMatricula();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate(0, 1.0);
      LinkedList<ParDatas> linkedList0 = new LinkedList<ParDatas>();
      Veiculo veiculo0 = new Veiculo("fhXW2/tZ> -X#+a^W", "fhXW2/tZ> -X#+a^W", "fhXW2/tZ> -X#+a^W", (-318), 1.0, (-318), 0, coordinate0, false, 0, linkedList0);
      String string0 = veiculo0.getMatricula();
      assertEquals("fhXW2/tZ> -X#+a^W", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate((-1581.6248119932297), (-1.0));
      Veiculo veiculo0 = new Veiculo();
      List<ParDatas> list0 = veiculo0.getDatasAlugueres();
      Veiculo veiculo1 = new Veiculo((String) null, "humidity", (String) null, 0, 0, 1.0, 0, coordinate0, false, 0, list0);
      String string0 = veiculo1.getMarca();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate(2578, 0.0);
      Veiculo veiculo0 = new Veiculo();
      List<ParDatas> list0 = veiculo0.getDatasAlugueres();
      Veiculo veiculo1 = new Veiculo("EN'Hv'Ds8|$Y/", "EN'Hv'Ds8|$Y/", "Pre\u00E7o Base por Km: ", 2578, 0.0, 0.0, 905, coordinate0, true, 2578, list0);
      String string0 = veiculo1.getMarca();
      assertEquals("EN'Hv'Ds8|$Y/", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      boolean boolean0 = veiculo0.getDisponibilidade();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1772, 1772, 3512);
      veiculo0.addDatas(mockGregorianCalendar0, mockGregorianCalendar0);
      List<ParDatas> list0 = veiculo0.getDatasAlugueres();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      double double0 = veiculo0.getConsumo();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate(0, 1.0);
      LinkedList<ParDatas> linkedList0 = new LinkedList<ParDatas>();
      Veiculo veiculo0 = new Veiculo("fhXW2/tZ> -X#+a^W", "fhXW2/tZ> -X#+a^W", "fhXW2/tZ> -X#+a^W", (-318), 1.0, (-318), 0, coordinate0, false, 0, linkedList0);
      veiculo0.setConsumo(452.9609);
      double double0 = veiculo0.getConsumo();
      assertEquals(452.9609, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate(551.9210199568, 0.0);
      LinkedList<ParDatas> linkedList0 = new LinkedList<ParDatas>();
      Veiculo veiculo0 = new Veiculo("#u&>54", "#u&>54", "w5~5z|q)3?zf", 1381, 551.9210199568, 1584.1499140124, 0, coordinate0, false, 937, linkedList0);
      int int0 = veiculo0.getClassificacao();
      assertEquals(937, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate(0.0, (-1736.661));
      Veiculo veiculo0 = new Veiculo();
      List<ParDatas> list0 = veiculo0.getDatasAlugueres();
      Veiculo veiculo1 = new Veiculo("", "", "", 0, (-1.0), 0.0, 0, coordinate0, true, (-1636), list0);
      int int0 = veiculo1.getClassificacao();
      assertEquals((-1636), int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate(1093, 1093);
      Veiculo veiculo0 = new Veiculo();
      List<ParDatas> list0 = veiculo0.getDatasAlugueres();
      Veiculo veiculo1 = new Veiculo("", "Autonomia: ", "\"+ojYr&", 1564, 1564, 1564, 1093, coordinate0, false, 1564, list0);
      int int0 = veiculo1.getAutonomia();
      assertEquals(1093, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate(1372.7976113688, 1.0);
      LinkedList<ParDatas> linkedList0 = new LinkedList<ParDatas>();
      Veiculo veiculo0 = new Veiculo("", "", "", (-1988), (-1988), 1.0, (-1988), coordinate0, false, (-1988), linkedList0);
      int int0 = veiculo0.getAutonomia();
      assertEquals((-1988), int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate((-1462.29649), 0);
      LinkedList<ParDatas> linkedList0 = new LinkedList<ParDatas>();
      Veiculo veiculo0 = new Veiculo("N", "e~P>$G*^ =5($bCqp", "e~P>$G*^ =5($bCqp", 0, 1254.7492737644834, (-1462.29649), 0, coordinate0, true, 0, linkedList0);
      double double0 = veiculo0.custoViagem(432.5186587);
      assertEquals(542702.4728934135, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate(2250, 0);
      LinkedList<ParDatas> linkedList0 = new LinkedList<ParDatas>();
      Veiculo veiculo0 = new Veiculo((String) null, (String) null, (String) null, 2250, 2250, 2250, 0, coordinate0, true, (-1), linkedList0);
      double double0 = veiculo0.custoViagem((-1));
      assertEquals((-2250.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate(2607.797405, (-351));
      LinkedList<ParDatas> linkedList0 = new LinkedList<ParDatas>();
      Veiculo veiculo0 = new Veiculo("9}M!CK_#[RcF]|DEx", "9}M!CK_#[RcF]|DEx", "9}M!CK_#[RcF]|DEx", (-351), (-351), (-351), (-351), coordinate0, true, (-351), linkedList0);
      veiculo0.clone();
      assertEquals((-351), veiculo0.getVelocidade());
      assertEquals((-351.0), veiculo0.getConsumo(), 0.01);
      assertEquals((-351.0), veiculo0.getPreco(), 0.01);
      assertEquals((-351), veiculo0.getClassificacao());
      assertEquals((-351), veiculo0.getAutonomia());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate((-3005.84), 4013.4076547751133);
      LinkedList<ParDatas> linkedList0 = new LinkedList<ParDatas>();
      Veiculo veiculo0 = new Veiculo((String) null, "wind", "wind", 1760, 4013.4076547751133, 1760, 1760, coordinate0, false, 632, linkedList0);
      veiculo0.clone();
      assertEquals(632, veiculo0.getClassificacao());
      assertEquals(1760, veiculo0.getAutonomia());
      assertEquals(4013.4076547751133, veiculo0.getPreco(), 0.01);
      assertEquals(1760, veiculo0.getVelocidade());
      assertEquals(1760.0, veiculo0.getConsumo(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      List<ParDatas> list0 = veiculo0.getDatasAlugueres();
      Veiculo veiculo1 = new Veiculo("", "RmU*!", "", 1, 1, (-2618.78577501), 1, (Coordinate) null, false, (-1208), list0);
      // Undeclared exception!
      try { 
        veiculo1.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Veiculo", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedList<ParDatas> linkedList0 = new LinkedList<ParDatas>();
      Veiculo veiculo0 = new Veiculo("Veiculo", "j} rT[h", "}[\"", (-418), (-418), 576.8593595595, (-418), (Coordinate) null, true, 765, linkedList0);
      // Undeclared exception!
      try { 
        veiculo0.tempoViagemCarroJa((Coordinate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Veiculo", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      Weather weather0 = new Weather();
      // Undeclared exception!
      try { 
        veiculo0.tempoViagemCarro((Coordinate) null, weather0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Coordinate", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://api.openweathermap.org/data/2.5/weather?lat=0.0&lon=0.0&appid=28c4efcbaf88fde7e5ae89d0b8f05dcd");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "7 t5h yq[,vF");
      Coordinate coordinate0 = new Coordinate(0.4, 197.950671577787);
      Weather weather0 = new Weather();
      // Undeclared exception!
      try { 
        veiculo0.tempoViagemCarro(coordinate0, weather0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BEGIN_OBJECT but was NUMBER at line 1 column 2 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      // Undeclared exception!
      try { 
        veiculo0.tempoAteVeiculoPéJa((Coordinate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Veiculo", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      Weather weather0 = new Weather();
      // Undeclared exception!
      try { 
        veiculo0.tempoAteVeiculoPé((Coordinate) null, weather0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Veiculo", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      Coordinate coordinate0 = new Coordinate((-859.380484), 4.0);
      Weather weather0 = new Weather();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://api.openweathermap.org/data/2.5/weather?lat=0.0&lon=0.0&appid=28c4efcbaf88fde7e5ae89d0b8f05dcd");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "com.google.gson.internal.$Gson$Preco=ditions");
      // Undeclared exception!
      try { 
        veiculo0.tempoAteVeiculoPé(coordinate0, weather0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BEGIN_OBJECT but was STRING at line 1 column 1 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      // Undeclared exception!
      try { 
        veiculo0.setDatasAlugueres((List<ParDatas>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Veiculo", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate((-3303.4435315807923), (-60.613));
      Veiculo veiculo0 = null;
      try {
        veiculo0 = new Veiculo("*3Xe08+uf1v", (String) null, "", 1388, 4.0, 0.0, (-678), coordinate0, true, 1, (List<ParDatas>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Veiculo", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Veiculo veiculo0 = null;
      try {
        veiculo0 = new Veiculo((Veiculo) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Veiculo", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      int int0 = veiculo0.getClassificacao();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate(0, 1.0);
      LinkedList<ParDatas> linkedList0 = new LinkedList<ParDatas>();
      Veiculo veiculo0 = new Veiculo("fhXW2/tZ> -X#+a^W", "fhXW2/tZ> -X#+a^W", "fhXW2/tZ> -X#+a^W", (-318), 1.0, (-318), 0, coordinate0, false, 0, linkedList0);
      double double0 = veiculo0.getConsumo();
      assertEquals((-318.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      String string0 = veiculo0.getMatricula();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      String string0 = veiculo0.getNIF();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      double double0 = veiculo0.getPreco();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      String string0 = veiculo0.getMarca();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      int int0 = veiculo0.getVelocidade();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate((-1), (-1));
      LinkedList<ParDatas> linkedList0 = new LinkedList<ParDatas>();
      Veiculo veiculo0 = new Veiculo((String) null, (String) null, "", (-1), 1242.2089482352258, (-1), (-1), coordinate0, true, 0, linkedList0);
      boolean boolean0 = veiculo0.getDisponibilidade();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      Coordinate coordinate0 = veiculo0.getPosicao();
      assertEquals(0.0, coordinate0.getLatitude(), 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      int int0 = veiculo0.getAutonomia();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      Veiculo veiculo1 = new Veiculo();
      veiculo1.setClassificacao((-18));
      boolean boolean0 = veiculo1.equals(veiculo0);
      assertEquals((-18), veiculo1.getClassificacao());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      Veiculo veiculo1 = new Veiculo(veiculo0);
      veiculo0.setDisponibilidade(true);
      boolean boolean0 = veiculo1.equals(veiculo0);
      assertTrue(veiculo0.getDisponibilidade());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      Veiculo veiculo1 = veiculo0.clone();
      assertTrue(veiculo1.equals((Object)veiculo0));
      
      Coordinate coordinate0 = new Coordinate(1.0, (-654.996596940607));
      veiculo0.setPosicao(coordinate0);
      boolean boolean0 = veiculo0.equals(veiculo1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      Veiculo veiculo1 = new Veiculo();
      veiculo1.setAutonomia(55);
      boolean boolean0 = veiculo0.equals(veiculo1);
      assertEquals(55, veiculo1.getAutonomia());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      Veiculo veiculo1 = new Veiculo();
      veiculo0.setPreco(55);
      boolean boolean0 = veiculo1.equals(veiculo0);
      assertEquals(55.0, veiculo0.getPreco(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      Coordinate coordinate0 = new Coordinate(8, 8);
      LinkedList<ParDatas> linkedList0 = new LinkedList<ParDatas>();
      Veiculo veiculo1 = new Veiculo("", "8C(y$rcAB])1$", "", 8, 8, 8, 8, coordinate0, true, 8, linkedList0);
      veiculo1.setMatricula("");
      boolean boolean0 = veiculo0.equals(veiculo1);
      assertEquals(8, veiculo1.getVelocidade());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate((-7), (-7));
      LinkedList<ParDatas> linkedList0 = new LinkedList<ParDatas>();
      Veiculo veiculo0 = new Veiculo("", "", "", (-7), (-7), (-7), (-7), coordinate0, true, (-7), linkedList0);
      Veiculo veiculo1 = new Veiculo(veiculo0);
      assertTrue(veiculo1.equals((Object)veiculo0));
      
      veiculo1.setNIF("-7");
      boolean boolean0 = veiculo0.equals(veiculo1);
      assertFalse(veiculo1.equals((Object)veiculo0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      Coordinate coordinate0 = new Coordinate(1.0, 0.0);
      List<ParDatas> list0 = veiculo0.getDatasAlugueres();
      Veiculo veiculo1 = new Veiculo("", "5__Q@eG1G", "", 1828, 0, 3644.313532384622, (-1121), coordinate0, false, (-2943), list0);
      boolean boolean0 = veiculo0.equals(veiculo1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate((-7), (-7));
      LinkedList<ParDatas> linkedList0 = new LinkedList<ParDatas>();
      Veiculo veiculo0 = new Veiculo("", "", "", (-7), (-7), (-7), (-7), coordinate0, true, (-7), linkedList0);
      Veiculo veiculo1 = new Veiculo("-7", "-7", "-7", (-7), (-7), (-7), 0, coordinate0, false, (-7), linkedList0);
      boolean boolean0 = veiculo0.equals(veiculo1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      boolean boolean0 = veiculo0.equals("*****    VE\u00CDCULO    *****\nMarca: \nMatr\u00EDcula: \nNIF do Propriet\u00E1rio: \nVelocidade M\u00E9dia: 0\nPre\u00E7o Base por Km: 0.0\nConsumo: 0.0\nAutonomia: 0\nPosi\u00E7\u00E3o (latitude e longitude): 0, 0\nDispon\u00EDvel: false\nClassifica\u00E7\u00E3o: 0\n");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      boolean boolean0 = veiculo0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      boolean boolean0 = veiculo0.equals(veiculo0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      boolean boolean0 = veiculo0.verificaAutonomia(0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate((-2319), (-2319));
      LinkedList<ParDatas> linkedList0 = new LinkedList<ParDatas>();
      Veiculo veiculo0 = new Veiculo("28c4efcbaf88fde7e5ae89d0bEf05dcd", "28c4efcbaf88fde7e5ae89d0bEf05dcd", "28c4efcbaf88fde7e5ae89d0bEf05dcd", (-2319), (-2319), (-2319), (-2319), coordinate0, true, (-2319), linkedList0);
      boolean boolean0 = veiculo0.verificaAutonomia(0, (-2319));
      assertFalse(boolean0);
      assertEquals((-2319), veiculo0.getAutonomia());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate((-7), (-7));
      LinkedList<ParDatas> linkedList0 = new LinkedList<ParDatas>();
      Veiculo veiculo0 = new Veiculo("", "", "", (-7), (-7), (-7), (-7), coordinate0, true, (-7), linkedList0);
      int int0 = veiculo0.tempoViagemCarroJa(coordinate0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      double double0 = veiculo0.custoViagem(1269.7991087448797);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate(1269.7991087448797, 5130);
      Veiculo veiculo0 = new Veiculo();
      Weather weather0 = new Weather();
      int int0 = veiculo0.tempoAteVeiculoPé(coordinate0, weather0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      Veiculo veiculo1 = veiculo0.clone();
      boolean boolean0 = veiculo0.equals(veiculo1);
      assertEquals(0.0, veiculo0.getConsumo(), 0.01);
      assertEquals(0.0, veiculo0.getPreco(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      veiculo0.setPosicao((Coordinate) null);
      Veiculo veiculo1 = new Veiculo(veiculo0);
      // Undeclared exception!
      try { 
        veiculo0.equals(veiculo1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Veiculo", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      Coordinate coordinate0 = new Coordinate(1.0, 0.0);
      Weather weather0 = new Weather();
      int int0 = veiculo0.tempoViagemCarro(coordinate0, weather0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      String string0 = veiculo0.toString();
      assertEquals("*****    VE\u00CDCULO    *****\nMarca: \nMatr\u00EDcula: \nNIF do Propriet\u00E1rio: \nVelocidade M\u00E9dia: 0\nPre\u00E7o Base por Km: 0.0\nConsumo: 0.0\nAutonomia: 0\nPosi\u00E7\u00E3o (latitude e longitude): 0, 0\nDispon\u00EDvel: false\nClassifica\u00E7\u00E3o: 0\n", string0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      Coordinate coordinate0 = new Coordinate(0.0, 0.0);
      int int0 = veiculo0.tempoAteVeiculoPéJa(coordinate0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      // Undeclared exception!
      try { 
        veiculo0.abastecerVeiculo(0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Division undefined
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      LinkedList<ParDatas> linkedList0 = new LinkedList<ParDatas>();
      veiculo0.setDatasAlugueres(linkedList0);
      assertEquals("", veiculo0.getMarca());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Veiculo veiculo0 = new Veiculo();
      veiculo0.setMarca("5__Q@eG1G");
      assertEquals(0, veiculo0.getVelocidade());
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      Coordinate coordinate0 = new Coordinate((-2319), (-2319));
      LinkedList<ParDatas> linkedList0 = new LinkedList<ParDatas>();
      Veiculo veiculo0 = new Veiculo("28c4efcbaf88fde7e5ae89d0bEf05dcd", "28c4efcbaf88fde7e5ae89d0bEf05dcd", "28c4efcbaf88fde7e5ae89d0bEf05dcd", (-2319), (-2319), (-2319), (-2319), coordinate0, true, (-2319), linkedList0);
      Veiculo veiculo1 = new Veiculo(veiculo0);
      veiculo1.setConsumo(0);
      boolean boolean0 = veiculo0.equals(veiculo1);
      assertEquals(0.0, veiculo1.getConsumo(), 0.01);
      assertFalse(boolean0);
  }
}
