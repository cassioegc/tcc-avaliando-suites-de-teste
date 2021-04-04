/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 04 06:21:52 GMT 2021
 */

package com.graphhopper.routing.ch;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.graphhopper.routing.SPTEntry;
import com.graphhopper.routing.ch.AStarCHEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AStarCHEntry_ESTest extends AStarCHEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AStarCHEntry aStarCHEntry0 = new AStarCHEntry((-2012), 0, (-2012), 0, 0.0);
      double double0 = aStarCHEntry0.getWeightOfVisitedPath();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AStarCHEntry aStarCHEntry0 = new AStarCHEntry((-118), (-118), 1203.15);
      double double0 = aStarCHEntry0.getWeightOfVisitedPath();
      assertEquals(1203.15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AStarCHEntry aStarCHEntry0 = new AStarCHEntry(944, 944, 944, 944, 944);
      AStarCHEntry aStarCHEntry1 = new AStarCHEntry(944, 0.0, 0.0);
      aStarCHEntry0.parent = (SPTEntry) aStarCHEntry1;
      aStarCHEntry0.getParent();
      assertEquals(944.0, aStarCHEntry0.weightOfVisitedPath, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AStarCHEntry aStarCHEntry0 = new AStarCHEntry((-2012), 0, (-2012), 0, 0.0);
      AStarCHEntry aStarCHEntry1 = new AStarCHEntry((-118), (-118), 1203.15);
      aStarCHEntry0.parent = (SPTEntry) aStarCHEntry1;
      AStarCHEntry aStarCHEntry2 = aStarCHEntry0.getParent();
      assertEquals(1203.15, aStarCHEntry2.weightOfVisitedPath, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AStarCHEntry aStarCHEntry0 = new AStarCHEntry(0, 1, 0, 0, 0);
      AStarCHEntry aStarCHEntry1 = new AStarCHEntry(1572, 0, 2200, 2200, (-1.0));
      aStarCHEntry0.parent = (SPTEntry) aStarCHEntry1;
      AStarCHEntry aStarCHEntry2 = aStarCHEntry0.getParent();
      assertEquals((-1.0), aStarCHEntry2.weightOfVisitedPath, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AStarCHEntry aStarCHEntry0 = new AStarCHEntry(1, 1, 1, 1, (-685.64738));
      SPTEntry sPTEntry0 = aStarCHEntry0.cloneFull();
      aStarCHEntry0.parent = sPTEntry0;
      // Undeclared exception!
      try { 
        aStarCHEntry0.getParent();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.graphhopper.routing.SPTEntry cannot be cast to com.graphhopper.routing.ch.CHEntry
         //
         verifyException("com.graphhopper.routing.ch.CHEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AStarCHEntry aStarCHEntry0 = new AStarCHEntry(944, 944, 944, 944, 944);
      aStarCHEntry0.getParent();
      assertEquals(944.0, aStarCHEntry0.weightOfVisitedPath, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AStarCHEntry aStarCHEntry0 = new AStarCHEntry(1, 1, 1, 1, (-685.64738));
      double double0 = aStarCHEntry0.getWeightOfVisitedPath();
      assertEquals((-685.64738), double0, 0.01);
  }
}
