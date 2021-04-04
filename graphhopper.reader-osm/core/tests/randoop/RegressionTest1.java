import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        com.graphhopper.routing.SPTEntry sPTEntry3 = new com.graphhopper.routing.SPTEntry(3, (-4), (double) 1001L);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator5 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray6 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator5 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap7 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray1, edgeIteratorArray6);
        int[] intArray8 = edgeIteratorIntObjectHashMap7.keys;
        int int10 = edgeIteratorIntObjectHashMap7.indexOf(4);
        com.graphhopper.util.EdgeIterator edgeIterator12 = edgeIteratorIntObjectHashMap7.get((int) (byte) 1);
        edgeIteratorIntObjectHashMap7.clear();
        int int14 = edgeIteratorIntObjectHashMap7.size();
        boolean boolean16 = edgeIteratorIntObjectHashMap7.indexExists((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(edgeIteratorArray6);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0, 0]");
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-3) + "'", int10 == (-3));
        org.junit.Assert.assertNull(edgeIterator12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
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
        int[] intArray15 = intHashSet14.toArray();
        com.graphhopper.routing.ev.HazmatTunnel hazmatTunnel16 = com.graphhopper.routing.ev.HazmatTunnel.D;
        boolean boolean17 = intHashSet14.equals((java.lang.Object) hazmatTunnel16);
        java.util.Spliterator<com.carrotsearch.hppc.cursors.IntCursor> intCursorSpliterator18 = intHashSet14.spliterator();
        com.carrotsearch.hppc.predicates.IntPredicate intPredicate19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = intHashSet14.retainAll(intPredicate19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap9);
        org.junit.Assert.assertNotNull(edgeIteratorArray11);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100]");
        org.junit.Assert.assertNotNull(intHashSet14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100]");
        org.junit.Assert.assertTrue("'" + hazmatTunnel16 + "' != '" + com.graphhopper.routing.ev.HazmatTunnel.D + "'", hazmatTunnel16.equals(com.graphhopper.routing.ev.HazmatTunnel.D));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intCursorSpliterator18);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue1 = null;
        com.graphhopper.util.details.DecimalDetails decimalDetails4 = new com.graphhopper.util.details.DecimalDetails("", decimalEncodedValue1, "hi!", (double) (short) 0);
        java.util.Map.Entry<java.lang.String, java.util.List<com.graphhopper.util.details.PathDetail>> strEntry5 = decimalDetails4.build();
        java.util.Map.Entry<java.lang.String, java.util.List<com.graphhopper.util.details.PathDetail>> strEntry6 = decimalDetails4.build();
        java.util.Map.Entry<java.lang.String, java.util.List<com.graphhopper.util.details.PathDetail>> strEntry7 = decimalDetails4.build();
        org.junit.Assert.assertNotNull(strEntry5);
        org.junit.Assert.assertNotNull(strEntry6);
        org.junit.Assert.assertNotNull(strEntry7);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.graphhopper.util.DistancePlaneProjection distancePlaneProjection0 = new com.graphhopper.util.DistancePlaneProjection();
        boolean boolean3 = distancePlaneProjection0.isDateLineCrossOver((double) (byte) 100, (double) 10);
        com.graphhopper.util.PointList pointList4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double5 = distancePlaneProjection0.calcDistance(pointList4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.graphhopper.storage.NodeAccess nodeAccess0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator2 = new com.graphhopper.routing.weighting.BeelineWeightApproximator(nodeAccess0, weighting1);
        com.graphhopper.routing.weighting.BalancedWeightApproximator balancedWeightApproximator3 = new com.graphhopper.routing.weighting.BalancedWeightApproximator((com.graphhopper.routing.weighting.WeightApproximator) beelineWeightApproximator2);
        java.lang.String str4 = balancedWeightApproximator3.toString();
        java.lang.String str5 = balancedWeightApproximator3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "beeline" + "'", str4, "beeline");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "beeline" + "'", str5, "beeline");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.BIG;
        long long3 = bitUtil0.toLong((int) (byte) 100, 3);
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) -1, (byte) 100 };
        bitUtil0.fromInt(byteArray10, (int) '4');
        java.lang.String str15 = bitUtil0.toLastBitString((long) '#', (int) (byte) 100);
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 429496729603L + "'", long3 == 429496729603L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 0, 52, -1, 100]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0000000000000000000000000000001000110000000000000000000000000000000000000000000000000000000000000000" + "'", str15, "0000000000000000000000000000001000110000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.graphhopper.util.shapes.BBox bBox7 = new com.graphhopper.util.shapes.BBox((double) 1, 0.0d, (double) 0, (double) (-919338616), (double) (short) -1, (double) 0L, false);
        bBox7.maxLat = (short) 100;
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage0 = null;
        com.graphhopper.routing.subnetwork.PrepareRoutingSubnetworks.PrepareJob[] prepareJobArray1 = new com.graphhopper.routing.subnetwork.PrepareRoutingSubnetworks.PrepareJob[] {};
        java.util.ArrayList<com.graphhopper.routing.subnetwork.PrepareRoutingSubnetworks.PrepareJob> prepareJobList2 = new java.util.ArrayList<com.graphhopper.routing.subnetwork.PrepareRoutingSubnetworks.PrepareJob>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.subnetwork.PrepareRoutingSubnetworks.PrepareJob>) prepareJobList2, prepareJobArray1);
        com.graphhopper.routing.subnetwork.PrepareRoutingSubnetworks prepareRoutingSubnetworks4 = new com.graphhopper.routing.subnetwork.PrepareRoutingSubnetworks(graphHopperStorage0, (java.util.List<com.graphhopper.routing.subnetwork.PrepareRoutingSubnetworks.PrepareJob>) prepareJobList2);
        // The following exception was thrown during execution in test generation
        try {
            prepareRoutingSubnetworks4.doWork();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(prepareJobArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.graphhopper.util.shapes.BBox bBox4 = new com.graphhopper.util.shapes.BBox((double) 10, (double) 35L, (double) 0, (double) (-4));
        double double5 = bBox4.minLon;
        double double6 = bBox4.minLat;
        bBox4.maxEle = '4';
        org.locationtech.jts.geom.Envelope envelope9 = com.graphhopper.util.shapes.BBox.toEnvelope(bBox4);
        com.graphhopper.util.PointList pointList10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = bBox4.intersects(pointList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(envelope9);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        com.graphhopper.search.StringIndex stringIndex2 = new com.graphhopper.search.StringIndex((com.graphhopper.storage.Directory) rAMDirectory1);
        boolean boolean3 = stringIndex2.loadExisting();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap5 = null; // flaky: stringIndex2.getAll((long) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator5 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray6 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator5 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap7 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray1, edgeIteratorArray6);
        int[] intArray8 = edgeIteratorIntObjectHashMap7.keys;
        int int10 = edgeIteratorIntObjectHashMap7.indexOf(4);
        com.graphhopper.util.EdgeIterator edgeIterator12 = edgeIteratorIntObjectHashMap7.get((int) (byte) 1);
        edgeIteratorIntObjectHashMap7.clear();
        java.lang.String str14 = edgeIteratorIntObjectHashMap7.toString();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(edgeIteratorArray6);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0, 0]");
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4) + "'", int10 == (-4));
        org.junit.Assert.assertNull(edgeIterator12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            int int1 = com.graphhopper.util.GHUtility.count((com.graphhopper.util.EdgeIterator) disabledEdgeIterator0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMRoadClassParser> oSMRoadClassParserGHObjectIntHashMap0 = new com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMRoadClassParser>();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        com.graphhopper.routing.AlternativeRoute.PlateauInfo plateauInfo7 = new com.graphhopper.routing.AlternativeRoute.PlateauInfo("custom_network", (java.util.List<java.lang.Integer>) intList5);
        boolean boolean8 = oSMRoadClassParserGHObjectIntHashMap0.equals((java.lang.Object) plateauInfo7);
        oSMRoadClassParserGHObjectIntHashMap0.ensureCapacity((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        com.graphhopper.routing.util.FlagEncoder flagEncoder0 = null;
        com.graphhopper.util.PMap pMap1 = null;
        com.graphhopper.routing.weighting.TurnCostProvider turnCostProvider2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.ShortFastestWeighting shortFastestWeighting3 = new com.graphhopper.routing.weighting.ShortFastestWeighting(flagEncoder0, pMap1, turnCostProvider2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.graphhopper.storage.IntsRef intsRef1 = null;
        com.graphhopper.util.EdgeIteratorState edgeIteratorState7 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) (byte) 100, intsRef1, (int) (short) -1, (int) (short) 100, (-4), (int) (byte) 0, 3);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue8 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState10 = edgeIteratorState7.setReverse(decimalEncodedValue8, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorState7);
        org.junit.Assert.assertNotNull(decimalEncodedValue8);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.graphhopper.reader.dem.CGIARProvider cGIARProvider0 = new com.graphhopper.reader.dem.CGIARProvider();
        java.lang.String str1 = cGIARProvider0.toString();
        cGIARProvider0.setInterpolate(true);
        double double6 = cGIARProvider0.getEle(0.4317460358142853d, (double) (byte) 1);
        com.graphhopper.reader.dem.ElevationProvider elevationProvider8 = cGIARProvider0.setBaseURL("1.8.0_251");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cgiar" + "'", str1, "cgiar");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(elevationProvider8);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        com.graphhopper.util.MiniPerfTest miniPerfTest0 = new com.graphhopper.util.MiniPerfTest();
        com.graphhopper.util.MiniPerfTest.Task task1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.MiniPerfTest miniPerfTest2 = miniPerfTest0.start(task1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue2 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.util.details.BooleanDetails booleanDetails3 = new com.graphhopper.util.details.BooleanDetails("get_off_bike", booleanEncodedValue2);
        com.graphhopper.routing.weighting.TurnCostProvider turnCostProvider4 = null;
        com.graphhopper.routing.subnetwork.PrepareRoutingSubnetworks.PrepareJob prepareJob5 = new com.graphhopper.routing.subnetwork.PrepareRoutingSubnetworks.PrepareJob("prepare.ch.edge.witness_search.min_max_settled_edges", booleanEncodedValue2, turnCostProvider4);
        int int6 = booleanEncodedValue2.getVersion();
        org.junit.Assert.assertNotNull(booleanEncodedValue2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        java.lang.String str0 = com.graphhopper.routing.ev.Roundabout.KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "roundabout" + "'", str0, "roundabout");
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        com.graphhopper.util.Unzipper unzipper0 = new com.graphhopper.util.Unzipper();
        java.io.InputStream inputStream1 = null;
        java.io.File file2 = null;
        com.graphhopper.util.ProgressListener progressListener3 = null;
        // The following exception was thrown during execution in test generation
        try {
            unzipper0.unzip(inputStream1, file2, progressListener3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator5 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray6 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator5 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap7 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray1, edgeIteratorArray6);
        int[] intArray9 = new int[] { 100 };
        long[] longArray11 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap12 = com.carrotsearch.hppc.IntLongHashMap.from(intArray9, longArray11);
        int[] intArray14 = new int[] { 100 };
        long[] longArray16 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap17 = com.carrotsearch.hppc.IntLongHashMap.from(intArray14, longArray16);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator18 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray19 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator18 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap20 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray14, edgeIteratorArray19);
        int[] intArray21 = com.graphhopper.util.ArrayUtil.merge(intArray9, intArray14);
        com.graphhopper.storage.IntsRef intsRef24 = new com.graphhopper.storage.IntsRef(intArray9, (int) (short) 0, 0);
        int[] intArray26 = new int[] { 100 };
        long[] longArray28 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap29 = com.carrotsearch.hppc.IntLongHashMap.from(intArray26, longArray28);
        int[] intArray31 = new int[] { 100 };
        long[] longArray33 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap34 = com.carrotsearch.hppc.IntLongHashMap.from(intArray31, longArray33);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator35 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray36 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator35 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap37 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray31, edgeIteratorArray36);
        int[] intArray38 = com.graphhopper.util.ArrayUtil.merge(intArray26, intArray31);
        int[] intArray39 = com.graphhopper.util.ArrayUtil.merge(intArray9, intArray31);
        int[] intArray40 = com.graphhopper.util.ArrayUtil.merge(intArray1, intArray9);
        int[] intArray44 = new int[] { ' ', (byte) 100, 2 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray45 = com.graphhopper.util.ArrayUtil.applyOrder(intArray1, intArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: sort order must not be shorter than array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(edgeIteratorArray6);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap17);
        org.junit.Assert.assertNotNull(edgeIteratorArray19);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap34);
        org.junit.Assert.assertNotNull(edgeIteratorArray36);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap37);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[32, 100, 2]");
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        com.graphhopper.util.TranslationMap translationMap0 = new com.graphhopper.util.TranslationMap();
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.Translation translation2 = translationMap0.getWithFallBack(locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        com.graphhopper.storage.RoutingCHGraph routingCHGraph0 = null;
        com.graphhopper.routing.querygraph.QueryGraph queryGraph1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ch.CHRoutingAlgorithmFactory cHRoutingAlgorithmFactory2 = new com.graphhopper.routing.ch.CHRoutingAlgorithmFactory(routingCHGraph0, queryGraph1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap0 = new com.graphhopper.coll.GHIntLongHashMap();
        int[] intArray1 = gHIntLongHashMap0.keys;
        long long4 = gHIntLongHashMap0.getOrDefault((-2), 1L);
        com.carrotsearch.hppc.IntLongHashMap.KeysContainer keysContainer5 = gHIntLongHashMap0.keys();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(keysContainer5);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        com.graphhopper.coll.GHSortedCollection gHSortedCollection0 = new com.graphhopper.coll.GHSortedCollection();
        // The following exception was thrown during execution in test generation
        try {
            gHSortedCollection0.update((-919338616), (-919338616), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: cannot remove key -919338616 with value -919338616 - did you insert -919338616,-919338616 before?");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage0 = null;
        com.graphhopper.storage.RAMDirectory rAMDirectory2 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder3 = rAMDirectory2.getByteOrder();
        com.graphhopper.storage.Directory directory4 = rAMDirectory2.create();
        com.graphhopper.routing.lm.LMConfig lMConfig5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.lm.LandmarkStorage landmarkStorage7 = new com.graphhopper.routing.lm.LandmarkStorage(graphHopperStorage0, (com.graphhopper.storage.Directory) rAMDirectory2, lMConfig5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(directory4);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        com.graphhopper.util.GitInfo gitInfo5 = new com.graphhopper.util.GitInfo("1.8.0_251", "[]", "[10]", "{mtb=get_off_bike}", false);
        java.lang.String str6 = gitInfo5.getCommitMessage();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[10]" + "'", str6, "[10]");
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.graphhopper.coll.GHTBitSet gHTBitSet1 = new com.graphhopper.coll.GHTBitSet(0);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl2 = new com.graphhopper.coll.GHBitSetImpl();
        int int4 = gHBitSetImpl2.previousClearBit(0);
        gHBitSetImpl2.clear();
        int int7 = gHBitSetImpl2.next((int) (short) 0);
        com.graphhopper.coll.GHBitSet gHBitSet8 = gHTBitSet1.copyTo((com.graphhopper.coll.GHBitSet) gHBitSetImpl2);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = gHTBitSet1.next(201);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported yet.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(gHBitSet8);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        com.graphhopper.routing.ev.RouteNetwork routeNetwork0 = com.graphhopper.routing.ev.RouteNetwork.NATIONAL;
        org.junit.Assert.assertTrue("'" + routeNetwork0 + "' != '" + com.graphhopper.routing.ev.RouteNetwork.NATIONAL + "'", routeNetwork0.equals(com.graphhopper.routing.ev.RouteNetwork.NATIONAL));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue1 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState3 = disabledEdgeIterator0.setReverse(decimalEncodedValue1, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(decimalEncodedValue1);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        com.graphhopper.storage.NodeAccess nodeAccess0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator2 = new com.graphhopper.routing.weighting.BeelineWeightApproximator(nodeAccess0, weighting1);
        double double3 = beelineWeightApproximator2.getSlack();
        com.graphhopper.routing.weighting.WeightApproximator weightApproximator4 = beelineWeightApproximator2.reverse();
        double double5 = beelineWeightApproximator2.getSlack();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(weightApproximator4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        com.graphhopper.storage.DAType dAType0 = com.graphhopper.storage.DAType.RAM_STORE;
        boolean boolean1 = dAType0.isInMemory();
        org.junit.Assert.assertNotNull(dAType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.BIG;
        byte[] byteArray2 = bitUtil0.fromFloat((float) 0);
        int[] intArray4 = new int[] { 100 };
        long[] longArray6 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap7 = com.carrotsearch.hppc.IntLongHashMap.from(intArray4, longArray6);
        int[] intArray9 = new int[] { 100 };
        long[] longArray11 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap12 = com.carrotsearch.hppc.IntLongHashMap.from(intArray9, longArray11);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator13 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray14 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator13 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap15 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray9, edgeIteratorArray14);
        int[] intArray16 = com.graphhopper.util.ArrayUtil.merge(intArray4, intArray9);
        com.graphhopper.storage.IntsRef intsRef19 = new com.graphhopper.storage.IntsRef(intArray4, (int) (short) 0, 0);
        com.graphhopper.storage.IntsRef intsRef20 = com.graphhopper.storage.IntsRef.EMPTY;
        boolean boolean21 = intsRef19.intsEquals(intsRef20);
        java.lang.String str22 = bitUtil0.toBitString(intsRef20);
        boolean boolean23 = intsRef20.isEmpty();
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap12);
        org.junit.Assert.assertNotNull(edgeIteratorArray14);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100]");
        org.junit.Assert.assertNotNull(intsRef20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        com.graphhopper.routing.util.TestAlgoCollector.OneRun oneRun0 = new com.graphhopper.routing.util.TestAlgoCollector.OneRun();
        java.lang.String str1 = oneRun0.toString();
        java.lang.String str2 = oneRun0.toString();
        java.lang.String str3 = oneRun0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.util.PathMerger pathMerger2 = new com.graphhopper.util.PathMerger(graph0, weighting1);
        com.graphhopper.util.PathMerger pathMerger4 = pathMerger2.setCalcPoints(true);
        com.graphhopper.util.details.PathDetailsBuilderFactory pathDetailsBuilderFactory5 = new com.graphhopper.util.details.PathDetailsBuilderFactory();
        java.util.List<java.lang.String> strList6 = null;
        com.graphhopper.util.PathMerger pathMerger7 = pathMerger2.setPathDetailsBuilders(pathDetailsBuilderFactory5, strList6);
        pathMerger7.setFavoredHeading((double) 4);
        com.graphhopper.util.DouglasPeucker douglasPeucker10 = null;
        com.graphhopper.util.PathMerger pathMerger11 = pathMerger7.setDouglasPeucker(douglasPeucker10);
        org.junit.Assert.assertNotNull(pathMerger4);
        org.junit.Assert.assertNotNull(pathMerger7);
        org.junit.Assert.assertNotNull(pathMerger11);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        com.graphhopper.util.PMap pMap1 = null;
        com.graphhopper.routing.weighting.Weighting weighting2 = null;
        com.graphhopper.storage.NodeAccess nodeAccess3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.WeightApproximator weightApproximator4 = com.graphhopper.routing.RoutingAlgorithmFactorySimple.getApproximation("roundabout|version=283388307|bits=1|index=0|shift=0|store_both_directions=false,road_class|version=2007543510|bits=5|index=0|shift=1|store_both_directions=false,road_class_link|version=146075245|bits=1|index=0|shift=6|store_both_directions=false,road_environment|version=-446726394|bits=3|index=0|shift=7|store_both_directions=false,max_speed|version=-1300485567|bits=5|index=0|shift=10|store_both_directions=true,road_access|version=-313723172|bits=4|index=0|shift=20|store_both_directions=false", pMap1, weighting2, nodeAccess3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        com.graphhopper.routing.util.parsers.OSMRoadEnvironmentParser oSMRoadEnvironmentParser0 = new com.graphhopper.routing.util.parsers.OSMRoadEnvironmentParser();
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        com.graphhopper.reader.dem.MultiSourceElevationProvider multiSourceElevationProvider0 = new com.graphhopper.reader.dem.MultiSourceElevationProvider();
        multiSourceElevationProvider0.release();
        multiSourceElevationProvider0.setInterpolate(true);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap0 = new com.graphhopper.coll.GHIntLongHashMap();
        long long3 = gHIntLongHashMap0.addTo((int) (short) -1, (long) '4');
        com.carrotsearch.hppc.LongCollection longCollection4 = gHIntLongHashMap0.values();
        long long6 = gHIntLongHashMap0.remove((int) (short) 0);
        long[] longArray7 = gHIntLongHashMap0.values;
        java.util.Spliterator<com.carrotsearch.hppc.cursors.IntLongCursor> intLongCursorSpliterator8 = gHIntLongHashMap0.spliterator();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(longCollection4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0, 0, 0, 52, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intLongCursorSpliterator8);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue1 = null;
        com.graphhopper.util.details.DecimalDetails decimalDetails4 = new com.graphhopper.util.details.DecimalDetails("", decimalEncodedValue1, "hi!", (double) (short) 0);
        java.util.Map.Entry<java.lang.String, java.util.List<com.graphhopper.util.details.PathDetail>> strEntry5 = decimalDetails4.build();
        com.graphhopper.storage.IntsRef intsRef7 = com.graphhopper.routing.ev.TurnCost.createFlags();
        com.graphhopper.util.EdgeIteratorState edgeIteratorState13 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState(3.6461703979660586E12d, intsRef7, (int) (short) 1, (int) (byte) 100, 35, (-2), (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = decimalDetails4.isEdgeDifferentToLastEdge(edgeIteratorState13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strEntry5);
        org.junit.Assert.assertNotNull(intsRef7);
        org.junit.Assert.assertNotNull(edgeIteratorState13);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
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
        int[] intArray15 = intHashSet14.toArray();
        com.graphhopper.routing.ev.HazmatTunnel hazmatTunnel16 = com.graphhopper.routing.ev.HazmatTunnel.D;
        boolean boolean17 = intHashSet14.equals((java.lang.Object) hazmatTunnel16);
        boolean boolean19 = intHashSet14.contains(35);
        boolean boolean20 = intHashSet14.isEmpty();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap9);
        org.junit.Assert.assertNotNull(edgeIteratorArray11);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100]");
        org.junit.Assert.assertNotNull(intHashSet14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100]");
        org.junit.Assert.assertTrue("'" + hazmatTunnel16 + "' != '" + com.graphhopper.routing.ev.HazmatTunnel.D + "'", hazmatTunnel16.equals(com.graphhopper.routing.ev.HazmatTunnel.D));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        com.graphhopper.util.SimpleIntDeque simpleIntDeque1 = new com.graphhopper.util.SimpleIntDeque((int) 'a');
        java.lang.String str2 = simpleIntDeque1.toString();
        java.lang.String str3 = simpleIntDeque1.toString();
        java.lang.String str4 = simpleIntDeque1.toString();
        java.lang.String str5 = simpleIntDeque1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue2 = com.graphhopper.routing.ev.TurnCost.create("profiles:\nprofiles_ch:\nprofiles_lm:\nproperties:\n", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue name wasn't valid: profiles:?profiles_ch:?profiles_lm:?properties:?$turn_cost. Use lower case letters, underscore and numbers only.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("profiles:\nprofiles_ch:\nprofiles_lm:\nproperties:\n");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        com.graphhopper.routing.weighting.Weighting weighting0 = null;
        com.graphhopper.storage.IntsRef intsRef2 = null;
        com.graphhopper.util.EdgeIteratorState edgeIteratorState8 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) (byte) 100, intsRef2, (int) (short) -1, (int) (short) 100, (-4), (int) (byte) 0, 3);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = com.graphhopper.util.GHUtility.calcWeightWithTurnWeight(weighting0, edgeIteratorState8, false, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorState8);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        com.carrotsearch.hppc.IntArrayList intArrayList2 = com.graphhopper.util.ArrayUtil.constant((int) (short) 1, (-2));
        org.junit.Assert.assertNotNull(intArrayList2);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        com.graphhopper.util.DistancePlaneProjection distancePlaneProjection0 = com.graphhopper.util.DistancePlaneProjection.DIST_PLANE;
        double double2 = distancePlaneProjection0.calcCircumference(0.0d);
        double double7 = distancePlaneProjection0.calcDist(111194.92664455873d, (double) (-1.0f), (double) 4, (double) '4');
        double double14 = distancePlaneProjection0.calcDist3D((double) 100.0f, 4380115.099104042d, (double) (short) 10, 0.5868240888334652d, (double) 2, (double) 4);
        org.junit.Assert.assertNotNull(distancePlaneProjection0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.003017359204114E7d + "'", double2 == 4.003017359204114E7d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.236386816348098E10d + "'", double7 == 1.236386816348098E10d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.111526225891241E11d + "'", double14 == 3.111526225891241E11d);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.locationtech.jts.geom.Polygon[] polygonArray0 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList1 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList1, polygonArray0);
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule3 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList1);
        int int4 = austriaSpatialRule3.getPriority();
        com.graphhopper.routing.ev.RoadClass roadClass5 = com.graphhopper.routing.ev.RoadClass.PATH;
        com.graphhopper.routing.util.TransportationMode transportationMode6 = com.graphhopper.routing.util.TransportationMode.BIKE;
        double double8 = austriaSpatialRule3.getMaxSpeed(roadClass5, transportationMode6, (double) (-4));
        com.graphhopper.routing.ev.RoadClass roadClass9 = com.graphhopper.routing.ev.RoadClass.ROAD;
        com.graphhopper.routing.util.TransportationMode transportationMode10 = com.graphhopper.routing.util.TransportationMode.BIKE;
        double double12 = austriaSpatialRule3.getMaxSpeed(roadClass9, transportationMode10, (double) 0);
        boolean boolean13 = transportationMode10.isMotorVehicle();
        org.junit.Assert.assertNotNull(polygonArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + roadClass5 + "' != '" + com.graphhopper.routing.ev.RoadClass.PATH + "'", roadClass5.equals(com.graphhopper.routing.ev.RoadClass.PATH));
        org.junit.Assert.assertTrue("'" + transportationMode6 + "' != '" + com.graphhopper.routing.util.TransportationMode.BIKE + "'", transportationMode6.equals(com.graphhopper.routing.util.TransportationMode.BIKE));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-4.0d) + "'", double8 == (-4.0d));
        org.junit.Assert.assertTrue("'" + roadClass9 + "' != '" + com.graphhopper.routing.ev.RoadClass.ROAD + "'", roadClass9.equals(com.graphhopper.routing.ev.RoadClass.ROAD));
        org.junit.Assert.assertTrue("'" + transportationMode10 + "' != '" + com.graphhopper.routing.util.TransportationMode.BIKE + "'", transportationMode10.equals(com.graphhopper.routing.util.TransportationMode.BIKE));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        com.graphhopper.routing.util.DefaultFlagEncoderFactory defaultFlagEncoderFactory0 = new com.graphhopper.routing.util.DefaultFlagEncoderFactory();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.EncodingManager encodingManager2 = com.graphhopper.routing.util.EncodingManager.create((com.graphhopper.routing.util.FlagEncoderFactory) defaultFlagEncoderFactory0, "3.0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: entry in encoder list not supported 3.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        com.graphhopper.util.PMap pMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.WheelchairFlagEncoder wheelchairFlagEncoder1 = new com.graphhopper.routing.util.WheelchairFlagEncoder(pMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        com.graphhopper.util.shapes.BBox bBox4 = new com.graphhopper.util.shapes.BBox((double) 10, (double) 35L, (double) 0, (double) (-4));
        double double5 = bBox4.minLon;
        double double6 = bBox4.minLat;
        com.graphhopper.util.shapes.BBox bBox7 = bBox4.getBounds();
        double double8 = bBox4.maxLat;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(bBox7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-4.0d) + "'", double8 == (-4.0d));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        int[] intArray6 = new int[] { 100 };
        long[] longArray8 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap9 = com.carrotsearch.hppc.IntLongHashMap.from(intArray6, longArray8);
        com.carrotsearch.hppc.LongLongHashMap longLongHashMap10 = com.carrotsearch.hppc.LongLongHashMap.from(longArray3, longArray8);
        long[] longArray12 = new long[] { 10 };
        com.carrotsearch.hppc.LongHashSet longHashSet13 = com.carrotsearch.hppc.LongHashSet.from(longArray12);
        int int14 = longLongHashMap10.removeAll((com.carrotsearch.hppc.LongContainer) longHashSet13);
        int int15 = longLongHashMap10.size();
        longLongHashMap10.release();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap9);
        org.junit.Assert.assertNotNull(longLongHashMap10);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[10]");
        org.junit.Assert.assertNotNull(longHashSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        com.graphhopper.util.shapes.BBox bBox4 = new com.graphhopper.util.shapes.BBox((double) 10, (double) 35L, (double) 0, (double) (-4));
        double double5 = bBox4.minLon;
        bBox4.maxLon = '#';
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap1 = new com.graphhopper.coll.GHLongLongHashMap(3);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = 0L; // flaky: gHLongLongHashMap1.indexReplace((int) (short) -1, (long) (-885860508));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        com.graphhopper.util.EdgeIterator.Edge edge0 = new com.graphhopper.util.EdgeIterator.Edge();
        com.graphhopper.util.EdgeIterator.Edge edge1 = new com.graphhopper.util.EdgeIterator.Edge();
        com.graphhopper.util.EdgeIterator.Edge edge2 = new com.graphhopper.util.EdgeIterator.Edge();
        com.graphhopper.util.EdgeIterator.Edge edge3 = new com.graphhopper.util.EdgeIterator.Edge();
        com.graphhopper.util.EdgeIterator.Edge edge4 = new com.graphhopper.util.EdgeIterator.Edge();
        com.graphhopper.util.EdgeIterator.Edge edge5 = new com.graphhopper.util.EdgeIterator.Edge();
        com.graphhopper.util.EdgeIterator.Edge[] edgeArray6 = new com.graphhopper.util.EdgeIterator.Edge[] { edge0, edge1, edge2, edge3, edge4, edge5 };
        int[] intArray8 = new int[] { 100 };
        long[] longArray10 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap11 = com.carrotsearch.hppc.IntLongHashMap.from(intArray8, longArray10);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator12 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray13 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator12 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap14 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray8, edgeIteratorArray13);
        int[] intArray16 = new int[] { 100 };
        long[] longArray18 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap19 = com.carrotsearch.hppc.IntLongHashMap.from(intArray16, longArray18);
        int[] intArray21 = new int[] { 100 };
        long[] longArray23 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap24 = com.carrotsearch.hppc.IntLongHashMap.from(intArray21, longArray23);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator25 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray26 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator25 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap27 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray21, edgeIteratorArray26);
        int[] intArray28 = com.graphhopper.util.ArrayUtil.merge(intArray16, intArray21);
        com.graphhopper.storage.IntsRef intsRef31 = new com.graphhopper.storage.IntsRef(intArray16, (int) (short) 0, 0);
        int[] intArray33 = new int[] { 100 };
        long[] longArray35 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap36 = com.carrotsearch.hppc.IntLongHashMap.from(intArray33, longArray35);
        int[] intArray38 = new int[] { 100 };
        long[] longArray40 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap41 = com.carrotsearch.hppc.IntLongHashMap.from(intArray38, longArray40);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator42 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray43 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator42 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap44 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray38, edgeIteratorArray43);
        int[] intArray45 = com.graphhopper.util.ArrayUtil.merge(intArray33, intArray38);
        int[] intArray46 = com.graphhopper.util.ArrayUtil.merge(intArray16, intArray38);
        int[] intArray47 = com.graphhopper.util.ArrayUtil.merge(intArray8, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            com.carrotsearch.hppc.ObjectIntHashMap<com.graphhopper.util.EdgeIterator.Edge> edgeObjectIntHashMap48 = com.carrotsearch.hppc.ObjectIntHashMap.from(edgeArray6, intArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arrays of keys and values must have an identical length.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap11);
        org.junit.Assert.assertNotNull(edgeIteratorArray13);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap24);
        org.junit.Assert.assertNotNull(edgeIteratorArray26);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap36);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap41);
        org.junit.Assert.assertNotNull(edgeIteratorArray43);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap44);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[100]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[100]");
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator5 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray6 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator5 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap7 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray1, edgeIteratorArray6);
        int[] intArray8 = edgeIteratorIntObjectHashMap7.keys;
        java.lang.String str10 = edgeIteratorIntObjectHashMap7.visualizeKeyDistribution(100);
        boolean boolean12 = edgeIteratorIntObjectHashMap7.equals((java.lang.Object) "mtb");
        int[] intArray13 = edgeIteratorIntObjectHashMap7.keys;
        com.carrotsearch.hppc.ObjectCollection<com.graphhopper.util.EdgeIterator> edgeIteratorObjectCollection14 = edgeIteratorIntObjectHashMap7.values();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(edgeIteratorArray6);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap7);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, 0, 0, 0]");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".X..                                                                                                " + "'", str10, ".X..                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(intArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 100, 0, 0, 0]");
        org.junit.Assert.assertNotNull(edgeIteratorObjectCollection14);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType0 = com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY;
        java.util.Calendar calendar1 = com.graphhopper.reader.osm.conditional.DateRangeParser.createCalendar();
        com.graphhopper.reader.osm.conditional.ParsedCalendar parsedCalendar2 = new com.graphhopper.reader.osm.conditional.ParsedCalendar(parseType0, calendar1);
        com.graphhopper.reader.dem.CGIARProvider cGIARProvider3 = new com.graphhopper.reader.dem.CGIARProvider();
        java.lang.String str4 = cGIARProvider3.toString();
        cGIARProvider3.setInterpolate(true);
        cGIARProvider3.setAutoRemoveTemporaryFiles(false);
        java.lang.String str9 = cGIARProvider3.toString();
        com.graphhopper.reader.dem.ElevationProvider elevationProvider11 = cGIARProvider3.setBaseURL("hi!");
        com.graphhopper.coll.MapEntry<java.util.Calendar, com.graphhopper.reader.dem.AbstractTiffElevationProvider> calendarMapEntry12 = new com.graphhopper.coll.MapEntry<java.util.Calendar, com.graphhopper.reader.dem.AbstractTiffElevationProvider>(calendar1, (com.graphhopper.reader.dem.AbstractTiffElevationProvider) cGIARProvider3);
        java.util.Calendar calendar13 = calendarMapEntry12.getKey();
        com.graphhopper.reader.dem.AbstractTiffElevationProvider abstractTiffElevationProvider14 = calendarMapEntry12.getValue();
        org.junit.Assert.assertTrue("'" + parseType0 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY + "'", parseType0.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY));
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1617558190935,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=94,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=43,SECOND=10,MILLISECOND=935,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cgiar" + "'", str4, "cgiar");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "cgiar" + "'", str9, "cgiar");
        org.junit.Assert.assertNotNull(elevationProvider11);
        org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=1617558190935,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=94,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=43,SECOND=10,MILLISECOND=935,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(abstractTiffElevationProvider14);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        com.graphhopper.util.StopWatch stopWatch1 = com.graphhopper.util.StopWatch.started("max_width");
        java.lang.String str2 = stopWatch1.toString();
        long long3 = stopWatch1.getNanos();
        org.junit.Assert.assertNotNull(stopWatch1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "max_width time:0.0s" + "'", str2, "max_width time:0.0s");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState conditionState0 = com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.FALSE;
        boolean boolean1 = conditionState0.isCheckPassed();
        org.junit.Assert.assertTrue("'" + conditionState0 + "' != '" + com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.FALSE + "'", conditionState0.equals(com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.FALSE));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        com.carrotsearch.hppc.IntArrayList intArrayList1 = com.graphhopper.util.ArrayUtil.zero(4);
        com.carrotsearch.hppc.IntIndexedContainer intIndexedContainer2 = com.graphhopper.util.ArrayUtil.withoutConsecutiveDuplicates((com.carrotsearch.hppc.IntIndexedContainer) intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intIndexedContainer2);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap1 = new com.graphhopper.coll.GHLongLongHashMap(3);
        long[] longArray2 = new long[] {};
        java.util.BitSet bitSet3 = java.util.BitSet.valueOf(longArray2);
        gHLongLongHashMap1.values = longArray2;
        java.lang.String str6 = gHLongLongHashMap1.visualizeKeyDistribution(7);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = gHLongLongHashMap1.putOrAdd((long) 1687814340, (long) '#', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(bitSet3);
        org.junit.Assert.assertEquals(bitSet3.toString(), "{}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "....   " + "'", str6, "....   ");
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        com.graphhopper.util.SimpleIntDeque simpleIntDeque1 = new com.graphhopper.util.SimpleIntDeque((int) 'a');
        simpleIntDeque1.setGrowFactor((float) '#');
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        com.graphhopper.routing.ev.RoadAccess roadAccess0 = com.graphhopper.routing.ev.RoadAccess.YES;
        org.junit.Assert.assertTrue("'" + roadAccess0 + "' != '" + com.graphhopper.routing.ev.RoadAccess.YES + "'", roadAccess0.equals(com.graphhopper.routing.ev.RoadAccess.YES));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        com.graphhopper.reader.ReaderNode readerNode3 = new com.graphhopper.reader.ReaderNode((long) ' ', (double) 1L, (double) 3);
        boolean boolean5 = readerNode3.isType((int) '4');
        java.lang.String[] strArray20 = new java.lang.String[] { "wheelchair", "country", "cgiar", "", "3.0", "get_off_bike", "", "3.0", "road_class_link", "[]", "prepare.ch.log_messages", "", "prepare.ch.log_messages", "mtb" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.lang.String str23 = readerNode3.getFirstPriorityTag((java.util.List<java.lang.String>) strList21);
        double double24 = readerNode3.getLon();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 3.0d + "'", double24 == 3.0d);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        com.graphhopper.routing.Path path0 = null;
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray1 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager2 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray1);
        boolean boolean3 = encodingManager2.needsTurnCostsSupport();
        com.graphhopper.routing.weighting.Weighting weighting4 = null;
        java.util.List<java.lang.String> strList5 = null;
        com.graphhopper.util.details.PathDetailsBuilderFactory pathDetailsBuilderFactory6 = new com.graphhopper.util.details.PathDetailsBuilderFactory();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.util.List<com.graphhopper.util.details.PathDetail>> strMap8 = com.graphhopper.util.details.PathDetailsFromEdges.calcDetails(path0, (com.graphhopper.routing.ev.EncodedValueLookup) encodingManager2, weighting4, strList5, pathDetailsBuilderFactory6, 1687814340);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(flagEncoderArray1);
        org.junit.Assert.assertNotNull(encodingManager2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        org.locationtech.jts.geom.Polygon[] polygonArray0 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList1 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList1, polygonArray0);
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule3 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList1);
        int int4 = austriaSpatialRule3.getPriority();
        com.graphhopper.routing.ev.RoadClass roadClass5 = com.graphhopper.routing.ev.RoadClass.PATH;
        com.graphhopper.routing.util.TransportationMode transportationMode6 = com.graphhopper.routing.util.TransportationMode.BIKE;
        double double8 = austriaSpatialRule3.getMaxSpeed(roadClass5, transportationMode6, (double) (-4));
        com.graphhopper.routing.ev.RoadClass roadClass9 = com.graphhopper.routing.ev.RoadClass.ROAD;
        com.graphhopper.routing.util.TransportationMode transportationMode10 = com.graphhopper.routing.util.TransportationMode.BIKE;
        double double12 = austriaSpatialRule3.getMaxSpeed(roadClass9, transportationMode10, (double) 0);
        java.util.List<java.lang.String> strList13 = com.graphhopper.routing.util.parsers.OSMRoadAccessParser.toOSMRestrictions(transportationMode10);
        java.util.List<java.lang.String> strList14 = com.graphhopper.routing.util.parsers.OSMRoadAccessParser.toOSMRestrictions(transportationMode10);
        org.junit.Assert.assertNotNull(polygonArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + roadClass5 + "' != '" + com.graphhopper.routing.ev.RoadClass.PATH + "'", roadClass5.equals(com.graphhopper.routing.ev.RoadClass.PATH));
        org.junit.Assert.assertTrue("'" + transportationMode6 + "' != '" + com.graphhopper.routing.util.TransportationMode.BIKE + "'", transportationMode6.equals(com.graphhopper.routing.util.TransportationMode.BIKE));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-4.0d) + "'", double8 == (-4.0d));
        org.junit.Assert.assertTrue("'" + roadClass9 + "' != '" + com.graphhopper.routing.ev.RoadClass.ROAD + "'", roadClass9.equals(com.graphhopper.routing.ev.RoadClass.ROAD));
        org.junit.Assert.assertTrue("'" + transportationMode10 + "' != '" + com.graphhopper.routing.util.TransportationMode.BIKE + "'", transportationMode10.equals(com.graphhopper.routing.util.TransportationMode.BIKE));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        int[] intArray6 = new int[] { 100 };
        long[] longArray8 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap9 = com.carrotsearch.hppc.IntLongHashMap.from(intArray6, longArray8);
        com.carrotsearch.hppc.LongLongHashMap longLongHashMap10 = com.carrotsearch.hppc.LongLongHashMap.from(longArray3, longArray8);
        long[] longArray12 = new long[] { 10 };
        com.carrotsearch.hppc.LongHashSet longHashSet13 = com.carrotsearch.hppc.LongHashSet.from(longArray12);
        int int14 = longLongHashMap10.removeAll((com.carrotsearch.hppc.LongContainer) longHashSet13);
        com.graphhopper.reader.ReaderNode readerNode18 = new com.graphhopper.reader.ReaderNode((long) ' ', (double) 1L, (double) 3);
        java.util.List<java.lang.String> strList20 = readerNode18.getKeysWithPrefix("bike_network");
        boolean boolean21 = longLongHashMap10.equals((java.lang.Object) "bike_network");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap9);
        org.junit.Assert.assertNotNull(longLongHashMap10);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[10]");
        org.junit.Assert.assertNotNull(longHashSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        com.graphhopper.reader.OSMTurnRelation.Type type4 = com.graphhopper.reader.OSMTurnRelation.Type.getRestrictionType("");
        com.graphhopper.reader.OSMTurnRelation oSMTurnRelation5 = new com.graphhopper.reader.OSMTurnRelation((long) (byte) 1, (long) (byte) 1, 10L, type4);
        long long6 = oSMTurnRelation5.getOsmIdFrom();
        long long7 = oSMTurnRelation5.getOsmIdTo();
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED + "'", type4.equals(com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
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
        com.graphhopper.storage.IntsRef intsRef16 = new com.graphhopper.storage.IntsRef(intArray1, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.graphhopper.util.ArrayUtil.removeConsecutiveDuplicates(intArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap9);
        org.junit.Assert.assertNotNull(edgeIteratorArray11);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100]");
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
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
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = com.graphhopper.util.ArrayUtil.invert(intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap9);
        org.junit.Assert.assertNotNull(edgeIteratorArray11);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100]");
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
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
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        com.graphhopper.apache.commons.collections.IntFloatBinaryHeap intFloatBinaryHeap0 = new com.graphhopper.apache.commons.collections.IntFloatBinaryHeap();
        long long1 = intFloatBinaryHeap0.getCapacity();
        int int2 = intFloatBinaryHeap0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = intFloatBinaryHeap0.peekElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Heap is empty. Cannot peek element.");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1001L + "'", long1 == 1001L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue4 = new com.graphhopper.routing.ev.StringEncodedValue("custom", (int) ' ', false);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState6 = disabledEdgeIterator0.setReverse(stringEncodedValue4, "prepare.ch.contracted_nodes");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        com.graphhopper.reader.osm.conditional.DateRangeParser dateRangeParser1 = com.graphhopper.reader.osm.conditional.DateRangeParser.createInstance("");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.osm.conditional.DateRange dateRange3 = dateRangeParser1.getRange("{mtb=get_off_bike}");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparsable date: \"{mtb=get_off_bike}\"");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateRangeParser1);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        com.graphhopper.routing.SPTEntry sPTEntry2 = new com.graphhopper.routing.SPTEntry((-885860508), (double) ' ');
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        com.graphhopper.util.DistanceCalc3D distanceCalc3D3 = new com.graphhopper.util.DistanceCalc3D();
        com.graphhopper.util.shapes.Circle circle4 = new com.graphhopper.util.shapes.Circle((double) (byte) -1, (double) (-1), (double) 10.0f, (com.graphhopper.util.DistanceCalc) distanceCalc3D3);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        com.graphhopper.reader.dem.CGIARProvider cGIARProvider0 = new com.graphhopper.reader.dem.CGIARProvider();
        java.lang.String str1 = cGIARProvider0.toString();
        cGIARProvider0.setInterpolate(true);
        com.graphhopper.util.Downloader downloader4 = null;
        cGIARProvider0.setDownloader(downloader4);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cgiar" + "'", str1, "cgiar");
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser oSMFootNetworkTagParser0 = new com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser();
        com.graphhopper.storage.IntsRef intsRef1 = com.graphhopper.routing.ev.TurnCost.createFlags();
        int int2 = intsRef1.offset;
        com.graphhopper.reader.ReaderRelation readerRelation3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.IntsRef intsRef4 = oSMFootNetworkTagParser0.handleRelationTags(intsRef1, readerRelation3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intsRef1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        com.graphhopper.storage.IntsRef intsRef1 = null;
        com.graphhopper.util.EdgeIteratorState edgeIteratorState7 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) (byte) 100, intsRef1, (int) (short) -1, (int) (short) 100, (-4), (int) (byte) 0, 3);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue8 = com.graphhopper.routing.ev.Country.create();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = edgeIteratorState7.getReverse((com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorState7);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue8);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        com.graphhopper.util.shapes.BBox bBox4 = new com.graphhopper.util.shapes.BBox((double) 10, (double) 35L, (double) 0, (double) (-4));
        double double5 = bBox4.minLon;
        double double6 = bBox4.minLat;
        com.graphhopper.util.shapes.BBox bBox7 = bBox4.clone();
        bBox4.minLat = 0L;
        bBox4.maxEle = 4;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(bBox7);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue4 = new com.graphhopper.routing.ev.StringEncodedValue("custom", (int) ' ', false);
        java.lang.String str5 = stringEncodedValue4.getName();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState7 = disabledEdgeIterator0.set(stringEncodedValue4, "bike_network");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "custom" + "'", str5, "custom");
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        com.graphhopper.search.StringIndex stringIndex2 = new com.graphhopper.search.StringIndex((com.graphhopper.storage.Directory) rAMDirectory1);
        com.graphhopper.search.StringIndex stringIndex4 = stringIndex2.create(100L);
        stringIndex2.close();
        org.junit.Assert.assertNotNull(stringIndex4);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions2 = new com.graphhopper.routing.AlgorithmOptions("profiles:\nprofiles_ch:\nprofiles_lm:\nproperties:\n", weighting1);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType0 = com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY;
        java.util.Calendar calendar1 = com.graphhopper.reader.osm.conditional.DateRangeParser.createCalendar();
        com.graphhopper.reader.osm.conditional.ParsedCalendar parsedCalendar2 = new com.graphhopper.reader.osm.conditional.ParsedCalendar(parseType0, calendar1);
        com.graphhopper.reader.dem.CGIARProvider cGIARProvider3 = new com.graphhopper.reader.dem.CGIARProvider();
        java.lang.String str4 = cGIARProvider3.toString();
        cGIARProvider3.setInterpolate(true);
        cGIARProvider3.setAutoRemoveTemporaryFiles(false);
        com.graphhopper.coll.MapEntry<java.util.Calendar, com.graphhopper.reader.dem.AbstractTiffElevationProvider> calendarMapEntry9 = new com.graphhopper.coll.MapEntry<java.util.Calendar, com.graphhopper.reader.dem.AbstractTiffElevationProvider>(calendar1, (com.graphhopper.reader.dem.AbstractTiffElevationProvider) cGIARProvider3);
        org.junit.Assert.assertTrue("'" + parseType0 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY + "'", parseType0.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY));
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1617558191819,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=94,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=43,SECOND=11,MILLISECOND=819,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cgiar" + "'", str4, "cgiar");
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        int int0 = com.graphhopper.util.Constants.VERSION_GEOMETRY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        com.graphhopper.routing.querygraph.QueryGraph queryGraph0 = null;
        com.graphhopper.routing.RoutingAlgorithmFactory routingAlgorithmFactory1 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions2 = null;
        com.graphhopper.routing.FlexiblePathCalculator flexiblePathCalculator3 = new com.graphhopper.routing.FlexiblePathCalculator(queryGraph0, routingAlgorithmFactory1, algorithmOptions2);
        com.graphhopper.routing.weighting.Weighting weighting5 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions6 = new com.graphhopper.routing.AlgorithmOptions("[]", weighting5);
        flexiblePathCalculator3.setAlgoOpts(algorithmOptions6);
        com.graphhopper.routing.EdgeRestrictions edgeRestrictions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.graphhopper.routing.Path> pathList11 = flexiblePathCalculator3.calcPaths(3, (int) (byte) 1, edgeRestrictions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        com.graphhopper.apache.commons.collections.IntFloatBinaryHeap intFloatBinaryHeap0 = new com.graphhopper.apache.commons.collections.IntFloatBinaryHeap();
        long long1 = intFloatBinaryHeap0.getCapacity();
        int int2 = intFloatBinaryHeap0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            float float3 = intFloatBinaryHeap0.peekKey();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Heap is empty. Cannot peek key.");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1001L + "'", long1 == 1001L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        com.graphhopper.coll.GHSortedCollection gHSortedCollection0 = new com.graphhopper.coll.GHSortedCollection();
        gHSortedCollection0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = gHSortedCollection0.peekKey();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: collection is already empty!?");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge prepareBaseEdge5 = new com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge(11, 1, 35, (float) 10, (float) 52L);
        int int6 = prepareBaseEdge5.getOrigEdgeKeyFirstBA();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 23 + "'", int6 == 23);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        int int2 = com.graphhopper.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "....   ", (java.lang.CharSequence) "concrete");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        com.graphhopper.coll.GHSortedCollection gHSortedCollection0 = new com.graphhopper.coll.GHSortedCollection();
        // The following exception was thrown during execution in test generation
        try {
            int int1 = gHSortedCollection0.peekValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: collection is already empty!?");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        com.graphhopper.routing.ev.RouteNetwork routeNetwork0 = com.graphhopper.routing.ev.RouteNetwork.OTHER;
        org.junit.Assert.assertTrue("'" + routeNetwork0 + "' != '" + com.graphhopper.routing.ev.RouteNetwork.OTHER + "'", routeNetwork0.equals(com.graphhopper.routing.ev.RouteNetwork.OTHER));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        java.util.Locale locale0 = null;
        com.graphhopper.util.TranslationMap.TranslationHashMap translationHashMap1 = new com.graphhopper.util.TranslationMap.TranslationHashMap(locale0);
        translationHashMap1.clear();
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        com.graphhopper.routing.util.parsers.OSMGetOffBikeParser oSMGetOffBikeParser0 = new com.graphhopper.routing.util.parsers.OSMGetOffBikeParser();
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        com.graphhopper.util.AngleCalc angleCalc0 = new com.graphhopper.util.AngleCalc();
        double double3 = angleCalc0.alignOrientation((double) 4, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.283185307179586d + "'", double3 == 6.283185307179586d);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        com.graphhopper.routing.ev.RoadClass roadClass0 = com.graphhopper.routing.ev.RoadClass.PRIMARY;
        org.junit.Assert.assertTrue("'" + roadClass0 + "' != '" + com.graphhopper.routing.ev.RoadClass.PRIMARY + "'", roadClass0.equals(com.graphhopper.routing.ev.RoadClass.PRIMARY));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        java.lang.String str0 = com.graphhopper.routing.ev.MaxSpeed.KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "max_speed" + "'", str0, "max_speed");
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        com.graphhopper.routing.ch.CHEntry cHEntry4 = new com.graphhopper.routing.ch.CHEntry(3, 0, 2, (-4.0d));
        com.graphhopper.routing.SPTEntry sPTEntry5 = cHEntry4.clone();
        cHEntry4.edge = (short) 1;
        java.lang.String str8 = cHEntry4.toString();
        org.junit.Assert.assertNotNull(sPTEntry5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2 (1) weight: -4.0, incEdge: 0" + "'", str8, "2 (1) weight: -4.0, incEdge: 0");
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator5 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray6 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator5 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap7 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray1, edgeIteratorArray6);
        int[] intArray8 = edgeIteratorIntObjectHashMap7.keys;
        java.lang.String str10 = edgeIteratorIntObjectHashMap7.visualizeKeyDistribution(100);
        com.graphhopper.coll.GHTBitSet gHTBitSet12 = new com.graphhopper.coll.GHTBitSet(0);
        com.graphhopper.coll.MapEntry<com.carrotsearch.hppc.IntObjectAssociativeContainer<com.graphhopper.util.EdgeIterator>, com.graphhopper.coll.GHTBitSet> edgeIteratorIntObjectAssociativeContainerMapEntry13 = new com.graphhopper.coll.MapEntry<com.carrotsearch.hppc.IntObjectAssociativeContainer<com.graphhopper.util.EdgeIterator>, com.graphhopper.coll.GHTBitSet>((com.carrotsearch.hppc.IntObjectAssociativeContainer<com.graphhopper.util.EdgeIterator>) edgeIteratorIntObjectHashMap7, gHTBitSet12);
        com.carrotsearch.hppc.predicates.IntPredicate intPredicate14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = edgeIteratorIntObjectHashMap7.removeAll(intPredicate14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(edgeIteratorArray6);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap7);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, 0, 0, 0]");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".X..                                                                                                " + "'", str10, ".X..                                                                                                ");
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        com.graphhopper.util.shapes.BBox bBox4 = com.graphhopper.util.shapes.BBox.fromPoints((double) 1001L, 10.0d, (double) 0.0f, (double) 10.0f);
        org.junit.Assert.assertNotNull(bBox4);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap0 = new com.graphhopper.coll.GHIntLongHashMap();
        java.lang.String str2 = gHIntLongHashMap0.visualizeKeyDistribution((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        int[] intArray6 = new int[] { 100 };
        long[] longArray8 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap9 = com.carrotsearch.hppc.IntLongHashMap.from(intArray6, longArray8);
        com.carrotsearch.hppc.LongLongHashMap longLongHashMap10 = com.carrotsearch.hppc.LongLongHashMap.from(longArray3, longArray8);
        long[] longArray12 = new long[] { 10 };
        com.carrotsearch.hppc.LongHashSet longHashSet13 = com.carrotsearch.hppc.LongHashSet.from(longArray12);
        int int14 = longLongHashMap10.removeAll((com.carrotsearch.hppc.LongContainer) longHashSet13);
        int[] intArray16 = new int[] { 100 };
        long[] longArray18 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap19 = com.carrotsearch.hppc.IntLongHashMap.from(intArray16, longArray18);
        int[] intArray21 = new int[] { 100 };
        long[] longArray23 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap24 = com.carrotsearch.hppc.IntLongHashMap.from(intArray21, longArray23);
        com.carrotsearch.hppc.LongLongHashMap longLongHashMap25 = com.carrotsearch.hppc.LongLongHashMap.from(longArray18, longArray23);
        long[] longArray27 = new long[] { 10 };
        com.carrotsearch.hppc.LongHashSet longHashSet28 = com.carrotsearch.hppc.LongHashSet.from(longArray27);
        int int29 = longLongHashMap25.removeAll((com.carrotsearch.hppc.LongContainer) longHashSet28);
        int int30 = longLongHashMap10.removeAll((com.carrotsearch.hppc.LongContainer) longHashSet28);
        boolean boolean32 = longHashSet28.remove((long) 201);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap9);
        org.junit.Assert.assertNotNull(longLongHashMap10);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[10]");
        org.junit.Assert.assertNotNull(longHashSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap24);
        org.junit.Assert.assertNotNull(longLongHashMap25);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[10]");
        org.junit.Assert.assertNotNull(longHashSet28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType0 = com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY;
        java.util.Calendar calendar1 = com.graphhopper.reader.osm.conditional.DateRangeParser.createCalendar();
        com.graphhopper.reader.osm.conditional.ParsedCalendar parsedCalendar2 = new com.graphhopper.reader.osm.conditional.ParsedCalendar(parseType0, calendar1);
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType3 = parsedCalendar2.parseType;
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType4 = com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY;
        java.util.Calendar calendar5 = com.graphhopper.reader.osm.conditional.DateRangeParser.createCalendar();
        com.graphhopper.reader.osm.conditional.ParsedCalendar parsedCalendar6 = new com.graphhopper.reader.osm.conditional.ParsedCalendar(parseType4, calendar5);
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType7 = parsedCalendar6.parseType;
        com.graphhopper.reader.osm.conditional.DateRange dateRange8 = new com.graphhopper.reader.osm.conditional.DateRange(parsedCalendar2, parsedCalendar6);
        java.lang.String str9 = parsedCalendar6.toString();
        org.junit.Assert.assertTrue("'" + parseType0 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY + "'", parseType0.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY));
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=94,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=5,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + parseType3 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY + "'", parseType3.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY));
        org.junit.Assert.assertTrue("'" + parseType4 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY + "'", parseType4.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY));
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1617580799999,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=94,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + parseType7 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY + "'", parseType7.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "YEAR_MONTH_DAY; 2021-04-04T23:59:59Z" + "'", str9, "YEAR_MONTH_DAY; 2021-04-04T23:59:59Z");
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        com.graphhopper.apache.commons.lang3.StringUtils stringUtils0 = new com.graphhopper.apache.commons.lang3.StringUtils();
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        com.graphhopper.storage.IntsRef intsRef2 = com.graphhopper.routing.ev.TurnCost.createFlags();
        com.graphhopper.util.EdgeIteratorState edgeIteratorState8 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState(3.6461703979660586E12d, intsRef2, (int) (short) 1, (int) (byte) 100, 35, (-2), (int) 'a');
        com.graphhopper.util.EdgeIteratorState edgeIteratorState9 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState(0.4317460358142853d, intsRef2);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState11 = edgeIteratorState9.detach(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intsRef2);
        org.junit.Assert.assertNotNull(edgeIteratorState8);
        org.junit.Assert.assertNotNull(edgeIteratorState9);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        com.graphhopper.util.Unzipper unzipper0 = new com.graphhopper.util.Unzipper();
        unzipper0.unzip("aut", true);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        com.graphhopper.storage.IntsRef intsRef1 = com.graphhopper.routing.ev.TurnCost.createFlags();
        com.graphhopper.util.EdgeIteratorState edgeIteratorState7 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState(3.6461703979660586E12d, intsRef1, (int) (short) 1, (int) (byte) 100, 35, (-2), (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState9 = edgeIteratorState7.setName("2 (1) weight: -4.0, incEdge: 0");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intsRef1);
        org.junit.Assert.assertNotNull(edgeIteratorState7);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState2 = disabledEdgeIterator0.setName("[]$turn_cost");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        com.graphhopper.reader.OSMTurnRelation.Type type4 = com.graphhopper.reader.OSMTurnRelation.Type.getRestrictionType("");
        com.graphhopper.reader.OSMTurnRelation oSMTurnRelation5 = new com.graphhopper.reader.OSMTurnRelation((long) (byte) 1, (long) (byte) 1, 10L, type4);
        long long6 = oSMTurnRelation5.getOsmIdFrom();
        java.lang.String str7 = oSMTurnRelation5.toString();
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED + "'", type4.equals(com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "*-(1)->1-(10)->*" + "'", str7, "*-(1)->1-(10)->*");
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.BIG;
        com.graphhopper.util.BitUtil bitUtil1 = com.graphhopper.util.BitUtil.LITTLE;
        int int3 = bitUtil1.getIntHigh((long) (byte) 10);
        byte[] byteArray5 = bitUtil1.fromBitString("2021-04-04T01:09:20Z");
        // The following exception was thrown during execution in test generation
        try {
            bitUtil0.fromDouble(byteArray5, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertNotNull(bitUtil1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[63, -16, 0]");
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray0 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager1 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray0);
        boolean boolean2 = encodingManager1.needsTurnCostsSupport();
        boolean boolean4 = encodingManager1.hasEncodedValue("concrete");
        org.junit.Assert.assertNotNull(flagEncoderArray0);
        org.junit.Assert.assertNotNull(encodingManager1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        int[] intArray6 = new int[] { 100 };
        long[] longArray8 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap9 = com.carrotsearch.hppc.IntLongHashMap.from(intArray6, longArray8);
        com.carrotsearch.hppc.LongLongHashMap longLongHashMap10 = com.carrotsearch.hppc.LongLongHashMap.from(longArray3, longArray8);
        long[] longArray12 = new long[] { 10 };
        com.carrotsearch.hppc.LongHashSet longHashSet13 = com.carrotsearch.hppc.LongHashSet.from(longArray12);
        int int14 = longLongHashMap10.removeAll((com.carrotsearch.hppc.LongContainer) longHashSet13);
        boolean boolean16 = longHashSet13.remove((long) 100);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             longHashSet13.indexInsert(0, (long) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap9);
        org.junit.Assert.assertNotNull(longLongHashMap10);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[10]");
        org.junit.Assert.assertNotNull(longHashSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        com.graphhopper.reader.dem.CGIARProvider cGIARProvider0 = new com.graphhopper.reader.dem.CGIARProvider();
        java.lang.String str1 = cGIARProvider0.toString();
        cGIARProvider0.setInterpolate(true);
        cGIARProvider0.setAutoRemoveTemporaryFiles(false);
        java.lang.String str6 = cGIARProvider0.toString();
        com.graphhopper.reader.dem.ElevationProvider elevationProvider8 = cGIARProvider0.setBaseURL("hi!");
        com.graphhopper.reader.dem.CGIARProvider cGIARProvider9 = new com.graphhopper.reader.dem.CGIARProvider();
        java.lang.String str10 = cGIARProvider9.toString();
        cGIARProvider9.setInterpolate(true);
        com.graphhopper.reader.dem.ElevationProvider elevationProvider14 = cGIARProvider9.setBaseURL("prepare.ch.edge.witness_search.min_max_settled_edges");
        com.graphhopper.reader.dem.MultiSourceElevationProvider multiSourceElevationProvider15 = new com.graphhopper.reader.dem.MultiSourceElevationProvider(elevationProvider8, elevationProvider14);
        com.graphhopper.storage.DAType dAType16 = com.graphhopper.storage.DAType.RAM;
        boolean boolean17 = dAType16.isInMemory();
        com.graphhopper.reader.dem.ElevationProvider elevationProvider18 = multiSourceElevationProvider15.setDAType(dAType16);
        multiSourceElevationProvider15.setInterpolate(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cgiar" + "'", str1, "cgiar");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cgiar" + "'", str6, "cgiar");
        org.junit.Assert.assertNotNull(elevationProvider8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "cgiar" + "'", str10, "cgiar");
        org.junit.Assert.assertNotNull(elevationProvider14);
        org.junit.Assert.assertNotNull(dAType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(elevationProvider18);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        byte[] byteArray1 = null;
        com.graphhopper.reader.osm.pbf.PbfRawBlob pbfRawBlob2 = new com.graphhopper.reader.osm.pbf.PbfRawBlob("roundabout", byteArray1);
        java.lang.String str3 = pbfRawBlob2.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "roundabout" + "'", str3, "roundabout");
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState2 = disabledEdgeIterator0.setName("Linux");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        com.graphhopper.reader.dem.SkadiProvider skadiProvider1 = new com.graphhopper.reader.dem.SkadiProvider("car");
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        com.graphhopper.routing.util.TestAlgoCollector.OneRun oneRun0 = new com.graphhopper.routing.util.TestAlgoCollector.OneRun();
        java.lang.String str1 = oneRun0.toString();
        java.lang.String str2 = oneRun0.toString();
        com.graphhopper.routing.util.TestAlgoCollector.OneRun oneRun7 = oneRun0.add((double) 0L, (double) ' ', (double) (short) 10, (int) (byte) -1);
        double double8 = oneRun0.getDistance();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(oneRun7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        java.lang.String str0 = com.graphhopper.routing.ev.MaxLength.KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "max_length" + "'", str0, "max_length");
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        com.graphhopper.util.shapes.BBox bBox4 = new com.graphhopper.util.shapes.BBox((double) 10, (double) 35L, (double) 0, (double) (-4));
        double double5 = bBox4.minLon;
        double double6 = bBox4.minLat;
        bBox4.maxEle = '4';
        com.graphhopper.storage.index.LocationIndex locationIndex9 = null;
        java.util.Random random10 = null;
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue13 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter14 = com.graphhopper.routing.util.DefaultEdgeFilter.inEdges(booleanEncodedValue13);
        boolean boolean16 = defaultEdgeFilter14.equals((java.lang.Object) "mtb");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.graphhopper.storage.index.Snap> snapList17 = com.graphhopper.util.GHUtility.createRandomSnaps(bBox4, locationIndex9, random10, (-919338616), true, (com.graphhopper.routing.util.EdgeFilter) defaultEdgeFilter14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Capacity: -919338616");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(booleanEncodedValue13);
        org.junit.Assert.assertNotNull(defaultEdgeFilter14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        com.graphhopper.reader.dem.MultiSourceElevationProvider multiSourceElevationProvider0 = new com.graphhopper.reader.dem.MultiSourceElevationProvider();
        multiSourceElevationProvider0.release();
        com.graphhopper.storage.DAType dAType2 = null;
        com.graphhopper.reader.dem.ElevationProvider elevationProvider3 = multiSourceElevationProvider0.setDAType(dAType2);
        org.junit.Assert.assertNotNull(elevationProvider3);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        com.graphhopper.routing.util.FlagEncoder flagEncoder0 = null;
        com.graphhopper.util.PMap pMap1 = null;
        com.graphhopper.routing.weighting.TurnCostProvider turnCostProvider2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.CurvatureWeighting curvatureWeighting3 = new com.graphhopper.routing.weighting.CurvatureWeighting(flagEncoder0, pMap1, turnCostProvider2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        com.graphhopper.util.PMap pMap1 = null;
        com.graphhopper.routing.weighting.Weighting weighting2 = null;
        com.graphhopper.storage.NodeAccess nodeAccess3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.WeightApproximator weightApproximator4 = com.graphhopper.routing.RoutingAlgorithmFactorySimple.getApproximation("multi", pMap1, weighting2, nodeAccess3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        com.graphhopper.routing.util.FlagEncoder flagEncoder2 = null;
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue6 = new com.graphhopper.routing.ev.StringEncodedValue("custom", (int) ' ', false);
        int[] intArray9 = new int[] { 100 };
        long[] longArray11 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap12 = com.carrotsearch.hppc.IntLongHashMap.from(intArray9, longArray11);
        int[] intArray14 = new int[] { 100 };
        long[] longArray16 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap17 = com.carrotsearch.hppc.IntLongHashMap.from(intArray14, longArray16);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator18 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray19 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator18 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap20 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray14, edgeIteratorArray19);
        int[] intArray21 = com.graphhopper.util.ArrayUtil.merge(intArray9, intArray14);
        com.graphhopper.storage.IntsRef intsRef24 = new com.graphhopper.storage.IntsRef(intArray9, (int) (short) 0, 0);
        java.lang.String str25 = stringEncodedValue6.getString(true, intsRef24);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.IntsRef intsRef26 = com.graphhopper.util.GHUtility.setSpeed(111194.92664455873d, (double) 201, flagEncoder2, intsRef24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap17);
        org.junit.Assert.assertNotNull(edgeIteratorArray19);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100]");
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder2 = rAMDirectory1.getByteOrder();
        com.graphhopper.util.BitUtil bitUtil3 = com.graphhopper.util.BitUtil.get(byteOrder2);
        long long6 = bitUtil3.toLong(35, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = bitUtil3.toLastBitString((long) 11, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(bitUtil3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 150323855395L + "'", long6 == 150323855395L);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder2 = rAMDirectory1.getByteOrder();
        rAMDirectory1.clear();
        boolean boolean4 = rAMDirectory1.isStoring();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage5 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue6 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser7 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue6);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray8 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager9 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray8);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser10 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup11 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue12 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray13 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue12 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList14 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14, encodedValueArray13);
        oSMRoadClassParser10.createEncodedValues(encodedValueLookup11, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        oSMMaxWidthParser7.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager9, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        com.graphhopper.routing.DefaultWeightingFactory defaultWeightingFactory18 = new com.graphhopper.routing.DefaultWeightingFactory(graphHopperStorage5, encodingManager9);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage22 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager9, true, false, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState25 = graphHopperStorage22.getEdgeIteratorState(4, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: edgeId 4 out of bounds, edgeCount: 0");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(decimalEncodedValue6);
        org.junit.Assert.assertNotNull(flagEncoderArray8);
        org.junit.Assert.assertNotNull(encodingManager9);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue12);
        org.junit.Assert.assertNotNull(encodedValueArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl0 = new com.graphhopper.coll.GHBitSetImpl();
        int int2 = gHBitSetImpl0.previousClearBit(0);
        gHBitSetImpl0.clear();
        int int5 = gHBitSetImpl0.next((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = gHBitSetImpl0.nextClear((-919338616));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex < 0: -919338616");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        java.util.Random random0 = null;
        com.graphhopper.routing.util.tour.MultiPointTour multiPointTour4 = new com.graphhopper.routing.util.tour.MultiPointTour(random0, (double) 4, 1, (double) (short) 1);
        double double6 = multiPointTour4.getHeadingForIteration((-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-359.0d) + "'", double6 == (-359.0d));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.apache.commons.collections.IntFloatBinaryHeap intFloatBinaryHeap1 = new com.graphhopper.apache.commons.collections.IntFloatBinaryHeap((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        com.graphhopper.storage.RAMDirectory rAMDirectory0 = new com.graphhopper.storage.RAMDirectory();
        com.graphhopper.routing.subnetwork.SubnetworkStorage subnetworkStorage2 = new com.graphhopper.routing.subnetwork.SubnetworkStorage((com.graphhopper.storage.Directory) rAMDirectory0, "prepare.ch.contracted_nodes");
        subnetworkStorage2.flush();
        subnetworkStorage2.flush();
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        com.graphhopper.search.StringIndex stringIndex2 = new com.graphhopper.search.StringIndex((com.graphhopper.storage.Directory) rAMDirectory1);
        boolean boolean3 = stringIndex2.loadExisting();
        com.graphhopper.storage.RAMDirectory rAMDirectory5 = new com.graphhopper.storage.RAMDirectory("custom");
        com.graphhopper.search.StringIndex stringIndex6 = new com.graphhopper.search.StringIndex((com.graphhopper.storage.Directory) rAMDirectory5);
        stringIndex6.close();
        com.graphhopper.search.StringIndex stringIndex9 = stringIndex6.create(1L);
        stringIndex2.copyTo(stringIndex6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = null; // flaky: stringIndex2.get((long) ' ', "");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringIndex9);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.BIG;
        long long3 = bitUtil0.toLong((int) (byte) 100, 3);
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) -1, (byte) 100 };
        bitUtil0.fromInt(byteArray10, (int) '4');
        long long15 = bitUtil0.combineIntsToLong((int) (short) 10, 0);
        int int17 = bitUtil0.getIntLow(150323855395L);
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 429496729603L + "'", long3 == 429496729603L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 0, 52, -1, 100]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIterator edgeIterator2 = disabledEdgeIterator0.detach(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder2 = rAMDirectory1.getByteOrder();
        rAMDirectory1.clear();
        boolean boolean4 = rAMDirectory1.isStoring();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage5 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue6 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser7 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue6);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray8 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager9 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray8);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser10 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup11 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue12 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray13 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue12 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList14 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14, encodedValueArray13);
        oSMRoadClassParser10.createEncodedValues(encodedValueLookup11, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        oSMMaxWidthParser7.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager9, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        com.graphhopper.routing.DefaultWeightingFactory defaultWeightingFactory18 = new com.graphhopper.routing.DefaultWeightingFactory(graphHopperStorage5, encodingManager9);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage22 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager9, true, false, (int) (short) 10);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue24 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser25 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue24);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray26 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager27 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray26);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser28 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup29 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue30 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray31 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue30 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList32 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList32, encodedValueArray31);
        oSMRoadClassParser28.createEncodedValues(encodedValueLookup29, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList32);
        oSMMaxWidthParser25.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager27, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList32);
        java.lang.String str36 = encodingManager27.toFlagEncodersAsString();
        com.graphhopper.routing.util.FlagEncoder flagEncoder37 = null;
        com.graphhopper.storage.TurnCostStorage turnCostStorage39 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.GHUtility.addRandomTurnCosts((com.graphhopper.storage.Graph) graphHopperStorage22, (long) (-3), encodingManager27, flagEncoder37, 201, turnCostStorage39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(decimalEncodedValue6);
        org.junit.Assert.assertNotNull(flagEncoderArray8);
        org.junit.Assert.assertNotNull(encodingManager9);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue12);
        org.junit.Assert.assertNotNull(encodedValueArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(decimalEncodedValue24);
        org.junit.Assert.assertNotNull(flagEncoderArray26);
        org.junit.Assert.assertNotNull(encodingManager27);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue30);
        org.junit.Assert.assertNotNull(encodedValueArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        com.graphhopper.reader.ReaderRelation.Member member3 = new com.graphhopper.reader.ReaderRelation.Member((int) (byte) 0, (long) 0, "cgiar");
        java.lang.String str4 = member3.toString();
        java.lang.String str5 = member3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Member 0:0" + "'", str4, "Member 0:0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cgiar" + "'", str5, "cgiar");
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        com.graphhopper.reader.dem.ElevationInterpolator elevationInterpolator0 = new com.graphhopper.reader.dem.ElevationInterpolator();
        double double12 = elevationInterpolator0.calculateElevationBasedOnThreePoints(0.0d, 1.2361865545667784E10d, Double.NaN, (double) (byte) 1, Double.NaN, (double) 0L, 1.2361865545667784E10d, (double) '4', (double) 100, 1.0222578996763014E14d, (double) 150323855395L);
        double double21 = elevationInterpolator0.calculateElevationBasedOnTwoPoints((double) 2, (double) 100L, 1.0222578996763014E14d, 0.0d, 1.8767638594379812E14d, (double) 23, 6.283185307179586d, (double) 201);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 377.34d + "'", double21 == 377.34d);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        com.graphhopper.storage.NodeAccess nodeAccess0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator2 = new com.graphhopper.routing.weighting.BeelineWeightApproximator(nodeAccess0, weighting1);
        com.graphhopper.routing.weighting.BalancedWeightApproximator balancedWeightApproximator3 = new com.graphhopper.routing.weighting.BalancedWeightApproximator((com.graphhopper.routing.weighting.WeightApproximator) beelineWeightApproximator2);
        java.lang.String str4 = balancedWeightApproximator3.toString();
        com.graphhopper.routing.weighting.WeightApproximator weightApproximator5 = balancedWeightApproximator3.getApproximation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "beeline" + "'", str4, "beeline");
        org.junit.Assert.assertNotNull(weightApproximator5);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser oSMFootNetworkTagParser0 = new com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray1 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager2 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray1);
        boolean boolean3 = encodingManager2.needsTurnCostsSupport();
        com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser oSMHazmatTunnelParser4 = new com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup5 = null;
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser6 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup7 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue8 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray9 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue8 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList10 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList10, encodedValueArray9);
        oSMRoadClassParser6.createEncodedValues(encodedValueLookup7, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList10);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup13 = null;
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser14 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup15 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue16 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray17 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue16 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList18 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList18, encodedValueArray17);
        oSMRoadClassParser14.createEncodedValues(encodedValueLookup15, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList18);
        oSMRoadClassParser6.createEncodedValues(encodedValueLookup13, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList18);
        oSMHazmatTunnelParser4.createEncodedValues(encodedValueLookup5, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList18);
        oSMFootNetworkTagParser0.createRelationEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager2, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList18);
        org.junit.Assert.assertNotNull(flagEncoderArray1);
        org.junit.Assert.assertNotNull(encodingManager2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue8);
        org.junit.Assert.assertNotNull(encodedValueArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue16);
        org.junit.Assert.assertNotNull(encodedValueArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        com.graphhopper.routing.querygraph.QueryGraph queryGraph0 = null;
        com.graphhopper.routing.RoutingAlgorithmFactory routingAlgorithmFactory1 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions2 = null;
        com.graphhopper.routing.FlexiblePathCalculator flexiblePathCalculator3 = new com.graphhopper.routing.FlexiblePathCalculator(queryGraph0, routingAlgorithmFactory1, algorithmOptions2);
        int int4 = flexiblePathCalculator3.getVisitedNodes();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        javax.xml.stream.XMLStreamReader xMLStreamReader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.ReaderWay readerWay2 = com.graphhopper.reader.osm.OSMXMLHelper.createWay((long) 8, xMLStreamReader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge prepareBaseEdge5 = new com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge((int) (byte) 10, (-1), 201, (float) 1687814340, (float) (short) 10);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.LITTLE;
        com.graphhopper.util.BitUtil bitUtil1 = com.graphhopper.util.BitUtil.LITTLE;
        int int3 = bitUtil1.getIntHigh((long) (byte) 10);
        byte[] byteArray5 = bitUtil1.fromBitString("2021-04-04T01:09:20Z");
        java.lang.String str6 = bitUtil0.toBitString(byteArray5);
        com.graphhopper.util.BitUtil bitUtil7 = com.graphhopper.util.BitUtil.LITTLE;
        com.graphhopper.util.BitUtil bitUtil8 = com.graphhopper.util.BitUtil.LITTLE;
        int int10 = bitUtil8.getIntHigh((long) (byte) 10);
        byte[] byteArray12 = bitUtil8.fromBitString("2021-04-04T01:09:20Z");
        java.lang.String str13 = bitUtil7.toBitString(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = bitUtil0.toInt(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertNotNull(bitUtil1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-48, 109, -69]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "101110110110110111010000" + "'", str6, "101110110110110111010000");
        org.junit.Assert.assertNotNull(bitUtil7);
        org.junit.Assert.assertNotNull(bitUtil8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-48, 109, -69]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "101110110110110111010000" + "'", str13, "101110110110110111010000");
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder2 = rAMDirectory1.getByteOrder();
        rAMDirectory1.clear();
        boolean boolean4 = rAMDirectory1.isStoring();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage5 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue6 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser7 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue6);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray8 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager9 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray8);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser10 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup11 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue12 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray13 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue12 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList14 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14, encodedValueArray13);
        oSMRoadClassParser10.createEncodedValues(encodedValueLookup11, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        oSMMaxWidthParser7.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager9, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        com.graphhopper.routing.DefaultWeightingFactory defaultWeightingFactory18 = new com.graphhopper.routing.DefaultWeightingFactory(graphHopperStorage5, encodingManager9);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage22 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager9, true, false, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = false; // flaky: graphHopperStorage22.isAdjacentToNode((int) (short) -1, (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(decimalEncodedValue6);
        org.junit.Assert.assertNotNull(flagEncoderArray8);
        org.junit.Assert.assertNotNull(encodingManager9);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue12);
        org.junit.Assert.assertNotNull(encodedValueArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        com.graphhopper.storage.CHGraph cHGraph0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.RoutingCHGraphImpl routingCHGraphImpl1 = new com.graphhopper.storage.RoutingCHGraphImpl(cHGraph0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder2 = rAMDirectory1.getByteOrder();
        rAMDirectory1.clear();
        boolean boolean4 = rAMDirectory1.isStoring();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage5 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue6 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser7 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue6);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray8 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager9 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray8);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser10 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup11 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue12 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray13 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue12 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList14 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14, encodedValueArray13);
        oSMRoadClassParser10.createEncodedValues(encodedValueLookup11, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        oSMMaxWidthParser7.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager9, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        com.graphhopper.routing.DefaultWeightingFactory defaultWeightingFactory18 = new com.graphhopper.routing.DefaultWeightingFactory(graphHopperStorage5, encodingManager9);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage22 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager9, true, false, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.GHUtility.updateDistancesFor((com.graphhopper.storage.Graph) graphHopperStorage22, 1687814340, (double) (short) 100, (double) 429496729603L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: The graph has not yet been initialized.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(decimalEncodedValue6);
        org.junit.Assert.assertNotNull(flagEncoderArray8);
        org.junit.Assert.assertNotNull(encodingManager9);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue12);
        org.junit.Assert.assertNotNull(encodedValueArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        int[] intArray6 = new int[] { 100 };
        long[] longArray8 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap9 = com.carrotsearch.hppc.IntLongHashMap.from(intArray6, longArray8);
        com.carrotsearch.hppc.LongLongHashMap longLongHashMap10 = com.carrotsearch.hppc.LongLongHashMap.from(longArray3, longArray8);
        long[] longArray12 = new long[] { 10 };
        com.carrotsearch.hppc.LongHashSet longHashSet13 = com.carrotsearch.hppc.LongHashSet.from(longArray12);
        int int14 = longLongHashMap10.removeAll((com.carrotsearch.hppc.LongContainer) longHashSet13);
        int[] intArray16 = new int[] { 100 };
        long[] longArray18 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap19 = com.carrotsearch.hppc.IntLongHashMap.from(intArray16, longArray18);
        int[] intArray21 = new int[] { 100 };
        long[] longArray23 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap24 = com.carrotsearch.hppc.IntLongHashMap.from(intArray21, longArray23);
        com.carrotsearch.hppc.LongLongHashMap longLongHashMap25 = com.carrotsearch.hppc.LongLongHashMap.from(longArray18, longArray23);
        long[] longArray27 = new long[] { 10 };
        com.carrotsearch.hppc.LongHashSet longHashSet28 = com.carrotsearch.hppc.LongHashSet.from(longArray27);
        int int29 = longLongHashMap25.removeAll((com.carrotsearch.hppc.LongContainer) longHashSet28);
        int int30 = longLongHashMap10.removeAll((com.carrotsearch.hppc.LongContainer) longHashSet28);
        boolean boolean32 = longHashSet28.remove((long) (byte) 0);
        int int33 = longHashSet28.size();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap9);
        org.junit.Assert.assertNotNull(longLongHashMap10);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[10]");
        org.junit.Assert.assertNotNull(longHashSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap24);
        org.junit.Assert.assertNotNull(longLongHashMap25);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[10]");
        org.junit.Assert.assertNotNull(longHashSet28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue1 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser2 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue1);
        // The following exception was thrown during execution in test generation
        try {
            double double3 = disabledEdgeIterator0.get(decimalEncodedValue1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(decimalEncodedValue1);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        com.graphhopper.coll.GHTreeMapComposed gHTreeMapComposed0 = new com.graphhopper.coll.GHTreeMapComposed();
        boolean boolean1 = gHTreeMapComposed0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        com.graphhopper.search.StringIndex stringIndex2 = new com.graphhopper.search.StringIndex((com.graphhopper.storage.Directory) rAMDirectory1);
        stringIndex2.close();
        com.graphhopper.search.StringIndex stringIndex5 = stringIndex2.create(1L);
        stringIndex2.close();
        org.junit.Assert.assertNotNull(stringIndex5);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        com.graphhopper.reader.ReaderNode readerNode3 = new com.graphhopper.reader.ReaderNode((long) ' ', (double) 1L, (double) 3);
        java.lang.String str5 = readerNode3.getTag("prepare.ch.log_messages");
        org.locationtech.jts.geom.Polygon[] polygonArray7 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList8 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList8, polygonArray7);
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule10 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList8);
        java.util.List<org.locationtech.jts.geom.Polygon> polygonList11 = austriaSpatialRule10.getBorders();
        readerNode3.setTag("..X.                                                                                                ", (java.lang.Object) polygonList11);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(polygonArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(polygonList11);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        com.graphhopper.reader.OSMTurnRelation.Type type4 = com.graphhopper.reader.OSMTurnRelation.Type.getRestrictionType("");
        com.graphhopper.reader.OSMTurnRelation oSMTurnRelation5 = new com.graphhopper.reader.OSMTurnRelation((long) (byte) 1, (long) (byte) 1, 10L, type4);
        oSMTurnRelation5.setVehicleTypeRestricted("101110110110110111010000");
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED + "'", type4.equals(com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED));
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        com.graphhopper.storage.NodeAccess nodeAccess0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator2 = new com.graphhopper.routing.weighting.BeelineWeightApproximator(nodeAccess0, weighting1);
        double double3 = beelineWeightApproximator2.getSlack();
        com.graphhopper.routing.weighting.WeightApproximator weightApproximator4 = beelineWeightApproximator2.reverse();
        com.graphhopper.routing.weighting.WeightApproximator weightApproximator5 = beelineWeightApproximator2.reverse();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(weightApproximator4);
        org.junit.Assert.assertNotNull(weightApproximator5);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl0 = new com.graphhopper.coll.GHBitSetImpl();
        int int2 = gHBitSetImpl0.previousClearBit(0);
        gHBitSetImpl0.clear();
        long[] longArray4 = gHBitSetImpl0.toLongArray();
        int int6 = gHBitSetImpl0.nextClearBit((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        com.graphhopper.routing.Path path0 = null;
        com.graphhopper.storage.RAMDirectory rAMDirectory2 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder3 = rAMDirectory2.getByteOrder();
        rAMDirectory2.clear();
        boolean boolean5 = rAMDirectory2.isStoring();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage6 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue7 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser8 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue7);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray9 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager10 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray9);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser11 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup12 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue13 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray14 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue13 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList15 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList15, encodedValueArray14);
        oSMRoadClassParser11.createEncodedValues(encodedValueLookup12, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList15);
        oSMMaxWidthParser8.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager10, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList15);
        com.graphhopper.routing.DefaultWeightingFactory defaultWeightingFactory19 = new com.graphhopper.routing.DefaultWeightingFactory(graphHopperStorage6, encodingManager10);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage23 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory2, encodingManager10, true, false, (int) (short) 10);
        com.graphhopper.routing.weighting.Weighting weighting24 = null;
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray25 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager26 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray25);
        java.lang.String str27 = encodingManager26.toEncodedValuesAsString();
        java.util.Locale locale28 = null;
        com.graphhopper.util.TranslationMap.TranslationHashMap translationHashMap29 = new com.graphhopper.util.TranslationMap.TranslationHashMap(locale28);
        com.graphhopper.util.TranslationMap.TranslationHashMap translationHashMap32 = translationHashMap29.put("mtb", "get_off_bike");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.InstructionList instructionList33 = com.graphhopper.routing.InstructionsFromEdges.calcInstructions(path0, (com.graphhopper.storage.Graph) graphHopperStorage23, weighting24, (com.graphhopper.routing.ev.EncodedValueLookup) encodingManager26, (com.graphhopper.util.Translation) translationHashMap29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(decimalEncodedValue7);
        org.junit.Assert.assertNotNull(flagEncoderArray9);
        org.junit.Assert.assertNotNull(encodingManager10);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue13);
        org.junit.Assert.assertNotNull(encodedValueArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(flagEncoderArray25);
        org.junit.Assert.assertNotNull(encodingManager26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "roundabout|version=283388307|bits=1|index=0|shift=0|store_both_directions=false,road_class|version=2007543510|bits=5|index=0|shift=1|store_both_directions=false,road_class_link|version=146075245|bits=1|index=0|shift=6|store_both_directions=false,road_environment|version=-446726394|bits=3|index=0|shift=7|store_both_directions=false,max_speed|version=-1300485567|bits=5|index=0|shift=10|store_both_directions=true,road_access|version=-313723172|bits=4|index=0|shift=20|store_both_directions=false" + "'", str27, "roundabout|version=283388307|bits=1|index=0|shift=0|store_both_directions=false,road_class|version=2007543510|bits=5|index=0|shift=1|store_both_directions=false,road_class_link|version=146075245|bits=1|index=0|shift=6|store_both_directions=false,road_environment|version=-446726394|bits=3|index=0|shift=7|store_both_directions=false,max_speed|version=-1300485567|bits=5|index=0|shift=10|store_both_directions=true,road_access|version=-313723172|bits=4|index=0|shift=20|store_both_directions=false");
        org.junit.Assert.assertNotNull(translationHashMap32);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.apache.commons.collections.IntFloatBinaryHeap intFloatBinaryHeap1 = new com.graphhopper.apache.commons.collections.IntFloatBinaryHeap((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap1 = new com.graphhopper.coll.GHLongLongHashMap(3);
        com.carrotsearch.hppc.LongLongHashMap.KeysContainer keysContainer2 = gHLongLongHashMap1.keys();
        boolean boolean4 = gHLongLongHashMap1.containsKey((long) 201);
        org.junit.Assert.assertNotNull(keysContainer2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom_network");
        java.lang.String str2 = rAMDirectory1.getLocation();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "custom_network/" + "'", str2, "custom_network/");
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.LITTLE;
        int int2 = bitUtil0.getIntHigh((long) (byte) 10);
        byte[] byteArray4 = bitUtil0.fromBitString("2021-04-04T01:09:20Z");
        com.graphhopper.util.BitUtil bitUtil5 = com.graphhopper.util.BitUtil.BIG;
        byte[] byteArray7 = bitUtil5.fromDouble(6378137.0d);
        // The following exception was thrown during execution in test generation
        try {
            bitUtil0.fromFloat(byteArray7, (float) '4', (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-48, 109, -69]");
        org.junit.Assert.assertNotNull(bitUtil5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[65, 88, 84, -90, 64, 0, 0, 0]");
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        int[] intArray6 = new int[] { 100 };
        long[] longArray8 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap9 = com.carrotsearch.hppc.IntLongHashMap.from(intArray6, longArray8);
        com.carrotsearch.hppc.LongLongHashMap longLongHashMap10 = com.carrotsearch.hppc.LongLongHashMap.from(longArray3, longArray8);
        long[] longArray12 = new long[] { 10 };
        com.carrotsearch.hppc.LongHashSet longHashSet13 = com.carrotsearch.hppc.LongHashSet.from(longArray12);
        int int14 = longLongHashMap10.removeAll((com.carrotsearch.hppc.LongContainer) longHashSet13);
        int int15 = longLongHashMap10.size();
        int[] intArray17 = new int[] { 100 };
        long[] longArray19 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap20 = com.carrotsearch.hppc.IntLongHashMap.from(intArray17, longArray19);
        com.carrotsearch.hppc.LongCollection longCollection21 = intLongHashMap20.values();
        int int22 = longLongHashMap10.removeAll((com.carrotsearch.hppc.LongContainer) longCollection21);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap9);
        org.junit.Assert.assertNotNull(longLongHashMap10);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[10]");
        org.junit.Assert.assertNotNull(longHashSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap20);
        org.junit.Assert.assertNotNull(longCollection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        com.graphhopper.coll.MinHeapWithUpdate minHeapWithUpdate1 = new com.graphhopper.coll.MinHeapWithUpdate((int) (byte) 10);
        float float2 = minHeapWithUpdate1.peekValue();
        minHeapWithUpdate1.clear();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.BIG;
        com.graphhopper.util.BitUtil bitUtil1 = com.graphhopper.util.BitUtil.LITTLE;
        com.graphhopper.util.BitUtil bitUtil2 = com.graphhopper.util.BitUtil.LITTLE;
        int int4 = bitUtil2.getIntHigh((long) (byte) 10);
        byte[] byteArray6 = bitUtil2.fromBitString("2021-04-04T01:09:20Z");
        java.lang.String str7 = bitUtil1.toBitString(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bitUtil0.toDouble(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertNotNull(bitUtil1);
        org.junit.Assert.assertNotNull(bitUtil2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-48, 109, -69]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "101110110110110111010000" + "'", str7, "101110110110110111010000");
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.RoadClass> roadClassEnumEncodedValue1 = null;
        com.graphhopper.util.details.EnumDetails<com.graphhopper.routing.ev.RoadClass> roadClassEnumDetails2 = new com.graphhopper.util.details.EnumDetails<com.graphhopper.routing.ev.RoadClass>("prepare.ch.edge.hierarchy_depth_weight", roadClassEnumEncodedValue1);
        roadClassEnumDetails2.endInterval(0);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        com.graphhopper.routing.ev.Surface surface0 = com.graphhopper.routing.ev.Surface.GROUND;
        org.junit.Assert.assertTrue("'" + surface0 + "' != '" + com.graphhopper.routing.ev.Surface.GROUND + "'", surface0.equals(com.graphhopper.routing.ev.Surface.GROUND));
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        com.graphhopper.debatty.java.stringsimilarity.JaroWinkler jaroWinkler1 = new com.graphhopper.debatty.java.stringsimilarity.JaroWinkler((-6951166.6959488215d));
        double double4 = jaroWinkler1.similarity("0000000000000000000000000000001000110000000000000000000000000000000000000000000000000000000000000000", "2 (1) weight: -4.0, incEdge: 0");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.26555556058883667d + "'", double4 == 0.26555556058883667d);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        java.lang.String[] strArray22 = new java.lang.String[] { "car4wd", "mtb", "country", "prepare.ch.log_messages", "..X.                                                                                                ", "SpatialRule [getId()=aut, getPriority()=100]", "multi", "[]$turn_cost", "[]", "mtb", "3.0", "wheelchair", "get_off_bike|node-based", "..X.                                                                                                ", "prepare.ch.log_messages", "wheelchair", "prepare.ch.edge.witness_search.min_max_settled_edges", "country", "hi!", "[]", "custom", "[]$turn_cost" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        com.graphhopper.reader.osm.conditional.ConditionalParser conditionalParser25 = new com.graphhopper.reader.osm.conditional.ConditionalParser((java.util.Set<java.lang.String>) strSet23);
        com.graphhopper.reader.osm.conditional.ConditionalParser conditionalParser27 = new com.graphhopper.reader.osm.conditional.ConditionalParser((java.util.Set<java.lang.String>) strSet23, true);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        com.graphhopper.reader.dem.MultiSourceElevationProvider multiSourceElevationProvider0 = new com.graphhopper.reader.dem.MultiSourceElevationProvider();
        multiSourceElevationProvider0.setInterpolate(false);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        org.locationtech.jts.geom.Polygon[] polygonArray0 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList1 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList1, polygonArray0);
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule3 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList1);
        int int4 = austriaSpatialRule3.getPriority();
        com.graphhopper.routing.ev.RoadClass roadClass5 = com.graphhopper.routing.ev.RoadClass.PATH;
        com.graphhopper.routing.util.TransportationMode transportationMode6 = com.graphhopper.routing.util.TransportationMode.BIKE;
        double double8 = austriaSpatialRule3.getMaxSpeed(roadClass5, transportationMode6, (double) (-4));
        com.graphhopper.routing.ev.RoadClass roadClass9 = com.graphhopper.routing.ev.RoadClass.ROAD;
        com.graphhopper.routing.util.TransportationMode transportationMode10 = com.graphhopper.routing.util.TransportationMode.BIKE;
        double double12 = austriaSpatialRule3.getMaxSpeed(roadClass9, transportationMode10, (double) 0);
        java.lang.String str13 = austriaSpatialRule3.getId();
        java.util.List<org.locationtech.jts.geom.Polygon> polygonList14 = austriaSpatialRule3.getBorders();
        org.junit.Assert.assertNotNull(polygonArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + roadClass5 + "' != '" + com.graphhopper.routing.ev.RoadClass.PATH + "'", roadClass5.equals(com.graphhopper.routing.ev.RoadClass.PATH));
        org.junit.Assert.assertTrue("'" + transportationMode6 + "' != '" + com.graphhopper.routing.util.TransportationMode.BIKE + "'", transportationMode6.equals(com.graphhopper.routing.util.TransportationMode.BIKE));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-4.0d) + "'", double8 == (-4.0d));
        org.junit.Assert.assertTrue("'" + roadClass9 + "' != '" + com.graphhopper.routing.ev.RoadClass.ROAD + "'", roadClass9.equals(com.graphhopper.routing.ev.RoadClass.ROAD));
        org.junit.Assert.assertTrue("'" + transportationMode10 + "' != '" + com.graphhopper.routing.util.TransportationMode.BIKE + "'", transportationMode10.equals(com.graphhopper.routing.util.TransportationMode.BIKE));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "aut" + "'", str13, "aut");
        org.junit.Assert.assertNotNull(polygonList14);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        java.util.Locale locale0 = null;
        com.graphhopper.util.TranslationMap.TranslationHashMap translationHashMap1 = new com.graphhopper.util.TranslationMap.TranslationHashMap(locale0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = translationHashMap1.asMap();
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        com.graphhopper.reader.OSMTurnRelation.Type type7 = com.graphhopper.reader.OSMTurnRelation.Type.getRestrictionType("");
        com.graphhopper.reader.OSMTurnRelation oSMTurnRelation8 = new com.graphhopper.reader.OSMTurnRelation((long) (byte) 1, (long) (byte) 1, 10L, type7);
        com.graphhopper.reader.OSMTurnRelation oSMTurnRelation9 = new com.graphhopper.reader.OSMTurnRelation(150323855395L, (long) 100, 35L, type7);
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED + "'", type7.equals(com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED));
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser oSMFootNetworkTagParser0 = new com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser();
        com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser oSMFootNetworkTagParser1 = new com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray2 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager3 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray2);
        java.lang.String str4 = encodingManager3.toEncodedValuesAsString();
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser5 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup6 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue7 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray8 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue7 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList9 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList9, encodedValueArray8);
        oSMRoadClassParser5.createEncodedValues(encodedValueLookup6, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList9);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup12 = null;
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser13 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup14 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue15 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray16 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue15 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList17 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList17, encodedValueArray16);
        oSMRoadClassParser13.createEncodedValues(encodedValueLookup14, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList17);
        oSMRoadClassParser5.createEncodedValues(encodedValueLookup12, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList17);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup21 = null;
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser22 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup23 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue24 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray25 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue24 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList26 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList26, encodedValueArray25);
        oSMRoadClassParser22.createEncodedValues(encodedValueLookup23, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList26);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup29 = null;
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser30 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup31 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue32 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray33 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue32 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList34 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList34, encodedValueArray33);
        oSMRoadClassParser30.createEncodedValues(encodedValueLookup31, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList34);
        oSMRoadClassParser22.createEncodedValues(encodedValueLookup29, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList34);
        oSMRoadClassParser5.createEncodedValues(encodedValueLookup21, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList34);
        oSMFootNetworkTagParser1.createRelationEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager3, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList34);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue40 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser41 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue40);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray42 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager43 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray42);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser44 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup45 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue46 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray47 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue46 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList48 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList48, encodedValueArray47);
        oSMRoadClassParser44.createEncodedValues(encodedValueLookup45, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList48);
        oSMMaxWidthParser41.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager43, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList48);
        java.lang.String str52 = encodingManager43.toFlagEncodersAsString();
        java.util.List<com.graphhopper.routing.ev.EncodedValue> encodedValueList53 = encodingManager43.getEncodedValues();
        // The following exception was thrown during execution in test generation
        try {
            oSMFootNetworkTagParser0.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager3, encodedValueList53);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(flagEncoderArray2);
        org.junit.Assert.assertNotNull(encodingManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "roundabout|version=283388307|bits=1|index=0|shift=0|store_both_directions=false,road_class|version=2007543510|bits=5|index=0|shift=1|store_both_directions=false,road_class_link|version=146075245|bits=1|index=0|shift=6|store_both_directions=false,road_environment|version=-446726394|bits=3|index=0|shift=7|store_both_directions=false,max_speed|version=-1300485567|bits=5|index=0|shift=10|store_both_directions=true,road_access|version=-313723172|bits=4|index=0|shift=20|store_both_directions=false" + "'", str4, "roundabout|version=283388307|bits=1|index=0|shift=0|store_both_directions=false,road_class|version=2007543510|bits=5|index=0|shift=1|store_both_directions=false,road_class_link|version=146075245|bits=1|index=0|shift=6|store_both_directions=false,road_environment|version=-446726394|bits=3|index=0|shift=7|store_both_directions=false,max_speed|version=-1300485567|bits=5|index=0|shift=10|store_both_directions=true,road_access|version=-313723172|bits=4|index=0|shift=20|store_both_directions=false");
        org.junit.Assert.assertNotNull(countryEnumEncodedValue7);
        org.junit.Assert.assertNotNull(encodedValueArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue15);
        org.junit.Assert.assertNotNull(encodedValueArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue24);
        org.junit.Assert.assertNotNull(encodedValueArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue32);
        org.junit.Assert.assertNotNull(encodedValueArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(decimalEncodedValue40);
        org.junit.Assert.assertNotNull(flagEncoderArray42);
        org.junit.Assert.assertNotNull(encodingManager43);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue46);
        org.junit.Assert.assertNotNull(encodedValueArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(encodedValueList53);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        com.graphhopper.routing.weighting.Weighting weighting0 = null;
        com.graphhopper.storage.IntsRef intsRef6 = com.graphhopper.storage.IntsRef.EMPTY;
        java.lang.String str7 = intsRef6.toString();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState((int) (short) 10, (-4), (-2), 2, (double) (-1), intsRef6, "PLANE_PROJ", pointList9, true);
        com.graphhopper.storage.IntsRef intsRef12 = virtualEdgeIteratorState11.getFlags();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = com.graphhopper.util.GHUtility.calcMillisWithTurnMillis(weighting0, (com.graphhopper.util.EdgeIteratorState) virtualEdgeIteratorState11, false, (-919338616));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intsRef6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(intsRef12);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        javax.xml.stream.XMLStreamReader xMLStreamReader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.ReaderNode readerNode2 = com.graphhopper.reader.osm.OSMXMLHelper.createNode(150323855395L, xMLStreamReader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        com.graphhopper.storage.IntsRef intsRef5 = com.graphhopper.storage.IntsRef.EMPTY;
        java.lang.String str6 = intsRef5.toString();
        com.graphhopper.util.PointList pointList8 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState10 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState((int) (short) 10, (-4), (-2), 2, (double) (-1), intsRef5, "PLANE_PROJ", pointList8, true);
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue12 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.util.details.BooleanDetails booleanDetails13 = new com.graphhopper.util.details.BooleanDetails("get_off_bike", booleanEncodedValue12);
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter14 = com.graphhopper.routing.util.DefaultEdgeFilter.inEdges(booleanEncodedValue12);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState16 = virtualEdgeIteratorState10.set(booleanEncodedValue12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: reverse state cannot be modified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intsRef5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(booleanEncodedValue12);
        org.junit.Assert.assertNotNull(defaultEdgeFilter14);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        com.graphhopper.reader.osm.OSMFileHeader oSMFileHeader0 = new com.graphhopper.reader.osm.OSMFileHeader();
        java.lang.String str1 = oSMFileHeader0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "OSM File header:{}" + "'", str1, "OSM File header:{}");
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder2 = rAMDirectory1.getByteOrder();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        int int0 = com.graphhopper.routing.ch.PrepareEncoder.getScDirMask();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry4 = new com.graphhopper.routing.ch.PrepareCHEntry((-1), (int) '#', (int) (short) 10, 4.003017359204114E7d);
        int int5 = prepareCHEntry4.incEdgeKey;
        double double6 = prepareCHEntry4.weight;
        prepareCHEntry4.adjNode = (byte) -1;
        prepareCHEntry4.weight = 3.1415944901905157d;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.003017359204114E7d + "'", double6 == 4.003017359204114E7d);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        long[] longArray0 = new long[] {};
        java.util.BitSet bitSet1 = java.util.BitSet.valueOf(longArray0);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl2 = new com.graphhopper.coll.GHBitSetImpl();
        int int4 = gHBitSetImpl2.previousClearBit(0);
        gHBitSetImpl2.clear();
        boolean boolean7 = gHBitSetImpl2.contains(11);
        bitSet1.andNot((java.util.BitSet) gHBitSetImpl2);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl9 = new com.graphhopper.coll.GHBitSetImpl();
        bitSet1.or((java.util.BitSet) gHBitSetImpl9);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(bitSet1);
        org.junit.Assert.assertEquals(bitSet1.toString(), "{}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        com.graphhopper.routing.util.parsers.OSMBikeNetworkTagParser oSMBikeNetworkTagParser0 = new com.graphhopper.routing.util.parsers.OSMBikeNetworkTagParser();
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder2 = rAMDirectory1.getByteOrder();
        rAMDirectory1.clear();
        boolean boolean4 = rAMDirectory1.isStoring();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage5 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue6 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser7 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue6);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray8 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager9 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray8);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser10 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup11 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue12 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray13 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue12 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList14 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14, encodedValueArray13);
        oSMRoadClassParser10.createEncodedValues(encodedValueLookup11, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        oSMMaxWidthParser7.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager9, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        com.graphhopper.routing.DefaultWeightingFactory defaultWeightingFactory18 = new com.graphhopper.routing.DefaultWeightingFactory(graphHopperStorage5, encodingManager9);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage22 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager9, true, false, (int) (short) 10);
        boolean boolean23 = graphHopperStorage22.isClosed();
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue25 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.util.details.BooleanDetails booleanDetails26 = new com.graphhopper.util.details.BooleanDetails("get_off_bike", booleanEncodedValue25);
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter27 = com.graphhopper.routing.util.DefaultEdgeFilter.outEdges(booleanEncodedValue25);
        com.graphhopper.util.EdgeExplorer edgeExplorer28 = graphHopperStorage22.createEdgeExplorer((com.graphhopper.routing.util.EdgeFilter) defaultEdgeFilter27);
        com.graphhopper.routing.weighting.Weighting weighting29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ch.CHPreparationGraph.TurnCostFunction turnCostFunction30 = com.graphhopper.routing.ch.CHPreparationGraph.buildTurnCostFunctionFromTurnCostStorage((com.graphhopper.storage.Graph) graphHopperStorage22, weighting29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(decimalEncodedValue6);
        org.junit.Assert.assertNotNull(flagEncoderArray8);
        org.junit.Assert.assertNotNull(encodingManager9);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue12);
        org.junit.Assert.assertNotNull(encodedValueArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(booleanEncodedValue25);
        org.junit.Assert.assertNotNull(defaultEdgeFilter27);
        org.junit.Assert.assertNotNull(edgeExplorer28);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        com.graphhopper.routing.util.DefaultFlagEncoderFactory defaultFlagEncoderFactory0 = new com.graphhopper.routing.util.DefaultFlagEncoderFactory();
        com.graphhopper.util.PMap pMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.FlagEncoder flagEncoder3 = defaultFlagEncoderFactory0.createFlagEncoder("racingbike", pMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        com.graphhopper.util.shapes.BBox bBox7 = new com.graphhopper.util.shapes.BBox((double) 1, 0.0d, (double) 0, (double) (-919338616), (double) (short) -1, (double) 0L, false);
        bBox7.maxLon = (-4.0d);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        com.graphhopper.storage.IntsRef intsRef5 = com.graphhopper.storage.IntsRef.EMPTY;
        java.lang.String str6 = intsRef5.toString();
        com.graphhopper.util.PointList pointList8 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState10 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState((int) (short) 10, (-4), (-2), 2, (double) (-1), intsRef5, "PLANE_PROJ", pointList8, true);
        com.graphhopper.storage.IntsRef intsRef11 = virtualEdgeIteratorState10.getFlags();
        com.graphhopper.util.PointList pointList12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState13 = virtualEdgeIteratorState10.setWayGeometry(pointList12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported for virtual edge. Set when creating it.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intsRef5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(intsRef11);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.util.shapes.BBox> bBoxGHLongObjectHashMap0 = new com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.util.shapes.BBox>();
        int int2 = bBoxGHLongObjectHashMap0.indexOf((long) (short) -1);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray3 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager4 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray3);
        bBoxGHLongObjectHashMap0.values = flagEncoderArray3;
        java.lang.Object[] objArray6 = bBoxGHLongObjectHashMap0.values;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
        org.junit.Assert.assertNotNull(flagEncoderArray3);
        org.junit.Assert.assertNotNull(encodingManager4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        com.graphhopper.util.shapes.BBox bBox4 = new com.graphhopper.util.shapes.BBox((double) 10, (double) 35L, (double) 0, (double) (-4));
        double double5 = bBox4.minLon;
        bBox4.maxEle = 0L;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue1 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.util.details.BooleanDetails booleanDetails2 = new com.graphhopper.util.details.BooleanDetails("get_off_bike", booleanEncodedValue1);
        com.graphhopper.storage.IntsRef intsRef4 = null;
        com.graphhopper.util.EdgeIteratorState edgeIteratorState10 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) (byte) 100, intsRef4, (int) (short) -1, (int) (short) 100, (-4), (int) (byte) 0, 3);
        boolean boolean11 = booleanDetails2.isEdgeDifferentToLastEdge(edgeIteratorState10);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState13 = edgeIteratorState10.setName("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanEncodedValue1);
        org.junit.Assert.assertNotNull(edgeIteratorState10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        com.graphhopper.reader.ReaderNode readerNode3 = new com.graphhopper.reader.ReaderNode((long) ' ', (double) 1L, (double) 3);
        java.lang.String[] strArray33 = new java.lang.String[] { "cgiar", "1.8.0_251", ".X..                                                                                                ", "profiles:\nprofiles_ch:\nprofiles_lm:\nproperties:\n", "profiles:\nprofiles_ch:\nprofiles_lm:\nproperties:\n", "bike_network", "get_off_bike", "3.0", "...X                                                                                                ", "max_width", "prepare.ch.edge.witness_search.min_max_settled_edges", "bike2", "[]$turn_cost", "profiles:\nprofiles_ch:\nprofiles_lm:\nproperties:\n", "SpatialRule [getId()=aut, getPriority()=100]", "road_class_link", "multi", "...X                                                                                                ", "car4wd", "bike2", "3.0", "profiles:\nprofiles_ch:\nprofiles_lm:\nproperties:\n", "mtb", "country", "mtb", "get_off_bike|node-based", "1.8.0_251", "", "1.8.0_251" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.lang.String str36 = readerNode3.getFirstPriorityTag((java.util.List<java.lang.String>) strList34);
        readerNode3.removeTag(".X..                                                                                                ");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        java.lang.String str0 = com.graphhopper.routing.ev.HikeRating.KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hike_rating" + "'", str0, "hike_rating");
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        com.graphhopper.search.StringIndex stringIndex2 = new com.graphhopper.search.StringIndex((com.graphhopper.storage.Directory) rAMDirectory1);
        com.graphhopper.search.StringIndex stringIndex4 = stringIndex2.create(100L);
        stringIndex4.close();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap7 = stringIndex4.getAll(1001L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringIndex4);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        com.graphhopper.routing.AlternativeRouteCH.PotentialAlternativeInfo potentialAlternativeInfo0 = new com.graphhopper.routing.AlternativeRouteCH.PotentialAlternativeInfo();
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.LITTLE;
        int int2 = bitUtil0.getIntHigh((long) (byte) 10);
        int int4 = bitUtil0.getIntLow((long) (short) 0);
        com.graphhopper.util.BitUtil bitUtil5 = com.graphhopper.util.BitUtil.LITTLE;
        com.graphhopper.util.BitUtil bitUtil6 = com.graphhopper.util.BitUtil.LITTLE;
        int int8 = bitUtil6.getIntHigh((long) (byte) 10);
        byte[] byteArray10 = bitUtil6.fromBitString("2021-04-04T01:09:20Z");
        java.lang.String str11 = bitUtil5.toBitString(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bitUtil0.toDouble(byteArray10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(bitUtil5);
        org.junit.Assert.assertNotNull(bitUtil6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-48, 109, -69]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "101110110110110111010000" + "'", str11, "101110110110110111010000");
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        com.graphhopper.GraphHopperConfig graphHopperConfig0 = new com.graphhopper.GraphHopperConfig();
        com.graphhopper.GraphHopperConfig graphHopperConfig1 = new com.graphhopper.GraphHopperConfig(graphHopperConfig0);
        com.graphhopper.config.Profile[] profileArray2 = new com.graphhopper.config.Profile[] {};
        java.util.ArrayList<com.graphhopper.config.Profile> profileList3 = new java.util.ArrayList<com.graphhopper.config.Profile>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.config.Profile>) profileList3, profileArray2);
        com.graphhopper.GraphHopperConfig graphHopperConfig5 = graphHopperConfig1.setProfiles((java.util.List<com.graphhopper.config.Profile>) profileList3);
        java.lang.String str6 = graphHopperConfig1.toString();
        com.graphhopper.GraphHopperConfig graphHopperConfig7 = new com.graphhopper.GraphHopperConfig(graphHopperConfig1);
        com.graphhopper.GraphHopperConfig graphHopperConfig8 = new com.graphhopper.GraphHopperConfig(graphHopperConfig1);
        org.junit.Assert.assertNotNull(profileArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(graphHopperConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "profiles:\nprofiles_ch:\nprofiles_lm:\nproperties:\n" + "'", str6, "profiles:\nprofiles_ch:\nprofiles_lm:\nproperties:\n");
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue4 = new com.graphhopper.routing.ev.StringEncodedValue("custom", (int) ' ', false);
        com.graphhopper.routing.ev.EncodedValue.InitializerConfig initializerConfig5 = null;
        com.graphhopper.coll.MapEntry<com.graphhopper.routing.ev.StringEncodedValue, com.graphhopper.routing.ev.EncodedValue.InitializerConfig> stringEncodedValueMapEntry6 = new com.graphhopper.coll.MapEntry<com.graphhopper.routing.ev.StringEncodedValue, com.graphhopper.routing.ev.EncodedValue.InitializerConfig>(stringEncodedValue4, initializerConfig5);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState8 = disabledEdgeIterator0.set(stringEncodedValue4, "beeline");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder2 = rAMDirectory1.getByteOrder();
        rAMDirectory1.clear();
        boolean boolean4 = rAMDirectory1.isStoring();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage5 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue6 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser7 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue6);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray8 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager9 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray8);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser10 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup11 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue12 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray13 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue12 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList14 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14, encodedValueArray13);
        oSMRoadClassParser10.createEncodedValues(encodedValueLookup11, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        oSMMaxWidthParser7.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager9, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        com.graphhopper.routing.DefaultWeightingFactory defaultWeightingFactory18 = new com.graphhopper.routing.DefaultWeightingFactory(graphHopperStorage5, encodingManager9);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage22 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager9, true, false, (int) (short) 10);
        boolean boolean23 = graphHopperStorage22.isClosed();
        com.graphhopper.routing.HeadingResolver headingResolver24 = new com.graphhopper.routing.HeadingResolver((com.graphhopper.storage.Graph) graphHopperStorage22);
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(decimalEncodedValue6);
        org.junit.Assert.assertNotNull(flagEncoderArray8);
        org.junit.Assert.assertNotNull(encodingManager9);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue12);
        org.junit.Assert.assertNotNull(encodedValueArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMRoadClassParser> oSMRoadClassParserGHObjectIntHashMap0 = new com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMRoadClassParser>();
        int int2 = oSMRoadClassParserGHObjectIntHashMap0.indexGet((int) (byte) 1);
        com.carrotsearch.hppc.ObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMRoadClassParser> oSMRoadClassParserObjectIntHashMap3 = oSMRoadClassParserGHObjectIntHashMap0.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(oSMRoadClassParserObjectIntHashMap3);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
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
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        java.lang.String[] strArray22 = new java.lang.String[] { "car4wd", "mtb", "country", "prepare.ch.log_messages", "..X.                                                                                                ", "SpatialRule [getId()=aut, getPriority()=100]", "multi", "[]$turn_cost", "[]", "mtb", "3.0", "wheelchair", "get_off_bike|node-based", "..X.                                                                                                ", "prepare.ch.log_messages", "wheelchair", "prepare.ch.edge.witness_search.min_max_settled_edges", "country", "hi!", "[]", "custom", "[]$turn_cost" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        com.graphhopper.reader.osm.conditional.ConditionalParser conditionalParser25 = new com.graphhopper.reader.osm.conditional.ConditionalParser((java.util.Set<java.lang.String>) strSet23);
        com.graphhopper.reader.osm.conditional.ConditionalValueParser conditionalValueParser26 = null;
        com.graphhopper.reader.osm.conditional.ConditionalParser conditionalParser27 = conditionalParser25.addConditionalValueParser(conditionalValueParser26);
        boolean boolean29 = conditionalParser27.checkCondition("concrete");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(conditionalParser27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        com.graphhopper.routing.util.TraversalMode traversalMode0 = com.graphhopper.routing.util.TraversalMode.EDGE_BASED;
        int int5 = traversalMode0.createTraversalId(7, (int) (byte) -1, (int) (byte) -1, true);
        int int10 = traversalMode0.createTraversalId(100, 10, (int) (short) 1, true);
        org.junit.Assert.assertTrue("'" + traversalMode0 + "' != '" + com.graphhopper.routing.util.TraversalMode.EDGE_BASED + "'", traversalMode0.equals(com.graphhopper.routing.util.TraversalMode.EDGE_BASED));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        com.graphhopper.routing.ch.AStarCHEntry aStarCHEntry3 = new com.graphhopper.routing.ch.AStarCHEntry((int) (byte) 100, (-6951166.6959488215d), (double) (byte) 1);
        aStarCHEntry3.weightOfVisitedPath = 3.0d;
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        com.graphhopper.util.DistanceCalcEuclidean distanceCalcEuclidean0 = new com.graphhopper.util.DistanceCalcEuclidean();
        double double5 = distanceCalcEuclidean0.calcDist((double) (-1.0f), 2.0015086747773867E7d, 1.0d, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.shapes.GHPoint gHPoint10 = distanceCalcEuclidean0.projectCoordinate(3.1415944901905157d, 6.661798265227327E-11d, (double) (short) -1, (double) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported for the 2D Euclidean space");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0015086747773968E7d + "'", double5 == 2.0015086747773968E7d);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage0 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue1 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser2 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue1);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray3 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager4 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray3);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser5 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup6 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue7 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray8 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue7 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList9 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList9, encodedValueArray8);
        oSMRoadClassParser5.createEncodedValues(encodedValueLookup6, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList9);
        oSMMaxWidthParser2.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager4, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList9);
        com.graphhopper.routing.DefaultWeightingFactory defaultWeightingFactory13 = new com.graphhopper.routing.DefaultWeightingFactory(graphHopperStorage0, encodingManager4);
        com.graphhopper.config.Profile profile14 = null;
        com.graphhopper.util.PMap pMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.Weighting weighting17 = defaultWeightingFactory13.createWeighting(profile14, pMap15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(decimalEncodedValue1);
        org.junit.Assert.assertNotNull(flagEncoderArray3);
        org.junit.Assert.assertNotNull(encodingManager4);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue7);
        org.junit.Assert.assertNotNull(encodedValueArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        com.graphhopper.routing.querygraph.QueryGraph queryGraph0 = null;
        com.graphhopper.routing.RoutingAlgorithmFactory routingAlgorithmFactory1 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions2 = null;
        com.graphhopper.routing.FlexiblePathCalculator flexiblePathCalculator3 = new com.graphhopper.routing.FlexiblePathCalculator(queryGraph0, routingAlgorithmFactory1, algorithmOptions2);
        int int4 = flexiblePathCalculator3.getVisitedNodes();
        com.graphhopper.routing.AlgorithmOptions algorithmOptions5 = flexiblePathCalculator3.getAlgoOpts();
        int int6 = flexiblePathCalculator3.getVisitedNodes();
        java.lang.String str7 = flexiblePathCalculator3.getDebugString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(algorithmOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge prepareBaseEdge5 = new com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge((int) (byte) 1, (int) (byte) -1, (int) (short) 1, (float) (short) -1, (float) '#');
        int int6 = prepareBaseEdge5.getNodeB();
        int int7 = prepareBaseEdge5.getOrigEdgeKeyFirstBA();
        int int8 = prepareBaseEdge5.getOrigEdgeKeyLastAB();
        int int9 = prepareBaseEdge5.getOrigEdgeKeyLastBA();
        int int10 = prepareBaseEdge5.getPrepareEdge();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        org.locationtech.jts.geom.Polygon[] polygonArray0 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList1 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList1, polygonArray0);
        com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule germanySpatialRule3 = new com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList1);
        com.graphhopper.routing.ev.RoadClass roadClass4 = com.graphhopper.routing.ev.RoadClass.RESIDENTIAL;
        com.graphhopper.routing.util.TransportationMode transportationMode5 = null;
        double double7 = germanySpatialRule3.getMaxSpeed(roadClass4, transportationMode5, (-1.0d));
        org.junit.Assert.assertNotNull(polygonArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + roadClass4 + "' != '" + com.graphhopper.routing.ev.RoadClass.RESIDENTIAL + "'", roadClass4.equals(com.graphhopper.routing.ev.RoadClass.RESIDENTIAL));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        com.graphhopper.storage.index.Snap snap2 = new com.graphhopper.storage.index.Snap((double) (short) 100, (double) 7);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge prepareBaseEdge5 = new com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge((int) (byte) 1, (int) (byte) -1, (int) (short) 1, (float) (short) -1, (float) '#');
        int int6 = prepareBaseEdge5.getNodeB();
        int int7 = prepareBaseEdge5.getOrigEdgeKeyFirstBA();
        int int8 = prepareBaseEdge5.getOrigEdgeKeyLastAB();
        int int9 = prepareBaseEdge5.getOrigEdgeKeyLastBA();
        // The following exception was thrown during execution in test generation
        try {
            prepareBaseEdge5.setSkipped2(100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        com.graphhopper.routing.RouterConfig routerConfig0 = new com.graphhopper.routing.RouterConfig();
        routerConfig0.setActiveLandmarkCount((int) '4');
        int int3 = routerConfig0.getNonChMaxWaypointDistance();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        com.graphhopper.coll.GHTBitSet gHTBitSet1 = new com.graphhopper.coll.GHTBitSet(0);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl2 = new com.graphhopper.coll.GHBitSetImpl();
        int int4 = gHBitSetImpl2.previousClearBit(0);
        gHBitSetImpl2.clear();
        int int7 = gHBitSetImpl2.next((int) (short) 0);
        com.graphhopper.coll.GHBitSet gHBitSet8 = gHTBitSet1.copyTo((com.graphhopper.coll.GHBitSet) gHBitSetImpl2);
        com.graphhopper.coll.GHTBitSet gHTBitSet10 = new com.graphhopper.coll.GHTBitSet(0);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl11 = new com.graphhopper.coll.GHBitSetImpl();
        int int13 = gHBitSetImpl11.previousClearBit(0);
        gHBitSetImpl11.clear();
        int int16 = gHBitSetImpl11.next((int) (short) 0);
        com.graphhopper.coll.GHBitSet gHBitSet17 = gHTBitSet10.copyTo((com.graphhopper.coll.GHBitSet) gHBitSetImpl11);
        com.graphhopper.coll.GHBitSet gHBitSet18 = gHBitSetImpl2.copyTo((com.graphhopper.coll.GHBitSet) gHTBitSet10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(gHBitSet8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(gHBitSet17);
        org.junit.Assert.assertNotNull(gHBitSet18);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        com.graphhopper.storage.index.Snap snap2 = new com.graphhopper.storage.index.Snap((double) '4', 100.0d);
        com.graphhopper.storage.index.Snap snap5 = new com.graphhopper.storage.index.Snap((double) '4', 100.0d);
        boolean boolean6 = snap5.isValid();
        com.graphhopper.storage.index.Snap snap9 = new com.graphhopper.storage.index.Snap((double) '4', 100.0d);
        boolean boolean10 = snap9.isValid();
        com.graphhopper.storage.index.Snap[] snapArray11 = new com.graphhopper.storage.index.Snap[] { snap2, snap5, snap9 };
        java.util.ArrayList<com.graphhopper.storage.index.Snap> snapList12 = new java.util.ArrayList<com.graphhopper.storage.index.Snap>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.storage.index.Snap>) snapList12, snapArray11);
        com.graphhopper.routing.querygraph.QueryGraph queryGraph14 = null;
        com.graphhopper.routing.RoutingAlgorithmFactory routingAlgorithmFactory15 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions16 = null;
        com.graphhopper.routing.FlexiblePathCalculator flexiblePathCalculator17 = new com.graphhopper.routing.FlexiblePathCalculator(queryGraph14, routingAlgorithmFactory15, algorithmOptions16);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.RoundTripRouting.Result result18 = com.graphhopper.routing.RoundTripRouting.calcPaths((java.util.List<com.graphhopper.storage.index.Snap>) snapList12, flexiblePathCalculator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(snapArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage0 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue1 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser2 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue1);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray3 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager4 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray3);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser5 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup6 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue7 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray8 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue7 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList9 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList9, encodedValueArray8);
        oSMRoadClassParser5.createEncodedValues(encodedValueLookup6, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList9);
        oSMMaxWidthParser2.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager4, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList9);
        com.graphhopper.routing.DefaultWeightingFactory defaultWeightingFactory13 = new com.graphhopper.routing.DefaultWeightingFactory(graphHopperStorage0, encodingManager4);
        java.lang.String str14 = encodingManager4.toString();
        org.junit.Assert.assertNotNull(decimalEncodedValue1);
        org.junit.Assert.assertNotNull(flagEncoderArray3);
        org.junit.Assert.assertNotNull(encodingManager4);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue7);
        org.junit.Assert.assertNotNull(encodedValueArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder2 = rAMDirectory1.getByteOrder();
        rAMDirectory1.clear();
        boolean boolean4 = rAMDirectory1.isStoring();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage5 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue6 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser7 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue6);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray8 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager9 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray8);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser10 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup11 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue12 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray13 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue12 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList14 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14, encodedValueArray13);
        oSMRoadClassParser10.createEncodedValues(encodedValueLookup11, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        oSMMaxWidthParser7.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager9, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        com.graphhopper.routing.DefaultWeightingFactory defaultWeightingFactory18 = new com.graphhopper.routing.DefaultWeightingFactory(graphHopperStorage5, encodingManager9);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage22 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager9, true, false, (int) (short) 10);
        boolean boolean23 = graphHopperStorage22.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            int int26 = 0; // flaky: graphHopperStorage22.getOtherNode((int) (byte) 1, (int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(decimalEncodedValue6);
        org.junit.Assert.assertNotNull(flagEncoderArray8);
        org.junit.Assert.assertNotNull(encodingManager9);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue12);
        org.junit.Assert.assertNotNull(encodedValueArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        long[] longArray1 = new long[] { 10 };
        com.carrotsearch.hppc.LongHashSet longHashSet2 = com.carrotsearch.hppc.LongHashSet.from(longArray1);
        com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.util.shapes.BBox> bBoxGHLongObjectHashMap3 = new com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.util.shapes.BBox>();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.6871794760227203d, ' ' };
        bBoxGHLongObjectHashMap3.values = objArray6;
        long[] longArray8 = bBoxGHLongObjectHashMap3.keys;
        // The following exception was thrown during execution in test generation
        try {
            com.carrotsearch.hppc.LongLongHashMap longLongHashMap9 = com.carrotsearch.hppc.LongLongHashMap.from(longArray1, longArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arrays of keys and values must have an identical length.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[10]");
        org.junit.Assert.assertNotNull(longHashSet2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.6871794760227203,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.6871794760227203,  ]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry4 = new com.graphhopper.routing.ch.PrepareCHEntry((-1), (int) '#', (int) (short) 10, 4.003017359204114E7d);
        int int5 = prepareCHEntry4.incEdgeKey;
        double double6 = prepareCHEntry4.weight;
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry7 = prepareCHEntry4.getParent();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.003017359204114E7d + "'", double6 == 4.003017359204114E7d);
        org.junit.Assert.assertNull(prepareCHEntry7);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        int int2 = com.graphhopper.util.GHUtility.createEdgeKey(2147483647, false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        long[] longArray0 = new long[] {};
        java.util.BitSet bitSet1 = java.util.BitSet.valueOf(longArray0);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl2 = new com.graphhopper.coll.GHBitSetImpl();
        int int4 = gHBitSetImpl2.previousClearBit(0);
        gHBitSetImpl2.clear();
        boolean boolean7 = gHBitSetImpl2.contains(11);
        bitSet1.andNot((java.util.BitSet) gHBitSetImpl2);
        int int10 = bitSet1.previousClearBit((-1));
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(bitSet1);
        org.junit.Assert.assertEquals(bitSet1.toString(), "{}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        com.graphhopper.storage.IntsRef intsRef5 = com.graphhopper.storage.IntsRef.EMPTY;
        java.lang.String str6 = intsRef5.toString();
        com.graphhopper.util.PointList pointList8 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState10 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState((int) (short) 10, (-4), (-2), 2, (double) (-1), intsRef5, "PLANE_PROJ", pointList8, true);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue11 = com.graphhopper.routing.ev.Country.create();
        java.lang.String str12 = countryEnumEncodedValue11.getName();
        com.graphhopper.routing.ev.Country country13 = com.graphhopper.routing.ev.Country.AUT;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState14 = virtualEdgeIteratorState10.set(countryEnumEncodedValue11, country13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: EncodedValue country not initialized");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intsRef5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(countryEnumEncodedValue11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "country" + "'", str12, "country");
        org.junit.Assert.assertTrue("'" + country13 + "' != '" + com.graphhopper.routing.ev.Country.AUT + "'", country13.equals(com.graphhopper.routing.ev.Country.AUT));
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        long[] longArray0 = new long[] {};
        java.util.BitSet bitSet1 = java.util.BitSet.valueOf(longArray0);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl2 = new com.graphhopper.coll.GHBitSetImpl();
        int int4 = gHBitSetImpl2.previousClearBit(0);
        gHBitSetImpl2.clear();
        boolean boolean7 = gHBitSetImpl2.contains(11);
        bitSet1.andNot((java.util.BitSet) gHBitSetImpl2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.BitSet bitSet11 = gHBitSetImpl2.get((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex: 100 > toIndex: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(bitSet1);
        org.junit.Assert.assertEquals(bitSet1.toString(), "{}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType0 = com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY;
        java.util.Calendar calendar1 = com.graphhopper.reader.osm.conditional.DateRangeParser.createCalendar();
        com.graphhopper.reader.osm.conditional.ParsedCalendar parsedCalendar2 = new com.graphhopper.reader.osm.conditional.ParsedCalendar(parseType0, calendar1);
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType3 = parsedCalendar2.parseType;
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType4 = com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY;
        java.util.Calendar calendar5 = com.graphhopper.reader.osm.conditional.DateRangeParser.createCalendar();
        com.graphhopper.reader.osm.conditional.ParsedCalendar parsedCalendar6 = new com.graphhopper.reader.osm.conditional.ParsedCalendar(parseType4, calendar5);
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType7 = parsedCalendar6.parseType;
        com.graphhopper.reader.osm.conditional.DateRange dateRange8 = new com.graphhopper.reader.osm.conditional.DateRange(parsedCalendar2, parsedCalendar6);
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType9 = parsedCalendar6.parseType;
        org.junit.Assert.assertTrue("'" + parseType0 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY + "'", parseType0.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY));
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=94,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=5,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + parseType3 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY + "'", parseType3.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY));
        org.junit.Assert.assertTrue("'" + parseType4 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY + "'", parseType4.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY));
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=94,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=5,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + parseType7 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY + "'", parseType7.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY));
        org.junit.Assert.assertTrue("'" + parseType9 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY + "'", parseType9.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY));
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator5 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray6 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator5 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap7 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray1, edgeIteratorArray6);
        int[] intArray8 = edgeIteratorIntObjectHashMap7.keys;
        int int10 = edgeIteratorIntObjectHashMap7.indexOf(4);
        com.graphhopper.util.EdgeIterator edgeIterator12 = edgeIteratorIntObjectHashMap7.get((int) (byte) 1);
        edgeIteratorIntObjectHashMap7.clear();
        int int14 = edgeIteratorIntObjectHashMap7.size();
        java.lang.String str16 = edgeIteratorIntObjectHashMap7.visualizeKeyDistribution(35);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator18 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        boolean boolean19 = edgeIteratorIntObjectHashMap7.putIfAbsent(100, (com.graphhopper.util.EdgeIterator) disabledEdgeIterator18);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIterator edgeIterator21 = null; // flaky: edgeIteratorIntObjectHashMap7.indexGet(6);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(edgeIteratorArray6);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap7);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, 0, 0, 0]");
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4) + "'", int10 == (-4));
        org.junit.Assert.assertNull(edgeIterator12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "....                               " + "'", str16, "....                               ");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator5 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray6 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator5 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap7 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray1, edgeIteratorArray6);
        int[] intArray8 = edgeIteratorIntObjectHashMap7.keys;
        java.lang.String str10 = edgeIteratorIntObjectHashMap7.visualizeKeyDistribution(100);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator13 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             edgeIteratorIntObjectHashMap7.indexInsert((int) 'a', 0, (com.graphhopper.util.EdgeIterator) disabledEdgeIterator13);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(edgeIteratorArray6);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap7);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 100, 0, 0]");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "..X.                                                                                                " + "'", str10, "..X.                                                                                                ");
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        com.graphhopper.util.shapes.BBox bBox4 = new com.graphhopper.util.shapes.BBox((double) 10, (double) 35L, (double) 0, (double) (-4));
        double double5 = bBox4.minLon;
        double double6 = bBox4.minLat;
        com.graphhopper.util.shapes.BBox bBox7 = bBox4.getBounds();
        com.graphhopper.util.shapes.BBox bBox8 = bBox4.clone();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(bBox7);
        org.junit.Assert.assertNotNull(bBox8);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.FetchMode fetchMode1 = com.graphhopper.util.FetchMode.PILLAR_ONLY;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.PointList pointList2 = disabledEdgeIterator0.fetchWayGeometry(fetchMode1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + fetchMode1 + "' != '" + com.graphhopper.util.FetchMode.PILLAR_ONLY + "'", fetchMode1.equals(com.graphhopper.util.FetchMode.PILLAR_ONLY));
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        java.lang.String str0 = com.graphhopper.util.Constants.OS_VERSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "5.4.0-70-generic" + "'", str0, "5.4.0-70-generic");
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        com.graphhopper.coll.GHTBitSet gHTBitSet1 = new com.graphhopper.coll.GHTBitSet(0);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl2 = new com.graphhopper.coll.GHBitSetImpl();
        int int4 = gHBitSetImpl2.previousClearBit(0);
        gHBitSetImpl2.clear();
        int int7 = gHBitSetImpl2.next((int) (short) 0);
        com.graphhopper.coll.GHBitSet gHBitSet8 = gHTBitSet1.copyTo((com.graphhopper.coll.GHBitSet) gHBitSetImpl2);
        int int9 = gHTBitSet1.getCardinality();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(gHBitSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator5 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray6 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator5 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap7 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray1, edgeIteratorArray6);
        int[] intArray8 = edgeIteratorIntObjectHashMap7.keys;
        int int10 = edgeIteratorIntObjectHashMap7.indexOf(4);
        com.graphhopper.util.EdgeIterator edgeIterator12 = edgeIteratorIntObjectHashMap7.get((int) (byte) 1);
        edgeIteratorIntObjectHashMap7.clear();
        int int14 = edgeIteratorIntObjectHashMap7.size();
        java.lang.String str16 = edgeIteratorIntObjectHashMap7.visualizeKeyDistribution(35);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator18 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        boolean boolean19 = edgeIteratorIntObjectHashMap7.putIfAbsent(100, (com.graphhopper.util.EdgeIterator) disabledEdgeIterator18);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue20 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser21 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue20);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState23 = disabledEdgeIterator18.setReverse(decimalEncodedValue20, 1.5707963267948966d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(edgeIteratorArray6);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap7);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 100, 0, 0]");
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertNull(edgeIterator12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "....                               " + "'", str16, "....                               ");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(decimalEncodedValue20);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        java.lang.String str0 = com.graphhopper.routing.ch.CHParameters.NEIGHBOR_UPDATES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "prepare.ch.updates.neighbor" + "'", str0, "prepare.ch.updates.neighbor");
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue0 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser1 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue0);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray2 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager3 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray2);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser4 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup5 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue6 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray7 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue6 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList8 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList8, encodedValueArray7);
        oSMRoadClassParser4.createEncodedValues(encodedValueLookup5, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList8);
        oSMMaxWidthParser1.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager3, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList8);
        java.util.List<com.graphhopper.routing.util.FlagEncoder> flagEncoderList12 = encodingManager3.fetchEdgeEncoders();
        com.graphhopper.routing.util.parsers.OSMRoadClassLinkParser oSMRoadClassLinkParser13 = new com.graphhopper.routing.util.parsers.OSMRoadClassLinkParser();
        com.graphhopper.storage.IntsRef intsRef14 = com.graphhopper.storage.IntsRef.EMPTY;
        int int15 = intsRef14.offset;
        com.graphhopper.reader.ReaderWay readerWay17 = new com.graphhopper.reader.ReaderWay((long) (byte) 100);
        com.graphhopper.storage.IntsRef intsRef19 = com.graphhopper.storage.IntsRef.EMPTY;
        com.graphhopper.storage.IntsRef intsRef20 = com.graphhopper.storage.IntsRef.EMPTY;
        boolean boolean21 = intsRef19.intsEquals(intsRef20);
        int int22 = intsRef19.length;
        com.graphhopper.storage.IntsRef intsRef23 = oSMRoadClassLinkParser13.handleWayTags(intsRef14, readerWay17, false, intsRef19);
        com.graphhopper.routing.util.EncodingManager.AcceptWay acceptWay24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = encodingManager3.acceptWay(readerWay17, acceptWay24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(decimalEncodedValue0);
        org.junit.Assert.assertNotNull(flagEncoderArray2);
        org.junit.Assert.assertNotNull(encodingManager3);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue6);
        org.junit.Assert.assertNotNull(encodedValueArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(flagEncoderList12);
        org.junit.Assert.assertNotNull(intsRef14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intsRef19);
        org.junit.Assert.assertNotNull(intsRef20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intsRef23);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        org.locationtech.jts.geom.Polygon[] polygonArray0 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList1 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList1, polygonArray0);
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule3 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList1);
        int int4 = austriaSpatialRule3.getPriority();
        org.locationtech.jts.geom.Polygon[] polygonArray5 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList6 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList6, polygonArray5);
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule8 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList6);
        int int9 = austriaSpatialRule8.getPriority();
        com.graphhopper.routing.ev.RoadClass roadClass10 = com.graphhopper.routing.ev.RoadClass.PATH;
        com.graphhopper.routing.util.TransportationMode transportationMode11 = com.graphhopper.routing.util.TransportationMode.BIKE;
        double double13 = austriaSpatialRule8.getMaxSpeed(roadClass10, transportationMode11, (double) (-4));
        org.locationtech.jts.geom.Polygon[] polygonArray14 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList15 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList15, polygonArray14);
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule17 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList15);
        java.util.List<org.locationtech.jts.geom.Polygon> polygonList18 = austriaSpatialRule17.getBorders();
        org.locationtech.jts.geom.Polygon[] polygonArray19 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList20 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList20, polygonArray19);
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule22 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList20);
        java.util.List<org.locationtech.jts.geom.Polygon> polygonList23 = austriaSpatialRule22.getBorders();
        org.locationtech.jts.geom.Polygon[] polygonArray24 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList25 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList25, polygonArray24);
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule27 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList25);
        java.lang.String str28 = austriaSpatialRule27.toString();
        java.util.List<org.locationtech.jts.geom.Polygon> polygonList29 = austriaSpatialRule27.getBorders();
        com.graphhopper.routing.util.spatialrules.SpatialRule[] spatialRuleArray30 = new com.graphhopper.routing.util.spatialrules.SpatialRule[] { austriaSpatialRule3, austriaSpatialRule8, austriaSpatialRule17, austriaSpatialRule22, austriaSpatialRule27 };
        java.util.ArrayList<com.graphhopper.routing.util.spatialrules.SpatialRule> spatialRuleList31 = new java.util.ArrayList<com.graphhopper.routing.util.spatialrules.SpatialRule>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.util.spatialrules.SpatialRule>) spatialRuleList31, spatialRuleArray30);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.spatialrules.SpatialRuleLookupJTS spatialRuleLookupJTS33 = new com.graphhopper.routing.util.spatialrules.SpatialRuleLookupJTS((java.util.List<com.graphhopper.routing.util.spatialrules.SpatialRule>) spatialRuleList31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duplicate rule ID: \"aut\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(polygonArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(polygonArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + roadClass10 + "' != '" + com.graphhopper.routing.ev.RoadClass.PATH + "'", roadClass10.equals(com.graphhopper.routing.ev.RoadClass.PATH));
        org.junit.Assert.assertTrue("'" + transportationMode11 + "' != '" + com.graphhopper.routing.util.TransportationMode.BIKE + "'", transportationMode11.equals(com.graphhopper.routing.util.TransportationMode.BIKE));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-4.0d) + "'", double13 == (-4.0d));
        org.junit.Assert.assertNotNull(polygonArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(polygonList18);
        org.junit.Assert.assertNotNull(polygonArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(polygonList23);
        org.junit.Assert.assertNotNull(polygonArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "SpatialRule [getId()=aut, getPriority()=100]" + "'", str28, "SpatialRule [getId()=aut, getPriority()=100]");
        org.junit.Assert.assertNotNull(polygonList29);
        org.junit.Assert.assertNotNull(spatialRuleArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        com.graphhopper.storage.IntsRef intsRef0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.IntsRef intsRef1 = com.graphhopper.storage.IntsRef.deepCopyOf(intsRef0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.RoadAccess> roadAccessEnumEncodedValue0 = null;
        com.graphhopper.reader.ReaderNode readerNode4 = new com.graphhopper.reader.ReaderNode((long) ' ', (double) 1L, (double) 3);
        boolean boolean6 = readerNode4.isType((int) '4');
        java.lang.String[] strArray21 = new java.lang.String[] { "wheelchair", "country", "cgiar", "", "3.0", "get_off_bike", "", "3.0", "road_class_link", "[]", "prepare.ch.log_messages", "", "prepare.ch.log_messages", "mtb" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.lang.String str24 = readerNode4.getFirstPriorityTag((java.util.List<java.lang.String>) strList22);
        com.graphhopper.routing.util.parsers.OSMRoadAccessParser oSMRoadAccessParser25 = new com.graphhopper.routing.util.parsers.OSMRoadAccessParser(roadAccessEnumEncodedValue0, (java.util.List<java.lang.String>) strList22);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser26 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup27 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue28 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray29 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue28 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList30 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList30, encodedValueArray29);
        oSMRoadClassParser26.createEncodedValues(encodedValueLookup27, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList30);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup33 = null;
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser34 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup35 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue36 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray37 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue36 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList38 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList38, encodedValueArray37);
        oSMRoadClassParser34.createEncodedValues(encodedValueLookup35, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList38);
        oSMRoadClassParser26.createEncodedValues(encodedValueLookup33, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList38);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup42 = null;
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser43 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup44 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue45 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray46 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue45 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList47 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList47, encodedValueArray46);
        oSMRoadClassParser43.createEncodedValues(encodedValueLookup44, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList47);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup50 = null;
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser51 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup52 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue53 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray54 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue53 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList55 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList55, encodedValueArray54);
        oSMRoadClassParser51.createEncodedValues(encodedValueLookup52, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList55);
        oSMRoadClassParser43.createEncodedValues(encodedValueLookup50, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList55);
        oSMRoadClassParser26.createEncodedValues(encodedValueLookup42, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList55);
        com.graphhopper.storage.IntsRef intsRef60 = com.graphhopper.storage.IntsRef.EMPTY;
        com.graphhopper.storage.IntsRef intsRef61 = com.graphhopper.storage.IntsRef.EMPTY;
        boolean boolean62 = intsRef60.intsEquals(intsRef61);
        com.graphhopper.reader.ReaderWay readerWay63 = null;
        int[] intArray66 = new int[] { 100 };
        long[] longArray68 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap69 = com.carrotsearch.hppc.IntLongHashMap.from(intArray66, longArray68);
        int[] intArray71 = new int[] { 100 };
        long[] longArray73 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap74 = com.carrotsearch.hppc.IntLongHashMap.from(intArray71, longArray73);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator75 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray76 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator75 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap77 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray71, edgeIteratorArray76);
        int[] intArray78 = com.graphhopper.util.ArrayUtil.merge(intArray66, intArray71);
        com.graphhopper.storage.IntsRef intsRef81 = new com.graphhopper.storage.IntsRef(intArray66, (int) (short) 0, 0);
        com.graphhopper.storage.IntsRef intsRef82 = com.graphhopper.storage.IntsRef.EMPTY;
        boolean boolean83 = intsRef81.intsEquals(intsRef82);
        com.graphhopper.storage.IntsRef intsRef84 = oSMRoadClassParser26.handleWayTags(intsRef60, readerWay63, true, intsRef82);
        com.graphhopper.routing.util.parsers.OSMRoadClassLinkParser oSMRoadClassLinkParser85 = new com.graphhopper.routing.util.parsers.OSMRoadClassLinkParser();
        com.graphhopper.storage.IntsRef intsRef86 = com.graphhopper.storage.IntsRef.EMPTY;
        int int87 = intsRef86.offset;
        com.graphhopper.reader.ReaderWay readerWay89 = new com.graphhopper.reader.ReaderWay((long) (byte) 100);
        com.graphhopper.storage.IntsRef intsRef91 = com.graphhopper.storage.IntsRef.EMPTY;
        com.graphhopper.storage.IntsRef intsRef92 = com.graphhopper.storage.IntsRef.EMPTY;
        boolean boolean93 = intsRef91.intsEquals(intsRef92);
        int int94 = intsRef91.length;
        com.graphhopper.storage.IntsRef intsRef95 = oSMRoadClassLinkParser85.handleWayTags(intsRef86, readerWay89, false, intsRef91);
        com.graphhopper.storage.IntsRef intsRef97 = com.graphhopper.storage.IntsRef.EMPTY;
        java.lang.String str98 = intsRef97.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.IntsRef intsRef99 = oSMRoadAccessParser25.handleWayTags(intsRef82, readerWay89, true, intsRef97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(countryEnumEncodedValue28);
        org.junit.Assert.assertNotNull(encodedValueArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue36);
        org.junit.Assert.assertNotNull(encodedValueArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue45);
        org.junit.Assert.assertNotNull(encodedValueArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue53);
        org.junit.Assert.assertNotNull(encodedValueArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intsRef60);
        org.junit.Assert.assertNotNull(intsRef61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[100]");
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap69);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[100]");
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray73), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap74);
        org.junit.Assert.assertNotNull(edgeIteratorArray76);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap77);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[100]");
        org.junit.Assert.assertNotNull(intsRef82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(intsRef84);
        org.junit.Assert.assertNotNull(intsRef86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(intsRef91);
        org.junit.Assert.assertNotNull(intsRef92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertNotNull(intsRef95);
        org.junit.Assert.assertNotNull(intsRef97);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "[]" + "'", str98, "[]");
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        com.graphhopper.routing.querygraph.QueryGraph queryGraph0 = null;
        com.graphhopper.routing.RoutingAlgorithmFactory routingAlgorithmFactory1 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions2 = null;
        com.graphhopper.routing.FlexiblePathCalculator flexiblePathCalculator3 = new com.graphhopper.routing.FlexiblePathCalculator(queryGraph0, routingAlgorithmFactory1, algorithmOptions2);
        int int4 = flexiblePathCalculator3.getVisitedNodes();
        int int5 = flexiblePathCalculator3.getVisitedNodes();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry4 = new com.graphhopper.routing.ch.PrepareCHEntry((-1), (int) '#', (int) (short) 10, 4.003017359204114E7d);
        int int5 = prepareCHEntry4.incEdgeKey;
        int int6 = prepareCHEntry4.prepareEdge;
        int int7 = prepareCHEntry4.adjNode;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        com.graphhopper.storage.IntsRef intsRef0 = com.graphhopper.storage.IntsRef.EMPTY;
        boolean boolean1 = intsRef0.isEmpty();
        org.junit.Assert.assertNotNull(intsRef0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        com.graphhopper.storage.IntsRef intsRef5 = com.graphhopper.storage.IntsRef.EMPTY;
        java.lang.String str6 = intsRef5.toString();
        com.graphhopper.util.PointList pointList8 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState10 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState((int) (short) 10, (-4), (-2), 2, (double) (-1), intsRef5, "PLANE_PROJ", pointList8, true);
        int int11 = virtualEdgeIteratorState10.getBaseNode();
        com.graphhopper.storage.IntsRef intsRef13 = com.graphhopper.routing.ev.TurnCost.createFlags();
        com.graphhopper.util.EdgeIteratorState edgeIteratorState19 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState(3.6461703979660586E12d, intsRef13, (int) (short) 1, (int) (byte) 100, 35, (-2), (int) 'a');
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue20 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        boolean boolean21 = edgeIteratorState19.get(booleanEncodedValue20);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState24 = virtualEdgeIteratorState10.set(booleanEncodedValue20, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue reverse supports only one direction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intsRef5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(intsRef13);
        org.junit.Assert.assertNotNull(edgeIteratorState19);
        org.junit.Assert.assertNotNull(booleanEncodedValue20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        com.carrotsearch.hppc.IntArrayList intArrayList1 = com.graphhopper.util.ArrayUtil.iota(4);
        com.carrotsearch.hppc.IntArrayList intArrayList2 = com.graphhopper.util.ArrayUtil.reverse(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType0 = com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY;
        java.util.Calendar calendar1 = com.graphhopper.reader.osm.conditional.DateRangeParser.createCalendar();
        com.graphhopper.reader.osm.conditional.ParsedCalendar parsedCalendar2 = new com.graphhopper.reader.osm.conditional.ParsedCalendar(parseType0, calendar1);
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType3 = parsedCalendar2.parseType;
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType4 = com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY;
        java.util.Calendar calendar5 = com.graphhopper.reader.osm.conditional.DateRangeParser.createCalendar();
        com.graphhopper.reader.osm.conditional.ParsedCalendar parsedCalendar6 = new com.graphhopper.reader.osm.conditional.ParsedCalendar(parseType4, calendar5);
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType7 = parsedCalendar6.parseType;
        com.graphhopper.reader.osm.conditional.DateRange dateRange8 = new com.graphhopper.reader.osm.conditional.DateRange(parsedCalendar2, parsedCalendar6);
        java.util.Calendar calendar9 = parsedCalendar2.getMax();
        org.junit.Assert.assertTrue("'" + parseType0 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY + "'", parseType0.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY));
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=94,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=5,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + parseType3 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY + "'", parseType3.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY));
        org.junit.Assert.assertTrue("'" + parseType4 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY + "'", parseType4.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY));
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=94,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=5,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + parseType7 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY + "'", parseType7.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY));
        org.junit.Assert.assertNotNull(calendar9);
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=94,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=5,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        com.graphhopper.routing.ev.TrackType trackType0 = com.graphhopper.routing.ev.TrackType.GRADE2;
        org.junit.Assert.assertTrue("'" + trackType0 + "' != '" + com.graphhopper.routing.ev.TrackType.GRADE2 + "'", trackType0.equals(com.graphhopper.routing.ev.TrackType.GRADE2));
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.BIG;
        byte[] byteArray2 = bitUtil0.fromDouble(6378137.0d);
        long long5 = bitUtil0.toLong(0, 4);
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[65, 88, 84, -90, 64, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 4L + "'", long5 == 4L);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        int[] intArray6 = new int[] { 100 };
        long[] longArray8 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap9 = com.carrotsearch.hppc.IntLongHashMap.from(intArray6, longArray8);
        com.carrotsearch.hppc.LongLongHashMap longLongHashMap10 = com.carrotsearch.hppc.LongLongHashMap.from(longArray3, longArray8);
        long[] longArray12 = new long[] { 10 };
        com.carrotsearch.hppc.LongHashSet longHashSet13 = com.carrotsearch.hppc.LongHashSet.from(longArray12);
        int int14 = longLongHashMap10.removeAll((com.carrotsearch.hppc.LongContainer) longHashSet13);
        com.carrotsearch.hppc.predicates.LongPredicate longPredicate15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = longHashSet13.retainAll(longPredicate15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap9);
        org.junit.Assert.assertNotNull(longLongHashMap10);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[10]");
        org.junit.Assert.assertNotNull(longHashSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        com.graphhopper.routing.ev.RoadAccess roadAccess0 = com.graphhopper.routing.ev.RoadAccess.PRIVATE;
        org.junit.Assert.assertTrue("'" + roadAccess0 + "' != '" + com.graphhopper.routing.ev.RoadAccess.PRIVATE + "'", roadAccess0.equals(com.graphhopper.routing.ev.RoadAccess.PRIVATE));
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        long[] longArray1 = new long[] { 10 };
        com.carrotsearch.hppc.LongHashSet longHashSet2 = com.carrotsearch.hppc.LongHashSet.from(longArray1);
        boolean boolean4 = longHashSet2.add((-1L));
        java.util.Spliterator<com.carrotsearch.hppc.cursors.LongCursor> longCursorSpliterator5 = longHashSet2.spliterator();
        com.carrotsearch.hppc.predicates.LongPredicate longPredicate6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = longHashSet2.removeAll(longPredicate6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[10]");
        org.junit.Assert.assertNotNull(longHashSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(longCursorSpliterator5);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        com.carrotsearch.hppc.IntArrayList intArrayList1 = com.graphhopper.util.ArrayUtil.zero(1);
        org.junit.Assert.assertNotNull(intArrayList1);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        com.graphhopper.util.details.EdgeKeyDetails edgeKeyDetails0 = new com.graphhopper.util.details.EdgeKeyDetails();
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser oSMFootNetworkTagParser0 = new com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray1 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager2 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray1);
        java.lang.String str3 = encodingManager2.toEncodedValuesAsString();
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser4 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup5 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue6 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray7 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue6 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList8 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList8, encodedValueArray7);
        oSMRoadClassParser4.createEncodedValues(encodedValueLookup5, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList8);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup11 = null;
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser12 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup13 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue14 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray15 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue14 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList16 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList16, encodedValueArray15);
        oSMRoadClassParser12.createEncodedValues(encodedValueLookup13, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList16);
        oSMRoadClassParser4.createEncodedValues(encodedValueLookup11, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList16);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup20 = null;
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser21 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup22 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue23 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray24 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue23 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList25 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList25, encodedValueArray24);
        oSMRoadClassParser21.createEncodedValues(encodedValueLookup22, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList25);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup28 = null;
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser29 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup30 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue31 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray32 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue31 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList33 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList33, encodedValueArray32);
        oSMRoadClassParser29.createEncodedValues(encodedValueLookup30, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList33);
        oSMRoadClassParser21.createEncodedValues(encodedValueLookup28, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList33);
        oSMRoadClassParser4.createEncodedValues(encodedValueLookup20, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList33);
        oSMFootNetworkTagParser0.createRelationEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager2, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList33);
        com.graphhopper.storage.IntsRef intsRef39 = com.graphhopper.storage.IntsRef.EMPTY;
        com.graphhopper.storage.IntsRef intsRef40 = com.graphhopper.storage.IntsRef.EMPTY;
        boolean boolean41 = intsRef39.intsEquals(intsRef40);
        int int42 = intsRef39.length;
        com.graphhopper.reader.ReaderRelation readerRelation43 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.IntsRef intsRef44 = oSMFootNetworkTagParser0.handleRelationTags(intsRef39, readerRelation43);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(flagEncoderArray1);
        org.junit.Assert.assertNotNull(encodingManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "roundabout|version=283388307|bits=1|index=0|shift=0|store_both_directions=false,road_class|version=2007543510|bits=5|index=0|shift=1|store_both_directions=false,road_class_link|version=146075245|bits=1|index=0|shift=6|store_both_directions=false,road_environment|version=-446726394|bits=3|index=0|shift=7|store_both_directions=false,max_speed|version=-1300485567|bits=5|index=0|shift=10|store_both_directions=true,road_access|version=-313723172|bits=4|index=0|shift=20|store_both_directions=false" + "'", str3, "roundabout|version=283388307|bits=1|index=0|shift=0|store_both_directions=false,road_class|version=2007543510|bits=5|index=0|shift=1|store_both_directions=false,road_class_link|version=146075245|bits=1|index=0|shift=6|store_both_directions=false,road_environment|version=-446726394|bits=3|index=0|shift=7|store_both_directions=false,max_speed|version=-1300485567|bits=5|index=0|shift=10|store_both_directions=true,road_access|version=-313723172|bits=4|index=0|shift=20|store_both_directions=false");
        org.junit.Assert.assertNotNull(countryEnumEncodedValue6);
        org.junit.Assert.assertNotNull(encodedValueArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue14);
        org.junit.Assert.assertNotNull(encodedValueArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue23);
        org.junit.Assert.assertNotNull(encodedValueArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue31);
        org.junit.Assert.assertNotNull(encodedValueArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intsRef39);
        org.junit.Assert.assertNotNull(intsRef40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.shapes.Polygon polygon1 = com.graphhopper.util.shapes.Polygon.parsePoints("custom_network/");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: incorrect polygon specified: [custom_network/]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        com.graphhopper.routing.util.DefaultFlagEncoderFactory defaultFlagEncoderFactory0 = new com.graphhopper.routing.util.DefaultFlagEncoderFactory();
        com.graphhopper.util.PMap pMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.FlagEncoder flagEncoder3 = defaultFlagEncoderFactory0.createFlagEncoder("OSM File header:{}", pMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: entry in encoder list not supported OSM File header:{}");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder2 = rAMDirectory1.getByteOrder();
        rAMDirectory1.clear();
        boolean boolean4 = rAMDirectory1.isStoring();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage5 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue6 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser7 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue6);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray8 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager9 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray8);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser10 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup11 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue12 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray13 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue12 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList14 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14, encodedValueArray13);
        oSMRoadClassParser10.createEncodedValues(encodedValueLookup11, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        oSMMaxWidthParser7.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager9, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        com.graphhopper.routing.DefaultWeightingFactory defaultWeightingFactory18 = new com.graphhopper.routing.DefaultWeightingFactory(graphHopperStorage5, encodingManager9);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage22 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager9, true, false, (int) (short) 10);
        boolean boolean23 = graphHopperStorage22.isClosed();
        com.graphhopper.storage.TurnCostStorage turnCostStorage24 = graphHopperStorage22.getTurnCostStorage();
        com.graphhopper.storage.Graph graph25 = graphHopperStorage22.getBaseGraph();
        com.graphhopper.routing.weighting.Weighting weighting26 = null;
        com.graphhopper.routing.lm.LandmarkStorage landmarkStorage28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.lm.LMApproximator lMApproximator32 = new com.graphhopper.routing.lm.LMApproximator(graph25, weighting26, (int) (short) 10, landmarkStorage28, (int) 'a', 0.6209609478125566d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(decimalEncodedValue6);
        org.junit.Assert.assertNotNull(flagEncoderArray8);
        org.junit.Assert.assertNotNull(encodingManager9);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue12);
        org.junit.Assert.assertNotNull(encodedValueArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(turnCostStorage24);
        org.junit.Assert.assertNotNull(graph25);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        org.locationtech.jts.geom.Polygon[] polygonArray0 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList1 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList1, polygonArray0);
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule3 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList1);
        java.util.List<org.locationtech.jts.geom.Polygon> polygonList4 = austriaSpatialRule3.getBorders();
        java.lang.String str5 = austriaSpatialRule3.toString();
        org.junit.Assert.assertNotNull(polygonArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(polygonList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SpatialRule [getId()=aut, getPriority()=100]" + "'", str5, "SpatialRule [getId()=aut, getPriority()=100]");
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator5 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray6 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator5 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap7 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray1, edgeIteratorArray6);
        int[] intArray8 = edgeIteratorIntObjectHashMap7.keys;
        int int10 = edgeIteratorIntObjectHashMap7.indexOf(4);
        com.graphhopper.util.EdgeIterator edgeIterator12 = edgeIteratorIntObjectHashMap7.get((int) (byte) 1);
        edgeIteratorIntObjectHashMap7.clear();
        int int14 = edgeIteratorIntObjectHashMap7.size();
        java.lang.String str16 = edgeIteratorIntObjectHashMap7.visualizeKeyDistribution(35);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator18 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        boolean boolean19 = edgeIteratorIntObjectHashMap7.putIfAbsent(100, (com.graphhopper.util.EdgeIterator) disabledEdgeIterator18);
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue23 = new com.graphhopper.routing.ev.StringEncodedValue("custom", (int) ' ', false);
        int[] intArray26 = new int[] { 100 };
        long[] longArray28 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap29 = com.carrotsearch.hppc.IntLongHashMap.from(intArray26, longArray28);
        int[] intArray31 = new int[] { 100 };
        long[] longArray33 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap34 = com.carrotsearch.hppc.IntLongHashMap.from(intArray31, longArray33);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator35 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray36 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator35 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap37 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray31, edgeIteratorArray36);
        int[] intArray38 = com.graphhopper.util.ArrayUtil.merge(intArray26, intArray31);
        com.graphhopper.storage.IntsRef intsRef41 = new com.graphhopper.storage.IntsRef(intArray26, (int) (short) 0, 0);
        java.lang.String str42 = stringEncodedValue23.getString(true, intsRef41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = disabledEdgeIterator18.getReverse(stringEncodedValue23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(edgeIteratorArray6);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap7);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, 0, 0, 0]");
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-3) + "'", int10 == (-3));
        org.junit.Assert.assertNull(edgeIterator12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "....                               " + "'", str16, "....                               ");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap34);
        org.junit.Assert.assertNotNull(edgeIteratorArray36);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap37);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100]");
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator5 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray6 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator5 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap7 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray1, edgeIteratorArray6);
        int[] intArray8 = edgeIteratorIntObjectHashMap7.keys;
        int int10 = edgeIteratorIntObjectHashMap7.indexOf(4);
        com.graphhopper.util.EdgeIterator edgeIterator12 = edgeIteratorIntObjectHashMap7.get((int) (byte) 1);
        edgeIteratorIntObjectHashMap7.clear();
        int int14 = edgeIteratorIntObjectHashMap7.size();
        java.lang.String str16 = edgeIteratorIntObjectHashMap7.visualizeKeyDistribution(35);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator18 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIterator edgeIterator19 = null; // flaky: edgeIteratorIntObjectHashMap7.indexReplace((-10), (com.graphhopper.util.EdgeIterator) disabledEdgeIterator18);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(edgeIteratorArray6);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0, 0]");
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-3) + "'", int10 == (-3));
        org.junit.Assert.assertNull(edgeIterator12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "....                               " + "'", str16, "....                               ");
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap0 = new com.graphhopper.coll.GHIntLongHashMap();
        int[] intArray1 = gHIntLongHashMap0.keys;
        boolean boolean3 = false; // flaky: gHIntLongHashMap0.indexExists(1687814340);
        int[] intArray5 = new int[] { 100 };
        long[] longArray7 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap8 = com.carrotsearch.hppc.IntLongHashMap.from(intArray5, longArray7);
        int[] intArray10 = new int[] { 100 };
        long[] longArray12 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap13 = com.carrotsearch.hppc.IntLongHashMap.from(intArray10, longArray12);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator14 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray15 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator14 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap16 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray10, edgeIteratorArray15);
        int[] intArray17 = com.graphhopper.util.ArrayUtil.merge(intArray5, intArray10);
        com.carrotsearch.hppc.IntHashSet intHashSet18 = com.graphhopper.coll.GHIntHashSet.from(intArray17);
        int[] intArray19 = intHashSet18.toArray();
        com.graphhopper.routing.ev.HazmatTunnel hazmatTunnel20 = com.graphhopper.routing.ev.HazmatTunnel.D;
        boolean boolean21 = intHashSet18.equals((java.lang.Object) hazmatTunnel20);
        boolean boolean23 = intHashSet18.contains(35);
        int int24 = gHIntLongHashMap0.removeAll((com.carrotsearch.hppc.IntContainer) intHashSet18);
        com.carrotsearch.hppc.IntLongHashMap.KeysContainer keysContainer25 = gHIntLongHashMap0.keys();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
// flaky:         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap13);
        org.junit.Assert.assertNotNull(edgeIteratorArray15);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100]");
        org.junit.Assert.assertNotNull(intHashSet18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100]");
        org.junit.Assert.assertTrue("'" + hazmatTunnel20 + "' != '" + com.graphhopper.routing.ev.HazmatTunnel.D + "'", hazmatTunnel20.equals(com.graphhopper.routing.ev.HazmatTunnel.D));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(keysContainer25);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
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
        int[] intArray15 = intHashSet14.toArray();
        com.graphhopper.routing.ev.HazmatTunnel hazmatTunnel16 = com.graphhopper.routing.ev.HazmatTunnel.D;
        boolean boolean17 = intHashSet14.equals((java.lang.Object) hazmatTunnel16);
        java.util.Spliterator<com.carrotsearch.hppc.cursors.IntCursor> intCursorSpliterator18 = intHashSet14.spliterator();
        java.util.Spliterator<com.carrotsearch.hppc.cursors.IntCursor> intCursorSpliterator19 = intHashSet14.spliterator();
        int[] intArray21 = new int[] { 100 };
        long[] longArray23 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap24 = com.carrotsearch.hppc.IntLongHashMap.from(intArray21, longArray23);
        int int25 = intHashSet14.addAll(intArray21);
        com.carrotsearch.hppc.predicates.IntPredicate intPredicate26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intHashSet14.removeAll(intPredicate26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap9);
        org.junit.Assert.assertNotNull(edgeIteratorArray11);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100]");
        org.junit.Assert.assertNotNull(intHashSet14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100]");
        org.junit.Assert.assertTrue("'" + hazmatTunnel16 + "' != '" + com.graphhopper.routing.ev.HazmatTunnel.D + "'", hazmatTunnel16.equals(com.graphhopper.routing.ev.HazmatTunnel.D));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intCursorSpliterator18);
        org.junit.Assert.assertNotNull(intCursorSpliterator19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        com.graphhopper.routing.ch.CHPreparationHandler cHPreparationHandler0 = new com.graphhopper.routing.ch.CHPreparationHandler();
        java.util.List<com.graphhopper.storage.CHConfig> cHConfigList1 = cHPreparationHandler0.getEdgeBasedCHConfigs();
        org.junit.Assert.assertNotNull(cHConfigList1);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap1 = new com.graphhopper.coll.GHLongLongHashMap(3);
        long[] longArray2 = new long[] {};
        java.util.BitSet bitSet3 = java.util.BitSet.valueOf(longArray2);
        gHLongLongHashMap1.values = longArray2;
        boolean boolean6 = false; // flaky: gHLongLongHashMap1.indexExists(11);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(bitSet3);
        org.junit.Assert.assertEquals(bitSet3.toString(), "{}");
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.util.shapes.BBox> bBoxGHLongObjectHashMap0 = new com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.util.shapes.BBox>();
        long[] longArray1 = bBoxGHLongObjectHashMap0.keys;
        int int2 = bBoxGHLongObjectHashMap0.size();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry4 = new com.graphhopper.routing.ch.PrepareCHEntry((-1), (int) '#', (int) (short) 10, 4.003017359204114E7d);
        int int5 = prepareCHEntry4.incEdgeKey;
        int int6 = prepareCHEntry4.prepareEdge;
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry11 = new com.graphhopper.routing.ch.PrepareCHEntry((-1), (int) '#', (int) (short) 10, 4.003017359204114E7d);
        int int12 = prepareCHEntry11.incEdgeKey;
        double double13 = prepareCHEntry11.weight;
        prepareCHEntry11.adjNode = (byte) -1;
        prepareCHEntry4.parent = prepareCHEntry11;
        prepareCHEntry11.weight = 2;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.003017359204114E7d + "'", double13 == 4.003017359204114E7d);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge prepareBaseEdge5 = new com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge((-3), (-4), (int) (short) 1, (float) 201, (float) 201);
        int int6 = prepareBaseEdge5.getOrigEdgeKeyFirstAB();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-6) + "'", int6 == (-6));
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        com.graphhopper.storage.RAMDirectory rAMDirectory0 = new com.graphhopper.storage.RAMDirectory();
        com.graphhopper.search.StringIndex stringIndex1 = new com.graphhopper.search.StringIndex((com.graphhopper.storage.Directory) rAMDirectory0);
        stringIndex1.flush();
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.util.PathMerger pathMerger2 = new com.graphhopper.util.PathMerger(graph0, weighting1);
        com.graphhopper.util.PathMerger pathMerger4 = pathMerger2.setCalcPoints(true);
        com.graphhopper.util.details.PathDetailsBuilderFactory pathDetailsBuilderFactory5 = new com.graphhopper.util.details.PathDetailsBuilderFactory();
        java.util.List<java.lang.String> strList6 = null;
        com.graphhopper.util.PathMerger pathMerger7 = pathMerger2.setPathDetailsBuilders(pathDetailsBuilderFactory5, strList6);
        com.graphhopper.util.PointList pointList8 = null;
        com.graphhopper.routing.Path[] pathArray9 = new com.graphhopper.routing.Path[] {};
        java.util.ArrayList<com.graphhopper.routing.Path> pathList10 = new java.util.ArrayList<com.graphhopper.routing.Path>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.Path>) pathList10, pathArray9);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage12 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue13 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser14 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue13);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray15 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager16 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray15);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser17 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup18 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue19 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray20 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue19 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList21 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList21, encodedValueArray20);
        oSMRoadClassParser17.createEncodedValues(encodedValueLookup18, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList21);
        oSMMaxWidthParser14.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager16, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList21);
        com.graphhopper.routing.DefaultWeightingFactory defaultWeightingFactory25 = new com.graphhopper.routing.DefaultWeightingFactory(graphHopperStorage12, encodingManager16);
        java.util.Locale locale26 = null;
        com.graphhopper.util.TranslationMap.TranslationHashMap translationHashMap27 = new com.graphhopper.util.TranslationMap.TranslationHashMap(locale26);
        com.graphhopper.util.TranslationMap.TranslationHashMap translationHashMap30 = translationHashMap27.put("mtb", "get_off_bike");
        java.util.Locale locale31 = translationHashMap27.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.ResponsePath responsePath32 = pathMerger7.doWork(pointList8, (java.util.List<com.graphhopper.routing.Path>) pathList10, (com.graphhopper.routing.ev.EncodedValueLookup) encodingManager16, (com.graphhopper.util.Translation) translationHashMap27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: inconsistent instructions, total interval length: 0 vs. point list length -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pathMerger4);
        org.junit.Assert.assertNotNull(pathMerger7);
        org.junit.Assert.assertNotNull(pathArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(decimalEncodedValue13);
        org.junit.Assert.assertNotNull(flagEncoderArray15);
        org.junit.Assert.assertNotNull(encodingManager16);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue19);
        org.junit.Assert.assertNotNull(encodedValueArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(translationHashMap30);
        org.junit.Assert.assertNull(locale31);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        com.graphhopper.util.DistanceCalcEuclidean distanceCalcEuclidean0 = new com.graphhopper.util.DistanceCalcEuclidean();
        double double7 = distanceCalcEuclidean0.calcNormalizedEdgeDistance((double) 4, 111194.92664455873d, (double) 7, (double) 11, 1.667897456212138E7d, (double) '4');
        double double9 = distanceCalcEuclidean0.calcNormalizedDist((double) 7);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.2361865545667784E10d + "'", double7 == 1.2361865545667784E10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 49.0d + "'", double9 == 49.0d);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        com.graphhopper.util.StopWatch stopWatch1 = com.graphhopper.util.StopWatch.started("max_width");
        long long2 = stopWatch1.getNanos();
        org.junit.Assert.assertNotNull(stopWatch1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        com.graphhopper.coll.GHTBitSet gHTBitSet1 = new com.graphhopper.coll.GHTBitSet(0);
        int int2 = gHTBitSet1.getCardinality();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue1 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.util.details.BooleanDetails booleanDetails2 = new com.graphhopper.util.details.BooleanDetails("get_off_bike", booleanEncodedValue1);
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter3 = com.graphhopper.routing.util.DefaultEdgeFilter.outEdges(booleanEncodedValue1);
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter4 = com.graphhopper.routing.util.DefaultEdgeFilter.outEdges(booleanEncodedValue1);
        java.lang.String str5 = defaultEdgeFilter4.toString();
        org.junit.Assert.assertNotNull(booleanEncodedValue1);
        org.junit.Assert.assertNotNull(defaultEdgeFilter3);
        org.junit.Assert.assertNotNull(defaultEdgeFilter4);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        int int0 = com.graphhopper.util.EdgeIterator.ANY_EDGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-2) + "'", int0 == (-2));
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        com.graphhopper.util.GitInfo gitInfo5 = new com.graphhopper.util.GitInfo("3.0", "..X.                                                                                                ", "local", "X.X.       ", false);
        java.lang.String str6 = gitInfo5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3.0|X.X.       |dirty=false|..X.                                                                                                |local" + "'", str6, "3.0|X.X.       |dirty=false|..X.                                                                                                |local");
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue3 = new com.graphhopper.routing.ev.StringEncodedValue("custom", (int) ' ', false);
        com.graphhopper.storage.IntsRef intsRef5 = com.graphhopper.storage.IntsRef.EMPTY;
        // The following exception was thrown during execution in test generation
        try {
            stringEncodedValue3.setString(true, intsRef5, "[]$turn_cost");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: EncodedValue custom not initialized");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intsRef5);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        com.graphhopper.routing.RouterConfig routerConfig0 = new com.graphhopper.routing.RouterConfig();
        routerConfig0.setActiveLandmarkCount((int) '4');
        int int3 = routerConfig0.getMaxVisitedNodes();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType0 = com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY;
        java.util.Calendar calendar1 = com.graphhopper.reader.osm.conditional.DateRangeParser.createCalendar();
        com.graphhopper.reader.osm.conditional.ParsedCalendar parsedCalendar2 = new com.graphhopper.reader.osm.conditional.ParsedCalendar(parseType0, calendar1);
        com.graphhopper.reader.dem.CGIARProvider cGIARProvider3 = new com.graphhopper.reader.dem.CGIARProvider();
        java.lang.String str4 = cGIARProvider3.toString();
        cGIARProvider3.setInterpolate(true);
        cGIARProvider3.setAutoRemoveTemporaryFiles(false);
        java.lang.String str9 = cGIARProvider3.toString();
        com.graphhopper.reader.dem.ElevationProvider elevationProvider11 = cGIARProvider3.setBaseURL("hi!");
        com.graphhopper.coll.MapEntry<java.util.Calendar, com.graphhopper.reader.dem.AbstractTiffElevationProvider> calendarMapEntry12 = new com.graphhopper.coll.MapEntry<java.util.Calendar, com.graphhopper.reader.dem.AbstractTiffElevationProvider>(calendar1, (com.graphhopper.reader.dem.AbstractTiffElevationProvider) cGIARProvider3);
        com.graphhopper.reader.dem.AbstractTiffElevationProvider abstractTiffElevationProvider13 = calendarMapEntry12.getValue();
        org.junit.Assert.assertTrue("'" + parseType0 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY + "'", parseType0.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY));
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1617558196711,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=94,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=43,SECOND=16,MILLISECOND=711,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cgiar" + "'", str4, "cgiar");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "cgiar" + "'", str9, "cgiar");
        org.junit.Assert.assertNotNull(elevationProvider11);
        org.junit.Assert.assertNotNull(abstractTiffElevationProvider13);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        com.graphhopper.routing.ev.Hazmat hazmat0 = com.graphhopper.routing.ev.Hazmat.YES;
        org.junit.Assert.assertTrue("'" + hazmat0 + "' != '" + com.graphhopper.routing.ev.Hazmat.YES + "'", hazmat0.equals(com.graphhopper.routing.ev.Hazmat.YES));
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder2 = rAMDirectory1.getByteOrder();
        com.graphhopper.util.BitUtil bitUtil3 = com.graphhopper.util.BitUtil.get(byteOrder2);
        long long6 = bitUtil3.toLong(35, (int) '#');
        int int8 = bitUtil3.getIntLow(0L);
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(bitUtil3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 150323855395L + "'", long6 == 150323855395L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        java.lang.String str0 = com.graphhopper.routing.ch.CHParameters.SETTLED_EDGES_RESET_INTERVAL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "prepare.ch.edge.witness_search.reset_interval" + "'", str0, "prepare.ch.edge.witness_search.reset_interval");
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        long[] longArray1 = new long[] { 10 };
        com.carrotsearch.hppc.LongHashSet longHashSet2 = com.carrotsearch.hppc.LongHashSet.from(longArray1);
        boolean boolean4 = longHashSet2.add((-1L));
        boolean boolean6 = longHashSet2.equals((java.lang.Object) 0.0d);
        int[] intArray8 = new int[] { 100 };
        long[] longArray10 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap11 = com.carrotsearch.hppc.IntLongHashMap.from(intArray8, longArray10);
        int[] intArray13 = new int[] { 100 };
        long[] longArray15 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap16 = com.carrotsearch.hppc.IntLongHashMap.from(intArray13, longArray15);
        com.carrotsearch.hppc.LongLongHashMap longLongHashMap17 = com.carrotsearch.hppc.LongLongHashMap.from(longArray10, longArray15);
        long[] longArray19 = new long[] { 10 };
        com.carrotsearch.hppc.LongHashSet longHashSet20 = com.carrotsearch.hppc.LongHashSet.from(longArray19);
        int int21 = longLongHashMap17.removeAll((com.carrotsearch.hppc.LongContainer) longHashSet20);
        boolean boolean23 = longHashSet20.remove((long) 100);
        int int24 = longHashSet2.retainAll((com.carrotsearch.hppc.LongLookupContainer) longHashSet20);
        boolean boolean26 = longHashSet2.remove((long) 201);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[10]");
        org.junit.Assert.assertNotNull(longHashSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap16);
        org.junit.Assert.assertNotNull(longLongHashMap17);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[10]");
        org.junit.Assert.assertNotNull(longHashSet20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        com.graphhopper.routing.querygraph.QueryGraph queryGraph0 = null;
        com.graphhopper.routing.RoutingAlgorithmFactory routingAlgorithmFactory1 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions2 = null;
        com.graphhopper.routing.FlexiblePathCalculator flexiblePathCalculator3 = new com.graphhopper.routing.FlexiblePathCalculator(queryGraph0, routingAlgorithmFactory1, algorithmOptions2);
        com.graphhopper.routing.weighting.Weighting weighting5 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions6 = new com.graphhopper.routing.AlgorithmOptions("[]", weighting5);
        flexiblePathCalculator3.setAlgoOpts(algorithmOptions6);
        com.graphhopper.util.PMap pMap8 = algorithmOptions6.getHints();
        boolean boolean9 = algorithmOptions6.hasWeighting();
        org.junit.Assert.assertNotNull(pMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        com.graphhopper.routing.util.FlagEncoder flagEncoder0 = null;
        com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser oSMFootNetworkTagParser1 = new com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray2 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager3 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray2);
        java.lang.String str4 = encodingManager3.toEncodedValuesAsString();
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser5 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup6 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue7 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray8 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue7 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList9 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList9, encodedValueArray8);
        oSMRoadClassParser5.createEncodedValues(encodedValueLookup6, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList9);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup12 = null;
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser13 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup14 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue15 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray16 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue15 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList17 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList17, encodedValueArray16);
        oSMRoadClassParser13.createEncodedValues(encodedValueLookup14, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList17);
        oSMRoadClassParser5.createEncodedValues(encodedValueLookup12, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList17);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup21 = null;
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser22 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup23 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue24 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray25 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue24 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList26 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList26, encodedValueArray25);
        oSMRoadClassParser22.createEncodedValues(encodedValueLookup23, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList26);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup29 = null;
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser30 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup31 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue32 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray33 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue32 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList34 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList34, encodedValueArray33);
        oSMRoadClassParser30.createEncodedValues(encodedValueLookup31, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList34);
        oSMRoadClassParser22.createEncodedValues(encodedValueLookup29, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList34);
        oSMRoadClassParser5.createEncodedValues(encodedValueLookup21, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList34);
        oSMFootNetworkTagParser1.createRelationEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager3, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList34);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue40 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser41 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue40);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray42 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager43 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray42);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser44 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup45 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue46 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray47 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue46 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList48 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList48, encodedValueArray47);
        oSMRoadClassParser44.createEncodedValues(encodedValueLookup45, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList48);
        oSMMaxWidthParser41.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager43, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList48);
        java.lang.String str52 = encodingManager43.toFlagEncodersAsString();
        java.util.List<com.graphhopper.routing.ev.EncodedValue> encodedValueList53 = encodingManager43.getEncodedValues();
        boolean boolean55 = encodingManager43.hasEncodedValue("roundabout");
        java.util.List<com.graphhopper.routing.util.FlagEncoder> flagEncoderList56 = encodingManager43.fetchEdgeEncoders();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue57 = null;
        com.graphhopper.routing.util.parsers.OSMMaxAxleLoadParser oSMMaxAxleLoadParser58 = new com.graphhopper.routing.util.parsers.OSMMaxAxleLoadParser(decimalEncodedValue57);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup59 = null;
        com.graphhopper.routing.ev.IntEncodedValue intEncodedValue60 = com.graphhopper.routing.ev.HikeRating.create();
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue64 = new com.graphhopper.routing.ev.StringEncodedValue("custom", (int) ' ', false);
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue66 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.util.details.BooleanDetails booleanDetails67 = new com.graphhopper.util.details.BooleanDetails("get_off_bike", booleanEncodedValue66);
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue68 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue69 = com.graphhopper.routing.ev.Country.create();
        java.lang.String str70 = countryEnumEncodedValue69.getName();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue71 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue72 = com.graphhopper.routing.ev.Country.create();
        java.lang.String str73 = countryEnumEncodedValue72.getName();
        com.graphhopper.reader.OSMTurnRelation.Type type75 = com.graphhopper.reader.OSMTurnRelation.Type.getRestrictionType("");
        boolean boolean76 = countryEnumEncodedValue72.equals((java.lang.Object) type75);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue77 = com.graphhopper.routing.ev.Country.create();
        java.lang.String str78 = countryEnumEncodedValue77.getName();
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue79 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue80 = com.graphhopper.routing.ev.Country.create();
        java.lang.String str81 = countryEnumEncodedValue80.getName();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray82 = new com.graphhopper.routing.ev.EncodedValue[] { intEncodedValue60, stringEncodedValue64, booleanEncodedValue66, booleanEncodedValue68, countryEnumEncodedValue69, decimalEncodedValue71, countryEnumEncodedValue72, countryEnumEncodedValue77, booleanEncodedValue79, countryEnumEncodedValue80 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList83 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList83, encodedValueArray82);
        oSMMaxAxleLoadParser58.createEncodedValues(encodedValueLookup59, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList83);
        oSMFootNetworkTagParser1.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager43, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList83);
        com.graphhopper.routing.weighting.TurnCostProvider turnCostProvider87 = com.graphhopper.routing.weighting.TurnCostProvider.NO_TURN_COST_PROVIDER;
        com.graphhopper.util.CustomModel customModel88 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.custom.CustomWeighting customWeighting89 = com.graphhopper.routing.weighting.custom.CustomModelParser.createWeighting(flagEncoder0, (com.graphhopper.routing.ev.EncodedValueLookup) encodingManager43, turnCostProvider87, customModel88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: CustomModel cannot be null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(flagEncoderArray2);
        org.junit.Assert.assertNotNull(encodingManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "roundabout|version=283388307|bits=1|index=0|shift=0|store_both_directions=false,road_class|version=2007543510|bits=5|index=0|shift=1|store_both_directions=false,road_class_link|version=146075245|bits=1|index=0|shift=6|store_both_directions=false,road_environment|version=-446726394|bits=3|index=0|shift=7|store_both_directions=false,max_speed|version=-1300485567|bits=5|index=0|shift=10|store_both_directions=true,road_access|version=-313723172|bits=4|index=0|shift=20|store_both_directions=false" + "'", str4, "roundabout|version=283388307|bits=1|index=0|shift=0|store_both_directions=false,road_class|version=2007543510|bits=5|index=0|shift=1|store_both_directions=false,road_class_link|version=146075245|bits=1|index=0|shift=6|store_both_directions=false,road_environment|version=-446726394|bits=3|index=0|shift=7|store_both_directions=false,max_speed|version=-1300485567|bits=5|index=0|shift=10|store_both_directions=true,road_access|version=-313723172|bits=4|index=0|shift=20|store_both_directions=false");
        org.junit.Assert.assertNotNull(countryEnumEncodedValue7);
        org.junit.Assert.assertNotNull(encodedValueArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue15);
        org.junit.Assert.assertNotNull(encodedValueArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue24);
        org.junit.Assert.assertNotNull(encodedValueArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue32);
        org.junit.Assert.assertNotNull(encodedValueArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(decimalEncodedValue40);
        org.junit.Assert.assertNotNull(flagEncoderArray42);
        org.junit.Assert.assertNotNull(encodingManager43);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue46);
        org.junit.Assert.assertNotNull(encodedValueArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(encodedValueList53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(flagEncoderList56);
        org.junit.Assert.assertNotNull(intEncodedValue60);
        org.junit.Assert.assertNotNull(booleanEncodedValue66);
        org.junit.Assert.assertNotNull(booleanEncodedValue68);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "country" + "'", str70, "country");
        org.junit.Assert.assertNotNull(decimalEncodedValue71);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "country" + "'", str73, "country");
        org.junit.Assert.assertTrue("'" + type75 + "' != '" + com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED + "'", type75.equals(com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "country" + "'", str78, "country");
        org.junit.Assert.assertNotNull(booleanEncodedValue79);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "country" + "'", str81, "country");
        org.junit.Assert.assertNotNull(encodedValueArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(turnCostProvider87);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        com.graphhopper.coll.GHLongHashSet gHLongHashSet0 = new com.graphhopper.coll.GHLongHashSet();
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        com.graphhopper.reader.dem.CGIARProvider cGIARProvider1 = new com.graphhopper.reader.dem.CGIARProvider("country");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.dem.ElevationProvider elevationProvider3 = cGIARProvider1.setBaseURL("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: baseUrl cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.BIG;
        byte[] byteArray2 = bitUtil0.fromDouble(6378137.0d);
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bitUtil0.toInt(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[65, 88, 84, -90, 64, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 0]");
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.util.PathMerger pathMerger2 = new com.graphhopper.util.PathMerger(graph0, weighting1);
        com.graphhopper.util.PathMerger pathMerger4 = pathMerger2.setCalcPoints(true);
        com.graphhopper.storage.Graph graph5 = null;
        com.graphhopper.routing.weighting.Weighting weighting6 = null;
        com.graphhopper.util.PathMerger pathMerger7 = new com.graphhopper.util.PathMerger(graph5, weighting6);
        com.graphhopper.util.PathMerger pathMerger9 = pathMerger7.setCalcPoints(true);
        com.graphhopper.util.details.PathDetailsBuilderFactory pathDetailsBuilderFactory10 = new com.graphhopper.util.details.PathDetailsBuilderFactory();
        java.util.List<java.lang.String> strList11 = null;
        com.graphhopper.util.PathMerger pathMerger12 = pathMerger7.setPathDetailsBuilders(pathDetailsBuilderFactory10, strList11);
        java.lang.String[] strArray26 = new java.lang.String[] { "3.0", "[]$turn_cost", "get_off_bike|node-based", ".X..                                                                                                ", "get_off_bike", "", "hi!", ".X..                                                                                                ", "[]$turn_cost", ".X..                                                                                                ", "hi!", "get_off_bike", "[]$turn_cost" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        com.graphhopper.util.PathMerger pathMerger29 = pathMerger4.setPathDetailsBuilders(pathDetailsBuilderFactory10, (java.util.List<java.lang.String>) strList27);
        pathMerger4.setFavoredHeading((double) 7);
        com.graphhopper.util.PathMerger pathMerger33 = pathMerger4.setCalcPoints(true);
        org.junit.Assert.assertNotNull(pathMerger4);
        org.junit.Assert.assertNotNull(pathMerger9);
        org.junit.Assert.assertNotNull(pathMerger12);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(pathMerger29);
        org.junit.Assert.assertNotNull(pathMerger33);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        com.graphhopper.routing.weighting.Weighting weighting0 = null;
        com.graphhopper.util.details.TimeDetails timeDetails1 = new com.graphhopper.util.details.TimeDetails(weighting0);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator2 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = timeDetails1.isEdgeDifferentToLastEdge((com.graphhopper.util.EdgeIteratorState) disabledEdgeIterator2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray0 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager1 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray0);
        boolean boolean2 = encodingManager1.needsTurnCostsSupport();
        java.util.List<com.graphhopper.routing.util.FlagEncoder> flagEncoderList3 = encodingManager1.fetchEdgeEncoders();
        org.junit.Assert.assertNotNull(flagEncoderArray0);
        org.junit.Assert.assertNotNull(encodingManager1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(flagEncoderList3);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        com.graphhopper.routing.ev.RoadAccess roadAccess0 = com.graphhopper.routing.ev.RoadAccess.FORESTRY;
        org.junit.Assert.assertTrue("'" + roadAccess0 + "' != '" + com.graphhopper.routing.ev.RoadAccess.FORESTRY + "'", roadAccess0.equals(com.graphhopper.routing.ev.RoadAccess.FORESTRY));
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.LITTLE;
        int int2 = bitUtil0.getIntHigh((long) (byte) 10);
        byte[] byteArray4 = bitUtil0.fromDouble((double) (-2));
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 0, 0, 0, 0, -64]");
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        com.graphhopper.GraphHopperConfig graphHopperConfig0 = new com.graphhopper.GraphHopperConfig();
        com.graphhopper.GraphHopperConfig graphHopperConfig1 = new com.graphhopper.GraphHopperConfig(graphHopperConfig0);
        com.graphhopper.config.Profile[] profileArray2 = new com.graphhopper.config.Profile[] {};
        java.util.ArrayList<com.graphhopper.config.Profile> profileList3 = new java.util.ArrayList<com.graphhopper.config.Profile>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.config.Profile>) profileList3, profileArray2);
        com.graphhopper.GraphHopperConfig graphHopperConfig5 = graphHopperConfig1.setProfiles((java.util.List<com.graphhopper.config.Profile>) profileList3);
        boolean boolean8 = graphHopperConfig1.getBool("hi!", false);
        com.graphhopper.GraphHopperConfig graphHopperConfig9 = new com.graphhopper.GraphHopperConfig(graphHopperConfig1);
        org.junit.Assert.assertNotNull(profileArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(graphHopperConfig5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        long[] longArray1 = new long[] { 10 };
        com.carrotsearch.hppc.LongHashSet longHashSet2 = com.carrotsearch.hppc.LongHashSet.from(longArray1);
        boolean boolean4 = longHashSet2.add((-1L));
        boolean boolean6 = longHashSet2.equals((java.lang.Object) 0.0d);
        int[] intArray8 = new int[] { 100 };
        long[] longArray10 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap11 = com.carrotsearch.hppc.IntLongHashMap.from(intArray8, longArray10);
        int[] intArray13 = new int[] { 100 };
        long[] longArray15 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap16 = com.carrotsearch.hppc.IntLongHashMap.from(intArray13, longArray15);
        com.carrotsearch.hppc.LongLongHashMap longLongHashMap17 = com.carrotsearch.hppc.LongLongHashMap.from(longArray10, longArray15);
        long[] longArray19 = new long[] { 10 };
        com.carrotsearch.hppc.LongHashSet longHashSet20 = com.carrotsearch.hppc.LongHashSet.from(longArray19);
        int int21 = longLongHashMap17.removeAll((com.carrotsearch.hppc.LongContainer) longHashSet20);
        boolean boolean23 = longHashSet20.remove((long) 100);
        int int24 = longHashSet2.retainAll((com.carrotsearch.hppc.LongLookupContainer) longHashSet20);
        boolean boolean25 = longHashSet2.isEmpty();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[10]");
        org.junit.Assert.assertNotNull(longHashSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap16);
        org.junit.Assert.assertNotNull(longLongHashMap17);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[10]");
        org.junit.Assert.assertNotNull(longHashSet20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator5 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray6 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator5 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap7 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray1, edgeIteratorArray6);
        int[] intArray8 = edgeIteratorIntObjectHashMap7.keys;
        int int10 = edgeIteratorIntObjectHashMap7.indexOf(4);
        com.graphhopper.util.EdgeIterator edgeIterator12 = edgeIteratorIntObjectHashMap7.get((int) (byte) 1);
        edgeIteratorIntObjectHashMap7.clear();
        int int14 = edgeIteratorIntObjectHashMap7.size();
        java.lang.String str16 = edgeIteratorIntObjectHashMap7.visualizeKeyDistribution(35);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator18 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        boolean boolean19 = edgeIteratorIntObjectHashMap7.putIfAbsent(100, (com.graphhopper.util.EdgeIterator) disabledEdgeIterator18);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = disabledEdgeIterator18.getAdjNode();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(edgeIteratorArray6);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap7);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, 0, 0, 0]");
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-3) + "'", int10 == (-3));
        org.junit.Assert.assertNull(edgeIterator12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "....                               " + "'", str16, "....                               ");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        com.graphhopper.reader.ReaderRelation readerRelation1 = new com.graphhopper.reader.ReaderRelation((long) 'a');
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        java.lang.String str0 = com.graphhopper.routing.ev.HorseRating.KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "horse_rating" + "'", str0, "horse_rating");
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMRoadClassParser> oSMRoadClassParserGHObjectIntHashMap0 = new com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMRoadClassParser>();
        com.carrotsearch.hppc.ObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMRoadClassParser> oSMRoadClassParserObjectIntHashMap1 = oSMRoadClassParserGHObjectIntHashMap0.clone();
        com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMRoadClassParser> oSMRoadClassParserGHObjectIntHashMap2 = new com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMRoadClassParser>();
        com.carrotsearch.hppc.ObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMRoadClassParser> oSMRoadClassParserObjectIntHashMap3 = oSMRoadClassParserGHObjectIntHashMap2.clone();
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser4 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        int int6 = oSMRoadClassParserGHObjectIntHashMap2.getOrDefault(oSMRoadClassParser4, (int) (byte) 1);
        com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue> encodedValueGHObjectIntHashMap7 = new com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue>((com.carrotsearch.hppc.ObjectIntAssociativeContainer) oSMRoadClassParserGHObjectIntHashMap2);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser8 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup9 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue10 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray11 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue10 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList12 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList12, encodedValueArray11);
        oSMRoadClassParser8.createEncodedValues(encodedValueLookup9, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList12);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup15 = null;
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser16 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup17 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue18 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray19 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue18 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList20 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList20, encodedValueArray19);
        oSMRoadClassParser16.createEncodedValues(encodedValueLookup17, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList20);
        oSMRoadClassParser8.createEncodedValues(encodedValueLookup15, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList20);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup24 = null;
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser25 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup26 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue27 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray28 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue27 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList29 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList29, encodedValueArray28);
        oSMRoadClassParser25.createEncodedValues(encodedValueLookup26, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList29);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup32 = null;
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser33 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup34 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue35 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray36 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue35 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList37 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList37, encodedValueArray36);
        oSMRoadClassParser33.createEncodedValues(encodedValueLookup34, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList37);
        oSMRoadClassParser25.createEncodedValues(encodedValueLookup32, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList37);
        oSMRoadClassParser8.createEncodedValues(encodedValueLookup24, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList37);
        int int43 = oSMRoadClassParserGHObjectIntHashMap2.getOrDefault(oSMRoadClassParser8, 0);
        int int46 = oSMRoadClassParserObjectIntHashMap1.putOrAdd(oSMRoadClassParser8, 97, 2);
        org.junit.Assert.assertNotNull(oSMRoadClassParserObjectIntHashMap1);
        org.junit.Assert.assertNotNull(oSMRoadClassParserObjectIntHashMap3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue10);
        org.junit.Assert.assertNotNull(encodedValueArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue18);
        org.junit.Assert.assertNotNull(encodedValueArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue27);
        org.junit.Assert.assertNotNull(encodedValueArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue35);
        org.junit.Assert.assertNotNull(encodedValueArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 97 + "'", int46 == 97);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        com.graphhopper.storage.IntsRef intsRef1 = com.graphhopper.routing.ev.TurnCost.createFlags();
        com.graphhopper.util.EdgeIteratorState edgeIteratorState7 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState(3.6461703979660586E12d, intsRef1, (int) (short) 1, (int) (byte) 100, 35, (-2), (int) 'a');
        int int8 = edgeIteratorState7.getOrigEdgeLast();
        com.graphhopper.routing.ev.IntEncodedValue intEncodedValue9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState12 = edgeIteratorState7.set(intEncodedValue9, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intsRef1);
        org.junit.Assert.assertNotNull(edgeIteratorState7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        long[] longArray0 = new long[] {};
        java.util.BitSet bitSet1 = java.util.BitSet.valueOf(longArray0);
        bitSet1.set(4);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(bitSet1);
        org.junit.Assert.assertEquals(bitSet1.toString(), "{4}");
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        com.graphhopper.routing.ev.Country country0 = com.graphhopper.routing.ev.Country.DEFAULT;
        org.junit.Assert.assertTrue("'" + country0 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country0.equals(com.graphhopper.routing.ev.Country.DEFAULT));
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap0 = new com.graphhopper.coll.GHIntLongHashMap();
        long long3 = gHIntLongHashMap0.addTo(100, (long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             gHIntLongHashMap0.indexInsert(0, (int) ' ', (long) 2147483647);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        com.graphhopper.storage.RoutingCHGraph routingCHGraph0 = null;
        com.graphhopper.routing.ch.ShortcutUnpacker.Visitor visitor1 = null;
        com.graphhopper.routing.ch.ShortcutUnpacker shortcutUnpacker3 = new com.graphhopper.routing.ch.ShortcutUnpacker(routingCHGraph0, visitor1, false);
        // The following exception was thrown during execution in test generation
        try {
            shortcutUnpacker3.visitOriginalEdgesBwd(10, (int) (short) 0, false, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        long[] longArray0 = new long[] {};
        java.util.BitSet bitSet1 = java.util.BitSet.valueOf(longArray0);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl2 = new com.graphhopper.coll.GHBitSetImpl();
        int int4 = gHBitSetImpl2.previousClearBit(0);
        gHBitSetImpl2.clear();
        boolean boolean7 = gHBitSetImpl2.contains(11);
        bitSet1.andNot((java.util.BitSet) gHBitSetImpl2);
        java.lang.Object obj9 = bitSet1.clone();
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(bitSet1);
        org.junit.Assert.assertEquals(bitSet1.toString(), "{}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "{}");
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
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
        int[] intArray15 = intHashSet14.toArray();
        com.graphhopper.routing.ev.HazmatTunnel hazmatTunnel16 = com.graphhopper.routing.ev.HazmatTunnel.D;
        boolean boolean17 = intHashSet14.equals((java.lang.Object) hazmatTunnel16);
        int int19 = intHashSet14.indexGet(1);
        int int21 = intHashSet14.removeAll(4);
        java.lang.String str22 = intHashSet14.toString();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap9);
        org.junit.Assert.assertNotNull(edgeIteratorArray11);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100]");
        org.junit.Assert.assertNotNull(intHashSet14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100]");
        org.junit.Assert.assertTrue("'" + hazmatTunnel16 + "' != '" + com.graphhopper.routing.ev.HazmatTunnel.D + "'", hazmatTunnel16.equals(com.graphhopper.routing.ev.HazmatTunnel.D));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[100]" + "'", str22, "[100]");
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.UnsignedIntEncodedValue unsignedIntEncodedValue3 = new com.graphhopper.routing.ev.UnsignedIntEncodedValue("aut", (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aut: at the moment the number of reserved bits cannot be more than 31");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge prepareBaseEdge5 = new com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge((int) (byte) 1, (int) (byte) -1, (int) (short) 1, (float) (short) -1, (float) '#');
        int int6 = prepareBaseEdge5.getNodeB();
        int int7 = prepareBaseEdge5.getOrigEdgeKeyLastAB();
        int int8 = prepareBaseEdge5.getOrigEdgeCount();
        int int9 = prepareBaseEdge5.getPrepareEdge();
        int int10 = prepareBaseEdge5.getOrigEdgeCount();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator5 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray6 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator5 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap7 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray1, edgeIteratorArray6);
        int[] intArray8 = edgeIteratorIntObjectHashMap7.keys;
        int int10 = edgeIteratorIntObjectHashMap7.indexOf(4);
        com.graphhopper.util.EdgeIterator edgeIterator12 = edgeIteratorIntObjectHashMap7.get((int) (byte) 1);
        edgeIteratorIntObjectHashMap7.clear();
        int int14 = edgeIteratorIntObjectHashMap7.size();
        java.lang.String str16 = edgeIteratorIntObjectHashMap7.visualizeKeyDistribution(35);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator18 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        boolean boolean19 = edgeIteratorIntObjectHashMap7.putIfAbsent(100, (com.graphhopper.util.EdgeIterator) disabledEdgeIterator18);
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue23 = new com.graphhopper.routing.ev.StringEncodedValue("custom", (int) ' ', false);
        com.graphhopper.routing.ev.EncodedValue.InitializerConfig initializerConfig24 = null;
        com.graphhopper.coll.MapEntry<com.graphhopper.routing.ev.StringEncodedValue, com.graphhopper.routing.ev.EncodedValue.InitializerConfig> stringEncodedValueMapEntry25 = new com.graphhopper.coll.MapEntry<com.graphhopper.routing.ev.StringEncodedValue, com.graphhopper.routing.ev.EncodedValue.InitializerConfig>(stringEncodedValue23, initializerConfig24);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState27 = disabledEdgeIterator18.setReverse((com.graphhopper.routing.ev.IntEncodedValue) stringEncodedValue23, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(edgeIteratorArray6);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap7);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, 0, 0, 0]");
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4) + "'", int10 == (-4));
        org.junit.Assert.assertNull(edgeIterator12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "....                               " + "'", str16, "....                               ");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        com.graphhopper.storage.index.Snap.Position position0 = com.graphhopper.storage.index.Snap.Position.PILLAR;
        org.junit.Assert.assertTrue("'" + position0 + "' != '" + com.graphhopper.storage.index.Snap.Position.PILLAR + "'", position0.equals(com.graphhopper.storage.index.Snap.Position.PILLAR));
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        com.graphhopper.storage.IntsRef intsRef1 = com.graphhopper.routing.ev.TurnCost.createFlags();
        com.graphhopper.util.EdgeIteratorState edgeIteratorState7 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState(3.6461703979660586E12d, intsRef1, (int) (short) 1, (int) (byte) 100, 35, (-2), (int) 'a');
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue8 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        boolean boolean9 = edgeIteratorState7.get(booleanEncodedValue8);
        int int10 = edgeIteratorState7.getBaseNode();
        org.junit.Assert.assertNotNull(intsRef1);
        org.junit.Assert.assertNotNull(edgeIteratorState7);
        org.junit.Assert.assertNotNull(booleanEncodedValue8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        java.lang.String str2 = rAMDirectory1.getLocation();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "custom/" + "'", str2, "custom/");
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
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
        // The following exception was thrown during execution in test generation
        try {
// flaky:             intHashSet14.indexInsert(2147483647, 7);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2147483648");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap9);
        org.junit.Assert.assertNotNull(edgeIteratorArray11);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100]");
        org.junit.Assert.assertNotNull(intHashSet14);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        com.graphhopper.routing.util.EncodingManager.Access access0 = com.graphhopper.routing.util.EncodingManager.Access.CAN_SKIP;
        boolean boolean1 = access0.isFerry();
        org.junit.Assert.assertTrue("'" + access0 + "' != '" + com.graphhopper.routing.util.EncodingManager.Access.CAN_SKIP + "'", access0.equals(com.graphhopper.routing.util.EncodingManager.Access.CAN_SKIP));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        com.carrotsearch.hppc.IntArrayList intArrayList1 = com.graphhopper.util.ArrayUtil.iota(4);
        com.carrotsearch.hppc.IntArrayList intArrayList2 = com.graphhopper.util.ArrayUtil.invert(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        int[] intArray6 = new int[] { 100 };
        long[] longArray8 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap9 = com.carrotsearch.hppc.IntLongHashMap.from(intArray6, longArray8);
        com.carrotsearch.hppc.LongLongHashMap longLongHashMap10 = com.carrotsearch.hppc.LongLongHashMap.from(longArray3, longArray8);
        java.lang.String str11 = longLongHashMap10.toString();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap9);
        org.junit.Assert.assertNotNull(longLongHashMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[0=>0]" + "'", str11, "[0=>0]");
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        com.graphhopper.storage.RAMDirectory rAMDirectory2 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder3 = rAMDirectory2.getByteOrder();
        com.graphhopper.storage.Directory directory4 = rAMDirectory2.create();
        com.graphhopper.reader.PillarInfo pillarInfo5 = new com.graphhopper.reader.PillarInfo(true, directory4);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(directory4);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.storage.CHConfig cHConfig2 = com.graphhopper.storage.CHConfig.edgeBased("bike_network", weighting1);
        boolean boolean3 = cHConfig2.isEdgeBased();
        java.lang.String str4 = cHConfig2.getName();
        org.junit.Assert.assertNotNull(cHConfig2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "bike_network" + "'", str4, "bike_network");
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue1 = com.graphhopper.routing.ev.Country.create();
        java.lang.String str2 = countryEnumEncodedValue1.getName();
        int int3 = countryEnumEncodedValue1.getVersion();
        com.graphhopper.routing.ev.Country[] countryArray4 = countryEnumEncodedValue1.getValues();
        com.graphhopper.routing.ev.Country country5 = com.graphhopper.routing.ev.Country.AUT;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState6 = disabledEdgeIterator0.set(countryEnumEncodedValue1, country5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(countryEnumEncodedValue1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "country" + "'", str2, "country");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1687814340 + "'", int3 == 1687814340);
        org.junit.Assert.assertNotNull(countryArray4);
        org.junit.Assert.assertTrue("'" + country5 + "' != '" + com.graphhopper.routing.ev.Country.AUT + "'", country5.equals(com.graphhopper.routing.ev.Country.AUT));
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl0 = new com.graphhopper.coll.GHBitSetImpl();
        int int2 = gHBitSetImpl0.previousClearBit(0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = gHBitSetImpl0.next((-885860508));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex < 0: -885860508");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        com.graphhopper.routing.util.EncodingManager.Access access0 = com.graphhopper.routing.util.EncodingManager.Access.WAY;
        org.junit.Assert.assertTrue("'" + access0 + "' != '" + com.graphhopper.routing.util.EncodingManager.Access.WAY + "'", access0.equals(com.graphhopper.routing.util.EncodingManager.Access.WAY));
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        java.lang.String str0 = com.graphhopper.routing.ev.FootNetwork.KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "foot_network" + "'", str0, "foot_network");
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        com.graphhopper.util.AngleCalc angleCalc0 = new com.graphhopper.util.AngleCalc();
        double double6 = angleCalc0.calcOrientation(1.0222578996763014E14d, 1.609344d, 150.0d, (double) (short) 1, true);
        double double8 = angleCalc0.convertAzimuth2xaxisAngle((double) 0L);
        double double13 = angleCalc0.calcOrientation(0.6209609478125566d, 1.0222578996763014E14d, Double.NaN, (double) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.5707963267949006d) + "'", double6 == (-1.5707963267949006d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.5707963267948966d + "'", double8 == 1.5707963267948966d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        int int0 = com.graphhopper.util.Constants.VERSION_NODE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.MinHeapWithUpdate minHeapWithUpdate1 = new com.graphhopper.coll.MinHeapWithUpdate((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        int int4 = com.graphhopper.util.GHUtility.createEdgeKey(100, (int) (byte) 10, (-885860508), false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1771721015) + "'", int4 == (-1771721015));
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        com.graphhopper.coll.GHTreeMapComposed gHTreeMapComposed0 = new com.graphhopper.coll.GHTreeMapComposed();
        java.lang.String str1 = gHTreeMapComposed0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = gHTreeMapComposed0.pollKey();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot poll collection is empty!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue3 = new com.graphhopper.routing.ev.StringEncodedValue("custom_network", (int) (short) 10, false);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder2 = rAMDirectory1.getByteOrder();
        rAMDirectory1.clear();
        boolean boolean4 = rAMDirectory1.isStoring();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage5 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue6 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser7 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue6);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray8 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager9 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray8);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser10 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup11 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue12 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray13 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue12 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList14 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14, encodedValueArray13);
        oSMRoadClassParser10.createEncodedValues(encodedValueLookup11, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        oSMMaxWidthParser7.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager9, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        com.graphhopper.routing.DefaultWeightingFactory defaultWeightingFactory18 = new com.graphhopper.routing.DefaultWeightingFactory(graphHopperStorage5, encodingManager9);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage22 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager9, true, false, (int) (short) 10);
        boolean boolean23 = graphHopperStorage22.isClosed();
        com.graphhopper.storage.TurnCostStorage turnCostStorage24 = graphHopperStorage22.getTurnCostStorage();
        com.graphhopper.storage.Graph graph25 = graphHopperStorage22.getBaseGraph();
        com.graphhopper.routing.weighting.Weighting weighting26 = null;
        com.graphhopper.util.PathMerger pathMerger27 = new com.graphhopper.util.PathMerger((com.graphhopper.storage.Graph) graphHopperStorage22, weighting26);
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(decimalEncodedValue6);
        org.junit.Assert.assertNotNull(flagEncoderArray8);
        org.junit.Assert.assertNotNull(encodingManager9);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue12);
        org.junit.Assert.assertNotNull(encodedValueArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(turnCostStorage24);
        org.junit.Assert.assertNotNull(graph25);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        com.graphhopper.storage.NodeAccess nodeAccess0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator2 = new com.graphhopper.routing.weighting.BeelineWeightApproximator(nodeAccess0, weighting1);
        double double3 = beelineWeightApproximator2.getSlack();
        com.graphhopper.routing.weighting.BalancedWeightApproximator balancedWeightApproximator4 = new com.graphhopper.routing.weighting.BalancedWeightApproximator((com.graphhopper.routing.weighting.WeightApproximator) beelineWeightApproximator2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIterator edgeIterator2 = disabledEdgeIterator0.detach(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry4 = new com.graphhopper.routing.ch.PrepareCHEntry((-1), (int) '#', (int) (short) 10, 4.003017359204114E7d);
        int int5 = prepareCHEntry4.incEdgeKey;
        int int6 = prepareCHEntry4.prepareEdge;
        prepareCHEntry4.adjNode = (-10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
        com.graphhopper.routing.util.parsers.OSMHazmatWaterParser oSMHazmatWaterParser0 = new com.graphhopper.routing.util.parsers.OSMHazmatWaterParser();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue1 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser2 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue1);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray3 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager4 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray3);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser5 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup6 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue7 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray8 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue7 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList9 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList9, encodedValueArray8);
        oSMRoadClassParser5.createEncodedValues(encodedValueLookup6, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList9);
        oSMMaxWidthParser2.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager4, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList9);
        java.util.List<com.graphhopper.routing.util.FlagEncoder> flagEncoderList13 = encodingManager4.fetchEdgeEncoders();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue14 = null;
        com.graphhopper.routing.util.parsers.OSMMaxAxleLoadParser oSMMaxAxleLoadParser15 = new com.graphhopper.routing.util.parsers.OSMMaxAxleLoadParser(decimalEncodedValue14);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup16 = null;
        com.graphhopper.routing.ev.IntEncodedValue intEncodedValue17 = com.graphhopper.routing.ev.HikeRating.create();
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue21 = new com.graphhopper.routing.ev.StringEncodedValue("custom", (int) ' ', false);
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue23 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.util.details.BooleanDetails booleanDetails24 = new com.graphhopper.util.details.BooleanDetails("get_off_bike", booleanEncodedValue23);
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue25 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue26 = com.graphhopper.routing.ev.Country.create();
        java.lang.String str27 = countryEnumEncodedValue26.getName();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue28 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue29 = com.graphhopper.routing.ev.Country.create();
        java.lang.String str30 = countryEnumEncodedValue29.getName();
        com.graphhopper.reader.OSMTurnRelation.Type type32 = com.graphhopper.reader.OSMTurnRelation.Type.getRestrictionType("");
        boolean boolean33 = countryEnumEncodedValue29.equals((java.lang.Object) type32);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue34 = com.graphhopper.routing.ev.Country.create();
        java.lang.String str35 = countryEnumEncodedValue34.getName();
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue36 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue37 = com.graphhopper.routing.ev.Country.create();
        java.lang.String str38 = countryEnumEncodedValue37.getName();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray39 = new com.graphhopper.routing.ev.EncodedValue[] { intEncodedValue17, stringEncodedValue21, booleanEncodedValue23, booleanEncodedValue25, countryEnumEncodedValue26, decimalEncodedValue28, countryEnumEncodedValue29, countryEnumEncodedValue34, booleanEncodedValue36, countryEnumEncodedValue37 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList40 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList40, encodedValueArray39);
        oSMMaxAxleLoadParser15.createEncodedValues(encodedValueLookup16, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList40);
        oSMHazmatWaterParser0.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager4, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList40);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.FlagEncoder flagEncoder45 = encodingManager4.getEncoder("hgv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Encoder for hgv not found. Existing: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(decimalEncodedValue1);
        org.junit.Assert.assertNotNull(flagEncoderArray3);
        org.junit.Assert.assertNotNull(encodingManager4);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue7);
        org.junit.Assert.assertNotNull(encodedValueArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(flagEncoderList13);
        org.junit.Assert.assertNotNull(intEncodedValue17);
        org.junit.Assert.assertNotNull(booleanEncodedValue23);
        org.junit.Assert.assertNotNull(booleanEncodedValue25);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "country" + "'", str27, "country");
        org.junit.Assert.assertNotNull(decimalEncodedValue28);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "country" + "'", str30, "country");
        org.junit.Assert.assertTrue("'" + type32 + "' != '" + com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED + "'", type32.equals(com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "country" + "'", str35, "country");
        org.junit.Assert.assertNotNull(booleanEncodedValue36);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "country" + "'", str38, "country");
        org.junit.Assert.assertNotNull(encodedValueArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.BIG;
        long long3 = bitUtil0.toLong((int) (byte) 100, 3);
        com.graphhopper.util.BitUtil bitUtil4 = com.graphhopper.util.BitUtil.BIG;
        long long7 = bitUtil4.toLong((int) (byte) 100, 3);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) -1, (byte) 100 };
        bitUtil4.fromInt(byteArray14, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            short short18 = bitUtil0.toShort(byteArray14, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2147483647");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 429496729603L + "'", long3 == 429496729603L);
        org.junit.Assert.assertNotNull(bitUtil4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 429496729603L + "'", long7 == 429496729603L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0, 0, 52, -1, 100]");
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
        java.util.Random random0 = null;
        com.graphhopper.routing.util.tour.MultiPointTour multiPointTour4 = new com.graphhopper.routing.util.tour.MultiPointTour(random0, (double) 4, 1, (double) (short) 1);
        int int5 = multiPointTour4.getNumberOfGeneratedPoints();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
        com.graphhopper.routing.util.FlagEncoder flagEncoder0 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue1 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser2 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue1);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray3 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager4 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray3);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser5 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup6 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue7 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray8 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue7 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList9 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList9, encodedValueArray8);
        oSMRoadClassParser5.createEncodedValues(encodedValueLookup6, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList9);
        oSMMaxWidthParser2.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager4, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList9);
        java.util.List<com.graphhopper.routing.util.FlagEncoder> flagEncoderList13 = encodingManager4.fetchEdgeEncoders();
        com.graphhopper.routing.weighting.TurnCostProvider turnCostProvider14 = com.graphhopper.routing.weighting.TurnCostProvider.NO_TURN_COST_PROVIDER;
        com.graphhopper.util.CustomModel customModel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.custom.CustomWeighting customWeighting16 = com.graphhopper.routing.weighting.custom.CustomModelParser.createWeighting(flagEncoder0, (com.graphhopper.routing.ev.EncodedValueLookup) encodingManager4, turnCostProvider14, customModel15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: CustomModel cannot be null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(decimalEncodedValue1);
        org.junit.Assert.assertNotNull(flagEncoderArray3);
        org.junit.Assert.assertNotNull(encodingManager4);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue7);
        org.junit.Assert.assertNotNull(encodedValueArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(flagEncoderList13);
        org.junit.Assert.assertNotNull(turnCostProvider14);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
        com.graphhopper.reader.dem.CGIARProvider cGIARProvider1 = new com.graphhopper.reader.dem.CGIARProvider("country");
        cGIARProvider1.setInterpolate(false);
        cGIARProvider1.setInterpolate(false);
        com.graphhopper.reader.dem.CGIARProvider cGIARProvider6 = new com.graphhopper.reader.dem.CGIARProvider();
        java.lang.String str7 = cGIARProvider6.toString();
        cGIARProvider6.setInterpolate(true);
        cGIARProvider6.setAutoRemoveTemporaryFiles(false);
        java.lang.String str12 = cGIARProvider6.toString();
        com.graphhopper.reader.dem.ElevationProvider elevationProvider14 = cGIARProvider6.setBaseURL("hi!");
        com.graphhopper.reader.dem.CGIARProvider cGIARProvider15 = new com.graphhopper.reader.dem.CGIARProvider();
        java.lang.String str16 = cGIARProvider15.toString();
        cGIARProvider15.setInterpolate(true);
        com.graphhopper.reader.dem.ElevationProvider elevationProvider20 = cGIARProvider15.setBaseURL("prepare.ch.edge.witness_search.min_max_settled_edges");
        com.graphhopper.reader.dem.MultiSourceElevationProvider multiSourceElevationProvider21 = new com.graphhopper.reader.dem.MultiSourceElevationProvider(elevationProvider14, elevationProvider20);
        com.graphhopper.storage.DAType dAType22 = com.graphhopper.storage.DAType.RAM;
        boolean boolean23 = dAType22.isInMemory();
        com.graphhopper.reader.dem.ElevationProvider elevationProvider24 = multiSourceElevationProvider21.setDAType(dAType22);
        com.graphhopper.reader.dem.ElevationProvider elevationProvider25 = cGIARProvider1.setDAType(dAType22);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cgiar" + "'", str7, "cgiar");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "cgiar" + "'", str12, "cgiar");
        org.junit.Assert.assertNotNull(elevationProvider14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "cgiar" + "'", str16, "cgiar");
        org.junit.Assert.assertNotNull(elevationProvider20);
        org.junit.Assert.assertNotNull(dAType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(elevationProvider24);
        org.junit.Assert.assertNotNull(elevationProvider25);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
        com.graphhopper.storage.IntsRef intsRef5 = com.graphhopper.storage.IntsRef.EMPTY;
        java.lang.String str6 = intsRef5.toString();
        com.graphhopper.util.PointList pointList8 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState10 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState((int) (short) 10, (-4), (-2), 2, (double) (-1), intsRef5, "PLANE_PROJ", pointList8, true);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue11 = com.graphhopper.routing.ev.Country.create();
        java.lang.String str12 = countryEnumEncodedValue11.getName();
        com.graphhopper.reader.OSMTurnRelation.Type type14 = com.graphhopper.reader.OSMTurnRelation.Type.getRestrictionType("");
        boolean boolean15 = countryEnumEncodedValue11.equals((java.lang.Object) type14);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState17 = virtualEdgeIteratorState10.set((com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue11, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: EncodedValue country not initialized");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intsRef5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(countryEnumEncodedValue11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "country" + "'", str12, "country");
        org.junit.Assert.assertTrue("'" + type14 + "' != '" + com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED + "'", type14.equals(com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.LITTLE;
        com.graphhopper.util.BitUtil bitUtil1 = com.graphhopper.util.BitUtil.BIG;
        long long4 = bitUtil1.toLong((int) (byte) 100, 3);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) -1, (byte) 100 };
        bitUtil1.fromInt(byteArray11, (int) '4');
        float float14 = bitUtil0.toFloat(byteArray11);
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertNotNull(bitUtil1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 429496729603L + "'", long4 == 429496729603L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, 0, 52, -1, 100]");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.1920929E-7f + "'", float14 == 1.1920929E-7f);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
        com.graphhopper.storage.VLongStorage vLongStorage1 = new com.graphhopper.storage.VLongStorage((int) (byte) 100);
        long long2 = vLongStorage1.getLength();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
        com.graphhopper.routing.util.PriorityCode priorityCode0 = com.graphhopper.routing.util.PriorityCode.VERY_NICE;
        org.junit.Assert.assertTrue("'" + priorityCode0 + "' != '" + com.graphhopper.routing.util.PriorityCode.VERY_NICE + "'", priorityCode0.equals(com.graphhopper.routing.util.PriorityCode.VERY_NICE));
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
        org.locationtech.jts.geom.Polygon[] polygonArray0 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList1 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList1, polygonArray0);
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule3 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList1);
        java.lang.String str4 = austriaSpatialRule3.getId();
        org.junit.Assert.assertNotNull(polygonArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aut" + "'", str4, "aut");
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
        com.graphhopper.storage.IntsRef intsRef1 = null;
        com.graphhopper.util.EdgeIteratorState edgeIteratorState2 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 7, intsRef1);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue3 = com.graphhopper.routing.ev.Country.create();
        java.lang.String str4 = countryEnumEncodedValue3.getName();
        com.graphhopper.reader.OSMTurnRelation.Type type6 = com.graphhopper.reader.OSMTurnRelation.Type.getRestrictionType("");
        boolean boolean7 = countryEnumEncodedValue3.equals((java.lang.Object) type6);
        int int8 = countryEnumEncodedValue3.getMaxInt();
        com.graphhopper.util.StopWatch stopWatch9 = com.graphhopper.util.StopWatch.started();
        boolean boolean10 = countryEnumEncodedValue3.equals((java.lang.Object) stopWatch9);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState13 = edgeIteratorState2.set((com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue3, 10, 201);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorState2);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "country" + "'", str4, "country");
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED + "'", type6.equals(com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(stopWatch9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        com.graphhopper.search.StringIndex stringIndex2 = new com.graphhopper.search.StringIndex((com.graphhopper.storage.Directory) rAMDirectory1);
        com.graphhopper.coll.OSMIDMap oSMIDMap4 = new com.graphhopper.coll.OSMIDMap((com.graphhopper.storage.Directory) rAMDirectory1, (int) (byte) 10);
        oSMIDMap4.optimize();
        oSMIDMap4.optimize();
        long long7 = oSMIDMap4.getSize();
        oSMIDMap4.remove();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder2 = rAMDirectory1.getByteOrder();
        rAMDirectory1.clear();
        boolean boolean4 = rAMDirectory1.isStoring();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage5 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue6 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser7 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue6);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray8 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager9 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray8);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser10 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup11 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue12 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray13 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue12 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList14 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14, encodedValueArray13);
        oSMRoadClassParser10.createEncodedValues(encodedValueLookup11, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        oSMMaxWidthParser7.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager9, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        com.graphhopper.routing.DefaultWeightingFactory defaultWeightingFactory18 = new com.graphhopper.routing.DefaultWeightingFactory(graphHopperStorage5, encodingManager9);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage22 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager9, true, false, (int) (short) 10);
        boolean boolean23 = graphHopperStorage22.isClosed();
        com.graphhopper.storage.TurnCostStorage turnCostStorage24 = graphHopperStorage22.getTurnCostStorage();
        com.graphhopper.storage.RAMDirectory rAMDirectory26 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder27 = rAMDirectory26.getByteOrder();
        rAMDirectory26.clear();
        boolean boolean29 = rAMDirectory26.isStoring();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage30 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue31 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser32 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue31);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray33 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager34 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray33);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser35 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup36 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue37 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray38 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue37 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList39 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList39, encodedValueArray38);
        oSMRoadClassParser35.createEncodedValues(encodedValueLookup36, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList39);
        oSMMaxWidthParser32.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager34, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList39);
        com.graphhopper.routing.DefaultWeightingFactory defaultWeightingFactory43 = new com.graphhopper.routing.DefaultWeightingFactory(graphHopperStorage30, encodingManager34);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage47 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory26, encodingManager34, true, false, (int) (short) 10);
        boolean boolean48 = graphHopperStorage47.isClosed();
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue50 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.util.details.BooleanDetails booleanDetails51 = new com.graphhopper.util.details.BooleanDetails("get_off_bike", booleanEncodedValue50);
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter52 = com.graphhopper.routing.util.DefaultEdgeFilter.outEdges(booleanEncodedValue50);
        com.graphhopper.util.EdgeExplorer edgeExplorer53 = graphHopperStorage47.createEdgeExplorer((com.graphhopper.routing.util.EdgeFilter) defaultEdgeFilter52);
        com.graphhopper.storage.Graph graph54 = com.graphhopper.util.GHUtility.copyTo((com.graphhopper.storage.Graph) graphHopperStorage22, (com.graphhopper.storage.Graph) graphHopperStorage47);
        boolean boolean55 = graphHopperStorage22.loadExisting();
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(decimalEncodedValue6);
        org.junit.Assert.assertNotNull(flagEncoderArray8);
        org.junit.Assert.assertNotNull(encodingManager9);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue12);
        org.junit.Assert.assertNotNull(encodedValueArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(turnCostStorage24);
        org.junit.Assert.assertNotNull(byteOrder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(decimalEncodedValue31);
        org.junit.Assert.assertNotNull(flagEncoderArray33);
        org.junit.Assert.assertNotNull(encodingManager34);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue37);
        org.junit.Assert.assertNotNull(encodedValueArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(booleanEncodedValue50);
        org.junit.Assert.assertNotNull(defaultEdgeFilter52);
        org.junit.Assert.assertNotNull(edgeExplorer53);
        org.junit.Assert.assertNotNull(graph54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator5 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray6 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator5 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap7 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray1, edgeIteratorArray6);
        java.util.Iterator<com.carrotsearch.hppc.cursors.IntObjectCursor<com.graphhopper.util.EdgeIterator>> edgeIteratorIntObjectCursorItor8 = edgeIteratorIntObjectHashMap7.iterator();
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator>.KeysContainer keysContainer9 = edgeIteratorIntObjectHashMap7.keys();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(edgeIteratorArray6);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap7);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectCursorItor8);
        org.junit.Assert.assertNotNull(keysContainer9);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator5 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray6 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator5 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap7 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray1, edgeIteratorArray6);
        int[] intArray8 = edgeIteratorIntObjectHashMap7.keys;
        int int10 = edgeIteratorIntObjectHashMap7.indexOf(4);
        com.graphhopper.util.EdgeIterator edgeIterator12 = edgeIteratorIntObjectHashMap7.get((int) (byte) 1);
        edgeIteratorIntObjectHashMap7.clear();
        int int14 = edgeIteratorIntObjectHashMap7.size();
        java.lang.String str16 = edgeIteratorIntObjectHashMap7.visualizeKeyDistribution(35);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator18 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        boolean boolean19 = edgeIteratorIntObjectHashMap7.putIfAbsent(100, (com.graphhopper.util.EdgeIterator) disabledEdgeIterator18);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue20 = com.graphhopper.routing.ev.Country.create();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.Country country21 = disabledEdgeIterator18.get(countryEnumEncodedValue20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(edgeIteratorArray6);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap7);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 0, 0, 0]");
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertNull(edgeIterator12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "....                               " + "'", str16, "....                               ");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue20);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
        com.graphhopper.routing.ev.Toll toll1 = com.graphhopper.routing.ev.Toll.find("max_width time:0.0s");
        org.junit.Assert.assertTrue("'" + toll1 + "' != '" + com.graphhopper.routing.ev.Toll.NO + "'", toll1.equals(com.graphhopper.routing.ev.Toll.NO));
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap0 = new com.graphhopper.coll.GHIntLongHashMap();
        long long3 = gHIntLongHashMap0.addTo((int) (short) -1, (long) '4');
        com.carrotsearch.hppc.LongCollection longCollection4 = gHIntLongHashMap0.values();
        long long6 = gHIntLongHashMap0.remove((int) (short) 0);
        long long9 = gHIntLongHashMap0.put((-885860508), (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(longCollection4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.UnsignedDecimalEncodedValue unsignedDecimalEncodedValue4 = new com.graphhopper.routing.ev.UnsignedDecimalEncodedValue("[]$turn_cost", (-1771721015), 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue name wasn't valid: []$turn_cost. Use lower case letters, underscore and numbers only.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
        com.graphhopper.routing.weighting.Weighting weighting0 = null;
        com.graphhopper.util.details.AverageSpeedDetails averageSpeedDetails2 = new com.graphhopper.util.details.AverageSpeedDetails(weighting0, (double) 52L);
        java.lang.String str3 = averageSpeedDetails2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "average_speed" + "'", str3, "average_speed");
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder2 = rAMDirectory1.getByteOrder();
        rAMDirectory1.clear();
        boolean boolean4 = rAMDirectory1.isStoring();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage5 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue6 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser7 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue6);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray8 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager9 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray8);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser10 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup11 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue12 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray13 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue12 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList14 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14, encodedValueArray13);
        oSMRoadClassParser10.createEncodedValues(encodedValueLookup11, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        oSMMaxWidthParser7.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager9, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        com.graphhopper.routing.DefaultWeightingFactory defaultWeightingFactory18 = new com.graphhopper.routing.DefaultWeightingFactory(graphHopperStorage5, encodingManager9);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage22 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager9, true, false, (int) (short) 10);
        boolean boolean23 = graphHopperStorage22.isClosed();
        int int24 = graphHopperStorage22.getNodes();
        com.graphhopper.routing.util.EncodingManager encodingManager25 = graphHopperStorage22.getEncodingManager();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue27 = encodingManager25.getStringEncodedValue("bike_network");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot find EncodedValue bike_network in collection: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(decimalEncodedValue6);
        org.junit.Assert.assertNotNull(flagEncoderArray8);
        org.junit.Assert.assertNotNull(encodingManager9);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue12);
        org.junit.Assert.assertNotNull(encodedValueArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(encodingManager25);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
        com.graphhopper.routing.weighting.Weighting weighting0 = null;
        com.graphhopper.util.details.AverageSpeedDetails averageSpeedDetails2 = new com.graphhopper.util.details.AverageSpeedDetails(weighting0, 1.0000000000000002E-10d);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
        com.graphhopper.util.DistanceCalc distanceCalc0 = com.graphhopper.util.DistanceCalcEarth.DIST_EARTH;
        double double5 = distanceCalc0.calcNormalizedDist((double) (-10), (double) ' ', (double) (-885860508), 0.0d);
        org.junit.Assert.assertNotNull(distanceCalc0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8439398828162039d + "'", double5 == 0.8439398828162039d);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test844");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.BIG;
        byte[] byteArray2 = bitUtil0.fromFloat((float) 0);
        com.graphhopper.util.BitUtil bitUtil3 = com.graphhopper.util.BitUtil.BIG;
        byte[] byteArray5 = bitUtil3.fromFloat((float) 0);
        java.lang.String str6 = bitUtil0.toBitString(byteArray5);
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(bitUtil3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000000000000000000000000000" + "'", str6, "00000000000000000000000000000000");
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test845");
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue3 = new com.graphhopper.routing.ev.StringEncodedValue("custom", (int) ' ', false);
        java.lang.String str4 = stringEncodedValue3.getName();
        int int5 = stringEncodedValue3.getVersion();
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser7 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup8 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue9 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray10 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue9 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList11 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList11, encodedValueArray10);
        oSMRoadClassParser7.createEncodedValues(encodedValueLookup8, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList11);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup14 = null;
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser15 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup16 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue17 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray18 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue17 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList19 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList19, encodedValueArray18);
        oSMRoadClassParser15.createEncodedValues(encodedValueLookup16, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList19);
        oSMRoadClassParser7.createEncodedValues(encodedValueLookup14, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList19);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup23 = null;
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser24 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup25 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue26 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray27 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue26 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList28 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList28, encodedValueArray27);
        oSMRoadClassParser24.createEncodedValues(encodedValueLookup25, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList28);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup31 = null;
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser32 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup33 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue34 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray35 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue34 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList36 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList36, encodedValueArray35);
        oSMRoadClassParser32.createEncodedValues(encodedValueLookup33, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList36);
        oSMRoadClassParser24.createEncodedValues(encodedValueLookup31, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList36);
        oSMRoadClassParser7.createEncodedValues(encodedValueLookup23, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList36);
        com.graphhopper.storage.IntsRef intsRef41 = com.graphhopper.storage.IntsRef.EMPTY;
        com.graphhopper.storage.IntsRef intsRef42 = com.graphhopper.storage.IntsRef.EMPTY;
        boolean boolean43 = intsRef41.intsEquals(intsRef42);
        com.graphhopper.reader.ReaderWay readerWay44 = null;
        int[] intArray47 = new int[] { 100 };
        long[] longArray49 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap50 = com.carrotsearch.hppc.IntLongHashMap.from(intArray47, longArray49);
        int[] intArray52 = new int[] { 100 };
        long[] longArray54 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap55 = com.carrotsearch.hppc.IntLongHashMap.from(intArray52, longArray54);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator56 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray57 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator56 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap58 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray52, edgeIteratorArray57);
        int[] intArray59 = com.graphhopper.util.ArrayUtil.merge(intArray47, intArray52);
        com.graphhopper.storage.IntsRef intsRef62 = new com.graphhopper.storage.IntsRef(intArray47, (int) (short) 0, 0);
        com.graphhopper.storage.IntsRef intsRef63 = com.graphhopper.storage.IntsRef.EMPTY;
        boolean boolean64 = intsRef62.intsEquals(intsRef63);
        com.graphhopper.storage.IntsRef intsRef65 = oSMRoadClassParser7.handleWayTags(intsRef41, readerWay44, true, intsRef63);
        // The following exception was thrown during execution in test generation
        try {
            int int66 = stringEncodedValue3.getInt(false, intsRef41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "custom" + "'", str4, "custom");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-885860508) + "'", int5 == (-885860508));
        org.junit.Assert.assertNotNull(countryEnumEncodedValue9);
        org.junit.Assert.assertNotNull(encodedValueArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue17);
        org.junit.Assert.assertNotNull(encodedValueArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue26);
        org.junit.Assert.assertNotNull(encodedValueArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue34);
        org.junit.Assert.assertNotNull(encodedValueArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(intsRef41);
        org.junit.Assert.assertNotNull(intsRef42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[100]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap50);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[100]");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap55);
        org.junit.Assert.assertNotNull(edgeIteratorArray57);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap58);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[100]");
        org.junit.Assert.assertNotNull(intsRef63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(intsRef65);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test846");
        java.util.Random random0 = null;
        com.graphhopper.routing.util.tour.SinglePointTour singlePointTour2 = new com.graphhopper.routing.util.tour.SinglePointTour(random0, (double) 10);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test847");
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.RoadClass> roadClassEnumEncodedValue1 = null;
        com.graphhopper.util.details.EnumDetails<com.graphhopper.routing.ev.RoadClass> roadClassEnumDetails2 = new com.graphhopper.util.details.EnumDetails<com.graphhopper.routing.ev.RoadClass>("prepare.ch.edge.hierarchy_depth_weight", roadClassEnumEncodedValue1);
        com.graphhopper.storage.IntsRef intsRef4 = null;
        com.graphhopper.util.EdgeIteratorState edgeIteratorState10 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) (byte) 100, intsRef4, (int) (short) -1, (int) (short) 100, (-4), (int) (byte) 0, 3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = roadClassEnumDetails2.isEdgeDifferentToLastEdge(edgeIteratorState10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorState10);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test848");
        com.graphhopper.storage.CHEdgeFilter cHEdgeFilter0 = com.graphhopper.storage.CHEdgeFilter.ALL_EDGES;
        com.graphhopper.storage.RoutingCHEdgeIteratorState routingCHEdgeIteratorState1 = null;
        boolean boolean2 = cHEdgeFilter0.accept(routingCHEdgeIteratorState1);
        org.junit.Assert.assertNotNull(cHEdgeFilter0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test849");
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.storage.CHConfig cHConfig2 = com.graphhopper.storage.CHConfig.edgeBased("bike_network", weighting1);
        boolean boolean3 = cHConfig2.isEdgeBased();
        java.lang.Object obj4 = null;
        boolean boolean5 = cHConfig2.equals(obj4);
        org.junit.Assert.assertNotNull(cHConfig2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test850");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        int[] intArray6 = new int[] { 100 };
        long[] longArray8 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap9 = com.carrotsearch.hppc.IntLongHashMap.from(intArray6, longArray8);
        com.carrotsearch.hppc.LongLongHashMap longLongHashMap10 = com.carrotsearch.hppc.LongLongHashMap.from(longArray3, longArray8);
        long[] longArray12 = new long[] { 10 };
        com.carrotsearch.hppc.LongHashSet longHashSet13 = com.carrotsearch.hppc.LongHashSet.from(longArray12);
        int int14 = longLongHashMap10.removeAll((com.carrotsearch.hppc.LongContainer) longHashSet13);
        int[] intArray16 = new int[] { 100 };
        long[] longArray18 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap19 = com.carrotsearch.hppc.IntLongHashMap.from(intArray16, longArray18);
        int[] intArray21 = new int[] { 100 };
        long[] longArray23 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap24 = com.carrotsearch.hppc.IntLongHashMap.from(intArray21, longArray23);
        com.carrotsearch.hppc.LongLongHashMap longLongHashMap25 = com.carrotsearch.hppc.LongLongHashMap.from(longArray18, longArray23);
        long[] longArray27 = new long[] { 10 };
        com.carrotsearch.hppc.LongHashSet longHashSet28 = com.carrotsearch.hppc.LongHashSet.from(longArray27);
        int int29 = longLongHashMap25.removeAll((com.carrotsearch.hppc.LongContainer) longHashSet28);
        int int30 = longLongHashMap10.removeAll((com.carrotsearch.hppc.LongContainer) longHashSet28);
        long[] longArray36 = new long[] { 2, (byte) 10, 201, 2, 5 };
        longLongHashMap10.values = longArray36;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap9);
        org.junit.Assert.assertNotNull(longLongHashMap10);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[10]");
        org.junit.Assert.assertNotNull(longHashSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap24);
        org.junit.Assert.assertNotNull(longLongHashMap25);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[10]");
        org.junit.Assert.assertNotNull(longHashSet28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[2, 10, 201, 2, 5]");
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test851");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder2 = rAMDirectory1.getByteOrder();
        rAMDirectory1.clear();
        boolean boolean4 = rAMDirectory1.isStoring();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage5 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue6 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser7 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue6);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray8 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager9 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray8);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser10 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup11 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue12 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray13 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue12 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList14 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14, encodedValueArray13);
        oSMRoadClassParser10.createEncodedValues(encodedValueLookup11, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        oSMMaxWidthParser7.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager9, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        com.graphhopper.routing.DefaultWeightingFactory defaultWeightingFactory18 = new com.graphhopper.routing.DefaultWeightingFactory(graphHopperStorage5, encodingManager9);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage22 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager9, true, false, (int) (short) 10);
        boolean boolean23 = graphHopperStorage22.isClosed();
        com.graphhopper.storage.TurnCostStorage turnCostStorage24 = graphHopperStorage22.getTurnCostStorage();
        com.graphhopper.storage.Graph graph25 = graphHopperStorage22.getBaseGraph();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState28 = graphHopperStorage22.edge((-1771721015), 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: The graph has not yet been initialized.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(decimalEncodedValue6);
        org.junit.Assert.assertNotNull(flagEncoderArray8);
        org.junit.Assert.assertNotNull(encodingManager9);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue12);
        org.junit.Assert.assertNotNull(encodedValueArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(turnCostStorage24);
        org.junit.Assert.assertNotNull(graph25);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test852");
        java.lang.String str0 = com.graphhopper.routing.ev.MtbRating.KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mtb_rating" + "'", str0, "mtb_rating");
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test853");
        com.graphhopper.routing.util.FlagEncoder flagEncoder0 = null;
        com.graphhopper.routing.querygraph.QueryGraph queryGraph1 = null;
        com.graphhopper.routing.RoutingAlgorithmFactory routingAlgorithmFactory2 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions3 = null;
        com.graphhopper.routing.FlexiblePathCalculator flexiblePathCalculator4 = new com.graphhopper.routing.FlexiblePathCalculator(queryGraph1, routingAlgorithmFactory2, algorithmOptions3);
        com.graphhopper.routing.weighting.Weighting weighting6 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions7 = new com.graphhopper.routing.AlgorithmOptions("[]", weighting6);
        flexiblePathCalculator4.setAlgoOpts(algorithmOptions7);
        com.graphhopper.util.PMap pMap9 = algorithmOptions7.getHints();
        com.graphhopper.routing.weighting.TurnCostProvider turnCostProvider10 = com.graphhopper.routing.weighting.TurnCostProvider.NO_TURN_COST_PROVIDER;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.CurvatureWeighting curvatureWeighting11 = new com.graphhopper.routing.weighting.CurvatureWeighting(flagEncoder0, pMap9, turnCostProvider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pMap9);
        org.junit.Assert.assertNotNull(turnCostProvider10);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test854");
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType0 = com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH_DAY;
        org.junit.Assert.assertTrue("'" + parseType0 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH_DAY + "'", parseType0.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH_DAY));
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test855");
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
        int int17 = 0; // flaky: intHashSet14.indexReplace((int) (byte) 0, 201);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap9);
        org.junit.Assert.assertNotNull(edgeIteratorArray11);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100]");
        org.junit.Assert.assertNotNull(intHashSet14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test856");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl0 = new com.graphhopper.coll.GHBitSetImpl();
        int int2 = gHBitSetImpl0.previousClearBit(0);
        gHBitSetImpl0.clear();
        boolean boolean5 = gHBitSetImpl0.contains(11);
        int int6 = gHBitSetImpl0.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test857");
        com.graphhopper.storage.RoutingCHGraph routingCHGraph0 = null;
        com.graphhopper.routing.ch.ShortcutUnpacker.Visitor visitor1 = null;
        com.graphhopper.routing.ch.ShortcutUnpacker shortcutUnpacker3 = new com.graphhopper.routing.ch.ShortcutUnpacker(routingCHGraph0, visitor1, false);
        // The following exception was thrown during execution in test generation
        try {
            shortcutUnpacker3.visitOriginalEdgesBwd(4, (int) (short) 10, false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test858");
        com.graphhopper.routing.ev.RoadClass roadClass0 = com.graphhopper.routing.ev.RoadClass.CORRIDOR;
        org.junit.Assert.assertTrue("'" + roadClass0 + "' != '" + com.graphhopper.routing.ev.RoadClass.CORRIDOR + "'", roadClass0.equals(com.graphhopper.routing.ev.RoadClass.CORRIDOR));
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test859");
        com.graphhopper.reader.dem.GMTEDProvider gMTEDProvider0 = new com.graphhopper.reader.dem.GMTEDProvider();
        boolean boolean1 = gMTEDProvider0.getInterpolate();
        gMTEDProvider0.release();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test860");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator5 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray6 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator5 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap7 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray1, edgeIteratorArray6);
        int[] intArray8 = edgeIteratorIntObjectHashMap7.keys;
        int int10 = edgeIteratorIntObjectHashMap7.indexOf(4);
        com.graphhopper.util.EdgeIterator edgeIterator12 = edgeIteratorIntObjectHashMap7.get((int) (byte) 1);
        edgeIteratorIntObjectHashMap7.clear();
        int int14 = edgeIteratorIntObjectHashMap7.size();
        java.lang.String str16 = edgeIteratorIntObjectHashMap7.visualizeKeyDistribution(35);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator18 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        boolean boolean19 = edgeIteratorIntObjectHashMap7.putIfAbsent(100, (com.graphhopper.util.EdgeIterator) disabledEdgeIterator18);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue20 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double21 = disabledEdgeIterator18.getReverse(decimalEncodedValue20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(edgeIteratorArray6);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap7);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 100, 0]");
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(edgeIterator12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "....                               " + "'", str16, "....                               ");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test861");
        com.graphhopper.util.PointList pointList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.PointList pointList1 = com.graphhopper.reader.dem.GraphElevationSmoothing.smoothElevation(pointList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test862");
        com.graphhopper.coll.GHTBitSet gHTBitSet1 = new com.graphhopper.coll.GHTBitSet(0);
        gHTBitSet1.remove((int) (byte) 100);
        gHTBitSet1.clear();
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test863");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator5 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray6 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator5 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap7 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray1, edgeIteratorArray6);
        int[] intArray8 = edgeIteratorIntObjectHashMap7.keys;
        java.lang.String str10 = edgeIteratorIntObjectHashMap7.visualizeKeyDistribution(100);
        java.lang.Object[] objArray11 = edgeIteratorIntObjectHashMap7.values;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(edgeIteratorArray6);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap7);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 100, 0]");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "...X                                                                                                " + "'", str10, "...X                                                                                                ");
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test864");
        com.graphhopper.util.DistancePlaneProjection distancePlaneProjection0 = com.graphhopper.util.DistancePlaneProjection.DIST_PLANE;
        double double2 = distancePlaneProjection0.calcCircumference(0.0d);
        double double4 = distancePlaneProjection0.calcNormalizedDist((double) (short) 0);
        double double9 = distancePlaneProjection0.calcDist((double) 10L, (double) 35L, (double) ' ', 0.0d);
        java.lang.String str10 = distancePlaneProjection0.toString();
        double double15 = distancePlaneProjection0.calcDist(100.0d, Double.NaN, 6.661798265227327E-11d, (double) 1.0f);
        double double20 = distancePlaneProjection0.calcNormalizedDist((double) 3, 0.5868240888334652d, 1.667897456212138E7d, 18.42059311345597d);
        com.graphhopper.util.shapes.GHPoint gHPoint27 = distancePlaneProjection0.calcCrossingPointToEdge(0.0d, (double) 2147483647, (double) 11, (double) 35, 0.6871794760227203d, (double) 1.0f);
        org.junit.Assert.assertNotNull(distancePlaneProjection0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.003017359204114E7d + "'", double2 == 4.003017359204114E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4380115.099104042d + "'", double9 == 4380115.099104042d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PLANE_PROJ" + "'", str10, "PLANE_PROJ");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 8.474093891315236E10d + "'", double20 == 8.474093891315236E10d);
        org.junit.Assert.assertNotNull(gHPoint27);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test865");
        java.util.Locale locale0 = null;
        com.graphhopper.util.TranslationMap.TranslationHashMap translationHashMap1 = new com.graphhopper.util.TranslationMap.TranslationHashMap(locale0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = translationHashMap1.getLanguage();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test866");
        com.graphhopper.routing.util.FlagEncoder flagEncoder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.ShortFastestWeighting shortFastestWeighting2 = new com.graphhopper.routing.weighting.ShortFastestWeighting(flagEncoder0, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test867");
        java.lang.String str0 = com.graphhopper.routing.util.FlagEncoderFactory.HIKE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hike" + "'", str0, "hike");
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test868");
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue1 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.util.details.BooleanDetails booleanDetails2 = new com.graphhopper.util.details.BooleanDetails("get_off_bike", booleanEncodedValue1);
        com.graphhopper.storage.IntsRef intsRef4 = null;
        com.graphhopper.util.EdgeIteratorState edgeIteratorState10 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) (byte) 100, intsRef4, (int) (short) -1, (int) (short) 100, (-4), (int) (byte) 0, 3);
        boolean boolean11 = booleanDetails2.isEdgeDifferentToLastEdge(edgeIteratorState10);
        java.lang.Object obj12 = booleanDetails2.getCurrentValue();
        org.junit.Assert.assertNotNull(booleanEncodedValue1);
        org.junit.Assert.assertNotNull(edgeIteratorState10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + false + "'", obj12, false);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test869");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("OSM File header:{}");
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test870");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder2 = rAMDirectory1.getByteOrder();
        rAMDirectory1.clear();
        boolean boolean4 = rAMDirectory1.isStoring();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage5 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue6 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser7 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue6);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray8 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager9 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray8);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser10 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup11 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue12 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray13 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue12 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList14 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14, encodedValueArray13);
        oSMRoadClassParser10.createEncodedValues(encodedValueLookup11, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        oSMMaxWidthParser7.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager9, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        com.graphhopper.routing.DefaultWeightingFactory defaultWeightingFactory18 = new com.graphhopper.routing.DefaultWeightingFactory(graphHopperStorage5, encodingManager9);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage22 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager9, true, false, (int) (short) 10);
        boolean boolean23 = graphHopperStorage22.isClosed();
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue25 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.util.details.BooleanDetails booleanDetails26 = new com.graphhopper.util.details.BooleanDetails("get_off_bike", booleanEncodedValue25);
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter27 = com.graphhopper.routing.util.DefaultEdgeFilter.outEdges(booleanEncodedValue25);
        com.graphhopper.util.EdgeExplorer edgeExplorer28 = graphHopperStorage22.createEdgeExplorer((com.graphhopper.routing.util.EdgeFilter) defaultEdgeFilter27);
        com.graphhopper.storage.Graph graph29 = graphHopperStorage22.getBaseGraph();
        int int30 = graphHopperStorage22.getNodes();
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(decimalEncodedValue6);
        org.junit.Assert.assertNotNull(flagEncoderArray8);
        org.junit.Assert.assertNotNull(encodingManager9);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue12);
        org.junit.Assert.assertNotNull(encodedValueArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(booleanEncodedValue25);
        org.junit.Assert.assertNotNull(defaultEdgeFilter27);
        org.junit.Assert.assertNotNull(edgeExplorer28);
        org.junit.Assert.assertNotNull(graph29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test871");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder2 = rAMDirectory1.getByteOrder();
        rAMDirectory1.clear();
        boolean boolean4 = rAMDirectory1.isStoring();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage5 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue6 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser7 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue6);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray8 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager9 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray8);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser10 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup11 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue12 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray13 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue12 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList14 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14, encodedValueArray13);
        oSMRoadClassParser10.createEncodedValues(encodedValueLookup11, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        oSMMaxWidthParser7.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager9, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        com.graphhopper.routing.DefaultWeightingFactory defaultWeightingFactory18 = new com.graphhopper.routing.DefaultWeightingFactory(graphHopperStorage5, encodingManager9);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage22 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager9, true, false, (int) (short) 10);
        boolean boolean23 = graphHopperStorage22.isClosed();
        com.graphhopper.storage.TurnCostStorage turnCostStorage24 = graphHopperStorage22.getTurnCostStorage();
        com.graphhopper.storage.RAMDirectory rAMDirectory26 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder27 = rAMDirectory26.getByteOrder();
        rAMDirectory26.clear();
        boolean boolean29 = rAMDirectory26.isStoring();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage30 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue31 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser32 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue31);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray33 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager34 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray33);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser35 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup36 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue37 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray38 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue37 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList39 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList39, encodedValueArray38);
        oSMRoadClassParser35.createEncodedValues(encodedValueLookup36, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList39);
        oSMMaxWidthParser32.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager34, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList39);
        com.graphhopper.routing.DefaultWeightingFactory defaultWeightingFactory43 = new com.graphhopper.routing.DefaultWeightingFactory(graphHopperStorage30, encodingManager34);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage47 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory26, encodingManager34, true, false, (int) (short) 10);
        boolean boolean48 = graphHopperStorage47.isClosed();
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue50 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.util.details.BooleanDetails booleanDetails51 = new com.graphhopper.util.details.BooleanDetails("get_off_bike", booleanEncodedValue50);
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter52 = com.graphhopper.routing.util.DefaultEdgeFilter.outEdges(booleanEncodedValue50);
        com.graphhopper.util.EdgeExplorer edgeExplorer53 = graphHopperStorage47.createEdgeExplorer((com.graphhopper.routing.util.EdgeFilter) defaultEdgeFilter52);
        com.graphhopper.storage.Graph graph54 = com.graphhopper.util.GHUtility.copyTo((com.graphhopper.storage.Graph) graphHopperStorage22, (com.graphhopper.storage.Graph) graphHopperStorage47);
        boolean boolean55 = graphHopperStorage47.isClosed();
        com.graphhopper.routing.weighting.Weighting weighting56 = null;
        com.graphhopper.routing.util.TraversalMode traversalMode57 = com.graphhopper.routing.util.TraversalMode.EDGE_BASED;
        boolean boolean58 = traversalMode57.isEdgeBased();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.DijkstraOneToMany dijkstraOneToMany59 = new com.graphhopper.routing.DijkstraOneToMany((com.graphhopper.storage.Graph) graphHopperStorage47, weighting56, traversalMode57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(decimalEncodedValue6);
        org.junit.Assert.assertNotNull(flagEncoderArray8);
        org.junit.Assert.assertNotNull(encodingManager9);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue12);
        org.junit.Assert.assertNotNull(encodedValueArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(turnCostStorage24);
        org.junit.Assert.assertNotNull(byteOrder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(decimalEncodedValue31);
        org.junit.Assert.assertNotNull(flagEncoderArray33);
        org.junit.Assert.assertNotNull(encodingManager34);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue37);
        org.junit.Assert.assertNotNull(encodedValueArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(booleanEncodedValue50);
        org.junit.Assert.assertNotNull(defaultEdgeFilter52);
        org.junit.Assert.assertNotNull(edgeExplorer53);
        org.junit.Assert.assertNotNull(graph54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + traversalMode57 + "' != '" + com.graphhopper.routing.util.TraversalMode.EDGE_BASED + "'", traversalMode57.equals(com.graphhopper.routing.util.TraversalMode.EDGE_BASED));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test872");
        java.util.Locale locale0 = null;
        com.graphhopper.util.TranslationMap.TranslationHashMap translationHashMap1 = new com.graphhopper.util.TranslationMap.TranslationHashMap(locale0);
        com.graphhopper.util.TranslationMap.TranslationHashMap translationHashMap4 = translationHashMap1.put("mtb", "get_off_bike");
        translationHashMap4.clear();
        org.junit.Assert.assertNotNull(translationHashMap4);
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test873");
        com.graphhopper.storage.IntsRef intsRef5 = com.graphhopper.storage.IntsRef.EMPTY;
        java.lang.String str6 = intsRef5.toString();
        com.graphhopper.util.PointList pointList8 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState10 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState((int) (short) 10, (-4), (-2), 2, (double) (-1), intsRef5, "PLANE_PROJ", pointList8, true);
        com.graphhopper.storage.IntsRef intsRef11 = virtualEdgeIteratorState10.getFlags();
        com.graphhopper.routing.ev.IntEncodedValue intEncodedValue12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState14 = virtualEdgeIteratorState10.setReverse(intEncodedValue12, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intsRef5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(intsRef11);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test874");
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue3 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.util.details.BooleanDetails booleanDetails4 = new com.graphhopper.util.details.BooleanDetails("get_off_bike", booleanEncodedValue3);
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter5 = com.graphhopper.routing.util.DefaultEdgeFilter.outEdges(booleanEncodedValue3);
        com.graphhopper.util.details.BooleanDetails booleanDetails6 = new com.graphhopper.util.details.BooleanDetails("road_class_link", booleanEncodedValue3);
        com.graphhopper.routing.weighting.TurnCostProvider turnCostProvider7 = com.graphhopper.routing.weighting.TurnCostProvider.NO_TURN_COST_PROVIDER;
        long long11 = turnCostProvider7.calcTurnMillis((int) ' ', (int) '#', 2147483647);
        com.graphhopper.routing.subnetwork.PrepareRoutingSubnetworks.PrepareJob prepareJob12 = new com.graphhopper.routing.subnetwork.PrepareRoutingSubnetworks.PrepareJob("hike_rating", booleanEncodedValue3, turnCostProvider7);
        org.junit.Assert.assertNotNull(booleanEncodedValue3);
        org.junit.Assert.assertNotNull(defaultEdgeFilter5);
        org.junit.Assert.assertNotNull(turnCostProvider7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test875");
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue2 = com.graphhopper.routing.ev.TurnCost.create("roundabout", 97);
        org.junit.Assert.assertNotNull(decimalEncodedValue2);
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test876");
        com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge prepareBaseEdge5 = new com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge((int) (byte) 1, (int) (byte) -1, (int) (short) 1, (float) (short) -1, (float) '#');
        int int6 = prepareBaseEdge5.getNodeB();
        int int7 = prepareBaseEdge5.getOrigEdgeKeyFirstBA();
        int int8 = prepareBaseEdge5.getOrigEdgeKeyLastAB();
        int int9 = prepareBaseEdge5.getOrigEdgeKeyLastBA();
        int int10 = prepareBaseEdge5.getNodeB();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test877");
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser0 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup1 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue2 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray3 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue2 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList4 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList4, encodedValueArray3);
        oSMRoadClassParser0.createEncodedValues(encodedValueLookup1, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList4);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup7 = null;
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser8 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup9 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue10 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray11 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue10 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList12 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList12, encodedValueArray11);
        oSMRoadClassParser8.createEncodedValues(encodedValueLookup9, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList12);
        oSMRoadClassParser0.createEncodedValues(encodedValueLookup7, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList12);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup16 = null;
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser17 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup18 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue19 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray20 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue19 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList21 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList21, encodedValueArray20);
        oSMRoadClassParser17.createEncodedValues(encodedValueLookup18, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList21);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup24 = null;
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser25 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup26 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue27 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray28 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue27 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList29 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList29, encodedValueArray28);
        oSMRoadClassParser25.createEncodedValues(encodedValueLookup26, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList29);
        oSMRoadClassParser17.createEncodedValues(encodedValueLookup24, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList29);
        oSMRoadClassParser0.createEncodedValues(encodedValueLookup16, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList29);
        com.graphhopper.storage.IntsRef intsRef34 = com.graphhopper.storage.IntsRef.EMPTY;
        com.graphhopper.storage.IntsRef intsRef35 = com.graphhopper.storage.IntsRef.EMPTY;
        boolean boolean36 = intsRef34.intsEquals(intsRef35);
        com.graphhopper.reader.ReaderWay readerWay37 = null;
        int[] intArray40 = new int[] { 100 };
        long[] longArray42 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap43 = com.carrotsearch.hppc.IntLongHashMap.from(intArray40, longArray42);
        int[] intArray45 = new int[] { 100 };
        long[] longArray47 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap48 = com.carrotsearch.hppc.IntLongHashMap.from(intArray45, longArray47);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator49 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray50 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator49 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap51 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray45, edgeIteratorArray50);
        int[] intArray52 = com.graphhopper.util.ArrayUtil.merge(intArray40, intArray45);
        com.graphhopper.storage.IntsRef intsRef55 = new com.graphhopper.storage.IntsRef(intArray40, (int) (short) 0, 0);
        com.graphhopper.storage.IntsRef intsRef56 = com.graphhopper.storage.IntsRef.EMPTY;
        boolean boolean57 = intsRef55.intsEquals(intsRef56);
        com.graphhopper.storage.IntsRef intsRef58 = oSMRoadClassParser0.handleWayTags(intsRef34, readerWay37, true, intsRef56);
        com.graphhopper.routing.util.parsers.OSMTollParser oSMTollParser59 = new com.graphhopper.routing.util.parsers.OSMTollParser();
        com.graphhopper.storage.IntsRef intsRef60 = com.graphhopper.storage.IntsRef.EMPTY;
        com.graphhopper.storage.IntsRef intsRef61 = com.graphhopper.storage.IntsRef.EMPTY;
        boolean boolean62 = intsRef60.intsEquals(intsRef61);
        com.graphhopper.reader.ReaderWay readerWay64 = new com.graphhopper.reader.ReaderWay((long) (byte) 100);
        com.graphhopper.routing.util.parsers.OSMRoadClassLinkParser oSMRoadClassLinkParser66 = new com.graphhopper.routing.util.parsers.OSMRoadClassLinkParser();
        com.graphhopper.storage.IntsRef intsRef67 = com.graphhopper.storage.IntsRef.EMPTY;
        int int68 = intsRef67.offset;
        com.graphhopper.reader.ReaderWay readerWay70 = new com.graphhopper.reader.ReaderWay((long) (byte) 100);
        com.graphhopper.storage.IntsRef intsRef72 = com.graphhopper.storage.IntsRef.EMPTY;
        com.graphhopper.storage.IntsRef intsRef73 = com.graphhopper.storage.IntsRef.EMPTY;
        boolean boolean74 = intsRef72.intsEquals(intsRef73);
        int int75 = intsRef72.length;
        com.graphhopper.storage.IntsRef intsRef76 = oSMRoadClassLinkParser66.handleWayTags(intsRef67, readerWay70, false, intsRef72);
        com.graphhopper.storage.IntsRef intsRef77 = oSMTollParser59.handleWayTags(intsRef61, readerWay64, false, intsRef72);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue78 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.reader.OSMTurnRelation.Type type86 = com.graphhopper.reader.OSMTurnRelation.Type.getRestrictionType("");
        com.graphhopper.reader.OSMTurnRelation oSMTurnRelation87 = new com.graphhopper.reader.OSMTurnRelation((long) (byte) 1, (long) (byte) 1, 10L, type86);
        com.graphhopper.reader.OSMTurnRelation oSMTurnRelation88 = new com.graphhopper.reader.OSMTurnRelation((long) (byte) 100, (long) ' ', 1L, type86);
        java.util.List<java.lang.String> strList89 = oSMTurnRelation88.getVehicleTypesExcept();
        com.graphhopper.routing.util.parsers.helpers.OSMValueExtractor.extractTons(intsRef58, readerWay64, decimalEncodedValue78, strList89);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue2);
        org.junit.Assert.assertNotNull(encodedValueArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue10);
        org.junit.Assert.assertNotNull(encodedValueArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue19);
        org.junit.Assert.assertNotNull(encodedValueArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue27);
        org.junit.Assert.assertNotNull(encodedValueArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(intsRef34);
        org.junit.Assert.assertNotNull(intsRef35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap43);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[100]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap48);
        org.junit.Assert.assertNotNull(edgeIteratorArray50);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap51);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[100]");
        org.junit.Assert.assertNotNull(intsRef56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intsRef58);
        org.junit.Assert.assertNotNull(intsRef60);
        org.junit.Assert.assertNotNull(intsRef61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(intsRef67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(intsRef72);
        org.junit.Assert.assertNotNull(intsRef73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(intsRef76);
        org.junit.Assert.assertNotNull(intsRef77);
        org.junit.Assert.assertNotNull(decimalEncodedValue78);
        org.junit.Assert.assertTrue("'" + type86 + "' != '" + com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED + "'", type86.equals(com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED));
        org.junit.Assert.assertNotNull(strList89);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test878");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        int[] intArray6 = new int[] { 100 };
        long[] longArray8 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap9 = com.carrotsearch.hppc.IntLongHashMap.from(intArray6, longArray8);
        com.carrotsearch.hppc.LongLongHashMap longLongHashMap10 = com.carrotsearch.hppc.LongLongHashMap.from(longArray3, longArray8);
        long[] longArray12 = new long[] { 10 };
        com.carrotsearch.hppc.LongHashSet longHashSet13 = com.carrotsearch.hppc.LongHashSet.from(longArray12);
        int int14 = longLongHashMap10.removeAll((com.carrotsearch.hppc.LongContainer) longHashSet13);
        boolean boolean16 = longHashSet13.remove((long) 100);
        longHashSet13.clear();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap9);
        org.junit.Assert.assertNotNull(longLongHashMap10);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[10]");
        org.junit.Assert.assertNotNull(longHashSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test879");
        com.graphhopper.util.MiniPerfTest miniPerfTest0 = new com.graphhopper.util.MiniPerfTest();
        com.graphhopper.util.MiniPerfTest miniPerfTest2 = miniPerfTest0.setIterations((int) (short) 10);
        org.junit.Assert.assertNotNull(miniPerfTest2);
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test880");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHLongHashSet gHLongHashSet2 = new com.graphhopper.coll.GHLongHashSet(0, (double) (-919338616));
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.hppc.BufferAllocationException; message: The load factor should be in range [0.01, 0.99]: -919338616.000000");
        } catch (com.carrotsearch.hppc.BufferAllocationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test881");
        java.io.File file0 = null;
        com.graphhopper.storage.SimpleFSLockFactory simpleFSLockFactory1 = new com.graphhopper.storage.SimpleFSLockFactory(file0);
        // The following exception was thrown during execution in test generation
        try {
            simpleFSLockFactory1.forceRemove("horse_rating", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test882");
        double[] doubleArray2 = new double[] { 8, 35.0d };
        double[] doubleArray9 = new double[] { 0L, 1.2361865545667784E10d, (short) 1, 3.6461703979660586E12d, Double.NaN, 3.6461703979660586E12d };
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.shapes.Polygon polygon10 = new com.graphhopper.util.shapes.Polygon(doubleArray2, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Points must be of equal length but was 2 vs. 6");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[8.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.2361865545667784E10, 1.0, 3.6461703979660586E12, NaN, 3.6461703979660586E12]");
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test883");
        int int0 = com.graphhopper.util.Constants.VERSION_STRING_IDX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test884");
        com.graphhopper.storage.IntsRef intsRef5 = com.graphhopper.storage.IntsRef.EMPTY;
        java.lang.String str6 = intsRef5.toString();
        com.graphhopper.util.PointList pointList8 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState10 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState((int) (short) 10, (-4), (-2), 2, (double) (-1), intsRef5, "PLANE_PROJ", pointList8, true);
        int int11 = virtualEdgeIteratorState10.getBaseNode();
        int int12 = virtualEdgeIteratorState10.getOrigEdgeLast();
        org.junit.Assert.assertNotNull(intsRef5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test885");
        com.graphhopper.storage.NodeAccess nodeAccess0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator2 = new com.graphhopper.routing.weighting.BeelineWeightApproximator(nodeAccess0, weighting1);
        double double3 = beelineWeightApproximator2.getSlack();
        com.graphhopper.routing.weighting.WeightApproximator weightApproximator4 = beelineWeightApproximator2.reverse();
        com.graphhopper.routing.weighting.WeightApproximator weightApproximator5 = beelineWeightApproximator2.reverse();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(weightApproximator4);
        org.junit.Assert.assertNotNull(weightApproximator5);
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test886");
        java.util.Locale locale0 = null;
        com.graphhopper.util.TranslationMap.TranslationHashMap translationHashMap1 = new com.graphhopper.util.TranslationMap.TranslationHashMap(locale0);
        com.graphhopper.util.TranslationMap.TranslationHashMap translationHashMap4 = translationHashMap1.put("mtb", "get_off_bike");
        int[] intArray7 = new int[] { 100 };
        long[] longArray9 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap10 = com.carrotsearch.hppc.IntLongHashMap.from(intArray7, longArray9);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator11 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray12 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator11 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap13 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray7, edgeIteratorArray12);
        java.lang.String str14 = translationHashMap4.tr("car4wd", (java.lang.Object[]) edgeIteratorArray12);
        com.graphhopper.util.TranslationMap.TranslationHashMap translationHashMap17 = translationHashMap4.put("Linux", "[]$turn_cost");
        org.junit.Assert.assertNotNull(translationHashMap4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap10);
        org.junit.Assert.assertNotNull(edgeIteratorArray12);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "car4wd" + "'", str14, "car4wd");
        org.junit.Assert.assertNotNull(translationHashMap17);
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test887");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator5 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray6 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator5 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap7 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray1, edgeIteratorArray6);
        int[] intArray8 = edgeIteratorIntObjectHashMap7.keys;
        java.lang.String str10 = edgeIteratorIntObjectHashMap7.visualizeKeyDistribution(100);
        boolean boolean12 = edgeIteratorIntObjectHashMap7.equals((java.lang.Object) "mtb");
        int[] intArray13 = edgeIteratorIntObjectHashMap7.keys;
        int[] intArray15 = new int[] { 100 };
        long[] longArray17 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap18 = com.carrotsearch.hppc.IntLongHashMap.from(intArray15, longArray17);
        int[] intArray20 = new int[] { 100 };
        long[] longArray22 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap23 = com.carrotsearch.hppc.IntLongHashMap.from(intArray20, longArray22);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator24 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray25 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator24 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap26 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray20, edgeIteratorArray25);
        int[] intArray27 = com.graphhopper.util.ArrayUtil.merge(intArray15, intArray20);
        com.carrotsearch.hppc.IntHashSet intHashSet28 = com.graphhopper.coll.GHIntHashSet.from(intArray27);
        int[] intArray29 = intHashSet28.toArray();
        com.graphhopper.routing.ev.HazmatTunnel hazmatTunnel30 = com.graphhopper.routing.ev.HazmatTunnel.D;
        boolean boolean31 = intHashSet28.equals((java.lang.Object) hazmatTunnel30);
        java.util.Spliterator<com.carrotsearch.hppc.cursors.IntCursor> intCursorSpliterator32 = intHashSet28.spliterator();
        java.util.Spliterator<com.carrotsearch.hppc.cursors.IntCursor> intCursorSpliterator33 = intHashSet28.spliterator();
        int[] intArray35 = new int[] { 100 };
        long[] longArray37 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap38 = com.carrotsearch.hppc.IntLongHashMap.from(intArray35, longArray37);
        int int39 = intHashSet28.addAll(intArray35);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray40 = com.graphhopper.util.ArrayUtil.applyOrder(intArray13, intArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(edgeIteratorArray6);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap7);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, 0, 0, 0]");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".X..                                                                                                " + "'", str10, ".X..                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(intArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 100, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap23);
        org.junit.Assert.assertNotNull(edgeIteratorArray25);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100]");
        org.junit.Assert.assertNotNull(intHashSet28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100]");
        org.junit.Assert.assertTrue("'" + hazmatTunnel30 + "' != '" + com.graphhopper.routing.ev.HazmatTunnel.D + "'", hazmatTunnel30.equals(com.graphhopper.routing.ev.HazmatTunnel.D));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(intCursorSpliterator32);
        org.junit.Assert.assertNotNull(intCursorSpliterator33);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test888");
        com.graphhopper.routing.weighting.Weighting weighting0 = null;
        com.graphhopper.storage.IntsRef intsRef2 = com.graphhopper.routing.ev.TurnCost.createFlags();
        com.graphhopper.util.EdgeIteratorState edgeIteratorState8 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState(3.6461703979660586E12d, intsRef2, (int) (short) 1, (int) (byte) 100, 35, (-2), (int) 'a');
        int int9 = edgeIteratorState8.getOrigEdgeLast();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = com.graphhopper.util.GHUtility.calcWeightWithTurnWeight(weighting0, edgeIteratorState8, false, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intsRef2);
        org.junit.Assert.assertNotNull(edgeIteratorState8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test889");
        com.graphhopper.routing.ev.RouteNetwork routeNetwork1 = com.graphhopper.routing.ev.RouteNetwork.find("horse_rating");
        org.junit.Assert.assertTrue("'" + routeNetwork1 + "' != '" + com.graphhopper.routing.ev.RouteNetwork.MISSING + "'", routeNetwork1.equals(com.graphhopper.routing.ev.RouteNetwork.MISSING));
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test890");
        com.graphhopper.GraphHopperConfig graphHopperConfig0 = new com.graphhopper.GraphHopperConfig();
        com.graphhopper.GraphHopperConfig graphHopperConfig1 = new com.graphhopper.GraphHopperConfig(graphHopperConfig0);
        com.graphhopper.config.Profile[] profileArray2 = new com.graphhopper.config.Profile[] {};
        java.util.ArrayList<com.graphhopper.config.Profile> profileList3 = new java.util.ArrayList<com.graphhopper.config.Profile>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.config.Profile>) profileList3, profileArray2);
        com.graphhopper.GraphHopperConfig graphHopperConfig5 = graphHopperConfig1.setProfiles((java.util.List<com.graphhopper.config.Profile>) profileList3);
        java.lang.String str6 = graphHopperConfig1.toString();
        com.graphhopper.GraphHopperConfig graphHopperConfig7 = new com.graphhopper.GraphHopperConfig(graphHopperConfig1);
        com.graphhopper.routing.util.EncodingManager encodingManager8 = null;
        com.graphhopper.config.Profile[] profileArray9 = new com.graphhopper.config.Profile[] {};
        java.util.ArrayList<com.graphhopper.config.Profile> profileList10 = new java.util.ArrayList<com.graphhopper.config.Profile>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.config.Profile>) profileList10, profileArray9);
        com.graphhopper.config.CHProfile[] cHProfileArray12 = new com.graphhopper.config.CHProfile[] {};
        java.util.ArrayList<com.graphhopper.config.CHProfile> cHProfileList13 = new java.util.ArrayList<com.graphhopper.config.CHProfile>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.config.CHProfile>) cHProfileList13, cHProfileArray12);
        com.graphhopper.routing.util.EncodingManager encodingManager15 = null;
        com.graphhopper.config.Profile[] profileArray16 = new com.graphhopper.config.Profile[] {};
        java.util.ArrayList<com.graphhopper.config.Profile> profileList17 = new java.util.ArrayList<com.graphhopper.config.Profile>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.config.Profile>) profileList17, profileArray16);
        com.graphhopper.config.CHProfile[] cHProfileArray19 = new com.graphhopper.config.CHProfile[] {};
        java.util.ArrayList<com.graphhopper.config.CHProfile> cHProfileList20 = new java.util.ArrayList<com.graphhopper.config.CHProfile>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.config.CHProfile>) cHProfileList20, cHProfileArray19);
        com.graphhopper.config.LMProfile[] lMProfileArray22 = new com.graphhopper.config.LMProfile[] {};
        java.util.ArrayList<com.graphhopper.config.LMProfile> lMProfileList23 = new java.util.ArrayList<com.graphhopper.config.LMProfile>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.config.LMProfile>) lMProfileList23, lMProfileArray22);
        com.graphhopper.routing.ProfileResolver profileResolver25 = new com.graphhopper.routing.ProfileResolver(encodingManager15, (java.util.List<com.graphhopper.config.Profile>) profileList17, (java.util.List<com.graphhopper.config.CHProfile>) cHProfileList20, (java.util.List<com.graphhopper.config.LMProfile>) lMProfileList23);
        com.graphhopper.routing.ProfileResolver profileResolver26 = new com.graphhopper.routing.ProfileResolver(encodingManager8, (java.util.List<com.graphhopper.config.Profile>) profileList10, (java.util.List<com.graphhopper.config.CHProfile>) cHProfileList13, (java.util.List<com.graphhopper.config.LMProfile>) lMProfileList23);
        com.graphhopper.GraphHopperConfig graphHopperConfig27 = graphHopperConfig1.setProfiles((java.util.List<com.graphhopper.config.Profile>) profileList10);
        double double30 = graphHopperConfig27.getDouble("bike_network", (double) '#');
        java.lang.String str31 = graphHopperConfig27.toString();
        org.junit.Assert.assertNotNull(profileArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(graphHopperConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "profiles:\nprofiles_ch:\nprofiles_lm:\nproperties:\n" + "'", str6, "profiles:\nprofiles_ch:\nprofiles_lm:\nproperties:\n");
        org.junit.Assert.assertNotNull(profileArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cHProfileArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(profileArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cHProfileArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(lMProfileArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(graphHopperConfig27);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 35.0d + "'", double30 == 35.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "profiles:\nprofiles_ch:\nprofiles_lm:\nproperties:\n" + "'", str31, "profiles:\nprofiles_ch:\nprofiles_lm:\nproperties:\n");
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test891");
        long[] longArray1 = new long[] { 10 };
        com.carrotsearch.hppc.LongHashSet longHashSet2 = com.carrotsearch.hppc.LongHashSet.from(longArray1);
        boolean boolean4 = longHashSet2.add((-1L));
        com.carrotsearch.hppc.LongHashSet longHashSet5 = longHashSet2.clone();
        longHashSet5.ensureCapacity((int) 'a');
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[10]");
        org.junit.Assert.assertNotNull(longHashSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(longHashSet5);
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test892");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder2 = rAMDirectory1.getByteOrder();
        rAMDirectory1.clear();
        boolean boolean4 = rAMDirectory1.isStoring();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage5 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue6 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser7 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue6);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray8 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager9 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray8);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser10 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup11 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue12 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray13 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue12 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList14 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14, encodedValueArray13);
        oSMRoadClassParser10.createEncodedValues(encodedValueLookup11, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        oSMMaxWidthParser7.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager9, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        com.graphhopper.routing.DefaultWeightingFactory defaultWeightingFactory18 = new com.graphhopper.routing.DefaultWeightingFactory(graphHopperStorage5, encodingManager9);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage22 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager9, true, false, (int) (short) 10);
        boolean boolean23 = graphHopperStorage22.isClosed();
        com.graphhopper.storage.TurnCostStorage turnCostStorage24 = graphHopperStorage22.getTurnCostStorage();
        com.graphhopper.storage.Graph graph25 = graphHopperStorage22.getBaseGraph();
        com.graphhopper.routing.weighting.Weighting weighting26 = null;
        com.graphhopper.routing.weighting.Weighting weighting27 = graphHopperStorage22.wrapWeighting(weighting26);
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(decimalEncodedValue6);
        org.junit.Assert.assertNotNull(flagEncoderArray8);
        org.junit.Assert.assertNotNull(encodingManager9);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue12);
        org.junit.Assert.assertNotNull(encodedValueArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(turnCostStorage24);
        org.junit.Assert.assertNotNull(graph25);
        org.junit.Assert.assertNull(weighting27);
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test893");
        com.graphhopper.routing.AStar.AStarEntry aStarEntry4 = new com.graphhopper.routing.AStar.AStarEntry((int) (byte) 100, (int) '4', 6.661798265227327E-11d, 1.236386816348098E10d);
        aStarEntry4.weight = (short) 0;
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test894");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder2 = rAMDirectory1.getByteOrder();
        rAMDirectory1.clear();
        boolean boolean4 = rAMDirectory1.isStoring();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage5 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue6 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser7 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue6);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray8 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager9 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray8);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser10 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup11 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue12 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray13 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue12 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList14 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14, encodedValueArray13);
        oSMRoadClassParser10.createEncodedValues(encodedValueLookup11, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        oSMMaxWidthParser7.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager9, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        com.graphhopper.routing.DefaultWeightingFactory defaultWeightingFactory18 = new com.graphhopper.routing.DefaultWeightingFactory(graphHopperStorage5, encodingManager9);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage22 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager9, true, false, (int) (short) 10);
        com.graphhopper.routing.weighting.Weighting weighting23 = null;
        com.graphhopper.util.PathMerger pathMerger24 = new com.graphhopper.util.PathMerger((com.graphhopper.storage.Graph) graphHopperStorage22, weighting23);
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(decimalEncodedValue6);
        org.junit.Assert.assertNotNull(flagEncoderArray8);
        org.junit.Assert.assertNotNull(encodingManager9);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue12);
        org.junit.Assert.assertNotNull(encodedValueArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test895");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder2 = rAMDirectory1.getByteOrder();
        rAMDirectory1.clear();
        boolean boolean4 = rAMDirectory1.isStoring();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage5 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue6 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser7 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue6);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray8 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager9 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray8);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser10 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup11 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue12 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray13 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue12 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList14 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14, encodedValueArray13);
        oSMRoadClassParser10.createEncodedValues(encodedValueLookup11, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        oSMMaxWidthParser7.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager9, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        com.graphhopper.routing.DefaultWeightingFactory defaultWeightingFactory18 = new com.graphhopper.routing.DefaultWeightingFactory(graphHopperStorage5, encodingManager9);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage22 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager9, true, false, (int) (short) 10);
        boolean boolean23 = graphHopperStorage22.isClosed();
        com.graphhopper.storage.TurnCostStorage turnCostStorage24 = graphHopperStorage22.getTurnCostStorage();
        com.graphhopper.storage.Graph graph25 = graphHopperStorage22.getBaseGraph();
        int int26 = graphHopperStorage22.getNodes();
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(decimalEncodedValue6);
        org.junit.Assert.assertNotNull(flagEncoderArray8);
        org.junit.Assert.assertNotNull(encodingManager9);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue12);
        org.junit.Assert.assertNotNull(encodedValueArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(turnCostStorage24);
        org.junit.Assert.assertNotNull(graph25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test896");
        com.graphhopper.routing.util.parsers.OSMHazmatWaterParser oSMHazmatWaterParser0 = new com.graphhopper.routing.util.parsers.OSMHazmatWaterParser();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray1 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager2 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray1);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser3 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup4 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue5 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray6 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue5 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList7 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList7, encodedValueArray6);
        oSMRoadClassParser3.createEncodedValues(encodedValueLookup4, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList7);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup10 = null;
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser11 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup12 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue13 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray14 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue13 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList15 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList15, encodedValueArray14);
        oSMRoadClassParser11.createEncodedValues(encodedValueLookup12, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList15);
        oSMRoadClassParser3.createEncodedValues(encodedValueLookup10, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList15);
        oSMHazmatWaterParser0.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager2, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList15);
        org.junit.Assert.assertNotNull(flagEncoderArray1);
        org.junit.Assert.assertNotNull(encodingManager2);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue5);
        org.junit.Assert.assertNotNull(encodedValueArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue13);
        org.junit.Assert.assertNotNull(encodedValueArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test897");
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry4 = new com.graphhopper.routing.ch.PrepareCHEntry((-1), (int) '#', (int) (short) 10, 4.003017359204114E7d);
        int int5 = prepareCHEntry4.incEdgeKey;
        int int6 = prepareCHEntry4.prepareEdge;
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry11 = new com.graphhopper.routing.ch.PrepareCHEntry((-1), (int) '#', (int) (short) 10, 4.003017359204114E7d);
        int int12 = prepareCHEntry11.incEdgeKey;
        double double13 = prepareCHEntry11.weight;
        prepareCHEntry11.adjNode = (byte) -1;
        prepareCHEntry4.parent = prepareCHEntry11;
        int int17 = prepareCHEntry11.prepareEdge;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.003017359204114E7d + "'", double13 == 4.003017359204114E7d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test898");
        com.graphhopper.routing.weighting.Weighting weighting0 = null;
        com.graphhopper.util.details.WeightDetails weightDetails1 = new com.graphhopper.util.details.WeightDetails(weighting0);
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue10 = new com.graphhopper.routing.ev.StringEncodedValue("custom", (int) ' ', false);
        int[] intArray13 = new int[] { 100 };
        long[] longArray15 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap16 = com.carrotsearch.hppc.IntLongHashMap.from(intArray13, longArray15);
        int[] intArray18 = new int[] { 100 };
        long[] longArray20 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap21 = com.carrotsearch.hppc.IntLongHashMap.from(intArray18, longArray20);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator22 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray23 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator22 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap24 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray18, edgeIteratorArray23);
        int[] intArray25 = com.graphhopper.util.ArrayUtil.merge(intArray13, intArray18);
        com.graphhopper.storage.IntsRef intsRef28 = new com.graphhopper.storage.IntsRef(intArray13, (int) (short) 0, 0);
        java.lang.String str29 = stringEncodedValue10.getString(true, intsRef28);
        com.graphhopper.util.PointList pointList31 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState33 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(6, 1, (int) (short) 1, 10, (double) ' ', intsRef28, "0000000000000000000000000000001000110000000000000000000000000000000000000000000000000000000000000000", pointList31, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = weightDetails1.isEdgeDifferentToLastEdge((com.graphhopper.util.EdgeIteratorState) virtualEdgeIteratorState33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap21);
        org.junit.Assert.assertNotNull(edgeIteratorArray23);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap24);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100]");
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test899");
        com.carrotsearch.hppc.HashOrderMixingStrategy hashOrderMixingStrategy2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHIntObjectHashMap<com.graphhopper.routing.ev.GetOffBike> getOffBikeGHIntObjectHashMap3 = new com.graphhopper.coll.GHIntObjectHashMap<com.graphhopper.routing.ev.GetOffBike>((int) (short) 0, (double) 1L, hashOrderMixingStrategy2);
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.hppc.BufferAllocationException; message: The load factor should be in range [0.01, 0.99]: 1.000000");
        } catch (com.carrotsearch.hppc.BufferAllocationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test900");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        com.carrotsearch.hppc.IntLongHashMap.KeysContainer keysContainer5 = intLongHashMap4.keys();
        long long8 = intLongHashMap4.indexReplace(0, (long) (short) -1);
        int[] intArray9 = intLongHashMap4.keys;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(keysContainer5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, 0, 0, 0]");
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test901");
        com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.util.shapes.BBox> bBoxGHLongObjectHashMap0 = new com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.util.shapes.BBox>();
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.6871794760227203d, ' ' };
        bBoxGHLongObjectHashMap0.values = objArray3;
        long[] longArray5 = bBoxGHLongObjectHashMap0.keys;
        com.graphhopper.util.BitUtil bitUtil6 = com.graphhopper.util.BitUtil.BIG;
        long long9 = bitUtil6.toLong((int) (byte) 100, 3);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) -1, (byte) 100 };
        bitUtil6.fromInt(byteArray16, (int) '4');
        boolean boolean19 = bBoxGHLongObjectHashMap0.equals((java.lang.Object) byteArray16);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0.6871794760227203,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0.6871794760227203,  ]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(bitUtil6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 429496729603L + "'", long9 == 429496729603L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0, 0, 52, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test902");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.SimpleBooleanEncodedValue simpleBooleanEncodedValue2 = new com.graphhopper.routing.ev.SimpleBooleanEncodedValue("[]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue name wasn't valid: []. Use lower case letters, underscore and numbers only.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test903");
        com.graphhopper.apache.commons.collections.IntFloatBinaryHeap intFloatBinaryHeap0 = new com.graphhopper.apache.commons.collections.IntFloatBinaryHeap();
        long long1 = intFloatBinaryHeap0.getCapacity();
        long long2 = intFloatBinaryHeap0.getCapacity();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = intFloatBinaryHeap0.poll();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Heap is empty. Cannot peek element.");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1001L + "'", long1 == 1001L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1001L + "'", long2 == 1001L);
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test904");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        com.graphhopper.search.StringIndex stringIndex2 = new com.graphhopper.search.StringIndex((com.graphhopper.storage.Directory) rAMDirectory1);
        java.util.Collection<com.graphhopper.storage.DataAccess> dataAccessCollection3 = rAMDirectory1.getAll();
        java.nio.ByteOrder byteOrder4 = rAMDirectory1.getByteOrder();
        org.junit.Assert.assertNotNull(dataAccessCollection3);
        org.junit.Assert.assertNotNull(byteOrder4);
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test905");
        com.graphhopper.coll.GHTBitSet gHTBitSet1 = new com.graphhopper.coll.GHTBitSet(0);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl2 = new com.graphhopper.coll.GHBitSetImpl();
        int int4 = gHBitSetImpl2.previousClearBit(0);
        gHBitSetImpl2.clear();
        int int7 = gHBitSetImpl2.next((int) (short) 0);
        com.graphhopper.coll.GHBitSet gHBitSet8 = gHTBitSet1.copyTo((com.graphhopper.coll.GHBitSet) gHBitSetImpl2);
        gHTBitSet1.add((-885860508));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(gHBitSet8);
    }

    @Test
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test906");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        com.graphhopper.search.StringIndex stringIndex2 = new com.graphhopper.search.StringIndex((com.graphhopper.storage.Directory) rAMDirectory1);
        com.graphhopper.coll.OSMIDMap oSMIDMap4 = new com.graphhopper.coll.OSMIDMap((com.graphhopper.storage.Directory) rAMDirectory1, (int) (byte) 10);
        oSMIDMap4.optimize();
        oSMIDMap4.optimize();
        int int9 = oSMIDMap4.put((long) 6, 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test907");
        com.graphhopper.routing.ev.Surface surface0 = com.graphhopper.routing.ev.Surface.COMPACTED;
        org.junit.Assert.assertTrue("'" + surface0 + "' != '" + com.graphhopper.routing.ev.Surface.COMPACTED + "'", surface0.equals(com.graphhopper.routing.ev.Surface.COMPACTED));
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test908");
        com.graphhopper.storage.IntsRef intsRef5 = com.graphhopper.storage.IntsRef.EMPTY;
        java.lang.String str6 = intsRef5.toString();
        com.graphhopper.util.PointList pointList8 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState10 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState((int) (short) 10, (-4), (-2), 2, (double) (-1), intsRef5, "PLANE_PROJ", pointList8, true);
        int int11 = virtualEdgeIteratorState10.getBaseNode();
        com.graphhopper.util.FetchMode fetchMode12 = com.graphhopper.util.FetchMode.PILLAR_AND_ADJ;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.PointList pointList13 = virtualEdgeIteratorState10.fetchWayGeometry(fetchMode12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intsRef5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertTrue("'" + fetchMode12 + "' != '" + com.graphhopper.util.FetchMode.PILLAR_AND_ADJ + "'", fetchMode12.equals(com.graphhopper.util.FetchMode.PILLAR_AND_ADJ));
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test909");
        com.graphhopper.storage.NodeAccess nodeAccess0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator2 = new com.graphhopper.routing.weighting.BeelineWeightApproximator(nodeAccess0, weighting1);
        com.graphhopper.routing.weighting.BalancedWeightApproximator balancedWeightApproximator3 = new com.graphhopper.routing.weighting.BalancedWeightApproximator((com.graphhopper.routing.weighting.WeightApproximator) beelineWeightApproximator2);
        com.graphhopper.routing.weighting.WeightApproximator weightApproximator4 = balancedWeightApproximator3.getApproximation();
        org.junit.Assert.assertNotNull(weightApproximator4);
    }

    @Test
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test910");
        com.graphhopper.routing.ev.Roundabout roundabout0 = new com.graphhopper.routing.ev.Roundabout();
    }

    @Test
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test911");
        com.graphhopper.storage.IntsRef intsRef0 = com.graphhopper.routing.ev.TurnCost.createFlags();
        int int1 = intsRef0.offset;
        boolean boolean2 = intsRef0.isValid();
        org.junit.Assert.assertNotNull(intsRef0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test912");
        com.graphhopper.storage.RoutingCHGraph routingCHGraph0 = null;
        com.graphhopper.routing.querygraph.QueryGraph queryGraph1 = null;
        com.graphhopper.routing.RoutingAlgorithmFactory routingAlgorithmFactory2 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions3 = null;
        com.graphhopper.routing.FlexiblePathCalculator flexiblePathCalculator4 = new com.graphhopper.routing.FlexiblePathCalculator(queryGraph1, routingAlgorithmFactory2, algorithmOptions3);
        com.graphhopper.routing.weighting.Weighting weighting6 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions7 = new com.graphhopper.routing.AlgorithmOptions("[]", weighting6);
        flexiblePathCalculator4.setAlgoOpts(algorithmOptions7);
        com.graphhopper.util.PMap pMap9 = algorithmOptions7.getHints();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.AlternativeRouteEdgeCH alternativeRouteEdgeCH10 = new com.graphhopper.routing.AlternativeRouteEdgeCH(routingCHGraph0, pMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pMap9);
    }

    @Test
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test913");
        com.graphhopper.routing.ev.TrackType trackType0 = com.graphhopper.routing.ev.TrackType.GRADE3;
        org.junit.Assert.assertTrue("'" + trackType0 + "' != '" + com.graphhopper.routing.ev.TrackType.GRADE3 + "'", trackType0.equals(com.graphhopper.routing.ev.TrackType.GRADE3));
    }

    @Test
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test914");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator5 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray6 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator5 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap7 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray1, edgeIteratorArray6);
        int[] intArray8 = edgeIteratorIntObjectHashMap7.keys;
        int int10 = edgeIteratorIntObjectHashMap7.indexOf(4);
        boolean boolean12 = false; // flaky: edgeIteratorIntObjectHashMap7.indexExists(100);
        java.lang.String str14 = edgeIteratorIntObjectHashMap7.visualizeKeyDistribution((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIterator edgeIterator16 = null; // flaky: edgeIteratorIntObjectHashMap7.indexGet((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(edgeIteratorArray6);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap7);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 100, 0]");
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
// flaky:         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test915");
        com.graphhopper.util.StopWatch stopWatch0 = com.graphhopper.util.StopWatch.started();
        java.lang.String str1 = stopWatch0.getTimeString();
        org.junit.Assert.assertNotNull(stopWatch0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0ns" + "'", str1, "0ns");
    }

    @Test
    public void test916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test916");
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.storage.Graph graph2 = null;
        com.graphhopper.routing.weighting.Weighting weighting3 = null;
        com.graphhopper.routing.util.TraversalMode traversalMode4 = com.graphhopper.routing.util.TraversalMode.EDGE_BASED;
        com.graphhopper.routing.lm.PerfectApproximator perfectApproximator6 = new com.graphhopper.routing.lm.PerfectApproximator(graph2, weighting3, traversalMode4, true);
        com.graphhopper.routing.AlgorithmOptions algorithmOptions7 = new com.graphhopper.routing.AlgorithmOptions("mtb", weighting1, traversalMode4);
        org.junit.Assert.assertTrue("'" + traversalMode4 + "' != '" + com.graphhopper.routing.util.TraversalMode.EDGE_BASED + "'", traversalMode4.equals(com.graphhopper.routing.util.TraversalMode.EDGE_BASED));
    }

    @Test
    public void test917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test917");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap0 = new com.graphhopper.coll.GHIntLongHashMap();
        int[] intArray1 = gHIntLongHashMap0.keys;
        boolean boolean3 = false; // flaky: gHIntLongHashMap0.indexExists(1687814340);
        int[] intArray5 = new int[] { 100 };
        long[] longArray7 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap8 = com.carrotsearch.hppc.IntLongHashMap.from(intArray5, longArray7);
        int[] intArray10 = new int[] { 100 };
        long[] longArray12 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap13 = com.carrotsearch.hppc.IntLongHashMap.from(intArray10, longArray12);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator14 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray15 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator14 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap16 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray10, edgeIteratorArray15);
        int[] intArray17 = com.graphhopper.util.ArrayUtil.merge(intArray5, intArray10);
        com.carrotsearch.hppc.IntHashSet intHashSet18 = com.graphhopper.coll.GHIntHashSet.from(intArray17);
        int[] intArray19 = intHashSet18.toArray();
        com.graphhopper.routing.ev.HazmatTunnel hazmatTunnel20 = com.graphhopper.routing.ev.HazmatTunnel.D;
        boolean boolean21 = intHashSet18.equals((java.lang.Object) hazmatTunnel20);
        boolean boolean23 = intHashSet18.contains(35);
        int int24 = gHIntLongHashMap0.removeAll((com.carrotsearch.hppc.IntContainer) intHashSet18);
        int int26 = intHashSet18.indexOf((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
// flaky:         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap13);
        org.junit.Assert.assertNotNull(edgeIteratorArray15);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100]");
        org.junit.Assert.assertNotNull(intHashSet18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100]");
        org.junit.Assert.assertTrue("'" + hazmatTunnel20 + "' != '" + com.graphhopper.routing.ev.HazmatTunnel.D + "'", hazmatTunnel20.equals(com.graphhopper.routing.ev.HazmatTunnel.D));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-5) + "'", int26 == (-5));
    }

    @Test
    public void test918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test918");
        com.graphhopper.reader.dem.SkadiProvider skadiProvider1 = new com.graphhopper.reader.dem.SkadiProvider("OSM File header:{}");
        com.graphhopper.util.Downloader downloader2 = null;
        skadiProvider1.setDownloader(downloader2);
    }

    @Test
    public void test919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test919");
        com.graphhopper.util.shapes.BBox bBox7 = new com.graphhopper.util.shapes.BBox((double) 1, 0.0d, (double) 0, (double) (-919338616), (double) (short) -1, (double) 0L, false);
        java.util.List<java.lang.Double> doubleList8 = bBox7.toGeoJson();
        org.junit.Assert.assertNotNull(doubleList8);
    }

    @Test
    public void test920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test920");
        org.locationtech.jts.geom.Polygon[] polygonArray0 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList1 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList1, polygonArray0);
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule3 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList1);
        com.graphhopper.routing.ev.RoadClass roadClass4 = com.graphhopper.routing.ev.RoadClass.LIVING_STREET;
        com.graphhopper.routing.util.TransportationMode transportationMode5 = com.graphhopper.routing.util.TransportationMode.CAR;
        double double7 = austriaSpatialRule3.getMaxSpeed(roadClass4, transportationMode5, (double) 1L);
        org.locationtech.jts.geom.Polygon[] polygonArray8 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList9 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList9, polygonArray8);
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule11 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList9);
        org.locationtech.jts.geom.Polygon[] polygonArray12 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList13 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList13, polygonArray12);
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule15 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList13);
        com.graphhopper.routing.util.spatialrules.SpatialRule[] spatialRuleArray16 = new com.graphhopper.routing.util.spatialrules.SpatialRule[] { austriaSpatialRule3, austriaSpatialRule11, austriaSpatialRule15 };
        java.util.ArrayList<com.graphhopper.routing.util.spatialrules.SpatialRule> spatialRuleList17 = new java.util.ArrayList<com.graphhopper.routing.util.spatialrules.SpatialRule>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.util.spatialrules.SpatialRule>) spatialRuleList17, spatialRuleArray16);
        com.graphhopper.routing.util.spatialrules.SpatialRuleSet spatialRuleSet20 = new com.graphhopper.routing.util.spatialrules.SpatialRuleSet((java.util.List<com.graphhopper.routing.util.spatialrules.SpatialRule>) spatialRuleList17, (-4));
        int int21 = spatialRuleSet20.getSpatialId();
        java.lang.String str22 = spatialRuleSet20.toString();
        org.junit.Assert.assertNotNull(polygonArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + roadClass4 + "' != '" + com.graphhopper.routing.ev.RoadClass.LIVING_STREET + "'", roadClass4.equals(com.graphhopper.routing.ev.RoadClass.LIVING_STREET));
        org.junit.Assert.assertTrue("'" + transportationMode5 + "' != '" + com.graphhopper.routing.util.TransportationMode.CAR + "'", transportationMode5.equals(com.graphhopper.routing.util.TransportationMode.CAR));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(polygonArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(polygonArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(spatialRuleArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "SpatialRuleSet [rules=[SpatialRule [getId()=aut, getPriority()=100], SpatialRule [getId()=aut, getPriority()=100], SpatialRule [getId()=aut, getPriority()=100]]]" + "'", str22, "SpatialRuleSet [rules=[SpatialRule [getId()=aut, getPriority()=100], SpatialRule [getId()=aut, getPriority()=100], SpatialRule [getId()=aut, getPriority()=100]]]");
    }

    @Test
    public void test921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test921");
        com.graphhopper.routing.util.parsers.OSMTollParser oSMTollParser0 = new com.graphhopper.routing.util.parsers.OSMTollParser();
        com.graphhopper.storage.IntsRef intsRef1 = com.graphhopper.storage.IntsRef.EMPTY;
        com.graphhopper.storage.IntsRef intsRef2 = com.graphhopper.storage.IntsRef.EMPTY;
        boolean boolean3 = intsRef1.intsEquals(intsRef2);
        com.graphhopper.reader.ReaderWay readerWay5 = new com.graphhopper.reader.ReaderWay((long) (byte) 100);
        com.graphhopper.routing.util.parsers.OSMRoadClassLinkParser oSMRoadClassLinkParser7 = new com.graphhopper.routing.util.parsers.OSMRoadClassLinkParser();
        com.graphhopper.storage.IntsRef intsRef8 = com.graphhopper.storage.IntsRef.EMPTY;
        int int9 = intsRef8.offset;
        com.graphhopper.reader.ReaderWay readerWay11 = new com.graphhopper.reader.ReaderWay((long) (byte) 100);
        com.graphhopper.storage.IntsRef intsRef13 = com.graphhopper.storage.IntsRef.EMPTY;
        com.graphhopper.storage.IntsRef intsRef14 = com.graphhopper.storage.IntsRef.EMPTY;
        boolean boolean15 = intsRef13.intsEquals(intsRef14);
        int int16 = intsRef13.length;
        com.graphhopper.storage.IntsRef intsRef17 = oSMRoadClassLinkParser7.handleWayTags(intsRef8, readerWay11, false, intsRef13);
        com.graphhopper.storage.IntsRef intsRef18 = oSMTollParser0.handleWayTags(intsRef2, readerWay5, false, intsRef13);
        com.graphhopper.storage.IntsRef intsRef19 = com.graphhopper.storage.IntsRef.EMPTY;
        int int20 = intsRef19.offset;
        int[] intArray21 = intsRef19.ints;
        com.graphhopper.routing.util.parsers.OSMRoadClassLinkParser oSMRoadClassLinkParser22 = new com.graphhopper.routing.util.parsers.OSMRoadClassLinkParser();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue23 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser24 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue23);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray25 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager26 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray25);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser27 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup28 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue29 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray30 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue29 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList31 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList31, encodedValueArray30);
        oSMRoadClassParser27.createEncodedValues(encodedValueLookup28, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList31);
        oSMMaxWidthParser24.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager26, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList31);
        java.lang.String str35 = encodingManager26.toFlagEncodersAsString();
        com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser oSMHazmatTunnelParser36 = new com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup37 = null;
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser38 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup39 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue40 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray41 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue40 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList42 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList42, encodedValueArray41);
        oSMRoadClassParser38.createEncodedValues(encodedValueLookup39, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList42);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup45 = null;
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser46 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup47 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue48 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray49 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue48 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList50 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList50, encodedValueArray49);
        oSMRoadClassParser46.createEncodedValues(encodedValueLookup47, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList50);
        oSMRoadClassParser38.createEncodedValues(encodedValueLookup45, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList50);
        oSMHazmatTunnelParser36.createEncodedValues(encodedValueLookup37, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList50);
        oSMRoadClassLinkParser22.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager26, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList50);
        com.graphhopper.storage.IntsRef intsRef56 = com.graphhopper.routing.ev.TurnCost.createFlags();
        int int57 = intsRef56.offset;
        com.graphhopper.reader.ReaderWay readerWay59 = new com.graphhopper.reader.ReaderWay((long) (byte) 10);
        com.graphhopper.routing.util.parsers.OSMRoadClassLinkParser oSMRoadClassLinkParser61 = new com.graphhopper.routing.util.parsers.OSMRoadClassLinkParser();
        com.graphhopper.storage.IntsRef intsRef62 = com.graphhopper.storage.IntsRef.EMPTY;
        int int63 = intsRef62.offset;
        com.graphhopper.reader.ReaderWay readerWay65 = new com.graphhopper.reader.ReaderWay((long) (byte) 100);
        com.graphhopper.storage.IntsRef intsRef67 = com.graphhopper.storage.IntsRef.EMPTY;
        com.graphhopper.storage.IntsRef intsRef68 = com.graphhopper.storage.IntsRef.EMPTY;
        boolean boolean69 = intsRef67.intsEquals(intsRef68);
        int int70 = intsRef67.length;
        com.graphhopper.storage.IntsRef intsRef71 = oSMRoadClassLinkParser61.handleWayTags(intsRef62, readerWay65, false, intsRef67);
        com.graphhopper.storage.IntsRef intsRef72 = oSMRoadClassLinkParser22.handleWayTags(intsRef56, readerWay59, false, intsRef62);
        com.graphhopper.storage.IntsRef intsRef74 = null;
        com.graphhopper.storage.IntsRef intsRef75 = oSMTollParser0.handleWayTags(intsRef19, readerWay59, true, intsRef74);
        org.junit.Assert.assertNotNull(intsRef1);
        org.junit.Assert.assertNotNull(intsRef2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intsRef8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intsRef13);
        org.junit.Assert.assertNotNull(intsRef14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intsRef17);
        org.junit.Assert.assertNotNull(intsRef18);
        org.junit.Assert.assertNotNull(intsRef19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(decimalEncodedValue23);
        org.junit.Assert.assertNotNull(flagEncoderArray25);
        org.junit.Assert.assertNotNull(encodingManager26);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue29);
        org.junit.Assert.assertNotNull(encodedValueArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(countryEnumEncodedValue40);
        org.junit.Assert.assertNotNull(encodedValueArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue48);
        org.junit.Assert.assertNotNull(encodedValueArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(intsRef56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(intsRef62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(intsRef67);
        org.junit.Assert.assertNotNull(intsRef68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(intsRef71);
        org.junit.Assert.assertNotNull(intsRef72);
        org.junit.Assert.assertNotNull(intsRef75);
    }

    @Test
    public void test922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test922");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap1 = new com.graphhopper.coll.GHIntLongHashMap(3);
    }

    @Test
    public void test923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test923");
        com.graphhopper.routing.ch.ShortcutFilter shortcutFilter0 = com.graphhopper.routing.ch.ShortcutFilter.inEdges();
        org.junit.Assert.assertNotNull(shortcutFilter0);
    }

    @Test
    public void test924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test924");
        com.graphhopper.routing.util.FlagEncoder flagEncoder0 = null;
        com.graphhopper.routing.querygraph.QueryGraph queryGraph1 = null;
        com.graphhopper.routing.RoutingAlgorithmFactory routingAlgorithmFactory2 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions3 = null;
        com.graphhopper.routing.FlexiblePathCalculator flexiblePathCalculator4 = new com.graphhopper.routing.FlexiblePathCalculator(queryGraph1, routingAlgorithmFactory2, algorithmOptions3);
        com.graphhopper.routing.weighting.Weighting weighting6 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions7 = new com.graphhopper.routing.AlgorithmOptions("[]", weighting6);
        flexiblePathCalculator4.setAlgoOpts(algorithmOptions7);
        com.graphhopper.util.PMap pMap9 = algorithmOptions7.getHints();
        com.graphhopper.routing.weighting.TurnCostProvider turnCostProvider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.PriorityWeighting priorityWeighting11 = new com.graphhopper.routing.weighting.PriorityWeighting(flagEncoder0, pMap9, turnCostProvider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pMap9);
    }

    @Test
    public void test925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test925");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder2 = rAMDirectory1.getByteOrder();
        rAMDirectory1.clear();
        boolean boolean4 = rAMDirectory1.isStoring();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage5 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue6 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser7 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue6);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray8 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager9 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray8);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser10 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup11 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue12 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray13 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue12 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList14 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14, encodedValueArray13);
        oSMRoadClassParser10.createEncodedValues(encodedValueLookup11, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        oSMMaxWidthParser7.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager9, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        com.graphhopper.routing.DefaultWeightingFactory defaultWeightingFactory18 = new com.graphhopper.routing.DefaultWeightingFactory(graphHopperStorage5, encodingManager9);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage22 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager9, true, false, (int) (short) 10);
        com.graphhopper.routing.util.AllEdgesIterator allEdgesIterator23 = graphHopperStorage22.getAllEdges();
        boolean boolean24 = allEdgesIterator23.next();
        java.util.Set<java.lang.Integer> intSet25 = com.graphhopper.util.GHUtility.getNeighbors((com.graphhopper.util.EdgeIterator) allEdgesIterator23);
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(decimalEncodedValue6);
        org.junit.Assert.assertNotNull(flagEncoderArray8);
        org.junit.Assert.assertNotNull(encodingManager9);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue12);
        org.junit.Assert.assertNotNull(encodedValueArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(allEdgesIterator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(intSet25);
    }

    @Test
    public void test926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test926");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator5 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray6 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator5 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap7 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray1, edgeIteratorArray6);
        int[] intArray8 = edgeIteratorIntObjectHashMap7.keys;
        int int10 = edgeIteratorIntObjectHashMap7.indexOf(4);
        com.graphhopper.util.EdgeIterator edgeIterator12 = edgeIteratorIntObjectHashMap7.get((int) (byte) 1);
        edgeIteratorIntObjectHashMap7.clear();
        int int14 = edgeIteratorIntObjectHashMap7.size();
        java.lang.String str16 = edgeIteratorIntObjectHashMap7.visualizeKeyDistribution(35);
        com.graphhopper.util.EdgeIterator edgeIterator18 = edgeIteratorIntObjectHashMap7.indexGet(0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(edgeIteratorArray6);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0, 0]");
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-3) + "'", int10 == (-3));
        org.junit.Assert.assertNull(edgeIterator12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "....                               " + "'", str16, "....                               ");
        org.junit.Assert.assertNull(edgeIterator18);
    }

    @Test
    public void test927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test927");
        com.graphhopper.util.DistanceCalcEarth distanceCalcEarth0 = new com.graphhopper.util.DistanceCalcEarth();
        double double5 = distanceCalcEarth0.calcNormalizedDist((double) 100L, (double) 1, (double) 0, 1.0d);
        boolean boolean8 = distanceCalcEarth0.isDateLineCrossOver((double) 10L, 3.1415944901905157d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5868240888334652d + "'", double5 == 0.5868240888334652d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test928");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder2 = rAMDirectory1.getByteOrder();
        rAMDirectory1.clear();
        boolean boolean4 = rAMDirectory1.isStoring();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage5 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue6 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser7 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue6);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray8 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager9 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray8);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser10 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup11 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue12 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray13 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue12 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList14 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14, encodedValueArray13);
        oSMRoadClassParser10.createEncodedValues(encodedValueLookup11, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        oSMMaxWidthParser7.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager9, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        com.graphhopper.routing.DefaultWeightingFactory defaultWeightingFactory18 = new com.graphhopper.routing.DefaultWeightingFactory(graphHopperStorage5, encodingManager9);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage22 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager9, true, false, (int) (short) 10);
        boolean boolean23 = graphHopperStorage22.isClosed();
        com.graphhopper.storage.TurnCostStorage turnCostStorage24 = graphHopperStorage22.getTurnCostStorage();
        com.graphhopper.storage.Graph graph25 = graphHopperStorage22.getBaseGraph();
        com.graphhopper.routing.weighting.Weighting weighting26 = null;
        com.graphhopper.routing.util.TraversalMode traversalMode27 = com.graphhopper.routing.util.TraversalMode.EDGE_BASED;
        boolean boolean28 = traversalMode27.isEdgeBased();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.AlternativeRoute alternativeRoute29 = new com.graphhopper.routing.AlternativeRoute(graph25, weighting26, traversalMode27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(decimalEncodedValue6);
        org.junit.Assert.assertNotNull(flagEncoderArray8);
        org.junit.Assert.assertNotNull(encodingManager9);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue12);
        org.junit.Assert.assertNotNull(encodedValueArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(turnCostStorage24);
        org.junit.Assert.assertNotNull(graph25);
        org.junit.Assert.assertTrue("'" + traversalMode27 + "' != '" + com.graphhopper.routing.util.TraversalMode.EDGE_BASED + "'", traversalMode27.equals(com.graphhopper.routing.util.TraversalMode.EDGE_BASED));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test929");
        com.graphhopper.routing.SPTEntry sPTEntry2 = new com.graphhopper.routing.SPTEntry((int) (byte) -1, 10.0d);
        sPTEntry2.weight = (byte) 1;
        com.graphhopper.routing.SPTEntry sPTEntry5 = sPTEntry2.getParent();
        org.junit.Assert.assertNull(sPTEntry5);
    }

    @Test
    public void test930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test930");
        long[] longArray1 = new long[] { 10 };
        com.carrotsearch.hppc.LongHashSet longHashSet2 = com.carrotsearch.hppc.LongHashSet.from(longArray1);
        boolean boolean4 = longHashSet2.add((-1L));
        com.carrotsearch.hppc.LongHashSet longHashSet5 = longHashSet2.clone();
        java.lang.String str6 = longHashSet2.toString();
        longHashSet2.release();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[10]");
        org.junit.Assert.assertNotNull(longHashSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(longHashSet5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[10, -1]" + "'", str6, "[10, -1]");
    }

    @Test
    public void test931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test931");
        com.graphhopper.util.DistancePlaneProjection distancePlaneProjection0 = com.graphhopper.util.DistancePlaneProjection.DIST_PLANE;
        double double2 = distancePlaneProjection0.calcCircumference(0.0d);
        double double4 = distancePlaneProjection0.calcNormalizedDist((double) (short) 0);
        double double9 = distancePlaneProjection0.calcDist((double) 10L, (double) 35L, (double) ' ', 0.0d);
        java.lang.String str10 = distancePlaneProjection0.toString();
        double double12 = distancePlaneProjection0.calcNormalizedDist((double) '4');
        double double19 = distancePlaneProjection0.calcDist3D((double) 35, 0.4317460358142853d, 0.6209609478125566d, (double) 35L, 4.003017359204114E7d, 4380115.099104042d);
        double double26 = distancePlaneProjection0.calcDist3D((double) 52L, (double) 1.0f, (double) 100.0f, (double) 1687814340, 10.0d, 0.6209609478125566d);
        com.graphhopper.util.shapes.BBox bBox30 = distancePlaneProjection0.createBBox((double) (short) -1, (double) '#', 377.34d);
        org.junit.Assert.assertNotNull(distancePlaneProjection0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.003017359204114E7d + "'", double2 == 4.003017359204114E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4380115.099104042d + "'", double9 == 4380115.099104042d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PLANE_PROJ" + "'", str10, "PLANE_PROJ");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.661798265227327E-11d + "'", double12 == 6.661798265227327E-11d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3.6461703979660586E12d + "'", double19 == 3.6461703979660586E12d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.8767638594379812E14d + "'", double26 == 1.8767638594379812E14d);
        org.junit.Assert.assertNotNull(bBox30);
    }

    @Test
    public void test932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test932");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.BIG;
        long long3 = bitUtil0.combineIntsToLong(5, (int) (byte) -1);
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-4294967291L) + "'", long3 == (-4294967291L));
    }

    @Test
    public void test933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test933");
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap0 = new com.graphhopper.coll.GHLongLongHashMap();
        java.lang.String str1 = gHLongLongHashMap0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
    }

    @Test
    public void test934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test934");
        com.graphhopper.storage.IntsRef intsRef1 = null;
        com.graphhopper.util.EdgeIteratorState edgeIteratorState7 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) (byte) 100, intsRef1, (int) (short) -1, (int) (short) 100, (-4), (int) (byte) 0, 3);
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue11 = new com.graphhopper.routing.ev.StringEncodedValue("custom", (int) ' ', false);
        java.lang.String str12 = stringEncodedValue11.getName();
        int int13 = stringEncodedValue11.getVersion();
        int int15 = stringEncodedValue11.indexOf("cgiar");
        com.graphhopper.routing.ev.EncodedValue.InitializerConfig initializerConfig16 = new com.graphhopper.routing.ev.EncodedValue.InitializerConfig();
        int int17 = stringEncodedValue11.init(initializerConfig16);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState19 = edgeIteratorState7.setReverse(stringEncodedValue11, "2 (1) weight: -4.0, incEdge: 0");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorState7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "custom" + "'", str12, "custom");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-885860508) + "'", int13 == (-885860508));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
    }

    @Test
    public void test935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test935");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap0 = new com.graphhopper.coll.GHIntLongHashMap();
        int[] intArray1 = gHIntLongHashMap0.keys;
        boolean boolean3 = false; // flaky: gHIntLongHashMap0.indexExists(1687814340);
        int[] intArray5 = new int[] { 100 };
        long[] longArray7 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap8 = com.carrotsearch.hppc.IntLongHashMap.from(intArray5, longArray7);
        int[] intArray10 = new int[] { 100 };
        long[] longArray12 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap13 = com.carrotsearch.hppc.IntLongHashMap.from(intArray10, longArray12);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator14 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray15 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator14 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap16 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray10, edgeIteratorArray15);
        int[] intArray17 = com.graphhopper.util.ArrayUtil.merge(intArray5, intArray10);
        com.carrotsearch.hppc.IntHashSet intHashSet18 = com.graphhopper.coll.GHIntHashSet.from(intArray17);
        int[] intArray19 = intHashSet18.toArray();
        com.graphhopper.routing.ev.HazmatTunnel hazmatTunnel20 = com.graphhopper.routing.ev.HazmatTunnel.D;
        boolean boolean21 = intHashSet18.equals((java.lang.Object) hazmatTunnel20);
        boolean boolean23 = intHashSet18.contains(35);
        int int24 = gHIntLongHashMap0.removeAll((com.carrotsearch.hppc.IntContainer) intHashSet18);
        boolean boolean25 = intHashSet18.isEmpty();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
// flaky:         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap13);
        org.junit.Assert.assertNotNull(edgeIteratorArray15);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100]");
        org.junit.Assert.assertNotNull(intHashSet18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100]");
        org.junit.Assert.assertTrue("'" + hazmatTunnel20 + "' != '" + com.graphhopper.routing.ev.HazmatTunnel.D + "'", hazmatTunnel20.equals(com.graphhopper.routing.ev.HazmatTunnel.D));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test936");
        com.graphhopper.storage.DAType dAType1 = com.graphhopper.storage.DAType.fromString("hi!");
        org.junit.Assert.assertNotNull(dAType1);
    }

    @Test
    public void test937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test937");
        com.graphhopper.routing.util.EncodingManager.Builder builder0 = com.graphhopper.routing.util.EncodingManager.start();
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue4 = new com.graphhopper.routing.ev.StringEncodedValue("custom", (int) ' ', false);
        int[] intArray7 = new int[] { 100 };
        long[] longArray9 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap10 = com.carrotsearch.hppc.IntLongHashMap.from(intArray7, longArray9);
        int[] intArray12 = new int[] { 100 };
        long[] longArray14 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap15 = com.carrotsearch.hppc.IntLongHashMap.from(intArray12, longArray14);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator16 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray17 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator16 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap18 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray12, edgeIteratorArray17);
        int[] intArray19 = com.graphhopper.util.ArrayUtil.merge(intArray7, intArray12);
        com.graphhopper.storage.IntsRef intsRef22 = new com.graphhopper.storage.IntsRef(intArray7, (int) (short) 0, 0);
        java.lang.String str23 = stringEncodedValue4.getString(true, intsRef22);
        com.graphhopper.routing.util.EncodingManager.Builder builder24 = builder0.add((com.graphhopper.routing.ev.EncodedValue) stringEncodedValue4);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap15);
        org.junit.Assert.assertNotNull(edgeIteratorArray17);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100]");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test938");
        com.graphhopper.reader.OSMTurnRelation.Type type4 = com.graphhopper.reader.OSMTurnRelation.Type.getRestrictionType("");
        com.graphhopper.reader.OSMTurnRelation oSMTurnRelation5 = new com.graphhopper.reader.OSMTurnRelation((long) (byte) 1, (long) (byte) 1, 10L, type4);
        long long6 = oSMTurnRelation5.getOsmIdFrom();
        long long7 = oSMTurnRelation5.getOsmIdFrom();
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED + "'", type4.equals(com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test939");
        com.graphhopper.storage.NodeAccess nodeAccess0 = null;
        com.graphhopper.util.PointList pointList1 = null;
        com.graphhopper.storage.ExtendedNodeAccess extendedNodeAccess3 = new com.graphhopper.storage.ExtendedNodeAccess(nodeAccess0, pointList1, (int) (short) 1);
    }

    @Test
    public void test940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test940");
        com.graphhopper.routing.ev.DefaultEncodedValueFactory defaultEncodedValueFactory0 = new com.graphhopper.routing.ev.DefaultEncodedValueFactory();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.EncodedValue encodedValue2 = defaultEncodedValueFactory0.create("cgiar");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultEncodedValueFactory cannot find EncodedValue cgiar");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test941");
        com.graphhopper.routing.ev.TrackType trackType0 = com.graphhopper.routing.ev.TrackType.GRADE5;
        org.junit.Assert.assertTrue("'" + trackType0 + "' != '" + com.graphhopper.routing.ev.TrackType.GRADE5 + "'", trackType0.equals(com.graphhopper.routing.ev.TrackType.GRADE5));
    }

    @Test
    public void test942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test942");
        com.graphhopper.coll.MinHeapWithUpdate minHeapWithUpdate1 = new com.graphhopper.coll.MinHeapWithUpdate((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            minHeapWithUpdate1.update(5, 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: The heap does not contain: 5. Use the contains method to check this before calling update");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test943");
        com.carrotsearch.hppc.HashOrderMixingStrategy hashOrderMixingStrategy2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHIntObjectHashMap<com.graphhopper.reader.dem.GMTEDProvider> gMTEDProviderGHIntObjectHashMap3 = new com.graphhopper.coll.GHIntObjectHashMap<com.graphhopper.reader.dem.GMTEDProvider>((int) '4', 960.3999999999999d, hashOrderMixingStrategy2);
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.hppc.BufferAllocationException; message: The load factor should be in range [0.01, 0.99]: 960.400000");
        } catch (com.carrotsearch.hppc.BufferAllocationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test944");
        com.graphhopper.util.DistancePlaneProjection distancePlaneProjection0 = new com.graphhopper.util.DistancePlaneProjection();
        com.graphhopper.util.shapes.BBox bBox4 = distancePlaneProjection0.createBBox((double) 35, (double) (-1), (double) 5);
        org.junit.Assert.assertNotNull(bBox4);
    }

    @Test
    public void test945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test945");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder2 = rAMDirectory1.getByteOrder();
        rAMDirectory1.clear();
        boolean boolean4 = rAMDirectory1.isStoring();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage5 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue6 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser7 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue6);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray8 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager9 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray8);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser10 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup11 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue12 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray13 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue12 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList14 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14, encodedValueArray13);
        oSMRoadClassParser10.createEncodedValues(encodedValueLookup11, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        oSMMaxWidthParser7.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager9, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        com.graphhopper.routing.DefaultWeightingFactory defaultWeightingFactory18 = new com.graphhopper.routing.DefaultWeightingFactory(graphHopperStorage5, encodingManager9);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage22 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager9, true, false, (int) (short) 10);
        com.graphhopper.storage.DAType dAType24 = com.graphhopper.storage.DAType.RAM_STORE;
        com.graphhopper.storage.DataAccess dataAccess25 = rAMDirectory1.find("cgiar", dAType24);
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(decimalEncodedValue6);
        org.junit.Assert.assertNotNull(flagEncoderArray8);
        org.junit.Assert.assertNotNull(encodingManager9);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue12);
        org.junit.Assert.assertNotNull(encodedValueArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dAType24);
        org.junit.Assert.assertNotNull(dataAccess25);
    }

    @Test
    public void test946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test946");
        com.graphhopper.routing.util.spatialrules.SpatialRuleFactory spatialRuleFactory0 = com.graphhopper.routing.util.spatialrules.SpatialRuleFactory.EMPTY;
        org.junit.Assert.assertNotNull(spatialRuleFactory0);
    }

    @Test
    public void test947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test947");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl0 = new com.graphhopper.coll.GHBitSetImpl();
        int int2 = gHBitSetImpl0.previousClearBit(0);
        gHBitSetImpl0.clear();
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl4 = new com.graphhopper.coll.GHBitSetImpl();
        int int6 = gHBitSetImpl4.previousClearBit(0);
        gHBitSetImpl4.clear();
        long[] longArray8 = gHBitSetImpl4.toLongArray();
        boolean boolean9 = gHBitSetImpl0.intersects((java.util.BitSet) gHBitSetImpl4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test948");
        long[] longArray0 = new long[] {};
        java.util.BitSet bitSet1 = java.util.BitSet.valueOf(longArray0);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl2 = new com.graphhopper.coll.GHBitSetImpl();
        int int4 = gHBitSetImpl2.previousClearBit(0);
        gHBitSetImpl2.clear();
        boolean boolean7 = gHBitSetImpl2.contains(11);
        bitSet1.andNot((java.util.BitSet) gHBitSetImpl2);
        // The following exception was thrown during execution in test generation
        try {
            gHBitSetImpl2.set((-6), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(bitSet1);
        org.junit.Assert.assertEquals(bitSet1.toString(), "{}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test949");
        com.graphhopper.util.shapes.BBox bBox4 = new com.graphhopper.util.shapes.BBox((double) 10, (double) 35L, (double) 0, (double) (-4));
        bBox4.maxLat = 1.0d;
        bBox4.maxEle = 0.6209609478125566d;
    }

    @Test
    public void test950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test950");
        com.graphhopper.routing.EdgeRestrictions edgeRestrictions0 = new com.graphhopper.routing.EdgeRestrictions();
        int int1 = edgeRestrictions0.getSourceOutEdge();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test951");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator5 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray6 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator5 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap7 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray1, edgeIteratorArray6);
        int[] intArray8 = edgeIteratorIntObjectHashMap7.keys;
        int int10 = edgeIteratorIntObjectHashMap7.indexOf(4);
        int int11 = edgeIteratorIntObjectHashMap7.size();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(edgeIteratorArray6);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap7);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 0, 0, 0]");
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4) + "'", int10 == (-4));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test952");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        com.graphhopper.search.StringIndex stringIndex2 = new com.graphhopper.search.StringIndex((com.graphhopper.storage.Directory) rAMDirectory1);
        stringIndex2.close();
        com.graphhopper.search.StringIndex stringIndex5 = stringIndex2.create(1L);
        stringIndex5.close();
        org.junit.Assert.assertNotNull(stringIndex5);
    }

    @Test
    public void test953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test953");
        com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.util.shapes.BBox> bBoxGHLongObjectHashMap0 = new com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.util.shapes.BBox>();
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.6871794760227203d, ' ' };
        bBoxGHLongObjectHashMap0.values = objArray3;
        long[] longArray5 = bBoxGHLongObjectHashMap0.keys;
        java.lang.Object[] objArray6 = bBoxGHLongObjectHashMap0.values;
        com.graphhopper.util.shapes.BBox bBox12 = new com.graphhopper.util.shapes.BBox((double) 10, (double) 35L, (double) 0, (double) (-4));
        double double13 = bBox12.minLon;
        double double14 = bBox12.minLat;
        com.graphhopper.util.shapes.BBox bBox15 = bBox12.clone();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.shapes.BBox bBox16 = null; // flaky: bBoxGHLongObjectHashMap0.indexReplace((-10), bBox12);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0.6871794760227203,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0.6871794760227203,  ]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.6871794760227203,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.6871794760227203,  ]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(bBox15);
    }

    @Test
    public void test954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test954");
        int int0 = com.graphhopper.routing.ch.PrepareEncoder.getScFwdDir();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test955");
        com.graphhopper.reader.dem.SRTMProvider sRTMProvider1 = new com.graphhopper.reader.dem.SRTMProvider("aut");
    }

    @Test
    public void test956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test956");
        com.graphhopper.storage.DAType dAType0 = com.graphhopper.storage.DAType.RAM;
        com.graphhopper.storage.DAType dAType1 = com.graphhopper.storage.DAType.getPreferredInt(dAType0);
        org.junit.Assert.assertNotNull(dAType0);
        org.junit.Assert.assertNotNull(dAType1);
    }

    @Test
    public void test957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test957");
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue1 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.util.details.BooleanDetails booleanDetails2 = new com.graphhopper.util.details.BooleanDetails("get_off_bike", booleanEncodedValue1);
        com.graphhopper.storage.IntsRef intsRef4 = null;
        com.graphhopper.util.EdgeIteratorState edgeIteratorState10 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) (byte) 100, intsRef4, (int) (short) -1, (int) (short) 100, (-4), (int) (byte) 0, 3);
        boolean boolean11 = booleanDetails2.isEdgeDifferentToLastEdge(edgeIteratorState10);
        java.lang.String str12 = booleanDetails2.toString();
        java.lang.Object obj13 = booleanDetails2.getCurrentValue();
        org.junit.Assert.assertNotNull(booleanEncodedValue1);
        org.junit.Assert.assertNotNull(edgeIteratorState10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "get_off_bike" + "'", str12, "get_off_bike");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
    }

    @Test
    public void test958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test958");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap0 = new com.graphhopper.coll.GHIntLongHashMap();
        int[] intArray1 = gHIntLongHashMap0.keys;
        com.carrotsearch.hppc.LongCollection longCollection2 = gHIntLongHashMap0.values();
        long long5 = gHIntLongHashMap0.addTo(1687814340, (-1L));
        long long8 = gHIntLongHashMap0.getOrDefault((int) (byte) 100, (long) '4');
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap9 = new com.graphhopper.coll.GHIntLongHashMap();
        long long12 = gHIntLongHashMap9.getOrDefault((int) (byte) 10, (long) '#');
        int[] intArray13 = gHIntLongHashMap9.keys;
        long[] longArray14 = gHIntLongHashMap9.values;
        gHIntLongHashMap0.values = longArray14;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1687814340, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(longCollection2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test959");
        com.graphhopper.routing.ch.CHEntry cHEntry4 = new com.graphhopper.routing.ch.CHEntry(3, 0, 2, (-4.0d));
        int int5 = cHEntry4.incEdge;
        com.graphhopper.routing.AStar.AStarEntry aStarEntry10 = new com.graphhopper.routing.AStar.AStarEntry((-2), 11, 150.0d, 2.0015086747773968E7d);
        cHEntry4.parent = aStarEntry10;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test960");
        java.util.Random random0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.tour.MultiPointTour multiPointTour3 = new com.graphhopper.routing.util.tour.MultiPointTour(random0, (double) 1.0f, (-919338616));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test961");
        com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMRoadClassParser> oSMRoadClassParserGHObjectIntHashMap0 = new com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMRoadClassParser>();
        com.carrotsearch.hppc.ObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMRoadClassParser> oSMRoadClassParserObjectIntHashMap1 = oSMRoadClassParserGHObjectIntHashMap0.clone();
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser2 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        int int4 = oSMRoadClassParserGHObjectIntHashMap0.getOrDefault(oSMRoadClassParser2, (int) (byte) 1);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser5 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup6 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue7 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray8 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue7 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList9 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList9, encodedValueArray8);
        oSMRoadClassParser5.createEncodedValues(encodedValueLookup6, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList9);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup12 = null;
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser13 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup14 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue15 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray16 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue15 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList17 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList17, encodedValueArray16);
        oSMRoadClassParser13.createEncodedValues(encodedValueLookup14, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList17);
        oSMRoadClassParser5.createEncodedValues(encodedValueLookup12, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList17);
        int int21 = oSMRoadClassParserGHObjectIntHashMap0.remove(oSMRoadClassParser5);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser22 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup23 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue24 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray25 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue24 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList26 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList26, encodedValueArray25);
        oSMRoadClassParser22.createEncodedValues(encodedValueLookup23, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList26);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup29 = null;
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser30 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup31 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue32 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray33 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue32 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList34 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList34, encodedValueArray33);
        oSMRoadClassParser30.createEncodedValues(encodedValueLookup31, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList34);
        oSMRoadClassParser22.createEncodedValues(encodedValueLookup29, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList34);
        int int38 = oSMRoadClassParserGHObjectIntHashMap0.get(oSMRoadClassParser22);
        org.junit.Assert.assertNotNull(oSMRoadClassParserObjectIntHashMap1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue7);
        org.junit.Assert.assertNotNull(encodedValueArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue15);
        org.junit.Assert.assertNotNull(encodedValueArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue24);
        org.junit.Assert.assertNotNull(encodedValueArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue32);
        org.junit.Assert.assertNotNull(encodedValueArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test962");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap0 = new com.graphhopper.coll.GHIntLongHashMap();
        int[] intArray1 = gHIntLongHashMap0.keys;
        boolean boolean3 = false; // flaky: gHIntLongHashMap0.indexExists(1687814340);
        int[] intArray5 = new int[] { 100 };
        long[] longArray7 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap8 = com.carrotsearch.hppc.IntLongHashMap.from(intArray5, longArray7);
        int[] intArray10 = new int[] { 100 };
        long[] longArray12 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap13 = com.carrotsearch.hppc.IntLongHashMap.from(intArray10, longArray12);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator14 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray15 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator14 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap16 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray10, edgeIteratorArray15);
        int[] intArray17 = com.graphhopper.util.ArrayUtil.merge(intArray5, intArray10);
        com.carrotsearch.hppc.IntHashSet intHashSet18 = com.graphhopper.coll.GHIntHashSet.from(intArray17);
        int[] intArray19 = intHashSet18.toArray();
        com.graphhopper.routing.ev.HazmatTunnel hazmatTunnel20 = com.graphhopper.routing.ev.HazmatTunnel.D;
        boolean boolean21 = intHashSet18.equals((java.lang.Object) hazmatTunnel20);
        boolean boolean23 = intHashSet18.contains(35);
        int int24 = gHIntLongHashMap0.removeAll((com.carrotsearch.hppc.IntContainer) intHashSet18);
        int[] intArray25 = intHashSet18.toArray();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
// flaky:         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap13);
        org.junit.Assert.assertNotNull(edgeIteratorArray15);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100]");
        org.junit.Assert.assertNotNull(intHashSet18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100]");
        org.junit.Assert.assertTrue("'" + hazmatTunnel20 + "' != '" + com.graphhopper.routing.ev.HazmatTunnel.D + "'", hazmatTunnel20.equals(com.graphhopper.routing.ev.HazmatTunnel.D));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100]");
    }

    @Test
    public void test963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test963");
        com.graphhopper.reader.dem.SRTMGL1Provider sRTMGL1Provider0 = new com.graphhopper.reader.dem.SRTMGL1Provider();
        java.lang.String str1 = sRTMGL1Provider0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "srtmgl1" + "'", str1, "srtmgl1");
    }

    @Test
    public void test964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test964");
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue4 = new com.graphhopper.routing.ev.StringEncodedValue("custom", (int) ' ', false);
        java.lang.String str5 = stringEncodedValue4.getName();
        com.graphhopper.util.details.StringDetails stringDetails6 = new com.graphhopper.util.details.StringDetails("prepare.ch.edge.witness_search.min_max_settled_edges", stringEncodedValue4);
        com.graphhopper.storage.IntsRef intsRef8 = null;
        com.graphhopper.util.EdgeIteratorState edgeIteratorState9 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 7, intsRef8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = stringDetails6.isEdgeDifferentToLastEdge(edgeIteratorState9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "custom" + "'", str5, "custom");
        org.junit.Assert.assertNotNull(edgeIteratorState9);
    }

    @Test
    public void test965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test965");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder2 = rAMDirectory1.getByteOrder();
        rAMDirectory1.clear();
        boolean boolean4 = rAMDirectory1.isStoring();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage5 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue6 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser7 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue6);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray8 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager9 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray8);
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser10 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup11 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue12 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray13 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue12 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList14 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14, encodedValueArray13);
        oSMRoadClassParser10.createEncodedValues(encodedValueLookup11, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        oSMMaxWidthParser7.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager9, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        com.graphhopper.routing.DefaultWeightingFactory defaultWeightingFactory18 = new com.graphhopper.routing.DefaultWeightingFactory(graphHopperStorage5, encodingManager9);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage22 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager9, true, false, (int) (short) 10);
        boolean boolean23 = graphHopperStorage22.isClosed();
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue25 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.util.details.BooleanDetails booleanDetails26 = new com.graphhopper.util.details.BooleanDetails("get_off_bike", booleanEncodedValue25);
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter27 = com.graphhopper.routing.util.DefaultEdgeFilter.outEdges(booleanEncodedValue25);
        com.graphhopper.util.EdgeExplorer edgeExplorer28 = graphHopperStorage22.createEdgeExplorer((com.graphhopper.routing.util.EdgeFilter) defaultEdgeFilter27);
        com.graphhopper.storage.Graph graph29 = graphHopperStorage22.getBaseGraph();
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue30 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter31 = com.graphhopper.routing.util.DefaultEdgeFilter.inEdges(booleanEncodedValue30);
        boolean boolean33 = defaultEdgeFilter31.equals((java.lang.Object) "mtb");
        boolean boolean35 = defaultEdgeFilter31.equals((java.lang.Object) "car4wd");
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser36 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup37 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue38 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray39 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue38 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList40 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList40, encodedValueArray39);
        oSMRoadClassParser36.createEncodedValues(encodedValueLookup37, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList40);
        boolean boolean43 = defaultEdgeFilter31.equals((java.lang.Object) oSMRoadClassParser36);
        com.graphhopper.routing.subnetwork.TarjanSCC.ConnectedComponents connectedComponents45 = com.graphhopper.routing.subnetwork.TarjanSCC.findComponents((com.graphhopper.storage.Graph) graphHopperStorage22, (com.graphhopper.routing.util.EdgeFilter) defaultEdgeFilter31, true);
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(decimalEncodedValue6);
        org.junit.Assert.assertNotNull(flagEncoderArray8);
        org.junit.Assert.assertNotNull(encodingManager9);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue12);
        org.junit.Assert.assertNotNull(encodedValueArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(booleanEncodedValue25);
        org.junit.Assert.assertNotNull(defaultEdgeFilter27);
        org.junit.Assert.assertNotNull(edgeExplorer28);
        org.junit.Assert.assertNotNull(graph29);
        org.junit.Assert.assertNotNull(booleanEncodedValue30);
        org.junit.Assert.assertNotNull(defaultEdgeFilter31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue38);
        org.junit.Assert.assertNotNull(encodedValueArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(connectedComponents45);
    }

    @Test
    public void test966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test966");
        com.graphhopper.reader.dem.CGIARProvider cGIARProvider1 = new com.graphhopper.reader.dem.CGIARProvider("country");
        cGIARProvider1.setInterpolate(false);
        cGIARProvider1.setInterpolate(true);
        double double8 = cGIARProvider1.getEle((double) (-2), 18.42059311345597d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 292.0d + "'", double8 == 292.0d);
    }
}
