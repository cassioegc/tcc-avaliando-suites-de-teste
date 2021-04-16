/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 15 01:31:02 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.AssetCopyTo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AssetCopyTo_ESTest extends AssetCopyTo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AssetCopyTo assetCopyTo0 = new AssetCopyTo();
      assetCopyTo0.projectId("wYl$d%R");
      String string0 = assetCopyTo0.getProjectId();
      assertEquals("wYl$d%R", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AssetCopyTo assetCopyTo0 = new AssetCopyTo();
      assetCopyTo0.projectId("");
      String string0 = assetCopyTo0.getProjectId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AssetCopyTo assetCopyTo0 = new AssetCopyTo();
      AssetCopyTo assetCopyTo1 = new AssetCopyTo();
      boolean boolean0 = assetCopyTo1.equals(assetCopyTo0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AssetCopyTo assetCopyTo0 = new AssetCopyTo();
      boolean boolean0 = assetCopyTo0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AssetCopyTo assetCopyTo0 = new AssetCopyTo();
      boolean boolean0 = assetCopyTo0.equals(assetCopyTo0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AssetCopyTo assetCopyTo0 = new AssetCopyTo();
      boolean boolean0 = assetCopyTo0.equals("Uk");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AssetCopyTo assetCopyTo0 = new AssetCopyTo();
      String string0 = assetCopyTo0.toString();
      assertEquals("class AssetCopyTo {\n    projectId: null\n}", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AssetCopyTo assetCopyTo0 = new AssetCopyTo();
      assetCopyTo0.setProjectId((String) null);
      assertNull(assetCopyTo0.getProjectId());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AssetCopyTo assetCopyTo0 = new AssetCopyTo();
      String string0 = assetCopyTo0.getProjectId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AssetCopyTo assetCopyTo0 = new AssetCopyTo();
      assetCopyTo0.hashCode();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AssetCopyTo assetCopyTo0 = new AssetCopyTo();
      assetCopyTo0.projectId("class AssetCopyTo {\n    projectId: null\n}");
      String string0 = assetCopyTo0.toString();
      assertNotNull(string0);
  }
}
