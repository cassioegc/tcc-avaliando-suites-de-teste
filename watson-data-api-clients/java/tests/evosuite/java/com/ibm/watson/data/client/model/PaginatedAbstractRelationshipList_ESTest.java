/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 23:07:01 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.AbstractRelationship;
import com.ibm.watson.data.client.model.PaginatedAbstractRelationshipList;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.testng.xml.XmlSuite;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PaginatedAbstractRelationshipList_ESTest extends PaginatedAbstractRelationshipList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PaginatedAbstractRelationshipList paginatedAbstractRelationshipList0 = new PaginatedAbstractRelationshipList();
      LinkedList<AbstractRelationship> linkedList0 = new LinkedList<AbstractRelationship>();
      PaginatedAbstractRelationshipList paginatedAbstractRelationshipList1 = paginatedAbstractRelationshipList0.resources(linkedList0);
      List<AbstractRelationship> list0 = paginatedAbstractRelationshipList1.getResources();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PaginatedAbstractRelationshipList paginatedAbstractRelationshipList0 = new PaginatedAbstractRelationshipList();
      AbstractRelationship abstractRelationship0 = new AbstractRelationship();
      PaginatedAbstractRelationshipList paginatedAbstractRelationshipList1 = paginatedAbstractRelationshipList0.addResourcesItem(abstractRelationship0);
      List<AbstractRelationship> list0 = paginatedAbstractRelationshipList1.getResources();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PaginatedAbstractRelationshipList paginatedAbstractRelationshipList0 = new PaginatedAbstractRelationshipList();
      PaginatedAbstractRelationshipList paginatedAbstractRelationshipList1 = new PaginatedAbstractRelationshipList();
      boolean boolean0 = paginatedAbstractRelationshipList0.equals(paginatedAbstractRelationshipList1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PaginatedAbstractRelationshipList paginatedAbstractRelationshipList0 = new PaginatedAbstractRelationshipList();
      Integer integer0 = XmlSuite.DEFAULT_VERBOSE;
      paginatedAbstractRelationshipList0.limit(integer0);
      PaginatedAbstractRelationshipList paginatedAbstractRelationshipList1 = new PaginatedAbstractRelationshipList();
      boolean boolean0 = paginatedAbstractRelationshipList0.equals(paginatedAbstractRelationshipList1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PaginatedAbstractRelationshipList paginatedAbstractRelationshipList0 = new PaginatedAbstractRelationshipList();
      Object object0 = new Object();
      boolean boolean0 = paginatedAbstractRelationshipList0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PaginatedAbstractRelationshipList paginatedAbstractRelationshipList0 = new PaginatedAbstractRelationshipList();
      boolean boolean0 = paginatedAbstractRelationshipList0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PaginatedAbstractRelationshipList paginatedAbstractRelationshipList0 = new PaginatedAbstractRelationshipList();
      boolean boolean0 = paginatedAbstractRelationshipList0.equals(paginatedAbstractRelationshipList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PaginatedAbstractRelationshipList paginatedAbstractRelationshipList0 = new PaginatedAbstractRelationshipList();
      AbstractRelationship abstractRelationship0 = new AbstractRelationship();
      PaginatedAbstractRelationshipList paginatedAbstractRelationshipList1 = paginatedAbstractRelationshipList0.addResourcesItem(abstractRelationship0);
      PaginatedAbstractRelationshipList paginatedAbstractRelationshipList2 = new PaginatedAbstractRelationshipList();
      boolean boolean0 = paginatedAbstractRelationshipList1.equals(paginatedAbstractRelationshipList2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PaginatedAbstractRelationshipList paginatedAbstractRelationshipList0 = new PaginatedAbstractRelationshipList();
      AbstractRelationship abstractRelationship0 = new AbstractRelationship();
      paginatedAbstractRelationshipList0.addResourcesItem(abstractRelationship0);
      PaginatedAbstractRelationshipList paginatedAbstractRelationshipList1 = paginatedAbstractRelationshipList0.addResourcesItem(abstractRelationship0);
      assertNull(paginatedAbstractRelationshipList1.getCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PaginatedAbstractRelationshipList paginatedAbstractRelationshipList0 = new PaginatedAbstractRelationshipList();
      paginatedAbstractRelationshipList0.hashCode();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PaginatedAbstractRelationshipList paginatedAbstractRelationshipList0 = new PaginatedAbstractRelationshipList();
      String string0 = paginatedAbstractRelationshipList0.toString();
      assertEquals("class PaginatedAbstractRelationshipList {\n    limit: null\n    count: null\n    first: null\n    next: null\n    offset: null\n    last: null\n    prev: null\n    resources: null\n}", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PaginatedAbstractRelationshipList paginatedAbstractRelationshipList0 = new PaginatedAbstractRelationshipList();
      List<AbstractRelationship> list0 = paginatedAbstractRelationshipList0.getResources();
      paginatedAbstractRelationshipList0.setResources(list0);
      assertNull(paginatedAbstractRelationshipList0.getOffset());
  }
}
