import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        int int0 = com.graphhopper.util.Constants.VERSION_LOCATION_IDX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.graphhopper.reader.osm.pbf.PbfStreamSplitter pbfStreamSplitter0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        com.graphhopper.reader.osm.pbf.Sink sink3 = null;
        com.graphhopper.reader.osm.pbf.PbfDecoder pbfDecoder4 = new com.graphhopper.reader.osm.pbf.PbfDecoder(pbfStreamSplitter0, executorService1, (int) (short) 10, sink3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.IntsRef intsRef1 = new com.graphhopper.storage.IntsRef((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.util.FlagEncoder flagEncoder1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.GHUtility.printGraphForUnitTest(graph0, flagEncoder1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.util.EdgeFilter edgeFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.subnetwork.TarjanSCC.ConnectedComponents connectedComponents3 = com.graphhopper.routing.subnetwork.TarjanSCC.findComponentsRecursive(graph0, edgeFilter1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
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
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.graphhopper.routing.util.FlagEncoder flagEncoder0 = null;
        com.graphhopper.util.PMap pMap1 = null;
        com.graphhopper.routing.weighting.TurnCostProvider turnCostProvider2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.FastestWeighting fastestWeighting3 = new com.graphhopper.routing.weighting.FastestWeighting(flagEncoder0, pMap1, turnCostProvider2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.String str0 = com.graphhopper.routing.ev.GetOffBike.KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "get_off_bike" + "'", str0, "get_off_bike");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.graphhopper.util.DistanceCalcEuclidean distanceCalcEuclidean0 = new com.graphhopper.util.DistanceCalcEuclidean();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.shapes.GHPoint gHPoint5 = distanceCalcEuclidean0.projectCoordinate((double) (byte) 100, (double) 4, (double) (byte) -1, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported for the 2D Euclidean space");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.util.EdgeFilter edgeFilter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.GHUtility.printInfo(graph0, 4, (int) (byte) -1, edgeFilter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        double double0 = com.graphhopper.util.DistanceCalcEarth.METERS_PER_DEGREE;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 111194.92664455873d + "'", double0 == 111194.92664455873d);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.nio.ByteBuffer byteBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.MMapDataAccess.cleanMappedByteBuffer(byteBuffer0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType0 = com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH;
        org.junit.Assert.assertTrue("'" + parseType0 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH + "'", parseType0.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        javax.xml.stream.XMLStreamReader xMLStreamReader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.osm.OSMFileHeader oSMFileHeader2 = com.graphhopper.reader.osm.OSMFileHeader.create((-1L), xMLStreamReader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.graphhopper.util.shapes.Polygon polygon0 = null;
        com.graphhopper.util.EdgeIteratorState edgeIteratorState1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = com.graphhopper.routing.weighting.custom.CustomWeightingHelper.in(polygon0, edgeIteratorState1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        double double0 = com.graphhopper.routing.ev.MaxSpeed.UNLIMITED_SIGN_SPEED;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 150.0d + "'", double0 == 150.0d);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        int int0 = com.graphhopper.routing.weighting.Weighting.INFINITE_U_TURN_COSTS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.graphhopper.routing.util.PriorityCode priorityCode0 = com.graphhopper.routing.util.PriorityCode.AVOID_IF_POSSIBLE;
        org.junit.Assert.assertTrue("'" + priorityCode0 + "' != '" + com.graphhopper.routing.util.PriorityCode.AVOID_IF_POSSIBLE + "'", priorityCode0.equals(com.graphhopper.routing.util.PriorityCode.AVOID_IF_POSSIBLE));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.graphhopper.routing.util.TransportationMode transportationMode0 = com.graphhopper.routing.util.TransportationMode.VEHICLE;
        org.junit.Assert.assertTrue("'" + transportationMode0 + "' != '" + com.graphhopper.routing.util.TransportationMode.VEHICLE + "'", transportationMode0.equals(com.graphhopper.routing.util.TransportationMode.VEHICLE));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.carrotsearch.hppc.HashOrderMixingStrategy hashOrderMixingStrategy2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHIntHashSet gHIntHashSet3 = new com.graphhopper.coll.GHIntHashSet((int) (byte) 0, (double) (-1L), hashOrderMixingStrategy2);
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.hppc.BufferAllocationException; message: The load factor should be in range [0.01, 0.99]: -1.000000");
        } catch (com.carrotsearch.hppc.BufferAllocationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        double double1 = com.graphhopper.routing.util.PriorityCode.getFactor(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.UnsignedIntEncodedValue unsignedIntEncodedValue3 = new com.graphhopper.routing.ev.UnsignedIntEncodedValue("hi!", (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue name wasn't valid: hi!. Use lower case letters, underscore and numbers only.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.nio.ByteBuffer byteBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.BitSet bitSet1 = java.util.BitSet.valueOf(byteBuffer0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.String str0 = com.graphhopper.routing.ev.RoadClassLink.KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "road_class_link" + "'", str0, "road_class_link");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        int int0 = com.graphhopper.util.Constants.VERSION_SHORTCUT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.graphhopper.util.AngleCalc angleCalc0 = com.graphhopper.util.AngleCalc.ANGLE_CALC;
        double double5 = angleCalc0.calcAzimuth((double) 1, (double) (-1), (double) 4, (double) 0.0f);
        org.junit.Assert.assertNotNull(angleCalc0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 18.42059311345597d + "'", double5 == 18.42059311345597d);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        int int0 = com.graphhopper.reader.ReaderRelation.Member.WAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.graphhopper.routing.weighting.Weighting weighting0 = null;
        com.graphhopper.util.EdgeIteratorState edgeIteratorState1 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.graphhopper.util.GHUtility.calcWeightWithTurnWeight(weighting0, edgeIteratorState1, true, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.nio.ByteOrder byteOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.BitUtil bitUtil1 = com.graphhopper.util.BitUtil.get(byteOrder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.graphhopper.reader.OSMTurnRelation.Type type0 = com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED + "'", type0.equals(com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue0 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.EncodedValue.InitializerConfig initializerConfig1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = countryEnumEncodedValue0.init(initializerConfig1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(countryEnumEncodedValue0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.util.EncodingManager encodingManager2 = null;
        com.graphhopper.routing.util.FlagEncoder flagEncoder3 = null;
        com.graphhopper.storage.TurnCostStorage turnCostStorage5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.GHUtility.addRandomTurnCosts(graph0, (long) 1, encodingManager2, flagEncoder3, (int) (byte) 0, turnCostStorage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.graphhopper.reader.OSMTurnRelation.Type type0 = com.graphhopper.reader.OSMTurnRelation.Type.ONLY;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + com.graphhopper.reader.OSMTurnRelation.Type.ONLY + "'", type0.equals(com.graphhopper.reader.OSMTurnRelation.Type.ONLY));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.graphhopper.routing.weighting.WeightApproximator weightApproximator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.BalancedWeightApproximator balancedWeightApproximator1 = new com.graphhopper.routing.weighting.BalancedWeightApproximator(weightApproximator0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: WeightApproximator cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.String str0 = com.graphhopper.routing.ch.CHParameters.MIN_MAX_SETTLED_EDGES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "prepare.ch.edge.witness_search.min_max_settled_edges" + "'", str0, "prepare.ch.edge.witness_search.min_max_settled_edges");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.graphhopper.routing.util.FlagEncoder flagEncoder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.ShortFastestWeighting shortFastestWeighting2 = new com.graphhopper.routing.weighting.ShortFastestWeighting(flagEncoder0, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.locationtech.jts.geom.Polygon[] polygonArray0 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList1 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList1, polygonArray0);
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule3 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList1);
        com.graphhopper.routing.ev.RoadClass roadClass4 = com.graphhopper.routing.ev.RoadClass.LIVING_STREET;
        com.graphhopper.routing.util.TransportationMode transportationMode5 = com.graphhopper.routing.util.TransportationMode.CAR;
        double double7 = austriaSpatialRule3.getMaxSpeed(roadClass4, transportationMode5, (double) 1L);
        org.junit.Assert.assertNotNull(polygonArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + roadClass4 + "' != '" + com.graphhopper.routing.ev.RoadClass.LIVING_STREET + "'", roadClass4.equals(com.graphhopper.routing.ev.RoadClass.LIVING_STREET));
        org.junit.Assert.assertTrue("'" + transportationMode5 + "' != '" + com.graphhopper.routing.util.TransportationMode.CAR + "'", transportationMode5.equals(com.graphhopper.routing.util.TransportationMode.CAR));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.graphhopper.storage.RoutingCHGraph routingCHGraph0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.DijkstraBidirectionCHNoSOD dijkstraBidirectionCHNoSOD1 = new com.graphhopper.routing.DijkstraBidirectionCHNoSOD(routingCHGraph0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.String str0 = com.graphhopper.routing.ev.MaxWidth.KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "max_width" + "'", str0, "max_width");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.locationtech.jts.geom.Envelope envelope0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.shapes.BBox bBox1 = com.graphhopper.util.shapes.BBox.fromEnvelope(envelope0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.String str0 = com.graphhopper.routing.util.FlagEncoderFactory.BIKE2;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bike2" + "'", str0, "bike2");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        double double0 = com.graphhopper.util.DistanceCalcEarth.KM_MILE;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.609344d + "'", double0 == 1.609344d);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.util.EdgeFilter edgeFilter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.GHUtility.printInfo(graph0, 100, (int) (byte) 0, edgeFilter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        int[] intArray5 = new int[] { 1, ' ', (short) -1, 100, 1 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = com.graphhopper.util.ArrayUtil.invert(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 32, -1, 100, 1]");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.graphhopper.util.DistanceCalcEuclidean distanceCalcEuclidean0 = new com.graphhopper.util.DistanceCalcEuclidean();
        double double7 = distanceCalcEuclidean0.calcNormalizedEdgeDistance(0.0d, (double) (-1.0f), (double) ' ', (double) 1.0f, (double) (-1), (double) 100L);
        com.graphhopper.util.shapes.GHPoint gHPoint13 = distanceCalcEuclidean0.intermediatePoint((double) 0L, (double) 100.0f, (double) (byte) 0, (double) 100.0f, (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.shapes.BBox bBox17 = distanceCalcEuclidean0.createBBox(111194.92664455873d, (double) (short) 0, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported for the 2D Euclidean space");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 960.3999999999999d + "'", double7 == 960.3999999999999d);
        org.junit.Assert.assertNotNull(gHPoint13);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.carrotsearch.hppc.ObjectIntAssociativeContainer objectIntAssociativeContainer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHObjectIntHashMap<com.carrotsearch.hppc.IntArrayList> intArrayListGHObjectIntHashMap1 = new com.graphhopper.coll.GHObjectIntHashMap<com.carrotsearch.hppc.IntArrayList>(objectIntAssociativeContainer0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.graphhopper.routing.DirectionResolverResult directionResolverResult0 = null;
        int int2 = com.graphhopper.routing.DirectionResolverResult.getOutEdge(directionResolverResult0, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.carrotsearch.hppc.HashOrderMixingStrategy hashOrderMixingStrategy2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap3 = new com.graphhopper.coll.GHLongLongHashMap((int) 'a', 18.42059311345597d, hashOrderMixingStrategy2);
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.hppc.BufferAllocationException; message: The load factor should be in range [0.01, 0.99]: 18.420593");
        } catch (com.carrotsearch.hppc.BufferAllocationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.String str0 = com.graphhopper.routing.weighting.custom.CustomWeighting.NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "custom" + "'", str0, "custom");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        boolean boolean0 = com.graphhopper.util.Constants.JRE_IS_MINIMUM_JAVA9;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.graphhopper.routing.util.PriorityCode priorityCode0 = com.graphhopper.routing.util.PriorityCode.AVOID_AT_ALL_COSTS;
        org.junit.Assert.assertTrue("'" + priorityCode0 + "' != '" + com.graphhopper.routing.util.PriorityCode.AVOID_AT_ALL_COSTS + "'", priorityCode0.equals(com.graphhopper.routing.util.PriorityCode.AVOID_AT_ALL_COSTS));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        double double0 = com.graphhopper.routing.ev.MaxSpeed.UNSET_SPEED;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + Double.POSITIVE_INFINITY + "'", double0 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.String str0 = com.graphhopper.routing.ch.CHParameters.LOG_MESSAGES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "prepare.ch.log_messages" + "'", str0, "prepare.ch.log_messages");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.graphhopper.util.DistanceCalcEuclidean distanceCalcEuclidean0 = new com.graphhopper.util.DistanceCalcEuclidean();
        double double7 = distanceCalcEuclidean0.calcNormalizedEdgeDistance(0.0d, (double) (-1.0f), (double) ' ', (double) 1.0f, (double) (-1), (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = distanceCalcEuclidean0.calcCircumference((double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported for the 2D Euclidean space");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 960.3999999999999d + "'", double7 == 960.3999999999999d);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.graphhopper.util.PMap pMap1 = null;
        com.graphhopper.routing.weighting.Weighting weighting2 = null;
        com.graphhopper.storage.NodeAccess nodeAccess3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.WeightApproximator weightApproximator4 = com.graphhopper.routing.RoutingAlgorithmFactorySimple.getApproximation("get_off_bike", pMap1, weighting2, nodeAccess3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.graphhopper.storage.Graph graph0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList1 = com.graphhopper.util.GHUtility.getProblems(graph0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
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
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.String str0 = com.graphhopper.routing.util.FlagEncoderFactory.MOUNTAINBIKE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mtb" + "'", str0, "mtb");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        boolean boolean0 = com.graphhopper.util.Constants.MAC_OS_X;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue0 = com.graphhopper.routing.ev.Country.create();
        java.lang.String str1 = countryEnumEncodedValue0.getName();
        com.graphhopper.storage.IntsRef intsRef3 = com.graphhopper.storage.IntsRef.EMPTY;
        com.graphhopper.storage.IntsRef intsRef4 = com.graphhopper.storage.IntsRef.EMPTY;
        boolean boolean5 = intsRef3.intsEquals(intsRef4);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.Country country6 = countryEnumEncodedValue0.getEnum(false, intsRef4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(countryEnumEncodedValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "country" + "'", str1, "country");
        org.junit.Assert.assertNotNull(intsRef3);
        org.junit.Assert.assertNotNull(intsRef4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.UnsignedDecimalEncodedValue unsignedDecimalEncodedValue4 = new com.graphhopper.routing.ev.UnsignedDecimalEncodedValue("prepare.ch.log_messages", 1, (double) (-1.0f), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue name wasn't valid: prepare.ch.log_messages. Use lower case letters, underscore and numbers only.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.graphhopper.routing.ev.HazmatTunnel hazmatTunnel0 = com.graphhopper.routing.ev.HazmatTunnel.A;
        org.junit.Assert.assertTrue("'" + hazmatTunnel0 + "' != '" + com.graphhopper.routing.ev.HazmatTunnel.A + "'", hazmatTunnel0.equals(com.graphhopper.routing.ev.HazmatTunnel.A));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.util.FlagEncoder flagEncoder1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.GHUtility.printEdgeInfo(graph0, flagEncoder1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        int int0 = com.graphhopper.storage.index.Snap.INVALID_NODE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue3 = new com.graphhopper.routing.ev.StringEncodedValue("cgiar", (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cgiar: at the moment the number of reserved bits cannot be more than 31");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.util.TraversalMode traversalMode2 = com.graphhopper.routing.util.TraversalMode.EDGE_BASED;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.AStarBidirection aStarBidirection3 = new com.graphhopper.routing.AStarBidirection(graph0, weighting1, traversalMode2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + traversalMode2 + "' != '" + com.graphhopper.routing.util.TraversalMode.EDGE_BASED + "'", traversalMode2.equals(com.graphhopper.routing.util.TraversalMode.EDGE_BASED));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.graphhopper.util.shapes.BBox bBox0 = null;
        com.graphhopper.storage.index.LocationIndex locationIndex1 = null;
        java.util.Random random2 = null;
        com.graphhopper.routing.util.EdgeFilter edgeFilter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.graphhopper.storage.index.Snap> snapList6 = com.graphhopper.util.GHUtility.createRandomSnaps(bBox0, locationIndex1, random2, (int) (byte) 100, true, edgeFilter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        int int0 = com.graphhopper.reader.ReaderRelation.Member.RELATION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.graphhopper.reader.dem.ElevationProvider elevationProvider0 = null;
        com.graphhopper.reader.dem.ElevationProvider elevationProvider1 = null;
        com.graphhopper.reader.dem.MultiSourceElevationProvider multiSourceElevationProvider2 = new com.graphhopper.reader.dem.MultiSourceElevationProvider(elevationProvider0, elevationProvider1);
        // The following exception was thrown during execution in test generation
        try {
            multiSourceElevationProvider2.setInterpolate(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.String str1 = com.graphhopper.routing.ev.RouteNetwork.key("custom");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "custom_network" + "'", str1, "custom_network");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.CHConfig cHConfig2 = com.graphhopper.storage.CHConfig.nodeBased("hi!", weighting1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Profile names may only contain lower case letters, numbers and underscores, given: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.graphhopper.routing.ev.BikeNetwork bikeNetwork0 = new com.graphhopper.routing.ev.BikeNetwork();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue0 = com.graphhopper.routing.ev.Country.create();
        java.lang.String str1 = countryEnumEncodedValue0.getName();
        com.graphhopper.storage.IntsRef intsRef3 = com.graphhopper.storage.IntsRef.EMPTY;
        com.graphhopper.storage.IntsRef intsRef4 = com.graphhopper.storage.IntsRef.EMPTY;
        boolean boolean5 = intsRef3.intsEquals(intsRef4);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = countryEnumEncodedValue0.getInt(true, intsRef3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(countryEnumEncodedValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "country" + "'", str1, "country");
        org.junit.Assert.assertNotNull(intsRef3);
        org.junit.Assert.assertNotNull(intsRef4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        javax.xml.stream.XMLStreamReader xMLStreamReader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.osm.OSMFileHeader oSMFileHeader2 = com.graphhopper.reader.osm.OSMFileHeader.create((long) (short) 0, xMLStreamReader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHIntHashSet gHIntHashSet2 = new com.graphhopper.coll.GHIntHashSet((int) (byte) 0, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.hppc.BufferAllocationException; message: The load factor should be in range [0.01, 0.99]: -1.000000");
        } catch (com.carrotsearch.hppc.BufferAllocationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.graphhopper.storage.IntsRef intsRef0 = com.graphhopper.storage.IntsRef.EMPTY;
        com.graphhopper.storage.IntsRef intsRef1 = com.graphhopper.storage.IntsRef.EMPTY;
        boolean boolean2 = intsRef0.intsEquals(intsRef1);
        com.graphhopper.reader.ReaderWay readerWay3 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue4 = com.graphhopper.routing.ev.MaxWeight.create();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "prepare.ch.log_messages", "prepare.ch.log_messages" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.parsers.helpers.OSMValueExtractor.extractMeter(intsRef0, readerWay3, decimalEncodedValue4, (java.util.List<java.lang.String>) strList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intsRef0);
        org.junit.Assert.assertNotNull(intsRef1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(decimalEncodedValue4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        int int2 = com.graphhopper.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "get_off_bike", (java.lang.CharSequence) "country");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.graphhopper.util.SimpleIntDeque simpleIntDeque1 = new com.graphhopper.util.SimpleIntDeque((int) 'a');
        int int2 = simpleIntDeque1.pop();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.graphhopper.routing.RoundTripRouting.Params params0 = new com.graphhopper.routing.RoundTripRouting.Params();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.String str0 = com.graphhopper.util.Constants.VERSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "3.0" + "'", str0, "3.0");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.graphhopper.util.DistanceCalcEuclidean distanceCalcEuclidean0 = new com.graphhopper.util.DistanceCalcEuclidean();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.shapes.GHPoint gHPoint5 = distanceCalcEuclidean0.projectCoordinate((-1.0d), (double) (byte) 100, 150.0d, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported for the 2D Euclidean space");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.graphhopper.routing.ev.Surface surface0 = com.graphhopper.routing.ev.Surface.GRAVEL;
        org.junit.Assert.assertTrue("'" + surface0 + "' != '" + com.graphhopper.routing.ev.Surface.GRAVEL + "'", surface0.equals(com.graphhopper.routing.ev.Surface.GRAVEL));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        long[] longArray1 = new long[] { 10 };
        com.carrotsearch.hppc.LongHashSet longHashSet2 = com.carrotsearch.hppc.LongHashSet.from(longArray1);
        boolean boolean4 = longHashSet2.add((-1L));
        long[] longArray5 = longHashSet2.keys;
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[10]");
        org.junit.Assert.assertNotNull(longHashSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(longArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, 0, -1, 10, 0]");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.graphhopper.routing.querygraph.QueryGraph queryGraph0 = null;
        com.graphhopper.routing.RoutingAlgorithmFactory routingAlgorithmFactory1 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions2 = null;
        com.graphhopper.routing.FlexiblePathCalculator flexiblePathCalculator3 = new com.graphhopper.routing.FlexiblePathCalculator(queryGraph0, routingAlgorithmFactory1, algorithmOptions2);
        com.graphhopper.routing.AlgorithmOptions algorithmOptions4 = flexiblePathCalculator3.getAlgoOpts();
        org.junit.Assert.assertNull(algorithmOptions4);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        boolean boolean0 = com.graphhopper.util.Constants.LINUX;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.carrotsearch.hppc.IntArrayList intArrayList1 = com.graphhopper.util.ArrayUtil.iota(4);
        java.util.Random random2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.carrotsearch.hppc.IntArrayList intArrayList3 = com.graphhopper.util.ArrayUtil.shuffle(intArrayList1, random2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArrayList1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        javax.xml.stream.XMLStreamReader xMLStreamReader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.ReaderRelation readerRelation2 = com.graphhopper.reader.osm.OSMXMLHelper.createRelation((long) (byte) 100, xMLStreamReader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.graphhopper.util.DistancePlaneProjection distancePlaneProjection0 = com.graphhopper.util.DistancePlaneProjection.DIST_PLANE;
        double double5 = distancePlaneProjection0.calcDist((double) (byte) 0, 0.0d, (double) 1.0f, 150.0d);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.shapes.BBox bBox9 = distancePlaneProjection0.createBBox((double) (byte) 1, (double) '#', (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Distance must not be zero or negative! 0.0 lat,lon:1.0,35.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(distancePlaneProjection0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.667897456212138E7d + "'", double5 == 1.667897456212138E7d);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.graphhopper.util.DistanceCalc distanceCalc3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.shapes.Circle circle4 = new com.graphhopper.util.shapes.Circle(1.667897456212138E7d, (double) (short) -1, (double) 1L, distanceCalc3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue0 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.storage.IntsRef intsRef2 = com.graphhopper.storage.IntsRef.EMPTY;
        // The following exception was thrown during execution in test generation
        try {
            decimalEncodedValue0.setDecimal(true, intsRef2, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Call init before usage for EncodedValue max_weight|version=1841716118|bits=8|index=0|shift=-1|store_both_directions=false");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(decimalEncodedValue0);
        org.junit.Assert.assertNotNull(intsRef2);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.graphhopper.routing.ev.MaxAxleLoad maxAxleLoad0 = new com.graphhopper.routing.ev.MaxAxleLoad();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.graphhopper.routing.ev.Toll toll0 = com.graphhopper.routing.ev.Toll.NO;
        org.junit.Assert.assertTrue("'" + toll0 + "' != '" + com.graphhopper.routing.ev.Toll.NO + "'", toll0.equals(com.graphhopper.routing.ev.Toll.NO));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.graphhopper.routing.ev.RoadClass roadClass0 = com.graphhopper.routing.ev.RoadClass.OTHER;
        org.junit.Assert.assertTrue("'" + roadClass0 + "' != '" + com.graphhopper.routing.ev.RoadClass.OTHER + "'", roadClass0.equals(com.graphhopper.routing.ev.RoadClass.OTHER));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.graphhopper.coll.MinHeapWithUpdate minHeapWithUpdate1 = new com.graphhopper.coll.MinHeapWithUpdate((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            minHeapWithUpdate1.update((int) (byte) 1, (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: The heap does not contain: 1. Use the contains method to check this before calling update");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.graphhopper.routing.ev.RoadAccess roadAccess0 = com.graphhopper.routing.ev.RoadAccess.CUSTOMERS;
        org.junit.Assert.assertTrue("'" + roadAccess0 + "' != '" + com.graphhopper.routing.ev.RoadAccess.CUSTOMERS + "'", roadAccess0.equals(com.graphhopper.routing.ev.RoadAccess.CUSTOMERS));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.graphhopper.routing.ev.Surface surface0 = com.graphhopper.routing.ev.Surface.ASPHALT;
        org.junit.Assert.assertTrue("'" + surface0 + "' != '" + com.graphhopper.routing.ev.Surface.ASPHALT + "'", surface0.equals(com.graphhopper.routing.ev.Surface.ASPHALT));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage0 = null;
        com.graphhopper.reader.dem.NodeElevationInterpolator nodeElevationInterpolator1 = new com.graphhopper.reader.dem.NodeElevationInterpolator(graphHopperStorage0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.storage.index.Snap snap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.querygraph.QueryGraph queryGraph2 = com.graphhopper.routing.querygraph.QueryGraph.create(graph0, snap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
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
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
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
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.graphhopper.routing.util.PriorityCode priorityCode0 = com.graphhopper.routing.util.PriorityCode.REACH_DEST;
        org.junit.Assert.assertTrue("'" + priorityCode0 + "' != '" + com.graphhopper.routing.util.PriorityCode.REACH_DEST + "'", priorityCode0.equals(com.graphhopper.routing.util.PriorityCode.REACH_DEST));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.graphhopper.storage.NodeAccess nodeAccess0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator2 = new com.graphhopper.routing.weighting.BeelineWeightApproximator(nodeAccess0, weighting1);
        // The following exception was thrown during execution in test generation
        try {
            beelineWeightApproximator2.setTo((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.locationtech.jts.geom.Polygon[] polygonArray0 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList1 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList1, polygonArray0);
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule3 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList1);
        org.locationtech.jts.geom.Polygon[] polygonArray4 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList5 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList5, polygonArray4);
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule7 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList5);
        java.lang.String str8 = austriaSpatialRule7.toString();
        com.graphhopper.routing.util.spatialrules.SpatialRule[] spatialRuleArray9 = new com.graphhopper.routing.util.spatialrules.SpatialRule[] { austriaSpatialRule3, austriaSpatialRule7 };
        java.util.ArrayList<com.graphhopper.routing.util.spatialrules.SpatialRule> spatialRuleList10 = new java.util.ArrayList<com.graphhopper.routing.util.spatialrules.SpatialRule>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.util.spatialrules.SpatialRule>) spatialRuleList10, spatialRuleArray9);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.spatialrules.SpatialRuleLookupJTS spatialRuleLookupJTS12 = new com.graphhopper.routing.util.spatialrules.SpatialRuleLookupJTS((java.util.List<com.graphhopper.routing.util.spatialrules.SpatialRule>) spatialRuleList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duplicate rule ID: \"aut\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(polygonArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(polygonArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SpatialRule [getId()=aut, getPriority()=100]" + "'", str8, "SpatialRule [getId()=aut, getPriority()=100]");
        org.junit.Assert.assertNotNull(spatialRuleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ch.NodeBasedWitnessPathSearcher nodeBasedWitnessPathSearcher1 = new com.graphhopper.routing.ch.NodeBasedWitnessPathSearcher(cHPreparationGraph0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        int int1 = com.graphhopper.util.GHUtility.reverseEdgeKey(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.graphhopper.routing.ev.FootNetwork footNetwork0 = new com.graphhopper.routing.ev.FootNetwork();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.graphhopper.util.JsonFeatureCollection[] jsonFeatureCollectionArray0 = new com.graphhopper.util.JsonFeatureCollection[] {};
        java.util.ArrayList<com.graphhopper.util.JsonFeatureCollection> jsonFeatureCollectionList1 = new java.util.ArrayList<com.graphhopper.util.JsonFeatureCollection>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.util.JsonFeatureCollection>) jsonFeatureCollectionList1, jsonFeatureCollectionArray0);
        com.graphhopper.routing.util.spatialrules.SpatialRuleFactory spatialRuleFactory4 = null;
        org.locationtech.jts.geom.Envelope envelope5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.spatialrules.SpatialRuleLookup spatialRuleLookup6 = com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder.buildIndex((java.util.List<com.graphhopper.util.JsonFeatureCollection>) jsonFeatureCollectionList1, "country", spatialRuleFactory4, envelope5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFeatureCollectionArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.graphhopper.routing.AStar.AStarEntry aStarEntry4 = new com.graphhopper.routing.AStar.AStarEntry((-2), 4, (double) 10, (double) (byte) -1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.graphhopper.util.PMap pMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.MotorcycleFlagEncoder motorcycleFlagEncoder1 = new com.graphhopper.routing.util.MotorcycleFlagEncoder(pMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.graphhopper.routing.lm.LandmarkStorage landmarkStorage0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.lm.LMRoutingAlgorithmFactory lMRoutingAlgorithmFactory1 = new com.graphhopper.routing.lm.LMRoutingAlgorithmFactory(landmarkStorage0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.graphhopper.routing.Path path0 = null;
        com.graphhopper.storage.Graph graph1 = null;
        com.graphhopper.routing.weighting.Weighting weighting2 = null;
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup3 = null;
        java.util.Locale locale4 = null;
        com.graphhopper.util.TranslationMap.TranslationHashMap translationHashMap5 = new com.graphhopper.util.TranslationMap.TranslationHashMap(locale4);
        com.graphhopper.util.TranslationMap.TranslationHashMap translationHashMap8 = translationHashMap5.put("mtb", "get_off_bike");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.InstructionList instructionList9 = com.graphhopper.routing.InstructionsFromEdges.calcInstructions(path0, graph1, weighting2, encodedValueLookup3, (com.graphhopper.util.Translation) translationHashMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(translationHashMap8);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.graphhopper.routing.util.FlagEncoder flagEncoder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.graphhopper.routing.util.EncodingManager.getKey(flagEncoder0, "[]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.util.EdgeFilter edgeFilter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.GHUtility.printInfo(graph0, (-1), (int) '4', edgeFilter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
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
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.graphhopper.routing.ev.GetOffBike getOffBike0 = new com.graphhopper.routing.ev.GetOffBike();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        int[] intArray6 = new int[] { 100 };
        long[] longArray8 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap9 = com.carrotsearch.hppc.IntLongHashMap.from(intArray6, longArray8);
        com.carrotsearch.hppc.LongLongHashMap longLongHashMap10 = com.carrotsearch.hppc.LongLongHashMap.from(longArray3, longArray8);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             longLongHashMap10.indexInsert((int) (short) 1, (long) (-2), (long) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
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
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.graphhopper.storage.Graph graph0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.Path path1 = new com.graphhopper.routing.Path(graph0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.util.EdgeFilter edgeFilter1 = null;
        com.carrotsearch.hppc.IntArrayList intArrayList4 = com.graphhopper.util.ArrayUtil.constant((int) (short) -1, (int) (byte) 1);
        com.graphhopper.routing.weighting.TurnCostProvider turnCostProvider5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.subnetwork.EdgeBasedTarjanSCC.ConnectedComponents connectedComponents6 = com.graphhopper.routing.subnetwork.EdgeBasedTarjanSCC.findComponentsForStartEdges(graph0, edgeFilter1, (com.carrotsearch.hppc.IntContainer) intArrayList4, turnCostProvider5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArrayList4);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.graphhopper.util.EdgeExplorer edgeExplorer0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.RoutingCHEdgeIteratorImpl routingCHEdgeIteratorImpl2 = com.graphhopper.storage.RoutingCHEdgeIteratorImpl.outEdges(edgeExplorer0, weighting1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        double double1 = com.graphhopper.routing.util.parsers.helpers.OSMValueExtractor.stringToMeter("get_off_bike");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
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
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState2 = disabledEdgeIterator0.setDistance((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        com.carrotsearch.hppc.LongCollection longCollection5 = intLongHashMap4.values();
        com.carrotsearch.hppc.IntLongHashMap.KeysContainer keysContainer6 = intLongHashMap4.keys();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = 0L; // flaky: intLongHashMap4.indexReplace((int) 'a', (long) 7);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(longCollection5);
        org.junit.Assert.assertNotNull(keysContainer6);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.graphhopper.routing.ev.Surface surface0 = com.graphhopper.routing.ev.Surface.GRASS;
        org.junit.Assert.assertTrue("'" + surface0 + "' != '" + com.graphhopper.routing.ev.Surface.GRASS + "'", surface0.equals(com.graphhopper.routing.ev.Surface.GRASS));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.util.EdgeFilter edgeFilter1 = null;
        com.carrotsearch.hppc.IntArrayList intArrayList3 = com.graphhopper.util.ArrayUtil.iota(4);
        com.graphhopper.routing.weighting.TurnCostProvider turnCostProvider4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.subnetwork.EdgeBasedTarjanSCC.ConnectedComponents connectedComponents5 = com.graphhopper.routing.subnetwork.EdgeBasedTarjanSCC.findComponentsForStartEdges(graph0, edgeFilter1, (com.carrotsearch.hppc.IntContainer) intArrayList3, turnCostProvider4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArrayList3);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph2 = com.graphhopper.routing.ch.CHPreparationGraph.nodeBased((int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
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
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.util.EdgeFilter edgeFilter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.graphhopper.util.GHUtility.getNodeInfo(graph0, 0, edgeFilter2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue0 = com.graphhopper.routing.ev.Country.create();
        java.lang.String str1 = countryEnumEncodedValue0.getName();
        com.graphhopper.storage.IntsRef intsRef3 = com.graphhopper.storage.IntsRef.EMPTY;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = countryEnumEncodedValue0.getInt(false, intsRef3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(countryEnumEncodedValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "country" + "'", str1, "country");
        org.junit.Assert.assertNotNull(intsRef3);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = com.graphhopper.reader.osm.OSMReaderUtility.parseDuration("custom_network");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot parse duration tag value: custom_network");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.graphhopper.storage.CHGraph cHGraph0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.CHEdgeIteratorState cHEdgeIteratorState3 = com.graphhopper.util.GHUtility.getEdge(cHGraph0, (int) ' ', (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState2 = disabledEdgeIterator0.setName("road_class_link");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.String str0 = com.graphhopper.routing.util.FlagEncoderFactory.WHEELCHAIR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "wheelchair" + "'", str0, "wheelchair");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        boolean boolean1 = com.graphhopper.routing.util.parsers.helpers.OSMValueExtractor.isInvalidValue("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue1 = null;
        com.graphhopper.routing.weighting.TurnCostProvider turnCostProvider2 = null;
        com.graphhopper.routing.subnetwork.PrepareRoutingSubnetworks.PrepareJob prepareJob3 = new com.graphhopper.routing.subnetwork.PrepareRoutingSubnetworks.PrepareJob("get_off_bike", booleanEncodedValue1, turnCostProvider2);
        java.lang.String str4 = prepareJob3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "get_off_bike|node-based" + "'", str4, "get_off_bike|node-based");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.graphhopper.reader.dem.ElevationProvider elevationProvider0 = null;
        com.graphhopper.reader.dem.ElevationProvider elevationProvider1 = null;
        com.graphhopper.reader.dem.MultiSourceElevationProvider multiSourceElevationProvider2 = new com.graphhopper.reader.dem.MultiSourceElevationProvider(elevationProvider0, elevationProvider1);
        java.lang.String str3 = multiSourceElevationProvider2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "multi" + "'", str3, "multi");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.osm.OSMInputFile oSMInputFile1 = new com.graphhopper.reader.osm.OSMInputFile(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.graphhopper.routing.RoutingAlgorithmFactorySimple routingAlgorithmFactorySimple0 = new com.graphhopper.routing.RoutingAlgorithmFactorySimple();
        com.graphhopper.storage.Graph graph1 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.RoutingAlgorithm routingAlgorithm3 = routingAlgorithmFactorySimple0.createAlgo(graph1, algorithmOptions2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue1 = com.graphhopper.routing.ev.Country.create();
        java.lang.String str2 = countryEnumEncodedValue1.getName();
        com.graphhopper.routing.ev.Country[] countryArray3 = countryEnumEncodedValue1.getValues();
        com.graphhopper.routing.ev.Country country4 = null;
        com.graphhopper.routing.ev.Country country5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState6 = disabledEdgeIterator0.set(countryEnumEncodedValue1, country4, country5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(countryEnumEncodedValue1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "country" + "'", str2, "country");
        org.junit.Assert.assertNotNull(countryArray3);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.graphhopper.routing.ev.RoadAccess roadAccess0 = com.graphhopper.routing.ev.RoadAccess.AGRICULTURAL;
        org.junit.Assert.assertTrue("'" + roadAccess0 + "' != '" + com.graphhopper.routing.ev.RoadAccess.AGRICULTURAL + "'", roadAccess0.equals(com.graphhopper.routing.ev.RoadAccess.AGRICULTURAL));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.graphhopper.util.PMap pMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.RacingBikeFlagEncoder racingBikeFlagEncoder1 = new com.graphhopper.routing.util.RacingBikeFlagEncoder(pMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHIntHashSet gHIntHashSet2 = new com.graphhopper.coll.GHIntHashSet(4, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.hppc.BufferAllocationException; message: The load factor should be in range [0.01, 0.99]: 1.000000");
        } catch (com.carrotsearch.hppc.BufferAllocationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.graphhopper.routing.util.FerrySpeedCalculator ferrySpeedCalculator5 = new com.graphhopper.routing.util.FerrySpeedCalculator((double) (byte) 0, (double) 'a', (double) (-1L), 18.42059311345597d, (double) (-1));
        com.graphhopper.reader.ReaderWay readerWay6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = ferrySpeedCalculator5.getSpeed(readerWay6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.util.Locale locale0 = null;
        com.graphhopper.util.TranslationMap.TranslationHashMap translationHashMap1 = new com.graphhopper.util.TranslationMap.TranslationHashMap(locale0);
        com.graphhopper.util.TranslationMap.TranslationHashMap translationHashMap4 = translationHashMap1.put("mtb", "get_off_bike");
        java.lang.String str5 = translationHashMap4.toString();
        org.junit.Assert.assertNotNull(translationHashMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{mtb=get_off_bike}" + "'", str5, "{mtb=get_off_bike}");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.graphhopper.coll.MinHeapWithUpdate minHeapWithUpdate1 = new com.graphhopper.coll.MinHeapWithUpdate((int) (byte) 10);
        boolean boolean2 = minHeapWithUpdate1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            minHeapWithUpdate1.push((int) (byte) 10, (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal id: 10, legal range: [0, 10[");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.graphhopper.routing.ev.Surface surface0 = com.graphhopper.routing.ev.Surface.SAND;
        org.junit.Assert.assertTrue("'" + surface0 + "' != '" + com.graphhopper.routing.ev.Surface.SAND + "'", surface0.equals(com.graphhopper.routing.ev.Surface.SAND));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.graphhopper.reader.ReaderRelation.Member member3 = new com.graphhopper.reader.ReaderRelation.Member((int) (byte) 0, (long) 0, "cgiar");
        int int4 = member3.getType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.graphhopper.reader.dem.ElevationProvider elevationProvider0 = null;
        com.graphhopper.reader.dem.ElevationProvider elevationProvider1 = null;
        com.graphhopper.reader.dem.MultiSourceElevationProvider multiSourceElevationProvider2 = new com.graphhopper.reader.dem.MultiSourceElevationProvider(elevationProvider0, elevationProvider1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = multiSourceElevationProvider2.getInterpolate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.graphhopper.routing.util.FlagEncoder flagEncoder2 = null;
        com.graphhopper.storage.IntsRef intsRef3 = com.graphhopper.storage.IntsRef.EMPTY;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.IntsRef intsRef4 = com.graphhopper.util.GHUtility.setSpeed((double) 10, 1.2361865545667784E10d, flagEncoder2, intsRef3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intsRef3);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.graphhopper.reader.dem.GraphElevationSmoothing graphElevationSmoothing0 = new com.graphhopper.reader.dem.GraphElevationSmoothing();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        com.graphhopper.storage.DataAccess dataAccess2 = null;
        // The following exception was thrown during execution in test generation
        try {
            rAMDirectory1.remove(dataAccess2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.graphhopper.routing.util.EdgeFilter edgeFilter0 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.RoadClass> roadClassEnumEncodedValue1 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.RoadEnvironment> roadEnvironmentEnumEncodedValue2 = null;
        java.util.List<java.lang.String> strList3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.SnapPreventionEdgeFilter snapPreventionEdgeFilter4 = new com.graphhopper.routing.util.SnapPreventionEdgeFilter(edgeFilter0, roadClassEnumEncodedValue1, roadEnvironmentEnumEncodedValue2, strList3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.graphhopper.routing.ev.DefaultEncodedValueFactory defaultEncodedValueFactory0 = new com.graphhopper.routing.ev.DefaultEncodedValueFactory();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.EncodedValue encodedValue2 = defaultEncodedValueFactory0.create("custom_network");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultEncodedValueFactory cannot find EncodedValue custom_network");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.graphhopper.routing.ev.MaxSpeed maxSpeed0 = new com.graphhopper.routing.ev.MaxSpeed();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue4 = new com.graphhopper.routing.ev.StringEncodedValue("custom", (int) ' ', false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = disabledEdgeIterator0.getReverse(stringEncodedValue4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.FetchMode fetchMode1 = com.graphhopper.util.FetchMode.PILLAR_AND_ADJ;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.PointList pointList2 = disabledEdgeIterator0.fetchWayGeometry(fetchMode1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + fetchMode1 + "' != '" + com.graphhopper.util.FetchMode.PILLAR_AND_ADJ + "'", fetchMode1.equals(com.graphhopper.util.FetchMode.PILLAR_AND_ADJ));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.lang.String str1 = com.graphhopper.routing.ev.TurnCost.key("[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]$turn_cost" + "'", str1, "[]$turn_cost");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.TraversalMode traversalMode1 = com.graphhopper.routing.util.TraversalMode.fromString("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: TraversalMode [] not supported. Supported are: [NODE_BASED, EDGE_BASED]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue1 = com.graphhopper.routing.ev.Country.create();
        java.lang.String str2 = countryEnumEncodedValue1.getName();
        com.graphhopper.routing.ev.Country country3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState4 = disabledEdgeIterator0.set(countryEnumEncodedValue1, country3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(countryEnumEncodedValue1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "country" + "'", str2, "country");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.graphhopper.routing.ev.HikeRating hikeRating0 = new com.graphhopper.routing.ev.HikeRating();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
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
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue4 = new com.graphhopper.routing.ev.StringEncodedValue("custom", (int) ' ', false);
        java.lang.String str5 = stringEncodedValue4.getName();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState7 = disabledEdgeIterator0.setReverse(stringEncodedValue4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "custom" + "'", str5, "custom");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.lang.String str0 = com.graphhopper.routing.util.FlagEncoderFactory.CAR4WD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "car4wd" + "'", str0, "car4wd");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState2 = disabledEdgeIterator0.setDistance((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.graphhopper.util.InstructionList instructionList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.Instruction instruction4 = com.graphhopper.util.Instructions.find(instructionList0, 4.003017359204114E7d, (double) (short) 1, 0.5868240888334652d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.osm.conditional.DateRangeParser dateRangeParser1 = com.graphhopper.reader.osm.conditional.DateRangeParser.createInstance("3.0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.text.ParseException: Unparseable date: \"3.0\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.graphhopper.reader.osm.OSMXMLHelper oSMXMLHelper0 = new com.graphhopper.reader.osm.OSMXMLHelper();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.carrotsearch.hppc.IntArrayList intArrayList2 = com.graphhopper.util.ArrayUtil.constant((int) (short) -1, (int) (byte) 1);
        java.util.Random random3 = null;
        com.carrotsearch.hppc.IntArrayList intArrayList4 = com.graphhopper.util.ArrayUtil.shuffle(intArrayList2, random3);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList4);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.lang.String str0 = com.graphhopper.routing.ev.BikeNetwork.KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bike_network" + "'", str0, "bike_network");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue1 = com.graphhopper.routing.ev.Country.create();
        java.lang.String str2 = countryEnumEncodedValue1.getName();
        int int3 = countryEnumEncodedValue1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState6 = disabledEdgeIterator0.set((com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue1, 0, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(countryEnumEncodedValue1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "country" + "'", str2, "country");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1687814340 + "'", int3 == 1687814340);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue0 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.storage.IntsRef intsRef2 = com.graphhopper.routing.ev.TurnCost.createFlags();
        com.graphhopper.routing.ev.Country country3 = null;
        // The following exception was thrown during execution in test generation
        try {
            countryEnumEncodedValue0.setEnum(false, intsRef2, country3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(countryEnumEncodedValue0);
        org.junit.Assert.assertNotNull(intsRef2);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.graphhopper.reader.OSMTurnRelation.Type type0 = com.graphhopper.reader.OSMTurnRelation.Type.NOT;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + com.graphhopper.reader.OSMTurnRelation.Type.NOT + "'", type0.equals(com.graphhopper.reader.OSMTurnRelation.Type.NOT));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        int int2 = com.graphhopper.util.TranslationMap.countOccurence("", "mtb");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge prepareBaseEdge5 = new com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge((int) (byte) 1, (int) (byte) -1, (int) (short) 1, (float) (short) -1, (float) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = prepareBaseEdge5.getSkipped1();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue4 = new com.graphhopper.routing.ev.StringEncodedValue("custom", (int) ' ', false);
        java.lang.String str5 = stringEncodedValue4.getName();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState8 = disabledEdgeIterator0.set(stringEncodedValue4, "mtb", "get_off_bike");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "custom" + "'", str5, "custom");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.graphhopper.util.ArrayUtil arrayUtil0 = new com.graphhopper.util.ArrayUtil();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.graphhopper.util.DistancePlaneProjection distancePlaneProjection0 = com.graphhopper.util.DistancePlaneProjection.DIST_PLANE;
        double double5 = distancePlaneProjection0.calcDist((double) (byte) 0, 0.0d, (double) 1.0f, 150.0d);
        com.graphhopper.util.shapes.GHPoint gHPoint10 = distancePlaneProjection0.projectCoordinate((double) (-2), (double) 11, (double) 0.0f, 4.003017359204114E7d);
        org.junit.Assert.assertNotNull(distancePlaneProjection0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.667897456212138E7d + "'", double5 == 1.667897456212138E7d);
        org.junit.Assert.assertNotNull(gHPoint10);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.graphhopper.routing.ev.RoadClass roadClass1 = com.graphhopper.routing.ev.RoadClass.find("country");
        org.junit.Assert.assertTrue("'" + roadClass1 + "' != '" + com.graphhopper.routing.ev.RoadClass.OTHER + "'", roadClass1.equals(com.graphhopper.routing.ev.RoadClass.OTHER));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        int int0 = com.graphhopper.routing.ch.PrepareEncoder.getScBwdDir();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.graphhopper.util.SimpleIntDeque simpleIntDeque1 = new com.graphhopper.util.SimpleIntDeque((int) ' ');
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            int int1 = disabledEdgeIterator0.getEdge();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.lang.Class<com.graphhopper.routing.ev.Country> countryClass1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue3 = new com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country>("country", countryClass1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue0 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser1 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue0);
        com.graphhopper.storage.IntsRef intsRef3 = com.graphhopper.storage.IntsRef.EMPTY;
        int int4 = intsRef3.offset;
        // The following exception was thrown during execution in test generation
        try {
            decimalEncodedValue0.setDecimal(true, intsRef3, (double) 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Call init before usage for EncodedValue max_weight|version=1841716118|bits=8|index=0|shift=-1|store_both_directions=false");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(decimalEncodedValue0);
        org.junit.Assert.assertNotNull(intsRef3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.graphhopper.routing.DirectionResolverResult directionResolverResult2 = com.graphhopper.routing.DirectionResolverResult.onlyLeft((int) '4', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.graphhopper.routing.DirectionResolverResult.getInEdge(directionResolverResult2, "mtb");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for 'curbside : mtb'. allowed: left, right, any");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directionResolverResult2);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.graphhopper.routing.ev.TrackType trackType0 = com.graphhopper.routing.ev.TrackType.GRADE1;
        org.junit.Assert.assertTrue("'" + trackType0 + "' != '" + com.graphhopper.routing.ev.TrackType.GRADE1 + "'", trackType0.equals(com.graphhopper.routing.ev.TrackType.GRADE1));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.osm.conditional.DateRangeParser dateRangeParser1 = com.graphhopper.reader.osm.conditional.DateRangeParser.createInstance("wheelchair");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.text.ParseException: Unparseable date: \"wheelchair\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.util.Locale locale0 = null;
        com.graphhopper.util.TranslationMap.TranslationHashMap translationHashMap1 = new com.graphhopper.util.TranslationMap.TranslationHashMap(locale0);
        com.graphhopper.util.TranslationMap.TranslationHashMap translationHashMap4 = translationHashMap1.put("mtb", "get_off_bike");
        java.io.InputStream inputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.TranslationMap.TranslationHashMap translationHashMap6 = translationHashMap4.doImport(inputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No input stream found in class path!?");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(translationHashMap4);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
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
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.graphhopper.util.PMap pMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.CarFlagEncoder carFlagEncoder1 = new com.graphhopper.routing.util.CarFlagEncoder(pMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue2 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.util.details.BooleanDetails booleanDetails3 = new com.graphhopper.util.details.BooleanDetails("get_off_bike", booleanEncodedValue2);
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter4 = com.graphhopper.routing.util.DefaultEdgeFilter.outEdges(booleanEncodedValue2);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.subnetwork.TarjanSCC.ConnectedComponents connectedComponents6 = com.graphhopper.routing.subnetwork.TarjanSCC.findComponents(graph0, (com.graphhopper.routing.util.EdgeFilter) defaultEdgeFilter4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanEncodedValue2);
        org.junit.Assert.assertNotNull(defaultEdgeFilter4);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.storage.Graph graph1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.Graph graph2 = com.graphhopper.util.GHUtility.shuffle(graph0, graph1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue1 = com.graphhopper.routing.ev.Country.create();
        java.lang.String str2 = countryEnumEncodedValue1.getName();
        int int3 = countryEnumEncodedValue1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = disabledEdgeIterator0.getReverse((com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(countryEnumEncodedValue1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "country" + "'", str2, "country");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1687814340 + "'", int3 == 1687814340);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        int int0 = com.graphhopper.routing.util.spatialrules.AbstractSpatialRule.DEFAULT_PRIORITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.lang.String str0 = com.graphhopper.util.Constants.JAVA_VERSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "1.8.0_251" + "'", str0, "1.8.0_251");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue0 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.storage.IntsRef intsRef2 = com.graphhopper.storage.IntsRef.EMPTY;
        com.graphhopper.storage.IntsRef intsRef3 = com.graphhopper.storage.IntsRef.EMPTY;
        boolean boolean4 = intsRef2.intsEquals(intsRef3);
        int int5 = intsRef2.length;
        // The following exception was thrown during execution in test generation
        try {
            booleanEncodedValue0.setBool(true, intsRef2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: reverse state cannot be modified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanEncodedValue0);
        org.junit.Assert.assertNotNull(intsRef2);
        org.junit.Assert.assertNotNull(intsRef3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.graphhopper.routing.util.TraversalMode traversalMode0 = com.graphhopper.routing.util.TraversalMode.NODE_BASED;
        org.junit.Assert.assertTrue("'" + traversalMode0 + "' != '" + com.graphhopper.routing.util.TraversalMode.NODE_BASED + "'", traversalMode0.equals(com.graphhopper.routing.util.TraversalMode.NODE_BASED));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            int int1 = disabledEdgeIterator0.getAdjNode();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.graphhopper.util.DistanceCalcEarth distanceCalcEarth3 = new com.graphhopper.util.DistanceCalcEarth();
        double double8 = distanceCalcEarth3.calcNormalizedDist((double) 100L, (double) 1, (double) 0, 1.0d);
        double double10 = distanceCalcEarth3.calcCircumference((double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.shapes.Circle circle11 = new com.graphhopper.util.shapes.Circle((double) 1L, (double) (short) 1, (-1.0d), (com.graphhopper.util.DistanceCalc) distanceCalcEarth3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Distance must not be zero or negative! -1.0 lat,lon:1.0,1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5868240888334652d + "'", double8 == 0.5868240888334652d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-6951166.6959488215d) + "'", double10 == (-6951166.6959488215d));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue1 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.util.details.BooleanDetails booleanDetails2 = new com.graphhopper.util.details.BooleanDetails("get_off_bike", booleanEncodedValue1);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator3 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = booleanDetails2.isEdgeDifferentToLastEdge((com.graphhopper.util.EdgeIteratorState) disabledEdgeIterator3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanEncodedValue1);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        com.graphhopper.search.StringIndex stringIndex2 = new com.graphhopper.search.StringIndex((com.graphhopper.storage.Directory) rAMDirectory1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap4 = null; // flaky: stringIndex2.getAll((long) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.graphhopper.routing.AlternativeRouteEdgeCH.PotentialAlternativeInfo potentialAlternativeInfo0 = new com.graphhopper.routing.AlternativeRouteEdgeCH.PotentialAlternativeInfo();
        int int1 = potentialAlternativeInfo0.edgeIn;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.graphhopper.util.DistanceCalcEuclidean distanceCalcEuclidean0 = new com.graphhopper.util.DistanceCalcEuclidean();
        double double7 = distanceCalcEuclidean0.calcNormalizedEdgeDistance((double) 4, 111194.92664455873d, (double) 7, (double) 11, 1.667897456212138E7d, (double) '4');
        double double9 = distanceCalcEuclidean0.calcDenormalizedDist((double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = distanceCalcEuclidean0.isCrossBoundary((double) 35L, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported for the 2D Euclidean space");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.2361865545667784E10d + "'", double7 == 1.2361865545667784E10d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
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
            int int16 = longLongHashMap10.removeAll(longPredicate15);
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
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue1 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.Country country2 = null;
        com.graphhopper.routing.ev.Country country3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState4 = disabledEdgeIterator0.set(countryEnumEncodedValue1, country2, country3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(countryEnumEncodedValue1);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue4 = new com.graphhopper.routing.ev.StringEncodedValue("custom", (int) ' ', false);
        java.lang.String str5 = stringEncodedValue4.getName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = disabledEdgeIterator0.get(stringEncodedValue4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "custom" + "'", str5, "custom");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.graphhopper.storage.index.Snap snap2 = new com.graphhopper.storage.index.Snap((double) '4', 100.0d);
        com.graphhopper.util.DistancePlaneProjection distancePlaneProjection3 = new com.graphhopper.util.DistancePlaneProjection();
        // The following exception was thrown during execution in test generation
        try {
            snap2.calcSnappedPoint((com.graphhopper.util.DistanceCalc) distancePlaneProjection3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No closest edge?");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.UnsignedDecimalEncodedValue unsignedDecimalEncodedValue4 = new com.graphhopper.routing.ev.UnsignedDecimalEncodedValue("road_class_link", 100, 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: road_class_link: at the moment the number of reserved bits cannot be more than 31");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue1 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState4 = disabledEdgeIterator0.set(booleanEncodedValue1, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanEncodedValue1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.graphhopper.storage.index.Snap snap2 = new com.graphhopper.storage.index.Snap((double) '4', 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.shapes.GHPoint3D gHPoint3D3 = snap2.getSnappedPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Calculate snapped point before!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator5 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray6 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator5 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap7 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray1, edgeIteratorArray6);
        int[] intArray8 = edgeIteratorIntObjectHashMap7.keys;
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator11 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             edgeIteratorIntObjectHashMap7.indexInsert(7, (int) (short) 0, (com.graphhopper.util.EdgeIterator) disabledEdgeIterator11);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -8");
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
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue1 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.util.details.BooleanDetails booleanDetails2 = new com.graphhopper.util.details.BooleanDetails("get_off_bike", booleanEncodedValue1);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator3 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = booleanDetails2.isEdgeDifferentToLastEdge((com.graphhopper.util.EdgeIteratorState) disabledEdgeIterator3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanEncodedValue1);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.graphhopper.util.EdgeExplorer edgeExplorer0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.ch.ShortcutFilter shortcutFilter2 = com.graphhopper.routing.ch.ShortcutFilter.allEdges();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.RoutingCHEdgeIteratorImpl routingCHEdgeIteratorImpl3 = new com.graphhopper.storage.RoutingCHEdgeIteratorImpl(edgeExplorer0, weighting1, shortcutFilter2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortcutFilter2);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser0 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser();
        com.graphhopper.storage.IntsRef intsRef1 = com.graphhopper.storage.IntsRef.EMPTY;
        com.graphhopper.storage.IntsRef intsRef2 = com.graphhopper.storage.IntsRef.EMPTY;
        boolean boolean3 = intsRef1.intsEquals(intsRef2);
        int int4 = intsRef1.length;
        com.graphhopper.reader.ReaderWay readerWay5 = null;
        com.graphhopper.storage.IntsRef intsRef7 = com.graphhopper.routing.ev.TurnCost.createFlags();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.IntsRef intsRef8 = oSMMaxWidthParser0.handleWayTags(intsRef1, readerWay5, false, intsRef7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intsRef1);
        org.junit.Assert.assertNotNull(intsRef2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intsRef7);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.graphhopper.routing.ev.RoadEnvironment roadEnvironment1 = com.graphhopper.routing.ev.RoadEnvironment.find("prepare.ch.edge.witness_search.min_max_settled_edges");
        org.junit.Assert.assertTrue("'" + roadEnvironment1 + "' != '" + com.graphhopper.routing.ev.RoadEnvironment.OTHER + "'", roadEnvironment1.equals(com.graphhopper.routing.ev.RoadEnvironment.OTHER));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        double double0 = com.graphhopper.reader.dem.ElevationInterpolator.EPSILON2;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0000000000000002E-10d + "'", double0 == 1.0000000000000002E-10d);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.graphhopper.routing.ev.RoadEnvironment roadEnvironment0 = com.graphhopper.routing.ev.RoadEnvironment.FERRY;
        org.junit.Assert.assertTrue("'" + roadEnvironment0 + "' != '" + com.graphhopper.routing.ev.RoadEnvironment.FERRY + "'", roadEnvironment0.equals(com.graphhopper.routing.ev.RoadEnvironment.FERRY));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.graphhopper.storage.DAType dAType0 = com.graphhopper.storage.DAType.RAM;
        boolean boolean1 = dAType0.isInMemory();
        boolean boolean2 = dAType0.isInMemory();
        org.junit.Assert.assertNotNull(dAType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        javax.xml.stream.XMLStreamReader xMLStreamReader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.ReaderNode readerNode2 = com.graphhopper.reader.osm.OSMXMLHelper.createNode((long) 4, xMLStreamReader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.graphhopper.util.DistanceCalcEuclidean distanceCalcEuclidean0 = new com.graphhopper.util.DistanceCalcEuclidean();
        double double7 = distanceCalcEuclidean0.calcNormalizedEdgeDistance((double) 4, 111194.92664455873d, (double) 7, (double) 11, 1.667897456212138E7d, (double) '4');
        double double9 = distanceCalcEuclidean0.calcDenormalizedDist((double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.shapes.GHPoint gHPoint14 = distanceCalcEuclidean0.projectCoordinate(Double.NaN, (double) 0L, (double) (-4), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported for the 2D Euclidean space");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.2361865545667784E10d + "'", double7 == 1.2361865545667784E10d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.graphhopper.util.PMap pMap0 = null;
        com.graphhopper.GraphHopperConfig graphHopperConfig1 = new com.graphhopper.GraphHopperConfig(pMap0);
        // The following exception was thrown during execution in test generation
        try {
            float float4 = graphHopperConfig1.getFloat("bike2", (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.graphhopper.storage.Graph graph0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.GraphEdgeIdFinder.BlockArea blockArea1 = new com.graphhopper.storage.GraphEdgeIdFinder.BlockArea(graph0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.graphhopper.routing.ev.RoadEnvironment roadEnvironment0 = com.graphhopper.routing.ev.RoadEnvironment.FORD;
        org.junit.Assert.assertTrue("'" + roadEnvironment0 + "' != '" + com.graphhopper.routing.ev.RoadEnvironment.FORD + "'", roadEnvironment0.equals(com.graphhopper.routing.ev.RoadEnvironment.FORD));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.graphhopper.reader.OSMTurnRelation.Type type6 = com.graphhopper.reader.OSMTurnRelation.Type.getRestrictionType("");
        com.graphhopper.reader.OSMTurnRelation oSMTurnRelation7 = new com.graphhopper.reader.OSMTurnRelation((long) (byte) 1, (long) (byte) 1, 10L, type6);
        java.util.List<java.lang.String> strList8 = oSMTurnRelation7.getVehicleTypesExcept();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.parsers.OSMTurnRelationParser oSMTurnRelationParser9 = new com.graphhopper.routing.util.parsers.OSMTurnRelationParser("[]", (int) ' ', strList8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue name wasn't valid: []$turn_cost. Use lower case letters, underscore and numbers only.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED + "'", type6.equals(com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED));
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.graphhopper.config.Profile profile0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.custom.CustomProfile customProfile1 = new com.graphhopper.routing.weighting.custom.CustomProfile(profile0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.graphhopper.reader.osm.conditional.ConditionalValueParser conditionalValueParser2 = com.graphhopper.reader.osm.conditional.ConditionalParser.createNumberParser("road_class_link", (java.lang.Number) 1.0f);
        org.junit.Assert.assertNotNull(conditionalValueParser2);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Surface> surfaceEnumEncodedValue0 = null;
        com.graphhopper.routing.util.parsers.OSMSurfaceParser oSMSurfaceParser1 = new com.graphhopper.routing.util.parsers.OSMSurfaceParser(surfaceEnumEncodedValue0);
        com.graphhopper.storage.IntsRef intsRef2 = null;
        com.graphhopper.reader.ReaderWay readerWay3 = null;
        com.graphhopper.storage.IntsRef intsRef5 = com.graphhopper.routing.ev.TurnCost.createFlags();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.IntsRef intsRef6 = oSMSurfaceParser1.handleWayTags(intsRef2, readerWay3, false, intsRef5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intsRef5);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.graphhopper.coll.GHSortedCollection gHSortedCollection0 = new com.graphhopper.coll.GHSortedCollection();
        // The following exception was thrown during execution in test generation
        try {
            int int1 = gHSortedCollection0.peekKey();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: collection is already empty!?");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
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
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.graphhopper.util.details.EdgeIdDetails edgeIdDetails0 = new com.graphhopper.util.details.EdgeIdDetails();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.util.Random random0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.tour.MultiPointTour multiPointTour3 = new com.graphhopper.routing.util.tour.MultiPointTour(random0, 1.2361865545667784E10d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator1 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState2 = disabledEdgeIterator0.copyPropertiesFrom((com.graphhopper.util.EdgeIteratorState) disabledEdgeIterator1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue0 = com.graphhopper.routing.ev.Country.create();
        java.lang.String str1 = countryEnumEncodedValue0.getName();
        com.graphhopper.routing.ev.Country[] countryArray2 = countryEnumEncodedValue0.getValues();
        com.graphhopper.storage.IntsRef intsRef4 = com.graphhopper.storage.IntsRef.EMPTY;
        com.graphhopper.storage.IntsRef intsRef5 = com.graphhopper.storage.IntsRef.EMPTY;
        boolean boolean6 = intsRef4.intsEquals(intsRef5);
        com.graphhopper.routing.ev.Country country7 = null;
        // The following exception was thrown during execution in test generation
        try {
            countryEnumEncodedValue0.setEnum(true, intsRef4, country7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(countryEnumEncodedValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "country" + "'", str1, "country");
        org.junit.Assert.assertNotNull(countryArray2);
        org.junit.Assert.assertNotNull(intsRef4);
        org.junit.Assert.assertNotNull(intsRef5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = 0L; // flaky: longLongHashMap10.indexGet((int) (byte) -1);
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
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.graphhopper.storage.NodeAccess nodeAccess0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator2 = new com.graphhopper.routing.weighting.BeelineWeightApproximator(nodeAccess0, weighting1);
        com.graphhopper.routing.weighting.BalancedWeightApproximator balancedWeightApproximator3 = new com.graphhopper.routing.weighting.BalancedWeightApproximator((com.graphhopper.routing.weighting.WeightApproximator) beelineWeightApproximator2);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = balancedWeightApproximator3.approximate((int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.graphhopper.storage.DAType dAType0 = com.graphhopper.storage.DAType.RAM_INT;
        com.graphhopper.storage.DAType dAType1 = com.graphhopper.storage.DAType.getPreferredInt(dAType0);
        com.graphhopper.storage.DAType dAType2 = com.graphhopper.storage.DAType.getPreferredInt(dAType0);
        org.junit.Assert.assertNotNull(dAType0);
        org.junit.Assert.assertNotNull(dAType1);
        org.junit.Assert.assertNotNull(dAType2);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.graphhopper.storage.index.LocationIndex locationIndex0 = null;
        java.util.Random random1 = null;
        com.graphhopper.util.shapes.BBox bBox6 = new com.graphhopper.util.shapes.BBox((double) 10, (double) 35L, (double) 0, (double) (-4));
        double double7 = bBox6.minLon;
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue9 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.util.details.BooleanDetails booleanDetails10 = new com.graphhopper.util.details.BooleanDetails("get_off_bike", booleanEncodedValue9);
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter11 = com.graphhopper.routing.util.DefaultEdgeFilter.outEdges(booleanEncodedValue9);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.index.Snap snap12 = com.graphhopper.util.GHUtility.getRandomSnap(locationIndex0, random1, bBox6, (com.graphhopper.routing.util.EdgeFilter) defaultEdgeFilter11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(booleanEncodedValue9);
        org.junit.Assert.assertNotNull(defaultEdgeFilter11);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.carrotsearch.hppc.HashOrderMixingStrategy hashOrderMixingStrategy2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHIntHashSet gHIntHashSet3 = new com.graphhopper.coll.GHIntHashSet(0, 10.0d, hashOrderMixingStrategy2);
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.hppc.BufferAllocationException; message: The load factor should be in range [0.01, 0.99]: 10.000000");
        } catch (com.carrotsearch.hppc.BufferAllocationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        long[] longArray1 = new long[] { 10 };
        com.carrotsearch.hppc.LongHashSet longHashSet2 = com.carrotsearch.hppc.LongHashSet.from(longArray1);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             longHashSet2.indexInsert(4, (long) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[10]");
        org.junit.Assert.assertNotNull(longHashSet2);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        double double0 = com.graphhopper.util.DistanceCalcEarth.R_EQ;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 6378137.0d + "'", double0 == 6378137.0d);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        boolean boolean0 = com.graphhopper.util.Constants.SUN_OS;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.graphhopper.routing.util.EncodingManager.Access access0 = com.graphhopper.routing.util.EncodingManager.Access.FERRY;
        org.junit.Assert.assertTrue("'" + access0 + "' != '" + com.graphhopper.routing.util.EncodingManager.Access.FERRY + "'", access0.equals(com.graphhopper.routing.util.EncodingManager.Access.FERRY));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue0 = com.graphhopper.routing.ev.Country.create();
        java.lang.String str1 = countryEnumEncodedValue0.getName();
        int int2 = countryEnumEncodedValue0.getVersion();
        boolean boolean3 = countryEnumEncodedValue0.isStoreTwoDirections();
        int int4 = countryEnumEncodedValue0.getMaxInt();
        org.junit.Assert.assertNotNull(countryEnumEncodedValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "country" + "'", str1, "country");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1687814340 + "'", int2 == 1687814340);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.graphhopper.util.shapes.BBox bBox4 = new com.graphhopper.util.shapes.BBox((double) 10, (double) 35L, (double) 0, (double) (-4));
        com.graphhopper.util.PointList pointList5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = bBox4.intersects(pointList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.graphhopper.reader.OSMTurnRelation.Type type6 = com.graphhopper.reader.OSMTurnRelation.Type.getRestrictionType("");
        com.graphhopper.reader.OSMTurnRelation oSMTurnRelation7 = new com.graphhopper.reader.OSMTurnRelation((long) (byte) 1, (long) (byte) 1, 10L, type6);
        java.util.List<java.lang.String> strList8 = oSMTurnRelation7.getVehicleTypesExcept();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.parsers.OSMTurnRelationParser oSMTurnRelationParser9 = new com.graphhopper.routing.util.parsers.OSMTurnRelationParser("..X.                                                                                                ", (int) (byte) -1, strList8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxTurnCosts cannot be negative -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED + "'", type6.equals(com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED));
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        rAMDirectory1.close();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.graphhopper.GraphHopperConfig graphHopperConfig0 = new com.graphhopper.GraphHopperConfig();
        com.graphhopper.GraphHopperConfig graphHopperConfig1 = new com.graphhopper.GraphHopperConfig(graphHopperConfig0);
        boolean boolean4 = graphHopperConfig1.getBool("get_off_bike", false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue4 = new com.graphhopper.routing.ev.StringEncodedValue("custom", (int) ' ', false);
        java.lang.String str5 = stringEncodedValue4.getName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = disabledEdgeIterator0.get(stringEncodedValue4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "custom" + "'", str5, "custom");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.osm.OSMReader oSMReader1 = new com.graphhopper.reader.osm.OSMReader(graphHopperStorage0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
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
        java.lang.String str15 = longHashSet13.toString();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[10]" + "'", str15, "[10]");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.graphhopper.routing.ev.Surface surface0 = com.graphhopper.routing.ev.Surface.CONCRETE;
        java.lang.String str1 = surface0.toString();
        org.junit.Assert.assertTrue("'" + surface0 + "' != '" + com.graphhopper.routing.ev.Surface.CONCRETE + "'", surface0.equals(com.graphhopper.routing.ev.Surface.CONCRETE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "concrete" + "'", str1, "concrete");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.graphhopper.routing.weighting.Weighting weighting0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.AvoidEdgesWeighting avoidEdgesWeighting1 = new com.graphhopper.routing.weighting.AvoidEdgesWeighting(weighting0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No super weighting set");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
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
        boolean boolean16 = longHashSet13.add((long) 1687814340);
        java.lang.String str18 = longHashSet13.visualizeKeyDistribution(11);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "X.X.       " + "'", str18, "X.X.       ");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.graphhopper.routing.util.parsers.OSMMaxHeightParser oSMMaxHeightParser0 = new com.graphhopper.routing.util.parsers.OSMMaxHeightParser();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator5 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray6 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator5 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap7 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray1, edgeIteratorArray6);
        int[] intArray8 = edgeIteratorIntObjectHashMap7.keys;
        java.lang.String str10 = edgeIteratorIntObjectHashMap7.visualizeKeyDistribution(100);
        int[] intArray11 = edgeIteratorIntObjectHashMap7.keys;
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
        org.junit.Assert.assertNotNull(intArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 100, 0]");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
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
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMRoadClassParser> oSMRoadClassParserGHObjectIntHashMap0 = new com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMRoadClassParser>();
        com.carrotsearch.hppc.ObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMRoadClassParser> oSMRoadClassParserObjectIntHashMap1 = oSMRoadClassParserGHObjectIntHashMap0.clone();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = 0; // flaky: oSMRoadClassParserGHObjectIntHashMap0.indexGet((-2));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(oSMRoadClassParserObjectIntHashMap1);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.graphhopper.routing.ev.Surface surface0 = com.graphhopper.routing.ev.Surface.FINE_GRAVEL;
        org.junit.Assert.assertTrue("'" + surface0 + "' != '" + com.graphhopper.routing.ev.Surface.FINE_GRAVEL + "'", surface0.equals(com.graphhopper.routing.ev.Surface.FINE_GRAVEL));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.graphhopper.routing.util.FlagEncoder flagEncoder2 = null;
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator3 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator4 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator5 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIteratorState[] edgeIteratorStateArray6 = new com.graphhopper.util.EdgeIteratorState[] { disabledEdgeIterator3, disabledEdgeIterator4, disabledEdgeIterator5 };
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.GHUtility.setSpeed((double) 35L, (double) 3, flagEncoder2, edgeIteratorStateArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorStateArray6);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.lang.String[] strArray30 = new java.lang.String[] { "{mtb=get_off_bike}", "[10]", "prepare.ch.log_messages", "bike_network", "wheelchair", "3.0", "prepare.ch.edge.witness_search.min_max_settled_edges", "SpatialRule [getId()=aut, getPriority()=100]", "{mtb=get_off_bike}", "[10]", "", "..X.                                                                                                ", "bike_network", "", "get_off_bike|node-based", "custom_network", "multi", "get_off_bike", "bike2", "{mtb=get_off_bike}", "max_width", "prepare.ch.edge.witness_search.min_max_settled_edges", "multi", "X.X.       ", "custom", "bike_network", "[10]", "mtb" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.parsers.OSMTurnRelationParser oSMTurnRelationParser33 = new com.graphhopper.routing.util.parsers.OSMTurnRelationParser("", 1, (java.util.List<java.lang.String>) strList31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue name wasn't valid: $turn_cost. Use lower case letters, underscore and numbers only.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.graphhopper.coll.MinHeapWithUpdate minHeapWithUpdate1 = new com.graphhopper.coll.MinHeapWithUpdate((int) (byte) 10);
        boolean boolean2 = minHeapWithUpdate1.isEmpty();
        boolean boolean3 = minHeapWithUpdate1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue0 = com.graphhopper.routing.ev.MaxHeight.create();
        org.junit.Assert.assertNotNull(decimalEncodedValue0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.graphhopper.routing.ch.ShortcutFilter shortcutFilter0 = com.graphhopper.routing.ch.ShortcutFilter.outEdges();
        org.junit.Assert.assertNotNull(shortcutFilter0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.BIG;
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            float float4 = bitUtil0.toFloat(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1]");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.graphhopper.routing.ev.DefaultEncodedValueFactory defaultEncodedValueFactory0 = new com.graphhopper.routing.ev.DefaultEncodedValueFactory();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.EncodingManager encodingManager3 = com.graphhopper.routing.util.EncodingManager.create((com.graphhopper.routing.ev.EncodedValueFactory) defaultEncodedValueFactory0, flagEncoderFactory1, "X.X.       ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot load properties to fetch EncodingManager configuration at: X.X.       /");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.graphhopper.debatty.java.stringsimilarity.JaroWinkler jaroWinkler1 = new com.graphhopper.debatty.java.stringsimilarity.JaroWinkler((-6951166.6959488215d));
        double double4 = jaroWinkler1.similarity("road_class_link", "country");
        double double5 = jaroWinkler1.getThreshold();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4317460358142853d + "'", double4 == 0.4317460358142853d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-6951166.6959488215d) + "'", double5 == (-6951166.6959488215d));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue1 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.util.details.BooleanDetails booleanDetails2 = new com.graphhopper.util.details.BooleanDetails("get_off_bike", booleanEncodedValue1);
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter3 = com.graphhopper.routing.util.DefaultEdgeFilter.outEdges(booleanEncodedValue1);
        com.graphhopper.util.DistanceCalcEarth distanceCalcEarth5 = new com.graphhopper.util.DistanceCalcEarth();
        double double10 = distanceCalcEarth5.calcNormalizedDist((double) 100L, (double) 1, (double) 0, 1.0d);
        double double12 = distanceCalcEarth5.calcCircumference((double) (short) 100);
        com.graphhopper.util.shapes.GHPoint gHPoint18 = distanceCalcEarth5.intermediatePoint((double) (short) 100, 100.0d, (double) 10L, 1.609344d, 960.3999999999999d);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.NameSimilarityEdgeFilter nameSimilarityEdgeFilter21 = new com.graphhopper.routing.util.NameSimilarityEdgeFilter((com.graphhopper.routing.util.EdgeFilter) defaultEdgeFilter3, ".X..                                                                                                ", gHPoint18, 1.609344d, strMap20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanEncodedValue1);
        org.junit.Assert.assertNotNull(defaultEdgeFilter3);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5868240888334652d + "'", double10 == 0.5868240888334652d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-6951166.6959488215d) + "'", double12 == (-6951166.6959488215d));
        org.junit.Assert.assertNotNull(gHPoint18);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.graphhopper.storage.NodeAccess nodeAccess2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = com.graphhopper.util.GHUtility.getDistance((-1), 0, nodeAccess2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.graphhopper.routing.util.FlagEncoder flagEncoder0 = null;
        com.graphhopper.storage.TurnCostStorage turnCostStorage1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.DefaultTurnCostProvider defaultTurnCostProvider2 = new com.graphhopper.routing.weighting.DefaultTurnCostProvider(flagEncoder0, turnCostStorage1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No storage set to calculate turn weight");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.graphhopper.routing.SPTEntry sPTEntry3 = new com.graphhopper.routing.SPTEntry(1, 1687814340, (double) 10);
        sPTEntry3.weight = 1.0d;
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.graphhopper.util.EdgeIterator edgeIterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = com.graphhopper.util.GHUtility.count(edgeIterator0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.graphhopper.routing.util.EncodingManager encodingManager0 = null;
        com.graphhopper.config.Profile[] profileArray1 = new com.graphhopper.config.Profile[] {};
        java.util.ArrayList<com.graphhopper.config.Profile> profileList2 = new java.util.ArrayList<com.graphhopper.config.Profile>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.config.Profile>) profileList2, profileArray1);
        com.graphhopper.config.CHProfile[] cHProfileArray4 = new com.graphhopper.config.CHProfile[] {};
        java.util.ArrayList<com.graphhopper.config.CHProfile> cHProfileList5 = new java.util.ArrayList<com.graphhopper.config.CHProfile>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.config.CHProfile>) cHProfileList5, cHProfileArray4);
        com.graphhopper.routing.util.EncodingManager encodingManager7 = null;
        com.graphhopper.config.Profile[] profileArray8 = new com.graphhopper.config.Profile[] {};
        java.util.ArrayList<com.graphhopper.config.Profile> profileList9 = new java.util.ArrayList<com.graphhopper.config.Profile>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.config.Profile>) profileList9, profileArray8);
        com.graphhopper.config.CHProfile[] cHProfileArray11 = new com.graphhopper.config.CHProfile[] {};
        java.util.ArrayList<com.graphhopper.config.CHProfile> cHProfileList12 = new java.util.ArrayList<com.graphhopper.config.CHProfile>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.config.CHProfile>) cHProfileList12, cHProfileArray11);
        com.graphhopper.config.LMProfile[] lMProfileArray14 = new com.graphhopper.config.LMProfile[] {};
        java.util.ArrayList<com.graphhopper.config.LMProfile> lMProfileList15 = new java.util.ArrayList<com.graphhopper.config.LMProfile>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.config.LMProfile>) lMProfileList15, lMProfileArray14);
        com.graphhopper.routing.ProfileResolver profileResolver17 = new com.graphhopper.routing.ProfileResolver(encodingManager7, (java.util.List<com.graphhopper.config.Profile>) profileList9, (java.util.List<com.graphhopper.config.CHProfile>) cHProfileList12, (java.util.List<com.graphhopper.config.LMProfile>) lMProfileList15);
        com.graphhopper.routing.ProfileResolver profileResolver18 = new com.graphhopper.routing.ProfileResolver(encodingManager0, (java.util.List<com.graphhopper.config.Profile>) profileList2, (java.util.List<com.graphhopper.config.CHProfile>) cHProfileList5, (java.util.List<com.graphhopper.config.LMProfile>) lMProfileList15);
        com.graphhopper.util.PMap pMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.config.Profile profile20 = profileResolver18.selectProfileLM(pMap19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(profileArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cHProfileArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(profileArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cHProfileArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(lMProfileArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
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
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.graphhopper.routing.AStar.AStarEntry aStarEntry4 = new com.graphhopper.routing.AStar.AStarEntry((int) (short) 100, 3, 111194.92664455873d, 1.667897456212138E7d);
        double double5 = aStarEntry4.getWeightOfVisitedPath();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.667897456212138E7d + "'", double5 == 1.667897456212138E7d);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.graphhopper.util.PMap pMap0 = null;
        com.graphhopper.GraphHopperConfig graphHopperConfig1 = new com.graphhopper.GraphHopperConfig(pMap0);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = graphHopperConfig1.getDouble("custom", Double.POSITIVE_INFINITY);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.storage.RAMDirectory rAMDirectory2 = new com.graphhopper.storage.RAMDirectory("custom");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.index.LocationIndexTree locationIndexTree3 = new com.graphhopper.storage.index.LocationIndexTree(graph0, (com.graphhopper.storage.Directory) rAMDirectory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        com.carrotsearch.hppc.IntArrayList intArrayList1 = com.graphhopper.util.ArrayUtil.zero((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArrayList1);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.graphhopper.routing.ev.Surface surface0 = com.graphhopper.routing.ev.Surface.COBBLESTONE;
        org.junit.Assert.assertTrue("'" + surface0 + "' != '" + com.graphhopper.routing.ev.Surface.COBBLESTONE + "'", surface0.equals(com.graphhopper.routing.ev.Surface.COBBLESTONE));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.graphhopper.storage.index.LocationIndex locationIndex0 = null;
        java.util.Random random1 = null;
        com.graphhopper.util.shapes.BBox bBox2 = null;
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue4 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.util.details.BooleanDetails booleanDetails5 = new com.graphhopper.util.details.BooleanDetails("get_off_bike", booleanEncodedValue4);
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter6 = com.graphhopper.routing.util.DefaultEdgeFilter.outEdges(booleanEncodedValue4);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.index.Snap snap7 = com.graphhopper.util.GHUtility.getRandomSnap(locationIndex0, random1, bBox2, (com.graphhopper.routing.util.EdgeFilter) defaultEdgeFilter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanEncodedValue4);
        org.junit.Assert.assertNotNull(defaultEdgeFilter6);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        com.graphhopper.routing.ev.RoadEnvironment roadEnvironment0 = com.graphhopper.routing.ev.RoadEnvironment.OTHER;
        org.junit.Assert.assertTrue("'" + roadEnvironment0 + "' != '" + com.graphhopper.routing.ev.RoadEnvironment.OTHER + "'", roadEnvironment0.equals(com.graphhopper.routing.ev.RoadEnvironment.OTHER));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        java.util.Iterator<com.carrotsearch.hppc.cursors.IntLongCursor> intLongCursorItor5 = intLongHashMap4.iterator();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(intLongCursorItor5);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions2 = new com.graphhopper.routing.AlgorithmOptions("[]", weighting1);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.Weighting weighting3 = algorithmOptions2.getWeighting();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Option 'weighting' must NOT be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.graphhopper.storage.NativeFSLockFactory nativeFSLockFactory0 = new com.graphhopper.storage.NativeFSLockFactory();
        java.io.File file1 = null;
        nativeFSLockFactory0.setLockDir(file1);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        com.graphhopper.routing.AlternativeRoute.PlateauInfo plateauInfo6 = new com.graphhopper.routing.AlternativeRoute.PlateauInfo("custom_network", (java.util.List<java.lang.Integer>) intList4);
        java.lang.String str7 = plateauInfo6.toString();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "custom_network" + "'", str7, "custom_network");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        long[] longArray3 = new long[] { (byte) 10, (byte) 10, (byte) 100 };
        long[] longArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.carrotsearch.hppc.LongLongHashMap longLongHashMap5 = com.carrotsearch.hppc.LongLongHashMap.from(longArray3, longArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, 100]");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        com.graphhopper.routing.util.EncodingManager encodingManager0 = null;
        com.graphhopper.config.Profile[] profileArray1 = new com.graphhopper.config.Profile[] {};
        java.util.ArrayList<com.graphhopper.config.Profile> profileList2 = new java.util.ArrayList<com.graphhopper.config.Profile>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.config.Profile>) profileList2, profileArray1);
        com.graphhopper.config.CHProfile[] cHProfileArray4 = new com.graphhopper.config.CHProfile[] {};
        java.util.ArrayList<com.graphhopper.config.CHProfile> cHProfileList5 = new java.util.ArrayList<com.graphhopper.config.CHProfile>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.config.CHProfile>) cHProfileList5, cHProfileArray4);
        com.graphhopper.config.LMProfile[] lMProfileArray7 = new com.graphhopper.config.LMProfile[] {};
        java.util.ArrayList<com.graphhopper.config.LMProfile> lMProfileList8 = new java.util.ArrayList<com.graphhopper.config.LMProfile>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.config.LMProfile>) lMProfileList8, lMProfileArray7);
        com.graphhopper.routing.ProfileResolver profileResolver10 = new com.graphhopper.routing.ProfileResolver(encodingManager0, (java.util.List<com.graphhopper.config.Profile>) profileList2, (java.util.List<com.graphhopper.config.CHProfile>) cHProfileList5, (java.util.List<com.graphhopper.config.LMProfile>) lMProfileList8);
        com.graphhopper.util.PMap pMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.config.Profile profile12 = profileResolver10.resolveProfile(pMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(profileArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cHProfileArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(lMProfileArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            int int1 = disabledEdgeIterator0.getOrigEdgeFirst();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        long[] longArray1 = new long[] { 10 };
        com.carrotsearch.hppc.LongHashSet longHashSet2 = com.carrotsearch.hppc.LongHashSet.from(longArray1);
        longHashSet2.ensureCapacity(3);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[10]");
        org.junit.Assert.assertNotNull(longHashSet2);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMRoadClassParser> oSMRoadClassParserGHObjectIntHashMap0 = new com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMRoadClassParser>();
        com.carrotsearch.hppc.ObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMRoadClassParser> oSMRoadClassParserObjectIntHashMap1 = oSMRoadClassParserGHObjectIntHashMap0.clone();
        oSMRoadClassParserGHObjectIntHashMap0.release();
        org.junit.Assert.assertNotNull(oSMRoadClassParserObjectIntHashMap1);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.graphhopper.util.details.DistanceDetails distanceDetails0 = new com.graphhopper.util.details.DistanceDetails();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.util.TraversalMode traversalMode2 = com.graphhopper.routing.util.TraversalMode.EDGE_BASED;
        int int7 = traversalMode2.createTraversalId((int) (short) -1, 3, 1687814340, false);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.DijkstraBidirectionRef dijkstraBidirectionRef8 = new com.graphhopper.routing.DijkstraBidirectionRef(graph0, weighting1, traversalMode2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + traversalMode2 + "' != '" + com.graphhopper.routing.util.TraversalMode.EDGE_BASED + "'", traversalMode2.equals(com.graphhopper.routing.util.TraversalMode.EDGE_BASED));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-919338616) + "'", int7 == (-919338616));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.graphhopper.routing.ev.Surface surface0 = com.graphhopper.routing.ev.Surface.MISSING;
        org.junit.Assert.assertTrue("'" + surface0 + "' != '" + com.graphhopper.routing.ev.Surface.MISSING + "'", surface0.equals(com.graphhopper.routing.ev.Surface.MISSING));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl0 = new com.graphhopper.coll.GHBitSetImpl();
        int int2 = gHBitSetImpl0.previousClearBit(0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.BitSet bitSet5 = gHBitSetImpl0.get((int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
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
        boolean boolean21 = intHashSet14.contains(35);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.locationtech.jts.geom.Polygon[] polygonArray0 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList1 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList1, polygonArray0);
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule3 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList1);
        int int4 = austriaSpatialRule3.getPriority();
        com.graphhopper.routing.ev.RoadClass roadClass5 = com.graphhopper.routing.ev.RoadClass.PATH;
        com.graphhopper.routing.util.TransportationMode transportationMode6 = com.graphhopper.routing.util.TransportationMode.BIKE;
        double double8 = austriaSpatialRule3.getMaxSpeed(roadClass5, transportationMode6, (double) (-4));
        boolean boolean9 = transportationMode6.isMotorVehicle();
        org.junit.Assert.assertNotNull(polygonArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + roadClass5 + "' != '" + com.graphhopper.routing.ev.RoadClass.PATH + "'", roadClass5.equals(com.graphhopper.routing.ev.RoadClass.PATH));
        org.junit.Assert.assertTrue("'" + transportationMode6 + "' != '" + com.graphhopper.routing.util.TransportationMode.BIKE + "'", transportationMode6.equals(com.graphhopper.routing.util.TransportationMode.BIKE));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-4.0d) + "'", double8 == (-4.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        com.graphhopper.routing.ev.RoadEnvironment roadEnvironment0 = com.graphhopper.routing.ev.RoadEnvironment.BRIDGE;
        org.junit.Assert.assertTrue("'" + roadEnvironment0 + "' != '" + com.graphhopper.routing.ev.RoadEnvironment.BRIDGE + "'", roadEnvironment0.equals(com.graphhopper.routing.ev.RoadEnvironment.BRIDGE));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.lang.String str0 = com.graphhopper.routing.ch.CHParameters.HIERARCHY_DEPTH_WEIGHT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "prepare.ch.edge.hierarchy_depth_weight" + "'", str0, "prepare.ch.edge.hierarchy_depth_weight");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue1 = null;
        com.graphhopper.util.details.DecimalDetails decimalDetails4 = new com.graphhopper.util.details.DecimalDetails("", decimalEncodedValue1, "hi!", (double) (short) 0);
        java.lang.String str5 = decimalDetails4.getName();
        java.lang.String str6 = decimalDetails4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.graphhopper.util.DistancePlaneProjection distancePlaneProjection0 = com.graphhopper.util.DistancePlaneProjection.DIST_PLANE;
        double double2 = distancePlaneProjection0.calcCircumference(0.0d);
        double double4 = distancePlaneProjection0.calcNormalizedDist((double) (short) 0);
        double double6 = distancePlaneProjection0.calcCircumference((double) 1687814340);
        java.lang.String str7 = distancePlaneProjection0.toString();
        org.junit.Assert.assertNotNull(distancePlaneProjection0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.003017359204114E7d + "'", double2 == 4.003017359204114E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0015086747773867E7d + "'", double6 == 2.0015086747773867E7d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PLANE_PROJ" + "'", str7, "PLANE_PROJ");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.graphhopper.routing.util.TraversalMode traversalMode0 = com.graphhopper.routing.util.TraversalMode.EDGE_BASED;
        int int5 = traversalMode0.createTraversalId((int) (short) -1, 3, 1687814340, false);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator6 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = traversalMode0.createTraversalId((com.graphhopper.util.EdgeIteratorState) disabledEdgeIterator6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + traversalMode0 + "' != '" + com.graphhopper.routing.util.TraversalMode.EDGE_BASED + "'", traversalMode0.equals(com.graphhopper.routing.util.TraversalMode.EDGE_BASED));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-919338616) + "'", int5 == (-919338616));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.carrotsearch.hppc.IntArrayList intArrayList2 = com.graphhopper.util.ArrayUtil.constant((int) (short) -1, (int) (byte) 1);
        com.carrotsearch.hppc.IntArrayList intArrayList5 = com.graphhopper.util.ArrayUtil.rangeClosed((int) (short) 100, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = com.graphhopper.util.ArrayUtil.calcSortOrder(intArrayList2, intArrayList5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arrays must have equal size");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList5);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.graphhopper.reader.dem.CGIARProvider cGIARProvider1 = new com.graphhopper.reader.dem.CGIARProvider("country");
        cGIARProvider1.setInterpolate(false);
        com.graphhopper.reader.dem.ElevationProvider elevationProvider5 = cGIARProvider1.setBaseURL("wheelchair");
        org.junit.Assert.assertNotNull(elevationProvider5);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry4 = new com.graphhopper.routing.ch.PrepareCHEntry((-1), (int) '#', (int) (short) 10, 4.003017359204114E7d);
        int int5 = prepareCHEntry4.incEdgeKey;
        int int6 = prepareCHEntry4.prepareEdge;
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry7 = prepareCHEntry4.getParent();
        // The following exception was thrown during execution in test generation
        try {
            prepareCHEntry7.weight = (-919338616);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(prepareCHEntry7);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.graphhopper.coll.GHTBitSet gHTBitSet1 = new com.graphhopper.coll.GHTBitSet(0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = gHTBitSet1.next(0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported yet.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        com.graphhopper.util.SimpleIntDeque simpleIntDeque1 = new com.graphhopper.util.SimpleIntDeque((int) 'a');
        java.lang.String str2 = simpleIntDeque1.toString();
        simpleIntDeque1.setGrowFactor((float) 2);
        simpleIntDeque1.push((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.graphhopper.routing.weighting.Weighting weighting0 = null;
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator1 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = com.graphhopper.util.GHUtility.calcMillisWithTurnMillis(weighting0, (com.graphhopper.util.EdgeIteratorState) disabledEdgeIterator1, true, (-919338616));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        com.graphhopper.storage.NodeAccess nodeAccess0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator2 = new com.graphhopper.routing.weighting.BeelineWeightApproximator(nodeAccess0, weighting1);
        com.graphhopper.routing.weighting.BalancedWeightApproximator balancedWeightApproximator3 = new com.graphhopper.routing.weighting.BalancedWeightApproximator((com.graphhopper.routing.weighting.WeightApproximator) beelineWeightApproximator2);
        // The following exception was thrown during execution in test generation
        try {
            balancedWeightApproximator3.setFromTo(10, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap1 = new com.graphhopper.coll.GHLongLongHashMap((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of elements must be >= 0: -2");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        long[] longArray1 = new long[] { 10 };
        com.carrotsearch.hppc.LongHashSet longHashSet2 = com.carrotsearch.hppc.LongHashSet.from(longArray1);
        boolean boolean4 = longHashSet2.add((-1L));
        com.carrotsearch.hppc.LongHashSet longHashSet5 = longHashSet2.clone();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = 0L; // flaky: longHashSet2.indexGet((int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[10]");
        org.junit.Assert.assertNotNull(longHashSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(longHashSet5);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue0 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxHeightParser oSMMaxHeightParser1 = new com.graphhopper.routing.util.parsers.OSMMaxHeightParser(decimalEncodedValue0);
        org.junit.Assert.assertNotNull(decimalEncodedValue0);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState conditionState0 = com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.TRUE;
        org.junit.Assert.assertTrue("'" + conditionState0 + "' != '" + com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.TRUE + "'", conditionState0.equals(com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.TRUE));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMRoadClassParser> oSMRoadClassParserGHObjectIntHashMap0 = new com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMRoadClassParser>();
        com.carrotsearch.hppc.ObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMRoadClassParser> oSMRoadClassParserObjectIntHashMap1 = oSMRoadClassParserGHObjectIntHashMap0.clone();
        oSMRoadClassParserObjectIntHashMap1.ensureCapacity(3);
        org.junit.Assert.assertNotNull(oSMRoadClassParserObjectIntHashMap1);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.UnsignedDecimalEncodedValue unsignedDecimalEncodedValue5 = new com.graphhopper.routing.ev.UnsignedDecimalEncodedValue("concrete", 100, 1.609344d, (double) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: concrete: at the moment the number of reserved bits cannot be more than 31");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl0 = new com.graphhopper.coll.GHBitSetImpl();
        int int2 = gHBitSetImpl0.previousClearBit(0);
        // The following exception was thrown during execution in test generation
        try {
            gHBitSetImpl0.flip(3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl0 = new com.graphhopper.coll.GHBitSetImpl();
        int int2 = gHBitSetImpl0.previousClearBit(0);
        boolean boolean4 = gHBitSetImpl0.get((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        double double0 = com.graphhopper.util.DistanceCalcEarth.C;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 4.003017359204114E7d + "'", double0 == 4.003017359204114E7d);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        com.graphhopper.routing.ev.HazmatTunnel hazmatTunnel0 = com.graphhopper.routing.ev.HazmatTunnel.E;
        org.junit.Assert.assertTrue("'" + hazmatTunnel0 + "' != '" + com.graphhopper.routing.ev.HazmatTunnel.E + "'", hazmatTunnel0.equals(com.graphhopper.routing.ev.HazmatTunnel.E));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.lang.String str0 = com.graphhopper.routing.util.FlagEncoderFactory.MOTORCYCLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "motorcycle" + "'", str0, "motorcycle");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.BIG;
        long long3 = bitUtil0.toLong((int) (byte) 100, 3);
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            bitUtil0.fromInt(byteArray4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 429496729603L + "'", long3 == 429496729603L);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Surface> surfaceEnumEncodedValue0 = null;
        com.graphhopper.routing.util.parsers.OSMSurfaceParser oSMSurfaceParser1 = new com.graphhopper.routing.util.parsers.OSMSurfaceParser(surfaceEnumEncodedValue0);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup2 = null;
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue3 = null;
        com.graphhopper.routing.util.parsers.OSMMaxAxleLoadParser oSMMaxAxleLoadParser4 = new com.graphhopper.routing.util.parsers.OSMMaxAxleLoadParser(decimalEncodedValue3);
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup5 = null;
        com.graphhopper.routing.ev.IntEncodedValue intEncodedValue6 = com.graphhopper.routing.ev.HikeRating.create();
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue10 = new com.graphhopper.routing.ev.StringEncodedValue("custom", (int) ' ', false);
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue12 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.util.details.BooleanDetails booleanDetails13 = new com.graphhopper.util.details.BooleanDetails("get_off_bike", booleanEncodedValue12);
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue14 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue15 = com.graphhopper.routing.ev.Country.create();
        java.lang.String str16 = countryEnumEncodedValue15.getName();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue17 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue18 = com.graphhopper.routing.ev.Country.create();
        java.lang.String str19 = countryEnumEncodedValue18.getName();
        com.graphhopper.reader.OSMTurnRelation.Type type21 = com.graphhopper.reader.OSMTurnRelation.Type.getRestrictionType("");
        boolean boolean22 = countryEnumEncodedValue18.equals((java.lang.Object) type21);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue23 = com.graphhopper.routing.ev.Country.create();
        java.lang.String str24 = countryEnumEncodedValue23.getName();
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue25 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue26 = com.graphhopper.routing.ev.Country.create();
        java.lang.String str27 = countryEnumEncodedValue26.getName();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray28 = new com.graphhopper.routing.ev.EncodedValue[] { intEncodedValue6, stringEncodedValue10, booleanEncodedValue12, booleanEncodedValue14, countryEnumEncodedValue15, decimalEncodedValue17, countryEnumEncodedValue18, countryEnumEncodedValue23, booleanEncodedValue25, countryEnumEncodedValue26 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList29 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList29, encodedValueArray28);
        oSMMaxAxleLoadParser4.createEncodedValues(encodedValueLookup5, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList29);
        oSMSurfaceParser1.createEncodedValues(encodedValueLookup2, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList29);
        org.junit.Assert.assertNotNull(intEncodedValue6);
        org.junit.Assert.assertNotNull(booleanEncodedValue12);
        org.junit.Assert.assertNotNull(booleanEncodedValue14);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "country" + "'", str16, "country");
        org.junit.Assert.assertNotNull(decimalEncodedValue17);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "country" + "'", str19, "country");
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED + "'", type21.equals(com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "country" + "'", str24, "country");
        org.junit.Assert.assertNotNull(booleanEncodedValue25);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "country" + "'", str27, "country");
        org.junit.Assert.assertNotNull(encodedValueArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.storage.Graph graph1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.Graph graph2 = com.graphhopper.util.GHUtility.sortDFS(graph0, graph1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        boolean boolean1 = com.graphhopper.util.EdgeIterator.Edge.isValid(35);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.graphhopper.routing.util.parsers.OSMTollParser oSMTollParser0 = new com.graphhopper.routing.util.parsers.OSMTollParser();
        com.graphhopper.storage.IntsRef intsRef1 = com.graphhopper.storage.IntsRef.EMPTY;
        int int2 = intsRef1.offset;
        com.graphhopper.reader.ReaderWay readerWay3 = null;
        com.graphhopper.storage.IntsRef intsRef5 = com.graphhopper.storage.IntsRef.EMPTY;
        com.graphhopper.storage.IntsRef intsRef6 = com.graphhopper.storage.IntsRef.EMPTY;
        boolean boolean7 = intsRef5.intsEquals(intsRef6);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.IntsRef intsRef8 = oSMTollParser0.handleWayTags(intsRef1, readerWay3, true, intsRef6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intsRef1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intsRef5);
        org.junit.Assert.assertNotNull(intsRef6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.graphhopper.util.shapes.BBox bBox4 = new com.graphhopper.util.shapes.BBox((double) 10, (double) 35L, (double) 0, (double) (-4));
        bBox4.update(18.42059311345597d, (double) 0);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
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
        boolean boolean17 = intHashSet14.remove((-1));
        int[] intArray18 = intHashSet14.toArray();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100]");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        com.graphhopper.util.DistanceCalcEuclidean distanceCalcEuclidean0 = new com.graphhopper.util.DistanceCalcEuclidean();
        double double7 = distanceCalcEuclidean0.calcNormalizedEdgeDistance(0.0d, (double) (-1.0f), (double) ' ', (double) 1.0f, (double) (-1), (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = distanceCalcEuclidean0.isCrossBoundary(1.0000000000000002E-10d, (double) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported for the 2D Euclidean space");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 960.3999999999999d + "'", double7 == 960.3999999999999d);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        com.graphhopper.routing.AlternativeRouteEdgeCH.PotentialAlternativeInfo potentialAlternativeInfo0 = new com.graphhopper.routing.AlternativeRouteEdgeCH.PotentialAlternativeInfo();
        potentialAlternativeInfo0.edgeIn = (-4);
        potentialAlternativeInfo0.v = 35;
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        com.graphhopper.routing.ev.MaxLength maxLength0 = new com.graphhopper.routing.ev.MaxLength();
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue2 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.util.details.BooleanDetails booleanDetails3 = new com.graphhopper.util.details.BooleanDetails("get_off_bike", booleanEncodedValue2);
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter4 = com.graphhopper.routing.util.DefaultEdgeFilter.inEdges(booleanEncodedValue2);
        com.graphhopper.routing.weighting.TurnCostProvider turnCostProvider5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.subnetwork.EdgeBasedTarjanSCC.ConnectedComponents connectedComponents7 = com.graphhopper.routing.subnetwork.EdgeBasedTarjanSCC.findComponentsRecursive(graph0, (com.graphhopper.routing.util.EdgeFilter) defaultEdgeFilter4, turnCostProvider5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanEncodedValue2);
        org.junit.Assert.assertNotNull(defaultEdgeFilter4);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap0 = new com.graphhopper.coll.GHIntLongHashMap();
        long long3 = gHIntLongHashMap0.addTo((int) (short) -1, (long) '4');
        com.carrotsearch.hppc.LongCollection longCollection4 = gHIntLongHashMap0.values();
        com.carrotsearch.hppc.predicates.IntLongPredicate intLongPredicate5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = gHIntLongHashMap0.removeAll(intLongPredicate5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(longCollection4);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.graphhopper.util.shapes.BBox bBox4 = new com.graphhopper.util.shapes.BBox((double) 10, (double) 35L, (double) 0, (double) (-4));
        int[] intArray6 = new int[] { 100 };
        long[] longArray8 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap9 = com.carrotsearch.hppc.IntLongHashMap.from(intArray6, longArray8);
        int[] intArray11 = new int[] { 100 };
        long[] longArray13 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap14 = com.carrotsearch.hppc.IntLongHashMap.from(intArray11, longArray13);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator15 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray16 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator15 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap17 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray11, edgeIteratorArray16);
        int[] intArray18 = com.graphhopper.util.ArrayUtil.merge(intArray6, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = bBox4.equals((java.lang.Object) intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [I cannot be cast to com.graphhopper.util.shapes.BBox");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap14);
        org.junit.Assert.assertNotNull(edgeIteratorArray16);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100]");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        com.graphhopper.routing.util.EncodingManager.Builder builder0 = new com.graphhopper.routing.util.EncodingManager.Builder();
        com.graphhopper.routing.util.DefaultFlagEncoderFactory defaultFlagEncoderFactory1 = new com.graphhopper.routing.util.DefaultFlagEncoderFactory();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.EncodingManager.Builder builder3 = builder0.addAll((com.graphhopper.routing.util.FlagEncoderFactory) defaultFlagEncoderFactory1, "[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: entry in encoder list not supported []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.BIG;
        byte[] byteArray2 = bitUtil0.fromFloat((float) 0);
        com.graphhopper.util.BitUtil bitUtil3 = com.graphhopper.util.BitUtil.BIG;
        byte[] byteArray5 = bitUtil3.fromFloat((float) 0);
        // The following exception was thrown during execution in test generation
        try {
            float float7 = bitUtil0.toFloat(byteArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(bitUtil3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0]");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator5 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray6 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator5 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap7 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray1, edgeIteratorArray6);
        int[] intArray8 = edgeIteratorIntObjectHashMap7.keys;
        com.graphhopper.util.AngleCalc angleCalc9 = com.graphhopper.util.AngleCalc.ANGLE_CALC;
        double double14 = angleCalc9.calcAzimuth((double) 1, (double) (-1), (double) 4, (double) 0.0f);
        com.graphhopper.util.AngleCalc angleCalc15 = com.graphhopper.util.AngleCalc.ANGLE_CALC;
        com.graphhopper.util.AngleCalc angleCalc16 = com.graphhopper.util.AngleCalc.ANGLE_CALC;
        double double21 = angleCalc16.calcAzimuth((double) 1, (double) (-1), (double) 4, (double) 0.0f);
        com.graphhopper.util.AngleCalc[] angleCalcArray22 = new com.graphhopper.util.AngleCalc[] { angleCalc9, angleCalc15, angleCalc16 };
        // The following exception was thrown during execution in test generation
        try {
            com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.AngleCalc> angleCalcIntObjectHashMap23 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray8, angleCalcArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arrays of keys and values must have an identical length.");
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
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(angleCalc9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 18.42059311345597d + "'", double14 == 18.42059311345597d);
        org.junit.Assert.assertNotNull(angleCalc15);
        org.junit.Assert.assertNotNull(angleCalc16);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 18.42059311345597d + "'", double21 == 18.42059311345597d);
        org.junit.Assert.assertNotNull(angleCalcArray22);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        com.graphhopper.routing.RoutingAlgorithmFactorySimple routingAlgorithmFactorySimple0 = new com.graphhopper.routing.RoutingAlgorithmFactorySimple();
        com.graphhopper.storage.Graph graph1 = null;
        com.graphhopper.routing.weighting.Weighting weighting3 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions4 = new com.graphhopper.routing.AlgorithmOptions("[]", weighting3);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.RoutingAlgorithm routingAlgorithm5 = routingAlgorithmFactorySimple0.createAlgo(graph1, algorithmOptions4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Option 'weighting' must NOT be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType0 = com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY;
        java.util.Calendar calendar1 = com.graphhopper.reader.osm.conditional.DateRangeParser.createCalendar();
        com.graphhopper.reader.osm.conditional.ParsedCalendar parsedCalendar2 = new com.graphhopper.reader.osm.conditional.ParsedCalendar(parseType0, calendar1);
        com.graphhopper.reader.ReaderNode readerNode6 = new com.graphhopper.reader.ReaderNode((long) ' ', (double) 1L, (double) 3);
        boolean boolean8 = readerNode6.isType((int) '4');
        java.lang.String[] strArray23 = new java.lang.String[] { "wheelchair", "country", "cgiar", "", "3.0", "get_off_bike", "", "3.0", "road_class_link", "[]", "prepare.ch.log_messages", "", "prepare.ch.log_messages", "mtb" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.lang.String str26 = readerNode6.getFirstPriorityTag((java.util.List<java.lang.String>) strList24);
        java.lang.String[] strArray49 = new java.lang.String[] { "car4wd", "mtb", "country", "prepare.ch.log_messages", "..X.                                                                                                ", "SpatialRule [getId()=aut, getPriority()=100]", "multi", "[]$turn_cost", "[]", "mtb", "3.0", "wheelchair", "get_off_bike|node-based", "..X.                                                                                                ", "prepare.ch.log_messages", "wheelchair", "prepare.ch.edge.witness_search.min_max_settled_edges", "country", "hi!", "[]", "custom", "[]$turn_cost" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        com.graphhopper.reader.osm.conditional.ConditionalParser conditionalParser52 = new com.graphhopper.reader.osm.conditional.ConditionalParser((java.util.Set<java.lang.String>) strSet50);
        java.lang.String[] strArray75 = new java.lang.String[] { "car4wd", "mtb", "country", "prepare.ch.log_messages", "..X.                                                                                                ", "SpatialRule [getId()=aut, getPriority()=100]", "multi", "[]$turn_cost", "[]", "mtb", "3.0", "wheelchair", "get_off_bike|node-based", "..X.                                                                                                ", "prepare.ch.log_messages", "wheelchair", "prepare.ch.edge.witness_search.min_max_settled_edges", "country", "hi!", "[]", "custom", "[]$turn_cost" };
        java.util.LinkedHashSet<java.lang.String> strSet76 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet76, strArray75);
        com.graphhopper.reader.osm.conditional.ConditionalParser conditionalParser78 = new com.graphhopper.reader.osm.conditional.ConditionalParser((java.util.Set<java.lang.String>) strSet76);
        com.graphhopper.reader.osm.conditional.ConditionalOSMTagInspector conditionalOSMTagInspector79 = new com.graphhopper.reader.osm.conditional.ConditionalOSMTagInspector(calendar1, (java.util.List<java.lang.String>) strList24, (java.util.Set<java.lang.String>) strSet50, (java.util.Set<java.lang.String>) strSet76);
        org.junit.Assert.assertTrue("'" + parseType0 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY + "'", parseType0.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY));
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1617558184669,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=94,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=43,SECOND=4,MILLISECOND=669,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue2 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.util.details.BooleanDetails booleanDetails3 = new com.graphhopper.util.details.BooleanDetails("get_off_bike", booleanEncodedValue2);
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter4 = com.graphhopper.routing.util.DefaultEdgeFilter.inEdges(booleanEncodedValue2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = disabledEdgeIterator0.get(booleanEncodedValue2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanEncodedValue2);
        org.junit.Assert.assertNotNull(defaultEdgeFilter4);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        java.lang.String str0 = com.graphhopper.routing.util.FlagEncoderFactory.CAR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "car" + "'", str0, "car");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        com.graphhopper.util.EdgeIterator.Edge edge0 = new com.graphhopper.util.EdgeIterator.Edge();
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        java.util.Random random0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = com.graphhopper.util.GHUtility.randomDoubleInRange(random0, (double) (short) 100, 4.003017359204114E7d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        com.graphhopper.GraphHopperConfig graphHopperConfig0 = new com.graphhopper.GraphHopperConfig();
        com.graphhopper.GraphHopperConfig graphHopperConfig1 = new com.graphhopper.GraphHopperConfig(graphHopperConfig0);
        com.graphhopper.config.Profile[] profileArray2 = new com.graphhopper.config.Profile[] {};
        java.util.ArrayList<com.graphhopper.config.Profile> profileList3 = new java.util.ArrayList<com.graphhopper.config.Profile>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.config.Profile>) profileList3, profileArray2);
        com.graphhopper.GraphHopperConfig graphHopperConfig5 = graphHopperConfig1.setProfiles((java.util.List<com.graphhopper.config.Profile>) profileList3);
        java.lang.String str6 = graphHopperConfig1.toString();
        com.graphhopper.GraphHopperConfig graphHopperConfig7 = new com.graphhopper.GraphHopperConfig(graphHopperConfig1);
        java.lang.String str10 = graphHopperConfig7.getString("[]$turn_cost", "...X                                                                                                ");
        org.junit.Assert.assertNotNull(profileArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(graphHopperConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "profiles:\nprofiles_ch:\nprofiles_lm:\nproperties:\n" + "'", str6, "profiles:\nprofiles_ch:\nprofiles_lm:\nproperties:\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "...X                                                                                                " + "'", str10, "...X                                                                                                ");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue4 = new com.graphhopper.routing.ev.StringEncodedValue("custom", (int) ' ', false);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState6 = disabledEdgeIterator0.set(stringEncodedValue4, "{mtb=get_off_bike}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue4 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.util.details.BooleanDetails booleanDetails5 = new com.graphhopper.util.details.BooleanDetails("get_off_bike", booleanEncodedValue4);
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter6 = com.graphhopper.routing.util.DefaultEdgeFilter.outEdges(booleanEncodedValue4);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.GHUtility.printInfo(graph0, (int) (byte) 1, 10, (com.graphhopper.routing.util.EdgeFilter) defaultEdgeFilter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanEncodedValue4);
        org.junit.Assert.assertNotNull(defaultEdgeFilter6);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        com.graphhopper.util.DistanceCalcEarth distanceCalcEarth0 = new com.graphhopper.util.DistanceCalcEarth();
        double double10 = distanceCalcEarth0.calcNormalizedEdgeDistance3D((-4.0d), (double) 2, (-4.0d), (double) 35L, (double) 429496729603L, (double) 35, (double) 100, (double) 11, (double) 10);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6209609478125566d + "'", double10 == 0.6209609478125566d);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        com.carrotsearch.hppc.IntArrayList intArrayList2 = com.graphhopper.util.ArrayUtil.constant((int) (short) -1, (int) (byte) 1);
        com.carrotsearch.hppc.IntArrayList intArrayList3 = com.graphhopper.util.ArrayUtil.invert(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
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
        boolean boolean18 = longLongHashMap10.putIfAbsent((long) 3, (long) 35);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        java.util.Random random1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.carrotsearch.hppc.IntArrayList intArrayList2 = com.graphhopper.util.ArrayUtil.permutation((int) (short) 10, random1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        java.lang.String str0 = com.graphhopper.routing.ev.MaxHeight.KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "max_height" + "'", str0, "max_height");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        com.graphhopper.util.SimpleIntDeque simpleIntDeque1 = new com.graphhopper.util.SimpleIntDeque((int) 'a');
        java.lang.String str2 = simpleIntDeque1.toString();
        simpleIntDeque1.setGrowFactor((float) 2);
        simpleIntDeque1.setGrowFactor((float) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        com.graphhopper.search.StringIndex stringIndex2 = new com.graphhopper.search.StringIndex((com.graphhopper.storage.Directory) rAMDirectory1);
        com.graphhopper.storage.Directory directory3 = rAMDirectory1.create();
        org.junit.Assert.assertNotNull(directory3);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue2 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.util.details.BooleanDetails booleanDetails3 = new com.graphhopper.util.details.BooleanDetails("get_off_bike", booleanEncodedValue2);
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter4 = com.graphhopper.routing.util.DefaultEdgeFilter.outEdges(booleanEncodedValue2);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState6 = disabledEdgeIterator0.set(booleanEncodedValue2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanEncodedValue2);
        org.junit.Assert.assertNotNull(defaultEdgeFilter4);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        java.lang.String str0 = com.graphhopper.routing.util.FlagEncoderFactory.RACINGBIKE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "racingbike" + "'", str0, "racingbike");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        com.graphhopper.reader.ReaderNode readerNode3 = new com.graphhopper.reader.ReaderNode((long) ' ', (double) 1L, (double) 3);
        java.lang.String[] strArray33 = new java.lang.String[] { "cgiar", "1.8.0_251", ".X..                                                                                                ", "profiles:\nprofiles_ch:\nprofiles_lm:\nproperties:\n", "profiles:\nprofiles_ch:\nprofiles_lm:\nproperties:\n", "bike_network", "get_off_bike", "3.0", "...X                                                                                                ", "max_width", "prepare.ch.edge.witness_search.min_max_settled_edges", "bike2", "[]$turn_cost", "profiles:\nprofiles_ch:\nprofiles_lm:\nproperties:\n", "SpatialRule [getId()=aut, getPriority()=100]", "road_class_link", "multi", "...X                                                                                                ", "car4wd", "bike2", "3.0", "profiles:\nprofiles_ch:\nprofiles_lm:\nproperties:\n", "mtb", "country", "mtb", "get_off_bike|node-based", "1.8.0_251", "", "1.8.0_251" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.lang.String str36 = readerNode3.getFirstPriorityTag((java.util.List<java.lang.String>) strList34);
        readerNode3.clearTags();
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.storage.index.Snap snap3 = new com.graphhopper.storage.index.Snap((double) '4', 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.querygraph.QueryGraph queryGraph4 = com.graphhopper.routing.querygraph.QueryGraph.create(graph0, snap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        com.graphhopper.storage.index.Snap snap2 = new com.graphhopper.storage.index.Snap((double) '4', 100.0d);
        com.graphhopper.storage.index.Snap snap5 = new com.graphhopper.storage.index.Snap((double) '4', 100.0d);
        com.graphhopper.storage.index.Snap[] snapArray6 = new com.graphhopper.storage.index.Snap[] { snap2, snap5 };
        java.util.ArrayList<com.graphhopper.storage.index.Snap> snapList7 = new java.util.ArrayList<com.graphhopper.storage.index.Snap>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.storage.index.Snap>) snapList7, snapArray6);
        com.graphhopper.routing.querygraph.QueryGraph queryGraph9 = null;
        com.graphhopper.routing.RoutingAlgorithmFactory routingAlgorithmFactory10 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions11 = null;
        com.graphhopper.routing.FlexiblePathCalculator flexiblePathCalculator12 = new com.graphhopper.routing.FlexiblePathCalculator(queryGraph9, routingAlgorithmFactory10, algorithmOptions11);
        int int13 = flexiblePathCalculator12.getVisitedNodes();
        com.graphhopper.routing.AlgorithmOptions algorithmOptions14 = flexiblePathCalculator12.getAlgoOpts();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.RoundTripRouting.Result result15 = com.graphhopper.routing.RoundTripRouting.calcPaths((java.util.List<com.graphhopper.storage.index.Snap>) snapList7, flexiblePathCalculator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(snapArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(algorithmOptions14);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        com.graphhopper.coll.GHSortedCollection gHSortedCollection0 = new com.graphhopper.coll.GHSortedCollection();
        // The following exception was thrown during execution in test generation
        try {
            gHSortedCollection0.update((int) (short) 0, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: cannot remove key 0 with value 32 - did you insert 0,32 before?");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        com.graphhopper.routing.ev.RoadEnvironment roadEnvironment0 = com.graphhopper.routing.ev.RoadEnvironment.SHUTTLE_TRAIN;
        org.junit.Assert.assertTrue("'" + roadEnvironment0 + "' != '" + com.graphhopper.routing.ev.RoadEnvironment.SHUTTLE_TRAIN + "'", roadEnvironment0.equals(com.graphhopper.routing.ev.RoadEnvironment.SHUTTLE_TRAIN));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        com.graphhopper.util.SimpleIntDeque simpleIntDeque0 = new com.graphhopper.util.SimpleIntDeque();
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        com.graphhopper.routing.SPTEntry sPTEntry2 = new com.graphhopper.routing.SPTEntry((int) (byte) -1, 10.0d);
        sPTEntry2.edge = (-1);
        com.graphhopper.routing.AStar.AStarEntry aStarEntry9 = new com.graphhopper.routing.AStar.AStarEntry((int) (short) 100, 3, 111194.92664455873d, 1.667897456212138E7d);
        sPTEntry2.parent = aStarEntry9;
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue1 = null;
        com.graphhopper.util.details.DecimalDetails decimalDetails4 = new com.graphhopper.util.details.DecimalDetails("", decimalEncodedValue1, "hi!", (double) (short) 0);
        java.util.Map.Entry<java.lang.String, java.util.List<com.graphhopper.util.details.PathDetail>> strEntry5 = decimalDetails4.build();
        decimalDetails4.endInterval((int) ' ');
        org.junit.Assert.assertNotNull(strEntry5);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.IntsRef intsRef1 = new com.graphhopper.storage.IntsRef((-919338616));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue1 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState3 = disabledEdgeIterator0.setReverse(booleanEncodedValue1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanEncodedValue1);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        com.graphhopper.search.StringIndex stringIndex2 = new com.graphhopper.search.StringIndex((com.graphhopper.storage.Directory) rAMDirectory1);
        com.graphhopper.coll.OSMIDMap oSMIDMap4 = new com.graphhopper.coll.OSMIDMap((com.graphhopper.storage.Directory) rAMDirectory1, (int) (byte) 10);
        oSMIDMap4.optimize();
        int int7 = oSMIDMap4.get(429496729603L);
        int int8 = oSMIDMap4.getMemoryUsage();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap0 = new com.graphhopper.coll.GHIntLongHashMap();
        long long3 = gHIntLongHashMap0.addTo((int) (short) -1, (long) '4');
        boolean boolean5 = gHIntLongHashMap0.indexExists(0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        com.graphhopper.storage.index.Snap snap2 = new com.graphhopper.storage.index.Snap((double) '4', 100.0d);
        com.graphhopper.util.shapes.GHPoint gHPoint3 = snap2.getQueryPoint();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.shapes.GHPoint3D gHPoint3D4 = snap2.getSnappedPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Calculate snapped point before!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gHPoint3);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue1 = com.graphhopper.routing.ev.Country.create();
        java.lang.String str2 = countryEnumEncodedValue1.getName();
        com.graphhopper.routing.ev.Country[] countryArray3 = countryEnumEncodedValue1.getValues();
        com.graphhopper.util.details.IntDetails intDetails4 = new com.graphhopper.util.details.IntDetails("bike2", (com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue1);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "country" + "'", str2, "country");
        org.junit.Assert.assertNotNull(countryArray3);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        java.lang.String str0 = com.graphhopper.util.Constants.BUILD_DATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "2021-04-04T01:09:20Z" + "'", str0, "2021-04-04T01:09:20Z");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        java.lang.Class<com.graphhopper.routing.util.PriorityCode> priorityCodeClass1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.util.PriorityCode> priorityCodeEnumEncodedValue3 = new com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.util.PriorityCode>("mtb", priorityCodeClass1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        com.graphhopper.search.StringIndex stringIndex2 = new com.graphhopper.search.StringIndex((com.graphhopper.storage.Directory) rAMDirectory1);
        boolean boolean3 = stringIndex2.loadExisting();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = null; // flaky: stringIndex2.get((long) ' ', "");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge prepareBaseEdge5 = new com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge((int) (byte) 1, (int) (byte) -1, (int) (short) 1, (float) (short) -1, (float) '#');
        int int6 = prepareBaseEdge5.getNodeB();
        int int7 = prepareBaseEdge5.getOrigEdgeKeyLastAB();
        int int8 = prepareBaseEdge5.getNodeA();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator5 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray6 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator5 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap7 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray1, edgeIteratorArray6);
        int[] intArray8 = edgeIteratorIntObjectHashMap7.keys;
        com.carrotsearch.hppc.IntArrayList intArrayList11 = com.graphhopper.util.ArrayUtil.constant((int) (short) -1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = edgeIteratorIntObjectHashMap7.removeAll((com.carrotsearch.hppc.IntContainer) intArrayList11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
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
        org.junit.Assert.assertNotNull(intArrayList11);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        com.graphhopper.routing.DirectionResolverResult directionResolverResult0 = com.graphhopper.routing.DirectionResolverResult.impossible();
        org.junit.Assert.assertNotNull(directionResolverResult0);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        com.graphhopper.routing.ev.RoadClass roadClass0 = com.graphhopper.routing.ev.RoadClass.TERTIARY;
        org.junit.Assert.assertTrue("'" + roadClass0 + "' != '" + com.graphhopper.routing.ev.RoadClass.TERTIARY + "'", roadClass0.equals(com.graphhopper.routing.ev.RoadClass.TERTIARY));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
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
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHIntHashSet gHIntHashSet1 = new com.graphhopper.coll.GHIntHashSet((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of elements must be >= 0: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap1 = new com.graphhopper.coll.GHIntLongHashMap((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of elements must be >= 0: -2");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        java.util.BitSet bitSet5 = java.util.BitSet.valueOf(longArray3);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(bitSet5);
        org.junit.Assert.assertEquals(bitSet5.toString(), "{}");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue5 = new com.graphhopper.routing.ev.StringEncodedValue("custom", (int) ' ', false);
        java.lang.String str6 = stringEncodedValue5.getName();
        com.graphhopper.util.details.StringDetails stringDetails7 = new com.graphhopper.util.details.StringDetails("prepare.ch.edge.witness_search.min_max_settled_edges", stringEncodedValue5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = disabledEdgeIterator0.get(stringEncodedValue5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "custom" + "'", str6, "custom");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
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
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        java.lang.Class<com.graphhopper.routing.ev.Country> countryClass1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue3 = new com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country>("beeline", countryClass1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        com.graphhopper.routing.util.parsers.OSMRoadAccessParser oSMRoadAccessParser0 = new com.graphhopper.routing.util.parsers.OSMRoadAccessParser();
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        com.graphhopper.storage.IntsRef intsRef1 = null;
        com.graphhopper.util.EdgeIteratorState edgeIteratorState7 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) (byte) 100, intsRef1, (int) (short) -1, (int) (short) 100, (-4), (int) (byte) 0, 3);
        com.graphhopper.util.PointList pointList8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState9 = edgeIteratorState7.setWayGeometry(pointList8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorState7);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        com.graphhopper.routing.ch.NodeOrderingProvider nodeOrderingProvider1 = com.graphhopper.routing.ch.NodeOrderingProvider.identity(100);
        int int2 = nodeOrderingProvider1.getNumNodes();
        org.junit.Assert.assertNotNull(nodeOrderingProvider1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        com.graphhopper.routing.ev.RoadClass roadClass0 = com.graphhopper.routing.ev.RoadClass.TRACK;
        org.junit.Assert.assertTrue("'" + roadClass0 + "' != '" + com.graphhopper.routing.ev.RoadClass.TRACK + "'", roadClass0.equals(com.graphhopper.routing.ev.RoadClass.TRACK));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        com.graphhopper.routing.util.DefaultFlagEncoderFactory defaultFlagEncoderFactory0 = new com.graphhopper.routing.util.DefaultFlagEncoderFactory();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.EncodingManager encodingManager2 = com.graphhopper.routing.util.EncodingManager.create((com.graphhopper.routing.util.FlagEncoderFactory) defaultFlagEncoderFactory0, ".X..                                                                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Since 0.7 EncodingManager does no longer accept upper case profiles: .X..                                                                                                ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        com.graphhopper.routing.ev.MaxWeight maxWeight0 = new com.graphhopper.routing.ev.MaxWeight();
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
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
        com.carrotsearch.hppc.predicates.IntPredicate intPredicate15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = intHashSet14.removeAll(intPredicate15);
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
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
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
        java.lang.String str16 = intHashSet14.toString();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[100]" + "'", str16, "[100]");
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        java.util.List<com.graphhopper.routing.util.spatialrules.SpatialRule> spatialRuleList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.spatialrules.SpatialRuleSet spatialRuleSet2 = new com.graphhopper.routing.util.spatialrules.SpatialRuleSet(spatialRuleList0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        java.lang.String str0 = com.graphhopper.routing.ch.CHParameters.CONTRACTED_NODES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "prepare.ch.contracted_nodes" + "'", str0, "prepare.ch.contracted_nodes");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        com.graphhopper.util.SimpleIntDeque simpleIntDeque1 = new com.graphhopper.util.SimpleIntDeque((int) 'a');
        boolean boolean2 = simpleIntDeque1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.storage.IntsRef intsRef1 = com.graphhopper.storage.IntsRef.EMPTY;
        com.graphhopper.storage.IntsRef intsRef2 = com.graphhopper.storage.IntsRef.EMPTY;
        boolean boolean3 = intsRef1.intsEquals(intsRef2);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState4 = disabledEdgeIterator0.setFlags(intsRef1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intsRef1);
        org.junit.Assert.assertNotNull(intsRef2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        com.graphhopper.routing.DirectionResolverResult directionResolverResult2 = com.graphhopper.routing.DirectionResolverResult.onlyLeft((int) '4', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.graphhopper.routing.DirectionResolverResult.getOutEdge(directionResolverResult2, "concrete");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for curbside : 'concrete'. allowed: left, right, any");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directionResolverResult2);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder2 = rAMDirectory1.getByteOrder();
        com.graphhopper.util.BitUtil bitUtil3 = com.graphhopper.util.BitUtil.get(byteOrder2);
        com.graphhopper.util.BitUtil bitUtil4 = com.graphhopper.util.BitUtil.BIG;
        long long7 = bitUtil4.toLong((int) (byte) 100, 3);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) -1, (byte) 100 };
        bitUtil4.fromInt(byteArray14, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bitUtil3.toDouble(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(bitUtil3);
        org.junit.Assert.assertNotNull(bitUtil4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 429496729603L + "'", long7 == 429496729603L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0, 0, 52, -1, 100]");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue1 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.Country country3 = com.graphhopper.routing.ev.Country.find("country");
        com.graphhopper.routing.ev.Country country5 = com.graphhopper.routing.ev.Country.find("country");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState6 = disabledEdgeIterator0.set(countryEnumEncodedValue1, country3, country5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(countryEnumEncodedValue1);
        org.junit.Assert.assertTrue("'" + country3 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country3.equals(com.graphhopper.routing.ev.Country.DEFAULT));
        org.junit.Assert.assertTrue("'" + country5 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country5.equals(com.graphhopper.routing.ev.Country.DEFAULT));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        javax.xml.stream.XMLStreamReader xMLStreamReader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.ReaderWay readerWay2 = com.graphhopper.reader.osm.OSMXMLHelper.createWay((long) (-3), xMLStreamReader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue4 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.util.details.BooleanDetails booleanDetails5 = new com.graphhopper.util.details.BooleanDetails("get_off_bike", booleanEncodedValue4);
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter6 = com.graphhopper.routing.util.DefaultEdgeFilter.outEdges(booleanEncodedValue4);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.GHUtility.printInfo(graph0, 35, (int) '#', (com.graphhopper.routing.util.EdgeFilter) defaultEdgeFilter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanEncodedValue4);
        org.junit.Assert.assertNotNull(defaultEdgeFilter6);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        com.graphhopper.routing.DirectionResolverResult directionResolverResult2 = com.graphhopper.routing.DirectionResolverResult.onlyLeft((-4), 3);
        int int3 = directionResolverResult2.getOutEdgeLeft();
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType4 = com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY;
        java.util.Calendar calendar5 = com.graphhopper.reader.osm.conditional.DateRangeParser.createCalendar();
        com.graphhopper.reader.osm.conditional.ParsedCalendar parsedCalendar6 = new com.graphhopper.reader.osm.conditional.ParsedCalendar(parseType4, calendar5);
        com.graphhopper.reader.dem.CGIARProvider cGIARProvider7 = new com.graphhopper.reader.dem.CGIARProvider();
        java.lang.String str8 = cGIARProvider7.toString();
        cGIARProvider7.setInterpolate(true);
        cGIARProvider7.setAutoRemoveTemporaryFiles(false);
        java.lang.String str13 = cGIARProvider7.toString();
        com.graphhopper.reader.dem.ElevationProvider elevationProvider15 = cGIARProvider7.setBaseURL("hi!");
        com.graphhopper.coll.MapEntry<java.util.Calendar, com.graphhopper.reader.dem.AbstractTiffElevationProvider> calendarMapEntry16 = new com.graphhopper.coll.MapEntry<java.util.Calendar, com.graphhopper.reader.dem.AbstractTiffElevationProvider>(calendar5, (com.graphhopper.reader.dem.AbstractTiffElevationProvider) cGIARProvider7);
        boolean boolean17 = directionResolverResult2.equals((java.lang.Object) cGIARProvider7);
        org.junit.Assert.assertNotNull(directionResolverResult2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + parseType4 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY + "'", parseType4.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY));
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1617558186558,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=94,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=43,SECOND=6,MILLISECOND=558,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cgiar" + "'", str8, "cgiar");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "cgiar" + "'", str13, "cgiar");
        org.junit.Assert.assertNotNull(elevationProvider15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser oSMFootNetworkTagParser0 = new com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser();
        int[] intArray2 = new int[] { 100 };
        long[] longArray4 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap5 = com.carrotsearch.hppc.IntLongHashMap.from(intArray2, longArray4);
        int[] intArray7 = new int[] { 100 };
        long[] longArray9 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap10 = com.carrotsearch.hppc.IntLongHashMap.from(intArray7, longArray9);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator11 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray12 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator11 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap13 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray7, edgeIteratorArray12);
        int[] intArray14 = com.graphhopper.util.ArrayUtil.merge(intArray2, intArray7);
        com.graphhopper.storage.IntsRef intsRef17 = new com.graphhopper.storage.IntsRef(intArray2, (int) (short) 0, 0);
        com.graphhopper.storage.IntsRef intsRef18 = com.graphhopper.storage.IntsRef.EMPTY;
        boolean boolean19 = intsRef17.intsEquals(intsRef18);
        com.graphhopper.reader.ReaderWay readerWay20 = null;
        com.graphhopper.storage.IntsRef intsRef22 = com.graphhopper.routing.ev.TurnCost.createFlags();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.IntsRef intsRef23 = oSMFootNetworkTagParser0.handleWayTags(intsRef18, readerWay20, true, intsRef22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap5);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap10);
        org.junit.Assert.assertNotNull(edgeIteratorArray12);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100]");
        org.junit.Assert.assertNotNull(intsRef18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intsRef22);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        com.graphhopper.storage.NodeAccess nodeAccess0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator2 = new com.graphhopper.routing.weighting.BeelineWeightApproximator(nodeAccess0, weighting1);
        com.graphhopper.routing.weighting.BalancedWeightApproximator balancedWeightApproximator3 = new com.graphhopper.routing.weighting.BalancedWeightApproximator((com.graphhopper.routing.weighting.WeightApproximator) beelineWeightApproximator2);
        // The following exception was thrown during execution in test generation
        try {
            balancedWeightApproximator3.setFromTo((int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
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
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        com.graphhopper.routing.ev.RoadEnvironment roadEnvironment0 = com.graphhopper.routing.ev.RoadEnvironment.ROAD;
        org.junit.Assert.assertTrue("'" + roadEnvironment0 + "' != '" + com.graphhopper.routing.ev.RoadEnvironment.ROAD + "'", roadEnvironment0.equals(com.graphhopper.routing.ev.RoadEnvironment.ROAD));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType0 = com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY;
        java.util.Calendar calendar1 = com.graphhopper.reader.osm.conditional.DateRangeParser.createCalendar();
        com.graphhopper.reader.osm.conditional.ParsedCalendar parsedCalendar2 = new com.graphhopper.reader.osm.conditional.ParsedCalendar(parseType0, calendar1);
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType3 = parsedCalendar2.parseType;
        java.util.Calendar calendar4 = parsedCalendar2.getMax();
        org.junit.Assert.assertTrue("'" + parseType0 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY + "'", parseType0.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY));
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=94,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=5,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + parseType3 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY + "'", parseType3.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH_DAY));
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=94,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=5,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHLongHashSet gHLongHashSet1 = new com.graphhopper.coll.GHLongHashSet((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of elements must be >= 0: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        java.lang.String str0 = com.graphhopper.util.Constants.OS_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Linux" + "'", str0, "Linux");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        java.util.Locale locale0 = null;
        com.graphhopper.util.TranslationMap.TranslationHashMap translationHashMap1 = new com.graphhopper.util.TranslationMap.TranslationHashMap(locale0);
        com.graphhopper.util.TranslationMap.TranslationHashMap translationHashMap4 = translationHashMap1.put("mtb", "get_off_bike");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = translationHashMap1.getLanguage();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(translationHashMap4);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        com.graphhopper.storage.index.Snap snap2 = new com.graphhopper.storage.index.Snap((double) '4', 100.0d);
        boolean boolean3 = snap2.isValid();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        com.graphhopper.routing.ev.TrackType trackType0 = com.graphhopper.routing.ev.TrackType.GRADE4;
        org.junit.Assert.assertTrue("'" + trackType0 + "' != '" + com.graphhopper.routing.ev.TrackType.GRADE4 + "'", trackType0.equals(com.graphhopper.routing.ev.TrackType.GRADE4));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        com.graphhopper.routing.SPTEntry sPTEntry3 = new com.graphhopper.routing.SPTEntry(1, 1687814340, (double) 10);
        com.graphhopper.routing.SPTEntry sPTEntry4 = sPTEntry3.clone();
        com.graphhopper.routing.SPTEntry sPTEntry5 = sPTEntry4.clone();
        org.junit.Assert.assertNotNull(sPTEntry4);
        org.junit.Assert.assertNotNull(sPTEntry5);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue2 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.util.details.BooleanDetails booleanDetails3 = new com.graphhopper.util.details.BooleanDetails("get_off_bike", booleanEncodedValue2);
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter4 = com.graphhopper.routing.util.DefaultEdgeFilter.outEdges(booleanEncodedValue2);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.subnetwork.TarjanSCC.ConnectedComponents connectedComponents6 = com.graphhopper.routing.subnetwork.TarjanSCC.findComponentsRecursive(graph0, (com.graphhopper.routing.util.EdgeFilter) defaultEdgeFilter4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanEncodedValue2);
        org.junit.Assert.assertNotNull(defaultEdgeFilter4);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        com.carrotsearch.hppc.HashOrderMixingStrategy hashOrderMixingStrategy2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHLongHashSet gHLongHashSet3 = new com.graphhopper.coll.GHLongHashSet((int) (short) 0, 0.0d, hashOrderMixingStrategy2);
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.hppc.BufferAllocationException; message: The load factor should be in range [0.01, 0.99]: 0.000000");
        } catch (com.carrotsearch.hppc.BufferAllocationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        com.graphhopper.routing.ev.RouteNetwork routeNetwork0 = com.graphhopper.routing.ev.RouteNetwork.LOCAL;
        java.lang.String str1 = routeNetwork0.toString();
        org.junit.Assert.assertTrue("'" + routeNetwork0 + "' != '" + com.graphhopper.routing.ev.RouteNetwork.LOCAL + "'", routeNetwork0.equals(com.graphhopper.routing.ev.RouteNetwork.LOCAL));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "local" + "'", str1, "local");
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        com.graphhopper.routing.ev.Surface surface0 = com.graphhopper.routing.ev.Surface.DIRT;
        org.junit.Assert.assertTrue("'" + surface0 + "' != '" + com.graphhopper.routing.ev.Surface.DIRT + "'", surface0.equals(com.graphhopper.routing.ev.Surface.DIRT));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
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
        int[] intArray21 = new int[] { 100 };
        long[] longArray23 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap24 = com.carrotsearch.hppc.IntLongHashMap.from(intArray21, longArray23);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator25 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray26 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator25 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap27 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray21, edgeIteratorArray26);
        int[] intArray28 = edgeIteratorIntObjectHashMap27.keys;
        int int29 = intHashSet14.addAll(intArray28);
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
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap24);
        org.junit.Assert.assertNotNull(edgeIteratorArray26);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap27);
        org.junit.Assert.assertNotNull(intArray28);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        com.graphhopper.routing.util.FlagEncoder flagEncoder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.graphhopper.routing.util.EncodingManager.getKey(flagEncoder0, "country");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        com.graphhopper.routing.util.TransportationMode transportationMode0 = com.graphhopper.routing.util.TransportationMode.FOOT;
        org.junit.Assert.assertTrue("'" + transportationMode0 + "' != '" + com.graphhopper.routing.util.TransportationMode.FOOT + "'", transportationMode0.equals(com.graphhopper.routing.util.TransportationMode.FOOT));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.CHConfig cHConfig2 = com.graphhopper.storage.CHConfig.edgeBased("profiles:\nprofiles_ch:\nprofiles_lm:\nproperties:\n", weighting1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Profile names may only contain lower case letters, numbers and underscores, given: profiles:?profiles_ch:?profiles_lm:?properties:?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl0 = new com.graphhopper.coll.GHBitSetImpl();
        int int2 = gHBitSetImpl0.previousClearBit(0);
        gHBitSetImpl0.clear();
        int int5 = gHBitSetImpl0.next((int) (short) 0);
        com.graphhopper.storage.Graph graph6 = null;
        com.graphhopper.routing.weighting.Weighting weighting7 = null;
        com.graphhopper.util.PathMerger pathMerger8 = new com.graphhopper.util.PathMerger(graph6, weighting7);
        com.graphhopper.util.PathMerger pathMerger10 = pathMerger8.setCalcPoints(true);
        com.graphhopper.storage.Graph graph11 = null;
        com.graphhopper.routing.weighting.Weighting weighting12 = null;
        com.graphhopper.util.PathMerger pathMerger13 = new com.graphhopper.util.PathMerger(graph11, weighting12);
        com.graphhopper.util.PathMerger pathMerger15 = pathMerger13.setCalcPoints(true);
        com.graphhopper.util.details.PathDetailsBuilderFactory pathDetailsBuilderFactory16 = new com.graphhopper.util.details.PathDetailsBuilderFactory();
        java.util.List<java.lang.String> strList17 = null;
        com.graphhopper.util.PathMerger pathMerger18 = pathMerger13.setPathDetailsBuilders(pathDetailsBuilderFactory16, strList17);
        java.lang.String[] strArray32 = new java.lang.String[] { "3.0", "[]$turn_cost", "get_off_bike|node-based", ".X..                                                                                                ", "get_off_bike", "", "hi!", ".X..                                                                                                ", "[]$turn_cost", ".X..                                                                                                ", "hi!", "get_off_bike", "[]$turn_cost" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        com.graphhopper.util.PathMerger pathMerger35 = pathMerger10.setPathDetailsBuilders(pathDetailsBuilderFactory16, (java.util.List<java.lang.String>) strList33);
        boolean boolean36 = gHBitSetImpl0.equals((java.lang.Object) strList33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(pathMerger10);
        org.junit.Assert.assertNotNull(pathMerger15);
        org.junit.Assert.assertNotNull(pathMerger18);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(pathMerger35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        com.graphhopper.routing.ev.RoadClass roadClass0 = com.graphhopper.routing.ev.RoadClass.UNCLASSIFIED;
        org.junit.Assert.assertTrue("'" + roadClass0 + "' != '" + com.graphhopper.routing.ev.RoadClass.UNCLASSIFIED + "'", roadClass0.equals(com.graphhopper.routing.ev.RoadClass.UNCLASSIFIED));
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge prepareBaseEdge5 = new com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge((int) (byte) 1, (int) (byte) -1, (int) (short) 1, (float) (short) -1, (float) '#');
        int int6 = prepareBaseEdge5.getNodeB();
        int int7 = prepareBaseEdge5.getOrigEdgeKeyFirstBA();
        int int8 = prepareBaseEdge5.getOrigEdgeKeyLastAB();
        // The following exception was thrown during execution in test generation
        try {
            prepareBaseEdge5.setSkipped1(100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        com.graphhopper.storage.index.Snap snap2 = new com.graphhopper.storage.index.Snap((double) '4', 100.0d);
        com.graphhopper.storage.index.Snap.Position position3 = null;
        snap2.setSnappedPosition(position3);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        com.graphhopper.util.DistanceCalcEuclidean distanceCalcEuclidean0 = new com.graphhopper.util.DistanceCalcEuclidean();
        double double7 = distanceCalcEuclidean0.calcNormalizedEdgeDistance((double) 4, 111194.92664455873d, (double) 7, (double) 11, 1.667897456212138E7d, (double) '4');
        double double9 = distanceCalcEuclidean0.calcDenormalizedDist((double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.shapes.BBox bBox13 = distanceCalcEuclidean0.createBBox((-4.0d), (double) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported for the 2D Euclidean space");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.2361865545667784E10d + "'", double7 == 1.2361865545667784E10d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.BIG;
        byte[] byteArray2 = bitUtil0.fromFloat((float) 0);
        com.graphhopper.util.BitUtil bitUtil3 = com.graphhopper.util.BitUtil.LITTLE;
        int int5 = bitUtil3.getIntHigh((long) (byte) 10);
        byte[] byteArray7 = bitUtil3.fromBitString("2021-04-04T01:09:20Z");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bitUtil0.toInt(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(bitUtil3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-48, 109, -69]");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        com.graphhopper.util.DistanceCalcEarth distanceCalcEarth3 = new com.graphhopper.util.DistanceCalcEarth();
        com.graphhopper.util.shapes.Circle circle4 = new com.graphhopper.util.shapes.Circle((double) 'a', (double) (byte) 0, 111194.92664455873d, (com.graphhopper.util.DistanceCalc) distanceCalcEarth3);
        com.graphhopper.util.PointList pointList5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = circle4.intersects(pointList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder spatialRuleLookupBuilder0 = new com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder();
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue5 = new com.graphhopper.routing.ev.StringEncodedValue("custom", (int) ' ', false);
        java.lang.String str6 = stringEncodedValue5.getName();
        com.graphhopper.util.details.StringDetails stringDetails7 = new com.graphhopper.util.details.StringDetails("prepare.ch.edge.witness_search.min_max_settled_edges", stringEncodedValue5);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState9 = disabledEdgeIterator0.set(stringEncodedValue5, "[100]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "custom" + "'", str6, "custom");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue0 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.util.BitUtil bitUtil2 = com.graphhopper.util.BitUtil.BIG;
        byte[] byteArray4 = bitUtil2.fromFloat((float) 0);
        int[] intArray6 = new int[] { 100 };
        long[] longArray8 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap9 = com.carrotsearch.hppc.IntLongHashMap.from(intArray6, longArray8);
        int[] intArray11 = new int[] { 100 };
        long[] longArray13 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap14 = com.carrotsearch.hppc.IntLongHashMap.from(intArray11, longArray13);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator15 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray16 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator15 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap17 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray11, edgeIteratorArray16);
        int[] intArray18 = com.graphhopper.util.ArrayUtil.merge(intArray6, intArray11);
        com.graphhopper.storage.IntsRef intsRef21 = new com.graphhopper.storage.IntsRef(intArray6, (int) (short) 0, 0);
        com.graphhopper.storage.IntsRef intsRef22 = com.graphhopper.storage.IntsRef.EMPTY;
        boolean boolean23 = intsRef21.intsEquals(intsRef22);
        java.lang.String str24 = bitUtil2.toBitString(intsRef22);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = countryEnumEncodedValue0.getInt(true, intsRef22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(countryEnumEncodedValue0);
        org.junit.Assert.assertNotNull(bitUtil2);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[0]");
        org.junit.Assert.assertNotNull(intLongHashMap14);
        org.junit.Assert.assertNotNull(edgeIteratorArray16);
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectHashMap17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100]");
        org.junit.Assert.assertNotNull(intsRef22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        com.graphhopper.routing.util.parsers.OSMHazmatParser oSMHazmatParser0 = new com.graphhopper.routing.util.parsers.OSMHazmatParser();
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        com.graphhopper.routing.ev.HazmatWater hazmatWater0 = com.graphhopper.routing.ev.HazmatWater.PERMISSIVE;
        org.junit.Assert.assertTrue("'" + hazmatWater0 + "' != '" + com.graphhopper.routing.ev.HazmatWater.PERMISSIVE + "'", hazmatWater0.equals(com.graphhopper.routing.ev.HazmatWater.PERMISSIVE));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        int int0 = com.graphhopper.reader.ReaderElement.WAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        com.graphhopper.routing.util.parsers.DefaultTagParserFactory defaultTagParserFactory0 = new com.graphhopper.routing.util.parsers.DefaultTagParserFactory();
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        int int1 = com.graphhopper.util.GHUtility.reverseEdgeKey(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl0 = new com.graphhopper.coll.GHBitSetImpl();
        int int2 = gHBitSetImpl0.previousClearBit(0);
        gHBitSetImpl0.clear();
        int int5 = gHBitSetImpl0.next((int) (short) 0);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl6 = new com.graphhopper.coll.GHBitSetImpl();
        int int8 = gHBitSetImpl6.previousClearBit(0);
        boolean boolean9 = gHBitSetImpl0.intersects((java.util.BitSet) gHBitSetImpl6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        com.graphhopper.storage.DAType dAType0 = com.graphhopper.storage.DAType.MMAP;
        org.junit.Assert.assertNotNull(dAType0);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap0 = new com.graphhopper.coll.GHIntLongHashMap();
        int[] intArray1 = gHIntLongHashMap0.keys;
        com.carrotsearch.hppc.LongCollection longCollection2 = gHIntLongHashMap0.values();
        long long5 = gHIntLongHashMap0.addTo(1687814340, (-1L));
        org.locationtech.jts.geom.Polygon[] polygonArray6 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList7 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList7, polygonArray6);
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule9 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList7);
        com.graphhopper.routing.ev.RoadClass roadClass10 = com.graphhopper.routing.ev.RoadClass.LIVING_STREET;
        com.graphhopper.routing.util.TransportationMode transportationMode11 = com.graphhopper.routing.util.TransportationMode.CAR;
        double double13 = austriaSpatialRule9.getMaxSpeed(roadClass10, transportationMode11, (double) 1L);
        org.locationtech.jts.geom.Polygon[] polygonArray14 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList15 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList15, polygonArray14);
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule17 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList15);
        org.locationtech.jts.geom.Polygon[] polygonArray18 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList19 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList19, polygonArray18);
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule21 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList19);
        com.graphhopper.routing.util.spatialrules.SpatialRule[] spatialRuleArray22 = new com.graphhopper.routing.util.spatialrules.SpatialRule[] { austriaSpatialRule9, austriaSpatialRule17, austriaSpatialRule21 };
        java.util.ArrayList<com.graphhopper.routing.util.spatialrules.SpatialRule> spatialRuleList23 = new java.util.ArrayList<com.graphhopper.routing.util.spatialrules.SpatialRule>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.util.spatialrules.SpatialRule>) spatialRuleList23, spatialRuleArray22);
        com.graphhopper.routing.util.spatialrules.SpatialRuleSet spatialRuleSet26 = new com.graphhopper.routing.util.spatialrules.SpatialRuleSet((java.util.List<com.graphhopper.routing.util.spatialrules.SpatialRule>) spatialRuleList23, (-4));
        com.graphhopper.routing.ev.RoadClass roadClass27 = com.graphhopper.routing.ev.RoadClass.PEDESTRIAN;
        com.graphhopper.routing.util.TransportationMode transportationMode28 = null;
        com.graphhopper.routing.ev.RoadAccess roadAccess29 = com.graphhopper.routing.ev.RoadAccess.NO;
        com.graphhopper.routing.ev.RoadAccess roadAccess30 = spatialRuleSet26.getAccess(roadClass27, transportationMode28, roadAccess29);
        boolean boolean31 = gHIntLongHashMap0.equals((java.lang.Object) roadAccess29);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1687814340, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(longCollection2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(polygonArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + roadClass10 + "' != '" + com.graphhopper.routing.ev.RoadClass.LIVING_STREET + "'", roadClass10.equals(com.graphhopper.routing.ev.RoadClass.LIVING_STREET));
        org.junit.Assert.assertTrue("'" + transportationMode11 + "' != '" + com.graphhopper.routing.util.TransportationMode.CAR + "'", transportationMode11.equals(com.graphhopper.routing.util.TransportationMode.CAR));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(polygonArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(polygonArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(spatialRuleArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + roadClass27 + "' != '" + com.graphhopper.routing.ev.RoadClass.PEDESTRIAN + "'", roadClass27.equals(com.graphhopper.routing.ev.RoadClass.PEDESTRIAN));
        org.junit.Assert.assertTrue("'" + roadAccess29 + "' != '" + com.graphhopper.routing.ev.RoadAccess.NO + "'", roadAccess29.equals(com.graphhopper.routing.ev.RoadAccess.NO));
        org.junit.Assert.assertTrue("'" + roadAccess30 + "' != '" + com.graphhopper.routing.ev.RoadAccess.NO + "'", roadAccess30.equals(com.graphhopper.routing.ev.RoadAccess.NO));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
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
        com.graphhopper.reader.ReaderWay readerWay12 = null;
        com.graphhopper.routing.util.EncodingManager.AcceptWay acceptWay13 = null;
        com.graphhopper.storage.IntsRef intsRef14 = com.graphhopper.storage.IntsRef.EMPTY;
        int int15 = intsRef14.offset;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.IntsRef intsRef16 = encodingManager3.handleWayTags(readerWay12, acceptWay13, intsRef14);
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
        org.junit.Assert.assertNotNull(intsRef14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        com.graphhopper.util.DistanceCalcEuclidean distanceCalcEuclidean0 = new com.graphhopper.util.DistanceCalcEuclidean();
        double double7 = distanceCalcEuclidean0.calcNormalizedEdgeDistance(0.0d, (double) (-1.0f), (double) ' ', (double) 1.0f, (double) (-1), (double) 100L);
        com.graphhopper.util.shapes.GHPoint gHPoint13 = distanceCalcEuclidean0.intermediatePoint((double) 0L, (double) 100.0f, (double) (byte) 0, (double) 100.0f, (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.shapes.BBox bBox17 = distanceCalcEuclidean0.createBBox((double) '#', (double) (byte) 100, (double) 150323855395L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported for the 2D Euclidean space");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 960.3999999999999d + "'", double7 == 960.3999999999999d);
        org.junit.Assert.assertNotNull(gHPoint13);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue1 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.util.details.BooleanDetails booleanDetails2 = new com.graphhopper.util.details.BooleanDetails("get_off_bike", booleanEncodedValue1);
        java.lang.String str3 = booleanDetails2.getName();
        org.junit.Assert.assertNotNull(booleanEncodedValue1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "get_off_bike" + "'", str3, "get_off_bike");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray0 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager1 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray0);
        boolean boolean2 = encodingManager1.needsTurnCostsSupport();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.IntEncodedValue intEncodedValue4 = encodingManager1.getIntEncodedValue("SpatialRule [getId()=aut, getPriority()=100]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot find EncodedValue SpatialRule [getId()=aut, getPriority()=100] in collection: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(flagEncoderArray0);
        org.junit.Assert.assertNotNull(encodingManager1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        com.graphhopper.util.DistanceCalcEarth distanceCalcEarth0 = new com.graphhopper.util.DistanceCalcEarth();
        double double2 = distanceCalcEarth0.calcDenormalizedDist((double) (byte) 10);
        boolean boolean5 = distanceCalcEarth0.isDateLineCrossOver(2.0015086747773867E7d, 960.3999999999999d);
        double double7 = distanceCalcEarth0.calcCircumference((double) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.394751250354173E7d + "'", double7 == 3.394751250354173E7d);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        com.graphhopper.routing.AStar.AStarEntry aStarEntry4 = new com.graphhopper.routing.AStar.AStarEntry((int) (short) 100, 3, 111194.92664455873d, 1.667897456212138E7d);
        com.graphhopper.routing.AStar.AStarEntry aStarEntry5 = aStarEntry4.getParent();
        org.junit.Assert.assertNull(aStarEntry5);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap0 = new com.graphhopper.coll.GHIntLongHashMap();
        long long3 = gHIntLongHashMap0.addTo((int) (short) -1, (long) '4');
        boolean boolean5 = gHIntLongHashMap0.containsKey((int) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray0 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager1 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray0);
        boolean boolean2 = encodingManager1.needsTurnCostsSupport();
        com.graphhopper.reader.ReaderWay readerWay3 = null;
        com.graphhopper.routing.util.EncodingManager.AcceptWay acceptWay4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = encodingManager1.acceptWay(readerWay3, acceptWay4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(flagEncoderArray0);
        org.junit.Assert.assertNotNull(encodingManager1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue0 = com.graphhopper.routing.ev.MaxWidth.create();
        org.junit.Assert.assertNotNull(decimalEncodedValue0);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        com.graphhopper.routing.AlternativeRoute.PlateauInfo plateauInfo7 = new com.graphhopper.routing.AlternativeRoute.PlateauInfo("custom_network", (java.util.List<java.lang.Integer>) intList5);
        com.graphhopper.util.shapes.BBox bBox8 = null;
        com.graphhopper.routing.lm.LandmarkSuggestion landmarkSuggestion9 = new com.graphhopper.routing.lm.LandmarkSuggestion((java.util.List<java.lang.Integer>) intList5, bBox8);
        com.graphhopper.routing.AlternativeRoute.PlateauInfo plateauInfo10 = new com.graphhopper.routing.AlternativeRoute.PlateauInfo("X.X.       ", (java.util.List<java.lang.Integer>) intList5);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.util.TraversalMode traversalMode2 = com.graphhopper.routing.util.TraversalMode.EDGE_BASED;
        int int7 = traversalMode2.createTraversalId((int) (short) -1, 3, 1687814340, false);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.AStarBidirection aStarBidirection8 = new com.graphhopper.routing.AStarBidirection(graph0, weighting1, traversalMode2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + traversalMode2 + "' != '" + com.graphhopper.routing.util.TraversalMode.EDGE_BASED + "'", traversalMode2.equals(com.graphhopper.routing.util.TraversalMode.EDGE_BASED));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-919338616) + "'", int7 == (-919338616));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.storage.RAMDirectory rAMDirectory2 = new com.graphhopper.storage.RAMDirectory("custom");
        com.graphhopper.search.StringIndex stringIndex3 = new com.graphhopper.search.StringIndex((com.graphhopper.storage.Directory) rAMDirectory2);
        java.util.Collection<com.graphhopper.storage.DataAccess> dataAccessCollection4 = rAMDirectory2.getAll();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.index.LocationIndexTree locationIndexTree5 = new com.graphhopper.storage.index.LocationIndexTree(graph0, (com.graphhopper.storage.Directory) rAMDirectory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataAccessCollection4);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        com.graphhopper.storage.RAMDirectory rAMDirectory0 = new com.graphhopper.storage.RAMDirectory();
        rAMDirectory0.clear();
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("custom");
        java.nio.ByteOrder byteOrder2 = rAMDirectory1.getByteOrder();
        com.graphhopper.util.BitUtil bitUtil3 = com.graphhopper.util.BitUtil.get(byteOrder2);
        long long6 = bitUtil3.toLong(35, (int) '#');
        com.graphhopper.util.BitUtil bitUtil7 = com.graphhopper.util.BitUtil.BIG;
        byte[] byteArray9 = bitUtil7.fromFloat((float) 0);
        // The following exception was thrown during execution in test generation
        try {
            short short11 = bitUtil3.toShort(byteArray9, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(bitUtil3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 150323855395L + "'", long6 == 150323855395L);
        org.junit.Assert.assertNotNull(bitUtil7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0]");
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        com.graphhopper.storage.IntsRef intsRef1 = null;
        com.graphhopper.util.EdgeIteratorState edgeIteratorState7 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) (byte) 100, intsRef1, (int) (short) -1, (int) (short) 100, (-4), (int) (byte) 0, 3);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue8 = com.graphhopper.routing.ev.Country.create();
        java.lang.String str9 = countryEnumEncodedValue8.getName();
        com.graphhopper.reader.OSMTurnRelation.Type type11 = com.graphhopper.reader.OSMTurnRelation.Type.getRestrictionType("");
        boolean boolean12 = countryEnumEncodedValue8.equals((java.lang.Object) type11);
        int int13 = countryEnumEncodedValue8.getMaxInt();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = edgeIteratorState7.getReverse((com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorState7);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "country" + "'", str9, "country");
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED + "'", type11.equals(com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        com.graphhopper.storage.RoutingCHGraph routingCHGraph0 = null;
        com.graphhopper.routing.querygraph.QueryGraph queryGraph1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.querygraph.QueryRoutingCHGraph queryRoutingCHGraph2 = new com.graphhopper.routing.querygraph.QueryRoutingCHGraph(routingCHGraph0, queryGraph1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        java.lang.String str2 = com.graphhopper.routing.util.EncodingManager.getKey("1.8.0_251", "bike2");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.8.0_251$bike2" + "'", str2, "1.8.0_251$bike2");
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        com.graphhopper.routing.ev.Surface surface1 = com.graphhopper.routing.ev.Surface.find("{mtb=get_off_bike}");
        org.junit.Assert.assertTrue("'" + surface1 + "' != '" + com.graphhopper.routing.ev.Surface.OTHER + "'", surface1.equals(com.graphhopper.routing.ev.Surface.OTHER));
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.locationtech.jts.geom.Polygon[] polygonArray0 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList1 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList1, polygonArray0);
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule3 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList1);
        java.lang.String str4 = austriaSpatialRule3.toString();
        java.util.List<org.locationtech.jts.geom.Polygon> polygonList5 = austriaSpatialRule3.getBorders();
        org.junit.Assert.assertNotNull(polygonArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SpatialRule [getId()=aut, getPriority()=100]" + "'", str4, "SpatialRule [getId()=aut, getPriority()=100]");
        org.junit.Assert.assertNotNull(polygonList5);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
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
        com.graphhopper.routing.ch.NodeOrderingProvider nodeOrderingProvider41 = com.graphhopper.routing.ch.NodeOrderingProvider.fromArray(intArray1);
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
        org.junit.Assert.assertNotNull(nodeOrderingProvider41);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        com.graphhopper.util.SimpleIntDeque simpleIntDeque1 = new com.graphhopper.util.SimpleIntDeque((int) 'a');
        java.lang.String str2 = simpleIntDeque1.toString();
        java.lang.String str3 = simpleIntDeque1.toString();
        int int4 = simpleIntDeque1.pop();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        com.graphhopper.routing.ev.IntEncodedValue intEncodedValue0 = com.graphhopper.routing.ev.MtbRating.create();
        org.junit.Assert.assertNotNull(intEncodedValue0);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        com.graphhopper.storage.index.Snap.Position position0 = com.graphhopper.storage.index.Snap.Position.TOWER;
        org.junit.Assert.assertTrue("'" + position0 + "' != '" + com.graphhopper.storage.index.Snap.Position.TOWER + "'", position0.equals(com.graphhopper.storage.index.Snap.Position.TOWER));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        java.lang.String str0 = com.graphhopper.routing.util.FlagEncoderFactory.FOOT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "foot" + "'", str0, "foot");
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMRoadClassParser> oSMRoadClassParserGHObjectIntHashMap0 = new com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMRoadClassParser>();
        com.carrotsearch.hppc.ObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMRoadClassParser> oSMRoadClassParserObjectIntHashMap1 = oSMRoadClassParserGHObjectIntHashMap0.clone();
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser2 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
        int int4 = oSMRoadClassParserGHObjectIntHashMap0.getOrDefault(oSMRoadClassParser2, (int) (byte) 1);
        boolean boolean5 = oSMRoadClassParserGHObjectIntHashMap0.isEmpty();
        org.junit.Assert.assertNotNull(oSMRoadClassParserObjectIntHashMap1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        com.graphhopper.routing.ev.MaxWidth maxWidth0 = new com.graphhopper.routing.ev.MaxWidth();
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.util.TraversalMode traversalMode2 = com.graphhopper.routing.util.TraversalMode.EDGE_BASED;
        int int7 = traversalMode2.createTraversalId((int) (short) -1, 3, 1687814340, false);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.Dijkstra dijkstra8 = new com.graphhopper.routing.Dijkstra(graph0, weighting1, traversalMode2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + traversalMode2 + "' != '" + com.graphhopper.routing.util.TraversalMode.EDGE_BASED + "'", traversalMode2.equals(com.graphhopper.routing.util.TraversalMode.EDGE_BASED));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-919338616) + "'", int7 == (-919338616));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMRoadClassParser> oSMRoadClassParserGHObjectIntHashMap2 = new com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMRoadClassParser>(35, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.hppc.BufferAllocationException; message: The load factor should be in range [0.01, 0.99]: 10.000000");
        } catch (com.carrotsearch.hppc.BufferAllocationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap1 = new com.graphhopper.coll.GHLongLongHashMap(3);
        long long4 = 0L; // flaky: gHLongLongHashMap1.indexReplace(4, 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        com.graphhopper.util.DistancePlaneProjection distancePlaneProjection0 = new com.graphhopper.util.DistancePlaneProjection();
        double double5 = distancePlaneProjection0.calcDist((double) (short) 0, (double) 0L, (double) (-919338616), (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0222578996763014E14d + "'", double5 == 1.0222578996763014E14d);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        com.graphhopper.routing.ev.Toll toll0 = com.graphhopper.routing.ev.Toll.HGV;
        java.lang.String str1 = toll0.toString();
        org.junit.Assert.assertTrue("'" + toll0 + "' != '" + com.graphhopper.routing.ev.Toll.HGV + "'", toll0.equals(com.graphhopper.routing.ev.Toll.HGV));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hgv" + "'", str1, "hgv");
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        com.graphhopper.util.GitInfo gitInfo5 = new com.graphhopper.util.GitInfo("1.8.0_251", "[]", "[10]", "{mtb=get_off_bike}", false);
        java.lang.String str6 = gitInfo5.getCommitHash();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1.8.0_251" + "'", str6, "1.8.0_251");
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
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
        boolean boolean17 = longLongHashMap10.containsKey(1001L);
        java.util.Iterator<com.carrotsearch.hppc.cursors.LongLongCursor> longLongCursorItor18 = longLongHashMap10.iterator();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(longLongCursorItor18);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue4 = new com.graphhopper.routing.ev.StringEncodedValue("custom", (int) ' ', false);
        java.lang.String str5 = stringEncodedValue4.getName();
        com.graphhopper.util.details.StringDetails stringDetails6 = new com.graphhopper.util.details.StringDetails("prepare.ch.edge.witness_search.min_max_settled_edges", stringEncodedValue4);
        com.graphhopper.storage.IntsRef intsRef8 = com.graphhopper.routing.ev.TurnCost.createFlags();
        com.graphhopper.util.EdgeIteratorState edgeIteratorState14 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState(3.6461703979660586E12d, intsRef8, (int) (short) 1, (int) (byte) 100, 35, (-2), (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = stringDetails6.isEdgeDifferentToLastEdge(edgeIteratorState14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "custom" + "'", str5, "custom");
        org.junit.Assert.assertNotNull(intsRef8);
        org.junit.Assert.assertNotNull(edgeIteratorState14);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        com.graphhopper.util.AngleCalc angleCalc0 = com.graphhopper.util.AngleCalc.ANGLE_CALC;
        double double6 = angleCalc0.calcOrientation((double) (byte) 0, (double) 429496729603L, 1.0d, (double) 3, false);
        org.junit.Assert.assertNotNull(angleCalc0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.1415944901905157d + "'", double6 == 3.1415944901905157d);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl0 = new com.graphhopper.coll.GHBitSetImpl();
        int int2 = gHBitSetImpl0.previousClearBit(0);
        gHBitSetImpl0.clear();
        long[] longArray4 = gHBitSetImpl0.toLongArray();
        long[] longArray5 = new long[] {};
        java.util.BitSet bitSet6 = java.util.BitSet.valueOf(longArray5);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl7 = new com.graphhopper.coll.GHBitSetImpl();
        int int9 = gHBitSetImpl7.previousClearBit(0);
        gHBitSetImpl7.clear();
        boolean boolean12 = gHBitSetImpl7.contains(11);
        bitSet6.andNot((java.util.BitSet) gHBitSetImpl7);
        boolean boolean14 = gHBitSetImpl0.intersects((java.util.BitSet) gHBitSetImpl7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertNotNull(bitSet6);
        org.junit.Assert.assertEquals(bitSet6.toString(), "{}");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.SimpleBooleanEncodedValue simpleBooleanEncodedValue2 = new com.graphhopper.routing.ev.SimpleBooleanEncodedValue("prepare.ch.contracted_nodes", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue name wasn't valid: prepare.ch.contracted_nodes. Use lower case letters, underscore and numbers only.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        com.graphhopper.routing.ch.CHEntry cHEntry4 = new com.graphhopper.routing.ch.CHEntry(3, 0, 2, (-4.0d));
        int int5 = cHEntry4.incEdge;
        com.graphhopper.routing.ch.CHEntry cHEntry6 = cHEntry4.getParent();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(cHEntry6);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        com.graphhopper.storage.Graph graph0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.HeadingResolver headingResolver1 = new com.graphhopper.routing.HeadingResolver(graph0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap1 = new com.graphhopper.coll.GHIntLongHashMap((int) (byte) 0);
        com.carrotsearch.hppc.IntLongHashMap.KeysContainer keysContainer2 = gHIntLongHashMap1.keys();
        long long4 = gHIntLongHashMap1.indexGet(0);
        org.junit.Assert.assertNotNull(keysContainer2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
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
        java.util.Iterator<com.carrotsearch.hppc.cursors.IntCursor> intCursorItor18 = intHashSet14.iterator();
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
        org.junit.Assert.assertNotNull(intCursorItor18);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        com.graphhopper.routing.ev.IntEncodedValue intEncodedValue0 = com.graphhopper.routing.ev.HikeRating.create();
        com.graphhopper.storage.IntsRef intsRef2 = com.graphhopper.storage.IntsRef.EMPTY;
        int int3 = intsRef2.offset;
        // The following exception was thrown during execution in test generation
        try {
            intEncodedValue0.setInt(true, intsRef2, (-919338616));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: EncodedValue hike_rating not initialized");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intEncodedValue0);
        org.junit.Assert.assertNotNull(intsRef2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge prepareBaseEdge5 = new com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge((int) (byte) 1, (int) (byte) -1, (int) (short) 1, (float) (short) -1, (float) '#');
        int int6 = prepareBaseEdge5.getNodeB();
        int int7 = prepareBaseEdge5.getOrigEdgeKeyFirstBA();
        int int8 = prepareBaseEdge5.getOrigEdgeKeyLastAB();
        boolean boolean9 = prepareBaseEdge5.isShortcut();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
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
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        com.graphhopper.reader.dem.MultiSourceElevationProvider multiSourceElevationProvider1 = new com.graphhopper.reader.dem.MultiSourceElevationProvider("X.X.       ");
        com.graphhopper.reader.dem.CGIARProvider cGIARProvider2 = new com.graphhopper.reader.dem.CGIARProvider();
        java.lang.String str3 = cGIARProvider2.toString();
        cGIARProvider2.setInterpolate(true);
        cGIARProvider2.setAutoRemoveTemporaryFiles(false);
        java.lang.String str8 = cGIARProvider2.toString();
        com.graphhopper.reader.dem.ElevationProvider elevationProvider10 = cGIARProvider2.setBaseURL("hi!");
        com.graphhopper.reader.dem.CGIARProvider cGIARProvider11 = new com.graphhopper.reader.dem.CGIARProvider();
        java.lang.String str12 = cGIARProvider11.toString();
        cGIARProvider11.setInterpolate(true);
        com.graphhopper.reader.dem.ElevationProvider elevationProvider16 = cGIARProvider11.setBaseURL("prepare.ch.edge.witness_search.min_max_settled_edges");
        com.graphhopper.reader.dem.MultiSourceElevationProvider multiSourceElevationProvider17 = new com.graphhopper.reader.dem.MultiSourceElevationProvider(elevationProvider10, elevationProvider16);
        com.graphhopper.reader.dem.MultiSourceElevationProvider multiSourceElevationProvider18 = new com.graphhopper.reader.dem.MultiSourceElevationProvider((com.graphhopper.reader.dem.ElevationProvider) multiSourceElevationProvider1, elevationProvider10);
        boolean boolean19 = multiSourceElevationProvider1.getInterpolate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cgiar" + "'", str3, "cgiar");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cgiar" + "'", str8, "cgiar");
        org.junit.Assert.assertNotNull(elevationProvider10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "cgiar" + "'", str12, "cgiar");
        org.junit.Assert.assertNotNull(elevationProvider16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        com.graphhopper.routing.util.DefaultFlagEncoderFactory defaultFlagEncoderFactory0 = new com.graphhopper.routing.util.DefaultFlagEncoderFactory();
        com.graphhopper.util.PMap pMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.FlagEncoder flagEncoder3 = defaultFlagEncoderFactory0.createFlagEncoder("bike2", pMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        com.graphhopper.reader.OSMTurnRelation.Type type4 = com.graphhopper.reader.OSMTurnRelation.Type.getRestrictionType("");
        com.graphhopper.reader.OSMTurnRelation oSMTurnRelation5 = new com.graphhopper.reader.OSMTurnRelation((long) (byte) 1, (long) (byte) 1, 10L, type4);
        java.util.List<java.lang.String> strList6 = oSMTurnRelation5.getVehicleTypesExcept();
        java.lang.String str7 = oSMTurnRelation5.getVehicleTypeRestricted();
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED + "'", type4.equals(com.graphhopper.reader.OSMTurnRelation.Type.UNSUPPORTED));
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        com.graphhopper.storage.SimpleFSLockFactory simpleFSLockFactory0 = new com.graphhopper.storage.SimpleFSLockFactory();
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        double double1 = com.graphhopper.routing.util.parsers.helpers.OSMValueExtractor.stringToTons("local");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        java.lang.String str0 = com.graphhopper.util.Constants.OS_ARCH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "amd64" + "'", str0, "amd64");
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        com.graphhopper.util.PMap pMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.MountainBikeFlagEncoder mountainBikeFlagEncoder1 = new com.graphhopper.routing.util.MountainBikeFlagEncoder(pMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        com.graphhopper.routing.SPTEntry sPTEntry3 = new com.graphhopper.routing.SPTEntry(1, 1687814340, (double) 10);
        com.graphhopper.routing.SPTEntry sPTEntry4 = sPTEntry3.clone();
        sPTEntry4.adjNode = 2;
        org.junit.Assert.assertNotNull(sPTEntry4);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        com.graphhopper.debatty.java.stringsimilarity.JaroWinkler jaroWinkler1 = new com.graphhopper.debatty.java.stringsimilarity.JaroWinkler((-6951166.6959488215d));
        double double4 = jaroWinkler1.similarity("road_class_link", "country");
        double double7 = jaroWinkler1.distance("prepare.ch.edge.witness_search.min_max_settled_edges", "local");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4317460358142853d + "'", double4 == 0.4317460358142853d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6871794760227203d + "'", double7 == 0.6871794760227203d);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        boolean boolean1 = com.graphhopper.routing.util.parsers.helpers.OSMValueExtractor.isInvalidValue("beeline");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        java.lang.String str0 = com.graphhopper.util.Constants.getMajorVersion();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "3.0" + "'", str0, "3.0");
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        int int4 = com.graphhopper.util.GHUtility.createEdgeKey((-4), 10, (int) (short) 100, true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 201 + "'", int4 == 201);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        com.graphhopper.routing.util.TestAlgoCollector.OneRun oneRun0 = new com.graphhopper.routing.util.TestAlgoCollector.OneRun();
        java.lang.String str1 = oneRun0.toString();
        // The following exception was thrown during execution in test generation
        try {
            oneRun0.setLocs(10, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        com.graphhopper.util.DistanceCalcEuclidean distanceCalcEuclidean0 = new com.graphhopper.util.DistanceCalcEuclidean();
        double double5 = distanceCalcEuclidean0.calcDist((double) (-1.0f), 2.0015086747773867E7d, 1.0d, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.shapes.BBox bBox9 = distanceCalcEuclidean0.createBBox((double) (byte) 0, 0.5868240888334652d, (-6951166.6959488215d));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported for the 2D Euclidean space");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0015086747773968E7d + "'", double5 == 2.0015086747773968E7d);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        com.graphhopper.util.PMap pMap0 = null;
        com.graphhopper.GraphHopperConfig graphHopperConfig1 = new com.graphhopper.GraphHopperConfig(pMap0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = graphHopperConfig1.getBool("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        com.graphhopper.GraphHopperConfig graphHopperConfig0 = new com.graphhopper.GraphHopperConfig();
        java.lang.String str3 = graphHopperConfig0.getString("cgiar", "PLANE_PROJ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PLANE_PROJ" + "'", str3, "PLANE_PROJ");
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.util.TraversalMode traversalMode2 = com.graphhopper.routing.util.TraversalMode.EDGE_BASED;
        com.graphhopper.routing.lm.PerfectApproximator perfectApproximator4 = new com.graphhopper.routing.lm.PerfectApproximator(graph0, weighting1, traversalMode2, true);
        double double5 = perfectApproximator4.getSlack();
        org.junit.Assert.assertTrue("'" + traversalMode2 + "' != '" + com.graphhopper.routing.util.TraversalMode.EDGE_BASED + "'", traversalMode2.equals(com.graphhopper.routing.util.TraversalMode.EDGE_BASED));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        com.graphhopper.util.PMap pMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.Car4WDFlagEncoder car4WDFlagEncoder1 = new com.graphhopper.routing.util.Car4WDFlagEncoder(pMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        int[] intArray1 = new int[] { 100 };
        long[] longArray3 = new long[] { 0L };
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = com.carrotsearch.hppc.IntLongHashMap.from(intArray1, longArray3);
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator5 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.EdgeIterator[] edgeIteratorArray6 = new com.graphhopper.util.EdgeIterator[] { disabledEdgeIterator5 };
        com.carrotsearch.hppc.IntObjectHashMap<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectHashMap7 = com.carrotsearch.hppc.IntObjectHashMap.from(intArray1, edgeIteratorArray6);
        java.util.Iterator<com.carrotsearch.hppc.cursors.IntObjectCursor<com.graphhopper.util.EdgeIterator>> edgeIteratorIntObjectCursorItor8 = edgeIteratorIntObjectHashMap7.iterator();
        com.carrotsearch.hppc.IntObjectAssociativeContainer<com.graphhopper.util.EdgeIterator> edgeIteratorIntObjectAssociativeContainer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = edgeIteratorIntObjectHashMap7.putAll(edgeIteratorIntObjectAssociativeContainer9);
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
        org.junit.Assert.assertNotNull(edgeIteratorIntObjectCursorItor8);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        com.graphhopper.reader.ReaderNode readerNode3 = new com.graphhopper.reader.ReaderNode((long) ' ', (double) 1L, (double) 3);
        java.lang.String str5 = readerNode3.getTag("prepare.ch.log_messages");
        com.graphhopper.reader.ReaderNode readerNode9 = new com.graphhopper.reader.ReaderNode((long) ' ', (double) 1L, (double) 3);
        boolean boolean11 = readerNode9.isType((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] { "wheelchair", "country", "cgiar", "", "3.0", "get_off_bike", "", "3.0", "road_class_link", "[]", "prepare.ch.log_messages", "", "prepare.ch.log_messages", "mtb" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.lang.String str29 = readerNode9.getFirstPriorityTag((java.util.List<java.lang.String>) strList27);
        java.lang.String str30 = readerNode3.getFirstPriorityTag((java.util.List<java.lang.String>) strList27);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        com.graphhopper.routing.ev.RoadClass roadClass0 = com.graphhopper.routing.ev.RoadClass.TRUNK;
        org.junit.Assert.assertTrue("'" + roadClass0 + "' != '" + com.graphhopper.routing.ev.RoadClass.TRUNK + "'", roadClass0.equals(com.graphhopper.routing.ev.RoadClass.TRUNK));
    }
}
