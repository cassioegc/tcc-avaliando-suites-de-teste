/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 04 06:10:01 GMT 2021
 */

package com.graphhopper.routing.weighting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.graphhopper.routing.weighting.BlockAreaWeighting;
import com.graphhopper.routing.weighting.Weighting;
import com.graphhopper.storage.GraphEdgeIdFinder;
import com.graphhopper.util.EdgeIteratorState;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BlockAreaWeighting_ESTest extends BlockAreaWeighting_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Weighting weighting0 = mock(Weighting.class, new ViolatedAssumptionAnswer());
      doReturn((-2134.992)).when(weighting0).calcEdgeWeight(any(com.graphhopper.util.EdgeIteratorState.class) , anyBoolean());
      GraphEdgeIdFinder.BlockArea graphEdgeIdFinder_BlockArea0 = mock(GraphEdgeIdFinder.BlockArea.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(graphEdgeIdFinder_BlockArea0).intersects(any(com.graphhopper.util.EdgeIteratorState.class));
      BlockAreaWeighting blockAreaWeighting0 = new BlockAreaWeighting(weighting0, graphEdgeIdFinder_BlockArea0);
      EdgeIteratorState edgeIteratorState0 = mock(EdgeIteratorState.class, new ViolatedAssumptionAnswer());
      double double0 = blockAreaWeighting0.calcEdgeWeight(edgeIteratorState0, true);
      assertEquals((-2134.992), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Weighting weighting0 = mock(Weighting.class, new ViolatedAssumptionAnswer());
      BlockAreaWeighting blockAreaWeighting0 = new BlockAreaWeighting(weighting0, (GraphEdgeIdFinder.BlockArea) null);
      EdgeIteratorState edgeIteratorState0 = mock(EdgeIteratorState.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        blockAreaWeighting0.calcEdgeWeight(edgeIteratorState0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.graphhopper.routing.weighting.BlockAreaWeighting", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Weighting weighting0 = mock(Weighting.class, new ViolatedAssumptionAnswer());
      GraphEdgeIdFinder.BlockArea graphEdgeIdFinder_BlockArea0 = mock(GraphEdgeIdFinder.BlockArea.class, new ViolatedAssumptionAnswer());
      BlockAreaWeighting blockAreaWeighting0 = new BlockAreaWeighting(weighting0, graphEdgeIdFinder_BlockArea0);
      String string0 = blockAreaWeighting0.getName();
      assertEquals("block_area", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Weighting weighting0 = mock(Weighting.class, new ViolatedAssumptionAnswer());
      GraphEdgeIdFinder.BlockArea graphEdgeIdFinder_BlockArea0 = mock(GraphEdgeIdFinder.BlockArea.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(graphEdgeIdFinder_BlockArea0).intersects(any(com.graphhopper.util.EdgeIteratorState.class));
      BlockAreaWeighting blockAreaWeighting0 = new BlockAreaWeighting(weighting0, graphEdgeIdFinder_BlockArea0);
      EdgeIteratorState edgeIteratorState0 = mock(EdgeIteratorState.class, new ViolatedAssumptionAnswer());
      double double0 = blockAreaWeighting0.calcEdgeWeight(edgeIteratorState0, true);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Weighting weighting0 = mock(Weighting.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(weighting0).calcEdgeWeight(any(com.graphhopper.util.EdgeIteratorState.class) , anyBoolean());
      GraphEdgeIdFinder.BlockArea graphEdgeIdFinder_BlockArea0 = mock(GraphEdgeIdFinder.BlockArea.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(graphEdgeIdFinder_BlockArea0).intersects(any(com.graphhopper.util.EdgeIteratorState.class));
      BlockAreaWeighting blockAreaWeighting0 = new BlockAreaWeighting(weighting0, graphEdgeIdFinder_BlockArea0);
      EdgeIteratorState edgeIteratorState0 = mock(EdgeIteratorState.class, new ViolatedAssumptionAnswer());
      double double0 = blockAreaWeighting0.calcEdgeWeight(edgeIteratorState0, true);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GraphEdgeIdFinder.BlockArea graphEdgeIdFinder_BlockArea0 = mock(GraphEdgeIdFinder.BlockArea.class, new ViolatedAssumptionAnswer());
      BlockAreaWeighting blockAreaWeighting0 = null;
      try {
        blockAreaWeighting0 = new BlockAreaWeighting((Weighting) null, graphEdgeIdFinder_BlockArea0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No super weighting set
         //
         verifyException("com.graphhopper.routing.weighting.AbstractAdjustedWeighting", e);
      }
  }
}
