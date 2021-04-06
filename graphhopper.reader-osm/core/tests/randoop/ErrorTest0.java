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
        com.graphhopper.routing.util.MountainBikeFlagEncoder mountainBikeFlagEncoder0 = new com.graphhopper.routing.util.MountainBikeFlagEncoder();
        org.junit.Assert.assertTrue("Contract failed: mountainBikeFlagEncoder0.equals(mountainBikeFlagEncoder0)", mountainBikeFlagEncoder0.equals(mountainBikeFlagEncoder0));
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
        int[] intArray0 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet1 = com.graphhopper.coll.GHIntHashSet.from(intArray0);
        int int2 = intHashSet1.size();
        boolean boolean4 = intHashSet1.remove((int) (short) -1);
        int int6 = intHashSet1.indexGet((int) (byte) 1);
        int int9 = intHashSet1.indexReplace((int) (short) 0, 200);
        org.junit.Assert.assertTrue("Contract failed: intHashSet1.equals(intHashSet1)", intHashSet1.equals(intHashSet1));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.graphhopper.routing.util.RacingBikeFlagEncoder racingBikeFlagEncoder0 = new com.graphhopper.routing.util.RacingBikeFlagEncoder();
        org.junit.Assert.assertTrue("Contract failed: racingBikeFlagEncoder0.equals(racingBikeFlagEncoder0)", racingBikeFlagEncoder0.equals(racingBikeFlagEncoder0));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.graphhopper.routing.util.BikeFlagEncoder bikeFlagEncoder0 = new com.graphhopper.routing.util.BikeFlagEncoder();
        org.junit.Assert.assertTrue("Contract failed: bikeFlagEncoder0.equals(bikeFlagEncoder0)", bikeFlagEncoder0.equals(bikeFlagEncoder0));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap0 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>();
        com.carrotsearch.hppc.IntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableIntObjectHashMap1 = strComparableGHIntObjectHashMap0.clone();
        int[] intArray2 = strComparableGHIntObjectHashMap0.keys;
        int int3 = strComparableGHIntObjectHashMap0.size();
        strComparableGHIntObjectHashMap0.indexInsert((-4), (int) '#', (java.lang.Comparable<java.lang.String>) "max_length");
        org.junit.Assert.assertTrue("Contract failed: strComparableGHIntObjectHashMap0.equals(strComparableGHIntObjectHashMap0)", strComparableGHIntObjectHashMap0.equals(strComparableGHIntObjectHashMap0));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser oSMFootNetworkTagParser0 = new com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser();
        com.graphhopper.routing.ev.SimpleBooleanEncodedValue simpleBooleanEncodedValue2 = new com.graphhopper.routing.ev.SimpleBooleanEncodedValue("srtm");
        com.graphhopper.storage.IntsRef intsRef5 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean6 = intsRef5.isEmpty();
        com.graphhopper.storage.IntsRef intsRef8 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int9 = intsRef5.compareTo(intsRef8);
        boolean boolean10 = intsRef5.isValid();
        boolean boolean11 = simpleBooleanEncodedValue2.getBool(true, intsRef5);
        com.graphhopper.reader.ReaderWay readerWay13 = new com.graphhopper.reader.ReaderWay((long) 0);
        com.graphhopper.storage.IntsRef intsRef16 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.graphhopper.storage.IntsRef intsRef17 = oSMFootNetworkTagParser0.handleWayTags(intsRef5, readerWay13, false, intsRef16);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.graphhopper.storage.NativeFSLockFactory nativeFSLockFactory0 = new com.graphhopper.storage.NativeFSLockFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeFSLockFactory0.forceRemove("name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}", false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        int[] intArray0 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet1 = com.graphhopper.coll.GHIntHashSet.from(intArray0);
        int int2 = intHashSet1.size();
        intHashSet1.clear();
        intHashSet1.indexInsert((-3), (int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: intHashSet1.equals(intHashSet1)", intHashSet1.equals(intHashSet1));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile1 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str2 = customProfile1.toString();
        com.graphhopper.config.Profile profile5 = customProfile1.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.util.PMap pMap6 = profile5.getHints();
        com.graphhopper.routing.util.HikeFlagEncoder hikeFlagEncoder7 = new com.graphhopper.routing.util.HikeFlagEncoder(pMap6);
        org.junit.Assert.assertTrue("Contract failed: hikeFlagEncoder7.equals(hikeFlagEncoder7)", hikeFlagEncoder7.equals(hikeFlagEncoder7));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile1 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str2 = customProfile1.toString();
        com.graphhopper.config.Profile profile5 = customProfile1.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.util.PMap pMap6 = profile5.getHints();
        com.graphhopper.routing.util.CarFlagEncoder carFlagEncoder7 = new com.graphhopper.routing.util.CarFlagEncoder(pMap6);
        org.junit.Assert.assertTrue("Contract failed: carFlagEncoder7.equals(carFlagEncoder7)", carFlagEncoder7.equals(carFlagEncoder7));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.graphhopper.storage.NodeAccess nodeAccess0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator2 = new com.graphhopper.routing.weighting.BeelineWeightApproximator(nodeAccess0, weighting1);
        com.graphhopper.util.DistanceCalcEarth distanceCalcEarth3 = new com.graphhopper.util.DistanceCalcEarth();
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator4 = beelineWeightApproximator2.setDistanceCalc((com.graphhopper.util.DistanceCalc) distanceCalcEarth3);
        com.graphhopper.util.shapes.GHPoint gHPoint9 = distanceCalcEarth3.projectCoordinate(1.0E-5d, (double) (short) 10, Double.POSITIVE_INFINITY, (double) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: gHPoint9.equals(gHPoint9)", gHPoint9.equals(gHPoint9));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.graphhopper.routing.util.Bike2WeightFlagEncoder bike2WeightFlagEncoder0 = new com.graphhopper.routing.util.Bike2WeightFlagEncoder();
        org.junit.Assert.assertTrue("Contract failed: bike2WeightFlagEncoder0.equals(bike2WeightFlagEncoder0)", bike2WeightFlagEncoder0.equals(bike2WeightFlagEncoder0));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile1 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str2 = customProfile1.toString();
        com.graphhopper.config.Profile profile5 = customProfile1.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.util.PMap pMap6 = profile5.getHints();
        com.graphhopper.routing.util.FootFlagEncoder footFlagEncoder7 = new com.graphhopper.routing.util.FootFlagEncoder(pMap6);
        org.junit.Assert.assertTrue("Contract failed: footFlagEncoder7.equals(footFlagEncoder7)", footFlagEncoder7.equals(footFlagEncoder7));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        int[] intArray2 = new int[] { 21, 10 };
        com.carrotsearch.hppc.IntHashSet intHashSet3 = com.graphhopper.coll.GHIntHashSet.from(intArray2);
        boolean boolean5 = intHashSet3.add((int) (byte) 0);
        int[] intArray6 = intHashSet3.keys;
        int int9 = intHashSet3.indexReplace((int) (byte) 0, 2);
        org.junit.Assert.assertTrue("Contract failed: intHashSet3.equals(intHashSet3)", intHashSet3.equals(intHashSet3));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.graphhopper.routing.util.CarFlagEncoder carFlagEncoder3 = new com.graphhopper.routing.util.CarFlagEncoder((int) (short) 0, (double) 4294967306L, 96);
        org.junit.Assert.assertTrue("Contract failed: carFlagEncoder3.equals(carFlagEncoder3)", carFlagEncoder3.equals(carFlagEncoder3));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.graphhopper.util.DistanceCalc3D distanceCalc3D0 = new com.graphhopper.util.DistanceCalc3D();
        double double7 = distanceCalc3D0.calcDist(1.0E-5d, (double) (short) 100, 4.0024076802712575E7d, (double) (byte) 100, (double) 100L, (double) (short) 10);
        com.graphhopper.util.shapes.GHPoint gHPoint12 = distanceCalc3D0.projectCoordinate((double) 21, (double) 32, Double.NaN, (double) 1048576);
        org.junit.Assert.assertTrue("Contract failed: gHPoint12.equals(gHPoint12)", gHPoint12.equals(gHPoint12));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.graphhopper.routing.util.EncodingManager.Builder builder0 = com.graphhopper.routing.util.EncodingManager.start();
        com.graphhopper.routing.util.EncodingManager.Builder builder1 = com.graphhopper.routing.util.EncodingManager.start();
        com.graphhopper.reader.osm.conditional.DateRangeParser dateRangeParser2 = new com.graphhopper.reader.osm.conditional.DateRangeParser();
        com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState conditionState4 = dateRangeParser2.checkCondition("3.0");
        com.graphhopper.routing.util.EncodingManager.Builder builder5 = builder1.setDateRangeParser(dateRangeParser2);
        com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser oSMFootNetworkTagParser6 = new com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser();
        com.graphhopper.routing.util.EncodingManager.Builder builder7 = builder1.addRelationTagParser((com.graphhopper.routing.util.parsers.RelationTagParser) oSMFootNetworkTagParser6);
        com.graphhopper.routing.util.EncodingManager.Builder builder8 = builder0.addRelationTagParser((com.graphhopper.routing.util.parsers.RelationTagParser) oSMFootNetworkTagParser6);
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue11 = new com.graphhopper.routing.ev.StringEncodedValue("bike_network", 10);
        com.graphhopper.storage.IntsRef intsRef14 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean15 = intsRef14.isEmpty();
        com.graphhopper.storage.IntsRef intsRef17 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int18 = intsRef14.compareTo(intsRef17);
        java.lang.String str19 = stringEncodedValue11.getString(false, intsRef17);
        com.graphhopper.reader.ReaderRelation readerRelation21 = new com.graphhopper.reader.ReaderRelation((long) 35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.graphhopper.storage.IntsRef intsRef22 = oSMFootNetworkTagParser6.handleRelationTags(intsRef17, readerRelation21);
    }
}

