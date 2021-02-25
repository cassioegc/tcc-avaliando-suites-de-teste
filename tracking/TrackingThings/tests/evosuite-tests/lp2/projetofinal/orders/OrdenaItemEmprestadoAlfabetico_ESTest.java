/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 23 18:04:19 GMT 2021
 */

package lp2.projetofinal.orders;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import lp2.projetofinal.entidades.BluRaySerie;
import lp2.projetofinal.entidades.Emprestimo;
import lp2.projetofinal.entidades.JogoTabuleiro;
import lp2.projetofinal.entidades.Usuario;
import lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OrdenaItemEmprestadoAlfabetico_ESTest extends OrdenaItemEmprestadoAlfabetico_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OrdenaItemEmprestadoAlfabetico ordenaItemEmprestadoAlfabetico0 = new OrdenaItemEmprestadoAlfabetico();
      Usuario usuario0 = new Usuario("", "", "");
      JogoTabuleiro jogoTabuleiro0 = new JogoTabuleiro("", 100.0);
      Emprestimo emprestimo0 = new Emprestimo(usuario0, usuario0, jogoTabuleiro0, "", (-3096));
      BluRaySerie bluRaySerie0 = new BluRaySerie("5xZr}gshIP#gOrv?1 ", 0, "", (-1), "", "JLa5cyxFokKU[", 65307207);
      Emprestimo emprestimo1 = new Emprestimo(usuario0, usuario0, bluRaySerie0, "", (-1));
      int int0 = ordenaItemEmprestadoAlfabetico0.compare(emprestimo1, emprestimo0);
      assertEquals(19, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OrdenaItemEmprestadoAlfabetico ordenaItemEmprestadoAlfabetico0 = new OrdenaItemEmprestadoAlfabetico();
      Usuario usuario0 = new Usuario("", "", "");
      JogoTabuleiro jogoTabuleiro0 = new JogoTabuleiro("", 100.0);
      Emprestimo emprestimo0 = new Emprestimo(usuario0, usuario0, jogoTabuleiro0, "", (-3096));
      BluRaySerie bluRaySerie0 = new BluRaySerie("5xZr}gshIP#gOrv?1 ", 0, "", (-1), "", "JLa5cyxFokKU[", 65307207);
      Emprestimo emprestimo1 = new Emprestimo(usuario0, usuario0, bluRaySerie0, "", (-1));
      int int0 = ordenaItemEmprestadoAlfabetico0.compare(emprestimo0, emprestimo1);
      assertEquals((-19), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JogoTabuleiro jogoTabuleiro0 = new JogoTabuleiro("m-UWl4rn", 2.2333060573024515);
      Usuario usuario0 = new Usuario("m-UWl4rn", "m-UWl4rn", "m-UWl4rn");
      Emprestimo emprestimo0 = new Emprestimo(usuario0, usuario0, jogoTabuleiro0, "m-UWl4rn", (-14));
      OrdenaItemEmprestadoAlfabetico ordenaItemEmprestadoAlfabetico0 = new OrdenaItemEmprestadoAlfabetico();
      int int0 = ordenaItemEmprestadoAlfabetico0.compare(emprestimo0, emprestimo0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OrdenaItemEmprestadoAlfabetico ordenaItemEmprestadoAlfabetico0 = new OrdenaItemEmprestadoAlfabetico();
      Usuario usuario0 = new Usuario("", "", "oaF$)6};ZC?6^");
      JogoTabuleiro jogoTabuleiro0 = new JogoTabuleiro("aBw)]A/fck,", 1967.31);
      Emprestimo emprestimo0 = new Emprestimo(usuario0, usuario0, jogoTabuleiro0, "aBw)]A/fck,", 0);
      // Undeclared exception!
      try { 
        ordenaItemEmprestadoAlfabetico0.compare(emprestimo0, (Emprestimo) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lp2.projetofinal.orders.OrdenaItemEmprestadoAlfabetico", e);
      }
  }
}
