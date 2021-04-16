/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 14 22:10:50 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.watson.data.client.model.MlFederatedMetric;
import com.ibm.watson.data.client.model.RemoteTrainingSystemMetric;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MlFederatedMetric_ESTest extends MlFederatedMetric_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MlFederatedMetric mlFederatedMetric0 = new MlFederatedMetric();
      RemoteTrainingSystemMetric remoteTrainingSystemMetric0 = new RemoteTrainingSystemMetric();
      mlFederatedMetric0.addRemoteTrainingSystemsItem(remoteTrainingSystemMetric0);
      List<RemoteTrainingSystemMetric> list0 = mlFederatedMetric0.getRemoteTrainingSystems();
      assertTrue(list0.contains(remoteTrainingSystemMetric0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MlFederatedMetric mlFederatedMetric0 = new MlFederatedMetric();
      BigDecimal bigDecimal0 = new BigDecimal(0.0);
      mlFederatedMetric0.global(bigDecimal0);
      BigDecimal bigDecimal1 = mlFederatedMetric0.getGlobal();
      assertEquals((byte)0, bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MlFederatedMetric mlFederatedMetric0 = new MlFederatedMetric();
      BigDecimal bigDecimal0 = new BigDecimal(1091.975630462);
      mlFederatedMetric0.global(bigDecimal0);
      BigDecimal bigDecimal1 = mlFederatedMetric0.getGlobal();
      assertEquals((byte)67, bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MlFederatedMetric mlFederatedMetric0 = new MlFederatedMetric();
      BigDecimal bigDecimal0 = new BigDecimal((-1));
      MlFederatedMetric mlFederatedMetric1 = mlFederatedMetric0.global(bigDecimal0);
      BigDecimal bigDecimal1 = mlFederatedMetric1.getGlobal();
      assertEquals((short) (-1), bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MlFederatedMetric mlFederatedMetric0 = new MlFederatedMetric();
      MlFederatedMetric mlFederatedMetric1 = new MlFederatedMetric();
      assertTrue(mlFederatedMetric1.equals((Object)mlFederatedMetric0));
      
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      mlFederatedMetric0.setGlobal(bigDecimal0);
      boolean boolean0 = mlFederatedMetric0.equals(mlFederatedMetric1);
      assertFalse(mlFederatedMetric1.equals((Object)mlFederatedMetric0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MlFederatedMetric mlFederatedMetric0 = new MlFederatedMetric();
      MlFederatedMetric mlFederatedMetric1 = new MlFederatedMetric();
      boolean boolean0 = mlFederatedMetric0.equals(mlFederatedMetric1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MlFederatedMetric mlFederatedMetric0 = new MlFederatedMetric();
      boolean boolean0 = mlFederatedMetric0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MlFederatedMetric mlFederatedMetric0 = new MlFederatedMetric();
      boolean boolean0 = mlFederatedMetric0.equals(mlFederatedMetric0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MlFederatedMetric mlFederatedMetric0 = new MlFederatedMetric();
      boolean boolean0 = mlFederatedMetric0.equals("rQhT7#XXvxlgm)b]Ka");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MlFederatedMetric mlFederatedMetric0 = new MlFederatedMetric();
      RemoteTrainingSystemMetric remoteTrainingSystemMetric0 = new RemoteTrainingSystemMetric();
      MlFederatedMetric mlFederatedMetric1 = mlFederatedMetric0.addRemoteTrainingSystemsItem(remoteTrainingSystemMetric0);
      MlFederatedMetric mlFederatedMetric2 = new MlFederatedMetric();
      boolean boolean0 = mlFederatedMetric1.equals(mlFederatedMetric2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MlFederatedMetric mlFederatedMetric0 = new MlFederatedMetric();
      LinkedList<RemoteTrainingSystemMetric> linkedList0 = new LinkedList<RemoteTrainingSystemMetric>();
      MlFederatedMetric mlFederatedMetric1 = mlFederatedMetric0.remoteTrainingSystems(linkedList0);
      RemoteTrainingSystemMetric remoteTrainingSystemMetric0 = new RemoteTrainingSystemMetric();
      mlFederatedMetric1.addRemoteTrainingSystemsItem(remoteTrainingSystemMetric0);
      assertTrue(linkedList0.contains(remoteTrainingSystemMetric0));
      assertEquals(1, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MlFederatedMetric mlFederatedMetric0 = new MlFederatedMetric();
      LinkedList<RemoteTrainingSystemMetric> linkedList0 = new LinkedList<RemoteTrainingSystemMetric>();
      mlFederatedMetric0.setRemoteTrainingSystems(linkedList0);
      List<RemoteTrainingSystemMetric> list0 = mlFederatedMetric0.getRemoteTrainingSystems();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MlFederatedMetric mlFederatedMetric0 = new MlFederatedMetric();
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      mlFederatedMetric0.setGlobal(bigDecimal0);
      String string0 = mlFederatedMetric0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MlFederatedMetric mlFederatedMetric0 = new MlFederatedMetric();
      List<RemoteTrainingSystemMetric> list0 = mlFederatedMetric0.getRemoteTrainingSystems();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MlFederatedMetric mlFederatedMetric0 = new MlFederatedMetric();
      mlFederatedMetric0.hashCode();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MlFederatedMetric mlFederatedMetric0 = new MlFederatedMetric();
      BigDecimal bigDecimal0 = mlFederatedMetric0.getGlobal();
      assertNull(bigDecimal0);
  }
}
