/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 20:03:18 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.watson.data.client.model.DataSchema;
import com.ibm.watson.data.client.model.DataSchemaField;
import java.util.List;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DataSchema_ESTest extends DataSchema_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DataSchema dataSchema0 = new DataSchema();
      dataSchema0.setType("The Java/XML config for Spring MVC and Spring WebFlux cannot both be enabled, e.g. via @EnableWebMvc and @EnableWebFlux, in the same application.");
      String string0 = dataSchema0.getType();
      assertEquals("The Java/XML config for Spring MVC and Spring WebFlux cannot both be enabled, e.g. via @EnableWebMvc and @EnableWebFlux, in the same application.", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DataSchema dataSchema0 = new DataSchema();
      DataSchema dataSchema1 = dataSchema0.type("");
      String string0 = dataSchema1.getType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DataSchema dataSchema0 = new DataSchema();
      dataSchema0.name("9");
      String string0 = dataSchema0.getName();
      assertEquals("9", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DataSchema dataSchema0 = new DataSchema();
      dataSchema0.name("");
      String string0 = dataSchema0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DataSchema dataSchema0 = new DataSchema();
      dataSchema0.id("An outbound error could not be processed");
      String string0 = dataSchema0.getId();
      assertEquals("An outbound error could not be processed", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DataSchema dataSchema0 = new DataSchema();
      dataSchema0.id("");
      String string0 = dataSchema0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DataSchema dataSchema0 = new DataSchema();
      DataSchema dataSchema1 = dataSchema0.fields((List<DataSchemaField>) null);
      List<DataSchemaField> list0 = dataSchema1.getFields();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DataSchema dataSchema0 = new DataSchema();
      DataSchema dataSchema1 = dataSchema0.fields((List<DataSchemaField>) null);
      DataSchemaField dataSchemaField0 = new DataSchemaField();
      // Undeclared exception!
      try { 
        dataSchema1.addFieldsItem(dataSchemaField0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.watson.data.client.model.DataSchema", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DataSchema dataSchema0 = new DataSchema();
      Stack<DataSchemaField> stack0 = new Stack<DataSchemaField>();
      DataSchemaField dataSchemaField0 = new DataSchemaField();
      stack0.add(dataSchemaField0);
      dataSchema0.setFields(stack0);
      DataSchema dataSchema1 = new DataSchema();
      boolean boolean0 = dataSchema0.equals(dataSchema1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DataSchema dataSchema0 = new DataSchema();
      DataSchema dataSchema1 = new DataSchema();
      boolean boolean0 = dataSchema0.equals(dataSchema1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DataSchema dataSchema0 = new DataSchema();
      DataSchema dataSchema1 = new DataSchema();
      DataSchema dataSchema2 = dataSchema1.id("@,rRb]OO.fKh1)_R$/2");
      boolean boolean0 = dataSchema2.equals(dataSchema0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DataSchema dataSchema0 = new DataSchema();
      boolean boolean0 = dataSchema0.equals("'");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DataSchema dataSchema0 = new DataSchema();
      boolean boolean0 = dataSchema0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DataSchema dataSchema0 = new DataSchema();
      boolean boolean0 = dataSchema0.equals(dataSchema0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DataSchema dataSchema0 = new DataSchema();
      dataSchema0.setName("reactor.netty.resources.LoopResources");
      DataSchema dataSchema1 = new DataSchema();
      boolean boolean0 = dataSchema0.equals(dataSchema1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DataSchema dataSchema0 = new DataSchema();
      String string0 = dataSchema0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DataSchema dataSchema0 = new DataSchema();
      String string0 = dataSchema0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DataSchema dataSchema0 = new DataSchema();
      dataSchema0.type("W(\"6/tui?.a>9$");
      DataSchema dataSchema1 = new DataSchema();
      boolean boolean0 = dataSchema0.equals(dataSchema1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DataSchema dataSchema0 = new DataSchema();
      String string0 = dataSchema0.getType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DataSchema dataSchema0 = new DataSchema();
      String string0 = dataSchema0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DataSchema dataSchema0 = new DataSchema();
      List<DataSchemaField> list0 = dataSchema0.getFields();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DataSchema dataSchema0 = new DataSchema();
      dataSchema0.setId((String) null);
      assertNull(dataSchema0.getId());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DataSchema dataSchema0 = new DataSchema();
      DataSchemaField dataSchemaField0 = new DataSchemaField();
      dataSchema0.addFieldsItem(dataSchemaField0);
      List<DataSchemaField> list0 = dataSchema0.getFields();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DataSchema dataSchema0 = new DataSchema();
      dataSchema0.hashCode();
  }
}
