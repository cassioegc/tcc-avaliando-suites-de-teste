/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 15 01:18:26 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.watson.data.client.model.DiscoveredFormatDetails;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DiscoveredFormatDetails_ESTest extends DiscoveredFormatDetails_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DiscoveredFormatDetails discoveredFormatDetails0 = new DiscoveredFormatDetails();
      discoveredFormatDetails0.setValue("class DiscoveredFormatDetails {\n    count: null\n    distinctCount: null\n    confidence: null\n    priority: null\n    value: null\n}");
      Object object0 = discoveredFormatDetails0.getValue();
      assertEquals("class DiscoveredFormatDetails {\n    count: null\n    distinctCount: null\n    confidence: null\n    priority: null\n    value: null\n}", object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DiscoveredFormatDetails discoveredFormatDetails0 = new DiscoveredFormatDetails();
      DiscoveredFormatDetails discoveredFormatDetails1 = new DiscoveredFormatDetails();
      discoveredFormatDetails1.setValue(discoveredFormatDetails0);
      discoveredFormatDetails0.setValue(discoveredFormatDetails1);
      // Undeclared exception!
      try { 
        discoveredFormatDetails0.equals(discoveredFormatDetails1);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DiscoveredFormatDetails discoveredFormatDetails0 = new DiscoveredFormatDetails();
      discoveredFormatDetails0.setValue("jE]");
      DiscoveredFormatDetails discoveredFormatDetails1 = new DiscoveredFormatDetails();
      boolean boolean0 = discoveredFormatDetails0.equals(discoveredFormatDetails1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DiscoveredFormatDetails discoveredFormatDetails0 = new DiscoveredFormatDetails();
      DiscoveredFormatDetails discoveredFormatDetails1 = new DiscoveredFormatDetails();
      Long long0 = new Long(3356L);
      discoveredFormatDetails0.setCount(long0);
      boolean boolean0 = discoveredFormatDetails0.equals(discoveredFormatDetails1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DiscoveredFormatDetails discoveredFormatDetails0 = new DiscoveredFormatDetails();
      DiscoveredFormatDetails discoveredFormatDetails1 = new DiscoveredFormatDetails();
      boolean boolean0 = discoveredFormatDetails0.equals(discoveredFormatDetails1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DiscoveredFormatDetails discoveredFormatDetails0 = new DiscoveredFormatDetails();
      boolean boolean0 = discoveredFormatDetails0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DiscoveredFormatDetails discoveredFormatDetails0 = new DiscoveredFormatDetails();
      boolean boolean0 = discoveredFormatDetails0.equals(discoveredFormatDetails0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DiscoveredFormatDetails discoveredFormatDetails0 = new DiscoveredFormatDetails();
      boolean boolean0 = discoveredFormatDetails0.equals("class DiscoveredFormatDetails {\n    count: null\n    distinctCount: null\n    confidence: null\n    priority: null\n    value: null\n}");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DiscoveredFormatDetails discoveredFormatDetails0 = new DiscoveredFormatDetails();
      String string0 = discoveredFormatDetails0.toString();
      assertEquals("class DiscoveredFormatDetails {\n    count: null\n    distinctCount: null\n    confidence: null\n    priority: null\n    value: null\n}", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DiscoveredFormatDetails discoveredFormatDetails0 = new DiscoveredFormatDetails();
      Object object0 = discoveredFormatDetails0.getValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DiscoveredFormatDetails discoveredFormatDetails0 = new DiscoveredFormatDetails();
      discoveredFormatDetails0.hashCode();
  }
}
