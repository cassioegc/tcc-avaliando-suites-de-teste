import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.storage.IntsRef intsRef3 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState9 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef3, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int10 = edgeIteratorState9.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue11 = com.graphhopper.routing.ev.Country.create();
        boolean boolean12 = countryEnumEncodedValue11.isStoreTwoDirections();
        com.graphhopper.routing.ev.Country country13 = edgeIteratorState9.getReverse(countryEnumEncodedValue11);
        com.graphhopper.storage.IntsRef intsRef16 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState22 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef16, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        boolean boolean23 = countryEnumEncodedValue11.equals((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.Country country24 = disabledEdgeIterator0.getReverse(countryEnumEncodedValue11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorState9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + country13 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country13.equals(com.graphhopper.routing.ev.Country.DEFAULT));
        org.junit.Assert.assertNotNull(edgeIteratorState22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        virtualEdgeIteratorState11.setUnfavored(true);
        com.graphhopper.storage.IntsRef intsRef20 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean21 = intsRef20.isEmpty();
        com.graphhopper.util.PointList pointList23 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState25 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef20, "hike_rating", pointList23, false);
        com.graphhopper.storage.IntsRef intsRef28 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState34 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef28, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int35 = edgeIteratorState34.getEdge();
        virtualEdgeIteratorState25.setReverseEdge(edgeIteratorState34);
        java.lang.String str37 = virtualEdgeIteratorState25.getName();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue38 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        double double39 = virtualEdgeIteratorState25.getReverse(decimalEncodedValue38);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState41 = virtualEdgeIteratorState11.set(decimalEncodedValue38, 35.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Call init before usage for EncodedValue max_axle_load|version=-1916217613|bits=7|index=0|shift=-1|store_both_directions=false");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hike_rating" + "'", str37, "hike_rating");
        org.junit.Assert.assertNotNull(decimalEncodedValue38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + Double.POSITIVE_INFINITY + "'", double39 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager5, false);
        java.util.List<com.graphhopper.storage.CHConfig> cHConfigList8 = graphHopperStorage7.getCHConfigs();
        com.graphhopper.routing.util.EncodingManager encodingManager9 = graphHopperStorage7.getEncodingManager();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue11 = encodingManager9.getStringEncodedValue("_network");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot find EncodedValue _network in collection: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(flagEncoderArray4);
        org.junit.Assert.assertNotNull(encodingManager5);
        org.junit.Assert.assertNotNull(cHConfigList8);
        org.junit.Assert.assertNotNull(encodingManager9);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
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
        java.lang.String str25 = path21.getDebugInfo();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
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
        com.graphhopper.routing.weighting.Weighting weighting24 = null;
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator25 = new com.graphhopper.routing.weighting.BeelineWeightApproximator(nodeAccess23, weighting24);
        // The following exception was thrown during execution in test generation
        try {
            nodeAccess23.ensureNode(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: The graph has not yet been initialized.");
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
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        com.graphhopper.util.DouglasPeucker douglasPeucker0 = new com.graphhopper.util.DouglasPeucker();
        com.graphhopper.util.PointList pointList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = douglasPeucker0.simplify(pointList1, (-3), 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
        java.lang.String str13 = rAMDirectory10.getLocation();
        com.graphhopper.storage.GraphBuilder graphBuilder14 = graphBuilder8.setDir((com.graphhopper.storage.Directory) rAMDirectory10);
        org.junit.Assert.assertNotNull(flagEncoderArray0);
        org.junit.Assert.assertNotNull(encodingManager1);
        org.junit.Assert.assertNotNull(graphBuilder4);
        org.junit.Assert.assertNotNull(cHConfigArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(graphBuilder8);
        org.junit.Assert.assertNotNull(directory11);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "prepare.ch.node.original_edge_count_weight/" + "'", str13, "prepare.ch.node.original_edge_count_weight/");
        org.junit.Assert.assertNotNull(graphBuilder14);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage0 = null;
        com.graphhopper.storage.RAMDirectory rAMDirectory2 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        rAMDirectory2.clear();
        com.graphhopper.routing.lm.LMConfig lMConfig4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.lm.LandmarkStorage landmarkStorage6 = new com.graphhopper.routing.lm.LandmarkStorage(graphHopperStorage0, (com.graphhopper.storage.Directory) rAMDirectory2, lMConfig4, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray0 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager1 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray0);
        com.graphhopper.storage.GraphBuilder graphBuilder2 = new com.graphhopper.storage.GraphBuilder(encodingManager1);
        java.util.List<com.graphhopper.storage.CHConfig> cHConfigList3 = null;
        com.graphhopper.storage.GraphBuilder graphBuilder4 = graphBuilder2.setCHConfigs(cHConfigList3);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.GraphHopperStorage graphHopperStorage5 = graphBuilder4.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(flagEncoderArray0);
        org.junit.Assert.assertNotNull(encodingManager1);
        org.junit.Assert.assertNotNull(graphBuilder4);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        javax.xml.stream.XMLStreamReader xMLStreamReader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.ReaderNode readerNode2 = com.graphhopper.reader.osm.OSMXMLHelper.createNode((long) 'a', xMLStreamReader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser oSMHazmatTunnelParser0 = new com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray1 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager2 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray1);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue3 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue4 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray5 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue3, decimalEncodedValue4 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList6 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList6, encodedValueArray5);
        oSMHazmatTunnelParser0.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager2, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList6);
        java.lang.String str9 = encodingManager2.toFlagEncodersAsString();
        org.junit.Assert.assertNotNull(flagEncoderArray1);
        org.junit.Assert.assertNotNull(encodingManager2);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue3);
        org.junit.Assert.assertNotNull(decimalEncodedValue4);
        org.junit.Assert.assertNotNull(encodedValueArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue1 = com.graphhopper.routing.ev.MaxLength.create();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState4 = disabledEdgeIterator0.set(decimalEncodedValue1, 0.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(decimalEncodedValue1);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        com.graphhopper.util.PMap pMap0 = null;
        com.graphhopper.GraphHopperConfig graphHopperConfig1 = new com.graphhopper.GraphHopperConfig(pMap0);
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile3 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str4 = customProfile3.toString();
        com.graphhopper.config.Profile profile7 = customProfile3.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        int int8 = profile7.getVersion();
        com.graphhopper.config.Profile profile10 = profile7.setVehicle("1111111111");
        com.graphhopper.util.PMap pMap11 = profile7.getHints();
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile13 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str14 = customProfile13.toString();
        com.graphhopper.config.Profile profile17 = customProfile13.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        int int18 = profile17.getVersion();
        com.graphhopper.config.Profile profile20 = profile17.setVehicle("1111111111");
        com.graphhopper.util.PMap pMap21 = profile17.getHints();
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile23 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str24 = customProfile23.toString();
        com.graphhopper.config.Profile profile27 = customProfile23.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile29 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str30 = customProfile29.toString();
        com.graphhopper.config.Profile profile33 = customProfile29.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        int int34 = profile33.getVersion();
        com.graphhopper.config.Profile profile36 = profile33.setWeighting("horse_rating");
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile38 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str39 = customProfile38.toString();
        com.graphhopper.config.Profile profile42 = customProfile38.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile44 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str45 = customProfile44.toString();
        com.graphhopper.config.Profile profile48 = customProfile44.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        int int49 = profile48.getVersion();
        com.graphhopper.config.Profile profile51 = profile48.setVehicle("1111111111");
        com.graphhopper.util.PMap pMap52 = profile48.getHints();
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile54 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str55 = customProfile54.toString();
        com.graphhopper.config.Profile profile58 = customProfile54.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile60 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str61 = customProfile60.toString();
        com.graphhopper.config.Profile profile64 = customProfile60.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        int int65 = profile64.getVersion();
        com.graphhopper.config.Profile profile67 = profile64.setWeighting("horse_rating");
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile69 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str70 = customProfile69.toString();
        com.graphhopper.config.Profile profile73 = customProfile69.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        int int74 = profile73.getVersion();
        com.graphhopper.config.Profile profile76 = profile73.setVehicle("1111111111");
        com.graphhopper.util.PMap pMap77 = profile73.getHints();
        com.graphhopper.config.Profile[] profileArray78 = new com.graphhopper.config.Profile[] { profile7, profile17, profile27, profile36, customProfile38, profile48, profile58, profile64, profile73 };
        java.util.ArrayList<com.graphhopper.config.Profile> profileList79 = new java.util.ArrayList<com.graphhopper.config.Profile>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.config.Profile>) profileList79, profileArray78);
        com.graphhopper.GraphHopperConfig graphHopperConfig81 = graphHopperConfig1.setProfiles((java.util.List<com.graphhopper.config.Profile>) profileList79);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str4, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1909399913) + "'", int8 == (-1909399913));
        org.junit.Assert.assertNotNull(profile10);
        org.junit.Assert.assertNotNull(pMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str14, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1909399913) + "'", int18 == (-1909399913));
        org.junit.Assert.assertNotNull(profile20);
        org.junit.Assert.assertNotNull(pMap21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str24, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str30, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1909399913) + "'", int34 == (-1909399913));
        org.junit.Assert.assertNotNull(profile36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str39, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str45, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1909399913) + "'", int49 == (-1909399913));
        org.junit.Assert.assertNotNull(profile51);
        org.junit.Assert.assertNotNull(pMap52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str55, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str61, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1909399913) + "'", int65 == (-1909399913));
        org.junit.Assert.assertNotNull(profile67);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str70, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1909399913) + "'", int74 == (-1909399913));
        org.junit.Assert.assertNotNull(profile76);
        org.junit.Assert.assertNotNull(pMap77);
        org.junit.Assert.assertNotNull(profileArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(graphHopperConfig81);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.SimpleBooleanEncodedValue simpleBooleanEncodedValue2 = new com.graphhopper.routing.ev.SimpleBooleanEncodedValue("srtm");
        com.graphhopper.storage.IntsRef intsRef5 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean6 = intsRef5.isEmpty();
        com.graphhopper.storage.IntsRef intsRef8 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int9 = intsRef5.compareTo(intsRef8);
        boolean boolean10 = intsRef5.isValid();
        boolean boolean11 = simpleBooleanEncodedValue2.getBool(true, intsRef5);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState13 = disabledEdgeIterator0.set((com.graphhopper.routing.ev.IntEncodedValue) simpleBooleanEncodedValue2, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        com.graphhopper.reader.dem.SRTMProvider sRTMProvider1 = new com.graphhopper.reader.dem.SRTMProvider("prepare.ch.updates.lazy");
        sRTMProvider1.release();
        double double5 = sRTMProvider1.getEle(Double.NaN, (double) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser oSMHazmatTunnelParser0 = new com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray1 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager2 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray1);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue3 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue4 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray5 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue3, decimalEncodedValue4 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList6 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList6, encodedValueArray5);
        oSMHazmatTunnelParser0.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager2, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList6);
        java.util.List<com.graphhopper.routing.ev.EncodedValue> encodedValueList9 = encodingManager2.getEncodedValues();
        java.util.List<com.graphhopper.routing.util.FlagEncoder> flagEncoderList10 = encodingManager2.fetchEdgeEncoders();
        com.graphhopper.coll.MinHeapWithUpdate minHeapWithUpdate12 = new com.graphhopper.coll.MinHeapWithUpdate(21);
        boolean boolean13 = minHeapWithUpdate12.isEmpty();
        boolean boolean14 = encodingManager2.equals((java.lang.Object) boolean13);
        org.junit.Assert.assertNotNull(flagEncoderArray1);
        org.junit.Assert.assertNotNull(encodingManager2);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue3);
        org.junit.Assert.assertNotNull(decimalEncodedValue4);
        org.junit.Assert.assertNotNull(encodedValueArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(encodedValueList9);
        org.junit.Assert.assertNotNull(flagEncoderList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        com.graphhopper.util.shapes.BBox bBox4 = new com.graphhopper.util.shapes.BBox((double) 0L, (double) (short) 0, (double) (byte) 1, 100.0d);
        double double5 = bBox4.minLat;
        boolean boolean8 = bBox4.contains(0.0d, 100.0d);
        boolean boolean9 = bBox4.hasElevation();
        double double10 = bBox4.maxLat;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        com.graphhopper.routing.ev.MaxSpeed maxSpeed0 = new com.graphhopper.routing.ev.MaxSpeed();
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile1 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str2 = customProfile1.toString();
        com.graphhopper.config.Profile profile5 = customProfile1.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        int int6 = profile5.getVersion();
        com.graphhopper.config.Profile profile8 = profile5.setVehicle("1111111111");
        com.graphhopper.util.PMap pMap9 = profile5.getHints();
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile11 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str12 = customProfile11.toString();
        com.graphhopper.config.Profile profile15 = customProfile11.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        int int16 = profile15.getVersion();
        com.graphhopper.config.Profile profile18 = profile15.setVehicle("1111111111");
        com.graphhopper.util.PMap pMap19 = profile15.getHints();
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile21 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str22 = customProfile21.toString();
        com.graphhopper.config.Profile profile25 = customProfile21.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.util.PMap pMap26 = profile25.getHints();
        com.graphhopper.routing.ch.CHRoutingAlgorithmFactory cHRoutingAlgorithmFactory27 = null;
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile29 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str30 = customProfile29.toString();
        com.graphhopper.config.Profile profile33 = customProfile29.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.util.PMap pMap34 = profile33.getHints();
        com.graphhopper.routing.CHPathCalculator cHPathCalculator35 = new com.graphhopper.routing.CHPathCalculator(cHRoutingAlgorithmFactory27, pMap34);
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile37 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str38 = customProfile37.toString();
        com.graphhopper.config.Profile profile41 = customProfile37.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.util.PMap pMap42 = profile41.getHints();
        com.graphhopper.routing.ch.CHRoutingAlgorithmFactory cHRoutingAlgorithmFactory43 = null;
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile45 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str46 = customProfile45.toString();
        com.graphhopper.config.Profile profile49 = customProfile45.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.util.PMap pMap50 = profile49.getHints();
        com.graphhopper.routing.CHPathCalculator cHPathCalculator51 = new com.graphhopper.routing.CHPathCalculator(cHRoutingAlgorithmFactory43, pMap50);
        com.graphhopper.util.PMap[] pMapArray52 = new com.graphhopper.util.PMap[] { pMap9, pMap19, pMap26, pMap34, pMap42, pMap50 };
        int[] intArray53 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet54 = com.graphhopper.coll.GHIntHashSet.from(intArray53);
        // The following exception was thrown during execution in test generation
        try {
            com.carrotsearch.hppc.ObjectIntHashMap<com.graphhopper.util.PMap> pMapObjectIntHashMap55 = com.carrotsearch.hppc.ObjectIntHashMap.from(pMapArray52, intArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arrays of keys and values must have an identical length.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str2, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1909399913) + "'", int6 == (-1909399913));
        org.junit.Assert.assertNotNull(profile8);
        org.junit.Assert.assertNotNull(pMap9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str12, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1909399913) + "'", int16 == (-1909399913));
        org.junit.Assert.assertNotNull(profile18);
        org.junit.Assert.assertNotNull(pMap19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str22, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile25);
        org.junit.Assert.assertNotNull(pMap26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str30, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile33);
        org.junit.Assert.assertNotNull(pMap34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str38, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile41);
        org.junit.Assert.assertNotNull(pMap42);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str46, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile49);
        org.junit.Assert.assertNotNull(pMap50);
        org.junit.Assert.assertNotNull(pMapArray52);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[]");
        org.junit.Assert.assertNotNull(intHashSet54);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType0 = com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH_DAY;
        org.junit.Assert.assertTrue("'" + parseType0 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH_DAY + "'", parseType0.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH_DAY));
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        com.graphhopper.util.PointList pointList0 = null;
        com.graphhopper.storage.NodeAccess nodeAccess2 = null;
        com.graphhopper.routing.weighting.Weighting weighting3 = null;
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator4 = new com.graphhopper.routing.weighting.BeelineWeightApproximator(nodeAccess2, weighting3);
        com.graphhopper.util.DistanceCalcEarth distanceCalcEarth5 = new com.graphhopper.util.DistanceCalcEarth();
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator6 = beelineWeightApproximator4.setDistanceCalc((com.graphhopper.util.DistanceCalc) distanceCalcEarth5);
        com.graphhopper.reader.dem.MultiSourceElevationProvider multiSourceElevationProvider8 = new com.graphhopper.reader.dem.MultiSourceElevationProvider("prepare.ch.updates.neighbor");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.PointList pointList9 = com.graphhopper.reader.dem.EdgeSampling.sample(pointList0, (double) 35, (com.graphhopper.util.DistanceCalc) distanceCalcEarth5, (com.graphhopper.reader.dem.ElevationProvider) multiSourceElevationProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(beelineWeightApproximator6);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        com.graphhopper.routing.util.FlagEncoder flagEncoder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.graphhopper.routing.util.EncodingManager.getKey(flagEncoder0, "1111111111111111111111111111111111111111111111111111111111111100");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        com.graphhopper.routing.util.EncodingManager.Builder builder0 = com.graphhopper.routing.util.EncodingManager.start();
        com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser oSMFootNetworkTagParser1 = new com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser();
        com.graphhopper.routing.util.EncodingManager.Builder builder2 = builder0.addRelationTagParser((com.graphhopper.routing.util.parsers.RelationTagParser) oSMFootNetworkTagParser1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        com.graphhopper.routing.ev.MaxLength maxLength0 = new com.graphhopper.routing.ev.MaxLength();
        com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder spatialRuleLookupBuilder1 = new com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder();
        com.graphhopper.coll.MapEntry<com.graphhopper.routing.ev.MaxLength, com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder> maxLengthMapEntry2 = new com.graphhopper.coll.MapEntry<com.graphhopper.routing.ev.MaxLength, com.graphhopper.routing.util.spatialrules.SpatialRuleLookupBuilder>(maxLength0, spatialRuleLookupBuilder1);
        java.lang.String str3 = maxLengthMapEntry2.toString();
        com.graphhopper.routing.util.spatialrules.SpatialRuleLookup spatialRuleLookup4 = com.graphhopper.routing.util.spatialrules.SpatialRuleLookup.EMPTY;
        boolean boolean5 = maxLengthMapEntry2.equals((java.lang.Object) spatialRuleLookup4);
        com.graphhopper.routing.util.spatialrules.SpatialRuleSet spatialRuleSet8 = spatialRuleLookup4.lookupRules(150.0d, (double) 200);
        org.junit.Assert.assertNotNull(spatialRuleLookup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(spatialRuleSet8);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        com.graphhopper.routing.ev.RouteNetwork routeNetwork0 = com.graphhopper.routing.ev.RouteNetwork.OTHER;
        org.junit.Assert.assertTrue("'" + routeNetwork0 + "' != '" + com.graphhopper.routing.ev.RouteNetwork.OTHER + "'", routeNetwork0.equals(com.graphhopper.routing.ev.RouteNetwork.OTHER));
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl0 = new com.graphhopper.coll.GHBitSetImpl();
        com.graphhopper.coll.GHTBitSet gHTBitSet2 = new com.graphhopper.coll.GHTBitSet(0);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl4 = new com.graphhopper.coll.GHBitSetImpl((int) (short) 100);
        com.graphhopper.coll.GHBitSet gHBitSet5 = gHTBitSet2.copyTo((com.graphhopper.coll.GHBitSet) gHBitSetImpl4);
        com.graphhopper.coll.GHBitSet gHBitSet6 = gHBitSetImpl0.copyTo(gHBitSet5);
        boolean boolean8 = gHBitSet5.contains((int) (short) 10);
        org.junit.Assert.assertNotNull(gHBitSet5);
        org.junit.Assert.assertNotNull(gHBitSet6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        com.graphhopper.reader.dem.CGIARProvider cGIARProvider0 = new com.graphhopper.reader.dem.CGIARProvider();
        cGIARProvider0.release();
        cGIARProvider0.setInterpolate(false);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.LITTLE;
        long long3 = bitUtil0.combineIntsToLong(10, (int) (byte) 1);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10 };
        java.lang.String str9 = bitUtil0.toBitString(byteArray8);
        byte[] byteArray11 = bitUtil0.fromShort((short) 100);
        byte[] byteArray13 = bitUtil0.fromDouble((double) 10);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl15 = new com.graphhopper.coll.GHBitSetImpl((int) (short) 100);
        byte[] byteArray16 = gHBitSetImpl15.toByteArray();
        // The following exception was thrown during execution in test generation
        try {
            bitUtil0.fromShort(byteArray16, (short) 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4294967306L + "'", long3 == 4294967306L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 10, 10, 10]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "00001010000010100000101001100100" + "'", str9, "00001010000010100000101001100100");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 0, 0, 0, 0, 0, 36, 64]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap1 = new com.graphhopper.coll.GHIntLongHashMap((int) (byte) 1);
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap3 = new com.graphhopper.coll.GHIntLongHashMap((int) (byte) 1);
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = gHIntLongHashMap3.clone();
        int int5 = gHIntLongHashMap1.putAll((com.carrotsearch.hppc.IntLongAssociativeContainer) gHIntLongHashMap3);
        int[] intArray6 = gHIntLongHashMap1.keys;
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0]");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager5, false);
        com.graphhopper.storage.RoutingCHGraph routingCHGraph9 = graphHopperStorage7.getRoutingCHGraph("bike$turn_cost");
        com.graphhopper.routing.weighting.Weighting weighting10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ch.CHPreparationGraph.TurnCostFunction turnCostFunction11 = com.graphhopper.routing.ch.CHPreparationGraph.buildTurnCostFunctionFromTurnCostStorage((com.graphhopper.storage.Graph) graphHopperStorage7, weighting10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(flagEncoderArray4);
        org.junit.Assert.assertNotNull(encodingManager5);
        org.junit.Assert.assertNull(routingCHGraph9);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
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
        com.graphhopper.routing.util.EncodingManager encodingManager36 = graphHopperStorage7.getEncodingManager();
        java.util.List<java.lang.String> strList37 = graphHopperStorage7.getCHGraphNames();
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
        org.junit.Assert.assertNotNull(encodingManager36);
        org.junit.Assert.assertNotNull(strList37);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        com.graphhopper.storage.index.Snap.Position position0 = com.graphhopper.storage.index.Snap.Position.PILLAR;
        org.junit.Assert.assertTrue("'" + position0 + "' != '" + com.graphhopper.storage.index.Snap.Position.PILLAR + "'", position0.equals(com.graphhopper.storage.index.Snap.Position.PILLAR));
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        long[] longArray5 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet6 = com.carrotsearch.hppc.LongHashSet.from(longArray5);
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap8 = new com.graphhopper.coll.GHLongLongHashMap(1);
        java.util.Spliterator<com.carrotsearch.hppc.cursors.LongLongCursor> longLongCursorSpliterator9 = gHLongLongHashMap8.spliterator();
        com.carrotsearch.hppc.LongLongHashMap.KeysContainer keysContainer10 = gHLongLongHashMap8.keys();
        int int11 = longHashSet6.retainAll((com.carrotsearch.hppc.LongLookupContainer) keysContainer10);
        long[] longArray12 = new long[] {};
        int int13 = longHashSet6.addAll(longArray12);
        java.util.Iterator<com.carrotsearch.hppc.cursors.LongCursor> longCursorItor14 = longHashSet6.iterator();
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet6);
        org.junit.Assert.assertNotNull(longLongCursorSpliterator9);
        org.junit.Assert.assertNotNull(keysContainer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(longCursorItor14);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        com.graphhopper.reader.ReaderNode readerNode3 = new com.graphhopper.reader.ReaderNode((long) 200, (double) 0.0f, (double) 3L);
        java.lang.String str4 = readerNode3.toString();
        double double5 = readerNode3.getLat();
        double double6 = readerNode3.getLat();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Node: 200 lat=0.0 lon=3.0" + "'", str4, "Node: 200 lat=0.0 lon=3.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        com.graphhopper.storage.RoutingCHGraph routingCHGraph0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.AlternativeRouteCH alternativeRouteCH24 = new com.graphhopper.routing.AlternativeRouteCH(routingCHGraph0, pMap20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
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
        com.graphhopper.routing.ev.EncodedValueLookup encodedValueLookup19 = null;
        com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser oSMHazmatTunnelParser20 = new com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray21 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager22 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray21);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue23 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue24 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray25 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue23, decimalEncodedValue24 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList26 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList26, encodedValueArray25);
        oSMHazmatTunnelParser20.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager22, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList26);
        oSMRoadEnvironmentParser0.createEncodedValues(encodedValueLookup19, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList26);
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
        org.junit.Assert.assertNotNull(flagEncoderArray21);
        org.junit.Assert.assertNotNull(encodingManager22);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue23);
        org.junit.Assert.assertNotNull(decimalEncodedValue24);
        org.junit.Assert.assertNotNull(encodedValueArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        com.graphhopper.routing.ev.Surface surface1 = com.graphhopper.routing.ev.Surface.find("00001010000010100000101001100100");
        org.junit.Assert.assertTrue("'" + surface1 + "' != '" + com.graphhopper.routing.ev.Surface.OTHER + "'", surface1.equals(com.graphhopper.routing.ev.Surface.OTHER));
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.storage.DAType dAType3 = rAMDirectory1.getDefaultType();
        com.graphhopper.storage.RAMDirectory rAMDirectory5 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory6 = rAMDirectory5.create();
        java.nio.ByteOrder byteOrder7 = rAMDirectory5.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess9 = rAMDirectory5.find("1111111111111111111111111111111111111111111111111111111111111100");
        // The following exception was thrown during execution in test generation
        try {
            rAMDirectory1.remove(dataAccess9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Couldn't remove DataAccess: 1111111111111111111111111111111111111111111111111111111111111100");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(dAType3);
        org.junit.Assert.assertNotNull(directory6);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertNotNull(dataAccess9);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        com.graphhopper.reader.dem.SRTMGL1Provider sRTMGL1Provider0 = new com.graphhopper.reader.dem.SRTMGL1Provider();
        sRTMGL1Provider0.setAutoRemoveTemporaryFiles(false);
        boolean boolean3 = sRTMGL1Provider0.getInterpolate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        com.graphhopper.routing.weighting.Weighting weighting0 = null;
        com.graphhopper.storage.IntsRef intsRef7 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean8 = intsRef7.isEmpty();
        com.graphhopper.util.PointList pointList10 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState12 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef7, "hike_rating", pointList10, false);
        virtualEdgeIteratorState12.setUnfavored(true);
        int int15 = virtualEdgeIteratorState12.getOriginalEdgeKey();
        virtualEdgeIteratorState12.setUnfavored(true);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = com.graphhopper.util.GHUtility.calcWeightWithTurnWeight(weighting0, (com.graphhopper.util.EdgeIteratorState) virtualEdgeIteratorState12, true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1048576 + "'", int15 == 1048576);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        com.graphhopper.routing.ev.FootNetwork footNetwork0 = new com.graphhopper.routing.ev.FootNetwork();
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap1 = new com.graphhopper.coll.GHLongLongHashMap(1);
        java.util.Spliterator<com.carrotsearch.hppc.cursors.LongLongCursor> longLongCursorSpliterator2 = gHLongLongHashMap1.spliterator();
        gHLongLongHashMap1.ensureCapacity((int) (byte) 10);
        long long7 = gHLongLongHashMap1.getOrDefault((long) 3, (long) (-3));
        org.junit.Assert.assertNotNull(longLongCursorSpliterator2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-3L) + "'", long7 == (-3L));
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        int int0 = com.graphhopper.util.Constants.VERSION_LOCATION_IDX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        com.graphhopper.routing.util.FlagEncoder flagEncoder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.graphhopper.routing.util.EncodingManager.getKey(flagEncoder0, "Node: 200 lat=0.0 lon=3.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph> cHPreparationGraphGHLongObjectHashMap0 = new com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph>();
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph4 = com.graphhopper.routing.ch.CHPreparationGraph.nodeBased(0, (int) (short) 100);
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph5 = cHPreparationGraphGHLongObjectHashMap0.put(0L, cHPreparationGraph4);
        com.carrotsearch.hppc.LongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph> cHPreparationGraphLongObjectHashMap6 = cHPreparationGraphGHLongObjectHashMap0.clone();
        org.junit.Assert.assertNotNull(cHPreparationGraph4);
        org.junit.Assert.assertNull(cHPreparationGraph5);
        org.junit.Assert.assertNotNull(cHPreparationGraphLongObjectHashMap6);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap1 = new com.graphhopper.coll.GHLongLongHashMap(1);
        long[] longArray7 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet8 = com.carrotsearch.hppc.LongHashSet.from(longArray7);
        gHLongLongHashMap1.keys = longArray7;
        gHLongLongHashMap1.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = 0L; // flaky: gHLongLongHashMap1.indexGet((int) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(longHashSet8);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        com.graphhopper.reader.ReaderNode readerNode3 = new com.graphhopper.reader.ReaderNode((long) 200, (double) 0.0f, (double) 3L);
        java.lang.String str4 = readerNode3.toString();
        long long5 = readerNode3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Node: 200 lat=0.0 lon=3.0" + "'", str4, "Node: 200 lat=0.0 lon=3.0");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 200L + "'", long5 == 200L);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
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
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState29 = virtualEdgeIteratorState11.detach(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
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
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        java.lang.String str0 = com.graphhopper.routing.ev.GetOffBike.KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "get_off_bike" + "'", str0, "get_off_bike");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.LITTLE;
        long long3 = bitUtil0.combineIntsToLong(10, (int) (byte) 1);
        java.lang.String str6 = bitUtil0.toLastBitString((long) (short) -1, (int) (byte) 10);
        long long9 = bitUtil0.toLong(0, 0);
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4294967306L + "'", long3 == 4294967306L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111" + "'", str6, "1111111111");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        com.graphhopper.routing.util.spatialrules.CountriesSpatialRuleFactory countriesSpatialRuleFactory0 = new com.graphhopper.routing.util.spatialrules.CountriesSpatialRuleFactory();
        org.locationtech.jts.geom.Polygon[] polygonArray2 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList3 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList3, polygonArray2);
        com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule germanySpatialRule5 = new com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList3);
        java.util.List<org.locationtech.jts.geom.Polygon> polygonList6 = germanySpatialRule5.getBorders();
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule7 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule(polygonList6);
        com.graphhopper.routing.util.spatialrules.SpatialRule spatialRule8 = countriesSpatialRuleFactory0.createSpatialRule("srtm", polygonList6);
        com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule germanySpatialRule9 = new com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule(polygonList6);
        com.graphhopper.routing.ev.RoadClass roadClass10 = com.graphhopper.routing.ev.RoadClass.ROAD;
        com.graphhopper.routing.util.TransportationMode transportationMode11 = com.graphhopper.routing.util.TransportationMode.OTHER;
        double double13 = germanySpatialRule9.getMaxSpeed(roadClass10, transportationMode11, (double) 10L);
        org.junit.Assert.assertNotNull(polygonArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(polygonList6);
        org.junit.Assert.assertNull(spatialRule8);
        org.junit.Assert.assertTrue("'" + roadClass10 + "' != '" + com.graphhopper.routing.ev.RoadClass.ROAD + "'", roadClass10.equals(com.graphhopper.routing.ev.RoadClass.ROAD));
        org.junit.Assert.assertTrue("'" + transportationMode11 + "' != '" + com.graphhopper.routing.util.TransportationMode.OTHER + "'", transportationMode11.equals(com.graphhopper.routing.util.TransportationMode.OTHER));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        com.graphhopper.storage.IntsRef intsRef2 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState8 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef2, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int9 = edgeIteratorState8.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue10 = com.graphhopper.routing.ev.Country.create();
        boolean boolean11 = countryEnumEncodedValue10.isStoreTwoDirections();
        com.graphhopper.routing.ev.Country country12 = edgeIteratorState8.getReverse(countryEnumEncodedValue10);
        com.graphhopper.storage.IntsRef intsRef15 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState21 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef15, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        boolean boolean22 = countryEnumEncodedValue10.equals((java.lang.Object) (byte) 0);
        boolean boolean24 = countryEnumEncodedValue10.equals((java.lang.Object) "1.8");
        org.junit.Assert.assertNotNull(edgeIteratorState8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + country12 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country12.equals(com.graphhopper.routing.ev.Country.DEFAULT));
        org.junit.Assert.assertNotNull(edgeIteratorState21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType0 = com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH;
        java.util.Calendar calendar1 = null;
        com.graphhopper.reader.osm.conditional.ParsedCalendar parsedCalendar2 = new com.graphhopper.reader.osm.conditional.ParsedCalendar(parseType0, calendar1);
        boolean boolean3 = parsedCalendar2.isDayOnly();
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType4 = parsedCalendar2.parseType;
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType5 = parsedCalendar2.parseType;
        org.junit.Assert.assertTrue("'" + parseType0 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH + "'", parseType0.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + parseType4 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH + "'", parseType4.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH));
        org.junit.Assert.assertTrue("'" + parseType5 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH + "'", parseType5.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH));
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap1 = new com.graphhopper.coll.GHIntLongHashMap((int) (byte) 1);
        boolean boolean3 = gHIntLongHashMap1.indexExists((int) (byte) 1);
        long long5 = gHIntLongHashMap1.remove((int) (short) -1);
        long long8 = gHIntLongHashMap1.addTo(2, (long) 5);
        gHIntLongHashMap1.ensureCapacity((-1909399913));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5L + "'", long8 == 5L);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        java.util.Random random0 = null;
        com.graphhopper.routing.util.tour.MultiPointTour multiPointTour4 = new com.graphhopper.routing.util.tour.MultiPointTour(random0, (double) (byte) -1, (int) 'a', (double) (byte) -1);
        int int5 = multiPointTour4.getNumberOfGeneratedPoints();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap1 = new com.graphhopper.coll.GHLongLongHashMap(1);
        long long3 = gHLongLongHashMap1.remove((long) 200);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.UnsignedDecimalEncodedValue unsignedDecimalEncodedValue6 = new com.graphhopper.routing.ev.UnsignedDecimalEncodedValue("prepare.ch.edge.witness_search.sigma_factor", 100, (double) (-3), (double) 1.0f, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue name wasn't valid: prepare.ch.edge.witness_search.sigma_factor. Use lower case letters, underscore and numbers only.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.LITTLE;
        long long3 = bitUtil0.combineIntsToLong(10, (int) (byte) 1);
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bitUtil0.toInt(byteArray9, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 203");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4294967306L + "'", long3 == 4294967306L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, -1, 0, 1, 100]");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap1 = new com.graphhopper.coll.GHLongLongHashMap(1);
        gHLongLongHashMap1.ensureCapacity((-2));
        com.carrotsearch.hppc.LongCollection longCollection4 = gHLongLongHashMap1.values();
        org.junit.Assert.assertNotNull(longCollection4);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        java.lang.String str0 = com.graphhopper.routing.ch.CHParameters.EDGE_QUOTIENT_WEIGHT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "prepare.ch.edge.edge_quotient_weight" + "'", str0, "prepare.ch.edge.edge_quotient_weight");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap1 = new com.graphhopper.coll.GHIntLongHashMap((int) (byte) 1);
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap2 = gHIntLongHashMap1.clone();
        com.carrotsearch.hppc.IntArrayList intArrayList5 = com.graphhopper.util.ArrayUtil.constant((-2), 10);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = gHIntLongHashMap1.removeAll((com.carrotsearch.hppc.IntContainer) intArrayList5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLongHashMap2);
        org.junit.Assert.assertNotNull(intArrayList5);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        boolean boolean1 = com.graphhopper.routing.util.parsers.helpers.OSMValueExtractor.isInvalidValue("prepare.ch.updates.periodic");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        com.graphhopper.routing.ev.Surface surface0 = com.graphhopper.routing.ev.Surface.MISSING;
        org.junit.Assert.assertTrue("'" + surface0 + "' != '" + com.graphhopper.routing.ev.Surface.MISSING + "'", surface0.equals(com.graphhopper.routing.ev.Surface.MISSING));
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        java.util.List<org.locationtech.jts.geom.Polygon> polygonList0 = null;
        com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule germanySpatialRule1 = new com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule(polygonList0);
        int int2 = germanySpatialRule1.getPriority();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        com.graphhopper.coll.GHLongIntBTree gHLongIntBTree1 = new com.graphhopper.coll.GHLongIntBTree((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = gHLongIntBTree1.put((-1L), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal key -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        com.graphhopper.storage.NodeAccess nodeAccess0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator2 = new com.graphhopper.routing.weighting.BeelineWeightApproximator(nodeAccess0, weighting1);
        double double3 = beelineWeightApproximator2.getSlack();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("prepare.ch.node.original_edge_count_weight");
        dataAccess5.close();
        dataAccess5.close();
        // The following exception was thrown during execution in test generation
        try {
            dataAccess5.setHeader((int) (short) 100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 25");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        com.carrotsearch.hppc.IntArrayList intArrayList2 = com.graphhopper.util.ArrayUtil.rangeClosed((int) (byte) 1, 11);
        com.carrotsearch.hppc.IntArrayList intArrayList3 = com.graphhopper.util.ArrayUtil.reverse(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        com.graphhopper.routing.util.EncodingManager.AcceptWay acceptWay0 = new com.graphhopper.routing.util.EncodingManager.AcceptWay();
        boolean boolean1 = acceptWay0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue1 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser2 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue1);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState4 = disabledEdgeIterator0.setReverse(decimalEncodedValue1, (double) 3L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(decimalEncodedValue1);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        com.carrotsearch.hppc.HashOrderMixingStrategy hashOrderMixingStrategy2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ev.FootNetwork> footNetworkGHLongObjectHashMap3 = new com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ev.FootNetwork>(2, (double) '#', hashOrderMixingStrategy2);
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.hppc.BufferAllocationException; message: The load factor should be in range [0.01, 0.99]: 35.000000");
        } catch (com.carrotsearch.hppc.BufferAllocationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue2 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.util.details.IntDetails intDetails3 = new com.graphhopper.util.details.IntDetails("foot", (com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue2);
        com.graphhopper.routing.ev.Country country4 = com.graphhopper.routing.ev.Country.DEU;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState5 = disabledEdgeIterator0.set(countryEnumEncodedValue2, country4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(countryEnumEncodedValue2);
        org.junit.Assert.assertTrue("'" + country4 + "' != '" + com.graphhopper.routing.ev.Country.DEU + "'", country4.equals(com.graphhopper.routing.ev.Country.DEU));
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType0 = com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH;
        org.junit.Assert.assertTrue("'" + parseType0 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH + "'", parseType0.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.YEAR_MONTH));
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = disabledEdgeIterator0.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
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
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue26 = null;
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter27 = com.graphhopper.routing.util.DefaultEdgeFilter.allEdges(booleanEncodedValue26);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             com.graphhopper.util.GHUtility.printInfo((com.graphhopper.storage.Graph) graphHopperStorage20, 11, 11, (com.graphhopper.routing.util.EdgeFilter) defaultEdgeFilter27);
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
        org.junit.Assert.assertNotNull(encodingManager22);
        org.junit.Assert.assertNotNull(nodeAccess23);
        org.junit.Assert.assertNotNull(defaultEdgeFilter27);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        com.graphhopper.routing.weighting.Weighting weighting24 = null;
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator25 = new com.graphhopper.routing.weighting.BeelineWeightApproximator(nodeAccess23, weighting24);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = 0.0; // flaky: nodeAccess23.getLat((int) (short) 100);
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
        org.junit.Assert.assertNotNull(encodingManager22);
        org.junit.Assert.assertNotNull(nodeAccess23);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        com.graphhopper.storage.IntsRef intsRef2 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState8 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef2, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue9 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        double double10 = edgeIteratorState8.getReverse(decimalEncodedValue9);
        int int11 = edgeIteratorState8.getAdjNode();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue13 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        com.graphhopper.util.details.DecimalDetails decimalDetails16 = new com.graphhopper.util.details.DecimalDetails("prepare.ch.log_messages", decimalEncodedValue13, "srtm$turn_cost", (double) 35.0f);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState18 = edgeIteratorState8.setReverse(decimalEncodedValue13, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorState8);
        org.junit.Assert.assertNotNull(decimalEncodedValue9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(decimalEncodedValue13);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        java.util.Random random1 = null;
        com.carrotsearch.hppc.IntArrayList intArrayList2 = com.graphhopper.util.ArrayUtil.permutation((int) (short) 1, random1);
        com.graphhopper.coll.GHIntHashSet gHIntHashSet3 = new com.graphhopper.coll.GHIntHashSet((com.carrotsearch.hppc.IntContainer) intArrayList2);
        com.carrotsearch.hppc.IntIndexedContainer intIndexedContainer4 = com.graphhopper.util.ArrayUtil.withoutConsecutiveDuplicates((com.carrotsearch.hppc.IntIndexedContainer) intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intIndexedContainer4);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        com.graphhopper.routing.util.FlagEncoder flagEncoder0 = null;
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile2 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str3 = customProfile2.toString();
        com.graphhopper.config.Profile profile6 = customProfile2.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        int int7 = profile6.getVersion();
        com.graphhopper.config.Profile profile9 = profile6.setVehicle("1111111111");
        com.graphhopper.util.PMap pMap10 = profile6.getHints();
        com.graphhopper.routing.weighting.TurnCostProvider turnCostProvider11 = com.graphhopper.routing.weighting.TurnCostProvider.NO_TURN_COST_PROVIDER;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.ShortFastestWeighting shortFastestWeighting12 = new com.graphhopper.routing.weighting.ShortFastestWeighting(flagEncoder0, pMap10, turnCostProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str3, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1909399913) + "'", int7 == (-1909399913));
        org.junit.Assert.assertNotNull(profile9);
        org.junit.Assert.assertNotNull(pMap10);
        org.junit.Assert.assertNotNull(turnCostProvider11);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        com.graphhopper.routing.ev.Surface surface0 = com.graphhopper.routing.ev.Surface.DIRT;
        org.junit.Assert.assertTrue("'" + surface0 + "' != '" + com.graphhopper.routing.ev.Surface.DIRT + "'", surface0.equals(com.graphhopper.routing.ev.Surface.DIRT));
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph> cHPreparationGraphGHLongObjectHashMap0 = new com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph>();
        cHPreparationGraphGHLongObjectHashMap0.ensureCapacity(1048576);
        com.carrotsearch.hppc.LongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph> cHPreparationGraphLongObjectHashMap3 = cHPreparationGraphGHLongObjectHashMap0.clone();
        com.graphhopper.coll.GHLongHashSet gHLongHashSet5 = new com.graphhopper.coll.GHLongHashSet(2);
        int int6 = cHPreparationGraphGHLongObjectHashMap0.removeAll((com.carrotsearch.hppc.LongContainer) gHLongHashSet5);
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph10 = com.graphhopper.routing.ch.CHPreparationGraph.nodeBased((int) ' ', 0);
        double double14 = cHPreparationGraph10.getTurnWeight(3, (int) (byte) -1, 20);
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph15 = cHPreparationGraphGHLongObjectHashMap0.getOrDefault((long) 4, cHPreparationGraph10);
        com.graphhopper.storage.RAMDirectory rAMDirectory17 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory18 = rAMDirectory17.create();
        java.nio.ByteOrder byteOrder19 = rAMDirectory17.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess21 = rAMDirectory17.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory22 = rAMDirectory17.create();
        long[] longArray28 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet29 = com.carrotsearch.hppc.LongHashSet.from(longArray28);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray30 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager31 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray30);
        com.graphhopper.storage.GraphBuilder graphBuilder32 = new com.graphhopper.storage.GraphBuilder(encodingManager31);
        boolean boolean33 = longHashSet29.equals((java.lang.Object) encodingManager31);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage36 = new com.graphhopper.storage.GraphHopperStorage(directory22, encodingManager31, false, true);
        com.graphhopper.routing.Path path37 = new com.graphhopper.routing.Path((com.graphhopper.storage.Graph) graphHopperStorage36);
        com.graphhopper.routing.util.EncodingManager encodingManager38 = graphHopperStorage36.getEncodingManager();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage40 = graphHopperStorage36.create((long) (short) 0);
        com.graphhopper.routing.weighting.Weighting weighting41 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ch.CHPreparationGraph.buildFromGraph(cHPreparationGraph10, (com.graphhopper.storage.Graph) graphHopperStorage40, weighting41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot initialize from given graph. The number of nodes does not match: 0 vs. 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cHPreparationGraphLongObjectHashMap3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(cHPreparationGraph10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(cHPreparationGraph15);
        org.junit.Assert.assertNotNull(directory18);
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertNotNull(dataAccess21);
        org.junit.Assert.assertNotNull(directory22);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet29);
        org.junit.Assert.assertNotNull(flagEncoderArray30);
        org.junit.Assert.assertNotNull(encodingManager31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(encodingManager38);
        org.junit.Assert.assertNotNull(graphHopperStorage40);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        com.graphhopper.GraphHopper graphHopper0 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        com.graphhopper.GraphHopper graphHopper2 = graphHopper0.setFlagEncoderFactory(flagEncoderFactory1);
        com.graphhopper.routing.lm.LMPreparationHandler lMPreparationHandler3 = graphHopper0.getLMPreparationHandler();
        lMPreparationHandler3.setPreparationThreads(10);
        org.junit.Assert.assertNotNull(graphHopper2);
        org.junit.Assert.assertNotNull(lMPreparationHandler3);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        java.lang.String str4 = rAMDirectory1.getLocation();
        com.graphhopper.storage.RAMDirectory rAMDirectory6 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory7 = rAMDirectory6.create();
        java.nio.ByteOrder byteOrder8 = rAMDirectory6.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess10 = rAMDirectory6.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory11 = rAMDirectory6.create();
        long[] longArray17 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet18 = com.carrotsearch.hppc.LongHashSet.from(longArray17);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray19 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager20 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray19);
        com.graphhopper.storage.GraphBuilder graphBuilder21 = new com.graphhopper.storage.GraphBuilder(encodingManager20);
        boolean boolean22 = longHashSet18.equals((java.lang.Object) encodingManager20);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage25 = new com.graphhopper.storage.GraphHopperStorage(directory11, encodingManager20, false, true);
        com.graphhopper.routing.Path path26 = new com.graphhopper.routing.Path((com.graphhopper.storage.Graph) graphHopperStorage25);
        com.graphhopper.routing.util.EncodingManager encodingManager27 = graphHopperStorage25.getEncodingManager();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage29 = graphHopperStorage25.create((long) (short) 0);
        com.graphhopper.storage.StorableProperties storableProperties30 = graphHopperStorage29.getProperties();
        com.graphhopper.routing.lm.LMConfig lMConfig31 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.lm.PrepareLandmarks prepareLandmarks33 = new com.graphhopper.routing.lm.PrepareLandmarks((com.graphhopper.storage.Directory) rAMDirectory1, graphHopperStorage29, lMConfig31, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "prepare.ch.node.original_edge_count_weight/" + "'", str4, "prepare.ch.node.original_edge_count_weight/");
        org.junit.Assert.assertNotNull(directory7);
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertNotNull(dataAccess10);
        org.junit.Assert.assertNotNull(directory11);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet18);
        org.junit.Assert.assertNotNull(flagEncoderArray19);
        org.junit.Assert.assertNotNull(encodingManager20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(encodingManager27);
        org.junit.Assert.assertNotNull(graphHopperStorage29);
        org.junit.Assert.assertNotNull(storableProperties30);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        com.graphhopper.debatty.java.stringsimilarity.JaroWinkler jaroWinkler0 = new com.graphhopper.debatty.java.stringsimilarity.JaroWinkler();
        double double3 = jaroWinkler0.similarity("3.0", "hi!");
        double double6 = jaroWinkler0.similarity("default", "bike");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.4642857015132904d + "'", double6 == 0.4642857015132904d);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        com.graphhopper.debatty.java.stringsimilarity.JaroWinkler jaroWinkler1 = new com.graphhopper.debatty.java.stringsimilarity.JaroWinkler(0.4642857015132904d);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        com.graphhopper.util.Downloader downloader1 = new com.graphhopper.util.Downloader("");
        java.net.HttpURLConnection httpURLConnection2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream4 = downloader1.fetch(httpURLConnection2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl1 = new com.graphhopper.coll.GHBitSetImpl((int) (short) 100);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl2 = new com.graphhopper.coll.GHBitSetImpl();
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl3 = new com.graphhopper.coll.GHBitSetImpl();
        gHBitSetImpl3.remove((int) (short) 10);
        gHBitSetImpl3.clear();
        int int7 = gHBitSetImpl3.getCardinality();
        com.graphhopper.coll.GHBitSet gHBitSet8 = gHBitSetImpl2.copyTo((com.graphhopper.coll.GHBitSet) gHBitSetImpl3);
        gHBitSetImpl1.andNot((java.util.BitSet) gHBitSetImpl3);
        byte[] byteArray10 = gHBitSetImpl3.toByteArray();
        // The following exception was thrown during execution in test generation
        try {
            gHBitSetImpl3.clear((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(gHBitSet8);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        com.graphhopper.routing.ev.RoadAccess roadAccess0 = com.graphhopper.routing.ev.RoadAccess.PRIVATE;
        org.junit.Assert.assertTrue("'" + roadAccess0 + "' != '" + com.graphhopper.routing.ev.RoadAccess.PRIVATE + "'", roadAccess0.equals(com.graphhopper.routing.ev.RoadAccess.PRIVATE));
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        com.graphhopper.coll.GHSortedCollection gHSortedCollection0 = new com.graphhopper.coll.GHSortedCollection();
        int int1 = gHSortedCollection0.getSlidingMeanValue();
        gHSortedCollection0.insert((int) (short) 0, (int) '4');
        int int5 = gHSortedCollection0.peekKey();
        int int6 = gHSortedCollection0.pollKey();
        gHSortedCollection0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        com.graphhopper.util.shapes.BBox bBox4 = new com.graphhopper.util.shapes.BBox((double) 200L, 0.0d, 6.159206975860352E-11d, (double) 'a');
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = com.graphhopper.reader.osm.OSMReaderUtility.parseDuration("prepare.ch.edge.edge_quotient_weight");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot parse duration tag value: prepare.ch.edge.edge_quotient_weight");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap0 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>();
        com.carrotsearch.hppc.IntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableIntObjectHashMap1 = strComparableGHIntObjectHashMap0.clone();
        com.carrotsearch.hppc.predicates.IntPredicate intPredicate2 = null;
        int int3 = strComparableIntObjectHashMap1.removeAll(intPredicate2);
        org.junit.Assert.assertNotNull(strComparableIntObjectHashMap1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        com.graphhopper.storage.RAMDirectory rAMDirectory2 = new com.graphhopper.storage.RAMDirectory("prepare.ch.edge.witness_search.sigma_factor", false);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager5, false);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue9 = encodingManager5.getStringEncodedValue("N");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot find EncodedValue N in collection: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(flagEncoderArray4);
        org.junit.Assert.assertNotNull(encodingManager5);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph> cHPreparationGraphGHLongObjectHashMap2 = new com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph>((int) (short) 100, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.hppc.BufferAllocationException; message: The load factor should be in range [0.01, 0.99]: 100.000000");
        } catch (com.carrotsearch.hppc.BufferAllocationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        int int1 = com.graphhopper.util.GHUtility.getEdgeFromEdgeKey(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 50 + "'", int1 == 50);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        com.graphhopper.storage.NativeFSLockFactory nativeFSLockFactory0 = new com.graphhopper.storage.NativeFSLockFactory();
        java.io.File file1 = null;
        nativeFSLockFactory0.setLockDir(file1);
        // The following exception was thrown during execution in test generation
        try {
            nativeFSLockFactory0.forceRemove("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        com.graphhopper.util.shapes.BBox bBox1 = com.graphhopper.util.shapes.BBox.createInverse(true);
        org.junit.Assert.assertNotNull(bBox1);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        com.graphhopper.routing.util.parsers.OSMSurfaceParser oSMSurfaceParser0 = new com.graphhopper.routing.util.parsers.OSMSurfaceParser();
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        com.graphhopper.routing.RoundTripRouting.Params params0 = new com.graphhopper.routing.RoundTripRouting.Params();
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        com.graphhopper.coll.GHIntHashSet gHIntHashSet0 = new com.graphhopper.coll.GHIntHashSet();
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        com.graphhopper.apache.commons.collections.IntFloatBinaryHeap intFloatBinaryHeap0 = new com.graphhopper.apache.commons.collections.IntFloatBinaryHeap();
        int int1 = intFloatBinaryHeap0.getSize();
        long long2 = intFloatBinaryHeap0.getCapacity();
        intFloatBinaryHeap0.ensureCapacity(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1001L + "'", long2 == 1001L);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph2 = com.graphhopper.routing.ch.CHPreparationGraph.nodeBased((int) ' ', 0);
        double double6 = cHPreparationGraph2.getTurnWeight(3, (int) (byte) -1, 20);
        cHPreparationGraph2.prepareForContraction();
        org.junit.Assert.assertNotNull(cHPreparationGraph2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        java.util.Random random1 = null;
        com.carrotsearch.hppc.IntArrayList intArrayList2 = com.graphhopper.util.ArrayUtil.permutation((int) (short) 1, random1);
        com.carrotsearch.hppc.IntArrayList intArrayList3 = com.graphhopper.util.ArrayUtil.reverse(intArrayList2);
        com.graphhopper.coll.GHIntHashSet gHIntHashSet4 = new com.graphhopper.coll.GHIntHashSet((com.carrotsearch.hppc.IntContainer) intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        com.graphhopper.GraphHopper graphHopper0 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        com.graphhopper.GraphHopper graphHopper2 = graphHopper0.setFlagEncoderFactory(flagEncoderFactory1);
        com.graphhopper.routing.lm.LMPreparationHandler lMPreparationHandler3 = graphHopper0.getLMPreparationHandler();
        lMPreparationHandler3.setPreparationThreads(1687814340);
        com.graphhopper.routing.lm.LMConfig lMConfig6 = null;
        com.graphhopper.routing.lm.LMPreparationHandler lMPreparationHandler7 = lMPreparationHandler3.addLMConfig(lMConfig6);
        boolean boolean8 = lMPreparationHandler7.hasLMProfiles();
        org.junit.Assert.assertNotNull(graphHopper2);
        org.junit.Assert.assertNotNull(lMPreparationHandler3);
        org.junit.Assert.assertNotNull(lMPreparationHandler7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
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
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState41 = edgeIteratorState26.copyPropertiesFrom(edgeIteratorState36);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Not supported.");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.graphhopper.routing.util.spatialrules.SpatialRuleLookup spatialRuleLookup0 = com.graphhopper.routing.util.spatialrules.SpatialRuleLookup.EMPTY;
        com.graphhopper.storage.IntsRef intsRef3 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState9 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef3, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int10 = edgeIteratorState9.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue11 = com.graphhopper.routing.ev.Country.create();
        boolean boolean12 = countryEnumEncodedValue11.isStoreTwoDirections();
        com.graphhopper.routing.ev.Country country13 = edgeIteratorState9.getReverse(countryEnumEncodedValue11);
        com.graphhopper.routing.util.parsers.SpatialRuleParser spatialRuleParser14 = new com.graphhopper.routing.util.parsers.SpatialRuleParser(spatialRuleLookup0, (com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue11);
        com.graphhopper.storage.IntsRef intsRef16 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean17 = intsRef16.isEmpty();
        com.graphhopper.storage.IntsRef intsRef19 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int20 = intsRef16.compareTo(intsRef19);
        boolean boolean21 = intsRef16.isValid();
        java.util.Calendar calendar22 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "_network$turn_cost", "", "", "5.4.0-70-generic", "bike_network", "3.0", "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}", "prepare.ch.edge.witness_search.sigma_factor", "3.0" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.lang.String[] strArray58 = new java.lang.String[] { "", "bike", "prepare.ch.edge.witness_search.reset_interval", "_network", "prepare.ch.edge.witness_search.sigma_factor", "foot", "srtm", "_network$turn_cost", "prepare.ch.node.original_edge_count_weight", "foot_network", "foot_network", "prepare.ch.log_messages", "3.0", "", "secondary", "secondary", "hi!", "00001010000010100000101001100100", "1.8", "bike", "prepare.ch.edge.witness_search.sigma_factor", "hike_rating", "prepare.ch.edge.witness_search.reset_interval" };
        java.util.LinkedHashSet<java.lang.String> strSet59 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet59, strArray58);
        java.lang.String[] strArray79 = new java.lang.String[] { "3.0", "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}", "prepare.ch.updates.lazy", "secondary", "foot", "srtm", "foot", "bike_network", "foot_network", "prepare.ch.log_messages", "", "00001010000010100000101001100100", "hi!", "prepare.ch.node.original_edge_count_weight", "1.8", "_network$turn_cost", "5.4.0-70-generic", "horse_rating" };
        java.util.LinkedHashSet<java.lang.String> strSet80 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet80, strArray79);
        com.graphhopper.reader.osm.conditional.ConditionalOSMTagInspector conditionalOSMTagInspector82 = new com.graphhopper.reader.osm.conditional.ConditionalOSMTagInspector(calendar22, (java.util.List<java.lang.String>) strList33, (java.util.Set<java.lang.String>) strSet59, (java.util.Set<java.lang.String>) strSet80);
        com.graphhopper.reader.ReaderWay readerWay84 = new com.graphhopper.reader.ReaderWay((long) 0);
        boolean boolean85 = conditionalOSMTagInspector82.isRestrictedWayConditionallyPermitted(readerWay84);
        com.graphhopper.storage.IntsRef intsRef89 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState95 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef89, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        com.graphhopper.storage.IntsRef intsRef96 = spatialRuleParser14.handleWayTags(intsRef16, readerWay84, true, intsRef89);
        java.lang.String[] strArray98 = null;
        boolean boolean99 = readerWay84.hasTag("bike", strArray98);
        org.junit.Assert.assertNotNull(spatialRuleLookup0);
        org.junit.Assert.assertNotNull(edgeIteratorState9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + country13 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country13.equals(com.graphhopper.routing.ev.Country.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(edgeIteratorState95);
        org.junit.Assert.assertNotNull(intsRef96);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap3 = new com.graphhopper.coll.OSMIDMap(directory2);
        int int4 = oSMIDMap3.getMemoryUsage();
        oSMIDMap3.optimize();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        int[] intArray0 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet1 = com.graphhopper.coll.GHIntHashSet.from(intArray0);
        int int2 = intHashSet1.size();
        intHashSet1.clear();
        boolean boolean5 = intHashSet1.contains(200);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intHashSet1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.LITTLE;
        long long3 = bitUtil0.combineIntsToLong(10, (int) (byte) 1);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10 };
        java.lang.String str9 = bitUtil0.toBitString(byteArray8);
        byte[] byteArray11 = bitUtil0.fromShort((short) 100);
        com.graphhopper.util.BitUtil bitUtil12 = com.graphhopper.util.BitUtil.LITTLE;
        long long15 = bitUtil12.combineIntsToLong(10, (int) (byte) 1);
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10 };
        java.lang.String str21 = bitUtil12.toBitString(byteArray20);
        java.lang.String str22 = bitUtil0.toBitString(byteArray20);
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4294967306L + "'", long3 == 4294967306L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 10, 10, 10]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "00001010000010100000101001100100" + "'", str9, "00001010000010100000101001100100");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 0, 0, 0]");
        org.junit.Assert.assertNotNull(bitUtil12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4294967306L + "'", long15 == 4294967306L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[100, 10, 10, 10]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "00001010000010100000101001100100" + "'", str21, "00001010000010100000101001100100");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00001010000010100000101001100100" + "'", str22, "00001010000010100000101001100100");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        com.graphhopper.util.details.DistanceDetails distanceDetails0 = new com.graphhopper.util.details.DistanceDetails();
        java.lang.Object obj1 = distanceDetails0.getCurrentValue();
        java.lang.String str2 = distanceDetails0.toString();
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + 0.0d + "'", obj1, 0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "distance" + "'", str2, "distance");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        com.graphhopper.routing.Path.EdgeVisitor edgeVisitor24 = null;
        // The following exception was thrown during execution in test generation
        try {
            path21.forEveryEdge(edgeVisitor24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: fromNode < 0 should not happen");
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
        org.junit.Assert.assertNotNull(path23);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.storage.DAType dAType3 = rAMDirectory1.getDefaultType();
        com.graphhopper.routing.ev.RoadClass roadClass4 = com.graphhopper.routing.ev.RoadClass.LIVING_STREET;
        boolean boolean5 = dAType3.equals((java.lang.Object) roadClass4);
        java.lang.String str6 = roadClass4.toString();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(dAType3);
        org.junit.Assert.assertTrue("'" + roadClass4 + "' != '" + com.graphhopper.routing.ev.RoadClass.LIVING_STREET + "'", roadClass4.equals(com.graphhopper.routing.ev.RoadClass.LIVING_STREET));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "living_street" + "'", str6, "living_street");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        java.util.Random random0 = null;
        com.graphhopper.routing.util.tour.MultiPointTour multiPointTour4 = new com.graphhopper.routing.util.tour.MultiPointTour(random0, (double) 10.0f, 11, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double6 = multiPointTour4.getDistanceForIteration(2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        com.graphhopper.reader.dem.SRTMProvider sRTMProvider1 = new com.graphhopper.reader.dem.SRTMProvider("prepare.ch.updates.lazy");
        java.lang.String str2 = sRTMProvider1.toString();
        boolean boolean3 = sRTMProvider1.getInterpolate();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "srtm" + "'", str2, "srtm");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("prepare.ch.node.original_edge_count_weight");
        int int6 = dataAccess5.getSegmentSize();
        boolean boolean7 = dataAccess5.loadExisting();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             dataAccess5.setInt(0L, (int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1048576 + "'", int6 == 1048576);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap0 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>();
        int[] intArray1 = strComparableGHIntObjectHashMap0.keys;
        com.carrotsearch.hppc.IntObjectHashMap<java.lang.Comparable<java.lang.String>>.KeysContainer keysContainer2 = strComparableGHIntObjectHashMap0.keys();
        strComparableGHIntObjectHashMap0.clear();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(keysContainer2);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        java.util.Random random1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.carrotsearch.hppc.IntArrayList intArrayList2 = com.graphhopper.util.ArrayUtil.permutation(11, random1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile1 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str2 = customProfile1.toString();
        java.lang.String str3 = customProfile1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str2, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "motorcycle" + "'", str3, "motorcycle");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap1 = new com.graphhopper.coll.GHLongLongHashMap(1);
        long long4 = gHLongLongHashMap1.addTo((long) (short) 10, (long) 3);
        long long7 = gHLongLongHashMap1.getOrDefault((long) 'a', (long) (-3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-3L) + "'", long7 == (-3L));
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        com.carrotsearch.hppc.IntArrayList intArrayList2 = com.graphhopper.util.ArrayUtil.range((int) (short) 0, 4);
        boolean boolean3 = com.graphhopper.util.ArrayUtil.isPermutation(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
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
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.LITTLE;
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl1 = new com.graphhopper.coll.GHBitSetImpl();
        gHBitSetImpl1.remove((int) (short) 10);
        byte[] byteArray4 = gHBitSetImpl1.toByteArray();
        // The following exception was thrown during execution in test generation
        try {
            float float6 = bitUtil0.toFloat(byteArray4, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
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
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        com.graphhopper.routing.ev.RoadEnvironment roadEnvironment0 = com.graphhopper.routing.ev.RoadEnvironment.FORD;
        org.junit.Assert.assertTrue("'" + roadEnvironment0 + "' != '" + com.graphhopper.routing.ev.RoadEnvironment.FORD + "'", roadEnvironment0.equals(com.graphhopper.routing.ev.RoadEnvironment.FORD));
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        com.graphhopper.routing.util.PriorityCode priorityCode0 = com.graphhopper.routing.util.PriorityCode.AVOID_IF_POSSIBLE;
        org.junit.Assert.assertTrue("'" + priorityCode0 + "' != '" + com.graphhopper.routing.util.PriorityCode.AVOID_IF_POSSIBLE + "'", priorityCode0.equals(com.graphhopper.routing.util.PriorityCode.AVOID_IF_POSSIBLE));
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
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
        com.graphhopper.routing.Path path26 = path21.setDistance((double) 11);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState27 = null; // flaky: path26.getFinalEdge();
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.7976931348623157E308d + "'", double24 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(path26);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl0 = new com.graphhopper.coll.GHBitSetImpl();
        gHBitSetImpl0.remove((int) (short) 10);
        gHBitSetImpl0.clear();
        int int4 = gHBitSetImpl0.length();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        com.graphhopper.routing.AlgorithmOptions.Builder builder0 = new com.graphhopper.routing.AlgorithmOptions.Builder();
        com.graphhopper.routing.AlgorithmOptions.Builder builder2 = builder0.maxVisitedNodes((int) ' ');
        com.graphhopper.routing.AlgorithmOptions algorithmOptions3 = builder2.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(algorithmOptions3);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        com.graphhopper.coll.MinHeapWithUpdate minHeapWithUpdate1 = new com.graphhopper.coll.MinHeapWithUpdate((int) (short) 100);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        com.graphhopper.routing.util.spatialrules.SpatialRuleSet spatialRuleSet0 = com.graphhopper.routing.util.spatialrules.SpatialRuleSet.EMPTY;
        com.graphhopper.storage.RAMDirectory rAMDirectory2 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory3 = rAMDirectory2.create();
        com.graphhopper.storage.DAType dAType4 = rAMDirectory2.getDefaultType();
        com.graphhopper.routing.ev.RoadClass roadClass5 = com.graphhopper.routing.ev.RoadClass.LIVING_STREET;
        boolean boolean6 = dAType4.equals((java.lang.Object) roadClass5);
        org.locationtech.jts.geom.Polygon[] polygonArray7 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList8 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList8, polygonArray7);
        com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule germanySpatialRule10 = new com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList8);
        com.graphhopper.storage.RAMDirectory rAMDirectory12 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory13 = rAMDirectory12.create();
        com.graphhopper.storage.DAType dAType14 = rAMDirectory12.getDefaultType();
        com.graphhopper.routing.ev.RoadClass roadClass15 = com.graphhopper.routing.ev.RoadClass.LIVING_STREET;
        boolean boolean16 = dAType14.equals((java.lang.Object) roadClass15);
        com.graphhopper.routing.util.TransportationMode transportationMode17 = com.graphhopper.routing.util.TransportationMode.MOTORCYCLE;
        double double19 = germanySpatialRule10.getMaxSpeed(roadClass15, transportationMode17, (double) 0.0f);
        com.graphhopper.routing.ev.RoadClass roadClass20 = com.graphhopper.routing.ev.RoadClass.SECONDARY;
        java.lang.String str21 = roadClass20.toString();
        com.graphhopper.routing.util.TransportationMode transportationMode22 = com.graphhopper.routing.util.TransportationMode.OTHER;
        double double24 = germanySpatialRule10.getMaxSpeed(roadClass20, transportationMode22, (double) 21);
        com.graphhopper.routing.ev.RoadAccess roadAccess25 = com.graphhopper.routing.ev.RoadAccess.YES;
        com.graphhopper.routing.ev.RoadAccess roadAccess26 = spatialRuleSet0.getAccess(roadClass5, transportationMode22, roadAccess25);
        org.locationtech.jts.geom.Polygon[] polygonArray27 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList28 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList28, polygonArray27);
        com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule germanySpatialRule30 = new com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList28);
        com.graphhopper.routing.ev.RoadClass roadClass31 = com.graphhopper.routing.ev.RoadClass.SECONDARY;
        com.graphhopper.routing.util.TransportationMode transportationMode32 = com.graphhopper.routing.util.TransportationMode.CAR;
        double double34 = germanySpatialRule30.getMaxSpeed(roadClass31, transportationMode32, (-1.0d));
        com.graphhopper.routing.util.TransportationMode transportationMode35 = com.graphhopper.routing.util.TransportationMode.BIKE;
        double double37 = spatialRuleSet0.getMaxSpeed(roadClass31, transportationMode35, (double) 4294967306L);
        java.lang.String str38 = spatialRuleSet0.toString();
        org.junit.Assert.assertNotNull(spatialRuleSet0);
        org.junit.Assert.assertNotNull(directory3);
        org.junit.Assert.assertNotNull(dAType4);
        org.junit.Assert.assertTrue("'" + roadClass5 + "' != '" + com.graphhopper.routing.ev.RoadClass.LIVING_STREET + "'", roadClass5.equals(com.graphhopper.routing.ev.RoadClass.LIVING_STREET));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(polygonArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(directory13);
        org.junit.Assert.assertNotNull(dAType14);
        org.junit.Assert.assertTrue("'" + roadClass15 + "' != '" + com.graphhopper.routing.ev.RoadClass.LIVING_STREET + "'", roadClass15.equals(com.graphhopper.routing.ev.RoadClass.LIVING_STREET));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + transportationMode17 + "' != '" + com.graphhopper.routing.util.TransportationMode.MOTORCYCLE + "'", transportationMode17.equals(com.graphhopper.routing.util.TransportationMode.MOTORCYCLE));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + roadClass20 + "' != '" + com.graphhopper.routing.ev.RoadClass.SECONDARY + "'", roadClass20.equals(com.graphhopper.routing.ev.RoadClass.SECONDARY));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "secondary" + "'", str21, "secondary");
        org.junit.Assert.assertTrue("'" + transportationMode22 + "' != '" + com.graphhopper.routing.util.TransportationMode.OTHER + "'", transportationMode22.equals(com.graphhopper.routing.util.TransportationMode.OTHER));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 21.0d + "'", double24 == 21.0d);
        org.junit.Assert.assertTrue("'" + roadAccess25 + "' != '" + com.graphhopper.routing.ev.RoadAccess.YES + "'", roadAccess25.equals(com.graphhopper.routing.ev.RoadAccess.YES));
        org.junit.Assert.assertTrue("'" + roadAccess26 + "' != '" + com.graphhopper.routing.ev.RoadAccess.YES + "'", roadAccess26.equals(com.graphhopper.routing.ev.RoadAccess.YES));
        org.junit.Assert.assertNotNull(polygonArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + roadClass31 + "' != '" + com.graphhopper.routing.ev.RoadClass.SECONDARY + "'", roadClass31.equals(com.graphhopper.routing.ev.RoadClass.SECONDARY));
        org.junit.Assert.assertTrue("'" + transportationMode32 + "' != '" + com.graphhopper.routing.util.TransportationMode.CAR + "'", transportationMode32.equals(com.graphhopper.routing.util.TransportationMode.CAR));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertTrue("'" + transportationMode35 + "' != '" + com.graphhopper.routing.util.TransportationMode.BIKE + "'", transportationMode35.equals(com.graphhopper.routing.util.TransportationMode.BIKE));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 4.294967306E9d + "'", double37 == 4.294967306E9d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "SpatialRuleSet [rules=[]]" + "'", str38, "SpatialRuleSet [rules=[]]");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
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
        com.graphhopper.storage.RAMDirectory rAMDirectory24 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory25 = rAMDirectory24.create();
        java.nio.ByteOrder byteOrder26 = rAMDirectory24.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess28 = rAMDirectory24.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory29 = rAMDirectory24.create();
        long[] longArray35 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet36 = com.carrotsearch.hppc.LongHashSet.from(longArray35);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray37 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager38 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray37);
        com.graphhopper.storage.GraphBuilder graphBuilder39 = new com.graphhopper.storage.GraphBuilder(encodingManager38);
        boolean boolean40 = longHashSet36.equals((java.lang.Object) encodingManager38);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage43 = new com.graphhopper.storage.GraphHopperStorage(directory29, encodingManager38, false, true);
        com.graphhopper.routing.Path path44 = new com.graphhopper.routing.Path((com.graphhopper.storage.Graph) graphHopperStorage43);
        com.graphhopper.routing.util.EncodingManager encodingManager45 = graphHopperStorage43.getEncodingManager();
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage47 = graphHopperStorage43.create((long) (short) 0);
        com.graphhopper.storage.StorableProperties storableProperties48 = graphHopperStorage47.getProperties();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.Graph graph49 = com.graphhopper.util.GHUtility.copyTo((com.graphhopper.storage.Graph) graphHopperStorage20, (com.graphhopper.storage.Graph) graphHopperStorage47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Copying a graph is currently not supported in the presence of turn costs");
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
        org.junit.Assert.assertNotNull(encodingManager22);
        org.junit.Assert.assertNotNull(directory25);
        org.junit.Assert.assertNotNull(byteOrder26);
        org.junit.Assert.assertNotNull(dataAccess28);
        org.junit.Assert.assertNotNull(directory29);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet36);
        org.junit.Assert.assertNotNull(flagEncoderArray37);
        org.junit.Assert.assertNotNull(encodingManager38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(encodingManager45);
        org.junit.Assert.assertNotNull(graphHopperStorage47);
        org.junit.Assert.assertNotNull(storableProperties48);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
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
        // The following exception was thrown during execution in test generation
        try {
            gHBitSetImpl6.flip((-3), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex < 0: -3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[0 0 0 0 0 0 0 0 0 0]" + "'", str2, "[0 0 0 0 0 0 0 0 0 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(gHBitSet11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
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
            int int17 = cHPreparationGraph10.getDegree((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cHPreparationGraphLongObjectHashMap3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(cHPreparationGraph10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(cHPreparationGraph15);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        com.graphhopper.routing.ev.RoadClass roadClass0 = com.graphhopper.routing.ev.RoadClass.UNCLASSIFIED;
        org.junit.Assert.assertTrue("'" + roadClass0 + "' != '" + com.graphhopper.routing.ev.RoadClass.UNCLASSIFIED + "'", roadClass0.equals(com.graphhopper.routing.ev.RoadClass.UNCLASSIFIED));
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        com.graphhopper.routing.util.parsers.OSMRoundaboutParser oSMRoundaboutParser0 = new com.graphhopper.routing.util.parsers.OSMRoundaboutParser();
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray0 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager1 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray0);
        com.graphhopper.storage.GraphBuilder graphBuilder2 = new com.graphhopper.storage.GraphBuilder(encodingManager1);
        com.graphhopper.storage.GraphBuilder graphBuilder4 = graphBuilder2.setBytes((long) (short) 0);
        com.graphhopper.storage.GraphBuilder graphBuilder6 = graphBuilder2.setMMap("-1->-1");
        org.junit.Assert.assertNotNull(flagEncoderArray0);
        org.junit.Assert.assertNotNull(encodingManager1);
        org.junit.Assert.assertNotNull(graphBuilder4);
        org.junit.Assert.assertNotNull(graphBuilder6);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        com.graphhopper.routing.RoundTripRouting roundTripRouting0 = new com.graphhopper.routing.RoundTripRouting();
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.DataAccess dataAccess7 = rAMDirectory1.find("bike_network");
        com.graphhopper.storage.Directory directory8 = rAMDirectory1.create();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
        org.junit.Assert.assertNotNull(dataAccess7);
        org.junit.Assert.assertNotNull(directory8);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.locationtech.jts.geom.prep.PreparedPolygon preparedPolygon0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.shapes.Polygon polygon1 = new com.graphhopper.util.shapes.Polygon(preparedPolygon0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        com.graphhopper.routing.ev.TurnCost turnCost0 = new com.graphhopper.routing.ev.TurnCost();
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.StorableProperties storableProperties4 = new com.graphhopper.storage.StorableProperties((com.graphhopper.storage.Directory) rAMDirectory1);
        com.graphhopper.storage.StorableProperties storableProperties6 = storableProperties4.create((long) 11);
        com.graphhopper.storage.StorableProperties storableProperties8 = storableProperties4.remove("1.8.0_251");
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(storableProperties6);
        org.junit.Assert.assertNotNull(storableProperties8);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
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
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.FlagEncoder flagEncoder52 = encodingManager7.getEncoder("1.8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Encoder for 1.8 not found. Existing: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        com.graphhopper.apache.commons.collections.IntFloatBinaryHeap intFloatBinaryHeap0 = new com.graphhopper.apache.commons.collections.IntFloatBinaryHeap();
        int int1 = intFloatBinaryHeap0.getSize();
        intFloatBinaryHeap0.update(1.0E-5d, (int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        com.graphhopper.storage.IntsRef intsRef14 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState20 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef14, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int21 = edgeIteratorState20.getEdge();
        virtualEdgeIteratorState11.setReverseEdge(edgeIteratorState20);
        java.lang.String str23 = virtualEdgeIteratorState11.getName();
        com.graphhopper.routing.ev.IntEncodedValue intEncodedValue24 = com.graphhopper.routing.ev.HorseRating.create();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState27 = virtualEdgeIteratorState11.set(intEncodedValue24, (int) ' ', (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue horse_rating supports only one direction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hike_rating" + "'", str23, "hike_rating");
        org.junit.Assert.assertNotNull(intEncodedValue24);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.DataAccess dataAccess7 = rAMDirectory1.find("bike_network");
        dataAccess7.setHeader((int) ' ', 21);
        // The following exception was thrown during execution in test generation
        try {
            short short12 = 0; // flaky: dataAccess7.getShort((long) (-4));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
        org.junit.Assert.assertNotNull(dataAccess7);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("{}");
        java.util.Collection<com.graphhopper.storage.DataAccess> dataAccessCollection2 = rAMDirectory1.getAll();
        org.junit.Assert.assertNotNull(dataAccessCollection2);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        com.graphhopper.routing.util.parsers.OSMTollParser oSMTollParser0 = new com.graphhopper.routing.util.parsers.OSMTollParser();
        com.graphhopper.storage.RAMDirectory rAMDirectory2 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory3 = rAMDirectory2.create();
        java.nio.ByteOrder byteOrder4 = rAMDirectory2.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray5 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager6 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray5);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage8 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory2, encodingManager6, false);
        java.util.List<com.graphhopper.storage.CHConfig> cHConfigList9 = graphHopperStorage8.getCHConfigs();
        com.graphhopper.routing.util.EncodingManager encodingManager10 = graphHopperStorage8.getEncodingManager();
        java.lang.String str11 = encodingManager10.toString();
        com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser oSMHazmatTunnelParser12 = new com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray13 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager14 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray13);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue15 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue16 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray17 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue15, decimalEncodedValue16 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList18 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList18, encodedValueArray17);
        oSMHazmatTunnelParser12.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager14, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList18);
        java.util.List<com.graphhopper.routing.ev.EncodedValue> encodedValueList21 = encodingManager14.getEncodedValues();
        // The following exception was thrown during execution in test generation
        try {
            oSMTollParser0.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager10, encodedValueList21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertNotNull(flagEncoderArray5);
        org.junit.Assert.assertNotNull(encodingManager6);
        org.junit.Assert.assertNotNull(cHConfigList9);
        org.junit.Assert.assertNotNull(encodingManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(flagEncoderArray13);
        org.junit.Assert.assertNotNull(encodingManager14);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue15);
        org.junit.Assert.assertNotNull(decimalEncodedValue16);
        org.junit.Assert.assertNotNull(encodedValueArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(encodedValueList21);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        com.graphhopper.routing.ev.Surface surface1 = com.graphhopper.routing.ev.Surface.find("prepare.ch.edge.edge_quotient_weight");
        org.junit.Assert.assertTrue("'" + surface1 + "' != '" + com.graphhopper.routing.ev.Surface.OTHER + "'", surface1.equals(com.graphhopper.routing.ev.Surface.OTHER));
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        com.graphhopper.routing.util.EncodingManager.Builder builder0 = com.graphhopper.routing.util.EncodingManager.start();
        com.graphhopper.reader.osm.conditional.DateRangeParser dateRangeParser1 = new com.graphhopper.reader.osm.conditional.DateRangeParser();
        com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState conditionState3 = dateRangeParser1.checkCondition("3.0");
        com.graphhopper.routing.util.EncodingManager.Builder builder4 = builder0.setDateRangeParser(dateRangeParser1);
        com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser oSMFootNetworkTagParser5 = new com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser();
        com.graphhopper.routing.util.EncodingManager.Builder builder6 = builder0.addRelationTagParser((com.graphhopper.routing.util.parsers.RelationTagParser) oSMFootNetworkTagParser5);
        com.graphhopper.routing.util.EncodingManager.Builder builder8 = builder0.setEnableInstructions(false);
        com.graphhopper.routing.util.EncodingManager.Builder builder10 = builder8.setEnableInstructions(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + conditionState3 + "' != '" + com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.FALSE + "'", conditionState3.equals(com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.FALSE));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray0 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager1 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray0);
        java.lang.String str2 = encodingManager1.toFlagEncodersAsString();
        boolean boolean4 = encodingManager1.hasEncoder("foot");
        org.junit.Assert.assertNotNull(flagEncoderArray0);
        org.junit.Assert.assertNotNull(encodingManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.graphhopper.storage.Graph graph0 = null;
        com.graphhopper.storage.index.LocationIndex locationIndex1 = null;
        com.graphhopper.storage.GraphEdgeIdFinder graphEdgeIdFinder2 = new com.graphhopper.storage.GraphEdgeIdFinder(graph0, locationIndex1);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        com.graphhopper.routing.util.FlagEncoder flagEncoder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.ShortFastestWeighting shortFastestWeighting2 = new com.graphhopper.routing.weighting.ShortFastestWeighting(flagEncoder0, 1143.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        com.carrotsearch.hppc.IntArrayList intArrayList0 = null;
        java.util.Random random2 = null;
        com.carrotsearch.hppc.IntArrayList intArrayList3 = com.graphhopper.util.ArrayUtil.permutation((int) (short) 1, random2);
        com.carrotsearch.hppc.IntArrayList intArrayList4 = com.graphhopper.util.ArrayUtil.reverse(intArrayList3);
        com.carrotsearch.hppc.IntArrayList intArrayList5 = com.graphhopper.util.ArrayUtil.invert(intArrayList4);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = com.graphhopper.util.ArrayUtil.calcSortOrder(intArrayList0, intArrayList4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.storage.IntsRef intsRef7 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean8 = intsRef7.isEmpty();
        com.graphhopper.util.PointList pointList10 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState12 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef7, "hike_rating", pointList10, false);
        virtualEdgeIteratorState12.setUnfavored(true);
        int int15 = virtualEdgeIteratorState12.getOriginalEdgeKey();
        int int16 = virtualEdgeIteratorState12.getAdjNode();
        int int17 = virtualEdgeIteratorState12.getAdjNode();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState18 = disabledEdgeIterator0.copyPropertiesFrom((com.graphhopper.util.EdgeIteratorState) virtualEdgeIteratorState12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1048576 + "'", int15 == 1048576);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry4 = new com.graphhopper.routing.ch.PrepareCHEntry(0, (int) (byte) -1, (-1), 0.0d);
        prepareCHEntry4.prepareEdge = (byte) 0;
        double double7 = prepareCHEntry4.weight;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("1111111111111111111111111111111111111111111111111111111111111100");
        com.graphhopper.storage.Directory directory6 = rAMDirectory1.create();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
        org.junit.Assert.assertNotNull(directory6);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser oSMFootNetworkTagParser0 = new com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser();
        com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser oSMHazmatTunnelParser1 = new com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray2 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager3 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray2);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue4 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue5 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray6 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue4, decimalEncodedValue5 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList7 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList7, encodedValueArray6);
        oSMHazmatTunnelParser1.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager3, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList7);
        java.util.List<com.graphhopper.routing.ev.EncodedValue> encodedValueList10 = encodingManager3.getEncodedValues();
        com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser oSMHazmatTunnelParser11 = new com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray12 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager13 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray12);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue14 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue15 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray16 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue14, decimalEncodedValue15 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList17 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList17, encodedValueArray16);
        oSMHazmatTunnelParser11.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager13, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList17);
        oSMFootNetworkTagParser0.createRelationEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager3, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList17);
        com.graphhopper.storage.IntsRef intsRef22 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean23 = intsRef22.isEmpty();
        com.graphhopper.storage.IntsRef intsRef25 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int26 = intsRef22.compareTo(intsRef25);
        boolean boolean27 = intsRef22.isValid();
        com.graphhopper.reader.ReaderRelation readerRelation28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.IntsRef intsRef29 = oSMFootNetworkTagParser0.handleRelationTags(intsRef22, readerRelation28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(flagEncoderArray2);
        org.junit.Assert.assertNotNull(encodingManager3);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue4);
        org.junit.Assert.assertNotNull(decimalEncodedValue5);
        org.junit.Assert.assertNotNull(encodedValueArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(encodedValueList10);
        org.junit.Assert.assertNotNull(flagEncoderArray12);
        org.junit.Assert.assertNotNull(encodingManager13);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue14);
        org.junit.Assert.assertNotNull(decimalEncodedValue15);
        org.junit.Assert.assertNotNull(encodedValueArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap1 = new com.graphhopper.coll.GHLongLongHashMap(1);
        java.util.Spliterator<com.carrotsearch.hppc.cursors.LongLongCursor> longLongCursorSpliterator2 = gHLongLongHashMap1.spliterator();
        com.carrotsearch.hppc.LongLongHashMap.KeysContainer keysContainer3 = gHLongLongHashMap1.keys();
        boolean boolean6 = gHLongLongHashMap1.putIfAbsent((long) 3, (long) 35);
        boolean boolean9 = gHLongLongHashMap1.putIfAbsent((long) 21, (long) 11);
        org.junit.Assert.assertNotNull(longLongCursorSpliterator2);
        org.junit.Assert.assertNotNull(keysContainer3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        java.io.File file0 = null;
        com.graphhopper.storage.SimpleFSLockFactory simpleFSLockFactory1 = new com.graphhopper.storage.SimpleFSLockFactory(file0);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.GHLock gHLock4 = simpleFSLockFactory1.create("N", true);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Set lockDir before creating locks");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = com.graphhopper.reader.osm.OSMReaderUtility.parseDuration("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot parse duration tag value: []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        com.graphhopper.routing.util.TestAlgoCollector.OneRun oneRun0 = new com.graphhopper.routing.util.TestAlgoCollector.OneRun();
        com.graphhopper.storage.index.LocationIndex locationIndex1 = null;
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue2 = null;
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter3 = com.graphhopper.routing.util.DefaultEdgeFilter.allEdges(booleanEncodedValue2);
        java.util.List<com.graphhopper.storage.index.Snap> snapList4 = oneRun0.getList(locationIndex1, (com.graphhopper.routing.util.EdgeFilter) defaultEdgeFilter3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = defaultEdgeFilter3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultEdgeFilter3);
        org.junit.Assert.assertNotNull(snapList4);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
        com.graphhopper.routing.util.EncodingManager encodingManager36 = graphHopperStorage7.getEncodingManager();
        com.graphhopper.routing.weighting.Weighting weighting37 = null;
        com.graphhopper.routing.weighting.Weighting weighting38 = graphHopperStorage7.wrapWeighting(weighting37);
        com.graphhopper.routing.weighting.Weighting weighting40 = null;
        com.graphhopper.storage.CHConfig cHConfig41 = com.graphhopper.storage.CHConfig.edgeBased("foot_network", weighting40);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.GraphHopperStorage graphHopperStorage42 = graphHopperStorage7.addCHGraph(cHConfig41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Weighting for CHGraph cannot be null");
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
        org.junit.Assert.assertNotNull(encodingManager36);
        org.junit.Assert.assertNull(weighting38);
        org.junit.Assert.assertNotNull(cHConfig41);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap0 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>();
        int[] intArray1 = strComparableGHIntObjectHashMap0.keys;
        int int3 = strComparableGHIntObjectHashMap0.indexOf((int) (byte) -1);
        java.lang.Object[] objArray4 = strComparableGHIntObjectHashMap0.values;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-4) + "'", int3 == (-4));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = blockArea22.toString(1687814340);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1687814340, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.LITTLE;
        java.lang.String str2 = bitUtil0.toBitString((long) (-4));
        byte[] byteArray4 = bitUtil0.fromBitString("_network");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl6 = new com.graphhopper.coll.GHBitSetImpl((int) (short) 100);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl7 = new com.graphhopper.coll.GHBitSetImpl();
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl8 = new com.graphhopper.coll.GHBitSetImpl();
        gHBitSetImpl8.remove((int) (short) 10);
        gHBitSetImpl8.clear();
        int int12 = gHBitSetImpl8.getCardinality();
        com.graphhopper.coll.GHBitSet gHBitSet13 = gHBitSetImpl7.copyTo((com.graphhopper.coll.GHBitSet) gHBitSetImpl8);
        gHBitSetImpl6.andNot((java.util.BitSet) gHBitSetImpl8);
        byte[] byteArray15 = gHBitSetImpl8.toByteArray();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bitUtil0.toInt(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111100" + "'", str2, "1111111111111111111111111111111111111111111111111111111111111100");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(gHBitSet13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        com.graphhopper.routing.ev.RoadClass roadClass1 = com.graphhopper.routing.ev.RoadClass.find("prepare.ch.updates.neighbor");
        org.junit.Assert.assertTrue("'" + roadClass1 + "' != '" + com.graphhopper.routing.ev.RoadClass.OTHER + "'", roadClass1.equals(com.graphhopper.routing.ev.RoadClass.OTHER));
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        com.graphhopper.routing.util.EncodingManager.Access access0 = com.graphhopper.routing.util.EncodingManager.Access.CAN_SKIP;
        boolean boolean1 = access0.canSkip();
        org.junit.Assert.assertTrue("'" + access0 + "' != '" + com.graphhopper.routing.util.EncodingManager.Access.CAN_SKIP + "'", access0.equals(com.graphhopper.routing.util.EncodingManager.Access.CAN_SKIP));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        com.graphhopper.routing.ev.HazmatWater hazmatWater0 = com.graphhopper.routing.ev.HazmatWater.YES;
        java.lang.String str1 = hazmatWater0.toString();
        org.junit.Assert.assertTrue("'" + hazmatWater0 + "' != '" + com.graphhopper.routing.ev.HazmatWater.YES + "'", hazmatWater0.equals(com.graphhopper.routing.ev.HazmatWater.YES));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap0 = new com.graphhopper.coll.GHLongLongHashMap();
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        java.lang.String str1 = com.graphhopper.routing.ev.TurnCost.key("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$turn_cost" + "'", str1, "$turn_cost");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        int int1 = com.graphhopper.routing.subnetwork.EdgeBasedTarjanSCC.getEdgeFromKey(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 50 + "'", int1 == 50);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        double double1 = com.graphhopper.routing.util.parsers.helpers.OSMValueExtractor.stringToMeter("prepare.ch.node.original_edge_count_weight/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager5, false);
        java.util.List<com.graphhopper.storage.CHConfig> cHConfigList8 = graphHopperStorage7.getCHConfigs();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = 0; // flaky: graphHopperStorage7.getOtherNode(100, (int) (short) 1);
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
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        com.graphhopper.util.DistanceCalcEarth distanceCalcEarth0 = new com.graphhopper.util.DistanceCalcEarth();
        double double7 = distanceCalcEarth0.calcDist3D((double) 'a', (double) (short) 1, (double) (byte) -1, (double) 100.0f, (double) (short) 100, (double) (short) 1);
        double double9 = distanceCalcEarth0.calcCircumference((double) 1);
        com.graphhopper.util.PointList pointList10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = distanceCalcEarth0.calcDistance(pointList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1451566.8463946683d + "'", double7 == 1451566.8463946683d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0024076802712575E7d + "'", double9 == 4.0024076802712575E7d);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        com.graphhopper.routing.ev.RouteNetwork routeNetwork1 = com.graphhopper.routing.ev.RouteNetwork.find("max_length");
        org.junit.Assert.assertTrue("'" + routeNetwork1 + "' != '" + com.graphhopper.routing.ev.RouteNetwork.MISSING + "'", routeNetwork1.equals(com.graphhopper.routing.ev.RouteNetwork.MISSING));
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap2 = new com.graphhopper.coll.GHIntLongHashMap((-2), 116.0d);
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.hppc.BufferAllocationException; message: The load factor should be in range [0.01, 0.99]: 116.000000");
        } catch (com.carrotsearch.hppc.BufferAllocationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        virtualEdgeIteratorState11.setUnfavored(true);
        int int14 = virtualEdgeIteratorState11.getOriginalEdgeKey();
        int int15 = virtualEdgeIteratorState11.getAdjNode();
        int int16 = virtualEdgeIteratorState11.getAdjNode();
        double double17 = virtualEdgeIteratorState11.getDistance();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue18 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        double double19 = virtualEdgeIteratorState11.getReverse(decimalEncodedValue18);
        com.graphhopper.storage.IntsRef intsRef22 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        java.lang.String str23 = intsRef22.toString();
        // The following exception was thrown during execution in test generation
        try {
            decimalEncodedValue18.setDecimal(false, intsRef22, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Call init before usage for EncodedValue max_axle_load|version=-1916217613|bits=7|index=0|shift=-1|store_both_directions=false");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1048576 + "'", int14 == 1048576);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertNotNull(decimalEncodedValue18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + Double.POSITIVE_INFINITY + "'", double19 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[0 0 0 0 0 0 0 0 0 0]" + "'", str23, "[0 0 0 0 0 0 0 0 0 0]");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.graphhopper.util.DouglasPeucker douglasPeucker0 = new com.graphhopper.util.DouglasPeucker();
        com.graphhopper.util.PointList pointList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = douglasPeucker0.simplify(pointList1, (int) (byte) -1, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        com.graphhopper.GraphHopper graphHopper0 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        com.graphhopper.GraphHopper graphHopper2 = graphHopper0.setFlagEncoderFactory(flagEncoderFactory1);
        com.graphhopper.reader.dem.MultiSourceElevationProvider multiSourceElevationProvider3 = new com.graphhopper.reader.dem.MultiSourceElevationProvider();
        double double6 = multiSourceElevationProvider3.getEle((double) 0.0f, 0.0d);
        com.graphhopper.GraphHopper graphHopper7 = graphHopper0.setElevationProvider((com.graphhopper.reader.dem.ElevationProvider) multiSourceElevationProvider3);
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile9 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str10 = customProfile9.toString();
        com.graphhopper.config.Profile profile13 = customProfile9.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        int int14 = profile13.getVersion();
        com.graphhopper.config.Profile profile16 = profile13.setVehicle("1111111111");
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile18 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str19 = customProfile18.toString();
        com.graphhopper.config.Profile profile22 = customProfile18.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        int int23 = profile22.getVersion();
        com.graphhopper.config.Profile profile25 = profile22.setVehicle("1111111111");
        com.graphhopper.util.PMap pMap26 = profile22.getHints();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.Weighting weighting27 = graphHopper7.createWeighting(profile16, pMap26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphHopper2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(graphHopper7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str10, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1909399913) + "'", int14 == (-1909399913));
        org.junit.Assert.assertNotNull(profile16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str19, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1909399913) + "'", int23 == (-1909399913));
        org.junit.Assert.assertNotNull(profile25);
        org.junit.Assert.assertNotNull(pMap26);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        java.io.File file0 = null;
        com.graphhopper.storage.SimpleFSLockFactory simpleFSLockFactory1 = new com.graphhopper.storage.SimpleFSLockFactory(file0);
        // The following exception was thrown during execution in test generation
        try {
            simpleFSLockFactory1.forceRemove("skadi", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
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
        java.util.Random random23 = null;
        com.graphhopper.routing.ev.SimpleBooleanEncodedValue simpleBooleanEncodedValue30 = new com.graphhopper.routing.ev.SimpleBooleanEncodedValue("srtm");
        com.graphhopper.util.details.BooleanDetails booleanDetails31 = new com.graphhopper.util.details.BooleanDetails("....      ", (com.graphhopper.routing.ev.BooleanEncodedValue) simpleBooleanEncodedValue30);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue32 = com.graphhopper.routing.ev.MaxWeight.create();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.GHUtility.buildRandomGraph((com.graphhopper.storage.Graph) graphHopperStorage7, random23, 96, (double) 0, true, true, (com.graphhopper.routing.ev.BooleanEncodedValue) simpleBooleanEncodedValue30, decimalEncodedValue32, (java.lang.Double) 0.7d, (double) 4, (double) (byte) -1, 0.4449835254204146d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: numNodes must be >= 2, meanDegree >= 1");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(decimalEncodedValue32);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        com.graphhopper.routing.util.FlagEncoder flagEncoder0 = null;
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
        com.graphhopper.storage.TurnCostStorage turnCostStorage22 = graphHopperStorage21.getTurnCostStorage();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.DefaultTurnCostProvider defaultTurnCostProvider24 = new com.graphhopper.routing.weighting.DefaultTurnCostProvider(flagEncoder0, turnCostStorage22, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
        org.junit.Assert.assertNotNull(turnCostStorage22);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        com.graphhopper.GraphHopper graphHopper0 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        com.graphhopper.GraphHopper graphHopper2 = graphHopper0.setFlagEncoderFactory(flagEncoderFactory1);
        com.graphhopper.routing.util.spatialrules.SpatialRuleLookup spatialRuleLookup3 = com.graphhopper.routing.util.spatialrules.SpatialRuleLookup.EMPTY;
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState12 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef6, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int13 = edgeIteratorState12.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue14 = com.graphhopper.routing.ev.Country.create();
        boolean boolean15 = countryEnumEncodedValue14.isStoreTwoDirections();
        com.graphhopper.routing.ev.Country country16 = edgeIteratorState12.getReverse(countryEnumEncodedValue14);
        com.graphhopper.routing.util.parsers.SpatialRuleParser spatialRuleParser17 = new com.graphhopper.routing.util.parsers.SpatialRuleParser(spatialRuleLookup3, (com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue14);
        org.locationtech.jts.geom.Envelope envelope18 = spatialRuleLookup3.getBounds();
        com.graphhopper.util.JsonFeatureCollection[] jsonFeatureCollectionArray19 = new com.graphhopper.util.JsonFeatureCollection[] {};
        java.util.ArrayList<com.graphhopper.util.JsonFeatureCollection> jsonFeatureCollectionList20 = new java.util.ArrayList<com.graphhopper.util.JsonFeatureCollection>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.util.JsonFeatureCollection>) jsonFeatureCollectionList20, jsonFeatureCollectionArray19);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.spatialrules.SpatialRuleLookupHelper.buildAndInjectCountrySpatialRules(graphHopper0, envelope18, (java.util.List<com.graphhopper.util.JsonFeatureCollection>) jsonFeatureCollectionList20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Input JsonFeatureCollection cannot be empty. Subset: [deu, aut], original.size:0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphHopper2);
        org.junit.Assert.assertNotNull(spatialRuleLookup3);
        org.junit.Assert.assertNotNull(edgeIteratorState12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + country16 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country16.equals(com.graphhopper.routing.ev.Country.DEFAULT));
        org.junit.Assert.assertNotNull(envelope18);
        org.junit.Assert.assertNotNull(jsonFeatureCollectionArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.graphhopper.coll.GHSortedCollection gHSortedCollection0 = new com.graphhopper.coll.GHSortedCollection();
        int int1 = gHSortedCollection0.getSlidingMeanValue();
        java.lang.String str2 = gHSortedCollection0.toString();
        gHSortedCollection0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "size=0, treeMap.size=0, averageNo=NaN, minNo=2147483647, maxNo=-2147483648" + "'", str2, "size=0, treeMap.size=0, averageNo=NaN, minNo=2147483647, maxNo=-2147483648");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        java.util.Random random1 = null;
        com.carrotsearch.hppc.IntArrayList intArrayList2 = com.graphhopper.util.ArrayUtil.permutation((int) (short) 1, random1);
        com.graphhopper.coll.GHIntHashSet gHIntHashSet3 = new com.graphhopper.coll.GHIntHashSet((com.carrotsearch.hppc.IntContainer) intArrayList2);
        com.graphhopper.coll.GHTBitSet gHTBitSet4 = new com.graphhopper.coll.GHTBitSet(gHIntHashSet3);
        gHTBitSet4.clear();
        org.junit.Assert.assertNotNull(intArrayList2);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHLongHashSet gHLongHashSet1 = new com.graphhopper.coll.GHLongHashSet((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of elements must be >= 0: -4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        com.graphhopper.routing.Path path30 = path21.setEndNode((int) 'a');
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
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser[] oSMMaxWidthParserArray0 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser[] {};
        int[] intArray1 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet2 = com.graphhopper.coll.GHIntHashSet.from(intArray1);
        int int3 = intHashSet2.size();
        int[] intArray4 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet5 = com.graphhopper.coll.GHIntHashSet.from(intArray4);
        int int6 = intHashSet5.size();
        int[] intArray7 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet8 = com.graphhopper.coll.GHIntHashSet.from(intArray7);
        int int9 = intHashSet8.size();
        boolean boolean11 = intHashSet8.remove((int) (short) -1);
        boolean boolean13 = intHashSet8.add((-4));
        int[] intArray14 = intHashSet8.keys;
        intHashSet5.keys = intArray14;
        int int16 = intHashSet2.addAll(intArray14);
        // The following exception was thrown during execution in test generation
        try {
            com.carrotsearch.hppc.ObjectIntHashMap<com.graphhopper.routing.util.parsers.OSMMaxWidthParser> oSMMaxWidthParserObjectIntHashMap17 = com.carrotsearch.hppc.ObjectIntHashMap.from(oSMMaxWidthParserArray0, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arrays of keys and values must have an identical length.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(oSMMaxWidthParserArray0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intHashSet2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intHashSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intHashSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, -4, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        com.graphhopper.routing.util.TestAlgoCollector.OneRun oneRun0 = new com.graphhopper.routing.util.TestAlgoCollector.OneRun();
        // The following exception was thrown during execution in test generation
        try {
            oneRun0.setDistance((int) 'a', 1451566.8463946683d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
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
        java.util.List<java.lang.String> strList23 = path21.getDescription();
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
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge prepareBaseEdge5 = new com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge(100, (int) (short) -1, (int) (short) 10, (float) (byte) -1, (float) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = prepareBaseEdge5.getSkipped1();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        com.graphhopper.routing.ch.AStarCHEntry aStarCHEntry3 = new com.graphhopper.routing.ch.AStarCHEntry(2, (double) 10L, (double) 2);
        double double4 = aStarCHEntry3.weight;
        aStarCHEntry3.weightOfVisitedPath = (short) 0;
        int int7 = aStarCHEntry3.edge;
        double double8 = aStarCHEntry3.weight;
        java.lang.String str9 = aStarCHEntry3.toString();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2 (-1) weight: 10.0, incEdge: -1" + "'", str9, "2 (-1) weight: 10.0, incEdge: -1");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap1 = new com.graphhopper.coll.GHIntLongHashMap((int) (byte) 1);
        boolean boolean3 = gHIntLongHashMap1.indexExists((int) (byte) 1);
        long long5 = gHIntLongHashMap1.remove((int) (short) -1);
        long long8 = gHIntLongHashMap1.addTo(2, (long) 5);
        com.carrotsearch.hppc.IntLongHashMap.KeysContainer keysContainer9 = gHIntLongHashMap1.keys();
        com.carrotsearch.hppc.predicates.IntPredicate intPredicate10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = gHIntLongHashMap1.removeAll(intPredicate10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5L + "'", long8 == 5L);
        org.junit.Assert.assertNotNull(keysContainer9);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        com.graphhopper.GraphHopperConfig graphHopperConfig0 = new com.graphhopper.GraphHopperConfig();
        float float3 = graphHopperConfig0.getFloat("prepare.ch.node.original_edge_count_weight", (float) '#');
        float float6 = graphHopperConfig0.getFloat("skadi", (float) 100L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage0 = null;
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.RoadEnvironment> roadEnvironmentEnumEncodedValue1 = null;
        com.graphhopper.routing.ev.RoadEnvironment roadEnvironment2 = com.graphhopper.routing.ev.RoadEnvironment.TUNNEL;
        com.graphhopper.reader.dem.EdgeElevationInterpolator edgeElevationInterpolator3 = new com.graphhopper.reader.dem.EdgeElevationInterpolator(graphHopperStorage0, roadEnvironmentEnumEncodedValue1, roadEnvironment2);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage4 = edgeElevationInterpolator3.getStorage();
        // The following exception was thrown during execution in test generation
        try {
            edgeElevationInterpolator3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + roadEnvironment2 + "' != '" + com.graphhopper.routing.ev.RoadEnvironment.TUNNEL + "'", roadEnvironment2.equals(com.graphhopper.routing.ev.RoadEnvironment.TUNNEL));
        org.junit.Assert.assertNull(graphHopperStorage4);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        com.graphhopper.storage.NodeAccess nodeAccess0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator2 = new com.graphhopper.routing.weighting.BeelineWeightApproximator(nodeAccess0, weighting1);
        // The following exception was thrown during execution in test generation
        try {
            beelineWeightApproximator2.setTo(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        com.graphhopper.routing.ev.RoadEnvironment roadEnvironment0 = com.graphhopper.routing.ev.RoadEnvironment.OTHER;
        org.junit.Assert.assertTrue("'" + roadEnvironment0 + "' != '" + com.graphhopper.routing.ev.RoadEnvironment.OTHER + "'", roadEnvironment0.equals(com.graphhopper.routing.ev.RoadEnvironment.OTHER));
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.util.PointList pointList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState2 = disabledEdgeIterator0.setWayGeometry(pointList1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        com.graphhopper.storage.MMapDirectory mMapDirectory1 = new com.graphhopper.storage.MMapDirectory("profiles:\nprofiles_ch:\nprofiles_lm:\nproperties:\n");
        boolean boolean2 = mMapDirectory1.isStoring();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        com.graphhopper.storage.VLongStorage vLongStorage1 = new com.graphhopper.storage.VLongStorage((int) '4');
        long long2 = vLongStorage1.readVLong();
        long long3 = vLongStorage1.getLength();
        long long4 = vLongStorage1.getLength();
        vLongStorage1.trimToSize();
        long long6 = vLongStorage1.getPosition();
        vLongStorage1.seek((long) 21);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        com.graphhopper.routing.AlgorithmOptions.Builder builder0 = new com.graphhopper.routing.AlgorithmOptions.Builder();
        com.graphhopper.routing.AlgorithmOptions.Builder builder2 = builder0.maxVisitedNodes(0);
        com.graphhopper.routing.weighting.Weighting weighting3 = null;
        com.graphhopper.routing.AlgorithmOptions.Builder builder4 = builder2.weighting(weighting3);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        java.util.Random random0 = null;
        com.graphhopper.routing.util.tour.MultiPointTour multiPointTour4 = new com.graphhopper.routing.util.tour.MultiPointTour(random0, (double) 10.0f, 11, (double) ' ');
        int int5 = multiPointTour4.getNumberOfGeneratedPoints();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
        // The following exception was thrown during execution in test generation
        try {
            gHBitSetImpl6.flip((int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex: 100 > toIndex: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[0 0 0 0 0 0 0 0 0 0]" + "'", str2, "[0 0 0 0 0 0 0 0 0 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(gHBitSet11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        long[] longArray5 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet6 = com.carrotsearch.hppc.LongHashSet.from(longArray5);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray7 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager8 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray7);
        com.graphhopper.storage.GraphBuilder graphBuilder9 = new com.graphhopper.storage.GraphBuilder(encodingManager8);
        boolean boolean10 = longHashSet6.equals((java.lang.Object) encodingManager8);
        longHashSet6.ensureCapacity(10);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet6);
        org.junit.Assert.assertNotNull(flagEncoderArray7);
        org.junit.Assert.assertNotNull(encodingManager8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        com.graphhopper.reader.osm.conditional.DateRangeParser dateRangeParser0 = new com.graphhopper.reader.osm.conditional.DateRangeParser();
        com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState conditionState2 = dateRangeParser0.checkCondition("3.0");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.osm.conditional.DateRange dateRange4 = dateRangeParser0.getRange("srtmgl1");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparsable date: \"srtmgl1\"");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + conditionState2 + "' != '" + com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.FALSE + "'", conditionState2.equals(com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.FALSE));
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        virtualEdgeIteratorState11.setUnfavored(true);
        int int14 = virtualEdgeIteratorState11.getOriginalEdgeKey();
        int int15 = virtualEdgeIteratorState11.getAdjNode();
        int int16 = virtualEdgeIteratorState11.getAdjNode();
        double double17 = virtualEdgeIteratorState11.getDistance();
        com.graphhopper.util.EdgeIteratorState edgeIteratorState19 = virtualEdgeIteratorState11.detach(false);
        com.graphhopper.storage.IntsRef intsRef22 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState28 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef22, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int29 = edgeIteratorState28.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue30 = com.graphhopper.routing.ev.Country.create();
        boolean boolean31 = countryEnumEncodedValue30.isStoreTwoDirections();
        com.graphhopper.routing.ev.Country country32 = edgeIteratorState28.getReverse(countryEnumEncodedValue30);
        com.graphhopper.storage.IntsRef intsRef40 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean41 = intsRef40.isEmpty();
        com.graphhopper.util.PointList pointList43 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState45 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef40, "hike_rating", pointList43, false);
        int int46 = countryEnumEncodedValue30.getInt(true, intsRef40);
        com.graphhopper.routing.ev.Country country47 = com.graphhopper.routing.ev.Country.DEU;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState48 = virtualEdgeIteratorState11.setReverse(countryEnumEncodedValue30, country47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: EncodedValue country not initialized");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1048576 + "'", int14 == 1048576);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertNotNull(edgeIteratorState19);
        org.junit.Assert.assertNotNull(edgeIteratorState28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + country32 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country32.equals(com.graphhopper.routing.ev.Country.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + country47 + "' != '" + com.graphhopper.routing.ev.Country.DEU + "'", country47.equals(com.graphhopper.routing.ev.Country.DEU));
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        com.graphhopper.storage.DAType.MemRef memRef0 = null;
        com.graphhopper.storage.DAType dAType4 = new com.graphhopper.storage.DAType(memRef0, false, true, true);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        com.graphhopper.apache.commons.collections.IntFloatBinaryHeap intFloatBinaryHeap0 = new com.graphhopper.apache.commons.collections.IntFloatBinaryHeap();
        int int1 = intFloatBinaryHeap0.getSize();
        int int2 = intFloatBinaryHeap0.getSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        java.lang.String str0 = com.graphhopper.routing.util.FlagEncoderFactory.CAR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "car" + "'", str0, "car");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        com.graphhopper.util.TranslationMap translationMap0 = new com.graphhopper.util.TranslationMap();
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.TranslationMap translationMap2 = translationMap0.doImport(file1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.io.FileNotFoundException: ar.txt (Arquivo ou direto?rio inexistente)");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        long[] longArray5 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet6 = com.carrotsearch.hppc.LongHashSet.from(longArray5);
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap8 = new com.graphhopper.coll.GHLongLongHashMap(1);
        java.util.Spliterator<com.carrotsearch.hppc.cursors.LongLongCursor> longLongCursorSpliterator9 = gHLongLongHashMap8.spliterator();
        com.carrotsearch.hppc.LongLongHashMap.KeysContainer keysContainer10 = gHLongLongHashMap8.keys();
        int int11 = longHashSet6.retainAll((com.carrotsearch.hppc.LongLookupContainer) keysContainer10);
        long[] longArray12 = new long[] {};
        int int13 = longHashSet6.addAll(longArray12);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue14 = null;
        com.graphhopper.routing.util.parsers.OSMMaxHeightParser oSMMaxHeightParser15 = new com.graphhopper.routing.util.parsers.OSMMaxHeightParser(decimalEncodedValue14);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue16 = null;
        com.graphhopper.routing.util.parsers.OSMMaxHeightParser oSMMaxHeightParser17 = new com.graphhopper.routing.util.parsers.OSMMaxHeightParser(decimalEncodedValue16);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue18 = null;
        com.graphhopper.routing.util.parsers.OSMMaxHeightParser oSMMaxHeightParser19 = new com.graphhopper.routing.util.parsers.OSMMaxHeightParser(decimalEncodedValue18);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue20 = null;
        com.graphhopper.routing.util.parsers.OSMMaxHeightParser oSMMaxHeightParser21 = new com.graphhopper.routing.util.parsers.OSMMaxHeightParser(decimalEncodedValue20);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue22 = null;
        com.graphhopper.routing.util.parsers.OSMMaxHeightParser oSMMaxHeightParser23 = new com.graphhopper.routing.util.parsers.OSMMaxHeightParser(decimalEncodedValue22);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue24 = null;
        com.graphhopper.routing.util.parsers.OSMMaxHeightParser oSMMaxHeightParser25 = new com.graphhopper.routing.util.parsers.OSMMaxHeightParser(decimalEncodedValue24);
        com.graphhopper.routing.util.parsers.OSMMaxHeightParser[] oSMMaxHeightParserArray26 = new com.graphhopper.routing.util.parsers.OSMMaxHeightParser[] { oSMMaxHeightParser15, oSMMaxHeightParser17, oSMMaxHeightParser19, oSMMaxHeightParser21, oSMMaxHeightParser23, oSMMaxHeightParser25 };
        // The following exception was thrown during execution in test generation
        try {
            com.carrotsearch.hppc.LongObjectHashMap<com.graphhopper.routing.util.parsers.OSMMaxHeightParser> oSMMaxHeightParserLongObjectHashMap27 = com.carrotsearch.hppc.LongObjectHashMap.from(longArray12, oSMMaxHeightParserArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arrays of keys and values must have an identical length.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet6);
        org.junit.Assert.assertNotNull(longLongCursorSpliterator9);
        org.junit.Assert.assertNotNull(keysContainer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(oSMMaxHeightParserArray26);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        com.carrotsearch.hppc.IntArrayList intArrayList2 = com.graphhopper.util.ArrayUtil.range(2, 3);
        org.junit.Assert.assertNotNull(intArrayList2);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        java.lang.String str2 = com.graphhopper.routing.util.EncodingManager.getKey("prepare.ch.node.original_edge_count_weight", "foot_network");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "prepare.ch.node.original_edge_count_weight$foot_network" + "'", str2, "prepare.ch.node.original_edge_count_weight$foot_network");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.UnsignedDecimalEncodedValue unsignedDecimalEncodedValue5 = new com.graphhopper.routing.ev.UnsignedDecimalEncodedValue("", 32, (double) 50, 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue name wasn't valid: . Use lower case letters, underscore and numbers only.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap0 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>();
        strComparableGHIntObjectHashMap0.ensureCapacity((int) (short) 0);
        boolean boolean4 = false; // flaky: strComparableGHIntObjectHashMap0.indexExists((int) ' ');
        java.util.Iterator<com.carrotsearch.hppc.cursors.IntObjectCursor<java.lang.Comparable<java.lang.String>>> strComparableIntObjectCursorItor5 = strComparableGHIntObjectHashMap0.iterator();
// flaky:         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableIntObjectCursorItor5);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        com.graphhopper.routing.ev.RoadClass roadClass0 = com.graphhopper.routing.ev.RoadClass.OTHER;
        org.junit.Assert.assertTrue("'" + roadClass0 + "' != '" + com.graphhopper.routing.ev.RoadClass.OTHER + "'", roadClass0.equals(com.graphhopper.routing.ev.RoadClass.OTHER));
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        java.lang.Class<com.graphhopper.routing.util.EncodingManager.Access> accessClass1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.util.EncodingManager.Access> accessEnumEncodedValue2 = new com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.util.EncodingManager.Access>("bike$turn_cost", accessClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        com.graphhopper.routing.Path path24 = path21.addTime((long) (-1909399913));
        com.graphhopper.routing.Path path26 = path21.setWeight((double) 96);
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
        org.junit.Assert.assertNotNull(path24);
        org.junit.Assert.assertNotNull(path26);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.LITTLE;
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl2 = new com.graphhopper.coll.GHBitSetImpl((int) (short) 100);
        byte[] byteArray3 = gHBitSetImpl2.toByteArray();
        byte[] byteArray4 = gHBitSetImpl2.toByteArray();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bitUtil0.toInt(byteArray4, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 55");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph> cHPreparationGraphGHLongObjectHashMap0 = new com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph>();
        cHPreparationGraphGHLongObjectHashMap0.ensureCapacity(1048576);
        com.carrotsearch.hppc.LongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph> cHPreparationGraphLongObjectHashMap3 = cHPreparationGraphGHLongObjectHashMap0.clone();
        com.graphhopper.coll.GHLongHashSet gHLongHashSet5 = new com.graphhopper.coll.GHLongHashSet(2);
        int int6 = cHPreparationGraphGHLongObjectHashMap0.removeAll((com.carrotsearch.hppc.LongContainer) gHLongHashSet5);
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap8 = new com.graphhopper.coll.GHLongLongHashMap(1);
        long[] longArray14 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet15 = com.carrotsearch.hppc.LongHashSet.from(longArray14);
        gHLongLongHashMap8.keys = longArray14;
        gHLongHashSet5.keys = longArray14;
        org.junit.Assert.assertNotNull(cHPreparationGraphLongObjectHashMap3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet15);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        long[] longArray5 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet6 = com.carrotsearch.hppc.LongHashSet.from(longArray5);
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap8 = new com.graphhopper.coll.GHLongLongHashMap(1);
        java.util.Spliterator<com.carrotsearch.hppc.cursors.LongLongCursor> longLongCursorSpliterator9 = gHLongLongHashMap8.spliterator();
        com.carrotsearch.hppc.LongLongHashMap.KeysContainer keysContainer10 = gHLongLongHashMap8.keys();
        int int11 = longHashSet6.retainAll((com.carrotsearch.hppc.LongLookupContainer) keysContainer10);
        long[] longArray12 = new long[] {};
        int int13 = longHashSet6.addAll(longArray12);
        boolean boolean15 = false; // flaky: longHashSet6.indexExists(11);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = 0L; // flaky: longHashSet6.indexGet((int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet6);
        org.junit.Assert.assertNotNull(longLongCursorSpliterator9);
        org.junit.Assert.assertNotNull(keysContainer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        com.graphhopper.routing.util.EncodingManager.Builder builder0 = com.graphhopper.routing.util.EncodingManager.start();
        com.graphhopper.routing.util.EncodingManager.Builder builder1 = com.graphhopper.routing.util.EncodingManager.start();
        com.graphhopper.reader.osm.conditional.DateRangeParser dateRangeParser2 = new com.graphhopper.reader.osm.conditional.DateRangeParser();
        com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState conditionState4 = dateRangeParser2.checkCondition("3.0");
        com.graphhopper.routing.util.EncodingManager.Builder builder5 = builder1.setDateRangeParser(dateRangeParser2);
        com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser oSMFootNetworkTagParser6 = new com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser();
        com.graphhopper.routing.util.EncodingManager.Builder builder7 = builder1.addRelationTagParser((com.graphhopper.routing.util.parsers.RelationTagParser) oSMFootNetworkTagParser6);
        com.graphhopper.routing.util.EncodingManager.Builder builder8 = builder0.addRelationTagParser((com.graphhopper.routing.util.parsers.RelationTagParser) oSMFootNetworkTagParser6);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertTrue("'" + conditionState4 + "' != '" + com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.FALSE + "'", conditionState4.equals(com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.FALSE));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        int[] intArray0 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet1 = com.graphhopper.coll.GHIntHashSet.from(intArray0);
        int int2 = intHashSet1.size();
        int[] intArray3 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet4 = com.graphhopper.coll.GHIntHashSet.from(intArray3);
        int int5 = intHashSet4.size();
        int[] intArray6 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet7 = com.graphhopper.coll.GHIntHashSet.from(intArray6);
        int int8 = intHashSet7.size();
        boolean boolean10 = intHashSet7.remove((int) (short) -1);
        boolean boolean12 = intHashSet7.add((-4));
        int[] intArray13 = intHashSet7.keys;
        intHashSet4.keys = intArray13;
        int int15 = intHashSet1.addAll(intArray13);
        java.util.Iterator<com.carrotsearch.hppc.cursors.IntCursor> intCursorItor16 = intHashSet1.iterator();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intHashSet1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intHashSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intHashSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, -4, 0, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(intCursorItor16);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray0 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager1 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray0);
        com.graphhopper.storage.GraphBuilder graphBuilder2 = new com.graphhopper.storage.GraphBuilder(encodingManager1);
        java.util.List<com.graphhopper.storage.CHConfig> cHConfigList3 = null;
        com.graphhopper.storage.GraphBuilder graphBuilder4 = graphBuilder2.setCHConfigs(cHConfigList3);
        com.graphhopper.storage.CHConfig[] cHConfigArray5 = new com.graphhopper.storage.CHConfig[] {};
        java.util.ArrayList<com.graphhopper.storage.CHConfig> cHConfigList6 = new java.util.ArrayList<com.graphhopper.storage.CHConfig>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.storage.CHConfig>) cHConfigList6, cHConfigArray5);
        com.graphhopper.storage.GraphBuilder graphBuilder8 = graphBuilder4.setCHConfigs((java.util.List<com.graphhopper.storage.CHConfig>) cHConfigList6);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray9 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager10 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray9);
        com.graphhopper.storage.GraphBuilder graphBuilder11 = new com.graphhopper.storage.GraphBuilder(encodingManager10);
        java.util.List<com.graphhopper.storage.CHConfig> cHConfigList12 = null;
        com.graphhopper.storage.GraphBuilder graphBuilder13 = graphBuilder11.setCHConfigs(cHConfigList12);
        com.graphhopper.storage.CHConfig[] cHConfigArray14 = new com.graphhopper.storage.CHConfig[] {};
        java.util.ArrayList<com.graphhopper.storage.CHConfig> cHConfigList15 = new java.util.ArrayList<com.graphhopper.storage.CHConfig>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.storage.CHConfig>) cHConfigList15, cHConfigArray14);
        com.graphhopper.storage.GraphBuilder graphBuilder17 = graphBuilder13.setCHConfigs((java.util.List<com.graphhopper.storage.CHConfig>) cHConfigList15);
        com.graphhopper.storage.GraphBuilder graphBuilder18 = graphBuilder17.setRAM();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray19 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager20 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray19);
        com.graphhopper.storage.GraphBuilder graphBuilder21 = new com.graphhopper.storage.GraphBuilder(encodingManager20);
        java.util.List<com.graphhopper.storage.CHConfig> cHConfigList22 = null;
        com.graphhopper.storage.GraphBuilder graphBuilder23 = graphBuilder21.setCHConfigs(cHConfigList22);
        com.graphhopper.storage.CHConfig[] cHConfigArray24 = new com.graphhopper.storage.CHConfig[] {};
        java.util.ArrayList<com.graphhopper.storage.CHConfig> cHConfigList25 = new java.util.ArrayList<com.graphhopper.storage.CHConfig>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.storage.CHConfig>) cHConfigList25, cHConfigArray24);
        com.graphhopper.storage.GraphBuilder graphBuilder27 = graphBuilder23.setCHConfigs((java.util.List<com.graphhopper.storage.CHConfig>) cHConfigList25);
        com.graphhopper.storage.GraphBuilder graphBuilder28 = graphBuilder18.setCHConfigs((java.util.List<com.graphhopper.storage.CHConfig>) cHConfigList25);
        com.graphhopper.storage.GraphBuilder graphBuilder29 = graphBuilder4.setCHConfigs((java.util.List<com.graphhopper.storage.CHConfig>) cHConfigList25);
        org.junit.Assert.assertNotNull(flagEncoderArray0);
        org.junit.Assert.assertNotNull(encodingManager1);
        org.junit.Assert.assertNotNull(graphBuilder4);
        org.junit.Assert.assertNotNull(cHConfigArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(graphBuilder8);
        org.junit.Assert.assertNotNull(flagEncoderArray9);
        org.junit.Assert.assertNotNull(encodingManager10);
        org.junit.Assert.assertNotNull(graphBuilder13);
        org.junit.Assert.assertNotNull(cHConfigArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(graphBuilder17);
        org.junit.Assert.assertNotNull(graphBuilder18);
        org.junit.Assert.assertNotNull(flagEncoderArray19);
        org.junit.Assert.assertNotNull(encodingManager20);
        org.junit.Assert.assertNotNull(graphBuilder23);
        org.junit.Assert.assertNotNull(cHConfigArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(graphBuilder27);
        org.junit.Assert.assertNotNull(graphBuilder28);
        org.junit.Assert.assertNotNull(graphBuilder29);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        com.graphhopper.storage.NodeAccess nodeAccess0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator2 = new com.graphhopper.routing.weighting.BeelineWeightApproximator(nodeAccess0, weighting1);
        com.graphhopper.util.DistanceCalcEarth distanceCalcEarth3 = new com.graphhopper.util.DistanceCalcEarth();
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator4 = beelineWeightApproximator2.setDistanceCalc((com.graphhopper.util.DistanceCalc) distanceCalcEarth3);
        double double6 = distanceCalcEarth3.calcDenormalizedDist((double) 1L);
        org.junit.Assert.assertNotNull(beelineWeightApproximator4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.001508679602057E7d + "'", double6 == 2.001508679602057E7d);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        com.graphhopper.coll.GHSortedCollection gHSortedCollection0 = new com.graphhopper.coll.GHSortedCollection();
        int int1 = gHSortedCollection0.getSlidingMeanValue();
        gHSortedCollection0.insert((int) (short) 0, (int) '4');
        int int5 = gHSortedCollection0.peekKey();
        int int6 = gHSortedCollection0.pollKey();
        gHSortedCollection0.insert(2, 4);
        // The following exception was thrown during execution in test generation
        try {
            gHSortedCollection0.update(11, (-3), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: cannot remove key 11 with value -3 - did you insert 11,-3 before?");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        com.graphhopper.util.shapes.BBox bBox4 = new com.graphhopper.util.shapes.BBox((double) 0L, (double) (short) 0, (double) (byte) 1, 100.0d);
        double double5 = bBox4.minLat;
        bBox4.minEle = 20;
        com.graphhopper.util.shapes.BBox bBox8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.shapes.BBox bBox9 = bBox4.calculateIntersection(bBox8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState conditionState0 = com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.FALSE;
        boolean boolean1 = conditionState0.isValid();
        boolean boolean2 = conditionState0.isCheckPassed();
        boolean boolean3 = conditionState0.isCheckPassed();
        org.junit.Assert.assertTrue("'" + conditionState0 + "' != '" + com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.FALSE + "'", conditionState0.equals(com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.FALSE));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap3 = new com.graphhopper.coll.OSMIDMap(directory2);
        com.graphhopper.search.StringIndex stringIndex5 = new com.graphhopper.search.StringIndex(directory2, 10);
        com.graphhopper.storage.RAMDirectory rAMDirectory7 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory8 = rAMDirectory7.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap9 = new com.graphhopper.coll.OSMIDMap(directory8);
        com.graphhopper.search.StringIndex stringIndex11 = new com.graphhopper.search.StringIndex(directory8, 10);
        stringIndex5.copyTo(stringIndex11);
        stringIndex5.setSegmentSize((int) (byte) 10);
        stringIndex5.close();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(directory8);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue31 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState34 = virtualEdgeIteratorState14.set(booleanEncodedValue31, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue reverse supports only one direction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(countryEnumEncodedValue1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(decimalEncodedValue26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + Double.POSITIVE_INFINITY + "'", double27 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(edgeIteratorState29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(booleanEncodedValue31);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        com.graphhopper.storage.IntsRef intsRef43 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean44 = intsRef43.isEmpty();
        com.graphhopper.util.PointList pointList46 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState48 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef43, "hike_rating", pointList46, false);
        int int49 = countryEnumEncodedValue33.getInt(true, intsRef43);
        int int50 = countryEnumEncodedValue33.getMaxInt();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState52 = virtualEdgeIteratorState11.set((com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue33, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: EncodedValue country not initialized");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        long[] longArray5 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet6 = com.carrotsearch.hppc.LongHashSet.from(longArray5);
        java.util.Iterator<com.carrotsearch.hppc.cursors.LongCursor> longCursorItor7 = longHashSet6.iterator();
        com.carrotsearch.hppc.LongHashSet longHashSet8 = longHashSet6.clone();
        int int9 = longHashSet6.size();
        boolean boolean11 = longHashSet6.add((long) (short) 100);
        boolean boolean13 = longHashSet6.indexExists((-1));
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet6);
        org.junit.Assert.assertNotNull(longCursorItor7);
        org.junit.Assert.assertNotNull(longHashSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        long[] longArray3 = new long[] { (byte) 0, 1L, (-3L) };
        com.graphhopper.routing.util.PriorityCode priorityCode4 = com.graphhopper.routing.util.PriorityCode.PREFER;
        int int5 = priorityCode4.getValue();
        com.graphhopper.routing.util.PriorityCode priorityCode6 = com.graphhopper.routing.util.PriorityCode.UNCHANGED;
        com.graphhopper.routing.util.PriorityCode priorityCode7 = com.graphhopper.routing.util.PriorityCode.PREFER;
        int int8 = priorityCode7.getValue();
        com.graphhopper.routing.util.PriorityCode[] priorityCodeArray9 = new com.graphhopper.routing.util.PriorityCode[] { priorityCode4, priorityCode6, priorityCode7 };
        com.carrotsearch.hppc.LongObjectHashMap<com.graphhopper.routing.util.PriorityCode> priorityCodeLongObjectHashMap10 = com.carrotsearch.hppc.LongObjectHashMap.from(longArray3, priorityCodeArray9);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 1, -3]");
        org.junit.Assert.assertTrue("'" + priorityCode4 + "' != '" + com.graphhopper.routing.util.PriorityCode.PREFER + "'", priorityCode4.equals(com.graphhopper.routing.util.PriorityCode.PREFER));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + priorityCode6 + "' != '" + com.graphhopper.routing.util.PriorityCode.UNCHANGED + "'", priorityCode6.equals(com.graphhopper.routing.util.PriorityCode.UNCHANGED));
        org.junit.Assert.assertTrue("'" + priorityCode7 + "' != '" + com.graphhopper.routing.util.PriorityCode.PREFER + "'", priorityCode7.equals(com.graphhopper.routing.util.PriorityCode.PREFER));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(priorityCodeArray9);
        org.junit.Assert.assertNotNull(priorityCodeLongObjectHashMap10);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.LITTLE;
        java.lang.String str2 = bitUtil0.toBitString((long) (-4));
        byte[] byteArray4 = bitUtil0.fromBitString("_network");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = bitUtil0.toBitString(4294967306L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111100" + "'", str2, "1111111111111111111111111111111111111111111111111111111111111100");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.LITTLE;
        long long3 = bitUtil0.combineIntsToLong(10, (int) (byte) 1);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl5 = new com.graphhopper.coll.GHBitSetImpl((int) (short) 100);
        byte[] byteArray6 = gHBitSetImpl5.toByteArray();
        // The following exception was thrown during execution in test generation
        try {
            bitUtil0.fromDouble(byteArray6, 4.003017359204114E7d, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4294967306L + "'", long3 == 4294967306L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray0 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager1 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray0);
        com.graphhopper.routing.util.EncodingManager encodingManager2 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray0);
        org.junit.Assert.assertNotNull(flagEncoderArray0);
        org.junit.Assert.assertNotNull(encodingManager1);
        org.junit.Assert.assertNotNull(encodingManager2);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        long[] longArray5 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet6 = com.carrotsearch.hppc.LongHashSet.from(longArray5);
        java.util.Iterator<com.carrotsearch.hppc.cursors.LongCursor> longCursorItor7 = longHashSet6.iterator();
        com.carrotsearch.hppc.LongHashSet longHashSet8 = longHashSet6.clone();
        int int9 = longHashSet6.size();
        boolean boolean11 = longHashSet6.add((long) (short) 100);
        longHashSet6.clear();
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet6);
        org.junit.Assert.assertNotNull(longCursorItor7);
        org.junit.Assert.assertNotNull(longHashSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.StorableProperties storableProperties4 = new com.graphhopper.storage.StorableProperties((com.graphhopper.storage.Directory) rAMDirectory1);
        com.graphhopper.storage.RAMDirectory rAMDirectory6 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory7 = rAMDirectory6.create();
        java.nio.ByteOrder byteOrder8 = rAMDirectory6.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess10 = rAMDirectory6.find("prepare.ch.node.original_edge_count_weight");
        dataAccess10.close();
        boolean boolean12 = dataAccess10.isClosed();
        com.graphhopper.storage.RAMDirectory rAMDirectory14 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory15 = rAMDirectory14.create();
        java.nio.ByteOrder byteOrder16 = rAMDirectory14.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess18 = rAMDirectory14.find("prepare.ch.node.original_edge_count_weight");
        int int19 = dataAccess18.getSegmentSize();
        com.graphhopper.storage.DataAccess dataAccess20 = dataAccess10.copyTo(dataAccess18);
        // The following exception was thrown during execution in test generation
        try {
            rAMDirectory1.remove(dataAccess10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Couldn't remove DataAccess: prepare.ch.node.original_edge_count_weight");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(directory7);
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertNotNull(dataAccess10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(directory15);
        org.junit.Assert.assertNotNull(byteOrder16);
        org.junit.Assert.assertNotNull(dataAccess18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1048576 + "'", int19 == 1048576);
        org.junit.Assert.assertNotNull(dataAccess20);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        java.util.List<org.locationtech.jts.geom.Polygon> polygonList0 = null;
        com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule germanySpatialRule1 = new com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule(polygonList0);
        java.util.List<org.locationtech.jts.geom.Polygon> polygonList2 = germanySpatialRule1.getBorders();
        org.junit.Assert.assertNull(polygonList2);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge prepareBaseEdge5 = new com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge(100, (int) (short) -1, (int) (short) 10, (float) (byte) -1, (float) 'a');
        double double6 = prepareBaseEdge5.getWeightAB();
        int int7 = prepareBaseEdge5.getOrigEdgeKeyFirstAB();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph> cHPreparationGraphGHLongObjectHashMap0 = new com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph>();
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph4 = com.graphhopper.routing.ch.CHPreparationGraph.nodeBased(0, (int) (short) 100);
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph5 = cHPreparationGraphGHLongObjectHashMap0.put(0L, cHPreparationGraph4);
        int int6 = cHPreparationGraphGHLongObjectHashMap0.size();
        org.junit.Assert.assertNotNull(cHPreparationGraph4);
        org.junit.Assert.assertNull(cHPreparationGraph5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue36 = new com.graphhopper.routing.ev.StringEncodedValue("bike_network", 10);
        com.graphhopper.storage.IntsRef intsRef39 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean40 = intsRef39.isEmpty();
        com.graphhopper.storage.IntsRef intsRef42 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int43 = intsRef39.compareTo(intsRef42);
        java.lang.String str44 = stringEncodedValue36.getString(false, intsRef42);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState46 = virtualEdgeIteratorState11.set(stringEncodedValue36, "1.8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: EncodedValue bike_network not initialized");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.storage.IntsRef intsRef7 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean8 = intsRef7.isEmpty();
        com.graphhopper.util.PointList pointList10 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState12 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef7, "hike_rating", pointList10, false);
        com.graphhopper.routing.ev.SimpleBooleanEncodedValue simpleBooleanEncodedValue15 = new com.graphhopper.routing.ev.SimpleBooleanEncodedValue("srtm");
        com.graphhopper.util.details.BooleanDetails booleanDetails16 = new com.graphhopper.util.details.BooleanDetails("....      ", (com.graphhopper.routing.ev.BooleanEncodedValue) simpleBooleanEncodedValue15);
        boolean boolean17 = virtualEdgeIteratorState12.get((com.graphhopper.routing.ev.BooleanEncodedValue) simpleBooleanEncodedValue15);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState19 = disabledEdgeIterator0.setReverse((com.graphhopper.routing.ev.IntEncodedValue) simpleBooleanEncodedValue15, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue1 = com.graphhopper.routing.ev.Country.create();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState3 = disabledEdgeIterator0.set((com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(countryEnumEncodedValue1);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
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
        com.graphhopper.routing.ev.RoadClass roadClass13 = com.graphhopper.routing.ev.RoadClass.SECONDARY;
        java.lang.String str14 = roadClass13.toString();
        com.graphhopper.routing.util.TransportationMode transportationMode15 = com.graphhopper.routing.util.TransportationMode.OTHER;
        double double17 = germanySpatialRule3.getMaxSpeed(roadClass13, transportationMode15, (double) 21);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl19 = new com.graphhopper.coll.GHBitSetImpl();
        gHBitSetImpl19.remove((int) (short) 10);
        byte[] byteArray22 = gHBitSetImpl19.toByteArray();
        com.graphhopper.reader.osm.pbf.PbfRawBlob pbfRawBlob23 = new com.graphhopper.reader.osm.pbf.PbfRawBlob("prepare.ch.updates.lazy", byteArray22);
        boolean boolean24 = germanySpatialRule3.equals((java.lang.Object) "prepare.ch.updates.lazy");
        org.junit.Assert.assertNotNull(polygonArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(directory6);
        org.junit.Assert.assertNotNull(dAType7);
        org.junit.Assert.assertTrue("'" + roadClass8 + "' != '" + com.graphhopper.routing.ev.RoadClass.LIVING_STREET + "'", roadClass8.equals(com.graphhopper.routing.ev.RoadClass.LIVING_STREET));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + transportationMode10 + "' != '" + com.graphhopper.routing.util.TransportationMode.MOTORCYCLE + "'", transportationMode10.equals(com.graphhopper.routing.util.TransportationMode.MOTORCYCLE));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + roadClass13 + "' != '" + com.graphhopper.routing.ev.RoadClass.SECONDARY + "'", roadClass13.equals(com.graphhopper.routing.ev.RoadClass.SECONDARY));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "secondary" + "'", str14, "secondary");
        org.junit.Assert.assertTrue("'" + transportationMode15 + "' != '" + com.graphhopper.routing.util.TransportationMode.OTHER + "'", transportationMode15.equals(com.graphhopper.routing.util.TransportationMode.OTHER));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 21.0d + "'", double17 == 21.0d);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        com.graphhopper.GraphHopperConfig graphHopperConfig0 = new com.graphhopper.GraphHopperConfig();
        java.lang.String str1 = graphHopperConfig0.toString();
        int int4 = graphHopperConfig0.getInt("Node: 200 lat=0.0 lon=3.0", (int) ' ');
        float float7 = graphHopperConfig0.getFloat("srtmgl1", 1.0f);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "profiles:\nprofiles_ch:\nprofiles_lm:\nproperties:\n" + "'", str1, "profiles:\nprofiles_ch:\nprofiles_lm:\nproperties:\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap1 = new com.graphhopper.coll.GHIntLongHashMap((int) (byte) 1);
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap2 = gHIntLongHashMap1.clone();
        boolean boolean4 = intLongHashMap2.containsKey((int) (short) 1);
        long long7 = intLongHashMap2.getOrDefault((int) (short) 1, (long) (short) 0);
        org.junit.Assert.assertNotNull(intLongHashMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        long[] longArray5 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet6 = com.carrotsearch.hppc.LongHashSet.from(longArray5);
        java.util.Iterator<com.carrotsearch.hppc.cursors.LongCursor> longCursorItor7 = longHashSet6.iterator();
        com.carrotsearch.hppc.LongHashSet longHashSet8 = longHashSet6.clone();
        int int9 = longHashSet6.size();
        boolean boolean11 = longHashSet6.add(0L);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet6);
        org.junit.Assert.assertNotNull(longCursorItor7);
        org.junit.Assert.assertNotNull(longHashSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        com.graphhopper.routing.util.TestAlgoCollector.OneRun oneRun0 = new com.graphhopper.routing.util.TestAlgoCollector.OneRun();
        com.graphhopper.storage.index.LocationIndex locationIndex1 = null;
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue2 = null;
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter3 = com.graphhopper.routing.util.DefaultEdgeFilter.allEdges(booleanEncodedValue2);
        java.util.List<com.graphhopper.storage.index.Snap> snapList4 = oneRun0.getList(locationIndex1, (com.graphhopper.routing.util.EdgeFilter) defaultEdgeFilter3);
        // The following exception was thrown during execution in test generation
        try {
            oneRun0.setLocs((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultEdgeFilter3);
        org.junit.Assert.assertNotNull(snapList4);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser oSMHazmatTunnelParser0 = new com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray1 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager2 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray1);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue3 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue4 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray5 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue3, decimalEncodedValue4 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList6 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList6, encodedValueArray5);
        oSMHazmatTunnelParser0.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager2, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList6);
        com.graphhopper.storage.RAMDirectory rAMDirectory10 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory11 = rAMDirectory10.create();
        java.nio.ByteOrder byteOrder12 = rAMDirectory10.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray13 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager14 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray13);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage16 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory10, encodingManager14, false);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue18 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.util.details.IntDetails intDetails19 = new com.graphhopper.util.details.IntDetails("foot", (com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue18);
        com.graphhopper.routing.ev.IntEncodedValue intEncodedValue20 = com.graphhopper.routing.ev.HorseRating.create();
        com.graphhopper.storage.IntsRef intsRef23 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState29 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef23, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue30 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        double double31 = edgeIteratorState29.getReverse(decimalEncodedValue30);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue32 = com.graphhopper.routing.ev.Country.create();
        boolean boolean33 = countryEnumEncodedValue32.isStoreTwoDirections();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue34 = com.graphhopper.routing.ev.Country.create();
        boolean boolean35 = countryEnumEncodedValue34.isStoreTwoDirections();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray36 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue18, intEncodedValue20, decimalEncodedValue30, countryEnumEncodedValue32, countryEnumEncodedValue34 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList37 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList37, encodedValueArray36);
        oSMHazmatTunnelParser0.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager14, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList37);
        com.graphhopper.storage.IntsRef intsRef40 = encodingManager14.createRelationFlags();
        com.graphhopper.storage.GraphBuilder graphBuilder41 = com.graphhopper.storage.GraphBuilder.start(encodingManager14);
        org.junit.Assert.assertNotNull(flagEncoderArray1);
        org.junit.Assert.assertNotNull(encodingManager2);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue3);
        org.junit.Assert.assertNotNull(decimalEncodedValue4);
        org.junit.Assert.assertNotNull(encodedValueArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(directory11);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertNotNull(flagEncoderArray13);
        org.junit.Assert.assertNotNull(encodingManager14);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue18);
        org.junit.Assert.assertNotNull(intEncodedValue20);
        org.junit.Assert.assertNotNull(edgeIteratorState29);
        org.junit.Assert.assertNotNull(decimalEncodedValue30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + Double.POSITIVE_INFINITY + "'", double31 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(encodedValueArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(intsRef40);
        org.junit.Assert.assertNotNull(graphBuilder41);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        com.graphhopper.util.Downloader downloader1 = new com.graphhopper.util.Downloader("");
        // The following exception was thrown during execution in test generation
        try {
            downloader1.downloadFile("", "foot");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.Directory directory4 = rAMDirectory1.create();
        com.graphhopper.storage.DataAccess dataAccess6 = rAMDirectory1.find("-1->-1");
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(directory4);
        org.junit.Assert.assertNotNull(dataAccess6);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap1 = new com.graphhopper.coll.GHLongLongHashMap(50);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap0 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>();
        com.carrotsearch.hppc.IntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableIntObjectHashMap1 = strComparableGHIntObjectHashMap0.clone();
        com.carrotsearch.hppc.IntObjectHashMap<java.lang.Comparable<java.lang.String>>.KeysContainer keysContainer2 = strComparableGHIntObjectHashMap0.keys();
        org.junit.Assert.assertNotNull(strComparableIntObjectHashMap1);
        org.junit.Assert.assertNotNull(keysContainer2);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("prepare.ch.node.original_edge_count_weight");
        dataAccess5.close();
        // The following exception was thrown during execution in test generation
        try {
            short short8 = 0; // flaky: dataAccess5.getShort((long) (short) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        com.graphhopper.util.AngleCalc angleCalc0 = com.graphhopper.util.AngleCalc.ANGLE_CALC;
        double double5 = angleCalc0.calcAzimuth((double) 21, (double) '4', 36.11340206185567d, 4.0024076802712575E7d);
        double double8 = angleCalc0.alignOrientation((double) 3, (double) 11);
        org.junit.Assert.assertNotNull(angleCalc0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 90.0002104591497d + "'", double5 == 90.0002104591497d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 11.0d + "'", double8 == 11.0d);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        com.graphhopper.storage.RoutingCHGraph routingCHGraph0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.AStarBidirectionEdgeCHNoSOD aStarBidirectionEdgeCHNoSOD1 = new com.graphhopper.routing.AStarBidirectionEdgeCHNoSOD(routingCHGraph0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        long[] longArray5 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet6 = com.carrotsearch.hppc.LongHashSet.from(longArray5);
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap8 = new com.graphhopper.coll.GHLongLongHashMap(1);
        java.util.Spliterator<com.carrotsearch.hppc.cursors.LongLongCursor> longLongCursorSpliterator9 = gHLongLongHashMap8.spliterator();
        com.carrotsearch.hppc.LongLongHashMap.KeysContainer keysContainer10 = gHLongLongHashMap8.keys();
        int int11 = longHashSet6.retainAll((com.carrotsearch.hppc.LongLookupContainer) keysContainer10);
        long[] longArray12 = longHashSet6.toArray();
        java.lang.String str14 = longHashSet6.visualizeKeyDistribution(200);
        com.carrotsearch.hppc.LongHashSet longHashSet15 = longHashSet6.clone();
        long long17 = longHashSet15.indexGet(2);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet6);
        org.junit.Assert.assertNotNull(longLongCursorSpliterator9);
        org.junit.Assert.assertNotNull(keysContainer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "........                                                                                                                                                                                                " + "'", str14, "........                                                                                                                                                                                                ");
        org.junit.Assert.assertNotNull(longHashSet15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.graphhopper.util.GitInfo gitInfo0 = com.graphhopper.util.Constants.GIT_INFO;
        java.lang.String str1 = gitInfo0.getBranch();
        java.lang.String str2 = gitInfo0.toString();
        org.junit.Assert.assertNotNull(gitInfo0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "graphhopper/core" + "'", str1, "graphhopper/core");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5fee4fa83241c3e44657171201fa69aca3f10f14|graphhopper/core|dirty=false|2021-04-04T15:42:59-0300|add tests" + "'", str2, "5fee4fa83241c3e44657171201fa69aca3f10f14|graphhopper/core|dirty=false|2021-04-04T15:42:59-0300|add tests");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.locationtech.jts.geom.Polygon[] polygonArray0 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList1 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList1, polygonArray0);
        com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule germanySpatialRule3 = new com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList1);
        java.util.List<org.locationtech.jts.geom.Polygon> polygonList4 = germanySpatialRule3.getBorders();
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule5 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule(polygonList4);
        com.graphhopper.routing.util.spatialrules.CountriesSpatialRuleFactory countriesSpatialRuleFactory6 = new com.graphhopper.routing.util.spatialrules.CountriesSpatialRuleFactory();
        org.locationtech.jts.geom.Polygon[] polygonArray8 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList9 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList9, polygonArray8);
        com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule germanySpatialRule11 = new com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList9);
        java.util.List<org.locationtech.jts.geom.Polygon> polygonList12 = germanySpatialRule11.getBorders();
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule13 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule(polygonList12);
        com.graphhopper.routing.util.spatialrules.SpatialRule spatialRule14 = countriesSpatialRuleFactory6.createSpatialRule("srtm", polygonList12);
        com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule germanySpatialRule15 = new com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule(polygonList12);
        org.locationtech.jts.geom.Polygon[] polygonArray16 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList17 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList17, polygonArray16);
        com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule germanySpatialRule19 = new com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList17);
        java.util.List<org.locationtech.jts.geom.Polygon> polygonList20 = germanySpatialRule19.getBorders();
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule21 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule(polygonList20);
        org.locationtech.jts.geom.Polygon[] polygonArray22 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList23 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList23, polygonArray22);
        com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule germanySpatialRule25 = new com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList23);
        com.graphhopper.storage.RAMDirectory rAMDirectory27 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory28 = rAMDirectory27.create();
        com.graphhopper.storage.DAType dAType29 = rAMDirectory27.getDefaultType();
        com.graphhopper.routing.ev.RoadClass roadClass30 = com.graphhopper.routing.ev.RoadClass.LIVING_STREET;
        boolean boolean31 = dAType29.equals((java.lang.Object) roadClass30);
        com.graphhopper.routing.util.TransportationMode transportationMode32 = com.graphhopper.routing.util.TransportationMode.MOTORCYCLE;
        double double34 = germanySpatialRule25.getMaxSpeed(roadClass30, transportationMode32, (double) 0.0f);
        java.util.List<org.locationtech.jts.geom.Polygon> polygonList35 = null;
        com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule germanySpatialRule36 = new com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule(polygonList35);
        org.locationtech.jts.geom.Polygon[] polygonArray37 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList38 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList38, polygonArray37);
        com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule germanySpatialRule40 = new com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList38);
        com.graphhopper.storage.RAMDirectory rAMDirectory42 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory43 = rAMDirectory42.create();
        com.graphhopper.storage.DAType dAType44 = rAMDirectory42.getDefaultType();
        com.graphhopper.routing.ev.RoadClass roadClass45 = com.graphhopper.routing.ev.RoadClass.LIVING_STREET;
        boolean boolean46 = dAType44.equals((java.lang.Object) roadClass45);
        com.graphhopper.routing.util.TransportationMode transportationMode47 = com.graphhopper.routing.util.TransportationMode.MOTORCYCLE;
        double double49 = germanySpatialRule40.getMaxSpeed(roadClass45, transportationMode47, (double) 0.0f);
        org.locationtech.jts.geom.Polygon[] polygonArray50 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList51 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList51, polygonArray50);
        com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule germanySpatialRule53 = new com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList51);
        java.util.List<org.locationtech.jts.geom.Polygon> polygonList54 = germanySpatialRule53.getBorders();
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule55 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule(polygonList54);
        org.locationtech.jts.geom.Polygon[] polygonArray56 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList57 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList57, polygonArray56);
        com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule germanySpatialRule59 = new com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList57);
        com.graphhopper.routing.ev.RoadClass roadClass60 = com.graphhopper.routing.ev.RoadClass.TRUNK;
        org.locationtech.jts.geom.Polygon[] polygonArray61 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList62 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList62, polygonArray61);
        com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule germanySpatialRule64 = new com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList62);
        com.graphhopper.storage.RAMDirectory rAMDirectory66 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory67 = rAMDirectory66.create();
        com.graphhopper.storage.DAType dAType68 = rAMDirectory66.getDefaultType();
        com.graphhopper.routing.ev.RoadClass roadClass69 = com.graphhopper.routing.ev.RoadClass.LIVING_STREET;
        boolean boolean70 = dAType68.equals((java.lang.Object) roadClass69);
        com.graphhopper.routing.util.TransportationMode transportationMode71 = com.graphhopper.routing.util.TransportationMode.MOTORCYCLE;
        double double73 = germanySpatialRule64.getMaxSpeed(roadClass69, transportationMode71, (double) 0.0f);
        com.graphhopper.routing.ev.RoadClass roadClass74 = com.graphhopper.routing.ev.RoadClass.SECONDARY;
        java.lang.String str75 = roadClass74.toString();
        com.graphhopper.routing.util.TransportationMode transportationMode76 = com.graphhopper.routing.util.TransportationMode.OTHER;
        double double78 = germanySpatialRule64.getMaxSpeed(roadClass74, transportationMode76, (double) 21);
        double double80 = germanySpatialRule59.getMaxSpeed(roadClass60, transportationMode76, (double) 35);
        com.graphhopper.routing.util.spatialrules.SpatialRule[] spatialRuleArray81 = new com.graphhopper.routing.util.spatialrules.SpatialRule[] { austriaSpatialRule5, germanySpatialRule15, austriaSpatialRule21, germanySpatialRule25, germanySpatialRule36, germanySpatialRule40, austriaSpatialRule55, germanySpatialRule59 };
        java.util.ArrayList<com.graphhopper.routing.util.spatialrules.SpatialRule> spatialRuleList82 = new java.util.ArrayList<com.graphhopper.routing.util.spatialrules.SpatialRule>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.util.spatialrules.SpatialRule>) spatialRuleList82, spatialRuleArray81);
        com.graphhopper.routing.util.spatialrules.SpatialRuleSet spatialRuleSet85 = new com.graphhopper.routing.util.spatialrules.SpatialRuleSet((java.util.List<com.graphhopper.routing.util.spatialrules.SpatialRule>) spatialRuleList82, 11);
        com.graphhopper.routing.util.spatialrules.SpatialRuleSet spatialRuleSet87 = new com.graphhopper.routing.util.spatialrules.SpatialRuleSet((java.util.List<com.graphhopper.routing.util.spatialrules.SpatialRule>) spatialRuleList82, 1687814340);
        org.junit.Assert.assertNotNull(polygonArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(polygonList4);
        org.junit.Assert.assertNotNull(polygonArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(polygonList12);
        org.junit.Assert.assertNull(spatialRule14);
        org.junit.Assert.assertNotNull(polygonArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(polygonList20);
        org.junit.Assert.assertNotNull(polygonArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(directory28);
        org.junit.Assert.assertNotNull(dAType29);
        org.junit.Assert.assertTrue("'" + roadClass30 + "' != '" + com.graphhopper.routing.ev.RoadClass.LIVING_STREET + "'", roadClass30.equals(com.graphhopper.routing.ev.RoadClass.LIVING_STREET));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + transportationMode32 + "' != '" + com.graphhopper.routing.util.TransportationMode.MOTORCYCLE + "'", transportationMode32.equals(com.graphhopper.routing.util.TransportationMode.MOTORCYCLE));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(polygonArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(directory43);
        org.junit.Assert.assertNotNull(dAType44);
        org.junit.Assert.assertTrue("'" + roadClass45 + "' != '" + com.graphhopper.routing.ev.RoadClass.LIVING_STREET + "'", roadClass45.equals(com.graphhopper.routing.ev.RoadClass.LIVING_STREET));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + transportationMode47 + "' != '" + com.graphhopper.routing.util.TransportationMode.MOTORCYCLE + "'", transportationMode47.equals(com.graphhopper.routing.util.TransportationMode.MOTORCYCLE));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(polygonArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(polygonList54);
        org.junit.Assert.assertNotNull(polygonArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + roadClass60 + "' != '" + com.graphhopper.routing.ev.RoadClass.TRUNK + "'", roadClass60.equals(com.graphhopper.routing.ev.RoadClass.TRUNK));
        org.junit.Assert.assertNotNull(polygonArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(directory67);
        org.junit.Assert.assertNotNull(dAType68);
        org.junit.Assert.assertTrue("'" + roadClass69 + "' != '" + com.graphhopper.routing.ev.RoadClass.LIVING_STREET + "'", roadClass69.equals(com.graphhopper.routing.ev.RoadClass.LIVING_STREET));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + transportationMode71 + "' != '" + com.graphhopper.routing.util.TransportationMode.MOTORCYCLE + "'", transportationMode71.equals(com.graphhopper.routing.util.TransportationMode.MOTORCYCLE));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue("'" + roadClass74 + "' != '" + com.graphhopper.routing.ev.RoadClass.SECONDARY + "'", roadClass74.equals(com.graphhopper.routing.ev.RoadClass.SECONDARY));
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "secondary" + "'", str75, "secondary");
        org.junit.Assert.assertTrue("'" + transportationMode76 + "' != '" + com.graphhopper.routing.util.TransportationMode.OTHER + "'", transportationMode76.equals(com.graphhopper.routing.util.TransportationMode.OTHER));
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 21.0d + "'", double78 == 21.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 35.0d + "'", double80 == 35.0d);
        org.junit.Assert.assertNotNull(spatialRuleArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        com.graphhopper.storage.RoutingCHGraph routingCHGraph23 = graphHopperStorage20.getRoutingCHGraph("................                   ");
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
        org.junit.Assert.assertNull(routingCHGraph23);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType0 = com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH;
        java.util.Calendar calendar1 = null;
        com.graphhopper.reader.osm.conditional.ParsedCalendar parsedCalendar2 = new com.graphhopper.reader.osm.conditional.ParsedCalendar(parseType0, calendar1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar3 = parsedCalendar2.getMax();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + parseType0 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH + "'", parseType0.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH));
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        java.lang.String str0 = com.graphhopper.routing.util.FlagEncoderFactory.BIKE2;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bike2" + "'", str0, "bike2");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        com.graphhopper.GraphHopper graphHopper0 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        com.graphhopper.GraphHopper graphHopper2 = graphHopper0.setFlagEncoderFactory(flagEncoderFactory1);
        com.graphhopper.reader.dem.MultiSourceElevationProvider multiSourceElevationProvider3 = new com.graphhopper.reader.dem.MultiSourceElevationProvider();
        double double6 = multiSourceElevationProvider3.getEle((double) 0.0f, 0.0d);
        com.graphhopper.GraphHopper graphHopper7 = graphHopper0.setElevationProvider((com.graphhopper.reader.dem.ElevationProvider) multiSourceElevationProvider3);
        java.lang.String str8 = graphHopper0.getGraphHopperLocation();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.index.LocationIndex locationIndex9 = graphHopper0.getLocationIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Location index not initialized");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphHopper2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(graphHopper7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        com.graphhopper.storage.NodeAccess nodeAccess0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator2 = new com.graphhopper.routing.weighting.BeelineWeightApproximator(nodeAccess0, weighting1);
        com.graphhopper.util.DistanceCalcEarth distanceCalcEarth3 = new com.graphhopper.util.DistanceCalcEarth();
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator4 = beelineWeightApproximator2.setDistanceCalc((com.graphhopper.util.DistanceCalc) distanceCalcEarth3);
        double double5 = beelineWeightApproximator4.getSlack();
        com.graphhopper.routing.weighting.WeightApproximator weightApproximator6 = beelineWeightApproximator4.reverse();
        org.junit.Assert.assertNotNull(beelineWeightApproximator4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(weightApproximator6);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        com.graphhopper.reader.dem.CGIARProvider cGIARProvider1 = new com.graphhopper.reader.dem.CGIARProvider("....      ");
        double double4 = cGIARProvider1.getEle(10.0d, (double) (byte) -1);
        double double7 = cGIARProvider1.getEle(1143.0d, (double) 200);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 116.0d + "'", double4 == 116.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.graphhopper.routing.util.parsers.DefaultTagParserFactory defaultTagParserFactory0 = new com.graphhopper.routing.util.parsers.DefaultTagParserFactory();
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile3 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str4 = customProfile3.toString();
        com.graphhopper.config.Profile profile7 = customProfile3.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.util.PMap pMap8 = profile7.getHints();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.parsers.TagParser tagParser9 = defaultTagParserFactory0.create("_network", pMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: entry in encoder list not supported _network");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str4, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile7);
        org.junit.Assert.assertNotNull(pMap8);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        com.graphhopper.routing.ch.AStarCHEntry aStarCHEntry5 = new com.graphhopper.routing.ch.AStarCHEntry((int) (short) 1, (int) (short) 10, (int) (short) -1, (double) 4294967306L, (double) (byte) 100);
        aStarCHEntry5.weight = 2;
        int int8 = aStarCHEntry5.incEdge;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap0 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>();
        com.carrotsearch.hppc.IntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableIntObjectHashMap1 = strComparableGHIntObjectHashMap0.clone();
        int int2 = strComparableIntObjectHashMap1.size();
        strComparableIntObjectHashMap1.ensureCapacity(11);
        org.junit.Assert.assertNotNull(strComparableIntObjectHashMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        com.graphhopper.util.DistanceCalc3D distanceCalc3D0 = new com.graphhopper.util.DistanceCalc3D();
        double double7 = distanceCalc3D0.calcDist(1.0E-5d, (double) (short) 100, 4.0024076802712575E7d, (double) (byte) 100, (double) 100L, (double) (short) 10);
        double double9 = distanceCalc3D0.calcDenormalizedDist((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.1539968895200975E7d + "'", double7 == 4.1539968895200975E7d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
        com.graphhopper.routing.weighting.Weighting weighting24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.RoutingCHEdgeIteratorImpl routingCHEdgeIteratorImpl25 = com.graphhopper.storage.RoutingCHEdgeIteratorImpl.inEdges(edgeExplorer23, weighting24);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "edges:0(0MB), nodes:0(0MB), name:(0MB), geo:0(0MB), bounds:1.7976931348623157E308,-1.7976931348623157E308,1.7976931348623157E308,-1.7976931348623157E308" + "'", str22, "edges:0(0MB), nodes:0(0MB), name:(0MB), geo:0(0MB), bounds:1.7976931348623157E308,-1.7976931348623157E308,1.7976931348623157E308,-1.7976931348623157E308");
        org.junit.Assert.assertNotNull(edgeExplorer23);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        com.graphhopper.storage.DAType dAType0 = com.graphhopper.storage.DAType.RAM_INT;
        boolean boolean1 = dAType0.isAllowWrites();
        org.junit.Assert.assertNotNull(dAType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        com.graphhopper.routing.util.FlagEncoder flagEncoder0 = null;
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile2 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str3 = customProfile2.toString();
        com.graphhopper.config.Profile profile6 = customProfile2.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        int int7 = profile6.getVersion();
        com.graphhopper.config.Profile profile9 = profile6.setVehicle("1111111111");
        com.graphhopper.util.PMap pMap10 = profile6.getHints();
        com.graphhopper.routing.weighting.TurnCostProvider turnCostProvider11 = com.graphhopper.routing.weighting.TurnCostProvider.NO_TURN_COST_PROVIDER;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.PriorityWeighting priorityWeighting12 = new com.graphhopper.routing.weighting.PriorityWeighting(flagEncoder0, pMap10, turnCostProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str3, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1909399913) + "'", int7 == (-1909399913));
        org.junit.Assert.assertNotNull(profile9);
        org.junit.Assert.assertNotNull(pMap10);
        org.junit.Assert.assertNotNull(turnCostProvider11);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        com.graphhopper.routing.ch.AStarCHEntry aStarCHEntry3 = new com.graphhopper.routing.ch.AStarCHEntry(2, (double) 10L, (double) 2);
        aStarCHEntry3.weightOfVisitedPath = 100.0f;
        com.graphhopper.routing.ch.AStarCHEntry aStarCHEntry11 = new com.graphhopper.routing.ch.AStarCHEntry((int) (short) 1, (int) (short) 10, (int) (short) -1, (double) 4294967306L, (double) (byte) 100);
        aStarCHEntry3.parent = aStarCHEntry11;
        int int13 = aStarCHEntry3.incEdge;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        com.graphhopper.routing.util.parsers.OSMRoadClassLinkParser oSMRoadClassLinkParser0 = new com.graphhopper.routing.util.parsers.OSMRoadClassLinkParser();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray1 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager2 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray1);
        com.graphhopper.storage.GraphBuilder graphBuilder3 = new com.graphhopper.storage.GraphBuilder(encodingManager2);
        com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser oSMFootNetworkTagParser4 = new com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser();
        com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser oSMHazmatTunnelParser5 = new com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray6 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager7 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray6);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue8 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue9 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray10 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue8, decimalEncodedValue9 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList11 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList11, encodedValueArray10);
        oSMHazmatTunnelParser5.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager7, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList11);
        java.util.List<com.graphhopper.routing.ev.EncodedValue> encodedValueList14 = encodingManager7.getEncodedValues();
        com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser oSMHazmatTunnelParser15 = new com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray16 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager17 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray16);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue18 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue19 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray20 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue18, decimalEncodedValue19 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList21 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList21, encodedValueArray20);
        oSMHazmatTunnelParser15.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager17, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList21);
        oSMFootNetworkTagParser4.createRelationEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager7, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList21);
        oSMRoadClassLinkParser0.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager2, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList21);
        org.junit.Assert.assertNotNull(flagEncoderArray1);
        org.junit.Assert.assertNotNull(encodingManager2);
        org.junit.Assert.assertNotNull(flagEncoderArray6);
        org.junit.Assert.assertNotNull(encodingManager7);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue8);
        org.junit.Assert.assertNotNull(decimalEncodedValue9);
        org.junit.Assert.assertNotNull(encodedValueArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(encodedValueList14);
        org.junit.Assert.assertNotNull(flagEncoderArray16);
        org.junit.Assert.assertNotNull(encodingManager17);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue18);
        org.junit.Assert.assertNotNull(decimalEncodedValue19);
        org.junit.Assert.assertNotNull(encodedValueArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray0 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager1 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray0);
        com.graphhopper.reader.OSMTurnRelation.Type type5 = null;
        com.graphhopper.reader.OSMTurnRelation oSMTurnRelation6 = new com.graphhopper.reader.OSMTurnRelation(0L, (long) '#', (-1L), type5);
        com.graphhopper.routing.util.parsers.TurnCostParser.ExternalInternalMap externalInternalMap7 = null;
        com.graphhopper.storage.Graph graph8 = null;
        encodingManager1.handleTurnRelationTags(oSMTurnRelation6, externalInternalMap7, graph8);
        int int10 = encodingManager1.getIntsForFlags();
        org.junit.Assert.assertNotNull(flagEncoderArray0);
        org.junit.Assert.assertNotNull(encodingManager1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        com.graphhopper.storage.DAType dAType0 = com.graphhopper.storage.DAType.MMAP;
        boolean boolean1 = dAType0.isStoring();
        org.junit.Assert.assertNotNull(dAType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager5, false);
        com.graphhopper.storage.CHGraph cHGraph9 = graphHopperStorage7.getCHGraph("bike_network");
        boolean boolean10 = graphHopperStorage7.isCHPossible();
        graphHopperStorage7.flushAndCloseEarly();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(flagEncoderArray4);
        org.junit.Assert.assertNotNull(encodingManager5);
        org.junit.Assert.assertNull(cHGraph9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        com.graphhopper.routing.util.parsers.OSMTollParser oSMTollParser0 = new com.graphhopper.routing.util.parsers.OSMTollParser();
        com.graphhopper.storage.IntsRef intsRef2 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean3 = intsRef2.isEmpty();
        com.graphhopper.storage.IntsRef intsRef5 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int6 = intsRef2.compareTo(intsRef5);
        boolean boolean8 = intsRef5.equals((java.lang.Object) (short) 0);
        boolean boolean9 = intsRef5.isValid();
        com.graphhopper.routing.ev.SimpleBooleanEncodedValue simpleBooleanEncodedValue11 = new com.graphhopper.routing.ev.SimpleBooleanEncodedValue("srtm");
        com.graphhopper.storage.IntsRef intsRef14 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean15 = intsRef14.isEmpty();
        com.graphhopper.storage.IntsRef intsRef17 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int18 = intsRef14.compareTo(intsRef17);
        boolean boolean19 = intsRef14.isValid();
        boolean boolean20 = simpleBooleanEncodedValue11.getBool(true, intsRef14);
        boolean boolean21 = intsRef5.intsEquals(intsRef14);
        java.util.Calendar calendar22 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "_network$turn_cost", "", "", "5.4.0-70-generic", "bike_network", "3.0", "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}", "prepare.ch.edge.witness_search.sigma_factor", "3.0" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.lang.String[] strArray58 = new java.lang.String[] { "", "bike", "prepare.ch.edge.witness_search.reset_interval", "_network", "prepare.ch.edge.witness_search.sigma_factor", "foot", "srtm", "_network$turn_cost", "prepare.ch.node.original_edge_count_weight", "foot_network", "foot_network", "prepare.ch.log_messages", "3.0", "", "secondary", "secondary", "hi!", "00001010000010100000101001100100", "1.8", "bike", "prepare.ch.edge.witness_search.sigma_factor", "hike_rating", "prepare.ch.edge.witness_search.reset_interval" };
        java.util.LinkedHashSet<java.lang.String> strSet59 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet59, strArray58);
        java.lang.String[] strArray79 = new java.lang.String[] { "3.0", "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}", "prepare.ch.updates.lazy", "secondary", "foot", "srtm", "foot", "bike_network", "foot_network", "prepare.ch.log_messages", "", "00001010000010100000101001100100", "hi!", "prepare.ch.node.original_edge_count_weight", "1.8", "_network$turn_cost", "5.4.0-70-generic", "horse_rating" };
        java.util.LinkedHashSet<java.lang.String> strSet80 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet80, strArray79);
        com.graphhopper.reader.osm.conditional.ConditionalOSMTagInspector conditionalOSMTagInspector82 = new com.graphhopper.reader.osm.conditional.ConditionalOSMTagInspector(calendar22, (java.util.List<java.lang.String>) strList33, (java.util.Set<java.lang.String>) strSet59, (java.util.Set<java.lang.String>) strSet80);
        com.graphhopper.reader.ReaderWay readerWay84 = new com.graphhopper.reader.ReaderWay((long) 0);
        boolean boolean85 = conditionalOSMTagInspector82.isRestrictedWayConditionallyPermitted(readerWay84);
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue89 = new com.graphhopper.routing.ev.StringEncodedValue("bike_network", 10);
        com.graphhopper.storage.IntsRef intsRef92 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean93 = intsRef92.isEmpty();
        com.graphhopper.storage.IntsRef intsRef95 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int96 = intsRef92.compareTo(intsRef95);
        java.lang.String str97 = stringEncodedValue89.getString(false, intsRef95);
        com.graphhopper.storage.IntsRef intsRef98 = oSMTollParser0.handleWayTags(intsRef5, readerWay84, false, intsRef95);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNull(str97);
        org.junit.Assert.assertNotNull(intsRef98);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        com.graphhopper.routing.util.TestAlgoCollector.OneRun oneRun6 = new com.graphhopper.routing.util.TestAlgoCollector.OneRun((double) (byte) -1, Double.NaN, 0.0d, (double) 52L, (double) 35.0f, 35);
        double double7 = oneRun6.getDistance();
        com.graphhopper.routing.util.TestAlgoCollector.OneRun oneRun12 = oneRun6.add(21.0d, (double) (byte) 100, (double) 10.0f, (-1909399913));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNotNull(oneRun12);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.osm.conditional.DateRangeParser dateRangeParser1 = com.graphhopper.reader.osm.conditional.DateRangeParser.createInstance("N");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.text.ParseException: Unparseable date: \"N\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.storage.DAType dAType3 = rAMDirectory1.getDefaultType();
        com.graphhopper.storage.DAType dAType5 = com.graphhopper.storage.DAType.RAM_INT_STORE;
        com.graphhopper.storage.Directory directory6 = rAMDirectory1.put("", dAType5);
        rAMDirectory1.close();
        java.lang.String str8 = rAMDirectory1.getLocation();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(dAType3);
        org.junit.Assert.assertNotNull(dAType5);
        org.junit.Assert.assertNotNull(directory6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "prepare.ch.node.original_edge_count_weight/" + "'", str8, "prepare.ch.node.original_edge_count_weight/");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        java.lang.String str1 = com.graphhopper.routing.ev.TurnCost.key("graphhopper/core");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "graphhopper/core$turn_cost" + "'", str1, "graphhopper/core$turn_cost");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        com.graphhopper.routing.AlgorithmOptions.Builder builder0 = new com.graphhopper.routing.AlgorithmOptions.Builder();
        com.graphhopper.routing.AlgorithmOptions.Builder builder2 = builder0.algorithm("[]");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        com.graphhopper.routing.weighting.Weighting weighting0 = null;
        com.graphhopper.util.details.AverageSpeedDetails averageSpeedDetails1 = new com.graphhopper.util.details.AverageSpeedDetails(weighting0);
        java.lang.String str2 = averageSpeedDetails1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "average_speed" + "'", str2, "average_speed");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        double double1 = com.graphhopper.routing.util.PriorityCode.getFactor((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14285714285714285d) + "'", double1 == (-0.14285714285714285d));
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager5, false);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage8 = com.graphhopper.util.GHUtility.newStorage(graphHopperStorage7);
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue9 = null;
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter10 = com.graphhopper.routing.util.DefaultEdgeFilter.outEdges(booleanEncodedValue9);
        com.graphhopper.util.EdgeExplorer edgeExplorer11 = graphHopperStorage8.createEdgeExplorer((com.graphhopper.routing.util.EdgeFilter) defaultEdgeFilter10);
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(flagEncoderArray4);
        org.junit.Assert.assertNotNull(encodingManager5);
        org.junit.Assert.assertNotNull(graphHopperStorage8);
        org.junit.Assert.assertNotNull(defaultEdgeFilter10);
        org.junit.Assert.assertNotNull(edgeExplorer11);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        com.graphhopper.storage.IntsRef intsRef2 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState8 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef2, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue9 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        double double10 = edgeIteratorState8.getReverse(decimalEncodedValue9);
        com.graphhopper.routing.weighting.Weighting weighting11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.RoutingCHEdgeIteratorStateImpl routingCHEdgeIteratorStateImpl12 = new com.graphhopper.storage.RoutingCHEdgeIteratorStateImpl(edgeIteratorState8, weighting11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorState8);
        org.junit.Assert.assertNotNull(decimalEncodedValue9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        com.graphhopper.storage.RoutingCHGraph routingCHGraph0 = null;
        com.graphhopper.routing.ch.CHRoutingAlgorithmFactory cHRoutingAlgorithmFactory1 = null;
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile3 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str4 = customProfile3.toString();
        com.graphhopper.config.Profile profile7 = customProfile3.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.util.PMap pMap8 = profile7.getHints();
        com.graphhopper.routing.CHPathCalculator cHPathCalculator9 = new com.graphhopper.routing.CHPathCalculator(cHRoutingAlgorithmFactory1, pMap8);
        com.graphhopper.routing.RoundTripRouting.Params params12 = new com.graphhopper.routing.RoundTripRouting.Params(pMap8, (double) (short) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.AlternativeRouteCH alternativeRouteCH13 = new com.graphhopper.routing.AlternativeRouteCH(routingCHGraph0, pMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str4, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile7);
        org.junit.Assert.assertNotNull(pMap8);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        com.graphhopper.routing.util.parsers.OSMRoadClassParser oSMRoadClassParser0 = new com.graphhopper.routing.util.parsers.OSMRoadClassParser();
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        com.graphhopper.storage.Graph graph0 = null;
        java.util.function.BiPredicate<com.graphhopper.util.EdgeIteratorState, java.lang.Boolean> edgeIteratorStateBiPredicate1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.DirectionResolver directionResolver2 = new com.graphhopper.routing.DirectionResolver(graph0, edgeIteratorStateBiPredicate1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        com.graphhopper.storage.DAType dAType0 = com.graphhopper.storage.DAType.RAM_INT_STORE;
        boolean boolean1 = dAType0.isMMap();
        org.junit.Assert.assertNotNull(dAType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        com.carrotsearch.hppc.IntArrayList intArrayList2 = com.graphhopper.util.ArrayUtil.constant((-2), 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.graphhopper.util.ArrayUtil.isPermutation(intArrayList2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArrayList2);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.graphhopper.reader.dem.CGIARProvider cGIARProvider0 = new com.graphhopper.reader.dem.CGIARProvider();
        cGIARProvider0.release();
        com.graphhopper.util.Downloader downloader3 = new com.graphhopper.util.Downloader("");
        cGIARProvider0.setDownloader(downloader3);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap0 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>();
        com.carrotsearch.hppc.IntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableIntObjectHashMap1 = strComparableGHIntObjectHashMap0.clone();
        int[] intArray2 = strComparableGHIntObjectHashMap0.keys;
        int[] intArray3 = strComparableGHIntObjectHashMap0.keys;
        org.junit.Assert.assertNotNull(strComparableIntObjectHashMap1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        com.graphhopper.coll.GHTBitSet gHTBitSet1 = new com.graphhopper.coll.GHTBitSet(0);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl3 = new com.graphhopper.coll.GHBitSetImpl((int) (short) 100);
        com.graphhopper.coll.GHBitSet gHBitSet4 = gHTBitSet1.copyTo((com.graphhopper.coll.GHBitSet) gHBitSetImpl3);
        int int5 = gHBitSetImpl3.cardinality();
        org.junit.Assert.assertNotNull(gHBitSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue1 = com.graphhopper.util.EdgeIteratorState.REVERSE_STATE;
        com.graphhopper.routing.util.parsers.OSMRoundaboutParser oSMRoundaboutParser2 = new com.graphhopper.routing.util.parsers.OSMRoundaboutParser(booleanEncodedValue1);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState5 = disabledEdgeIterator0.set(booleanEncodedValue1, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanEncodedValue1);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        com.graphhopper.coll.GHTBitSet gHTBitSet1 = new com.graphhopper.coll.GHTBitSet(20);
        int int2 = gHTBitSet1.getCardinality();
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl4 = new com.graphhopper.coll.GHBitSetImpl((int) (short) 100);
        com.graphhopper.coll.GHBitSet gHBitSet5 = gHTBitSet1.copyTo((com.graphhopper.coll.GHBitSet) gHBitSetImpl4);
        boolean boolean7 = gHTBitSet1.contains((-1909399913));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(gHBitSet5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.util.EncodingManager.Access> accessEnumEncodedValue1 = null;
        com.graphhopper.util.details.EnumDetails<com.graphhopper.routing.util.EncodingManager.Access> accessEnumDetails2 = new com.graphhopper.util.details.EnumDetails<com.graphhopper.routing.util.EncodingManager.Access>("", accessEnumEncodedValue1);
        java.util.Map.Entry<java.lang.String, java.util.List<com.graphhopper.util.details.PathDetail>> strEntry3 = accessEnumDetails2.build();
        com.graphhopper.storage.IntsRef intsRef10 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean11 = intsRef10.isEmpty();
        com.graphhopper.util.PointList pointList13 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState15 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef10, "hike_rating", pointList13, false);
        virtualEdgeIteratorState15.setUnfavored(true);
        int int18 = virtualEdgeIteratorState15.getOriginalEdgeKey();
        int int19 = virtualEdgeIteratorState15.getAdjNode();
        int int20 = virtualEdgeIteratorState15.getAdjNode();
        int int21 = virtualEdgeIteratorState15.getOriginalEdgeKey();
        com.graphhopper.storage.IntsRef intsRef28 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean29 = intsRef28.isEmpty();
        com.graphhopper.util.PointList pointList31 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState33 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef28, "hike_rating", pointList31, false);
        com.graphhopper.storage.IntsRef intsRef36 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState42 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef36, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int43 = edgeIteratorState42.getEdge();
        virtualEdgeIteratorState33.setReverseEdge(edgeIteratorState42);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue45 = com.graphhopper.routing.ev.MaxSpeed.create();
        double double46 = virtualEdgeIteratorState33.get(decimalEncodedValue45);
        double double47 = virtualEdgeIteratorState15.get(decimalEncodedValue45);
        int int48 = virtualEdgeIteratorState15.getEdgeKey();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = accessEnumDetails2.isEdgeDifferentToLastEdge((com.graphhopper.util.EdgeIteratorState) virtualEdgeIteratorState15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strEntry3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1048576 + "'", int18 == 1048576);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1048576 + "'", int21 == 1048576);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(decimalEncodedValue45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + Double.POSITIVE_INFINITY + "'", double46 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + Double.POSITIVE_INFINITY + "'", double47 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue1 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        com.graphhopper.util.details.DecimalDetails decimalDetails4 = new com.graphhopper.util.details.DecimalDetails("prepare.ch.log_messages", decimalEncodedValue1, "srtm$turn_cost", (double) 35.0f);
        com.graphhopper.storage.IntsRef intsRef7 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState13 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef7, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue14 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        double double15 = edgeIteratorState13.getReverse(decimalEncodedValue14);
        boolean boolean16 = decimalDetails4.isEdgeDifferentToLastEdge(edgeIteratorState13);
        org.junit.Assert.assertNotNull(decimalEncodedValue1);
        org.junit.Assert.assertNotNull(edgeIteratorState13);
        org.junit.Assert.assertNotNull(decimalEncodedValue14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.POSITIVE_INFINITY + "'", double15 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        long[] longArray5 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet6 = com.carrotsearch.hppc.LongHashSet.from(longArray5);
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap8 = new com.graphhopper.coll.GHLongLongHashMap(1);
        java.util.Spliterator<com.carrotsearch.hppc.cursors.LongLongCursor> longLongCursorSpliterator9 = gHLongLongHashMap8.spliterator();
        com.carrotsearch.hppc.LongLongHashMap.KeysContainer keysContainer10 = gHLongLongHashMap8.keys();
        int int11 = longHashSet6.retainAll((com.carrotsearch.hppc.LongLookupContainer) keysContainer10);
        int int13 = longHashSet6.removeAll((long) '4');
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet6);
        org.junit.Assert.assertNotNull(longLongCursorSpliterator9);
        org.junit.Assert.assertNotNull(keysContainer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        virtualEdgeIteratorState11.setUnfavored(true);
        double double14 = virtualEdgeIteratorState11.getDistance();
        double double15 = virtualEdgeIteratorState11.getDistance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        int int2 = com.graphhopper.util.GHUtility.createEdgeKey((-1), true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        com.graphhopper.routing.AlgorithmOptions.Builder builder0 = new com.graphhopper.routing.AlgorithmOptions.Builder();
        com.graphhopper.routing.AlgorithmOptions.Builder builder2 = builder0.maxVisitedNodes((int) ' ');
        com.graphhopper.routing.AlgorithmOptions.Builder builder4 = builder2.algorithm("5.4.0-70-generic");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        com.graphhopper.util.shapes.BBox bBox4 = new com.graphhopper.util.shapes.BBox((double) 0L, (double) (short) 0, (double) (byte) 1, 100.0d);
        double double5 = bBox4.minEle;
        boolean boolean10 = bBox4.intersects((double) 10L, (double) 1048576, 0.0d, 0.0d);
        boolean boolean13 = bBox4.contains(52.0d, 4.0024076802712575E7d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        com.graphhopper.storage.IntsRef intsRef18 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean19 = intsRef18.isEmpty();
        com.graphhopper.util.PointList pointList21 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState23 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef18, "hike_rating", pointList21, false);
        com.graphhopper.storage.IntsRef intsRef26 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState32 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef26, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int33 = edgeIteratorState32.getEdge();
        virtualEdgeIteratorState23.setReverseEdge(edgeIteratorState32);
        java.lang.String str35 = virtualEdgeIteratorState23.getName();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue36 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        double double37 = virtualEdgeIteratorState23.getReverse(decimalEncodedValue36);
        double double38 = virtualEdgeIteratorState11.getReverse(decimalEncodedValue36);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue39 = com.graphhopper.routing.ev.MaxWeight.create();
        com.graphhopper.routing.util.parsers.OSMMaxWidthParser oSMMaxWidthParser40 = new com.graphhopper.routing.util.parsers.OSMMaxWidthParser(decimalEncodedValue39);
        com.graphhopper.routing.util.parsers.OSMMaxAxleLoadParser oSMMaxAxleLoadParser41 = new com.graphhopper.routing.util.parsers.OSMMaxAxleLoadParser(decimalEncodedValue39);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState44 = virtualEdgeIteratorState11.set(decimalEncodedValue39, 6.159206975860352E-11d, 4.003017359204114E7d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue max_weight supports only one direction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hike_rating" + "'", str35, "hike_rating");
        org.junit.Assert.assertNotNull(decimalEncodedValue36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + Double.POSITIVE_INFINITY + "'", double37 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + Double.POSITIVE_INFINITY + "'", double38 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(decimalEncodedValue39);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.LITTLE;
        long long3 = bitUtil0.combineIntsToLong(10, (int) (byte) 1);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) -1 };
        bitUtil0.fromShort(byteArray8, (short) 0);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl12 = new com.graphhopper.coll.GHBitSetImpl((int) (short) 100);
        byte[] byteArray13 = gHBitSetImpl12.toByteArray();
        byte[] byteArray14 = gHBitSetImpl12.toByteArray();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = bitUtil0.toInt(byteArray14, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 38");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4294967306L + "'", long3 == 4294967306L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        com.graphhopper.routing.util.spatialrules.CountriesSpatialRuleFactory countriesSpatialRuleFactory0 = new com.graphhopper.routing.util.spatialrules.CountriesSpatialRuleFactory();
        com.graphhopper.routing.util.spatialrules.CountriesSpatialRuleFactory countriesSpatialRuleFactory2 = new com.graphhopper.routing.util.spatialrules.CountriesSpatialRuleFactory();
        org.locationtech.jts.geom.Polygon[] polygonArray4 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList5 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList5, polygonArray4);
        com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule germanySpatialRule7 = new com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList5);
        java.util.List<org.locationtech.jts.geom.Polygon> polygonList8 = germanySpatialRule7.getBorders();
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule9 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule(polygonList8);
        com.graphhopper.routing.util.spatialrules.SpatialRule spatialRule10 = countriesSpatialRuleFactory2.createSpatialRule("srtm", polygonList8);
        com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule germanySpatialRule11 = new com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule(polygonList8);
        com.graphhopper.routing.util.spatialrules.SpatialRule spatialRule12 = countriesSpatialRuleFactory0.createSpatialRule("-1->-1", polygonList8);
        com.graphhopper.routing.util.spatialrules.CountriesSpatialRuleFactory countriesSpatialRuleFactory14 = new com.graphhopper.routing.util.spatialrules.CountriesSpatialRuleFactory();
        org.locationtech.jts.geom.Polygon[] polygonArray16 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList17 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList17, polygonArray16);
        com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule germanySpatialRule19 = new com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList17);
        java.util.List<org.locationtech.jts.geom.Polygon> polygonList20 = germanySpatialRule19.getBorders();
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule21 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule(polygonList20);
        com.graphhopper.routing.util.spatialrules.SpatialRule spatialRule22 = countriesSpatialRuleFactory14.createSpatialRule("srtm", polygonList20);
        com.graphhopper.routing.util.spatialrules.SpatialRule spatialRule23 = countriesSpatialRuleFactory0.createSpatialRule("2 (-1) weight: 10.0, incEdge: -1", polygonList20);
        org.junit.Assert.assertNotNull(polygonArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(polygonList8);
        org.junit.Assert.assertNull(spatialRule10);
        org.junit.Assert.assertNull(spatialRule12);
        org.junit.Assert.assertNotNull(polygonArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(polygonList20);
        org.junit.Assert.assertNull(spatialRule22);
        org.junit.Assert.assertNull(spatialRule23);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        com.graphhopper.storage.NativeFSLockFactory nativeFSLockFactory0 = new com.graphhopper.storage.NativeFSLockFactory();
        java.io.File file1 = null;
        nativeFSLockFactory0.setLockDir(file1);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.GHLock gHLock5 = nativeFSLockFactory0.create("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Set lockDir before creating write locks");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap1 = new com.graphhopper.coll.GHLongLongHashMap(1);
        java.lang.String str3 = gHLongLongHashMap1.visualizeKeyDistribution((int) (byte) 10);
        boolean boolean5 = gHLongLongHashMap1.containsKey(0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "....      " + "'", str3, "....      ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        com.graphhopper.coll.GHTBitSet gHTBitSet1 = new com.graphhopper.coll.GHTBitSet(0);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl3 = new com.graphhopper.coll.GHBitSetImpl((int) (short) 100);
        com.graphhopper.coll.GHBitSet gHBitSet4 = gHTBitSet1.copyTo((com.graphhopper.coll.GHBitSet) gHBitSetImpl3);
        gHBitSet4.clear();
        org.junit.Assert.assertNotNull(gHBitSet4);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        com.graphhopper.storage.NodeAccess nodeAccess25 = graphHopperStorage22.getNodeAccess();
        com.graphhopper.util.PointList pointList26 = null;
        com.graphhopper.storage.ExtendedNodeAccess extendedNodeAccess28 = new com.graphhopper.storage.ExtendedNodeAccess(nodeAccess25, pointList26, 1048576);
        // The following exception was thrown during execution in test generation
        try {
            double double29 = 0.0; // flaky: com.graphhopper.util.GHUtility.getDistance(96, 2, (com.graphhopper.storage.NodeAccess) extendedNodeAccess28);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(nodeAccess25);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("prepare.ch.node.original_edge_count_weight");
        int int6 = dataAccess5.getSegments();
        com.graphhopper.storage.DataAccess dataAccess8 = dataAccess5.create((long) (short) 1);
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dataAccess8);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        com.graphhopper.routing.ch.AStarCHEntry aStarCHEntry5 = new com.graphhopper.routing.ch.AStarCHEntry((int) (short) 1, (int) (short) 10, (int) (short) -1, (double) 4294967306L, (double) (byte) 100);
        aStarCHEntry5.weight = 2;
        double double8 = aStarCHEntry5.getWeightOfVisitedPath();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph> cHPreparationGraphGHLongObjectHashMap0 = new com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph>();
        cHPreparationGraphGHLongObjectHashMap0.ensureCapacity(1048576);
        com.carrotsearch.hppc.LongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph> cHPreparationGraphLongObjectHashMap3 = cHPreparationGraphGHLongObjectHashMap0.clone();
        cHPreparationGraphLongObjectHashMap3.ensureCapacity(2);
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph9 = com.graphhopper.routing.ch.CHPreparationGraph.nodeBased((int) ' ', 0);
        double double13 = cHPreparationGraph9.getTurnWeight(3, (int) (byte) -1, 20);
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph14 = cHPreparationGraphLongObjectHashMap3.getOrDefault((long) (-4), cHPreparationGraph9);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = cHPreparationGraph9.getDegree((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cHPreparationGraphLongObjectHashMap3);
        org.junit.Assert.assertNotNull(cHPreparationGraph9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(cHPreparationGraph14);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        com.graphhopper.routing.util.EncodingManager encodingManager36 = graphHopperStorage7.getEncodingManager();
        boolean boolean38 = encodingManager36.hasEncodedValue("1111111111111111111111111111111111111111111111111111111111111100");
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
        org.junit.Assert.assertNotNull(encodingManager36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
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
        com.graphhopper.GraphHopper graphHopper14 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory15 = null;
        com.graphhopper.GraphHopper graphHopper16 = graphHopper14.setFlagEncoderFactory(flagEncoderFactory15);
        com.graphhopper.reader.dem.MultiSourceElevationProvider multiSourceElevationProvider17 = new com.graphhopper.reader.dem.MultiSourceElevationProvider();
        double double20 = multiSourceElevationProvider17.getEle((double) 0.0f, 0.0d);
        com.graphhopper.GraphHopper graphHopper21 = graphHopper14.setElevationProvider((com.graphhopper.reader.dem.ElevationProvider) multiSourceElevationProvider17);
        java.lang.String str22 = graphHopper14.getGraphHopperLocation();
        com.graphhopper.routing.util.parsers.TagParserFactory tagParserFactory23 = graphHopper14.getTagParserFactory();
        com.graphhopper.GraphHopper graphHopper24 = graphHopper13.setTagParserFactory(tagParserFactory23);
        org.junit.Assert.assertNotNull(graphHopper2);
        org.junit.Assert.assertNull(encodingManager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str6, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile9);
        org.junit.Assert.assertNotNull(profile11);
        org.junit.Assert.assertNotNull(profileArray12);
        org.junit.Assert.assertNotNull(graphHopper13);
        org.junit.Assert.assertNotNull(graphHopper16);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(graphHopper21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(tagParserFactory23);
        org.junit.Assert.assertNotNull(graphHopper24);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager5, false);
        com.graphhopper.storage.CHGraph cHGraph9 = graphHopperStorage7.getCHGraph("bike_network");
        com.graphhopper.routing.weighting.Weighting weighting10 = null;
        com.graphhopper.routing.weighting.Weighting weighting11 = graphHopperStorage7.wrapWeighting(weighting10);
        com.graphhopper.storage.RAMDirectory rAMDirectory13 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory14 = rAMDirectory13.create();
        java.nio.ByteOrder byteOrder15 = rAMDirectory13.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray16 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager17 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray16);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage19 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory13, encodingManager17, false);
        com.graphhopper.storage.CHGraph cHGraph21 = graphHopperStorage19.getCHGraph("bike_network");
        boolean boolean22 = graphHopperStorage19.isCHPossible();
        com.graphhopper.storage.Graph graph23 = com.graphhopper.util.GHUtility.copyTo((com.graphhopper.storage.Graph) graphHopperStorage7, (com.graphhopper.storage.Graph) graphHopperStorage19);
        java.lang.String str24 = graphHopperStorage7.toDetailsString();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(flagEncoderArray4);
        org.junit.Assert.assertNotNull(encodingManager5);
        org.junit.Assert.assertNull(cHGraph9);
        org.junit.Assert.assertNull(weighting11);
        org.junit.Assert.assertNotNull(directory14);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertNotNull(flagEncoderArray16);
        org.junit.Assert.assertNotNull(encodingManager17);
        org.junit.Assert.assertNull(cHGraph21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(graph23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "edges:0(0MB), nodes:0(0MB), name:(0MB), geo:0(0MB), bounds:1.7976931348623157E308,-1.7976931348623157E308,1.7976931348623157E308,-1.7976931348623157E308" + "'", str24, "edges:0(0MB), nodes:0(0MB), name:(0MB), geo:0(0MB), bounds:1.7976931348623157E308,-1.7976931348623157E308,1.7976931348623157E308,-1.7976931348623157E308");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        boolean boolean0 = com.graphhopper.util.Constants.SNAPSHOT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue> encodedValueGHObjectIntHashMap1 = new com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue>((int) (byte) 100);
        java.lang.Object[] objArray2 = encodedValueGHObjectIntHashMap1.keys;
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        com.graphhopper.routing.DirectionResolverResult directionResolverResult2 = com.graphhopper.routing.DirectionResolverResult.onlyLeft((int) (byte) 0, (int) '#');
        int int3 = directionResolverResult2.getInEdgeRight();
        org.junit.Assert.assertNotNull(directionResolverResult2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        com.graphhopper.util.DistanceCalcEarth distanceCalcEarth0 = new com.graphhopper.util.DistanceCalcEarth();
        double double7 = distanceCalcEarth0.calcNormalizedEdgeDistance((double) 11, 4.294967306E9d, (double) (byte) 0, (double) (-3), (double) 'a', (double) (-1.0f));
        double double14 = distanceCalcEarth0.calcNormalizedEdgeDistance((double) (-2), (double) (-3), (double) 4294967306L, (double) (byte) 0, (double) 0L, (double) 11);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.4449835254204146d + "'", double7 == 0.4449835254204146d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.014834047343337549d + "'", double14 == 0.014834047343337549d);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        com.graphhopper.util.DouglasPeucker douglasPeucker0 = new com.graphhopper.util.DouglasPeucker();
        com.graphhopper.util.PointList pointList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = douglasPeucker0.simplify(pointList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        double[] doubleArray5 = new double[] { 1.0d, '#', (short) 1, 100, 100 };
        com.graphhopper.util.shapes.BBox bBox6 = new com.graphhopper.util.shapes.BBox(doubleArray5);
        double[] doubleArray8 = new double[] { (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.shapes.Polygon polygon9 = new com.graphhopper.util.shapes.Polygon(doubleArray5, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Points must be of equal length but was 5 vs. 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 35.0, 1.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph2 = com.graphhopper.routing.ch.CHPreparationGraph.nodeBased(1, (int) ' ');
        org.junit.Assert.assertNotNull(cHPreparationGraph2);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile1 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str2 = customProfile1.toString();
        java.lang.String str3 = customProfile1.getWeighting();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.config.Profile profile5 = customProfile1.setName("prepare.ch.node.original_edge_count_weight/");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Profile names may only contain lower case letters, numbers and underscores, given: prepare.ch.node.original_edge_count_weight/");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str2, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "custom" + "'", str3, "custom");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.graphhopper.routing.ev.MaxHeight maxHeight0 = new com.graphhopper.routing.ev.MaxHeight();
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.storage.DAType dAType3 = rAMDirectory1.getDefaultType();
        com.graphhopper.storage.DAType dAType5 = com.graphhopper.storage.DAType.RAM_INT_STORE;
        com.graphhopper.storage.Directory directory6 = rAMDirectory1.put("", dAType5);
        boolean boolean7 = dAType5.isMMap();
        boolean boolean8 = dAType5.isInteg();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(dAType3);
        org.junit.Assert.assertNotNull(dAType5);
        org.junit.Assert.assertNotNull(directory6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        com.graphhopper.routing.util.spatialrules.SpatialRuleSet spatialRuleSet0 = com.graphhopper.routing.util.spatialrules.SpatialRuleSet.EMPTY;
        org.locationtech.jts.geom.Polygon[] polygonArray1 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList2 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList2, polygonArray1);
        com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule germanySpatialRule4 = new com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList2);
        com.graphhopper.storage.RAMDirectory rAMDirectory6 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory7 = rAMDirectory6.create();
        com.graphhopper.storage.DAType dAType8 = rAMDirectory6.getDefaultType();
        com.graphhopper.routing.ev.RoadClass roadClass9 = com.graphhopper.routing.ev.RoadClass.LIVING_STREET;
        boolean boolean10 = dAType8.equals((java.lang.Object) roadClass9);
        com.graphhopper.routing.util.TransportationMode transportationMode11 = com.graphhopper.routing.util.TransportationMode.MOTORCYCLE;
        double double13 = germanySpatialRule4.getMaxSpeed(roadClass9, transportationMode11, (double) 0.0f);
        com.graphhopper.routing.ev.RoadClass roadClass14 = com.graphhopper.routing.ev.RoadClass.SECONDARY;
        java.lang.String str15 = roadClass14.toString();
        com.graphhopper.routing.util.TransportationMode transportationMode16 = com.graphhopper.routing.util.TransportationMode.OTHER;
        double double18 = germanySpatialRule4.getMaxSpeed(roadClass14, transportationMode16, (double) 21);
        com.graphhopper.routing.util.spatialrules.SpatialRuleSet spatialRuleSet19 = com.graphhopper.routing.util.spatialrules.SpatialRuleSet.EMPTY;
        java.lang.String str20 = spatialRuleSet19.toString();
        com.graphhopper.routing.ev.RoadClass roadClass21 = com.graphhopper.routing.ev.RoadClass.LIVING_STREET;
        java.lang.String str22 = roadClass21.toString();
        com.graphhopper.routing.util.TransportationMode transportationMode23 = com.graphhopper.routing.util.TransportationMode.MOTORCYCLE;
        com.graphhopper.routing.ev.RoadAccess roadAccess25 = com.graphhopper.routing.ev.RoadAccess.find("");
        com.graphhopper.routing.ev.RoadAccess roadAccess26 = spatialRuleSet19.getAccess(roadClass21, transportationMode23, roadAccess25);
        com.graphhopper.routing.util.spatialrules.SpatialRuleSet spatialRuleSet27 = com.graphhopper.routing.util.spatialrules.SpatialRuleSet.EMPTY;
        java.lang.String str28 = spatialRuleSet27.toString();
        com.graphhopper.routing.ev.RoadClass roadClass29 = com.graphhopper.routing.ev.RoadClass.LIVING_STREET;
        java.lang.String str30 = roadClass29.toString();
        com.graphhopper.routing.util.TransportationMode transportationMode31 = com.graphhopper.routing.util.TransportationMode.MOTORCYCLE;
        com.graphhopper.routing.ev.RoadAccess roadAccess33 = com.graphhopper.routing.ev.RoadAccess.find("");
        com.graphhopper.routing.ev.RoadAccess roadAccess34 = spatialRuleSet27.getAccess(roadClass29, transportationMode31, roadAccess33);
        com.graphhopper.routing.ev.RoadAccess roadAccess35 = spatialRuleSet0.getAccess(roadClass14, transportationMode23, roadAccess33);
        java.lang.String str36 = roadAccess33.toString();
        org.junit.Assert.assertNotNull(spatialRuleSet0);
        org.junit.Assert.assertNotNull(polygonArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(directory7);
        org.junit.Assert.assertNotNull(dAType8);
        org.junit.Assert.assertTrue("'" + roadClass9 + "' != '" + com.graphhopper.routing.ev.RoadClass.LIVING_STREET + "'", roadClass9.equals(com.graphhopper.routing.ev.RoadClass.LIVING_STREET));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + transportationMode11 + "' != '" + com.graphhopper.routing.util.TransportationMode.MOTORCYCLE + "'", transportationMode11.equals(com.graphhopper.routing.util.TransportationMode.MOTORCYCLE));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + roadClass14 + "' != '" + com.graphhopper.routing.ev.RoadClass.SECONDARY + "'", roadClass14.equals(com.graphhopper.routing.ev.RoadClass.SECONDARY));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "secondary" + "'", str15, "secondary");
        org.junit.Assert.assertTrue("'" + transportationMode16 + "' != '" + com.graphhopper.routing.util.TransportationMode.OTHER + "'", transportationMode16.equals(com.graphhopper.routing.util.TransportationMode.OTHER));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 21.0d + "'", double18 == 21.0d);
        org.junit.Assert.assertNotNull(spatialRuleSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "SpatialRuleSet [rules=[]]" + "'", str20, "SpatialRuleSet [rules=[]]");
        org.junit.Assert.assertTrue("'" + roadClass21 + "' != '" + com.graphhopper.routing.ev.RoadClass.LIVING_STREET + "'", roadClass21.equals(com.graphhopper.routing.ev.RoadClass.LIVING_STREET));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "living_street" + "'", str22, "living_street");
        org.junit.Assert.assertTrue("'" + transportationMode23 + "' != '" + com.graphhopper.routing.util.TransportationMode.MOTORCYCLE + "'", transportationMode23.equals(com.graphhopper.routing.util.TransportationMode.MOTORCYCLE));
        org.junit.Assert.assertTrue("'" + roadAccess25 + "' != '" + com.graphhopper.routing.ev.RoadAccess.YES + "'", roadAccess25.equals(com.graphhopper.routing.ev.RoadAccess.YES));
        org.junit.Assert.assertTrue("'" + roadAccess26 + "' != '" + com.graphhopper.routing.ev.RoadAccess.YES + "'", roadAccess26.equals(com.graphhopper.routing.ev.RoadAccess.YES));
        org.junit.Assert.assertNotNull(spatialRuleSet27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "SpatialRuleSet [rules=[]]" + "'", str28, "SpatialRuleSet [rules=[]]");
        org.junit.Assert.assertTrue("'" + roadClass29 + "' != '" + com.graphhopper.routing.ev.RoadClass.LIVING_STREET + "'", roadClass29.equals(com.graphhopper.routing.ev.RoadClass.LIVING_STREET));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "living_street" + "'", str30, "living_street");
        org.junit.Assert.assertTrue("'" + transportationMode31 + "' != '" + com.graphhopper.routing.util.TransportationMode.MOTORCYCLE + "'", transportationMode31.equals(com.graphhopper.routing.util.TransportationMode.MOTORCYCLE));
        org.junit.Assert.assertTrue("'" + roadAccess33 + "' != '" + com.graphhopper.routing.ev.RoadAccess.YES + "'", roadAccess33.equals(com.graphhopper.routing.ev.RoadAccess.YES));
        org.junit.Assert.assertTrue("'" + roadAccess34 + "' != '" + com.graphhopper.routing.ev.RoadAccess.YES + "'", roadAccess34.equals(com.graphhopper.routing.ev.RoadAccess.YES));
        org.junit.Assert.assertTrue("'" + roadAccess35 + "' != '" + com.graphhopper.routing.ev.RoadAccess.YES + "'", roadAccess35.equals(com.graphhopper.routing.ev.RoadAccess.YES));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "yes" + "'", str36, "yes");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        com.graphhopper.util.MiniPerfTest miniPerfTest0 = new com.graphhopper.util.MiniPerfTest();
        double double1 = miniPerfTest0.getMax();
        int int2 = miniPerfTest0.getDummySum();
        java.lang.String str3 = miniPerfTest0.getReport();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "sum:0\265s, time/call:0\265s" + "'", str3, "sum:0\265s, time/call:0\265s");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap0 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>();
        com.carrotsearch.hppc.IntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableIntObjectHashMap1 = strComparableGHIntObjectHashMap0.clone();
        int int2 = strComparableIntObjectHashMap1.size();
        int[] intArray3 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet4 = com.graphhopper.coll.GHIntHashSet.from(intArray3);
        int int5 = intHashSet4.size();
        boolean boolean7 = intHashSet4.remove((int) (short) -1);
        com.carrotsearch.hppc.predicates.IntPredicate intPredicate8 = null;
        int int9 = intHashSet4.removeAll(intPredicate8);
        int int10 = strComparableIntObjectHashMap1.removeAll((com.carrotsearch.hppc.IntContainer) intHashSet4);
        int[] intArray11 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet12 = com.graphhopper.coll.GHIntHashSet.from(intArray11);
        int int13 = intHashSet4.addAll(intArray11);
        com.graphhopper.routing.ch.NodeOrderingProvider nodeOrderingProvider14 = com.graphhopper.routing.ch.NodeOrderingProvider.fromArray(intArray11);
        org.junit.Assert.assertNotNull(strComparableIntObjectHashMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intHashSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intHashSet12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeOrderingProvider14);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry4 = new com.graphhopper.routing.ch.PrepareCHEntry(0, (int) (byte) -1, (-1), 0.0d);
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry9 = new com.graphhopper.routing.ch.PrepareCHEntry(0, (int) (byte) -1, (-1), 0.0d);
        prepareCHEntry4.parent = prepareCHEntry9;
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry11 = prepareCHEntry9.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry12 = prepareCHEntry11.getParent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(prepareCHEntry11);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        com.graphhopper.GraphHopper graphHopper0 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        com.graphhopper.GraphHopper graphHopper2 = graphHopper0.setFlagEncoderFactory(flagEncoderFactory1);
        com.graphhopper.routing.lm.LMPreparationHandler lMPreparationHandler3 = graphHopper0.getLMPreparationHandler();
        graphHopper0.close();
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile6 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str7 = customProfile6.toString();
        com.graphhopper.config.Profile profile10 = customProfile6.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        int int11 = profile10.getVersion();
        com.graphhopper.config.Profile profile13 = profile10.setVehicle("1111111111");
        com.graphhopper.util.PMap pMap14 = profile10.getHints();
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile16 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str17 = customProfile16.toString();
        com.graphhopper.config.Profile profile20 = customProfile16.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.util.PMap pMap21 = profile20.getHints();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.weighting.Weighting weighting22 = graphHopper0.createWeighting(profile10, pMap21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphHopper2);
        org.junit.Assert.assertNotNull(lMPreparationHandler3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str7, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1909399913) + "'", int11 == (-1909399913));
        org.junit.Assert.assertNotNull(profile13);
        org.junit.Assert.assertNotNull(pMap14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str17, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile20);
        org.junit.Assert.assertNotNull(pMap21);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        com.carrotsearch.hppc.IntArrayList intArrayList1 = com.graphhopper.util.ArrayUtil.iota(0);
        org.junit.Assert.assertNotNull(intArrayList1);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue0 = com.graphhopper.routing.ev.Country.create();
        int int1 = countryEnumEncodedValue0.getVersion();
        com.graphhopper.routing.ev.Country[] countryArray2 = countryEnumEncodedValue0.getValues();
        org.junit.Assert.assertNotNull(countryEnumEncodedValue0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1687814340 + "'", int1 == 1687814340);
        org.junit.Assert.assertNotNull(countryArray2);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        com.graphhopper.util.StopWatch stopWatch0 = com.graphhopper.util.StopWatch.started();
        com.graphhopper.util.StopWatch stopWatch1 = stopWatch0.start();
        long long2 = stopWatch0.getMillis();
        org.junit.Assert.assertNotNull(stopWatch0);
        org.junit.Assert.assertNotNull(stopWatch1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.graphhopper.routing.ch.CHPreparationHandler cHPreparationHandler0 = new com.graphhopper.routing.ch.CHPreparationHandler();
        com.graphhopper.config.CHProfile[] cHProfileArray1 = new com.graphhopper.config.CHProfile[] {};
        java.util.ArrayList<com.graphhopper.config.CHProfile> cHProfileList2 = new java.util.ArrayList<com.graphhopper.config.CHProfile>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.config.CHProfile>) cHProfileList2, cHProfileArray1);
        com.graphhopper.routing.ch.CHPreparationHandler cHPreparationHandler4 = cHPreparationHandler0.setCHProfiles((java.util.Collection<com.graphhopper.config.CHProfile>) cHProfileList2);
        boolean boolean5 = cHPreparationHandler4.hasCHConfigs();
        org.junit.Assert.assertNotNull(cHProfileArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cHPreparationHandler4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        com.graphhopper.routing.ch.NodeOrderingProvider nodeOrderingProvider1 = com.graphhopper.routing.ch.NodeOrderingProvider.identity((int) (byte) 10);
        int int2 = nodeOrderingProvider1.getNumNodes();
        org.junit.Assert.assertNotNull(nodeOrderingProvider1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.graphhopper.coll.MinHeapWithUpdate minHeapWithUpdate1 = new com.graphhopper.coll.MinHeapWithUpdate(21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = minHeapWithUpdate1.contains(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal id: 100, legal range: [0, 21[");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap0 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>();
        com.carrotsearch.hppc.IntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableIntObjectHashMap1 = strComparableGHIntObjectHashMap0.clone();
        int int2 = strComparableIntObjectHashMap1.size();
        int[] intArray3 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet4 = com.graphhopper.coll.GHIntHashSet.from(intArray3);
        int int5 = intHashSet4.size();
        boolean boolean7 = intHashSet4.remove((int) (short) -1);
        com.carrotsearch.hppc.predicates.IntPredicate intPredicate8 = null;
        int int9 = intHashSet4.removeAll(intPredicate8);
        int int10 = strComparableIntObjectHashMap1.removeAll((com.carrotsearch.hppc.IntContainer) intHashSet4);
        int[] intArray11 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet12 = com.graphhopper.coll.GHIntHashSet.from(intArray11);
        int int13 = intHashSet4.addAll(intArray11);
        int int15 = intHashSet4.removeAll(200);
        org.junit.Assert.assertNotNull(strComparableIntObjectHashMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intHashSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intHashSet12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        com.graphhopper.storage.index.Snap snap2 = new com.graphhopper.storage.index.Snap((double) (-1L), (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.shapes.GHPoint3D gHPoint3D3 = snap2.getSnappedPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Calculate snapped point before!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        com.graphhopper.util.shapes.BBox bBox4 = new com.graphhopper.util.shapes.BBox(52.0d, (double) 2L, (double) (-3), (double) (-1));
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.DataAccess dataAccess7 = rAMDirectory1.find("bike_network");
        dataAccess7.flush();
        int int9 = dataAccess7.getSegments();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
        org.junit.Assert.assertNotNull(dataAccess7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        com.graphhopper.routing.ev.RoadClass roadClass0 = com.graphhopper.routing.ev.RoadClass.PATH;
        org.junit.Assert.assertTrue("'" + roadClass0 + "' != '" + com.graphhopper.routing.ev.RoadClass.PATH + "'", roadClass0.equals(com.graphhopper.routing.ev.RoadClass.PATH));
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        com.graphhopper.routing.util.parsers.OSMTollParser oSMTollParser0 = new com.graphhopper.routing.util.parsers.OSMTollParser();
        com.graphhopper.storage.IntsRef intsRef7 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean8 = intsRef7.isEmpty();
        com.graphhopper.util.PointList pointList10 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState12 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef7, "hike_rating", pointList10, false);
        com.graphhopper.storage.IntsRef intsRef15 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState21 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef15, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int22 = edgeIteratorState21.getEdge();
        virtualEdgeIteratorState12.setReverseEdge(edgeIteratorState21);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue24 = com.graphhopper.routing.ev.MaxSpeed.create();
        double double25 = virtualEdgeIteratorState12.get(decimalEncodedValue24);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState27 = virtualEdgeIteratorState12.setDistance((double) 35.0f);
        double double28 = virtualEdgeIteratorState12.getDistance();
        com.graphhopper.storage.IntsRef intsRef30 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean31 = intsRef30.isEmpty();
        com.graphhopper.storage.IntsRef intsRef33 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int34 = intsRef30.compareTo(intsRef33);
        boolean boolean36 = intsRef33.equals((java.lang.Object) (short) 0);
        boolean boolean37 = intsRef33.isValid();
        com.graphhopper.routing.ev.SimpleBooleanEncodedValue simpleBooleanEncodedValue39 = new com.graphhopper.routing.ev.SimpleBooleanEncodedValue("srtm");
        com.graphhopper.storage.IntsRef intsRef42 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean43 = intsRef42.isEmpty();
        com.graphhopper.storage.IntsRef intsRef45 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int46 = intsRef42.compareTo(intsRef45);
        boolean boolean47 = intsRef42.isValid();
        boolean boolean48 = simpleBooleanEncodedValue39.getBool(true, intsRef42);
        boolean boolean49 = intsRef33.intsEquals(intsRef42);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState50 = virtualEdgeIteratorState12.setFlags(intsRef33);
        com.graphhopper.reader.ReaderWay readerWay52 = new com.graphhopper.reader.ReaderWay((long) 0);
        com.graphhopper.storage.IntsRef intsRef56 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState62 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef56, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        com.graphhopper.storage.IntsRef intsRef63 = oSMTollParser0.handleWayTags(intsRef33, readerWay52, true, intsRef56);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(decimalEncodedValue24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + Double.POSITIVE_INFINITY + "'", double25 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(edgeIteratorState27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 35.0d + "'", double28 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState50);
        org.junit.Assert.assertNotNull(edgeIteratorState62);
        org.junit.Assert.assertNotNull(intsRef63);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap1 = new com.graphhopper.coll.GHIntLongHashMap((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = 0L; // flaky: gHIntLongHashMap1.indexReplace(1687814340, 1001L);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1687814340");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
        // The following exception was thrown during execution in test generation
        try {
            double double56 = 0.0; // flaky: balancedWeightApproximator53.approximate(32, false);
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
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        java.lang.String str4 = rAMDirectory1.getLocation();
        boolean boolean5 = rAMDirectory1.isStoring();
        com.graphhopper.storage.StorableProperties storableProperties6 = new com.graphhopper.storage.StorableProperties((com.graphhopper.storage.Directory) rAMDirectory1);
        com.graphhopper.storage.StorableProperties storableProperties8 = storableProperties6.create(200L);
        com.graphhopper.storage.StorableProperties storableProperties11 = storableProperties6.put("prepare.ch.node.original_edge_count_weight/properties", "2 (-1) weight: 10.0, incEdge: -1");
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "prepare.ch.node.original_edge_count_weight/" + "'", str4, "prepare.ch.node.original_edge_count_weight/");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(storableProperties8);
        org.junit.Assert.assertNotNull(storableProperties11);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions2 = new com.graphhopper.routing.AlgorithmOptions("", weighting1);
        java.lang.String str3 = algorithmOptions2.getAlgorithm();
        com.graphhopper.routing.AlgorithmOptions.Builder builder4 = com.graphhopper.routing.AlgorithmOptions.start(algorithmOptions2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        java.util.Random random1 = null;
        com.carrotsearch.hppc.IntArrayList intArrayList2 = com.graphhopper.util.ArrayUtil.permutation((int) (short) 1, random1);
        com.carrotsearch.hppc.IntArrayList intArrayList3 = com.graphhopper.util.ArrayUtil.reverse(intArrayList2);
        com.carrotsearch.hppc.IntArrayList intArrayList4 = com.graphhopper.util.ArrayUtil.invert(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.graphhopper.routing.ev.RoadEnvironment roadEnvironment1 = com.graphhopper.routing.ev.RoadEnvironment.find("horse_rating");
        org.junit.Assert.assertTrue("'" + roadEnvironment1 + "' != '" + com.graphhopper.routing.ev.RoadEnvironment.OTHER + "'", roadEnvironment1.equals(com.graphhopper.routing.ev.RoadEnvironment.OTHER));
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        java.lang.String str0 = com.graphhopper.routing.ev.MaxSpeed.KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "max_speed" + "'", str0, "max_speed");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        com.graphhopper.coll.GHSortedCollection gHSortedCollection0 = new com.graphhopper.coll.GHSortedCollection();
        gHSortedCollection0.insert(11, (int) (byte) 1);
        int int4 = gHSortedCollection0.peekKey();
        // The following exception was thrown during execution in test generation
        try {
            gHSortedCollection0.update((int) (short) 0, 50, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: cannot remove key 0 with value 50 - did you insert 0,50 before?");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.storage.IntsRef intsRef3 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState9 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef3, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int10 = edgeIteratorState9.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue11 = com.graphhopper.routing.ev.Country.create();
        boolean boolean12 = countryEnumEncodedValue11.isStoreTwoDirections();
        com.graphhopper.routing.ev.Country country13 = edgeIteratorState9.getReverse(countryEnumEncodedValue11);
        com.graphhopper.storage.IntsRef intsRef21 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean22 = intsRef21.isEmpty();
        com.graphhopper.util.PointList pointList24 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState26 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef21, "hike_rating", pointList24, false);
        int int27 = countryEnumEncodedValue11.getInt(true, intsRef21);
        int int28 = countryEnumEncodedValue11.getMaxInt();
        com.graphhopper.storage.IntsRef intsRef31 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState37 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef31, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int38 = edgeIteratorState37.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue39 = com.graphhopper.routing.ev.Country.create();
        boolean boolean40 = countryEnumEncodedValue39.isStoreTwoDirections();
        com.graphhopper.routing.ev.Country country41 = edgeIteratorState37.getReverse(countryEnumEncodedValue39);
        java.lang.String str42 = country41.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState43 = disabledEdgeIterator0.set(countryEnumEncodedValue11, country41);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorState9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + country13 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country13.equals(com.graphhopper.routing.ev.Country.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(edgeIteratorState37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + country41 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country41.equals(com.graphhopper.routing.ev.Country.DEFAULT));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "default" + "'", str42, "default");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        com.graphhopper.routing.ev.RoadClass roadClass13 = com.graphhopper.routing.ev.RoadClass.SECONDARY;
        java.lang.String str14 = roadClass13.toString();
        com.graphhopper.routing.util.TransportationMode transportationMode15 = com.graphhopper.routing.util.TransportationMode.OTHER;
        double double17 = germanySpatialRule3.getMaxSpeed(roadClass13, transportationMode15, (double) 21);
        boolean boolean18 = transportationMode15.isMotorVehicle();
        org.junit.Assert.assertNotNull(polygonArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(directory6);
        org.junit.Assert.assertNotNull(dAType7);
        org.junit.Assert.assertTrue("'" + roadClass8 + "' != '" + com.graphhopper.routing.ev.RoadClass.LIVING_STREET + "'", roadClass8.equals(com.graphhopper.routing.ev.RoadClass.LIVING_STREET));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + transportationMode10 + "' != '" + com.graphhopper.routing.util.TransportationMode.MOTORCYCLE + "'", transportationMode10.equals(com.graphhopper.routing.util.TransportationMode.MOTORCYCLE));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + roadClass13 + "' != '" + com.graphhopper.routing.ev.RoadClass.SECONDARY + "'", roadClass13.equals(com.graphhopper.routing.ev.RoadClass.SECONDARY));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "secondary" + "'", str14, "secondary");
        org.junit.Assert.assertTrue("'" + transportationMode15 + "' != '" + com.graphhopper.routing.util.TransportationMode.OTHER + "'", transportationMode15.equals(com.graphhopper.routing.util.TransportationMode.OTHER));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 21.0d + "'", double17 == 21.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        com.graphhopper.util.DouglasPeucker douglasPeucker0 = new com.graphhopper.util.DouglasPeucker();
        com.graphhopper.util.DouglasPeucker douglasPeucker2 = douglasPeucker0.setElevationMaxDistance((-1.0d));
        com.graphhopper.util.PointList pointList3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = douglasPeucker2.simplify(pointList3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(douglasPeucker2);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.UnsignedDecimalEncodedValue unsignedDecimalEncodedValue6 = new com.graphhopper.routing.ev.UnsignedDecimalEncodedValue("[0 0 0 0 0 0 0 0 0 0]", 11, (double) (short) 1, (double) '#', true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue name wasn't valid: [0 0 0 0 0 0 0 0 0 0]. Use lower case letters, underscore and numbers only.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        com.graphhopper.util.BitUtil bitUtil0 = com.graphhopper.util.BitUtil.LITTLE;
        java.lang.String str2 = bitUtil0.toBitString((long) (-4));
        byte[] byteArray4 = bitUtil0.fromShort((short) 0);
        com.graphhopper.util.BitUtil bitUtil6 = com.graphhopper.util.BitUtil.LITTLE;
        long long9 = bitUtil6.combineIntsToLong(10, (int) (byte) 1);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10 };
        java.lang.String str15 = bitUtil6.toBitString(byteArray14);
        com.graphhopper.reader.osm.pbf.PbfBlobDecoderListener pbfBlobDecoderListener16 = null;
        com.graphhopper.reader.osm.pbf.PbfBlobDecoder pbfBlobDecoder17 = new com.graphhopper.reader.osm.pbf.PbfBlobDecoder("srtm", byteArray14, pbfBlobDecoderListener16);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitUtil0.toLong(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bitUtil0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111100" + "'", str2, "1111111111111111111111111111111111111111111111111111111111111100");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(bitUtil6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4294967306L + "'", long9 == 4294967306L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, 10, 10, 10]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "00001010000010100000101001100100" + "'", str15, "00001010000010100000101001100100");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        virtualEdgeIteratorState11.setUnfavored(true);
        com.graphhopper.storage.IntsRef intsRef14 = virtualEdgeIteratorState11.getFlags();
        int int15 = virtualEdgeIteratorState11.getBaseNode();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intsRef14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        com.graphhopper.routing.Path path26 = path21.setDistance((double) 11);
        boolean boolean27 = path21.isFound();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.SimpleBooleanEncodedValue simpleBooleanEncodedValue1 = new com.graphhopper.routing.ev.SimpleBooleanEncodedValue("Node: 200 lat=0.0 lon=3.0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue name wasn't valid: Node: 200 lat=0.0 lon=3.0. Use lower case letters, underscore and numbers only.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.graphhopper.util.shapes.BBox bBox4 = new com.graphhopper.util.shapes.BBox((double) 0L, (double) (short) 0, (double) (byte) 1, 100.0d);
        double double5 = bBox4.maxLat;
        boolean boolean10 = bBox4.intersects((double) (short) 10, (double) 200, (double) 4, (double) (byte) 10);
        com.graphhopper.util.shapes.BBox bBox11 = bBox4.getBounds();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bBox11);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        com.graphhopper.reader.dem.MultiSourceElevationProvider multiSourceElevationProvider1 = new com.graphhopper.reader.dem.MultiSourceElevationProvider("aut");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        java.util.Random random0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.tour.MultiPointTour multiPointTour3 = new com.graphhopper.routing.util.tour.MultiPointTour(random0, 0.4642857015132904d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap1 = new com.graphhopper.coll.GHLongLongHashMap(1);
        java.util.Spliterator<com.carrotsearch.hppc.cursors.LongLongCursor> longLongCursorSpliterator2 = gHLongLongHashMap1.spliterator();
        gHLongLongHashMap1.ensureCapacity((int) (byte) 10);
        long[] longArray5 = gHLongLongHashMap1.keys;
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap7 = new com.graphhopper.coll.GHLongLongHashMap(1);
        java.util.Spliterator<com.carrotsearch.hppc.cursors.LongLongCursor> longLongCursorSpliterator8 = gHLongLongHashMap7.spliterator();
        com.carrotsearch.hppc.LongLongHashMap.KeysContainer keysContainer9 = gHLongLongHashMap7.keys();
        boolean boolean12 = gHLongLongHashMap7.putIfAbsent((long) 3, (long) 35);
        int int13 = gHLongLongHashMap1.putAll((java.lang.Iterable<com.carrotsearch.hppc.cursors.LongLongCursor>) gHLongLongHashMap7);
        org.junit.Assert.assertNotNull(longLongCursorSpliterator2);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(longLongCursorSpliterator8);
        org.junit.Assert.assertNotNull(keysContainer9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl1 = new com.graphhopper.coll.GHBitSetImpl((int) (short) 100);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl2 = new com.graphhopper.coll.GHBitSetImpl();
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl3 = new com.graphhopper.coll.GHBitSetImpl();
        gHBitSetImpl3.remove((int) (short) 10);
        gHBitSetImpl3.clear();
        int int7 = gHBitSetImpl3.getCardinality();
        com.graphhopper.coll.GHBitSet gHBitSet8 = gHBitSetImpl2.copyTo((com.graphhopper.coll.GHBitSet) gHBitSetImpl3);
        gHBitSetImpl1.andNot((java.util.BitSet) gHBitSetImpl3);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl11 = new com.graphhopper.coll.GHBitSetImpl((int) (short) 100);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl12 = new com.graphhopper.coll.GHBitSetImpl();
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl13 = new com.graphhopper.coll.GHBitSetImpl();
        gHBitSetImpl13.remove((int) (short) 10);
        gHBitSetImpl13.clear();
        int int17 = gHBitSetImpl13.getCardinality();
        com.graphhopper.coll.GHBitSet gHBitSet18 = gHBitSetImpl12.copyTo((com.graphhopper.coll.GHBitSet) gHBitSetImpl13);
        gHBitSetImpl11.andNot((java.util.BitSet) gHBitSetImpl13);
        int int21 = gHBitSetImpl13.previousSetBit((int) (byte) 1);
        gHBitSetImpl3.andNot((java.util.BitSet) gHBitSetImpl13);
        java.lang.Object obj23 = null;
        boolean boolean24 = gHBitSetImpl3.equals(obj23);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(gHBitSet8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(gHBitSet18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        com.graphhopper.util.DistanceCalcEarth distanceCalcEarth0 = new com.graphhopper.util.DistanceCalcEarth();
        double double7 = distanceCalcEarth0.calcDist3D((double) 'a', (double) (short) 1, (double) (byte) -1, (double) 100.0f, (double) (short) 100, (double) (short) 1);
        double double9 = distanceCalcEarth0.calcCircumference((double) 1);
        double double11 = distanceCalcEarth0.calcNormalizedDist((double) (short) 100);
        boolean boolean14 = distanceCalcEarth0.isDateLineCrossOver((double) 0.0f, (double) 10);
        double double19 = distanceCalcEarth0.calcDist((double) (-1.0f), (double) 50, (double) 100L, (double) 11);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1451566.8463946683d + "'", double7 == 1451566.8463946683d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0024076802712575E7d + "'", double9 == 4.0024076802712575E7d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 6.159206975860352E-11d + "'", double11 == 6.159206975860352E-11d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0980455852832992E7d + "'", double19 == 1.0980455852832992E7d);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.lm.LMConfig lMConfig2 = new com.graphhopper.routing.lm.LMConfig("sum:0\265s, time/call:0\265s", weighting1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Profile names may only contain lower case letters, numbers and underscores, given: sum:0?s, time/call:0?s");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        com.graphhopper.routing.util.parsers.OSMHikeRatingParser oSMHikeRatingParser0 = new com.graphhopper.routing.util.parsers.OSMHikeRatingParser();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray1 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager2 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray1);
        java.lang.String str3 = encodingManager2.toFlagEncodersAsString();
        boolean boolean5 = encodingManager2.hasEncodedValue("name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        java.util.List<com.graphhopper.routing.ev.BooleanEncodedValue> booleanEncodedValueList7 = encodingManager2.getAccessEncFromNodeFlags((long) (byte) 10);
        com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser oSMHazmatTunnelParser8 = new com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray9 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager10 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray9);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue11 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue12 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray13 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue11, decimalEncodedValue12 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList14 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14, encodedValueArray13);
        oSMHazmatTunnelParser8.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager10, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList14);
        java.util.List<com.graphhopper.routing.ev.EncodedValue> encodedValueList17 = encodingManager10.getEncodedValues();
        // The following exception was thrown during execution in test generation
        try {
            oSMHikeRatingParser0.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager2, encodedValueList17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(flagEncoderArray1);
        org.junit.Assert.assertNotNull(encodingManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanEncodedValueList7);
        org.junit.Assert.assertNotNull(flagEncoderArray9);
        org.junit.Assert.assertNotNull(encodingManager10);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue11);
        org.junit.Assert.assertNotNull(decimalEncodedValue12);
        org.junit.Assert.assertNotNull(encodedValueArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(encodedValueList17);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        java.lang.String str0 = com.graphhopper.routing.ev.MaxHeight.KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "max_height" + "'", str0, "max_height");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess5 = rAMDirectory1.find("1111111111111111111111111111111111111111111111111111111111111100");
        rAMDirectory1.clear();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dataAccess5);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        int[] intArray0 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet1 = com.graphhopper.coll.GHIntHashSet.from(intArray0);
        int int2 = intHashSet1.size();
        boolean boolean4 = intHashSet1.remove((int) (short) -1);
        int int6 = intHashSet1.indexGet((int) (byte) 1);
        int int8 = intHashSet1.removeAll(21);
        boolean boolean9 = intHashSet1.isEmpty();
        com.carrotsearch.hppc.predicates.IntPredicate intPredicate10 = null;
        int int11 = intHashSet1.retainAll(intPredicate10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intHashSet1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        java.lang.String str0 = com.graphhopper.routing.ch.CHParameters.ORIGINAL_EDGE_QUOTIENT_WEIGHT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "prepare.ch.edge.original_edge_quotient_weight" + "'", str0, "prepare.ch.edge.original_edge_quotient_weight");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        com.graphhopper.util.shapes.BBox bBox4 = new com.graphhopper.util.shapes.BBox((double) 0L, (double) (short) 0, (double) (byte) 1, 100.0d);
        double double5 = bBox4.maxLat;
        boolean boolean10 = bBox4.intersects(1.0d, 52.0d, 90.0002104591497d, 116.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.edge.witness_search.sigma_factor");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap1 = new com.graphhopper.coll.GHIntLongHashMap((int) (byte) 1);
        boolean boolean3 = gHIntLongHashMap1.indexExists((int) (byte) 1);
        long long5 = gHIntLongHashMap1.remove((int) (short) -1);
        long[] longArray6 = gHIntLongHashMap1.values;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[0, 0, 0, 0, 0]");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap3 = new com.graphhopper.coll.OSMIDMap(directory2);
        com.graphhopper.search.StringIndex stringIndex5 = new com.graphhopper.search.StringIndex(directory2, 10);
        boolean boolean6 = stringIndex5.isClosed();
        long long7 = stringIndex5.getCapacity();
        com.graphhopper.storage.RAMDirectory rAMDirectory9 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory10 = rAMDirectory9.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap11 = new com.graphhopper.coll.OSMIDMap(directory10);
        com.graphhopper.search.StringIndex stringIndex13 = new com.graphhopper.search.StringIndex(directory10, 10);
        stringIndex5.copyTo(stringIndex13);
        stringIndex5.close();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(directory10);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.AlgorithmOptions algorithmOptions2 = new com.graphhopper.routing.AlgorithmOptions("aut", weighting1);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        com.graphhopper.coll.GHSortedCollection gHSortedCollection0 = new com.graphhopper.coll.GHSortedCollection();
        int int1 = gHSortedCollection0.getSlidingMeanValue();
        gHSortedCollection0.insert((int) (short) 0, (int) '4');
        int int5 = gHSortedCollection0.peekKey();
        int int6 = gHSortedCollection0.pollKey();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = gHSortedCollection0.pollKey();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: collection is already empty!?");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        com.graphhopper.routing.util.spatialrules.CountriesSpatialRuleFactory countriesSpatialRuleFactory0 = new com.graphhopper.routing.util.spatialrules.CountriesSpatialRuleFactory();
        org.locationtech.jts.geom.Polygon[] polygonArray2 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList3 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList3, polygonArray2);
        com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule germanySpatialRule5 = new com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList3);
        java.util.List<org.locationtech.jts.geom.Polygon> polygonList6 = germanySpatialRule5.getBorders();
        com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule austriaSpatialRule7 = new com.graphhopper.routing.util.spatialrules.countries.AustriaSpatialRule(polygonList6);
        com.graphhopper.routing.util.spatialrules.SpatialRule spatialRule8 = countriesSpatialRuleFactory0.createSpatialRule("srtm", polygonList6);
        org.locationtech.jts.geom.Polygon[] polygonArray10 = new org.locationtech.jts.geom.Polygon[] {};
        java.util.ArrayList<org.locationtech.jts.geom.Polygon> polygonList11 = new java.util.ArrayList<org.locationtech.jts.geom.Polygon>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.locationtech.jts.geom.Polygon>) polygonList11, polygonArray10);
        com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule germanySpatialRule13 = new com.graphhopper.routing.util.spatialrules.countries.GermanySpatialRule((java.util.List<org.locationtech.jts.geom.Polygon>) polygonList11);
        com.graphhopper.storage.RAMDirectory rAMDirectory15 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory16 = rAMDirectory15.create();
        com.graphhopper.storage.DAType dAType17 = rAMDirectory15.getDefaultType();
        com.graphhopper.routing.ev.RoadClass roadClass18 = com.graphhopper.routing.ev.RoadClass.LIVING_STREET;
        boolean boolean19 = dAType17.equals((java.lang.Object) roadClass18);
        com.graphhopper.routing.util.TransportationMode transportationMode20 = com.graphhopper.routing.util.TransportationMode.MOTORCYCLE;
        double double22 = germanySpatialRule13.getMaxSpeed(roadClass18, transportationMode20, (double) 0.0f);
        com.graphhopper.routing.ev.RoadClass roadClass23 = com.graphhopper.routing.ev.RoadClass.SECONDARY;
        java.lang.String str24 = roadClass23.toString();
        com.graphhopper.routing.util.TransportationMode transportationMode25 = com.graphhopper.routing.util.TransportationMode.OTHER;
        double double27 = germanySpatialRule13.getMaxSpeed(roadClass23, transportationMode25, (double) 21);
        java.lang.String str28 = germanySpatialRule13.toString();
        java.util.List<org.locationtech.jts.geom.Polygon> polygonList29 = germanySpatialRule13.getBorders();
        com.graphhopper.routing.util.spatialrules.SpatialRule spatialRule30 = countriesSpatialRuleFactory0.createSpatialRule("..", polygonList29);
        org.junit.Assert.assertNotNull(polygonArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(polygonList6);
        org.junit.Assert.assertNull(spatialRule8);
        org.junit.Assert.assertNotNull(polygonArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(directory16);
        org.junit.Assert.assertNotNull(dAType17);
        org.junit.Assert.assertTrue("'" + roadClass18 + "' != '" + com.graphhopper.routing.ev.RoadClass.LIVING_STREET + "'", roadClass18.equals(com.graphhopper.routing.ev.RoadClass.LIVING_STREET));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + transportationMode20 + "' != '" + com.graphhopper.routing.util.TransportationMode.MOTORCYCLE + "'", transportationMode20.equals(com.graphhopper.routing.util.TransportationMode.MOTORCYCLE));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + roadClass23 + "' != '" + com.graphhopper.routing.ev.RoadClass.SECONDARY + "'", roadClass23.equals(com.graphhopper.routing.ev.RoadClass.SECONDARY));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "secondary" + "'", str24, "secondary");
        org.junit.Assert.assertTrue("'" + transportationMode25 + "' != '" + com.graphhopper.routing.util.TransportationMode.OTHER + "'", transportationMode25.equals(com.graphhopper.routing.util.TransportationMode.OTHER));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 21.0d + "'", double27 == 21.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "SpatialRule [getId()=deu, getPriority()=100]" + "'", str28, "SpatialRule [getId()=deu, getPriority()=100]");
        org.junit.Assert.assertNotNull(polygonList29);
        org.junit.Assert.assertNull(spatialRule30);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.graphhopper.GraphHopper graphHopper0 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        com.graphhopper.GraphHopper graphHopper2 = graphHopper0.setFlagEncoderFactory(flagEncoderFactory1);
        com.graphhopper.routing.lm.LMPreparationHandler lMPreparationHandler3 = graphHopper0.getLMPreparationHandler();
        boolean boolean4 = lMPreparationHandler3.hasLMProfiles();
        com.graphhopper.routing.lm.PrepareLandmarks prepareLandmarks5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.lm.LMPreparationHandler lMPreparationHandler6 = lMPreparationHandler3.addPreparation(prepareLandmarks5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphHopper2);
        org.junit.Assert.assertNotNull(lMPreparationHandler3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue3 = new com.graphhopper.routing.ev.StringEncodedValue("bike_network", 10);
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.storage.IntsRef intsRef9 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int10 = intsRef6.compareTo(intsRef9);
        java.lang.String str11 = stringEncodedValue3.getString(false, intsRef9);
        com.graphhopper.util.details.StringDetails stringDetails12 = new com.graphhopper.util.details.StringDetails("mtb", stringEncodedValue3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        virtualEdgeIteratorState11.setUnfavored(true);
        double double14 = virtualEdgeIteratorState11.getDistance();
        int int15 = virtualEdgeIteratorState11.getEdge();
        com.graphhopper.storage.IntsRef intsRef18 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState24 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef18, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int25 = edgeIteratorState24.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue26 = com.graphhopper.routing.ev.Country.create();
        boolean boolean27 = countryEnumEncodedValue26.isStoreTwoDirections();
        com.graphhopper.routing.ev.Country country28 = edgeIteratorState24.getReverse(countryEnumEncodedValue26);
        com.graphhopper.storage.IntsRef intsRef31 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState37 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef31, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        boolean boolean38 = countryEnumEncodedValue26.equals((java.lang.Object) (byte) 0);
        com.graphhopper.storage.IntsRef intsRef41 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState47 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef41, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int48 = edgeIteratorState47.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue49 = com.graphhopper.routing.ev.Country.create();
        boolean boolean50 = countryEnumEncodedValue49.isStoreTwoDirections();
        com.graphhopper.routing.ev.Country country51 = edgeIteratorState47.getReverse(countryEnumEncodedValue49);
        java.lang.String str52 = country51.toString();
        com.graphhopper.routing.ev.Country country54 = com.graphhopper.routing.ev.Country.find("....      ");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState55 = virtualEdgeIteratorState11.set(countryEnumEncodedValue26, country51, country54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue country supports only one direction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(edgeIteratorState24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + country28 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country28.equals(com.graphhopper.routing.ev.Country.DEFAULT));
        org.junit.Assert.assertNotNull(edgeIteratorState37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(edgeIteratorState47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + country51 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country51.equals(com.graphhopper.routing.ev.Country.DEFAULT));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "default" + "'", str52, "default");
        org.junit.Assert.assertTrue("'" + country54 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country54.equals(com.graphhopper.routing.ev.Country.DEFAULT));
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        com.carrotsearch.hppc.HashOrderMixingStrategy hashOrderMixingStrategy2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHIntObjectHashMap<com.graphhopper.GraphHopperAPI> graphHopperAPIGHIntObjectHashMap3 = new com.graphhopper.coll.GHIntObjectHashMap<com.graphhopper.GraphHopperAPI>((int) (byte) 1, (double) 1687814340, hashOrderMixingStrategy2);
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.hppc.BufferAllocationException; message: The load factor should be in range [0.01, 0.99]: 1687814340.000000");
        } catch (com.carrotsearch.hppc.BufferAllocationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        com.graphhopper.util.MiniPerfTest miniPerfTest0 = new com.graphhopper.util.MiniPerfTest();
        double double1 = miniPerfTest0.getMax();
        int int2 = miniPerfTest0.getDummySum();
        int int3 = miniPerfTest0.getDummySum();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl0 = new com.graphhopper.coll.GHBitSetImpl();
        gHBitSetImpl0.remove((int) (short) 10);
        gHBitSetImpl0.clear();
        int int4 = gHBitSetImpl0.getCardinality();
        gHBitSetImpl0.clear();
        int int6 = gHBitSetImpl0.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap0 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>();
        int[] intArray1 = strComparableGHIntObjectHashMap0.keys;
        java.lang.Comparable<java.lang.String> strComparable3 = strComparableGHIntObjectHashMap0.get((-4));
        java.lang.Object[] objArray4 = strComparableGHIntObjectHashMap0.values;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNull(strComparable3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
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
        com.graphhopper.util.PathMerger pathMerger26 = pathMerger24.setSimplifyResponse(true);
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
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        double double25 = path23.getDistance();
        com.graphhopper.routing.Path.EdgeVisitor edgeVisitor26 = null;
        // The following exception was thrown during execution in test generation
        try {
            path23.forEveryEdge(edgeVisitor26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: fromNode < 0 should not happen");
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
        org.junit.Assert.assertNotNull(path23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "found: false, weight: 1.7976931348623157E308, time: 100, distance: 0.0, edges: 0" + "'", str24, "found: false, weight: 1.7976931348623157E308, time: 100, distance: 0.0, edges: 0");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.graphhopper.util.details.DistanceDetails distanceDetails0 = new com.graphhopper.util.details.DistanceDetails();
        com.graphhopper.storage.IntsRef intsRef7 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean8 = intsRef7.isEmpty();
        com.graphhopper.util.PointList pointList10 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState12 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef7, "hike_rating", pointList10, false);
        com.graphhopper.storage.IntsRef intsRef15 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState21 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef15, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int22 = edgeIteratorState21.getEdge();
        virtualEdgeIteratorState12.setReverseEdge(edgeIteratorState21);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue24 = com.graphhopper.routing.ev.MaxSpeed.create();
        double double25 = virtualEdgeIteratorState12.get(decimalEncodedValue24);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState27 = virtualEdgeIteratorState12.setDistance((double) 35.0f);
        boolean boolean28 = distanceDetails0.isEdgeDifferentToLastEdge(edgeIteratorState27);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState30 = edgeIteratorState27.setDistance(35.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(decimalEncodedValue24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + Double.POSITIVE_INFINITY + "'", double25 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(edgeIteratorState27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState30);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        int[] intArray0 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet1 = com.graphhopper.coll.GHIntHashSet.from(intArray0);
        int int2 = intHashSet1.size();
        int[] intArray3 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet4 = com.graphhopper.coll.GHIntHashSet.from(intArray3);
        int int5 = intHashSet4.size();
        boolean boolean7 = intHashSet4.remove((int) (short) -1);
        boolean boolean9 = intHashSet4.add((-4));
        int[] intArray10 = intHashSet4.keys;
        intHashSet1.keys = intArray10;
        com.carrotsearch.hppc.IntHashSet intHashSet12 = com.graphhopper.coll.GHIntHashSet.from(intArray10);
        boolean boolean14 = intHashSet12.add((int) ' ');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intHashSet1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intHashSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, -4, 0, 0]");
        org.junit.Assert.assertNotNull(intHashSet12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        com.carrotsearch.hppc.IntArrayList intArrayList1 = com.graphhopper.util.ArrayUtil.iota(20);
        com.carrotsearch.hppc.IntArrayList intArrayList2 = com.graphhopper.util.ArrayUtil.reverse(intArrayList1);
        com.graphhopper.coll.GHIntHashSet gHIntHashSet3 = new com.graphhopper.coll.GHIntHashSet((com.carrotsearch.hppc.IntContainer) intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        double double0 = com.graphhopper.util.DistanceCalcEarth.R;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 6371000.0d + "'", double0 == 6371000.0d);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        com.graphhopper.storage.CHGraph cHGraph0 = null;
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue2 = null;
        com.graphhopper.routing.util.DefaultEdgeFilter defaultEdgeFilter3 = com.graphhopper.routing.util.DefaultEdgeFilter.outEdges(booleanEncodedValue2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = com.graphhopper.util.GHUtility.getNodeInfo(cHGraph0, (int) (byte) 10, (com.graphhopper.routing.util.EdgeFilter) defaultEdgeFilter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultEdgeFilter3);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile1 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str2 = customProfile1.toString();
        com.graphhopper.config.Profile profile5 = customProfile1.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.util.PMap pMap6 = profile5.getHints();
        com.graphhopper.routing.RoundTripRouting.Params params9 = new com.graphhopper.routing.RoundTripRouting.Params(pMap6, 1143.0d, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str2, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile5);
        org.junit.Assert.assertNotNull(pMap6);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.storage.CHConfig cHConfig2 = com.graphhopper.storage.CHConfig.edgeBased("foot_network", weighting1);
        com.graphhopper.routing.weighting.Weighting weighting3 = cHConfig2.getWeighting();
        com.graphhopper.routing.weighting.Weighting weighting4 = cHConfig2.getWeighting();
        org.junit.Assert.assertNotNull(cHConfig2);
        org.junit.Assert.assertNull(weighting3);
        org.junit.Assert.assertNull(weighting4);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        com.graphhopper.routing.ch.AStarCHEntry aStarCHEntry3 = new com.graphhopper.routing.ch.AStarCHEntry(2, (double) 10L, (double) 2);
        double double4 = aStarCHEntry3.weight;
        aStarCHEntry3.weightOfVisitedPath = (short) 0;
        int int7 = aStarCHEntry3.edge;
        double double8 = aStarCHEntry3.weight;
        java.lang.String str9 = aStarCHEntry3.toString();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2 (-1) weight: 10.0, incEdge: -1" + "'", str9, "2 (-1) weight: 10.0, incEdge: -1");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        com.graphhopper.storage.index.Snap snap2 = new com.graphhopper.storage.index.Snap((double) (-1L), (double) (-1));
        com.graphhopper.storage.index.Snap.Position position3 = snap2.getSnappedPosition();
        int int4 = snap2.getClosestNode();
        org.junit.Assert.assertNull(position3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        com.graphhopper.storage.RoutingCHGraph routingCHGraph0 = null;
        com.graphhopper.routing.ch.ShortcutUnpacker.Visitor visitor1 = null;
        com.graphhopper.routing.ch.ShortcutUnpacker shortcutUnpacker3 = new com.graphhopper.routing.ch.ShortcutUnpacker(routingCHGraph0, visitor1, true);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        com.graphhopper.util.BitUtil bitUtil17 = com.graphhopper.util.BitUtil.LITTLE;
        long long20 = bitUtil17.combineIntsToLong(10, (int) (byte) 1);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10 };
        java.lang.String str26 = bitUtil17.toBitString(byteArray25);
        byte[] byteArray28 = bitUtil17.fromShort((short) 100);
        // The following exception was thrown during execution in test generation
        try {
            dataAccess15.setBytes((long) '4', byteArray28, 10);
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
        org.junit.Assert.assertNotNull(bitUtil17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 4294967306L + "'", long20 == 4294967306L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 10, 10, 10]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00001010000010100000101001100100" + "'", str26, "00001010000010100000101001100100");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100, 0, 0, 0]");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        com.graphhopper.util.shapes.BBox bBox4 = new com.graphhopper.util.shapes.BBox((double) 0L, (double) (short) 0, (double) (byte) 1, 100.0d);
        double double5 = bBox4.minLat;
        double double6 = bBox4.minLon;
        boolean boolean7 = bBox4.isValid();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        int[] intArray0 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet1 = com.graphhopper.coll.GHIntHashSet.from(intArray0);
        int int2 = intHashSet1.size();
        boolean boolean4 = intHashSet1.remove((int) (short) -1);
        int int6 = intHashSet1.indexGet((int) (byte) 1);
        int int8 = intHashSet1.removeAll(21);
        boolean boolean9 = intHashSet1.isEmpty();
        int[] intArray10 = intHashSet1.keys;
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intHashSet1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 0]");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
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
        // The following exception was thrown during execution in test generation
        try {
            double double56 = 0.0; // flaky: balancedWeightApproximator53.approximate((int) (short) 1, false);
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
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        com.graphhopper.storage.NodeAccess nodeAccess0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator2 = new com.graphhopper.routing.weighting.BeelineWeightApproximator(nodeAccess0, weighting1);
        com.graphhopper.routing.weighting.BalancedWeightApproximator balancedWeightApproximator3 = new com.graphhopper.routing.weighting.BalancedWeightApproximator((com.graphhopper.routing.weighting.WeightApproximator) beelineWeightApproximator2);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
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
        java.lang.String str28 = countryEnumEncodedValue10.toString();
        org.junit.Assert.assertNotNull(edgeIteratorState8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + country12 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country12.equals(com.graphhopper.routing.ev.Country.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "country|version=1687814340|bits=2|index=0|shift=-1|store_both_directions=false" + "'", str28, "country|version=1687814340|bits=2|index=0|shift=-1|store_both_directions=false");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile1 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str2 = customProfile1.toString();
        com.graphhopper.config.Profile profile5 = customProfile1.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.config.Profile profile7 = customProfile1.setName("get_off_bike");
        com.graphhopper.config.Profile profile9 = profile7.setVehicle("skadi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str2, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile5);
        org.junit.Assert.assertNotNull(profile7);
        org.junit.Assert.assertNotNull(profile9);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        com.graphhopper.routing.ch.NodeOrderingProvider nodeOrderingProvider1 = com.graphhopper.routing.ch.NodeOrderingProvider.identity((-2));
        org.junit.Assert.assertNotNull(nodeOrderingProvider1);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.storage.DAType dAType4 = rAMDirectory1.getDefaultType();
        boolean boolean5 = dAType4.isStoring();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(dAType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap1 = new com.graphhopper.coll.GHLongLongHashMap(1);
        java.util.Spliterator<com.carrotsearch.hppc.cursors.LongLongCursor> longLongCursorSpliterator2 = gHLongLongHashMap1.spliterator();
        com.carrotsearch.hppc.LongLongHashMap.KeysContainer keysContainer3 = gHLongLongHashMap1.keys();
        com.carrotsearch.hppc.LongLongHashMap longLongHashMap4 = gHLongLongHashMap1.clone();
        long long6 = longLongHashMap4.remove((long) (byte) 100);
        org.junit.Assert.assertNotNull(longLongCursorSpliterator2);
        org.junit.Assert.assertNotNull(keysContainer3);
        org.junit.Assert.assertNotNull(longLongHashMap4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
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
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        com.graphhopper.coll.MinHeapWithUpdate minHeapWithUpdate1 = new com.graphhopper.coll.MinHeapWithUpdate(21);
        int int2 = minHeapWithUpdate1.peekId();
        boolean boolean4 = minHeapWithUpdate1.contains(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.StringEncodedValue stringEncodedValue3 = new com.graphhopper.routing.ev.StringEncodedValue("bike_network", 10);
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.storage.IntsRef intsRef9 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int10 = intsRef6.compareTo(intsRef9);
        java.lang.String str11 = stringEncodedValue3.getString(false, intsRef9);
        int int13 = stringEncodedValue3.indexOf("name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState15 = disabledEdgeIterator0.setReverse(stringEncodedValue3, "-1->-1");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        virtualEdgeIteratorState11.setUnfavored(true);
        int int14 = virtualEdgeIteratorState11.getOriginalEdgeKey();
        int int15 = virtualEdgeIteratorState11.getAdjNode();
        int int16 = virtualEdgeIteratorState11.getAdjNode();
        double double17 = virtualEdgeIteratorState11.getDistance();
        com.graphhopper.util.EdgeIteratorState edgeIteratorState19 = virtualEdgeIteratorState11.detach(false);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState21 = virtualEdgeIteratorState11.setName("[0 0 0 0 0 0 0 0 0 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1048576 + "'", int14 == 1048576);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertNotNull(edgeIteratorState19);
        org.junit.Assert.assertNotNull(edgeIteratorState21);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager5, false);
        java.util.List<com.graphhopper.storage.CHConfig> cHConfigList8 = graphHopperStorage7.getCHConfigs();
        com.graphhopper.routing.util.EncodingManager encodingManager9 = graphHopperStorage7.getEncodingManager();
        com.graphhopper.routing.weighting.Weighting weighting11 = null;
        com.graphhopper.storage.CHConfig cHConfig12 = com.graphhopper.storage.CHConfig.edgeBased("foot_network", weighting11);
        com.graphhopper.routing.weighting.Weighting weighting13 = cHConfig12.getWeighting();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.GraphHopperStorage graphHopperStorage14 = graphHopperStorage7.addCHGraph(cHConfig12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Weighting for CHGraph cannot be null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(flagEncoderArray4);
        org.junit.Assert.assertNotNull(encodingManager5);
        org.junit.Assert.assertNotNull(cHConfigList8);
        org.junit.Assert.assertNotNull(encodingManager9);
        org.junit.Assert.assertNotNull(cHConfig12);
        org.junit.Assert.assertNull(weighting13);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        com.graphhopper.util.details.DistanceDetails distanceDetails0 = new com.graphhopper.util.details.DistanceDetails();
        com.graphhopper.storage.IntsRef intsRef7 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean8 = intsRef7.isEmpty();
        com.graphhopper.util.PointList pointList10 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState12 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef7, "hike_rating", pointList10, false);
        com.graphhopper.storage.IntsRef intsRef15 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState21 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef15, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int22 = edgeIteratorState21.getEdge();
        virtualEdgeIteratorState12.setReverseEdge(edgeIteratorState21);
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue24 = com.graphhopper.routing.ev.MaxSpeed.create();
        double double25 = virtualEdgeIteratorState12.get(decimalEncodedValue24);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState27 = virtualEdgeIteratorState12.setDistance((double) 35.0f);
        boolean boolean28 = distanceDetails0.isEdgeDifferentToLastEdge(edgeIteratorState27);
        java.lang.String str29 = distanceDetails0.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(edgeIteratorState21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(decimalEncodedValue24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + Double.POSITIVE_INFINITY + "'", double25 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(edgeIteratorState27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "distance" + "'", str29, "distance");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ch.CHPreparationGraph.TurnCostFunction turnCostFunction24 = com.graphhopper.routing.ch.CHPreparationGraph.buildTurnCostFunctionFromTurnCostStorage((com.graphhopper.storage.Graph) graphHopperStorage20, weighting23);
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
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        com.graphhopper.coll.GHTBitSet gHTBitSet1 = new com.graphhopper.coll.GHTBitSet(0);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl3 = new com.graphhopper.coll.GHBitSetImpl((int) (short) 100);
        com.graphhopper.coll.GHBitSet gHBitSet4 = gHTBitSet1.copyTo((com.graphhopper.coll.GHBitSet) gHBitSetImpl3);
        java.util.BitSet bitSet5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = gHBitSetImpl3.intersects(bitSet5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gHBitSet4);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        com.graphhopper.routing.ch.AStarCHEntry aStarCHEntry3 = new com.graphhopper.routing.ch.AStarCHEntry(2, (double) 10L, (double) 2);
        aStarCHEntry3.weightOfVisitedPath = 100.0f;
        com.graphhopper.routing.ch.AStarCHEntry aStarCHEntry11 = new com.graphhopper.routing.ch.AStarCHEntry((int) (short) 1, (int) (short) 10, (int) (short) -1, (double) 4294967306L, (double) (byte) 100);
        aStarCHEntry3.parent = aStarCHEntry11;
        double double13 = aStarCHEntry11.weightOfVisitedPath;
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        com.graphhopper.routing.util.EncodingManager.Builder builder0 = com.graphhopper.routing.util.EncodingManager.start();
        com.graphhopper.reader.osm.conditional.DateRangeParser dateRangeParser1 = new com.graphhopper.reader.osm.conditional.DateRangeParser();
        com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState conditionState3 = dateRangeParser1.checkCondition("3.0");
        com.graphhopper.routing.util.EncodingManager.Builder builder4 = builder0.setDateRangeParser(dateRangeParser1);
        com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser oSMFootNetworkTagParser5 = new com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser();
        com.graphhopper.routing.util.EncodingManager.Builder builder6 = builder0.addRelationTagParser((com.graphhopper.routing.util.parsers.RelationTagParser) oSMFootNetworkTagParser5);
        com.graphhopper.routing.util.EncodingManager.Builder builder8 = builder0.setEnableInstructions(false);
        com.graphhopper.routing.util.parsers.TurnCostParser turnCostParser9 = null;
        com.graphhopper.routing.util.EncodingManager.Builder builder10 = builder8.addTurnCostParser(turnCostParser9);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + conditionState3 + "' != '" + com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.FALSE + "'", conditionState3.equals(com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.FALSE));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue> encodedValueGHObjectIntHashMap2 = new com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue>((int) (byte) 100);
        com.carrotsearch.hppc.ObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue> encodedValueObjectIntHashMap3 = encodedValueGHObjectIntHashMap2.clone();
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState12 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef6, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int13 = edgeIteratorState12.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue14 = com.graphhopper.routing.ev.Country.create();
        boolean boolean15 = countryEnumEncodedValue14.isStoreTwoDirections();
        com.graphhopper.routing.ev.Country country16 = edgeIteratorState12.getReverse(countryEnumEncodedValue14);
        com.graphhopper.storage.IntsRef intsRef24 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean25 = intsRef24.isEmpty();
        com.graphhopper.util.PointList pointList27 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState29 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef24, "hike_rating", pointList27, false);
        int int30 = countryEnumEncodedValue14.getInt(true, intsRef24);
        int int31 = countryEnumEncodedValue14.getMaxInt();
        int int32 = encodedValueObjectIntHashMap3.get((com.graphhopper.routing.ev.EncodedValue) countryEnumEncodedValue14);
        com.graphhopper.routing.ev.Country country33 = com.graphhopper.routing.ev.Country.AUT;
        java.lang.String str34 = country33.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState35 = disabledEdgeIterator0.set(countryEnumEncodedValue14, country33);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(encodedValueObjectIntHashMap3);
        org.junit.Assert.assertNotNull(edgeIteratorState12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + country16 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country16.equals(com.graphhopper.routing.ev.Country.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + country33 + "' != '" + com.graphhopper.routing.ev.Country.AUT + "'", country33.equals(com.graphhopper.routing.ev.Country.AUT));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "aut" + "'", str34, "aut");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        com.graphhopper.storage.NodeAccess nodeAccess0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator2 = new com.graphhopper.routing.weighting.BeelineWeightApproximator(nodeAccess0, weighting1);
        com.graphhopper.util.DistanceCalcEarth distanceCalcEarth3 = new com.graphhopper.util.DistanceCalcEarth();
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator4 = beelineWeightApproximator2.setDistanceCalc((com.graphhopper.util.DistanceCalc) distanceCalcEarth3);
        double double5 = beelineWeightApproximator4.getSlack();
        // The following exception was thrown during execution in test generation
        try {
            beelineWeightApproximator4.setTo((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(beelineWeightApproximator4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        com.graphhopper.util.DistanceCalc3D distanceCalc3D0 = new com.graphhopper.util.DistanceCalc3D();
        double double7 = distanceCalc3D0.calcDist(1.0E-5d, (double) (short) 100, 4.0024076802712575E7d, (double) (byte) 100, (double) 100L, (double) (short) 10);
        double double14 = distanceCalc3D0.calcDist3D(4.1539968895200975E7d, (double) 0L, (double) '4', (double) '4', (double) (-1909399913), (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.1539968895200975E7d + "'", double7 == 4.1539968895200975E7d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.6672976447024059E7d + "'", double14 == 1.6672976447024059E7d);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.storage.DAType dAType3 = rAMDirectory1.getDefaultType();
        com.graphhopper.storage.DAType dAType5 = com.graphhopper.storage.DAType.RAM_INT_STORE;
        com.graphhopper.storage.Directory directory6 = rAMDirectory1.put("", dAType5);
        com.graphhopper.storage.DAType dAType7 = directory6.getDefaultType();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(dAType3);
        org.junit.Assert.assertNotNull(dAType5);
        org.junit.Assert.assertNotNull(directory6);
        org.junit.Assert.assertNotNull(dAType7);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager5, false);
        com.graphhopper.storage.CHGraph cHGraph9 = graphHopperStorage7.getCHGraph("bike_network");
        com.graphhopper.routing.weighting.Weighting weighting10 = null;
        com.graphhopper.routing.weighting.Weighting weighting11 = graphHopperStorage7.wrapWeighting(weighting10);
        com.graphhopper.storage.RAMDirectory rAMDirectory13 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory14 = rAMDirectory13.create();
        java.nio.ByteOrder byteOrder15 = rAMDirectory13.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray16 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager17 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray16);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage19 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory13, encodingManager17, false);
        com.graphhopper.storage.CHGraph cHGraph21 = graphHopperStorage19.getCHGraph("bike_network");
        boolean boolean22 = graphHopperStorage19.isCHPossible();
        com.graphhopper.storage.Graph graph23 = com.graphhopper.util.GHUtility.copyTo((com.graphhopper.storage.Graph) graphHopperStorage7, (com.graphhopper.storage.Graph) graphHopperStorage19);
        com.graphhopper.reader.dem.NodeElevationInterpolator nodeElevationInterpolator24 = new com.graphhopper.reader.dem.NodeElevationInterpolator(graphHopperStorage19);
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(flagEncoderArray4);
        org.junit.Assert.assertNotNull(encodingManager5);
        org.junit.Assert.assertNull(cHGraph9);
        org.junit.Assert.assertNull(weighting11);
        org.junit.Assert.assertNotNull(directory14);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertNotNull(flagEncoderArray16);
        org.junit.Assert.assertNotNull(encodingManager17);
        org.junit.Assert.assertNull(cHGraph21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(graph23);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        com.graphhopper.routing.ch.PrepareCHEntry prepareCHEntry4 = new com.graphhopper.routing.ch.PrepareCHEntry(0, (int) (byte) -1, (-1), 0.0d);
        int int5 = prepareCHEntry4.adjNode;
        prepareCHEntry4.weight = 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph> cHPreparationGraphGHLongObjectHashMap0 = new com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph>();
        cHPreparationGraphGHLongObjectHashMap0.ensureCapacity(1048576);
        com.carrotsearch.hppc.LongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph> cHPreparationGraphLongObjectHashMap3 = cHPreparationGraphGHLongObjectHashMap0.clone();
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap5 = new com.graphhopper.coll.GHLongLongHashMap(1);
        java.util.Spliterator<com.carrotsearch.hppc.cursors.LongLongCursor> longLongCursorSpliterator6 = gHLongLongHashMap5.spliterator();
        com.carrotsearch.hppc.LongLongHashMap.KeysContainer keysContainer7 = gHLongLongHashMap5.keys();
        int int8 = cHPreparationGraphLongObjectHashMap3.removeAll((com.carrotsearch.hppc.LongContainer) keysContainer7);
        org.junit.Assert.assertNotNull(cHPreparationGraphLongObjectHashMap3);
        org.junit.Assert.assertNotNull(longLongCursorSpliterator6);
        org.junit.Assert.assertNotNull(keysContainer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph> cHPreparationGraphGHLongObjectHashMap0 = new com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph>();
        cHPreparationGraphGHLongObjectHashMap0.ensureCapacity(1048576);
        com.carrotsearch.hppc.LongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph> cHPreparationGraphLongObjectHashMap3 = cHPreparationGraphGHLongObjectHashMap0.clone();
        com.graphhopper.coll.GHLongHashSet gHLongHashSet5 = new com.graphhopper.coll.GHLongHashSet(2);
        int int6 = cHPreparationGraphGHLongObjectHashMap0.removeAll((com.carrotsearch.hppc.LongContainer) gHLongHashSet5);
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph10 = com.graphhopper.routing.ch.CHPreparationGraph.nodeBased((int) ' ', 0);
        double double14 = cHPreparationGraph10.getTurnWeight(3, (int) (byte) -1, 20);
        com.graphhopper.routing.ch.CHPreparationGraph cHPreparationGraph15 = cHPreparationGraphGHLongObjectHashMap0.getOrDefault((long) 4, cHPreparationGraph10);
        int int16 = cHPreparationGraph15.getNodes();
        org.junit.Assert.assertNotNull(cHPreparationGraphLongObjectHashMap3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(cHPreparationGraph10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(cHPreparationGraph15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        com.graphhopper.routing.util.EdgeFilter edgeFilter0 = com.graphhopper.routing.util.EdgeFilter.ALL_EDGES;
        org.junit.Assert.assertNotNull(edgeFilter0);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap1 = new com.graphhopper.coll.GHIntLongHashMap((int) (byte) 1);
        int[] intArray2 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet3 = com.graphhopper.coll.GHIntHashSet.from(intArray2);
        int int4 = intHashSet3.size();
        boolean boolean6 = intHashSet3.remove((int) (short) -1);
        boolean boolean8 = intHashSet3.add((-4));
        int[] intArray9 = intHashSet3.keys;
        gHIntLongHashMap1.keys = intArray9;
        java.lang.String str12 = gHIntLongHashMap1.visualizeKeyDistribution(0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intHashSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, -4, 0, 0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType0 = com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH;
        java.util.Calendar calendar1 = null;
        com.graphhopper.reader.osm.conditional.ParsedCalendar parsedCalendar2 = new com.graphhopper.reader.osm.conditional.ParsedCalendar(parseType0, calendar1);
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType3 = parsedCalendar2.parseType;
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType4 = com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH;
        java.util.Calendar calendar5 = null;
        com.graphhopper.reader.osm.conditional.ParsedCalendar parsedCalendar6 = new com.graphhopper.reader.osm.conditional.ParsedCalendar(parseType4, calendar5);
        com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType parseType7 = parsedCalendar6.parseType;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.reader.osm.conditional.DateRange dateRange8 = new com.graphhopper.reader.osm.conditional.DateRange(parsedCalendar2, parsedCalendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + parseType0 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH + "'", parseType0.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH));
        org.junit.Assert.assertTrue("'" + parseType3 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH + "'", parseType3.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH));
        org.junit.Assert.assertTrue("'" + parseType4 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH + "'", parseType4.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH));
        org.junit.Assert.assertTrue("'" + parseType7 + "' != '" + com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH + "'", parseType7.equals(com.graphhopper.reader.osm.conditional.ParsedCalendar.ParseType.MONTH));
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph> cHPreparationGraphGHLongObjectHashMap1 = new com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph>((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of elements must be >= 0: -3");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        com.graphhopper.util.DouglasPeucker douglasPeucker0 = new com.graphhopper.util.DouglasPeucker();
        com.graphhopper.util.DouglasPeucker douglasPeucker2 = douglasPeucker0.setElevationMaxDistance((-1.0d));
        douglasPeucker2.setApproximation(false);
        org.junit.Assert.assertNotNull(douglasPeucker2);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile1 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str2 = customProfile1.toString();
        java.lang.String str3 = customProfile1.getWeighting();
        java.lang.String str4 = customProfile1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str2, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "custom" + "'", str3, "custom");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "motorcycle" + "'", str4, "motorcycle");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager5, false);
        com.graphhopper.storage.RoutingCHGraph routingCHGraph9 = graphHopperStorage7.getRoutingCHGraph("bike$turn_cost");
        com.graphhopper.routing.weighting.Weighting weighting10 = null;
        com.graphhopper.routing.util.TraversalMode traversalMode11 = com.graphhopper.routing.util.TraversalMode.EDGE_BASED;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.Dijkstra dijkstra12 = new com.graphhopper.routing.Dijkstra((com.graphhopper.storage.Graph) graphHopperStorage7, weighting10, traversalMode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(flagEncoderArray4);
        org.junit.Assert.assertNotNull(encodingManager5);
        org.junit.Assert.assertNull(routingCHGraph9);
        org.junit.Assert.assertTrue("'" + traversalMode11 + "' != '" + com.graphhopper.routing.util.TraversalMode.EDGE_BASED + "'", traversalMode11.equals(com.graphhopper.routing.util.TraversalMode.EDGE_BASED));
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        com.graphhopper.routing.ch.AStarCHEntry aStarCHEntry3 = new com.graphhopper.routing.ch.AStarCHEntry((-3), 1.6672976447024059E7d, 90.0002104591497d);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        com.graphhopper.routing.ev.IntEncodedValue intEncodedValue1 = null;
        com.graphhopper.util.details.IntDetails intDetails2 = new com.graphhopper.util.details.IntDetails("", intEncodedValue1);
        intDetails2.startInterval(0);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager5, false);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage8 = com.graphhopper.util.GHUtility.newStorage(graphHopperStorage7);
        com.graphhopper.routing.util.EncodingManager encodingManager9 = graphHopperStorage8.getEncodingManager();
        com.graphhopper.storage.RAMDirectory rAMDirectory11 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory12 = rAMDirectory11.create();
        com.graphhopper.storage.DAType dAType13 = rAMDirectory11.getDefaultType();
        com.graphhopper.storage.DAType dAType15 = com.graphhopper.storage.DAType.RAM_INT_STORE;
        com.graphhopper.storage.Directory directory16 = rAMDirectory11.put("", dAType15);
        com.graphhopper.storage.RAMDirectory rAMDirectory19 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory20 = rAMDirectory19.create();
        com.graphhopper.storage.DAType dAType21 = rAMDirectory19.getDefaultType();
        com.graphhopper.storage.DAType dAType23 = com.graphhopper.storage.DAType.RAM_INT_STORE;
        com.graphhopper.storage.Directory directory24 = rAMDirectory19.put("", dAType23);
        boolean boolean25 = dAType23.isMMap();
        com.graphhopper.storage.DataAccess dataAccess26 = rAMDirectory11.find("prepare.ch.edge.witness_search.reset_interval", dAType23);
        java.lang.String str27 = rAMDirectory11.toString();
        com.graphhopper.routing.lm.LMConfig lMConfig28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.lm.LandmarkStorage landmarkStorage30 = new com.graphhopper.routing.lm.LandmarkStorage(graphHopperStorage8, (com.graphhopper.storage.Directory) rAMDirectory11, lMConfig28, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(flagEncoderArray4);
        org.junit.Assert.assertNotNull(encodingManager5);
        org.junit.Assert.assertNotNull(graphHopperStorage8);
        org.junit.Assert.assertNotNull(encodingManager9);
        org.junit.Assert.assertNotNull(directory12);
        org.junit.Assert.assertNotNull(dAType13);
        org.junit.Assert.assertNotNull(dAType15);
        org.junit.Assert.assertNotNull(directory16);
        org.junit.Assert.assertNotNull(directory20);
        org.junit.Assert.assertNotNull(dAType21);
        org.junit.Assert.assertNotNull(dAType23);
        org.junit.Assert.assertNotNull(directory24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dataAccess26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "prepare.ch.node.original_edge_count_weight/" + "'", str27, "prepare.ch.node.original_edge_count_weight/");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        com.graphhopper.reader.ReaderRelation readerRelation25 = null;
        com.graphhopper.storage.IntsRef intsRef27 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean28 = intsRef27.isEmpty();
        com.graphhopper.storage.IntsRef intsRef30 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int31 = intsRef27.compareTo(intsRef30);
        boolean boolean33 = intsRef30.equals((java.lang.Object) (short) 0);
        com.graphhopper.storage.IntsRef intsRef34 = encodingManager18.handleRelationTags(readerRelation25, intsRef30);
        boolean boolean35 = intsRef34.isValid();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(intsRef34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        com.graphhopper.reader.ReaderRelation readerRelation1 = new com.graphhopper.reader.ReaderRelation((long) 35);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.UnsignedDecimalEncodedValue unsignedDecimalEncodedValue5 = new com.graphhopper.routing.ev.UnsignedDecimalEncodedValue("3.0", 1048576, (double) 52L, 0.4642857015132904d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue name wasn't valid: 3.0. Use lower case letters, underscore and numbers only.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        com.graphhopper.util.shapes.BBox bBox7 = new com.graphhopper.util.shapes.BBox((double) 1L, 1.0d, 10.0d, (double) 5L, (double) 1001L, 4.003017359204114E7d, false);
        boolean boolean12 = bBox7.intersects((double) 0.0f, 1.0980455852832992E7d, (double) 200, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        com.graphhopper.util.PMap pMap0 = null;
        com.graphhopper.GraphHopperConfig graphHopperConfig1 = new com.graphhopper.GraphHopperConfig(pMap0);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = graphHopperConfig1.getDouble("edges:0(0MB), nodes:0(0MB), name:(0MB), geo:0(0MB), bounds:1.7976931348623157E308,-1.7976931348623157E308,1.7976931348623157E308,-1.7976931348623157E308", (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue> encodedValueGHObjectIntHashMap1 = new com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue>((int) (byte) 100);
        int int2 = encodedValueGHObjectIntHashMap1.size();
        java.lang.Object[] objArray3 = encodedValueGHObjectIntHashMap1.keys;
        int int5 = encodedValueGHObjectIntHashMap1.indexGet((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray24 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager25 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray24);
        java.lang.String str26 = encodingManager25.toFlagEncodersAsString();
        boolean boolean28 = encodingManager25.hasEncodedValue("name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        java.util.List<com.graphhopper.routing.ev.BooleanEncodedValue> booleanEncodedValueList30 = encodingManager25.getAccessEncFromNodeFlags((long) (byte) 10);
        com.graphhopper.routing.util.FlagEncoder flagEncoder31 = null;
        com.graphhopper.storage.RAMDirectory rAMDirectory34 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory35 = rAMDirectory34.create();
        java.nio.ByteOrder byteOrder36 = rAMDirectory34.getByteOrder();
        com.graphhopper.storage.DataAccess dataAccess38 = rAMDirectory34.find("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory39 = rAMDirectory34.create();
        long[] longArray45 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet46 = com.carrotsearch.hppc.LongHashSet.from(longArray45);
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray47 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager48 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray47);
        com.graphhopper.storage.GraphBuilder graphBuilder49 = new com.graphhopper.storage.GraphBuilder(encodingManager48);
        boolean boolean50 = longHashSet46.equals((java.lang.Object) encodingManager48);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage53 = new com.graphhopper.storage.GraphHopperStorage(directory39, encodingManager48, false, true);
        com.graphhopper.storage.TurnCostStorage turnCostStorage54 = graphHopperStorage53.getTurnCostStorage();
        turnCostStorage54.close();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.GHUtility.addRandomTurnCosts((com.graphhopper.storage.Graph) graphHopperStorage20, (-3L), encodingManager25, flagEncoder31, 2, turnCostStorage54);
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
        org.junit.Assert.assertNotNull(flagEncoderArray24);
        org.junit.Assert.assertNotNull(encodingManager25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(booleanEncodedValueList30);
        org.junit.Assert.assertNotNull(directory35);
        org.junit.Assert.assertNotNull(byteOrder36);
        org.junit.Assert.assertNotNull(dataAccess38);
        org.junit.Assert.assertNotNull(directory39);
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray45), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet46);
        org.junit.Assert.assertNotNull(flagEncoderArray47);
        org.junit.Assert.assertNotNull(encodingManager48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(turnCostStorage54);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        com.graphhopper.reader.OSMTurnRelation.Type type3 = null;
        com.graphhopper.reader.OSMTurnRelation oSMTurnRelation4 = new com.graphhopper.reader.OSMTurnRelation(0L, (long) '#', (-1L), type3);
        java.util.List<java.lang.String> strList5 = oSMTurnRelation4.getVehicleTypesExcept();
        java.lang.String str6 = oSMTurnRelation4.getVehicleTypeRestricted();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        long[] longArray5 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet6 = com.carrotsearch.hppc.LongHashSet.from(longArray5);
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap8 = new com.graphhopper.coll.GHLongLongHashMap(1);
        java.util.Spliterator<com.carrotsearch.hppc.cursors.LongLongCursor> longLongCursorSpliterator9 = gHLongLongHashMap8.spliterator();
        com.carrotsearch.hppc.LongLongHashMap.KeysContainer keysContainer10 = gHLongLongHashMap8.keys();
        int int11 = longHashSet6.retainAll((com.carrotsearch.hppc.LongLookupContainer) keysContainer10);
        long[] longArray12 = longHashSet6.toArray();
        java.lang.String str14 = longHashSet6.visualizeKeyDistribution(200);
        int int16 = longHashSet6.removeAll((long) 10);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet6);
        org.junit.Assert.assertNotNull(longLongCursorSpliterator9);
        org.junit.Assert.assertNotNull(keysContainer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "........                                                                                                                                                                                                " + "'", str14, "........                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap3 = new com.graphhopper.coll.OSMIDMap(directory2);
        int int4 = oSMIDMap3.getMemoryUsage();
        long long5 = oSMIDMap3.getSize();
        oSMIDMap3.optimize();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager5, false);
        com.graphhopper.coll.OSMIDMap oSMIDMap8 = new com.graphhopper.coll.OSMIDMap((com.graphhopper.storage.Directory) rAMDirectory1);
        int int9 = oSMIDMap8.getMemoryUsage();
        long long10 = oSMIDMap8.getSize();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(flagEncoderArray4);
        org.junit.Assert.assertNotNull(encodingManager5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        com.graphhopper.routing.ch.CHPreparationHandler cHPreparationHandler0 = new com.graphhopper.routing.ch.CHPreparationHandler();
        com.graphhopper.config.CHProfile[] cHProfileArray1 = new com.graphhopper.config.CHProfile[] {};
        java.util.ArrayList<com.graphhopper.config.CHProfile> cHProfileList2 = new java.util.ArrayList<com.graphhopper.config.CHProfile>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.config.CHProfile>) cHProfileList2, cHProfileArray1);
        com.graphhopper.routing.ch.CHPreparationHandler cHPreparationHandler4 = cHPreparationHandler0.setCHProfiles((java.util.Collection<com.graphhopper.config.CHProfile>) cHProfileList2);
        java.util.List<com.graphhopper.storage.CHConfig> cHConfigList5 = cHPreparationHandler4.getNodeBasedCHConfigs();
        org.junit.Assert.assertNotNull(cHProfileArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cHPreparationHandler4);
        org.junit.Assert.assertNotNull(cHConfigList5);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        com.graphhopper.routing.AlgorithmOptions.Builder builder0 = new com.graphhopper.routing.AlgorithmOptions.Builder();
        com.graphhopper.routing.AlgorithmOptions.Builder builder2 = builder0.maxVisitedNodes((int) ' ');
        com.graphhopper.routing.AlgorithmOptions algorithmOptions3 = builder0.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(algorithmOptions3);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        java.lang.String str0 = com.graphhopper.util.Constants.OS_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Linux" + "'", str0, "Linux");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        com.graphhopper.coll.GHLongLongHashMap gHLongLongHashMap1 = new com.graphhopper.coll.GHLongLongHashMap(1);
        long[] longArray7 = new long[] { 4294967306L, (short) -1, 100L, (byte) 100, (-2) };
        com.carrotsearch.hppc.LongHashSet longHashSet8 = com.carrotsearch.hppc.LongHashSet.from(longArray7);
        gHLongLongHashMap1.keys = longArray7;
        java.util.Spliterator<com.carrotsearch.hppc.cursors.LongLongCursor> longLongCursorSpliterator10 = gHLongLongHashMap1.spliterator();
        com.carrotsearch.hppc.LongCollection longCollection11 = gHLongLongHashMap1.values();
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[4294967306, -1, 100, 100, -2]");
        org.junit.Assert.assertNotNull(longHashSet8);
        org.junit.Assert.assertNotNull(longLongCursorSpliterator10);
        org.junit.Assert.assertNotNull(longCollection11);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        com.graphhopper.storage.NativeFSLockFactory nativeFSLockFactory0 = new com.graphhopper.storage.NativeFSLockFactory();
        java.io.File file1 = null;
        nativeFSLockFactory0.setLockDir(file1);
        // The following exception was thrown during execution in test generation
        try {
            nativeFSLockFactory0.forceRemove("[0 0 0 0 0 0 0 0 0 0]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge prepareBaseEdge5 = new com.graphhopper.routing.ch.CHPreparationGraph.PrepareBaseEdge(100, (int) (short) -1, (int) (short) 10, (float) (byte) -1, (float) 'a');
        double double6 = prepareBaseEdge5.getWeightAB();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = prepareBaseEdge5.getSkipped1();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        int int0 = com.graphhopper.util.Constants.VERSION_EDGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        int[] intArray0 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet1 = com.graphhopper.coll.GHIntHashSet.from(intArray0);
        int int2 = intHashSet1.size();
        int[] intArray3 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet4 = com.graphhopper.coll.GHIntHashSet.from(intArray3);
        int int5 = intHashSet4.size();
        boolean boolean7 = intHashSet4.remove((int) (short) -1);
        boolean boolean9 = intHashSet4.add((-4));
        int[] intArray10 = intHashSet4.keys;
        intHashSet1.keys = intArray10;
        com.carrotsearch.hppc.IntHashSet intHashSet12 = com.graphhopper.coll.GHIntHashSet.from(intArray10);
        int int13 = intHashSet12.size();
        int[] intArray14 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet15 = com.graphhopper.coll.GHIntHashSet.from(intArray14);
        int int16 = intHashSet15.size();
        int[] intArray17 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet18 = com.graphhopper.coll.GHIntHashSet.from(intArray17);
        int int19 = intHashSet18.size();
        boolean boolean21 = intHashSet18.remove((int) (short) -1);
        boolean boolean23 = intHashSet18.add((-4));
        int[] intArray24 = intHashSet18.keys;
        intHashSet15.keys = intArray24;
        com.carrotsearch.hppc.IntHashSet intHashSet26 = com.graphhopper.coll.GHIntHashSet.from(intArray24);
        boolean boolean28 = intHashSet26.indexExists((-3));
        int[] intArray29 = intHashSet26.toArray();
        int int30 = intHashSet12.removeAll((com.carrotsearch.hppc.IntLookupContainer) intHashSet26);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intHashSet1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intHashSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, -4, 0, 0]");
        org.junit.Assert.assertNotNull(intHashSet12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertNotNull(intHashSet15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intHashSet18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0, -4, 0, 0]");
        org.junit.Assert.assertNotNull(intHashSet26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, -4]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        com.graphhopper.routing.ev.HazmatTunnel hazmatTunnel0 = com.graphhopper.routing.ev.HazmatTunnel.B;
        java.lang.String str1 = hazmatTunnel0.toString();
        java.lang.String str2 = hazmatTunnel0.toString();
        org.junit.Assert.assertTrue("'" + hazmatTunnel0 + "' != '" + com.graphhopper.routing.ev.HazmatTunnel.B + "'", hazmatTunnel0.equals(com.graphhopper.routing.ev.HazmatTunnel.B));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "B" + "'", str1, "B");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "B" + "'", str2, "B");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap0 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>();
        int[] intArray1 = strComparableGHIntObjectHashMap0.keys;
        com.graphhopper.coll.GHIntLongHashMap gHIntLongHashMap3 = new com.graphhopper.coll.GHIntLongHashMap((int) (byte) 1);
        com.carrotsearch.hppc.IntLongHashMap intLongHashMap4 = gHIntLongHashMap3.clone();
        com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>> strComparableGHIntObjectHashMap5 = new com.graphhopper.coll.GHIntObjectHashMap<java.lang.Comparable<java.lang.String>>();
        int[] intArray6 = strComparableGHIntObjectHashMap5.keys;
        boolean boolean8 = false; // flaky: strComparableGHIntObjectHashMap5.indexExists(100);
        int[] intArray9 = strComparableGHIntObjectHashMap5.keys;
        intLongHashMap4.keys = intArray9;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.graphhopper.util.ArrayUtil.calcSortOrder(intArray1, intArray9, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arrays must not be shorter than given length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intLongHashMap4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        com.graphhopper.storage.NodeAccess nodeAccess0 = null;
        com.graphhopper.routing.weighting.Weighting weighting1 = null;
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator2 = new com.graphhopper.routing.weighting.BeelineWeightApproximator(nodeAccess0, weighting1);
        com.graphhopper.util.DistanceCalcEarth distanceCalcEarth3 = new com.graphhopper.util.DistanceCalcEarth();
        com.graphhopper.routing.weighting.BeelineWeightApproximator beelineWeightApproximator4 = beelineWeightApproximator2.setDistanceCalc((com.graphhopper.util.DistanceCalc) distanceCalcEarth3);
        double double14 = distanceCalcEarth3.calcNormalizedEdgeDistance3D((double) (short) 10, (double) 35, (double) 10.0f, (double) 200, (double) (-1L), 52.0d, (double) (byte) 10, (double) (short) 1, 1.0E-5d);
        double double24 = distanceCalcEarth3.calcNormalizedEdgeDistance3D(1.0980455852832992E7d, (double) 35, 0.4642857015132904d, (double) 100L, 3.394751250354173E7d, 3.394751250354173E7d, 116.0d, (double) (byte) 0, 0.0d);
        org.junit.Assert.assertNotNull(beelineWeightApproximator4);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.08290859847189744d + "'", double14 == 0.08290859847189744d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.03986976121981888d + "'", double24 == 0.03986976121981888d);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        com.graphhopper.reader.osm.OSMFileHeader oSMFileHeader0 = new com.graphhopper.reader.osm.OSMFileHeader();
        boolean boolean2 = oSMFileHeader0.hasTagWithKeyPrefix("5.4.0-70-generic");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        com.graphhopper.storage.StorableProperties storableProperties17 = new com.graphhopper.storage.StorableProperties((com.graphhopper.storage.Directory) rAMDirectory1);
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
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
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
        com.graphhopper.routing.weighting.Weighting weighting27 = null;
        com.graphhopper.routing.util.FiniteWeightFilter finiteWeightFilter28 = new com.graphhopper.routing.util.FiniteWeightFilter(weighting27);
        com.graphhopper.util.GHUtility.printInfo((com.graphhopper.storage.Graph) graphHopperStorage24, 96, 10, (com.graphhopper.routing.util.EdgeFilter) finiteWeightFilter28);
        com.graphhopper.storage.index.Snap snap33 = new com.graphhopper.storage.index.Snap((double) (-1L), (double) (-1));
        com.graphhopper.util.shapes.GHPoint gHPoint34 = snap33.getQueryPoint();
        java.util.Map<java.lang.String, java.lang.String> strMap36 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.NameSimilarityEdgeFilter nameSimilarityEdgeFilter37 = new com.graphhopper.routing.util.NameSimilarityEdgeFilter((com.graphhopper.routing.util.EdgeFilter) finiteWeightFilter28, "B", gHPoint34, 0.0d, strMap36);
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
        org.junit.Assert.assertNotNull(gHPoint34);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        com.graphhopper.routing.util.EncodingManager.Builder builder0 = com.graphhopper.routing.util.EncodingManager.start();
        com.graphhopper.reader.osm.conditional.DateRangeParser dateRangeParser1 = new com.graphhopper.reader.osm.conditional.DateRangeParser();
        com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState conditionState3 = dateRangeParser1.checkCondition("3.0");
        com.graphhopper.routing.util.EncodingManager.Builder builder4 = builder0.setDateRangeParser(dateRangeParser1);
        com.graphhopper.routing.util.FlagEncoder flagEncoder5 = null;
        com.graphhopper.routing.util.EncodingManager.Builder builder6 = builder0.add(flagEncoder5);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + conditionState3 + "' != '" + com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.FALSE + "'", conditionState3.equals(com.graphhopper.reader.osm.conditional.ConditionalValueParser.ConditionState.FALSE));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph> cHPreparationGraphGHLongObjectHashMap0 = new com.graphhopper.coll.GHLongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph>();
        cHPreparationGraphGHLongObjectHashMap0.ensureCapacity(1048576);
        com.carrotsearch.hppc.LongObjectHashMap<com.graphhopper.routing.ch.CHPreparationGraph> cHPreparationGraphLongObjectHashMap3 = cHPreparationGraphGHLongObjectHashMap0.clone();
        com.graphhopper.coll.GHLongHashSet gHLongHashSet5 = new com.graphhopper.coll.GHLongHashSet(2);
        int int6 = cHPreparationGraphGHLongObjectHashMap0.removeAll((com.carrotsearch.hppc.LongContainer) gHLongHashSet5);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = 0L; // flaky: gHLongHashSet5.indexReplace(21, 10L);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 21");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cHPreparationGraphLongObjectHashMap3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl1 = new com.graphhopper.coll.GHBitSetImpl((int) (short) 100);
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl2 = new com.graphhopper.coll.GHBitSetImpl();
        com.graphhopper.coll.GHBitSetImpl gHBitSetImpl3 = new com.graphhopper.coll.GHBitSetImpl();
        gHBitSetImpl3.remove((int) (short) 10);
        gHBitSetImpl3.clear();
        int int7 = gHBitSetImpl3.getCardinality();
        com.graphhopper.coll.GHBitSet gHBitSet8 = gHBitSetImpl2.copyTo((com.graphhopper.coll.GHBitSet) gHBitSetImpl3);
        gHBitSetImpl1.andNot((java.util.BitSet) gHBitSetImpl3);
        int int11 = gHBitSetImpl3.previousSetBit((int) (byte) 1);
        boolean boolean13 = gHBitSetImpl3.get((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(gHBitSet8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray0 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager1 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray0);
        java.lang.String str2 = encodingManager1.toFlagEncodersAsString();
        boolean boolean4 = encodingManager1.hasEncodedValue("name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        java.lang.String str5 = encodingManager1.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue7 = encodingManager1.getBooleanEncodedValue("graphhopper/core");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot find EncodedValue graphhopper/core in collection: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(flagEncoderArray0);
        org.junit.Assert.assertNotNull(encodingManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        com.graphhopper.reader.ReaderNode readerNode3 = new com.graphhopper.reader.ReaderNode((long) 200, (double) 0.0f, (double) 3L);
        com.graphhopper.storage.IntsRef intsRef7 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState13 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef7, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        readerNode3.setTag("5,17,4,4,5,7", (java.lang.Object) (byte) 100);
        int[] intArray16 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet17 = com.graphhopper.coll.GHIntHashSet.from(intArray16);
        int int18 = intHashSet17.size();
        boolean boolean20 = intHashSet17.remove((int) (short) -1);
        int int22 = intHashSet17.indexGet((int) (byte) 1);
        boolean boolean23 = readerNode3.hasTag("bike$turn_cost", (java.lang.Object) intHashSet17);
        int[] intArray24 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet25 = com.graphhopper.coll.GHIntHashSet.from(intArray24);
        int int26 = intHashSet25.size();
        int[] intArray27 = new int[] {};
        com.carrotsearch.hppc.IntHashSet intHashSet28 = com.graphhopper.coll.GHIntHashSet.from(intArray27);
        int int29 = intHashSet28.size();
        boolean boolean31 = intHashSet28.remove((int) (short) -1);
        boolean boolean33 = intHashSet28.add((-4));
        int[] intArray34 = intHashSet28.keys;
        intHashSet25.keys = intArray34;
        com.carrotsearch.hppc.IntHashSet intHashSet36 = com.graphhopper.coll.GHIntHashSet.from(intArray34);
        int int37 = intHashSet36.size();
        intHashSet36.ensureCapacity((-4));
        int int40 = intHashSet17.removeAll((com.carrotsearch.hppc.IntLookupContainer) intHashSet36);
        org.junit.Assert.assertNotNull(edgeIteratorState13);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(intHashSet17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertNotNull(intHashSet25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(intHashSet28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 0, -4, 0, 0]");
        org.junit.Assert.assertNotNull(intHashSet36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        com.graphhopper.util.details.EdgeKeyDetails edgeKeyDetails0 = new com.graphhopper.util.details.EdgeKeyDetails();
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        com.graphhopper.GraphHopperConfig graphHopperConfig23 = new com.graphhopper.GraphHopperConfig(pMap19);
        boolean boolean25 = graphHopperConfig23.has("bike$turn_cost");
        java.util.List<com.graphhopper.config.CHProfile> cHProfileList26 = graphHopperConfig23.getCHProfiles();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cHProfileList26);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        java.nio.ByteOrder byteOrder3 = rAMDirectory1.getByteOrder();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage7 = new com.graphhopper.storage.GraphHopperStorage((com.graphhopper.storage.Directory) rAMDirectory1, encodingManager5, false);
        com.graphhopper.storage.Directory directory8 = graphHopperStorage7.getDirectory();
        com.graphhopper.storage.StorableProperties storableProperties9 = graphHopperStorage7.getProperties();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(flagEncoderArray4);
        org.junit.Assert.assertNotNull(encodingManager5);
        org.junit.Assert.assertNotNull(directory8);
        org.junit.Assert.assertNotNull(storableProperties9);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        com.graphhopper.routing.util.spatialrules.SpatialRuleLookup spatialRuleLookup0 = com.graphhopper.routing.util.spatialrules.SpatialRuleLookup.EMPTY;
        com.graphhopper.storage.IntsRef intsRef3 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState9 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef3, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int10 = edgeIteratorState9.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue11 = com.graphhopper.routing.ev.Country.create();
        boolean boolean12 = countryEnumEncodedValue11.isStoreTwoDirections();
        com.graphhopper.routing.ev.Country country13 = edgeIteratorState9.getReverse(countryEnumEncodedValue11);
        com.graphhopper.routing.util.parsers.SpatialRuleParser spatialRuleParser14 = new com.graphhopper.routing.util.parsers.SpatialRuleParser(spatialRuleLookup0, (com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue11);
        com.graphhopper.storage.IntsRef intsRef16 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean17 = intsRef16.isEmpty();
        com.graphhopper.storage.IntsRef intsRef19 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        int int20 = intsRef16.compareTo(intsRef19);
        boolean boolean21 = intsRef16.isValid();
        java.util.Calendar calendar22 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "_network$turn_cost", "", "", "5.4.0-70-generic", "bike_network", "3.0", "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}", "prepare.ch.edge.witness_search.sigma_factor", "3.0" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.lang.String[] strArray58 = new java.lang.String[] { "", "bike", "prepare.ch.edge.witness_search.reset_interval", "_network", "prepare.ch.edge.witness_search.sigma_factor", "foot", "srtm", "_network$turn_cost", "prepare.ch.node.original_edge_count_weight", "foot_network", "foot_network", "prepare.ch.log_messages", "3.0", "", "secondary", "secondary", "hi!", "00001010000010100000101001100100", "1.8", "bike", "prepare.ch.edge.witness_search.sigma_factor", "hike_rating", "prepare.ch.edge.witness_search.reset_interval" };
        java.util.LinkedHashSet<java.lang.String> strSet59 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet59, strArray58);
        java.lang.String[] strArray79 = new java.lang.String[] { "3.0", "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}", "prepare.ch.updates.lazy", "secondary", "foot", "srtm", "foot", "bike_network", "foot_network", "prepare.ch.log_messages", "", "00001010000010100000101001100100", "hi!", "prepare.ch.node.original_edge_count_weight", "1.8", "_network$turn_cost", "5.4.0-70-generic", "horse_rating" };
        java.util.LinkedHashSet<java.lang.String> strSet80 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet80, strArray79);
        com.graphhopper.reader.osm.conditional.ConditionalOSMTagInspector conditionalOSMTagInspector82 = new com.graphhopper.reader.osm.conditional.ConditionalOSMTagInspector(calendar22, (java.util.List<java.lang.String>) strList33, (java.util.Set<java.lang.String>) strSet59, (java.util.Set<java.lang.String>) strSet80);
        com.graphhopper.reader.ReaderWay readerWay84 = new com.graphhopper.reader.ReaderWay((long) 0);
        boolean boolean85 = conditionalOSMTagInspector82.isRestrictedWayConditionallyPermitted(readerWay84);
        com.graphhopper.storage.IntsRef intsRef89 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState95 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef89, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        com.graphhopper.storage.IntsRef intsRef96 = spatialRuleParser14.handleWayTags(intsRef16, readerWay84, true, intsRef89);
        int int97 = intsRef96.length;
        org.junit.Assert.assertNotNull(spatialRuleLookup0);
        org.junit.Assert.assertNotNull(edgeIteratorState9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + country13 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country13.equals(com.graphhopper.routing.ev.Country.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(edgeIteratorState95);
        org.junit.Assert.assertNotNull(intsRef96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 10 + "'", int97 == 10);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        com.graphhopper.routing.ch.AStarCHEntry aStarCHEntry3 = new com.graphhopper.routing.ch.AStarCHEntry(2, (double) 10L, (double) 2);
        double double4 = aStarCHEntry3.weight;
        aStarCHEntry3.weightOfVisitedPath = 4.003017359204114E7d;
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        com.graphhopper.storage.DAType dAType1 = com.graphhopper.storage.DAType.RAM;
        boolean boolean2 = dAType1.isInMemory();
        com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser oSMHazmatTunnelParser3 = new com.graphhopper.routing.util.parsers.OSMHazmatTunnelParser();
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray4 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager5 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray4);
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue6 = com.graphhopper.routing.ev.Country.create();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue7 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        com.graphhopper.routing.ev.EncodedValue[] encodedValueArray8 = new com.graphhopper.routing.ev.EncodedValue[] { countryEnumEncodedValue6, decimalEncodedValue7 };
        java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue> encodedValueList9 = new java.util.ArrayList<com.graphhopper.routing.ev.EncodedValue>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.routing.ev.EncodedValue>) encodedValueList9, encodedValueArray8);
        oSMHazmatTunnelParser3.createEncodedValues((com.graphhopper.routing.ev.EncodedValueLookup) encodingManager5, (java.util.List<com.graphhopper.routing.ev.EncodedValue>) encodedValueList9);
        com.graphhopper.reader.ReaderNode readerNode15 = new com.graphhopper.reader.ReaderNode((long) 200, (double) 0.0f, (double) 3L);
        java.lang.String str16 = readerNode15.toString();
        double double17 = readerNode15.getLat();
        long long18 = encodingManager5.handleNodeTags(readerNode15);
        boolean boolean19 = dAType1.equals((java.lang.Object) readerNode15);
        com.graphhopper.storage.GHDirectory gHDirectory20 = new com.graphhopper.storage.GHDirectory("SpatialRule [getId()=deu, getPriority()=100]", dAType1);
        org.junit.Assert.assertNotNull(dAType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(flagEncoderArray4);
        org.junit.Assert.assertNotNull(encodingManager5);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue6);
        org.junit.Assert.assertNotNull(decimalEncodedValue7);
        org.junit.Assert.assertNotNull(encodedValueArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Node: 200 lat=0.0 lon=3.0" + "'", str16, "Node: 200 lat=0.0 lon=3.0");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        com.graphhopper.routing.util.FlagEncoder[] flagEncoderArray0 = new com.graphhopper.routing.util.FlagEncoder[] {};
        com.graphhopper.routing.util.EncodingManager encodingManager1 = com.graphhopper.routing.util.EncodingManager.create(flagEncoderArray0);
        com.graphhopper.reader.OSMTurnRelation.Type type5 = null;
        com.graphhopper.reader.OSMTurnRelation oSMTurnRelation6 = new com.graphhopper.reader.OSMTurnRelation(0L, (long) '#', (-1L), type5);
        com.graphhopper.routing.util.parsers.TurnCostParser.ExternalInternalMap externalInternalMap7 = null;
        com.graphhopper.storage.Graph graph8 = null;
        encodingManager1.handleTurnRelationTags(oSMTurnRelation6, externalInternalMap7, graph8);
        oSMTurnRelation6.setVehicleTypeRestricted("graphhopper/core");
        oSMTurnRelation6.setVehicleTypeRestricted("name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(flagEncoderArray0);
        org.junit.Assert.assertNotNull(encodingManager1);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        com.graphhopper.routing.util.EncodingManager.Builder builder0 = new com.graphhopper.routing.util.EncodingManager.Builder();
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        com.graphhopper.routing.ev.RouteNetwork routeNetwork1 = com.graphhopper.routing.ev.RouteNetwork.find("name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertTrue("'" + routeNetwork1 + "' != '" + com.graphhopper.routing.ev.RouteNetwork.MISSING + "'", routeNetwork1.equals(com.graphhopper.routing.ev.RouteNetwork.MISSING));
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        com.graphhopper.routing.ch.CHPreparationHandler cHPreparationHandler0 = new com.graphhopper.routing.ch.CHPreparationHandler();
        com.graphhopper.config.CHProfile[] cHProfileArray1 = new com.graphhopper.config.CHProfile[] {};
        java.util.ArrayList<com.graphhopper.config.CHProfile> cHProfileList2 = new java.util.ArrayList<com.graphhopper.config.CHProfile>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.graphhopper.config.CHProfile>) cHProfileList2, cHProfileArray1);
        com.graphhopper.routing.ch.CHPreparationHandler cHPreparationHandler4 = cHPreparationHandler0.setCHProfiles((java.util.Collection<com.graphhopper.config.CHProfile>) cHProfileList2);
        com.graphhopper.config.CHProfile cHProfile5 = null;
        com.graphhopper.config.CHProfile[] cHProfileArray6 = new com.graphhopper.config.CHProfile[] { cHProfile5 };
        com.graphhopper.routing.ch.CHPreparationHandler cHPreparationHandler7 = cHPreparationHandler4.setCHProfiles(cHProfileArray6);
        org.junit.Assert.assertNotNull(cHProfileArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cHPreparationHandler4);
        org.junit.Assert.assertNotNull(cHProfileArray6);
        org.junit.Assert.assertNotNull(cHPreparationHandler7);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        virtualEdgeIteratorState11.setUnfavored(true);
        int int14 = virtualEdgeIteratorState11.getOriginalEdgeKey();
        int int15 = virtualEdgeIteratorState11.getAdjNode();
        int int16 = virtualEdgeIteratorState11.getAdjNode();
        double double17 = virtualEdgeIteratorState11.getDistance();
        com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue18 = com.graphhopper.routing.ev.MaxAxleLoad.create();
        double double19 = virtualEdgeIteratorState11.getReverse(decimalEncodedValue18);
        virtualEdgeIteratorState11.setUnfavored(false);
        com.graphhopper.storage.IntsRef intsRef24 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState30 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef24, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int31 = edgeIteratorState30.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue32 = com.graphhopper.routing.ev.Country.create();
        boolean boolean33 = countryEnumEncodedValue32.isStoreTwoDirections();
        com.graphhopper.routing.ev.Country country34 = edgeIteratorState30.getReverse(countryEnumEncodedValue32);
        java.lang.String str35 = countryEnumEncodedValue32.getName();
        com.graphhopper.routing.ev.Country country37 = com.graphhopper.routing.ev.Country.find("....      ");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState38 = virtualEdgeIteratorState11.set(countryEnumEncodedValue32, country37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: EncodedValue country not initialized");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1048576 + "'", int14 == 1048576);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertNotNull(decimalEncodedValue18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + Double.POSITIVE_INFINITY + "'", double19 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(edgeIteratorState30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + country34 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country34.equals(com.graphhopper.routing.ev.Country.DEFAULT));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "country" + "'", str35, "country");
        org.junit.Assert.assertTrue("'" + country37 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country37.equals(com.graphhopper.routing.ev.Country.DEFAULT));
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.graphhopper.storage.IntsRef intsRef2 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState8 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef2, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int9 = edgeIteratorState8.getAdjNode();
        com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue> encodedValueGHObjectIntHashMap11 = new com.graphhopper.coll.GHObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue>((int) (byte) 100);
        com.carrotsearch.hppc.ObjectIntHashMap<com.graphhopper.routing.ev.EncodedValue> encodedValueObjectIntHashMap12 = encodedValueGHObjectIntHashMap11.clone();
        com.graphhopper.storage.IntsRef intsRef15 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        com.graphhopper.util.EdgeIteratorState edgeIteratorState21 = com.graphhopper.util.GHUtility.createMockedEdgeIteratorState((double) 10L, intsRef15, (int) (byte) 0, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 100);
        int int22 = edgeIteratorState21.getEdge();
        com.graphhopper.routing.ev.EnumEncodedValue<com.graphhopper.routing.ev.Country> countryEnumEncodedValue23 = com.graphhopper.routing.ev.Country.create();
        boolean boolean24 = countryEnumEncodedValue23.isStoreTwoDirections();
        com.graphhopper.routing.ev.Country country25 = edgeIteratorState21.getReverse(countryEnumEncodedValue23);
        com.graphhopper.storage.IntsRef intsRef33 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean34 = intsRef33.isEmpty();
        com.graphhopper.util.PointList pointList36 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState38 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef33, "hike_rating", pointList36, false);
        int int39 = countryEnumEncodedValue23.getInt(true, intsRef33);
        int int40 = countryEnumEncodedValue23.getMaxInt();
        int int41 = encodedValueObjectIntHashMap12.get((com.graphhopper.routing.ev.EncodedValue) countryEnumEncodedValue23);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = edgeIteratorState8.get((com.graphhopper.routing.ev.IntEncodedValue) countryEnumEncodedValue23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported. Edge is empty.");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(edgeIteratorState8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(encodedValueObjectIntHashMap12);
        org.junit.Assert.assertNotNull(edgeIteratorState21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(countryEnumEncodedValue23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + country25 + "' != '" + com.graphhopper.routing.ev.Country.DEFAULT + "'", country25.equals(com.graphhopper.routing.ev.Country.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        com.graphhopper.routing.weighting.custom.CustomProfile customProfile1 = new com.graphhopper.routing.weighting.custom.CustomProfile("motorcycle");
        java.lang.String str2 = customProfile1.toString();
        com.graphhopper.config.Profile profile5 = customProfile1.putHint("_network$turn_cost", (java.lang.Object) 0.0f);
        com.graphhopper.config.Profile profile7 = profile5.setTurnCosts(false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}" + "'", str2, "name=motorcycle|vehicle=car|weighting=custom|turnCosts=false|hints={}");
        org.junit.Assert.assertNotNull(profile5);
        org.junit.Assert.assertNotNull(profile7);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        com.graphhopper.util.DistancePlaneProjection distancePlaneProjection0 = new com.graphhopper.util.DistancePlaneProjection();
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        com.graphhopper.storage.RAMDirectory rAMDirectory1 = new com.graphhopper.storage.RAMDirectory("prepare.ch.node.original_edge_count_weight");
        com.graphhopper.storage.Directory directory2 = rAMDirectory1.create();
        com.graphhopper.coll.OSMIDMap oSMIDMap3 = new com.graphhopper.coll.OSMIDMap(directory2);
        int int4 = oSMIDMap3.getMemoryUsage();
        long long5 = oSMIDMap3.getSize();
        int int7 = oSMIDMap3.get((long) 64);
        long long8 = oSMIDMap3.getSize();
        org.junit.Assert.assertNotNull(directory2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        com.graphhopper.coll.GHLongIntBTree gHLongIntBTree1 = new com.graphhopper.coll.GHLongIntBTree((int) (short) 100);
        int int4 = gHLongIntBTree1.put(0L, 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        com.graphhopper.routing.ev.MaxWidth maxWidth0 = new com.graphhopper.routing.ev.MaxWidth();
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        com.graphhopper.storage.IntsRef intsRef6 = new com.graphhopper.storage.IntsRef((int) (byte) 10);
        boolean boolean7 = intsRef6.isEmpty();
        com.graphhopper.util.PointList pointList9 = null;
        com.graphhopper.routing.querygraph.VirtualEdgeIteratorState virtualEdgeIteratorState11 = new com.graphhopper.routing.querygraph.VirtualEdgeIteratorState(1048576, (int) (byte) 0, (int) (short) -1, (-1), (double) '4', intsRef6, "hike_rating", pointList9, false);
        com.graphhopper.routing.ev.SimpleBooleanEncodedValue simpleBooleanEncodedValue14 = new com.graphhopper.routing.ev.SimpleBooleanEncodedValue("srtm");
        com.graphhopper.util.details.BooleanDetails booleanDetails15 = new com.graphhopper.util.details.BooleanDetails("....      ", (com.graphhopper.routing.ev.BooleanEncodedValue) simpleBooleanEncodedValue14);
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.EdgeIteratorState edgeIteratorState17 = virtualEdgeIteratorState11.setReverse((com.graphhopper.routing.ev.IntEncodedValue) simpleBooleanEncodedValue14, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: EncodedValue srtm not initialized");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
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
            double double28 = 0.0; // flaky: extendedNodeAccess26.getLon(21);
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
        org.junit.Assert.assertNotNull(encodingManager22);
        org.junit.Assert.assertNotNull(nodeAccess23);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        double double1 = com.graphhopper.routing.util.parsers.helpers.OSMValueExtractor.stringToTons("foot_network");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        com.graphhopper.util.GHUtility.DisabledEdgeIterator disabledEdgeIterator0 = new com.graphhopper.util.GHUtility.DisabledEdgeIterator();
        com.graphhopper.routing.ev.BooleanEncodedValue booleanEncodedValue1 = com.graphhopper.util.EdgeIteratorState.UNFAVORED_EDGE;
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
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        com.graphhopper.storage.VLongStorage vLongStorage1 = new com.graphhopper.storage.VLongStorage(4);
        vLongStorage1.trimToSize();
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
        com.graphhopper.storage.GraphHopperStorage graphHopperStorage24 = com.graphhopper.util.GHUtility.newStorage(graphHopperStorage20);
        com.graphhopper.storage.Graph graph25 = graphHopperStorage24.getBaseGraph();
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
        org.junit.Assert.assertNotNull(graphHopperStorage24);
        org.junit.Assert.assertNotNull(graph25);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        com.graphhopper.storage.VLongStorage vLongStorage1 = new com.graphhopper.storage.VLongStorage((int) '4');
        long long2 = vLongStorage1.readVLong();
        vLongStorage1.trimToSize();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        com.graphhopper.coll.GHLongIntBTree gHLongIntBTree1 = new com.graphhopper.coll.GHLongIntBTree((int) (short) 100);
        int int3 = gHLongIntBTree1.get(52L);
        int int6 = gHLongIntBTree1.put(0L, 5);
        gHLongIntBTree1.optimize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        com.graphhopper.GraphHopper graphHopper0 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        com.graphhopper.GraphHopper graphHopper2 = graphHopper0.setFlagEncoderFactory(flagEncoderFactory1);
        com.graphhopper.reader.dem.MultiSourceElevationProvider multiSourceElevationProvider3 = new com.graphhopper.reader.dem.MultiSourceElevationProvider();
        double double6 = multiSourceElevationProvider3.getEle((double) 0.0f, 0.0d);
        com.graphhopper.GraphHopper graphHopper7 = graphHopper0.setElevationProvider((com.graphhopper.reader.dem.ElevationProvider) multiSourceElevationProvider3);
        java.lang.String str8 = graphHopper0.getGraphHopperLocation();
        com.graphhopper.routing.util.parsers.TagParserFactory tagParserFactory9 = graphHopper0.getTagParserFactory();
        com.graphhopper.util.PMap pMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.util.parsers.TagParser tagParser12 = tagParserFactory9.create("default", pMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: entry in encoder list not supported default");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphHopper2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(graphHopper7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(tagParserFactory9);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        com.graphhopper.storage.index.Snap snap2 = new com.graphhopper.storage.index.Snap((double) (-1L), (double) (-1));
        snap2.setQueryDistance((double) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.util.shapes.GHPoint3D gHPoint3D5 = snap2.getSnappedPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Calculate snapped point before!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        com.graphhopper.GraphHopper graphHopper0 = new com.graphhopper.GraphHopper();
        com.graphhopper.routing.util.FlagEncoderFactory flagEncoderFactory1 = null;
        com.graphhopper.GraphHopper graphHopper2 = graphHopper0.setFlagEncoderFactory(flagEncoderFactory1);
        com.graphhopper.routing.lm.LMPreparationHandler lMPreparationHandler3 = graphHopper0.getLMPreparationHandler();
        graphHopper0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.storage.GraphHopperStorage graphHopperStorage5 = graphHopper0.getGraphHopperStorage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: GraphHopper storage not initialized");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphHopper2);
        org.junit.Assert.assertNotNull(lMPreparationHandler3);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        // The following exception was thrown during execution in test generation
        try {
            com.graphhopper.routing.ev.DecimalEncodedValue decimalEncodedValue2 = com.graphhopper.routing.ev.TurnCost.create("prepare.ch.updates.lazy", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EncodedValue name wasn't valid: prepare.ch.updates.lazy$turn_cost. Use lower case letters, underscore and numbers only.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}
