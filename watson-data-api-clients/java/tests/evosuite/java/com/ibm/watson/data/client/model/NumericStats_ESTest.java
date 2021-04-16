/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 20:43:00 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.NumericStats;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.testng.xml.XmlSuite;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NumericStats_ESTest extends NumericStats_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NumericStats numericStats0 = new NumericStats();
      Double double0 = new Double(2050.438);
      numericStats0.setVariance(double0);
      Double double1 = numericStats0.getVariance();
      assertEquals(2050.438, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NumericStats numericStats0 = new NumericStats();
      Double double0 = new Double(0.0);
      numericStats0.setVariance(double0);
      Double double1 = numericStats0.getVariance();
      assertEquals(0.0, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NumericStats numericStats0 = new NumericStats();
      Double double0 = new Double((-1753.5510699838));
      numericStats0.setVariance(double0);
      Double double1 = numericStats0.getVariance();
      assertEquals((-1753.5510699838), (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NumericStats numericStats0 = new NumericStats();
      Double double0 = new Double((-797.52));
      numericStats0.setVariance(double0);
      Double double1 = numericStats0.getVariance();
      assertEquals((-797.52), (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NumericStats numericStats0 = new NumericStats();
      Double double0 = new Double(0.0);
      numericStats0.setMean(double0);
      Double double1 = numericStats0.getMean();
      assertEquals(0.0, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NumericStats numericStats0 = new NumericStats();
      Double double0 = new Double(804.0);
      numericStats0.setMean(double0);
      Double double1 = numericStats0.getMean();
      assertEquals(804.0, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NumericStats numericStats0 = new NumericStats();
      Double double0 = new Double((-1550.4974));
      numericStats0.setMean(double0);
      Double double1 = numericStats0.getMean();
      assertEquals((-1550.4974), (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NumericStats numericStats0 = new NumericStats();
      Long long0 = new Long(898L);
      numericStats0.setCount(long0);
      Long long1 = numericStats0.getCount();
      assertEquals(898L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NumericStats numericStats0 = new NumericStats();
      Long long0 = new Long(0L);
      numericStats0.setCount(long0);
      Long long1 = numericStats0.getCount();
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NumericStats numericStats0 = new NumericStats();
      Long long0 = new Long((-2702L));
      numericStats0.setCount(long0);
      Long long1 = numericStats0.getCount();
      assertEquals((-2702L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NumericStats numericStats0 = new NumericStats();
      Stack<Object> stack0 = new Stack<Object>();
      numericStats0.setBins(stack0);
      List<Object> list0 = numericStats0.getBins();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NumericStats numericStats0 = new NumericStats();
      Vector<Object> vector0 = new Vector<Object>();
      XmlSuite.ParallelMode xmlSuite_ParallelMode0 = XmlSuite.ParallelMode.METHODS;
      vector0.add((Object) xmlSuite_ParallelMode0);
      numericStats0.setBins(vector0);
      List<Object> list0 = numericStats0.getBins();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NumericStats numericStats0 = new NumericStats();
      Double double0 = new Double((-797.52));
      numericStats0.setVariance(double0);
      String string0 = numericStats0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NumericStats numericStats0 = new NumericStats();
      Stack<Object> stack0 = new Stack<Object>();
      numericStats0.setBins(stack0);
      NumericStats numericStats1 = new NumericStats();
      boolean boolean0 = numericStats0.equals(numericStats1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NumericStats numericStats0 = new NumericStats();
      Double double0 = new Double((-797.52));
      NumericStats numericStats1 = new NumericStats();
      assertTrue(numericStats1.equals((Object)numericStats0));
      
      numericStats0.setVariance(double0);
      boolean boolean0 = numericStats0.equals(numericStats1);
      assertFalse(numericStats1.equals((Object)numericStats0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NumericStats numericStats0 = new NumericStats();
      NumericStats numericStats1 = new NumericStats();
      assertTrue(numericStats1.equals((Object)numericStats0));
      
      Double double0 = new Double((-797.52));
      numericStats0.setMean(double0);
      boolean boolean0 = numericStats0.equals(numericStats1);
      assertFalse(numericStats1.equals((Object)numericStats0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NumericStats numericStats0 = new NumericStats();
      Long long0 = new Long((-1318L));
      numericStats0.setCount(long0);
      NumericStats numericStats1 = new NumericStats();
      boolean boolean0 = numericStats0.equals(numericStats1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NumericStats numericStats0 = new NumericStats();
      NumericStats numericStats1 = new NumericStats();
      boolean boolean0 = numericStats0.equals(numericStats1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NumericStats numericStats0 = new NumericStats();
      boolean boolean0 = numericStats0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NumericStats numericStats0 = new NumericStats();
      boolean boolean0 = numericStats0.equals(numericStats0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NumericStats numericStats0 = new NumericStats();
      Object object0 = new Object();
      boolean boolean0 = numericStats0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NumericStats numericStats0 = new NumericStats();
      Double double0 = numericStats0.getMean();
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NumericStats numericStats0 = new NumericStats();
      numericStats0.hashCode();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NumericStats numericStats0 = new NumericStats();
      Long long0 = numericStats0.getCount();
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NumericStats numericStats0 = new NumericStats();
      List<Object> list0 = numericStats0.getBins();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NumericStats numericStats0 = new NumericStats();
      Double double0 = numericStats0.getVariance();
      assertNull(double0);
  }
}
