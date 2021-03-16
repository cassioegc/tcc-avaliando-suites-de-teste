/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 22:55:13 GMT 2021
 */

package org.apache.jcp.xml.dsig.internal.dom;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.jcp.xml.dsig.internal.dom.RSAPSSParameterSpec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RSAPSSParameterSpec_ESTest extends RSAPSSParameterSpec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RSAPSSParameterSpec rSAPSSParameterSpec0 = new RSAPSSParameterSpec();
      rSAPSSParameterSpec0.setTrailerField(350);
      RSAPSSParameterSpec rSAPSSParameterSpec1 = new RSAPSSParameterSpec();
      boolean boolean0 = rSAPSSParameterSpec0.equals(rSAPSSParameterSpec1);
      assertEquals(350, rSAPSSParameterSpec0.getTrailerField());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RSAPSSParameterSpec rSAPSSParameterSpec0 = new RSAPSSParameterSpec();
      rSAPSSParameterSpec0.setSaltLength((-168));
      RSAPSSParameterSpec rSAPSSParameterSpec1 = new RSAPSSParameterSpec();
      boolean boolean0 = rSAPSSParameterSpec0.equals(rSAPSSParameterSpec1);
      assertEquals((-168), rSAPSSParameterSpec0.getSaltLength());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RSAPSSParameterSpec rSAPSSParameterSpec0 = new RSAPSSParameterSpec();
      rSAPSSParameterSpec0.setTrailerField((-2256));
      rSAPSSParameterSpec0.hashCode();
      assertEquals((-2256), rSAPSSParameterSpec0.getTrailerField());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RSAPSSParameterSpec rSAPSSParameterSpec0 = new RSAPSSParameterSpec();
      rSAPSSParameterSpec0.setSaltLength((-777));
      rSAPSSParameterSpec0.hashCode();
      assertEquals((-777), rSAPSSParameterSpec0.getSaltLength());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RSAPSSParameterSpec rSAPSSParameterSpec0 = new RSAPSSParameterSpec();
      rSAPSSParameterSpec0.setTrailerField(1294);
      int int0 = rSAPSSParameterSpec0.getTrailerField();
      assertEquals(1294, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RSAPSSParameterSpec rSAPSSParameterSpec0 = new RSAPSSParameterSpec();
      rSAPSSParameterSpec0.setTrailerField((-2256));
      int int0 = rSAPSSParameterSpec0.getTrailerField();
      assertEquals((-2256), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RSAPSSParameterSpec rSAPSSParameterSpec0 = new RSAPSSParameterSpec();
      rSAPSSParameterSpec0.setSaltLength(3269);
      int int0 = rSAPSSParameterSpec0.getSaltLength();
      assertEquals(3269, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RSAPSSParameterSpec rSAPSSParameterSpec0 = new RSAPSSParameterSpec();
      rSAPSSParameterSpec0.setSaltLength((-921));
      int int0 = rSAPSSParameterSpec0.getSaltLength();
      assertEquals((-921), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RSAPSSParameterSpec rSAPSSParameterSpec0 = new RSAPSSParameterSpec();
      rSAPSSParameterSpec0.setDigestName("org.apache.jcp.xml.dsig.internal.dom.RSAPSSParameterSpec");
      String string0 = rSAPSSParameterSpec0.getDigestName();
      assertEquals("org.apache.jcp.xml.dsig.internal.dom.RSAPSSParameterSpec", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RSAPSSParameterSpec rSAPSSParameterSpec0 = new RSAPSSParameterSpec();
      rSAPSSParameterSpec0.setDigestName("");
      String string0 = rSAPSSParameterSpec0.getDigestName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RSAPSSParameterSpec rSAPSSParameterSpec0 = new RSAPSSParameterSpec();
      RSAPSSParameterSpec rSAPSSParameterSpec1 = new RSAPSSParameterSpec();
      rSAPSSParameterSpec1.setTrailerField(2847);
      boolean boolean0 = rSAPSSParameterSpec0.equals(rSAPSSParameterSpec1);
      assertEquals(2847, rSAPSSParameterSpec1.getTrailerField());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RSAPSSParameterSpec rSAPSSParameterSpec0 = new RSAPSSParameterSpec();
      rSAPSSParameterSpec0.setDigestName("mS)\"");
      RSAPSSParameterSpec rSAPSSParameterSpec1 = new RSAPSSParameterSpec();
      assertFalse(rSAPSSParameterSpec1.equals((Object)rSAPSSParameterSpec0));
      
      rSAPSSParameterSpec1.setDigestName("mS)\"");
      boolean boolean0 = rSAPSSParameterSpec0.equals(rSAPSSParameterSpec1);
      assertTrue(rSAPSSParameterSpec1.equals((Object)rSAPSSParameterSpec0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RSAPSSParameterSpec rSAPSSParameterSpec0 = new RSAPSSParameterSpec();
      RSAPSSParameterSpec rSAPSSParameterSpec1 = new RSAPSSParameterSpec();
      rSAPSSParameterSpec1.setDigestName("KI=v%Hp");
      boolean boolean0 = rSAPSSParameterSpec0.equals(rSAPSSParameterSpec1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RSAPSSParameterSpec rSAPSSParameterSpec0 = new RSAPSSParameterSpec();
      boolean boolean0 = rSAPSSParameterSpec0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RSAPSSParameterSpec rSAPSSParameterSpec0 = new RSAPSSParameterSpec();
      boolean boolean0 = rSAPSSParameterSpec0.equals(rSAPSSParameterSpec0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RSAPSSParameterSpec rSAPSSParameterSpec0 = new RSAPSSParameterSpec();
      boolean boolean0 = rSAPSSParameterSpec0.equals("mS)\"");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RSAPSSParameterSpec rSAPSSParameterSpec0 = new RSAPSSParameterSpec();
      rSAPSSParameterSpec0.setDigestName("Jae");
      rSAPSSParameterSpec0.hashCode();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RSAPSSParameterSpec rSAPSSParameterSpec0 = new RSAPSSParameterSpec();
      rSAPSSParameterSpec0.setDigestName("mS)\"");
      RSAPSSParameterSpec rSAPSSParameterSpec1 = new RSAPSSParameterSpec();
      boolean boolean0 = rSAPSSParameterSpec0.equals(rSAPSSParameterSpec1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RSAPSSParameterSpec rSAPSSParameterSpec0 = new RSAPSSParameterSpec();
      rSAPSSParameterSpec0.setSaltLength(1722);
      RSAPSSParameterSpec rSAPSSParameterSpec1 = new RSAPSSParameterSpec();
      boolean boolean0 = rSAPSSParameterSpec0.equals(rSAPSSParameterSpec1);
      assertEquals(1722, rSAPSSParameterSpec0.getSaltLength());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RSAPSSParameterSpec rSAPSSParameterSpec0 = new RSAPSSParameterSpec();
      String string0 = rSAPSSParameterSpec0.getDigestName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RSAPSSParameterSpec rSAPSSParameterSpec0 = new RSAPSSParameterSpec();
      int int0 = rSAPSSParameterSpec0.getSaltLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RSAPSSParameterSpec rSAPSSParameterSpec0 = new RSAPSSParameterSpec();
      int int0 = rSAPSSParameterSpec0.getTrailerField();
      assertEquals(0, int0);
  }
}
