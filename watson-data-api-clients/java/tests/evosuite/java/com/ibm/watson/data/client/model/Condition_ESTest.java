/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 21:04:51 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.Condition;
import com.ibm.watson.data.client.model.enums.ConditionValues;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Condition_ESTest extends Condition_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Condition condition0 = new Condition();
      ConditionValues conditionValues0 = ConditionValues.POLICY;
      condition0.addValuesItem(conditionValues0);
      List<ConditionValues> list0 = condition0.getValues();
      assertTrue(list0.contains(conditionValues0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Condition condition0 = new Condition();
      condition0.type("\n    ");
      String string0 = condition0.getType();
      assertEquals("\n    ", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Condition condition0 = new Condition();
      condition0.type("");
      String string0 = condition0.getType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Condition condition0 = new Condition();
      ConditionValues conditionValues0 = ConditionValues.CLASSIFICATION;
      Condition condition1 = condition0.addValuesItem(conditionValues0);
      String string0 = condition1.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Condition condition0 = new Condition();
      Condition condition1 = new Condition();
      boolean boolean0 = condition0.equals(condition1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Condition condition0 = new Condition();
      condition0.setType("'QQxm=a.Ln,xRK-Vep");
      Condition condition1 = new Condition();
      boolean boolean0 = condition0.equals(condition1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Condition condition0 = new Condition();
      boolean boolean0 = condition0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Condition condition0 = new Condition();
      boolean boolean0 = condition0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Condition condition0 = new Condition();
      boolean boolean0 = condition0.equals(condition0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Condition condition0 = new Condition();
      Condition condition1 = new Condition();
      assertTrue(condition1.equals((Object)condition0));
      
      ConditionValues conditionValues0 = ConditionValues.CLASSIFICATION;
      Condition condition2 = condition1.addValuesItem(conditionValues0);
      boolean boolean0 = condition2.equals(condition0);
      assertFalse(condition1.equals((Object)condition0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Condition condition0 = new Condition();
      ConditionValues conditionValues0 = ConditionValues.CLASSIFICATION;
      condition0.addValuesItem(conditionValues0);
      Condition condition1 = condition0.addValuesItem(conditionValues0);
      assertSame(condition0, condition1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Condition condition0 = new Condition();
      LinkedList<ConditionValues> linkedList0 = new LinkedList<ConditionValues>();
      Condition condition1 = condition0.values(linkedList0);
      assertNull(condition1.getType());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Condition condition0 = new Condition();
      condition0.hashCode();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Condition condition0 = new Condition();
      Stack<ConditionValues> stack0 = new Stack<ConditionValues>();
      condition0.setValues(stack0);
      List<ConditionValues> list0 = condition0.getValues();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Condition condition0 = new Condition();
      String string0 = condition0.getType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Condition condition0 = new Condition();
      List<ConditionValues> list0 = condition0.getValues();
      assertNull(list0);
  }
}
