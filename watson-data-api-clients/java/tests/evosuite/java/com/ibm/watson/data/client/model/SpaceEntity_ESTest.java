/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 16:07:00 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.watson.data.client.model.SpaceCompute;
import com.ibm.watson.data.client.model.SpaceEntity;
import com.ibm.watson.data.client.model.SpaceMember;
import com.ibm.watson.data.client.model.SpaceScope;
import com.ibm.watson.data.client.model.SpaceStatus;
import com.ibm.watson.data.client.model.enums.MemberType;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.testng.internal.DynamicGraph;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SpaceEntity_ESTest extends SpaceEntity_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      SpaceEntity spaceEntity1 = spaceEntity0.addTagsItem(",oL!L&9>|4\"");
      List<String> list0 = spaceEntity1.getTags();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      spaceEntity0.setName("\n");
      String string0 = spaceEntity0.getName();
      assertEquals("\n", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      spaceEntity0.name("");
      String string0 = spaceEntity0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      ArrayList<SpaceMember> arrayList0 = new ArrayList<SpaceMember>();
      SpaceEntity spaceEntity1 = spaceEntity0.members(arrayList0);
      List<SpaceMember> list0 = spaceEntity1.getMembers();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      spaceEntity0.description("BuLp'1b#");
      String string0 = spaceEntity0.getDescription();
      assertEquals("BuLp'1b#", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      SpaceEntity spaceEntity1 = spaceEntity0.description("");
      String string0 = spaceEntity1.getDescription();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      ArrayList<SpaceCompute> arrayList0 = new ArrayList<SpaceCompute>();
      spaceEntity0.compute(arrayList0);
      List<SpaceCompute> list0 = spaceEntity0.getCompute();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      SpaceCompute spaceCompute0 = new SpaceCompute();
      spaceEntity0.addComputeItem(spaceCompute0);
      List<SpaceCompute> list0 = spaceEntity0.getCompute();
      assertTrue(list0.contains(spaceCompute0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      XmlSuite xmlSuite0 = new XmlSuite();
      XmlTest xmlTest0 = new XmlTest(xmlSuite0);
      List<String> list0 = xmlTest0.getIncludedGroups();
      SpaceEntity spaceEntity1 = spaceEntity0.tags(list0);
      // Undeclared exception!
      try { 
        spaceEntity1.addTagsItem("com.ibm.watson.data.client.model.SpaceEntity");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      SpaceEntity spaceEntity1 = new SpaceEntity();
      assertTrue(spaceEntity1.equals((Object)spaceEntity0));
      
      SpaceScope spaceScope0 = new SpaceScope();
      spaceEntity1.setScope(spaceScope0);
      boolean boolean0 = spaceEntity1.equals(spaceEntity0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      SpaceEntity spaceEntity1 = new SpaceEntity();
      assertTrue(spaceEntity1.equals((Object)spaceEntity0));
      
      Stack<SpaceMember> stack0 = new Stack<SpaceMember>();
      spaceEntity1.setMembers(stack0);
      boolean boolean0 = spaceEntity1.equals(spaceEntity0);
      assertFalse(spaceEntity1.equals((Object)spaceEntity0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      SpaceEntity spaceEntity1 = new SpaceEntity();
      assertTrue(spaceEntity1.equals((Object)spaceEntity0));
      
      spaceEntity0.description("{4?qa5$q\"=^");
      boolean boolean0 = spaceEntity1.equals(spaceEntity0);
      assertFalse(spaceEntity1.equals((Object)spaceEntity0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      SpaceEntity spaceEntity1 = new SpaceEntity();
      boolean boolean0 = spaceEntity1.equals(spaceEntity0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      spaceEntity0.addTagsItem("-WCUu|K,");
      SpaceEntity spaceEntity1 = new SpaceEntity();
      boolean boolean0 = spaceEntity1.equals(spaceEntity0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      MemberType memberType0 = MemberType.USER;
      boolean boolean0 = spaceEntity0.equals(memberType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      boolean boolean0 = spaceEntity0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      boolean boolean0 = spaceEntity0.equals(spaceEntity0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      Stack<SpaceCompute> stack0 = new Stack<SpaceCompute>();
      SpaceEntity spaceEntity1 = spaceEntity0.compute(stack0);
      SpaceEntity spaceEntity2 = new SpaceEntity();
      boolean boolean0 = spaceEntity2.equals(spaceEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      SpaceMember spaceMember0 = new SpaceMember();
      spaceEntity0.addMembersItem(spaceMember0);
      List<SpaceMember> list0 = spaceEntity0.getMembers();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      Stack<SpaceMember> stack0 = new Stack<SpaceMember>();
      SpaceEntity spaceEntity1 = spaceEntity0.members(stack0);
      SpaceMember spaceMember0 = new SpaceMember();
      spaceEntity1.addMembersItem(spaceMember0);
      assertTrue(stack0.contains(spaceMember0));
      assertFalse(stack0.empty());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      SpaceCompute spaceCompute0 = new SpaceCompute();
      SpaceEntity spaceEntity1 = spaceEntity0.addComputeItem(spaceCompute0);
      String string0 = spaceEntity1.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      Vector<SpaceCompute> vector0 = new Vector<SpaceCompute>();
      SpaceEntity spaceEntity1 = spaceEntity0.compute(vector0);
      SpaceCompute spaceCompute0 = new SpaceCompute();
      spaceEntity1.addComputeItem(spaceCompute0);
      assertTrue(vector0.contains(spaceCompute0));
      assertEquals(1, vector0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      SpaceStatus spaceStatus0 = new SpaceStatus();
      spaceEntity0.setStatus(spaceStatus0);
      SpaceEntity spaceEntity1 = new SpaceEntity();
      boolean boolean0 = spaceEntity1.equals(spaceEntity0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      String string0 = spaceEntity0.getDescription();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      List<SpaceMember> list0 = spaceEntity0.getMembers();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      SpaceScope spaceScope0 = new SpaceScope();
      SpaceEntity spaceEntity1 = spaceEntity0.scope(spaceScope0);
      SpaceScope spaceScope1 = spaceEntity1.getScope();
      assertSame(spaceScope0, spaceScope1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      List<String> list0 = spaceEntity0.getTags();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      SpaceScope spaceScope0 = spaceEntity0.getScope();
      assertNull(spaceScope0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      String string0 = spaceEntity0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      spaceEntity0.setDescription("sCq");
      assertEquals("sCq", spaceEntity0.getDescription());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      spaceEntity0.name("");
      SpaceEntity spaceEntity1 = new SpaceEntity();
      boolean boolean0 = spaceEntity1.equals(spaceEntity0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      spaceEntity0.setCompute((List<SpaceCompute>) null);
      assertNull(spaceEntity0.getName());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      spaceEntity0.hashCode();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      SpaceStatus spaceStatus0 = new SpaceStatus();
      spaceEntity0.status(spaceStatus0);
      SpaceStatus spaceStatus1 = spaceEntity0.getStatus();
      assertNull(spaceStatus1.getState());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      DynamicGraph<String> dynamicGraph0 = new DynamicGraph<String>();
      List<String> list0 = dynamicGraph0.getFreeNodes();
      spaceEntity0.setTags(list0);
      List<String> list1 = spaceEntity0.getTags();
      assertSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      List<SpaceCompute> list0 = spaceEntity0.getCompute();
      SpaceEntity spaceEntity1 = spaceEntity0.compute(list0);
      assertSame(spaceEntity0, spaceEntity1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SpaceEntity spaceEntity0 = new SpaceEntity();
      SpaceStatus spaceStatus0 = spaceEntity0.getStatus();
      assertNull(spaceStatus0);
  }
}
