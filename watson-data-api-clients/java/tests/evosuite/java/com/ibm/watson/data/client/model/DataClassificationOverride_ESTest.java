/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 21:09:29 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.DataClassificationOverride;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DataClassificationOverride_ESTest extends DataClassificationOverride_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DataClassificationOverride dataClassificationOverride0 = new DataClassificationOverride();
      dataClassificationOverride0.setName("8>wb20]\"+");
      String string0 = dataClassificationOverride0.getName();
      assertEquals("8>wb20]\"+", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DataClassificationOverride dataClassificationOverride0 = new DataClassificationOverride();
      dataClassificationOverride0.setName("");
      String string0 = dataClassificationOverride0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DataClassificationOverride dataClassificationOverride0 = new DataClassificationOverride();
      dataClassificationOverride0.setId("V2Y/z<f'zq|HT)-x;");
      String string0 = dataClassificationOverride0.getId();
      assertEquals("V2Y/z<f'zq|HT)-x;", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DataClassificationOverride dataClassificationOverride0 = new DataClassificationOverride();
      dataClassificationOverride0.setId("");
      String string0 = dataClassificationOverride0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DataClassificationOverride dataClassificationOverride0 = new DataClassificationOverride();
      dataClassificationOverride0.setGlobalId("8>wb20]\"+");
      String string0 = dataClassificationOverride0.getGlobalId();
      assertEquals("8>wb20]\"+", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DataClassificationOverride dataClassificationOverride0 = new DataClassificationOverride();
      dataClassificationOverride0.setGlobalId("");
      String string0 = dataClassificationOverride0.getGlobalId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DataClassificationOverride dataClassificationOverride0 = new DataClassificationOverride();
      dataClassificationOverride0.setName("8>wb20]\"+");
      String string0 = dataClassificationOverride0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DataClassificationOverride dataClassificationOverride0 = new DataClassificationOverride();
      DataClassificationOverride dataClassificationOverride1 = new DataClassificationOverride();
      assertTrue(dataClassificationOverride1.equals((Object)dataClassificationOverride0));
      
      dataClassificationOverride1.setGlobalId("class DataClassificationOverride {\n    id: null\n    name: null\n    globalId: null\n}");
      boolean boolean0 = dataClassificationOverride0.equals(dataClassificationOverride1);
      assertFalse(dataClassificationOverride1.equals((Object)dataClassificationOverride0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DataClassificationOverride dataClassificationOverride0 = new DataClassificationOverride();
      dataClassificationOverride0.setName("8>wb20]\"+");
      DataClassificationOverride dataClassificationOverride1 = new DataClassificationOverride();
      boolean boolean0 = dataClassificationOverride0.equals(dataClassificationOverride1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DataClassificationOverride dataClassificationOverride0 = new DataClassificationOverride();
      DataClassificationOverride dataClassificationOverride1 = new DataClassificationOverride();
      dataClassificationOverride1.setId("ALWAYS");
      boolean boolean0 = dataClassificationOverride0.equals(dataClassificationOverride1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DataClassificationOverride dataClassificationOverride0 = new DataClassificationOverride();
      DataClassificationOverride dataClassificationOverride1 = new DataClassificationOverride();
      boolean boolean0 = dataClassificationOverride0.equals(dataClassificationOverride1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DataClassificationOverride dataClassificationOverride0 = new DataClassificationOverride();
      boolean boolean0 = dataClassificationOverride0.equals("    id: ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DataClassificationOverride dataClassificationOverride0 = new DataClassificationOverride();
      boolean boolean0 = dataClassificationOverride0.equals(dataClassificationOverride0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DataClassificationOverride dataClassificationOverride0 = new DataClassificationOverride();
      boolean boolean0 = dataClassificationOverride0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DataClassificationOverride dataClassificationOverride0 = new DataClassificationOverride();
      String string0 = dataClassificationOverride0.getGlobalId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DataClassificationOverride dataClassificationOverride0 = new DataClassificationOverride();
      String string0 = dataClassificationOverride0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DataClassificationOverride dataClassificationOverride0 = new DataClassificationOverride();
      dataClassificationOverride0.hashCode();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DataClassificationOverride dataClassificationOverride0 = new DataClassificationOverride();
      String string0 = dataClassificationOverride0.getName();
      assertNull(string0);
  }
}
