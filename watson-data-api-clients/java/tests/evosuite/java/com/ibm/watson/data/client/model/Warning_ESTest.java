/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 15 00:31:32 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.Warning;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Warning_ESTest extends Warning_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Warning warning0 = new Warning();
      warning0.message("NON_DEFAULT");
      String string0 = warning0.getMessage();
      assertEquals("NON_DEFAULT", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Warning warning0 = new Warning();
      warning0.setId("%");
      String string0 = warning0.getId();
      assertEquals("%", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Warning warning0 = new Warning();
      Warning warning1 = warning0.id("");
      String string0 = warning1.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Warning warning0 = new Warning();
      warning0.message("tKxtK-,fDfE!b?St");
      String string0 = warning0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Warning warning0 = new Warning();
      Warning warning1 = new Warning();
      assertTrue(warning1.equals((Object)warning0));
      
      Warning warning2 = warning1.id("class Warning {\n    message: null\n    id: null\n}");
      boolean boolean0 = warning0.equals(warning2);
      assertFalse(warning1.equals((Object)warning0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Warning warning0 = new Warning();
      Warning warning1 = new Warning();
      boolean boolean0 = warning1.equals(warning0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Warning warning0 = new Warning();
      boolean boolean0 = warning0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Warning warning0 = new Warning();
      boolean boolean0 = warning0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Warning warning0 = new Warning();
      boolean boolean0 = warning0.equals(warning0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Warning warning0 = new Warning();
      String string0 = warning0.getMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Warning warning0 = new Warning();
      warning0.setMessage("");
      String string0 = warning0.getMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Warning warning0 = new Warning();
      warning0.hashCode();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Warning warning0 = new Warning();
      String string0 = warning0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Warning warning0 = new Warning();
      warning0.message("tKxtK-,fDfE!b?St");
      Warning warning1 = new Warning();
      boolean boolean0 = warning0.equals(warning1);
      assertFalse(boolean0);
  }
}
