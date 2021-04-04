import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        com.graphhopper.routing.util.CarFlagEncoder carFlagEncoder3 = new com.graphhopper.routing.util.CarFlagEncoder((int) (short) 1, 0.0d, (int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: carFlagEncoder3.equals(carFlagEncoder3)", carFlagEncoder3.equals(carFlagEncoder3));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.graphhopper.routing.util.FootFlagEncoder footFlagEncoder0 = new com.graphhopper.routing.util.FootFlagEncoder();
        org.junit.Assert.assertTrue("Contract failed: footFlagEncoder0.equals(footFlagEncoder0)", footFlagEncoder0.equals(footFlagEncoder0));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.graphhopper.routing.util.HikeFlagEncoder hikeFlagEncoder0 = new com.graphhopper.routing.util.HikeFlagEncoder();
        org.junit.Assert.assertTrue("Contract failed: hikeFlagEncoder0.equals(hikeFlagEncoder0)", hikeFlagEncoder0.equals(hikeFlagEncoder0));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.graphhopper.routing.util.CarFlagEncoder carFlagEncoder3 = new com.graphhopper.routing.util.CarFlagEncoder((int) (byte) 10, (double) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: carFlagEncoder3.equals(carFlagEncoder3)", carFlagEncoder3.equals(carFlagEncoder3));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        int[] intArray6 = new int[] { 100 };
        long[] longArray8 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap9 = com.carrotsearch.hppc.IntLongHashMap.from(intArray6, longArray8);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator10 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray11 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator10 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap12 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray6, edgeIteratorArray11);
        int[] intArray13 = com.graphhopper.util.ArrayUtil.merge(intArray1, intArray6);
        com.carrotsearch.hppc.IntHashSet intHashSet14 = com.graphhopper.coll.GHIntHashSet.from(intArray13);
        int int17 = intHashSet14.indexReplace(3, (int) 'a');
        org.junit.Assert.assertTrue("Contract failed: intHashSet14.equals(intHashSet14)", intHashSet14.equals(intHashSet14));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap0 = new com.graphhopper.coll.GHIntLongHashMap();
        long long3 = gHIntLongHashMap0.getOrDefault((int) (byte) 10, (long) '#');
        int[] intArray5 = new int[] { 100 };
        long[] longArray7 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap8 = com.carrotsearch.hppc.IntLongHashMap.from(intArray5, longArray7);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator9 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray10 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator9 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap11 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray5, edgeIteratorArray10);
        int[] intArray12 = edgeIteratorIntObjectHashMap11.keys;
        gHIntLongHashMap0.keys = intArray12;
        org.junit.Assert.assertTrue("Contract failed: gHIntLongHashMap0.equals(gHIntLongHashMap0)", gHIntLongHashMap0.equals(gHIntLongHashMap0));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.graphhopper.routing.util.BikeFlagEncoder bikeFlagEncoder0 = new com.graphhopper.routing.util.BikeFlagEncoder();
        org.junit.Assert.assertTrue("Contract failed: bikeFlagEncoder0.equals(bikeFlagEncoder0)", bikeFlagEncoder0.equals(bikeFlagEncoder0));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.graphhopper.routing.util.Bike2WeightFlagEncoder bike2WeightFlagEncoder0 = new com.graphhopper.routing.util.Bike2WeightFlagEncoder();
        org.junit.Assert.assertTrue("Contract failed: bike2WeightFlagEncoder0.equals(bike2WeightFlagEncoder0)", bike2WeightFlagEncoder0.equals(bike2WeightFlagEncoder0));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.graphhopper.routing.SPTEntry sPTEntry3 = new com.graphhopper.routing.SPTEntry(1, 1687814340, (double) 10);
        com.graphhopper.routing.SPTEntry sPTEntry4 = sPTEntry3.clone();
        com.graphhopper.routing.SPTEntry sPTEntry5 = sPTEntry4.clone();
        sPTEntry5.edge = (short) 1;
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on sPTEntry3 and sPTEntry4", (sPTEntry3.compareTo(sPTEntry4) == 0) == sPTEntry3.equals(sPTEntry4));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.graphhopper.routing.ch.AStarCHEntry aStarCHEntry3 = new com.graphhopper.routing.ch.AStarCHEntry((int) (byte) 100, (-6951166.6959488215d), (double) (byte) 1);
        com.graphhopper.routing.SPTEntry sPTEntry7 = new com.graphhopper.routing.SPTEntry(1, 1687814340, (double) 10);
        com.graphhopper.routing.SPTEntry sPTEntry8 = sPTEntry7.clone();
        com.graphhopper.routing.SPTEntry sPTEntry9 = sPTEntry8.clone();
        aStarCHEntry3.parent = sPTEntry9;
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on sPTEntry7 and sPTEntry8", (sPTEntry7.compareTo(sPTEntry8) == 0) == sPTEntry7.equals(sPTEntry8));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.graphhopper.routing.util.WheelchairFlagEncoder wheelchairFlagEncoder0 = new com.graphhopper.routing.util.WheelchairFlagEncoder();
        org.junit.Assert.assertTrue("Contract failed: wheelchairFlagEncoder0.equals(wheelchairFlagEncoder0)", wheelchairFlagEncoder0.equals(wheelchairFlagEncoder0));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.graphhopper.routing.util.RacingBikeFlagEncoder racingBikeFlagEncoder0 = new com.graphhopper.routing.util.RacingBikeFlagEncoder();
        org.junit.Assert.assertTrue("Contract failed: racingBikeFlagEncoder0.equals(racingBikeFlagEncoder0)", racingBikeFlagEncoder0.equals(racingBikeFlagEncoder0));
    }
}

