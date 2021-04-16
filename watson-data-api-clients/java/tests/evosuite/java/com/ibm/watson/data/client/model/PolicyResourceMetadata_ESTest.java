/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 18:39:59 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.PolicyResourceMetadata;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PolicyResourceMetadata_ESTest extends PolicyResourceMetadata_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PolicyResourceMetadata policyResourceMetadata0 = new PolicyResourceMetadata();
      MockDate mockDate0 = new MockDate(1, 1, (-666), 218, 0);
      PolicyResourceMetadata policyResourceMetadata1 = policyResourceMetadata0.updatedAt(mockDate0);
      Date date0 = policyResourceMetadata1.getUpdatedAt();
      assertSame(mockDate0, date0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PolicyResourceMetadata policyResourceMetadata0 = new PolicyResourceMetadata();
      PolicyResourceMetadata policyResourceMetadata1 = policyResourceMetadata0.modifier("F");
      String string0 = policyResourceMetadata1.getModifier();
      assertEquals("F", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PolicyResourceMetadata policyResourceMetadata0 = new PolicyResourceMetadata();
      PolicyResourceMetadata policyResourceMetadata1 = policyResourceMetadata0.modifier("");
      String string0 = policyResourceMetadata1.getModifier();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PolicyResourceMetadata policyResourceMetadata0 = new PolicyResourceMetadata();
      policyResourceMetadata0.guid("io.netty.eventLoop.maxPendingTasks");
      String string0 = policyResourceMetadata0.getGuid();
      assertEquals("io.netty.eventLoop.maxPendingTasks", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PolicyResourceMetadata policyResourceMetadata0 = new PolicyResourceMetadata();
      policyResourceMetadata0.setGuid("");
      String string0 = policyResourceMetadata0.getGuid();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PolicyResourceMetadata policyResourceMetadata0 = new PolicyResourceMetadata();
      PolicyResourceMetadata policyResourceMetadata1 = policyResourceMetadata0.creator("~dV_%1");
      String string0 = policyResourceMetadata1.getCreator();
      assertEquals("~dV_%1", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PolicyResourceMetadata policyResourceMetadata0 = new PolicyResourceMetadata();
      policyResourceMetadata0.creator("");
      String string0 = policyResourceMetadata0.getCreator();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PolicyResourceMetadata policyResourceMetadata0 = new PolicyResourceMetadata();
      MockDate mockDate0 = new MockDate();
      policyResourceMetadata0.createdAt(mockDate0);
      Date date0 = policyResourceMetadata0.getCreatedAt();
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PolicyResourceMetadata policyResourceMetadata0 = new PolicyResourceMetadata();
      policyResourceMetadata0.setCreator(" 1e:BfYU");
      String string0 = policyResourceMetadata0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PolicyResourceMetadata policyResourceMetadata0 = new PolicyResourceMetadata();
      PolicyResourceMetadata policyResourceMetadata1 = new PolicyResourceMetadata();
      boolean boolean0 = policyResourceMetadata1.equals(policyResourceMetadata0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PolicyResourceMetadata policyResourceMetadata0 = new PolicyResourceMetadata();
      PolicyResourceMetadata policyResourceMetadata1 = new PolicyResourceMetadata();
      assertTrue(policyResourceMetadata1.equals((Object)policyResourceMetadata0));
      
      MockDate mockDate0 = new MockDate(9, 9, 9, 9, 9, 9);
      policyResourceMetadata0.setUpdatedAt(mockDate0);
      boolean boolean0 = policyResourceMetadata1.equals(policyResourceMetadata0);
      assertFalse(policyResourceMetadata1.equals((Object)policyResourceMetadata0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PolicyResourceMetadata policyResourceMetadata0 = new PolicyResourceMetadata();
      policyResourceMetadata0.guid("    creator: ");
      PolicyResourceMetadata policyResourceMetadata1 = new PolicyResourceMetadata();
      boolean boolean0 = policyResourceMetadata1.equals(policyResourceMetadata0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PolicyResourceMetadata policyResourceMetadata0 = new PolicyResourceMetadata();
      Object object0 = new Object();
      boolean boolean0 = policyResourceMetadata0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PolicyResourceMetadata policyResourceMetadata0 = new PolicyResourceMetadata();
      boolean boolean0 = policyResourceMetadata0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PolicyResourceMetadata policyResourceMetadata0 = new PolicyResourceMetadata();
      boolean boolean0 = policyResourceMetadata0.equals(policyResourceMetadata0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PolicyResourceMetadata policyResourceMetadata0 = new PolicyResourceMetadata();
      Date date0 = policyResourceMetadata0.getUpdatedAt();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PolicyResourceMetadata policyResourceMetadata0 = new PolicyResourceMetadata();
      policyResourceMetadata0.hashCode();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PolicyResourceMetadata policyResourceMetadata0 = new PolicyResourceMetadata();
      String string0 = policyResourceMetadata0.getModifier();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PolicyResourceMetadata policyResourceMetadata0 = new PolicyResourceMetadata();
      Date date0 = policyResourceMetadata0.getCreatedAt();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PolicyResourceMetadata policyResourceMetadata0 = new PolicyResourceMetadata();
      policyResourceMetadata0.setModifier("\"(sHQ1j");
      assertNull(policyResourceMetadata0.getGuid());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PolicyResourceMetadata policyResourceMetadata0 = new PolicyResourceMetadata();
      policyResourceMetadata0.creator("    creator: ");
      PolicyResourceMetadata policyResourceMetadata1 = new PolicyResourceMetadata();
      boolean boolean0 = policyResourceMetadata1.equals(policyResourceMetadata0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PolicyResourceMetadata policyResourceMetadata0 = new PolicyResourceMetadata();
      MockDate mockDate0 = new MockDate(700, 1, 700, 1, 1086);
      policyResourceMetadata0.setCreatedAt(mockDate0);
      PolicyResourceMetadata policyResourceMetadata1 = new PolicyResourceMetadata();
      boolean boolean0 = policyResourceMetadata1.equals(policyResourceMetadata0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PolicyResourceMetadata policyResourceMetadata0 = new PolicyResourceMetadata();
      policyResourceMetadata0.modifier("    creator: ");
      PolicyResourceMetadata policyResourceMetadata1 = new PolicyResourceMetadata();
      boolean boolean0 = policyResourceMetadata1.equals(policyResourceMetadata0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PolicyResourceMetadata policyResourceMetadata0 = new PolicyResourceMetadata();
      String string0 = policyResourceMetadata0.getCreator();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PolicyResourceMetadata policyResourceMetadata0 = new PolicyResourceMetadata();
      String string0 = policyResourceMetadata0.getGuid();
      assertNull(string0);
  }
}
