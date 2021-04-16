/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 22:48:10 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.DeploymentEntity;
import com.ibm.watson.data.client.model.DeploymentEntityStatus;
import com.ibm.watson.data.client.model.Rel;
import com.ibm.watson.data.client.model.enums.DeployedAssetType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DeploymentEntity_ESTest extends DeploymentEntity_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DeploymentEntity deploymentEntity0 = new DeploymentEntity();
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      deploymentEntity0.status(deploymentEntityStatus0);
      DeploymentEntityStatus deploymentEntityStatus1 = deploymentEntity0.getStatus();
      assertNull(deploymentEntityStatus1.getState());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DeploymentEntity deploymentEntity0 = new DeploymentEntity();
      DeploymentEntity deploymentEntity1 = new DeploymentEntity();
      boolean boolean0 = deploymentEntity0.equals(deploymentEntity1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DeploymentEntity deploymentEntity0 = new DeploymentEntity();
      DeployedAssetType deployedAssetType0 = DeployedAssetType.FUNCTION;
      deploymentEntity0.deployedAssetType(deployedAssetType0);
      DeploymentEntity deploymentEntity1 = new DeploymentEntity();
      boolean boolean0 = deploymentEntity0.equals(deploymentEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DeploymentEntity deploymentEntity0 = new DeploymentEntity();
      Rel rel0 = new Rel();
      deploymentEntity0.asset(rel0);
      DeploymentEntity deploymentEntity1 = new DeploymentEntity();
      boolean boolean0 = deploymentEntity0.equals(deploymentEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DeploymentEntity deploymentEntity0 = new DeploymentEntity();
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      boolean boolean0 = deploymentEntity0.equals(deploymentEntityStatus0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DeploymentEntity deploymentEntity0 = new DeploymentEntity();
      boolean boolean0 = deploymentEntity0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DeploymentEntity deploymentEntity0 = new DeploymentEntity();
      boolean boolean0 = deploymentEntity0.equals(deploymentEntity0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DeploymentEntity deploymentEntity0 = new DeploymentEntity();
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      DeploymentEntity deploymentEntity1 = deploymentEntity0.status(deploymentEntityStatus0);
      DeploymentEntity deploymentEntity2 = new DeploymentEntity();
      boolean boolean0 = deploymentEntity1.equals(deploymentEntity2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DeploymentEntity deploymentEntity0 = new DeploymentEntity();
      deploymentEntity0.hashCode();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DeploymentEntity deploymentEntity0 = new DeploymentEntity();
      String string0 = deploymentEntity0.toString();
      assertEquals("class DeploymentEntity {\n    tags: null\n    spaceId: null\n    name: null\n    description: null\n    custom: null\n    asset: null\n    hardwareSpec: null\n    hybridPipelineHardwareSpecs: null\n    online: null\n    batch: null\n    virtual: null\n    deployedAssetType: null\n    status: null\n}", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DeploymentEntity deploymentEntity0 = new DeploymentEntity();
      DeploymentEntityStatus deploymentEntityStatus0 = deploymentEntity0.getStatus();
      assertNull(deploymentEntityStatus0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DeploymentEntity deploymentEntity0 = new DeploymentEntity();
      deploymentEntity0.getDeployedAssetType();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DeploymentEntity deploymentEntity0 = new DeploymentEntity();
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      deploymentEntity0.setStatus(deploymentEntityStatus0);
      assertNull(deploymentEntityStatus0.getState());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DeploymentEntity deploymentEntity0 = new DeploymentEntity();
      DeployedAssetType deployedAssetType0 = DeployedAssetType.DO;
      deploymentEntity0.setDeployedAssetType(deployedAssetType0);
      assertNull(deploymentEntity0.getDescription());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DeploymentEntity deploymentEntity0 = new DeploymentEntity();
      DeployedAssetType deployedAssetType0 = DeployedAssetType.DO;
      DeploymentEntity deploymentEntity1 = deploymentEntity0.deployedAssetType(deployedAssetType0);
      DeployedAssetType deployedAssetType1 = deploymentEntity1.getDeployedAssetType();
      assertEquals(DeployedAssetType.DO, deployedAssetType1);
  }
}
