/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 20:04:37 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.UpdateMemberBody;
import com.ibm.watson.data.client.model.enums.MemberState;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UpdateMemberBody_ESTest extends UpdateMemberBody_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UpdateMemberBody updateMemberBody0 = new UpdateMemberBody();
      updateMemberBody0.setUserName(",F");
      String string0 = updateMemberBody0.getUserName();
      assertEquals(",F", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UpdateMemberBody updateMemberBody0 = new UpdateMemberBody();
      updateMemberBody0.userName("");
      String string0 = updateMemberBody0.getUserName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UpdateMemberBody updateMemberBody0 = new UpdateMemberBody();
      UpdateMemberBody updateMemberBody1 = updateMemberBody0.state((MemberState) null);
      updateMemberBody1.getState();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UpdateMemberBody updateMemberBody0 = new UpdateMemberBody();
      updateMemberBody0.setRole("i");
      String string0 = updateMemberBody0.getRole();
      assertEquals("i", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UpdateMemberBody updateMemberBody0 = new UpdateMemberBody();
      updateMemberBody0.role("");
      String string0 = updateMemberBody0.getRole();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UpdateMemberBody updateMemberBody0 = new UpdateMemberBody();
      UpdateMemberBody updateMemberBody1 = updateMemberBody0.id("p{vR&17K9");
      String string0 = updateMemberBody1.getId();
      assertEquals("p{vR&17K9", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UpdateMemberBody updateMemberBody0 = new UpdateMemberBody();
      UpdateMemberBody updateMemberBody1 = updateMemberBody0.id("");
      String string0 = updateMemberBody1.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UpdateMemberBody updateMemberBody0 = new UpdateMemberBody();
      UpdateMemberBody updateMemberBody1 = new UpdateMemberBody();
      assertTrue(updateMemberBody1.equals((Object)updateMemberBody0));
      
      updateMemberBody1.userName("N[PNC_gE");
      boolean boolean0 = updateMemberBody0.equals(updateMemberBody1);
      assertFalse(updateMemberBody1.equals((Object)updateMemberBody0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UpdateMemberBody updateMemberBody0 = new UpdateMemberBody();
      MemberState memberState0 = MemberState.PENDING;
      UpdateMemberBody updateMemberBody1 = new UpdateMemberBody();
      assertTrue(updateMemberBody1.equals((Object)updateMemberBody0));
      
      updateMemberBody1.state(memberState0);
      boolean boolean0 = updateMemberBody0.equals(updateMemberBody1);
      assertFalse(updateMemberBody1.equals((Object)updateMemberBody0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UpdateMemberBody updateMemberBody0 = new UpdateMemberBody();
      UpdateMemberBody updateMemberBody1 = new UpdateMemberBody();
      UpdateMemberBody updateMemberBody2 = updateMemberBody0.id("N[PNC_gE");
      updateMemberBody1.setRole("N[PNC_gE");
      updateMemberBody1.id("N[PNC_gE");
      boolean boolean0 = updateMemberBody2.equals(updateMemberBody1);
      assertFalse(updateMemberBody2.equals((Object)updateMemberBody1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UpdateMemberBody updateMemberBody0 = new UpdateMemberBody();
      updateMemberBody0.id("?~`m&@v0xn>Ri9a");
      UpdateMemberBody updateMemberBody1 = new UpdateMemberBody();
      boolean boolean0 = updateMemberBody0.equals(updateMemberBody1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UpdateMemberBody updateMemberBody0 = new UpdateMemberBody();
      UpdateMemberBody updateMemberBody1 = new UpdateMemberBody();
      boolean boolean0 = updateMemberBody0.equals(updateMemberBody1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UpdateMemberBody updateMemberBody0 = new UpdateMemberBody();
      boolean boolean0 = updateMemberBody0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UpdateMemberBody updateMemberBody0 = new UpdateMemberBody();
      boolean boolean0 = updateMemberBody0.equals(updateMemberBody0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UpdateMemberBody updateMemberBody0 = new UpdateMemberBody();
      Object object0 = new Object();
      boolean boolean0 = updateMemberBody0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UpdateMemberBody updateMemberBody0 = new UpdateMemberBody();
      String string0 = updateMemberBody0.getRole();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UpdateMemberBody updateMemberBody0 = new UpdateMemberBody();
      MemberState memberState0 = updateMemberBody0.getState();
      assertEquals("ACTIVE", memberState0.getValue());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UpdateMemberBody updateMemberBody0 = new UpdateMemberBody();
      String string0 = updateMemberBody0.getUserName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UpdateMemberBody updateMemberBody0 = new UpdateMemberBody();
      String string0 = updateMemberBody0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UpdateMemberBody updateMemberBody0 = new UpdateMemberBody();
      updateMemberBody0.setId((String) null);
      assertNull(updateMemberBody0.getRole());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UpdateMemberBody updateMemberBody0 = new UpdateMemberBody();
      MemberState memberState0 = MemberState.PENDING;
      updateMemberBody0.setState(memberState0);
      assertNull(updateMemberBody0.getRole());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UpdateMemberBody updateMemberBody0 = new UpdateMemberBody();
      updateMemberBody0.hashCode();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UpdateMemberBody updateMemberBody0 = new UpdateMemberBody();
      String string0 = updateMemberBody0.toString();
      assertNotNull(string0);
  }
}
