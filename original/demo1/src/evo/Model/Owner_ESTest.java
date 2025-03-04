/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 18 16:08:30 GMT 2020
 */

package Model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Model.Car;
import Model.Client;
import Model.Owner;
import Model.Rental;
import Utils.Point;
import java.util.ArrayList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Owner_ESTest extends Owner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Owner owner0 = new Owner("_/R}", "Model.Owner", "\n", 0, "_/R}");
      owner0.refuse((Rental) null);
      assertEquals(100, owner0.getRates());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Owner owner0 = new Owner("\u001B[0m", "\u001B[0m", "\u001B[0m", (-5), "\u001B[0m");
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double((-5));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("\u001B[0m", owner0, car_CarType0, (-5), (-5), (-5), (-5), point0, "\u001B[0m");
      Client client0 = new Client(point0, "\u001B[0m", "\u001B[0m", "\u001B[0m", "\u001B[0m", (-5));
      Rental rental0 = new Rental(car0, client0, point0);
      owner0.addPendingRental(rental0);
      ArrayList<Rental> arrayList0 = owner0.getPending();
      assertTrue(arrayList0.contains(rental0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Owner owner0 = new Owner("Model.Owner", "Model.Owner", "w++e#nf#w|q", (-369), "Model.Owner");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(2625);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Model.Owner", owner0, car_CarType0, (-369), (-369), (-505.8548), 2625, point0, "Model.Owner");
      owner0.addCar(car0);
      List<Car> list0 = owner0.getCars();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", 0, "");
      owner0.rate(0);
      Owner owner1 = owner0.clone();
      assertEquals(0, owner1.getRates());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Owner owner0 = new Owner("gas", "gas", (String) null, (-712), "q=H@T Cg][I%;m");
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double((-712));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 0.0, 0.0, (-637.729644987108), (-712), point0, "");
      car0.rate(1539, (-1385));
      Owner owner1 = owner0.clone();
      assertNotSame(owner1, owner0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Owner owner0 = new Owner("Exceptions.UnknownCarTypeException", "C:qo5{$~", "Exceptions.UnknownCarTypeException", 10, "C:qo5{$~");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(10);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("J@L", owner0, car_CarType0, 0.4, (-1939.147), (-781.2326065730936), (-717), point0, "gas");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      owner0.addPendingRental(rental0);
      Rental rental1 = new Rental(car0, (Client) null, point0);
      // Undeclared exception!
      try { 
        owner0.refuse(rental1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Rental", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Owner owner0 = new Owner("xC:NV0 E", "0\"", "}&|C-iPz_|{", 0, (String) null);
      // Undeclared exception!
      try { 
        owner0.rate((Rental) null, 854);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Owner", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Owner owner0 = new Owner("\u001B[30m", "\u001B[30m", "\u001B[30m", 31, "\u001B[30m");
      Owner owner1 = owner0.clone();
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(31);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("\u001B[30m", owner1, car_CarType0, (-1.0), 0.6, 0.0, 31, point0, "HjcQ`z3S");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      owner0.addPendingRental(rental0);
      Client client0 = new Client(point0, "\u001B[30m", "\u001B[30m", "\u001B[30m", "\u001B[30m", 31);
      Rental rental1 = new Rental(car0, client0, point0);
      owner1.addPendingRental(rental1);
      // Undeclared exception!
      try { 
        owner0.equals(owner1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Rental", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Owner owner0 = new Owner("zIR`m?T[wT<I_(9zh", "zIR`m?T[wT<I_(9zh", "", 0, ", ");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double(30.147119714106);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 0, 0, 0.0, 0, point0, "");
      Client client0 = new Client(point0, ", ", "", ", ", "", 4);
      Rental rental0 = new Rental(car0, client0, point0);
      owner0.addPendingRental((Rental) null);
      // Undeclared exception!
      try { 
        owner0.accept(rental0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Owner", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Owner owner0 = new Owner("Model.Owner", "Model.Owner", "w++e#nf#w|q", (-369), "Model.Owner");
      List<Car> list0 = owner0.getCars();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Owner owner0 = new Owner("dl<[3", "dl<[3", "dl<[3", 3800, "dl<[3");
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double(3800);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("dl<[3", owner0, car_CarType0, 3800, 3800, 3800, 3800, point0, "dl<[3");
      Client client0 = new Client(point0, "dl<[3", "dl<[3", "dl<[3", "dl<[3", 3800);
      Rental rental0 = new Rental(car0, client0, point0);
      owner0.accept(rental0);
      Owner owner1 = new Owner("dl<[3", "dl<[3", "dl<[3", 3800, "dl<[3");
      boolean boolean0 = owner0.equals(owner1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Owner owner0 = new Owner("J@L", "J@L", "J@L", 1, "J@L");
      Owner owner1 = owner0.clone();
      boolean boolean0 = owner0.equals(owner1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Owner owner0 = new Owner("p.8>", "p.8>", "p.8>", 54, "p.8>");
      Owner owner1 = owner0.clone();
      owner1.addCar((Car) null);
      boolean boolean0 = owner1.equals(owner0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Owner owner0 = new Owner("J@L", "J@L", "J@L", 1, "J@L");
      boolean boolean0 = owner0.equals("J@L");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Owner owner0 = new Owner((String) null, (String) null, (String) null, 1391, (String) null);
      boolean boolean0 = owner0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Owner owner0 = new Owner("\u001B[30m", "\u001B[30m", "\u001B[30m", 31, "\u001B[30m");
      boolean boolean0 = owner0.equals(owner0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Owner owner0 = new Owner("7XRry]-S][IBa[R>=X", "7XRry]-S][IBa[R>=X", "7XRry]-S][IBa[R>=X", (-1), "7XRry]-S][IBa[R>=X");
      Owner owner1 = owner0.clone();
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double((-1));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("7XRry]-S][IBa[R>=X", owner1, car_CarType0, 0.0, (-1), 0.0, (-1), point0, "%MSC");
      Client client0 = new Client(point0, "7XRry]-S][IBa[R>=X", "7XRry]-S][IBa[R>=X", "%MSC", "%MSC", (-1));
      Rental rental0 = new Rental(car0, client0, point0);
      assertTrue(owner0.equals((Object)owner1));
      
      owner1.addPendingRental(rental0);
      boolean boolean0 = owner0.equals(owner1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Owner owner0 = new Owner("7XRry]-S][IBa[R>=X", "7XRry]-S][IBa[R>=X", "7XRry]-S][IBa[R>=X", (-1), "7XRry]-S][IBa[R>=X");
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double((-1));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("7XRry]-S][IBa[R>=X", owner0, car_CarType0, 0.0, (-1), 0.0, (-1), point0, "%MSC");
      Client client0 = new Client(point0, "7XRry]-S][IBa[R>=X", "7XRry]-S][IBa[R>=X", "%MSC", "%MSC", (-1));
      Rental rental0 = new Rental(car0, client0, point0);
      owner0.rate(rental0, (-1));
      assertEquals((-1), client0.getRates());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Owner owner0 = new Owner("7XRry]-S][IBa[R>=X", "7XRry]-S][IBa[R>=X", "7XRry]-S][IBa[R>=X", (-1), "7XRry]-S][IBa[R>=X");
      ArrayList<Rental> arrayList0 = owner0.getPending();
      assertEquals(0, arrayList0.size());
  }
}
