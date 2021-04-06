import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        com.graphhopper.routing.AlgorithmOptions.Builder builder0 = new com.graphhopper.routing.AlgorithmOptions.Builder();
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.AlgorithmOptions.Builder builder2 = builder0.weighting(weighting1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.graphhopper.util.shapes.BBox bBox4 = new com.graphhopper.util.shapes.BBox((double) 0L, (double) (short) 0, (double) (byte) 1, 100.0d);
        double double5 = bBox4.minLat;
        bBox4.minEle = 20;
        com.graphhopper.util.shapes.BBox bBox8 = bBox4.clone();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(bBox8);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue2 = com.graphhopper.routing.ev.TurnCost.create("hike", (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxTurnCosts cannot be negative -4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry4 = new com.graphhopper.routing.ch.PrepareCHEntry(0, (int) (byte) -1, (-1), 0.0d);
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry9 = new com.graphhopper.routing.ch.PrepareCHEntry(0, (int) (byte) -1, (-1), 0.0d);
        prepareCHEntry4.parent = prepareCHEntry9;
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry11 = prepareCHEntry9.getParent();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = prepareCHEntry11.adjNode;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(prepareCHEntry11);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.graphhopper.util.DistanceCalcEarth distanceCalcEarth0 = new com.graphhopper.util.DistanceCalcEarth();
        boolean boolean7 = distanceCalcEarth0.validEdgeDistance((double) 10.0f, 2.711340206185567d, 100.0d, (double) 1.0f, (double) (short) 0, (double) 4294967306L);
        java.lang.String str8 = distanceCalcEarth0.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EXACT" + "'", str8, "EXACT");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.graphhopper.reader.dem.MultiSourceElevationProvider multiSourceElevationProvider0 = new com.graphhopper.reader.dem.MultiSourceElevationProvider();
        double double3 = multiSourceElevationProvider0.getEle(Double.POSITIVE_INFINITY, (double) 100L);
        double double6 = multiSourceElevationProvider0.getEle((double) 1048576, (double) (-1.0f));
        com.graphhopper.storage.DAType dAType7 = null;
        com.graphhopper.reader.dem.ElevationProvider elevationProvider8 = multiSourceElevationProvider0.setDAType(dAType7);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.dem.ElevationProvider elevationProvider10 = multiSourceElevationProvider0.setBaseURL("srtm");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The base url must consist of two urls separated by a ';'. The first for cgiar, the second for gmted");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(elevationProvider8);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.graphhopper.storage.RAMDirectory rAMDirectory2 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory3 = rAMDirectory2.create();
        java.nio.ByteOrder byteOrder4 = rAMDirectory2.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess6 = rAMDirectory2.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory7 = rAMDirectory2.create();
        com.graphhopper.reader.PillarInfo pillarInfo8 = new com.graphhopper.reader.PillarInfo(true, directory7);
        double double10 = pillarInfo8.getEle((int) (short) 0);
        org.junit.Assert.assertNotNull(directory3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertNotNull(dataAccess6);
        org.junit.Assert.assertNotNull(directory7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.lang.String str0 = com.graphhopper.routing.ev.RoadClassLink.KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "road_class_link" + "'", str0, "road_class_link");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.storage.CHConfig cHConfig2 = com.graphhopper.storage.CHConfig.edgeBased("foot_network", weighting1);
        com.graphhopper.routing.util.TraversalMode traversalMode3 = cHConfig2.getTraversalMode();
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType4 = com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH;
        java.util.Calendar calendar5 = com.graphhopper.reader.osm.conditional.DateRangeParser.createCalendar();
        com.graphhopper.reader.osm.conditional.ParsedCalendar parsedCalendar6 = new com.graphhopper.reader.osm.conditional.ParsedCalendar(parseType4, calendar5);
        boolean boolean7 = cHConfig2.equals((java.lang.Object) parsedCalendar6);
        org.junit.Assert.assertNotNull(cHConfig2);
        org.junit.Assert.assertTrue("'" + traversalMode3 + "' != '" + com.graphhopper.routing.util.TraversalMode.EDGE_BASED + "'", traversalMode3.equals(com.graphhopper.routing.util.TraversalMode.EDGE_BASED));
        org.junit.Assert.assertTrue("'" + parseType4 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH + "'", parseType4.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH));
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1617669676784,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=96,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=41,SECOND=16,MILLISECOND=784,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.graphhopper.storage.IntsRef intsRef7 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState13 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef7, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int14 = edgeIteratorState13.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue15 = com.graphhopper.routing.ev.Country.create();
        boolean boolean16 = countryEnumEncodedValue15.isStoreTwoDirections();
        com.graphhopper.routing.ev.Country country17 = edgeIteratorState13.getReverse(countryEnumEncodedValue15);
        com.graphhopper.storage.IntsRef intsRef25 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean26 = intsRef25.isEmpty();
        com.graphhopper.util.PointList pointList28 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState30 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef25, "hike_rating", pointList28, false);
        int int31 = countryEnumEncodedValue15.getInt(true, intsRef25);
        com.graphhopper.util.PointList pointList33 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState35 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState((int) (byte) 1, (int) ' ', 1, 0, 0.0d, intsRef25, "prepare.ch.edge.witness_search.reset_interval", pointList33, false);
        com.graphhopper.storage.IntsRef intsRef42 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean43 = intsRef42.isEmpty();
        com.graphhopper.util.PointList pointList45 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState47 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef42, "hike_rating", pointList45, false);
        com.graphhopper.storage.IntsRef intsRef50 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState56 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef50, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int57 = edgeIteratorState56.getEdge();
        virtualEdgeIteratorState47.setReverseEdge(edgeIteratorState56);
        com.graphhopper.storage.IntsRef intsRef65 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean66 = intsRef65.isEmpty();
        com.graphhopper.util.PointList pointList68 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState70 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef65, "hike_rating", pointList68, false);
        virtualEdgeIteratorState70.setUnfavored(true);
        int int73 = virtualEdgeIteratorState70.getOriginalEdgeKey();
        int int74 = virtualEdgeIteratorState70.getAdjNode();
        int int75 = virtualEdgeIteratorState70.getAdjNode();
        double double76 = virtualEdgeIteratorState70.getDistance();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue77 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        double double78 = virtualEdgeIteratorState70.getReverse(decimalEncodedValue77);
        double double79 = virtualEdgeIteratorState47.getReverse(decimalEncodedValue77);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState81 = virtualEdgeIteratorState35.set(decimalEncodedValue77, (double) 200L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Call init before usage for EncodedValue max_axle_load|version=-1916217613|bits=7|index=0|shift=-1|store_both_directions=false");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorState13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + country17 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country17.equals(com.graphhopper.routing.ev.Country.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1048576 + "'", int73 == 1048576);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 52.0d + "'", double76 == 52.0d);
        org.junit.Assert.assertNotNull(decimalEncodedValue77);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + Double.POSITIVE_INFINITY + "'", double78 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + Double.POSITIVE_INFINITY + "'", double79 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.graphhopper.storage.DAType dAType0 = com.graphhopper.storage.DAType.MMAP;
        boolean boolean1 = dAType0.isAllowWrites();
        org.junit.Assert.assertNotNull(dAType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        int[] intArray0 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet1 = com.graphhopper.coll.GHIntHashSet.from(intArray0);
        int int2 = intHashSet1.size();
        boolean boolean4 = intHashSet1.contains((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intHashSet1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.graphhopper.util.shapes.BBox bBox4 = new com.graphhopper.util.shapes.BBox((double) 0L, (double) (short) 0, (double) (byte) 1, 100.0d);
        double double5 = bBox4.minLat;
        bBox4.minEle = 20;
        double double8 = bBox4.minLon;
        double double9 = bBox4.minLon;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.graphhopper.routing.DirectionResolverResult directionResolverResult2 = com.graphhopper.routing.DirectionResolverResult.onlyLeft((int) (byte) 0, (int) '#');
        boolean boolean3 = directionResolverResult2.isImpossible();
        int int4 = directionResolverResult2.getInEdgeRight();
        int int5 = directionResolverResult2.getOutEdgeLeft();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = com.graphhopper.routing.DirectionResolverResult.getInEdge(directionResolverResult2, "................                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for 'curbside : ................                   '. allowed: left, right, any");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directionResolverResult2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        int int1 = com.graphhopper.util.GHUtility.reverseEdgeKey(96);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.graphhopper.GraphHopper graphHopper0 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        com.graphhopper.GraphHopper graphHopper2 = graphHopper0.setFlagEncoderFactory(flagEncoderFactory1);
        com.graphhopper.reader.dem.MultiSourceElevationProvider multiSourceElevationProvider3 = new com.graphhopper.reader.dem.MultiSourceElevationProvider();
        double double6 = multiSourceElevationProvider3.getEle((double) 0.0f, 0.0d);
        com.graphhopper.GraphHopper graphHopper7 = graphHopper0.setElevationProvider((com.graphhopper.reader.dem.ElevationProvider) multiSourceElevationProvider3);
        multiSourceElevationProvider3.release();
        org.junit.Assert.assertNotNull(graphHopper2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(graphHopper7);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        java.util.List<com.graphhopper.util.EdgeIteratorState> edgeIteratorStateList24 = path21.calcEdges();
        path21.addEdge(0);
        com.graphhopper.routing.Path path28 = path21.setEndNode(4);
        com.graphhopper.routing.Path path30 = path21.setFromNode(17);
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
        org.junit.Assert.assertNotNull(edgeIteratorStateList24);
        org.junit.Assert.assertNotNull(path28);
        org.junit.Assert.assertNotNull(path30);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        com.graphhopper.storage.CHGraph cHGraph22 = graphHopperStorage20.getCHGraph("[0 0 0 0 0 0 0 0 0 0]");
        com.graphhopper.routing.util.AllEdgesIterator allEdgesIterator23 = graphHopperStorage20.getAllEdges();
        com.graphhopper.storage.StorableProperties storableProperties24 = graphHopperStorage20.getProperties();
        com.graphhopper.routing.util.FlagEncoder flagEncoder25 = null;
        com.graphhopper.util.GHUtility.printGraphForUnitTest((com.graphhopper.storage.Graph) graphHopperStorage20, flagEncoder25);
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
        org.junit.Assert.assertNull(cHGraph22);
        org.junit.Assert.assertNotNull(allEdgesIterator23);
        org.junit.Assert.assertNotNull(storableProperties24);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.graphhopper.storage.RoutingCHGraph routingCHGraph0 = null;
        com.graphhopper.routing.ch.CHRoutingAlgorithmFactory cHRoutingAlgorithmFactory1 = new com.graphhopper.routing.ch.CHRoutingAlgorithmFactory(routingCHGraph0);
        com.graphhopper.storage.RAMDirectory rAMDirectory3 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory4 = rAMDirectory3.create();
        java.nio.ByteOrder byteOrder5 = rAMDirectory3.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray6 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager7 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray6);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage9 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory3, encodingManager7, false);
        java.util.List<com.graphhopper.storage.CHConfig> cHConfigList10 = graphHopperStorage9.getCHConfigs();
        com.graphhopper.storage.index.LocationIndex locationIndex11 = null;
        com.graphhopper.util.shapes.GHPoint[] gHPointArray12 = new com.graphhopper.util.shapes.GHPoint[] {};
        java.util.ArrayList<com.graphhopper.util.shapes.GHPoint> gHPointList13 = new java.util.ArrayList<com.graphhopper.util.shapes.GHPoint>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.util.shapes.GHPoint>) gHPointList13, gHPointArray12);
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile16 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str17 = customProfile16.toString();
        com.graphhopper.config.Profile profile20 = customProfile16.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.util.PMap pMap21 = profile20.getHints();
        com.graphhopper.routing.weighting.Weighting weighting22 = null;
        com.graphhopper.routing.util.FiniteWeightFilter finiteWeightFilter23 = new com.graphhopper.routing.util.FiniteWeightFilter(weighting22);
        com.graphhopper.storage.GraphEdgeIdFinder.BlockArea blockArea24 = com.graphhopper.storage.GraphEdgeIdFinder.createBlockArea((com.graphhopper.storage.Graph) graphHopperStorage9, locationIndex11, (java.util.List<com.graphhopper.util.shapes.GHPoint>) gHPointList13, pMap21, (com.graphhopper.routing.util.EdgeFilter) finiteWeightFilter23);
        com.graphhopper.GraphHopperConfig graphHopperConfig25 = new com.graphhopper.GraphHopperConfig(pMap21);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.BidirRoutingAlgorithm bidirRoutingAlgorithm26 = cHRoutingAlgorithmFactory1.createAlgo(pMap21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory4);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertNotNull(flagEncoderArray6);
        org.junit.Assert.assertNotNull(encodingManager7);
        org.junit.Assert.assertNotNull(cHConfigList10);
        org.junit.Assert.assertNotNull(gHPointArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str17, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile20);
        org.junit.Assert.assertNotNull(pMap21);
        org.junit.Assert.assertNotNull(blockArea24);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.graphhopper.reader.dem.GMTEDProvider gMTEDProvider0 = new com.graphhopper.reader.dem.GMTEDProvider();
        com.graphhopper.reader.dem.ElevationProvider elevationProvider2 = gMTEDProvider0.setBaseURL("bike$turn_cost");
        java.lang.String str3 = gMTEDProvider0.toString();
        org.junit.Assert.assertNotNull(elevationProvider2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gmted" + "'", str3, "gmted");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue> encodedValueGHObjectIntHashMap0 = new com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue>();
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.graphhopper.routing.AlternativeRouteEdgeCH.PotentialAlternativeInfo potentialAlternativeInfo0 = new com.graphhopper.routing.AlternativeRouteEdgeCH.PotentialAlternativeInfo();
        potentialAlternativeInfo0.v = '#';
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        int[] intArray0 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet1 = com.graphhopper.coll.GHIntHashSet.from(intArray0);
        int int2 = intHashSet1.size();
        boolean boolean4 = intHashSet1.remove((int) (short) -1);
        boolean boolean6 = intHashSet1.add((-4));
        int int7 = intHashSet1.size();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intHashSet1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.graphhopper.storage.VLongStorage vLongStorage1 = new com.graphhopper.storage.VLongStorage((int) '4');
        long long2 = vLongStorage1.readVLong();
        long long3 = vLongStorage1.getLength();
        long long4 = vLongStorage1.getLength();
        vLongStorage1.trimToSize();
        byte[] byteArray6 = vLongStorage1.getBytes();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0]");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.graphhopper.routing.ev.SimpleBooleanEncodedValue simpleBooleanEncodedValue2 = new com.graphhopper.routing.ev.SimpleBooleanEncodedValue("srtm");
        com.graphhopper.util.details.BooleanDetails booleanDetails3 = new com.graphhopper.util.details.BooleanDetails("....      ", (com.graphhopper.routing.ev.BooleanEncodedValue) simpleBooleanEncodedValue2);
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue6 = new com.graphhopper.routing.ev.StringEncodedValue("bike_network", 10);
        java.util.List<java.lang.String> strList7 = stringEncodedValue6.getValues();
        com.graphhopper.routing.util.parsers.OSMGetOffBikeParser oSMGetOffBikeParser8 = new com.graphhopper.routing.util.parsers.OSMGetOffBikeParser((com.graphhopper.routing.ev.BooleanEncodedValue) simpleBooleanEncodedValue2, strList7);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray0 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager1 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray0);
        java.lang.String str2 = encodingManager1.toFlagEncodersAsString();
        boolean boolean4 = encodingManager1.hasEncodedValue("name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        java.util.List<com.graphhopper.routing.ev.BooleanEncodedValue> booleanEncodedValueList6 = encodingManager1.getAccessEncFromNodeFlags((long) (byte) 10);
        com.graphhopper.storage.GraphBuilder graphBuilder7 = new com.graphhopper.storage.GraphBuilder(encodingManager1);
        org.junit.Assert.assertNotNull(flagEncoderArray0);
        org.junit.Assert.assertNotNull(encodingManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(booleanEncodedValueList6);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap3 = new com.graphhopper.coll.OSMIDMap(directory2);
        com.graphhopper.storage.StorableProperties storableProperties4 = new com.graphhopper.storage.StorableProperties(directory2);
        boolean boolean5 = storableProperties4.loadExisting();
        com.graphhopper.routing.ev.Country country7 = com.graphhopper.routing.ev.Country.AUT;
        java.lang.String str8 = country7.toString();
        com.graphhopper.storage.StorableProperties storableProperties9 = storableProperties4.put("multi", (java.lang.Object) str8);
        boolean boolean10 = storableProperties9.isClosed();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + country7 + "' != '" + com.graphhopper.routing.ev.Country.AUT + "'", country7.equals(com.graphhopper.routing.ev.Country.AUT));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "aut" + "'", str8, "aut");
        org.junit.Assert.assertNotNull(storableProperties9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue1 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.routing.util.parsers.OSMRoundaboutParser oSMRoundaboutParser2 = new com.graphhopper.routing.util.parsers.OSMRoundaboutParser(booleanEncodedValue1);
        com.graphhopper.util.details.BooleanDetails booleanDetails3 = new com.graphhopper.util.details.BooleanDetails("road_class_link", booleanEncodedValue1);
        org.junit.Assert.assertNotNull(booleanEncodedValue1);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.nio.LongBuffer longBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.BitSet bitSet1 = java.util.BitSet.valueOf(longBuffer0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.graphhopper.util.Downloader downloader1 = new com.graphhopper.util.Downloader("");
        com.graphhopper.util.Downloader downloader3 = downloader1.setReferrer("yes");
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection5 = downloader1.createConnection("prepare.ch.node.original_edge_count_weight/properties");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: prepare.ch.node.original_edge_count_weight/properties");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(downloader3);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.graphhopper.coll.GHSortedCollection gHSortedCollection0 = new com.graphhopper.coll.GHSortedCollection();
        int int1 = gHSortedCollection0.getSlidingMeanValue();
        java.lang.String str2 = gHSortedCollection0.toString();
        // The following exception was thrown during execution in test generation
        try {
            gHSortedCollection0.update(96, 35, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: cannot remove key 96 with value 35 - did you insert 96,35 before?");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "size=0, treeMap.size=0, averageNo=NaN, minNo=2147483647, maxNo=-2147483648" + "'", str2, "size=0, treeMap.size=0, averageNo=NaN, minNo=2147483647, maxNo=-2147483648");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.graphhopper.util.DistancePlaneProjection distancePlaneProjection0 = com.graphhopper.util.DistancePlaneProjection.DIST_PLANE;
        double double7 = distancePlaneProjection0.calcDist3D(4.0024076802712575E7d, 0.0d, 100.0d, (double) 100, (double) (byte) 10, 4.0024076802712575E7d);
        org.junit.Assert.assertNotNull(distancePlaneProjection0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.450463164781178E12d + "'", double7 == 4.450463164781178E12d);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl0 = new com.graphhopper.coll.GHBitSetImpl();
        com.graphhopper.coll.GHTBitSet gHTBitSet2 = new com.graphhopper.coll.GHTBitSet(0);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl4 = new com.graphhopper.coll.GHBitSetImpl((int) (short) 100);
        com.graphhopper.coll.GHBitSet gHBitSet5 = gHTBitSet2.copyTo((com.graphhopper.coll.GHBitSet) gHBitSetImpl4);
        com.graphhopper.coll.GHBitSet gHBitSet6 = gHBitSetImpl0.copyTo(gHBitSet5);
        int int8 = gHBitSetImpl0.next((int) 'a');
        org.junit.Assert.assertNotNull(gHBitSet5);
        org.junit.Assert.assertNotNull(gHBitSet6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.graphhopper.util.AngleCalc angleCalc0 = new com.graphhopper.util.AngleCalc();
        boolean boolean7 = angleCalc0.isClockwise(4.450463164781178E12d, (double) 0, (double) 2L, (double) 'a', (double) 3L, 4.003017359204114E7d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap3 = new com.graphhopper.coll.OSMIDMap(directory2);
        com.graphhopper.search.StringIndex stringIndex5 = new com.graphhopper.search.StringIndex(directory2, 10);
        boolean boolean6 = stringIndex5.isClosed();
        long long7 = stringIndex5.getCapacity();
        boolean boolean8 = stringIndex5.loadExisting();
        stringIndex5.close();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.graphhopper.util.shapes.Polygon polygon0 = null;
        com.graphhopper.util.details.EdgeIdDetails edgeIdDetails1 = new com.graphhopper.util.details.EdgeIdDetails();
        com.graphhopper.storage.IntsRef intsRef8 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean9 = intsRef8.isEmpty();
        com.graphhopper.util.PointList pointList11 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState13 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef8, "hike_rating", pointList11, false);
        com.graphhopper.storage.IntsRef intsRef16 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState22 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef16, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int23 = edgeIteratorState22.getEdge();
        virtualEdgeIteratorState13.setReverseEdge(edgeIteratorState22);
        com.graphhopper.storage.IntsRef intsRef31 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean32 = intsRef31.isEmpty();
        com.graphhopper.util.PointList pointList34 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState36 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef31, "hike_rating", pointList34, false);
        virtualEdgeIteratorState36.setUnfavored(true);
        int int39 = virtualEdgeIteratorState36.getOriginalEdgeKey();
        int int40 = virtualEdgeIteratorState36.getAdjNode();
        int int41 = virtualEdgeIteratorState36.getAdjNode();
        double double42 = virtualEdgeIteratorState36.getDistance();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue43 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        double double44 = virtualEdgeIteratorState36.getReverse(decimalEncodedValue43);
        double double45 = virtualEdgeIteratorState13.getReverse(decimalEncodedValue43);
        boolean boolean46 = edgeIdDetails1.isEdgeDifferentToLastEdge((com.graphhopper.util.EdgeIteratorState) virtualEdgeIteratorState13);
        com.graphhopper.util.details.DistanceDetails distanceDetails47 = new com.graphhopper.util.details.DistanceDetails();
        com.graphhopper.storage.IntsRef intsRef54 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean55 = intsRef54.isEmpty();
        com.graphhopper.util.PointList pointList57 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState59 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef54, "hike_rating", pointList57, false);
        com.graphhopper.storage.IntsRef intsRef62 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState68 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef62, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int69 = edgeIteratorState68.getEdge();
        virtualEdgeIteratorState59.setReverseEdge(edgeIteratorState68);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue71 = com.graphhopper.routing.ev.MaxSpeed.create();
        double double72 = virtualEdgeIteratorState59.get(decimalEncodedValue71);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState74 = virtualEdgeIteratorState59.setDistance((double) 35.0f);
        boolean boolean75 = distanceDetails47.isEdgeDifferentToLastEdge(edgeIteratorState74);
        boolean boolean76 = edgeIdDetails1.isEdgeDifferentToLastEdge(edgeIteratorState74);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean77 = com.graphhopper.routing.weighting.custom.CustomWeightingHelper.in(polygon0, edgeIteratorState74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1048576 + "'", int39 == 1048576);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 52.0d + "'", double42 == 52.0d);
        org.junit.Assert.assertNotNull(decimalEncodedValue43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + Double.POSITIVE_INFINITY + "'", double44 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + Double.POSITIVE_INFINITY + "'", double45 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(decimalEncodedValue71);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + Double.POSITIVE_INFINITY + "'", double72 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(edgeIteratorState74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue0 = com.graphhopper.routing.ev.Country.create();
        boolean boolean1 = countryEnumEncodedValue0.isStoreTwoDirections();
        com.graphhopper.storage.RAMDirectory rAMDirectory3 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory4 = rAMDirectory3.create();
        java.nio.ByteOrder byteOrder5 = rAMDirectory3.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess7 = rAMDirectory3.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory8 = rAMDirectory3.create();
        long[] longArray14 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet15 = com.carrotsearch.hppc.LongHashSet.from(longArray14);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray16 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager17 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray16);
        com.graphhopper.storage.GraphBuilder graphBuilder18 = new com.graphhopper.storage.GraphBuilder(encodingManager17);
        boolean boolean19 = longHashSet15.equals((java.lang.Object) encodingManager17);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage22 = new com.graphhopper.storage.GraphHopperStorage(directory8, encodingManager17, false, true);
        com.graphhopper.routing.Path path23 = new com.graphhopper.routing.Path((com.graphhopper.storage.Graph) graphHopperStorage22);
        com.graphhopper.routing.util.EncodingManager encodingManager24 = graphHopperStorage22.getEncodingManager();
        boolean boolean25 = countryEnumEncodedValue0.equals((java.lang.Object) graphHopperStorage22);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(directory4);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertNotNull(dataAccess7);
        org.junit.Assert.assertNotNull(directory8);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet15);
        org.junit.Assert.assertNotNull(flagEncoderArray16);
        org.junit.Assert.assertNotNull(encodingManager17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(encodingManager24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.graphhopper.routing.AStar.AStarEntry aStarEntry4 = new com.graphhopper.routing.AStar.AStarEntry(0, 11, (double) 52L, 1.6672976447024059E7d);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        com.graphhopper.storage.IntsRef intsRef14 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState20 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef14, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int21 = edgeIteratorState20.getEdge();
        virtualEdgeIteratorState11.setReverseEdge(edgeIteratorState20);
        com.graphhopper.storage.IntsRef intsRef29 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean30 = intsRef29.isEmpty();
        com.graphhopper.util.PointList pointList32 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState34 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef29, "hike_rating", pointList32, false);
        virtualEdgeIteratorState34.setUnfavored(true);
        int int37 = virtualEdgeIteratorState34.getOriginalEdgeKey();
        int int38 = virtualEdgeIteratorState34.getAdjNode();
        int int39 = virtualEdgeIteratorState34.getAdjNode();
        double double40 = virtualEdgeIteratorState34.getDistance();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue41 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        double double42 = virtualEdgeIteratorState34.getReverse(decimalEncodedValue41);
        double double43 = virtualEdgeIteratorState11.getReverse(decimalEncodedValue41);
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue46 = new com.graphhopper.routing.ev.StringEncodedValue("bike_network", 10);
        com.graphhopper.storage.IntsRef intsRef49 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean50 = intsRef49.isEmpty();
        com.graphhopper.storage.IntsRef intsRef52 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int53 = intsRef49.compareTo(intsRef52);
        java.lang.String str54 = stringEncodedValue46.getString(false, intsRef52);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState56 = virtualEdgeIteratorState11.setReverse(stringEncodedValue46, "country|version=1687814340|bits=2|index=0|shift=-1|store_both_directions=false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: EncodedValue bike_network not initialized");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1048576 + "'", int37 == 1048576);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 52.0d + "'", double40 == 52.0d);
        org.junit.Assert.assertNotNull(decimalEncodedValue41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + Double.POSITIVE_INFINITY + "'", double42 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + Double.POSITIVE_INFINITY + "'", double43 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        boolean boolean0 = com.graphhopper.util.Constants.MAC_OS_X;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        java.lang.String str27 = edgeIteratorState26.getName();
        com.graphhopper.storage.IntsRef intsRef30 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState36 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef30, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int37 = edgeIteratorState36.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue38 = com.graphhopper.routing.ev.Country.create();
        boolean boolean39 = countryEnumEncodedValue38.isStoreTwoDirections();
        com.graphhopper.routing.ev.Country country40 = edgeIteratorState36.getReverse(countryEnumEncodedValue38);
        com.graphhopper.storage.IntsRef intsRef48 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean49 = intsRef48.isEmpty();
        com.graphhopper.util.PointList pointList51 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState53 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef48, "hike_rating", pointList51, false);
        int int54 = countryEnumEncodedValue38.getInt(true, intsRef48);
        int int55 = countryEnumEncodedValue38.getMaxInt();
        com.graphhopper.routing.ev.Country country56 = edgeIteratorState26.get(countryEnumEncodedValue38);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(decimalEncodedValue23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + Double.POSITIVE_INFINITY + "'", double24 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(edgeIteratorState26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hike_rating" + "'", str27, "hike_rating");
        org.junit.Assert.assertNotNull(edgeIteratorState36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + country40 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country40.equals(com.graphhopper.routing.ev.Country.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + country56 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country56.equals(com.graphhopper.routing.ev.Country.DEFAULT));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph> cHPreparationGraphGHLongObjectHashMap0 = new com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph>();
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph4 = com.graphhopper.routing.ch.CHPreparationGraph.nodeBased(0, (int) (short) 100);
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph5 = cHPreparationGraphGHLongObjectHashMap0.put(0L, cHPreparationGraph4);
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph7 = cHPreparationGraphGHLongObjectHashMap0.indexGet(11);
        org.junit.Assert.assertNotNull(cHPreparationGraph4);
        org.junit.Assert.assertNull(cHPreparationGraph5);
        org.junit.Assert.assertNull(cHPreparationGraph7);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap0 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>();
        com.carrotsearch.hppc.IntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableIntObjectHashMap1 = strComparableGHIntObjectHashMap0.clone();
        int[] intArray2 = strComparableGHIntObjectHashMap0.keys;
        boolean boolean5 = strComparableGHIntObjectHashMap0.putIfAbsent(0, (java.lang.Comparable<java.lang.String>) "road_class_link");
        org.junit.Assert.assertNotNull(strComparableIntObjectHashMap1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue> encodedValueGHObjectIntHashMap1 = new com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue>((int) (byte) 100);
        int int2 = encodedValueGHObjectIntHashMap1.size();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue3 = com.graphhopper.routing.ev.Country.create();
        boolean boolean4 = countryEnumEncodedValue3.isStoreTwoDirections();
        int int6 = encodedValueGHObjectIntHashMap1.put((com.graphhopper.routing.ev.EncodedValue) countryEnumEncodedValue3, 20);
        int int8 = encodedValueGHObjectIntHashMap1.indexGet((int) (short) 100);
        java.lang.String str9 = encodedValueGHObjectIntHashMap1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[country|version=1687814340|bits=2|index=0|shift=-1|store_both_directions=false=>20]" + "'", str9, "[country|version=1687814340|bits=2|index=0|shift=-1|store_both_directions=false=>20]");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.graphhopper.storage.RAMDirectory rAMDirectory2 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory3 = rAMDirectory2.create();
        java.nio.ByteOrder byteOrder4 = rAMDirectory2.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess6 = rAMDirectory2.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.DataAccess dataAccess8 = rAMDirectory2.find("bike_network");
        com.graphhopper.reader.dem.SkadiProvider skadiProvider10 = new com.graphhopper.reader.dem.SkadiProvider();
        skadiProvider10.release();
        com.graphhopper.storage.RAMDirectory rAMDirectory13 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory14 = rAMDirectory13.create();
        com.graphhopper.storage.DAType dAType15 = rAMDirectory13.getDefaultType();
        com.graphhopper.storage.DAType dAType17 = com.graphhopper.storage.DAType.RAM_INT_STORE;
        com.graphhopper.storage.Directory directory18 = rAMDirectory13.put("", dAType17);
        boolean boolean19 = dAType17.isMMap();
        com.graphhopper.reader.dem.ElevationProvider elevationProvider20 = skadiProvider10.setDAType(dAType17);
        com.graphhopper.storage.DataAccess dataAccess21 = rAMDirectory2.find("........                                                                                                                                                                                                ", dAType17);
        com.graphhopper.storage.GHDirectory gHDirectory22 = new com.graphhopper.storage.GHDirectory("_network", dAType17);
        org.junit.Assert.assertNotNull(directory3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertNotNull(dataAccess6);
        org.junit.Assert.assertNotNull(dataAccess8);
        org.junit.Assert.assertNotNull(directory14);
        org.junit.Assert.assertNotNull(dAType15);
        org.junit.Assert.assertNotNull(dAType17);
        org.junit.Assert.assertNotNull(directory18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elevationProvider20);
        org.junit.Assert.assertNotNull(dataAccess21);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry4 = new com.graphhopper.routing.ch.PrepareCHEntry(0, (int) (byte) -1, (-1), 0.0d);
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry9 = new com.graphhopper.routing.ch.PrepareCHEntry(0, (int) (byte) -1, (-1), 0.0d);
        prepareCHEntry4.parent = prepareCHEntry9;
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry15 = new com.graphhopper.routing.ch.PrepareCHEntry(0, (int) (byte) -1, (-1), 0.0d);
        int int16 = prepareCHEntry15.adjNode;
        prepareCHEntry9.parent = prepareCHEntry15;
        double double18 = prepareCHEntry15.weight;
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        int int1 = com.graphhopper.routing.subnetwork.EdgeBasedTarjanSCC.getEdgeFromKey((-4));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue1 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.util.details.IntDetails intDetails2 = new com.graphhopper.util.details.IntDetails("foot", (com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue1);
        com.graphhopper.storage.IntsRef intsRef9 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean10 = intsRef9.isEmpty();
        com.graphhopper.util.PointList pointList12 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState14 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef9, "hike_rating", pointList12, false);
        com.graphhopper.storage.IntsRef intsRef17 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState23 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef17, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int24 = edgeIteratorState23.getEdge();
        virtualEdgeIteratorState14.setReverseEdge(edgeIteratorState23);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue26 = com.graphhopper.routing.ev.MaxSpeed.create();
        double double27 = virtualEdgeIteratorState14.get(decimalEncodedValue26);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState29 = virtualEdgeIteratorState14.setDistance((double) 35.0f);
        boolean boolean30 = intDetails2.isEdgeDifferentToLastEdge((com.graphhopper.util.EdgeIteratorState) virtualEdgeIteratorState14);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue31 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.storage.IntsRef intsRef35 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        java.lang.String str36 = intsRef35.toString();
        com.graphhopper.util.EdgeIteratorState edgeIteratorState37 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 100L, intsRef35);
        double double38 = decimalEncodedValue31.getDecimal(true, intsRef35);
        double double39 = virtualEdgeIteratorState14.get(decimalEncodedValue31);
        com.graphhopper.routing.util.parsers.OSMMaxLengthParser oSMMaxLengthParser40 = new com.graphhopper.routing.util.parsers.OSMMaxLengthParser(decimalEncodedValue31);
        double double41 = decimalEncodedValue31.getMaxDecimal();
        org.junit.Assert.assertNotNull(countryEnumEncodedValue1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(decimalEncodedValue26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + Double.POSITIVE_INFINITY + "'", double27 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(edgeIteratorState29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(decimalEncodedValue31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[0 0 0 0 0 0 0 0 0 0]" + "'", str36, "[0 0 0 0 0 0 0 0 0 0]");
        org.junit.Assert.assertNotNull(edgeIteratorState37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + Double.POSITIVE_INFINITY + "'", double38 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + Double.POSITIVE_INFINITY + "'", double39 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue> encodedValueGHObjectIntHashMap1 = new com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue>((int) (byte) 100);
        int int2 = encodedValueGHObjectIntHashMap1.size();
        java.lang.Object[] objArray3 = encodedValueGHObjectIntHashMap1.keys;
        java.util.Iterator<com.carrotsearch.hppc.cursors.ObjectIntCursor<com.graphhopper.routing.ev.EncodedValue>> encodedValueObjectIntCursorItor4 = encodedValueGHObjectIntHashMap1.iterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(encodedValueObjectIntCursorItor4);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl1 = new com.graphhopper.coll.GHBitSetImpl((int) (short) 100);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl2 = new com.graphhopper.coll.GHBitSetImpl();
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl3 = new com.graphhopper.coll.GHBitSetImpl();
        gHBitSetImpl3.remove((int) (short) 10);
        gHBitSetImpl3.clear();
        int int7 = gHBitSetImpl3.getCardinality();
        com.graphhopper.coll.GHBitSet gHBitSet8 = gHBitSetImpl2.copyTo((com.graphhopper.coll.GHBitSet) gHBitSetImpl3);
        gHBitSetImpl1.andNot((java.util.BitSet) gHBitSetImpl3);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl10 = new com.graphhopper.coll.GHBitSetImpl();
        gHBitSetImpl10.remove((int) (short) 10);
        gHBitSetImpl10.clear();
        int int14 = gHBitSetImpl10.getCardinality();
        gHBitSetImpl10.clear();
        gHBitSetImpl1.and((java.util.BitSet) gHBitSetImpl10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(gHBitSet8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.graphhopper.reader.ReaderNode readerNode3 = new com.graphhopper.reader.ReaderNode((long) 200, (double) 0.0f, (double) 3L);
        com.graphhopper.storage.IntsRef intsRef7 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState13 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef7, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        readerNode3.setTag("5,17,4,4,5,7", (java.lang.Object) (byte) 100);
        boolean boolean15 = readerNode3.hasTags();
        org.junit.Assert.assertNotNull(edgeIteratorState13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager5, false);
        java.util.List<java.lang.String> strList8 = graphHopperStorage7.getCHGraphNames();
        graphHopperStorage7.close();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(flagEncoderArray4);
        org.junit.Assert.assertNotNull(encodingManager5);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.graphhopper.routing.RoutingAlgorithmFactorySimple routingAlgorithmFactorySimple0 = new com.graphhopper.routing.RoutingAlgorithmFactorySimple();
        com.graphhopper.storage.RAMDirectory rAMDirectory2 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory3 = rAMDirectory2.create();
        java.nio.ByteOrder byteOrder4 = rAMDirectory2.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess6 = rAMDirectory2.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory7 = rAMDirectory2.create();
        long[] longArray13 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet14 = com.carrotsearch.hppc.LongHashSet.from(longArray13);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray15 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager16 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray15);
        com.graphhopper.storage.GraphBuilder graphBuilder17 = new com.graphhopper.storage.GraphBuilder(encodingManager16);
        boolean boolean18 = longHashSet14.equals((java.lang.Object) encodingManager16);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage21 = new com.graphhopper.storage.GraphHopperStorage(directory7, encodingManager16, false, true);
        com.graphhopper.routing.Path path22 = new com.graphhopper.routing.Path((com.graphhopper.storage.Graph) graphHopperStorage21);
        com.graphhopper.routing.util.EncodingManager encodingManager23 = graphHopperStorage21.getEncodingManager();
        com.graphhopper.routing.weighting.Weighting weighting25 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions26 = new com.graphhopper.routing.AlgorithmOptions("", weighting25);
        java.lang.String str27 = algorithmOptions26.getAlgorithm();
        boolean boolean28 = algorithmOptions26.hasWeighting();
        boolean boolean29 = algorithmOptions26.hasWeighting();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.RoutingAlgorithm routingAlgorithm30 = routingAlgorithmFactorySimple0.createAlgo((com.graphhopper.storage.Graph) graphHopperStorage21, algorithmOptions26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Option 'weighting' must NOT be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertNotNull(dataAccess6);
        org.junit.Assert.assertNotNull(directory7);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet14);
        org.junit.Assert.assertNotNull(flagEncoderArray15);
        org.junit.Assert.assertNotNull(encodingManager16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(encodingManager23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        double double1 = com.graphhopper.routing.util.parsers.helpers.OSMValueExtractor.stringToTons("[country|version=1687814340|bits=2|index=0|shift=-1|store_both_directions=false=>20]");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.graphhopper.coll.GHLongObjectHashMap<java.lang.reflect.AnnotatedElement> annotatedElementGHLongObjectHashMap0 = new com.graphhopper.coll.GHLongObjectHashMap<java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.graphhopper.storage.RAMDirectory rAMDirectory2 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory3 = rAMDirectory2.create();
        java.nio.ByteOrder byteOrder4 = rAMDirectory2.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray5 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager6 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray5);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage8 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory2, encodingManager6, false);
        java.util.List<com.graphhopper.storage.CHConfig> cHConfigList9 = graphHopperStorage8.getCHConfigs();
        com.graphhopper.storage.index.LocationIndex locationIndex10 = null;
        com.graphhopper.util.shapes.GHPoint[] gHPointArray11 = new com.graphhopper.util.shapes.GHPoint[] {};
        java.util.ArrayList<com.graphhopper.util.shapes.GHPoint> gHPointList12 = new java.util.ArrayList<com.graphhopper.util.shapes.GHPoint>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.util.shapes.GHPoint>) gHPointList12, gHPointArray11);
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile15 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str16 = customProfile15.toString();
        com.graphhopper.config.Profile profile19 = customProfile15.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.util.PMap pMap20 = profile19.getHints();
        com.graphhopper.routing.weighting.Weighting weighting21 = null;
        com.graphhopper.routing.util.FiniteWeightFilter finiteWeightFilter22 = new com.graphhopper.routing.util.FiniteWeightFilter(weighting21);
        com.graphhopper.storage.GraphEdgeIdFinder.BlockArea blockArea23 = com.graphhopper.storage.GraphEdgeIdFinder.createBlockArea((com.graphhopper.storage.Graph) graphHopperStorage8, locationIndex10, (java.util.List<com.graphhopper.util.shapes.GHPoint>) gHPointList12, pMap20, (com.graphhopper.routing.util.EdgeFilter) finiteWeightFilter22);
        com.graphhopper.routing.weighting.Weighting weighting24 = null;
        com.graphhopper.storage.RAMDirectory rAMDirectory26 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory27 = rAMDirectory26.create();
        java.nio.ByteOrder byteOrder28 = rAMDirectory26.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess30 = rAMDirectory26.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory31 = rAMDirectory26.create();
        long[] longArray37 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet38 = com.carrotsearch.hppc.LongHashSet.from(longArray37);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray39 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager40 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray39);
        com.graphhopper.storage.GraphBuilder graphBuilder41 = new com.graphhopper.storage.GraphBuilder(encodingManager40);
        boolean boolean42 = longHashSet38.equals((java.lang.Object) encodingManager40);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage45 = new com.graphhopper.storage.GraphHopperStorage(directory31, encodingManager40, false, true);
        com.graphhopper.routing.Path path46 = new com.graphhopper.routing.Path((com.graphhopper.storage.Graph) graphHopperStorage45);
        com.graphhopper.routing.util.EncodingManager encodingManager47 = graphHopperStorage45.getEncodingManager();
        com.graphhopper.storage.NodeAccess nodeAccess48 = graphHopperStorage45.getNodeAccess();
        com.graphhopper.routing.weighting.WeightApproximator weightApproximator49 = com.graphhopper.routing.RoutingAlgorithmFactorySimple.getApproximation("mtb", pMap20, weighting24, nodeAccess48);
        org.junit.Assert.assertNotNull(directory3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertNotNull(flagEncoderArray5);
        org.junit.Assert.assertNotNull(encodingManager6);
        org.junit.Assert.assertNotNull(cHConfigList9);
        org.junit.Assert.assertNotNull(gHPointArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str16, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile19);
        org.junit.Assert.assertNotNull(pMap20);
        org.junit.Assert.assertNotNull(blockArea23);
        org.junit.Assert.assertNotNull(directory27);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertNotNull(dataAccess30);
        org.junit.Assert.assertNotNull(directory31);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet38);
        org.junit.Assert.assertNotNull(flagEncoderArray39);
        org.junit.Assert.assertNotNull(encodingManager40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(encodingManager47);
        org.junit.Assert.assertNotNull(nodeAccess48);
        org.junit.Assert.assertNotNull(weightApproximator49);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.graphhopper.routing.ev.RoadAccess roadAccess0 = com.graphhopper.routing.ev.RoadAccess.OTHER;
        org.junit.Assert.assertTrue("'" + roadAccess0 + "' != '" + com.graphhopper.routing.ev.RoadAccess.OTHER + "'", roadAccess0.equals(com.graphhopper.routing.ev.RoadAccess.OTHER));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue53 = new com.graphhopper.routing.ev.StringEncodedValue("bike_network", 10);
        com.graphhopper.storage.IntsRef intsRef56 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean57 = intsRef56.isEmpty();
        com.graphhopper.storage.IntsRef intsRef59 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int60 = intsRef56.compareTo(intsRef59);
        java.lang.String str61 = stringEncodedValue53.getString(false, intsRef59);
        com.graphhopper.routing.util.parsers.OSMMtbRatingParser oSMMtbRatingParser62 = new com.graphhopper.routing.util.parsers.OSMMtbRatingParser();
        com.graphhopper.storage.IntsRef intsRef64 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean65 = intsRef64.isEmpty();
        com.graphhopper.storage.IntsRef intsRef67 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int68 = intsRef64.compareTo(intsRef67);
        boolean boolean69 = intsRef64.isValid();
        int[] intArray70 = intsRef64.ints;
        com.graphhopper.reader.ReaderWay readerWay72 = new com.graphhopper.reader.ReaderWay((long) 0);
        com.graphhopper.storage.IntsRef intsRef75 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean76 = intsRef75.isEmpty();
        com.graphhopper.storage.IntsRef intsRef78 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int79 = intsRef75.compareTo(intsRef78);
        boolean boolean81 = intsRef78.equals((java.lang.Object) (short) 0);
        boolean boolean82 = intsRef78.isValid();
        com.graphhopper.storage.IntsRef intsRef83 = oSMMtbRatingParser62.handleWayTags(intsRef64, readerWay72, false, intsRef78);
        com.graphhopper.storage.IntsRef intsRef86 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean87 = intsRef86.isEmpty();
        com.graphhopper.storage.IntsRef intsRef88 = oSMRoundaboutParser1.handleWayTags(intsRef59, readerWay72, true, intsRef86);
        com.graphhopper.storage.IntsRef intsRef89 = com.graphhopper.storage.IntsRef.deepCopyOf(intsRef88);
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(intsRef83);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(intsRef88);
        org.junit.Assert.assertNotNull(intsRef89);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.graphhopper.util.shapes.BBox bBox4 = com.graphhopper.util.shapes.BBox.fromPoints((double) (-1909399913), (double) 0L, (double) 10, 1.0d);
        double double5 = bBox4.minEle;
        org.junit.Assert.assertNotNull(bBox4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType0 = com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH;
        java.util.Calendar calendar1 = null;
        com.graphhopper.reader.osm.conditional.ParsedCalendar parsedCalendar2 = new com.graphhopper.reader.osm.conditional.ParsedCalendar(parseType0, calendar1);
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType3 = parsedCalendar2.parseType;
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType4 = parsedCalendar2.parseType;
        org.junit.Assert.assertTrue("'" + parseType0 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH + "'", parseType0.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH));
        org.junit.Assert.assertTrue("'" + parseType3 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH + "'", parseType3.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH));
        org.junit.Assert.assertTrue("'" + parseType4 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH + "'", parseType4.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH));
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.LITTLE;
        java.lang.String str2 = bitUtil0.toBitString((long) (-4));
        byte[] byteArray4 = bitUtil0.fromBitString("_network");
        com.graphhopper.util.BitUtil bitUtil5 = com.graphhopper.util.BitUtil.LITTLE;
        java.lang.String str7 = bitUtil5.toBitString((long) (-4));
        byte[] byteArray9 = bitUtil5.fromBitString("_network");
        // The following exception was thrown during execution in test generation
        try {
            short short10 = bitUtil0.toShort(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111100" + "'", str2, "1111111111111111111111111111111111111111111111111111111111111100");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
        org.junit.Assert.assertNotNull(bitUtil5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111100" + "'", str7, "1111111111111111111111111111111111111111111111111111111111111100");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1]");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.graphhopper.GraphHopper graphHopper0 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        com.graphhopper.GraphHopper graphHopper2 = graphHopper0.setFlagEncoderFactory(flagEncoderFactory1);
        com.graphhopper.routing.lm.LMPreparationHandler lMPreparationHandler3 = graphHopper0.getLMPreparationHandler();
        lMPreparationHandler3.setPreparationThreads(1687814340);
        com.graphhopper.routing.lm.LMConfig lMConfig6 = null;
        com.graphhopper.routing.lm.LMPreparationHandler lMPreparationHandler7 = lMPreparationHandler3.addLMConfig(lMConfig6);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.lm.PrepareLandmarks prepareLandmarks9 = lMPreparationHandler7.getPreparation("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No LM preparations added yet");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphHopper2);
        org.junit.Assert.assertNotNull(lMPreparationHandler3);
        org.junit.Assert.assertNotNull(lMPreparationHandler7);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.graphhopper.routing.util.parsers.OSMRoadAccessParser oSMRoadAccessParser0 = new com.graphhopper.routing.util.parsers.OSMRoadAccessParser();
        com.graphhopper.storage.RAMDirectory rAMDirectory2 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory3 = rAMDirectory2.create();
        java.nio.ByteOrder byteOrder4 = rAMDirectory2.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray5 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager6 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray5);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage8 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory2, encodingManager6, false);
        com.graphhopper.storage.CHGraph cHGraph10 = graphHopperStorage8.getCHGraph("bike_network");
        com.graphhopper.routing.weighting.Weighting weighting11 = null;
        com.graphhopper.routing.weighting.Weighting weighting12 = graphHopperStorage8.wrapWeighting(weighting11);
        com.graphhopper.routing.util.EncodingManager encodingManager13 = graphHopperStorage8.getEncodingManager();
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue14 = null;
        com.graphhopper.routing.util.parsers.OSMRoundaboutParser oSMRoundaboutParser15 = new com.graphhopper.routing.util.parsers.OSMRoundaboutParser(booleanEncodedValue14);
        com.graphhopper.storage.RAMDirectory rAMDirectory17 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory18 = rAMDirectory17.create();
        java.nio.ByteOrder byteOrder19 = rAMDirectory17.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray20 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager21 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray20);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage23 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory17, encodingManager21, false);
        com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser oSMHazmatTunnelParser24 = new com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray25 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager26 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray25);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue27 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue28 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray29 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue27, decimalEncodedValue28 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList30 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList30, encodedValueArray29);
        oSMHazmatTunnelParser24.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager26, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList30);
        com.graphhopper.storage.RAMDirectory rAMDirectory34 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory35 = rAMDirectory34.create();
        java.nio.ByteOrder byteOrder36 = rAMDirectory34.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray37 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager38 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray37);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage40 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory34, encodingManager38, false);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue42 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.util.details.IntDetails intDetails43 = new com.graphhopper.util.details.IntDetails("foot", (com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue42);
        com.graphhopper.routing.ev.IntEncodedValue intEncodedValue44 = com.graphhopper.routing.ev.HorseRating.create();
        com.graphhopper.storage.IntsRef intsRef47 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState53 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef47, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue54 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        double double55 = edgeIteratorState53.getReverse(decimalEncodedValue54);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue56 = com.graphhopper.routing.ev.Country.create();
        boolean boolean57 = countryEnumEncodedValue56.isStoreTwoDirections();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue58 = com.graphhopper.routing.ev.Country.create();
        boolean boolean59 = countryEnumEncodedValue58.isStoreTwoDirections();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray60 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue42, intEncodedValue44, decimalEncodedValue54, countryEnumEncodedValue56, countryEnumEncodedValue58 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList61 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList61, encodedValueArray60);
        oSMHazmatTunnelParser24.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager38, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList61);
        oSMRoundaboutParser15.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager21, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList61);
        oSMRoadAccessParser0.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager13, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList61);
        org.junit.Assert.assertNotNull(directory3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertNotNull(flagEncoderArray5);
        org.junit.Assert.assertNotNull(encodingManager6);
        org.junit.Assert.assertNull(cHGraph10);
        org.junit.Assert.assertNull(weighting12);
        org.junit.Assert.assertNotNull(encodingManager13);
        org.junit.Assert.assertNotNull(directory18);
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertNotNull(flagEncoderArray20);
        org.junit.Assert.assertNotNull(encodingManager21);
        org.junit.Assert.assertNotNull(flagEncoderArray25);
        org.junit.Assert.assertNotNull(encodingManager26);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue27);
        org.junit.Assert.assertNotNull(decimalEncodedValue28);
        org.junit.Assert.assertNotNull(encodedValueArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(directory35);
        org.junit.Assert.assertNotNull(byteOrder36);
        org.junit.Assert.assertNotNull(flagEncoderArray37);
        org.junit.Assert.assertNotNull(encodingManager38);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue42);
        org.junit.Assert.assertNotNull(intEncodedValue44);
        org.junit.Assert.assertNotNull(edgeIteratorState53);
        org.junit.Assert.assertNotNull(decimalEncodedValue54);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + Double.POSITIVE_INFINITY + "'", double55 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(encodedValueArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry4 = new com.graphhopper.routing.ch.PrepareCHEntry(0, (int) (byte) -1, (-1), 0.0d);
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry9 = new com.graphhopper.routing.ch.PrepareCHEntry(0, (int) (byte) -1, (-1), 0.0d);
        prepareCHEntry4.parent = prepareCHEntry9;
        prepareCHEntry9.weight = (-1);
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry17 = new com.graphhopper.routing.ch.PrepareCHEntry(0, (int) (byte) -1, (-1), 0.0d);
        int int18 = prepareCHEntry17.adjNode;
        prepareCHEntry9.parent = prepareCHEntry17;
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        int[] intArray0 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet1 = com.graphhopper.coll.GHIntHashSet.from(intArray0);
        int int3 = intHashSet1.removeAll((-1909399913));
        // The following exception was thrown during execution in test generation
        try {
            int int5 = 0; // flaky: intHashSet1.indexGet((-3));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intHashSet1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue1 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.routing.weighting.TurnCostProvider turnCostProvider2 = null;
        com.graphhopper.routing.subnetwork.PrepareRoutingSubnetworks.PrepareJob prepareJob3 = new com.graphhopper.routing.subnetwork.PrepareRoutingSubnetworks.PrepareJob("1.8.0_251", booleanEncodedValue1, turnCostProvider2);
        java.lang.String[] strArray51 = new java.lang.String[] { "Linux", "prepare.ch.edge.original_edge_quotient_weight", "SpatialRuleSet [rules=[]]", "5.4.0-70-generic", "mtb", "..", "found: false, weight: 1.7976931348623157E308, time: 100, distance: 0.0, edges: 0", "1111111111111111111111111111111111111111111111111111111111111100", "yes", "SpatialRuleSet [rules=[]]", "Node: 200 lat=0.0 lon=3.0", "max_speed", "custom", "5,17,4,4,5,7", "1.8", "graphhopper/core", "secondary", "SpatialRuleSet [rules=[]]", "SpatialRuleSet [rules=[]]", "bike2", "road_class_link", "{}", "1111111111", "Node: 200 lat=0.0 lon=3.0", "hike", "max_height", "prepare.ch.edge.witness_search.sigma_factor", "size=0, treeMap.size=0, averageNo=NaN, minNo=2147483647, maxNo=-2147483648", "B", "prepare.ch.edge.hierarchy_depth_weight", "default", "2 (-1) weight: 10.0, incEdge: -1", "2021-04-05T00:25:56Z", "country|version=1687814340|bits=2|index=0|shift=-1|store_both_directions=false", "average_speed", "........                                                                                                                                                                                                ", "country|version=1687814340|bits=2|index=0|shift=-1|store_both_directions=false", "5,17,4,4,5,7", "prepare.ch.edge.witness_search.reset_interval", "[0 0 0 0 0 0 0 0 0 0]", "bike2", "max_speed", "aut", "1.8", "SpatialRule [getId()=deu, getPriority()=100]", "prepare.ch.updates.neighbor", "1111111111111111111111111111111111111111111111111111111111111100" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        com.graphhopper.routing.util.parsers.OSMGetOffBikeParser oSMGetOffBikeParser54 = new com.graphhopper.routing.util.parsers.OSMGetOffBikeParser(booleanEncodedValue1, (java.util.List<java.lang.String>) strList52);
        org.junit.Assert.assertNotNull(booleanEncodedValue1);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        com.graphhopper.routing.util.AllEdgesIterator allEdgesIterator21 = graphHopperStorage20.getAllEdges();
        com.graphhopper.routing.weighting.Weighting weighting22 = null;
        com.graphhopper.routing.util.TraversalMode traversalMode23 = com.graphhopper.routing.util.TraversalMode.NODE_BASED;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.Dijkstra dijkstra24 = new com.graphhopper.routing.Dijkstra((com.graphhopper.storage.Graph) graphHopperStorage20, weighting22, traversalMode23);
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
        org.junit.Assert.assertNotNull(allEdgesIterator21);
        org.junit.Assert.assertTrue("'" + traversalMode23 + "' != '" + com.graphhopper.routing.util.TraversalMode.NODE_BASED + "'", traversalMode23.equals(com.graphhopper.routing.util.TraversalMode.NODE_BASED));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.graphhopper.routing.weighting.TurnCostProvider turnCostProvider0 = com.graphhopper.routing.weighting.TurnCostProvider.NO_TURN_COST_PROVIDER;
        double double4 = turnCostProvider0.calcTurnWeight((-2), 10, 11);
        long long8 = turnCostProvider0.calcTurnMillis(50, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertNotNull(turnCostProvider0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.locationtech.jts.geom.Polygon polygon0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.shapes.Polygon polygon1 = com.graphhopper.util.shapes.Polygon.create(polygon0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
        com.graphhopper.storage.GraphBuilder graphBuilder53 = graphBuilder51.setRAM("horse_rating");
        com.graphhopper.reader.osm.OSMFileHeader oSMFileHeader54 = new com.graphhopper.reader.osm.OSMFileHeader();
        java.lang.String[] strArray58 = new java.lang.String[] { "2021-04-05T00:25:56Z", "3.0" };
        boolean boolean59 = oSMFileHeader54.hasTag("{}", strArray58);
        com.graphhopper.storage.GraphBuilder graphBuilder60 = graphBuilder53.setCHConfigStrings(strArray58);
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
        org.junit.Assert.assertNotNull(graphBuilder53);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(graphBuilder60);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap3 = new com.graphhopper.coll.OSMIDMap(directory2);
        com.graphhopper.search.StringIndex stringIndex5 = new com.graphhopper.search.StringIndex(directory2, 10);
        com.graphhopper.storage.RAMDirectory rAMDirectory7 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory8 = rAMDirectory7.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap9 = new com.graphhopper.coll.OSMIDMap(directory8);
        com.graphhopper.search.StringIndex stringIndex11 = new com.graphhopper.search.StringIndex(directory8, 10);
        stringIndex5.copyTo(stringIndex11);
        com.graphhopper.storage.RAMDirectory rAMDirectory14 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory15 = rAMDirectory14.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap16 = new com.graphhopper.coll.OSMIDMap(directory15);
        com.graphhopper.search.StringIndex stringIndex18 = new com.graphhopper.search.StringIndex(directory15, 10);
        com.graphhopper.storage.RAMDirectory rAMDirectory20 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory21 = rAMDirectory20.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap22 = new com.graphhopper.coll.OSMIDMap(directory21);
        com.graphhopper.search.StringIndex stringIndex24 = new com.graphhopper.search.StringIndex(directory21, 10);
        stringIndex18.copyTo(stringIndex24);
        stringIndex11.copyTo(stringIndex24);
        stringIndex11.close();
        com.graphhopper.search.StringIndex stringIndex29 = stringIndex11.create(5L);
        boolean boolean30 = stringIndex11.isClosed();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(directory8);
        org.junit.Assert.assertNotNull(directory15);
        org.junit.Assert.assertNotNull(directory21);
        org.junit.Assert.assertNotNull(stringIndex29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.graphhopper.reader.dem.SRTMProvider sRTMProvider1 = new com.graphhopper.reader.dem.SRTMProvider("prepare.ch.updates.lazy");
        sRTMProvider1.release();
        sRTMProvider1.setInterpolate(false);
        java.lang.String str5 = sRTMProvider1.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "srtm" + "'", str5, "srtm");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.LITTLE;
        byte[] byteArray2 = bitUtil0.fromBitString("bike");
        byte[] byteArray4 = bitUtil0.fromBitString("1.8");
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-16]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-32]");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        java.lang.String str4 = rAMDirectory1.getLocation();
        boolean boolean5 = rAMDirectory1.isStoring();
        com.graphhopper.storage.StorableProperties storableProperties6 = new com.graphhopper.storage.StorableProperties((com.graphhopper.storage.Directory) rAMDirectory1);
        java.lang.String str8 = storableProperties6.get("country|version=1687814340|bits=2|index=0|shift=-1|store_both_directions=false");
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "prepare.ch.node.original_edge_count_weight/" + "'", str4, "prepare.ch.node.original_edge_count_weight/");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge prepareBaseEdge5 = new com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge(100, (int) (short) -1, (int) (short) 10, (float) (byte) -1, (float) 'a');
        int int6 = prepareBaseEdge5.getOrigEdgeKeyLastAB();
        double double7 = prepareBaseEdge5.getWeightAB();
        int int8 = prepareBaseEdge5.getNodeA();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.graphhopper.routing.util.parsers.OSMHorseRatingParser oSMHorseRatingParser0 = new com.graphhopper.routing.util.parsers.OSMHorseRatingParser();
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.edge.witness_search.reset_interval");
        rAMDirectory1.close();
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        virtualEdgeIteratorState11.setUnfavored(true);
        com.graphhopper.storage.IntsRef intsRef14 = virtualEdgeIteratorState11.getFlags();
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue17 = new com.graphhopper.routing.ev.StringEncodedValue("bike_network", 10);
        java.util.List<java.lang.String> strList18 = stringEncodedValue17.getValues();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState20 = virtualEdgeIteratorState11.set(stringEncodedValue17, "00001010000010100000101001100100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: EncodedValue bike_network not initialized");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intsRef14);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.graphhopper.routing.ch.CHPreparationHandler cHPreparationHandler0 = new com.graphhopper.routing.ch.CHPreparationHandler();
        com.graphhopper.config.CHProfile[] cHProfileArray1 = new com.graphhopper.config.CHProfile[] {};
        java.util.ArrayList<com.graphhopper.config.CHProfile> cHProfileList2 = new java.util.ArrayList<com.graphhopper.config.CHProfile>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.config.CHProfile>) cHProfileList2, cHProfileArray1);
        com.graphhopper.routing.ch.CHPreparationHandler cHPreparationHandler4 = cHPreparationHandler0.setCHProfiles((java.util.Collection<com.graphhopper.config.CHProfile>) cHProfileList2);
        java.util.List<com.graphhopper.storage.CHConfig> cHConfigList5 = cHPreparationHandler0.getCHConfigs();
        java.util.List<com.graphhopper.storage.CHConfig> cHConfigList6 = cHPreparationHandler0.getNodeBasedCHConfigs();
        org.junit.Assert.assertNotNull(cHProfileArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cHPreparationHandler4);
        org.junit.Assert.assertNotNull(cHConfigList5);
        org.junit.Assert.assertNotNull(cHConfigList6);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.graphhopper.coll.GHTBitSet gHTBitSet1 = new com.graphhopper.coll.GHTBitSet(20);
        gHTBitSet1.add((int) (byte) 1);
        gHTBitSet1.clear();
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        int int27 = 0; // flaky: graphHopperStorage24.getOtherNode(200, (-1909399913));
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.UnsignedIntEncodedValue unsignedIntEncodedValue3 = new com.graphhopper.routing.ev.UnsignedIntEncodedValue("1.8", 5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue name wasn't valid: 1.8. Use lower case letters, underscore and numbers only.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue1 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = disabledEdgeIterator0.getReverse(booleanEncodedValue1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanEncodedValue1);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.graphhopper.util.Constants constants0 = new com.graphhopper.util.Constants();
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.graphhopper.storage.MMapDirectory mMapDirectory1 = new com.graphhopper.storage.MMapDirectory("gmted");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        int int28 = virtualEdgeIteratorState11.getEdge();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(decimalEncodedValue23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + Double.POSITIVE_INFINITY + "'", double24 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(edgeIteratorState26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 35.0d + "'", double27 == 35.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        com.graphhopper.routing.util.AllEdgesIterator allEdgesIterator21 = graphHopperStorage20.getAllEdges();
        java.util.List<java.lang.Integer> intList22 = com.graphhopper.util.GHUtility.getEdgeIds((com.graphhopper.util.EdgeIterator) allEdgesIterator21);
        com.graphhopper.storage.IntsRef intsRef25 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState31 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef25, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int32 = edgeIteratorState31.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue33 = com.graphhopper.routing.ev.Country.create();
        boolean boolean34 = countryEnumEncodedValue33.isStoreTwoDirections();
        com.graphhopper.routing.ev.Country country35 = edgeIteratorState31.getReverse(countryEnumEncodedValue33);
        com.graphhopper.storage.IntsRef intsRef38 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState44 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef38, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        boolean boolean45 = countryEnumEncodedValue33.equals((java.lang.Object) (byte) 0);
        com.graphhopper.routing.ev.Country country46 = com.graphhopper.routing.ev.Country.AUT;
        java.lang.String str47 = country46.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState48 = null; // flaky: allEdgesIterator21.setReverse(countryEnumEncodedValue33, country46);
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
        org.junit.Assert.assertNotNull(allEdgesIterator21);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(edgeIteratorState31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + country35 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country35.equals(com.graphhopper.routing.ev.Country.DEFAULT));
        org.junit.Assert.assertNotNull(edgeIteratorState44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + country46 + "' != '" + com.graphhopper.routing.ev.Country.AUT + "'", country46.equals(com.graphhopper.routing.ev.Country.AUT));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "aut" + "'", str47, "aut");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        dataAccess15.rename("srtm");
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
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.graphhopper.util.shapes.BBox bBox7 = new com.graphhopper.util.shapes.BBox((double) 1001L, (double) (-1), 0.7d, (double) 52L, (double) 96, 0.0d, false);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        java.lang.String str24 = path23.getDebugInfo();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue> encodedValueGHObjectIntHashMap1 = new com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue>((int) (byte) 100);
        com.carrotsearch.hppc.ObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue> encodedValueObjectIntHashMap2 = encodedValueGHObjectIntHashMap1.clone();
        encodedValueGHObjectIntHashMap1.ensureCapacity((int) ' ');
        org.junit.Assert.assertNotNull(encodedValueObjectIntHashMap2);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.graphhopper.routing.AStar.AStarEntry aStarEntry4 = new com.graphhopper.routing.AStar.AStarEntry((int) (byte) -1, 21, (double) (-4), (double) (short) 0);
        com.graphhopper.routing.SPTEntry sPTEntry5 = aStarEntry4.cloneFull();
        com.graphhopper.routing.SPTEntry sPTEntry6 = sPTEntry5.getParent();
        org.junit.Assert.assertNotNull(sPTEntry5);
        org.junit.Assert.assertNull(sPTEntry6);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.graphhopper.storage.RAMDirectory rAMDirectory2 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory3 = rAMDirectory2.create();
        java.nio.ByteOrder byteOrder4 = rAMDirectory2.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray5 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager6 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray5);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage8 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory2, encodingManager6, false);
        java.util.List<com.graphhopper.storage.CHConfig> cHConfigList9 = graphHopperStorage8.getCHConfigs();
        com.graphhopper.storage.index.LocationIndex locationIndex10 = null;
        com.graphhopper.util.shapes.GHPoint[] gHPointArray11 = new com.graphhopper.util.shapes.GHPoint[] {};
        java.util.ArrayList<com.graphhopper.util.shapes.GHPoint> gHPointList12 = new java.util.ArrayList<com.graphhopper.util.shapes.GHPoint>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.util.shapes.GHPoint>) gHPointList12, gHPointArray11);
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile15 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str16 = customProfile15.toString();
        com.graphhopper.config.Profile profile19 = customProfile15.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.util.PMap pMap20 = profile19.getHints();
        com.graphhopper.routing.weighting.Weighting weighting21 = null;
        com.graphhopper.routing.util.FiniteWeightFilter finiteWeightFilter22 = new com.graphhopper.routing.util.FiniteWeightFilter(weighting21);
        com.graphhopper.storage.GraphEdgeIdFinder.BlockArea blockArea23 = com.graphhopper.storage.GraphEdgeIdFinder.createBlockArea((com.graphhopper.storage.Graph) graphHopperStorage8, locationIndex10, (java.util.List<com.graphhopper.util.shapes.GHPoint>) gHPointList12, pMap20, (com.graphhopper.routing.util.EdgeFilter) finiteWeightFilter22);
        com.graphhopper.routing.weighting.Weighting weighting24 = null;
        com.graphhopper.storage.RAMDirectory rAMDirectory26 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory27 = rAMDirectory26.create();
        java.nio.ByteOrder byteOrder28 = rAMDirectory26.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess30 = rAMDirectory26.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory31 = rAMDirectory26.create();
        long[] longArray37 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet38 = com.carrotsearch.hppc.LongHashSet.from(longArray37);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray39 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager40 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray39);
        com.graphhopper.storage.GraphBuilder graphBuilder41 = new com.graphhopper.storage.GraphBuilder(encodingManager40);
        boolean boolean42 = longHashSet38.equals((java.lang.Object) encodingManager40);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage45 = new com.graphhopper.storage.GraphHopperStorage(directory31, encodingManager40, false, true);
        com.graphhopper.routing.Path path46 = new com.graphhopper.routing.Path((com.graphhopper.storage.Graph) graphHopperStorage45);
        com.graphhopper.routing.util.EncodingManager encodingManager47 = graphHopperStorage45.getEncodingManager();
        com.graphhopper.storage.NodeAccess nodeAccess48 = graphHopperStorage45.getNodeAccess();
        com.graphhopper.util.PointList pointList49 = null;
        com.graphhopper.storage.ExtendedNodeAccess extendedNodeAccess51 = new com.graphhopper.storage.ExtendedNodeAccess(nodeAccess48, pointList49, 1048576);
        com.graphhopper.routing.weighting.WeightApproximator weightApproximator52 = com.graphhopper.routing.RoutingAlgorithmFactorySimple.getApproximation("_network$turn_cost", pMap20, weighting24, nodeAccess48);
        com.graphhopper.routing.weighting.BalancedWeightApproximator balancedWeightApproximator53 = new com.graphhopper.routing.weighting.BalancedWeightApproximator(weightApproximator52);
        double double54 = weightApproximator52.getSlack();
        org.junit.Assert.assertNotNull(directory3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertNotNull(flagEncoderArray5);
        org.junit.Assert.assertNotNull(encodingManager6);
        org.junit.Assert.assertNotNull(cHConfigList9);
        org.junit.Assert.assertNotNull(gHPointArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str16, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile19);
        org.junit.Assert.assertNotNull(pMap20);
        org.junit.Assert.assertNotNull(blockArea23);
        org.junit.Assert.assertNotNull(directory27);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertNotNull(dataAccess30);
        org.junit.Assert.assertNotNull(directory31);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet38);
        org.junit.Assert.assertNotNull(flagEncoderArray39);
        org.junit.Assert.assertNotNull(encodingManager40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(encodingManager47);
        org.junit.Assert.assertNotNull(nodeAccess48);
        org.junit.Assert.assertNotNull(weightApproximator52);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.graphhopper.routing.ev.RoadClass roadClass0 = com.graphhopper.routing.ev.RoadClass.RESIDENTIAL;
        org.junit.Assert.assertTrue("'" + roadClass0 + "' != '" + com.graphhopper.routing.ev.RoadClass.RESIDENTIAL + "'", roadClass0.equals(com.graphhopper.routing.ev.RoadClass.RESIDENTIAL));
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.graphhopper.storage.IntsRef intsRef0 = com.graphhopper.routing.ev.TurnCost.createFlags();
        org.junit.Assert.assertNotNull(intsRef0);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        long[] longArray5 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet6 = com.carrotsearch.hppc.LongHashSet.from(longArray5);
        java.util.Iterator<com.carrotsearch.hppc.cursors.LongCursor> longCursorItor7 = longHashSet6.iterator();
        com.carrotsearch.hppc.LongHashSet longHashSet8 = longHashSet6.clone();
        int int9 = longHashSet6.size();
        longHashSet6.clear();
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet6);
        org.junit.Assert.assertNotNull(longCursorItor7);
        org.junit.Assert.assertNotNull(longHashSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.graphhopper.routing.ev.RoadClass roadClass1 = com.graphhopper.routing.ev.RoadClass.find("1.8.0_251");
        org.junit.Assert.assertTrue("'" + roadClass1 + "' != '" + com.graphhopper.routing.ev.RoadClass.OTHER + "'", roadClass1.equals(com.graphhopper.routing.ev.RoadClass.OTHER));
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.graphhopper.routing.util.TestAlgoCollector testAlgoCollector1 = new com.graphhopper.routing.util.TestAlgoCollector("5.4.0-70-generic");
        com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser oSMHazmatTunnelParser2 = new com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray3 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager4 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray3);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue5 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue6 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray7 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue5, decimalEncodedValue6 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList8 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList8, encodedValueArray7);
        oSMHazmatTunnelParser2.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager4, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList8);
        com.graphhopper.storage.RAMDirectory rAMDirectory12 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory13 = rAMDirectory12.create();
        java.nio.ByteOrder byteOrder14 = rAMDirectory12.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray15 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager16 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray15);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage18 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory12, encodingManager16, false);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue20 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.util.details.IntDetails intDetails21 = new com.graphhopper.util.details.IntDetails("foot", (com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue20);
        com.graphhopper.routing.ev.IntEncodedValue intEncodedValue22 = com.graphhopper.routing.ev.HorseRating.create();
        com.graphhopper.storage.IntsRef intsRef25 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState31 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef25, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue32 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        double double33 = edgeIteratorState31.getReverse(decimalEncodedValue32);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue34 = com.graphhopper.routing.ev.Country.create();
        boolean boolean35 = countryEnumEncodedValue34.isStoreTwoDirections();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue36 = com.graphhopper.routing.ev.Country.create();
        boolean boolean37 = countryEnumEncodedValue36.isStoreTwoDirections();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray38 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue20, intEncodedValue22, decimalEncodedValue32, countryEnumEncodedValue34, countryEnumEncodedValue36 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList39 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList39, encodedValueArray38);
        oSMHazmatTunnelParser2.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager16, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList39);
        com.graphhopper.storage.RAMDirectory rAMDirectory43 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory44 = rAMDirectory43.create();
        com.graphhopper.storage.DAType dAType45 = rAMDirectory43.getDefaultType();
        com.graphhopper.storage.RAMDirectory rAMDirectory48 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory49 = rAMDirectory48.create();
        com.graphhopper.storage.DAType dAType50 = rAMDirectory48.getDefaultType();
        com.graphhopper.storage.Directory directory51 = rAMDirectory43.put("foot", dAType50);
        long[] longArray57 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet58 = com.carrotsearch.hppc.LongHashSet.from(longArray57);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray59 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager60 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray59);
        com.graphhopper.storage.GraphBuilder graphBuilder61 = new com.graphhopper.storage.GraphBuilder(encodingManager60);
        boolean boolean62 = longHashSet58.equals((java.lang.Object) encodingManager60);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage66 = new com.graphhopper.storage.GraphHopperStorage(directory51, encodingManager60, false, false, (-2));
        com.graphhopper.routing.weighting.Weighting weighting67 = null;
        com.graphhopper.routing.weighting.Weighting weighting68 = graphHopperStorage66.wrapWeighting(weighting67);
        com.graphhopper.routing.weighting.Weighting weighting71 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions72 = new com.graphhopper.routing.AlgorithmOptions("", weighting71);
        java.lang.String str73 = algorithmOptions72.getAlgorithm();
        com.graphhopper.storage.index.LocationIndex locationIndex74 = null;
        com.graphhopper.routing.util.TestAlgoCollector.AlgoHelperEntry algoHelperEntry76 = new com.graphhopper.routing.util.TestAlgoCollector.AlgoHelperEntry((com.graphhopper.storage.Graph) graphHopperStorage66, true, algorithmOptions72, locationIndex74, "");
        com.graphhopper.routing.util.TestAlgoCollector.OneRun oneRun77 = new com.graphhopper.routing.util.TestAlgoCollector.OneRun();
        com.graphhopper.storage.index.LocationIndex locationIndex78 = null;
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue79 = null;
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter80 = com.graphhopper.routing.util.DefaultEdgeFilter.allEdges(booleanEncodedValue79);
        java.util.List<com.graphhopper.storage.index.Snap> snapList81 = oneRun77.getList(locationIndex78, (com.graphhopper.routing.util.EdgeFilter) defaultEdgeFilter80);
        com.graphhopper.routing.util.TestAlgoCollector.OneRun oneRun82 = new com.graphhopper.routing.util.TestAlgoCollector.OneRun();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.TestAlgoCollector testAlgoCollector83 = testAlgoCollector1.assertDistance(encodingManager16, algoHelperEntry76, snapList81, oneRun82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Option 'weighting' must NOT be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(flagEncoderArray3);
        org.junit.Assert.assertNotNull(encodingManager4);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue5);
        org.junit.Assert.assertNotNull(decimalEncodedValue6);
        org.junit.Assert.assertNotNull(encodedValueArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(directory13);
        org.junit.Assert.assertNotNull(byteOrder14);
        org.junit.Assert.assertNotNull(flagEncoderArray15);
        org.junit.Assert.assertNotNull(encodingManager16);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue20);
        org.junit.Assert.assertNotNull(intEncodedValue22);
        org.junit.Assert.assertNotNull(edgeIteratorState31);
        org.junit.Assert.assertNotNull(decimalEncodedValue32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + Double.POSITIVE_INFINITY + "'", double33 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(encodedValueArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(directory44);
        org.junit.Assert.assertNotNull(dAType45);
        org.junit.Assert.assertNotNull(directory49);
        org.junit.Assert.assertNotNull(dAType50);
        org.junit.Assert.assertNotNull(directory51);
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet58);
        org.junit.Assert.assertNotNull(flagEncoderArray59);
        org.junit.Assert.assertNotNull(encodingManager60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(weighting68);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(defaultEdgeFilter80);
        org.junit.Assert.assertNotNull(snapList81);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap3 = new com.graphhopper.coll.OSMIDMap(directory2);
        int int4 = oSMIDMap3.getMemoryUsage();
        long long5 = oSMIDMap3.getSize();
        int int6 = oSMIDMap3.getMemoryUsage();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.graphhopper.GraphHopper graphHopper0 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        com.graphhopper.GraphHopper graphHopper2 = graphHopper0.setFlagEncoderFactory(flagEncoderFactory1);
        com.graphhopper.routing.lm.LMPreparationHandler lMPreparationHandler3 = graphHopper0.getLMPreparationHandler();
        lMPreparationHandler3.setPreparationThreads(1687814340);
        com.graphhopper.routing.lm.LMConfig lMConfig6 = null;
        com.graphhopper.routing.lm.LMPreparationHandler lMPreparationHandler7 = lMPreparationHandler3.addLMConfig(lMConfig6);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.lm.PrepareLandmarks prepareLandmarks9 = lMPreparationHandler3.getPreparation("-1 (1) weight: 2.0, incEdge: 10");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No LM preparations added yet");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphHopper2);
        org.junit.Assert.assertNotNull(lMPreparationHandler3);
        org.junit.Assert.assertNotNull(lMPreparationHandler7);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.storage.DAType dAType3 = rAMDirectory1.getDefaultType();
        com.graphhopper.storage.DAType dAType5 = com.graphhopper.storage.DAType.RAM_INT_STORE;
        com.graphhopper.storage.Directory directory6 = rAMDirectory1.put("", dAType5);
        com.graphhopper.storage.RAMDirectory rAMDirectory9 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory10 = rAMDirectory9.create();
        com.graphhopper.storage.DAType dAType11 = rAMDirectory9.getDefaultType();
        com.graphhopper.storage.DAType dAType13 = com.graphhopper.storage.DAType.RAM_INT_STORE;
        com.graphhopper.storage.Directory directory14 = rAMDirectory9.put("", dAType13);
        boolean boolean15 = dAType13.isMMap();
        com.graphhopper.storage.DataAccess dataAccess16 = rAMDirectory1.find("prepare.ch.edge.witness_search.reset_interval", dAType13);
        // The following exception was thrown during execution in test generation
        try {
            dataAccess16.rename("missing");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: File does not exist!? prepare.ch.node.original_edge_count_weight/prepare.ch.edge.witness_search.reset_interval Make sure that you flushed before renaming. Otherwise it could make problems for memory mapped DataAccess objects");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(dAType3);
        org.junit.Assert.assertNotNull(dAType5);
        org.junit.Assert.assertNotNull(directory6);
        org.junit.Assert.assertNotNull(directory10);
        org.junit.Assert.assertNotNull(dAType11);
        org.junit.Assert.assertNotNull(dAType13);
        org.junit.Assert.assertNotNull(directory14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dataAccess16);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.graphhopper.routing.util.EncodingManager.Builder builder0 = com.graphhopper.routing.util.EncodingManager.start();
        com.graphhopper.reader.osm.conditional.DateRangeParser dateRangeParser1 = new com.graphhopper.reader.osm.conditional.DateRangeParser();
        com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState conditionState3 = dateRangeParser1.checkCondition("3.0");
        com.graphhopper.routing.util.EncodingManager.Builder builder4 = builder0.setDateRangeParser(dateRangeParser1);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue5 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser6 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue5);
        com.graphhopper.routing.util.parsers.OSMMaxAxleLoadParser oSMMaxAxleLoadParser7 = new com.graphhopper.routing.util.parsers.OSMMaxAxleLoadParser(decimalEncodedValue5);
        com.graphhopper.routing.util.EncodingManager.Builder builder8 = builder4.add((com.graphhopper.routing.ev.EncodedValue) decimalEncodedValue5);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + conditionState3 + "' != '" + com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.FALSE + "'", conditionState3.equals(com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.FALSE));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(decimalEncodedValue5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        java.util.Locale locale0 = null;
        com.graphhopper.util.TranslationMap.TranslationHashMap translationHashMap1 = new com.graphhopper.util.TranslationMap.TranslationHashMap(locale0);
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.TranslationMap.TranslationHashMap translationHashMap3 = translationHashMap1.doImport(inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No input stream found in class path!?");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.graphhopper.routing.DirectionResolverResult directionResolverResult0 = com.graphhopper.routing.DirectionResolverResult.unrestricted();
        boolean boolean1 = directionResolverResult0.isImpossible();
        boolean boolean2 = directionResolverResult0.isRestricted();
        org.junit.Assert.assertNotNull(directionResolverResult0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap0 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>();
        int[] intArray1 = strComparableGHIntObjectHashMap0.keys;
        boolean boolean3 = false; // flaky: strComparableGHIntObjectHashMap0.indexExists(100);
        strComparableGHIntObjectHashMap0.ensureCapacity((-1909399913));
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableGHIntObjectHashMap0.indexReplace((int) (short) 0, strComparable7);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
// flaky:         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(strComparable8);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge prepareBaseEdge5 = new com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge(100, (int) (short) -1, (int) (short) 10, (float) (byte) -1, (float) 'a');
        double double6 = prepareBaseEdge5.getWeightAB();
        // The following exception was thrown during execution in test generation
        try {
            prepareBaseEdge5.setSkipped2(100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap3 = new com.graphhopper.coll.OSMIDMap(directory2);
        com.graphhopper.search.StringIndex stringIndex5 = new com.graphhopper.search.StringIndex(directory2, 10);
        boolean boolean6 = stringIndex5.isClosed();
        long long7 = stringIndex5.getCapacity();
        boolean boolean8 = stringIndex5.loadExisting();
        stringIndex5.flush();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl1 = new com.graphhopper.coll.GHBitSetImpl((int) (short) 100);
        gHBitSetImpl1.set(1, 35, true);
        int int7 = gHBitSetImpl1.nextClearBit(0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.graphhopper.storage.IntsRef intsRef2 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState8 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef2, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        boolean boolean9 = intsRef2.isEmpty();
        org.junit.Assert.assertNotNull(edgeIteratorState8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.graphhopper.routing.AStar.AStarEntry aStarEntry4 = new com.graphhopper.routing.AStar.AStarEntry((int) (byte) -1, 21, (double) (-4), (double) (short) 0);
        com.graphhopper.routing.SPTEntry sPTEntry5 = aStarEntry4.cloneFull();
        com.graphhopper.routing.AStar.AStarEntry aStarEntry6 = aStarEntry4.getParent();
        org.junit.Assert.assertNotNull(sPTEntry5);
        org.junit.Assert.assertNull(aStarEntry6);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        com.graphhopper.routing.weighting.Weighting weighting27 = null;
        com.graphhopper.routing.ch.AStarCHEntry aStarCHEntry31 = new com.graphhopper.routing.ch.AStarCHEntry(2, (double) 10L, (double) 2);
        aStarCHEntry31.weightOfVisitedPath = 100.0f;
        com.graphhopper.routing.Path path34 = com.graphhopper.routing.PathExtractor.extractPath((com.graphhopper.storage.Graph) graphHopperStorage24, weighting27, (com.graphhopper.routing.SPTEntry) aStarCHEntry31);
        int int35 = path34.getEndNode();
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
        org.junit.Assert.assertNotNull(path34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph> cHPreparationGraphGHLongObjectHashMap0 = new com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph>();
        cHPreparationGraphGHLongObjectHashMap0.ensureCapacity(1048576);
        com.carrotsearch.hppc.LongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph> cHPreparationGraphLongObjectHashMap3 = cHPreparationGraphGHLongObjectHashMap0.clone();
        com.graphhopper.coll.GHLongHashSet gHLongHashSet5 = new com.graphhopper.coll.GHLongHashSet(2);
        int int6 = cHPreparationGraphGHLongObjectHashMap0.removeAll((com.carrotsearch.hppc.LongContainer) gHLongHashSet5);
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph10 = com.graphhopper.routing.ch.CHPreparationGraph.nodeBased((int) ' ', 0);
        double double14 = cHPreparationGraph10.getTurnWeight(3, (int) (byte) -1, 20);
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph15 = cHPreparationGraphGHLongObjectHashMap0.getOrDefault((long) 4, cHPreparationGraph10);
        boolean boolean17 = cHPreparationGraphGHLongObjectHashMap0.indexExists(0);
        org.junit.Assert.assertNotNull(cHPreparationGraphLongObjectHashMap3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(cHPreparationGraph10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(cHPreparationGraph15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager5, false);
        java.util.List<java.lang.String> strList8 = graphHopperStorage7.getCHGraphNames();
        boolean boolean9 = graphHopperStorage7.loadExisting();
        com.graphhopper.storage.NodeAccess nodeAccess10 = graphHopperStorage7.getNodeAccess();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(flagEncoderArray4);
        org.junit.Assert.assertNotNull(encodingManager5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeAccess10);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap1 = new com.graphhopper.coll.GHIntLongHashMap((int) (byte) 1);
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap3 = new com.graphhopper.coll.GHIntLongHashMap((int) (byte) 1);
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = gHIntLongHashMap3.clone();
        int int5 = gHIntLongHashMap1.putAll((com.carrotsearch.hppc.IntLongAssociativeContainer) gHIntLongHashMap3);
        gHIntLongHashMap3.ensureCapacity(20);
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.graphhopper.util.MiniPerfTest miniPerfTest0 = new com.graphhopper.util.MiniPerfTest();
        double double1 = miniPerfTest0.getMax();
        com.graphhopper.util.MiniPerfTest miniPerfTest3 = miniPerfTest0.setIterations((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(miniPerfTest3);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.graphhopper.routing.ev.RoadAccess roadAccess0 = com.graphhopper.routing.ev.RoadAccess.DELIVERY;
        org.junit.Assert.assertTrue("'" + roadAccess0 + "' != '" + com.graphhopper.routing.ev.RoadAccess.DELIVERY + "'", roadAccess0.equals(com.graphhopper.routing.ev.RoadAccess.DELIVERY));
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.LITTLE;
        long long3 = bitUtil0.combineIntsToLong(10, (int) (byte) 1);
        int int5 = bitUtil0.getIntHigh((long) 64);
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4294967306L + "'", long3 == 4294967306L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.graphhopper.routing.ev.MaxLength maxLength0 = new com.graphhopper.routing.ev.MaxLength();
        com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder spatialRuleLookupBuilder1 = new com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder();
        com.graphhopper.coll.MapEntry<com.graphhopper.routing.ev.MaxLength, com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder> maxLengthMapEntry2 = new com.graphhopper.coll.MapEntry<com.graphhopper.routing.ev.MaxLength, com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder>(maxLength0, spatialRuleLookupBuilder1);
        com.graphhopper.routing.ev.MaxLength maxLength3 = new com.graphhopper.routing.ev.MaxLength();
        com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder spatialRuleLookupBuilder4 = new com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder();
        com.graphhopper.coll.MapEntry<com.graphhopper.routing.ev.MaxLength, com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder> maxLengthMapEntry5 = new com.graphhopper.coll.MapEntry<com.graphhopper.routing.ev.MaxLength, com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder>(maxLength3, spatialRuleLookupBuilder4);
        com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder spatialRuleLookupBuilder6 = maxLengthMapEntry2.setValue(spatialRuleLookupBuilder4);
        com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder spatialRuleLookupBuilder7 = maxLengthMapEntry2.getValue();
        org.junit.Assert.assertNotNull(spatialRuleLookupBuilder6);
        org.junit.Assert.assertNotNull(spatialRuleLookupBuilder7);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.graphhopper.util.JsonFeatureCollection[] jsonFeatureCollectionArray0 = new com.graphhopper.util.JsonFeatureCollection[] {};
        java.util.ArrayList<com.graphhopper.util.JsonFeatureCollection> jsonFeatureCollectionList1 = new java.util.ArrayList<com.graphhopper.util.JsonFeatureCollection>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.util.JsonFeatureCollection>) jsonFeatureCollectionList1, jsonFeatureCollectionArray0);
        com.graphhopper.routing.util.spatialrules.CountriesSpatialRuleFactory countriesSpatialRuleFactory4 = new com.graphhopper.routing.util.spatialrules.CountriesSpatialRuleFactory();
        org.locationtech.jts.geom.Polygon[] polygonArray6 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList7 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList7, polygonArray6);
        com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule germanySpatialRule9 = new com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList7);
        java.util.List<org.locationtech.jts.geom.Polygon> polygonList10 = germanySpatialRule9.getBorders();
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule11 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule(polygonList10);
        com.graphhopper.routing.util.spatialrules.SpatialRule spatialRule12 = countriesSpatialRuleFactory4.createSpatialRule("{}", polygonList10);
        com.graphhopper.routing.util.spatialrules.SpatialRuleLookup spatialRuleLookup13 = com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder.buildIndex((java.util.List<com.graphhopper.util.JsonFeatureCollection>) jsonFeatureCollectionList1, "PLANE_PROJ", (com.graphhopper.routing.util.spatialrules.SpatialRuleFactory) countriesSpatialRuleFactory4);
        org.junit.Assert.assertNotNull(jsonFeatureCollectionArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(polygonArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(polygonList10);
        org.junit.Assert.assertNull(spatialRule12);
        org.junit.Assert.assertNotNull(spatialRuleLookup13);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.graphhopper.routing.util.PriorityCode priorityCode0 = com.graphhopper.routing.util.PriorityCode.BEST;
        org.junit.Assert.assertTrue("'" + priorityCode0 + "' != '" + com.graphhopper.routing.util.PriorityCode.BEST + "'", priorityCode0.equals(com.graphhopper.routing.util.PriorityCode.BEST));
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.graphhopper.util.Unzipper unzipper0 = new com.graphhopper.util.Unzipper();
        boolean boolean4 = unzipper0.unzip("default", "prepare.ch.node.original_edge_count_weight", false);
        java.io.InputStream inputStream5 = null;
        java.io.File file6 = null;
        com.graphhopper.util.ProgressListener progressListener7 = null;
        // The following exception was thrown during execution in test generation
        try {
            unzipper0.unzip(inputStream5, file6, progressListener7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.graphhopper.util.Downloader downloader1 = new com.graphhopper.util.Downloader("multi");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        com.graphhopper.storage.GraphBuilder graphBuilder10 = graphBuilder8.setRAM();
        org.junit.Assert.assertNotNull(flagEncoderArray0);
        org.junit.Assert.assertNotNull(encodingManager1);
        org.junit.Assert.assertNotNull(graphBuilder4);
        org.junit.Assert.assertNotNull(cHConfigArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(graphBuilder8);
        org.junit.Assert.assertNotNull(graphBuilder9);
        org.junit.Assert.assertNotNull(graphBuilder10);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.LITTLE;
        long long3 = bitUtil0.combineIntsToLong(10, (int) (byte) 1);
        int int5 = bitUtil0.getIntLow((long) 0);
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4294967306L + "'", long3 == 4294967306L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState2 = disabledEdgeIterator0.setDistance((double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        java.io.DataInputStream dataInputStream0 = null;
        com.graphhopper.reader.osm.pbf.PbfStreamSplitter pbfStreamSplitter1 = new com.graphhopper.reader.osm.pbf.PbfStreamSplitter(dataInputStream0);
        // The following exception was thrown during execution in test generation
        try {
            pbfStreamSplitter1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap0 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>();
        int[] intArray1 = strComparableGHIntObjectHashMap0.keys;
        boolean boolean3 = false; // flaky: strComparableGHIntObjectHashMap0.indexExists(100);
        strComparableGHIntObjectHashMap0.ensureCapacity((-1909399913));
        int int6 = strComparableGHIntObjectHashMap0.size();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
// flaky:         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions2 = new com.graphhopper.routing.AlgorithmOptions("", weighting1);
        java.lang.String str3 = algorithmOptions2.getAlgorithm();
        java.lang.String str4 = algorithmOptions2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ", null, NODE_BASED" + "'", str4, ", null, NODE_BASED");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.util.EncodingManager.Access> accessEnumEncodedValue1 = null;
        com.graphhopper.util.details.EnumDetails<com.graphhopper.routing.util.EncodingManager.Access> accessEnumDetails2 = new com.graphhopper.util.details.EnumDetails<com.graphhopper.routing.util.EncodingManager.Access>("", accessEnumEncodedValue1);
        com.graphhopper.storage.IntsRef intsRef9 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean10 = intsRef9.isEmpty();
        com.graphhopper.util.PointList pointList12 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState14 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef9, "hike_rating", pointList12, false);
        virtualEdgeIteratorState14.setUnfavored(true);
        int int17 = virtualEdgeIteratorState14.getOriginalEdgeKey();
        int int18 = virtualEdgeIteratorState14.getAdjNode();
        int int19 = virtualEdgeIteratorState14.getAdjNode();
        int int20 = virtualEdgeIteratorState14.getOriginalEdgeKey();
        com.graphhopper.storage.IntsRef intsRef27 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean28 = intsRef27.isEmpty();
        com.graphhopper.util.PointList pointList30 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState32 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef27, "hike_rating", pointList30, false);
        com.graphhopper.storage.IntsRef intsRef35 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState41 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef35, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int42 = edgeIteratorState41.getEdge();
        virtualEdgeIteratorState32.setReverseEdge(edgeIteratorState41);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue44 = com.graphhopper.routing.ev.MaxSpeed.create();
        double double45 = virtualEdgeIteratorState32.get(decimalEncodedValue44);
        double double46 = virtualEdgeIteratorState14.get(decimalEncodedValue44);
        int int47 = virtualEdgeIteratorState14.getEdgeKey();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = accessEnumDetails2.isEdgeDifferentToLastEdge((com.graphhopper.util.EdgeIteratorState) virtualEdgeIteratorState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1048576 + "'", int17 == 1048576);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1048576 + "'", int20 == 1048576);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(decimalEncodedValue44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + Double.POSITIVE_INFINITY + "'", double45 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + Double.POSITIVE_INFINITY + "'", double46 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager5, false);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage8 = com.graphhopper.util.GHUtility.newStorage(graphHopperStorage7);
        com.graphhopper.storage.RAMDirectory rAMDirectory10 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory11 = rAMDirectory10.create();
        java.nio.ByteOrder byteOrder12 = rAMDirectory10.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess14 = rAMDirectory10.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory15 = rAMDirectory10.create();
        long[] longArray21 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet22 = com.carrotsearch.hppc.LongHashSet.from(longArray21);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray23 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager24 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray23);
        com.graphhopper.storage.GraphBuilder graphBuilder25 = new com.graphhopper.storage.GraphBuilder(encodingManager24);
        boolean boolean26 = longHashSet22.equals((java.lang.Object) encodingManager24);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage29 = new com.graphhopper.storage.GraphHopperStorage(directory15, encodingManager24, false, true);
        com.graphhopper.routing.Path path30 = new com.graphhopper.routing.Path((com.graphhopper.storage.Graph) graphHopperStorage29);
        com.graphhopper.routing.util.EncodingManager encodingManager31 = graphHopperStorage29.getEncodingManager();
        com.graphhopper.storage.NodeAccess nodeAccess32 = graphHopperStorage29.getNodeAccess();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage33 = com.graphhopper.util.GHUtility.newStorage(graphHopperStorage29);
        com.graphhopper.storage.Graph graph34 = graphHopperStorage7.copyTo((com.graphhopper.storage.Graph) graphHopperStorage33);
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(flagEncoderArray4);
        org.junit.Assert.assertNotNull(encodingManager5);
        org.junit.Assert.assertNotNull(graphHopperStorage8);
        org.junit.Assert.assertNotNull(directory11);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertNotNull(dataAccess14);
        org.junit.Assert.assertNotNull(directory15);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet22);
        org.junit.Assert.assertNotNull(flagEncoderArray23);
        org.junit.Assert.assertNotNull(encodingManager24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(encodingManager31);
        org.junit.Assert.assertNotNull(nodeAccess32);
        org.junit.Assert.assertNotNull(graphHopperStorage33);
        org.junit.Assert.assertNotNull(graph34);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        boolean boolean0 = com.graphhopper.util.Constants.SUN_OS;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.util.TraversalMode traversalMode2 = com.graphhopper.routing.util.TraversalMode.EDGE_BASED;
        int int7 = traversalMode2.createTraversalId(21, (int) (byte) 1, (-2), false);
        com.graphhopper.routing.AlgorithmOptions algorithmOptions8 = new com.graphhopper.routing.AlgorithmOptions("", weighting1, traversalMode2);
        int int13 = traversalMode2.createTraversalId(20, (int) (byte) 1, (int) (short) 10, true);
        org.junit.Assert.assertTrue("'" + traversalMode2 + "' != '" + com.graphhopper.routing.util.TraversalMode.EDGE_BASED + "'", traversalMode2.equals(com.graphhopper.routing.util.TraversalMode.EDGE_BASED));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3) + "'", int7 == (-3));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl1 = new com.graphhopper.coll.GHBitSetImpl((int) (byte) 10);
        gHBitSetImpl1.clear((int) (byte) 1);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.graphhopper.reader.ReaderRelation readerRelation1 = new com.graphhopper.reader.ReaderRelation((long) 200);
        java.lang.String str2 = readerRelation1.toString();
        com.graphhopper.reader.ReaderRelation.Member member3 = null;
        readerRelation1.add(member3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Relation (200, 0 members)" + "'", str2, "Relation (200, 0 members)");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHLongHashSet gHLongHashSet2 = new com.graphhopper.coll.GHLongHashSet((int) (byte) 1, (double) 1);
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.hppc.BufferAllocationException; message: The load factor should be in range [0.01, 0.99]: 1.000000");
        } catch (com.carrotsearch.hppc.BufferAllocationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.graphhopper.routing.ch.AStarCHEntry aStarCHEntry5 = new com.graphhopper.routing.ch.AStarCHEntry((int) (short) 1, (int) (short) 10, (int) (short) -1, (double) 4294967306L, (double) (byte) 100);
        com.graphhopper.routing.SPTEntry sPTEntry6 = aStarCHEntry5.parent;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = sPTEntry6.weight;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sPTEntry6);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.graphhopper.routing.util.spatialrules.SpatialRuleLookup spatialRuleLookup0 = null;
        com.graphhopper.storage.IntsRef intsRef3 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState9 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef3, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int10 = edgeIteratorState9.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue11 = com.graphhopper.routing.ev.Country.create();
        boolean boolean12 = countryEnumEncodedValue11.isStoreTwoDirections();
        com.graphhopper.routing.ev.Country country13 = edgeIteratorState9.getReverse(countryEnumEncodedValue11);
        java.lang.String str14 = countryEnumEncodedValue11.getName();
        com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser oSMHazmatTunnelParser16 = new com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray17 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager18 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray17);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue19 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue20 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray21 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue19, decimalEncodedValue20 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList22 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList22, encodedValueArray21);
        oSMHazmatTunnelParser16.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager18, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList22);
        com.graphhopper.storage.RAMDirectory rAMDirectory26 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory27 = rAMDirectory26.create();
        java.nio.ByteOrder byteOrder28 = rAMDirectory26.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray29 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager30 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray29);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage32 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory26, encodingManager30, false);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue34 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.util.details.IntDetails intDetails35 = new com.graphhopper.util.details.IntDetails("foot", (com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue34);
        com.graphhopper.routing.ev.IntEncodedValue intEncodedValue36 = com.graphhopper.routing.ev.HorseRating.create();
        com.graphhopper.storage.IntsRef intsRef39 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState45 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef39, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue46 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        double double47 = edgeIteratorState45.getReverse(decimalEncodedValue46);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue48 = com.graphhopper.routing.ev.Country.create();
        boolean boolean49 = countryEnumEncodedValue48.isStoreTwoDirections();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue50 = com.graphhopper.routing.ev.Country.create();
        boolean boolean51 = countryEnumEncodedValue50.isStoreTwoDirections();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray52 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue34, intEncodedValue36, decimalEncodedValue46, countryEnumEncodedValue48, countryEnumEncodedValue50 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList53 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList53, encodedValueArray52);
        oSMHazmatTunnelParser16.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager30, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList53);
        com.graphhopper.storage.IntsRef intsRef56 = encodingManager30.createRelationFlags();
        com.graphhopper.routing.ev.Country country57 = countryEnumEncodedValue11.getEnum(true, intsRef56);
        com.graphhopper.routing.util.parsers.SpatialRuleParser spatialRuleParser58 = new com.graphhopper.routing.util.parsers.SpatialRuleParser(spatialRuleLookup0, (com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue11);
        org.junit.Assert.assertNotNull(edgeIteratorState9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + country13 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country13.equals(com.graphhopper.routing.ev.Country.DEFAULT));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "country" + "'", str14, "country");
        org.junit.Assert.assertNotNull(flagEncoderArray17);
        org.junit.Assert.assertNotNull(encodingManager18);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue19);
        org.junit.Assert.assertNotNull(decimalEncodedValue20);
        org.junit.Assert.assertNotNull(encodedValueArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(directory27);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertNotNull(flagEncoderArray29);
        org.junit.Assert.assertNotNull(encodingManager30);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue34);
        org.junit.Assert.assertNotNull(intEncodedValue36);
        org.junit.Assert.assertNotNull(edgeIteratorState45);
        org.junit.Assert.assertNotNull(decimalEncodedValue46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + Double.POSITIVE_INFINITY + "'", double47 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(encodedValueArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(intsRef56);
        org.junit.Assert.assertTrue("'" + country57 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country57.equals(com.graphhopper.routing.ev.Country.DEFAULT));
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.graphhopper.routing.ch.CHRoutingAlgorithmFactory cHRoutingAlgorithmFactory1 = null;
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile3 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str4 = customProfile3.toString();
        com.graphhopper.config.Profile profile7 = customProfile3.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.util.PMap pMap8 = profile7.getHints();
        com.graphhopper.routing.CHPathCalculator cHPathCalculator9 = new com.graphhopper.routing.CHPathCalculator(cHRoutingAlgorithmFactory1, pMap8);
        com.graphhopper.routing.weighting.Weighting weighting10 = null;
        com.graphhopper.storage.RAMDirectory rAMDirectory12 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory13 = rAMDirectory12.create();
        java.nio.ByteOrder byteOrder14 = rAMDirectory12.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess16 = rAMDirectory12.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory17 = rAMDirectory12.create();
        long[] longArray23 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet24 = com.carrotsearch.hppc.LongHashSet.from(longArray23);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray25 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager26 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray25);
        com.graphhopper.storage.GraphBuilder graphBuilder27 = new com.graphhopper.storage.GraphBuilder(encodingManager26);
        boolean boolean28 = longHashSet24.equals((java.lang.Object) encodingManager26);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage31 = new com.graphhopper.storage.GraphHopperStorage(directory17, encodingManager26, false, true);
        com.graphhopper.routing.Path path32 = new com.graphhopper.routing.Path((com.graphhopper.storage.Graph) graphHopperStorage31);
        com.graphhopper.routing.util.EncodingManager encodingManager33 = graphHopperStorage31.getEncodingManager();
        com.graphhopper.storage.NodeAccess nodeAccess34 = graphHopperStorage31.getNodeAccess();
        com.graphhopper.routing.weighting.WeightApproximator weightApproximator35 = com.graphhopper.routing.RoutingAlgorithmFactorySimple.getApproximation("PLANE_PROJ", pMap8, weighting10, nodeAccess34);
        com.graphhopper.routing.weighting.WeightApproximator weightApproximator36 = weightApproximator35.reverse();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str4, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile7);
        org.junit.Assert.assertNotNull(pMap8);
        org.junit.Assert.assertNotNull(directory13);
        org.junit.Assert.assertNotNull(byteOrder14);
        org.junit.Assert.assertNotNull(dataAccess16);
        org.junit.Assert.assertNotNull(directory17);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet24);
        org.junit.Assert.assertNotNull(flagEncoderArray25);
        org.junit.Assert.assertNotNull(encodingManager26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(encodingManager33);
        org.junit.Assert.assertNotNull(nodeAccess34);
        org.junit.Assert.assertNotNull(weightApproximator35);
        org.junit.Assert.assertNotNull(weightApproximator36);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.graphhopper.routing.ev.MaxLength maxLength0 = new com.graphhopper.routing.ev.MaxLength();
        com.graphhopper.routing.ev.MaxLength maxLength1 = new com.graphhopper.routing.ev.MaxLength();
        com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder spatialRuleLookupBuilder2 = new com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder();
        com.graphhopper.coll.MapEntry<com.graphhopper.routing.ev.MaxLength, com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder> maxLengthMapEntry3 = new com.graphhopper.coll.MapEntry<com.graphhopper.routing.ev.MaxLength, com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder>(maxLength1, spatialRuleLookupBuilder2);
        com.graphhopper.routing.ev.MaxLength maxLength4 = new com.graphhopper.routing.ev.MaxLength();
        com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder spatialRuleLookupBuilder5 = new com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder();
        com.graphhopper.coll.MapEntry<com.graphhopper.routing.ev.MaxLength, com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder> maxLengthMapEntry6 = new com.graphhopper.coll.MapEntry<com.graphhopper.routing.ev.MaxLength, com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder>(maxLength4, spatialRuleLookupBuilder5);
        com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder spatialRuleLookupBuilder7 = maxLengthMapEntry3.setValue(spatialRuleLookupBuilder5);
        com.graphhopper.coll.MapEntry<com.graphhopper.routing.ev.MaxLength, com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder> maxLengthMapEntry8 = new com.graphhopper.coll.MapEntry<com.graphhopper.routing.ev.MaxLength, com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder>(maxLength0, spatialRuleLookupBuilder5);
        org.junit.Assert.assertNotNull(spatialRuleLookupBuilder7);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        java.lang.String str4 = rAMDirectory1.getLocation();
        boolean boolean5 = rAMDirectory1.isStoring();
        com.graphhopper.storage.StorableProperties storableProperties6 = new com.graphhopper.storage.StorableProperties((com.graphhopper.storage.Directory) rAMDirectory1);
        storableProperties6.close();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "prepare.ch.node.original_edge_count_weight/" + "'", str4, "prepare.ch.node.original_edge_count_weight/");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue> encodedValueGHObjectIntHashMap1 = new com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue>((int) (byte) 100);
        com.carrotsearch.hppc.ObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue> encodedValueObjectIntHashMap2 = encodedValueGHObjectIntHashMap1.clone();
        com.graphhopper.storage.IntsRef intsRef5 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState11 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef5, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int12 = edgeIteratorState11.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue13 = com.graphhopper.routing.ev.Country.create();
        boolean boolean14 = countryEnumEncodedValue13.isStoreTwoDirections();
        com.graphhopper.routing.ev.Country country15 = edgeIteratorState11.getReverse(countryEnumEncodedValue13);
        com.graphhopper.storage.IntsRef intsRef23 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean24 = intsRef23.isEmpty();
        com.graphhopper.util.PointList pointList26 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState28 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef23, "hike_rating", pointList26, false);
        int int29 = countryEnumEncodedValue13.getInt(true, intsRef23);
        int int30 = countryEnumEncodedValue13.getMaxInt();
        int int31 = encodedValueObjectIntHashMap2.get((com.graphhopper.routing.ev.EncodedValue) countryEnumEncodedValue13);
        com.carrotsearch.hppc.ObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue>.KeysContainer keysContainer32 = encodedValueObjectIntHashMap2.keys();
        org.junit.Assert.assertNotNull(encodedValueObjectIntHashMap2);
        org.junit.Assert.assertNotNull(edgeIteratorState11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + country15 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country15.equals(com.graphhopper.routing.ev.Country.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(keysContainer32);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray0 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager1 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray0);
        com.graphhopper.reader.OSMTurnRelation.Type type5 = null;
        com.graphhopper.reader.OSMTurnRelation oSMTurnRelation6 = new com.graphhopper.reader.OSMTurnRelation(0L, (long) '#', (-1L), type5);
        com.graphhopper.routing.util.parsers.TurnCostParser.ExternalInternalMap externalInternalMap7 = null;
        com.graphhopper.storage.Graph graph8 = null;
        encodingManager1.handleTurnRelationTags(oSMTurnRelation6, externalInternalMap7, graph8);
        oSMTurnRelation6.setVehicleTypeRestricted("graphhopper/core");
        long long12 = oSMTurnRelation6.getOsmIdFrom();
        org.junit.Assert.assertNotNull(flagEncoderArray0);
        org.junit.Assert.assertNotNull(encodingManager1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap1 = new com.graphhopper.coll.GHIntLongHashMap(3);
        boolean boolean3 = gHIntLongHashMap1.containsKey(200);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.graphhopper.GraphHopper graphHopper0 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        com.graphhopper.GraphHopper graphHopper2 = graphHopper0.setFlagEncoderFactory(flagEncoderFactory1);
        com.graphhopper.routing.lm.LMPreparationHandler lMPreparationHandler3 = graphHopper0.getLMPreparationHandler();
        lMPreparationHandler3.setPreparationThreads(1687814340);
        com.graphhopper.routing.lm.LMConfig lMConfig6 = null;
        com.graphhopper.routing.lm.LMPreparationHandler lMPreparationHandler7 = lMPreparationHandler3.addLMConfig(lMConfig6);
        java.util.List<com.graphhopper.config.LMProfile> lMProfileList8 = lMPreparationHandler7.getLMProfiles();
        com.graphhopper.routing.lm.LMConfig lMConfig9 = null;
        com.graphhopper.routing.lm.LMPreparationHandler lMPreparationHandler10 = lMPreparationHandler7.addLMConfig(lMConfig9);
        org.junit.Assert.assertNotNull(graphHopper2);
        org.junit.Assert.assertNotNull(lMPreparationHandler3);
        org.junit.Assert.assertNotNull(lMPreparationHandler7);
        org.junit.Assert.assertNotNull(lMProfileList8);
        org.junit.Assert.assertNotNull(lMPreparationHandler10);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.graphhopper.reader.dem.SRTMGL1Provider sRTMGL1Provider1 = new com.graphhopper.reader.dem.SRTMGL1Provider("yes");
        java.lang.String str2 = sRTMGL1Provider1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "srtmgl1" + "'", str2, "srtmgl1");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.graphhopper.routing.util.TraversalMode traversalMode0 = com.graphhopper.routing.util.TraversalMode.EDGE_BASED;
        int int5 = traversalMode0.createTraversalId(21, (int) (byte) 1, (-2), false);
        int int10 = traversalMode0.createTraversalId((-1909399913), (-3), (-4), true);
        org.junit.Assert.assertTrue("'" + traversalMode0 + "' != '" + com.graphhopper.routing.util.TraversalMode.EDGE_BASED + "'", traversalMode0.equals(com.graphhopper.routing.util.TraversalMode.EDGE_BASED));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-7) + "'", int10 == (-7));
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.graphhopper.storage.RAMDirectory rAMDirectory2 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory3 = rAMDirectory2.create();
        java.nio.ByteOrder byteOrder4 = rAMDirectory2.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray5 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager6 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray5);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage8 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory2, encodingManager6, false);
        java.util.List<com.graphhopper.storage.CHConfig> cHConfigList9 = graphHopperStorage8.getCHConfigs();
        com.graphhopper.storage.index.LocationIndex locationIndex10 = null;
        com.graphhopper.util.shapes.GHPoint[] gHPointArray11 = new com.graphhopper.util.shapes.GHPoint[] {};
        java.util.ArrayList<com.graphhopper.util.shapes.GHPoint> gHPointList12 = new java.util.ArrayList<com.graphhopper.util.shapes.GHPoint>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.util.shapes.GHPoint>) gHPointList12, gHPointArray11);
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile15 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str16 = customProfile15.toString();
        com.graphhopper.config.Profile profile19 = customProfile15.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.util.PMap pMap20 = profile19.getHints();
        com.graphhopper.routing.weighting.Weighting weighting21 = null;
        com.graphhopper.routing.util.FiniteWeightFilter finiteWeightFilter22 = new com.graphhopper.routing.util.FiniteWeightFilter(weighting21);
        com.graphhopper.storage.GraphEdgeIdFinder.BlockArea blockArea23 = com.graphhopper.storage.GraphEdgeIdFinder.createBlockArea((com.graphhopper.storage.Graph) graphHopperStorage8, locationIndex10, (java.util.List<com.graphhopper.util.shapes.GHPoint>) gHPointList12, pMap20, (com.graphhopper.routing.util.EdgeFilter) finiteWeightFilter22);
        com.graphhopper.routing.weighting.Weighting weighting24 = null;
        com.graphhopper.storage.RAMDirectory rAMDirectory26 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory27 = rAMDirectory26.create();
        java.nio.ByteOrder byteOrder28 = rAMDirectory26.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess30 = rAMDirectory26.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory31 = rAMDirectory26.create();
        long[] longArray37 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet38 = com.carrotsearch.hppc.LongHashSet.from(longArray37);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray39 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager40 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray39);
        com.graphhopper.storage.GraphBuilder graphBuilder41 = new com.graphhopper.storage.GraphBuilder(encodingManager40);
        boolean boolean42 = longHashSet38.equals((java.lang.Object) encodingManager40);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage45 = new com.graphhopper.storage.GraphHopperStorage(directory31, encodingManager40, false, true);
        com.graphhopper.routing.Path path46 = new com.graphhopper.routing.Path((com.graphhopper.storage.Graph) graphHopperStorage45);
        com.graphhopper.routing.util.EncodingManager encodingManager47 = graphHopperStorage45.getEncodingManager();
        com.graphhopper.storage.NodeAccess nodeAccess48 = graphHopperStorage45.getNodeAccess();
        com.graphhopper.util.PointList pointList49 = null;
        com.graphhopper.storage.ExtendedNodeAccess extendedNodeAccess51 = new com.graphhopper.storage.ExtendedNodeAccess(nodeAccess48, pointList49, 1048576);
        com.graphhopper.routing.weighting.WeightApproximator weightApproximator52 = com.graphhopper.routing.RoutingAlgorithmFactorySimple.getApproximation("_network$turn_cost", pMap20, weighting24, nodeAccess48);
        // The following exception was thrown during execution in test generation
        try {
            double double54 = 0.0; // flaky: nodeAccess48.getLon(100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertNotNull(flagEncoderArray5);
        org.junit.Assert.assertNotNull(encodingManager6);
        org.junit.Assert.assertNotNull(cHConfigList9);
        org.junit.Assert.assertNotNull(gHPointArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str16, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile19);
        org.junit.Assert.assertNotNull(pMap20);
        org.junit.Assert.assertNotNull(blockArea23);
        org.junit.Assert.assertNotNull(directory27);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertNotNull(dataAccess30);
        org.junit.Assert.assertNotNull(directory31);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet38);
        org.junit.Assert.assertNotNull(flagEncoderArray39);
        org.junit.Assert.assertNotNull(encodingManager40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(encodingManager47);
        org.junit.Assert.assertNotNull(nodeAccess48);
        org.junit.Assert.assertNotNull(weightApproximator52);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.graphhopper.GraphHopper graphHopper0 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        com.graphhopper.GraphHopper graphHopper2 = graphHopper0.setFlagEncoderFactory(flagEncoderFactory1);
        com.graphhopper.routing.lm.LMPreparationHandler lMPreparationHandler3 = graphHopper0.getLMPreparationHandler();
        graphHopper0.close();
        com.graphhopper.config.Profile profile6 = graphHopper0.getProfile("1.8");
        com.graphhopper.routing.ch.CHPreparationHandler cHPreparationHandler7 = graphHopper0.getCHPreparationHandler();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = graphHopper0.load("skadi");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot load properties to fetch EncodingManager configuration at: skadi/");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphHopper2);
        org.junit.Assert.assertNotNull(lMPreparationHandler3);
        org.junit.Assert.assertNull(profile6);
        org.junit.Assert.assertNotNull(cHPreparationHandler7);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue1 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        com.graphhopper.util.details.DecimalDetails decimalDetails4 = new com.graphhopper.util.details.DecimalDetails("prepare.ch.log_messages", decimalEncodedValue1, "srtm$turn_cost", (double) 35.0f);
        com.graphhopper.routing.util.parsers.OSMMaxHeightParser oSMMaxHeightParser5 = new com.graphhopper.routing.util.parsers.OSMMaxHeightParser(decimalEncodedValue1);
        org.junit.Assert.assertNotNull(decimalEncodedValue1);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.graphhopper.routing.ch.AStarCHEntry aStarCHEntry5 = new com.graphhopper.routing.ch.AStarCHEntry(1, 200, (int) 'a', Double.NaN, (double) (short) 0);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue0 = com.graphhopper.util.EdgeIteratorState.UNFAVORED_EDGE;
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter1 = com.graphhopper.routing.util.DefaultEdgeFilter.outEdges(booleanEncodedValue0);
        org.junit.Assert.assertNotNull(booleanEncodedValue0);
        org.junit.Assert.assertNotNull(defaultEdgeFilter1);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.graphhopper.routing.util.TestAlgoCollector.OneRun oneRun6 = new com.graphhopper.routing.util.TestAlgoCollector.OneRun((double) (byte) -1, Double.NaN, 0.0d, (double) 52L, (double) 35.0f, 35);
        double double7 = oneRun6.getDistance();
        com.graphhopper.routing.util.TestAlgoCollector.OneRun oneRun12 = oneRun6.add(0.08290859847189744d, 1.0980455852832992E7d, (double) (short) -1, 1048576);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNotNull(oneRun12);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray0 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager1 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray0);
        com.graphhopper.storage.GraphBuilder graphBuilder2 = new com.graphhopper.storage.GraphBuilder(encodingManager1);
        java.util.List<com.graphhopper.storage.CHConfig> cHConfigList3 = null;
        com.graphhopper.storage.GraphBuilder graphBuilder4 = graphBuilder2.setCHConfigs(cHConfigList3);
        com.graphhopper.storage.CHConfig[] cHConfigArray5 = new com.graphhopper.storage.CHConfig[] {};
        java.util.ArrayList<com.graphhopper.storage.CHConfig> cHConfigList6 = new java.util.ArrayList<com.graphhopper.storage.CHConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.storage.CHConfig>) cHConfigList6, cHConfigArray5);
        com.graphhopper.storage.GraphBuilder graphBuilder8 = graphBuilder4.setCHConfigs((java.util.List<com.graphhopper.storage.CHConfig>) cHConfigList6);
        com.graphhopper.storage.RAMDirectory rAMDirectory10 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory11 = rAMDirectory10.create();
        java.nio.ByteOrder byteOrder12 = rAMDirectory10.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray13 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager14 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray13);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage16 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory10, encodingManager14, false);
        boolean boolean17 = rAMDirectory10.isStoring();
        com.graphhopper.storage.DAType dAType19 = null;
        com.graphhopper.storage.Directory directory20 = rAMDirectory10.put("[]", dAType19);
        com.graphhopper.storage.GraphBuilder graphBuilder21 = graphBuilder4.setDir(directory20);
        org.junit.Assert.assertNotNull(flagEncoderArray0);
        org.junit.Assert.assertNotNull(encodingManager1);
        org.junit.Assert.assertNotNull(graphBuilder4);
        org.junit.Assert.assertNotNull(cHConfigArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(graphBuilder8);
        org.junit.Assert.assertNotNull(directory11);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertNotNull(flagEncoderArray13);
        org.junit.Assert.assertNotNull(encodingManager14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(directory20);
        org.junit.Assert.assertNotNull(graphBuilder21);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray0 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager1 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray0);
        com.graphhopper.storage.GraphBuilder graphBuilder2 = new com.graphhopper.storage.GraphBuilder(encodingManager1);
        java.util.List<com.graphhopper.storage.CHConfig> cHConfigList3 = null;
        com.graphhopper.storage.GraphBuilder graphBuilder4 = graphBuilder2.setCHConfigs(cHConfigList3);
        com.graphhopper.storage.CHConfig[] cHConfigArray5 = new com.graphhopper.storage.CHConfig[] {};
        java.util.ArrayList<com.graphhopper.storage.CHConfig> cHConfigList6 = new java.util.ArrayList<com.graphhopper.storage.CHConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.storage.CHConfig>) cHConfigList6, cHConfigArray5);
        com.graphhopper.storage.GraphBuilder graphBuilder8 = graphBuilder4.setCHConfigs((java.util.List<com.graphhopper.storage.CHConfig>) cHConfigList6);
        com.graphhopper.storage.GraphBuilder graphBuilder10 = graphBuilder4.set3D(true);
        org.junit.Assert.assertNotNull(flagEncoderArray0);
        org.junit.Assert.assertNotNull(encodingManager1);
        org.junit.Assert.assertNotNull(graphBuilder4);
        org.junit.Assert.assertNotNull(cHConfigArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(graphBuilder8);
        org.junit.Assert.assertNotNull(graphBuilder10);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.graphhopper.GraphHopper graphHopper0 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        com.graphhopper.GraphHopper graphHopper2 = graphHopper0.setFlagEncoderFactory(flagEncoderFactory1);
        com.graphhopper.routing.util.EncodingManager encodingManager3 = graphHopper2.getEncodingManager();
        com.graphhopper.GraphHopper graphHopper5 = graphHopper2.setElevationWayPointMaxDistance((double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.GraphHopperStorage graphHopperStorage6 = graphHopper2.getGraphHopperStorage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: GraphHopper storage not initialized");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphHopper2);
        org.junit.Assert.assertNull(encodingManager3);
        org.junit.Assert.assertNotNull(graphHopper5);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        com.graphhopper.reader.dem.CGIARProvider cGIARProvider0 = new com.graphhopper.reader.dem.CGIARProvider();
        cGIARProvider0.release();
        com.graphhopper.reader.dem.ElevationProvider elevationProvider3 = cGIARProvider0.setBaseURL("prepare.ch.edge.edge_quotient_weight");
        elevationProvider3.release();
        org.junit.Assert.assertNotNull(elevationProvider3);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        com.graphhopper.routing.ev.SimpleBooleanEncodedValue simpleBooleanEncodedValue29 = new com.graphhopper.routing.ev.SimpleBooleanEncodedValue("srtm");
        com.graphhopper.util.details.BooleanDetails booleanDetails30 = new com.graphhopper.util.details.BooleanDetails("....      ", (com.graphhopper.routing.ev.BooleanEncodedValue) simpleBooleanEncodedValue29);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState32 = virtualEdgeIteratorState11.set((com.graphhopper.routing.ev.IntEncodedValue) simpleBooleanEncodedValue29, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: EncodedValue srtm not initialized");
        } catch (java.lang.IllegalStateException e) {
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
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        java.io.DataInputStream dataInputStream0 = null;
        com.graphhopper.reader.osm.pbf.PbfStreamSplitter pbfStreamSplitter1 = new com.graphhopper.reader.osm.pbf.PbfStreamSplitter(dataInputStream0);
        pbfStreamSplitter1.release();
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.graphhopper.util.DistanceCalc distanceCalc0 = com.graphhopper.util.DistanceCalcEarth.DIST_EARTH;
        boolean boolean7 = distanceCalc0.validEdgeDistance(1.6672976447024059E7d, (double) 10L, (double) 200, 21.0d, 0.0d, (double) 0L);
        org.junit.Assert.assertNotNull(distanceCalc0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser oSMHazmatTunnelParser0 = new com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser();
        com.graphhopper.storage.RAMDirectory rAMDirectory2 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory3 = rAMDirectory2.create();
        java.nio.ByteOrder byteOrder4 = rAMDirectory2.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray5 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager6 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray5);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage8 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory2, encodingManager6, false);
        java.util.List<com.graphhopper.storage.CHConfig> cHConfigList9 = graphHopperStorage8.getCHConfigs();
        com.graphhopper.routing.util.EncodingManager encodingManager10 = graphHopperStorage8.getEncodingManager();
        java.lang.String str11 = encodingManager10.toString();
        java.util.List<com.graphhopper.routing.ev.EncodedValue> encodedValueList12 = null;
        // The following exception was thrown during execution in test generation
        try {
            oSMHazmatTunnelParser0.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager10, encodedValueList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertNotNull(flagEncoderArray5);
        org.junit.Assert.assertNotNull(encodingManager6);
        org.junit.Assert.assertNotNull(cHConfigList9);
        org.junit.Assert.assertNotNull(encodingManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.graphhopper.routing.util.PriorityCode priorityCode0 = com.graphhopper.routing.util.PriorityCode.REACH_DEST;
        org.junit.Assert.assertTrue("'" + priorityCode0 + "' != '" + com.graphhopper.routing.util.PriorityCode.REACH_DEST + "'", priorityCode0.equals(com.graphhopper.routing.util.PriorityCode.REACH_DEST));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.graphhopper.GraphHopper graphHopper0 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        com.graphhopper.GraphHopper graphHopper2 = graphHopper0.setFlagEncoderFactory(flagEncoderFactory1);
        com.graphhopper.routing.lm.LMPreparationHandler lMPreparationHandler3 = graphHopper0.getLMPreparationHandler();
        boolean boolean4 = lMPreparationHandler3.hasLMProfiles();
        java.util.List<com.graphhopper.routing.lm.LMConfig> lMConfigList5 = lMPreparationHandler3.getLMConfigs();
        java.util.List<com.graphhopper.routing.lm.PrepareLandmarks> prepareLandmarksList6 = lMPreparationHandler3.getPreparations();
        int int7 = lMPreparationHandler3.size();
        org.junit.Assert.assertNotNull(graphHopper2);
        org.junit.Assert.assertNotNull(lMPreparationHandler3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(lMConfigList5);
        org.junit.Assert.assertNotNull(prepareLandmarksList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        java.util.List<com.graphhopper.util.EdgeIteratorState> edgeIteratorStateList24 = path21.calcEdges();
        path21.addEdge(0);
        com.graphhopper.routing.Path path28 = path21.setEndNode(4);
        com.graphhopper.routing.Path path30 = path28.setFound(false);
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
        org.junit.Assert.assertNotNull(edgeIteratorStateList24);
        org.junit.Assert.assertNotNull(path28);
        org.junit.Assert.assertNotNull(path30);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.graphhopper.util.DistancePlaneProjection distancePlaneProjection0 = com.graphhopper.util.DistancePlaneProjection.DIST_PLANE;
        java.lang.String str1 = distancePlaneProjection0.toString();
        double double6 = distancePlaneProjection0.calcNormalizedDist((double) '#', 3.394751250354173E7d, (double) 52L, Double.NaN);
        java.lang.String str7 = distancePlaneProjection0.toString();
        org.junit.Assert.assertNotNull(distancePlaneProjection0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PLANE_PROJ" + "'", str1, "PLANE_PROJ");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PLANE_PROJ" + "'", str7, "PLANE_PROJ");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.graphhopper.storage.VLongStorage vLongStorage1 = new com.graphhopper.storage.VLongStorage((int) '4');
        vLongStorage1.seek((long) (byte) 10);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        int[] intArray2 = new int[] { 21, 10 };
        com.carrotsearch.hppc.IntHashSet intHashSet3 = com.graphhopper.coll.GHIntHashSet.from(intArray2);
        intHashSet3.release();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[21, 10]");
        org.junit.Assert.assertNotNull(intHashSet3);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        virtualEdgeIteratorState11.setUnfavored(true);
        int int14 = virtualEdgeIteratorState11.getOriginalEdgeKey();
        virtualEdgeIteratorState11.setUnfavored(true);
        com.graphhopper.routing.util.spatialrules.SpatialRuleLookup spatialRuleLookup17 = com.graphhopper.routing.util.spatialrules.SpatialRuleLookup.EMPTY;
        com.graphhopper.storage.IntsRef intsRef20 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState26 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef20, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int27 = edgeIteratorState26.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue28 = com.graphhopper.routing.ev.Country.create();
        boolean boolean29 = countryEnumEncodedValue28.isStoreTwoDirections();
        com.graphhopper.routing.ev.Country country30 = edgeIteratorState26.getReverse(countryEnumEncodedValue28);
        com.graphhopper.routing.util.parsers.SpatialRuleParser spatialRuleParser31 = new com.graphhopper.routing.util.parsers.SpatialRuleParser(spatialRuleLookup17, (com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue28);
        boolean boolean32 = countryEnumEncodedValue28.isStoreTwoDirections();
        int int33 = virtualEdgeIteratorState11.get((com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue28);
        int int34 = virtualEdgeIteratorState11.getEdge();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1048576 + "'", int14 == 1048576);
        org.junit.Assert.assertNotNull(spatialRuleLookup17);
        org.junit.Assert.assertNotNull(edgeIteratorState26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + country30 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country30.equals(com.graphhopper.routing.ev.Country.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.graphhopper.util.DistanceCalc3D distanceCalc3D0 = new com.graphhopper.util.DistanceCalc3D();
        double double7 = distanceCalc3D0.calcDist(1.0E-5d, (double) (short) 100, 4.0024076802712575E7d, (double) (byte) 100, (double) 100L, (double) (short) 10);
        double double9 = distanceCalc3D0.calcDenormalizedDist(21.0d);
        double double16 = distanceCalc3D0.calcDist(1.0980455852832992E7d, (double) 200, (double) 0L, (double) (byte) -1, (double) 2L, (double) 52L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.1539968895200975E7d + "'", double7 == 4.1539968895200975E7d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9499833.189512674d + "'", double16 == 9499833.189512674d);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        com.graphhopper.util.PathMerger pathMerger26 = pathMerger24.setEnableInstructions(false);
        com.graphhopper.util.PathMerger pathMerger28 = pathMerger24.setSimplifyResponse(true);
        com.graphhopper.GraphHopper graphHopper29 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory30 = null;
        com.graphhopper.GraphHopper graphHopper31 = graphHopper29.setFlagEncoderFactory(flagEncoderFactory30);
        com.graphhopper.storage.RAMDirectory rAMDirectory33 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory34 = rAMDirectory33.create();
        java.nio.ByteOrder byteOrder35 = rAMDirectory33.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess37 = rAMDirectory33.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory38 = rAMDirectory33.create();
        long[] longArray44 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet45 = com.carrotsearch.hppc.LongHashSet.from(longArray44);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray46 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager47 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray46);
        com.graphhopper.storage.GraphBuilder graphBuilder48 = new com.graphhopper.storage.GraphBuilder(encodingManager47);
        boolean boolean49 = longHashSet45.equals((java.lang.Object) encodingManager47);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage52 = new com.graphhopper.storage.GraphHopperStorage(directory38, encodingManager47, false, true);
        com.graphhopper.routing.Path path53 = new com.graphhopper.routing.Path((com.graphhopper.storage.Graph) graphHopperStorage52);
        com.graphhopper.routing.Path path55 = path53.addTime((long) (byte) 100);
        long[] longArray61 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet62 = com.carrotsearch.hppc.LongHashSet.from(longArray61);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray63 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager64 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray63);
        com.graphhopper.storage.GraphBuilder graphBuilder65 = new com.graphhopper.storage.GraphBuilder(encodingManager64);
        boolean boolean66 = longHashSet62.equals((java.lang.Object) encodingManager64);
        com.graphhopper.routing.weighting.Weighting weighting67 = null;
        com.graphhopper.storage.RAMDirectory rAMDirectory69 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory70 = rAMDirectory69.create();
        java.nio.ByteOrder byteOrder71 = rAMDirectory69.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray72 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager73 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray72);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage75 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory69, encodingManager73, false);
        java.util.List<java.lang.String> strList76 = graphHopperStorage75.getCHGraphNames();
        com.graphhopper.util.details.PathDetailsBuilderFactory pathDetailsBuilderFactory77 = new com.graphhopper.util.details.PathDetailsBuilderFactory();
        java.util.Map<java.lang.String, java.util.List<com.graphhopper.util.details.PathDetail>> strMap79 = com.graphhopper.util.details.PathDetailsFromEdges.calcDetails(path53, (com.graphhopper.routing.ev.EncodedValueLookup) encodingManager64, weighting67, strList76, pathDetailsBuilderFactory77, (int) ' ');
        com.graphhopper.GraphHopper graphHopper80 = graphHopper31.setPathDetailsBuilderFactory(pathDetailsBuilderFactory77);
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue83 = new com.graphhopper.routing.ev.StringEncodedValue("bike_network", 10);
        java.util.List<java.lang.String> strList84 = stringEncodedValue83.getValues();
        com.graphhopper.util.PathMerger pathMerger85 = pathMerger24.setPathDetailsBuilders(pathDetailsBuilderFactory77, strList84);
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
        org.junit.Assert.assertNotNull(pathMerger26);
        org.junit.Assert.assertNotNull(pathMerger28);
        org.junit.Assert.assertNotNull(graphHopper31);
        org.junit.Assert.assertNotNull(directory34);
        org.junit.Assert.assertNotNull(byteOrder35);
        org.junit.Assert.assertNotNull(dataAccess37);
        org.junit.Assert.assertNotNull(directory38);
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet45);
        org.junit.Assert.assertNotNull(flagEncoderArray46);
        org.junit.Assert.assertNotNull(encodingManager47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(path55);
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet62);
        org.junit.Assert.assertNotNull(flagEncoderArray63);
        org.junit.Assert.assertNotNull(encodingManager64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(directory70);
        org.junit.Assert.assertNotNull(byteOrder71);
        org.junit.Assert.assertNotNull(flagEncoderArray72);
        org.junit.Assert.assertNotNull(encodingManager73);
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertNotNull(strMap79);
        org.junit.Assert.assertNotNull(graphHopper80);
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertNotNull(pathMerger85);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.graphhopper.routing.ch.CHRoutingAlgorithmFactory cHRoutingAlgorithmFactory0 = null;
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile2 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str3 = customProfile2.toString();
        com.graphhopper.config.Profile profile6 = customProfile2.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.util.PMap pMap7 = profile6.getHints();
        com.graphhopper.routing.CHPathCalculator cHPathCalculator8 = new com.graphhopper.routing.CHPathCalculator(cHRoutingAlgorithmFactory0, pMap7);
        int int9 = cHPathCalculator8.getVisitedNodes();
        com.graphhopper.routing.EdgeRestrictions edgeRestrictions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.graphhopper.routing.Path> pathList13 = cHPathCalculator8.calcPaths((int) (byte) 10, 20, edgeRestrictions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str3, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile6);
        org.junit.Assert.assertNotNull(pMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        com.graphhopper.util.shapes.BBox bBox1 = com.graphhopper.util.shapes.BBox.createInverse(false);
        org.junit.Assert.assertNotNull(bBox1);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap3 = new com.graphhopper.coll.OSMIDMap(directory2);
        com.graphhopper.search.StringIndex stringIndex5 = new com.graphhopper.search.StringIndex(directory2, 10);
        com.graphhopper.storage.RAMDirectory rAMDirectory7 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory8 = rAMDirectory7.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap9 = new com.graphhopper.coll.OSMIDMap(directory8);
        com.graphhopper.search.StringIndex stringIndex11 = new com.graphhopper.search.StringIndex(directory8, 10);
        stringIndex5.copyTo(stringIndex11);
        com.graphhopper.storage.RAMDirectory rAMDirectory14 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory15 = rAMDirectory14.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap16 = new com.graphhopper.coll.OSMIDMap(directory15);
        com.graphhopper.search.StringIndex stringIndex18 = new com.graphhopper.search.StringIndex(directory15, 10);
        com.graphhopper.storage.RAMDirectory rAMDirectory20 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory21 = rAMDirectory20.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap22 = new com.graphhopper.coll.OSMIDMap(directory21);
        com.graphhopper.search.StringIndex stringIndex24 = new com.graphhopper.search.StringIndex(directory21, 10);
        stringIndex18.copyTo(stringIndex24);
        stringIndex11.copyTo(stringIndex24);
        stringIndex11.close();
        com.graphhopper.search.StringIndex stringIndex29 = stringIndex11.create(5L);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.search.StringIndex stringIndex31 = stringIndex11.create((long) (-791814527));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalThreadStateException; message: already created");
        } catch (java.lang.IllegalThreadStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(directory8);
        org.junit.Assert.assertNotNull(directory15);
        org.junit.Assert.assertNotNull(directory21);
        org.junit.Assert.assertNotNull(stringIndex29);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        boolean boolean0 = com.graphhopper.util.Constants.JRE_IS_MINIMUM_JAVA9;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        double double24 = path21.getWeight();
        com.graphhopper.routing.Path path26 = path21.setFromNode((int) (short) 0);
        com.carrotsearch.hppc.IntIndexedContainer intIndexedContainer27 = path21.calcNodes();
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.7976931348623157E308d + "'", double24 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(path26);
        org.junit.Assert.assertNotNull(intIndexedContainer27);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        com.graphhopper.storage.IntsRef intsRef2 = com.graphhopper.storage.IntsRef.EMPTY;
        com.graphhopper.util.EdgeIteratorState edgeIteratorState3 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 35.0f, intsRef2);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState9 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) (byte) 10, intsRef2, (int) (short) 100, (-1), (int) (byte) 100, (int) (short) 0, 20);
        com.graphhopper.storage.IntsRef intsRef10 = edgeIteratorState9.getFlags();
        org.junit.Assert.assertNotNull(intsRef2);
        org.junit.Assert.assertNotNull(edgeIteratorState3);
        org.junit.Assert.assertNotNull(edgeIteratorState9);
        org.junit.Assert.assertNotNull(intsRef10);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        java.lang.String str22 = graphHopperStorage20.toDetailsString();
        com.graphhopper.util.EdgeExplorer edgeExplorer23 = graphHopperStorage20.createEdgeExplorer();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage25 = graphHopperStorage20.create((long) 200);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "edges:0(0MB), nodes:0(0MB), name:(0MB), geo:0(0MB), bounds:1.7976931348623157E308,-1.7976931348623157E308,1.7976931348623157E308,-1.7976931348623157E308" + "'", str22, "edges:0(0MB), nodes:0(0MB), name:(0MB), geo:0(0MB), bounds:1.7976931348623157E308,-1.7976931348623157E308,1.7976931348623157E308,-1.7976931348623157E308");
        org.junit.Assert.assertNotNull(edgeExplorer23);
        org.junit.Assert.assertNotNull(graphHopperStorage25);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        java.util.Locale locale0 = null;
        com.graphhopper.util.TranslationMap.TranslationHashMap translationHashMap1 = new com.graphhopper.util.TranslationMap.TranslationHashMap(locale0);
        translationHashMap1.clear();
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.LITTLE;
        byte[] byteArray2 = bitUtil0.fromBitString("bike");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl4 = new com.graphhopper.coll.GHBitSetImpl();
        gHBitSetImpl4.remove((int) (short) 10);
        byte[] byteArray7 = gHBitSetImpl4.toByteArray();
        com.graphhopper.reader.osm.pbf.PbfRawBlob pbfRawBlob8 = new com.graphhopper.reader.osm.pbf.PbfRawBlob("prepare.ch.updates.lazy", byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            bitUtil0.fromFloat(byteArray7, (float) 200L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-16]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.storage.CHConfig cHConfig2 = com.graphhopper.storage.CHConfig.edgeBased("foot_network", weighting1);
        com.graphhopper.routing.weighting.Weighting weighting3 = cHConfig2.getWeighting();
        java.lang.String str4 = cHConfig2.toFileName();
        int[] intArray5 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet6 = com.graphhopper.coll.GHIntHashSet.from(intArray5);
        com.graphhopper.routing.ch.NodeOrderingProvider nodeOrderingProvider7 = com.graphhopper.routing.ch.NodeOrderingProvider.fromArray(intArray5);
        boolean boolean8 = cHConfig2.equals((java.lang.Object) nodeOrderingProvider7);
        org.junit.Assert.assertNotNull(cHConfig2);
        org.junit.Assert.assertNull(weighting3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foot_network" + "'", str4, "foot_network");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intHashSet6);
        org.junit.Assert.assertNotNull(nodeOrderingProvider7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.SimpleBooleanEncodedValue simpleBooleanEncodedValue2 = new com.graphhopper.routing.ev.SimpleBooleanEncodedValue("-1 (1) weight: 2.0, incEdge: 10", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue name wasn't valid: -1 (1) weight: 2.0, incEdge: 10. Use lower case letters, underscore and numbers only.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.graphhopper.util.DistancePlaneProjection distancePlaneProjection0 = com.graphhopper.util.DistancePlaneProjection.DIST_PLANE;
        java.lang.String str1 = distancePlaneProjection0.toString();
        java.lang.String str2 = distancePlaneProjection0.toString();
        org.junit.Assert.assertNotNull(distancePlaneProjection0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PLANE_PROJ" + "'", str1, "PLANE_PROJ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PLANE_PROJ" + "'", str2, "PLANE_PROJ");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        java.util.Calendar calendar0 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "_network$turn_cost", "", "", "5.4.0-70-generic", "bike_network", "3.0", "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}", "prepare.ch.edge.witness_search.sigma_factor", "3.0" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "bike", "prepare.ch.edge.witness_search.reset_interval", "_network", "prepare.ch.edge.witness_search.sigma_factor", "foot", "srtm", "_network$turn_cost", "prepare.ch.node.original_edge_count_weight", "foot_network", "foot_network", "prepare.ch.log_messages", "3.0", "", "secondary", "secondary", "hi!", "00001010000010100000101001100100", "1.8", "bike", "prepare.ch.edge.witness_search.sigma_factor", "hike_rating", "prepare.ch.edge.witness_search.reset_interval" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        java.lang.String[] strArray57 = new java.lang.String[] { "3.0", "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}", "prepare.ch.updates.lazy", "secondary", "foot", "srtm", "foot", "bike_network", "foot_network", "prepare.ch.log_messages", "", "00001010000010100000101001100100", "hi!", "prepare.ch.node.original_edge_count_weight", "1.8", "_network$turn_cost", "5.4.0-70-generic", "horse_rating" };
        java.util.LinkedHashSet<java.lang.String> strSet58 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet58, strArray57);
        com.graphhopper.reader.osm.conditional.ConditionalOSMTagInspector conditionalOSMTagInspector60 = new com.graphhopper.reader.osm.conditional.ConditionalOSMTagInspector(calendar0, (java.util.List<java.lang.String>) strList11, (java.util.Set<java.lang.String>) strSet37, (java.util.Set<java.lang.String>) strSet58);
        com.graphhopper.reader.osm.conditional.ConditionalParser conditionalParser62 = new com.graphhopper.reader.osm.conditional.ConditionalParser((java.util.Set<java.lang.String>) strSet37, true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
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
        int int24 = path21.getEndNode();
        com.graphhopper.routing.Path path26 = path21.setFromNode(2);
        com.graphhopper.routing.Path path28 = path21.setWeight((double) 0L);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(path26);
        org.junit.Assert.assertNotNull(path28);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        long[] longArray5 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet6 = com.carrotsearch.hppc.LongHashSet.from(longArray5);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray7 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager8 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray7);
        com.graphhopper.storage.GraphBuilder graphBuilder9 = new com.graphhopper.storage.GraphBuilder(encodingManager8);
        boolean boolean10 = longHashSet6.equals((java.lang.Object) encodingManager8);
        java.lang.String str11 = encodingManager8.toFlagEncodersAsString();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue13 = encodingManager8.getDecimalEncodedValue("FOUND 0 ERRORS.\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot find EncodedValue FOUND 0 ERRORS.? in collection: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet6);
        org.junit.Assert.assertNotNull(flagEncoderArray7);
        org.junit.Assert.assertNotNull(encodingManager8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        double double0 = com.graphhopper.reader.dem.ElevationInterpolator.EPSILON2;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0000000000000002E-10d + "'", double0 == 1.0000000000000002E-10d);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.graphhopper.routing.ch.CHPreparationHandler cHPreparationHandler0 = new com.graphhopper.routing.ch.CHPreparationHandler();
        com.graphhopper.config.CHProfile[] cHProfileArray1 = new com.graphhopper.config.CHProfile[] {};
        java.util.ArrayList<com.graphhopper.config.CHProfile> cHProfileList2 = new java.util.ArrayList<com.graphhopper.config.CHProfile>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.config.CHProfile>) cHProfileList2, cHProfileArray1);
        com.graphhopper.routing.ch.CHPreparationHandler cHPreparationHandler4 = cHPreparationHandler0.setCHProfiles((java.util.Collection<com.graphhopper.config.CHProfile>) cHProfileList2);
        boolean boolean5 = cHPreparationHandler0.isEnabled();
        org.junit.Assert.assertNotNull(cHProfileArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cHPreparationHandler4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        com.graphhopper.util.TranslationMap translationMap0 = new com.graphhopper.util.TranslationMap();
        java.util.Locale locale1 = null;
        com.graphhopper.util.TranslationMap.TranslationHashMap translationHashMap2 = new com.graphhopper.util.TranslationMap.TranslationHashMap(locale1);
        // The following exception was thrown during execution in test generation
        try {
            translationMap0.add((com.graphhopper.util.Translation) translationHashMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap1 = new com.graphhopper.coll.GHIntLongHashMap((int) (byte) 1);
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap3 = new com.graphhopper.coll.GHIntLongHashMap((int) (byte) 1);
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = gHIntLongHashMap3.clone();
        int int5 = gHIntLongHashMap1.putAll((com.carrotsearch.hppc.IntLongAssociativeContainer) gHIntLongHashMap3);
        long[] longArray11 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet12 = com.carrotsearch.hppc.LongHashSet.from(longArray11);
        gHIntLongHashMap3.values = longArray11;
        java.util.BitSet bitSet14 = java.util.BitSet.valueOf(longArray11);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue16 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        com.graphhopper.util.details.DecimalDetails decimalDetails19 = new com.graphhopper.util.details.DecimalDetails("prepare.ch.log_messages", decimalEncodedValue16, "srtm$turn_cost", (double) 35.0f);
        com.graphhopper.routing.util.parsers.OSMMaxHeightParser oSMMaxHeightParser20 = new com.graphhopper.routing.util.parsers.OSMMaxHeightParser(decimalEncodedValue16);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue22 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        com.graphhopper.util.details.DecimalDetails decimalDetails25 = new com.graphhopper.util.details.DecimalDetails("prepare.ch.log_messages", decimalEncodedValue22, "srtm$turn_cost", (double) 35.0f);
        com.graphhopper.routing.util.parsers.OSMMaxHeightParser oSMMaxHeightParser26 = new com.graphhopper.routing.util.parsers.OSMMaxHeightParser(decimalEncodedValue22);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue27 = null;
        com.graphhopper.routing.util.parsers.OSMMaxHeightParser oSMMaxHeightParser28 = new com.graphhopper.routing.util.parsers.OSMMaxHeightParser(decimalEncodedValue27);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue29 = null;
        com.graphhopper.routing.util.parsers.OSMMaxHeightParser oSMMaxHeightParser30 = new com.graphhopper.routing.util.parsers.OSMMaxHeightParser(decimalEncodedValue29);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue31 = null;
        com.graphhopper.routing.util.parsers.OSMMaxHeightParser oSMMaxHeightParser32 = new com.graphhopper.routing.util.parsers.OSMMaxHeightParser(decimalEncodedValue31);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue34 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        com.graphhopper.util.details.DecimalDetails decimalDetails37 = new com.graphhopper.util.details.DecimalDetails("prepare.ch.log_messages", decimalEncodedValue34, "srtm$turn_cost", (double) 35.0f);
        com.graphhopper.routing.util.parsers.OSMMaxHeightParser oSMMaxHeightParser38 = new com.graphhopper.routing.util.parsers.OSMMaxHeightParser(decimalEncodedValue34);
        com.graphhopper.routing.util.parsers.OSMMaxHeightParser[] oSMMaxHeightParserArray39 = new com.graphhopper.routing.util.parsers.OSMMaxHeightParser[] { oSMMaxHeightParser20, oSMMaxHeightParser26, oSMMaxHeightParser28, oSMMaxHeightParser30, oSMMaxHeightParser32, oSMMaxHeightParser38 };
        // The following exception was thrown during execution in test generation
        try {
            com.carrotsearch.hppc.LongObjectHashMap<com.graphhopper.routing.util.parsers.OSMMaxHeightParser> oSMMaxHeightParserLongObjectHashMap40 = com.carrotsearch.hppc.LongObjectHashMap.from(longArray11, oSMMaxHeightParserArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arrays of keys and values must have an identical length.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet12);
        org.junit.Assert.assertNotNull(bitSet14);
        org.junit.Assert.assertEquals(bitSet14.toString(), "{1, 3, 32, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 130, 133, 134, 194, 197, 198, 257, 258, 259, 260, 261, 262, 263, 264, 265, 266, 267, 268, 269, 270, 271, 272, 273, 274, 275, 276, 277, 278, 279, 280, 281, 282, 283, 284, 285, 286, 287, 288, 289, 290, 291, 292, 293, 294, 295, 296, 297, 298, 299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310, 311, 312, 313, 314, 315, 316, 317, 318, 319}");
        org.junit.Assert.assertNotNull(decimalEncodedValue16);
        org.junit.Assert.assertNotNull(decimalEncodedValue22);
        org.junit.Assert.assertNotNull(decimalEncodedValue34);
        org.junit.Assert.assertNotNull(oSMMaxHeightParserArray39);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        com.graphhopper.routing.util.AllEdgesIterator allEdgesIterator21 = graphHopperStorage20.getAllEdges();
        java.util.List<java.lang.Integer> intList22 = com.graphhopper.util.GHUtility.getEdgeIds((com.graphhopper.util.EdgeIterator) allEdgesIterator21);
        com.graphhopper.routing.ev.SimpleBooleanEncodedValue simpleBooleanEncodedValue24 = new com.graphhopper.routing.ev.SimpleBooleanEncodedValue("srtm");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState27 = allEdgesIterator21.set((com.graphhopper.routing.ev.BooleanEncodedValue) simpleBooleanEncodedValue24, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue srtm supports only one direction");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(allEdgesIterator21);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        com.graphhopper.storage.RAMDirectory rAMDirectory2 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory3 = rAMDirectory2.create();
        java.nio.ByteOrder byteOrder4 = rAMDirectory2.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray5 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager6 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray5);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage8 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory2, encodingManager6, false);
        java.util.List<com.graphhopper.storage.CHConfig> cHConfigList9 = graphHopperStorage8.getCHConfigs();
        com.graphhopper.storage.index.LocationIndex locationIndex10 = null;
        com.graphhopper.util.shapes.GHPoint[] gHPointArray11 = new com.graphhopper.util.shapes.GHPoint[] {};
        java.util.ArrayList<com.graphhopper.util.shapes.GHPoint> gHPointList12 = new java.util.ArrayList<com.graphhopper.util.shapes.GHPoint>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.util.shapes.GHPoint>) gHPointList12, gHPointArray11);
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile15 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str16 = customProfile15.toString();
        com.graphhopper.config.Profile profile19 = customProfile15.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.util.PMap pMap20 = profile19.getHints();
        com.graphhopper.routing.weighting.Weighting weighting21 = null;
        com.graphhopper.routing.util.FiniteWeightFilter finiteWeightFilter22 = new com.graphhopper.routing.util.FiniteWeightFilter(weighting21);
        com.graphhopper.storage.GraphEdgeIdFinder.BlockArea blockArea23 = com.graphhopper.storage.GraphEdgeIdFinder.createBlockArea((com.graphhopper.storage.Graph) graphHopperStorage8, locationIndex10, (java.util.List<com.graphhopper.util.shapes.GHPoint>) gHPointList12, pMap20, (com.graphhopper.routing.util.EdgeFilter) finiteWeightFilter22);
        com.graphhopper.routing.weighting.Weighting weighting24 = null;
        com.graphhopper.storage.RAMDirectory rAMDirectory26 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory27 = rAMDirectory26.create();
        java.nio.ByteOrder byteOrder28 = rAMDirectory26.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess30 = rAMDirectory26.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory31 = rAMDirectory26.create();
        long[] longArray37 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet38 = com.carrotsearch.hppc.LongHashSet.from(longArray37);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray39 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager40 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray39);
        com.graphhopper.storage.GraphBuilder graphBuilder41 = new com.graphhopper.storage.GraphBuilder(encodingManager40);
        boolean boolean42 = longHashSet38.equals((java.lang.Object) encodingManager40);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage45 = new com.graphhopper.storage.GraphHopperStorage(directory31, encodingManager40, false, true);
        com.graphhopper.routing.Path path46 = new com.graphhopper.routing.Path((com.graphhopper.storage.Graph) graphHopperStorage45);
        com.graphhopper.routing.util.EncodingManager encodingManager47 = graphHopperStorage45.getEncodingManager();
        com.graphhopper.storage.NodeAccess nodeAccess48 = graphHopperStorage45.getNodeAccess();
        com.graphhopper.util.PointList pointList49 = null;
        com.graphhopper.storage.ExtendedNodeAccess extendedNodeAccess51 = new com.graphhopper.storage.ExtendedNodeAccess(nodeAccess48, pointList49, 1048576);
        com.graphhopper.routing.weighting.WeightApproximator weightApproximator52 = com.graphhopper.routing.RoutingAlgorithmFactorySimple.getApproximation("_network$turn_cost", pMap20, weighting24, nodeAccess48);
        com.graphhopper.routing.weighting.BalancedWeightApproximator balancedWeightApproximator53 = new com.graphhopper.routing.weighting.BalancedWeightApproximator(weightApproximator52);
        com.graphhopper.routing.weighting.WeightApproximator weightApproximator54 = balancedWeightApproximator53.getApproximation();
        org.junit.Assert.assertNotNull(directory3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertNotNull(flagEncoderArray5);
        org.junit.Assert.assertNotNull(encodingManager6);
        org.junit.Assert.assertNotNull(cHConfigList9);
        org.junit.Assert.assertNotNull(gHPointArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str16, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile19);
        org.junit.Assert.assertNotNull(pMap20);
        org.junit.Assert.assertNotNull(blockArea23);
        org.junit.Assert.assertNotNull(directory27);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertNotNull(dataAccess30);
        org.junit.Assert.assertNotNull(directory31);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet38);
        org.junit.Assert.assertNotNull(flagEncoderArray39);
        org.junit.Assert.assertNotNull(encodingManager40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(encodingManager47);
        org.junit.Assert.assertNotNull(nodeAccess48);
        org.junit.Assert.assertNotNull(weightApproximator52);
        org.junit.Assert.assertNotNull(weightApproximator54);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        com.graphhopper.GraphHopper graphHopper0 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        com.graphhopper.GraphHopper graphHopper2 = graphHopper0.setFlagEncoderFactory(flagEncoderFactory1);
        com.graphhopper.routing.lm.LMPreparationHandler lMPreparationHandler3 = graphHopper0.getLMPreparationHandler();
        lMPreparationHandler3.setPreparationThreads(1687814340);
        com.graphhopper.routing.lm.LMConfig lMConfig6 = null;
        com.graphhopper.routing.lm.LMPreparationHandler lMPreparationHandler7 = lMPreparationHandler3.addLMConfig(lMConfig6);
        com.graphhopper.storage.RAMDirectory rAMDirectory9 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory10 = rAMDirectory9.create();
        java.nio.ByteOrder byteOrder11 = rAMDirectory9.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray12 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager13 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray12);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage15 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory9, encodingManager13, false);
        com.graphhopper.storage.index.LocationIndex locationIndex16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lMPreparationHandler7.createPreparations(graphHopperStorage15, locationIndex16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphHopper2);
        org.junit.Assert.assertNotNull(lMPreparationHandler3);
        org.junit.Assert.assertNotNull(lMPreparationHandler7);
        org.junit.Assert.assertNotNull(directory10);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(flagEncoderArray12);
        org.junit.Assert.assertNotNull(encodingManager13);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.graphhopper.reader.dem.SRTMProvider sRTMProvider1 = new com.graphhopper.reader.dem.SRTMProvider("prepare.ch.updates.lazy");
        java.lang.String str2 = sRTMProvider1.toString();
        java.lang.String str3 = sRTMProvider1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "srtm" + "'", str2, "srtm");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "srtm" + "'", str3, "srtm");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) -1 };
        com.graphhopper.reader.osm.pbf.PbfBlobDecoderListener pbfBlobDecoderListener16 = null;
        com.graphhopper.reader.osm.pbf.PbfBlobDecoder pbfBlobDecoder17 = new com.graphhopper.reader.osm.pbf.PbfBlobDecoder("max_length", byteArray15, pbfBlobDecoderListener16);
        boolean boolean18 = intsRef6.equals((java.lang.Object) pbfBlobDecoder17);
        com.graphhopper.storage.IntsRef intsRef20 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean21 = intsRef20.isEmpty();
        com.graphhopper.storage.IntsRef intsRef23 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int24 = intsRef20.compareTo(intsRef23);
        boolean boolean25 = intsRef20.isValid();
        boolean boolean26 = intsRef6.intsEquals(intsRef20);
        com.graphhopper.storage.IntsRef intsRef33 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean34 = intsRef33.isEmpty();
        com.graphhopper.util.PointList pointList36 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState38 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef33, "hike_rating", pointList36, false);
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) -1 };
        com.graphhopper.reader.osm.pbf.PbfBlobDecoderListener pbfBlobDecoderListener43 = null;
        com.graphhopper.reader.osm.pbf.PbfBlobDecoder pbfBlobDecoder44 = new com.graphhopper.reader.osm.pbf.PbfBlobDecoder("max_length", byteArray42, pbfBlobDecoderListener43);
        boolean boolean45 = intsRef33.equals((java.lang.Object) pbfBlobDecoder44);
        boolean boolean46 = intsRef20.intsEquals(intsRef33);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, -1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, -1]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        com.graphhopper.util.shapes.BBox bBox4 = new com.graphhopper.util.shapes.BBox((double) 0L, (double) (short) 0, (double) (byte) 1, 100.0d);
        double double5 = bBox4.minEle;
        boolean boolean8 = bBox4.contains((double) 200L, (double) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph> cHPreparationGraphGHLongObjectHashMap0 = new com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph>();
        cHPreparationGraphGHLongObjectHashMap0.ensureCapacity(1048576);
        com.carrotsearch.hppc.LongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph> cHPreparationGraphLongObjectHashMap3 = cHPreparationGraphGHLongObjectHashMap0.clone();
        com.graphhopper.coll.GHLongHashSet gHLongHashSet5 = new com.graphhopper.coll.GHLongHashSet(2);
        int int6 = cHPreparationGraphGHLongObjectHashMap0.removeAll((com.carrotsearch.hppc.LongContainer) gHLongHashSet5);
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph10 = com.graphhopper.routing.ch.CHPreparationGraph.nodeBased((int) ' ', 0);
        double double14 = cHPreparationGraph10.getTurnWeight(3, (int) (byte) -1, 20);
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph15 = cHPreparationGraphGHLongObjectHashMap0.getOrDefault((long) 4, cHPreparationGraph10);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ch.PrepareGraphEdgeExplorer prepareGraphEdgeExplorer16 = cHPreparationGraph10.createInEdgeExplorer();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: You need to call prepareForContraction() before calling this method");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cHPreparationGraphLongObjectHashMap3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(cHPreparationGraph10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(cHPreparationGraph15);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        com.graphhopper.GraphHopper graphHopper0 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        com.graphhopper.GraphHopper graphHopper2 = graphHopper0.setFlagEncoderFactory(flagEncoderFactory1);
        com.graphhopper.routing.lm.LMPreparationHandler lMPreparationHandler3 = graphHopper0.getLMPreparationHandler();
        com.graphhopper.config.LMProfile[] lMProfileArray4 = new com.graphhopper.config.LMProfile[] {};
        java.util.ArrayList<com.graphhopper.config.LMProfile> lMProfileList5 = new java.util.ArrayList<com.graphhopper.config.LMProfile>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.config.LMProfile>) lMProfileList5, lMProfileArray4);
        com.graphhopper.routing.lm.LMPreparationHandler lMPreparationHandler7 = lMPreparationHandler3.setLMProfiles((java.util.Collection<com.graphhopper.config.LMProfile>) lMProfileList5);
        com.graphhopper.storage.RAMDirectory rAMDirectory9 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory10 = rAMDirectory9.create();
        java.nio.ByteOrder byteOrder11 = rAMDirectory9.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess13 = rAMDirectory9.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory14 = rAMDirectory9.create();
        long[] longArray20 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet21 = com.carrotsearch.hppc.LongHashSet.from(longArray20);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray22 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager23 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray22);
        com.graphhopper.storage.GraphBuilder graphBuilder24 = new com.graphhopper.storage.GraphBuilder(encodingManager23);
        boolean boolean25 = longHashSet21.equals((java.lang.Object) encodingManager23);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage28 = new com.graphhopper.storage.GraphHopperStorage(directory14, encodingManager23, false, true);
        com.graphhopper.routing.Path path29 = new com.graphhopper.routing.Path((com.graphhopper.storage.Graph) graphHopperStorage28);
        com.graphhopper.routing.util.EncodingManager encodingManager30 = graphHopperStorage28.getEncodingManager();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage32 = graphHopperStorage28.create((long) (short) 0);
        com.graphhopper.storage.StorableProperties storableProperties33 = graphHopperStorage32.getProperties();
        com.graphhopper.storage.StorableProperties storableProperties35 = storableProperties33.remove("hike_rating");
        boolean boolean37 = lMPreparationHandler7.loadOrDoWork(storableProperties33, false);
        org.junit.Assert.assertNotNull(graphHopper2);
        org.junit.Assert.assertNotNull(lMPreparationHandler3);
        org.junit.Assert.assertNotNull(lMProfileArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(lMPreparationHandler7);
        org.junit.Assert.assertNotNull(directory10);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(dataAccess13);
        org.junit.Assert.assertNotNull(directory14);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet21);
        org.junit.Assert.assertNotNull(flagEncoderArray22);
        org.junit.Assert.assertNotNull(encodingManager23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(encodingManager30);
        org.junit.Assert.assertNotNull(graphHopperStorage32);
        org.junit.Assert.assertNotNull(storableProperties33);
        org.junit.Assert.assertNotNull(storableProperties35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.graphhopper.coll.MinHeapWithUpdate minHeapWithUpdate1 = new com.graphhopper.coll.MinHeapWithUpdate(0);
        boolean boolean2 = minHeapWithUpdate1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap1 = new com.graphhopper.coll.GHIntLongHashMap(97);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap1 = new com.graphhopper.coll.GHLongLongHashMap(1);
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap3 = new com.graphhopper.coll.GHLongLongHashMap(1);
        java.util.Spliterator<com.carrotsearch.hppc.cursors.LongLongCursor> longLongCursorSpliterator4 = gHLongLongHashMap3.spliterator();
        boolean boolean5 = gHLongLongHashMap1.equals((java.lang.Object) longLongCursorSpliterator4);
        boolean boolean6 = gHLongLongHashMap1.isEmpty();
        org.junit.Assert.assertNotNull(longLongCursorSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.carrotsearch.hppc.IntArrayList intArrayList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.graphhopper.util.ArrayUtil.isPermutation(intArrayList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.DataAccess dataAccess7 = rAMDirectory1.find("bike_network");
        boolean boolean9 = dataAccess7.ensureCapacity(0L);
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
        org.junit.Assert.assertNotNull(dataAccess7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        java.lang.String str24 = path23.toString();
        com.graphhopper.routing.Path path26 = path23.setWeight((double) (-2));
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "found: false, weight: 1.7976931348623157E308, time: 100, distance: 0.0, edges: 0" + "'", str24, "found: false, weight: 1.7976931348623157E308, time: 100, distance: 0.0, edges: 0");
        org.junit.Assert.assertNotNull(path26);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue3 = new com.graphhopper.routing.ev.StringEncodedValue("bike_network", 10);
        java.util.List<java.lang.String> strList4 = stringEncodedValue3.getValues();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState6 = disabledEdgeIterator0.setReverse((com.graphhopper.routing.ev.IntEncodedValue) stringEncodedValue3, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.graphhopper.routing.util.TraversalMode traversalMode0 = com.graphhopper.routing.util.TraversalMode.EDGE_BASED;
        int int5 = traversalMode0.createTraversalId(21, (int) (byte) 1, (-2), false);
        int int10 = traversalMode0.createTraversalId(4, 35, (int) '#', true);
        org.junit.Assert.assertTrue("'" + traversalMode0 + "' != '" + com.graphhopper.routing.util.TraversalMode.EDGE_BASED + "'", traversalMode0.equals(com.graphhopper.routing.util.TraversalMode.EDGE_BASED));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 71 + "'", int10 == 71);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        com.graphhopper.apache.commons.collections.IntFloatBinaryHeap intFloatBinaryHeap0 = new com.graphhopper.apache.commons.collections.IntFloatBinaryHeap();
        long long1 = intFloatBinaryHeap0.getCapacity();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = intFloatBinaryHeap0.peekElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Heap is empty. Cannot peek element.");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1001L + "'", long1 == 1001L);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        java.io.DataInputStream dataInputStream0 = null;
        com.graphhopper.reader.osm.pbf.PbfStreamSplitter pbfStreamSplitter1 = new com.graphhopper.reader.osm.pbf.PbfStreamSplitter(dataInputStream0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = pbfStreamSplitter1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        com.graphhopper.storage.IntsRef intsRef14 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState20 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef14, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int21 = edgeIteratorState20.getEdge();
        virtualEdgeIteratorState11.setReverseEdge(edgeIteratorState20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = edgeIteratorState20.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue> encodedValueGHObjectIntHashMap1 = new com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue>((int) (byte) 100);
        int int2 = encodedValueGHObjectIntHashMap1.size();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue3 = com.graphhopper.routing.ev.Country.create();
        boolean boolean4 = countryEnumEncodedValue3.isStoreTwoDirections();
        int int6 = encodedValueGHObjectIntHashMap1.put((com.graphhopper.routing.ev.EncodedValue) countryEnumEncodedValue3, 20);
        int int8 = encodedValueGHObjectIntHashMap1.indexGet((int) (short) 100);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray9 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager10 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray9);
        boolean boolean11 = encodedValueGHObjectIntHashMap1.equals((java.lang.Object) flagEncoderArray9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(flagEncoderArray9);
        org.junit.Assert.assertNotNull(encodingManager10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        com.graphhopper.routing.DirectionResolverResult directionResolverResult2 = com.graphhopper.routing.DirectionResolverResult.onlyLeft((int) (byte) 0, (int) '#');
        boolean boolean3 = directionResolverResult2.isImpossible();
        int int4 = directionResolverResult2.getInEdgeRight();
        java.lang.String str5 = directionResolverResult2.toString();
        java.lang.String str6 = directionResolverResult2.toString();
        org.junit.Assert.assertNotNull(directionResolverResult2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "in-edge-right: NO_EDGE, out-edge-right: NO_EDGE, in-edge-left: 0, out-edge-left: 35" + "'", str5, "in-edge-right: NO_EDGE, out-edge-right: NO_EDGE, in-edge-left: 0, out-edge-left: 35");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "in-edge-right: NO_EDGE, out-edge-right: NO_EDGE, in-edge-left: 0, out-edge-left: 35" + "'", str6, "in-edge-right: NO_EDGE, out-edge-right: NO_EDGE, in-edge-left: 0, out-edge-left: 35");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.graphhopper.routing.ch.AStarCHEntry aStarCHEntry3 = new com.graphhopper.routing.ch.AStarCHEntry(4, (double) (short) 10, 6371000.0d);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        com.graphhopper.util.Unzipper unzipper0 = new com.graphhopper.util.Unzipper();
        boolean boolean4 = unzipper0.unzip("Oracle Corporation", "FOUND 0 ERRORS.\n", false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray0 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager1 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray0);
        com.graphhopper.reader.OSMTurnRelation.Type type5 = null;
        com.graphhopper.reader.OSMTurnRelation oSMTurnRelation6 = new com.graphhopper.reader.OSMTurnRelation(0L, (long) '#', (-1L), type5);
        com.graphhopper.routing.util.parsers.TurnCostParser.ExternalInternalMap externalInternalMap7 = null;
        com.graphhopper.storage.Graph graph8 = null;
        encodingManager1.handleTurnRelationTags(oSMTurnRelation6, externalInternalMap7, graph8);
        boolean boolean10 = encodingManager1.isEnableInstructions();
        org.junit.Assert.assertNotNull(flagEncoderArray0);
        org.junit.Assert.assertNotNull(encodingManager1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        com.graphhopper.storage.NativeFSLockFactory nativeFSLockFactory0 = new com.graphhopper.storage.NativeFSLockFactory();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.GHLock gHLock3 = nativeFSLockFactory0.create("country|version=1687814340|bits=2|index=0|shift=-1|store_both_directions=false", false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Set lockDir before creating read locks");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue0 = null;
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter1 = com.graphhopper.routing.util.DefaultEdgeFilter.inEdges(booleanEncodedValue0);
        org.junit.Assert.assertNotNull(defaultEdgeFilter1);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl0 = new com.graphhopper.coll.GHBitSetImpl();
        gHBitSetImpl0.remove((int) (short) 10);
        long[] longArray8 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet9 = com.carrotsearch.hppc.LongHashSet.from(longArray8);
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap11 = new com.graphhopper.coll.GHLongLongHashMap(1);
        java.util.Spliterator<com.carrotsearch.hppc.cursors.LongLongCursor> longLongCursorSpliterator12 = gHLongLongHashMap11.spliterator();
        com.carrotsearch.hppc.LongLongHashMap.KeysContainer keysContainer13 = gHLongLongHashMap11.keys();
        int int14 = longHashSet9.retainAll((com.carrotsearch.hppc.LongLookupContainer) keysContainer13);
        long[] longArray15 = new long[] {};
        int int16 = longHashSet9.addAll(longArray15);
        boolean boolean18 = false; // flaky: longHashSet9.indexExists(11);
        long[] longArray24 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet25 = com.carrotsearch.hppc.LongHashSet.from(longArray24);
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap27 = new com.graphhopper.coll.GHLongLongHashMap(1);
        java.util.Spliterator<com.carrotsearch.hppc.cursors.LongLongCursor> longLongCursorSpliterator28 = gHLongLongHashMap27.spliterator();
        com.carrotsearch.hppc.LongLongHashMap.KeysContainer keysContainer29 = gHLongLongHashMap27.keys();
        int int30 = longHashSet25.retainAll((com.carrotsearch.hppc.LongLookupContainer) keysContainer29);
        long[] longArray31 = longHashSet25.toArray();
        int int32 = longHashSet9.addAll(longArray31);
        boolean boolean33 = gHBitSetImpl0.equals((java.lang.Object) longHashSet9);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet9);
        org.junit.Assert.assertNotNull(longLongCursorSpliterator12);
        org.junit.Assert.assertNotNull(keysContainer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet25);
        org.junit.Assert.assertNotNull(longLongCursorSpliterator28);
        org.junit.Assert.assertNotNull(keysContainer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("prepare.ch.node.original_edge_count_weight");
        int int6 = dataAccess5.getSegmentSize();
        boolean boolean7 = dataAccess5.loadExisting();
        long long8 = dataAccess5.getCapacity();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1048576 + "'", int6 == 1048576);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        java.util.Calendar calendar0 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "_network$turn_cost", "", "", "5.4.0-70-generic", "bike_network", "3.0", "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}", "prepare.ch.edge.witness_search.sigma_factor", "3.0" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "bike", "prepare.ch.edge.witness_search.reset_interval", "_network", "prepare.ch.edge.witness_search.sigma_factor", "foot", "srtm", "_network$turn_cost", "prepare.ch.node.original_edge_count_weight", "foot_network", "foot_network", "prepare.ch.log_messages", "3.0", "", "secondary", "secondary", "hi!", "00001010000010100000101001100100", "1.8", "bike", "prepare.ch.edge.witness_search.sigma_factor", "hike_rating", "prepare.ch.edge.witness_search.reset_interval" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        java.lang.String[] strArray57 = new java.lang.String[] { "3.0", "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}", "prepare.ch.updates.lazy", "secondary", "foot", "srtm", "foot", "bike_network", "foot_network", "prepare.ch.log_messages", "", "00001010000010100000101001100100", "hi!", "prepare.ch.node.original_edge_count_weight", "1.8", "_network$turn_cost", "5.4.0-70-generic", "horse_rating" };
        java.util.LinkedHashSet<java.lang.String> strSet58 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet58, strArray57);
        com.graphhopper.reader.osm.conditional.ConditionalOSMTagInspector conditionalOSMTagInspector60 = new com.graphhopper.reader.osm.conditional.ConditionalOSMTagInspector(calendar0, (java.util.List<java.lang.String>) strList11, (java.util.Set<java.lang.String>) strSet37, (java.util.Set<java.lang.String>) strSet58);
        com.graphhopper.reader.ReaderWay readerWay62 = new com.graphhopper.reader.ReaderWay((long) 0);
        boolean boolean63 = conditionalOSMTagInspector60.isRestrictedWayConditionallyPermitted(readerWay62);
        com.graphhopper.reader.osm.conditional.DateRangeParser dateRangeParser64 = new com.graphhopper.reader.osm.conditional.DateRangeParser();
        com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState conditionState66 = dateRangeParser64.checkCondition("3.0");
        conditionalOSMTagInspector60.addValueParser((com.graphhopper.reader.osm.conditional.ConditionalValueParser) dateRangeParser64);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.osm.conditional.DateRange dateRange69 = dateRangeParser64.getRange("Oracle Corporation");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparsable date: \"Oracle Corporation\"");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + conditionState66 + "' != '" + com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.FALSE + "'", conditionState66.equals(com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.FALSE));
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue3 = new com.graphhopper.routing.ev.StringEncodedValue("bike_network", 10);
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.storage.IntsRef intsRef9 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int10 = intsRef6.compareTo(intsRef9);
        java.lang.String str11 = stringEncodedValue3.getString(false, intsRef9);
        int int13 = stringEncodedValue3.indexOf("name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        int int14 = stringEncodedValue3.getVersion();
        com.graphhopper.util.details.StringDetails stringDetails15 = new com.graphhopper.util.details.StringDetails(", null, NODE_BASED", stringEncodedValue3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-791814527) + "'", int14 == (-791814527));
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge prepareBaseEdge5 = new com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge(100, (int) (short) -1, (int) (short) 10, (float) (byte) -1, (float) 'a');
        int int6 = prepareBaseEdge5.getOrigEdgeKeyLastAB();
        double double7 = prepareBaseEdge5.getWeightAB();
        java.lang.String str8 = prepareBaseEdge5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1-10 (100) -1.0 97.0" + "'", str8, "-1-10 (100) -1.0 97.0");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        com.graphhopper.util.shapes.BBox bBox6 = new com.graphhopper.util.shapes.BBox((double) (-2), 90.0002104591497d, (double) 10.0f, 2.001508679602057E7d, (double) 5, 1451566.8463946683d);
        com.graphhopper.storage.index.LocationIndex locationIndex7 = null;
        java.util.Random random8 = null;
        com.graphhopper.storage.RAMDirectory rAMDirectory12 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory13 = rAMDirectory12.create();
        java.nio.ByteOrder byteOrder14 = rAMDirectory12.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray15 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager16 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray15);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage18 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory12, encodingManager16, false);
        java.util.List<com.graphhopper.storage.CHConfig> cHConfigList19 = graphHopperStorage18.getCHConfigs();
        com.graphhopper.storage.index.LocationIndex locationIndex20 = null;
        com.graphhopper.util.shapes.GHPoint[] gHPointArray21 = new com.graphhopper.util.shapes.GHPoint[] {};
        java.util.ArrayList<com.graphhopper.util.shapes.GHPoint> gHPointList22 = new java.util.ArrayList<com.graphhopper.util.shapes.GHPoint>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.util.shapes.GHPoint>) gHPointList22, gHPointArray21);
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile25 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str26 = customProfile25.toString();
        com.graphhopper.config.Profile profile29 = customProfile25.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.util.PMap pMap30 = profile29.getHints();
        com.graphhopper.routing.weighting.Weighting weighting31 = null;
        com.graphhopper.routing.util.FiniteWeightFilter finiteWeightFilter32 = new com.graphhopper.routing.util.FiniteWeightFilter(weighting31);
        com.graphhopper.storage.GraphEdgeIdFinder.BlockArea blockArea33 = com.graphhopper.storage.GraphEdgeIdFinder.createBlockArea((com.graphhopper.storage.Graph) graphHopperStorage18, locationIndex20, (java.util.List<com.graphhopper.util.shapes.GHPoint>) gHPointList22, pMap30, (com.graphhopper.routing.util.EdgeFilter) finiteWeightFilter32);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.graphhopper.storage.index.Snap> snapList34 = com.graphhopper.util.GHUtility.createRandomSnaps(bBox6, locationIndex7, random8, 1048576, true, (com.graphhopper.routing.util.EdgeFilter) finiteWeightFilter32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory13);
        org.junit.Assert.assertNotNull(byteOrder14);
        org.junit.Assert.assertNotNull(flagEncoderArray15);
        org.junit.Assert.assertNotNull(encodingManager16);
        org.junit.Assert.assertNotNull(cHConfigList19);
        org.junit.Assert.assertNotNull(gHPointArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str26, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile29);
        org.junit.Assert.assertNotNull(pMap30);
        org.junit.Assert.assertNotNull(blockArea33);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        com.graphhopper.storage.IntsRef intsRef1 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        java.lang.String str2 = intsRef1.toString();
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl4 = new com.graphhopper.coll.GHBitSetImpl((int) (short) 100);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl5 = new com.graphhopper.coll.GHBitSetImpl();
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl6 = new com.graphhopper.coll.GHBitSetImpl();
        gHBitSetImpl6.remove((int) (short) 10);
        gHBitSetImpl6.clear();
        int int10 = gHBitSetImpl6.getCardinality();
        com.graphhopper.coll.GHBitSet gHBitSet11 = gHBitSetImpl5.copyTo((com.graphhopper.coll.GHBitSet) gHBitSetImpl6);
        gHBitSetImpl4.andNot((java.util.BitSet) gHBitSetImpl6);
        boolean boolean13 = intsRef1.equals((java.lang.Object) gHBitSetImpl6);
        gHBitSetImpl6.clear((int) '#', 35);
        // The following exception was thrown during execution in test generation
        try {
            gHBitSetImpl6.set((int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[0 0 0 0 0 0 0 0 0 0]" + "'", str2, "[0 0 0 0 0 0 0 0 0 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(gHBitSet11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile1 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str2 = customProfile1.toString();
        com.graphhopper.config.Profile profile5 = customProfile1.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.config.Profile profile7 = customProfile1.setName("prepare.ch.node.original_edge_count_weight$foot_network");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Profile names may only contain lower case letters, numbers and underscores, given: prepare.ch.node.original_edge_count_weight$foot_network");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str2, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile5);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        com.graphhopper.coll.GHLongIntBTree gHLongIntBTree1 = new com.graphhopper.coll.GHLongIntBTree((int) (short) 100);
        int int3 = gHLongIntBTree1.get(52L);
        int int6 = gHLongIntBTree1.put(0L, 5);
        int int9 = gHLongIntBTree1.put((long) 96, 0);
        long long10 = gHLongIntBTree1.getSize();
        java.lang.String str11 = gHLongIntBTree1.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Height:1, entries:1" + "'", str11, "Height:1, entries:1");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.custom.CustomProfile customProfile1 = new com.graphhopper.routing.weighting.custom.CustomProfile("Linux");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Profile names may only contain lower case letters, numbers and underscores, given: Linux");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        com.graphhopper.routing.ev.Hazmat hazmat0 = com.graphhopper.routing.ev.Hazmat.YES;
        java.lang.String str1 = hazmat0.toString();
        java.lang.String str2 = hazmat0.toString();
        java.lang.String str3 = hazmat0.toString();
        org.junit.Assert.assertTrue("'" + hazmat0 + "' != '" + com.graphhopper.routing.ev.Hazmat.YES + "'", hazmat0.equals(com.graphhopper.routing.ev.Hazmat.YES));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yes" + "'", str2, "yes");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "yes" + "'", str3, "yes");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType0 = com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY;
        org.junit.Assert.assertTrue("'" + parseType0 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY + "'", parseType0.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY));
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        com.graphhopper.GraphHopperConfig graphHopperConfig0 = new com.graphhopper.GraphHopperConfig();
        com.graphhopper.GraphHopperConfig graphHopperConfig1 = new com.graphhopper.GraphHopperConfig(graphHopperConfig0);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap1 = new com.graphhopper.coll.GHIntLongHashMap((int) (byte) 1);
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap2 = gHIntLongHashMap1.clone();
        long[] longArray3 = gHIntLongHashMap1.values;
        org.junit.Assert.assertNotNull(intLongHashMap2);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 0, 0, 0, 0]");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl1 = new com.graphhopper.coll.GHBitSetImpl();
        gHBitSetImpl1.remove((int) (short) 10);
        byte[] byteArray4 = gHBitSetImpl1.toByteArray();
        com.graphhopper.reader.osm.pbf.PbfRawBlob pbfRawBlob5 = new com.graphhopper.reader.osm.pbf.PbfRawBlob("prepare.ch.updates.lazy", byteArray4);
        byte[] byteArray6 = pbfRawBlob5.getData();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.graphhopper.util.DistancePlaneProjection distancePlaneProjection0 = com.graphhopper.util.DistancePlaneProjection.DIST_PLANE;
        boolean boolean3 = distancePlaneProjection0.isCrossBoundary(4.294967306E9d, (double) 200L);
        org.junit.Assert.assertNotNull(distancePlaneProjection0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap1 = new com.graphhopper.coll.GHLongLongHashMap(1);
        java.util.Spliterator<com.carrotsearch.hppc.cursors.LongLongCursor> longLongCursorSpliterator2 = gHLongLongHashMap1.spliterator();
        gHLongLongHashMap1.ensureCapacity((int) (byte) 10);
        boolean boolean7 = gHLongLongHashMap1.putIfAbsent((long) 100, (long) (short) 10);
        long long10 = gHLongLongHashMap1.addTo((long) '#', 4294967306L);
        gHLongLongHashMap1.ensureCapacity((int) (byte) 100);
        long long15 = gHLongLongHashMap1.getOrDefault((long) 2, (long) 96);
        org.junit.Assert.assertNotNull(longLongCursorSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4294967306L + "'", long10 == 4294967306L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 96L + "'", long15 == 96L);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
        java.util.List<com.graphhopper.routing.util.FlagEncoder> flagEncoderList23 = encodingManager22.fetchEdgeEncoders();
        com.graphhopper.storage.GraphBuilder graphBuilder24 = new com.graphhopper.storage.GraphBuilder(encodingManager22);
        com.graphhopper.storage.RAMDirectory rAMDirectory26 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory27 = rAMDirectory26.create();
        java.nio.ByteOrder byteOrder28 = rAMDirectory26.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess30 = rAMDirectory26.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.GraphBuilder graphBuilder31 = graphBuilder24.setDir((com.graphhopper.storage.Directory) rAMDirectory26);
        com.graphhopper.storage.GraphBuilder graphBuilder33 = graphBuilder31.setMMap("country");
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
        org.junit.Assert.assertNotNull(flagEncoderList23);
        org.junit.Assert.assertNotNull(directory27);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertNotNull(dataAccess30);
        org.junit.Assert.assertNotNull(graphBuilder31);
        org.junit.Assert.assertNotNull(graphBuilder33);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        com.graphhopper.util.SimpleIntDeque simpleIntDeque1 = new com.graphhopper.util.SimpleIntDeque(20);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.graphhopper.routing.lm.LMPreparationHandler lMPreparationHandler0 = new com.graphhopper.routing.lm.LMPreparationHandler();
        com.graphhopper.storage.RAMDirectory rAMDirectory2 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory3 = rAMDirectory2.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap4 = new com.graphhopper.coll.OSMIDMap(directory3);
        com.graphhopper.storage.StorableProperties storableProperties5 = new com.graphhopper.storage.StorableProperties(directory3);
        boolean boolean6 = storableProperties5.loadExisting();
        boolean boolean8 = lMPreparationHandler0.loadOrDoWork(storableProperties5, true);
        org.junit.Assert.assertNotNull(directory3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        com.graphhopper.util.TranslationMap translationMap0 = new com.graphhopper.util.TranslationMap();
        java.lang.String str1 = translationMap0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.graphhopper.apache.commons.collections.IntFloatBinaryHeap intFloatBinaryHeap1 = new com.graphhopper.apache.commons.collections.IntFloatBinaryHeap(64);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.graphhopper.util.DistanceCalcEarth distanceCalcEarth0 = new com.graphhopper.util.DistanceCalcEarth();
        double double7 = distanceCalcEarth0.calcDist3D((double) 'a', (double) (short) 1, (double) (byte) -1, (double) 100.0f, (double) (short) 100, (double) (short) 1);
        double double9 = distanceCalcEarth0.calcCircumference((double) 1);
        double double11 = distanceCalcEarth0.calcNormalizedDist((double) (short) 100);
        java.lang.String str12 = distanceCalcEarth0.toString();
        double double17 = distanceCalcEarth0.calcDist(10.0d, 4.1539968895200975E7d, (double) 52L, (double) 0.0f);
        double double24 = distanceCalcEarth0.calcNormalizedEdgeDistance((double) 5L, 4.450463164781178E12d, (double) 71, (double) 97, 9499833.189512674d, 2.711340206185567d);
        double double26 = distanceCalcEarth0.calcCircumference((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1451566.8463946683d + "'", double7 == 1451566.8463946683d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0024076802712575E7d + "'", double9 == 4.0024076802712575E7d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 6.159206975860352E-11d + "'", double11 == 6.159206975860352E-11d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EXACT" + "'", str12, "EXACT");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 7843462.549395982d + "'", double17 == 7843462.549395982d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.8496219982818339d + "'", double24 == 0.8496219982818339d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.0024076802712575E7d + "'", double26 == 4.0024076802712575E7d);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        java.lang.String str0 = com.graphhopper.routing.ch.CHParameters.EDGE_DIFFERENCE_WEIGHT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "prepare.ch.node.edge_difference_weight" + "'", str0, "prepare.ch.node.edge_difference_weight");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager5, false);
        com.graphhopper.storage.GraphBuilder graphBuilder8 = new com.graphhopper.storage.GraphBuilder(encodingManager5);
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(flagEncoderArray4);
        org.junit.Assert.assertNotNull(encodingManager5);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue0 = com.graphhopper.routing.ev.MaxHeight.create();
        org.junit.Assert.assertNotNull(decimalEncodedValue0);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue> encodedValueGHObjectIntHashMap2 = new com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue>((int) (short) 10, (double) 71);
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.hppc.BufferAllocationException; message: The load factor should be in range [0.01, 0.99]: 71.000000");
        } catch (com.carrotsearch.hppc.BufferAllocationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        com.graphhopper.GraphHopper graphHopper0 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        com.graphhopper.GraphHopper graphHopper2 = graphHopper0.setFlagEncoderFactory(flagEncoderFactory1);
        com.graphhopper.routing.util.EncodingManager encodingManager3 = graphHopper2.getEncodingManager();
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile5 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str6 = customProfile5.toString();
        com.graphhopper.config.Profile profile9 = customProfile5.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.config.Profile profile11 = customProfile5.setName("get_off_bike");
        com.graphhopper.config.Profile[] profileArray12 = new com.graphhopper.config.Profile[] { customProfile5 };
        com.graphhopper.GraphHopper graphHopper13 = graphHopper2.setProfiles(profileArray12);
        com.graphhopper.config.Profile profile15 = graphHopper2.getProfile("prepare.ch.updates.lazy");
        java.lang.String str16 = graphHopper2.getOSMFile();
        org.junit.Assert.assertNotNull(graphHopper2);
        org.junit.Assert.assertNull(encodingManager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str6, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile9);
        org.junit.Assert.assertNotNull(profile11);
        org.junit.Assert.assertNotNull(profileArray12);
        org.junit.Assert.assertNotNull(graphHopper13);
        org.junit.Assert.assertNull(profile15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap3 = new com.graphhopper.coll.OSMIDMap(directory2);
        com.graphhopper.search.StringIndex stringIndex5 = new com.graphhopper.search.StringIndex(directory2, 10);
        com.graphhopper.storage.RAMDirectory rAMDirectory7 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory8 = rAMDirectory7.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap9 = new com.graphhopper.coll.OSMIDMap(directory8);
        com.graphhopper.search.StringIndex stringIndex11 = new com.graphhopper.search.StringIndex(directory8, 10);
        stringIndex5.copyTo(stringIndex11);
        com.graphhopper.storage.RAMDirectory rAMDirectory14 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory15 = rAMDirectory14.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap16 = new com.graphhopper.coll.OSMIDMap(directory15);
        com.graphhopper.search.StringIndex stringIndex18 = new com.graphhopper.search.StringIndex(directory15, 10);
        com.graphhopper.storage.RAMDirectory rAMDirectory20 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory21 = rAMDirectory20.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap22 = new com.graphhopper.coll.OSMIDMap(directory21);
        com.graphhopper.search.StringIndex stringIndex24 = new com.graphhopper.search.StringIndex(directory21, 10);
        stringIndex18.copyTo(stringIndex24);
        stringIndex11.copyTo(stringIndex24);
        stringIndex11.close();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long29 = stringIndex11.add(strMap28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(directory8);
        org.junit.Assert.assertNotNull(directory15);
        org.junit.Assert.assertNotNull(directory21);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.graphhopper.GraphHopper graphHopper0 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        com.graphhopper.GraphHopper graphHopper2 = graphHopper0.setFlagEncoderFactory(flagEncoderFactory1);
        com.graphhopper.routing.util.EncodingManager encodingManager3 = graphHopper2.getEncodingManager();
        com.graphhopper.GraphHopper graphHopper5 = graphHopper2.setAllowWrites(false);
        com.graphhopper.GraphHopper graphHopper7 = graphHopper2.setElevationWayPointMaxDistance((double) 4);
        com.graphhopper.GraphHopper graphHopper8 = new com.graphhopper.GraphHopper();
        java.util.List<com.graphhopper.config.Profile> profileList9 = graphHopper8.getProfiles();
        com.graphhopper.GraphHopper graphHopper10 = graphHopper2.setProfiles(profileList9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = graphHopper2.load("name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot load properties to fetch EncodingManager configuration at: name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}/");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphHopper2);
        org.junit.Assert.assertNull(encodingManager3);
        org.junit.Assert.assertNotNull(graphHopper5);
        org.junit.Assert.assertNotNull(graphHopper7);
        org.junit.Assert.assertNotNull(profileList9);
        org.junit.Assert.assertNotNull(graphHopper10);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        com.graphhopper.GraphHopper graphHopper0 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        com.graphhopper.GraphHopper graphHopper2 = graphHopper0.setFlagEncoderFactory(flagEncoderFactory1);
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
        com.graphhopper.routing.Path path24 = new com.graphhopper.routing.Path((com.graphhopper.storage.Graph) graphHopperStorage23);
        com.graphhopper.routing.Path path26 = path24.addTime((long) (byte) 100);
        long[] longArray32 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet33 = com.carrotsearch.hppc.LongHashSet.from(longArray32);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray34 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager35 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray34);
        com.graphhopper.storage.GraphBuilder graphBuilder36 = new com.graphhopper.storage.GraphBuilder(encodingManager35);
        boolean boolean37 = longHashSet33.equals((java.lang.Object) encodingManager35);
        com.graphhopper.routing.weighting.Weighting weighting38 = null;
        com.graphhopper.storage.RAMDirectory rAMDirectory40 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory41 = rAMDirectory40.create();
        java.nio.ByteOrder byteOrder42 = rAMDirectory40.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray43 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager44 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray43);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage46 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory40, encodingManager44, false);
        java.util.List<java.lang.String> strList47 = graphHopperStorage46.getCHGraphNames();
        com.graphhopper.util.details.PathDetailsBuilderFactory pathDetailsBuilderFactory48 = new com.graphhopper.util.details.PathDetailsBuilderFactory();
        java.util.Map<java.lang.String, java.util.List<com.graphhopper.util.details.PathDetail>> strMap50 = com.graphhopper.util.details.PathDetailsFromEdges.calcDetails(path24, (com.graphhopper.routing.ev.EncodedValueLookup) encodingManager35, weighting38, strList47, pathDetailsBuilderFactory48, (int) ' ');
        com.graphhopper.GraphHopper graphHopper51 = graphHopper2.setPathDetailsBuilderFactory(pathDetailsBuilderFactory48);
        com.graphhopper.GraphHopper graphHopper53 = graphHopper2.setStoreOnFlush(false);
        java.lang.String str54 = graphHopper2.getGraphHopperLocation();
        org.junit.Assert.assertNotNull(graphHopper2);
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
        org.junit.Assert.assertNotNull(path26);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet33);
        org.junit.Assert.assertNotNull(flagEncoderArray34);
        org.junit.Assert.assertNotNull(encodingManager35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(directory41);
        org.junit.Assert.assertNotNull(byteOrder42);
        org.junit.Assert.assertNotNull(flagEncoderArray43);
        org.junit.Assert.assertNotNull(encodingManager44);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNotNull(graphHopper51);
        org.junit.Assert.assertNotNull(graphHopper53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        com.graphhopper.util.shapes.BBox bBox6 = new com.graphhopper.util.shapes.BBox((double) (-2), 90.0002104591497d, (double) 10.0f, 2.001508679602057E7d, (double) 5, 1451566.8463946683d);
        double double7 = bBox6.maxLat;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.001508679602057E7d + "'", double7 == 2.001508679602057E7d);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        com.graphhopper.GraphHopper graphHopper0 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        com.graphhopper.GraphHopper graphHopper2 = graphHopper0.setFlagEncoderFactory(flagEncoderFactory1);
        com.graphhopper.routing.util.EncodingManager encodingManager3 = graphHopper2.getEncodingManager();
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile5 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str6 = customProfile5.toString();
        com.graphhopper.config.Profile profile9 = customProfile5.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.config.Profile profile11 = customProfile5.setName("get_off_bike");
        com.graphhopper.config.Profile[] profileArray12 = new com.graphhopper.config.Profile[] { customProfile5 };
        com.graphhopper.GraphHopper graphHopper13 = graphHopper2.setProfiles(profileArray12);
        com.graphhopper.config.Profile profile15 = graphHopper2.getProfile("prepare.ch.updates.lazy");
        java.lang.String str16 = graphHopper2.getGraphHopperLocation();
        org.junit.Assert.assertNotNull(graphHopper2);
        org.junit.Assert.assertNull(encodingManager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str6, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile9);
        org.junit.Assert.assertNotNull(profile11);
        org.junit.Assert.assertNotNull(profileArray12);
        org.junit.Assert.assertNotNull(graphHopper13);
        org.junit.Assert.assertNull(profile15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        com.graphhopper.util.GitInfo gitInfo5 = new com.graphhopper.util.GitInfo("....                                                                                                ", "secondary", "....                                                                                                ", "Linux", true);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue> encodedValueGHObjectIntHashMap1 = new com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue>((int) (byte) 100);
        int int2 = encodedValueGHObjectIntHashMap1.size();
        java.lang.String str3 = encodedValueGHObjectIntHashMap1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager5, false);
        java.util.List<com.graphhopper.storage.CHConfig> cHConfigList8 = graphHopperStorage7.getCHConfigs();
        com.graphhopper.storage.index.LocationIndex locationIndex9 = null;
        com.graphhopper.util.shapes.GHPoint[] gHPointArray10 = new com.graphhopper.util.shapes.GHPoint[] {};
        java.util.ArrayList<com.graphhopper.util.shapes.GHPoint> gHPointList11 = new java.util.ArrayList<com.graphhopper.util.shapes.GHPoint>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.util.shapes.GHPoint>) gHPointList11, gHPointArray10);
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile14 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str15 = customProfile14.toString();
        com.graphhopper.config.Profile profile18 = customProfile14.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.util.PMap pMap19 = profile18.getHints();
        com.graphhopper.routing.weighting.Weighting weighting20 = null;
        com.graphhopper.routing.util.FiniteWeightFilter finiteWeightFilter21 = new com.graphhopper.routing.util.FiniteWeightFilter(weighting20);
        com.graphhopper.storage.GraphEdgeIdFinder.BlockArea blockArea22 = com.graphhopper.storage.GraphEdgeIdFinder.createBlockArea((com.graphhopper.storage.Graph) graphHopperStorage7, locationIndex9, (java.util.List<com.graphhopper.util.shapes.GHPoint>) gHPointList11, pMap19, (com.graphhopper.routing.util.EdgeFilter) finiteWeightFilter21);
        com.graphhopper.util.DistanceCalcEarth distanceCalcEarth24 = new com.graphhopper.util.DistanceCalcEarth();
        double double31 = distanceCalcEarth24.calcDist3D((double) 'a', (double) (short) 1, (double) (byte) -1, (double) 100.0f, (double) (short) 100, (double) (short) 1);
        double double33 = distanceCalcEarth24.calcCircumference((double) 1);
        double double35 = distanceCalcEarth24.calcNormalizedDist((double) (short) 100);
        java.lang.String str36 = distanceCalcEarth24.toString();
        double double41 = distanceCalcEarth24.calcDist(10.0d, 4.1539968895200975E7d, (double) 52L, (double) 0.0f);
        double double48 = distanceCalcEarth24.calcNormalizedEdgeDistance((double) 5L, 4.450463164781178E12d, (double) 71, (double) 97, 9499833.189512674d, 2.711340206185567d);
        com.graphhopper.util.shapes.GHPoint gHPoint53 = distanceCalcEarth24.projectCoordinate((double) (-1), 0.014834047343337549d, 4.450463164781178E12d, (double) 11);
        java.util.Map<java.lang.String, java.lang.String> strMap55 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.NameSimilarityEdgeFilter nameSimilarityEdgeFilter56 = new com.graphhopper.routing.util.NameSimilarityEdgeFilter((com.graphhopper.routing.util.EdgeFilter) finiteWeightFilter21, "prepare.ch.edge.witness_search.reset_interval", gHPoint53, (double) 200L, strMap55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(flagEncoderArray4);
        org.junit.Assert.assertNotNull(encodingManager5);
        org.junit.Assert.assertNotNull(cHConfigList8);
        org.junit.Assert.assertNotNull(gHPointArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str15, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile18);
        org.junit.Assert.assertNotNull(pMap19);
        org.junit.Assert.assertNotNull(blockArea22);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1451566.8463946683d + "'", double31 == 1451566.8463946683d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 4.0024076802712575E7d + "'", double33 == 4.0024076802712575E7d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 6.159206975860352E-11d + "'", double35 == 6.159206975860352E-11d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EXACT" + "'", str36, "EXACT");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 7843462.549395982d + "'", double41 == 7843462.549395982d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.8496219982818339d + "'", double48 == 0.8496219982818339d);
        org.junit.Assert.assertNotNull(gHPoint53);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.graphhopper.storage.IntsRef intsRef1 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean2 = intsRef1.isEmpty();
        com.graphhopper.storage.IntsRef intsRef4 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int5 = intsRef1.compareTo(intsRef4);
        com.graphhopper.storage.IntsRef intsRef13 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState19 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef13, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int20 = edgeIteratorState19.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue21 = com.graphhopper.routing.ev.Country.create();
        boolean boolean22 = countryEnumEncodedValue21.isStoreTwoDirections();
        com.graphhopper.routing.ev.Country country23 = edgeIteratorState19.getReverse(countryEnumEncodedValue21);
        com.graphhopper.storage.IntsRef intsRef31 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean32 = intsRef31.isEmpty();
        com.graphhopper.util.PointList pointList34 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState36 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef31, "hike_rating", pointList34, false);
        int int37 = countryEnumEncodedValue21.getInt(true, intsRef31);
        com.graphhopper.util.PointList pointList39 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState41 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState((int) (byte) 1, (int) ' ', 1, 0, 0.0d, intsRef31, "prepare.ch.edge.witness_search.reset_interval", pointList39, false);
        boolean boolean42 = intsRef4.intsEquals(intsRef31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(edgeIteratorState19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + country23 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country23.equals(com.graphhopper.routing.ev.Country.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.graphhopper.routing.util.PriorityCode priorityCode0 = com.graphhopper.routing.util.PriorityCode.WORST;
        org.junit.Assert.assertTrue("'" + priorityCode0 + "' != '" + com.graphhopper.routing.util.PriorityCode.WORST + "'", priorityCode0.equals(com.graphhopper.routing.util.PriorityCode.WORST));
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap1 = new com.graphhopper.coll.GHIntLongHashMap((int) (byte) 1);
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap3 = new com.graphhopper.coll.GHIntLongHashMap((int) (byte) 1);
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = gHIntLongHashMap3.clone();
        int int5 = gHIntLongHashMap1.putAll((com.carrotsearch.hppc.IntLongAssociativeContainer) gHIntLongHashMap3);
        long[] longArray11 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet12 = com.carrotsearch.hppc.LongHashSet.from(longArray11);
        gHIntLongHashMap3.values = longArray11;
        long long16 = gHIntLongHashMap3.addTo((-2), 0L);
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[4294967306, -1, 100, 0, -2]");
        org.junit.Assert.assertNotNull(longHashSet12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.CHConfig cHConfig2 = com.graphhopper.storage.CHConfig.nodeBased("Node: 200 lat=0.0 lon=3.0", weighting1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Profile names may only contain lower case letters, numbers and underscores, given: Node: 200 lat=0.0 lon=3.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.locationtech.jts.geom.Polygon[] polygonArray0 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList1 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList1, polygonArray0);
        com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule germanySpatialRule3 = new com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList1);
        com.graphhopper.storage.RAMDirectory rAMDirectory5 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory6 = rAMDirectory5.create();
        com.graphhopper.storage.DAType dAType7 = rAMDirectory5.getDefaultType();
        com.graphhopper.routing.ev.RoadClass roadClass8 = com.graphhopper.routing.ev.RoadClass.LIVING_STREET;
        boolean boolean9 = dAType7.equals((java.lang.Object) roadClass8);
        com.graphhopper.routing.util.TransportationMode transportationMode10 = com.graphhopper.routing.util.TransportationMode.MOTORCYCLE;
        double double12 = germanySpatialRule3.getMaxSpeed(roadClass8, transportationMode10, (double) 0.0f);
        java.lang.String str13 = germanySpatialRule3.getId();
        java.lang.String str14 = germanySpatialRule3.getId();
        java.lang.String str15 = germanySpatialRule3.getId();
        org.junit.Assert.assertNotNull(polygonArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(directory6);
        org.junit.Assert.assertNotNull(dAType7);
        org.junit.Assert.assertTrue("'" + roadClass8 + "' != '" + com.graphhopper.routing.ev.RoadClass.LIVING_STREET + "'", roadClass8.equals(com.graphhopper.routing.ev.RoadClass.LIVING_STREET));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + transportationMode10 + "' != '" + com.graphhopper.routing.util.TransportationMode.MOTORCYCLE + "'", transportationMode10.equals(com.graphhopper.routing.util.TransportationMode.MOTORCYCLE));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "deu" + "'", str13, "deu");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "deu" + "'", str14, "deu");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "deu" + "'", str15, "deu");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph> cHPreparationGraphGHLongObjectHashMap0 = new com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph>();
        cHPreparationGraphGHLongObjectHashMap0.ensureCapacity(1048576);
        com.carrotsearch.hppc.LongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph> cHPreparationGraphLongObjectHashMap3 = cHPreparationGraphGHLongObjectHashMap0.clone();
        com.graphhopper.coll.GHLongHashSet gHLongHashSet5 = new com.graphhopper.coll.GHLongHashSet(2);
        int int6 = cHPreparationGraphGHLongObjectHashMap0.removeAll((com.carrotsearch.hppc.LongContainer) gHLongHashSet5);
        java.util.Iterator<com.carrotsearch.hppc.cursors.LongCursor> longCursorItor7 = gHLongHashSet5.iterator();
        org.junit.Assert.assertNotNull(cHPreparationGraphLongObjectHashMap3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(longCursorItor7);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph> cHPreparationGraphGHLongObjectHashMap0 = new com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph>();
        cHPreparationGraphGHLongObjectHashMap0.ensureCapacity(1048576);
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph4 = cHPreparationGraphGHLongObjectHashMap0.indexGet((int) 'a');
        org.junit.Assert.assertNull(cHPreparationGraph4);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
        com.graphhopper.util.PointList pointList24 = null;
        com.graphhopper.storage.ExtendedNodeAccess extendedNodeAccess26 = new com.graphhopper.storage.ExtendedNodeAccess(nodeAccess23, pointList24, 1048576);
        // The following exception was thrown during execution in test generation
        try {
            double double28 = extendedNodeAccess26.getEle((int) '4');
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
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        com.graphhopper.coll.GHTreeMapComposed gHTreeMapComposed0 = new com.graphhopper.coll.GHTreeMapComposed();
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.graphhopper.GraphHopper graphHopper0 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        com.graphhopper.GraphHopper graphHopper2 = graphHopper0.setFlagEncoderFactory(flagEncoderFactory1);
        com.graphhopper.routing.lm.LMPreparationHandler lMPreparationHandler3 = graphHopper0.getLMPreparationHandler();
        lMPreparationHandler3.setPreparationThreads(1687814340);
        com.graphhopper.routing.lm.LMConfig lMConfig6 = null;
        com.graphhopper.routing.lm.LMPreparationHandler lMPreparationHandler7 = lMPreparationHandler3.addLMConfig(lMConfig6);
        java.util.List<com.graphhopper.routing.lm.PrepareLandmarks> prepareLandmarksList8 = lMPreparationHandler3.getPreparations();
        org.junit.Assert.assertNotNull(graphHopper2);
        org.junit.Assert.assertNotNull(lMPreparationHandler3);
        org.junit.Assert.assertNotNull(lMPreparationHandler7);
        org.junit.Assert.assertNotNull(prepareLandmarksList8);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        com.graphhopper.storage.RAMDirectory rAMDirectory2 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory3 = rAMDirectory2.create();
        java.nio.ByteOrder byteOrder4 = rAMDirectory2.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess6 = rAMDirectory2.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory7 = rAMDirectory2.create();
        com.graphhopper.reader.PillarInfo pillarInfo8 = new com.graphhopper.reader.PillarInfo(true, directory7);
        pillarInfo8.clear();
        // The following exception was thrown during execution in test generation
        try {
            pillarInfo8.setNode((int) (short) -1, (double) 5, 4.450463164781178E12d, (double) 1001L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertNotNull(dataAccess6);
        org.junit.Assert.assertNotNull(directory7);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        com.graphhopper.storage.NodeAccess nodeAccess0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator2 = new com.graphhopper.routing.weighting.BeelineWeightApproximator(nodeAccess0, weighting1);
        com.graphhopper.util.DistanceCalcEarth distanceCalcEarth3 = new com.graphhopper.util.DistanceCalcEarth();
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator4 = beelineWeightApproximator2.setDistanceCalc((com.graphhopper.util.DistanceCalc) distanceCalcEarth3);
        // The following exception was thrown during execution in test generation
        try {
            beelineWeightApproximator4.setTo((-791814527));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(beelineWeightApproximator4);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager5, false);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage8 = com.graphhopper.util.GHUtility.newStorage(graphHopperStorage7);
        graphHopperStorage8.flush();
        int int10 = graphHopperStorage8.getEdges();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(flagEncoderArray4);
        org.junit.Assert.assertNotNull(encodingManager5);
        org.junit.Assert.assertNotNull(graphHopperStorage8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        com.graphhopper.storage.NativeFSLockFactory nativeFSLockFactory0 = new com.graphhopper.storage.NativeFSLockFactory();
        java.io.File file1 = null;
        nativeFSLockFactory0.setLockDir(file1);
        java.io.File file3 = null;
        nativeFSLockFactory0.setLockDir(file3);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        virtualEdgeIteratorState11.setUnfavored(true);
        int int14 = virtualEdgeIteratorState11.getOriginalEdgeKey();
        int int15 = virtualEdgeIteratorState11.getAdjNode();
        int int16 = virtualEdgeIteratorState11.getAdjNode();
        int int17 = virtualEdgeIteratorState11.getOriginalEdgeKey();
        com.graphhopper.storage.IntsRef intsRef24 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean25 = intsRef24.isEmpty();
        com.graphhopper.util.PointList pointList27 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState29 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef24, "hike_rating", pointList27, false);
        com.graphhopper.storage.IntsRef intsRef32 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState38 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef32, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int39 = edgeIteratorState38.getEdge();
        virtualEdgeIteratorState29.setReverseEdge(edgeIteratorState38);
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue43 = new com.graphhopper.routing.ev.StringEncodedValue("bike_network", 10);
        com.graphhopper.storage.IntsRef intsRef46 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean47 = intsRef46.isEmpty();
        com.graphhopper.storage.IntsRef intsRef49 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int50 = intsRef46.compareTo(intsRef49);
        java.lang.String str51 = stringEncodedValue43.getString(false, intsRef49);
        int int53 = stringEncodedValue43.indexOf("name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        java.lang.String str54 = virtualEdgeIteratorState29.getReverse(stringEncodedValue43);
        java.lang.String str55 = stringEncodedValue43.getName();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState58 = virtualEdgeIteratorState11.set((com.graphhopper.routing.ev.IntEncodedValue) stringEncodedValue43, 11, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue bike_network supports only one direction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1048576 + "'", int14 == 1048576);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1048576 + "'", int17 == 1048576);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "bike_network" + "'", str55, "bike_network");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        virtualEdgeIteratorState11.setUnfavored(true);
        double double14 = virtualEdgeIteratorState11.getDistance();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue15 = null;
        com.graphhopper.storage.IntsRef intsRef18 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState24 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef18, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int25 = edgeIteratorState24.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue26 = com.graphhopper.routing.ev.Country.create();
        boolean boolean27 = countryEnumEncodedValue26.isStoreTwoDirections();
        com.graphhopper.routing.ev.Country country28 = edgeIteratorState24.getReverse(countryEnumEncodedValue26);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState29 = virtualEdgeIteratorState11.set(countryEnumEncodedValue15, country28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertNotNull(edgeIteratorState24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + country28 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country28.equals(com.graphhopper.routing.ev.Country.DEFAULT));
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile1 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str2 = customProfile1.toString();
        boolean boolean3 = customProfile1.isTurnCosts();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str2, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap0 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>();
        int[] intArray1 = strComparableGHIntObjectHashMap0.keys;
        boolean boolean2 = strComparableGHIntObjectHashMap0.isEmpty();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        com.graphhopper.routing.ev.DefaultEncodedValueFactory defaultEncodedValueFactory0 = new com.graphhopper.routing.ev.DefaultEncodedValueFactory();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.EncodedValue encodedValue2 = defaultEncodedValueFactory0.create("prepare.ch.edge.witness_search.sigma_factor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultEncodedValueFactory cannot find EncodedValue prepare.ch.edge.witness_search.sigma_factor");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.graphhopper.routing.util.parsers.OSMMaxAxleLoadParser oSMMaxAxleLoadParser0 = new com.graphhopper.routing.util.parsers.OSMMaxAxleLoadParser();
        com.graphhopper.routing.util.parsers.OSMRoadEnvironmentParser oSMRoadEnvironmentParser1 = new com.graphhopper.routing.util.parsers.OSMRoadEnvironmentParser();
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
        oSMRoadEnvironmentParser1.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager7, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList16);
        boolean boolean20 = encodingManager7.isEnableInstructions();
        com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser oSMHazmatTunnelParser21 = new com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray22 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager23 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray22);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue24 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue25 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray26 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue24, decimalEncodedValue25 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList27 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList27, encodedValueArray26);
        oSMHazmatTunnelParser21.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager23, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList27);
        com.graphhopper.storage.RAMDirectory rAMDirectory31 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory32 = rAMDirectory31.create();
        java.nio.ByteOrder byteOrder33 = rAMDirectory31.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray34 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager35 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray34);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage37 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory31, encodingManager35, false);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue39 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.util.details.IntDetails intDetails40 = new com.graphhopper.util.details.IntDetails("foot", (com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue39);
        com.graphhopper.routing.ev.IntEncodedValue intEncodedValue41 = com.graphhopper.routing.ev.HorseRating.create();
        com.graphhopper.storage.IntsRef intsRef44 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState50 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef44, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue51 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        double double52 = edgeIteratorState50.getReverse(decimalEncodedValue51);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue53 = com.graphhopper.routing.ev.Country.create();
        boolean boolean54 = countryEnumEncodedValue53.isStoreTwoDirections();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue55 = com.graphhopper.routing.ev.Country.create();
        boolean boolean56 = countryEnumEncodedValue55.isStoreTwoDirections();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray57 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue39, intEncodedValue41, decimalEncodedValue51, countryEnumEncodedValue53, countryEnumEncodedValue55 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList58 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList58, encodedValueArray57);
        oSMHazmatTunnelParser21.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager35, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList58);
        oSMMaxAxleLoadParser0.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager7, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList58);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(flagEncoderArray22);
        org.junit.Assert.assertNotNull(encodingManager23);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue24);
        org.junit.Assert.assertNotNull(decimalEncodedValue25);
        org.junit.Assert.assertNotNull(encodedValueArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(directory32);
        org.junit.Assert.assertNotNull(byteOrder33);
        org.junit.Assert.assertNotNull(flagEncoderArray34);
        org.junit.Assert.assertNotNull(encodingManager35);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue39);
        org.junit.Assert.assertNotNull(intEncodedValue41);
        org.junit.Assert.assertNotNull(edgeIteratorState50);
        org.junit.Assert.assertNotNull(decimalEncodedValue51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + Double.POSITIVE_INFINITY + "'", double52 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(encodedValueArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }
}
