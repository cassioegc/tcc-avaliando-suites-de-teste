/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 15:24:43 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.watson.data.client.model.CustomAttribute;
import com.ibm.watson.data.client.model.CustomAttributeValueObject;
import com.ibm.watson.data.client.model.PaginatedParentRelationshipsList;
import com.ibm.watson.data.client.model.PaginatedRelationshipsList;
import com.ibm.watson.data.client.model.RelationshipParentRelationshipEntity;
import com.ibm.watson.data.client.model.ResponsePolicyEntity;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ResponsePolicyEntity_ESTest extends ResponsePolicyEntity_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      Vector<String> vector0 = new Vector<String>();
      responsePolicyEntity0.stewardIds(vector0);
      List<String> list0 = responsePolicyEntity0.getStewardIds();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      responsePolicyEntity0.addStewardIdsItem("L!|J(!^n");
      List<String> list0 = responsePolicyEntity0.getStewardIds();
      assertTrue(list0.contains("L!|J(!^n"));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      ResponsePolicyEntity responsePolicyEntity1 = responsePolicyEntity0.defaultLocaleId("(!a?Q_rvHPFsV,-&");
      String string0 = responsePolicyEntity1.getDefaultLocaleId();
      assertEquals("(!a?Q_rvHPFsV,-&", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      PaginatedRelationshipsList paginatedRelationshipsList0 = new PaginatedRelationshipsList();
      ResponsePolicyEntity responsePolicyEntity1 = responsePolicyEntity0.classifications(paginatedRelationshipsList0);
      PaginatedRelationshipsList paginatedRelationshipsList1 = responsePolicyEntity1.getClassifications();
      assertNull(paginatedRelationshipsList1.getCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      CustomAttribute customAttribute0 = new CustomAttribute();
      CustomAttributeValueObject customAttributeValueObject0 = new CustomAttributeValueObject();
      CustomAttribute customAttribute1 = customAttribute0.addValuesItem(customAttributeValueObject0);
      customAttributeValueObject0.setValue(customAttribute1);
      responsePolicyEntity0.addCustomAttributesItem(customAttribute1);
      // Undeclared exception!
      try { 
        responsePolicyEntity0.hashCode();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      XmlSuite xmlSuite0 = mock(XmlSuite.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(xmlSuite0).getTests();
      XmlTest xmlTest0 = null;
      try {
        xmlTest0 = new XmlTest(xmlSuite0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.testng.xml.XmlTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      ResponsePolicyEntity responsePolicyEntity1 = new ResponsePolicyEntity();
      assertTrue(responsePolicyEntity1.equals((Object)responsePolicyEntity0));
      
      PaginatedRelationshipsList paginatedRelationshipsList0 = new PaginatedRelationshipsList();
      responsePolicyEntity0.dataProtectionRules(paginatedRelationshipsList0);
      boolean boolean0 = responsePolicyEntity0.equals(responsePolicyEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      ResponsePolicyEntity responsePolicyEntity1 = new ResponsePolicyEntity();
      assertTrue(responsePolicyEntity1.equals((Object)responsePolicyEntity0));
      
      PaginatedParentRelationshipsList paginatedParentRelationshipsList0 = new PaginatedParentRelationshipsList();
      responsePolicyEntity0.retParentCategoryRelationship(paginatedParentRelationshipsList0);
      boolean boolean0 = responsePolicyEntity0.equals(responsePolicyEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      RelationshipParentRelationshipEntity relationshipParentRelationshipEntity0 = new RelationshipParentRelationshipEntity();
      ResponsePolicyEntity responsePolicyEntity1 = new ResponsePolicyEntity();
      assertTrue(responsePolicyEntity1.equals((Object)responsePolicyEntity0));
      
      responsePolicyEntity1.parentCategory(relationshipParentRelationshipEntity0);
      boolean boolean0 = responsePolicyEntity0.equals(responsePolicyEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      ResponsePolicyEntity responsePolicyEntity1 = new ResponsePolicyEntity();
      assertTrue(responsePolicyEntity1.equals((Object)responsePolicyEntity0));
      
      PaginatedRelationshipsList paginatedRelationshipsList0 = new PaginatedRelationshipsList();
      responsePolicyEntity0.rules(paginatedRelationshipsList0);
      responsePolicyEntity0.categories(paginatedRelationshipsList0);
      responsePolicyEntity1.setCategories(paginatedRelationshipsList0);
      boolean boolean0 = responsePolicyEntity0.equals(responsePolicyEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      ResponsePolicyEntity responsePolicyEntity1 = new ResponsePolicyEntity();
      assertTrue(responsePolicyEntity1.equals((Object)responsePolicyEntity0));
      
      PaginatedRelationshipsList paginatedRelationshipsList0 = new PaginatedRelationshipsList();
      responsePolicyEntity0.classifications(paginatedRelationshipsList0);
      responsePolicyEntity0.categories(paginatedRelationshipsList0);
      responsePolicyEntity1.setCategories(paginatedRelationshipsList0);
      boolean boolean0 = responsePolicyEntity0.equals(responsePolicyEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      ResponsePolicyEntity responsePolicyEntity1 = new ResponsePolicyEntity();
      assertTrue(responsePolicyEntity1.equals((Object)responsePolicyEntity0));
      
      PaginatedRelationshipsList paginatedRelationshipsList0 = new PaginatedRelationshipsList();
      responsePolicyEntity0.terms(paginatedRelationshipsList0);
      responsePolicyEntity0.categories(paginatedRelationshipsList0);
      responsePolicyEntity1.setCategories(paginatedRelationshipsList0);
      boolean boolean0 = responsePolicyEntity0.equals(responsePolicyEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      ResponsePolicyEntity responsePolicyEntity1 = new ResponsePolicyEntity();
      assertTrue(responsePolicyEntity1.equals((Object)responsePolicyEntity0));
      
      PaginatedRelationshipsList paginatedRelationshipsList0 = new PaginatedRelationshipsList();
      responsePolicyEntity1.setCategories(paginatedRelationshipsList0);
      boolean boolean0 = responsePolicyEntity0.equals(responsePolicyEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      ResponsePolicyEntity responsePolicyEntity1 = new ResponsePolicyEntity();
      boolean boolean0 = responsePolicyEntity0.equals(responsePolicyEntity1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      RelationshipParentRelationshipEntity relationshipParentRelationshipEntity0 = new RelationshipParentRelationshipEntity();
      ResponsePolicyEntity responsePolicyEntity1 = new ResponsePolicyEntity();
      assertTrue(responsePolicyEntity1.equals((Object)responsePolicyEntity0));
      
      responsePolicyEntity0.parentPolicy(relationshipParentRelationshipEntity0);
      boolean boolean0 = responsePolicyEntity0.equals(responsePolicyEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      ResponsePolicyEntity responsePolicyEntity1 = new ResponsePolicyEntity();
      assertTrue(responsePolicyEntity1.equals((Object)responsePolicyEntity0));
      
      ResponsePolicyEntity responsePolicyEntity2 = responsePolicyEntity1.addStewardIdsItem("L!|J(!^n");
      responsePolicyEntity2.setDefaultLocaleId("L!|J(!^n");
      responsePolicyEntity0.setDefaultLocaleId("L!|J(!^n");
      boolean boolean0 = responsePolicyEntity0.equals(responsePolicyEntity1);
      assertFalse(responsePolicyEntity1.equals((Object)responsePolicyEntity0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      ResponsePolicyEntity responsePolicyEntity1 = new ResponsePolicyEntity();
      assertTrue(responsePolicyEntity1.equals((Object)responsePolicyEntity0));
      
      responsePolicyEntity1.setDefaultLocaleId("L!|J(!^n");
      boolean boolean0 = responsePolicyEntity0.equals(responsePolicyEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      ResponsePolicyEntity responsePolicyEntity1 = new ResponsePolicyEntity();
      LinkedList<CustomAttribute> linkedList0 = new LinkedList<CustomAttribute>();
      responsePolicyEntity1.setCustomAttributes(linkedList0);
      boolean boolean0 = responsePolicyEntity1.equals(responsePolicyEntity0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      RelationshipParentRelationshipEntity relationshipParentRelationshipEntity0 = new RelationshipParentRelationshipEntity();
      boolean boolean0 = responsePolicyEntity0.equals(relationshipParentRelationshipEntity0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      boolean boolean0 = responsePolicyEntity0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      boolean boolean0 = responsePolicyEntity0.equals(responsePolicyEntity0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      ResponsePolicyEntity responsePolicyEntity1 = new ResponsePolicyEntity();
      assertTrue(responsePolicyEntity1.equals((Object)responsePolicyEntity0));
      
      PaginatedRelationshipsList paginatedRelationshipsList0 = new PaginatedRelationshipsList();
      responsePolicyEntity1.subPolicies(paginatedRelationshipsList0);
      boolean boolean0 = responsePolicyEntity0.equals(responsePolicyEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      PaginatedRelationshipsList paginatedRelationshipsList0 = responsePolicyEntity0.getClassifications();
      assertNull(paginatedRelationshipsList0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      PaginatedRelationshipsList paginatedRelationshipsList0 = new PaginatedRelationshipsList();
      responsePolicyEntity0.dataProtectionRules(paginatedRelationshipsList0);
      PaginatedRelationshipsList paginatedRelationshipsList1 = responsePolicyEntity0.getDataProtectionRules();
      assertNull(paginatedRelationshipsList1.getCount());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      PaginatedRelationshipsList paginatedRelationshipsList0 = new PaginatedRelationshipsList();
      responsePolicyEntity0.rules(paginatedRelationshipsList0);
      PaginatedRelationshipsList paginatedRelationshipsList1 = responsePolicyEntity0.getRules();
      assertNull(paginatedRelationshipsList1.getCount());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      PaginatedRelationshipsList paginatedRelationshipsList0 = responsePolicyEntity0.getTerms();
      assertNull(paginatedRelationshipsList0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      PaginatedRelationshipsList paginatedRelationshipsList0 = new PaginatedRelationshipsList();
      responsePolicyEntity0.setCategories(paginatedRelationshipsList0);
      PaginatedRelationshipsList paginatedRelationshipsList1 = responsePolicyEntity0.getCategories();
      assertNull(paginatedRelationshipsList1.getLimit());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      PaginatedRelationshipsList paginatedRelationshipsList0 = new PaginatedRelationshipsList();
      ResponsePolicyEntity responsePolicyEntity1 = responsePolicyEntity0.subPolicies(paginatedRelationshipsList0);
      PaginatedRelationshipsList paginatedRelationshipsList1 = responsePolicyEntity1.getSubPolicies();
      assertNull(paginatedRelationshipsList1.getCount());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      List<String> list0 = responsePolicyEntity0.getStewardIds();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      PaginatedRelationshipsList paginatedRelationshipsList0 = responsePolicyEntity0.getRules();
      assertNull(paginatedRelationshipsList0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      PaginatedRelationshipsList paginatedRelationshipsList0 = responsePolicyEntity0.getSubPolicies();
      assertNull(paginatedRelationshipsList0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      String string0 = responsePolicyEntity0.toString();
      assertEquals("class ResponsePolicyEntity {\n    longDescription: null\n    state: null\n    customAttributes: null\n    defaultLocaleId: null\n    stewardIds: null\n    parentPolicy: null\n    subPolicies: null\n    categories: null\n    terms: null\n    classifications: null\n    rules: null\n    parentCategory: null\n    retParentCategoryRelationship: null\n    dataProtectionRules: null\n}", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      String string0 = responsePolicyEntity0.getDefaultLocaleId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      PaginatedRelationshipsList paginatedRelationshipsList0 = responsePolicyEntity0.getDataProtectionRules();
      assertNull(paginatedRelationshipsList0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      PaginatedParentRelationshipsList paginatedParentRelationshipsList0 = responsePolicyEntity0.getRetParentCategoryRelationship();
      assertNull(paginatedParentRelationshipsList0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      PaginatedRelationshipsList paginatedRelationshipsList0 = responsePolicyEntity0.getCategories();
      assertNull(paginatedRelationshipsList0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      PaginatedRelationshipsList paginatedRelationshipsList0 = new PaginatedRelationshipsList();
      responsePolicyEntity0.terms(paginatedRelationshipsList0);
      PaginatedRelationshipsList paginatedRelationshipsList1 = responsePolicyEntity0.getTerms();
      assertNull(paginatedRelationshipsList1.getOffset());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      RelationshipParentRelationshipEntity relationshipParentRelationshipEntity0 = new RelationshipParentRelationshipEntity();
      responsePolicyEntity0.setParentPolicy(relationshipParentRelationshipEntity0);
      assertNull(responsePolicyEntity0.getLongDescription());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      responsePolicyEntity0.setClassifications((PaginatedRelationshipsList) null);
      assertNull(responsePolicyEntity0.getLongDescription());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      RelationshipParentRelationshipEntity relationshipParentRelationshipEntity0 = responsePolicyEntity0.getParentPolicy();
      assertNull(relationshipParentRelationshipEntity0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      ResponsePolicyEntity responsePolicyEntity1 = responsePolicyEntity0.defaultLocaleId("");
      String string0 = responsePolicyEntity1.getDefaultLocaleId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      RelationshipParentRelationshipEntity relationshipParentRelationshipEntity0 = responsePolicyEntity0.getParentCategory();
      assertNull(relationshipParentRelationshipEntity0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      responsePolicyEntity0.setDataProtectionRules((PaginatedRelationshipsList) null);
      assertNull(responsePolicyEntity0.getLongDescription());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      PaginatedParentRelationshipsList paginatedParentRelationshipsList0 = new PaginatedParentRelationshipsList();
      responsePolicyEntity0.retParentCategoryRelationship(paginatedParentRelationshipsList0);
      PaginatedParentRelationshipsList paginatedParentRelationshipsList1 = responsePolicyEntity0.getRetParentCategoryRelationship();
      assertSame(paginatedParentRelationshipsList1, paginatedParentRelationshipsList0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      responsePolicyEntity0.setSubPolicies((PaginatedRelationshipsList) null);
      assertNull(responsePolicyEntity0.getDefaultLocaleId());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      responsePolicyEntity0.setParentCategory((RelationshipParentRelationshipEntity) null);
      assertNull(responsePolicyEntity0.getDefaultLocaleId());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      PaginatedParentRelationshipsList paginatedParentRelationshipsList0 = new PaginatedParentRelationshipsList();
      responsePolicyEntity0.setRetParentCategoryRelationship(paginatedParentRelationshipsList0);
      assertNull(responsePolicyEntity0.getDefaultLocaleId());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      responsePolicyEntity0.hashCode();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      PaginatedRelationshipsList paginatedRelationshipsList0 = new PaginatedRelationshipsList();
      responsePolicyEntity0.setRules(paginatedRelationshipsList0);
      assertNull(responsePolicyEntity0.getLongDescription());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      RelationshipParentRelationshipEntity relationshipParentRelationshipEntity0 = new RelationshipParentRelationshipEntity();
      ResponsePolicyEntity responsePolicyEntity1 = responsePolicyEntity0.parentCategory(relationshipParentRelationshipEntity0);
      RelationshipParentRelationshipEntity relationshipParentRelationshipEntity1 = responsePolicyEntity1.getParentCategory();
      assertSame(relationshipParentRelationshipEntity0, relationshipParentRelationshipEntity1);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      responsePolicyEntity0.setStewardIds(arrayList0);
      assertNull(responsePolicyEntity0.getDefaultLocaleId());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      RelationshipParentRelationshipEntity relationshipParentRelationshipEntity0 = new RelationshipParentRelationshipEntity();
      responsePolicyEntity0.parentPolicy(relationshipParentRelationshipEntity0);
      RelationshipParentRelationshipEntity relationshipParentRelationshipEntity1 = responsePolicyEntity0.getParentPolicy();
      assertSame(relationshipParentRelationshipEntity1, relationshipParentRelationshipEntity0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ResponsePolicyEntity responsePolicyEntity0 = new ResponsePolicyEntity();
      responsePolicyEntity0.setTerms((PaginatedRelationshipsList) null);
      assertNull(responsePolicyEntity0.getLongDescription());
  }
}
