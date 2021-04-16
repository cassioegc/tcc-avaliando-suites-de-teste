/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 18:25:05 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.DeploymentEntityStatus;
import com.ibm.watson.data.client.model.DeploymentEntityStatusMessage;
import com.ibm.watson.data.client.model.UrlDetails;
import com.ibm.watson.data.client.model.WMLError;
import com.ibm.watson.data.client.model.enums.DeploymentState;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DeploymentEntityStatus_ESTest extends DeploymentEntityStatus_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      LinkedList<UrlDetails> linkedList0 = new LinkedList<UrlDetails>();
      deploymentEntityStatus0.virtualDeploymentDownloads(linkedList0);
      List<UrlDetails> list0 = deploymentEntityStatus0.getVirtualDeploymentDownloads();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      UrlDetails urlDetails0 = new UrlDetails();
      deploymentEntityStatus0.addVirtualDeploymentDownloadsItem(urlDetails0);
      List<UrlDetails> list0 = deploymentEntityStatus0.getVirtualDeploymentDownloads();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      UrlDetails urlDetails0 = new UrlDetails();
      deploymentEntityStatus0.onlineUrl(urlDetails0);
      UrlDetails urlDetails1 = deploymentEntityStatus0.getOnlineUrl();
      assertSame(urlDetails1, urlDetails0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      DeploymentEntityStatusMessage deploymentEntityStatusMessage0 = new DeploymentEntityStatusMessage();
      DeploymentEntityStatus deploymentEntityStatus1 = deploymentEntityStatus0.message(deploymentEntityStatusMessage0);
      DeploymentEntityStatusMessage deploymentEntityStatusMessage1 = deploymentEntityStatus1.getMessage();
      assertSame(deploymentEntityStatusMessage0, deploymentEntityStatusMessage1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      WMLError wMLError0 = new WMLError();
      deploymentEntityStatus0.failure(wMLError0);
      WMLError wMLError1 = deploymentEntityStatus0.getFailure();
      assertSame(wMLError1, wMLError0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      UrlDetails urlDetails0 = new UrlDetails();
      deploymentEntityStatus0.onlineUrl(urlDetails0);
      String string0 = deploymentEntityStatus0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      DeploymentState deploymentState0 = DeploymentState.READY;
      DeploymentEntityStatus deploymentEntityStatus1 = new DeploymentEntityStatus();
      deploymentEntityStatus1.state(deploymentState0);
      boolean boolean0 = deploymentEntityStatus0.equals(deploymentEntityStatus1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      boolean boolean0 = deploymentEntityStatus0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      DeploymentEntityStatus deploymentEntityStatus1 = new DeploymentEntityStatus();
      boolean boolean0 = deploymentEntityStatus1.equals(deploymentEntityStatus0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      boolean boolean0 = deploymentEntityStatus0.equals(deploymentEntityStatus0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      boolean boolean0 = deploymentEntityStatus0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      UrlDetails urlDetails0 = new UrlDetails();
      deploymentEntityStatus0.addVirtualDeploymentDownloadsItem((UrlDetails) null);
      DeploymentEntityStatus deploymentEntityStatus1 = deploymentEntityStatus0.addVirtualDeploymentDownloadsItem(urlDetails0);
      assertNull(deploymentEntityStatus1.getState());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      UrlDetails urlDetails0 = new UrlDetails();
      deploymentEntityStatus0.onlineUrl(urlDetails0);
      DeploymentEntityStatus deploymentEntityStatus1 = new DeploymentEntityStatus();
      boolean boolean0 = deploymentEntityStatus0.equals(deploymentEntityStatus1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      DeploymentState deploymentState0 = DeploymentState.INITIALIZING;
      deploymentEntityStatus0.setState(deploymentState0);
      assertEquals(DeploymentState.INITIALIZING, deploymentEntityStatus0.getState());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      deploymentEntityStatus0.hashCode();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      List<UrlDetails> list0 = deploymentEntityStatus0.getVirtualDeploymentDownloads();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      DeploymentEntityStatusMessage deploymentEntityStatusMessage0 = new DeploymentEntityStatusMessage();
      DeploymentEntityStatus deploymentEntityStatus1 = deploymentEntityStatus0.message(deploymentEntityStatusMessage0);
      DeploymentEntityStatus deploymentEntityStatus2 = new DeploymentEntityStatus();
      boolean boolean0 = deploymentEntityStatus1.equals(deploymentEntityStatus2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      LinkedList<UrlDetails> linkedList0 = new LinkedList<UrlDetails>();
      deploymentEntityStatus0.setVirtualDeploymentDownloads(linkedList0);
      assertNull(deploymentEntityStatus0.getState());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      WMLError wMLError0 = deploymentEntityStatus0.getFailure();
      assertNull(wMLError0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      deploymentEntityStatus0.setFailure((WMLError) null);
      assertNull(deploymentEntityStatus0.getState());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      DeploymentEntityStatusMessage deploymentEntityStatusMessage0 = deploymentEntityStatus0.getMessage();
      assertNull(deploymentEntityStatusMessage0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      DeploymentState deploymentState0 = DeploymentState.READY;
      DeploymentEntityStatus deploymentEntityStatus1 = deploymentEntityStatus0.state(deploymentState0);
      DeploymentState deploymentState1 = deploymentEntityStatus1.getState();
      assertEquals("ready", deploymentState1.getValue());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      WMLError wMLError0 = new WMLError();
      deploymentEntityStatus0.failure(wMLError0);
      DeploymentEntityStatus deploymentEntityStatus1 = new DeploymentEntityStatus();
      boolean boolean0 = deploymentEntityStatus0.equals(deploymentEntityStatus1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      DeploymentEntityStatusMessage deploymentEntityStatusMessage0 = new DeploymentEntityStatusMessage();
      deploymentEntityStatus0.setMessage(deploymentEntityStatusMessage0);
      assertNull(deploymentEntityStatus0.getState());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      deploymentEntityStatus0.getState();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      UrlDetails urlDetails0 = deploymentEntityStatus0.getOnlineUrl();
      assertNull(urlDetails0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      LinkedList<UrlDetails> linkedList0 = new LinkedList<UrlDetails>();
      deploymentEntityStatus0.virtualDeploymentDownloads(linkedList0);
      DeploymentEntityStatus deploymentEntityStatus1 = new DeploymentEntityStatus();
      boolean boolean0 = deploymentEntityStatus0.equals(deploymentEntityStatus1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DeploymentEntityStatus deploymentEntityStatus0 = new DeploymentEntityStatus();
      UrlDetails urlDetails0 = new UrlDetails();
      deploymentEntityStatus0.setOnlineUrl(urlDetails0);
      assertNull(urlDetails0.getUrl());
  }
}
