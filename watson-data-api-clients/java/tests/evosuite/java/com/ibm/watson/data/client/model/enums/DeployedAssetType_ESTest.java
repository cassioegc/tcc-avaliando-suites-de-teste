/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 15 02:47:20 GMT 2021
 */

package com.ibm.watson.data.client.model.enums;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.watson.data.client.model.enums.DeployedAssetType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DeployedAssetType_ESTest extends DeployedAssetType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DeployedAssetType deployedAssetType0 = DeployedAssetType.fromValue("function");
      assertEquals(DeployedAssetType.FUNCTION, deployedAssetType0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DeployedAssetType[] deployedAssetTypeArray0 = DeployedAssetType.values();
      assertEquals(4, deployedAssetTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DeployedAssetType deployedAssetType0 = DeployedAssetType.valueOf("PY_SCRIPT");
      assertEquals("py_script", deployedAssetType0.getValue());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DeployedAssetType deployedAssetType0 = DeployedAssetType.fromValue("do");
      assertEquals(DeployedAssetType.DO, deployedAssetType0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        DeployedAssetType.fromValue("co");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected value 'co'
         //
         verifyException("com.ibm.watson.data.client.model.enums.DeployedAssetType", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DeployedAssetType deployedAssetType0 = DeployedAssetType.DO;
      String string0 = deployedAssetType0.toString();
      assertEquals("do", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DeployedAssetType deployedAssetType0 = DeployedAssetType.DO;
      String string0 = deployedAssetType0.getValue();
      assertEquals("do", string0);
  }
}
