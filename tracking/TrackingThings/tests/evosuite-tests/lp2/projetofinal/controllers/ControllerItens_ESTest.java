/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 23 17:58:02 GMT 2021
 */

package lp2.projetofinal.controllers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedHashSet;
import java.util.Set;
import lp2.projetofinal.controllers.ControllerItens;
import lp2.projetofinal.entidades.BluRaySerie;
import lp2.projetofinal.entidades.BluRayShow;
import lp2.projetofinal.entidades.Item;
import lp2.projetofinal.entidades.JogoEletronico;
import lp2.projetofinal.entidades.JogoTabuleiro;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ControllerItens_ESTest extends ControllerItens_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      JogoEletronico jogoEletronico0 = new JogoEletronico("PS4", (-2201.0), "PS4");
      linkedHashSet0.add(jogoEletronico0);
      controllerItens0.atualizarItem(linkedHashSet0, "PS4", "lp2.projetofinal.controllers.ControllerItens", "Nome");
      assertEquals(1, linkedHashSet0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      controllerItens0.adicionaItem((Set<Item>) linkedHashSet0, "|", 0.0);
      controllerItens0.cadastrarPecaPerdidaNoTabuleiro(linkedHashSet0, "|", (String) null);
      assertFalse(linkedHashSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      // Undeclared exception!
      try { 
        controllerItens0.adicionaItem((Set<Item>) linkedHashSet0, "", 0.0, "C|pq{@@w3-1zXcB", (-12592799), "C|pq{@@w3-1zXcB", (String) null, 2863);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lp2.projetofinal.enums.GeneroBluRay", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      controllerItens0.adicionaItem((Set<Item>) linkedHashSet0, "&w@z$7&anpqQOW(#b7?", (-3903.77038630697), 11, 0, "tp", "&w@z$7&anpqQOW(#b7?");
      assertEquals(1, linkedHashSet0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      controllerItens0.adicionaItem((Set<Item>) linkedHashSet0, "YCaBM:3WN+|2E8?e\"D ", 2466.21309856233, 1, "", "", (-837));
      assertFalse(linkedHashSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      // Undeclared exception!
      try { 
        controllerItens0.adicionaItem((Set<Item>) linkedHashSet0, "FAROESTE", 185.56, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lp2.projetofinal.enums.PlataformaJogoEletronico", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      controllerItens0.adicionaItem((Set<Item>) linkedHashSet0, "", (-1419.4), 1292, 1292, "6|rY", "DEZ_ANOS");
      controllerItens0.removerItem(linkedHashSet0, "");
      assertTrue(linkedHashSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      BluRaySerie bluRaySerie0 = new BluRaySerie("", (-2984.5901), "", 0, "", "", (-2356));
      linkedHashSet0.add(bluRaySerie0);
      controllerItens0.adicionarBluRayEpisodio(linkedHashSet0, "", (-2356));
      assertEquals(1, linkedHashSet0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      String string0 = controllerItens0.listarItensOrdenadosPorValor(linkedHashSet0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      String string0 = controllerItens0.listarItensOrdenadosPorNome(linkedHashSet0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      BluRayShow bluRayShow0 = new BluRayShow("", 0.0, (-1218), "", "i$M,F2N3DVR-5Qy%", (-3042));
      linkedHashSet0.add(bluRayShow0);
      BluRayShow bluRayShow1 = (BluRayShow)controllerItens0.identificaItem(linkedHashSet0, "");
      assertEquals("i$M,F2N3DVR-5Qy%", bluRayShow1.getNomeArtista());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      JogoTabuleiro jogoTabuleiro0 = new JogoTabuleiro("", 608.111);
      linkedHashSet0.add(jogoTabuleiro0);
      Item item0 = controllerItens0.identificaItem(linkedHashSet0, "");
      assertEquals(0, item0.getNumeroEmprestimos());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      BluRaySerie bluRaySerie0 = new BluRaySerie("", (-2984.5901), "", 0, "", "", (-2356));
      linkedHashSet0.add(bluRaySerie0);
      bluRaySerie0.atualizaNumeroEmprestimos();
      BluRaySerie bluRaySerie1 = (BluRaySerie)controllerItens0.identificaItem(linkedHashSet0, "");
      assertEquals((-2356), bluRaySerie1.getNumeroTemporada());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      controllerItens0.adicionaItem((Set<Item>) linkedHashSet0, "", (-1419.4), 1292, 1292, "6|rY", "DEZ_ANOS");
      String string0 = controllerItens0.getInfoItem(linkedHashSet0, "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      controllerItens0.adicionaItem((Set<Item>) linkedHashSet0, "", (-1419.4), 1292, 1292, "6|rY", "DEZ_ANOS");
      String string0 = controllerItens0.getDetalhesItem(linkedHashSet0, "");
      assertEquals("SHOW: , R$ -1419.4, Nao emprestado, 1292 min, DEZ_ANOS, 6|rY, 1292 faixas", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      // Undeclared exception!
      try { 
        controllerItens0.removerItem((Set<Item>) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lp2.projetofinal.controllers.ControllerItens", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      // Undeclared exception!
      try { 
        controllerItens0.listarTop10Itens((Set<Item>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      controllerItens0.adicionaItem((Set<Item>) linkedHashSet0, "", 0.0, "", 0, "", "EROTICO", 0);
      // Undeclared exception!
      try { 
        controllerItens0.listarItensOrdenadosPorValor(linkedHashSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lp2.projetofinal.entidades.BluRay", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      BluRayShow bluRayShow0 = new BluRayShow("@PXVF?`~CuW>s{/", (-3337.53510944727), (-616), "@PXVF?`~CuW>s{/", "6i8#~LjF{7Gxj=", 0);
      linkedHashSet0.add(bluRayShow0);
      // Undeclared exception!
      try { 
        controllerItens0.listarItensOrdenadosPorNome(linkedHashSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lp2.projetofinal.entidades.BluRay", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      // Undeclared exception!
      try { 
        controllerItens0.identificaItem((Set<Item>) null, "RqW].");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lp2.projetofinal.controllers.ControllerItens", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      // Undeclared exception!
      try { 
        controllerItens0.getInfoItem((Set<Item>) null, "[j]xnz?'", "[j]xnz?'");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lp2.projetofinal.controllers.ControllerItens", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      BluRaySerie bluRaySerie0 = new BluRaySerie("", 0.0, "", 1121, ",I7l`:Ft]F) URpC)", "NINTENDO_3DS", (-81));
      linkedHashSet0.add(bluRaySerie0);
      // Undeclared exception!
      try { 
        controllerItens0.getDetalhesItem(linkedHashSet0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lp2.projetofinal.entidades.BluRay", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      // Undeclared exception!
      try { 
        controllerItens0.cadastrarPecaPerdidaNoTabuleiro((Set<Item>) null, "", "ny&Zz~k+ZQ-@v#");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lp2.projetofinal.controllers.ControllerItens", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      JogoEletronico jogoEletronico0 = new JogoEletronico((String) null, 1.0, ":AsUK2");
      linkedHashSet0.add(jogoEletronico0);
      // Undeclared exception!
      try { 
        controllerItens0.atualizarItem(linkedHashSet0, "NT", "Jdc", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      // Undeclared exception!
      try { 
        controllerItens0.adicionarBluRayEpisodio((Set<Item>) null, "", 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lp2.projetofinal.controllers.ControllerItens", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      // Undeclared exception!
      try { 
        controllerItens0.adicionaItem((Set<Item>) null, "L%z,M", (-1.0), "L%z,M", 0, "K5@*w4$bfK#", "", 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lp2.projetofinal.controllers.ControllerItens", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      // Undeclared exception!
      try { 
        controllerItens0.adicionaItem((Set<Item>) linkedHashSet0, "E!`OH{OK&k}A}%tL)", (-940.86), 0, "", (String) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lp2.projetofinal.enums.ClassificacaoBluRay", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      // Undeclared exception!
      try { 
        controllerItens0.adicionaItem((Set<Item>) null, "nzj@[mu0(t", 696.5277738, (-1), (-1), "nzj@[mu0(t", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lp2.projetofinal.controllers.ControllerItens", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      // Undeclared exception!
      try { 
        controllerItens0.adicionaItem((Set<Item>) null, "", (-3661.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lp2.projetofinal.controllers.ControllerItens", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      BluRayShow bluRayShow0 = new BluRayShow("|dQ", 1.0, 1, "|dQ", "|dQ", (-2736));
      linkedHashSet0.add(bluRayShow0);
      // Undeclared exception!
      try { 
        controllerItens0.identificaItem(linkedHashSet0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Item nao encontrado
         //
         verifyException("lp2.projetofinal.util.Exceptions", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      JogoEletronico jogoEletronico0 = new JogoEletronico(" emprestimos - ", (-5169.0), " emprestimos - ");
      jogoEletronico0.atualizaNumeroEmprestimos();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      linkedHashSet0.add(jogoEletronico0);
      String string0 = controllerItens0.listarTop10Itens(linkedHashSet0);
      assertEquals("1) 1 emprestimos - JOGO ELETRONICO:  emprestimos - , R$ -5169.0, Nao emprestado, OUTRO|", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      controllerItens0.adicionaItem((Set<Item>) linkedHashSet0, "", (-1419.4), 1292, 1292, "6|rY", "DEZ_ANOS");
      String string0 = controllerItens0.listarTop10Itens(linkedHashSet0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      JogoEletronico jogoEletronico0 = new JogoEletronico("4o", 11.150375175209, "4o");
      jogoEletronico0.itemEmprestado();
      linkedHashSet0.add(jogoEletronico0);
      ControllerItens controllerItens0 = new ControllerItens();
      String string0 = controllerItens0.listarItensNaoEmprestados(linkedHashSet0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      JogoEletronico jogoEletronico0 = new JogoEletronico("@PXVF?`~CuW>s{/", (-3337.53510944727), "@PXVF?`~CuW>s{/");
      linkedHashSet0.add(jogoEletronico0);
      String string0 = controllerItens0.listarItensNaoEmprestados(linkedHashSet0);
      assertEquals("JOGO ELETRONICO: @PXVF?`~CuW>s{/, R$ -3337.53510944727, Nao emprestado, OUTRO|", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      controllerItens0.adicionaItem((Set<Item>) linkedHashSet0, "A", (double) 3);
      // Undeclared exception!
      try { 
        controllerItens0.removerItem(linkedHashSet0, "D");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Item nao encontrado
         //
         verifyException("lp2.projetofinal.util.Exceptions", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      JogoEletronico jogoEletronico0 = new JogoEletronico(" emprestimos - ", (-5169.0), " emprestimos - ");
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      linkedHashSet0.add(jogoEletronico0);
      String string0 = controllerItens0.listarItensOrdenadosPorValor(linkedHashSet0);
      assertEquals("JOGO ELETRONICO:  emprestimos - , R$ -5169.0, Nao emprestado, OUTRO|", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      JogoEletronico jogoEletronico0 = new JogoEletronico("@PXVF?`~CuW>s{/", (-3337.53510944727), "@PXVF?`~CuW>s{/");
      linkedHashSet0.add(jogoEletronico0);
      String string0 = controllerItens0.listarItensOrdenadosPorNome(linkedHashSet0);
      assertEquals("JOGO ELETRONICO: @PXVF?`~CuW>s{/, R$ -3337.53510944727, Nao emprestado, OUTRO|", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      // Undeclared exception!
      try { 
        controllerItens0.adicionarBluRayEpisodio(linkedHashSet0, "", 1915);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Item nao encontrado
         //
         verifyException("lp2.projetofinal.util.Exceptions", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      controllerItens0.adicionaItem((Set<Item>) linkedHashSet0, ",Lt>Zjx}<u;u65)H{", (-2443.0), ",Lt>Zjx}<u;u65)H{", 1, ",Lt>Zjx}<u;u65)H{", ",Lt>Zjx}<u;u65)H{", 1);
      // Undeclared exception!
      try { 
        controllerItens0.listarItensNaoEmprestados(linkedHashSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("lp2.projetofinal.entidades.BluRay", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      controllerItens0.adicionaItem((Set<Item>) linkedHashSet0, "", (double) 1915, 1915, "", "", 1915);
      // Undeclared exception!
      try { 
        controllerItens0.cadastrarPecaPerdidaNoTabuleiro(linkedHashSet0, "", "");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // lp2.projetofinal.entidades.BluRayFilme cannot be cast to lp2.projetofinal.entidades.JogoTabuleiro
         //
         verifyException("lp2.projetofinal.controllers.ControllerItens", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      // Undeclared exception!
      try { 
        controllerItens0.cadastrarPecaPerdidaNoTabuleiro(linkedHashSet0, "A", "A");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Item nao encontrado
         //
         verifyException("lp2.projetofinal.util.Exceptions", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      // Undeclared exception!
      try { 
        controllerItens0.getInfoItem(linkedHashSet0, "PC", "PC");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Item nao encontrado
         //
         verifyException("lp2.projetofinal.util.Exceptions", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      // Undeclared exception!
      try { 
        controllerItens0.getDetalhesItem(linkedHashSet0, "SO`?%[wV !Z9k");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Item nao encontrado
         //
         verifyException("lp2.projetofinal.util.Exceptions", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      // Undeclared exception!
      try { 
        controllerItens0.atualizarItem(linkedHashSet0, "]>0o\u0005-H[$k{GyXbc", "]>0o\u0005-H[$k{GyXbc", "]>0o\u0005-H[$k{GyXbc");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Item nao encontrado
         //
         verifyException("lp2.projetofinal.util.Exceptions", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      controllerItens0.adicionaItem((Set<Item>) linkedHashSet0, "", (double) 1915);
      // Undeclared exception!
      try { 
        controllerItens0.adicionarBluRayEpisodio(linkedHashSet0, "", 1915);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // lp2.projetofinal.entidades.JogoTabuleiro cannot be cast to lp2.projetofinal.entidades.BluRaySerie
         //
         verifyException("lp2.projetofinal.controllers.ControllerItens", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ControllerItens controllerItens0 = new ControllerItens();
      LinkedHashSet<Item> linkedHashSet0 = new LinkedHashSet<Item>();
      controllerItens0.adicionaItem((Set<Item>) linkedHashSet0, "", (double) 1915, "");
      assertEquals(1, linkedHashSet0.size());
  }
}
