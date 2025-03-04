/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 18 16:18:55 GMT 2020
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
import java.time.LocalDateTime;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Rental_ESTest extends Rental_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", (-1), "");
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(0.0);
      Double double1 = new Double((-1));
      Point point0 = new Point(double0, double1);
      Point point1 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 0.0, 0.0, 0.0, 608, point1, "");
      Client client0 = new Client(point1, "3;GUMmX0_rU", "?%%\"f!LTxJk", "Tempo Total: ", "C'rC4Q>kzRic^", (-1));
      Rental rental0 = new Rental(car0, client0, point0);
      rental0.rent();
      Rental rental1 = new Rental(car0, client0, point0);
      boolean boolean0 = rental1.equals(rental0);
      assertFalse(rental0.equals((Object)rental1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", (-1), "");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double(578);
      Double double1 = new Double((-1467.76));
      Point point0 = new Point(double1, double1);
      Car car0 = new Car("", owner0, car_CarType0, 1105.4348259, 8508.5, 0.0, (-1), point0, (String) null);
      Client client0 = new Client(point0, (String) null, (String) null, "Viagem:         ", "", (-1811812819));
      Rental rental0 = new Rental(car0, client0, point0);
      owner0.addPendingRental(rental0);
      Point point1 = new Point(double0, double0);
      Car car1 = new Car("", owner0, car_CarType0, 0.0, 0.0, 0.0, 578, point1, "");
      Rental rental1 = new Rental(car1, client0, point0);
      rental1.rent();
      assertFalse(rental1.equals((Object)rental0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", (-1), "");
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(0.0);
      Double double1 = new Double((-1));
      Point point0 = new Point(double0, double1);
      Point point1 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 0.0, 1016.5336508408208, 1016.5336508408208, 608, point1, "");
      Client client0 = new Client(point1, "3;GUMmX0_rU", "v?%%\"f!LTxJk", "Tempo Total: ", "C'rC4Q>kzRic^", (-1));
      Rental rental0 = new Rental(car0, client0, point0);
      Rental rental1 = new Rental(car0, client0, point0);
      assertTrue(rental1.equals((Object)rental0));
      
      rental1.rent();
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Owner owner0 = new Owner("n>OI%u{AcUXc ;o!D4+", "", "", 2589, "n>OI%u{AcUXc ;o!D4+");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(1437.5956756277253);
      Double double1 = new Double(2311.57588332377);
      Point point0 = new Point(double0, double1);
      Car car0 = new Car("", owner0, car_CarType0, 2589, 2589, 2768.929539117033, 2589, point0, "C]atzNQFkVmJ");
      Client client0 = new Client(point0, "k4?", "", "k4?", "Tempo Estimado: ", 1704);
      Rental rental0 = new Rental(car0, client0, point0);
      Point point1 = new Point(double1, double0);
      Rental rental1 = new Rental(car0, client0, point1);
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Owner owner0 = new Owner("d!B C{CJDVj8X(}e-", "d!B C{CJDVj8X(}e-", "d!B C{CJDVj8X(}e-", 1456, "V?+Y~0@gPB'=l+sCzC");
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(604L);
      Double double1 = new Double(-0.0);
      Point point0 = new Point(double0, double1);
      Client client0 = new Client(point0, "", "V?+Y~0@gPB'=l+sCzC", "d!B C{CJDVj8X(}e-", "d!B C{CJDVj8X(}e-", (-1));
      Point point1 = new Point(double1, double1);
      Car car0 = new Car("gxzA6X{6)Dv", owner0, car_CarType0, 1581.355243190498, (-628.6689), (-1), (-1), point1, "");
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.toString();
      assertEquals("Client:        \nCarro:          gxzA6X{6)Dv\nDono:           d!B C{CJDVj8X(}e-\nViagem:         (-0.00, -0.00) -> (604.00, -0.00)\nTempo a p\u00E9      151.00 Horas\nTempo Estimado: 0.38 Horas\nCusto Estimado: -379716.02", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Owner owner0 = new Owner("F\"nL", "EGNW:Md^E9pm4/oE|Ci", "%.2f", 100, "%.2f");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(100);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("F\"nL", owner0, car_CarType0, 100, 0.0, (-2248.8957), (-1855), point0, "");
      Client client0 = new Client(point0, "JMzLT$[dIGLiDJ[@", "Model.Car", "$VALUES", "$VALUES", (-1855));
      Double double1 = new Double(0.2);
      Point point1 = new Point(double0, double1);
      client0.setPos(point1);
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.toParsableUserString();
      assertEquals("JMzLT$[dIGLiDJ[@\nF\"nL\n(100.00, 100.00)\n(100.00, 100.00)\n24.95\n0.00\n0.00\n100", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", (-1), "");
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 0.0, 1016.5336508408208, 1016.5336508408208, 608, point0, "");
      Client client0 = new Client(point0, "3;GUMmX0_rU", "v?%%\"f!LTxJk", "Tempo Total: ", "C'rC4Q>kzRic^", (-1));
      Rental rental0 = new Rental(car0, client0, point0);
      rental0.rent();
      rental0.rent();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Owner owner0 = new Owner("$VALUES", "_0c-V&3f-%o", "$VALUES", 0, "$VALUES");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double(0.4);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("$VALUES", owner0, car_CarType0, 0.4, 0, 0.4, 1, point0, "_0c-V&3f-%o");
      Client client0 = new Client(point0, "_0c-V&3f-%o", "", "$VALUES", "_0c-V&3f-%o", 1);
      Rental rental0 = new Rental(car0, client0, point0);
      rental0.rate(1, 0);
      assertEquals(0, owner0.getRates());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double((-2014.55860958));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("yyyy-MM-dd HH:mm", (Owner) null, car_CarType0, 1557.77420881, 0.0, 0.0, 3165, point0, "electric");
      Client client0 = new Client(point0, "electric", "electric", "Exceptions.UnknownCarTypeException", "yyyy-MM-dd HH:mm", 3165);
      Rental rental0 = new Rental(car0, client0, point0);
      rental0.rate(0);
      assertEquals(0, client0.getRates());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", (-1), "");
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(0.0);
      Double double1 = new Double((-1));
      Point point0 = new Point(double0, double1);
      Point point1 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 0.0, 1016.5336508408208, 1016.5336508408208, 608, point1, "");
      Client client0 = new Client(point1, "3;GUMmX0_rU", "v?%%\"f!LTxJk", "Tempo Total: ", "C'rC4Q>kzRic^", (-1));
      Rental rental0 = new Rental(car0, client0, point0);
      rental0.rent();
      double double2 = rental0.getPrice();
      assertEquals(1118.1870159249029, double2, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Owner owner0 = new Owner((String) null, "", "", 0, "");
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car((String) null, owner0, car_CarType0, 0, 0, 0.0, (-289), point0, "Model.Client");
      Client client0 = new Client(point0, "jdCYoWD/:1", "{#~mCXAAk/S!/HjZ", "", (String) null, 0);
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getOwnerID();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Owner owner0 = new Owner("", "l0G", "Qdia]>0:cX?vZw4Xbb", 0, "~=9_?e>*");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double((-3722));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Utils.Point", owner0, car_CarType0, (-1367.33469470451), 1.0, 1.0, (-3722), point0, (String) null);
      Client client0 = new Client(point0, (String) null, "", (String) null, (String) null, 0);
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getOwnerID();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", (-1), "");
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(0.0);
      Double double1 = new Double((-1));
      Point point0 = new Point(double0, double1);
      Point point1 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 0.0, 1016.5336508408208, 1016.5336508408208, 608, point1, "");
      Client client0 = new Client(point1, "3;GUMmX0_rU", "v?%%\"f!LTxJk", "Tempo Total: ", "C'rC4Q>kzRic^", (-1));
      Rental rental0 = new Rental(car0, client0, point0);
      double double2 = rental0.getDistance();
      assertEquals(1.0, double2, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Owner owner0 = new Owner((String) null, "9%A5ywBG-R1Dg", "9%A5ywBG-R1Dg", 400, "9%A5ywBG-R1Dg");
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(1926.8328275);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car((String) null, owner0, car_CarType0, 1076.094815614, 1926.8328275, 1076.094815614, 400, point0, "Carro:          ");
      Client client0 = new Client(point0, (String) null, (String) null, "D?tGds-1#W{I#", "Carro:          ", 400);
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getClientID();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Owner owner0 = new Owner("dxk,NINUJ7", "dxk,NINUJ7", "qM;EW|_{Z|", (-23), "");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("RUKv_qG", owner0, car_CarType0, 112.632588944, (-23), 112.632588944, 0, point0, "");
      Client client0 = new Client(point0, "", "dxk,NINUJ7", "qM;EW|_{Z|", "", 0);
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getClientID();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Owner owner0 = new Owner("%.2f Horas", "Tempo Total: ", "#XPs\"1yE4HJ", 355, "kjXsA}x1gn1'L_m9w ");
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(355);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car((String) null, owner0, car_CarType0, 355, 0.5, 355, 355, point0, "Tempo Total: ");
      Client client0 = new Client(point0, "Electrico", (String) null, "Tempo Total: ", (String) null, (-1150));
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getCarID();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Owner owner0 = new Owner("", "pLI", "", 886, "pLI");
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(886);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 886, 886, 886, 886, point0, "pLI");
      Client client0 = new Client(point0, "", "", "", "h%ZL_I9EgFZa3!", 886);
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getCarID();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double((-1.0));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", (Owner) null, car_CarType0, 2.0, 2.0, 2.0, 100, point0, "@A{eraJ\r");
      Client client0 = new Client(point0, "~}Xcs6Z4m=U`a", "", "??XX5n!Gzja U4=P 8", "", 620);
      Rental rental0 = new Rental(car0, client0, point0);
      // Undeclared exception!
      try { 
        rental0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Owner owner0 = new Owner("Utils.Point", "Utils.Point", "\n", 1, "\n");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double((-2025.4001627766545));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Utils.Point", owner0, car_CarType0, 1, 2980.872107623966, 2980.872107623966, 1, point0, "Utils.Point");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      // Undeclared exception!
      try { 
        rental0.toParsableUserString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Rental", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("$VALUES", (Owner) null, car_CarType0, 1581.355243190498, 0.0, 0.0, 1, point0, "]`oKj=)k^TM{");
      Client client0 = new Client(point0, "fWuppn", "vjkIb!)3kB", "", "Qh#+5\"@-d{9", 2146126504);
      Rental rental0 = new Rental(car0, client0, point0);
      // Undeclared exception!
      try { 
        rental0.toParsableUserRentalString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", 1480, "");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("(0.00, 0.00)", owner0, car_CarType0, 4.0, 160.0, (-3771.5773671983), 1, point0, "vb5.Si");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      // Undeclared exception!
      try { 
        rental0.toParsableOwnerRentalString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Rental", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double(503.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", (Owner) null, car_CarType0, 0.0, 503.0, 1.2, 2154, point0, "");
      Client client0 = new Client(point0, "Custo Estimado: ", "", "Custo Estimado: ", "Custo Estimado: ", 2154);
      Rental rental0 = new Rental(car0, client0, point0);
      // Undeclared exception!
      try { 
        rental0.rent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      System.setCurrentTimeMillis((-1L));
      Owner owner0 = new Owner((String) null, ",ik$sqa<~wf2", ",ik$sqa<~wf2", (-539), "");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double((-979.9635));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car(",ik$sqa<~wf2", owner0, car_CarType0, (-1L), 0.0, 0.2, (-2147482927), point0, "");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      // Undeclared exception!
      try { 
        rental0.rent();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 12
         //
         verifyException("Model.Weather", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(1419);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("uN&>!*_&DV8kF", (Owner) null, car_CarType0, 0.2, 0.2, (-1987.763), 1419, point0, ")");
      Client client0 = new Client(point0, "Client:        ", ")", ")", "f=cf/nZQRrjVY?1", 1473122002);
      Rental rental0 = new Rental(car0, client0, point0);
      // Undeclared exception!
      try { 
        rental0.rate(1473122002, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Owner owner0 = new Owner("", ",tF?r!0", "W_xX!q<|Phel}St`", (-1719145501), (String) null);
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double((-2302.0));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car(",tF?r!0", owner0, car_CarType0, (-1719145501), (-2302.0), (-2302.0), 3062, point0, "ft\"TFE6prWH(,g");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      // Undeclared exception!
      try { 
        rental0.rate(3062);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Rental", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Owner owner0 = new Owner("tZs@.h`d", "*yn<3,[DtJZrJxp(:i", "*yn<3,[DtJZrJxp(:i", 4173, "tZs@.h`d");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("tZs@.h`d", owner0, car_CarType0, (-1684.39088), 624.17822161, 624.17822161, 0, point0, "tZs@.h`d");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      // Undeclared exception!
      try { 
        rental0.getClientID();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Rental", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Owner owner0 = new Owner("81u'f+VOe,1", "81u'f+VOe,1", "", 0, "");
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double(0.5);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Rf%0H)q}FmW1Atae4}3", owner0, car_CarType0, 0.4, 0.5, 0, 0, point0, "g&yOM%H?Hy~;KKR{>");
      Client client0 = new Client((Point) null, "", "ed:T:,,Rh 9SmW$", "ed:T:,,Rh 9SmW$", "81u'f+VOe,1", 2);
      Rental rental0 = new Rental(car0, client0, point0);
      Client client1 = new Client(point0, "", "", "tt=Xhb!%{t/%.2D", "", 0);
      Rental rental1 = new Rental(car0, client1, point0);
      // Undeclared exception!
      try { 
        rental0.equals(rental1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Client", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Client client0 = new Client((Point) null, (String) null, (String) null, (String) null, (String) null, 0);
      Rental rental0 = null;
      try {
        rental0 = new Rental((Car) null, client0, (Point) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Rental", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", (-1), "");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double((-1));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 0.0, 0.0, 0.0, (-1), point0, "");
      Client client0 = new Client(point0, "", "", "", "", (-1));
      Rental rental0 = new Rental(car0, client0, point0);
      Rental rental1 = new Rental(car0, client0, point0);
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Owner owner0 = new Owner("\n", "\n", "", 2147335927, "");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double(1670.3314096);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("\n", owner0, car_CarType0, 1234.271512992, 1670.3314096, 1670.3314096, 2147335927, point0, "");
      Client client0 = new Client(point0, "", "", "/", "/", 854);
      Rental rental0 = new Rental(car0, client0, point0);
      System.setCurrentTimeMillis(0L);
      Rental rental1 = new Rental(car0, client0, point0);
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Owner owner0 = new Owner("n>OI%u{AcUXc ;o!D4+", "", (String) null, 2589, "n>OI%u{AcUXc ;o!D4+");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(1437.5956756277253);
      Point point0 = new Point(double0, double0);
      Point point1 = point0.clone();
      Car car0 = new Car("", owner0, car_CarType0, 2589, 2589, 2768.929539117033, 2589, point1, "C]atzNQFkVmJ");
      Client client0 = new Client(point1, "k4?", "", "k4?", "Tempo Estimado: ", 1704);
      Rental rental0 = new Rental(car0, client0, point0);
      Rental rental1 = new Rental(car0, client0, point1);
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Owner owner0 = new Owner("81u'f+VOe,1", "81u'f+VOe,1", "81u'f+VOe,1", (-19), "81u'f+VOe,1");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double((-19));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("81u'f+VOe,1", owner0, car_CarType0, (-19), (-19), (-19), (-19), point0, "81u'f+VOe,1");
      Client client0 = new Client(point0, "81u'f+VOe,1", "81u'f+VOe,1", "81u'f+VOe,1", "81u'f+VOe,1", (-19));
      Rental rental0 = new Rental(car0, client0, point0);
      Rental rental1 = new Rental(car0, client0, point0);
      boolean boolean0 = rental0.equals(rental1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Owner owner0 = new Owner("Spring", "Spring", "", 18, "?&0Xa@b2,uwA/9");
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double(4.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Spring", owner0, car_CarType0, 18, 1437.5956756277253, 2360.0203, 1, point0, "");
      Client client0 = new Client(point0, "", "?&0Xa@b2,uwA/9", "Hibrido", "?&0Xa@b2,uwA/9", 18);
      Rental rental0 = new Rental(car0, client0, point0);
      Client client1 = client0.clone();
      Rental rental1 = new Rental(car0, client1, point0);
      boolean boolean0 = rental1.equals(rental0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", (-1), "");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double(578);
      Double double1 = new Double((-1467.76));
      Point point0 = new Point(double1, double1);
      Client client0 = new Client(point0, (String) null, (String) null, "Viagem:         ", "", (-1811812819));
      Point point1 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 0.0, 0.0, 0.0, 578, point0, "");
      Rental rental0 = new Rental(car0, client0, point1);
      rental0.rent();
      Rental rental1 = new Rental(car0, client0, point1);
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
      assertFalse(rental1.equals((Object)rental0));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", 16, "");
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double(603);
      Double double1 = new Double(16);
      Point point0 = new Point(double0, double1);
      Point point1 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 16, 16, 16, 603, point1, "");
      Client client0 = new Client(point1, "", "", "\n603.00\n16.00\ntrue\n100", "\n603.00\n16.00\ntrue\n100", 16);
      Rental rental0 = new Rental(car0, client0, point0);
      rental0.rent();
      Rental rental1 = new Rental(car0, client0, point0);
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", 16, "");
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double(603);
      Double double1 = new Double(16);
      Point point0 = new Point(double0, double1);
      Point point1 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 16, 16, 16, 603, point1, "");
      Client client0 = new Client(point1, "", "", "\n603.00\n16.00\ntrue\n100", "\n603.00\n16.00\ntrue\n100", 16);
      Rental rental0 = new Rental(car0, client0, point0);
      Rental rental1 = new Rental(car0, client0, point1);
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Owner owner0 = new Owner("81u'f+VOe,1", "81u'f+VOe,1", "81u'f+VOe,1", (-19), "81u'f+VOe,1");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double((-19));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("81u'f+VOe,1", owner0, car_CarType0, (-19), (-19), (-19), (-19), point0, "81u'f+VOe,1");
      Client client0 = new Client(point0, "81u'f+VOe,1", "81u'f+VOe,1", "81u'f+VOe,1", "81u'f+VOe,1", (-19));
      Rental rental0 = new Rental(car0, client0, point0);
      boolean boolean0 = rental0.equals(double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Owner owner0 = new Owner("n>OI%u{AcUXc ;o!D4+", "", (String) null, 2589, "n>OI%u{AcUXc ;o!D4+");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(1437.5956756277253);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 2589, 2589, 2768.929539117033, 2589, point0, "C]atzNQFkVmJ");
      Client client0 = new Client(point0, "k4?", "", "k4?", "Tempo Estimado: ", 1704);
      Rental rental0 = new Rental(car0, client0, point0);
      boolean boolean0 = rental0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Owner owner0 = new Owner("=. ?t", "", "$7mp-]`H", 1, "=. ?t");
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("$7mp-]`H", owner0, car_CarType0, 1, 0.0, 0.0, (-2302), point0, "");
      Client client0 = new Client(point0, "=. ?t", "=. ?t", "", "=. ?t", 1);
      Rental rental0 = new Rental(car0, client0, point0);
      rental0.rent();
      client0.rate(rental0, 1827, 1);
      assertEquals(1, owner0.getRates());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Owner owner0 = new Owner("=. ?t", "", "$7mp-]`H", 1, "=. ?t");
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("$7mp-]`H", owner0, car_CarType0, 1, 0.0, 0.0, (-2302), point0, "");
      Car car1 = car0.clone();
      Client client0 = new Client(point0, "=. ?t", "=. ?t", "", "=. ?t", 1);
      Rental rental0 = new Rental(car1, client0, point0);
      Rental rental1 = new Rental(car0, client0, point0);
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Owner owner0 = new Owner("=. ?t", "", "$7mp-]`H", 1, "=. ?t");
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("$7mp-]`H", owner0, car_CarType0, 1, 0.0, 0.0, (-2302), point0, "");
      Client client0 = new Client(point0, "=. ?t", "=. ?t", "", "=. ?t", 1);
      Rental rental0 = new Rental(car0, client0, point0);
      LocalDateTime localDateTime0 = rental0.getDate();
      assertNotNull(localDateTime0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Owner owner0 = new Owner("gas", "gas", "gas", 2589, "gas");
      Car.CarType car_CarType0 = Car.CarType.any;
      Double double0 = new Double(2589);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("gas", owner0, car_CarType0, 2589, 2589, 2589, 2589, point0, "gas");
      Client client0 = new Client(point0, "gas", "gas", "gas", "gas", 2589);
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getOwnerID();
      assertEquals("gas", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Owner owner0 = new Owner("d{", "d{", "d{", 14, "d{");
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(14);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("d{", owner0, car_CarType0, 14, 14, 14, 14, point0, "d{");
      Client client0 = new Client(point0, "d{", "d{", "d{", "d{", 14);
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getClientID();
      assertEquals("d{", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Owner owner0 = new Owner("81u'f+VOe,1", "81u'f+VOe,1", "81u'f+VOe,1", (-19), "81u'f+VOe,1");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double((-19));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("81u'f+VOe,1", owner0, car_CarType0, (-19), (-19), (-19), (-19), point0, "81u'f+VOe,1");
      Client client0 = new Client(point0, "81u'f+VOe,1", "81u'f+VOe,1", "81u'f+VOe,1", "81u'f+VOe,1", (-19));
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.toParsableOwnerRentalString();
      assertEquals("2014-02-14 20:21\n81u'f+VOe,1\n81u'f+VOe,1\n(-19.00, -19.00)\n(-19.00, -19.00)\n0.00", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Owner owner0 = new Owner("81u'f+VOe,1", "81u'f+VOe,1", "81u'f+VOe,1", (-19), "81u'f+VOe,1");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double((-19));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("81u'f+VOe,1", owner0, car_CarType0, (-19), (-19), (-19), (-19), point0, "81u'f+VOe,1");
      Client client0 = new Client(point0, "81u'f+VOe,1", "81u'f+VOe,1", "81u'f+VOe,1", "81u'f+VOe,1", (-19));
      Rental rental0 = new Rental(car0, client0, point0);
      double double1 = rental0.getPrice();
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", (-1), "");
      Car.CarType car_CarType0 = Car.CarType.electric;
      Double double0 = new Double(578);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 1105.4348259, 8508.5, 0.0, (-1), point0, (String) null);
      Client client0 = new Client(point0, (String) null, (String) null, "Viagem:         ", "", (-1811812819));
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.toFinalString();
      assertEquals("Tempo Total: 0.00 Horas\nCusto Total: 0.00\n\n\u001B[4m\u001B[0m", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Owner owner0 = new Owner("=. ?t", "", "$7mp-]`H", 1, "=. ?t");
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("$7mp-]`H", owner0, car_CarType0, 1, 0.0, 0.0, (-2302), point0, "");
      Client client0 = new Client(point0, "=. ?t", "=. ?t", "", "=. ?t", 1);
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getCarID();
      assertEquals("$7mp-]`H", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Owner owner0 = new Owner("=. ?t", "", "$7mp-]`H", 1, "=. ?t");
      Car.CarType car_CarType0 = Car.CarType.hybrid;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("$7mp-]`H", owner0, car_CarType0, 1, 0.0, 0.0, (-2302), point0, "");
      Client client0 = new Client(point0, "=. ?t", "=. ?t", "", "=. ?t", 1);
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.toParsableUserRentalString();
      assertEquals("2014-02-14 20:21\n$7mp-]`H\n=. ?t\n(0.00, 0.00)\n(0.00, 0.00)\n0.00", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.gas;
      Double double0 = new Double(1419);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("uN&>!*_&DV8kF", (Owner) null, car_CarType0, 0.2, 0.2, (-1987.763), 1419, point0, ")");
      Client client0 = new Client(point0, "Client:        ", ")", ")", "f=cf/nZQRrjVY?1", 1473122002);
      Rental rental0 = new Rental(car0, client0, point0);
      double double1 = rental0.getDistance();
      assertEquals(0.0, double1, 0.01);
  }
}
