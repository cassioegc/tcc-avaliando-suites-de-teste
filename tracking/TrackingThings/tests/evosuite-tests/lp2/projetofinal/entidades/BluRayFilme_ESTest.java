/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 23 18:11:37 GMT 2021
 */

package lp2.projetofinal.entidades;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import lp2.projetofinal.entidades.BluRayFilme;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BluRayFilme_ESTest extends BluRayFilme_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BluRayFilme bluRayFilme0 = new BluRayFilme("", (-3764.59), 0, "", "MGeA/K;s4ul#-IY;pm", 0);
      int int0 = bluRayFilme0.getAnoLancamento();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BluRayFilme bluRayFilme0 = new BluRayFilme("lp2.projetofinal.enums.EstadoItem", (-1.0), (-805), "lp2.projetofinal.enums.EstadoItem", "lp2.projetofinal.enums.EstadoItem", (-31));
      int int0 = bluRayFilme0.getAnoLancamento();
      assertEquals((-31), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BluRayFilme bluRayFilme0 = new BluRayFilme("lp2.projetofinal.enums.EstadoItem", (-1.0), (-805), "lp2.projetofinal.enums.EstadoItem", "lp2.projetofinal.enums.EstadoItem", (-31));
      // Undeclared exception!
      try { 
        bluRayFilme0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lp2.projetofinal.entidades.BluRay", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BluRayFilme bluRayFilme0 = null;
      try {
        bluRayFilme0 = new BluRayFilme((String) null, (-1.0), 1057, (String) null, "GdFHJD?l", 1057);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lp2.projetofinal.enums.GeneroBluRay", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BluRayFilme bluRayFilme0 = new BluRayFilme("DEZESSEIS_ANOS", (-1704.7253810584612), (-109), "DEZESSEIS_ANOS", "DEZESSEIS_ANOS", 229);
      int int0 = bluRayFilme0.getAnoLancamento();
      assertEquals(229, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BluRayFilme bluRayFilme0 = new BluRayFilme("DEZESSEIS_ANOS", (-1704.7253810584612), (-109), "DEZESSEIS_ANOS", "DEZESSEIS_ANOS", 229);
      bluRayFilme0.getGenero();
      assertEquals(229, bluRayFilme0.getAnoLancamento());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BluRayFilme bluRayFilme0 = new BluRayFilme("DEZESSEIS_ANOS", (-1704.7253810584612), (-109), "DEZESSEIS_ANOS", "DEZESSEIS_ANOS", 229);
      String string0 = bluRayFilme0.toString();
      assertEquals("FILME: DEZESSEIS_ANOS, R$ -1704.7253810584612, Nao emprestado, -109 min, DEZESSEIS_ANOS, OUTRO, 229", string0);
  }
}
