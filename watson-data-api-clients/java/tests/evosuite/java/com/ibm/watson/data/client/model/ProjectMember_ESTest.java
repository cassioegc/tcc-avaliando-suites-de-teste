/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 19:15:58 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.ProjectMember;
import com.ibm.watson.data.client.model.enums.MemberState;
import com.ibm.watson.data.client.model.enums.MemberType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProjectMember_ESTest extends ProjectMember_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ProjectMember projectMember0 = new ProjectMember();
      projectMember0.userName("CUSTOM");
      String string0 = projectMember0.getUserName();
      assertEquals("CUSTOM", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ProjectMember projectMember0 = new ProjectMember();
      projectMember0.setType((MemberType) null);
      projectMember0.getType();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ProjectMember projectMember0 = new ProjectMember();
      projectMember0.setRole("class ProjectMember {\n    id: null\n    role: null\n    state: com.ibm.watson.data.client.model.enums.MemberState@0000000002\n    type: com.ibm.watson.data.client.model.enums.MemberType@0000000003\n    userName: null\n}");
      String string0 = projectMember0.getRole();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ProjectMember projectMember0 = new ProjectMember();
      projectMember0.role("");
      String string0 = projectMember0.getRole();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ProjectMember projectMember0 = new ProjectMember();
      projectMember0.id("\u0007");
      String string0 = projectMember0.getId();
      assertEquals("\u0007", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ProjectMember projectMember0 = new ProjectMember();
      projectMember0.id("");
      String string0 = projectMember0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ProjectMember projectMember0 = new ProjectMember();
      ProjectMember projectMember1 = new ProjectMember();
      assertTrue(projectMember1.equals((Object)projectMember0));
      
      projectMember1.userName("\u0007");
      boolean boolean0 = projectMember0.equals(projectMember1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ProjectMember projectMember0 = new ProjectMember();
      MemberType memberType0 = MemberType.SERVICE;
      ProjectMember projectMember1 = new ProjectMember();
      assertTrue(projectMember1.equals((Object)projectMember0));
      
      projectMember1.setType(memberType0);
      boolean boolean0 = projectMember0.equals(projectMember1);
      assertFalse(projectMember1.equals((Object)projectMember0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ProjectMember projectMember0 = new ProjectMember();
      projectMember0.setRole("class ProjectMember {\n    id: null\n    role: null\n    state: com.ibm.watson.data.client.model.enums.MemberState@0000000002\n    type: com.ibm.watson.data.client.model.enums.MemberType@0000000003\n    userName: null\n}");
      ProjectMember projectMember1 = new ProjectMember();
      boolean boolean0 = projectMember0.equals(projectMember1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ProjectMember projectMember0 = new ProjectMember();
      projectMember0.setId("}");
      ProjectMember projectMember1 = new ProjectMember();
      boolean boolean0 = projectMember0.equals(projectMember1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ProjectMember projectMember0 = new ProjectMember();
      Object object0 = new Object();
      boolean boolean0 = projectMember0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ProjectMember projectMember0 = new ProjectMember();
      ProjectMember projectMember1 = new ProjectMember();
      boolean boolean0 = projectMember0.equals(projectMember1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ProjectMember projectMember0 = new ProjectMember();
      boolean boolean0 = projectMember0.equals(projectMember0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ProjectMember projectMember0 = new ProjectMember();
      boolean boolean0 = projectMember0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ProjectMember projectMember0 = new ProjectMember();
      MemberType memberType0 = projectMember0.getType();
      assertEquals(MemberType.USER, memberType0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ProjectMember projectMember0 = new ProjectMember();
      String string0 = projectMember0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ProjectMember projectMember0 = new ProjectMember();
      String string0 = projectMember0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ProjectMember projectMember0 = new ProjectMember();
      String string0 = projectMember0.getRole();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ProjectMember projectMember0 = new ProjectMember();
      MemberState memberState0 = MemberState.PENDING;
      projectMember0.state(memberState0);
      ProjectMember projectMember1 = new ProjectMember();
      boolean boolean0 = projectMember0.equals(projectMember1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ProjectMember projectMember0 = new ProjectMember();
      projectMember0.setUserName("yA");
      assertEquals(MemberType.USER, projectMember0.getType());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ProjectMember projectMember0 = new ProjectMember();
      projectMember0.userName("");
      String string0 = projectMember0.getUserName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ProjectMember projectMember0 = new ProjectMember();
      String string0 = projectMember0.getUserName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ProjectMember projectMember0 = new ProjectMember();
      MemberState memberState0 = projectMember0.getState();
      assertEquals(MemberState.ACTIVE, memberState0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ProjectMember projectMember0 = new ProjectMember();
      projectMember0.hashCode();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ProjectMember projectMember0 = new ProjectMember();
      MemberType memberType0 = MemberType.SERVICE;
      ProjectMember projectMember1 = projectMember0.type(memberType0);
      assertSame(projectMember0, projectMember1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ProjectMember projectMember0 = new ProjectMember();
      MemberState memberState0 = MemberState.PENDING;
      projectMember0.setState(memberState0);
      assertNull(projectMember0.getUserName());
  }
}
