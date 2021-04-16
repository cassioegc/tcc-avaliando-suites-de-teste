/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 15:40:57 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.watson.data.client.model.CustomAttribute;
import com.ibm.watson.data.client.model.CustomAttributeValueObject;
import com.ibm.watson.data.client.model.NewRelationship;
import com.ibm.watson.data.client.model.WriteableGlossaryObjectEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WriteableGlossaryObjectEntity_ESTest extends WriteableGlossaryObjectEntity_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      StringBuilder stringBuilder0 = new StringBuilder("");
      writeableGlossaryObjectEntity0.toString(stringBuilder0);
      assertEquals("    longDescription: null\n    state: null\n    customAttributes: null\n    name: null\n    shortDescription: null\n    effectiveStartDate: null\n    effectiveEndDate: null\n    tags: null\n    stewardIds: null\n    parentCategory: null\n    categories: null\n", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      Stack<String> stack0 = new Stack<String>();
      writeableGlossaryObjectEntity0.setTags(stack0);
      List<String> list0 = writeableGlossaryObjectEntity0.getTags();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      writeableGlossaryObjectEntity0.addTagsItem((String) null);
      List<String> list0 = writeableGlossaryObjectEntity0.getTags();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      LinkedList<java.util.Locale.LanguageRange> linkedList0 = new LinkedList<java.util.Locale.LanguageRange>();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      List<String> list0 = java.util.Locale.filterTags((List<java.util.Locale.LanguageRange>) linkedList0, (Collection<String>) linkedHashSet0);
      writeableGlossaryObjectEntity0.stewardIds(list0);
      List<String> list1 = writeableGlossaryObjectEntity0.getStewardIds();
      assertSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      writeableGlossaryObjectEntity0.addStewardIdsItem((String) null);
      List<String> list0 = writeableGlossaryObjectEntity0.getStewardIds();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      writeableGlossaryObjectEntity0.shortDescription("    categories: ");
      String string0 = writeableGlossaryObjectEntity0.getShortDescription();
      assertEquals("    categories: ", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      writeableGlossaryObjectEntity0.shortDescription("");
      String string0 = writeableGlossaryObjectEntity0.getShortDescription();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      writeableGlossaryObjectEntity0.name(";]42eCBJ(");
      String string0 = writeableGlossaryObjectEntity0.getName();
      assertEquals(";]42eCBJ(", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      writeableGlossaryObjectEntity0.name("");
      String string0 = writeableGlossaryObjectEntity0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      MockDate mockDate0 = new MockDate();
      writeableGlossaryObjectEntity0.setEffectiveStartDate(mockDate0);
      Date date0 = writeableGlossaryObjectEntity0.getEffectiveStartDate();
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      MockDate mockDate0 = new MockDate(0, 0, (-2093), 1, 1283, 1283);
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity1 = writeableGlossaryObjectEntity0.effectiveEndDate(mockDate0);
      Date date0 = writeableGlossaryObjectEntity1.getEffectiveEndDate();
      assertSame(mockDate0, date0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      ArrayList<NewRelationship> arrayList0 = new ArrayList<NewRelationship>();
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity1 = writeableGlossaryObjectEntity0.categories(arrayList0);
      List<NewRelationship> list0 = writeableGlossaryObjectEntity1.getCategories();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      NewRelationship newRelationship0 = new NewRelationship();
      writeableGlossaryObjectEntity0.addCategoriesItem(newRelationship0);
      List<NewRelationship> list0 = writeableGlossaryObjectEntity0.getCategories();
      assertTrue(list0.contains(newRelationship0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      CustomAttribute customAttribute0 = new CustomAttribute();
      CustomAttributeValueObject customAttributeValueObject0 = new CustomAttributeValueObject();
      CustomAttributeValueObject customAttributeValueObject1 = customAttributeValueObject0.value(customAttribute0);
      customAttribute0.addValuesItem(customAttributeValueObject1);
      writeableGlossaryObjectEntity0.addCustomAttributesItem(customAttribute0);
      // Undeclared exception!
      try { 
        writeableGlossaryObjectEntity0.hashCode();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      XmlSuite xmlSuite0 = new XmlSuite();
      XmlTest xmlTest0 = new XmlTest(xmlSuite0);
      List<String> list0 = xmlTest0.getExcludedGroups();
      writeableGlossaryObjectEntity0.tags(list0);
      // Undeclared exception!
      try { 
        writeableGlossaryObjectEntity0.addTagsItem("a?<LG@PV/_ox^{NPIq!");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      XmlSuite xmlSuite0 = new XmlSuite();
      XmlTest xmlTest0 = new XmlTest(xmlSuite0);
      List<String> list0 = xmlTest0.getIncludedGroups();
      writeableGlossaryObjectEntity0.stewardIds(list0);
      // Undeclared exception!
      try { 
        writeableGlossaryObjectEntity0.addStewardIdsItem((String) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      // Undeclared exception!
      try { 
        writeableGlossaryObjectEntity0.toString((StringBuilder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.watson.data.client.model.GlossaryObjectEntity", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      NewRelationship newRelationship0 = new NewRelationship();
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity1 = new WriteableGlossaryObjectEntity();
      assertTrue(writeableGlossaryObjectEntity1.equals((Object)writeableGlossaryObjectEntity0));
      
      writeableGlossaryObjectEntity1.parentCategory(newRelationship0);
      boolean boolean0 = writeableGlossaryObjectEntity0.equals(writeableGlossaryObjectEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity1 = new WriteableGlossaryObjectEntity();
      assertTrue(writeableGlossaryObjectEntity1.equals((Object)writeableGlossaryObjectEntity0));
      
      writeableGlossaryObjectEntity0.addStewardIdsItem("FALSE");
      boolean boolean0 = writeableGlossaryObjectEntity0.equals(writeableGlossaryObjectEntity1);
      assertFalse(writeableGlossaryObjectEntity1.equals((Object)writeableGlossaryObjectEntity0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      writeableGlossaryObjectEntity0.tags(arrayList0);
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity1 = new WriteableGlossaryObjectEntity();
      boolean boolean0 = writeableGlossaryObjectEntity0.equals(writeableGlossaryObjectEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      MockDate mockDate0 = new MockDate(6, 6, 8, 8, 8);
      writeableGlossaryObjectEntity0.setEffectiveEndDate(mockDate0);
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity1 = new WriteableGlossaryObjectEntity();
      boolean boolean0 = writeableGlossaryObjectEntity0.equals(writeableGlossaryObjectEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity1 = new WriteableGlossaryObjectEntity();
      assertTrue(writeableGlossaryObjectEntity1.equals((Object)writeableGlossaryObjectEntity0));
      
      writeableGlossaryObjectEntity1.shortDescription("g");
      boolean boolean0 = writeableGlossaryObjectEntity0.equals(writeableGlossaryObjectEntity1);
      assertFalse(writeableGlossaryObjectEntity1.equals((Object)writeableGlossaryObjectEntity0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity1 = new WriteableGlossaryObjectEntity();
      writeableGlossaryObjectEntity1.setLongDescription("java.lang.Object@0000000005");
      boolean boolean0 = writeableGlossaryObjectEntity0.equals(writeableGlossaryObjectEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity1 = new WriteableGlossaryObjectEntity();
      boolean boolean0 = writeableGlossaryObjectEntity0.equals(writeableGlossaryObjectEntity1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      boolean boolean0 = writeableGlossaryObjectEntity0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      boolean boolean0 = writeableGlossaryObjectEntity0.equals(writeableGlossaryObjectEntity0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      NewRelationship newRelationship0 = new NewRelationship();
      boolean boolean0 = writeableGlossaryObjectEntity0.equals(newRelationship0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      NewRelationship newRelationship0 = new NewRelationship();
      writeableGlossaryObjectEntity0.addCategoriesItem(newRelationship0);
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity1 = new WriteableGlossaryObjectEntity();
      boolean boolean0 = writeableGlossaryObjectEntity0.equals(writeableGlossaryObjectEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      NewRelationship newRelationship0 = new NewRelationship();
      LinkedList<NewRelationship> linkedList0 = new LinkedList<NewRelationship>();
      writeableGlossaryObjectEntity0.setCategories(linkedList0);
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity1 = writeableGlossaryObjectEntity0.addCategoriesItem(newRelationship0);
      assertNull(writeableGlossaryObjectEntity1.getState());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      List<NewRelationship> list0 = writeableGlossaryObjectEntity0.getCategories();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      writeableGlossaryObjectEntity0.setShortDescription("java.lang.Object@0000000005");
      assertNull(writeableGlossaryObjectEntity0.getLongDescription());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      writeableGlossaryObjectEntity0.setName("class WriteableGlossaryObjectEntity {\n    longDescription: null\n    state: null\n    customAttributes: null\n    name: null\n    shortDescription: null\n    effectiveStartDate: org.evosuite.runtime.mock.java.util.MockDate@0000000008\n    effectiveEndDate: org.evosuite.runtime.mock.java.util.MockDate@0000000006\n    tags: null\n    stewardIds: null\n    parentCategory: null\n    categories: null\n}");
      assertNull(writeableGlossaryObjectEntity0.getShortDescription());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      NewRelationship newRelationship0 = new NewRelationship();
      writeableGlossaryObjectEntity0.setParentCategory(newRelationship0);
      assertNull(newRelationship0.getId());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      Date date0 = writeableGlossaryObjectEntity0.getEffectiveStartDate();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      MockDate mockDate0 = new MockDate(6, 6, 8, 8, 8);
      writeableGlossaryObjectEntity0.effectiveStartDate(mockDate0);
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity1 = new WriteableGlossaryObjectEntity();
      boolean boolean0 = writeableGlossaryObjectEntity0.equals(writeableGlossaryObjectEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      List<String> list0 = writeableGlossaryObjectEntity0.getTags();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      Date date0 = writeableGlossaryObjectEntity0.getEffectiveEndDate();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      writeableGlossaryObjectEntity0.hashCode();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      String string0 = writeableGlossaryObjectEntity0.getShortDescription();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      writeableGlossaryObjectEntity0.name("FALSE");
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity1 = new WriteableGlossaryObjectEntity();
      boolean boolean0 = writeableGlossaryObjectEntity0.equals(writeableGlossaryObjectEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      String string0 = writeableGlossaryObjectEntity0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      writeableGlossaryObjectEntity0.setStewardIds(arrayList0);
      assertNull(writeableGlossaryObjectEntity0.getShortDescription());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      String string0 = writeableGlossaryObjectEntity0.toString();
      assertEquals("class WriteableGlossaryObjectEntity {\n    longDescription: null\n    state: null\n    customAttributes: null\n    name: null\n    shortDescription: null\n    effectiveStartDate: null\n    effectiveEndDate: null\n    tags: null\n    stewardIds: null\n    parentCategory: null\n    categories: null\n}", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      NewRelationship newRelationship0 = writeableGlossaryObjectEntity0.getParentCategory();
      assertNull(newRelationship0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      NewRelationship newRelationship0 = new NewRelationship();
      writeableGlossaryObjectEntity0.parentCategory(newRelationship0);
      NewRelationship newRelationship1 = writeableGlossaryObjectEntity0.getParentCategory();
      assertSame(newRelationship1, newRelationship0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      WriteableGlossaryObjectEntity writeableGlossaryObjectEntity0 = new WriteableGlossaryObjectEntity();
      List<String> list0 = writeableGlossaryObjectEntity0.getStewardIds();
      assertNull(list0);
  }
}
