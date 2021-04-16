/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 18:36:53 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.watson.data.client.model.UpdateUserParamsBody;
import com.ibm.watson.data.client.model.enums.ApprovalStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UpdateUserParamsBody_ESTest extends UpdateUserParamsBody_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UpdateUserParamsBody updateUserParamsBody0 = new UpdateUserParamsBody();
      updateUserParamsBody0.addUserRolesItem("=W>LXn+m)1}<2vU");
      List<String> list0 = updateUserParamsBody0.getUserRoles();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UpdateUserParamsBody updateUserParamsBody0 = new UpdateUserParamsBody();
      UpdateUserParamsBody updateUserParamsBody1 = updateUserParamsBody0.email("^YWw/TyV6R]a.4pk#");
      String string0 = updateUserParamsBody1.getEmail();
      assertEquals("^YWw/TyV6R]a.4pk#", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UpdateUserParamsBody updateUserParamsBody0 = new UpdateUserParamsBody();
      updateUserParamsBody0.setEmail("");
      String string0 = updateUserParamsBody0.getEmail();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UpdateUserParamsBody updateUserParamsBody0 = new UpdateUserParamsBody();
      updateUserParamsBody0.setDisplayName("class UpdateUserParamsBody {\n    approvalStatus: null\n    displayName: null\n    email: java.lang.String@0000000003\n    userRoles: java.util.ArrayList@0000000004\n}");
      String string0 = updateUserParamsBody0.getDisplayName();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UpdateUserParamsBody updateUserParamsBody0 = new UpdateUserParamsBody();
      updateUserParamsBody0.setDisplayName("");
      String string0 = updateUserParamsBody0.getDisplayName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UpdateUserParamsBody updateUserParamsBody0 = new UpdateUserParamsBody();
      UpdateUserParamsBody updateUserParamsBody1 = new UpdateUserParamsBody();
      boolean boolean0 = updateUserParamsBody0.equals(updateUserParamsBody1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UpdateUserParamsBody updateUserParamsBody0 = new UpdateUserParamsBody();
      UpdateUserParamsBody updateUserParamsBody1 = new UpdateUserParamsBody();
      assertTrue(updateUserParamsBody1.equals((Object)updateUserParamsBody0));
      
      updateUserParamsBody1.setDisplayName("^YWw/TyV6R]a.4pk#");
      boolean boolean0 = updateUserParamsBody0.equals(updateUserParamsBody1);
      assertFalse(updateUserParamsBody1.equals((Object)updateUserParamsBody0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UpdateUserParamsBody updateUserParamsBody0 = new UpdateUserParamsBody();
      ApprovalStatus approvalStatus0 = ApprovalStatus.APPROVED;
      UpdateUserParamsBody updateUserParamsBody1 = new UpdateUserParamsBody();
      updateUserParamsBody0.setApprovalStatus(approvalStatus0);
      boolean boolean0 = updateUserParamsBody0.equals(updateUserParamsBody1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UpdateUserParamsBody updateUserParamsBody0 = new UpdateUserParamsBody();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      boolean boolean0 = updateUserParamsBody0.equals(arrayList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UpdateUserParamsBody updateUserParamsBody0 = new UpdateUserParamsBody();
      boolean boolean0 = updateUserParamsBody0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UpdateUserParamsBody updateUserParamsBody0 = new UpdateUserParamsBody();
      boolean boolean0 = updateUserParamsBody0.equals(updateUserParamsBody0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UpdateUserParamsBody updateUserParamsBody0 = new UpdateUserParamsBody();
      UpdateUserParamsBody updateUserParamsBody1 = updateUserParamsBody0.addUserRolesItem("^YWw/TyV6R]a.4pk#");
      UpdateUserParamsBody updateUserParamsBody2 = new UpdateUserParamsBody();
      boolean boolean0 = updateUserParamsBody1.equals(updateUserParamsBody2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UpdateUserParamsBody updateUserParamsBody0 = new UpdateUserParamsBody();
      XmlSuite xmlSuite0 = new XmlSuite();
      XmlTest xmlTest0 = new XmlTest(xmlSuite0, (int) xmlSuite0.DEFAULT_THREAD_COUNT);
      List<String> list0 = xmlTest0.getExcludedGroups();
      UpdateUserParamsBody updateUserParamsBody1 = updateUserParamsBody0.userRoles(list0);
      // Undeclared exception!
      try { 
        updateUserParamsBody1.addUserRolesItem("state");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UpdateUserParamsBody updateUserParamsBody0 = new UpdateUserParamsBody();
      List<String> list0 = updateUserParamsBody0.getUserRoles();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UpdateUserParamsBody updateUserParamsBody0 = new UpdateUserParamsBody();
      ApprovalStatus approvalStatus0 = ApprovalStatus.APPROVED;
      UpdateUserParamsBody updateUserParamsBody1 = updateUserParamsBody0.approvalStatus(approvalStatus0);
      assertEquals(ApprovalStatus.APPROVED, updateUserParamsBody1.getApprovalStatus());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UpdateUserParamsBody updateUserParamsBody0 = new UpdateUserParamsBody();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      updateUserParamsBody0.userRoles(arrayList0);
      List<String> list0 = updateUserParamsBody0.getUserRoles();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UpdateUserParamsBody updateUserParamsBody0 = new UpdateUserParamsBody();
      String string0 = updateUserParamsBody0.getEmail();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UpdateUserParamsBody updateUserParamsBody0 = new UpdateUserParamsBody();
      UpdateUserParamsBody updateUserParamsBody1 = updateUserParamsBody0.email("^YWw/TyV6R]a.4pk#");
      UpdateUserParamsBody updateUserParamsBody2 = new UpdateUserParamsBody();
      boolean boolean0 = updateUserParamsBody1.equals(updateUserParamsBody2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UpdateUserParamsBody updateUserParamsBody0 = new UpdateUserParamsBody();
      ApprovalStatus approvalStatus0 = ApprovalStatus.APPROVED;
      updateUserParamsBody0.setApprovalStatus(approvalStatus0);
      ApprovalStatus approvalStatus1 = updateUserParamsBody0.getApprovalStatus();
      assertEquals("approved", approvalStatus1.getValue());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UpdateUserParamsBody updateUserParamsBody0 = new UpdateUserParamsBody();
      updateUserParamsBody0.getApprovalStatus();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UpdateUserParamsBody updateUserParamsBody0 = new UpdateUserParamsBody();
      Vector<String> vector0 = new Vector<String>();
      updateUserParamsBody0.setUserRoles(vector0);
      String string0 = updateUserParamsBody0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UpdateUserParamsBody updateUserParamsBody0 = new UpdateUserParamsBody();
      updateUserParamsBody0.hashCode();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UpdateUserParamsBody updateUserParamsBody0 = new UpdateUserParamsBody();
      UpdateUserParamsBody updateUserParamsBody1 = updateUserParamsBody0.displayName((String) null);
      assertNull(updateUserParamsBody1.getDisplayName());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UpdateUserParamsBody updateUserParamsBody0 = new UpdateUserParamsBody();
      String string0 = updateUserParamsBody0.getDisplayName();
      assertNull(string0);
  }
}
