/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 13 17:26:32 GMT 2021
 */

package org.apache.xml.security.configuration;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.xml.security.configuration.HandlerType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HandlerType_ESTest extends HandlerType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HandlerType handlerType0 = new HandlerType();
      handlerType0.setValue("");
      String string0 = handlerType0.getValue();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HandlerType handlerType0 = new HandlerType();
      handlerType0.setURI("fP4");
      String string0 = handlerType0.getURI();
      assertEquals("fP4", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HandlerType handlerType0 = new HandlerType();
      handlerType0.setURI("");
      String string0 = handlerType0.getURI();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HandlerType handlerType0 = new HandlerType();
      handlerType0.setNAME("fP4");
      String string0 = handlerType0.getNAME();
      assertEquals("fP4", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HandlerType handlerType0 = new HandlerType();
      handlerType0.name = "";
      String string0 = handlerType0.getNAME();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HandlerType handlerType0 = new HandlerType();
      handlerType0.setJAVACLASS("");
      String string0 = handlerType0.getJAVACLASS();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HandlerType handlerType0 = new HandlerType();
      handlerType0.setValue(" PhG(s{Fw5;");
      String string0 = handlerType0.getValue();
      assertEquals(" PhG(s{Fw5;", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HandlerType handlerType0 = new HandlerType();
      String string0 = handlerType0.getURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HandlerType handlerType0 = new HandlerType();
      String string0 = handlerType0.getNAME();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HandlerType handlerType0 = new HandlerType();
      String string0 = handlerType0.getJAVACLASS();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HandlerType handlerType0 = new HandlerType();
      String string0 = handlerType0.getValue();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HandlerType handlerType0 = new HandlerType();
      handlerType0.setJAVACLASS("M!2<KWgf\"L#?tV");
      String string0 = handlerType0.getJAVACLASS();
      assertEquals("M!2<KWgf\"L#?tV", string0);
  }
}
