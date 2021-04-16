/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 15 02:03:06 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.IntegrationJupyterLab;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IntegrationJupyterLab_ESTest extends IntegrationJupyterLab_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IntegrationJupyterLab integrationJupyterLab0 = new IntegrationJupyterLab();
      IntegrationJupyterLab integrationJupyterLab1 = integrationJupyterLab0.guid("WRITE_ONLY");
      String string0 = integrationJupyterLab1.getGuid();
      assertEquals("WRITE_ONLY", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IntegrationJupyterLab integrationJupyterLab0 = new IntegrationJupyterLab();
      IntegrationJupyterLab integrationJupyterLab1 = integrationJupyterLab0.guid("");
      String string0 = integrationJupyterLab1.getGuid();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IntegrationJupyterLab integrationJupyterLab0 = new IntegrationJupyterLab();
      boolean boolean0 = integrationJupyterLab0.equals("class IntegrationJupyterLab {\n    guid: null\n}");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IntegrationJupyterLab integrationJupyterLab0 = new IntegrationJupyterLab();
      IntegrationJupyterLab integrationJupyterLab1 = new IntegrationJupyterLab();
      boolean boolean0 = integrationJupyterLab0.equals(integrationJupyterLab1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IntegrationJupyterLab integrationJupyterLab0 = new IntegrationJupyterLab();
      boolean boolean0 = integrationJupyterLab0.equals(integrationJupyterLab0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IntegrationJupyterLab integrationJupyterLab0 = new IntegrationJupyterLab();
      boolean boolean0 = integrationJupyterLab0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IntegrationJupyterLab integrationJupyterLab0 = new IntegrationJupyterLab();
      integrationJupyterLab0.guid("class IntegrationJupyterLab {\n    guid: null\n}");
      String string0 = integrationJupyterLab0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IntegrationJupyterLab integrationJupyterLab0 = new IntegrationJupyterLab();
      String string0 = integrationJupyterLab0.toString();
      assertEquals("class IntegrationJupyterLab {\n    guid: null\n}", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IntegrationJupyterLab integrationJupyterLab0 = new IntegrationJupyterLab();
      String string0 = integrationJupyterLab0.getGuid();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IntegrationJupyterLab integrationJupyterLab0 = new IntegrationJupyterLab();
      integrationJupyterLab0.setGuid("class IntegrationJupyterLab {\n    guid: null\n}");
      assertEquals("class IntegrationJupyterLab {\n    guid: null\n}", integrationJupyterLab0.getGuid());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IntegrationJupyterLab integrationJupyterLab0 = new IntegrationJupyterLab();
      integrationJupyterLab0.hashCode();
  }
}
