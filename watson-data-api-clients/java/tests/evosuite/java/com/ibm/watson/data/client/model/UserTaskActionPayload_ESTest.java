/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 20:37:08 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.FormPropertyInput;
import com.ibm.watson.data.client.model.UserTaskActionPayload;
import com.ibm.watson.data.client.model.enums.UserTaskAction;
import java.util.ArrayList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UserTaskActionPayload_ESTest extends UserTaskActionPayload_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UserTaskActionPayload userTaskActionPayload0 = new UserTaskActionPayload();
      ArrayList<FormPropertyInput> arrayList0 = new ArrayList<FormPropertyInput>();
      UserTaskActionPayload userTaskActionPayload1 = userTaskActionPayload0.formProperties(arrayList0);
      List<FormPropertyInput> list0 = userTaskActionPayload1.getFormProperties();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UserTaskActionPayload userTaskActionPayload0 = new UserTaskActionPayload();
      UserTaskActionPayload userTaskActionPayload1 = userTaskActionPayload0.assignee("2h4BT!)X_4%GHD*3");
      String string0 = userTaskActionPayload1.getAssignee();
      assertEquals("2h4BT!)X_4%GHD*3", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UserTaskActionPayload userTaskActionPayload0 = new UserTaskActionPayload();
      UserTaskActionPayload userTaskActionPayload1 = userTaskActionPayload0.assignee("");
      String string0 = userTaskActionPayload1.getAssignee();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UserTaskActionPayload userTaskActionPayload0 = new UserTaskActionPayload();
      UserTaskAction userTaskAction0 = UserTaskAction.CLAIM;
      UserTaskActionPayload userTaskActionPayload1 = userTaskActionPayload0.action(userTaskAction0);
      UserTaskAction userTaskAction1 = userTaskActionPayload1.getAction();
      assertSame(userTaskAction0, userTaskAction1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UserTaskActionPayload userTaskActionPayload0 = new UserTaskActionPayload();
      ArrayList<FormPropertyInput> arrayList0 = new ArrayList<FormPropertyInput>();
      userTaskActionPayload0.formProperties(arrayList0);
      String string0 = userTaskActionPayload0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UserTaskActionPayload userTaskActionPayload0 = new UserTaskActionPayload();
      UserTaskActionPayload userTaskActionPayload1 = new UserTaskActionPayload();
      boolean boolean0 = userTaskActionPayload1.equals(userTaskActionPayload0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UserTaskActionPayload userTaskActionPayload0 = new UserTaskActionPayload();
      UserTaskActionPayload userTaskActionPayload1 = new UserTaskActionPayload();
      assertTrue(userTaskActionPayload1.equals((Object)userTaskActionPayload0));
      
      userTaskActionPayload1.assignee("");
      boolean boolean0 = userTaskActionPayload0.equals(userTaskActionPayload1);
      assertFalse(userTaskActionPayload1.equals((Object)userTaskActionPayload0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UserTaskActionPayload userTaskActionPayload0 = new UserTaskActionPayload();
      ArrayList<FormPropertyInput> arrayList0 = new ArrayList<FormPropertyInput>();
      boolean boolean0 = userTaskActionPayload0.equals(arrayList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UserTaskActionPayload userTaskActionPayload0 = new UserTaskActionPayload();
      boolean boolean0 = userTaskActionPayload0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UserTaskActionPayload userTaskActionPayload0 = new UserTaskActionPayload();
      boolean boolean0 = userTaskActionPayload0.equals(userTaskActionPayload0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UserTaskActionPayload userTaskActionPayload0 = new UserTaskActionPayload();
      ArrayList<FormPropertyInput> arrayList0 = new ArrayList<FormPropertyInput>();
      UserTaskActionPayload userTaskActionPayload1 = userTaskActionPayload0.formProperties(arrayList0);
      UserTaskActionPayload userTaskActionPayload2 = new UserTaskActionPayload();
      boolean boolean0 = userTaskActionPayload1.equals(userTaskActionPayload2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UserTaskActionPayload userTaskActionPayload0 = new UserTaskActionPayload();
      FormPropertyInput formPropertyInput0 = new FormPropertyInput();
      userTaskActionPayload0.addFormPropertiesItem(formPropertyInput0);
      List<FormPropertyInput> list0 = userTaskActionPayload0.getFormProperties();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UserTaskActionPayload userTaskActionPayload0 = new UserTaskActionPayload();
      userTaskActionPayload0.setAssignee("class UserTaskActionPayload {\n    action: null\n    assignee: java.lang.String@0000000003\n    formProperties: null\n}");
      assertNull(userTaskActionPayload0.getAction());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UserTaskActionPayload userTaskActionPayload0 = new UserTaskActionPayload();
      ArrayList<FormPropertyInput> arrayList0 = new ArrayList<FormPropertyInput>();
      UserTaskActionPayload userTaskActionPayload1 = userTaskActionPayload0.formProperties(arrayList0);
      FormPropertyInput formPropertyInput0 = new FormPropertyInput();
      userTaskActionPayload1.addFormPropertiesItem(formPropertyInput0);
      assertTrue(arrayList0.contains(formPropertyInput0));
      assertFalse(arrayList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UserTaskActionPayload userTaskActionPayload0 = new UserTaskActionPayload();
      UserTaskAction userTaskAction0 = UserTaskAction.CLAIM;
      userTaskActionPayload0.action(userTaskAction0);
      UserTaskActionPayload userTaskActionPayload1 = new UserTaskActionPayload();
      boolean boolean0 = userTaskActionPayload0.equals(userTaskActionPayload1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UserTaskActionPayload userTaskActionPayload0 = new UserTaskActionPayload();
      ArrayList<FormPropertyInput> arrayList0 = new ArrayList<FormPropertyInput>();
      userTaskActionPayload0.setFormProperties(arrayList0);
      assertTrue(arrayList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UserTaskActionPayload userTaskActionPayload0 = new UserTaskActionPayload();
      String string0 = userTaskActionPayload0.getAssignee();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UserTaskActionPayload userTaskActionPayload0 = new UserTaskActionPayload();
      List<FormPropertyInput> list0 = userTaskActionPayload0.getFormProperties();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UserTaskActionPayload userTaskActionPayload0 = new UserTaskActionPayload();
      UserTaskAction userTaskAction0 = userTaskActionPayload0.getAction();
      userTaskActionPayload0.setAction(userTaskAction0);
      assertNull(userTaskActionPayload0.getAssignee());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UserTaskActionPayload userTaskActionPayload0 = new UserTaskActionPayload();
      userTaskActionPayload0.hashCode();
  }
}
