/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 15 11:41:18 GMT 2021
 */

package com.ibm.watson.data.client.model.enums;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.watson.data.client.model.enums.FormPropertyType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FormPropertyType_ESTest extends FormPropertyType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FormPropertyType formPropertyType0 = FormPropertyType.fromValue("long");
      assertEquals(FormPropertyType.LONG, formPropertyType0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FormPropertyType[] formPropertyTypeArray0 = FormPropertyType.values();
      assertEquals(4, formPropertyTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FormPropertyType formPropertyType0 = FormPropertyType.valueOf("DATE");
      assertEquals("date", formPropertyType0.getValue());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FormPropertyType formPropertyType0 = FormPropertyType.fromValue("enum");
      assertEquals(FormPropertyType.ENUM, formPropertyType0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormPropertyType.fromValue("LONG");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected value 'LONG'
         //
         verifyException("com.ibm.watson.data.client.model.enums.FormPropertyType", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FormPropertyType formPropertyType0 = FormPropertyType.ENUM;
      String string0 = formPropertyType0.toString();
      assertEquals("enum", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FormPropertyType formPropertyType0 = FormPropertyType.ENUM;
      String string0 = formPropertyType0.getValue();
      assertEquals("enum", string0);
  }
}
