/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 15:36:26 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.watson.data.client.model.CustomAttribute;
import com.ibm.watson.data.client.model.CustomAttributeValueObject;
import com.ibm.watson.data.client.model.NewRelationship;
import com.ibm.watson.data.client.model.WriteableRuleEntity;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WriteableRuleEntity_ESTest extends WriteableRuleEntity_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      StringBuilder stringBuilder0 = new StringBuilder("X}lp_~hui*");
      writeableRuleEntity0.toString(stringBuilder0);
      assertEquals("X}lp_~hui*    longDescription: null\n    state: null\n    customAttributes: null\n    name: null\n    shortDescription: null\n    effectiveStartDate: null\n    effectiveEndDate: null\n    tags: null\n    stewardIds: null\n    parentCategory: null\n    categories: null\n    policies: null\n    rules: null\n    terms: null\n    classifications: null\n    referenceData: null\n    dataClasses: null\n", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      Vector<NewRelationship> vector0 = new Vector<NewRelationship>();
      writeableRuleEntity0.terms(vector0);
      List<NewRelationship> list0 = writeableRuleEntity0.getTerms();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      NewRelationship newRelationship0 = new NewRelationship();
      WriteableRuleEntity writeableRuleEntity1 = writeableRuleEntity0.addRulesItem(newRelationship0);
      List<NewRelationship> list0 = writeableRuleEntity1.getRules();
      writeableRuleEntity0.terms(list0);
      List<NewRelationship> list1 = writeableRuleEntity0.getTerms();
      assertSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      Stack<NewRelationship> stack0 = new Stack<NewRelationship>();
      writeableRuleEntity0.setRules(stack0);
      List<NewRelationship> list0 = writeableRuleEntity0.getRules();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      Stack<NewRelationship> stack0 = new Stack<NewRelationship>();
      writeableRuleEntity0.referenceData(stack0);
      List<NewRelationship> list0 = writeableRuleEntity0.getReferenceData();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      NewRelationship newRelationship0 = new NewRelationship();
      WriteableRuleEntity writeableRuleEntity1 = writeableRuleEntity0.addReferenceDataItem(newRelationship0);
      List<NewRelationship> list0 = writeableRuleEntity1.getReferenceData();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      ArrayList<NewRelationship> arrayList0 = new ArrayList<NewRelationship>(3228);
      writeableRuleEntity0.policies(arrayList0);
      List<NewRelationship> list0 = writeableRuleEntity0.getPolicies();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      NewRelationship newRelationship0 = new NewRelationship();
      writeableRuleEntity0.addPoliciesItem(newRelationship0);
      List<NewRelationship> list0 = writeableRuleEntity0.getPolicies();
      assertTrue(list0.contains(newRelationship0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      Vector<NewRelationship> vector0 = new Vector<NewRelationship>();
      writeableRuleEntity0.dataClasses(vector0);
      List<NewRelationship> list0 = writeableRuleEntity0.getDataClasses();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      writeableRuleEntity0.addDataClassesItem((NewRelationship) null);
      List<NewRelationship> list0 = writeableRuleEntity0.getDataClasses();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      PriorityQueue<NewRelationship> priorityQueue0 = new PriorityQueue<NewRelationship>();
      ArrayList<NewRelationship> arrayList0 = new ArrayList<NewRelationship>(priorityQueue0);
      writeableRuleEntity0.classifications(arrayList0);
      List<NewRelationship> list0 = writeableRuleEntity0.getClassifications();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      NewRelationship newRelationship0 = new NewRelationship();
      WriteableRuleEntity writeableRuleEntity1 = writeableRuleEntity0.addClassificationsItem(newRelationship0);
      List<NewRelationship> list0 = writeableRuleEntity1.getClassifications();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      CustomAttribute customAttribute0 = new CustomAttribute();
      CustomAttributeValueObject customAttributeValueObject0 = new CustomAttributeValueObject();
      CustomAttribute customAttribute1 = customAttribute0.addValuesItem(customAttributeValueObject0);
      writeableRuleEntity0.addCustomAttributesItem(customAttribute1);
      customAttributeValueObject0.value(customAttribute1);
      // Undeclared exception!
      try { 
        writeableRuleEntity0.hashCode();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      // Undeclared exception!
      try { 
        writeableRuleEntity0.toString((StringBuilder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.watson.data.client.model.GlossaryObjectEntity", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      WriteableRuleEntity writeableRuleEntity1 = new WriteableRuleEntity();
      assertTrue(writeableRuleEntity1.equals((Object)writeableRuleEntity0));
      
      NewRelationship newRelationship0 = new NewRelationship();
      writeableRuleEntity1.addClassificationsItem(newRelationship0);
      boolean boolean0 = writeableRuleEntity0.equals(writeableRuleEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      NewRelationship newRelationship0 = new NewRelationship();
      writeableRuleEntity0.addTermsItem(newRelationship0);
      WriteableRuleEntity writeableRuleEntity1 = new WriteableRuleEntity();
      boolean boolean0 = writeableRuleEntity0.equals(writeableRuleEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      WriteableRuleEntity writeableRuleEntity1 = new WriteableRuleEntity();
      boolean boolean0 = writeableRuleEntity0.equals(writeableRuleEntity1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      Stack<NewRelationship> stack0 = new Stack<NewRelationship>();
      WriteableRuleEntity writeableRuleEntity1 = new WriteableRuleEntity();
      writeableRuleEntity0.categories(stack0);
      boolean boolean0 = writeableRuleEntity0.equals(writeableRuleEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      NewRelationship newRelationship0 = new NewRelationship();
      boolean boolean0 = writeableRuleEntity0.equals(newRelationship0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      boolean boolean0 = writeableRuleEntity0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      boolean boolean0 = writeableRuleEntity0.equals(writeableRuleEntity0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      NewRelationship newRelationship0 = new NewRelationship();
      writeableRuleEntity0.addRulesItem(newRelationship0);
      WriteableRuleEntity writeableRuleEntity1 = new WriteableRuleEntity();
      boolean boolean0 = writeableRuleEntity1.equals(writeableRuleEntity0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      NewRelationship newRelationship0 = new NewRelationship();
      writeableRuleEntity0.addDataClassesItem(newRelationship0);
      WriteableRuleEntity writeableRuleEntity1 = writeableRuleEntity0.addDataClassesItem(newRelationship0);
      assertNull(writeableRuleEntity1.getName());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      NewRelationship newRelationship0 = new NewRelationship();
      writeableRuleEntity0.addReferenceDataItem(newRelationship0);
      WriteableRuleEntity writeableRuleEntity1 = new WriteableRuleEntity();
      boolean boolean0 = writeableRuleEntity0.equals(writeableRuleEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      NewRelationship newRelationship0 = new NewRelationship();
      WriteableRuleEntity writeableRuleEntity1 = writeableRuleEntity0.addRulesItem(newRelationship0);
      List<NewRelationship> list0 = writeableRuleEntity1.getRules();
      writeableRuleEntity1.referenceData(list0);
      WriteableRuleEntity writeableRuleEntity2 = writeableRuleEntity1.addReferenceDataItem(newRelationship0);
      assertNull(writeableRuleEntity2.getLongDescription());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      NewRelationship newRelationship0 = new NewRelationship();
      writeableRuleEntity0.addClassificationsItem(newRelationship0);
      WriteableRuleEntity writeableRuleEntity1 = writeableRuleEntity0.addClassificationsItem(newRelationship0);
      assertNull(writeableRuleEntity1.getName());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      NewRelationship newRelationship0 = new NewRelationship();
      WriteableRuleEntity writeableRuleEntity1 = writeableRuleEntity0.addTermsItem(newRelationship0);
      WriteableRuleEntity writeableRuleEntity2 = writeableRuleEntity1.addTermsItem(newRelationship0);
      assertNull(writeableRuleEntity2.getShortDescription());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      NewRelationship newRelationship0 = new NewRelationship();
      writeableRuleEntity0.addRulesItem(newRelationship0);
      WriteableRuleEntity writeableRuleEntity1 = writeableRuleEntity0.addRulesItem(newRelationship0);
      assertNull(writeableRuleEntity1.getState());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      NewRelationship newRelationship0 = new NewRelationship();
      writeableRuleEntity0.addPoliciesItem(newRelationship0);
      WriteableRuleEntity writeableRuleEntity1 = new WriteableRuleEntity();
      boolean boolean0 = writeableRuleEntity1.equals(writeableRuleEntity0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      ArrayList<NewRelationship> arrayList0 = new ArrayList<NewRelationship>();
      WriteableRuleEntity writeableRuleEntity1 = writeableRuleEntity0.policies(arrayList0);
      NewRelationship newRelationship0 = new NewRelationship();
      WriteableRuleEntity writeableRuleEntity2 = writeableRuleEntity0.addPoliciesItem(newRelationship0);
      assertSame(writeableRuleEntity2, writeableRuleEntity1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      List<NewRelationship> list0 = writeableRuleEntity0.getRules();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      List<NewRelationship> list0 = writeableRuleEntity0.getClassifications();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      List<NewRelationship> list0 = writeableRuleEntity0.getDataClasses();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      writeableRuleEntity0.hashCode();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      writeableRuleEntity0.setReferenceData((List<NewRelationship>) null);
      assertNull(writeableRuleEntity0.getLongDescription());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      List<NewRelationship> list0 = writeableRuleEntity0.getPolicies();
      writeableRuleEntity0.setClassifications(list0);
      assertNull(writeableRuleEntity0.getShortDescription());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      Vector<NewRelationship> vector0 = new Vector<NewRelationship>();
      writeableRuleEntity0.setTerms(vector0);
      assertNull(writeableRuleEntity0.getState());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      Stack<NewRelationship> stack0 = new Stack<NewRelationship>();
      writeableRuleEntity0.setPolicies(stack0);
      assertNull(writeableRuleEntity0.getLongDescription());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      LinkedList<NewRelationship> linkedList0 = new LinkedList<NewRelationship>();
      writeableRuleEntity0.setDataClasses(linkedList0);
      WriteableRuleEntity writeableRuleEntity1 = new WriteableRuleEntity();
      boolean boolean0 = writeableRuleEntity0.equals(writeableRuleEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      List<NewRelationship> list0 = writeableRuleEntity0.getReferenceData();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      Vector<NewRelationship> vector0 = new Vector<NewRelationship>();
      WriteableRuleEntity writeableRuleEntity1 = writeableRuleEntity0.rules(vector0);
      assertSame(writeableRuleEntity1, writeableRuleEntity0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      String string0 = writeableRuleEntity0.toString();
      assertEquals("class WriteableRuleEntity {\n    longDescription: null\n    state: null\n    customAttributes: null\n    name: null\n    shortDescription: null\n    effectiveStartDate: null\n    effectiveEndDate: null\n    tags: null\n    stewardIds: null\n    parentCategory: null\n    categories: null\n    policies: null\n    rules: null\n    terms: null\n    classifications: null\n    referenceData: null\n    dataClasses: null\n}", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      WriteableRuleEntity writeableRuleEntity0 = new WriteableRuleEntity();
      List<NewRelationship> list0 = writeableRuleEntity0.getTerms();
      assertNull(list0);
  }
}
