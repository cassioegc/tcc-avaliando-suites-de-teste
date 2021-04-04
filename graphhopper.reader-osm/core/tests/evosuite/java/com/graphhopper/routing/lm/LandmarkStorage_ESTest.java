/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 04 01:21:17 GMT 2021
 */

package com.graphhopper.routing.lm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.graphhopper.routing.lm.LMConfig;
import com.graphhopper.routing.lm.LandmarkStorage;
import com.graphhopper.routing.util.EncodingManager;
import com.graphhopper.routing.util.FlagEncoder;
import com.graphhopper.routing.util.WheelchairFlagEncoder;
import com.graphhopper.routing.weighting.Weighting;
import com.graphhopper.storage.DAType;
import com.graphhopper.storage.GHDirectory;
import com.graphhopper.storage.Graph;
import com.graphhopper.storage.GraphHopperStorage;
import com.graphhopper.storage.MMapDirectory;
import com.graphhopper.storage.RAMDirectory;
import com.graphhopper.util.shapes.GHPoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LandmarkStorage_ESTest extends LandmarkStorage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MMapDirectory mMapDirectory0 = new MMapDirectory("from ");
      Vector<FlagEncoder> vector0 = new Vector<FlagEncoder>();
      EncodingManager encodingManager0 = EncodingManager.create((List<? extends FlagEncoder>) vector0);
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(mMapDirectory0, encodingManager0, false, true);
      LMConfig lMConfig0 = new LMConfig("", (Weighting) null);
      LandmarkStorage landmarkStorage0 = null;
      try {
        landmarkStorage0 = new LandmarkStorage(graphHopperStorage0, mMapDirectory0, lMConfig0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.graphhopper.routing.lm.LandmarkStorage", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RAMDirectory rAMDirectory0 = new RAMDirectory();
      ArrayList<FlagEncoder> arrayList0 = new ArrayList<FlagEncoder>();
      EncodingManager encodingManager0 = EncodingManager.create((List<? extends FlagEncoder>) arrayList0);
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(rAMDirectory0, encodingManager0, false, false, 2);
      graphHopperStorage0.create(2);
      GHPoint gHPoint0 = LandmarkStorage.createPoint(graphHopperStorage0, 2);
      assertEquals(0.0, gHPoint0.lon, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RAMDirectory rAMDirectory0 = new RAMDirectory();
      ArrayList<FlagEncoder> arrayList0 = new ArrayList<FlagEncoder>();
      EncodingManager encodingManager0 = EncodingManager.create((List<? extends FlagEncoder>) arrayList0);
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(rAMDirectory0, encodingManager0, false, true, 14);
      graphHopperStorage0.create(766L);
      GraphHopperStorage graphHopperStorage1 = new GraphHopperStorage(rAMDirectory0, encodingManager0, false, false, 138);
      GHPoint gHPoint0 = LandmarkStorage.createPoint(graphHopperStorage1, 138);
      assertEquals((-1.8626451908643215E-7), gHPoint0.getLon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        LandmarkStorage.createPoint((Graph) null, 4181);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.graphhopper.routing.lm.LandmarkStorage", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RAMDirectory rAMDirectory0 = new RAMDirectory("");
      EncodingManager encodingManager0 = EncodingManager.create("");
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(rAMDirectory0, encodingManager0, true, true, 138);
      // Undeclared exception!
      try { 
        LandmarkStorage.createPoint(graphHopperStorage0, 138);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.graphhopper.storage.RAMIntDataAccess", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      WheelchairFlagEncoder wheelchairFlagEncoder0 = new WheelchairFlagEncoder();
      LandmarkStorage.RequireBothDirectionsEdgeFilter landmarkStorage_RequireBothDirectionsEdgeFilter0 = null;
      try {
        landmarkStorage_RequireBothDirectionsEdgeFilter0 = new LandmarkStorage.RequireBothDirectionsEdgeFilter(wheelchairFlagEncoder0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // FlagEncoder com.graphhopper.routing.util.WheelchairFlagEncoder@0000000001 not yet initialized
         //
         verifyException("com.graphhopper.routing.util.AbstractFlagEncoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DAType.MemRef dAType_MemRef0 = DAType.MemRef.MMAP;
      DAType dAType0 = new DAType(dAType_MemRef0, false, true, true);
      GHDirectory gHDirectory0 = new GHDirectory("). Use a bigger factor than ", dAType0);
      ArrayList<FlagEncoder> arrayList0 = new ArrayList<FlagEncoder>();
      EncodingManager encodingManager0 = EncodingManager.create((List<? extends FlagEncoder>) arrayList0);
      GraphHopperStorage graphHopperStorage0 = new GraphHopperStorage(gHDirectory0, encodingManager0, true, true, 231);
      // Undeclared exception!
      try { 
        LandmarkStorage.createPoint(graphHopperStorage0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
