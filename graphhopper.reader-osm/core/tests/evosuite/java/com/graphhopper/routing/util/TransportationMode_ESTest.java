/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 04 06:50:24 GMT 2021
 */

package com.graphhopper.routing.util;

import org.junit.Test;
import static org.junit.Assert.*;
import com.graphhopper.routing.util.TransportationMode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TransportationMode_ESTest extends TransportationMode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TransportationMode[] transportationModeArray0 = TransportationMode.values();
      assertEquals(7, transportationModeArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TransportationMode transportationMode0 = TransportationMode.valueOf("HGV");
      assertTrue(transportationMode0.isMotorVehicle());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TransportationMode transportationMode0 = TransportationMode.valueOf("FOOT");
      assertFalse(transportationMode0.isMotorVehicle());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TransportationMode transportationMode0 = TransportationMode.CAR;
      boolean boolean0 = transportationMode0.isMotorVehicle();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TransportationMode transportationMode0 = TransportationMode.FOOT;
      boolean boolean0 = transportationMode0.isMotorVehicle();
      assertFalse(boolean0);
  }
}
