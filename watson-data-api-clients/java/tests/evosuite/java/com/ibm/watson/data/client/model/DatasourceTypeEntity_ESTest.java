/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 14:06:33 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.watson.data.client.model.DatasourceTypeAction;
import com.ibm.watson.data.client.model.DatasourceTypeDiscovery;
import com.ibm.watson.data.client.model.DatasourceTypeEntity;
import com.ibm.watson.data.client.model.DatasourceTypeProperties;
import com.ibm.watson.data.client.model.enums.DataShape;
import com.ibm.watson.data.client.model.enums.DatasourceTypeEnum;
import com.ibm.watson.data.client.model.enums.DatasourceTypeStatus;
import com.ibm.watson.data.client.model.enums.SecureGateway;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.testng.internal.DynamicGraph;
import org.testng.xml.XmlRun;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DatasourceTypeEntity_ESTest extends DatasourceTypeEntity_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeEnum datasourceTypeEnum0 = DatasourceTypeEnum.FILE;
      datasourceTypeEntity0.type(datasourceTypeEnum0);
      DatasourceTypeEnum datasourceTypeEnum1 = datasourceTypeEntity0.getType();
      assertSame(datasourceTypeEnum1, datasourceTypeEnum0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      XmlSuite xmlSuite0 = new XmlSuite();
      List<String> list0 = xmlSuite0.getIncludedGroups();
      datasourceTypeEntity0.setTags(list0);
      List<String> list1 = datasourceTypeEntity0.getTags();
      assertSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      datasourceTypeEntity0.addTagsItem("\n");
      List<String> list0 = datasourceTypeEntity0.getTags();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      XmlSuite xmlSuite0 = new XmlSuite();
      List<String> list0 = xmlSuite0.getListeners();
      datasourceTypeEntity0.supportedProducts(list0);
      List<String> list1 = datasourceTypeEntity0.getSupportedProducts();
      assertTrue(list1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeEntity datasourceTypeEntity1 = datasourceTypeEntity0.addSupportedPlansItem("    supportedProducts: ");
      List<String> list0 = datasourceTypeEntity1.getSupportedPlans();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DynamicGraph<String> dynamicGraph0 = new DynamicGraph<String>();
      List<String> list0 = dynamicGraph0.getDependenciesFor("Ok#TS]?6hk(I");
      DatasourceTypeEntity datasourceTypeEntity1 = datasourceTypeEntity0.supportedEnvironments(list0);
      List<String> list1 = datasourceTypeEntity1.getSupportedEnvironments();
      assertSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      datasourceTypeEntity0.addSupportedEnvironmentsItem("(\"us");
      List<String> list0 = datasourceTypeEntity0.getSupportedEnvironments();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeStatus datasourceTypeStatus0 = DatasourceTypeStatus.PENDING;
      datasourceTypeEntity0.setStatus(datasourceTypeStatus0);
      DatasourceTypeStatus datasourceTypeStatus1 = datasourceTypeEntity0.getStatus();
      assertEquals("pending", datasourceTypeStatus1.getValue());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeProperties datasourceTypeProperties0 = new DatasourceTypeProperties();
      datasourceTypeEntity0.properties(datasourceTypeProperties0);
      DatasourceTypeProperties datasourceTypeProperties1 = datasourceTypeEntity0.getProperties();
      assertSame(datasourceTypeProperties1, datasourceTypeProperties0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      datasourceTypeEntity0.setName("org.testng.TestListenerAdapter");
      String string0 = datasourceTypeEntity0.getName();
      assertEquals("org.testng.TestListenerAdapter", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeEntity datasourceTypeEntity1 = datasourceTypeEntity0.label("t-WHJf");
      String string0 = datasourceTypeEntity1.getLabel();
      assertEquals("t-WHJf", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      datasourceTypeEntity0.label("");
      String string0 = datasourceTypeEntity0.getLabel();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeDiscovery datasourceTypeDiscovery0 = new DatasourceTypeDiscovery();
      datasourceTypeEntity0.setDiscovery(datasourceTypeDiscovery0);
      DatasourceTypeDiscovery datasourceTypeDiscovery1 = datasourceTypeEntity0.getDiscovery();
      assertSame(datasourceTypeDiscovery1, datasourceTypeDiscovery0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      datasourceTypeEntity0.description("s| 8$Rv=Q)KB");
      String string0 = datasourceTypeEntity0.getDescription();
      assertEquals("s| 8$Rv=Q)KB", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeEntity datasourceTypeEntity1 = datasourceTypeEntity0.description("");
      String string0 = datasourceTypeEntity1.getDescription();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DataShape dataShape0 = DataShape.RECTANGULAR;
      datasourceTypeEntity0.dataShape(dataShape0);
      DataShape dataShape1 = datasourceTypeEntity0.getDataShape();
      assertEquals("rectangular", dataShape1.getValue());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      XmlSuite xmlSuite0 = new XmlSuite();
      datasourceTypeEntity0.autoDiscovery(xmlSuite0.DEFAULT_PRESERVE_ORDER);
      Boolean boolean0 = datasourceTypeEntity0.getAutoDiscovery();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      XmlSuite xmlSuite0 = new XmlSuite();
      datasourceTypeEntity0.setAutoDiscovery(xmlSuite0.DEFAULT_SKIP_FAILED_INVOCATION_COUNTS);
      Boolean boolean0 = datasourceTypeEntity0.getAutoDiscovery();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      Boolean boolean0 = Boolean.TRUE;
      datasourceTypeEntity0.allowedAsTarget(boolean0);
      Boolean boolean1 = datasourceTypeEntity0.getAllowedAsTarget();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      XmlSuite xmlSuite0 = new XmlSuite();
      datasourceTypeEntity0.allowedAsTarget(xmlSuite0.DEFAULT_ALLOW_RETURN_VALUES);
      Boolean boolean0 = datasourceTypeEntity0.getAllowedAsTarget();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      Boolean boolean0 = XmlSuite.DEFAULT_PRESERVE_ORDER;
      DatasourceTypeEntity datasourceTypeEntity1 = datasourceTypeEntity0.allowedAsSource(boolean0);
      Boolean boolean1 = datasourceTypeEntity1.getAllowedAsSource();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      Boolean boolean0 = XmlSuite.DEFAULT_GROUP_BY_INSTANCES;
      datasourceTypeEntity0.allowedAsSource(boolean0);
      Boolean boolean1 = datasourceTypeEntity0.getAllowedAsSource();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      XmlSuite xmlSuite0 = new XmlSuite();
      XmlTest xmlTest0 = new XmlTest(xmlSuite0, (-1021));
      List<String> list0 = xmlTest0.getExcludedGroups();
      datasourceTypeEntity0.tags(list0);
      // Undeclared exception!
      try { 
        datasourceTypeEntity0.addTagsItem((String) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      XmlSuite xmlSuite0 = new XmlSuite();
      XmlTest xmlTest0 = new XmlTest(xmlSuite0);
      List<String> list0 = xmlTest0.getExcludedGroups();
      DatasourceTypeEntity datasourceTypeEntity1 = datasourceTypeEntity0.supportedProducts(list0);
      // Undeclared exception!
      try { 
        datasourceTypeEntity1.addSupportedProductsItem("m91");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      XmlSuite xmlSuite0 = new XmlSuite();
      XmlTest xmlTest0 = new XmlTest(xmlSuite0);
      List<String> list0 = xmlTest0.getExcludedGroups();
      DatasourceTypeEntity datasourceTypeEntity1 = datasourceTypeEntity0.supportedEnvironments(list0);
      // Undeclared exception!
      try { 
        datasourceTypeEntity1.addSupportedEnvironmentsItem("(setName=");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeStatus datasourceTypeStatus0 = DatasourceTypeStatus.INACTIVE;
      datasourceTypeEntity0.setStatus(datasourceTypeStatus0);
      String string0 = datasourceTypeEntity0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeEntity datasourceTypeEntity1 = new DatasourceTypeEntity();
      assertTrue(datasourceTypeEntity1.equals((Object)datasourceTypeEntity0));
      
      datasourceTypeEntity1.addSupportedProductsItem("Accept");
      boolean boolean0 = datasourceTypeEntity0.equals(datasourceTypeEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeEntity datasourceTypeEntity1 = new DatasourceTypeEntity();
      assertTrue(datasourceTypeEntity1.equals((Object)datasourceTypeEntity0));
      
      DatasourceTypeEntity datasourceTypeEntity2 = datasourceTypeEntity1.addSupportedProductsItem("    status: ");
      List<String> list0 = datasourceTypeEntity1.getSupportedProducts();
      datasourceTypeEntity2.supportedPlans(list0);
      boolean boolean0 = datasourceTypeEntity0.equals(datasourceTypeEntity1);
      assertFalse(datasourceTypeEntity1.equals((Object)datasourceTypeEntity0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeEntity datasourceTypeEntity1 = new DatasourceTypeEntity();
      assertTrue(datasourceTypeEntity1.equals((Object)datasourceTypeEntity0));
      
      DatasourceTypeEntity datasourceTypeEntity2 = datasourceTypeEntity0.addSupportedEnvironmentsItem("class DatasourceTypeEntity {\n    name: null\n    label: null\n    description: null\n    type: null\n    allowedAsSource: null\n    allowedAsTarget: null\n    dataShape: null\n    autoDiscovery: null\n    discovery: null\n    secureGateway: null\n    properties: null\n    tags: null\n    actions: null\n    supportedEnvironments: null\n    supportedPlans: null\n    supportedProducts: null\n    status: null\n}");
      boolean boolean0 = datasourceTypeEntity1.equals(datasourceTypeEntity2);
      assertFalse(datasourceTypeEntity1.equals((Object)datasourceTypeEntity0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeEntity datasourceTypeEntity1 = new DatasourceTypeEntity();
      assertTrue(datasourceTypeEntity1.equals((Object)datasourceTypeEntity0));
      
      DatasourceTypeAction datasourceTypeAction0 = new DatasourceTypeAction();
      datasourceTypeEntity1.addActionsItem(datasourceTypeAction0);
      boolean boolean0 = datasourceTypeEntity0.equals(datasourceTypeEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeEntity datasourceTypeEntity1 = new DatasourceTypeEntity();
      boolean boolean0 = datasourceTypeEntity0.equals(datasourceTypeEntity1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeEntity datasourceTypeEntity1 = new DatasourceTypeEntity();
      assertTrue(datasourceTypeEntity1.equals((Object)datasourceTypeEntity0));
      
      DatasourceTypeProperties datasourceTypeProperties0 = new DatasourceTypeProperties();
      datasourceTypeEntity1.properties(datasourceTypeProperties0);
      boolean boolean0 = datasourceTypeEntity0.equals(datasourceTypeEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeEntity datasourceTypeEntity1 = new DatasourceTypeEntity();
      assertTrue(datasourceTypeEntity1.equals((Object)datasourceTypeEntity0));
      
      SecureGateway secureGateway0 = SecureGateway.REQUIRED;
      datasourceTypeEntity1.secureGateway(secureGateway0);
      boolean boolean0 = datasourceTypeEntity0.equals(datasourceTypeEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeEntity datasourceTypeEntity1 = new DatasourceTypeEntity();
      assertTrue(datasourceTypeEntity1.equals((Object)datasourceTypeEntity0));
      
      DatasourceTypeDiscovery datasourceTypeDiscovery0 = new DatasourceTypeDiscovery();
      datasourceTypeEntity1.setDiscovery(datasourceTypeDiscovery0);
      boolean boolean0 = datasourceTypeEntity0.equals(datasourceTypeEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      Boolean boolean0 = XmlSuite.DEFAULT_ALLOW_RETURN_VALUES;
      DatasourceTypeEntity datasourceTypeEntity1 = new DatasourceTypeEntity();
      assertTrue(datasourceTypeEntity1.equals((Object)datasourceTypeEntity0));
      
      datasourceTypeEntity1.autoDiscovery(boolean0);
      boolean boolean1 = datasourceTypeEntity0.equals(datasourceTypeEntity1);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeEntity datasourceTypeEntity1 = new DatasourceTypeEntity();
      assertTrue(datasourceTypeEntity1.equals((Object)datasourceTypeEntity0));
      
      DataShape dataShape0 = DataShape.UNSTRUCTURED;
      datasourceTypeEntity0.setDataShape(dataShape0);
      boolean boolean0 = datasourceTypeEntity0.equals(datasourceTypeEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      Boolean boolean0 = XmlSuite.DEFAULT_ALLOW_RETURN_VALUES;
      datasourceTypeEntity0.allowedAsTarget(boolean0);
      DatasourceTypeEntity datasourceTypeEntity1 = new DatasourceTypeEntity();
      boolean boolean1 = datasourceTypeEntity0.equals(datasourceTypeEntity1);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      Boolean boolean0 = XmlSuite.DEFAULT_ALLOW_RETURN_VALUES;
      DatasourceTypeEntity datasourceTypeEntity1 = new DatasourceTypeEntity();
      assertTrue(datasourceTypeEntity1.equals((Object)datasourceTypeEntity0));
      
      DatasourceTypeEntity datasourceTypeEntity2 = datasourceTypeEntity1.allowedAsSource(boolean0);
      boolean boolean1 = datasourceTypeEntity0.equals(datasourceTypeEntity2);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeEntity datasourceTypeEntity1 = new DatasourceTypeEntity();
      assertTrue(datasourceTypeEntity1.equals((Object)datasourceTypeEntity0));
      
      ArrayList<DatasourceTypeAction> arrayList0 = new ArrayList<DatasourceTypeAction>();
      DatasourceTypeEntity datasourceTypeEntity2 = datasourceTypeEntity1.actions(arrayList0);
      DatasourceTypeEnum datasourceTypeEnum0 = DatasourceTypeEnum.DATABASE;
      DatasourceTypeEntity datasourceTypeEntity3 = datasourceTypeEntity2.type(datasourceTypeEnum0);
      boolean boolean0 = datasourceTypeEntity0.equals(datasourceTypeEntity3);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeEntity datasourceTypeEntity1 = new DatasourceTypeEntity();
      assertTrue(datasourceTypeEntity1.equals((Object)datasourceTypeEntity0));
      
      datasourceTypeEntity1.description("Accept");
      boolean boolean0 = datasourceTypeEntity0.equals(datasourceTypeEntity1);
      assertFalse(datasourceTypeEntity1.equals((Object)datasourceTypeEntity0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeEntity datasourceTypeEntity1 = new DatasourceTypeEntity();
      assertTrue(datasourceTypeEntity1.equals((Object)datasourceTypeEntity0));
      
      datasourceTypeEntity1.label("Accept");
      boolean boolean0 = datasourceTypeEntity0.equals(datasourceTypeEntity1);
      assertFalse(datasourceTypeEntity1.equals((Object)datasourceTypeEntity0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeEntity datasourceTypeEntity1 = new DatasourceTypeEntity();
      datasourceTypeEntity1.name("");
      boolean boolean0 = datasourceTypeEntity0.equals(datasourceTypeEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      XmlSuite xmlSuite0 = new XmlSuite();
      boolean boolean0 = datasourceTypeEntity0.equals(xmlSuite0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      boolean boolean0 = datasourceTypeEntity0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      boolean boolean0 = datasourceTypeEntity0.equals(datasourceTypeEntity0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeEntity datasourceTypeEntity1 = new DatasourceTypeEntity();
      assertTrue(datasourceTypeEntity1.equals((Object)datasourceTypeEntity0));
      
      datasourceTypeEntity1.addTagsItem("    status: ");
      boolean boolean0 = datasourceTypeEntity0.equals(datasourceTypeEntity1);
      assertFalse(datasourceTypeEntity1.equals((Object)datasourceTypeEntity0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      XmlSuite xmlSuite0 = new XmlSuite();
      XmlTest xmlTest0 = new XmlTest(xmlSuite0);
      List<String> list0 = xmlTest0.getIncludedGroups();
      DatasourceTypeEntity datasourceTypeEntity1 = datasourceTypeEntity0.supportedPlans(list0);
      // Undeclared exception!
      try { 
        datasourceTypeEntity1.addSupportedPlansItem("KX`jb*yUL 6K)o");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      XmlRun xmlRun0 = new XmlRun();
      List<String> list0 = xmlRun0.getIncludes();
      datasourceTypeEntity0.setSupportedEnvironments(list0);
      DatasourceTypeEntity datasourceTypeEntity1 = datasourceTypeEntity0.addSupportedEnvironmentsItem((String) null);
      assertNull(datasourceTypeEntity1.getAllowedAsSource());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeAction datasourceTypeAction0 = new DatasourceTypeAction();
      DatasourceTypeEntity datasourceTypeEntity1 = datasourceTypeEntity0.addActionsItem(datasourceTypeAction0);
      List<DatasourceTypeAction> list0 = datasourceTypeEntity1.getActions();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      Stack<DatasourceTypeAction> stack0 = new Stack<DatasourceTypeAction>();
      DatasourceTypeEntity datasourceTypeEntity1 = datasourceTypeEntity0.actions(stack0);
      DatasourceTypeAction datasourceTypeAction0 = new DatasourceTypeAction();
      datasourceTypeEntity1.addActionsItem(datasourceTypeAction0);
      assertTrue(stack0.contains(datasourceTypeAction0));
      assertFalse(stack0.empty());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      datasourceTypeEntity0.setAllowedAsTarget((Boolean) null);
      assertNull(datasourceTypeEntity0.getStatus());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      datasourceTypeEntity0.name("");
      String string0 = datasourceTypeEntity0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeStatus datasourceTypeStatus0 = DatasourceTypeStatus.INACTIVE;
      datasourceTypeEntity0.setStatus(datasourceTypeStatus0);
      DatasourceTypeEntity datasourceTypeEntity1 = new DatasourceTypeEntity();
      boolean boolean0 = datasourceTypeEntity0.equals(datasourceTypeEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      String string0 = datasourceTypeEntity0.getDescription();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      datasourceTypeEntity0.setDescription("class DatasourceTypeEntity {\n    name: null\n    label: null\n    description: null\n    type: null\n    allowedAsSource: null\n    allowedAsTarget: null\n    dataShape: null\n    autoDiscovery: null\n    discovery: null\n    secureGateway: null\n    properties: null\n    tags: null\n    actions: null\n    supportedEnvironments: null\n    supportedPlans: null\n    supportedProducts: null\n    status: null\n}");
      assertNull(datasourceTypeEntity0.getAllowedAsTarget());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      XmlSuite xmlSuite0 = new XmlSuite();
      List<String> list0 = xmlSuite0.getSuiteFiles();
      datasourceTypeEntity0.setSupportedPlans(list0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      datasourceTypeEntity0.setSupportedProducts((List<String>) null);
      assertNull(datasourceTypeEntity0.getStatus());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      SecureGateway secureGateway0 = SecureGateway.REQUIRED;
      datasourceTypeEntity0.setSecureGateway(secureGateway0);
      assertNull(datasourceTypeEntity0.getDataShape());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      datasourceTypeEntity0.getSecureGateway();
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      datasourceTypeEntity0.getStatus();
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      XmlSuite xmlSuite0 = new XmlSuite();
      List<String> list0 = xmlSuite0.getIncludedGroups();
      datasourceTypeEntity0.supportedPlans(list0);
      List<String> list1 = datasourceTypeEntity0.getSupportedPlans();
      assertSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      List<String> list0 = datasourceTypeEntity0.getSupportedEnvironments();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      ArrayList<DatasourceTypeAction> arrayList0 = new ArrayList<DatasourceTypeAction>();
      datasourceTypeEntity0.actions(arrayList0);
      List<DatasourceTypeAction> list0 = datasourceTypeEntity0.getActions();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      List<String> list0 = datasourceTypeEntity0.getSupportedPlans();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      datasourceTypeEntity0.getDataShape();
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      Boolean boolean0 = datasourceTypeEntity0.getAutoDiscovery();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      Boolean boolean0 = datasourceTypeEntity0.getAllowedAsTarget();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      SecureGateway secureGateway0 = SecureGateway.NOT_APPLICABLE;
      DatasourceTypeEntity datasourceTypeEntity1 = datasourceTypeEntity0.secureGateway(secureGateway0);
      SecureGateway secureGateway1 = datasourceTypeEntity1.getSecureGateway();
      assertSame(secureGateway0, secureGateway1);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeProperties datasourceTypeProperties0 = new DatasourceTypeProperties();
      datasourceTypeEntity0.setProperties(datasourceTypeProperties0);
      assertNull(datasourceTypeEntity0.getAllowedAsSource());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeStatus datasourceTypeStatus0 = DatasourceTypeStatus.DEPRECATED;
      DatasourceTypeEntity datasourceTypeEntity1 = datasourceTypeEntity0.status(datasourceTypeStatus0);
      assertEquals(DatasourceTypeStatus.DEPRECATED, datasourceTypeEntity1.getStatus());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      String string0 = datasourceTypeEntity0.getLabel();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      String string0 = datasourceTypeEntity0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeDiscovery datasourceTypeDiscovery0 = new DatasourceTypeDiscovery();
      DatasourceTypeEntity datasourceTypeEntity1 = datasourceTypeEntity0.discovery(datasourceTypeDiscovery0);
      assertNull(datasourceTypeEntity1.getSecureGateway());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      ArrayList<DatasourceTypeAction> arrayList0 = new ArrayList<DatasourceTypeAction>();
      datasourceTypeEntity0.setActions(arrayList0);
      assertNull(datasourceTypeEntity0.getAllowedAsSource());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeDiscovery datasourceTypeDiscovery0 = datasourceTypeEntity0.getDiscovery();
      assertNull(datasourceTypeDiscovery0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      List<String> list0 = datasourceTypeEntity0.getSupportedProducts();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      List<String> list0 = datasourceTypeEntity0.getTags();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      Boolean boolean0 = datasourceTypeEntity0.getAllowedAsSource();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      datasourceTypeEntity0.getType();
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      Boolean boolean0 = XmlSuite.DEFAULT_JUNIT;
      datasourceTypeEntity0.setAllowedAsSource(boolean0);
      assertNull(datasourceTypeEntity0.getName());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      datasourceTypeEntity0.setLabel("reactor.core.publisher.MonoPublishMulticast$MonoPublishMulticaster");
      assertNull(datasourceTypeEntity0.getAllowedAsSource());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeProperties datasourceTypeProperties0 = datasourceTypeEntity0.getProperties();
      assertNull(datasourceTypeProperties0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      DatasourceTypeEnum datasourceTypeEnum0 = DatasourceTypeEnum.DATABASE;
      datasourceTypeEntity0.setType(datasourceTypeEnum0);
      assertNull(datasourceTypeEntity0.getAutoDiscovery());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      datasourceTypeEntity0.hashCode();
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      DatasourceTypeEntity datasourceTypeEntity0 = new DatasourceTypeEntity();
      List<DatasourceTypeAction> list0 = datasourceTypeEntity0.getActions();
      assertNull(list0);
  }
}
