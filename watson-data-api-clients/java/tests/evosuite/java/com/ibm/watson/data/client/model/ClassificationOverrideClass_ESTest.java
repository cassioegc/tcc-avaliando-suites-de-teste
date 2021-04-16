/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 15 00:08:23 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.ClassificationOverrideClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassificationOverrideClass_ESTest extends ClassificationOverrideClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassificationOverrideClass classificationOverrideClass0 = new ClassificationOverrideClass();
      classificationOverrideClass0.setName("");
      String string0 = classificationOverrideClass0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassificationOverrideClass classificationOverrideClass0 = new ClassificationOverrideClass();
      classificationOverrideClass0.setCode("GP\"Ch");
      String string0 = classificationOverrideClass0.getCode();
      assertEquals("GP\"Ch", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassificationOverrideClass classificationOverrideClass0 = new ClassificationOverrideClass();
      classificationOverrideClass0.setCode("");
      String string0 = classificationOverrideClass0.getCode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassificationOverrideClass classificationOverrideClass0 = new ClassificationOverrideClass();
      classificationOverrideClass0.setName("");
      String string0 = classificationOverrideClass0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassificationOverrideClass classificationOverrideClass0 = new ClassificationOverrideClass();
      ClassificationOverrideClass classificationOverrideClass1 = new ClassificationOverrideClass();
      assertTrue(classificationOverrideClass1.equals((Object)classificationOverrideClass0));
      
      classificationOverrideClass1.setName("class ClassificationOverrideClass {\n    code: null\n    name: null\n}");
      boolean boolean0 = classificationOverrideClass0.equals(classificationOverrideClass1);
      assertFalse(classificationOverrideClass1.equals((Object)classificationOverrideClass0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassificationOverrideClass classificationOverrideClass0 = new ClassificationOverrideClass();
      ClassificationOverrideClass classificationOverrideClass1 = new ClassificationOverrideClass();
      classificationOverrideClass0.setCode("    code: ");
      boolean boolean0 = classificationOverrideClass0.equals(classificationOverrideClass1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassificationOverrideClass classificationOverrideClass0 = new ClassificationOverrideClass();
      Object object0 = new Object();
      boolean boolean0 = classificationOverrideClass0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassificationOverrideClass classificationOverrideClass0 = new ClassificationOverrideClass();
      ClassificationOverrideClass classificationOverrideClass1 = new ClassificationOverrideClass();
      boolean boolean0 = classificationOverrideClass0.equals(classificationOverrideClass1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassificationOverrideClass classificationOverrideClass0 = new ClassificationOverrideClass();
      boolean boolean0 = classificationOverrideClass0.equals(classificationOverrideClass0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassificationOverrideClass classificationOverrideClass0 = new ClassificationOverrideClass();
      boolean boolean0 = classificationOverrideClass0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassificationOverrideClass classificationOverrideClass0 = new ClassificationOverrideClass();
      String string0 = classificationOverrideClass0.getCode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassificationOverrideClass classificationOverrideClass0 = new ClassificationOverrideClass();
      classificationOverrideClass0.hashCode();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassificationOverrideClass classificationOverrideClass0 = new ClassificationOverrideClass();
      classificationOverrideClass0.setName("class ClassificationOverrideClass {\n    code: null\n    name: null\n}");
      String string0 = classificationOverrideClass0.getName();
      assertEquals("class ClassificationOverrideClass {\n    code: null\n    name: null\n}", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassificationOverrideClass classificationOverrideClass0 = new ClassificationOverrideClass();
      String string0 = classificationOverrideClass0.getName();
      assertNull(string0);
  }
}
