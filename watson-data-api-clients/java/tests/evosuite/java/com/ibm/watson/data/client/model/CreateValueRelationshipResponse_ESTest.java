/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 15 00:51:38 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.watson.data.client.model.CreateValueRelationshipResponse;
import com.ibm.watson.data.client.model.CreateValueRelationshipResponseResource;
import com.ibm.watson.data.client.model.ResponseRDVCreateRelationshipEntity;
import io.netty.handler.logging.LoggingHandler;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CreateValueRelationshipResponse_ESTest extends CreateValueRelationshipResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CreateValueRelationshipResponse createValueRelationshipResponse0 = new CreateValueRelationshipResponse();
      LinkedList<CreateValueRelationshipResponseResource> linkedList0 = new LinkedList<CreateValueRelationshipResponseResource>();
      CreateValueRelationshipResponse createValueRelationshipResponse1 = createValueRelationshipResponse0.resources(linkedList0);
      CreateValueRelationshipResponseResource createValueRelationshipResponseResource0 = new CreateValueRelationshipResponseResource();
      LinkedList<ResponseRDVCreateRelationshipEntity> linkedList1 = new LinkedList<ResponseRDVCreateRelationshipEntity>();
      CreateValueRelationshipResponseResource createValueRelationshipResponseResource1 = new CreateValueRelationshipResponseResource();
      ResponseRDVCreateRelationshipEntity responseRDVCreateRelationshipEntity0 = new ResponseRDVCreateRelationshipEntity();
      createValueRelationshipResponse0.hashCode();
      ResponseRDVCreateRelationshipEntity responseRDVCreateRelationshipEntity1 = responseRDVCreateRelationshipEntity0.addChildItem(createValueRelationshipResponse0);
      CreateValueRelationshipResponseResource createValueRelationshipResponseResource2 = createValueRelationshipResponseResource1.addRdsValuesItem(responseRDVCreateRelationshipEntity1);
      CreateValueRelationshipResponse createValueRelationshipResponse2 = createValueRelationshipResponse1.addResourcesItem(createValueRelationshipResponseResource2);
      createValueRelationshipResponse1.hashCode();
      Object object0 = new Object();
      createValueRelationshipResponse2.equals(object0);
      createValueRelationshipResponse0.getResources();
      createValueRelationshipResponse2.toString();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CreateValueRelationshipResponse createValueRelationshipResponse0 = new CreateValueRelationshipResponse();
      createValueRelationshipResponse0.getResources();
      CreateValueRelationshipResponse createValueRelationshipResponse1 = createValueRelationshipResponse0.resources((List<CreateValueRelationshipResponseResource>) null);
      CreateValueRelationshipResponseResource createValueRelationshipResponseResource0 = new CreateValueRelationshipResponseResource();
      ResponseRDVCreateRelationshipEntity responseRDVCreateRelationshipEntity0 = new ResponseRDVCreateRelationshipEntity();
      CreateValueRelationshipResponse createValueRelationshipResponse2 = new CreateValueRelationshipResponse();
      createValueRelationshipResponse1.toString();
      CreateValueRelationshipResponse createValueRelationshipResponse3 = createValueRelationshipResponse2.addResourcesItem(createValueRelationshipResponseResource0);
      CreateValueRelationshipResponse createValueRelationshipResponse4 = createValueRelationshipResponse3.resources((List<CreateValueRelationshipResponseResource>) null);
      createValueRelationshipResponse0.equals(createValueRelationshipResponse4);
      ResponseRDVCreateRelationshipEntity responseRDVCreateRelationshipEntity1 = responseRDVCreateRelationshipEntity0.code("null");
      CreateValueRelationshipResponseResource createValueRelationshipResponseResource1 = createValueRelationshipResponseResource0.addRdsValuesItem(responseRDVCreateRelationshipEntity1);
      Stack<ResponseRDVCreateRelationshipEntity> stack0 = new Stack<ResponseRDVCreateRelationshipEntity>();
      CreateValueRelationshipResponseResource createValueRelationshipResponseResource2 = createValueRelationshipResponseResource1.rdsValues(stack0);
      CreateValueRelationshipResponse createValueRelationshipResponse5 = createValueRelationshipResponse1.addResourcesItem(createValueRelationshipResponseResource2);
      createValueRelationshipResponse0.setResources((List<CreateValueRelationshipResponseResource>) null);
      CreateValueRelationshipResponse createValueRelationshipResponse6 = createValueRelationshipResponse5.addResourcesItem(createValueRelationshipResponseResource1);
      createValueRelationshipResponse6.hashCode();
      CreateValueRelationshipResponse createValueRelationshipResponse7 = createValueRelationshipResponse5.resources((List<CreateValueRelationshipResponseResource>) null);
      assertSame(createValueRelationshipResponse7, createValueRelationshipResponse6);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CreateValueRelationshipResponse createValueRelationshipResponse0 = new CreateValueRelationshipResponse();
      CreateValueRelationshipResponse createValueRelationshipResponse1 = createValueRelationshipResponse0.resources((List<CreateValueRelationshipResponseResource>) null);
      CreateValueRelationshipResponseResource createValueRelationshipResponseResource0 = new CreateValueRelationshipResponseResource();
      createValueRelationshipResponseResource0.setHref("Failed to resolve default validator class");
      CreateValueRelationshipResponseResource createValueRelationshipResponseResource1 = createValueRelationshipResponseResource0.addRdsValuesItem((ResponseRDVCreateRelationshipEntity) null);
      CreateValueRelationshipResponse createValueRelationshipResponse2 = createValueRelationshipResponse1.addResourcesItem(createValueRelationshipResponseResource1);
      boolean boolean0 = createValueRelationshipResponse2.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CreateValueRelationshipResponse createValueRelationshipResponse0 = new CreateValueRelationshipResponse();
      ArrayList<CreateValueRelationshipResponseResource> arrayList0 = new ArrayList<CreateValueRelationshipResponseResource>();
      createValueRelationshipResponse0.setResources(arrayList0);
      List<CreateValueRelationshipResponseResource> list0 = createValueRelationshipResponse0.getResources();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CreateValueRelationshipResponse createValueRelationshipResponse0 = new CreateValueRelationshipResponse();
      Stack<CreateValueRelationshipResponseResource> stack0 = new Stack<CreateValueRelationshipResponseResource>();
      CreateValueRelationshipResponse createValueRelationshipResponse1 = createValueRelationshipResponse0.resources(stack0);
      boolean boolean0 = createValueRelationshipResponse1.equals(createValueRelationshipResponse0);
      CreateValueRelationshipResponseResource createValueRelationshipResponseResource0 = new CreateValueRelationshipResponseResource();
      LinkedList<ResponseRDVCreateRelationshipEntity> linkedList0 = new LinkedList<ResponseRDVCreateRelationshipEntity>();
      CreateValueRelationshipResponseResource createValueRelationshipResponseResource1 = createValueRelationshipResponseResource0.rdsValues(linkedList0);
      CreateValueRelationshipResponse createValueRelationshipResponse2 = createValueRelationshipResponse1.addResourcesItem(createValueRelationshipResponseResource0);
      createValueRelationshipResponse2.equals(createValueRelationshipResponse1);
      createValueRelationshipResponse0.addResourcesItem(createValueRelationshipResponseResource0);
      boolean boolean1 = createValueRelationshipResponse0.equals(createValueRelationshipResponseResource1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CreateValueRelationshipResponse createValueRelationshipResponse0 = new CreateValueRelationshipResponse();
      Vector<CreateValueRelationshipResponseResource> vector0 = new Vector<CreateValueRelationshipResponseResource>();
      CreateValueRelationshipResponse createValueRelationshipResponse1 = createValueRelationshipResponse0.resources(vector0);
      assertSame(createValueRelationshipResponse1, createValueRelationshipResponse0);
      
      CreateValueRelationshipResponse createValueRelationshipResponse2 = createValueRelationshipResponse1.addResourcesItem((CreateValueRelationshipResponseResource) null);
      boolean boolean0 = createValueRelationshipResponse2.equals(createValueRelationshipResponse0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CreateValueRelationshipResponse createValueRelationshipResponse0 = new CreateValueRelationshipResponse();
      CreateValueRelationshipResponseResource createValueRelationshipResponseResource0 = new CreateValueRelationshipResponseResource();
      ResponseRDVCreateRelationshipEntity responseRDVCreateRelationshipEntity0 = new ResponseRDVCreateRelationshipEntity();
      CreateValueRelationshipResponseResource createValueRelationshipResponseResource1 = createValueRelationshipResponseResource0.addRdsValuesItem(responseRDVCreateRelationshipEntity0);
      CreateValueRelationshipResponse createValueRelationshipResponse1 = createValueRelationshipResponse0.addResourcesItem(createValueRelationshipResponseResource1);
      List<CreateValueRelationshipResponseResource> list0 = createValueRelationshipResponse1.getResources();
      CreateValueRelationshipResponse createValueRelationshipResponse2 = createValueRelationshipResponse1.resources(list0);
      CreateValueRelationshipResponse createValueRelationshipResponse3 = createValueRelationshipResponse0.resources(list0);
      boolean boolean0 = createValueRelationshipResponse2.equals(createValueRelationshipResponse3);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CreateValueRelationshipResponse createValueRelationshipResponse0 = new CreateValueRelationshipResponse();
      Stack<CreateValueRelationshipResponseResource> stack0 = new Stack<CreateValueRelationshipResponseResource>();
      CreateValueRelationshipResponse createValueRelationshipResponse1 = createValueRelationshipResponse0.resources(stack0);
      ResponseRDVCreateRelationshipEntity responseRDVCreateRelationshipEntity0 = new ResponseRDVCreateRelationshipEntity();
      CreateValueRelationshipResponseResource createValueRelationshipResponseResource0 = new CreateValueRelationshipResponseResource();
      responseRDVCreateRelationshipEntity0.addChildItem(createValueRelationshipResponseResource0);
      createValueRelationshipResponse0.setResources(stack0);
      createValueRelationshipResponse0.toString();
      createValueRelationshipResponse1.hashCode();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CreateValueRelationshipResponse createValueRelationshipResponse0 = new CreateValueRelationshipResponse();
      createValueRelationshipResponse0.resources((List<CreateValueRelationshipResponseResource>) null);
      createValueRelationshipResponse0.getResources();
      createValueRelationshipResponse0.setResources((List<CreateValueRelationshipResponseResource>) null);
      List<CreateValueRelationshipResponseResource> list0 = createValueRelationshipResponse0.getResources();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CreateValueRelationshipResponse createValueRelationshipResponse0 = new CreateValueRelationshipResponse();
      LoggingHandler loggingHandler0 = new LoggingHandler("");
      createValueRelationshipResponse0.equals(loggingHandler0);
      List<CreateValueRelationshipResponseResource> list0 = createValueRelationshipResponse0.getResources();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CreateValueRelationshipResponse createValueRelationshipResponse0 = new CreateValueRelationshipResponse();
      CreateValueRelationshipResponseResource createValueRelationshipResponseResource0 = new CreateValueRelationshipResponseResource();
      CreateValueRelationshipResponse createValueRelationshipResponse1 = createValueRelationshipResponse0.addResourcesItem(createValueRelationshipResponseResource0);
      assertSame(createValueRelationshipResponse1, createValueRelationshipResponse0);
      
      Object object0 = new Object();
      createValueRelationshipResponse0.equals(object0);
      Vector<CreateValueRelationshipResponseResource> vector0 = new Vector<CreateValueRelationshipResponseResource>();
      ArrayList<CreateValueRelationshipResponseResource> arrayList0 = new ArrayList<CreateValueRelationshipResponseResource>(vector0);
      createValueRelationshipResponse0.setResources(arrayList0);
      assertFalse(arrayList0.contains(createValueRelationshipResponseResource0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CreateValueRelationshipResponse createValueRelationshipResponse0 = new CreateValueRelationshipResponse();
      createValueRelationshipResponse0.hashCode();
      createValueRelationshipResponse0.toString();
      LinkedList<CreateValueRelationshipResponseResource> linkedList0 = new LinkedList<CreateValueRelationshipResponseResource>();
      createValueRelationshipResponse0.setResources(linkedList0);
      CreateValueRelationshipResponse createValueRelationshipResponse1 = createValueRelationshipResponse0.resources(linkedList0);
      assertSame(createValueRelationshipResponse0, createValueRelationshipResponse1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CreateValueRelationshipResponse createValueRelationshipResponse0 = new CreateValueRelationshipResponse();
      CreateValueRelationshipResponse createValueRelationshipResponse1 = createValueRelationshipResponse0.addResourcesItem((CreateValueRelationshipResponseResource) null);
      boolean boolean0 = createValueRelationshipResponse1.equals(createValueRelationshipResponse0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CreateValueRelationshipResponse createValueRelationshipResponse0 = new CreateValueRelationshipResponse();
      boolean boolean0 = createValueRelationshipResponse0.equals(createValueRelationshipResponse0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CreateValueRelationshipResponse createValueRelationshipResponse0 = new CreateValueRelationshipResponse();
      createValueRelationshipResponse0.getResources();
      CreateValueRelationshipResponse createValueRelationshipResponse1 = createValueRelationshipResponse0.resources((List<CreateValueRelationshipResponseResource>) null);
      createValueRelationshipResponse0.toString();
      Vector<CreateValueRelationshipResponseResource> vector0 = new Vector<CreateValueRelationshipResponseResource>();
      createValueRelationshipResponse0.toString();
      CreateValueRelationshipResponse createValueRelationshipResponse2 = new CreateValueRelationshipResponse();
      createValueRelationshipResponse0.setResources((List<CreateValueRelationshipResponseResource>) null);
      createValueRelationshipResponse0.hashCode();
      createValueRelationshipResponse1.setResources(vector0);
      CreateValueRelationshipResponseResource createValueRelationshipResponseResource0 = new CreateValueRelationshipResponseResource();
      ResponseRDVCreateRelationshipEntity responseRDVCreateRelationshipEntity0 = new ResponseRDVCreateRelationshipEntity();
      ResponseRDVCreateRelationshipEntity responseRDVCreateRelationshipEntity1 = responseRDVCreateRelationshipEntity0.code("class CreateValueRelationshipResponse {\n    resources: null\n}");
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ResponseRDVCreateRelationshipEntity responseRDVCreateRelationshipEntity2 = responseRDVCreateRelationshipEntity1.child(linkedList0);
      CreateValueRelationshipResponseResource createValueRelationshipResponseResource1 = createValueRelationshipResponseResource0.addRdsValuesItem(responseRDVCreateRelationshipEntity2);
      CreateValueRelationshipResponse createValueRelationshipResponse3 = createValueRelationshipResponse1.addResourcesItem(createValueRelationshipResponseResource1);
      createValueRelationshipResponse0.setResources(vector0);
      createValueRelationshipResponse1.equals("class CreateValueRelationshipResponse {\n    resources: null\n}");
      createValueRelationshipResponse0.equals((Object) null);
      createValueRelationshipResponse2.equals(createValueRelationshipResponse3);
      createValueRelationshipResponse0.toString();
      createValueRelationshipResponse2.getResources();
      CreateValueRelationshipResponse createValueRelationshipResponse4 = createValueRelationshipResponse2.addResourcesItem(createValueRelationshipResponseResource0);
      assertSame(createValueRelationshipResponse2, createValueRelationshipResponse4);
  }
}
