/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 23:19:09 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.DeploymentEntity;
import com.ibm.watson.data.client.model.DeploymentResource;
import com.ibm.watson.data.client.model.ResourceMeta;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DeploymentResource_ESTest extends DeploymentResource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DeploymentResource deploymentResource0 = new DeploymentResource();
      DeploymentEntity deploymentEntity0 = new DeploymentEntity();
      DeploymentResource deploymentResource1 = deploymentResource0.entity(deploymentEntity0);
      DeploymentEntity deploymentEntity1 = deploymentResource1.getEntity();
      assertNull(deploymentEntity1.getDeployedAssetType());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DeploymentResource deploymentResource0 = new DeploymentResource();
      DeploymentEntity deploymentEntity0 = new DeploymentEntity();
      deploymentResource0.entity(deploymentEntity0);
      String string0 = deploymentResource0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DeploymentResource deploymentResource0 = new DeploymentResource();
      DeploymentResource deploymentResource1 = new DeploymentResource();
      assertTrue(deploymentResource1.equals((Object)deploymentResource0));
      
      DeploymentEntity deploymentEntity0 = new DeploymentEntity();
      DeploymentResource deploymentResource2 = deploymentResource0.entity(deploymentEntity0);
      boolean boolean0 = deploymentResource2.equals(deploymentResource1);
      assertFalse(deploymentResource1.equals((Object)deploymentResource0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DeploymentResource deploymentResource0 = new DeploymentResource();
      DeploymentResource deploymentResource1 = new DeploymentResource();
      ResourceMeta resourceMeta0 = new ResourceMeta();
      deploymentResource1.setMetadata(resourceMeta0);
      boolean boolean0 = deploymentResource1.equals(deploymentResource0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DeploymentResource deploymentResource0 = new DeploymentResource();
      DeploymentResource deploymentResource1 = new DeploymentResource();
      boolean boolean0 = deploymentResource1.equals(deploymentResource0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DeploymentResource deploymentResource0 = new DeploymentResource();
      boolean boolean0 = deploymentResource0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DeploymentResource deploymentResource0 = new DeploymentResource();
      boolean boolean0 = deploymentResource0.equals(deploymentResource0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DeploymentResource deploymentResource0 = new DeploymentResource();
      ResourceMeta resourceMeta0 = new ResourceMeta();
      boolean boolean0 = deploymentResource0.equals(resourceMeta0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DeploymentResource deploymentResource0 = new DeploymentResource();
      deploymentResource0.hashCode();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DeploymentResource deploymentResource0 = new DeploymentResource();
      ResourceMeta resourceMeta0 = deploymentResource0.getMetadata();
      assertNull(resourceMeta0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DeploymentResource deploymentResource0 = new DeploymentResource();
      DeploymentEntity deploymentEntity0 = deploymentResource0.getEntity();
      deploymentResource0.setEntity(deploymentEntity0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DeploymentResource deploymentResource0 = new DeploymentResource();
      ResourceMeta resourceMeta0 = new ResourceMeta();
      deploymentResource0.metadata(resourceMeta0);
      ResourceMeta resourceMeta1 = deploymentResource0.getMetadata();
      assertNull(resourceMeta1.getProjectId());
  }
}
