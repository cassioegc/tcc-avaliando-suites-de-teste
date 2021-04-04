/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 04 04:50:28 GMT 2021
 */

package com.graphhopper.routing.lm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.graphhopper.routing.AlgorithmOptions;
import com.graphhopper.routing.lm.LMRoutingAlgorithmFactory;
import com.graphhopper.routing.lm.LandmarkStorage;
import com.graphhopper.storage.Graph;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LMRoutingAlgorithmFactory_ESTest extends LMRoutingAlgorithmFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LMRoutingAlgorithmFactory lMRoutingAlgorithmFactory0 = null;
      try {
        lMRoutingAlgorithmFactory0 = new LMRoutingAlgorithmFactory((LandmarkStorage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.graphhopper.routing.lm.LMRoutingAlgorithmFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LandmarkStorage landmarkStorage0 = mock(LandmarkStorage.class, new ViolatedAssumptionAnswer());
      doReturn((-3552)).when(landmarkStorage0).getLandmarkCount();
      LMRoutingAlgorithmFactory lMRoutingAlgorithmFactory0 = new LMRoutingAlgorithmFactory(landmarkStorage0);
      Graph graph0 = mock(Graph.class, new ViolatedAssumptionAnswer());
      AlgorithmOptions algorithmOptions0 = mock(AlgorithmOptions.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        lMRoutingAlgorithmFactory0.createAlgo(graph0, algorithmOptions0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Initialize landmark storage before creating algorithms
         //
         verifyException("com.graphhopper.routing.lm.LMRoutingAlgorithmFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LandmarkStorage landmarkStorage0 = mock(LandmarkStorage.class, new ViolatedAssumptionAnswer());
      doReturn((-3552)).when(landmarkStorage0).getLandmarkCount();
      LMRoutingAlgorithmFactory lMRoutingAlgorithmFactory0 = new LMRoutingAlgorithmFactory(landmarkStorage0);
      LMRoutingAlgorithmFactory lMRoutingAlgorithmFactory1 = lMRoutingAlgorithmFactory0.setDefaultActiveLandmarks((-3552));
      assertSame(lMRoutingAlgorithmFactory1, lMRoutingAlgorithmFactory0);
  }
}
