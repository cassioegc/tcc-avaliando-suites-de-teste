/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 15 01:12:43 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.CreateRDSResponse;
import com.ibm.watson.data.client.model.RDSResource;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CreateRDSResponse_ESTest extends CreateRDSResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CreateRDSResponse createRDSResponse0 = new CreateRDSResponse();
      LinkedList<RDSResource> linkedList0 = new LinkedList<RDSResource>();
      createRDSResponse0.setResources(linkedList0);
      List<RDSResource> list0 = createRDSResponse0.getResources();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CreateRDSResponse createRDSResponse0 = new CreateRDSResponse();
      CreateRDSResponse createRDSResponse1 = createRDSResponse0.addResourcesItem((RDSResource) null);
      List<RDSResource> list0 = createRDSResponse1.getResources();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CreateRDSResponse createRDSResponse0 = new CreateRDSResponse();
      RDSResource rDSResource0 = new RDSResource();
      createRDSResponse0.addResourcesItem(rDSResource0);
      String string0 = createRDSResponse0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CreateRDSResponse createRDSResponse0 = new CreateRDSResponse();
      CreateRDSResponse createRDSResponse1 = new CreateRDSResponse();
      boolean boolean0 = createRDSResponse0.equals(createRDSResponse1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CreateRDSResponse createRDSResponse0 = new CreateRDSResponse();
      boolean boolean0 = createRDSResponse0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CreateRDSResponse createRDSResponse0 = new CreateRDSResponse();
      boolean boolean0 = createRDSResponse0.equals(createRDSResponse0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CreateRDSResponse createRDSResponse0 = new CreateRDSResponse();
      Object object0 = new Object();
      boolean boolean0 = createRDSResponse0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CreateRDSResponse createRDSResponse0 = new CreateRDSResponse();
      RDSResource rDSResource0 = new RDSResource();
      CreateRDSResponse createRDSResponse1 = createRDSResponse0.addResourcesItem(rDSResource0);
      CreateRDSResponse createRDSResponse2 = createRDSResponse1.addResourcesItem(rDSResource0);
      assertSame(createRDSResponse2, createRDSResponse1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CreateRDSResponse createRDSResponse0 = new CreateRDSResponse();
      String string0 = createRDSResponse0.toString();
      assertEquals("class CreateRDSResponse {\n    resources: null\n}", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CreateRDSResponse createRDSResponse0 = new CreateRDSResponse();
      List<RDSResource> list0 = createRDSResponse0.getResources();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CreateRDSResponse createRDSResponse0 = new CreateRDSResponse();
      createRDSResponse0.hashCode();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CreateRDSResponse createRDSResponse0 = new CreateRDSResponse();
      CreateRDSResponse createRDSResponse1 = createRDSResponse0.resources((List<RDSResource>) null);
      assertSame(createRDSResponse1, createRDSResponse0);
  }
}
