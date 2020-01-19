/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 18 19:39:44 GMT 2020
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Proprietario_ESTest extends Proprietario_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Proprietario proprietario0 = new Proprietario();
      String string0 = proprietario0.toString();
      assertEquals("*****    UTILIZADOR    *****\nNome: \nNIF: \nEmail: \nPassword: \nMorada: \nData de Nascimento: 14/2/2014\n", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Proprietario proprietario0 = new Proprietario();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(0, (-151));
      proprietario0.setDataNasc(mockGregorianCalendar0);
      // Undeclared exception!
      try { 
        proprietario0.toString();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid era
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Proprietario proprietario0 = null;
      try {
        proprietario0 = new Proprietario((Proprietario) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Utilizador", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Proprietario proprietario0 = new Proprietario();
      boolean boolean0 = proprietario0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Proprietario proprietario0 = new Proprietario();
      boolean boolean0 = proprietario0.equals(proprietario0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Proprietario proprietario0 = new Proprietario();
      Object object0 = new Object();
      boolean boolean0 = proprietario0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Proprietario proprietario0 = new Proprietario("Data de Nascimento: ", "0tjpwWFwFQ1[~?jmT", "0tjpwWFwFQ1[~?jmT", (String) null, "Data de Nascimento: ", (GregorianCalendar) null);
      // Undeclared exception!
      try { 
        proprietario0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Utilizador", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Proprietario proprietario0 = new Proprietario();
      Proprietario proprietario1 = proprietario0.clone();
      boolean boolean0 = proprietario0.equals(proprietario1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 2661);
      Proprietario proprietario0 = new Proprietario((String) null, (String) null, "Proprietario", "Proprietario", "Proprietario", mockGregorianCalendar0);
      Proprietario proprietario1 = new Proprietario(proprietario0);
      // Undeclared exception!
      try { 
        proprietario1.equals(proprietario0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Utilizador", e);
      }
  }
}
