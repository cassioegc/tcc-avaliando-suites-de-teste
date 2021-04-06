import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.String str0 = com.graphhopper.util.Constants.OS_VERSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "5.4.0-70-generic" + "'", str0, "5.4.0-70-generic");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.graphhopper.storage.DAType dAType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.DAType dAType1 = new com.graphhopper.storage.DAType(dAType0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.String str1 = com.graphhopper.routing.ev.RouteNetwork.key("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_network" + "'", str1, "_network");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        boolean boolean0 = com.graphhopper.util.Constants.WINDOWS;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.lang.String str1 = com.graphhopper.routing.ev.TurnCost.key("_network");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_network$turn_cost" + "'", str1, "_network$turn_cost");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        boolean boolean0 = com.graphhopper.util.Constants.ANDROID;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.graphhopper.reader.osm.pbf.PbfStreamSplitter pbfStreamSplitter0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        com.graphhopper.reader.osm.pbf.Sink sink3 = null;
        com.graphhopper.reader.osm.pbf.PbfDecoder pbfDecoder4 = new com.graphhopper.reader.osm.pbf.PbfDecoder(pbfStreamSplitter0, executorService1, 0, sink3);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.graphhopper.util.EdgeExplorer edgeExplorer0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.RoutingCHEdgeIteratorImpl routingCHEdgeIteratorImpl2 = com.graphhopper.storage.RoutingCHEdgeIteratorImpl.inEdges(edgeExplorer0, weighting1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.graphhopper.routing.ev.RoadAccess roadAccess0 = com.graphhopper.routing.ev.RoadAccess.NO;
        org.junit.Assert.assertTrue("'" + roadAccess0 + "' != '" + com.graphhopper.routing.ev.RoadAccess.NO + "'", roadAccess0.equals(com.graphhopper.routing.ev.RoadAccess.NO));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.graphhopper.routing.util.FlagEncoder flagEncoder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.ShortFastestWeighting shortFastestWeighting2 = new com.graphhopper.routing.weighting.ShortFastestWeighting(flagEncoder0, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.graphhopper.util.GHUtility gHUtility0 = new com.graphhopper.util.GHUtility();
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.lang.String str0 = com.graphhopper.util.Constants.getMajorVersion();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "3.0" + "'", str0, "3.0");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.graphhopper.routing.util.EncodingManager.Access access0 = com.graphhopper.routing.util.EncodingManager.Access.OTHER;
        org.junit.Assert.assertTrue("'" + access0 + "' != '" + com.graphhopper.routing.util.EncodingManager.Access.OTHER + "'", access0.equals(com.graphhopper.routing.util.EncodingManager.Access.OTHER));
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        boolean boolean0 = com.graphhopper.util.Constants.LINUX;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.graphhopper.routing.ev.RoadClassLink roadClassLink0 = new com.graphhopper.routing.ev.RoadClassLink();
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.graphhopper.routing.ev.Surface surface0 = com.graphhopper.routing.ev.Surface.SAND;
        org.junit.Assert.assertTrue("'" + surface0 + "' != '" + com.graphhopper.routing.ev.Surface.SAND + "'", surface0.equals(com.graphhopper.routing.ev.Surface.SAND));
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.lang.String str0 = com.graphhopper.routing.ch.CHParameters.ORIGINAL_EDGE_COUNT_WEIGHT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "prepare.ch.node.original_edge_count_weight" + "'", str0, "prepare.ch.node.original_edge_count_weight");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.GraphHopperStorage graphHopperStorage1 = com.graphhopper.util.GHUtility.newStorage(graphHopperStorage0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.graphhopper.routing.ev.HazmatTunnel hazmatTunnel0 = com.graphhopper.routing.ev.HazmatTunnel.E;
        org.junit.Assert.assertTrue("'" + hazmatTunnel0 + "' != '" + com.graphhopper.routing.ev.HazmatTunnel.E + "'", hazmatTunnel0.equals(com.graphhopper.routing.ev.HazmatTunnel.E));
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        int int0 = com.graphhopper.reader.ReaderRelation.Member.WAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.graphhopper.routing.weighting.Weighting weighting0 = null;
        com.graphhopper.util.EdgeIteratorState edgeIteratorState1 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.graphhopper.util.GHUtility.calcWeightWithTurnWeight(weighting0, edgeIteratorState1, false, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.graphhopper.routing.ev.RoadEnvironment roadEnvironment0 = com.graphhopper.routing.ev.RoadEnvironment.FERRY;
        org.junit.Assert.assertTrue("'" + roadEnvironment0 + "' != '" + com.graphhopper.routing.ev.RoadEnvironment.FERRY + "'", roadEnvironment0.equals(com.graphhopper.routing.ev.RoadEnvironment.FERRY));
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.String str0 = com.graphhopper.routing.ch.CHParameters.LAST_LAZY_NODES_UPDATES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "prepare.ch.updates.lazy" + "'", str0, "prepare.ch.updates.lazy");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.graphhopper.reader.dem.ElevationInterpolator elevationInterpolator0 = new com.graphhopper.reader.dem.ElevationInterpolator();
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.DAType dAType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.DataAccess dataAccess4 = rAMDirectory1.find("hi!", dAType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.graphhopper.routing.AlternativeRouteCH.PotentialAlternativeInfo potentialAlternativeInfo0 = new com.graphhopper.routing.AlternativeRouteCH.PotentialAlternativeInfo();
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.lang.Cloneable[] cloneableArray0 = new java.lang.Cloneable[] {};
        int[] intArray5 = new int[] { (byte) 10, 10, 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.carrotsearch.hppc.ObjectIntHashMap<java.lang.Cloneable> cloneableObjectIntHashMap6 = com.carrotsearch.hppc.ObjectIntHashMap.from(cloneableArray0, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arrays of keys and values must have an identical length.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cloneableArray0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 0, 0]");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        int int0 = com.graphhopper.routing.weighting.Weighting.INFINITE_U_TURN_COSTS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        double double1 = com.graphhopper.routing.util.parsers.helpers.OSMValueExtractor.stringToKmh("");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.graphhopper.routing.util.EncodingManager.Access access0 = com.graphhopper.routing.util.EncodingManager.Access.FERRY;
        org.junit.Assert.assertTrue("'" + access0 + "' != '" + com.graphhopper.routing.util.EncodingManager.Access.FERRY + "'", access0.equals(com.graphhopper.routing.util.EncodingManager.Access.FERRY));
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.graphhopper.storage.IntsRef intsRef2 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState8 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef2, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = edgeIteratorState8.getReverse(stringEncodedValue9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorState8);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.shapes.Circle circle3 = new com.graphhopper.util.shapes.Circle((double) 1.0f, (double) (byte) 10, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Distance must not be zero or negative! -1.0 lat,lon:1.0,10.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.carrotsearch.hppc.IntArrayList intArrayList0 = null;
        com.carrotsearch.hppc.IntArrayList intArrayList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = com.graphhopper.util.ArrayUtil.calcSortOrder(intArrayList0, intArrayList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.graphhopper.util.JsonFeatureCollection[] jsonFeatureCollectionArray0 = new com.graphhopper.util.JsonFeatureCollection[] {};
        java.util.ArrayList<com.graphhopper.util.JsonFeatureCollection> jsonFeatureCollectionList1 = new java.util.ArrayList<com.graphhopper.util.JsonFeatureCollection>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.util.JsonFeatureCollection>) jsonFeatureCollectionList1, jsonFeatureCollectionArray0);
        com.graphhopper.routing.util.spatialrules.SpatialRuleFactory spatialRuleFactory4 = null;
        org.locationtech.jts.geom.Envelope envelope5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.spatialrules.SpatialRuleLookup spatialRuleLookup6 = com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder.buildIndex((java.util.List<com.graphhopper.util.JsonFeatureCollection>) jsonFeatureCollectionList1, "_network", spatialRuleFactory4, envelope5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFeatureCollectionArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.lang.String str0 = com.graphhopper.routing.util.FlagEncoderFactory.BIKE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bike" + "'", str0, "bike");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue3 = new com.graphhopper.routing.ev.StringEncodedValue("3.0", (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue name wasn't valid: 3.0. Use lower case letters, underscore and numbers only.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup2 = null;
        com.graphhopper.util.InstructionList instructionList3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.InstructionsFromEdges instructionsFromEdges4 = new com.graphhopper.routing.InstructionsFromEdges(graph0, weighting1, encodedValueLookup2, instructionList3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.graphhopper.storage.IntsRef intsRef2 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState8 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef2, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = intsRef2.getClass();
        org.junit.Assert.assertNotNull(edgeIteratorState8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState conditionState0 = com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.TRUE;
        org.junit.Assert.assertTrue("'" + conditionState0 + "' != '" + com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.TRUE + "'", conditionState0.equals(com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.TRUE));
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        double double0 = com.graphhopper.reader.dem.ElevationInterpolator.EPSILON;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0E-5d + "'", double0 == 1.0E-5d);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.graphhopper.storage.IntsRef intsRef2 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState8 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef2, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState10 = edgeIteratorState8.setName("_network$turn_cost");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorState8);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.EncodingManager encodingManager1 = com.graphhopper.routing.util.EncodingManager.create("secondary");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: entry in encoder list not supported secondary");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.lang.String str0 = com.graphhopper.routing.util.FlagEncoderFactory.FOOT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "foot" + "'", str0, "foot");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.graphhopper.reader.osm.pbf.PbfStreamSplitter pbfStreamSplitter0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        com.graphhopper.reader.osm.pbf.Sink sink3 = null;
        com.graphhopper.reader.osm.pbf.PbfDecoder pbfDecoder4 = new com.graphhopper.reader.osm.pbf.PbfDecoder(pbfStreamSplitter0, executorService1, (int) (byte) 10, sink3);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.graphhopper.reader.osm.conditional.DateRangeParser dateRangeParser0 = new com.graphhopper.reader.osm.conditional.DateRangeParser();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState conditionState2 = dateRangeParser0.checkCondition("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Passing empty Strings is not allowed");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.graphhopper.routing.ev.TrackType trackType0 = com.graphhopper.routing.ev.TrackType.GRADE4;
        org.junit.Assert.assertTrue("'" + trackType0 + "' != '" + com.graphhopper.routing.ev.TrackType.GRADE4 + "'", trackType0.equals(com.graphhopper.routing.ev.TrackType.GRADE4));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.lang.String str0 = com.graphhopper.routing.ev.HikeRating.KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hike_rating" + "'", str0, "hike_rating");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        int int0 = com.graphhopper.reader.ReaderElement.RELATION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.util.EdgeFilter edgeFilter1 = null;
        int[] intArray2 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet3 = com.graphhopper.coll.GHIntHashSet.from(intArray2);
        com.graphhopper.routing.weighting.TurnCostProvider turnCostProvider4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.subnetwork.EdgeBasedTarjanSCC.ConnectedComponents connectedComponents5 = com.graphhopper.routing.subnetwork.EdgeBasedTarjanSCC.findComponentsForStartEdges(graph0, edgeFilter1, (com.carrotsearch.hppc.IntContainer) intHashSet3, turnCostProvider4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intHashSet3);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        boolean boolean1 = com.graphhopper.routing.util.EncodingManager.isValidEncodedValue("secondary");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.routing.util.EncodingManager encodingManager3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage(directory2, encodingManager3, false, false, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodingManager needs to be non-null since 0.7. Create one using EncodingManager.create or EncodingManager.create(flagEncoderFactory, ghLocation)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.graphhopper.routing.ev.Surface surface0 = com.graphhopper.routing.ev.Surface.COBBLESTONE;
        org.junit.Assert.assertTrue("'" + surface0 + "' != '" + com.graphhopper.routing.ev.Surface.COBBLESTONE + "'", surface0.equals(com.graphhopper.routing.ev.Surface.COBBLESTONE));
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.graphhopper.util.PMap pMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.FootFlagEncoder footFlagEncoder1 = new com.graphhopper.routing.util.FootFlagEncoder(pMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        int int0 = com.graphhopper.reader.ReaderElement.WAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.graphhopper.routing.ev.TrackType trackType0 = com.graphhopper.routing.ev.TrackType.GRADE2;
        org.junit.Assert.assertTrue("'" + trackType0 + "' != '" + com.graphhopper.routing.ev.TrackType.GRADE2 + "'", trackType0.equals(com.graphhopper.routing.ev.TrackType.GRADE2));
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        int int2 = com.graphhopper.util.TranslationMap.countOccurence("5.4.0-70-generic", "3.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.lang.String str0 = com.graphhopper.routing.ch.CHParameters.SETTLED_EDGES_RESET_INTERVAL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "prepare.ch.edge.witness_search.reset_interval" + "'", str0, "prepare.ch.edge.witness_search.reset_interval");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.carrotsearch.hppc.HashOrderMixingStrategy hashOrderMixingStrategy2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap3 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>((int) (short) -1, (double) (byte) 0, hashOrderMixingStrategy2);
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.hppc.BufferAllocationException; message: The load factor should be in range [0.01, 0.99]: 0.000000");
        } catch (com.carrotsearch.hppc.BufferAllocationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph0 = null;
        com.graphhopper.util.PMap pMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ch.EdgeBasedWitnessPathSearcher edgeBasedWitnessPathSearcher2 = new com.graphhopper.routing.ch.EdgeBasedWitnessPathSearcher(cHPreparationGraph0, pMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        directory2.clear();
        org.junit.Assert.assertNotNull(directory2);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.graphhopper.routing.util.FlagEncoder flagEncoder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.FastestWeighting fastestWeighting1 = new com.graphhopper.routing.weighting.FastestWeighting(flagEncoder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.graphhopper.routing.ev.Toll toll0 = com.graphhopper.routing.ev.Toll.HGV;
        org.junit.Assert.assertTrue("'" + toll0 + "' != '" + com.graphhopper.routing.ev.Toll.HGV + "'", toll0.equals(com.graphhopper.routing.ev.Toll.HGV));
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.graphhopper.storage.RoutingCHGraph routingCHGraph0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.DijkstraBidirectionEdgeCHNoSOD dijkstraBidirectionEdgeCHNoSOD1 = new com.graphhopper.routing.DijkstraBidirectionEdgeCHNoSOD(routingCHGraph0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.graphhopper.routing.util.FlagEncoder flagEncoder0 = null;
        com.graphhopper.routing.weighting.TurnCostProvider turnCostProvider1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.ShortestWeighting shortestWeighting2 = new com.graphhopper.routing.weighting.ShortestWeighting(flagEncoder0, turnCostProvider1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        double double0 = com.graphhopper.routing.ev.MaxSpeed.UNSET_SPEED;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + Double.POSITIVE_INFINITY + "'", double0 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        int int0 = com.graphhopper.util.EdgeIterator.ANY_EDGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-2) + "'", int0 == (-2));
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.graphhopper.routing.ev.Surface surface0 = com.graphhopper.routing.ev.Surface.GROUND;
        org.junit.Assert.assertTrue("'" + surface0 + "' != '" + com.graphhopper.routing.ev.Surface.GROUND + "'", surface0.equals(com.graphhopper.routing.ev.Surface.GROUND));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.graphhopper.storage.IntsRef intsRef2 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState8 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef2, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState10 = edgeIteratorState8.detach(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorState8);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.graphhopper.routing.weighting.Weighting weighting0 = null;
        com.graphhopper.storage.IntsRef intsRef3 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState9 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef3, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int10 = edgeIteratorState9.getEdge();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = com.graphhopper.util.GHUtility.calcWeightWithTurnWeight(weighting0, edgeIteratorState9, true, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorState9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        javax.xml.stream.XMLStreamReader xMLStreamReader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.ReaderWay readerWay2 = com.graphhopper.reader.osm.OSMXMLHelper.createWay((long) 0, xMLStreamReader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.graphhopper.routing.ev.Surface surface0 = com.graphhopper.routing.ev.Surface.GRAVEL;
        org.junit.Assert.assertTrue("'" + surface0 + "' != '" + com.graphhopper.routing.ev.Surface.GRAVEL + "'", surface0.equals(com.graphhopper.routing.ev.Surface.GRAVEL));
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.util.EdgeFilter edgeFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.subnetwork.TarjanSCC.ConnectedComponents connectedComponents3 = com.graphhopper.routing.subnetwork.TarjanSCC.findComponentsRecursive(graph0, edgeFilter1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.lang.String str0 = com.graphhopper.routing.ev.BikeNetwork.KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bike_network" + "'", str0, "bike_network");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.custom.CustomProfile customProfile1 = new com.graphhopper.routing.weighting.custom.CustomProfile("prepare.ch.node.original_edge_count_weight");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Profile names may only contain lower case letters, numbers and underscores, given: prepare.ch.node.original_edge_count_weight");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.util.Random random1 = null;
        com.carrotsearch.hppc.IntArrayList intArrayList2 = com.graphhopper.util.ArrayUtil.permutation((int) (short) 1, random1);
        com.carrotsearch.hppc.IntArrayList intArrayList3 = com.graphhopper.util.ArrayUtil.invert(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            int int1 = disabledEdgeIterator0.getEdgeKey();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.graphhopper.routing.ev.RouteNetwork routeNetwork0 = com.graphhopper.routing.ev.RouteNetwork.REGIONAL;
        org.junit.Assert.assertTrue("'" + routeNetwork0 + "' != '" + com.graphhopper.routing.ev.RouteNetwork.REGIONAL + "'", routeNetwork0.equals(com.graphhopper.routing.ev.RouteNetwork.REGIONAL));
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.lang.String str0 = com.graphhopper.routing.util.FlagEncoderFactory.MOTORCYCLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "motorcycle" + "'", str0, "motorcycle");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.util.EncodingManager.Access> accessEnumEncodedValue1 = null;
        com.graphhopper.util.details.EnumDetails<com.graphhopper.routing.util.EncodingManager.Access> accessEnumDetails2 = new com.graphhopper.util.details.EnumDetails<com.graphhopper.routing.util.EncodingManager.Access>("", accessEnumEncodedValue1);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator3 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = accessEnumDetails2.isEdgeDifferentToLastEdge((com.graphhopper.util.EdgeIteratorState) disabledEdgeIterator3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.graphhopper.storage.Graph graph0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.graphhopper.util.GHUtility.getAdjNode(graph0, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState4 = disabledEdgeIterator0.set(stringEncodedValue1, "motorcycle", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.LITTLE;
        long long3 = bitUtil0.combineIntsToLong(10, (int) (byte) 1);
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            long long5 = bitUtil0.toLong(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4294967306L + "'", long3 == 4294967306L);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        javax.xml.stream.XMLStreamReader xMLStreamReader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.ReaderRelation readerRelation2 = com.graphhopper.reader.osm.OSMXMLHelper.createRelation((long) 100, xMLStreamReader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.lang.String str0 = com.graphhopper.routing.ch.CHParameters.SIGMA_FACTOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "prepare.ch.edge.witness_search.sigma_factor" + "'", str0, "prepare.ch.edge.witness_search.sigma_factor");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.graphhopper.routing.util.FlagEncoder flagEncoder0 = null;
        com.graphhopper.util.PMap pMap1 = null;
        com.graphhopper.routing.weighting.TurnCostProvider turnCostProvider2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.PriorityWeighting priorityWeighting3 = new com.graphhopper.routing.weighting.PriorityWeighting(flagEncoder0, pMap1, turnCostProvider2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.graphhopper.storage.IntsRef intsRef2 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState8 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef2, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue9 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.Country country11 = com.graphhopper.routing.ev.Country.find("....      ");
        com.graphhopper.routing.ev.Country country13 = com.graphhopper.routing.ev.Country.find("....      ");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState14 = edgeIteratorState8.set(countryEnumEncodedValue9, country11, country13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorState8);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue9);
        org.junit.Assert.assertTrue("'" + country11 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country11.equals(com.graphhopper.routing.ev.Country.DEFAULT));
        org.junit.Assert.assertTrue("'" + country13 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country13.equals(com.graphhopper.routing.ev.Country.DEFAULT));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue0 = null;
        com.graphhopper.routing.util.parsers.OSMMaxHeightParser oSMMaxHeightParser1 = new com.graphhopper.routing.util.parsers.OSMMaxHeightParser(decimalEncodedValue0);
        com.graphhopper.storage.IntsRef intsRef3 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean4 = intsRef3.isEmpty();
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int7 = intsRef3.compareTo(intsRef6);
        com.graphhopper.reader.ReaderWay readerWay8 = null;
        com.graphhopper.storage.IntsRef intsRef11 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean12 = intsRef11.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.IntsRef intsRef13 = oSMMaxHeightParser1.handleWayTags(intsRef3, readerWay8, false, intsRef11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.carrotsearch.hppc.HashOrderMixingStrategy hashOrderMixingStrategy2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap3 = new com.graphhopper.coll.GHLongLongHashMap((int) ' ', (double) (-2), hashOrderMixingStrategy2);
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.hppc.BufferAllocationException; message: The load factor should be in range [0.01, 0.99]: -2.000000");
        } catch (com.carrotsearch.hppc.BufferAllocationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.storage.DAType dAType3 = rAMDirectory1.getDefaultType();
        boolean boolean4 = dAType3.isStoring();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(dAType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        int int4 = com.graphhopper.util.GHUtility.createEdgeKey((-4), 1, (int) (byte) 10, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.graphhopper.routing.ev.Surface surface0 = com.graphhopper.routing.ev.Surface.COMPACTED;
        org.junit.Assert.assertTrue("'" + surface0 + "' != '" + com.graphhopper.routing.ev.Surface.COMPACTED + "'", surface0.equals(com.graphhopper.routing.ev.Surface.COMPACTED));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        int int1 = com.graphhopper.util.GHUtility.reverseEdgeKey(20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph0 = null;
        com.graphhopper.storage.Graph graph1 = null;
        com.graphhopper.routing.weighting.Weighting weighting2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ch.CHPreparationGraph.buildFromGraph(cHPreparationGraph0, graph1, weighting2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.graphhopper.config.Profile profile1 = new com.graphhopper.config.Profile("");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        int int0 = com.graphhopper.reader.ReaderElement.FILEHEADER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.lang.String str0 = com.graphhopper.routing.ev.HorseRating.KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "horse_rating" + "'", str0, "horse_rating");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap3 = new com.graphhopper.coll.OSMIDMap(directory2);
        com.graphhopper.search.StringIndex stringIndex5 = new com.graphhopper.search.StringIndex(directory2, 10);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = stringIndex5.add(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.lang.String str0 = com.graphhopper.routing.ev.FootNetwork.KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "foot_network" + "'", str0, "foot_network");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.graphhopper.storage.IntsRef intsRef2 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState8 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef2, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int9 = edgeIteratorState8.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue10 = com.graphhopper.routing.ev.Country.create();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = edgeIteratorState8.get((com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorState8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue10);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.graphhopper.util.PMap pMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.BikeFlagEncoder bikeFlagEncoder1 = new com.graphhopper.routing.util.BikeFlagEncoder(pMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.graphhopper.routing.ev.Surface surface0 = com.graphhopper.routing.ev.Surface.GRASS;
        org.junit.Assert.assertTrue("'" + surface0 + "' != '" + com.graphhopper.routing.ev.Surface.GRASS + "'", surface0.equals(com.graphhopper.routing.ev.Surface.GRASS));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.AStar.AStarEntry aStarEntry6 = new com.graphhopper.routing.AStar.AStarEntry((int) (short) 0, (int) (short) 10, (double) 20, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.Path path7 = com.graphhopper.routing.PathExtractor.extractPath(graph0, weighting1, (com.graphhopper.routing.SPTEntry) aStarEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.lang.Class<com.graphhopper.routing.ev.Country> countryClass1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue2 = new com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country>("secondary", countryClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.storage.RAMDirectory rAMDirectory4 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory5 = rAMDirectory4.create();
        com.graphhopper.storage.GHDirectory[] gHDirectoryArray6 = new com.graphhopper.storage.GHDirectory[] { rAMDirectory1, rAMDirectory4 };
        int[] intArray7 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet8 = com.graphhopper.coll.GHIntHashSet.from(intArray7);
        // The following exception was thrown during execution in test generation
        try {
            com.carrotsearch.hppc.ObjectIntHashMap<com.graphhopper.storage.GHDirectory> gHDirectoryObjectIntHashMap9 = com.carrotsearch.hppc.ObjectIntHashMap.from(gHDirectoryArray6, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arrays of keys and values must have an identical length.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(directory5);
        org.junit.Assert.assertNotNull(gHDirectoryArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intHashSet8);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.shapes.BBox bBox1 = com.graphhopper.util.shapes.BBox.parseBBoxString("prepare.ch.node.original_edge_count_weight");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: BBox should have 4 parts but was prepare.ch.node.original_edge_count_weight");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.graphhopper.routing.util.spatialrules.SpatialRuleLookupHelper spatialRuleLookupHelper0 = new com.graphhopper.routing.util.spatialrules.SpatialRuleLookupHelper();
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.storage.Graph graph1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.Graph graph2 = com.graphhopper.util.GHUtility.copyTo(graph0, graph1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue1 = com.graphhopper.routing.ev.Country.create();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = disabledEdgeIterator0.get((com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(countryEnumEncodedValue1);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.carrotsearch.hppc.HashOrderMixingStrategy hashOrderMixingStrategy2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap3 = new com.graphhopper.coll.GHLongLongHashMap((int) (short) 10, (double) (-1L), hashOrderMixingStrategy2);
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.hppc.BufferAllocationException; message: The load factor should be in range [0.01, 0.99]: -1.000000");
        } catch (com.carrotsearch.hppc.BufferAllocationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.graphhopper.routing.util.EdgeFilter edgeFilter0 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.RoadClass> roadClassEnumEncodedValue1 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.RoadEnvironment> roadEnvironmentEnumEncodedValue2 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "bike", "bike_network", "5.4.0-70-generic", "foot", "prepare.ch.edge.witness_search.reset_interval", "00001010000010100000101001100100", "prepare.ch.updates.lazy", "_network$turn_cost" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.SnapPreventionEdgeFilter snapPreventionEdgeFilter14 = new com.graphhopper.routing.util.SnapPreventionEdgeFilter(edgeFilter0, roadClassEnumEncodedValue1, roadEnvironmentEnumEncodedValue2, (java.util.List<java.lang.String>) strList12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot find snap_prevention: bike");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.graphhopper.routing.ev.IntEncodedValue intEncodedValue1 = null;
        com.graphhopper.util.details.IntDetails intDetails2 = new com.graphhopper.util.details.IntDetails("", intEncodedValue1);
        com.graphhopper.storage.IntsRef intsRef5 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState11 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef5, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int12 = edgeIteratorState11.getEdge();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = intDetails2.isEdgeDifferentToLastEdge(edgeIteratorState11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorState11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.graphhopper.storage.RoutingCHGraph routingCHGraph0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ch.EdgeBasedCHBidirPathExtractor edgeBasedCHBidirPathExtractor1 = new com.graphhopper.routing.ch.EdgeBasedCHBidirPathExtractor(routingCHGraph0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.LITTLE;
        com.graphhopper.util.BitUtil bitUtil1 = com.graphhopper.util.BitUtil.LITTLE;
        long long4 = bitUtil1.combineIntsToLong(10, (int) (byte) 1);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10 };
        java.lang.String str10 = bitUtil1.toBitString(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            bitUtil0.fromDouble(byteArray9, (double) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 42");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertNotNull(bitUtil1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4294967306L + "'", long4 == 4294967306L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 10, 10, 10]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00001010000010100000101001100100" + "'", str10, "00001010000010100000101001100100");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        byte[] byteArray1 = null;
        com.graphhopper.reader.osm.pbf.PbfBlobDecoderListener pbfBlobDecoderListener2 = null;
        com.graphhopper.reader.osm.pbf.PbfBlobDecoder pbfBlobDecoder3 = new com.graphhopper.reader.osm.pbf.PbfBlobDecoder("", byteArray1, pbfBlobDecoderListener2);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            int int1 = disabledEdgeIterator0.getBaseNode();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHLongHashSet gHLongHashSet2 = new com.graphhopper.coll.GHLongHashSet((int) (byte) 10, (double) ' ');
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.hppc.BufferAllocationException; message: The load factor should be in range [0.01, 0.99]: 32.000000");
        } catch (com.carrotsearch.hppc.BufferAllocationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.graphhopper.routing.util.FlagEncoder flagEncoder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.ShortFastestWeighting shortFastestWeighting2 = new com.graphhopper.routing.weighting.ShortFastestWeighting(flagEncoder0, (double) 4294967306L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.graphhopper.reader.dem.GraphElevationSmoothing graphElevationSmoothing0 = new com.graphhopper.reader.dem.GraphElevationSmoothing();
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.graphhopper.storage.CHGraph cHGraph0 = null;
        com.graphhopper.routing.util.EdgeFilter edgeFilter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.graphhopper.util.GHUtility.getNodeInfo(cHGraph0, (-1), edgeFilter2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.graphhopper.routing.ev.IntEncodedValue intEncodedValue1 = null;
        com.graphhopper.util.details.IntDetails intDetails2 = new com.graphhopper.util.details.IntDetails("", intEncodedValue1);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator3 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = intDetails2.isEdgeDifferentToLastEdge((com.graphhopper.util.EdgeIteratorState) disabledEdgeIterator3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.util.EncodingManager.Access> accessEnumEncodedValue1 = null;
        com.graphhopper.util.details.EnumDetails<com.graphhopper.routing.util.EncodingManager.Access> accessEnumDetails2 = new com.graphhopper.util.details.EnumDetails<com.graphhopper.routing.util.EncodingManager.Access>("_network$turn_cost", accessEnumEncodedValue1);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.graphhopper.routing.util.PriorityCode priorityCode0 = com.graphhopper.routing.util.PriorityCode.AVOID_AT_ALL_COSTS;
        org.junit.Assert.assertTrue("'" + priorityCode0 + "' != '" + com.graphhopper.routing.util.PriorityCode.AVOID_AT_ALL_COSTS + "'", priorityCode0.equals(com.graphhopper.routing.util.PriorityCode.AVOID_AT_ALL_COSTS));
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.graphhopper.util.PMap pMap0 = null;
        com.graphhopper.GraphHopperConfig graphHopperConfig1 = new com.graphhopper.GraphHopperConfig(pMap0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = graphHopperConfig1.getBool("5.4.0-70-generic", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.graphhopper.storage.IntsRef intsRef2 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState8 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef2, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue9 = com.graphhopper.routing.ev.Country.create();
        boolean boolean10 = countryEnumEncodedValue9.isStoreTwoDirections();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = edgeIteratorState8.get((com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorState8);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue1 = com.graphhopper.routing.ev.Country.create();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState3 = disabledEdgeIterator0.set((com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(countryEnumEncodedValue1);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.graphhopper.storage.VLongStorage vLongStorage0 = new com.graphhopper.storage.VLongStorage();
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue0 = com.graphhopper.routing.ev.Country.create();
        boolean boolean1 = countryEnumEncodedValue0.isStoreTwoDirections();
        com.graphhopper.routing.ev.EncodedValue.InitializerConfig initializerConfig2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = countryEnumEncodedValue0.init(initializerConfig2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(countryEnumEncodedValue0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.graphhopper.reader.dem.SRTMProvider sRTMProvider1 = new com.graphhopper.reader.dem.SRTMProvider("prepare.ch.updates.lazy");
        sRTMProvider1.setInterpolate(true);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.lang.String str0 = com.graphhopper.util.Constants.JVM_SPEC_VERSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "1.8" + "'", str0, "1.8");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.graphhopper.routing.ev.Toll toll0 = com.graphhopper.routing.ev.Toll.NO;
        org.junit.Assert.assertTrue("'" + toll0 + "' != '" + com.graphhopper.routing.ev.Toll.NO + "'", toll0.equals(com.graphhopper.routing.ev.Toll.NO));
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.graphhopper.util.ArrayUtil arrayUtil0 = new com.graphhopper.util.ArrayUtil();
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.lang.String str0 = com.graphhopper.routing.ch.CHParameters.LOG_MESSAGES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "prepare.ch.log_messages" + "'", str0, "prepare.ch.log_messages");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.graphhopper.reader.osm.conditional.DateRangeParser dateRangeParser0 = new com.graphhopper.reader.osm.conditional.DateRangeParser();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.osm.conditional.DateRange dateRange2 = dateRangeParser0.getRange("prepare.ch.edge.witness_search.sigma_factor");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparsable date: \"prepare.ch.edge.witness_search.sigma_factor\"");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("prepare.ch.node.original_edge_count_weight");
        // The following exception was thrown during execution in test generation
        try {
// flaky:             dataAccess5.setInt(0L, (int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.graphhopper.routing.ev.Surface surface0 = com.graphhopper.routing.ev.Surface.UNPAVED;
        org.junit.Assert.assertTrue("'" + surface0 + "' != '" + com.graphhopper.routing.ev.Surface.UNPAVED + "'", surface0.equals(com.graphhopper.routing.ev.Surface.UNPAVED));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap1 = new com.graphhopper.coll.GHLongLongHashMap(1);
        java.util.Spliterator<com.carrotsearch.hppc.cursors.LongLongCursor> longLongCursorSpliterator2 = gHLongLongHashMap1.spliterator();
        gHLongLongHashMap1.ensureCapacity((int) (byte) 10);
        com.carrotsearch.hppc.LongLongAssociativeContainer longLongAssociativeContainer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = gHLongLongHashMap1.putAll(longLongAssociativeContainer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longLongCursorSpliterator2);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            double double1 = disabledEdgeIterator0.getDistance();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.graphhopper.routing.ev.RoadEnvironment roadEnvironment0 = com.graphhopper.routing.ev.RoadEnvironment.ROAD;
        org.junit.Assert.assertTrue("'" + roadEnvironment0 + "' != '" + com.graphhopper.routing.ev.RoadEnvironment.ROAD + "'", roadEnvironment0.equals(com.graphhopper.routing.ev.RoadEnvironment.ROAD));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue0 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.storage.IntsRef intsRef3 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean4 = intsRef3.isEmpty();
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int7 = intsRef3.compareTo(intsRef6);
        boolean boolean9 = intsRef6.equals((java.lang.Object) (short) 0);
        boolean boolean10 = intsRef6.isValid();
        // The following exception was thrown during execution in test generation
        try {
            countryEnumEncodedValue0.setInt(false, intsRef6, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: EncodedValue country not initialized");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(countryEnumEncodedValue0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap0 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>();
        com.carrotsearch.hppc.IntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableIntObjectHashMap1 = strComparableGHIntObjectHashMap0.clone();
        int[] intArray2 = strComparableGHIntObjectHashMap0.keys;
        int int3 = strComparableGHIntObjectHashMap0.size();
        org.junit.Assert.assertNotNull(strComparableIntObjectHashMap1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.graphhopper.routing.ev.RoadClass roadClass1 = com.graphhopper.routing.ev.RoadClass.find("");
        org.junit.Assert.assertTrue("'" + roadClass1 + "' != '" + com.graphhopper.routing.ev.RoadClass.OTHER + "'", roadClass1.equals(com.graphhopper.routing.ev.RoadClass.OTHER));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.graphhopper.reader.dem.SkadiProvider skadiProvider1 = new com.graphhopper.reader.dem.SkadiProvider("horse_rating");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.lang.String str0 = com.graphhopper.util.Constants.BUILD_DATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "2021-04-05T00:25:56Z" + "'", str0, "2021-04-05T00:25:56Z");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.lang.String str0 = com.graphhopper.routing.ch.CHParameters.PERIODIC_UPDATES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "prepare.ch.updates.periodic" + "'", str0, "prepare.ch.updates.periodic");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.graphhopper.routing.util.FlagEncoder flagEncoder0 = null;
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup1 = null;
        com.graphhopper.routing.weighting.TurnCostProvider turnCostProvider2 = null;
        com.graphhopper.util.CustomModel customModel3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.custom.CustomWeighting customWeighting4 = com.graphhopper.routing.weighting.custom.CustomModelParser.createWeighting(flagEncoder0, encodedValueLookup1, turnCostProvider2, customModel3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: CustomModel cannot be null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl0 = new com.graphhopper.coll.GHBitSetImpl();
        java.lang.String str1 = gHBitSetImpl0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.locationtech.jts.algorithm.RectangleLineIntersector rectangleLineIntersector0 = null;
        com.graphhopper.util.PointList pointList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = com.graphhopper.util.shapes.BBox.intersects(rectangleLineIntersector0, pointList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.DataAccess dataAccess7 = rAMDirectory1.find("bike_network");
        // The following exception was thrown during execution in test generation
        try {
// flaky:             dataAccess7.setShort((long) (byte) -1, (short) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
        org.junit.Assert.assertNotNull(dataAccess7);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.lang.String str0 = com.graphhopper.routing.ev.MaxLength.KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "max_length" + "'", str0, "max_length");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap0 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>();
        strComparableGHIntObjectHashMap0.ensureCapacity((int) (short) 0);
        boolean boolean4 = false; // flaky: strComparableGHIntObjectHashMap0.indexExists((int) ' ');
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableGHIntObjectHashMap0.put((int) (byte) 100, strComparable6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(strComparable7);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.graphhopper.util.details.DistanceDetails distanceDetails0 = new com.graphhopper.util.details.DistanceDetails();
        java.util.Map.Entry<java.lang.String, java.util.List<com.graphhopper.util.details.PathDetail>> strEntry1 = distanceDetails0.build();
        org.junit.Assert.assertNotNull(strEntry1);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        int[] intArray0 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet1 = com.graphhopper.coll.GHIntHashSet.from(intArray0);
        int int2 = intHashSet1.size();
        boolean boolean4 = intHashSet1.remove((int) (short) -1);
        com.carrotsearch.hppc.predicates.IntPredicate intPredicate5 = null;
        int int6 = intHashSet1.removeAll(intPredicate5);
        java.lang.String str8 = intHashSet1.visualizeKeyDistribution((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intHashSet1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "....                                                                                                " + "'", str8, "....                                                                                                ");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl1 = new com.graphhopper.coll.GHBitSetImpl((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.BitSet bitSet4 = gHBitSetImpl1.get((int) (byte) 100, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex: 100 > toIndex: 20");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.FetchMode fetchMode1 = com.graphhopper.util.FetchMode.ALL;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.PointList pointList2 = disabledEdgeIterator0.fetchWayGeometry(fetchMode1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + fetchMode1 + "' != '" + com.graphhopper.util.FetchMode.ALL + "'", fetchMode1.equals(com.graphhopper.util.FetchMode.ALL));
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState2 = disabledEdgeIterator0.setName("bike");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser0 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser();
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        int int4 = com.graphhopper.util.GHUtility.createEdgeKey(0, 20, (int) (short) 100, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue0 = null;
        com.graphhopper.routing.util.parsers.OSMMaxWeightParser oSMMaxWeightParser1 = new com.graphhopper.routing.util.parsers.OSMMaxWeightParser(decimalEncodedValue0);
        com.graphhopper.storage.IntsRef intsRef3 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean4 = intsRef3.isEmpty();
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int7 = intsRef3.compareTo(intsRef6);
        boolean boolean9 = intsRef6.equals((java.lang.Object) (short) 0);
        boolean boolean10 = intsRef6.isValid();
        com.graphhopper.reader.ReaderWay readerWay11 = null;
        com.graphhopper.storage.IntsRef intsRef14 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean15 = intsRef14.isEmpty();
        com.graphhopper.storage.IntsRef intsRef17 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int18 = intsRef14.compareTo(intsRef17);
        boolean boolean20 = intsRef17.equals((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.IntsRef intsRef21 = oSMMaxWeightParser1.handleWayTags(intsRef6, readerWay11, false, intsRef17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.graphhopper.storage.DAType dAType0 = com.graphhopper.storage.DAType.RAM_INT_STORE;
        boolean boolean1 = dAType0.isAllowWrites();
        org.junit.Assert.assertNotNull(dAType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.graphhopper.storage.index.Snap[] snapArray0 = new com.graphhopper.storage.index.Snap[] {};
        java.util.ArrayList<com.graphhopper.storage.index.Snap> snapList1 = new java.util.ArrayList<com.graphhopper.storage.index.Snap>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.storage.index.Snap>) snapList1, snapArray0);
        com.graphhopper.routing.FlexiblePathCalculator flexiblePathCalculator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.RoundTripRouting.Result result4 = com.graphhopper.routing.RoundTripRouting.calcPaths((java.util.List<com.graphhopper.storage.index.Snap>) snapList1, flexiblePathCalculator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(snapArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.graphhopper.routing.ev.TrackType trackType0 = com.graphhopper.routing.ev.TrackType.GRADE3;
        org.junit.Assert.assertTrue("'" + trackType0 + "' != '" + com.graphhopper.routing.ev.TrackType.GRADE3 + "'", trackType0.equals(com.graphhopper.routing.ev.TrackType.GRADE3));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.graphhopper.routing.util.FlagEncoder flagEncoder2 = null;
        com.graphhopper.util.EdgeIteratorState[] edgeIteratorStateArray3 = new com.graphhopper.util.EdgeIteratorState[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.GHUtility.setSpeed(Double.NaN, (double) 100L, flagEncoder2, edgeIteratorStateArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorStateArray3);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.graphhopper.reader.osm.conditional.DateRangeParser dateRangeParser0 = new com.graphhopper.reader.osm.conditional.DateRangeParser();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.osm.conditional.DateRange dateRange2 = dateRangeParser0.getRange("prepare.ch.updates.lazy");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparsable date: \"prepare.ch.updates.lazy\"");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.util.FiniteWeightFilter finiteWeightFilter2 = new com.graphhopper.routing.util.FiniteWeightFilter(weighting1);
        com.graphhopper.routing.weighting.TurnCostProvider turnCostProvider3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.subnetwork.EdgeBasedTarjanSCC.ConnectedComponents connectedComponents5 = com.graphhopper.routing.subnetwork.EdgeBasedTarjanSCC.findComponents(graph0, (com.graphhopper.routing.util.EdgeFilter) finiteWeightFilter2, turnCostProvider3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.DataAccess dataAccess7 = rAMDirectory1.find("bike_network");
        // The following exception was thrown during execution in test generation
        try {
// flaky:             dataAccess7.setInt((long) (byte) 100, (int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
        org.junit.Assert.assertNotNull(dataAccess7);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.LITTLE;
        com.graphhopper.util.BitUtil bitUtil1 = com.graphhopper.util.BitUtil.LITTLE;
        long long4 = bitUtil1.combineIntsToLong(10, (int) (byte) 1);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10 };
        java.lang.String str10 = bitUtil1.toBitString(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            bitUtil0.fromInt(byteArray9, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertNotNull(bitUtil1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4294967306L + "'", long4 == 4294967306L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 10, 10, 10]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00001010000010100000101001100100" + "'", str10, "00001010000010100000101001100100");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions2 = new com.graphhopper.routing.AlgorithmOptions("", weighting1);
        java.lang.String str3 = algorithmOptions2.getAlgorithm();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.Weighting weighting4 = algorithmOptions2.getWeighting();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Option 'weighting' must NOT be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.graphhopper.routing.ev.MtbRating mtbRating0 = new com.graphhopper.routing.ev.MtbRating();
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl1 = new com.graphhopper.coll.GHBitSetImpl((int) (short) 100);
        java.lang.String str2 = gHBitSetImpl1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{}" + "'", str2, "{}");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.graphhopper.reader.OSMTurnRelation.Type type0 = com.graphhopper.reader.OSMTurnRelation.Type.ONLY;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + com.graphhopper.reader.OSMTurnRelation.Type.ONLY + "'", type0.equals(com.graphhopper.reader.OSMTurnRelation.Type.ONLY));
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.graphhopper.routing.Path path0 = null;
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup1 = null;
        com.graphhopper.routing.weighting.Weighting weighting2 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "secondary", "3.0", "hi!", "horse_rating", "secondary", "....      ", "prepare.ch.node.original_edge_count_weight", "hike_rating", "srtm", "00001010000010100000101001100100", "2021-04-05T00:25:56Z", "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}", "hi!", "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}", "_network", "prepare.ch.edge.witness_search.reset_interval", "....      ", "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}", "3.0", "prepare.ch.edge.witness_search.sigma_factor", "prepare.ch.updates.lazy", "prepare.ch.updates.lazy", "00001010000010100000101001100100", "prepare.ch.edge.witness_search.reset_interval", "horse_rating", "00001010000010100000101001100100", "00001010000010100000101001100100", "srtm", "....                                                                                                " };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        com.graphhopper.util.details.PathDetailsBuilderFactory pathDetailsBuilderFactory35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.util.List<com.graphhopper.util.details.PathDetail>> strMap37 = com.graphhopper.util.details.PathDetailsFromEdges.calcDetails(path0, encodedValueLookup1, weighting2, (java.util.List<java.lang.String>) strList33, pathDetailsBuilderFactory35, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.graphhopper.util.shapes.BBox bBox1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.geohash.SpatialKeyAlgo spatialKeyAlgo2 = new com.graphhopper.geohash.SpatialKeyAlgo((int) (byte) 100, bBox1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: allBits is too big for this implementation");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.graphhopper.reader.dem.MultiSourceElevationProvider multiSourceElevationProvider0 = new com.graphhopper.reader.dem.MultiSourceElevationProvider();
        java.lang.String str1 = multiSourceElevationProvider0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "multi" + "'", str1, "multi");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.graphhopper.routing.util.FlagEncoder flagEncoder2 = null;
        com.graphhopper.storage.IntsRef intsRef5 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState11 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef5, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int12 = edgeIteratorState11.getAdjNode();
        com.graphhopper.storage.IntsRef intsRef15 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState21 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef15, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int22 = edgeIteratorState21.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue23 = com.graphhopper.routing.ev.Country.create();
        boolean boolean24 = countryEnumEncodedValue23.isStoreTwoDirections();
        com.graphhopper.routing.ev.Country country25 = edgeIteratorState21.getReverse(countryEnumEncodedValue23);
        com.graphhopper.storage.IntsRef intsRef28 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState34 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef28, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator35 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.storage.IntsRef intsRef38 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState44 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef38, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int45 = edgeIteratorState44.getAdjNode();
        com.graphhopper.util.EdgeIteratorState[] edgeIteratorStateArray46 = new com.graphhopper.util.EdgeIteratorState[] { edgeIteratorState11, edgeIteratorState21, edgeIteratorState34, disabledEdgeIterator35, edgeIteratorState44 };
        java.util.ArrayList<com.graphhopper.util.EdgeIteratorState> edgeIteratorStateList47 = new java.util.ArrayList<com.graphhopper.util.EdgeIteratorState>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.util.EdgeIteratorState>) edgeIteratorStateList47, edgeIteratorStateArray46);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.GHUtility.setSpeed((double) 1.0f, (double) 0.0f, flagEncoder2, (java.util.Collection<com.graphhopper.util.EdgeIteratorState>) edgeIteratorStateList47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorState11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(edgeIteratorState21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + country25 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country25.equals(com.graphhopper.routing.ev.Country.DEFAULT));
        org.junit.Assert.assertNotNull(edgeIteratorState34);
        org.junit.Assert.assertNotNull(edgeIteratorState44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(edgeIteratorStateArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.util.TraversalMode traversalMode2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.Dijkstra dijkstra3 = new com.graphhopper.routing.Dijkstra(graph0, weighting1, traversalMode2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState2 = disabledEdgeIterator0.setDistance((double) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.graphhopper.storage.index.Snap.Position position0 = com.graphhopper.storage.index.Snap.Position.EDGE;
        org.junit.Assert.assertTrue("'" + position0 + "' != '" + com.graphhopper.storage.index.Snap.Position.EDGE + "'", position0.equals(com.graphhopper.storage.index.Snap.Position.EDGE));
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.graphhopper.routing.util.EncodingManager encodingManager0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.GraphBuilder graphBuilder1 = new com.graphhopper.storage.GraphBuilder(encodingManager0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.graphhopper.routing.ch.AStarCHEntry aStarCHEntry5 = new com.graphhopper.routing.ch.AStarCHEntry((int) (short) 1, (int) (short) 10, (int) (short) -1, (double) 4294967306L, (double) (byte) 100);
        aStarCHEntry5.weight = 2;
        java.lang.String str8 = aStarCHEntry5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 (1) weight: 2.0, incEdge: 10" + "'", str8, "-1 (1) weight: 2.0, incEdge: 10");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        double double1 = com.graphhopper.routing.util.parsers.helpers.OSMValueExtractor.stringToTons("bike");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.graphhopper.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "prepare.ch.updates.periodic", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue2 = new com.graphhopper.routing.ev.StringEncodedValue("2021-04-05T00:25:56Z", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue name wasn't valid: 2021-04-05T00:25:56Z. Use lower case letters, underscore and numbers only.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.lang.Class<java.lang.Enum<com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType>> parseTypeEnumClass1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.EnumEncodedValue<java.lang.Enum<com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType>> parseTypeEnumEnumEncodedValue3 = new com.graphhopper.routing.ev.EnumEncodedValue<java.lang.Enum<com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType>>("max_length", parseTypeEnumClass1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.graphhopper.routing.ViaRouting viaRouting0 = new com.graphhopper.routing.ViaRouting();
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.LITTLE;
        byte[] byteArray2 = bitUtil0.fromBitString("bike");
        byte[] byteArray3 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bitUtil0.toLong(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-16]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.graphhopper.routing.AStar.AStarEntry aStarEntry4 = new com.graphhopper.routing.AStar.AStarEntry((int) (short) 0, (int) (short) 10, (double) 20, (double) (-1));
        double double5 = aStarEntry4.getWeightOfVisitedPath();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap0 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>();
        int[] intArray1 = strComparableGHIntObjectHashMap0.keys;
        com.carrotsearch.hppc.IntObjectHashMap<java.lang.Comparable<java.lang.String>>.KeysContainer keysContainer2 = strComparableGHIntObjectHashMap0.keys();
        java.lang.String str4 = strComparableGHIntObjectHashMap0.visualizeKeyDistribution(2);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(keysContainer2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".." + "'", str4, "..");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.graphhopper.storage.IntsRef intsRef2 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState8 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef2, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int9 = edgeIteratorState8.getAdjNode();
        com.graphhopper.storage.IntsRef intsRef12 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState18 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef12, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState19 = edgeIteratorState8.copyPropertiesFrom(edgeIteratorState18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorState8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(edgeIteratorState18);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.graphhopper.storage.IntsRef intsRef2 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState8 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef2, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int9 = edgeIteratorState8.getEdge();
        int int10 = edgeIteratorState8.getEdge();
        org.junit.Assert.assertNotNull(edgeIteratorState8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.graphhopper.routing.ev.MtbRating mtbRating0 = new com.graphhopper.routing.ev.MtbRating();
        com.graphhopper.routing.ev.MtbRating mtbRating1 = new com.graphhopper.routing.ev.MtbRating();
        com.graphhopper.routing.ev.MtbRating mtbRating2 = new com.graphhopper.routing.ev.MtbRating();
        com.graphhopper.routing.ev.MtbRating mtbRating3 = new com.graphhopper.routing.ev.MtbRating();
        com.graphhopper.routing.ev.MtbRating mtbRating4 = new com.graphhopper.routing.ev.MtbRating();
        com.graphhopper.routing.ev.MtbRating[] mtbRatingArray5 = new com.graphhopper.routing.ev.MtbRating[] { mtbRating0, mtbRating1, mtbRating2, mtbRating3, mtbRating4 };
        com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap6 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>();
        int[] intArray7 = strComparableGHIntObjectHashMap6.keys;
        // The following exception was thrown during execution in test generation
        try {
            com.carrotsearch.hppc.ObjectIntHashMap<com.graphhopper.routing.ev.MtbRating> mtbRatingObjectIntHashMap8 = com.carrotsearch.hppc.ObjectIntHashMap.from(mtbRatingArray5, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arrays of keys and values must have an identical length.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mtbRatingArray5);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.graphhopper.routing.ev.HikeRating hikeRating0 = new com.graphhopper.routing.ev.HikeRating();
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.lang.String str0 = com.graphhopper.util.Constants.JAVA_VENDOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Oracle Corporation" + "'", str0, "Oracle Corporation");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        long[] longArray5 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet6 = com.carrotsearch.hppc.LongHashSet.from(longArray5);
        com.carrotsearch.hppc.predicates.LongPredicate longPredicate7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = longHashSet6.removeAll(longPredicate7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet6);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.graphhopper.routing.ev.Surface surface1 = com.graphhopper.routing.ev.Surface.find("prepare.ch.node.original_edge_count_weight");
        org.junit.Assert.assertTrue("'" + surface1 + "' != '" + com.graphhopper.routing.ev.Surface.OTHER + "'", surface1.equals(com.graphhopper.routing.ev.Surface.OTHER));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.graphhopper.routing.ev.RoadAccess roadAccess0 = com.graphhopper.routing.ev.RoadAccess.FORESTRY;
        org.junit.Assert.assertTrue("'" + roadAccess0 + "' != '" + com.graphhopper.routing.ev.RoadAccess.FORESTRY + "'", roadAccess0.equals(com.graphhopper.routing.ev.RoadAccess.FORESTRY));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray0 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager1 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray0);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.FlagEncoder flagEncoder3 = encodingManager1.getEncoder("bike");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Encoder for bike not found. Existing: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(flagEncoderArray0);
        org.junit.Assert.assertNotNull(encodingManager1);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        int[] intArray0 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet1 = com.graphhopper.coll.GHIntHashSet.from(intArray0);
        int int2 = intHashSet1.size();
        boolean boolean4 = intHashSet1.remove((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = 0; // flaky: intHashSet1.indexReplace((int) (byte) 100, (int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intHashSet1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.graphhopper.routing.util.spatialrules.SpatialRuleFactory spatialRuleFactory0 = com.graphhopper.routing.util.spatialrules.SpatialRuleFactory.EMPTY;
        org.junit.Assert.assertNotNull(spatialRuleFactory0);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph2 = com.graphhopper.routing.ch.CHPreparationGraph.nodeBased((int) ' ', 0);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ch.PrepareGraphEdgeExplorer prepareGraphEdgeExplorer3 = cHPreparationGraph2.createOutEdgeExplorer();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: You need to call prepareForContraction() before calling this method");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cHPreparationGraph2);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap3 = new com.graphhopper.coll.OSMIDMap(directory2);
        com.graphhopper.search.StringIndex stringIndex5 = new com.graphhopper.search.StringIndex(directory2, 10);
        boolean boolean6 = stringIndex5.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap8 = null; // flaky: stringIndex5.getAll(52L);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory6 = rAMDirectory1.create();
        com.graphhopper.storage.DAType dAType8 = com.graphhopper.storage.DAType.RAM;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.Directory directory9 = rAMDirectory1.put("Oracle Corporation", dAType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Since 0.7 DataAccess objects does no longer accept upper case names");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
        org.junit.Assert.assertNotNull(directory6);
        org.junit.Assert.assertNotNull(dAType8);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.graphhopper.routing.ev.RoadEnvironment roadEnvironment0 = com.graphhopper.routing.ev.RoadEnvironment.BRIDGE;
        org.junit.Assert.assertTrue("'" + roadEnvironment0 + "' != '" + com.graphhopper.routing.ev.RoadEnvironment.BRIDGE + "'", roadEnvironment0.equals(com.graphhopper.routing.ev.RoadEnvironment.BRIDGE));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.graphhopper.util.FetchMode fetchMode0 = com.graphhopper.util.FetchMode.PILLAR_AND_ADJ;
        org.junit.Assert.assertTrue("'" + fetchMode0 + "' != '" + com.graphhopper.util.FetchMode.PILLAR_AND_ADJ + "'", fetchMode0.equals(com.graphhopper.util.FetchMode.PILLAR_AND_ADJ));
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.graphhopper.routing.ch.ShortcutFilter shortcutFilter0 = com.graphhopper.routing.ch.ShortcutFilter.allEdges();
        boolean boolean1 = shortcutFilter0.fwd;
        org.junit.Assert.assertNotNull(shortcutFilter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.graphhopper.storage.DAType dAType0 = com.graphhopper.storage.DAType.RAM_STORE;
        org.junit.Assert.assertNotNull(dAType0);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.graphhopper.routing.ev.HazmatTunnel hazmatTunnel0 = com.graphhopper.routing.ev.HazmatTunnel.C;
        org.junit.Assert.assertTrue("'" + hazmatTunnel0 + "' != '" + com.graphhopper.routing.ev.HazmatTunnel.C + "'", hazmatTunnel0.equals(com.graphhopper.routing.ev.HazmatTunnel.C));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        com.graphhopper.storage.IntsRef intsRef12 = virtualEdgeIteratorState11.getFlags();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intsRef12);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph2 = com.graphhopper.routing.ch.CHPreparationGraph.nodeBased((int) ' ', 0);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ch.PrepareGraphOrigEdgeExplorer prepareGraphOrigEdgeExplorer3 = cHPreparationGraph2.createOutOrigEdgeExplorer();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: You need to call prepareForContraction() before calling this method");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cHPreparationGraph2);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.EncodingManager encodingManager2 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderFactory0, "prepare.ch.updates.lazy");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.osm.conditional.DateRangeParser dateRangeParser1 = com.graphhopper.reader.osm.conditional.DateRangeParser.createInstance("5.4.0-70-generic");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.text.ParseException: Unparseable date: \"5.4.0-70-generic\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.lang.String str0 = com.graphhopper.util.Constants.JAVA_VERSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "1.8.0_251" + "'", str0, "1.8.0_251");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.lang.String str0 = com.graphhopper.util.Constants.getVersions();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "5,17,4,4,5,7" + "'", str0, "5,17,4,4,5,7");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.graphhopper.util.PMap pMap0 = null;
        com.graphhopper.GraphHopperConfig graphHopperConfig1 = new com.graphhopper.GraphHopperConfig(pMap0);
        // The following exception was thrown during execution in test generation
        try {
            float float4 = graphHopperConfig1.getFloat("....      ", (float) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap0 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>();
        int[] intArray1 = strComparableGHIntObjectHashMap0.keys;
        com.carrotsearch.hppc.IntObjectHashMap<java.lang.Comparable<java.lang.String>>.KeysContainer keysContainer2 = strComparableGHIntObjectHashMap0.keys();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             strComparableGHIntObjectHashMap0.indexInsert((int) ' ', (-4), (java.lang.Comparable<java.lang.String>) "hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(keysContainer2);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        javax.xml.stream.XMLStreamReader xMLStreamReader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.ReaderWay readerWay2 = com.graphhopper.reader.osm.OSMXMLHelper.createWay(0L, xMLStreamReader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap2 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>(4, (double) 'a');
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.hppc.BufferAllocationException; message: The load factor should be in range [0.01, 0.99]: 97.000000");
        } catch (com.carrotsearch.hppc.BufferAllocationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState conditionState0 = com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.INVALID;
        org.junit.Assert.assertTrue("'" + conditionState0 + "' != '" + com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.INVALID + "'", conditionState0.equals(com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.INVALID));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        com.graphhopper.storage.IntsRef intsRef14 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState20 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef14, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int21 = edgeIteratorState20.getEdge();
        virtualEdgeIteratorState11.setReverseEdge(edgeIteratorState20);
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = virtualEdgeIteratorState11.getReverse(stringEncodedValue23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.graphhopper.coll.GHSortedCollection gHSortedCollection0 = new com.graphhopper.coll.GHSortedCollection();
        int int1 = gHSortedCollection0.getSlidingMeanValue();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = gHSortedCollection0.peekKey();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: collection is already empty!?");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions2 = new com.graphhopper.routing.AlgorithmOptions("", weighting1);
        java.lang.String str3 = algorithmOptions2.getAlgorithm();
        boolean boolean4 = algorithmOptions2.hasWeighting();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.Weighting weighting5 = algorithmOptions2.getWeighting();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Option 'weighting' must NOT be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.config.Profile profile1 = new com.graphhopper.config.Profile("-1 (1) weight: 2.0, incEdge: 10");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Profile names may only contain lower case letters, numbers and underscores, given: -1 (1) weight: 2.0, incEdge: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        int int0 = com.graphhopper.util.Constants.VERSION_NODE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.storage.RAMDirectory rAMDirectory2 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory3 = rAMDirectory2.create();
        java.nio.ByteOrder byteOrder4 = rAMDirectory2.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess6 = rAMDirectory2.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory7 = rAMDirectory2.create();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.index.LocationIndexTree locationIndexTree8 = new com.graphhopper.storage.index.LocationIndexTree(graph0, (com.graphhopper.storage.Directory) rAMDirectory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertNotNull(dataAccess6);
        org.junit.Assert.assertNotNull(directory7);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.locationtech.jts.geom.Polygon[] polygonArray0 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList1 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList1, polygonArray0);
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule3 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList1);
        org.junit.Assert.assertNotNull(polygonArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.graphhopper.util.EdgeExplorer edgeExplorer0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.ch.ShortcutFilter shortcutFilter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.RoutingCHEdgeIteratorImpl routingCHEdgeIteratorImpl3 = new com.graphhopper.storage.RoutingCHEdgeIteratorImpl(edgeExplorer0, weighting1, shortcutFilter2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.graphhopper.routing.ev.RouteNetwork routeNetwork1 = com.graphhopper.routing.ev.RouteNetwork.find("1.8");
        org.junit.Assert.assertTrue("'" + routeNetwork1 + "' != '" + com.graphhopper.routing.ev.RouteNetwork.MISSING + "'", routeNetwork1.equals(com.graphhopper.routing.ev.RouteNetwork.MISSING));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        com.graphhopper.storage.IntsRef intsRef14 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState20 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef14, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int21 = edgeIteratorState20.getEdge();
        virtualEdgeIteratorState11.setReverseEdge(edgeIteratorState20);
        com.graphhopper.storage.IntsRef intsRef25 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState31 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef25, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int32 = edgeIteratorState31.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue33 = com.graphhopper.routing.ev.Country.create();
        boolean boolean34 = countryEnumEncodedValue33.isStoreTwoDirections();
        com.graphhopper.routing.ev.Country country35 = edgeIteratorState31.getReverse(countryEnumEncodedValue33);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = edgeIteratorState20.get((com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue33);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(edgeIteratorState31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + country35 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country35.equals(com.graphhopper.routing.ev.Country.DEFAULT));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager5, false);
        com.graphhopper.routing.weighting.Weighting weighting8 = null;
        com.graphhopper.routing.util.TraversalMode traversalMode9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.AStar aStar10 = new com.graphhopper.routing.AStar((com.graphhopper.storage.Graph) graphHopperStorage7, weighting8, traversalMode9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(flagEncoderArray4);
        org.junit.Assert.assertNotNull(encodingManager5);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.lang.String[] strArray29 = new java.lang.String[] { "prepare.ch.node.original_edge_count_weight", "_network$turn_cost", "....      ", "Oracle Corporation", "[0 0 0 0 0 0 0 0 0 0]", "foot", "prepare.ch.node.original_edge_count_weight", "....      ", "prepare.ch.log_messages", "-1 (1) weight: 2.0, incEdge: 10", "....      ", "5.4.0-70-generic", "[0 0 0 0 0 0 0 0 0 0]", "_network$turn_cost", "[0 0 0 0 0 0 0 0 0 0]", "srtm", "-1 (1) weight: 2.0, incEdge: 10", "1.8", "2021-04-05T00:25:56Z", "....      ", "B", "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}", "max_length", "[0 0 0 0 0 0 0 0 0 0]", "foot_network", "1.8", "5,17,4,4,5,7" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue33 = new com.graphhopper.routing.ev.StringEncodedValue("-1 (1) weight: 2.0, incEdge: 10", (int) '#', (java.util.List<java.lang.String>) strList30, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue name wasn't valid: -1 (1) weight: 2.0, incEdge: 10. Use lower case letters, underscore and numbers only.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.graphhopper.routing.ev.IntEncodedValue intEncodedValue1 = null;
        com.graphhopper.util.details.IntDetails intDetails2 = new com.graphhopper.util.details.IntDetails("", intEncodedValue1);
        intDetails2.endInterval(100);
        com.graphhopper.storage.IntsRef intsRef11 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean12 = intsRef11.isEmpty();
        com.graphhopper.util.PointList pointList14 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState16 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef11, "hike_rating", pointList14, false);
        com.graphhopper.storage.IntsRef intsRef19 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState25 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef19, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int26 = edgeIteratorState25.getEdge();
        virtualEdgeIteratorState16.setReverseEdge(edgeIteratorState25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = intDetails2.isEdgeDifferentToLastEdge((com.graphhopper.util.EdgeIteratorState) virtualEdgeIteratorState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Toll> tollEnumEncodedValue0 = null;
        com.graphhopper.routing.util.parsers.OSMTollParser oSMTollParser1 = new com.graphhopper.routing.util.parsers.OSMTollParser(tollEnumEncodedValue0);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.carrotsearch.hppc.HashOrderMixingStrategy hashOrderMixingStrategy2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHLongHashSet gHLongHashSet3 = new com.graphhopper.coll.GHLongHashSet(100, (double) (-4), hashOrderMixingStrategy2);
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.hppc.BufferAllocationException; message: The load factor should be in range [0.01, 0.99]: -4.000000");
        } catch (com.carrotsearch.hppc.BufferAllocationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        double double1 = com.graphhopper.routing.util.parsers.helpers.OSMValueExtractor.stringToMeter("srtm");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        com.graphhopper.storage.IntsRef intsRef14 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState20 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef14, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int21 = edgeIteratorState20.getEdge();
        virtualEdgeIteratorState11.setReverseEdge(edgeIteratorState20);
        com.graphhopper.storage.IntsRef intsRef25 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState31 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef25, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int32 = edgeIteratorState31.getAdjNode();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState33 = virtualEdgeIteratorState11.copyPropertiesFrom(edgeIteratorState31);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Not supported.");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(edgeIteratorState31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("prepare.ch.node.original_edge_count_weight");
        int int6 = dataAccess5.getSegmentSize();
        com.graphhopper.util.BitUtil bitUtil8 = com.graphhopper.util.BitUtil.LITTLE;
        byte[] byteArray10 = bitUtil8.fromBitString("bike");
        // The following exception was thrown during execution in test generation
        try {
// flaky:             dataAccess5.setBytes((long) 0, byteArray10, (int) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1048576 + "'", int6 == 1048576);
        org.junit.Assert.assertNotNull(bitUtil8);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-16]");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.graphhopper.routing.ev.RoadClass roadClass0 = com.graphhopper.routing.ev.RoadClass.FOOTWAY;
        org.junit.Assert.assertTrue("'" + roadClass0 + "' != '" + com.graphhopper.routing.ev.RoadClass.FOOTWAY + "'", roadClass0.equals(com.graphhopper.routing.ev.RoadClass.FOOTWAY));
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.graphhopper.storage.NativeFSLockFactory nativeFSLockFactory0 = new com.graphhopper.storage.NativeFSLockFactory();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.GHLock gHLock3 = nativeFSLockFactory0.create("1.8.0_251", true);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Set lockDir before creating write locks");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory0 = null;
        com.graphhopper.routing.util.EncodingManager encodingManager2 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderFactory0, "");
        org.junit.Assert.assertNotNull(encodingManager2);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.lang.String str0 = com.graphhopper.routing.util.FlagEncoderFactory.HIKE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hike" + "'", str0, "hike");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue12 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState14 = virtualEdgeIteratorState11.set(decimalEncodedValue12, Double.POSITIVE_INFINITY);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Call init before usage for EncodedValue max_axle_load|version=-1916217613|bits=7|index=0|shift=-1|store_both_directions=false");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(decimalEncodedValue12);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap1 = new com.graphhopper.coll.GHLongLongHashMap(1);
        java.lang.String str3 = gHLongLongHashMap1.visualizeKeyDistribution((int) (byte) 10);
        java.util.Spliterator<com.carrotsearch.hppc.cursors.LongLongCursor> longLongCursorSpliterator4 = gHLongLongHashMap1.spliterator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "....      " + "'", str3, "....      ");
        org.junit.Assert.assertNotNull(longLongCursorSpliterator4);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = disabledEdgeIterator0.getReverse(stringEncodedValue1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.LITTLE;
        byte[] byteArray2 = bitUtil0.fromBitString("bike");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = bitUtil0.toLastBitString(100L, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-16]");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = com.graphhopper.reader.osm.OSMReaderUtility.parseDuration("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot parse duration tag value: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.storage.IntsRef intsRef3 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState9 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef3, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int10 = edgeIteratorState9.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue11 = com.graphhopper.routing.ev.Country.create();
        boolean boolean12 = countryEnumEncodedValue11.isStoreTwoDirections();
        com.graphhopper.routing.ev.Country country13 = edgeIteratorState9.getReverse(countryEnumEncodedValue11);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState16 = disabledEdgeIterator0.set((com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue11, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorState9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + country13 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country13.equals(com.graphhopper.routing.ev.Country.DEFAULT));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray0 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager1 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray0);
        com.graphhopper.util.shapes.GHPoint[] gHPointArray2 = new com.graphhopper.util.shapes.GHPoint[] {};
        java.util.ArrayList<com.graphhopper.util.shapes.GHPoint> gHPointList3 = new java.util.ArrayList<com.graphhopper.util.shapes.GHPoint>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.util.shapes.GHPoint>) gHPointList3, gHPointArray2);
        com.graphhopper.routing.weighting.Weighting weighting5 = null;
        com.graphhopper.storage.index.LocationIndex locationIndex6 = null;
        java.util.Calendar calendar7 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "_network$turn_cost", "", "", "5.4.0-70-generic", "bike_network", "3.0", "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}", "prepare.ch.edge.witness_search.sigma_factor", "3.0" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "bike", "prepare.ch.edge.witness_search.reset_interval", "_network", "prepare.ch.edge.witness_search.sigma_factor", "foot", "srtm", "_network$turn_cost", "prepare.ch.node.original_edge_count_weight", "foot_network", "foot_network", "prepare.ch.log_messages", "3.0", "", "secondary", "secondary", "hi!", "00001010000010100000101001100100", "1.8", "bike", "prepare.ch.edge.witness_search.sigma_factor", "hike_rating", "prepare.ch.edge.witness_search.reset_interval" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        java.lang.String[] strArray64 = new java.lang.String[] { "3.0", "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}", "prepare.ch.updates.lazy", "secondary", "foot", "srtm", "foot", "bike_network", "foot_network", "prepare.ch.log_messages", "", "00001010000010100000101001100100", "hi!", "prepare.ch.node.original_edge_count_weight", "1.8", "_network$turn_cost", "5.4.0-70-generic", "horse_rating" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        com.graphhopper.reader.osm.conditional.ConditionalOSMTagInspector conditionalOSMTagInspector67 = new com.graphhopper.reader.osm.conditional.ConditionalOSMTagInspector(calendar7, (java.util.List<java.lang.String>) strList18, (java.util.Set<java.lang.String>) strSet44, (java.util.Set<java.lang.String>) strSet65);
        java.lang.String[] strArray73 = new java.lang.String[] { "prepare.ch.node.original_edge_count_weight", "foot", "prepare.ch.node.original_edge_count_weight/", "", "prepare.ch.edge.witness_search.reset_interval" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.graphhopper.storage.index.Snap> snapList76 = com.graphhopper.routing.ViaRouting.lookup((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager1, (java.util.List<com.graphhopper.util.shapes.GHPoint>) gHPointList3, weighting5, locationIndex6, (java.util.List<java.lang.String>) strList18, (java.util.List<java.lang.String>) strList74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least 2 points have to be specified, but was:0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(flagEncoderArray0);
        org.junit.Assert.assertNotNull(encodingManager1);
        org.junit.Assert.assertNotNull(gHPointArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.graphhopper.util.shapes.BBox bBox4 = new com.graphhopper.util.shapes.BBox((double) 0L, (double) (short) 0, (double) (byte) 1, 100.0d);
        java.util.List<java.lang.Double> doubleList5 = bBox4.toGeoJson();
        org.junit.Assert.assertNotNull(doubleList5);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState14 = virtualEdgeIteratorState11.setReverse(booleanEncodedValue12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap2 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>((int) (short) 100, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.hppc.BufferAllocationException; message: The load factor should be in range [0.01, 0.99]: 10.000000");
        } catch (com.carrotsearch.hppc.BufferAllocationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap0 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>();
        strComparableGHIntObjectHashMap0.ensureCapacity((int) (short) 0);
        boolean boolean4 = false; // flaky: strComparableGHIntObjectHashMap0.indexExists((int) ' ');
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableGHIntObjectHashMap0.put(1, (java.lang.Comparable<java.lang.String>) "prepare.ch.edge.witness_search.reset_interval");
// flaky:         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(strComparable7);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.graphhopper.storage.IntsRef intsRef1 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.reader.ReaderWay readerWay2 = null;
        com.graphhopper.storage.IntsRef intsRef5 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState11 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef5, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue12 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        double double13 = edgeIteratorState11.getReverse(decimalEncodedValue12);
        java.util.Calendar calendar14 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "_network$turn_cost", "", "", "5.4.0-70-generic", "bike_network", "3.0", "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}", "prepare.ch.edge.witness_search.sigma_factor", "3.0" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.lang.String[] strArray50 = new java.lang.String[] { "", "bike", "prepare.ch.edge.witness_search.reset_interval", "_network", "prepare.ch.edge.witness_search.sigma_factor", "foot", "srtm", "_network$turn_cost", "prepare.ch.node.original_edge_count_weight", "foot_network", "foot_network", "prepare.ch.log_messages", "3.0", "", "secondary", "secondary", "hi!", "00001010000010100000101001100100", "1.8", "bike", "prepare.ch.edge.witness_search.sigma_factor", "hike_rating", "prepare.ch.edge.witness_search.reset_interval" };
        java.util.LinkedHashSet<java.lang.String> strSet51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
        java.lang.String[] strArray71 = new java.lang.String[] { "3.0", "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}", "prepare.ch.updates.lazy", "secondary", "foot", "srtm", "foot", "bike_network", "foot_network", "prepare.ch.log_messages", "", "00001010000010100000101001100100", "hi!", "prepare.ch.node.original_edge_count_weight", "1.8", "_network$turn_cost", "5.4.0-70-generic", "horse_rating" };
        java.util.LinkedHashSet<java.lang.String> strSet72 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet72, strArray71);
        com.graphhopper.reader.osm.conditional.ConditionalOSMTagInspector conditionalOSMTagInspector74 = new com.graphhopper.reader.osm.conditional.ConditionalOSMTagInspector(calendar14, (java.util.List<java.lang.String>) strList25, (java.util.Set<java.lang.String>) strSet51, (java.util.Set<java.lang.String>) strSet72);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.parsers.helpers.OSMValueExtractor.extractMeter(intsRef1, readerWay2, decimalEncodedValue12, (java.util.List<java.lang.String>) strList25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorState11);
        org.junit.Assert.assertNotNull(decimalEncodedValue12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        double double0 = com.graphhopper.util.DistanceCalcEarth.C;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 4.003017359204114E7d + "'", double0 == 4.003017359204114E7d);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.graphhopper.storage.NodeAccess nodeAccess2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = com.graphhopper.util.GHUtility.getDistance((-2), 21, nodeAccess2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.graphhopper.routing.util.FlagEncoder flagEncoder0 = null;
        com.graphhopper.routing.ch.CHRoutingAlgorithmFactory cHRoutingAlgorithmFactory1 = null;
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile3 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str4 = customProfile3.toString();
        com.graphhopper.config.Profile profile7 = customProfile3.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.util.PMap pMap8 = profile7.getHints();
        com.graphhopper.routing.CHPathCalculator cHPathCalculator9 = new com.graphhopper.routing.CHPathCalculator(cHRoutingAlgorithmFactory1, pMap8);
        com.graphhopper.routing.weighting.TurnCostProvider turnCostProvider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.ShortFastestWeighting shortFastestWeighting11 = new com.graphhopper.routing.weighting.ShortFastestWeighting(flagEncoder0, pMap8, turnCostProvider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str4, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile7);
        org.junit.Assert.assertNotNull(pMap8);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.storage.DAType dAType3 = rAMDirectory1.getDefaultType();
        com.graphhopper.storage.RAMDirectory rAMDirectory6 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory7 = rAMDirectory6.create();
        com.graphhopper.storage.DAType dAType8 = rAMDirectory6.getDefaultType();
        com.graphhopper.storage.Directory directory9 = rAMDirectory1.put("foot", dAType8);
        long[] longArray15 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet16 = com.carrotsearch.hppc.LongHashSet.from(longArray15);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray17 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager18 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray17);
        com.graphhopper.storage.GraphBuilder graphBuilder19 = new com.graphhopper.storage.GraphBuilder(encodingManager18);
        boolean boolean20 = longHashSet16.equals((java.lang.Object) encodingManager18);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage24 = new com.graphhopper.storage.GraphHopperStorage(directory9, encodingManager18, false, false, (-2));
        com.graphhopper.routing.weighting.Weighting weighting26 = null;
        com.graphhopper.routing.util.FiniteWeightFilter finiteWeightFilter27 = new com.graphhopper.routing.util.FiniteWeightFilter(weighting26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = null; // flaky: com.graphhopper.util.GHUtility.getNodeInfo((com.graphhopper.storage.Graph) graphHopperStorage24, (int) ' ', (com.graphhopper.routing.util.EdgeFilter) finiteWeightFilter27);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(dAType3);
        org.junit.Assert.assertNotNull(directory7);
        org.junit.Assert.assertNotNull(dAType8);
        org.junit.Assert.assertNotNull(directory9);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet16);
        org.junit.Assert.assertNotNull(flagEncoderArray17);
        org.junit.Assert.assertNotNull(encodingManager18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.ReaderRelation.Member member1 = com.graphhopper.reader.osm.OSMXMLHelper.createMember(xMLStreamReader0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.graphhopper.storage.CHGraph cHGraph0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.CHEdgeIteratorState cHEdgeIteratorState3 = com.graphhopper.util.GHUtility.getEdge(cHGraph0, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.graphhopper.util.DistanceCalcEarth distanceCalcEarth0 = new com.graphhopper.util.DistanceCalcEarth();
        double double7 = distanceCalcEarth0.calcDist3D((double) 'a', (double) (short) 1, (double) (byte) -1, (double) 100.0f, (double) (short) 100, (double) (short) 1);
        double double9 = distanceCalcEarth0.calcCircumference((double) 1);
        double double11 = distanceCalcEarth0.calcNormalizedDist((double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.shapes.BBox bBox15 = distanceCalcEarth0.createBBox(1.0d, Double.NaN, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Distance must not be zero or negative! 0.0 lat,lon:1.0,NaN");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1451566.8463946683d + "'", double7 == 1451566.8463946683d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0024076802712575E7d + "'", double9 == 4.0024076802712575E7d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 6.159206975860352E-11d + "'", double11 == 6.159206975860352E-11d);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.graphhopper.reader.dem.MultiSourceElevationProvider multiSourceElevationProvider0 = new com.graphhopper.reader.dem.MultiSourceElevationProvider();
        double double3 = multiSourceElevationProvider0.getEle((double) 0.0f, 0.0d);
        double double6 = multiSourceElevationProvider0.getEle(1.0E-5d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.graphhopper.routing.util.FlagEncoder flagEncoder2 = null;
        com.graphhopper.storage.IntsRef intsRef9 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean10 = intsRef9.isEmpty();
        com.graphhopper.util.PointList pointList12 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState14 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef9, "hike_rating", pointList12, false);
        com.graphhopper.storage.IntsRef intsRef21 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean22 = intsRef21.isEmpty();
        com.graphhopper.util.PointList pointList24 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState26 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef21, "hike_rating", pointList24, false);
        com.graphhopper.storage.IntsRef intsRef29 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState35 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef29, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int36 = edgeIteratorState35.getEdge();
        virtualEdgeIteratorState26.setReverseEdge(edgeIteratorState35);
        com.graphhopper.storage.IntsRef intsRef44 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean45 = intsRef44.isEmpty();
        com.graphhopper.util.PointList pointList47 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState49 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef44, "hike_rating", pointList47, false);
        com.graphhopper.storage.IntsRef intsRef50 = virtualEdgeIteratorState49.getFlags();
        com.graphhopper.storage.IntsRef intsRef53 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState59 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef53, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue60 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        double double61 = edgeIteratorState59.getReverse(decimalEncodedValue60);
        int int62 = edgeIteratorState59.getAdjNode();
        com.graphhopper.storage.IntsRef intsRef69 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean70 = intsRef69.isEmpty();
        com.graphhopper.util.PointList pointList72 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState74 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef69, "hike_rating", pointList72, false);
        virtualEdgeIteratorState74.setUnfavored(true);
        int int77 = virtualEdgeIteratorState74.getOriginalEdgeKey();
        com.graphhopper.util.EdgeIteratorState[] edgeIteratorStateArray78 = new com.graphhopper.util.EdgeIteratorState[] { virtualEdgeIteratorState14, virtualEdgeIteratorState26, virtualEdgeIteratorState49, edgeIteratorState59, virtualEdgeIteratorState74 };
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.GHUtility.setSpeed((double) (-1.0f), (double) (short) 0, flagEncoder2, edgeIteratorStateArray78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Speed must be positive but wasn't! fwdSpeed:-1.0, bwdSpeed:0.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(intsRef50);
        org.junit.Assert.assertNotNull(edgeIteratorState59);
        org.junit.Assert.assertNotNull(decimalEncodedValue60);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + Double.POSITIVE_INFINITY + "'", double61 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1048576 + "'", int77 == 1048576);
        org.junit.Assert.assertNotNull(edgeIteratorStateArray78);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.graphhopper.reader.osm.OSMFileHeader oSMFileHeader0 = new com.graphhopper.reader.osm.OSMFileHeader();
        java.lang.String[] strArray4 = new java.lang.String[] { "2021-04-05T00:25:56Z", "3.0" };
        boolean boolean5 = oSMFileHeader0.hasTag("{}", strArray4);
        java.lang.String str7 = oSMFileHeader0.getTag("2021-04-05T00:25:56Z");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.graphhopper.reader.osm.conditional.DateRangeParser dateRangeParser0 = new com.graphhopper.reader.osm.conditional.DateRangeParser();
        com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState conditionState2 = dateRangeParser0.checkCondition("3.0");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState conditionState4 = dateRangeParser0.checkCondition("Oracle Corporation");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparsable date: \"Oracle Corporation\"");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + conditionState2 + "' != '" + com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.FALSE + "'", conditionState2.equals(com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.FALSE));
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager5, false);
        com.graphhopper.storage.CHGraph cHGraph9 = graphHopperStorage7.getCHGraph("bike_network");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState12 = graphHopperStorage7.edge(100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: The graph has not yet been initialized.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(flagEncoderArray4);
        org.junit.Assert.assertNotNull(encodingManager5);
        org.junit.Assert.assertNull(cHGraph9);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage0 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.RoadEnvironment> roadEnvironmentEnumEncodedValue1 = null;
        com.graphhopper.routing.ev.RoadEnvironment roadEnvironment2 = com.graphhopper.routing.ev.RoadEnvironment.TUNNEL;
        com.graphhopper.reader.dem.EdgeElevationInterpolator edgeElevationInterpolator3 = new com.graphhopper.reader.dem.EdgeElevationInterpolator(graphHopperStorage0, roadEnvironmentEnumEncodedValue1, roadEnvironment2);
        // The following exception was thrown during execution in test generation
        try {
            edgeElevationInterpolator3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + roadEnvironment2 + "' != '" + com.graphhopper.routing.ev.RoadEnvironment.TUNNEL + "'", roadEnvironment2.equals(com.graphhopper.routing.ev.RoadEnvironment.TUNNEL));
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        int[] intArray0 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet1 = com.graphhopper.coll.GHIntHashSet.from(intArray0);
        int int2 = intHashSet1.size();
        com.carrotsearch.hppc.predicates.IntPredicate intPredicate3 = null;
        int int4 = intHashSet1.retainAll(intPredicate3);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intHashSet1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.graphhopper.routing.ev.RoadClass roadClass1 = com.graphhopper.routing.ev.RoadClass.find("prepare.ch.log_messages");
        org.junit.Assert.assertTrue("'" + roadClass1 + "' != '" + com.graphhopper.routing.ev.RoadClass.OTHER + "'", roadClass1.equals(com.graphhopper.routing.ev.RoadClass.OTHER));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.graphhopper.storage.RAMDirectory rAMDirectory2 = new com.graphhopper.storage.RAMDirectory("bike", true);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.graphhopper.util.PMap pMap0 = null;
        com.graphhopper.GraphHopperConfig graphHopperConfig1 = new com.graphhopper.GraphHopperConfig(pMap0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = graphHopperConfig1.getInt("2021-04-05T00:25:56Z", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.graphhopper.routing.util.FlagEncoder flagEncoder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.ShortFastestWeighting shortFastestWeighting2 = new com.graphhopper.routing.weighting.ShortFastestWeighting(flagEncoder0, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.util.Calendar calendar2 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "_network$turn_cost", "", "", "5.4.0-70-generic", "bike_network", "3.0", "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}", "prepare.ch.edge.witness_search.sigma_factor", "3.0" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "bike", "prepare.ch.edge.witness_search.reset_interval", "_network", "prepare.ch.edge.witness_search.sigma_factor", "foot", "srtm", "_network$turn_cost", "prepare.ch.node.original_edge_count_weight", "foot_network", "foot_network", "prepare.ch.log_messages", "3.0", "", "secondary", "secondary", "hi!", "00001010000010100000101001100100", "1.8", "bike", "prepare.ch.edge.witness_search.sigma_factor", "hike_rating", "prepare.ch.edge.witness_search.reset_interval" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        java.lang.String[] strArray59 = new java.lang.String[] { "3.0", "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}", "prepare.ch.updates.lazy", "secondary", "foot", "srtm", "foot", "bike_network", "foot_network", "prepare.ch.log_messages", "", "00001010000010100000101001100100", "hi!", "prepare.ch.node.original_edge_count_weight", "1.8", "_network$turn_cost", "5.4.0-70-generic", "horse_rating" };
        java.util.LinkedHashSet<java.lang.String> strSet60 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet60, strArray59);
        com.graphhopper.reader.osm.conditional.ConditionalOSMTagInspector conditionalOSMTagInspector62 = new com.graphhopper.reader.osm.conditional.ConditionalOSMTagInspector(calendar2, (java.util.List<java.lang.String>) strList13, (java.util.Set<java.lang.String>) strSet39, (java.util.Set<java.lang.String>) strSet60);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.parsers.OSMTurnRelationParser oSMTurnRelationParser63 = new com.graphhopper.routing.util.parsers.OSMTurnRelationParser("multi", (int) (byte) 0, (java.util.List<java.lang.String>) strList13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: multi$turn_cost: bits cannot be zero or negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.graphhopper.reader.dem.MultiSourceElevationProvider multiSourceElevationProvider0 = new com.graphhopper.reader.dem.MultiSourceElevationProvider();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.dem.ElevationProvider elevationProvider2 = multiSourceElevationProvider0.setBaseURL("-1 (1) weight: 2.0, incEdge: 10");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The base url must consist of two urls separated by a ';'. The first for cgiar, the second for gmted");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl0 = new com.graphhopper.coll.GHBitSetImpl();
        com.graphhopper.coll.GHTBitSet gHTBitSet2 = new com.graphhopper.coll.GHTBitSet(0);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl4 = new com.graphhopper.coll.GHBitSetImpl((int) (short) 100);
        com.graphhopper.coll.GHBitSet gHBitSet5 = gHTBitSet2.copyTo((com.graphhopper.coll.GHBitSet) gHBitSetImpl4);
        com.graphhopper.coll.GHBitSet gHBitSet6 = gHBitSetImpl0.copyTo(gHBitSet5);
        int int8 = gHBitSetImpl0.nextClearBit(100);
        org.junit.Assert.assertNotNull(gHBitSet5);
        org.junit.Assert.assertNotNull(gHBitSet6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.util.Random random0 = null;
        com.graphhopper.routing.util.tour.MultiPointTour multiPointTour4 = new com.graphhopper.routing.util.tour.MultiPointTour(random0, (double) (byte) -1, (int) 'a', (double) (byte) -1);
        double double6 = multiPointTour4.getHeadingForIteration((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 36.11340206185567d + "'", double6 == 36.11340206185567d);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        long[] longArray5 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet6 = com.carrotsearch.hppc.LongHashSet.from(longArray5);
        com.carrotsearch.hppc.predicates.LongPredicate longPredicate7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = longHashSet6.retainAll(longPredicate7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet6);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.graphhopper.routing.ev.EncodedValueFactory encodedValueFactory0 = null;
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.EncodingManager encodingManager3 = com.graphhopper.routing.util.EncodingManager.create(encodedValueFactory0, flagEncoderFactory1, "prepare.ch.log_messages");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot load properties to fetch EncodingManager configuration at: prepare.ch.log_messages/");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("prepare.ch.node.original_edge_count_weight");
        dataAccess5.close();
        boolean boolean7 = dataAccess5.isClosed();
        com.graphhopper.storage.RAMDirectory rAMDirectory9 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory10 = rAMDirectory9.create();
        java.nio.ByteOrder byteOrder11 = rAMDirectory9.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess13 = rAMDirectory9.find("prepare.ch.node.original_edge_count_weight");
        int int14 = dataAccess13.getSegmentSize();
        com.graphhopper.storage.DataAccess dataAccess15 = dataAccess5.copyTo(dataAccess13);
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) -1 };
        com.graphhopper.reader.osm.pbf.PbfBlobDecoderListener pbfBlobDecoderListener21 = null;
        com.graphhopper.reader.osm.pbf.PbfBlobDecoder pbfBlobDecoder22 = new com.graphhopper.reader.osm.pbf.PbfBlobDecoder("max_length", byteArray20, pbfBlobDecoderListener21);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             dataAccess5.getBytes((long) 10, byteArray20, (int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(directory10);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(dataAccess13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1048576 + "'", int14 == 1048576);
        org.junit.Assert.assertNotNull(dataAccess15);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, -1]");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue0 = com.graphhopper.routing.ev.Country.create();
        boolean boolean1 = countryEnumEncodedValue0.isStoreTwoDirections();
        com.graphhopper.routing.ev.EncodedValue.InitializerConfig initializerConfig2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = countryEnumEncodedValue0.init(initializerConfig2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(countryEnumEncodedValue0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.lang.String str1 = com.graphhopper.routing.ev.TurnCost.key("bike");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "bike$turn_cost" + "'", str1, "bike$turn_cost");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue1 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState3 = disabledEdgeIterator0.set(booleanEncodedValue1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanEncodedValue1);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.graphhopper.reader.osm.OSMXMLHelper oSMXMLHelper0 = new com.graphhopper.reader.osm.OSMXMLHelper();
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.graphhopper.routing.util.EdgeFilter edgeFilter0 = null;
        com.graphhopper.util.shapes.GHPoint gHPoint2 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.NameSimilarityEdgeFilter nameSimilarityEdgeFilter5 = new com.graphhopper.routing.util.NameSimilarityEdgeFilter(edgeFilter0, "foot", gHPoint2, 0.0d, strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap1 = new com.graphhopper.coll.GHLongLongHashMap(1);
        long[] longArray7 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet8 = com.carrotsearch.hppc.LongHashSet.from(longArray7);
        gHLongLongHashMap1.keys = longArray7;
        gHLongLongHashMap1.ensureCapacity((-4));
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet8);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        com.graphhopper.storage.IntsRef intsRef14 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState20 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef14, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int21 = edgeIteratorState20.getEdge();
        virtualEdgeIteratorState11.setReverseEdge(edgeIteratorState20);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue23 = com.graphhopper.routing.ev.MaxSpeed.create();
        double double24 = virtualEdgeIteratorState11.get(decimalEncodedValue23);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState26 = virtualEdgeIteratorState11.setDistance((double) 35.0f);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue28 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.util.details.IntDetails intDetails29 = new com.graphhopper.util.details.IntDetails("foot", (com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue28);
        com.graphhopper.storage.IntsRef intsRef32 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState38 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef32, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int39 = edgeIteratorState38.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue40 = com.graphhopper.routing.ev.Country.create();
        boolean boolean41 = countryEnumEncodedValue40.isStoreTwoDirections();
        com.graphhopper.routing.ev.Country country42 = edgeIteratorState38.getReverse(countryEnumEncodedValue40);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState43 = virtualEdgeIteratorState11.set(countryEnumEncodedValue28, country42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: EncodedValue country not initialized");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(decimalEncodedValue23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + Double.POSITIVE_INFINITY + "'", double24 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(edgeIteratorState26);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue28);
        org.junit.Assert.assertNotNull(edgeIteratorState38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + country42 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country42.equals(com.graphhopper.routing.ev.Country.DEFAULT));
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue0 = com.graphhopper.routing.ev.Country.create();
        int int1 = countryEnumEncodedValue0.getVersion();
        com.graphhopper.routing.ev.EncodedValue.InitializerConfig initializerConfig2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = countryEnumEncodedValue0.init(initializerConfig2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(countryEnumEncodedValue0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1687814340 + "'", int1 == 1687814340);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.util.Random random0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = com.graphhopper.util.GHUtility.randomDoubleInRange(random0, (double) 0.0f, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.reader.osm.OSMFileHeader> oSMFileHeaderGHLongObjectHashMap1 = new com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.reader.osm.OSMFileHeader>(200);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph2 = com.graphhopper.routing.ch.CHPreparationGraph.nodeBased((int) ' ', 0);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ch.NodeBasedWitnessPathSearcher nodeBasedWitnessPathSearcher3 = new com.graphhopper.routing.ch.NodeBasedWitnessPathSearcher(cHPreparationGraph2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: You need to call prepareForContraction() before calling this method");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cHPreparationGraph2);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue0 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.storage.IntsRef intsRef4 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState10 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef4, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            decimalEncodedValue0.setDecimal(false, intsRef4, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Call init before usage for EncodedValue max_weight|version=1841716118|bits=8|index=0|shift=-1|store_both_directions=false");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(decimalEncodedValue0);
        org.junit.Assert.assertNotNull(edgeIteratorState10);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.graphhopper.routing.ev.RoadClass roadClass0 = com.graphhopper.routing.ev.RoadClass.CORRIDOR;
        org.junit.Assert.assertTrue("'" + roadClass0 + "' != '" + com.graphhopper.routing.ev.RoadClass.CORRIDOR + "'", roadClass0.equals(com.graphhopper.routing.ev.RoadClass.CORRIDOR));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        double[] doubleArray5 = new double[] { 1.0d, '#', (short) 1, 100, 100 };
        com.graphhopper.util.shapes.BBox bBox6 = new com.graphhopper.util.shapes.BBox(doubleArray5);
        com.graphhopper.util.PointList pointList7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = bBox6.intersects(pointList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 35.0, 1.0, 100.0, 100.0]");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue1 = com.graphhopper.routing.ev.Country.create();
        boolean boolean2 = countryEnumEncodedValue1.isStoreTwoDirections();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState4 = disabledEdgeIterator0.setReverse((com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue1, 1048576);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(countryEnumEncodedValue1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("prepare.ch.node.original_edge_count_weight");
        dataAccess5.close();
        boolean boolean7 = dataAccess5.isClosed();
        com.graphhopper.storage.RAMDirectory rAMDirectory9 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory10 = rAMDirectory9.create();
        java.nio.ByteOrder byteOrder11 = rAMDirectory9.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess13 = rAMDirectory9.find("prepare.ch.node.original_edge_count_weight");
        int int14 = dataAccess13.getSegmentSize();
        com.graphhopper.storage.DataAccess dataAccess15 = dataAccess5.copyTo(dataAccess13);
        int int16 = dataAccess13.getSegments();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(directory10);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(dataAccess13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1048576 + "'", int14 == 1048576);
        org.junit.Assert.assertNotNull(dataAccess15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.graphhopper.GraphHopperConfig graphHopperConfig0 = new com.graphhopper.GraphHopperConfig();
        boolean boolean3 = graphHopperConfig0.getBool("foot", true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        com.graphhopper.storage.IntsRef intsRef14 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState20 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef14, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int21 = edgeIteratorState20.getEdge();
        virtualEdgeIteratorState11.setReverseEdge(edgeIteratorState20);
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue23 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState25 = virtualEdgeIteratorState11.set(booleanEncodedValue23, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: reverse state cannot be modified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(booleanEncodedValue23);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.lang.String str0 = com.graphhopper.routing.ch.CHParameters.NEIGHBOR_UPDATES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "prepare.ch.updates.neighbor" + "'", str0, "prepare.ch.updates.neighbor");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.graphhopper.routing.ev.TrackType trackType0 = com.graphhopper.routing.ev.TrackType.GRADE1;
        org.junit.Assert.assertTrue("'" + trackType0 + "' != '" + com.graphhopper.routing.ev.TrackType.GRADE1 + "'", trackType0.equals(com.graphhopper.routing.ev.TrackType.GRADE1));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.graphhopper.coll.GHTBitSet gHTBitSet1 = new com.graphhopper.coll.GHTBitSet(20);
        com.graphhopper.coll.GHBitSet gHBitSet2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHBitSet gHBitSet3 = gHTBitSet1.copyTo(gHBitSet2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.graphhopper.debatty.java.stringsimilarity.JaroWinkler jaroWinkler0 = new com.graphhopper.debatty.java.stringsimilarity.JaroWinkler();
        double double3 = jaroWinkler0.similarity("3.0", "hi!");
        double double4 = jaroWinkler0.getThreshold();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7d + "'", double4 == 0.7d);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.util.TraversalMode traversalMode2 = null;
        com.graphhopper.routing.lm.PerfectApproximator perfectApproximator4 = new com.graphhopper.routing.lm.PerfectApproximator(graph0, weighting1, traversalMode2, true);
        com.graphhopper.routing.weighting.WeightApproximator weightApproximator5 = perfectApproximator4.reverse();
        double double6 = perfectApproximator4.getSlack();
        org.junit.Assert.assertNotNull(weightApproximator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.graphhopper.util.shapes.BBox bBox4 = new com.graphhopper.util.shapes.BBox((double) 0L, (double) (short) 0, (double) (byte) 1, 100.0d);
        double double5 = bBox4.minLat;
        boolean boolean8 = bBox4.contains(0.0d, 100.0d);
        double double9 = bBox4.maxEle;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.UnsignedIntEncodedValue unsignedIntEncodedValue3 = new com.graphhopper.routing.ev.UnsignedIntEncodedValue("foot", 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: foot: at the moment the number of reserved bits cannot be more than 31");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.graphhopper.coll.GHTBitSet gHTBitSet1 = new com.graphhopper.coll.GHTBitSet(0);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl3 = new com.graphhopper.coll.GHBitSetImpl((int) (short) 100);
        com.graphhopper.coll.GHBitSet gHBitSet4 = gHTBitSet1.copyTo((com.graphhopper.coll.GHBitSet) gHBitSetImpl3);
        gHBitSetImpl3.add(10);
        int int7 = gHBitSetImpl3.length();
        org.junit.Assert.assertNotNull(gHBitSet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.graphhopper.routing.ev.RoadClass roadClass0 = com.graphhopper.routing.ev.RoadClass.MOTORWAY;
        org.junit.Assert.assertTrue("'" + roadClass0 + "' != '" + com.graphhopper.routing.ev.RoadClass.MOTORWAY + "'", roadClass0.equals(com.graphhopper.routing.ev.RoadClass.MOTORWAY));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.graphhopper.routing.AStar.AStarEntry aStarEntry4 = new com.graphhopper.routing.AStar.AStarEntry(0, (int) (byte) 0, (double) (byte) 1, (double) 1);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory6 = rAMDirectory1.create();
        long[] longArray12 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet13 = com.carrotsearch.hppc.LongHashSet.from(longArray12);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray14 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager15 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray14);
        com.graphhopper.storage.GraphBuilder graphBuilder16 = new com.graphhopper.storage.GraphBuilder(encodingManager15);
        boolean boolean17 = longHashSet13.equals((java.lang.Object) encodingManager15);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage20 = new com.graphhopper.storage.GraphHopperStorage(directory6, encodingManager15, false, true);
        com.graphhopper.routing.weighting.Weighting weighting21 = null;
        com.graphhopper.routing.weighting.Weighting weighting22 = graphHopperStorage20.wrapWeighting(weighting21);
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
        org.junit.Assert.assertNotNull(directory6);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet13);
        org.junit.Assert.assertNotNull(flagEncoderArray14);
        org.junit.Assert.assertNotNull(encodingManager15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(weighting22);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue1 = com.graphhopper.routing.ev.Country.create();
        int int2 = countryEnumEncodedValue1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState4 = disabledEdgeIterator0.set((com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue1, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(countryEnumEncodedValue1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1687814340 + "'", int2 == 1687814340);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager5, false);
        java.util.List<com.graphhopper.storage.CHConfig> cHConfigList8 = graphHopperStorage7.getCHConfigs();
        com.graphhopper.storage.RAMDirectory rAMDirectory10 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory11 = rAMDirectory10.create();
        com.graphhopper.storage.DAType dAType12 = rAMDirectory10.getDefaultType();
        com.graphhopper.storage.RAMDirectory rAMDirectory15 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory16 = rAMDirectory15.create();
        com.graphhopper.storage.DAType dAType17 = rAMDirectory15.getDefaultType();
        com.graphhopper.storage.Directory directory18 = rAMDirectory10.put("foot", dAType17);
        long[] longArray24 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet25 = com.carrotsearch.hppc.LongHashSet.from(longArray24);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray26 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager27 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray26);
        com.graphhopper.storage.GraphBuilder graphBuilder28 = new com.graphhopper.storage.GraphBuilder(encodingManager27);
        boolean boolean29 = longHashSet25.equals((java.lang.Object) encodingManager27);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage33 = new com.graphhopper.storage.GraphHopperStorage(directory18, encodingManager27, false, false, (-2));
        com.graphhopper.storage.Graph graph34 = com.graphhopper.util.GHUtility.copyTo((com.graphhopper.storage.Graph) graphHopperStorage7, (com.graphhopper.storage.Graph) graphHopperStorage33);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState36 = null; // flaky: graphHopperStorage7.getEdgeIteratorStateForKey((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(flagEncoderArray4);
        org.junit.Assert.assertNotNull(encodingManager5);
        org.junit.Assert.assertNotNull(cHConfigList8);
        org.junit.Assert.assertNotNull(directory11);
        org.junit.Assert.assertNotNull(dAType12);
        org.junit.Assert.assertNotNull(directory16);
        org.junit.Assert.assertNotNull(dAType17);
        org.junit.Assert.assertNotNull(directory18);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet25);
        org.junit.Assert.assertNotNull(flagEncoderArray26);
        org.junit.Assert.assertNotNull(encodingManager27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(graph34);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.graphhopper.routing.AlgorithmOptions.Builder builder0 = new com.graphhopper.routing.AlgorithmOptions.Builder();
        com.graphhopper.routing.AlgorithmOptions.Builder builder2 = builder0.maxVisitedNodes((int) ' ');
        com.graphhopper.routing.AlgorithmOptions.Builder builder4 = builder2.maxVisitedNodes(0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.graphhopper.routing.ch.AStarCHEntry aStarCHEntry3 = new com.graphhopper.routing.ch.AStarCHEntry(2, (double) 10L, (double) 2);
        double double4 = aStarCHEntry3.weight;
        aStarCHEntry3.adjNode = (short) 10;
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl0 = new com.graphhopper.coll.GHBitSetImpl();
        gHBitSetImpl0.remove((int) (short) 10);
        byte[] byteArray3 = gHBitSetImpl0.toByteArray();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = gHBitSetImpl0.nextClearBit((-1909399913));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex < 0: -1909399913");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry4 = new com.graphhopper.routing.ch.PrepareCHEntry(0, (int) (byte) -1, (-1), 0.0d);
        int int5 = prepareCHEntry4.prepareEdge;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.graphhopper.routing.util.parsers.OSMRoadEnvironmentParser oSMRoadEnvironmentParser0 = new com.graphhopper.routing.util.parsers.OSMRoadEnvironmentParser();
        com.graphhopper.storage.RAMDirectory rAMDirectory2 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory3 = rAMDirectory2.create();
        java.nio.ByteOrder byteOrder4 = rAMDirectory2.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray5 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager6 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray5);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage8 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory2, encodingManager6, false);
        com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser oSMHazmatTunnelParser9 = new com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray10 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager11 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray10);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue12 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue13 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray14 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue12, decimalEncodedValue13 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList15 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList15, encodedValueArray14);
        oSMHazmatTunnelParser9.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager11, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList15);
        oSMRoadEnvironmentParser0.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager6, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList15);
        com.graphhopper.reader.ReaderWay readerWay20 = new com.graphhopper.reader.ReaderWay((long) 0);
        com.graphhopper.routing.util.EncodingManager.AcceptWay acceptWay21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = encodingManager6.acceptWay(readerWay20, acceptWay21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertNotNull(flagEncoderArray5);
        org.junit.Assert.assertNotNull(encodingManager6);
        org.junit.Assert.assertNotNull(flagEncoderArray10);
        org.junit.Assert.assertNotNull(encodingManager11);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue12);
        org.junit.Assert.assertNotNull(decimalEncodedValue13);
        org.junit.Assert.assertNotNull(encodedValueArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        int int1 = com.graphhopper.routing.subnetwork.EdgeBasedTarjanSCC.getEdgeFromKey((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.storage.DAType dAType3 = rAMDirectory1.getDefaultType();
        com.graphhopper.storage.RAMDirectory rAMDirectory6 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory7 = rAMDirectory6.create();
        com.graphhopper.storage.DAType dAType8 = rAMDirectory6.getDefaultType();
        com.graphhopper.storage.Directory directory9 = rAMDirectory1.put("foot", dAType8);
        rAMDirectory1.clear();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(dAType3);
        org.junit.Assert.assertNotNull(directory7);
        org.junit.Assert.assertNotNull(dAType8);
        org.junit.Assert.assertNotNull(directory9);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.graphhopper.routing.util.FlagEncoder flagEncoder2 = null;
        com.graphhopper.storage.IntsRef intsRef5 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState11 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef5, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int12 = edgeIteratorState11.getEdge();
        com.graphhopper.storage.IntsRef intsRef19 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean20 = intsRef19.isEmpty();
        com.graphhopper.util.PointList pointList22 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState24 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef19, "hike_rating", pointList22, false);
        virtualEdgeIteratorState24.setUnfavored(true);
        int int27 = virtualEdgeIteratorState24.getOriginalEdgeKey();
        int int28 = virtualEdgeIteratorState24.getAdjNode();
        int int29 = virtualEdgeIteratorState24.getAdjNode();
        int int30 = virtualEdgeIteratorState24.getOriginalEdgeKey();
        com.graphhopper.storage.IntsRef intsRef33 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState39 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef33, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int40 = edgeIteratorState39.getEdge();
        com.graphhopper.util.EdgeIteratorState[] edgeIteratorStateArray41 = new com.graphhopper.util.EdgeIteratorState[] { edgeIteratorState11, virtualEdgeIteratorState24, edgeIteratorState39 };
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.GHUtility.setSpeed(21.0d, (double) 0, flagEncoder2, edgeIteratorStateArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorState11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1048576 + "'", int27 == 1048576);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1048576 + "'", int30 == 1048576);
        org.junit.Assert.assertNotNull(edgeIteratorState39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(edgeIteratorStateArray41);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory6 = rAMDirectory1.create();
        long[] longArray12 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet13 = com.carrotsearch.hppc.LongHashSet.from(longArray12);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray14 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager15 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray14);
        com.graphhopper.storage.GraphBuilder graphBuilder16 = new com.graphhopper.storage.GraphBuilder(encodingManager15);
        boolean boolean17 = longHashSet13.equals((java.lang.Object) encodingManager15);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage20 = new com.graphhopper.storage.GraphHopperStorage(directory6, encodingManager15, false, true);
        com.graphhopper.routing.Path path21 = new com.graphhopper.routing.Path((com.graphhopper.storage.Graph) graphHopperStorage20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = false; // flaky: graphHopperStorage20.isAdjacentToNode(0, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
        org.junit.Assert.assertNotNull(directory6);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet13);
        org.junit.Assert.assertNotNull(flagEncoderArray14);
        org.junit.Assert.assertNotNull(encodingManager15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl0 = new com.graphhopper.coll.GHBitSetImpl();
        // The following exception was thrown during execution in test generation
        try {
            gHBitSetImpl0.clear((-2), 1687814340);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex < 0: -2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue3 = new com.graphhopper.routing.ev.StringEncodedValue("bike_network", 10);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState5 = disabledEdgeIterator0.set(stringEncodedValue3, "1.8");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.LITTLE;
        long long3 = bitUtil0.combineIntsToLong(10, (int) (byte) 1);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) -1 };
        bitUtil0.fromShort(byteArray8, (short) 0);
        com.graphhopper.util.BitUtil bitUtil11 = com.graphhopper.util.BitUtil.LITTLE;
        long long14 = bitUtil11.combineIntsToLong(10, (int) (byte) 1);
        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10 };
        java.lang.String str20 = bitUtil11.toBitString(byteArray19);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = bitUtil0.toInt(byteArray19, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4294967306L + "'", long3 == 4294967306L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, -1, -1]");
        org.junit.Assert.assertNotNull(bitUtil11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 4294967306L + "'", long14 == 4294967306L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100, 10, 10, 10]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00001010000010100000101001100100" + "'", str20, "00001010000010100000101001100100");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.util.Random random0 = null;
        com.graphhopper.routing.util.tour.MultiPointTour multiPointTour4 = new com.graphhopper.routing.util.tour.MultiPointTour(random0, 1.0d, 5, (double) 0L);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        int int0 = com.graphhopper.routing.ch.PrepareEncoder.getScFwdDir();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.graphhopper.routing.ev.GetOffBike getOffBike0 = new com.graphhopper.routing.ev.GetOffBike();
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.graphhopper.routing.ev.IntEncodedValue intEncodedValue1 = null;
        com.graphhopper.util.details.IntDetails intDetails2 = new com.graphhopper.util.details.IntDetails("", intEncodedValue1);
        intDetails2.endInterval(100);
        intDetails2.endInterval(1048576);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue3 = new com.graphhopper.routing.ev.StringEncodedValue("bike_network", 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = disabledEdgeIterator0.getReverse(stringEncodedValue3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue1 = com.graphhopper.routing.ev.Country.create();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = disabledEdgeIterator0.getReverse((com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(countryEnumEncodedValue1);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.graphhopper.routing.ev.HorseRating horseRating0 = new com.graphhopper.routing.ev.HorseRating();
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.util.spatialrules.SpatialRuleLookup> spatialRuleLookupGHObjectIntHashMap2 = new com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.util.spatialrules.SpatialRuleLookup>(1687814340, 1451566.8463946683d);
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.hppc.BufferAllocationException; message: The load factor should be in range [0.01, 0.99]: 1451566.846395");
        } catch (com.carrotsearch.hppc.BufferAllocationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph2 = com.graphhopper.routing.ch.CHPreparationGraph.nodeBased(0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ch.PrepareGraphEdgeExplorer prepareGraphEdgeExplorer3 = cHPreparationGraph2.createOutEdgeExplorer();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: You need to call prepareForContraction() before calling this method");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cHPreparationGraph2);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.graphhopper.reader.osm.conditional.DateRangeParser dateRangeParser0 = new com.graphhopper.reader.osm.conditional.DateRangeParser();
        com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState conditionState2 = dateRangeParser0.checkCondition("3.0");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.osm.conditional.DateRange dateRange4 = dateRangeParser0.getRange("prepare.ch.updates.neighbor");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparsable date: \"prepare.ch.updates.neighbor\"");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + conditionState2 + "' != '" + com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.FALSE + "'", conditionState2.equals(com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.FALSE));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType0 = com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH;
        java.util.Calendar calendar1 = null;
        com.graphhopper.reader.osm.conditional.ParsedCalendar parsedCalendar2 = new com.graphhopper.reader.osm.conditional.ParsedCalendar(parseType0, calendar1);
        java.util.Calendar calendar3 = parsedCalendar2.parsedCalendar;
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType4 = com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH;
        java.util.Calendar calendar5 = null;
        com.graphhopper.reader.osm.conditional.ParsedCalendar parsedCalendar6 = new com.graphhopper.reader.osm.conditional.ParsedCalendar(parseType4, calendar5);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.osm.conditional.DateRange dateRange7 = new com.graphhopper.reader.osm.conditional.DateRange(parsedCalendar2, parsedCalendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + parseType0 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH + "'", parseType0.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH));
        org.junit.Assert.assertNull(calendar3);
        org.junit.Assert.assertTrue("'" + parseType4 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH + "'", parseType4.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.graphhopper.coll.GHTBitSet gHTBitSet1 = new com.graphhopper.coll.GHTBitSet(0);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl3 = new com.graphhopper.coll.GHBitSetImpl((int) (short) 100);
        com.graphhopper.coll.GHBitSet gHBitSet4 = gHTBitSet1.copyTo((com.graphhopper.coll.GHBitSet) gHBitSetImpl3);
        java.lang.String str5 = gHBitSetImpl3.toString();
        org.junit.Assert.assertNotNull(gHBitSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{}" + "'", str5, "{}");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.graphhopper.storage.RoutingCHGraph routingCHGraph0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ch.NodeBasedCHBidirPathExtractor nodeBasedCHBidirPathExtractor1 = new com.graphhopper.routing.ch.NodeBasedCHBidirPathExtractor(routingCHGraph0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.io.File file0 = null;
        com.graphhopper.storage.SimpleFSLockFactory simpleFSLockFactory1 = new com.graphhopper.storage.SimpleFSLockFactory(file0);
        // The following exception was thrown during execution in test generation
        try {
            simpleFSLockFactory1.forceRemove("..", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        com.graphhopper.storage.IntsRef intsRef14 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState20 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef14, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int21 = edgeIteratorState20.getEdge();
        virtualEdgeIteratorState11.setReverseEdge(edgeIteratorState20);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue23 = com.graphhopper.routing.ev.MaxSpeed.create();
        double double24 = virtualEdgeIteratorState11.get(decimalEncodedValue23);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState26 = virtualEdgeIteratorState11.setDistance((double) 35.0f);
        com.graphhopper.storage.IntsRef intsRef29 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState35 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef29, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue36 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        double double37 = edgeIteratorState35.getReverse(decimalEncodedValue36);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState39 = edgeIteratorState26.set(decimalEncodedValue36, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Call init before usage for EncodedValue max_axle_load|version=-1916217613|bits=7|index=0|shift=-1|store_both_directions=false");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(decimalEncodedValue23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + Double.POSITIVE_INFINITY + "'", double24 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(edgeIteratorState26);
        org.junit.Assert.assertNotNull(edgeIteratorState35);
        org.junit.Assert.assertNotNull(decimalEncodedValue36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + Double.POSITIVE_INFINITY + "'", double37 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.graphhopper.storage.CHGraph cHGraph0 = null;
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue2 = null;
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter3 = com.graphhopper.routing.util.DefaultEdgeFilter.allEdges(booleanEncodedValue2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = com.graphhopper.util.GHUtility.getNodeInfo(cHGraph0, 4, (com.graphhopper.routing.util.EdgeFilter) defaultEdgeFilter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultEdgeFilter3);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        virtualEdgeIteratorState11.setUnfavored(true);
        int int14 = virtualEdgeIteratorState11.getOriginalEdgeKey();
        int int15 = virtualEdgeIteratorState11.getAdjNode();
        com.graphhopper.util.FetchMode fetchMode16 = com.graphhopper.util.FetchMode.BASE_AND_PILLAR;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.PointList pointList17 = virtualEdgeIteratorState11.fetchWayGeometry(fetchMode16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1048576 + "'", int14 == 1048576);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + fetchMode16 + "' != '" + com.graphhopper.util.FetchMode.BASE_AND_PILLAR + "'", fetchMode16.equals(com.graphhopper.util.FetchMode.BASE_AND_PILLAR));
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager5, false);
        com.graphhopper.storage.CHGraph cHGraph9 = graphHopperStorage7.getCHGraph("bike_network");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState11 = null; // flaky: graphHopperStorage7.getEdgeIteratorStateForKey(11);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(flagEncoderArray4);
        org.junit.Assert.assertNotNull(encodingManager5);
        org.junit.Assert.assertNull(cHGraph9);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState2 = disabledEdgeIterator0.setName("Oracle Corporation");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.graphhopper.routing.ev.RoadClass roadClass0 = com.graphhopper.routing.ev.RoadClass.SERVICE;
        org.junit.Assert.assertTrue("'" + roadClass0 + "' != '" + com.graphhopper.routing.ev.RoadClass.SERVICE + "'", roadClass0.equals(com.graphhopper.routing.ev.RoadClass.SERVICE));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHIntHashSet gHIntHashSet2 = new com.graphhopper.coll.GHIntHashSet((int) '#', (double) (-2));
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.hppc.BufferAllocationException; message: The load factor should be in range [0.01, 0.99]: -2.000000");
        } catch (com.carrotsearch.hppc.BufferAllocationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.graphhopper.routing.ev.RoadEnvironment roadEnvironment1 = com.graphhopper.routing.ev.RoadEnvironment.find("hike");
        org.junit.Assert.assertTrue("'" + roadEnvironment1 + "' != '" + com.graphhopper.routing.ev.RoadEnvironment.OTHER + "'", roadEnvironment1.equals(com.graphhopper.routing.ev.RoadEnvironment.OTHER));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager5, false);
        java.util.List<com.graphhopper.storage.CHConfig> cHConfigList8 = graphHopperStorage7.getCHConfigs();
        com.graphhopper.storage.RAMDirectory rAMDirectory10 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory11 = rAMDirectory10.create();
        com.graphhopper.storage.DAType dAType12 = rAMDirectory10.getDefaultType();
        com.graphhopper.storage.RAMDirectory rAMDirectory15 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory16 = rAMDirectory15.create();
        com.graphhopper.storage.DAType dAType17 = rAMDirectory15.getDefaultType();
        com.graphhopper.storage.Directory directory18 = rAMDirectory10.put("foot", dAType17);
        long[] longArray24 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet25 = com.carrotsearch.hppc.LongHashSet.from(longArray24);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray26 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager27 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray26);
        com.graphhopper.storage.GraphBuilder graphBuilder28 = new com.graphhopper.storage.GraphBuilder(encodingManager27);
        boolean boolean29 = longHashSet25.equals((java.lang.Object) encodingManager27);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage33 = new com.graphhopper.storage.GraphHopperStorage(directory18, encodingManager27, false, false, (-2));
        com.graphhopper.storage.Graph graph34 = com.graphhopper.util.GHUtility.copyTo((com.graphhopper.storage.Graph) graphHopperStorage7, (com.graphhopper.storage.Graph) graphHopperStorage33);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState37 = graphHopperStorage33.getEdgeIteratorState((int) (short) 100, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: edgeId 100 out of bounds, edgeCount: 0");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(flagEncoderArray4);
        org.junit.Assert.assertNotNull(encodingManager5);
        org.junit.Assert.assertNotNull(cHConfigList8);
        org.junit.Assert.assertNotNull(directory11);
        org.junit.Assert.assertNotNull(dAType12);
        org.junit.Assert.assertNotNull(directory16);
        org.junit.Assert.assertNotNull(dAType17);
        org.junit.Assert.assertNotNull(directory18);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet25);
        org.junit.Assert.assertNotNull(flagEncoderArray26);
        org.junit.Assert.assertNotNull(encodingManager27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(graph34);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        int int0 = com.graphhopper.util.EdgeIterator.NO_EDGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.carrotsearch.hppc.HashOrderMixingStrategy hashOrderMixingStrategy2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHLongHashSet gHLongHashSet3 = new com.graphhopper.coll.GHLongHashSet((int) (byte) -1, 100.0d, hashOrderMixingStrategy2);
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.hppc.BufferAllocationException; message: The load factor should be in range [0.01, 0.99]: 100.000000");
        } catch (com.carrotsearch.hppc.BufferAllocationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.osm.conditional.DateRangeParser dateRangeParser1 = com.graphhopper.reader.osm.conditional.DateRangeParser.createInstance("foot");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.text.ParseException: Unparseable date: \"foot\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.graphhopper.coll.GHTBitSet gHTBitSet1 = new com.graphhopper.coll.GHTBitSet(0);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl3 = new com.graphhopper.coll.GHBitSetImpl((int) (short) 100);
        com.graphhopper.coll.GHBitSet gHBitSet4 = gHTBitSet1.copyTo((com.graphhopper.coll.GHBitSet) gHBitSetImpl3);
        int int6 = gHBitSetImpl3.previousClearBit((int) (byte) -1);
        org.junit.Assert.assertNotNull(gHBitSet4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.UnsignedDecimalEncodedValue unsignedDecimalEncodedValue5 = new com.graphhopper.routing.ev.UnsignedDecimalEncodedValue("Oracle Corporation", (-1), 10.0d, (double) 1.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue name wasn't valid: Oracle Corporation. Use lower case letters, underscore and numbers only.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph2 = com.graphhopper.routing.ch.CHPreparationGraph.nodeBased(0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            cHPreparationGraph2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: You need to call prepareForContraction() before calling this method");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cHPreparationGraph2);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph2 = com.graphhopper.routing.ch.CHPreparationGraph.nodeBased(0, (int) (short) 100);
        com.graphhopper.routing.ch.CHRoutingAlgorithmFactory cHRoutingAlgorithmFactory3 = null;
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile5 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str6 = customProfile5.toString();
        com.graphhopper.config.Profile profile9 = customProfile5.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.util.PMap pMap10 = profile9.getHints();
        com.graphhopper.routing.CHPathCalculator cHPathCalculator11 = new com.graphhopper.routing.CHPathCalculator(cHRoutingAlgorithmFactory3, pMap10);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ch.EdgeBasedWitnessPathSearcher edgeBasedWitnessPathSearcher12 = new com.graphhopper.routing.ch.EdgeBasedWitnessPathSearcher(cHPreparationGraph2, pMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: You need to call prepareForContraction() before calling this method");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cHPreparationGraph2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str6, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile9);
        org.junit.Assert.assertNotNull(pMap10);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        int[] intArray0 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet1 = com.graphhopper.coll.GHIntHashSet.from(intArray0);
        int int2 = intHashSet1.size();
        boolean boolean4 = intHashSet1.remove((int) (short) -1);
        int int6 = intHashSet1.indexGet((int) (byte) 1);
        boolean boolean8 = false; // flaky: intHashSet1.indexExists(10);
        intHashSet1.clear();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intHashSet1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.graphhopper.routing.ch.NodeOrderingProvider nodeOrderingProvider1 = com.graphhopper.routing.ch.NodeOrderingProvider.identity((int) (byte) 1);
        org.junit.Assert.assertNotNull(nodeOrderingProvider1);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.graphhopper.routing.ev.HazmatWater hazmatWater0 = com.graphhopper.routing.ev.HazmatWater.NO;
        org.junit.Assert.assertTrue("'" + hazmatWater0 + "' != '" + com.graphhopper.routing.ev.HazmatWater.NO + "'", hazmatWater0.equals(com.graphhopper.routing.ev.HazmatWater.NO));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.graphhopper.storage.IntsRef intsRef2 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState8 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef2, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int9 = edgeIteratorState8.getAdjNode();
        com.graphhopper.storage.IntsRef intsRef12 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState18 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef12, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int19 = edgeIteratorState18.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue20 = com.graphhopper.routing.ev.Country.create();
        boolean boolean21 = countryEnumEncodedValue20.isStoreTwoDirections();
        com.graphhopper.routing.ev.Country country22 = edgeIteratorState18.getReverse(countryEnumEncodedValue20);
        java.lang.String str23 = countryEnumEncodedValue20.getName();
        com.graphhopper.routing.ev.Country country24 = com.graphhopper.routing.ev.Country.AUT;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState25 = edgeIteratorState8.set(countryEnumEncodedValue20, country24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorState8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(edgeIteratorState18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + country22 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country22.equals(com.graphhopper.routing.ev.Country.DEFAULT));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "country" + "'", str23, "country");
        org.junit.Assert.assertTrue("'" + country24 + "' != '" + com.graphhopper.routing.ev.Country.AUT + "'", country24.equals(com.graphhopper.routing.ev.Country.AUT));
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.graphhopper.storage.RoutingCHGraph routingCHGraph0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.DijkstraBidirectionCH dijkstraBidirectionCH1 = new com.graphhopper.routing.DijkstraBidirectionCH(routingCHGraph0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        int int0 = com.graphhopper.util.Constants.VERSION_STRING_IDX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.graphhopper.storage.CHEdgeFilter cHEdgeFilter0 = com.graphhopper.storage.CHEdgeFilter.ALL_EDGES;
        org.junit.Assert.assertNotNull(cHEdgeFilter0);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.util.Random random0 = null;
        com.graphhopper.routing.util.tour.MultiPointTour multiPointTour4 = new com.graphhopper.routing.util.tour.MultiPointTour(random0, (double) (byte) -1, (int) 'a', (double) (byte) -1);
        double double6 = multiPointTour4.getHeadingForIteration((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.711340206185567d + "'", double6 == 2.711340206185567d);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.graphhopper.routing.ev.MaxAxleLoad maxAxleLoad0 = new com.graphhopper.routing.ev.MaxAxleLoad();
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray0 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager1 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray0);
        com.graphhopper.reader.OSMTurnRelation.Type type5 = null;
        com.graphhopper.reader.OSMTurnRelation oSMTurnRelation6 = new com.graphhopper.reader.OSMTurnRelation(0L, (long) '#', (-1L), type5);
        com.graphhopper.routing.util.parsers.TurnCostParser.ExternalInternalMap externalInternalMap7 = null;
        com.graphhopper.storage.Graph graph8 = null;
        encodingManager1.handleTurnRelationTags(oSMTurnRelation6, externalInternalMap7, graph8);
        java.util.Calendar calendar10 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "_network$turn_cost", "", "", "5.4.0-70-generic", "bike_network", "3.0", "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}", "prepare.ch.edge.witness_search.sigma_factor", "3.0" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.lang.String[] strArray46 = new java.lang.String[] { "", "bike", "prepare.ch.edge.witness_search.reset_interval", "_network", "prepare.ch.edge.witness_search.sigma_factor", "foot", "srtm", "_network$turn_cost", "prepare.ch.node.original_edge_count_weight", "foot_network", "foot_network", "prepare.ch.log_messages", "3.0", "", "secondary", "secondary", "hi!", "00001010000010100000101001100100", "1.8", "bike", "prepare.ch.edge.witness_search.sigma_factor", "hike_rating", "prepare.ch.edge.witness_search.reset_interval" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        java.lang.String[] strArray67 = new java.lang.String[] { "3.0", "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}", "prepare.ch.updates.lazy", "secondary", "foot", "srtm", "foot", "bike_network", "foot_network", "prepare.ch.log_messages", "", "00001010000010100000101001100100", "hi!", "prepare.ch.node.original_edge_count_weight", "1.8", "_network$turn_cost", "5.4.0-70-generic", "horse_rating" };
        java.util.LinkedHashSet<java.lang.String> strSet68 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet68, strArray67);
        com.graphhopper.reader.osm.conditional.ConditionalOSMTagInspector conditionalOSMTagInspector70 = new com.graphhopper.reader.osm.conditional.ConditionalOSMTagInspector(calendar10, (java.util.List<java.lang.String>) strList21, (java.util.Set<java.lang.String>) strSet47, (java.util.Set<java.lang.String>) strSet68);
        boolean boolean71 = oSMTurnRelation6.isVehicleTypeConcernedByTurnRestriction((java.util.Collection<java.lang.String>) strSet47);
        org.junit.Assert.assertNotNull(flagEncoderArray0);
        org.junit.Assert.assertNotNull(encodingManager1);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.graphhopper.coll.MinHeapWithUpdate minHeapWithUpdate1 = new com.graphhopper.coll.MinHeapWithUpdate(21);
        // The following exception was thrown during execution in test generation
        try {
            minHeapWithUpdate1.push((int) ' ', (float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal id: 32, legal range: [0, 21[");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.graphhopper.coll.GHIntObjectHashMap<com.graphhopper.reader.dem.AbstractElevationProvider> abstractElevationProviderGHIntObjectHashMap0 = new com.graphhopper.coll.GHIntObjectHashMap<com.graphhopper.reader.dem.AbstractElevationProvider>();
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory6 = rAMDirectory1.create();
        java.lang.String str7 = rAMDirectory1.toString();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
        org.junit.Assert.assertNotNull(directory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "prepare.ch.node.original_edge_count_weight/" + "'", str7, "prepare.ch.node.original_edge_count_weight/");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.graphhopper.routing.util.PriorityCode priorityCode0 = com.graphhopper.routing.util.PriorityCode.UNCHANGED;
        org.junit.Assert.assertTrue("'" + priorityCode0 + "' != '" + com.graphhopper.routing.util.PriorityCode.UNCHANGED + "'", priorityCode0.equals(com.graphhopper.routing.util.PriorityCode.UNCHANGED));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap0 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>();
        com.carrotsearch.hppc.IntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableIntObjectHashMap1 = strComparableGHIntObjectHashMap0.clone();
        int[] intArray2 = strComparableGHIntObjectHashMap0.keys;
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableGHIntObjectHashMap0.indexReplace(10, (java.lang.Comparable<java.lang.String>) "srtm");
        org.junit.Assert.assertNotNull(strComparableIntObjectHashMap1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNull(strComparable5);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph> cHPreparationGraphGHLongObjectHashMap0 = new com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph>();
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph4 = com.graphhopper.routing.ch.CHPreparationGraph.nodeBased(0, (int) (short) 100);
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph5 = cHPreparationGraphGHLongObjectHashMap0.put(0L, cHPreparationGraph4);
        // The following exception was thrown during execution in test generation
        try {
            cHPreparationGraph4.addEdge(3, (int) (byte) 1, 20, (double) (short) -1, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cHPreparationGraph4);
        org.junit.Assert.assertNull(cHPreparationGraph5);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.graphhopper.apache.commons.collections.IntFloatBinaryHeap intFloatBinaryHeap0 = new com.graphhopper.apache.commons.collections.IntFloatBinaryHeap();
        // The following exception was thrown during execution in test generation
        try {
            int int1 = intFloatBinaryHeap0.poll();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Heap is empty. Cannot peek element.");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("prepare.ch.node.original_edge_count_weight");
        dataAccess5.close();
        boolean boolean7 = dataAccess5.isClosed();
        com.graphhopper.storage.RAMDirectory rAMDirectory9 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory10 = rAMDirectory9.create();
        java.nio.ByteOrder byteOrder11 = rAMDirectory9.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess13 = rAMDirectory9.find("prepare.ch.node.original_edge_count_weight");
        int int14 = dataAccess13.getSegmentSize();
        com.graphhopper.storage.DataAccess dataAccess15 = dataAccess5.copyTo(dataAccess13);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = dataAccess13.getInt((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(directory10);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(dataAccess13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1048576 + "'", int14 == 1048576);
        org.junit.Assert.assertNotNull(dataAccess15);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHIntHashSet gHIntHashSet1 = new com.graphhopper.coll.GHIntHashSet((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of elements must be >= 0: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.lang.String str1 = com.graphhopper.routing.ev.TurnCost.key("srtm");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "srtm$turn_cost" + "'", str1, "srtm$turn_cost");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry4 = new com.graphhopper.routing.ch.PrepareCHEntry(0, (int) (byte) -1, (-1), 0.0d);
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry9 = new com.graphhopper.routing.ch.PrepareCHEntry(0, (int) (byte) -1, (-1), 0.0d);
        prepareCHEntry4.parent = prepareCHEntry9;
        prepareCHEntry9.prepareEdge = (byte) 0;
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap0 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>();
        strComparableGHIntObjectHashMap0.ensureCapacity((int) (short) 0);
        int int3 = strComparableGHIntObjectHashMap0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        javax.xml.stream.XMLStreamReader xMLStreamReader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.osm.OSMFileHeader oSMFileHeader2 = com.graphhopper.reader.osm.OSMFileHeader.create(52L, xMLStreamReader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType0 = com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH;
        java.util.Calendar calendar1 = null;
        com.graphhopper.reader.osm.conditional.ParsedCalendar parsedCalendar2 = new com.graphhopper.reader.osm.conditional.ParsedCalendar(parseType0, calendar1);
        boolean boolean3 = parsedCalendar2.isDayless();
        boolean boolean4 = parsedCalendar2.isDayless();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar5 = parsedCalendar2.getMin();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + parseType0 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH + "'", parseType0.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.graphhopper.reader.dem.SRTMGL1Provider sRTMGL1Provider0 = new com.graphhopper.reader.dem.SRTMGL1Provider();
        java.lang.String str1 = sRTMGL1Provider0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "srtmgl1" + "'", str1, "srtmgl1");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.graphhopper.util.PMap pMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.HikeFlagEncoder hikeFlagEncoder1 = new com.graphhopper.routing.util.HikeFlagEncoder(pMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.graphhopper.routing.AlgorithmOptions.Builder builder0 = com.graphhopper.routing.AlgorithmOptions.start();
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.util.Calendar calendar2 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "_network$turn_cost", "", "", "5.4.0-70-generic", "bike_network", "3.0", "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}", "prepare.ch.edge.witness_search.sigma_factor", "3.0" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "bike", "prepare.ch.edge.witness_search.reset_interval", "_network", "prepare.ch.edge.witness_search.sigma_factor", "foot", "srtm", "_network$turn_cost", "prepare.ch.node.original_edge_count_weight", "foot_network", "foot_network", "prepare.ch.log_messages", "3.0", "", "secondary", "secondary", "hi!", "00001010000010100000101001100100", "1.8", "bike", "prepare.ch.edge.witness_search.sigma_factor", "hike_rating", "prepare.ch.edge.witness_search.reset_interval" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        java.lang.String[] strArray59 = new java.lang.String[] { "3.0", "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}", "prepare.ch.updates.lazy", "secondary", "foot", "srtm", "foot", "bike_network", "foot_network", "prepare.ch.log_messages", "", "00001010000010100000101001100100", "hi!", "prepare.ch.node.original_edge_count_weight", "1.8", "_network$turn_cost", "5.4.0-70-generic", "horse_rating" };
        java.util.LinkedHashSet<java.lang.String> strSet60 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet60, strArray59);
        com.graphhopper.reader.osm.conditional.ConditionalOSMTagInspector conditionalOSMTagInspector62 = new com.graphhopper.reader.osm.conditional.ConditionalOSMTagInspector(calendar2, (java.util.List<java.lang.String>) strList13, (java.util.Set<java.lang.String>) strSet39, (java.util.Set<java.lang.String>) strSet60);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.parsers.OSMTurnRelationParser oSMTurnRelationParser63 = new com.graphhopper.routing.util.parsers.OSMTurnRelationParser("prepare.ch.log_messages", (int) (short) 100, (java.util.List<java.lang.String>) strList13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue name wasn't valid: prepare.ch.log_messages$turn_cost. Use lower case letters, underscore and numbers only.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.graphhopper.routing.ev.Hazmat hazmat0 = com.graphhopper.routing.ev.Hazmat.NO;
        org.junit.Assert.assertTrue("'" + hazmat0 + "' != '" + com.graphhopper.routing.ev.Hazmat.NO + "'", hazmat0.equals(com.graphhopper.routing.ev.Hazmat.NO));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.graphhopper.routing.ev.HazmatTunnel hazmatTunnel0 = com.graphhopper.routing.ev.HazmatTunnel.D;
        org.junit.Assert.assertTrue("'" + hazmatTunnel0 + "' != '" + com.graphhopper.routing.ev.HazmatTunnel.D + "'", hazmatTunnel0.equals(com.graphhopper.routing.ev.HazmatTunnel.D));
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.graphhopper.routing.ev.RouteNetwork routeNetwork0 = com.graphhopper.routing.ev.RouteNetwork.NATIONAL;
        org.junit.Assert.assertTrue("'" + routeNetwork0 + "' != '" + com.graphhopper.routing.ev.RouteNetwork.NATIONAL + "'", routeNetwork0.equals(com.graphhopper.routing.ev.RouteNetwork.NATIONAL));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory6 = rAMDirectory1.create();
        long[] longArray12 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet13 = com.carrotsearch.hppc.LongHashSet.from(longArray12);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray14 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager15 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray14);
        com.graphhopper.storage.GraphBuilder graphBuilder16 = new com.graphhopper.storage.GraphBuilder(encodingManager15);
        boolean boolean17 = longHashSet13.equals((java.lang.Object) encodingManager15);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage20 = new com.graphhopper.storage.GraphHopperStorage(directory6, encodingManager15, false, true);
        com.graphhopper.routing.Path path21 = new com.graphhopper.routing.Path((com.graphhopper.storage.Graph) graphHopperStorage20);
        int int22 = graphHopperStorage20.getNodes();
        com.graphhopper.storage.CHConfig cHConfig23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.GraphHopperStorage graphHopperStorage24 = graphHopperStorage20.addCHGraph(cHConfig23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
        org.junit.Assert.assertNotNull(directory6);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet13);
        org.junit.Assert.assertNotNull(flagEncoderArray14);
        org.junit.Assert.assertNotNull(encodingManager15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory6 = rAMDirectory1.create();
        long[] longArray12 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet13 = com.carrotsearch.hppc.LongHashSet.from(longArray12);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray14 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager15 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray14);
        com.graphhopper.storage.GraphBuilder graphBuilder16 = new com.graphhopper.storage.GraphBuilder(encodingManager15);
        boolean boolean17 = longHashSet13.equals((java.lang.Object) encodingManager15);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage20 = new com.graphhopper.storage.GraphHopperStorage(directory6, encodingManager15, false, true);
        com.graphhopper.routing.Path path21 = new com.graphhopper.routing.Path((com.graphhopper.storage.Graph) graphHopperStorage20);
        com.graphhopper.routing.util.EncodingManager encodingManager22 = graphHopperStorage20.getEncodingManager();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage24 = graphHopperStorage20.create((long) (short) 0);
        com.graphhopper.routing.weighting.Weighting weighting25 = null;
        com.graphhopper.routing.lm.LandmarkStorage landmarkStorage27 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.lm.LMApproximator lMApproximator31 = new com.graphhopper.routing.lm.LMApproximator((com.graphhopper.storage.Graph) graphHopperStorage24, weighting25, 11, landmarkStorage27, (int) (short) 100, 4.0024076802712575E7d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
        org.junit.Assert.assertNotNull(directory6);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet13);
        org.junit.Assert.assertNotNull(flagEncoderArray14);
        org.junit.Assert.assertNotNull(encodingManager15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(encodingManager22);
        org.junit.Assert.assertNotNull(graphHopperStorage24);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        virtualEdgeIteratorState11.setUnfavored(true);
        int int14 = virtualEdgeIteratorState11.getOriginalEdgeKey();
        int int15 = virtualEdgeIteratorState11.getAdjNode();
        int int16 = virtualEdgeIteratorState11.getAdjNode();
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue19 = new com.graphhopper.routing.ev.StringEncodedValue("bike_network", 10);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState21 = virtualEdgeIteratorState11.set(stringEncodedValue19, "prepare.ch.node.original_edge_count_weight");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: EncodedValue bike_network not initialized");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1048576 + "'", int14 == 1048576);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile1 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str2 = customProfile1.toString();
        com.graphhopper.config.Profile profile5 = customProfile1.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        int int6 = profile5.getVersion();
        com.graphhopper.config.Profile profile8 = profile5.setWeighting("horse_rating");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str2, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1909399913) + "'", int6 == (-1909399913));
        org.junit.Assert.assertNotNull(profile8);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager5, false);
        com.graphhopper.routing.weighting.Weighting weighting8 = null;
        com.graphhopper.routing.util.TraversalMode traversalMode9 = com.graphhopper.routing.util.TraversalMode.EDGE_BASED;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.AlternativeRoute.AlternativeBidirSearch alternativeBidirSearch11 = new com.graphhopper.routing.AlternativeRoute.AlternativeBidirSearch((com.graphhopper.storage.Graph) graphHopperStorage7, weighting8, traversalMode9, 0.7d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(flagEncoderArray4);
        org.junit.Assert.assertNotNull(encodingManager5);
        org.junit.Assert.assertTrue("'" + traversalMode9 + "' != '" + com.graphhopper.routing.util.TraversalMode.EDGE_BASED + "'", traversalMode9.equals(com.graphhopper.routing.util.TraversalMode.EDGE_BASED));
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.graphhopper.storage.index.Snap.Position position0 = com.graphhopper.storage.index.Snap.Position.TOWER;
        org.junit.Assert.assertTrue("'" + position0 + "' != '" + com.graphhopper.storage.index.Snap.Position.TOWER + "'", position0.equals(com.graphhopper.storage.index.Snap.Position.TOWER));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.graphhopper.routing.util.TransportationMode transportationMode0 = com.graphhopper.routing.util.TransportationMode.CAR;
        java.util.List<java.lang.String> strList1 = com.graphhopper.routing.util.parsers.OSMRoadAccessParser.toOSMRestrictions(transportationMode0);
        org.junit.Assert.assertTrue("'" + transportationMode0 + "' != '" + com.graphhopper.routing.util.TransportationMode.CAR + "'", transportationMode0.equals(com.graphhopper.routing.util.TransportationMode.CAR));
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.lang.String str0 = com.graphhopper.routing.ch.CHParameters.HIERARCHY_DEPTH_WEIGHT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "prepare.ch.edge.hierarchy_depth_weight" + "'", str0, "prepare.ch.edge.hierarchy_depth_weight");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap0 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>();
        int[] intArray1 = strComparableGHIntObjectHashMap0.keys;
        boolean boolean3 = false; // flaky: strComparableGHIntObjectHashMap0.indexExists(100);
        int[] intArray4 = strComparableGHIntObjectHashMap0.keys;
        java.lang.String str6 = strComparableGHIntObjectHashMap0.visualizeKeyDistribution((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = null; // flaky: strComparableGHIntObjectHashMap0.indexGet((int) 'a');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
// flaky:         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "................                   " + "'", str6, "................                   ");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.graphhopper.util.AngleCalc angleCalc0 = com.graphhopper.util.AngleCalc.ANGLE_CALC;
        double double5 = angleCalc0.calcAzimuth((double) 21, (double) '4', 36.11340206185567d, 4.0024076802712575E7d);
        java.lang.String str7 = angleCalc0.azimuth2compassPoint((double) (short) 0);
        org.junit.Assert.assertNotNull(angleCalc0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 90.0002104591497d + "'", double5 == 90.0002104591497d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "N" + "'", str7, "N");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory6 = rAMDirectory1.create();
        long[] longArray12 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet13 = com.carrotsearch.hppc.LongHashSet.from(longArray12);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray14 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager15 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray14);
        com.graphhopper.storage.GraphBuilder graphBuilder16 = new com.graphhopper.storage.GraphBuilder(encodingManager15);
        boolean boolean17 = longHashSet13.equals((java.lang.Object) encodingManager15);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage20 = new com.graphhopper.storage.GraphHopperStorage(directory6, encodingManager15, false, true);
        com.graphhopper.routing.Path path21 = new com.graphhopper.routing.Path((com.graphhopper.storage.Graph) graphHopperStorage20);
        com.graphhopper.routing.Path path23 = path21.addTime((long) (byte) 100);
        long[] longArray29 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet30 = com.carrotsearch.hppc.LongHashSet.from(longArray29);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray31 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager32 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray31);
        com.graphhopper.storage.GraphBuilder graphBuilder33 = new com.graphhopper.storage.GraphBuilder(encodingManager32);
        boolean boolean34 = longHashSet30.equals((java.lang.Object) encodingManager32);
        com.graphhopper.routing.weighting.Weighting weighting35 = null;
        com.graphhopper.storage.RAMDirectory rAMDirectory37 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory38 = rAMDirectory37.create();
        java.nio.ByteOrder byteOrder39 = rAMDirectory37.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray40 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager41 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray40);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage43 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory37, encodingManager41, false);
        java.util.List<java.lang.String> strList44 = graphHopperStorage43.getCHGraphNames();
        com.graphhopper.util.details.PathDetailsBuilderFactory pathDetailsBuilderFactory45 = new com.graphhopper.util.details.PathDetailsBuilderFactory();
        java.util.Map<java.lang.String, java.util.List<com.graphhopper.util.details.PathDetail>> strMap47 = com.graphhopper.util.details.PathDetailsFromEdges.calcDetails(path21, (com.graphhopper.routing.ev.EncodedValueLookup) encodingManager32, weighting35, strList44, pathDetailsBuilderFactory45, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState48 = null; // flaky: path21.getFinalEdge();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
        org.junit.Assert.assertNotNull(directory6);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet13);
        org.junit.Assert.assertNotNull(flagEncoderArray14);
        org.junit.Assert.assertNotNull(encodingManager15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(path23);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet30);
        org.junit.Assert.assertNotNull(flagEncoderArray31);
        org.junit.Assert.assertNotNull(encodingManager32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(directory38);
        org.junit.Assert.assertNotNull(byteOrder39);
        org.junit.Assert.assertNotNull(flagEncoderArray40);
        org.junit.Assert.assertNotNull(encodingManager41);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strMap47);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.graphhopper.routing.DirectionResolverResult directionResolverResult2 = com.graphhopper.routing.DirectionResolverResult.onlyLeft((int) (byte) 0, (int) '#');
        boolean boolean3 = directionResolverResult2.isImpossible();
        boolean boolean5 = directionResolverResult2.equals((java.lang.Object) 0.0f);
        org.junit.Assert.assertNotNull(directionResolverResult2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.storage.IntsRef intsRef2 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean3 = intsRef2.isEmpty();
        com.graphhopper.storage.IntsRef intsRef5 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int6 = intsRef2.compareTo(intsRef5);
        boolean boolean7 = intsRef2.isValid();
        int[] intArray8 = intsRef2.ints;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState9 = disabledEdgeIterator0.setFlags(intsRef2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        java.lang.String str4 = rAMDirectory1.getLocation();
        boolean boolean5 = rAMDirectory1.isStoring();
        com.graphhopper.storage.StorableProperties storableProperties6 = new com.graphhopper.storage.StorableProperties((com.graphhopper.storage.Directory) rAMDirectory1);
        boolean boolean8 = storableProperties6.checkVersions(true);
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "prepare.ch.node.original_edge_count_weight/" + "'", str4, "prepare.ch.node.original_edge_count_weight/");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.graphhopper.util.shapes.BBox bBox4 = new com.graphhopper.util.shapes.BBox((double) 0L, (double) (short) 0, (double) (byte) 1, 100.0d);
        double double5 = bBox4.minEle;
        boolean boolean10 = bBox4.intersects((double) 10L, (double) 1048576, 0.0d, 0.0d);
        com.graphhopper.util.PointList pointList11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = bBox4.intersects(pointList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        boolean boolean1 = com.graphhopper.util.EdgeIterator.Edge.isValid((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph> cHPreparationGraphGHLongObjectHashMap0 = new com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph>();
        java.lang.String str2 = cHPreparationGraphGHLongObjectHashMap0.visualizeKeyDistribution((int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "................                   " + "'", str2, "................                   ");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        javax.xml.stream.XMLStreamReader xMLStreamReader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.ReaderWay readerWay2 = com.graphhopper.reader.osm.OSMXMLHelper.createWay(1L, xMLStreamReader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.graphhopper.util.InstructionList instructionList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.Instruction instruction4 = com.graphhopper.util.Instructions.find(instructionList0, (double) (-1), 0.0d, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.graphhopper.storage.DAType.MemRef memRef0 = null;
        com.graphhopper.storage.DAType dAType4 = new com.graphhopper.storage.DAType(memRef0, false, false, false);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.graphhopper.routing.ev.IntEncodedValue intEncodedValue0 = com.graphhopper.routing.ev.MtbRating.create();
        org.junit.Assert.assertNotNull(intEncodedValue0);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.graphhopper.util.StopWatch stopWatch1 = new com.graphhopper.util.StopWatch("edges:0(0MB), nodes:0(0MB), name:(0MB), geo:0(0MB), bounds:1.7976931348623157E308,-1.7976931348623157E308,1.7976931348623157E308,-1.7976931348623157E308");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue0 = null;
        com.graphhopper.routing.util.parsers.OSMRoundaboutParser oSMRoundaboutParser1 = new com.graphhopper.routing.util.parsers.OSMRoundaboutParser(booleanEncodedValue0);
        com.graphhopper.storage.RAMDirectory rAMDirectory3 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory4 = rAMDirectory3.create();
        java.nio.ByteOrder byteOrder5 = rAMDirectory3.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray6 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager7 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray6);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage9 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory3, encodingManager7, false);
        com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser oSMHazmatTunnelParser10 = new com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray11 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager12 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray11);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue13 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue14 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray15 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue13, decimalEncodedValue14 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList16 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList16, encodedValueArray15);
        oSMHazmatTunnelParser10.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager12, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList16);
        com.graphhopper.storage.RAMDirectory rAMDirectory20 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory21 = rAMDirectory20.create();
        java.nio.ByteOrder byteOrder22 = rAMDirectory20.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray23 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager24 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray23);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage26 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory20, encodingManager24, false);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue28 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.util.details.IntDetails intDetails29 = new com.graphhopper.util.details.IntDetails("foot", (com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue28);
        com.graphhopper.routing.ev.IntEncodedValue intEncodedValue30 = com.graphhopper.routing.ev.HorseRating.create();
        com.graphhopper.storage.IntsRef intsRef33 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState39 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef33, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue40 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        double double41 = edgeIteratorState39.getReverse(decimalEncodedValue40);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue42 = com.graphhopper.routing.ev.Country.create();
        boolean boolean43 = countryEnumEncodedValue42.isStoreTwoDirections();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue44 = com.graphhopper.routing.ev.Country.create();
        boolean boolean45 = countryEnumEncodedValue44.isStoreTwoDirections();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray46 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue28, intEncodedValue30, decimalEncodedValue40, countryEnumEncodedValue42, countryEnumEncodedValue44 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList47 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList47, encodedValueArray46);
        oSMHazmatTunnelParser10.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager24, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList47);
        oSMRoundaboutParser1.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager7, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList47);
        com.graphhopper.storage.GraphBuilder graphBuilder51 = new com.graphhopper.storage.GraphBuilder(encodingManager7);
        java.lang.String str52 = encodingManager7.toString();
        org.junit.Assert.assertNotNull(directory4);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertNotNull(flagEncoderArray6);
        org.junit.Assert.assertNotNull(encodingManager7);
        org.junit.Assert.assertNotNull(flagEncoderArray11);
        org.junit.Assert.assertNotNull(encodingManager12);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue13);
        org.junit.Assert.assertNotNull(decimalEncodedValue14);
        org.junit.Assert.assertNotNull(encodedValueArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(directory21);
        org.junit.Assert.assertNotNull(byteOrder22);
        org.junit.Assert.assertNotNull(flagEncoderArray23);
        org.junit.Assert.assertNotNull(encodingManager24);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue28);
        org.junit.Assert.assertNotNull(intEncodedValue30);
        org.junit.Assert.assertNotNull(edgeIteratorState39);
        org.junit.Assert.assertNotNull(decimalEncodedValue40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + Double.POSITIVE_INFINITY + "'", double41 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(encodedValueArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap0 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>();
        int[] intArray1 = strComparableGHIntObjectHashMap0.keys;
        int int3 = strComparableGHIntObjectHashMap0.indexOf((int) (byte) -1);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableGHIntObjectHashMap0.get((int) (short) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-4) + "'", int3 == (-4));
        org.junit.Assert.assertNull(strComparable5);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = disabledEdgeIterator0.next();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.config.Profile.validateProfileName("prepare.ch.node.original_edge_count_weight/");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Profile names may only contain lower case letters, numbers and underscores, given: prepare.ch.node.original_edge_count_weight/");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.graphhopper.util.shapes.BBox bBox4 = new com.graphhopper.util.shapes.BBox((double) 0L, (double) (short) 0, (double) (byte) 1, 100.0d);
        org.locationtech.jts.geom.Envelope envelope5 = com.graphhopper.util.shapes.BBox.toEnvelope(bBox4);
        org.junit.Assert.assertNotNull(envelope5);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.graphhopper.routing.weighting.Weighting weighting0 = null;
        com.graphhopper.util.details.WeightDetails weightDetails1 = new com.graphhopper.util.details.WeightDetails(weighting0);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.graphhopper.routing.ev.RoadClass roadClass0 = com.graphhopper.routing.ev.RoadClass.STEPS;
        org.junit.Assert.assertTrue("'" + roadClass0 + "' != '" + com.graphhopper.routing.ev.RoadClass.STEPS + "'", roadClass0.equals(com.graphhopper.routing.ev.RoadClass.STEPS));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap1 = new com.graphhopper.coll.GHIntLongHashMap((int) (byte) 1);
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap2 = gHIntLongHashMap1.clone();
        java.lang.String str3 = gHIntLongHashMap1.toString();
        org.junit.Assert.assertNotNull(intLongHashMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.graphhopper.routing.ev.RouteNetwork routeNetwork0 = com.graphhopper.routing.ev.RouteNetwork.MISSING;
        java.lang.String str1 = routeNetwork0.toString();
        org.junit.Assert.assertTrue("'" + routeNetwork0 + "' != '" + com.graphhopper.routing.ev.RouteNetwork.MISSING + "'", routeNetwork0.equals(com.graphhopper.routing.ev.RouteNetwork.MISSING));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "missing" + "'", str1, "missing");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap3 = new com.graphhopper.coll.OSMIDMap(directory2);
        com.graphhopper.search.StringIndex stringIndex5 = new com.graphhopper.search.StringIndex(directory2, 10);
        stringIndex5.close();
        // The following exception was thrown during execution in test generation
        try {
            stringIndex5.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: already closed");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.graphhopper.GraphHopperConfig graphHopperConfig0 = new com.graphhopper.GraphHopperConfig();
        java.lang.String str1 = graphHopperConfig0.toString();
        int int4 = graphHopperConfig0.getInt("Node: 200 lat=0.0 lon=3.0", (int) ' ');
        float float7 = graphHopperConfig0.getFloat("1.8.0_251", (float) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "profiles:\nprofiles_ch:\nprofiles_lm:\nproperties:\n" + "'", str1, "profiles:\nprofiles_ch:\nprofiles_lm:\nproperties:\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.storage.DAType dAType3 = rAMDirectory1.getDefaultType();
        com.graphhopper.storage.DAType dAType5 = com.graphhopper.storage.DAType.RAM_INT_STORE;
        com.graphhopper.storage.Directory directory6 = rAMDirectory1.put("", dAType5);
        java.lang.String str7 = rAMDirectory1.getLocation();
        java.util.Collection<com.graphhopper.storage.DataAccess> dataAccessCollection8 = rAMDirectory1.getAll();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(dAType3);
        org.junit.Assert.assertNotNull(dAType5);
        org.junit.Assert.assertNotNull(directory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "prepare.ch.node.original_edge_count_weight/" + "'", str7, "prepare.ch.node.original_edge_count_weight/");
        org.junit.Assert.assertNotNull(dataAccessCollection8);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.storage.DAType dAType3 = rAMDirectory1.getDefaultType();
        com.graphhopper.storage.RAMDirectory rAMDirectory6 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory7 = rAMDirectory6.create();
        com.graphhopper.storage.DAType dAType8 = rAMDirectory6.getDefaultType();
        com.graphhopper.storage.Directory directory9 = rAMDirectory1.put("foot", dAType8);
        long[] longArray15 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet16 = com.carrotsearch.hppc.LongHashSet.from(longArray15);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray17 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager18 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray17);
        com.graphhopper.storage.GraphBuilder graphBuilder19 = new com.graphhopper.storage.GraphBuilder(encodingManager18);
        boolean boolean20 = longHashSet16.equals((java.lang.Object) encodingManager18);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage24 = new com.graphhopper.storage.GraphHopperStorage(directory9, encodingManager18, false, false, (-2));
        com.graphhopper.routing.weighting.Weighting weighting25 = null;
        com.graphhopper.routing.weighting.Weighting weighting26 = graphHopperStorage24.wrapWeighting(weighting25);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.CHGraph cHGraph27 = graphHopperStorage24.getCHGraph();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: There is no CHGraph");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(dAType3);
        org.junit.Assert.assertNotNull(directory7);
        org.junit.Assert.assertNotNull(dAType8);
        org.junit.Assert.assertNotNull(directory9);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet16);
        org.junit.Assert.assertNotNull(flagEncoderArray17);
        org.junit.Assert.assertNotNull(encodingManager18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(weighting26);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.graphhopper.storage.IntsRef intsRef2 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState8 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef2, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int9 = edgeIteratorState8.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue10 = com.graphhopper.routing.ev.Country.create();
        boolean boolean11 = countryEnumEncodedValue10.isStoreTwoDirections();
        com.graphhopper.routing.ev.Country country12 = edgeIteratorState8.getReverse(countryEnumEncodedValue10);
        com.graphhopper.storage.IntsRef intsRef20 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean21 = intsRef20.isEmpty();
        com.graphhopper.util.PointList pointList23 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState25 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef20, "hike_rating", pointList23, false);
        int int26 = countryEnumEncodedValue10.getInt(true, intsRef20);
        int int27 = countryEnumEncodedValue10.getMaxInt();
        int int28 = countryEnumEncodedValue10.getVersion();
        org.junit.Assert.assertNotNull(edgeIteratorState8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + country12 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country12.equals(com.graphhopper.routing.ev.Country.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1687814340 + "'", int28 == 1687814340);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.graphhopper.reader.dem.MultiSourceElevationProvider multiSourceElevationProvider1 = new com.graphhopper.reader.dem.MultiSourceElevationProvider("prepare.ch.updates.neighbor");
        double double4 = multiSourceElevationProvider1.getEle((double) 3, (double) 32);
        multiSourceElevationProvider1.setAutoRemoveTemporaryFiles(false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1143.0d + "'", double4 == 1143.0d);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        int int1 = com.graphhopper.util.GHUtility.reverseEdgeKey(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.graphhopper.coll.GHTBitSet gHTBitSet1 = new com.graphhopper.coll.GHTBitSet(0);
        com.graphhopper.coll.GHBitSet gHBitSet2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHBitSet gHBitSet3 = gHTBitSet1.copyTo(gHBitSet2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.graphhopper.routing.util.parsers.OSMMaxSpeedParser oSMMaxSpeedParser0 = new com.graphhopper.routing.util.parsers.OSMMaxSpeedParser();
        com.graphhopper.storage.IntsRef intsRef2 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.reader.ReaderWay readerWay4 = new com.graphhopper.reader.ReaderWay((long) 0);
        com.graphhopper.storage.IntsRef intsRef7 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean8 = intsRef7.isEmpty();
        com.graphhopper.storage.IntsRef intsRef10 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int11 = intsRef7.compareTo(intsRef10);
        boolean boolean13 = intsRef10.equals((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.IntsRef intsRef14 = oSMMaxSpeedParser0.handleWayTags(intsRef2, readerWay4, true, intsRef10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Call init before usage for EncodedValue max_speed|version=-999902595|bits=5|index=0|shift=-1|store_both_directions=true");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap3 = new com.graphhopper.coll.OSMIDMap(directory2);
        oSMIDMap3.optimize();
        org.junit.Assert.assertNotNull(directory2);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.graphhopper.GraphHopper graphHopper0 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        com.graphhopper.GraphHopper graphHopper2 = graphHopper0.setFlagEncoderFactory(flagEncoderFactory1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = graphHopper2.load("motorcycle");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot load properties to fetch EncodingManager configuration at: motorcycle/");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphHopper2);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.lm.LMConfig lMConfig2 = new com.graphhopper.routing.lm.LMConfig("1.8", weighting1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Profile names may only contain lower case letters, numbers and underscores, given: 1.8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.graphhopper.routing.util.FlagEncoder flagEncoder0 = null;
        com.graphhopper.storage.TurnCostStorage turnCostStorage1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.DefaultTurnCostProvider defaultTurnCostProvider3 = new com.graphhopper.routing.weighting.DefaultTurnCostProvider(flagEncoder0, turnCostStorage1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No storage set to calculate turn weight");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray0 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager1 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray0);
        java.lang.String str2 = encodingManager1.toFlagEncodersAsString();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue4 = encodingManager1.getBooleanEncodedValue("prepare.ch.edge.witness_search.sigma_factor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot find EncodedValue prepare.ch.edge.witness_search.sigma_factor in collection: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(flagEncoderArray0);
        org.junit.Assert.assertNotNull(encodingManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.graphhopper.routing.DirectionResolverResult directionResolverResult2 = com.graphhopper.routing.DirectionResolverResult.onlyLeft((int) (byte) 0, (int) '#');
        int int3 = directionResolverResult2.getOutEdgeLeft();
        org.junit.Assert.assertNotNull(directionResolverResult2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.graphhopper.routing.util.PriorityCode priorityCode0 = com.graphhopper.routing.util.PriorityCode.PREFER;
        int int1 = priorityCode0.getValue();
        org.junit.Assert.assertTrue("'" + priorityCode0 + "' != '" + com.graphhopper.routing.util.PriorityCode.PREFER + "'", priorityCode0.equals(com.graphhopper.routing.util.PriorityCode.PREFER));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.graphhopper.coll.GHTBitSet gHTBitSet1 = new com.graphhopper.coll.GHTBitSet(20);
        gHTBitSet1.add((int) (byte) 1);
        gHTBitSet1.remove((-1));
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions2 = new com.graphhopper.routing.AlgorithmOptions("", weighting1);
        java.lang.String str3 = algorithmOptions2.getAlgorithm();
        boolean boolean4 = algorithmOptions2.hasWeighting();
        com.graphhopper.routing.util.TraversalMode traversalMode5 = algorithmOptions2.getTraversalMode();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + traversalMode5 + "' != '" + com.graphhopper.routing.util.TraversalMode.NODE_BASED + "'", traversalMode5.equals(com.graphhopper.routing.util.TraversalMode.NODE_BASED));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.graphhopper.util.StopWatch stopWatch0 = com.graphhopper.util.StopWatch.started();
        long long1 = stopWatch0.getNanos();
        org.junit.Assert.assertNotNull(stopWatch0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.graphhopper.routing.ev.RoadClass roadClass0 = com.graphhopper.routing.ev.RoadClass.PEDESTRIAN;
        org.junit.Assert.assertTrue("'" + roadClass0 + "' != '" + com.graphhopper.routing.ev.RoadClass.PEDESTRIAN + "'", roadClass0.equals(com.graphhopper.routing.ev.RoadClass.PEDESTRIAN));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.graphhopper.routing.ev.RouteNetwork routeNetwork0 = com.graphhopper.routing.ev.RouteNetwork.INTERNATIONAL;
        org.junit.Assert.assertTrue("'" + routeNetwork0 + "' != '" + com.graphhopper.routing.ev.RouteNetwork.INTERNATIONAL + "'", routeNetwork0.equals(com.graphhopper.routing.ev.RouteNetwork.INTERNATIONAL));
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap3 = new com.graphhopper.coll.OSMIDMap(directory2);
        com.graphhopper.search.StringIndex stringIndex5 = new com.graphhopper.search.StringIndex(directory2, 10);
        stringIndex5.close();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = stringIndex5.add(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.graphhopper.routing.util.spatialrules.SpatialRuleLookup spatialRuleLookup0 = com.graphhopper.routing.util.spatialrules.SpatialRuleLookup.EMPTY;
        com.graphhopper.storage.IntsRef intsRef3 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState9 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef3, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int10 = edgeIteratorState9.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue11 = com.graphhopper.routing.ev.Country.create();
        boolean boolean12 = countryEnumEncodedValue11.isStoreTwoDirections();
        com.graphhopper.routing.ev.Country country13 = edgeIteratorState9.getReverse(countryEnumEncodedValue11);
        com.graphhopper.routing.util.parsers.SpatialRuleParser spatialRuleParser14 = new com.graphhopper.routing.util.parsers.SpatialRuleParser(spatialRuleLookup0, (com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue11);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup15 = null;
        com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser oSMHazmatTunnelParser16 = new com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray17 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager18 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray17);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue19 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue20 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray21 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue19, decimalEncodedValue20 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList22 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList22, encodedValueArray21);
        oSMHazmatTunnelParser16.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager18, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList22);
        java.util.List<com.graphhopper.routing.ev.EncodedValue> encodedValueList25 = encodingManager18.getEncodedValues();
        // The following exception was thrown during execution in test generation
        try {
            spatialRuleParser14.createEncodedValues(encodedValueLookup15, encodedValueList25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(spatialRuleLookup0);
        org.junit.Assert.assertNotNull(edgeIteratorState9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + country13 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country13.equals(com.graphhopper.routing.ev.Country.DEFAULT));
        org.junit.Assert.assertNotNull(flagEncoderArray17);
        org.junit.Assert.assertNotNull(encodingManager18);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue19);
        org.junit.Assert.assertNotNull(decimalEncodedValue20);
        org.junit.Assert.assertNotNull(encodedValueArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(encodedValueList25);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        double double0 = com.graphhopper.routing.ev.MaxSpeed.UNLIMITED_SIGN_SPEED;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 150.0d + "'", double0 == 150.0d);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl0 = new com.graphhopper.coll.GHBitSetImpl();
        // The following exception was thrown during execution in test generation
        try {
            gHBitSetImpl0.set((int) (byte) 1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex: 1 > toIndex: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        int[] intArray2 = new int[] { 21, 10 };
        com.carrotsearch.hppc.IntHashSet intHashSet3 = com.graphhopper.coll.GHIntHashSet.from(intArray2);
        boolean boolean5 = intHashSet3.add((int) (byte) 0);
        int[] intArray6 = intHashSet3.keys;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[21, 10]");
        org.junit.Assert.assertNotNull(intHashSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, 21, 0, 0]");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue3 = new com.graphhopper.routing.ev.StringEncodedValue("bike_network", 10);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState5 = disabledEdgeIterator0.setReverse(stringEncodedValue3, "srtm$turn_cost");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.UnsignedDecimalEncodedValue unsignedDecimalEncodedValue4 = new com.graphhopper.routing.ev.UnsignedDecimalEncodedValue("-1 (1) weight: 2.0, incEdge: 10", (int) (byte) 0, 36.11340206185567d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue name wasn't valid: -1 (1) weight: 2.0, incEdge: 10. Use lower case letters, underscore and numbers only.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.graphhopper.coll.GHIntObjectHashMap<com.graphhopper.coll.GHLongLongHashMap> gHLongLongHashMapGHIntObjectHashMap1 = new com.graphhopper.coll.GHIntObjectHashMap<com.graphhopper.coll.GHLongLongHashMap>((int) (short) 1);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions2 = new com.graphhopper.routing.AlgorithmOptions("", weighting1);
        java.lang.String str3 = algorithmOptions2.getAlgorithm();
        java.lang.String str4 = algorithmOptions2.getAlgorithm();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap1 = new com.graphhopper.coll.GHIntLongHashMap((int) (byte) 1);
        boolean boolean3 = gHIntLongHashMap1.indexExists((int) (byte) 1);
        long long5 = gHIntLongHashMap1.remove((int) (short) -1);
        com.carrotsearch.hppc.predicates.IntLongPredicate intLongPredicate6 = null;
        int int7 = gHIntLongHashMap1.removeAll(intLongPredicate6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.graphhopper.routing.AStar.AStarEntry aStarEntry4 = new com.graphhopper.routing.AStar.AStarEntry((int) (short) 0, (int) (short) 10, (double) 20, (double) (-1));
        com.graphhopper.routing.AStar.AStarEntry aStarEntry5 = aStarEntry4.getParent();
        // The following exception was thrown during execution in test generation
        try {
            aStarEntry5.adjNode = (short) 0;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aStarEntry5);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.graphhopper.coll.GHIntObjectHashMap<com.graphhopper.routing.ev.BooleanEncodedValue> booleanEncodedValueGHIntObjectHashMap0 = new com.graphhopper.coll.GHIntObjectHashMap<com.graphhopper.routing.ev.BooleanEncodedValue>();
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        com.graphhopper.storage.IntsRef intsRef14 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState20 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef14, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int21 = edgeIteratorState20.getEdge();
        virtualEdgeIteratorState11.setReverseEdge(edgeIteratorState20);
        java.lang.String str23 = virtualEdgeIteratorState11.getName();
        java.lang.String str24 = virtualEdgeIteratorState11.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hike_rating" + "'", str23, "hike_rating");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1->-1" + "'", str24, "-1->-1");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.lang.String str0 = com.graphhopper.routing.util.FlagEncoderFactory.MOUNTAINBIKE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mtb" + "'", str0, "mtb");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile1 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str2 = customProfile1.toString();
        com.graphhopper.util.CustomModel customModel3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.custom.CustomProfile customProfile4 = customProfile1.setCustomModel(customModel3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str2, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry4 = new com.graphhopper.routing.ch.PrepareCHEntry(0, (int) (byte) -1, (-1), 0.0d);
        prepareCHEntry4.prepareEdge = (byte) 0;
        prepareCHEntry4.prepareEdge = (byte) 0;
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory6 = rAMDirectory1.create();
        long[] longArray12 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet13 = com.carrotsearch.hppc.LongHashSet.from(longArray12);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray14 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager15 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray14);
        com.graphhopper.storage.GraphBuilder graphBuilder16 = new com.graphhopper.storage.GraphBuilder(encodingManager15);
        boolean boolean17 = longHashSet13.equals((java.lang.Object) encodingManager15);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage20 = new com.graphhopper.storage.GraphHopperStorage(directory6, encodingManager15, false, true);
        com.graphhopper.routing.Path path21 = new com.graphhopper.routing.Path((com.graphhopper.storage.Graph) graphHopperStorage20);
        int int22 = graphHopperStorage20.getNodes();
        com.graphhopper.routing.weighting.Weighting weighting23 = null;
        com.graphhopper.util.PathMerger pathMerger24 = new com.graphhopper.util.PathMerger((com.graphhopper.storage.Graph) graphHopperStorage20, weighting23);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = 0; // flaky: graphHopperStorage20.getOtherNode((int) (short) -1, 2);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
        org.junit.Assert.assertNotNull(directory6);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet13);
        org.junit.Assert.assertNotNull(flagEncoderArray14);
        org.junit.Assert.assertNotNull(encodingManager15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.graphhopper.routing.ch.CHEntry cHEntry2 = new com.graphhopper.routing.ch.CHEntry(0, (double) (byte) 0);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory6 = rAMDirectory1.create();
        long[] longArray12 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet13 = com.carrotsearch.hppc.LongHashSet.from(longArray12);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray14 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager15 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray14);
        com.graphhopper.storage.GraphBuilder graphBuilder16 = new com.graphhopper.storage.GraphBuilder(encodingManager15);
        boolean boolean17 = longHashSet13.equals((java.lang.Object) encodingManager15);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage20 = new com.graphhopper.storage.GraphHopperStorage(directory6, encodingManager15, false, true);
        com.graphhopper.routing.Path path21 = new com.graphhopper.routing.Path((com.graphhopper.storage.Graph) graphHopperStorage20);
        com.graphhopper.storage.index.LocationIndex locationIndex22 = null;
        java.util.Map<java.lang.String, com.graphhopper.config.Profile> strMap23 = null;
        com.graphhopper.storage.RAMDirectory rAMDirectory25 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory26 = rAMDirectory25.create();
        java.nio.ByteOrder byteOrder27 = rAMDirectory25.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess29 = rAMDirectory25.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory30 = rAMDirectory25.create();
        long[] longArray36 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet37 = com.carrotsearch.hppc.LongHashSet.from(longArray36);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray38 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager39 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray38);
        com.graphhopper.storage.GraphBuilder graphBuilder40 = new com.graphhopper.storage.GraphBuilder(encodingManager39);
        boolean boolean41 = longHashSet37.equals((java.lang.Object) encodingManager39);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage44 = new com.graphhopper.storage.GraphHopperStorage(directory30, encodingManager39, false, true);
        com.graphhopper.routing.Path path45 = new com.graphhopper.routing.Path((com.graphhopper.storage.Graph) graphHopperStorage44);
        com.graphhopper.routing.Path path47 = path45.addTime((long) (byte) 100);
        long[] longArray53 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet54 = com.carrotsearch.hppc.LongHashSet.from(longArray53);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray55 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager56 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray55);
        com.graphhopper.storage.GraphBuilder graphBuilder57 = new com.graphhopper.storage.GraphBuilder(encodingManager56);
        boolean boolean58 = longHashSet54.equals((java.lang.Object) encodingManager56);
        com.graphhopper.routing.weighting.Weighting weighting59 = null;
        com.graphhopper.storage.RAMDirectory rAMDirectory61 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory62 = rAMDirectory61.create();
        java.nio.ByteOrder byteOrder63 = rAMDirectory61.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray64 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager65 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray64);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage67 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory61, encodingManager65, false);
        java.util.List<java.lang.String> strList68 = graphHopperStorage67.getCHGraphNames();
        com.graphhopper.util.details.PathDetailsBuilderFactory pathDetailsBuilderFactory69 = new com.graphhopper.util.details.PathDetailsBuilderFactory();
        java.util.Map<java.lang.String, java.util.List<com.graphhopper.util.details.PathDetail>> strMap71 = com.graphhopper.util.details.PathDetailsFromEdges.calcDetails(path45, (com.graphhopper.routing.ev.EncodedValueLookup) encodingManager56, weighting59, strList68, pathDetailsBuilderFactory69, (int) ' ');
        com.graphhopper.util.TranslationMap translationMap72 = null;
        com.graphhopper.routing.RouterConfig routerConfig73 = null;
        com.graphhopper.routing.WeightingFactory weightingFactory74 = null;
        java.util.Map<java.lang.String, com.graphhopper.storage.CHGraph> strMap75 = null;
        java.util.Map<java.lang.String, com.graphhopper.routing.lm.LandmarkStorage> strMap76 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.Router router77 = new com.graphhopper.routing.Router(graphHopperStorage20, locationIndex22, strMap23, pathDetailsBuilderFactory69, translationMap72, routerConfig73, weightingFactory74, strMap75, strMap76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
        org.junit.Assert.assertNotNull(directory6);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet13);
        org.junit.Assert.assertNotNull(flagEncoderArray14);
        org.junit.Assert.assertNotNull(encodingManager15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(directory26);
        org.junit.Assert.assertNotNull(byteOrder27);
        org.junit.Assert.assertNotNull(dataAccess29);
        org.junit.Assert.assertNotNull(directory30);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet37);
        org.junit.Assert.assertNotNull(flagEncoderArray38);
        org.junit.Assert.assertNotNull(encodingManager39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(path47);
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet54);
        org.junit.Assert.assertNotNull(flagEncoderArray55);
        org.junit.Assert.assertNotNull(encodingManager56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(directory62);
        org.junit.Assert.assertNotNull(byteOrder63);
        org.junit.Assert.assertNotNull(flagEncoderArray64);
        org.junit.Assert.assertNotNull(encodingManager65);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(strMap71);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.graphhopper.storage.RAMDirectory rAMDirectory0 = new com.graphhopper.storage.RAMDirectory();
        com.graphhopper.coll.OSMIDMap oSMIDMap2 = new com.graphhopper.coll.OSMIDMap((com.graphhopper.storage.Directory) rAMDirectory0, (-1));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.lang.String str0 = com.graphhopper.util.Constants.VERSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "3.0" + "'", str0, "3.0");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        int int1 = com.graphhopper.routing.subnetwork.EdgeBasedTarjanSCC.getEdgeFromKey((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 50 + "'", int1 == 50);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.graphhopper.routing.ch.CHEntry cHEntry2 = new com.graphhopper.routing.ch.CHEntry((int) ' ', (-1.0d));
        com.graphhopper.routing.SPTEntry sPTEntry3 = cHEntry2.parent;
        org.junit.Assert.assertNull(sPTEntry3);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.graphhopper.coll.GHTBitSet gHTBitSet1 = new com.graphhopper.coll.GHTBitSet(0);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl3 = new com.graphhopper.coll.GHBitSetImpl((int) (short) 100);
        com.graphhopper.coll.GHBitSet gHBitSet4 = gHTBitSet1.copyTo((com.graphhopper.coll.GHBitSet) gHBitSetImpl3);
        int int6 = gHBitSetImpl3.nextClear((int) (byte) 100);
        int int7 = gHBitSetImpl3.getCardinality();
        org.junit.Assert.assertNotNull(gHBitSet4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        com.graphhopper.storage.IntsRef intsRef14 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState20 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef14, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int21 = edgeIteratorState20.getEdge();
        virtualEdgeIteratorState11.setReverseEdge(edgeIteratorState20);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue23 = com.graphhopper.routing.ev.MaxSpeed.create();
        double double24 = virtualEdgeIteratorState11.get(decimalEncodedValue23);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState26 = virtualEdgeIteratorState11.setDistance((double) 35.0f);
        double double27 = virtualEdgeIteratorState11.getDistance();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue28 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double29 = virtualEdgeIteratorState11.getReverse(decimalEncodedValue28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(decimalEncodedValue23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + Double.POSITIVE_INFINITY + "'", double24 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(edgeIteratorState26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 35.0d + "'", double27 == 35.0d);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            int int1 = disabledEdgeIterator0.getOrigEdgeLast();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.graphhopper.routing.ch.ShortcutFilter shortcutFilter0 = com.graphhopper.routing.ch.ShortcutFilter.outEdges();
        org.junit.Assert.assertNotNull(shortcutFilter0);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.graphhopper.coll.GHLongHashSet gHLongHashSet1 = new com.graphhopper.coll.GHLongHashSet(21);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.IntsRef intsRef1 = disabledEdgeIterator0.getFlags();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.graphhopper.reader.dem.SkadiProvider skadiProvider0 = new com.graphhopper.reader.dem.SkadiProvider();
        skadiProvider0.release();
        java.lang.String str2 = skadiProvider0.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "skadi" + "'", str2, "skadi");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap1 = new com.graphhopper.coll.GHLongLongHashMap(1);
        boolean boolean4 = gHLongLongHashMap1.putIfAbsent((long) (byte) -1, (long) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.graphhopper.reader.osm.conditional.DateRangeParser dateRangeParser0 = new com.graphhopper.reader.osm.conditional.DateRangeParser();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.osm.conditional.DateRange dateRange2 = dateRangeParser0.getRange("........                                                                                                                                                                                                ");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparsable date: \"........\"");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.graphhopper.GraphHopper graphHopper0 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        com.graphhopper.GraphHopper graphHopper2 = graphHopper0.setFlagEncoderFactory(flagEncoderFactory1);
        // The following exception was thrown during execution in test generation
        try {
            graphHopper2.postProcessing();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphHopper2);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.graphhopper.routing.ev.HazmatWater hazmatWater0 = com.graphhopper.routing.ev.HazmatWater.PERMISSIVE;
        org.junit.Assert.assertTrue("'" + hazmatWater0 + "' != '" + com.graphhopper.routing.ev.HazmatWater.PERMISSIVE + "'", hazmatWater0.equals(com.graphhopper.routing.ev.HazmatWater.PERMISSIVE));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.graphhopper.GraphHopper graphHopper0 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        com.graphhopper.GraphHopper graphHopper2 = graphHopper0.setFlagEncoderFactory(flagEncoderFactory1);
        com.graphhopper.routing.lm.LMPreparationHandler lMPreparationHandler3 = graphHopper0.getLMPreparationHandler();
        int int4 = lMPreparationHandler3.getPreparationThreads();
        com.graphhopper.util.PMap pMap5 = null;
        com.graphhopper.GraphHopperConfig graphHopperConfig6 = new com.graphhopper.GraphHopperConfig(pMap5);
        // The following exception was thrown during execution in test generation
        try {
            lMPreparationHandler3.init(graphHopperConfig6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphHopper2);
        org.junit.Assert.assertNotNull(lMPreparationHandler3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        long[] longArray5 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet6 = com.carrotsearch.hppc.LongHashSet.from(longArray5);
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap8 = new com.graphhopper.coll.GHLongLongHashMap(1);
        java.util.Spliterator<com.carrotsearch.hppc.cursors.LongLongCursor> longLongCursorSpliterator9 = gHLongLongHashMap8.spliterator();
        com.carrotsearch.hppc.LongLongHashMap.KeysContainer keysContainer10 = gHLongLongHashMap8.keys();
        int int11 = longHashSet6.retainAll((com.carrotsearch.hppc.LongLookupContainer) keysContainer10);
        longHashSet6.release();
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet6);
        org.junit.Assert.assertNotNull(longLongCursorSpliterator9);
        org.junit.Assert.assertNotNull(keysContainer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue0 = null;
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter1 = com.graphhopper.routing.util.DefaultEdgeFilter.allEdges(booleanEncodedValue0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = defaultEdgeFilter1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultEdgeFilter1);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.graphhopper.routing.ev.BikeNetwork bikeNetwork0 = new com.graphhopper.routing.ev.BikeNetwork();
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.LITTLE;
        long long3 = bitUtil0.combineIntsToLong(10, (int) (byte) 1);
        com.graphhopper.util.BitUtil bitUtil4 = com.graphhopper.util.BitUtil.LITTLE;
        long long7 = bitUtil4.combineIntsToLong(10, (int) (byte) 1);
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10 };
        java.lang.String str13 = bitUtil4.toBitString(byteArray12);
        byte[] byteArray15 = bitUtil4.fromShort((short) 100);
        // The following exception was thrown during execution in test generation
        try {
            bitUtil0.fromLong(byteArray15, (long) 50, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4294967306L + "'", long3 == 4294967306L);
        org.junit.Assert.assertNotNull(bitUtil4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4294967306L + "'", long7 == 4294967306L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 10, 10, 10]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "00001010000010100000101001100100" + "'", str13, "00001010000010100000101001100100");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100, 0, 0, 0]");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory6 = rAMDirectory1.create();
        long[] longArray12 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet13 = com.carrotsearch.hppc.LongHashSet.from(longArray12);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray14 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager15 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray14);
        com.graphhopper.storage.GraphBuilder graphBuilder16 = new com.graphhopper.storage.GraphBuilder(encodingManager15);
        boolean boolean17 = longHashSet13.equals((java.lang.Object) encodingManager15);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage20 = new com.graphhopper.storage.GraphHopperStorage(directory6, encodingManager15, false, true);
        com.graphhopper.routing.Path path21 = new com.graphhopper.routing.Path((com.graphhopper.storage.Graph) graphHopperStorage20);
        com.graphhopper.routing.util.EncodingManager encodingManager22 = graphHopperStorage20.getEncodingManager();
        com.graphhopper.storage.NodeAccess nodeAccess23 = graphHopperStorage20.getNodeAccess();
        // The following exception was thrown during execution in test generation
        try {
            double double25 = nodeAccess23.getEle((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot access elevation - 3D is not enabled");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
        org.junit.Assert.assertNotNull(directory6);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet13);
        org.junit.Assert.assertNotNull(flagEncoderArray14);
        org.junit.Assert.assertNotNull(encodingManager15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(encodingManager22);
        org.junit.Assert.assertNotNull(nodeAccess23);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue1 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.routing.weighting.TurnCostProvider turnCostProvider2 = null;
        com.graphhopper.routing.subnetwork.PrepareRoutingSubnetworks.PrepareJob prepareJob3 = new com.graphhopper.routing.subnetwork.PrepareRoutingSubnetworks.PrepareJob("1.8.0_251", booleanEncodedValue1, turnCostProvider2);
        java.lang.String str4 = prepareJob3.toString();
        org.junit.Assert.assertNotNull(booleanEncodedValue1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1.8.0_251|node-based" + "'", str4, "1.8.0_251|node-based");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.graphhopper.routing.DirectionResolverResult directionResolverResult0 = com.graphhopper.routing.DirectionResolverResult.impossible();
        org.junit.Assert.assertNotNull(directionResolverResult0);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap0 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>();
        com.carrotsearch.hppc.IntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableIntObjectHashMap1 = strComparableGHIntObjectHashMap0.clone();
        com.graphhopper.routing.AStar.AStarEntry aStarEntry6 = new com.graphhopper.routing.AStar.AStarEntry((int) (byte) -1, 21, (double) (-4), (double) (short) 0);
        boolean boolean7 = strComparableIntObjectHashMap1.equals((java.lang.Object) aStarEntry6);
        org.junit.Assert.assertNotNull(strComparableIntObjectHashMap1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray0 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager1 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray0);
        com.graphhopper.storage.GraphBuilder graphBuilder2 = new com.graphhopper.storage.GraphBuilder(encodingManager1);
        java.util.List<com.graphhopper.storage.CHConfig> cHConfigList3 = null;
        com.graphhopper.storage.GraphBuilder graphBuilder4 = graphBuilder2.setCHConfigs(cHConfigList3);
        com.graphhopper.storage.CHConfig[] cHConfigArray5 = new com.graphhopper.storage.CHConfig[] {};
        java.util.ArrayList<com.graphhopper.storage.CHConfig> cHConfigList6 = new java.util.ArrayList<com.graphhopper.storage.CHConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.storage.CHConfig>) cHConfigList6, cHConfigArray5);
        com.graphhopper.storage.GraphBuilder graphBuilder8 = graphBuilder4.setCHConfigs((java.util.List<com.graphhopper.storage.CHConfig>) cHConfigList6);
        com.graphhopper.storage.GraphBuilder graphBuilder9 = graphBuilder8.setRAM();
        com.graphhopper.storage.GraphBuilder graphBuilder11 = graphBuilder8.set3D(true);
        org.junit.Assert.assertNotNull(flagEncoderArray0);
        org.junit.Assert.assertNotNull(encodingManager1);
        org.junit.Assert.assertNotNull(graphBuilder4);
        org.junit.Assert.assertNotNull(cHConfigArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(graphBuilder8);
        org.junit.Assert.assertNotNull(graphBuilder9);
        org.junit.Assert.assertNotNull(graphBuilder11);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.StorableProperties storableProperties4 = new com.graphhopper.storage.StorableProperties((com.graphhopper.storage.Directory) rAMDirectory1);
        com.graphhopper.storage.StorableProperties storableProperties7 = storableProperties4.put("_network$turn_cost", "1.8.0_251");
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(storableProperties7);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.carrotsearch.hppc.HashOrderMixingStrategy hashOrderMixingStrategy2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap3 = new com.graphhopper.coll.GHIntLongHashMap((int) (short) 10, (double) 2, hashOrderMixingStrategy2);
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.hppc.BufferAllocationException; message: The load factor should be in range [0.01, 0.99]: 2.000000");
        } catch (com.carrotsearch.hppc.BufferAllocationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.DataAccess dataAccess7 = rAMDirectory1.find("bike_network");
        com.graphhopper.storage.DAType dAType9 = com.graphhopper.storage.DAType.RAM_INT_STORE;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.Directory directory10 = rAMDirectory1.put("Oracle Corporation", dAType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Since 0.7 DataAccess objects does no longer accept upper case names");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
        org.junit.Assert.assertNotNull(dataAccess7);
        org.junit.Assert.assertNotNull(dAType9);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.graphhopper.routing.util.TestAlgoCollector testAlgoCollector1 = new com.graphhopper.routing.util.TestAlgoCollector("5.4.0-70-generic");
        java.lang.String str2 = testAlgoCollector1.toString();
        com.graphhopper.storage.RAMDirectory rAMDirectory4 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory5 = rAMDirectory4.create();
        java.nio.ByteOrder byteOrder6 = rAMDirectory4.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess8 = rAMDirectory4.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory9 = rAMDirectory4.create();
        long[] longArray15 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet16 = com.carrotsearch.hppc.LongHashSet.from(longArray15);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray17 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager18 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray17);
        com.graphhopper.storage.GraphBuilder graphBuilder19 = new com.graphhopper.storage.GraphBuilder(encodingManager18);
        boolean boolean20 = longHashSet16.equals((java.lang.Object) encodingManager18);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage23 = new com.graphhopper.storage.GraphHopperStorage(directory9, encodingManager18, false, true);
        com.graphhopper.routing.util.AllEdgesIterator allEdgesIterator24 = graphHopperStorage23.getAllEdges();
        com.graphhopper.routing.util.EncodingManager encodingManager25 = graphHopperStorage23.getEncodingManager();
        com.graphhopper.routing.util.TestAlgoCollector.AlgoHelperEntry algoHelperEntry26 = null;
        com.graphhopper.storage.index.Snap snap29 = new com.graphhopper.storage.index.Snap((double) (-1L), (double) (-1));
        com.graphhopper.storage.index.Snap[] snapArray30 = new com.graphhopper.storage.index.Snap[] { snap29 };
        java.util.ArrayList<com.graphhopper.storage.index.Snap> snapList31 = new java.util.ArrayList<com.graphhopper.storage.index.Snap>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.storage.index.Snap>) snapList31, snapArray30);
        com.graphhopper.routing.util.TestAlgoCollector.OneRun oneRun39 = new com.graphhopper.routing.util.TestAlgoCollector.OneRun((double) (byte) -1, Double.NaN, 0.0d, (double) 52L, (double) 35.0f, 35);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.TestAlgoCollector testAlgoCollector40 = testAlgoCollector1.assertDistance(encodingManager25, algoHelperEntry26, (java.util.List<com.graphhopper.storage.index.Snap>) snapList31, oneRun39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FOUND 0 ERRORS.\n" + "'", str2, "FOUND 0 ERRORS.\n");
        org.junit.Assert.assertNotNull(directory5);
        org.junit.Assert.assertNotNull(byteOrder6);
        org.junit.Assert.assertNotNull(dataAccess8);
        org.junit.Assert.assertNotNull(directory9);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet16);
        org.junit.Assert.assertNotNull(flagEncoderArray17);
        org.junit.Assert.assertNotNull(encodingManager18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(allEdgesIterator24);
        org.junit.Assert.assertNotNull(encodingManager25);
        org.junit.Assert.assertNotNull(snapArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.graphhopper.routing.ev.DefaultEncodedValueFactory defaultEncodedValueFactory0 = new com.graphhopper.routing.ev.DefaultEncodedValueFactory();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.EncodedValue encodedValue2 = defaultEncodedValueFactory0.create("FOUND 0 ERRORS.\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultEncodedValueFactory cannot find EncodedValue FOUND 0 ERRORS.?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.graphhopper.coll.MinHeapWithUpdate minHeapWithUpdate1 = new com.graphhopper.coll.MinHeapWithUpdate(21);
        int int2 = minHeapWithUpdate1.peekId();
        // The following exception was thrown during execution in test generation
        try {
            minHeapWithUpdate1.push(32, (float) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal id: 32, legal range: [0, 21[");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.graphhopper.coll.GHTBitSet gHTBitSet1 = new com.graphhopper.coll.GHTBitSet(0);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl3 = new com.graphhopper.coll.GHBitSetImpl((int) (short) 100);
        com.graphhopper.coll.GHBitSet gHBitSet4 = gHTBitSet1.copyTo((com.graphhopper.coll.GHBitSet) gHBitSetImpl3);
        int int6 = gHBitSetImpl3.nextClear((int) (byte) 100);
        gHBitSetImpl3.clear(20);
        java.lang.Object obj9 = gHBitSetImpl3.clone();
        org.junit.Assert.assertNotNull(gHBitSet4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "{}");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.graphhopper.GraphHopper graphHopper0 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        com.graphhopper.GraphHopper graphHopper2 = graphHopper0.setFlagEncoderFactory(flagEncoderFactory1);
        com.graphhopper.routing.lm.LMPreparationHandler lMPreparationHandler3 = graphHopper0.getLMPreparationHandler();
        // The following exception was thrown during execution in test generation
        try {
            graphHopper0.postProcessing();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphHopper2);
        org.junit.Assert.assertNotNull(lMPreparationHandler3);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        boolean boolean1 = com.graphhopper.routing.util.EncodingManager.isValidEncodedValue("1111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        com.graphhopper.storage.IntsRef intsRef14 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState20 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef14, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int21 = edgeIteratorState20.getEdge();
        virtualEdgeIteratorState11.setReverseEdge(edgeIteratorState20);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue23 = com.graphhopper.routing.ev.MaxSpeed.create();
        double double24 = virtualEdgeIteratorState11.get(decimalEncodedValue23);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState26 = virtualEdgeIteratorState11.setDistance((double) 35.0f);
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue29 = new com.graphhopper.routing.ev.StringEncodedValue("bike_network", 10);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState32 = virtualEdgeIteratorState11.set(stringEncodedValue29, "default", "default");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue bike_network supports only one direction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(decimalEncodedValue23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + Double.POSITIVE_INFINITY + "'", double24 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(edgeIteratorState26);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.graphhopper.util.DistanceCalc distanceCalc0 = com.graphhopper.util.DistanceCalcEarth.DIST_EARTH;
        double double2 = distanceCalc0.calcCircumference((double) 32);
        org.junit.Assert.assertNotNull(distanceCalc0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.394751250354173E7d + "'", double2 == 3.394751250354173E7d);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory6 = rAMDirectory1.create();
        long[] longArray12 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet13 = com.carrotsearch.hppc.LongHashSet.from(longArray12);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray14 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager15 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray14);
        com.graphhopper.storage.GraphBuilder graphBuilder16 = new com.graphhopper.storage.GraphBuilder(encodingManager15);
        boolean boolean17 = longHashSet13.equals((java.lang.Object) encodingManager15);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage20 = new com.graphhopper.storage.GraphHopperStorage(directory6, encodingManager15, false, true);
        com.graphhopper.routing.Path path21 = new com.graphhopper.routing.Path((com.graphhopper.storage.Graph) graphHopperStorage20);
        double double22 = path21.getDistance();
        com.carrotsearch.hppc.IntArrayList intArrayList23 = path21.getEdges();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
        org.junit.Assert.assertNotNull(directory6);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet13);
        org.junit.Assert.assertNotNull(flagEncoderArray14);
        org.junit.Assert.assertNotNull(encodingManager15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(intArrayList23);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.graphhopper.storage.RoutingCHGraph routingCHGraph0 = null;
        com.graphhopper.routing.ch.ShortcutUnpacker.Visitor visitor1 = null;
        com.graphhopper.routing.ch.ShortcutUnpacker shortcutUnpacker3 = new com.graphhopper.routing.ch.ShortcutUnpacker(routingCHGraph0, visitor1, false);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.locationtech.jts.geom.Polygon[] polygonArray0 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList1 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList1, polygonArray0);
        com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule germanySpatialRule3 = new com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList1);
        com.graphhopper.routing.ev.RoadClass roadClass4 = com.graphhopper.routing.ev.RoadClass.TRUNK;
        org.locationtech.jts.geom.Polygon[] polygonArray5 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList6 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList6, polygonArray5);
        com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule germanySpatialRule8 = new com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList6);
        com.graphhopper.storage.RAMDirectory rAMDirectory10 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory11 = rAMDirectory10.create();
        com.graphhopper.storage.DAType dAType12 = rAMDirectory10.getDefaultType();
        com.graphhopper.routing.ev.RoadClass roadClass13 = com.graphhopper.routing.ev.RoadClass.LIVING_STREET;
        boolean boolean14 = dAType12.equals((java.lang.Object) roadClass13);
        com.graphhopper.routing.util.TransportationMode transportationMode15 = com.graphhopper.routing.util.TransportationMode.MOTORCYCLE;
        double double17 = germanySpatialRule8.getMaxSpeed(roadClass13, transportationMode15, (double) 0.0f);
        com.graphhopper.routing.ev.RoadClass roadClass18 = com.graphhopper.routing.ev.RoadClass.SECONDARY;
        java.lang.String str19 = roadClass18.toString();
        com.graphhopper.routing.util.TransportationMode transportationMode20 = com.graphhopper.routing.util.TransportationMode.OTHER;
        double double22 = germanySpatialRule8.getMaxSpeed(roadClass18, transportationMode20, (double) 21);
        double double24 = germanySpatialRule3.getMaxSpeed(roadClass4, transportationMode20, (double) 35);
        org.junit.Assert.assertNotNull(polygonArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + roadClass4 + "' != '" + com.graphhopper.routing.ev.RoadClass.TRUNK + "'", roadClass4.equals(com.graphhopper.routing.ev.RoadClass.TRUNK));
        org.junit.Assert.assertNotNull(polygonArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(directory11);
        org.junit.Assert.assertNotNull(dAType12);
        org.junit.Assert.assertTrue("'" + roadClass13 + "' != '" + com.graphhopper.routing.ev.RoadClass.LIVING_STREET + "'", roadClass13.equals(com.graphhopper.routing.ev.RoadClass.LIVING_STREET));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + transportationMode15 + "' != '" + com.graphhopper.routing.util.TransportationMode.MOTORCYCLE + "'", transportationMode15.equals(com.graphhopper.routing.util.TransportationMode.MOTORCYCLE));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + roadClass18 + "' != '" + com.graphhopper.routing.ev.RoadClass.SECONDARY + "'", roadClass18.equals(com.graphhopper.routing.ev.RoadClass.SECONDARY));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "secondary" + "'", str19, "secondary");
        org.junit.Assert.assertTrue("'" + transportationMode20 + "' != '" + com.graphhopper.routing.util.TransportationMode.OTHER + "'", transportationMode20.equals(com.graphhopper.routing.util.TransportationMode.OTHER));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 21.0d + "'", double22 == 21.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 35.0d + "'", double24 == 35.0d);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager5, false);
        java.util.List<java.lang.String> strList8 = graphHopperStorage7.getCHGraphNames();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = 0; // flaky: graphHopperStorage7.getOtherNode((int) 'a', (int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(flagEncoderArray4);
        org.junit.Assert.assertNotNull(encodingManager5);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.graphhopper.coll.GHTBitSet gHTBitSet1 = new com.graphhopper.coll.GHTBitSet(0);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl3 = new com.graphhopper.coll.GHBitSetImpl((int) (short) 100);
        com.graphhopper.coll.GHBitSet gHBitSet4 = gHTBitSet1.copyTo((com.graphhopper.coll.GHBitSet) gHBitSetImpl3);
        int int6 = gHBitSetImpl3.nextClear((int) (byte) 100);
        java.lang.String str7 = gHBitSetImpl3.toString();
        org.junit.Assert.assertNotNull(gHBitSet4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.graphhopper.routing.ch.ShortcutFilter shortcutFilter0 = com.graphhopper.routing.ch.ShortcutFilter.allEdges();
        com.graphhopper.util.CHEdgeIteratorState cHEdgeIteratorState1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = shortcutFilter0.accept(cHEdgeIteratorState1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortcutFilter0);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.storage.DAType dAType3 = rAMDirectory1.getDefaultType();
        com.graphhopper.storage.RAMDirectory rAMDirectory6 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory7 = rAMDirectory6.create();
        com.graphhopper.storage.DAType dAType8 = rAMDirectory6.getDefaultType();
        com.graphhopper.storage.Directory directory9 = rAMDirectory1.put("foot", dAType8);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray10 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager11 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray10);
        com.graphhopper.storage.GraphBuilder graphBuilder12 = new com.graphhopper.storage.GraphBuilder(encodingManager11);
        java.util.List<com.graphhopper.storage.CHConfig> cHConfigList13 = null;
        com.graphhopper.storage.GraphBuilder graphBuilder14 = graphBuilder12.setCHConfigs(cHConfigList13);
        com.graphhopper.storage.CHConfig[] cHConfigArray15 = new com.graphhopper.storage.CHConfig[] {};
        java.util.ArrayList<com.graphhopper.storage.CHConfig> cHConfigList16 = new java.util.ArrayList<com.graphhopper.storage.CHConfig>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.storage.CHConfig>) cHConfigList16, cHConfigArray15);
        com.graphhopper.storage.GraphBuilder graphBuilder18 = graphBuilder14.setCHConfigs((java.util.List<com.graphhopper.storage.CHConfig>) cHConfigList16);
        com.graphhopper.storage.GraphBuilder graphBuilder19 = graphBuilder18.setRAM();
        boolean boolean20 = dAType8.equals((java.lang.Object) graphBuilder19);
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(dAType3);
        org.junit.Assert.assertNotNull(directory7);
        org.junit.Assert.assertNotNull(dAType8);
        org.junit.Assert.assertNotNull(directory9);
        org.junit.Assert.assertNotNull(flagEncoderArray10);
        org.junit.Assert.assertNotNull(encodingManager11);
        org.junit.Assert.assertNotNull(graphBuilder14);
        org.junit.Assert.assertNotNull(cHConfigArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(graphBuilder18);
        org.junit.Assert.assertNotNull(graphBuilder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager5, false);
        java.util.List<com.graphhopper.storage.CHConfig> cHConfigList8 = graphHopperStorage7.getCHConfigs();
        com.graphhopper.storage.RAMDirectory rAMDirectory10 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory11 = rAMDirectory10.create();
        com.graphhopper.storage.DAType dAType12 = rAMDirectory10.getDefaultType();
        com.graphhopper.storage.RAMDirectory rAMDirectory15 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory16 = rAMDirectory15.create();
        com.graphhopper.storage.DAType dAType17 = rAMDirectory15.getDefaultType();
        com.graphhopper.storage.Directory directory18 = rAMDirectory10.put("foot", dAType17);
        long[] longArray24 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet25 = com.carrotsearch.hppc.LongHashSet.from(longArray24);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray26 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager27 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray26);
        com.graphhopper.storage.GraphBuilder graphBuilder28 = new com.graphhopper.storage.GraphBuilder(encodingManager27);
        boolean boolean29 = longHashSet25.equals((java.lang.Object) encodingManager27);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage33 = new com.graphhopper.storage.GraphHopperStorage(directory18, encodingManager27, false, false, (-2));
        com.graphhopper.storage.Graph graph34 = com.graphhopper.util.GHUtility.copyTo((com.graphhopper.storage.Graph) graphHopperStorage7, (com.graphhopper.storage.Graph) graphHopperStorage33);
        graphHopperStorage7.freeze();
        java.util.Random random36 = null;
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue41 = com.graphhopper.util.EdgeIteratorState.UNFAVORED_EDGE;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue42 = com.graphhopper.routing.ev.MaxLength.create();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.GHUtility.buildRandomGraph((com.graphhopper.storage.Graph) graphHopperStorage7, random36, 35, (double) 'a', true, true, booleanEncodedValue41, decimalEncodedValue42, (java.lang.Double) 4.0024076802712575E7d, (double) 1001L, (double) 11, (double) 1048576);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(flagEncoderArray4);
        org.junit.Assert.assertNotNull(encodingManager5);
        org.junit.Assert.assertNotNull(cHConfigList8);
        org.junit.Assert.assertNotNull(directory11);
        org.junit.Assert.assertNotNull(dAType12);
        org.junit.Assert.assertNotNull(directory16);
        org.junit.Assert.assertNotNull(dAType17);
        org.junit.Assert.assertNotNull(directory18);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet25);
        org.junit.Assert.assertNotNull(flagEncoderArray26);
        org.junit.Assert.assertNotNull(encodingManager27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(graph34);
        org.junit.Assert.assertNotNull(booleanEncodedValue41);
        org.junit.Assert.assertNotNull(decimalEncodedValue42);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.graphhopper.routing.ev.Roundabout roundabout0 = new com.graphhopper.routing.ev.Roundabout();
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap3 = new com.graphhopper.coll.OSMIDMap(directory2);
        com.graphhopper.storage.StorableProperties storableProperties4 = new com.graphhopper.storage.StorableProperties(directory2);
        java.lang.String str5 = storableProperties4.toString();
        com.graphhopper.routing.DirectionResolverResult directionResolverResult9 = com.graphhopper.routing.DirectionResolverResult.onlyLeft((int) (byte) 0, (int) '#');
        boolean boolean10 = directionResolverResult9.isImpossible();
        int int11 = directionResolverResult9.getInEdgeLeft();
        com.graphhopper.storage.StorableProperties storableProperties12 = storableProperties4.put("1.8.0_251|node-based", (java.lang.Object) directionResolverResult9);
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "prepare.ch.node.original_edge_count_weight/properties" + "'", str5, "prepare.ch.node.original_edge_count_weight/properties");
        org.junit.Assert.assertNotNull(directionResolverResult9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(storableProperties12);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager5, false);
        java.util.List<com.graphhopper.storage.CHConfig> cHConfigList8 = graphHopperStorage7.getCHConfigs();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState10 = null; // flaky: graphHopperStorage7.getEdgeIteratorStateForKey(1687814340);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(flagEncoderArray4);
        org.junit.Assert.assertNotNull(encodingManager5);
        org.junit.Assert.assertNotNull(cHConfigList8);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.graphhopper.routing.util.FlagEncoder flagEncoder0 = null;
        com.graphhopper.storage.TurnCostStorage turnCostStorage1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.DefaultTurnCostProvider defaultTurnCostProvider3 = new com.graphhopper.routing.weighting.DefaultTurnCostProvider(flagEncoder0, turnCostStorage1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No storage set to calculate turn weight");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.graphhopper.reader.dem.SRTMGL1Provider sRTMGL1Provider0 = new com.graphhopper.reader.dem.SRTMGL1Provider();
        sRTMGL1Provider0.setAutoRemoveTemporaryFiles(false);
        java.lang.String str3 = sRTMGL1Provider0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "srtmgl1" + "'", str3, "srtmgl1");
    }
}
