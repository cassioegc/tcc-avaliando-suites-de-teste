/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 04 02:26:29 GMT 2021
 */

package com.graphhopper.routing.subnetwork;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.carrotsearch.hppc.IntIndexedContainer;
import com.carrotsearch.hppc.IntStack;
import com.graphhopper.routing.ev.BooleanEncodedValue;
import com.graphhopper.routing.ev.SimpleBooleanEncodedValue;
import com.graphhopper.routing.subnetwork.PrepareRoutingSubnetworks;
import com.graphhopper.routing.util.DefaultEdgeFilter;
import com.graphhopper.routing.util.EdgeFilter;
import com.graphhopper.routing.util.EncodingManager;
import com.graphhopper.routing.util.FlagEncoder;
import com.graphhopper.routing.weighting.TurnCostProvider;
import com.graphhopper.storage.DAType;
import com.graphhopper.storage.GHDirectory;
import com.graphhopper.storage.GraphHopperStorage;
import com.graphhopper.storage.IntsRef;
import com.graphhopper.storage.MMapDirectory;
import com.graphhopper.storage.RAMDirectory;
import com.graphhopper.util.EdgeExplorer;
import com.graphhopper.util.EdgeIteratorState;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PrepareRoutingSubnetworks_ESTest extends PrepareRoutingSubnetworks_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RAMDirectory rAMDirectory0 = new RAMDirectory((String) null, true);
      Stack<FlagEncoder> stack0 = new Stack<FlagEncoder>();
      EncodingManager encodingManager0 = EncodingManager.create((List<? extends FlagEncoder>) stack0);
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(rAMDirectory0, encodingManager0, true, false, 1);
      GraphHopperStorage graphHopperStorage1 = graphHopperStorage0.create(1);
      Stack<PrepareRoutingSubnetworks.PrepareJob> stack1 = new Stack<PrepareRoutingSubnetworks.PrepareJob>();
      PrepareRoutingSubnetworks prepareRoutingSubnetworks0 = new PrepareRoutingSubnetworks(graphHopperStorage0, stack1);
      IntsRef intsRef0 = encodingManager0.createRelationFlags();
      EdgeExplorer edgeExplorer0 = graphHopperStorage1.createEdgeExplorer();
      IntStack intStack0 = IntStack.from(intsRef0.ints);
      intStack0.push(2);
      int int0 = prepareRoutingSubnetworks0.blockEdgesForComponent(edgeExplorer0, (BooleanEncodedValue) null, intStack0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RAMDirectory rAMDirectory0 = new RAMDirectory((String) null, true);
      Stack<FlagEncoder> stack0 = new Stack<FlagEncoder>();
      EncodingManager encodingManager0 = EncodingManager.create((List<? extends FlagEncoder>) stack0);
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(rAMDirectory0, encodingManager0, true, false, 1);
      Stack<PrepareRoutingSubnetworks.PrepareJob> stack1 = new Stack<PrepareRoutingSubnetworks.PrepareJob>();
      PrepareRoutingSubnetworks prepareRoutingSubnetworks0 = new PrepareRoutingSubnetworks(graphHopperStorage0, stack1);
      EdgeExplorer edgeExplorer0 = graphHopperStorage0.createEdgeExplorer();
      IntStack intStack0 = new IntStack();
      intStack0.discard();
      int int0 = prepareRoutingSubnetworks0.blockEdgesForComponent(edgeExplorer0, (BooleanEncodedValue) null, intStack0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DAType dAType0 = DAType.RAM_INT_STORE;
      GHDirectory gHDirectory0 = new GHDirectory("", dAType0);
      EncodingManager encodingManager0 = EncodingManager.create("");
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(gHDirectory0, encodingManager0, true, false, (-372));
      Stack<PrepareRoutingSubnetworks.PrepareJob> stack0 = new Stack<PrepareRoutingSubnetworks.PrepareJob>();
      PrepareRoutingSubnetworks prepareRoutingSubnetworks0 = new PrepareRoutingSubnetworks(graphHopperStorage0, stack0);
      PrepareRoutingSubnetworks prepareRoutingSubnetworks1 = prepareRoutingSubnetworks0.setMinNetworkSize(0);
      prepareRoutingSubnetworks1.doWork();
      assertSame(prepareRoutingSubnetworks1, prepareRoutingSubnetworks0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArrayList<PrepareRoutingSubnetworks.PrepareJob> arrayList0 = new ArrayList<PrepareRoutingSubnetworks.PrepareJob>();
      PrepareRoutingSubnetworks prepareRoutingSubnetworks0 = new PrepareRoutingSubnetworks((GraphHopperStorage) null, arrayList0);
      SimpleBooleanEncodedValue simpleBooleanEncodedValue0 = (SimpleBooleanEncodedValue)EdgeIteratorState.UNFAVORED_EDGE;
      PrepareRoutingSubnetworks.PrepareJob prepareRoutingSubnetworks_PrepareJob0 = new PrepareRoutingSubnetworks.PrepareJob("", simpleBooleanEncodedValue0, (TurnCostProvider) null);
      // Undeclared exception!
      try { 
        prepareRoutingSubnetworks0.removeSmallSubNetworks(prepareRoutingSubnetworks_PrepareJob0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.graphhopper.routing.subnetwork.TarjanSCC", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArrayList<PrepareRoutingSubnetworks.PrepareJob> arrayList0 = new ArrayList<PrepareRoutingSubnetworks.PrepareJob>();
      PrepareRoutingSubnetworks prepareRoutingSubnetworks0 = new PrepareRoutingSubnetworks((GraphHopperStorage) null, arrayList0);
      // Undeclared exception!
      try { 
        prepareRoutingSubnetworks0.doWork();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.graphhopper.routing.subnetwork.PrepareRoutingSubnetworks", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RAMDirectory rAMDirectory0 = new RAMDirectory();
      Vector<FlagEncoder> vector0 = new Vector<FlagEncoder>();
      EncodingManager encodingManager0 = EncodingManager.create((List<? extends FlagEncoder>) vector0);
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(rAMDirectory0, encodingManager0, true, true);
      PrepareRoutingSubnetworks prepareRoutingSubnetworks0 = new PrepareRoutingSubnetworks(graphHopperStorage0, (List<PrepareRoutingSubnetworks.PrepareJob>) null);
      DefaultEdgeFilter defaultEdgeFilter0 = DefaultEdgeFilter.inEdges((BooleanEncodedValue) null);
      EdgeExplorer edgeExplorer0 = graphHopperStorage0.createEdgeExplorer((EdgeFilter) defaultEdgeFilter0);
      // Undeclared exception!
      try { 
        prepareRoutingSubnetworks0.detectNodeRemovedForAllEncoders(edgeExplorer0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.graphhopper.routing.subnetwork.PrepareRoutingSubnetworks", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MMapDirectory mMapDirectory0 = new MMapDirectory("D");
      ArrayList<FlagEncoder> arrayList0 = new ArrayList<FlagEncoder>();
      EncodingManager encodingManager0 = EncodingManager.create((List<? extends FlagEncoder>) arrayList0);
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(mMapDirectory0, encodingManager0, false);
      Vector<PrepareRoutingSubnetworks.PrepareJob> vector0 = new Vector<PrepareRoutingSubnetworks.PrepareJob>();
      PrepareRoutingSubnetworks prepareRoutingSubnetworks0 = new PrepareRoutingSubnetworks(graphHopperStorage0, vector0);
      EdgeExplorer edgeExplorer0 = graphHopperStorage0.createEdgeExplorer();
      // Undeclared exception!
      try { 
        prepareRoutingSubnetworks0.detectNodeRemovedForAllEncoders(edgeExplorer0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RAMDirectory rAMDirectory0 = new RAMDirectory();
      Vector<FlagEncoder> vector0 = new Vector<FlagEncoder>();
      EncodingManager encodingManager0 = EncodingManager.create((List<? extends FlagEncoder>) vector0);
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(rAMDirectory0, encodingManager0, true);
      Stack<PrepareRoutingSubnetworks.PrepareJob> stack0 = new Stack<PrepareRoutingSubnetworks.PrepareJob>();
      PrepareRoutingSubnetworks prepareRoutingSubnetworks0 = new PrepareRoutingSubnetworks(graphHopperStorage0, stack0);
      BooleanEncodedValue booleanEncodedValue0 = EdgeIteratorState.REVERSE_STATE;
      // Undeclared exception!
      try { 
        prepareRoutingSubnetworks0.blockEdgesForComponent((EdgeExplorer) null, booleanEncodedValue0, (IntIndexedContainer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.graphhopper.routing.subnetwork.PrepareRoutingSubnetworks", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DAType dAType0 = DAType.MMAP;
      GHDirectory gHDirectory0 = new GHDirectory("k-lOR=$pDR{T0$", dAType0);
      Stack<FlagEncoder> stack0 = new Stack<FlagEncoder>();
      EncodingManager encodingManager0 = EncodingManager.create((List<? extends FlagEncoder>) stack0);
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(gHDirectory0, encodingManager0, true, false);
      LinkedList<PrepareRoutingSubnetworks.PrepareJob> linkedList0 = new LinkedList<PrepareRoutingSubnetworks.PrepareJob>();
      PrepareRoutingSubnetworks prepareRoutingSubnetworks0 = new PrepareRoutingSubnetworks(graphHopperStorage0, linkedList0);
      EdgeExplorer edgeExplorer0 = graphHopperStorage0.createEdgeExplorer();
      int[] intArray0 = new int[5];
      IntStack intStack0 = IntStack.from(intArray0);
      // Undeclared exception!
      try { 
        prepareRoutingSubnetworks0.blockEdgesForComponent(edgeExplorer0, (BooleanEncodedValue) null, intStack0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DAType dAType0 = DAType.RAM_STORE;
      GHDirectory gHDirectory0 = new GHDirectory("k-lOR=$pDR{T0$", dAType0);
      Stack<FlagEncoder> stack0 = new Stack<FlagEncoder>();
      EncodingManager encodingManager0 = EncodingManager.create((List<? extends FlagEncoder>) stack0);
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(gHDirectory0, encodingManager0, true, false);
      LinkedList<PrepareRoutingSubnetworks.PrepareJob> linkedList0 = new LinkedList<PrepareRoutingSubnetworks.PrepareJob>();
      PrepareRoutingSubnetworks prepareRoutingSubnetworks0 = new PrepareRoutingSubnetworks(graphHopperStorage0, linkedList0);
      EdgeExplorer edgeExplorer0 = graphHopperStorage0.createEdgeExplorer();
      int[] intArray0 = new int[5];
      IntStack intStack0 = IntStack.from(intArray0);
      // Undeclared exception!
      try { 
        prepareRoutingSubnetworks0.blockEdgesForComponent(edgeExplorer0, (BooleanEncodedValue) null, intStack0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BooleanEncodedValue booleanEncodedValue0 = EdgeIteratorState.REVERSE_STATE;
      PrepareRoutingSubnetworks.PrepareJob prepareRoutingSubnetworks_PrepareJob0 = new PrepareRoutingSubnetworks.PrepareJob("", booleanEncodedValue0, (TurnCostProvider) null);
      String string0 = prepareRoutingSubnetworks_PrepareJob0.toString();
      assertEquals("|node-based", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RAMDirectory rAMDirectory0 = new RAMDirectory("only_straight_on", true);
      Stack<FlagEncoder> stack0 = new Stack<FlagEncoder>();
      EncodingManager encodingManager0 = EncodingManager.create((List<? extends FlagEncoder>) stack0);
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(rAMDirectory0, encodingManager0, true, false, 1);
      GraphHopperStorage graphHopperStorage1 = graphHopperStorage0.create(1);
      Stack<PrepareRoutingSubnetworks.PrepareJob> stack1 = new Stack<PrepareRoutingSubnetworks.PrepareJob>();
      PrepareRoutingSubnetworks prepareRoutingSubnetworks0 = new PrepareRoutingSubnetworks(graphHopperStorage1, stack1);
      EdgeExplorer edgeExplorer0 = graphHopperStorage1.createEdgeExplorer();
      boolean boolean0 = prepareRoutingSubnetworks0.detectNodeRemovedForAllEncoders(edgeExplorer0, 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RAMDirectory rAMDirectory0 = new RAMDirectory("ice");
      ArrayList<FlagEncoder> arrayList0 = new ArrayList<FlagEncoder>();
      EncodingManager encodingManager0 = EncodingManager.create((List<? extends FlagEncoder>) arrayList0);
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(rAMDirectory0, encodingManager0, true, true);
      LinkedList<PrepareRoutingSubnetworks.PrepareJob> linkedList0 = new LinkedList<PrepareRoutingSubnetworks.PrepareJob>();
      PrepareRoutingSubnetworks prepareRoutingSubnetworks0 = new PrepareRoutingSubnetworks(graphHopperStorage0, linkedList0);
      SimpleBooleanEncodedValue simpleBooleanEncodedValue0 = new SimpleBooleanEncodedValue("ice");
      TurnCostProvider turnCostProvider0 = TurnCostProvider.NO_TURN_COST_PROVIDER;
      PrepareRoutingSubnetworks.PrepareJob prepareRoutingSubnetworks_PrepareJob0 = new PrepareRoutingSubnetworks.PrepareJob("ice", simpleBooleanEncodedValue0, turnCostProvider0);
      linkedList0.add(prepareRoutingSubnetworks_PrepareJob0);
      EdgeExplorer edgeExplorer0 = graphHopperStorage0.createEdgeExplorer();
      // Undeclared exception!
      try { 
        prepareRoutingSubnetworks0.detectNodeRemovedForAllEncoders(edgeExplorer0, 5);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RAMDirectory rAMDirectory0 = new RAMDirectory("", true);
      EncodingManager encodingManager0 = EncodingManager.create("");
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(rAMDirectory0, encodingManager0, true);
      Stack<PrepareRoutingSubnetworks.PrepareJob> stack0 = new Stack<PrepareRoutingSubnetworks.PrepareJob>();
      PrepareRoutingSubnetworks prepareRoutingSubnetworks0 = new PrepareRoutingSubnetworks(graphHopperStorage0, stack0);
      PrepareRoutingSubnetworks prepareRoutingSubnetworks1 = prepareRoutingSubnetworks0.setMinNetworkSize(Integer.MIN_VALUE);
      BooleanEncodedValue booleanEncodedValue0 = EdgeIteratorState.REVERSE_STATE;
      TurnCostProvider turnCostProvider0 = TurnCostProvider.NO_TURN_COST_PROVIDER;
      PrepareRoutingSubnetworks.PrepareJob prepareRoutingSubnetworks_PrepareJob0 = new PrepareRoutingSubnetworks.PrepareJob("", booleanEncodedValue0, turnCostProvider0);
      int int0 = prepareRoutingSubnetworks1.removeSmallSubNetworks(prepareRoutingSubnetworks_PrepareJob0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BooleanEncodedValue booleanEncodedValue0 = EdgeIteratorState.REVERSE_STATE;
      PrepareRoutingSubnetworks.PrepareJob prepareRoutingSubnetworks_PrepareJob0 = new PrepareRoutingSubnetworks.PrepareJob("D", booleanEncodedValue0, (TurnCostProvider) null);
      MMapDirectory mMapDirectory0 = new MMapDirectory("D");
      ArrayList<FlagEncoder> arrayList0 = new ArrayList<FlagEncoder>();
      EncodingManager encodingManager0 = EncodingManager.create((List<? extends FlagEncoder>) arrayList0);
      Vector<PrepareRoutingSubnetworks.PrepareJob> vector0 = new Vector<PrepareRoutingSubnetworks.PrepareJob>();
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(mMapDirectory0, encodingManager0, false, false);
      PrepareRoutingSubnetworks prepareRoutingSubnetworks0 = new PrepareRoutingSubnetworks(graphHopperStorage0, vector0);
      PrepareRoutingSubnetworks prepareRoutingSubnetworks1 = prepareRoutingSubnetworks0.setMinNetworkSize((-1379));
      int int0 = prepareRoutingSubnetworks1.removeSmallSubNetworks(prepareRoutingSubnetworks_PrepareJob0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RAMDirectory rAMDirectory0 = new RAMDirectory("ice");
      ArrayList<FlagEncoder> arrayList0 = new ArrayList<FlagEncoder>();
      EncodingManager encodingManager0 = EncodingManager.create((List<? extends FlagEncoder>) arrayList0);
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(rAMDirectory0, encodingManager0, true, true);
      LinkedList<PrepareRoutingSubnetworks.PrepareJob> linkedList0 = new LinkedList<PrepareRoutingSubnetworks.PrepareJob>();
      PrepareRoutingSubnetworks prepareRoutingSubnetworks0 = new PrepareRoutingSubnetworks(graphHopperStorage0, linkedList0);
      SimpleBooleanEncodedValue simpleBooleanEncodedValue0 = new SimpleBooleanEncodedValue("ice");
      TurnCostProvider turnCostProvider0 = TurnCostProvider.NO_TURN_COST_PROVIDER;
      PrepareRoutingSubnetworks.PrepareJob prepareRoutingSubnetworks_PrepareJob0 = new PrepareRoutingSubnetworks.PrepareJob("ice", simpleBooleanEncodedValue0, turnCostProvider0);
      linkedList0.add(prepareRoutingSubnetworks_PrepareJob0);
      prepareRoutingSubnetworks0.doWork();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RAMDirectory rAMDirectory0 = new RAMDirectory("", true);
      EncodingManager encodingManager0 = EncodingManager.create("");
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(rAMDirectory0, encodingManager0, true);
      Stack<PrepareRoutingSubnetworks.PrepareJob> stack0 = new Stack<PrepareRoutingSubnetworks.PrepareJob>();
      PrepareRoutingSubnetworks prepareRoutingSubnetworks0 = new PrepareRoutingSubnetworks(graphHopperStorage0, stack0);
      PrepareRoutingSubnetworks prepareRoutingSubnetworks1 = prepareRoutingSubnetworks0.setMinNetworkSize(Integer.MIN_VALUE);
      prepareRoutingSubnetworks1.doWork();
      assertSame(prepareRoutingSubnetworks0, prepareRoutingSubnetworks1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BooleanEncodedValue booleanEncodedValue0 = EdgeIteratorState.REVERSE_STATE;
      PrepareRoutingSubnetworks.PrepareJob prepareRoutingSubnetworks_PrepareJob0 = new PrepareRoutingSubnetworks.PrepareJob("D", booleanEncodedValue0, (TurnCostProvider) null);
      MMapDirectory mMapDirectory0 = new MMapDirectory("D");
      ArrayList<FlagEncoder> arrayList0 = new ArrayList<FlagEncoder>();
      EncodingManager encodingManager0 = EncodingManager.create((List<? extends FlagEncoder>) arrayList0);
      Vector<PrepareRoutingSubnetworks.PrepareJob> vector0 = new Vector<PrepareRoutingSubnetworks.PrepareJob>();
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(mMapDirectory0, encodingManager0, false, false);
      PrepareRoutingSubnetworks prepareRoutingSubnetworks0 = new PrepareRoutingSubnetworks(graphHopperStorage0, vector0);
      int int0 = prepareRoutingSubnetworks0.removeSmallSubNetworks(prepareRoutingSubnetworks_PrepareJob0);
      assertEquals(0, int0);
  }
}
