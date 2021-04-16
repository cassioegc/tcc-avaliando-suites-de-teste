/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 17:31:46 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.watson.data.client.model.ContentLocation;
import com.ibm.watson.data.client.model.Metric;
import com.ibm.watson.data.client.model.ModelEntityRequest;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ModelEntityRequest_ESTest extends ModelEntityRequest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      XmlSuite xmlSuite0 = new XmlSuite();
      List<String> list0 = xmlSuite0.getIncludedGroups();
      modelEntityRequest0.tags(list0);
      List<String> list1 = modelEntityRequest0.getTags();
      assertSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      modelEntityRequest0.addTagsItem("    contentLocation: ");
      List<String> list0 = modelEntityRequest0.getTags();
      assertTrue(list0.contains("    contentLocation: "));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      modelEntityRequest0.spaceId("reactor.ipc.netty.tcp.TcpClient$Builder");
      String string0 = modelEntityRequest0.getSpaceId();
      assertEquals("reactor.ipc.netty.tcp.TcpClient$Builder", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      ModelEntityRequest modelEntityRequest1 = modelEntityRequest0.spaceId("");
      String string0 = modelEntityRequest1.getSpaceId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      modelEntityRequest0.projectId("K?G");
      String string0 = modelEntityRequest0.getProjectId();
      assertEquals("K?G", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      modelEntityRequest0.projectId("");
      String string0 = modelEntityRequest0.getProjectId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      modelEntityRequest0.name("    name: ");
      String string0 = modelEntityRequest0.getName();
      assertEquals("    name: ", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      ModelEntityRequest modelEntityRequest1 = modelEntityRequest0.name("");
      String string0 = modelEntityRequest1.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      modelEntityRequest0.setDescription("");
      String string0 = modelEntityRequest0.getDescription();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      XmlSuite xmlSuite0 = new XmlSuite();
      XmlTest xmlTest0 = new XmlTest(xmlSuite0, (int) xmlSuite0.DEFAULT_DATA_PROVIDER_THREAD_COUNT);
      List<String> list0 = xmlTest0.getIncludedGroups();
      ModelEntityRequest modelEntityRequest1 = modelEntityRequest0.tags(list0);
      // Undeclared exception!
      try { 
        modelEntityRequest1.addTagsItem("reactor.core.publisher.MonoCollectList");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      ModelEntityRequest modelEntityRequest1 = new ModelEntityRequest();
      assertTrue(modelEntityRequest1.equals((Object)modelEntityRequest0));
      
      ContentLocation contentLocation0 = new ContentLocation();
      modelEntityRequest1.contentLocation(contentLocation0);
      boolean boolean0 = modelEntityRequest1.equals(modelEntityRequest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      modelEntityRequest0.addTagsItem("lcC%4g:lq|fR&");
      ModelEntityRequest modelEntityRequest1 = new ModelEntityRequest();
      boolean boolean0 = modelEntityRequest0.equals(modelEntityRequest1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      modelEntityRequest0.description("[SuiteRunner] ");
      ModelEntityRequest modelEntityRequest1 = new ModelEntityRequest();
      boolean boolean0 = modelEntityRequest0.equals(modelEntityRequest1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      ModelEntityRequest modelEntityRequest1 = modelEntityRequest0.spaceId("jEh}i%*e]).vK|`");
      ModelEntityRequest modelEntityRequest2 = new ModelEntityRequest();
      boolean boolean0 = modelEntityRequest1.equals(modelEntityRequest2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      ModelEntityRequest modelEntityRequest1 = new ModelEntityRequest();
      boolean boolean0 = modelEntityRequest1.equals(modelEntityRequest0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      modelEntityRequest0.name("cC%4g:lq|fR&");
      ModelEntityRequest modelEntityRequest1 = new ModelEntityRequest();
      boolean boolean0 = modelEntityRequest1.equals(modelEntityRequest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      modelEntityRequest0.addMetricsItem((Metric) null);
      ModelEntityRequest modelEntityRequest1 = new ModelEntityRequest();
      boolean boolean0 = modelEntityRequest0.equals(modelEntityRequest1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      boolean boolean0 = modelEntityRequest0.equals("reactor.core.publisher.LambdaSubscriber");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      boolean boolean0 = modelEntityRequest0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      boolean boolean0 = modelEntityRequest0.equals(modelEntityRequest0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      String string0 = modelEntityRequest0.getDescription();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      modelEntityRequest0.setSpaceId("(l:fX~$!D");
      assertNull(modelEntityRequest0.getTransformedLabelColumn());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      String string0 = modelEntityRequest0.getProjectId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      ModelEntityRequest modelEntityRequest1 = modelEntityRequest0.projectId("K?G");
      ModelEntityRequest modelEntityRequest2 = new ModelEntityRequest();
      boolean boolean0 = modelEntityRequest1.equals(modelEntityRequest2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      modelEntityRequest0.setName("(l:fX~$!D");
      assertNull(modelEntityRequest0.getProjectId());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      modelEntityRequest0.hashCode();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      modelEntityRequest0.setTags((List<String>) null);
      assertNull(modelEntityRequest0.getLabelColumn());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      List<String> list0 = modelEntityRequest0.getTags();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      ContentLocation contentLocation0 = modelEntityRequest0.getContentLocation();
      assertNull(contentLocation0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      String string0 = modelEntityRequest0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      String string0 = modelEntityRequest0.toString();
      assertEquals("class ModelEntityRequest {\n    type: null\n    softwareSpec: null\n    pipeline: null\n    modelDefinition: null\n    hyperParameters: null\n    domain: null\n    trainingDataReferences: null\n    schemas: null\n    labelColumn: null\n    transformedLabelColumn: null\n    size: null\n    metrics: null\n    custom: null\n    userDefinedObjects: null\n    name: null\n    projectId: null\n    spaceId: null\n    description: null\n    tags: null\n    contentLocation: null\n}", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      ContentLocation contentLocation0 = new ContentLocation();
      modelEntityRequest0.contentLocation(contentLocation0);
      ContentLocation contentLocation1 = modelEntityRequest0.getContentLocation();
      assertNull(contentLocation1.getType());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      modelEntityRequest0.setDescription("    name: ");
      String string0 = modelEntityRequest0.getDescription();
      assertEquals("    name: ", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      ContentLocation contentLocation0 = new ContentLocation();
      modelEntityRequest0.setContentLocation(contentLocation0);
      assertNull(modelEntityRequest0.getLabelColumn());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      String string0 = modelEntityRequest0.getSpaceId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ModelEntityRequest modelEntityRequest0 = new ModelEntityRequest();
      modelEntityRequest0.setProjectId("reactor.core.publisher.LambdaSubscriber");
      assertNull(modelEntityRequest0.getSpaceId());
  }
}
