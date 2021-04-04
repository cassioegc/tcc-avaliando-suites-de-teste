/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 04 05:36:51 GMT 2021
 */

package com.graphhopper.util.details;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.graphhopper.util.EdgeIteratorState;
import com.graphhopper.util.details.EdgeIdDetails;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EdgeIdDetails_ESTest extends EdgeIdDetails_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EdgeIdDetails edgeIdDetails0 = new EdgeIdDetails();
      EdgeIteratorState edgeIteratorState0 = mock(EdgeIteratorState.class, new ViolatedAssumptionAnswer());
      doReturn((-2)).when(edgeIteratorState0).getEdge();
      boolean boolean0 = edgeIdDetails0.isEdgeDifferentToLastEdge(edgeIteratorState0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EdgeIdDetails edgeIdDetails0 = new EdgeIdDetails();
      // Undeclared exception!
      try { 
        edgeIdDetails0.isEdgeDifferentToLastEdge((EdgeIteratorState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.graphhopper.util.details.EdgeIdDetails", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EdgeIdDetails edgeIdDetails0 = new EdgeIdDetails();
      EdgeIteratorState edgeIteratorState0 = mock(EdgeIteratorState.class, new ViolatedAssumptionAnswer());
      doReturn(41).when(edgeIteratorState0).getEdge();
      boolean boolean0 = edgeIdDetails0.isEdgeDifferentToLastEdge(edgeIteratorState0);
      EdgeIteratorState edgeIteratorState1 = mock(EdgeIteratorState.class, new ViolatedAssumptionAnswer());
      doReturn(41).when(edgeIteratorState1).getEdge();
      boolean boolean1 = edgeIdDetails0.isEdgeDifferentToLastEdge(edgeIteratorState1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EdgeIdDetails edgeIdDetails0 = new EdgeIdDetails();
      Object object0 = edgeIdDetails0.getCurrentValue();
      assertEquals((-1), object0);
  }
}
