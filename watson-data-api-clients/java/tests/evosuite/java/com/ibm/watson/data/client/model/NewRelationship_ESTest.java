/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 23:01:29 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.NewRelationship;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NewRelationship_ESTest extends NewRelationship_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NewRelationship newRelationship0 = new NewRelationship();
      newRelationship0.setId("S^MgXjp");
      String string0 = newRelationship0.getId();
      assertEquals("S^MgXjp", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NewRelationship newRelationship0 = new NewRelationship();
      NewRelationship newRelationship1 = newRelationship0.description("{mx7g");
      String string0 = newRelationship1.getDescription();
      assertEquals("{mx7g", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NewRelationship newRelationship0 = new NewRelationship();
      NewRelationship newRelationship1 = newRelationship0.description("{mx7g");
      String string0 = newRelationship1.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NewRelationship newRelationship0 = new NewRelationship();
      newRelationship0.description("{mx7g");
      NewRelationship newRelationship1 = new NewRelationship();
      boolean boolean0 = newRelationship0.equals(newRelationship1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NewRelationship newRelationship0 = new NewRelationship();
      NewRelationship newRelationship1 = new NewRelationship();
      NewRelationship newRelationship2 = newRelationship0.id("");
      boolean boolean0 = newRelationship2.equals(newRelationship1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NewRelationship newRelationship0 = new NewRelationship();
      NewRelationship newRelationship1 = new NewRelationship();
      boolean boolean0 = newRelationship0.equals(newRelationship1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NewRelationship newRelationship0 = new NewRelationship();
      boolean boolean0 = newRelationship0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NewRelationship newRelationship0 = new NewRelationship();
      boolean boolean0 = newRelationship0.equals(newRelationship0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NewRelationship newRelationship0 = new NewRelationship();
      boolean boolean0 = newRelationship0.equals("{mx7g");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NewRelationship newRelationship0 = new NewRelationship();
      String string0 = newRelationship0.getDescription();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NewRelationship newRelationship0 = new NewRelationship();
      newRelationship0.hashCode();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NewRelationship newRelationship0 = new NewRelationship();
      String string0 = newRelationship0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NewRelationship newRelationship0 = new NewRelationship();
      newRelationship0.setDescription("");
      assertNull(newRelationship0.getId());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NewRelationship newRelationship0 = new NewRelationship();
      NewRelationship newRelationship1 = newRelationship0.description("");
      String string0 = newRelationship1.getDescription();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NewRelationship newRelationship0 = new NewRelationship();
      NewRelationship newRelationship1 = newRelationship0.id("");
      String string0 = newRelationship1.getId();
      assertEquals("", string0);
  }
}
