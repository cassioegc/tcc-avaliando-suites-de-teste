/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 23:49:18 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.DiscoveredTypeDetails;
import com.ibm.watson.data.client.model.TypeDetails;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DiscoveredTypeDetails_ESTest extends DiscoveredTypeDetails_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DiscoveredTypeDetails discoveredTypeDetails0 = new DiscoveredTypeDetails();
      TypeDetails typeDetails0 = new TypeDetails();
      discoveredTypeDetails0.setValue(typeDetails0);
      TypeDetails typeDetails1 = discoveredTypeDetails0.getValue();
      assertNull(typeDetails1.getPrecision());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DiscoveredTypeDetails discoveredTypeDetails0 = new DiscoveredTypeDetails();
      DiscoveredTypeDetails discoveredTypeDetails1 = new DiscoveredTypeDetails();
      boolean boolean0 = discoveredTypeDetails1.equals(discoveredTypeDetails0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DiscoveredTypeDetails discoveredTypeDetails0 = new DiscoveredTypeDetails();
      boolean boolean0 = discoveredTypeDetails0.equals("class DiscoveredTypeDetails {\n    count: null\n    distinctCount: null\n    confidence: null\n    priority: null\n    value: com.ibm.watson.data.client.model.TypeDetails@0000000002\n}");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DiscoveredTypeDetails discoveredTypeDetails0 = new DiscoveredTypeDetails();
      boolean boolean0 = discoveredTypeDetails0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DiscoveredTypeDetails discoveredTypeDetails0 = new DiscoveredTypeDetails();
      boolean boolean0 = discoveredTypeDetails0.equals(discoveredTypeDetails0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DiscoveredTypeDetails discoveredTypeDetails0 = new DiscoveredTypeDetails();
      DiscoveredTypeDetails discoveredTypeDetails1 = new DiscoveredTypeDetails();
      assertTrue(discoveredTypeDetails1.equals((Object)discoveredTypeDetails0));
      
      Long long0 = new Long(21L);
      discoveredTypeDetails0.setDistinctCount(long0);
      boolean boolean0 = discoveredTypeDetails0.equals(discoveredTypeDetails1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DiscoveredTypeDetails discoveredTypeDetails0 = new DiscoveredTypeDetails();
      discoveredTypeDetails0.hashCode();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DiscoveredTypeDetails discoveredTypeDetails0 = new DiscoveredTypeDetails();
      TypeDetails typeDetails0 = new TypeDetails();
      discoveredTypeDetails0.setValue(typeDetails0);
      DiscoveredTypeDetails discoveredTypeDetails1 = new DiscoveredTypeDetails();
      boolean boolean0 = discoveredTypeDetails0.equals(discoveredTypeDetails1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DiscoveredTypeDetails discoveredTypeDetails0 = new DiscoveredTypeDetails();
      TypeDetails typeDetails0 = discoveredTypeDetails0.getValue();
      assertNull(typeDetails0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      DiscoveredTypeDetails discoveredTypeDetails0 = new DiscoveredTypeDetails();
      String string0 = discoveredTypeDetails0.toString();
      assertEquals("class DiscoveredTypeDetails {\n    count: null\n    distinctCount: null\n    confidence: null\n    priority: null\n    value: null\n}", string0);
  }
}
