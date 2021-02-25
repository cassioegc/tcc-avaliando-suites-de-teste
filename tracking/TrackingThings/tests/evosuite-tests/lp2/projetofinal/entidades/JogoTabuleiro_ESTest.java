/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 23 18:25:26 GMT 2021
 */

package lp2.projetofinal.entidades;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import lp2.projetofinal.entidades.JogoTabuleiro;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JogoTabuleiro_ESTest extends JogoTabuleiro_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JogoTabuleiro jogoTabuleiro0 = new JogoTabuleiro("", 0.0);
      JogoTabuleiro jogoTabuleiro1 = new JogoTabuleiro((String) null, 1089.201324366);
      // Undeclared exception!
      try { 
        jogoTabuleiro0.equals(jogoTabuleiro1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lp2.projetofinal.entidades.Item", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JogoTabuleiro jogoTabuleiro0 = new JogoTabuleiro("%8-cTWp5:%U>$E3VHD", 1390.8);
      String string0 = jogoTabuleiro0.contemPecasPerdidas();
      assertEquals("COMPLETO", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JogoTabuleiro jogoTabuleiro0 = new JogoTabuleiro("~6gt&93z,", 40.16387327618219);
      jogoTabuleiro0.adicionarPecaPerdida("~6gt&93z,");
      JogoTabuleiro jogoTabuleiro1 = new JogoTabuleiro("~6gt&93z,", 40.16387327618219);
      boolean boolean0 = jogoTabuleiro0.equals(jogoTabuleiro1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JogoTabuleiro jogoTabuleiro0 = new JogoTabuleiro("~6gt&93z,", 40.16387327618219);
      boolean boolean0 = jogoTabuleiro0.equals("~6gt&93z,");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JogoTabuleiro jogoTabuleiro0 = new JogoTabuleiro("~6gt&93z,", 40.16387327618219);
      boolean boolean0 = jogoTabuleiro0.equals(jogoTabuleiro0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JogoTabuleiro jogoTabuleiro0 = new JogoTabuleiro("~6gt&93z,", 40.16387327618219);
      jogoTabuleiro0.hashCode();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JogoTabuleiro jogoTabuleiro0 = new JogoTabuleiro("~6gt&93z,", 40.16387327618219);
      String string0 = jogoTabuleiro0.toString();
      assertEquals("JOGO DE TABULEIRO: ~6gt&93z,, R$ 40.16387327618219, Nao emprestado, COMPLETO", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      JogoTabuleiro jogoTabuleiro0 = new JogoTabuleiro("~6gt&93z,", 40.16387327618219);
      assertEquals("COMPLETO", jogoTabuleiro0.contemPecasPerdidas());
      
      jogoTabuleiro0.adicionarPecaPerdida("~6gt&93z,");
      jogoTabuleiro0.contemPecasPerdidas();
      assertEquals("COM PECAS PERDIDAS", jogoTabuleiro0.contemPecasPerdidas());
  }
}
