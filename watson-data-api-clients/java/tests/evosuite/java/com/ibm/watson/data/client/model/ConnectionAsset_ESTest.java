/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 23:41:15 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.watson.data.client.model.ConnectionAsset;
import com.ibm.watson.data.client.model.ConnectionEntity;
import com.ibm.watson.data.client.model.ConnectionMetadata;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConnectionAsset_ESTest extends ConnectionAsset_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ConnectionAsset connectionAsset0 = new ConnectionAsset();
      ConnectionEntity connectionEntity0 = new ConnectionEntity();
      connectionAsset0.entity(connectionEntity0);
      ConnectionEntity connectionEntity1 = connectionAsset0.getEntity();
      assertNull(connectionEntity1.getGatewayId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ConnectionAsset connectionAsset0 = new ConnectionAsset();
      ConnectionEntity connectionEntity0 = new ConnectionEntity();
      connectionEntity0.putPropertiesItem("null", connectionEntity0);
      ConnectionAsset connectionAsset1 = connectionAsset0.entity(connectionEntity0);
      // Undeclared exception!
      try { 
        connectionAsset1.hashCode();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ConnectionAsset connectionAsset0 = new ConnectionAsset();
      ConnectionAsset connectionAsset1 = new ConnectionAsset();
      boolean boolean0 = connectionAsset0.equals(connectionAsset1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ConnectionAsset connectionAsset0 = new ConnectionAsset();
      boolean boolean0 = connectionAsset0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConnectionAsset connectionAsset0 = new ConnectionAsset();
      boolean boolean0 = connectionAsset0.equals(connectionAsset0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ConnectionAsset connectionAsset0 = new ConnectionAsset();
      ConnectionEntity connectionEntity0 = new ConnectionEntity();
      boolean boolean0 = connectionAsset0.equals(connectionEntity0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ConnectionAsset connectionAsset0 = new ConnectionAsset();
      ConnectionMetadata connectionMetadata0 = new ConnectionMetadata();
      connectionAsset0.setMetadata(connectionMetadata0);
      assertNull(connectionMetadata0.getCreatorId());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ConnectionAsset connectionAsset0 = new ConnectionAsset();
      ConnectionMetadata connectionMetadata0 = new ConnectionMetadata();
      connectionAsset0.metadata(connectionMetadata0);
      ConnectionMetadata connectionMetadata1 = connectionAsset0.getMetadata();
      assertNull(connectionMetadata1.getAssetCategory());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ConnectionAsset connectionAsset0 = new ConnectionAsset();
      ConnectionEntity connectionEntity0 = new ConnectionEntity();
      connectionAsset0.setEntity(connectionEntity0);
      assertNull(connectionEntity0.getAssetCategory());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ConnectionAsset connectionAsset0 = new ConnectionAsset();
      ConnectionEntity connectionEntity0 = connectionAsset0.getEntity();
      assertNull(connectionEntity0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ConnectionAsset connectionAsset0 = new ConnectionAsset();
      ConnectionMetadata connectionMetadata0 = connectionAsset0.getMetadata();
      assertNull(connectionMetadata0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ConnectionAsset connectionAsset0 = new ConnectionAsset();
      connectionAsset0.hashCode();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConnectionAsset connectionAsset0 = new ConnectionAsset();
      ConnectionEntity connectionEntity0 = new ConnectionEntity();
      ConnectionAsset connectionAsset1 = connectionAsset0.entity(connectionEntity0);
      String string0 = connectionAsset1.toString();
      assertNotNull(string0);
  }
}
