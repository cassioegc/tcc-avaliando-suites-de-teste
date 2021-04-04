/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 04 03:35:24 GMT 2021
 */

package com.graphhopper.routing.ch;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.graphhopper.routing.ch.CHRoutingAlgorithmFactory;
import com.graphhopper.routing.querygraph.QueryGraph;
import com.graphhopper.storage.RoutingCHGraph;
import com.graphhopper.util.PMap;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CHRoutingAlgorithmFactory_ESTest extends CHRoutingAlgorithmFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CHRoutingAlgorithmFactory cHRoutingAlgorithmFactory0 = new CHRoutingAlgorithmFactory((RoutingCHGraph) null);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      PMap pMap0 = new PMap(hashMap0);
      // Undeclared exception!
      try { 
        cHRoutingAlgorithmFactory0.createAlgo(pMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.graphhopper.routing.ch.CHRoutingAlgorithmFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CHRoutingAlgorithmFactory cHRoutingAlgorithmFactory0 = null;
      try {
        cHRoutingAlgorithmFactory0 = new CHRoutingAlgorithmFactory((RoutingCHGraph) null, (QueryGraph) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.graphhopper.routing.querygraph.QueryRoutingCHGraph", e);
      }
  }
}
