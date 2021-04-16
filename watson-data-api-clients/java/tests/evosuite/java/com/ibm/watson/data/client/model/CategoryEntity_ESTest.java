/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 16:05:05 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.watson.data.client.model.CategoryEntity;
import com.ibm.watson.data.client.model.CustomAttribute;
import com.ibm.watson.data.client.model.CustomAttributeValueObject;
import com.ibm.watson.data.client.model.GlossaryObjectMetadata;
import com.ibm.watson.data.client.model.RelationshipObject;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CategoryEntity_ESTest extends CategoryEntity_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      Vector<String> vector0 = new Vector<String>();
      categoryEntity0.stewardIds(vector0);
      List<String> list0 = categoryEntity0.getStewardIds();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      categoryEntity0.addStewardIdsItem((String) null);
      List<String> list0 = categoryEntity0.getStewardIds();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      categoryEntity0.setParentCategoryId("reactor.core.publisher.FluxNever");
      String string0 = categoryEntity0.getParentCategoryId();
      assertEquals("reactor.core.publisher.FluxNever", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      CategoryEntity categoryEntity1 = categoryEntity0.parentCategoryId("");
      String string0 = categoryEntity1.getParentCategoryId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      Vector<RelationshipObject> vector0 = new Vector<RelationshipObject>();
      categoryEntity0.parentCategoryFor(vector0);
      List<RelationshipObject> list0 = categoryEntity0.getParentCategoryFor();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      CategoryEntity categoryEntity1 = categoryEntity0.defaultLocaleId("zq>");
      String string0 = categoryEntity1.getDefaultLocaleId();
      assertEquals("zq>", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      categoryEntity0.defaultLocaleId("");
      String string0 = categoryEntity0.getDefaultLocaleId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      CustomAttribute customAttribute0 = new CustomAttribute();
      CustomAttributeValueObject customAttributeValueObject0 = new CustomAttributeValueObject();
      CustomAttribute customAttribute1 = customAttribute0.addValuesItem(customAttributeValueObject0);
      customAttributeValueObject0.value(customAttribute1);
      categoryEntity0.addCustomAttributesItem(customAttribute0);
      // Undeclared exception!
      try { 
        categoryEntity0.hashCode();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      XmlSuite xmlSuite0 = new XmlSuite();
      XmlTest xmlTest0 = new XmlTest(xmlSuite0, (-1649));
      List<String> list0 = xmlTest0.getExcludedGroups();
      CategoryEntity categoryEntity1 = categoryEntity0.stewardIds(list0);
      // Undeclared exception!
      try { 
        categoryEntity1.addStewardIdsItem("eM}:Mr>Ap");
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
      CategoryEntity categoryEntity0 = new CategoryEntity();
      LinkedList<RelationshipObject> linkedList0 = new LinkedList<RelationshipObject>();
      CategoryEntity categoryEntity1 = new CategoryEntity();
      assertTrue(categoryEntity1.equals((Object)categoryEntity0));
      
      RelationshipObject relationshipObject0 = linkedList0.poll();
      categoryEntity0.addParentCategoryForItem(relationshipObject0);
      boolean boolean0 = categoryEntity0.equals(categoryEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      LinkedList<RelationshipObject> linkedList0 = new LinkedList<RelationshipObject>();
      CategoryEntity categoryEntity1 = new CategoryEntity();
      assertTrue(categoryEntity1.equals((Object)categoryEntity0));
      
      RelationshipObject relationshipObject0 = linkedList0.poll();
      categoryEntity1.addGroupedAssetsRelsItem(relationshipObject0);
      boolean boolean0 = categoryEntity0.equals(categoryEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      CategoryEntity categoryEntity1 = new CategoryEntity();
      assertTrue(categoryEntity1.equals((Object)categoryEntity0));
      
      RelationshipObject relationshipObject0 = new RelationshipObject();
      categoryEntity0.addHasTypesCategoryRelsItem(relationshipObject0);
      boolean boolean0 = categoryEntity0.equals(categoryEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      CategoryEntity categoryEntity1 = new CategoryEntity();
      assertTrue(categoryEntity1.equals((Object)categoryEntity0));
      
      categoryEntity0.setParentCategoryId("");
      boolean boolean0 = categoryEntity0.equals(categoryEntity1);
      assertFalse(categoryEntity1.equals((Object)categoryEntity0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      CategoryEntity categoryEntity1 = new CategoryEntity();
      boolean boolean0 = categoryEntity0.equals(categoryEntity1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      CategoryEntity categoryEntity1 = new CategoryEntity();
      assertTrue(categoryEntity1.equals((Object)categoryEntity0));
      
      LinkedList<String> linkedList0 = new LinkedList<String>();
      categoryEntity1.stewardIds(linkedList0);
      boolean boolean0 = categoryEntity0.equals(categoryEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      CategoryEntity categoryEntity1 = new CategoryEntity();
      categoryEntity0.setLongDescription("");
      boolean boolean0 = categoryEntity0.equals(categoryEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      GlossaryObjectMetadata glossaryObjectMetadata0 = new GlossaryObjectMetadata();
      boolean boolean0 = categoryEntity0.equals(glossaryObjectMetadata0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      boolean boolean0 = categoryEntity0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      boolean boolean0 = categoryEntity0.equals(categoryEntity0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      CategoryEntity categoryEntity1 = new CategoryEntity();
      assertTrue(categoryEntity1.equals((Object)categoryEntity0));
      
      categoryEntity1.defaultLocaleId("\n");
      boolean boolean0 = categoryEntity0.equals(categoryEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      RelationshipObject relationshipObject0 = new RelationshipObject();
      CategoryEntity categoryEntity1 = categoryEntity0.addParentCategoryForItem(relationshipObject0);
      List<RelationshipObject> list0 = categoryEntity1.getParentCategoryFor();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      RelationshipObject relationshipObject0 = new RelationshipObject();
      Stack<RelationshipObject> stack0 = new Stack<RelationshipObject>();
      categoryEntity0.parentCategoryFor(stack0);
      CategoryEntity categoryEntity1 = categoryEntity0.addParentCategoryForItem(relationshipObject0);
      assertNull(categoryEntity1.getState());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      RelationshipObject relationshipObject0 = new RelationshipObject();
      categoryEntity0.addGroupedAssetsRelsItem(relationshipObject0);
      List<RelationshipObject> list0 = categoryEntity0.getGroupedAssetsRels();
      assertTrue(list0.contains(relationshipObject0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      RelationshipObject relationshipObject0 = new RelationshipObject();
      CategoryEntity categoryEntity1 = categoryEntity0.addHasTypesCategoryRelsItem(relationshipObject0);
      List<RelationshipObject> list0 = categoryEntity1.getHasTypesCategoryRels();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      RelationshipObject relationshipObject0 = new RelationshipObject();
      Stack<RelationshipObject> stack0 = new Stack<RelationshipObject>();
      CategoryEntity categoryEntity1 = categoryEntity0.hasTypesCategoryRels(stack0);
      categoryEntity1.addHasTypesCategoryRelsItem(relationshipObject0);
      assertTrue(stack0.contains(relationshipObject0));
      assertFalse(stack0.empty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      categoryEntity0.setParentCategoryFor((List<RelationshipObject>) null);
      assertNull(categoryEntity0.getDefaultLocaleId());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      Stack<RelationshipObject> stack0 = new Stack<RelationshipObject>();
      categoryEntity0.setHasTypesCategoryRels(stack0);
      assertEquals(0, stack0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      categoryEntity0.setDefaultLocaleId("    deaultLocaleKd:");
      assertNull(categoryEntity0.getLongDescription());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      String string0 = categoryEntity0.toString();
      assertEquals("class CategoryEntity {\n    longDescription: null\n    state: null\n    customAttributes: null\n    stewardIds: null\n    defaultLocaleId: null\n    parentCategoryId: null\n    hasTypesCategoryRels: null\n    groupedAssetsRels: null\n    parentCategoryFor: null\n}", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      List<RelationshipObject> list0 = categoryEntity0.getHasTypesCategoryRels();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      String string0 = categoryEntity0.getDefaultLocaleId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      List<RelationshipObject> list0 = categoryEntity0.getGroupedAssetsRels();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      Stack<String> stack0 = new Stack<String>();
      categoryEntity0.setStewardIds(stack0);
      assertTrue(stack0.empty());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      Stack<RelationshipObject> stack0 = new Stack<RelationshipObject>();
      categoryEntity0.hasTypesCategoryRels(stack0);
      List<RelationshipObject> list0 = categoryEntity0.getHasTypesCategoryRels();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      String string0 = categoryEntity0.getParentCategoryId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      LinkedList<RelationshipObject> linkedList0 = new LinkedList<RelationshipObject>();
      categoryEntity0.setGroupedAssetsRels(linkedList0);
      CategoryEntity categoryEntity1 = categoryEntity0.addGroupedAssetsRelsItem((RelationshipObject) null);
      assertNull(categoryEntity1.getParentCategoryId());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      categoryEntity0.hashCode();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      List<String> list0 = categoryEntity0.getStewardIds();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      ArrayList<RelationshipObject> arrayList0 = new ArrayList<RelationshipObject>();
      CategoryEntity categoryEntity1 = categoryEntity0.groupedAssetsRels(arrayList0);
      List<RelationshipObject> list0 = categoryEntity1.getGroupedAssetsRels();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CategoryEntity categoryEntity0 = new CategoryEntity();
      List<RelationshipObject> list0 = categoryEntity0.getParentCategoryFor();
      assertNull(list0);
  }
}
