/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 18:33:42 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.watson.data.client.model.GlossaryArchiveResponse;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.testng.xml.XmlDefine;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GlossaryArchiveResponse_ESTest extends GlossaryArchiveResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GlossaryArchiveResponse glossaryArchiveResponse0 = new GlossaryArchiveResponse();
      Stack<String> stack0 = new Stack<String>();
      glossaryArchiveResponse0.updatedGuids(stack0);
      List<String> list0 = glossaryArchiveResponse0.getUpdatedGuids();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GlossaryArchiveResponse glossaryArchiveResponse0 = new GlossaryArchiveResponse();
      glossaryArchiveResponse0.addUpdatedGuidsItem("class GlossaryArchiveResponse {\n    archivedGuids: null\n    updatedGuids: java.util.Stack@0000000002\n    deleteGuids: null\n}");
      List<String> list0 = glossaryArchiveResponse0.getUpdatedGuids();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GlossaryArchiveResponse glossaryArchiveResponse0 = new GlossaryArchiveResponse();
      Vector<String> vector0 = new Vector<String>();
      GlossaryArchiveResponse glossaryArchiveResponse1 = glossaryArchiveResponse0.deleteGuids(vector0);
      List<String> list0 = glossaryArchiveResponse1.getDeleteGuids();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GlossaryArchiveResponse glossaryArchiveResponse0 = new GlossaryArchiveResponse();
      glossaryArchiveResponse0.addDeleteGuidsItem("=-^Q}y:adqj*e}wak");
      List<String> list0 = glossaryArchiveResponse0.getDeleteGuids();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GlossaryArchiveResponse glossaryArchiveResponse0 = new GlossaryArchiveResponse();
      XmlDefine xmlDefine0 = new XmlDefine();
      List<String> list0 = xmlDefine0.getIncludes();
      glossaryArchiveResponse0.archivedGuids(list0);
      List<String> list1 = glossaryArchiveResponse0.getArchivedGuids();
      assertSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GlossaryArchiveResponse glossaryArchiveResponse0 = new GlossaryArchiveResponse();
      Stack<String> stack0 = new Stack<String>();
      GlossaryArchiveResponse glossaryArchiveResponse1 = glossaryArchiveResponse0.archivedGuids(stack0);
      GlossaryArchiveResponse glossaryArchiveResponse2 = glossaryArchiveResponse1.updatedGuids(stack0);
      glossaryArchiveResponse0.addUpdatedGuidsItem("=-^Q}y:adqj*e}wak");
      List<String> list0 = glossaryArchiveResponse2.getArchivedGuids();
      assertTrue(list0.contains("=-^Q}y:adqj*e}wak"));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GlossaryArchiveResponse glossaryArchiveResponse0 = new GlossaryArchiveResponse();
      XmlSuite xmlSuite0 = new XmlSuite();
      XmlTest xmlTest0 = new XmlTest(xmlSuite0, (int) xmlSuite0.DEFAULT_VERBOSE);
      List<String> list0 = xmlTest0.getExcludedGroups();
      glossaryArchiveResponse0.updatedGuids(list0);
      // Undeclared exception!
      try { 
        glossaryArchiveResponse0.addUpdatedGuidsItem("|#|.b{AN&>\"*=XC|(G");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GlossaryArchiveResponse glossaryArchiveResponse0 = new GlossaryArchiveResponse();
      XmlSuite xmlSuite0 = new XmlSuite();
      XmlTest xmlTest0 = new XmlTest(xmlSuite0, (int) xmlSuite0.DEFAULT_DATA_PROVIDER_THREAD_COUNT);
      List<String> list0 = xmlTest0.getIncludedGroups();
      GlossaryArchiveResponse glossaryArchiveResponse1 = glossaryArchiveResponse0.deleteGuids(list0);
      // Undeclared exception!
      try { 
        glossaryArchiveResponse1.addDeleteGuidsItem("yT~L(u;3^5?3P&l!(");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GlossaryArchiveResponse glossaryArchiveResponse0 = new GlossaryArchiveResponse();
      Stack<String> stack0 = new Stack<String>();
      glossaryArchiveResponse0.setUpdatedGuids(stack0);
      String string0 = glossaryArchiveResponse0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GlossaryArchiveResponse glossaryArchiveResponse0 = new GlossaryArchiveResponse();
      glossaryArchiveResponse0.addUpdatedGuidsItem("pPRb2MrXMC$(P{1OP");
      GlossaryArchiveResponse glossaryArchiveResponse1 = new GlossaryArchiveResponse();
      boolean boolean0 = glossaryArchiveResponse0.equals(glossaryArchiveResponse1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GlossaryArchiveResponse glossaryArchiveResponse0 = new GlossaryArchiveResponse();
      Stack<String> stack0 = new Stack<String>();
      glossaryArchiveResponse0.archivedGuids(stack0);
      GlossaryArchiveResponse glossaryArchiveResponse1 = new GlossaryArchiveResponse();
      boolean boolean0 = glossaryArchiveResponse0.equals(glossaryArchiveResponse1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GlossaryArchiveResponse glossaryArchiveResponse0 = new GlossaryArchiveResponse();
      GlossaryArchiveResponse glossaryArchiveResponse1 = new GlossaryArchiveResponse();
      boolean boolean0 = glossaryArchiveResponse0.equals(glossaryArchiveResponse1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GlossaryArchiveResponse glossaryArchiveResponse0 = new GlossaryArchiveResponse();
      boolean boolean0 = glossaryArchiveResponse0.equals("=-^Q}y:adqj*e}wak");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GlossaryArchiveResponse glossaryArchiveResponse0 = new GlossaryArchiveResponse();
      boolean boolean0 = glossaryArchiveResponse0.equals(glossaryArchiveResponse0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GlossaryArchiveResponse glossaryArchiveResponse0 = new GlossaryArchiveResponse();
      boolean boolean0 = glossaryArchiveResponse0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GlossaryArchiveResponse glossaryArchiveResponse0 = new GlossaryArchiveResponse();
      GlossaryArchiveResponse glossaryArchiveResponse1 = glossaryArchiveResponse0.addArchivedGuidsItem("`0cY%i*");
      assertSame(glossaryArchiveResponse1, glossaryArchiveResponse0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GlossaryArchiveResponse glossaryArchiveResponse0 = new GlossaryArchiveResponse();
      glossaryArchiveResponse0.hashCode();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GlossaryArchiveResponse glossaryArchiveResponse0 = new GlossaryArchiveResponse();
      List<String> list0 = glossaryArchiveResponse0.getUpdatedGuids();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GlossaryArchiveResponse glossaryArchiveResponse0 = new GlossaryArchiveResponse();
      Stack<String> stack0 = new Stack<String>();
      glossaryArchiveResponse0.setArchivedGuids(stack0);
      assertEquals("[]", stack0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GlossaryArchiveResponse glossaryArchiveResponse0 = new GlossaryArchiveResponse();
      XmlDefine xmlDefine0 = new XmlDefine();
      List<String> list0 = xmlDefine0.getIncludes();
      GlossaryArchiveResponse glossaryArchiveResponse1 = glossaryArchiveResponse0.deleteGuids(list0);
      GlossaryArchiveResponse glossaryArchiveResponse2 = new GlossaryArchiveResponse();
      boolean boolean0 = glossaryArchiveResponse2.equals(glossaryArchiveResponse1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GlossaryArchiveResponse glossaryArchiveResponse0 = new GlossaryArchiveResponse();
      List<String> list0 = glossaryArchiveResponse0.getDeleteGuids();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GlossaryArchiveResponse glossaryArchiveResponse0 = new GlossaryArchiveResponse();
      XmlSuite xmlSuite0 = new XmlSuite();
      XmlTest xmlTest0 = new XmlTest(xmlSuite0);
      List<String> list0 = xmlTest0.getIncludedGroups();
      GlossaryArchiveResponse glossaryArchiveResponse1 = glossaryArchiveResponse0.archivedGuids(list0);
      // Undeclared exception!
      try { 
        glossaryArchiveResponse1.addArchivedGuidsItem("; Secure");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GlossaryArchiveResponse glossaryArchiveResponse0 = new GlossaryArchiveResponse();
      Stack<String> stack0 = new Stack<String>();
      glossaryArchiveResponse0.setDeleteGuids(stack0);
      assertTrue(stack0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GlossaryArchiveResponse glossaryArchiveResponse0 = new GlossaryArchiveResponse();
      List<String> list0 = glossaryArchiveResponse0.getArchivedGuids();
      assertNull(list0);
  }
}
