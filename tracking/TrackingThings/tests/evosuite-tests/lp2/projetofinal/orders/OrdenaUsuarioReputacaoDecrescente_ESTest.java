/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 23 18:05:29 GMT 2021
 */

package lp2.projetofinal.orders;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import lp2.projetofinal.entidades.Usuario;
import lp2.projetofinal.orders.OrdenaUsuarioReputacaoDecrescente;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OrdenaUsuarioReputacaoDecrescente_ESTest extends OrdenaUsuarioReputacaoDecrescente_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OrdenaUsuarioReputacaoDecrescente ordenaUsuarioReputacaoDecrescente0 = new OrdenaUsuarioReputacaoDecrescente();
      Usuario usuario0 = new Usuario("", "L`\"F.ll}gS'", "");
      // Undeclared exception!
      try { 
        ordenaUsuarioReputacaoDecrescente0.compare((Usuario) null, usuario0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lp2.projetofinal.orders.OrdenaUsuarioReputacaoDecrescente", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OrdenaUsuarioReputacaoDecrescente ordenaUsuarioReputacaoDecrescente0 = new OrdenaUsuarioReputacaoDecrescente();
      Usuario usuario0 = new Usuario((String) null, (String) null, (String) null);
      usuario0.atualizaReputacao(143.20786167822118, false);
      Usuario usuario1 = new Usuario((String) null, "null, null, null", "null, null, null");
      int int0 = ordenaUsuarioReputacaoDecrescente0.compare(usuario0, usuario1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OrdenaUsuarioReputacaoDecrescente ordenaUsuarioReputacaoDecrescente0 = new OrdenaUsuarioReputacaoDecrescente();
      Usuario usuario0 = new Usuario((String) null, (String) null, (String) null);
      usuario0.atualizaReputacao(143.20786167822118, false);
      Usuario usuario1 = new Usuario((String) null, "null, null, null", "null, null, null");
      int int0 = ordenaUsuarioReputacaoDecrescente0.compare(usuario1, usuario0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OrdenaUsuarioReputacaoDecrescente ordenaUsuarioReputacaoDecrescente0 = new OrdenaUsuarioReputacaoDecrescente();
      Usuario usuario0 = new Usuario("", "L`\"F.ll}gS'", "");
      int int0 = ordenaUsuarioReputacaoDecrescente0.compare(usuario0, usuario0);
      assertEquals(0, int0);
  }
}
