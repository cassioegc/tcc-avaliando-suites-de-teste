/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Apr 04 01:32:25 GMT 2021
 */

package com.graphhopper.routing.util;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class CarFlagEncoder_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.graphhopper.routing.util.CarFlagEncoder"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "BR"); 
    java.lang.System.setProperty("user.dir", "/home/cassioegc/tcc/graphhopper.reader-osm/core"); 
    java.lang.System.setProperty("user.home", "/home/cassioegc"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "cassioegc"); 
    java.lang.System.setProperty("user.timezone", ""); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CarFlagEncoder_ESTest_scaffolding.class.getClassLoader() ,
      "com.graphhopper.reader.OSMTurnRelation",
      "com.graphhopper.routing.util.RacingBikeFlagEncoder",
      "com.graphhopper.reader.dem.AbstractTiffElevationProvider",
      "org.locationtech.jts.geom.CoordinateFilter",
      "com.graphhopper.reader.osm.OSMInput",
      "com.graphhopper.storage.GHDirectory",
      "com.graphhopper.storage.BaseGraph$EdgeIteratorStateImpl",
      "com.graphhopper.search.StringIndex",
      "org.locationtech.jts.algorithm.LineIntersector",
      "com.graphhopper.routing.util.EncodingManager",
      "com.graphhopper.util.EdgeExplorer",
      "com.graphhopper.storage.GraphHopperStorage",
      "org.locationtech.jts.geom.DefaultCoordinateSequenceFactory",
      "com.graphhopper.routing.util.MotorcycleFlagEncoder",
      "com.carrotsearch.hppc.predicates.ObjectPredicate",
      "com.carrotsearch.hppc.IntObjectHashMap$KeysContainer",
      "com.graphhopper.storage.index.LocationIndex$Visitor",
      "com.graphhopper.util.ProgressListener",
      "org.locationtech.jts.geom.MultiLineString",
      "com.carrotsearch.hppc.IntIndexedContainer",
      "com.graphhopper.reader.ReaderRelation$Member",
      "org.locationtech.jts.geom.DefaultCoordinateSequence",
      "com.graphhopper.util.EdgeIteratorState$1",
      "com.graphhopper.util.shapes.Shape",
      "com.graphhopper.coll.GHLongHashSet",
      "com.graphhopper.routing.util.AllCHEdgesIterator",
      "com.graphhopper.routing.util.parsers.OSMRoadClassParser",
      "com.carrotsearch.hppc.Containers",
      "com.graphhopper.reader.dem.AbstractElevationProvider",
      "com.carrotsearch.hppc.IntLookupContainer",
      "com.graphhopper.routing.util.parsers.OSMBikeNetworkTagParser",
      "com.carrotsearch.hppc.LongArrayList",
      "com.graphhopper.routing.ev.RoadEnvironment",
      "org.locationtech.jts.geom.Geometry$1",
      "org.locationtech.jts.geom.LinearRing",
      "com.graphhopper.routing.ev.EncodedValue$InitializerConfig",
      "com.carrotsearch.hppc.BitMixer",
      "com.carrotsearch.hppc.ObjectContainer",
      "com.graphhopper.routing.weighting.FastestWeighting",
      "com.graphhopper.reader.dem.ElevationProvider$1",
      "com.graphhopper.routing.util.DefaultEdgeFilter",
      "com.graphhopper.routing.util.TraversalMode",
      "com.graphhopper.storage.Graph",
      "com.graphhopper.reader.osm.OSMReader",
      "com.graphhopper.util.PointAccess",
      "com.graphhopper.routing.weighting.ShortFastestWeighting",
      "com.graphhopper.routing.util.parsers.OSMRoadClassLinkParser",
      "com.graphhopper.routing.ev.EncodedValue",
      "com.carrotsearch.hppc.LongLookupContainer",
      "com.graphhopper.storage.StorableProperties",
      "com.graphhopper.storage.CHConfig",
      "org.locationtech.jts.geom.impl.CoordinateArraySequence",
      "com.graphhopper.routing.weighting.AvoidEdgesWeighting",
      "com.graphhopper.storage.GraphStorage",
      "com.graphhopper.util.DouglasPeucker",
      "org.locationtech.jts.geom.Lineal",
      "com.graphhopper.coll.GHLongIntBTree$ReturnValue",
      "com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser",
      "com.graphhopper.storage.NodeAccess",
      "com.carrotsearch.hppc.IntObjectHashMap",
      "org.locationtech.jts.geom.MultiPoint",
      "com.carrotsearch.hppc.predicates.LongLongPredicate",
      "com.graphhopper.util.BitUtilLittle",
      "com.carrotsearch.hppc.procedures.IntLongProcedure",
      "com.graphhopper.storage.RoutingCHEdgeIterator",
      "com.graphhopper.util.shapes.GHPoint3D",
      "org.locationtech.jts.geom.GeometryComponentFilter",
      "com.graphhopper.routing.ev.IntEncodedValue",
      "com.graphhopper.routing.ev.DefaultEncodedValueFactory",
      "com.graphhopper.storage.Directory",
      "com.graphhopper.routing.ev.Roundabout",
      "com.graphhopper.coll.GHLongIntBTree",
      "org.locationtech.jts.io.WKTWriter",
      "com.graphhopper.routing.util.parsers.OSMGetOffBikeParser",
      "com.graphhopper.routing.ev.DecimalEncodedValue",
      "com.graphhopper.routing.weighting.AbstractWeighting",
      "com.graphhopper.util.ShallowImmutablePointList",
      "com.graphhopper.reader.dem.ElevationProvider",
      "com.graphhopper.reader.ReaderElement",
      "com.graphhopper.storage.GHNodeAccess",
      "com.graphhopper.storage.RoutingCHEdgeIteratorState",
      "com.graphhopper.util.Helper",
      "org.locationtech.jts.geom.impl.PackedCoordinateSequence$Double",
      "com.carrotsearch.hppc.IntContainer",
      "com.graphhopper.routing.util.WheelchairFlagEncoder",
      "org.locationtech.jts.geom.util.GeometryEditor$GeometryEditorOperation",
      "com.graphhopper.routing.weighting.TurnCostProvider",
      "com.graphhopper.util.PointList$1",
      "org.locationtech.jts.geom.Polygon",
      "org.locationtech.jts.geom.Geometry",
      "com.graphhopper.util.Downloader",
      "org.locationtech.jts.geom.PrecisionModel",
      "com.graphhopper.storage.index.Snap",
      "com.graphhopper.routing.ev.RouteNetwork",
      "org.locationtech.jts.geom.MultiPolygon",
      "com.carrotsearch.hppc.predicates.LongPredicate",
      "com.graphhopper.routing.util.parsers.OSMMaxSpeedParser",
      "com.graphhopper.storage.RoutingCHEdgeExplorer",
      "com.graphhopper.storage.BaseGraph",
      "com.graphhopper.reader.ReaderWay",
      "com.carrotsearch.hppc.ObjectIntHashMap$KeysContainer",
      "com.graphhopper.routing.util.HikeFlagEncoder",
      "com.carrotsearch.hppc.ObjectIntMap",
      "com.graphhopper.util.GHUtility",
      "com.graphhopper.storage.MMapDirectory",
      "com.carrotsearch.hppc.IntObjectAssociativeContainer",
      "com.graphhopper.routing.ev.RoadAccess",
      "com.graphhopper.routing.ev.FootNetwork",
      "com.carrotsearch.hppc.LongContainer",
      "com.carrotsearch.hppc.procedures.IntObjectProcedure",
      "com.graphhopper.storage.CHGraph",
      "com.graphhopper.storage.IntsRef",
      "com.graphhopper.routing.util.FerrySpeedCalculator",
      "com.graphhopper.util.BitUtilBig",
      "com.graphhopper.reader.osm.conditional.DateRangeParser",
      "com.graphhopper.storage.RAMIntDataAccess",
      "com.graphhopper.util.CHEdgeIterator",
      "com.graphhopper.routing.util.CarFlagEncoder",
      "com.graphhopper.routing.ev.EncodedValueLookup",
      "com.graphhopper.routing.ev.MaxSpeed",
      "com.graphhopper.routing.ev.UnsignedIntEncodedValue",
      "com.graphhopper.routing.util.EncodingManager$Access",
      "com.carrotsearch.hppc.HashOrderMixing$1",
      "com.carrotsearch.hppc.HashOrderMixing$2",
      "com.carrotsearch.hppc.LongSet",
      "com.carrotsearch.hppc.AbstractIntCollection",
      "com.graphhopper.storage.DAType",
      "com.graphhopper.storage.TurnCostStorage",
      "com.graphhopper.routing.util.parsers.OSMRoundaboutParser",
      "com.graphhopper.routing.weighting.Weighting",
      "com.graphhopper.storage.DataAccess",
      "com.graphhopper.routing.util.EncodingManager$AcceptWay",
      "com.graphhopper.reader.ReaderNode",
      "com.graphhopper.routing.weighting.ShortestWeighting",
      "com.carrotsearch.hppc.ObjectLookupContainer",
      "com.carrotsearch.hppc.HashOrderMixing$4",
      "org.locationtech.jts.geom.util.GeometryMapper$MapOp",
      "com.carrotsearch.hppc.LongCollection",
      "com.carrotsearch.hppc.predicates.IntObjectPredicate",
      "org.locationtech.jts.geom.Coordinate",
      "com.graphhopper.search.StringIndex$1",
      "com.graphhopper.routing.util.AbstractFlagEncoder",
      "com.graphhopper.util.DistancePlaneProjection",
      "com.carrotsearch.hppc.ObjectCollection",
      "com.graphhopper.routing.util.parsers.TurnCostParser$ExternalInternalMap",
      "org.locationtech.jts.algorithm.RobustLineIntersector",
      "com.graphhopper.reader.PillarInfo",
      "com.graphhopper.storage.AbstractDataAccess",
      "com.graphhopper.storage.index.Snap$Position",
      "com.graphhopper.storage.DAType$MemRef",
      "com.graphhopper.util.shapes.BBox",
      "com.carrotsearch.hppc.AbstractObjectCollection",
      "com.carrotsearch.hppc.procedures.LongProcedure",
      "com.carrotsearch.hppc.RandomizedHashOrderMixer",
      "com.graphhopper.reader.ReaderRelation",
      "com.carrotsearch.hppc.ArraySizingStrategy",
      "com.carrotsearch.hppc.Containers$1",
      "com.graphhopper.reader.osm.conditional.ConditionalOSMTagInspector",
      "org.locationtech.jts.algorithm.NotRepresentableException",
      "com.graphhopper.routing.weighting.PriorityWeighting",
      "org.locationtech.jts.geom.PrecisionModel$Type",
      "com.carrotsearch.hppc.HashOrderMixing$Strategy$2",
      "com.graphhopper.routing.weighting.AbstractAdjustedWeighting",
      "com.carrotsearch.hppc.HashOrderMixing$Strategy$3",
      "com.graphhopper.reader.osm.conditional.ConditionalValueParser$ConditionState",
      "com.carrotsearch.hppc.procedures.ObjectIntProcedure",
      "com.carrotsearch.hppc.LongIndexedContainer",
      "com.graphhopper.routing.ev.BikeNetwork",
      "com.carrotsearch.hppc.procedures.IntProcedure",
      "org.locationtech.jts.geom.GeometryFilter",
      "com.graphhopper.routing.util.DefaultFlagEncoderFactory",
      "com.graphhopper.routing.util.AllEdgesIterator",
      "com.carrotsearch.hppc.HashOrderMixing$Strategy$1",
      "com.graphhopper.util.CHEdgeExplorer",
      "com.carrotsearch.hppc.LongLongAssociativeContainer",
      "com.graphhopper.storage.RoutingCHGraph",
      "com.graphhopper.routing.ev.EncodedValueFactory",
      "com.graphhopper.routing.util.EdgeFilter",
      "com.graphhopper.storage.RAMDataAccess",
      "com.graphhopper.routing.util.parsers.RelationTagParser",
      "org.locationtech.jts.geom.IntersectionMatrix",
      "com.carrotsearch.hppc.HashOrderMixing",
      "com.carrotsearch.hppc.IntLongAssociativeContainer",
      "org.locationtech.jts.geom.util.LinearComponentExtracter",
      "com.carrotsearch.hppc.ObjectIntHashMap",
      "com.carrotsearch.hppc.LongLongHashMap$KeysContainer",
      "com.graphhopper.routing.ev.RoadClass",
      "org.locationtech.jts.geom.impl.PackedCoordinateSequence",
      "com.carrotsearch.hppc.procedures.LongLongProcedure",
      "com.carrotsearch.hppc.predicates.IntLongPredicate",
      "com.graphhopper.routing.util.FlagEncoder",
      "com.graphhopper.routing.ev.EnumEncodedValue",
      "org.locationtech.jts.geom.impl.CoordinateArraySequenceFactory",
      "com.graphhopper.routing.util.parsers.OSMRoadEnvironmentParser",
      "com.graphhopper.routing.util.FootFlagEncoder",
      "com.carrotsearch.hppc.HashContainers",
      "com.graphhopper.storage.index.LocationIndex",
      "com.graphhopper.routing.util.PriorityCode",
      "com.carrotsearch.hppc.predicates.ObjectIntPredicate",
      "com.graphhopper.routing.ev.BooleanEncodedValue",
      "com.graphhopper.reader.ConditionalTagInspector",
      "com.graphhopper.storage.MMapDataAccess",
      "com.graphhopper.routing.util.TransportationMode",
      "org.locationtech.jts.geom.GeometryCollection",
      "com.graphhopper.routing.util.parsers.TagParserFactory",
      "com.graphhopper.routing.ev.UnsignedDecimalEncodedValue",
      "com.graphhopper.reader.osm.conditional.DateRange",
      "com.carrotsearch.hppc.BoundedProportionalArraySizingStrategy",
      "com.graphhopper.coll.GHIntObjectHashMap",
      "com.graphhopper.routing.util.Car4WDFlagEncoder",
      "com.graphhopper.util.shapes.GHPoint",
      "com.carrotsearch.hppc.BitUtil",
      "com.graphhopper.coll.LongIntMap",
      "com.graphhopper.routing.ev.GetOffBike",
      "com.graphhopper.storage.GraphHopperStorage$1",
      "org.locationtech.jts.geom.CoordinateSequence",
      "com.graphhopper.routing.weighting.CurvatureWeighting",
      "com.carrotsearch.hppc.HashOrderMixingStrategy",
      "com.graphhopper.coll.GHLongIntBTree$BTreeEntry",
      "com.graphhopper.routing.util.parsers.TurnCostParser",
      "com.graphhopper.util.DistanceCalc",
      "com.graphhopper.routing.util.parsers.helpers.OSMValueExtractor",
      "com.graphhopper.routing.util.parsers.TagParser",
      "com.graphhopper.util.GHUtility$DisabledEdgeIterator",
      "org.locationtech.jts.geom.Puntal",
      "com.carrotsearch.hppc.HashOrderMixing$Strategy",
      "com.carrotsearch.hppc.BufferAllocationException",
      "com.graphhopper.routing.weighting.TurnCostProvider$1",
      "com.graphhopper.routing.util.BikeFlagEncoder",
      "com.graphhopper.routing.ev.StringEncodedValue",
      "com.carrotsearch.hppc.AbstractLongCollection",
      "com.graphhopper.util.EdgeIteratorState",
      "com.graphhopper.coll.GHLongLongHashMap",
      "com.graphhopper.util.CHEdgeIteratorState",
      "com.graphhopper.util.PMap",
      "org.locationtech.jts.geom.Point",
      "com.graphhopper.routing.util.FlagEncoderFactory",
      "com.graphhopper.reader.OSMTurnRelation$Type",
      "com.graphhopper.util.EdgeIterator",
      "com.graphhopper.util.PointList",
      "com.carrotsearch.hppc.LongLongHashMap",
      "com.graphhopper.routing.util.Bike2WeightFlagEncoder",
      "com.graphhopper.routing.util.EncodingManager$Builder",
      "org.locationtech.jts.geom.CoordinateSequenceFilter",
      "com.graphhopper.reader.osm.conditional.ConditionalParser",
      "com.graphhopper.reader.osm.conditional.ParsedCalendar",
      "com.graphhopper.storage.TurnCostStorage$TurnRelationIterator",
      "com.graphhopper.util.GHUtility$DisabledNodeAccess",
      "com.graphhopper.reader.osm.conditional.ConditionalValueParser",
      "org.locationtech.jts.geom.impl.PackedCoordinateSequence$Float",
      "com.graphhopper.routing.util.MountainBikeFlagEncoder",
      "com.graphhopper.util.BitUtil",
      "com.graphhopper.routing.util.parsers.OSMRoadAccessParser",
      "com.graphhopper.routing.ev.SimpleBooleanEncodedValue",
      "com.graphhopper.storage.Storable",
      "com.carrotsearch.hppc.procedures.ObjectProcedure",
      "org.locationtech.jts.algorithm.RectangleLineIntersector",
      "com.carrotsearch.hppc.ObjectIntAssociativeContainer",
      "com.graphhopper.routing.util.BikeCommonFlagEncoder",
      "org.locationtech.jts.geom.GeometryFactory",
      "com.carrotsearch.hppc.Preallocable",
      "com.graphhopper.storage.InternalGraphEventListener",
      "com.graphhopper.storage.RAMDirectory",
      "com.carrotsearch.hppc.IntSet",
      "com.carrotsearch.hppc.predicates.IntPredicate",
      "com.carrotsearch.hppc.IntCollection",
      "org.locationtech.jts.geom.Polygonal",
      "com.graphhopper.reader.dem.CGIARProvider",
      "com.carrotsearch.hppc.IntLongMap",
      "com.carrotsearch.hppc.IntObjectMap",
      "com.graphhopper.routing.ch.NodeOrderingProvider",
      "org.locationtech.jts.geom.CoordinateSequenceFactory",
      "org.locationtech.jts.geom.LineString",
      "com.graphhopper.routing.util.parsers.OSMRoadAccessParser$1",
      "com.graphhopper.util.DistanceCalcEarth",
      "com.carrotsearch.hppc.LongLongMap",
      "org.locationtech.jts.geom.Envelope",
      "org.locationtech.jts.geom.CoordinateSequenceComparator",
      "com.graphhopper.util.FetchMode",
      "com.carrotsearch.hppc.LongHashSet"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CarFlagEncoder_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.graphhopper.routing.util.AbstractFlagEncoder",
      "com.graphhopper.routing.util.CarFlagEncoder",
      "com.graphhopper.routing.util.TransportationMode",
      "com.graphhopper.routing.util.EncodingManager$Access",
      "com.graphhopper.util.PMap",
      "com.graphhopper.routing.util.MotorcycleFlagEncoder",
      "com.graphhopper.routing.util.parsers.OSMRoadAccessParser",
      "com.graphhopper.routing.util.parsers.OSMRoadAccessParser$1",
      "com.graphhopper.routing.ev.UnsignedIntEncodedValue",
      "com.graphhopper.routing.ev.UnsignedDecimalEncodedValue",
      "com.graphhopper.routing.util.EncodingManager",
      "com.graphhopper.reader.ReaderElement",
      "com.graphhopper.reader.ReaderWay",
      "com.carrotsearch.hppc.AbstractLongCollection",
      "com.carrotsearch.hppc.LongArrayList",
      "com.carrotsearch.hppc.BoundedProportionalArraySizingStrategy",
      "com.graphhopper.storage.IntsRef",
      "com.graphhopper.routing.util.FootFlagEncoder",
      "com.graphhopper.routing.util.WheelchairFlagEncoder",
      "com.graphhopper.routing.ev.RouteNetwork",
      "com.graphhopper.routing.util.PriorityCode",
      "com.graphhopper.util.Helper",
      "com.graphhopper.routing.util.EncodingManager$Builder",
      "com.graphhopper.routing.ev.EncodedValue$InitializerConfig",
      "com.graphhopper.routing.util.parsers.OSMRoundaboutParser",
      "com.graphhopper.routing.ev.Roundabout",
      "com.graphhopper.routing.ev.SimpleBooleanEncodedValue",
      "com.graphhopper.routing.util.parsers.OSMRoadClassParser",
      "com.graphhopper.routing.ev.EnumEncodedValue",
      "com.graphhopper.routing.ev.RoadClass",
      "com.graphhopper.routing.util.parsers.OSMRoadClassLinkParser",
      "com.graphhopper.routing.util.parsers.OSMRoadEnvironmentParser",
      "com.graphhopper.routing.ev.RoadEnvironment",
      "com.graphhopper.routing.util.parsers.OSMMaxSpeedParser",
      "com.graphhopper.routing.ev.MaxSpeed",
      "com.graphhopper.routing.ev.RoadAccess",
      "com.graphhopper.reader.osm.conditional.DateRangeParser",
      "com.graphhopper.reader.ReaderRelation",
      "com.graphhopper.routing.util.Car4WDFlagEncoder",
      "com.graphhopper.routing.util.FerrySpeedCalculator",
      "com.graphhopper.reader.osm.conditional.ConditionalOSMTagInspector",
      "com.graphhopper.reader.osm.conditional.ConditionalParser",
      "com.graphhopper.routing.util.DefaultFlagEncoderFactory",
      "com.graphhopper.routing.ev.StringEncodedValue",
      "com.graphhopper.routing.util.BikeCommonFlagEncoder",
      "com.graphhopper.routing.util.BikeFlagEncoder",
      "com.graphhopper.routing.util.Bike2WeightFlagEncoder",
      "com.graphhopper.util.EdgeIteratorState$1",
      "com.graphhopper.util.EdgeIteratorState",
      "com.graphhopper.util.GHUtility$DisabledEdgeIterator",
      "com.graphhopper.reader.OSMTurnRelation",
      "com.graphhopper.reader.osm.OSMReader",
      "com.graphhopper.util.DistanceCalcEarth",
      "com.graphhopper.util.DouglasPeucker",
      "com.graphhopper.util.DistancePlaneProjection",
      "com.carrotsearch.hppc.LongHashSet",
      "com.graphhopper.coll.GHLongHashSet",
      "com.carrotsearch.hppc.IntObjectHashMap",
      "com.carrotsearch.hppc.HashOrderMixing$1",
      "com.carrotsearch.hppc.HashOrderMixing",
      "com.carrotsearch.hppc.HashOrderMixing$2",
      "com.graphhopper.coll.GHIntObjectHashMap",
      "com.carrotsearch.hppc.HashContainers",
      "com.carrotsearch.hppc.BitUtil",
      "com.carrotsearch.hppc.BitMixer",
      "com.graphhopper.reader.dem.ElevationProvider$1",
      "com.graphhopper.reader.dem.ElevationProvider",
      "com.graphhopper.routing.util.parsers.helpers.OSMValueExtractor",
      "com.graphhopper.routing.ev.DefaultEncodedValueFactory",
      "com.graphhopper.storage.GHDirectory",
      "com.graphhopper.storage.RAMDirectory",
      "com.graphhopper.storage.DAType$MemRef",
      "com.graphhopper.storage.DAType",
      "com.graphhopper.storage.StorableProperties",
      "com.graphhopper.storage.AbstractDataAccess",
      "com.graphhopper.storage.RAMDataAccess",
      "com.graphhopper.util.BitUtilLittle",
      "com.graphhopper.util.BitUtilBig",
      "com.graphhopper.util.BitUtil",
      "com.graphhopper.reader.ReaderNode",
      "com.graphhopper.routing.ev.BikeNetwork",
      "com.graphhopper.routing.ev.FootNetwork",
      "com.graphhopper.routing.util.HikeFlagEncoder",
      "com.graphhopper.routing.util.RacingBikeFlagEncoder",
      "com.graphhopper.routing.util.DefaultEdgeFilter",
      "com.graphhopper.routing.util.EncodingManager$AcceptWay",
      "org.locationtech.jts.geom.PrecisionModel$Type",
      "org.locationtech.jts.geom.PrecisionModel",
      "org.locationtech.jts.geom.DefaultCoordinateSequenceFactory",
      "org.locationtech.jts.geom.GeometryFactory",
      "org.locationtech.jts.geom.Coordinate",
      "org.locationtech.jts.geom.impl.CoordinateArraySequence",
      "org.locationtech.jts.geom.impl.PackedCoordinateSequence",
      "org.locationtech.jts.geom.impl.PackedCoordinateSequence$Double",
      "com.carrotsearch.hppc.ObjectIntHashMap",
      "com.carrotsearch.hppc.HashOrderMixing$4",
      "com.carrotsearch.hppc.HashOrderMixing$Strategy",
      "com.carrotsearch.hppc.Containers",
      "com.carrotsearch.hppc.Containers$1",
      "com.carrotsearch.hppc.RandomizedHashOrderMixer",
      "com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser",
      "com.graphhopper.routing.util.MountainBikeFlagEncoder",
      "com.graphhopper.routing.weighting.AbstractWeighting",
      "com.graphhopper.routing.weighting.FastestWeighting",
      "com.graphhopper.routing.weighting.PriorityWeighting",
      "com.graphhopper.routing.weighting.CurvatureWeighting",
      "com.graphhopper.routing.weighting.TurnCostProvider$1",
      "com.graphhopper.routing.weighting.TurnCostProvider",
      "org.locationtech.jts.geom.impl.CoordinateArraySequenceFactory",
      "org.locationtech.jts.geom.Geometry$1",
      "org.locationtech.jts.geom.Geometry",
      "org.locationtech.jts.geom.GeometryCollection",
      "org.locationtech.jts.geom.MultiLineString",
      "org.locationtech.jts.geom.impl.PackedCoordinateSequence$Float",
      "org.locationtech.jts.geom.LineString",
      "org.locationtech.jts.geom.util.LinearComponentExtracter",
      "org.locationtech.jts.geom.MultiPolygon",
      "com.graphhopper.routing.util.parsers.OSMBikeNetworkTagParser",
      "com.graphhopper.routing.util.parsers.OSMGetOffBikeParser",
      "com.graphhopper.routing.ev.GetOffBike",
      "com.graphhopper.storage.GraphHopperStorage",
      "com.graphhopper.storage.GraphHopperStorage$1",
      "com.graphhopper.storage.BaseGraph",
      "com.graphhopper.search.StringIndex",
      "com.graphhopper.search.StringIndex$1",
      "com.graphhopper.storage.RAMIntDataAccess",
      "com.graphhopper.util.shapes.BBox",
      "com.graphhopper.storage.GHNodeAccess",
      "com.graphhopper.coll.GHLongIntBTree",
      "com.graphhopper.coll.GHLongIntBTree$BTreeEntry",
      "com.carrotsearch.hppc.LongLongHashMap",
      "com.graphhopper.coll.GHLongLongHashMap",
      "com.graphhopper.reader.PillarInfo",
      "com.graphhopper.reader.dem.AbstractElevationProvider",
      "com.graphhopper.reader.dem.AbstractTiffElevationProvider",
      "com.graphhopper.reader.dem.CGIARProvider",
      "com.graphhopper.util.Downloader",
      "org.locationtech.jts.geom.Envelope",
      "org.locationtech.jts.geom.MultiPoint",
      "com.graphhopper.storage.MMapDataAccess",
      "org.locationtech.jts.geom.DefaultCoordinateSequence",
      "com.graphhopper.storage.TurnCostStorage",
      "com.graphhopper.routing.weighting.ShortestWeighting",
      "org.locationtech.jts.io.WKTWriter",
      "org.locationtech.jts.geom.Polygon",
      "org.locationtech.jts.geom.LinearRing",
      "com.graphhopper.routing.weighting.ShortFastestWeighting",
      "com.graphhopper.routing.weighting.AbstractAdjustedWeighting",
      "com.graphhopper.routing.weighting.AvoidEdgesWeighting",
      "com.graphhopper.storage.MMapDirectory"
    );
  }
}
