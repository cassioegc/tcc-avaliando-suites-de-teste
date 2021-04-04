/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 04 03:44:26 GMT 2021
 */

package com.graphhopper.reader.dem;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.graphhopper.reader.dem.CGIARProvider;
import com.graphhopper.reader.dem.NodeElevationInterpolator;
import com.graphhopper.routing.util.EncodingManager;
import com.graphhopper.routing.util.FlagEncoder;
import com.graphhopper.routing.util.RacingBikeFlagEncoder;
import com.graphhopper.storage.DAType;
import com.graphhopper.storage.Directory;
import com.graphhopper.storage.GHDirectory;
import com.graphhopper.storage.GraphHopperStorage;
import com.graphhopper.storage.RAMDirectory;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NodeElevationInterpolator_ESTest extends NodeElevationInterpolator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DAType dAType0 = DAType.RAM_INT;
      GHDirectory gHDirectory0 = new GHDirectory("com.graphhopper.routing.util.DefaultEdgeFilter", dAType0);
      LinkedList<RacingBikeFlagEncoder> linkedList0 = new LinkedList<RacingBikeFlagEncoder>();
      EncodingManager encodingManager0 = EncodingManager.create((List<? extends FlagEncoder>) linkedList0);
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(gHDirectory0, encodingManager0, true, true, 25);
      GraphHopperStorage graphHopperStorage1 = graphHopperStorage0.create(4692L);
      NodeElevationInterpolator nodeElevationInterpolator0 = new NodeElevationInterpolator(graphHopperStorage1);
      int[] intArray0 = new int[4];
      int[] intArray1 = new int[2];
      nodeElevationInterpolator0.interpolateElevationsOfInnerNodes(intArray0, intArray1);
      assertEquals(1, graphHopperStorage1.getNodes());
      assertEquals(1, graphHopperStorage0.getNodes());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RAMDirectory rAMDirectory0 = new RAMDirectory("");
      Stack<FlagEncoder> stack0 = new Stack<FlagEncoder>();
      EncodingManager encodingManager0 = EncodingManager.create((List<? extends FlagEncoder>) stack0);
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(rAMDirectory0, encodingManager0, true, false, 6);
      GraphHopperStorage graphHopperStorage1 = graphHopperStorage0.create(6);
      NodeElevationInterpolator nodeElevationInterpolator0 = new NodeElevationInterpolator(graphHopperStorage1);
      int[] intArray0 = new int[8];
      intArray0[1] = 6;
      int[] intArray1 = new int[3];
      nodeElevationInterpolator0.interpolateElevationsOfInnerNodes(intArray1, intArray0);
      assertEquals(7, graphHopperStorage1.getNodes());
      assertEquals(7, graphHopperStorage0.getNodes());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RAMDirectory rAMDirectory0 = new RAMDirectory("");
      Stack<FlagEncoder> stack0 = new Stack<FlagEncoder>();
      EncodingManager encodingManager0 = EncodingManager.create((List<? extends FlagEncoder>) stack0);
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(rAMDirectory0, encodingManager0, true, false, 6);
      GraphHopperStorage graphHopperStorage1 = graphHopperStorage0.create(6);
      NodeElevationInterpolator nodeElevationInterpolator0 = new NodeElevationInterpolator(graphHopperStorage1);
      int[] intArray0 = new int[8];
      int[] intArray1 = new int[3];
      intArray1[1] = 6;
      nodeElevationInterpolator0.interpolateElevationsOfInnerNodes(intArray1, intArray0);
      assertEquals(1, graphHopperStorage1.getNodes());
      assertEquals(1, graphHopperStorage0.getNodes());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RAMDirectory rAMDirectory0 = new RAMDirectory("");
      Stack<FlagEncoder> stack0 = new Stack<FlagEncoder>();
      EncodingManager encodingManager0 = EncodingManager.create((List<? extends FlagEncoder>) stack0);
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(rAMDirectory0, encodingManager0, true, false, 6);
      GraphHopperStorage graphHopperStorage1 = graphHopperStorage0.create(6);
      NodeElevationInterpolator nodeElevationInterpolator0 = new NodeElevationInterpolator(graphHopperStorage1);
      int[] intArray0 = new int[8];
      int[] intArray1 = new int[3];
      intArray1[0] = 6;
      nodeElevationInterpolator0.interpolateElevationsOfInnerNodes(intArray1, intArray0);
      assertEquals(1, graphHopperStorage1.getNodes());
      assertEquals(1, graphHopperStorage0.getNodes());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DAType dAType0 = DAType.RAM_INT_STORE;
      GHDirectory gHDirectory0 = new GHDirectory("x+7#*8,", dAType0);
      EncodingManager encodingManager0 = EncodingManager.create("");
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(gHDirectory0, encodingManager0, true, true);
      NodeElevationInterpolator nodeElevationInterpolator0 = new NodeElevationInterpolator(graphHopperStorage0);
      int[] intArray0 = new int[3];
      intArray0[0] = (-243);
      // Undeclared exception!
      try { 
        nodeElevationInterpolator0.interpolateElevationsOfInnerNodes(intArray0, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RAMDirectory rAMDirectory0 = new RAMDirectory("");
      Stack<FlagEncoder> stack0 = new Stack<FlagEncoder>();
      EncodingManager encodingManager0 = EncodingManager.create((List<? extends FlagEncoder>) stack0);
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(rAMDirectory0, encodingManager0, true, false, 6);
      GraphHopperStorage graphHopperStorage1 = graphHopperStorage0.create(6);
      NodeElevationInterpolator nodeElevationInterpolator0 = new NodeElevationInterpolator(graphHopperStorage1);
      int[] intArray0 = new int[21];
      intArray0[1] = 6;
      int[] intArray1 = new int[2];
      nodeElevationInterpolator0.interpolateElevationsOfInnerNodes(intArray1, intArray0);
      assertEquals(7, graphHopperStorage1.getNodes());
      assertEquals(7, graphHopperStorage0.getNodes());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RAMDirectory rAMDirectory0 = new RAMDirectory("");
      Stack<FlagEncoder> stack0 = new Stack<FlagEncoder>();
      EncodingManager encodingManager0 = EncodingManager.create((List<? extends FlagEncoder>) stack0);
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(rAMDirectory0, encodingManager0, true, false, 6);
      GraphHopperStorage graphHopperStorage1 = graphHopperStorage0.create(6);
      NodeElevationInterpolator nodeElevationInterpolator0 = new NodeElevationInterpolator(graphHopperStorage1);
      int[] intArray0 = new int[21];
      int[] intArray1 = new int[2];
      intArray1[1] = 6;
      nodeElevationInterpolator0.interpolateElevationsOfInnerNodes(intArray1, intArray0);
      assertEquals(1, graphHopperStorage1.getNodes());
      assertEquals(1, graphHopperStorage0.getNodes());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CGIARProvider cGIARProvider0 = new CGIARProvider();
      Directory directory0 = cGIARProvider0.getDirectory();
      ArrayList<RacingBikeFlagEncoder> arrayList0 = new ArrayList<RacingBikeFlagEncoder>();
      EncodingManager encodingManager0 = EncodingManager.create((List<? extends FlagEncoder>) arrayList0);
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(directory0, encodingManager0, true, false, 1895);
      NodeElevationInterpolator nodeElevationInterpolator0 = new NodeElevationInterpolator(graphHopperStorage0);
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        nodeElevationInterpolator0.interpolateElevationsOfInnerNodes(intArray0, (int[]) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CGIARProvider cGIARProvider0 = new CGIARProvider("");
      Directory directory0 = cGIARProvider0.getDirectory();
      Vector<FlagEncoder> vector0 = new Vector<FlagEncoder>();
      EncodingManager encodingManager0 = EncodingManager.create((List<? extends FlagEncoder>) vector0);
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(directory0, encodingManager0, true, true);
      NodeElevationInterpolator nodeElevationInterpolator0 = new NodeElevationInterpolator(graphHopperStorage0);
      // Undeclared exception!
      try { 
        nodeElevationInterpolator0.interpolateElevationsOfInnerNodes((int[]) null, (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.graphhopper.reader.dem.NodeElevationInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RAMDirectory rAMDirectory0 = new RAMDirectory();
      Vector<RacingBikeFlagEncoder> vector0 = new Vector<RacingBikeFlagEncoder>();
      EncodingManager encodingManager0 = EncodingManager.create((List<? extends FlagEncoder>) vector0);
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(rAMDirectory0, encodingManager0, false);
      NodeElevationInterpolator nodeElevationInterpolator0 = new NodeElevationInterpolator(graphHopperStorage0);
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        nodeElevationInterpolator0.interpolateElevationsOfInnerNodes(intArray0, intArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Cannot access elevation - 3D is not enabled
         //
         verifyException("com.graphhopper.storage.GHNodeAccess", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NodeElevationInterpolator nodeElevationInterpolator0 = new NodeElevationInterpolator((GraphHopperStorage) null);
      int[] intArray0 = new int[0];
      nodeElevationInterpolator0.interpolateElevationsOfInnerNodes(intArray0, intArray0);
      assertArrayEquals(new int[] {}, intArray0);
  }
}
