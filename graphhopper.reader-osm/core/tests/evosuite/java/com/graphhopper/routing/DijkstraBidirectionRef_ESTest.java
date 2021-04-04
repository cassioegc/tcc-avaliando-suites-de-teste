/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 04 06:28:31 GMT 2021
 */

package com.graphhopper.routing;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.graphhopper.routing.DijkstraBidirectionRef;
import com.graphhopper.routing.SPTEntry;
import com.graphhopper.routing.util.TraversalMode;
import com.graphhopper.routing.weighting.Weighting;
import com.graphhopper.storage.Graph;
import com.graphhopper.storage.NodeAccess;
import com.graphhopper.util.EdgeExplorer;
import com.graphhopper.util.EdgeIteratorState;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DijkstraBidirectionRef_ESTest extends DijkstraBidirectionRef_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Graph graph0 = mock(Graph.class, new ViolatedAssumptionAnswer());
      doReturn((EdgeExplorer) null).when(graph0).createEdgeExplorer();
      doReturn((NodeAccess) null).when(graph0).getNodeAccess();
      doReturn(0).when(graph0).getNodes();
      Weighting weighting0 = mock(Weighting.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(weighting0).hasTurnCosts();
      TraversalMode traversalMode0 = TraversalMode.EDGE_BASED;
      DijkstraBidirectionRef dijkstraBidirectionRef0 = new DijkstraBidirectionRef(graph0, weighting0, traversalMode0);
      EdgeIteratorState edgeIteratorState0 = mock(EdgeIteratorState.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(edgeIteratorState0).getAdjNode();
      doReturn(0, 0).when(edgeIteratorState0).getEdge();
      SPTEntry sPTEntry0 = dijkstraBidirectionRef0.createEntry(edgeIteratorState0, 0.0, (SPTEntry) null, true);
      SPTEntry sPTEntry1 = dijkstraBidirectionRef0.createEntry(edgeIteratorState0, 3600.0, sPTEntry0, false);
      SPTEntry sPTEntry2 = dijkstraBidirectionRef0.getParent(sPTEntry1);
      assertNotNull(sPTEntry2);
      assertEquals(0.0, sPTEntry2.weight, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Graph graph0 = mock(Graph.class, new ViolatedAssumptionAnswer());
      doReturn((EdgeExplorer) null).when(graph0).createEdgeExplorer();
      doReturn((NodeAccess) null).when(graph0).getNodeAccess();
      doReturn(0).when(graph0).getNodes();
      Weighting weighting0 = mock(Weighting.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(weighting0).hasTurnCosts();
      TraversalMode traversalMode0 = TraversalMode.NODE_BASED;
      DijkstraBidirectionRef dijkstraBidirectionRef0 = new DijkstraBidirectionRef(graph0, weighting0, traversalMode0);
      SPTEntry sPTEntry0 = dijkstraBidirectionRef0.createStartEntry(8, 8, false);
      EdgeIteratorState edgeIteratorState0 = mock(EdgeIteratorState.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(edgeIteratorState0).getAdjNode();
      doReturn(0).when(edgeIteratorState0).getEdge();
      SPTEntry sPTEntry1 = dijkstraBidirectionRef0.createEntry(edgeIteratorState0, 0.0, sPTEntry0, false);
      SPTEntry sPTEntry2 = dijkstraBidirectionRef0.getParent(sPTEntry1);
      assertNotNull(sPTEntry2);
      assertEquals(8, sPTEntry2.adjNode);
      assertEquals(0.0, sPTEntry1.weight, 0.01);
      assertEquals(8.0, sPTEntry2.weight, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Graph graph0 = mock(Graph.class, new ViolatedAssumptionAnswer());
      doReturn((EdgeExplorer) null).when(graph0).createEdgeExplorer();
      doReturn((NodeAccess) null).when(graph0).getNodeAccess();
      doReturn(0).when(graph0).getNodes();
      Weighting weighting0 = mock(Weighting.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(weighting0).hasTurnCosts();
      TraversalMode traversalMode0 = TraversalMode.NODE_BASED;
      DijkstraBidirectionRef dijkstraBidirectionRef0 = new DijkstraBidirectionRef(graph0, weighting0, traversalMode0);
      EdgeIteratorState edgeIteratorState0 = mock(EdgeIteratorState.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(edgeIteratorState0).getAdjNode();
      doReturn(0).when(edgeIteratorState0).getEdge();
      SPTEntry sPTEntry0 = dijkstraBidirectionRef0.createStartEntry(1, (-1645.0), false);
      SPTEntry sPTEntry1 = dijkstraBidirectionRef0.createEntry(edgeIteratorState0, (-1645.0), sPTEntry0, false);
      SPTEntry sPTEntry2 = dijkstraBidirectionRef0.getParent(sPTEntry1);
      assertEquals((-1645.0), sPTEntry2.weight, 0.01);
      assertEquals((-1645.0), sPTEntry1.weight, 0.01);
      assertNotNull(sPTEntry2);
      assertEquals(1, sPTEntry2.adjNode);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Graph graph0 = mock(Graph.class, new ViolatedAssumptionAnswer());
      doReturn((EdgeExplorer) null).when(graph0).createEdgeExplorer();
      doReturn((NodeAccess) null).when(graph0).getNodeAccess();
      doReturn(0).when(graph0).getNodes();
      Weighting weighting0 = mock(Weighting.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(weighting0).hasTurnCosts();
      TraversalMode traversalMode0 = TraversalMode.EDGE_BASED;
      DijkstraBidirectionRef dijkstraBidirectionRef0 = new DijkstraBidirectionRef(graph0, weighting0, traversalMode0);
      SPTEntry sPTEntry0 = dijkstraBidirectionRef0.createStartEntry(0, 0, false);
      assertEquals(0.0, sPTEntry0.weight, 0.01);
      assertEquals(0, sPTEntry0.adjNode);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Graph graph0 = mock(Graph.class, new ViolatedAssumptionAnswer());
      doReturn((EdgeExplorer) null).when(graph0).createEdgeExplorer();
      doReturn((NodeAccess) null).when(graph0).getNodeAccess();
      doReturn(0).when(graph0).getNodes();
      Weighting weighting0 = mock(Weighting.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(weighting0).hasTurnCosts();
      TraversalMode traversalMode0 = TraversalMode.EDGE_BASED;
      DijkstraBidirectionRef dijkstraBidirectionRef0 = new DijkstraBidirectionRef(graph0, weighting0, traversalMode0);
      EdgeIteratorState edgeIteratorState0 = mock(EdgeIteratorState.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(edgeIteratorState0).getAdjNode();
      doReturn(0).when(edgeIteratorState0).getEdge();
      SPTEntry sPTEntry0 = dijkstraBidirectionRef0.createEntry(edgeIteratorState0, 0.0, (SPTEntry) null, true);
      assertNotNull(sPTEntry0);
      
      SPTEntry sPTEntry1 = dijkstraBidirectionRef0.getParent(sPTEntry0);
      assertNull(sPTEntry1);
      assertEquals(0.0, sPTEntry0.weight, 0.01);
      assertEquals(0.0, sPTEntry0.getWeightOfVisitedPath(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Graph graph0 = mock(Graph.class, new ViolatedAssumptionAnswer());
      TraversalMode traversalMode0 = TraversalMode.EDGE_BASED;
      DijkstraBidirectionRef dijkstraBidirectionRef0 = null;
      try {
        dijkstraBidirectionRef0 = new DijkstraBidirectionRef(graph0, (Weighting) null, traversalMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.graphhopper.routing.AbstractNonCHBidirAlgo", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Weighting weighting0 = mock(Weighting.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(weighting0).hasTurnCosts();
      TraversalMode traversalMode0 = TraversalMode.NODE_BASED;
      DijkstraBidirectionRef dijkstraBidirectionRef0 = null;
      try {
        dijkstraBidirectionRef0 = new DijkstraBidirectionRef((Graph) null, weighting0, traversalMode0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Weightings supporting turn costs cannot be used with node-based traversal mode
         //
         verifyException("com.graphhopper.routing.AbstractNonCHBidirAlgo", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Graph graph0 = mock(Graph.class, new ViolatedAssumptionAnswer());
      doReturn((EdgeExplorer) null).when(graph0).createEdgeExplorer();
      doReturn((NodeAccess) null).when(graph0).getNodeAccess();
      doReturn(0).when(graph0).getNodes();
      Weighting weighting0 = mock(Weighting.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(weighting0).hasTurnCosts();
      TraversalMode traversalMode0 = TraversalMode.EDGE_BASED;
      DijkstraBidirectionRef dijkstraBidirectionRef0 = new DijkstraBidirectionRef(graph0, weighting0, traversalMode0);
      String string0 = dijkstraBidirectionRef0.getName();
      assertEquals("dijkstrabi", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Graph graph0 = mock(Graph.class, new ViolatedAssumptionAnswer());
      doReturn((EdgeExplorer) null).when(graph0).createEdgeExplorer();
      doReturn((NodeAccess) null).when(graph0).getNodeAccess();
      doReturn(0).when(graph0).getNodes();
      Weighting weighting0 = mock(Weighting.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(weighting0).hasTurnCosts();
      TraversalMode traversalMode0 = TraversalMode.EDGE_BASED;
      DijkstraBidirectionRef dijkstraBidirectionRef0 = new DijkstraBidirectionRef(graph0, weighting0, traversalMode0);
      SPTEntry sPTEntry0 = dijkstraBidirectionRef0.createStartEntry((-600), 2447.52956, false);
      // Undeclared exception!
      try { 
        dijkstraBidirectionRef0.createEntry((EdgeIteratorState) null, (-1428.972298), sPTEntry0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.graphhopper.routing.DijkstraBidirectionRef", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Graph graph0 = mock(Graph.class, new ViolatedAssumptionAnswer());
      doReturn((EdgeExplorer) null).when(graph0).createEdgeExplorer();
      doReturn((NodeAccess) null).when(graph0).getNodeAccess();
      doReturn(0).when(graph0).getNodes();
      Weighting weighting0 = mock(Weighting.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(weighting0).hasTurnCosts();
      TraversalMode traversalMode0 = TraversalMode.EDGE_BASED;
      DijkstraBidirectionRef dijkstraBidirectionRef0 = new DijkstraBidirectionRef(graph0, weighting0, traversalMode0);
      // Undeclared exception!
      try { 
        dijkstraBidirectionRef0.getParent((SPTEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.graphhopper.routing.DijkstraBidirectionRef", e);
      }
  }
}
