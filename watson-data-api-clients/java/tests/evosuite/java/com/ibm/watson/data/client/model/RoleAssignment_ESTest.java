/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 17:07:27 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.RoleAssignment;
import com.ibm.watson.data.client.model.enums.UserType;
import java.time.Instant;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RoleAssignment_ESTest extends RoleAssignment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      RoleAssignment roleAssignment1 = roleAssignment0.role("HSe?4Dv");
      String string0 = roleAssignment1.getRole();
      assertEquals("HSe?4Dv", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      roleAssignment0.role("");
      String string0 = roleAssignment0.getRole();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      roleAssignment0.setPrincipalId("com.ibm.watson.data.client.model.RoleAssignment");
      String string0 = roleAssignment0.getPrincipalId();
      assertEquals("com.ibm.watson.data.client.model.RoleAssignment", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      roleAssignment0.setPrincipalId("");
      String string0 = roleAssignment0.getPrincipalId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      RoleAssignment roleAssignment1 = roleAssignment0.id("-fzDt@\"k");
      String string0 = roleAssignment1.getId();
      assertEquals("-fzDt@\"k", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      roleAssignment0.id("");
      String string0 = roleAssignment0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      roleAssignment0.setDpsRuleId("class RoleAssignment {\n    categoryArtifactId: null\n    categoryName: java.lang.String@0000000004\n    role: java.lang.String@0000000004\n    principalId: null\n    id: null\n    dpsRuleId: java.lang.String@0000000003\n    userType: null\n    createTime: null\n}");
      String string0 = roleAssignment0.getDpsRuleId();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      roleAssignment0.setDpsRuleId("");
      String string0 = roleAssignment0.getDpsRuleId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      MockDate mockDate0 = new MockDate(0, 0, (-3887), 6258, (-1722));
      roleAssignment0.createTime(mockDate0);
      Date date0 = roleAssignment0.getCreateTime();
      assertEquals("Fri Jan 24 13:18:00 GMT 1890", date0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      RoleAssignment roleAssignment1 = roleAssignment0.categoryName(")=eP");
      String string0 = roleAssignment1.getCategoryName();
      assertEquals(")=eP", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      roleAssignment0.setCategoryName("");
      String string0 = roleAssignment0.getCategoryName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      roleAssignment0.categoryArtifactId("z2LMk,L]{?-h*P!J");
      String string0 = roleAssignment0.getCategoryArtifactId();
      assertEquals("z2LMk,L]{?-h*P!J", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      roleAssignment0.categoryArtifactId("");
      String string0 = roleAssignment0.getCategoryArtifactId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      MockDate mockDate0 = new MockDate((-1L));
      roleAssignment0.createTime(mockDate0);
      RoleAssignment roleAssignment1 = new RoleAssignment();
      boolean boolean0 = roleAssignment0.equals(roleAssignment1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      RoleAssignment roleAssignment1 = new RoleAssignment();
      assertTrue(roleAssignment1.equals((Object)roleAssignment0));
      
      UserType userType0 = UserType.USER;
      roleAssignment1.setUserType(userType0);
      boolean boolean0 = roleAssignment0.equals(roleAssignment1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      roleAssignment0.dpsRuleId("z&#");
      RoleAssignment roleAssignment1 = new RoleAssignment();
      boolean boolean0 = roleAssignment0.equals(roleAssignment1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      RoleAssignment roleAssignment1 = roleAssignment0.id("-fzDt@\"k");
      RoleAssignment roleAssignment2 = new RoleAssignment();
      boolean boolean0 = roleAssignment1.equals(roleAssignment2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      RoleAssignment roleAssignment1 = roleAssignment0.principalId("`z&#");
      RoleAssignment roleAssignment2 = new RoleAssignment();
      boolean boolean0 = roleAssignment1.equals(roleAssignment2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      RoleAssignment roleAssignment1 = roleAssignment0.role("z&#");
      RoleAssignment roleAssignment2 = new RoleAssignment();
      boolean boolean0 = roleAssignment1.equals(roleAssignment2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      RoleAssignment roleAssignment1 = new RoleAssignment();
      boolean boolean0 = roleAssignment1.equals(roleAssignment0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      roleAssignment0.setCategoryArtifactId(".");
      RoleAssignment roleAssignment1 = new RoleAssignment();
      boolean boolean0 = roleAssignment0.equals(roleAssignment1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      boolean boolean0 = roleAssignment0.equals("EbnV#\u0003@N00Qb");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      boolean boolean0 = roleAssignment0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      boolean boolean0 = roleAssignment0.equals(roleAssignment0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      roleAssignment0.getUserType();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      String string0 = roleAssignment0.getCategoryName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      Instant instant0 = MockInstant.ofEpochMilli(0L);
      Date date0 = Date.from(instant0);
      roleAssignment0.setCreateTime(date0);
      assertNull(roleAssignment0.getDpsRuleId());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      String string0 = roleAssignment0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      RoleAssignment roleAssignment1 = roleAssignment0.categoryName("reactor.core.publisher.FluxConcatIterable$ConcatIterableSubscriber");
      RoleAssignment roleAssignment2 = new RoleAssignment();
      boolean boolean0 = roleAssignment1.equals(roleAssignment2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      Date date0 = roleAssignment0.getCreateTime();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      String string0 = roleAssignment0.getDpsRuleId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      roleAssignment0.setId("&M+[z");
      assertEquals("&M+[z", roleAssignment0.getId());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      UserType userType0 = UserType.USER;
      roleAssignment0.setUserType(userType0);
      UserType userType1 = roleAssignment0.getUserType();
      assertSame(userType1, userType0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      String string0 = roleAssignment0.getRole();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      String string0 = roleAssignment0.toString();
      assertEquals("class RoleAssignment {\n    categoryArtifactId: null\n    categoryName: null\n    role: null\n    principalId: null\n    id: null\n    dpsRuleId: null\n    userType: null\n    createTime: null\n}", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      roleAssignment0.setRole("class RoleAssignment {\n    categoryArtifactId: null\n    categoryName: java.lang.String@0000000004\n    role: java.lang.String@0000000004\n    principalId: null\n    id: null\n    dpsRuleId: java.lang.String@0000000003\n    userType: null\n    createTime: null\n}");
      assertNull(roleAssignment0.getId());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      String string0 = roleAssignment0.getPrincipalId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      roleAssignment0.hashCode();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      RoleAssignment roleAssignment1 = roleAssignment0.dpsRuleId("");
      String string0 = roleAssignment1.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      String string0 = roleAssignment0.getCategoryArtifactId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RoleAssignment roleAssignment0 = new RoleAssignment();
      UserType userType0 = UserType.GROUP;
      RoleAssignment roleAssignment1 = roleAssignment0.userType(userType0);
      assertNull(roleAssignment1.getCategoryArtifactId());
  }
}
