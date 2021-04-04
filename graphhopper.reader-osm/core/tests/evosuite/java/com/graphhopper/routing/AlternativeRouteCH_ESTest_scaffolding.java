/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Apr 04 02:36:33 GMT 2021
 */

package com.graphhopper.routing;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AlternativeRouteCH_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.graphhopper.routing.AlternativeRouteCH"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AlternativeRouteCH_ESTest_scaffolding.class.getClassLoader() ,
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
      "com.graphhopper.storage.GraphHopperStorage",
      "com.graphhopper.util.EdgeExplorer",
      "org.locationtech.jts.geom.DefaultCoordinateSequenceFactory",
      "com.carrotsearch.hppc.IntArrayList",
      "com.graphhopper.routing.util.MotorcycleFlagEncoder",
      "com.carrotsearch.hppc.predicates.ObjectPredicate",
      "com.carrotsearch.hppc.IntObjectHashMap$KeysContainer",
      "com.graphhopper.storage.index.LocationIndex$Visitor",
      "com.carrotsearch.hppc.IntArrayDeque$DescendingValueIterator",
      "com.graphhopper.coll.GHIntLongHashMap",
      "com.graphhopper.util.ProgressListener",
      "org.locationtech.jts.geom.MultiLineString",
      "com.carrotsearch.hppc.IntIndexedContainer",
      "com.graphhopper.reader.ReaderRelation$Member",
      "com.graphhopper.util.EdgeIteratorState$1",
      "com.carrotsearch.hppc.cursors.ObjectCursor",
      "com.graphhopper.routing.AlternativeRouteCH$PotentialAlternativeInfo",
      "com.graphhopper.util.shapes.Shape",
      "com.graphhopper.util.TranslationMap",
      "com.graphhopper.coll.GHLongHashSet",
      "com.graphhopper.routing.util.AllCHEdgesIterator",
      "com.carrotsearch.hppc.IntDeque",
      "com.graphhopper.routing.util.parsers.OSMRoadClassParser",
      "com.graphhopper.util.TranslationMap$TranslationHashMap",
      "com.graphhopper.reader.dem.AbstractElevationProvider",
      "com.carrotsearch.hppc.IntLookupContainer",
      "com.graphhopper.routing.util.parsers.OSMBikeNetworkTagParser",
      "com.graphhopper.util.FinishInstruction",
      "com.graphhopper.routing.ev.RoadEnvironment",
      "com.carrotsearch.hppc.LongArrayList",
      "com.graphhopper.storage.BaseGraph$EdgeIteratorImpl",
      "org.locationtech.jts.geom.Geometry$1",
      "com.graphhopper.routing.DefaultBidirPathExtractor",
      "com.graphhopper.storage.BaseGraph$AllEdgeIterator",
      "com.graphhopper.reader.dem.AbstractSRTMElevationProvider",
      "org.locationtech.jts.geom.LinearRing",
      "com.graphhopper.routing.ev.EncodedValue$InitializerConfig",
      "com.carrotsearch.hppc.BitMixer",
      "com.carrotsearch.hppc.ObjectContainer",
      "com.graphhopper.routing.weighting.FastestWeighting",
      "com.graphhopper.reader.dem.ElevationProvider$1",
      "com.graphhopper.routing.DijkstraBidirectionCHNoSOD",
      "com.graphhopper.routing.util.TraversalMode",
      "com.graphhopper.config.Profile",
      "com.graphhopper.routing.util.DefaultEdgeFilter",
      "com.graphhopper.storage.Graph",
      "com.graphhopper.reader.osm.OSMReader",
      "com.graphhopper.util.PointAccess",
      "com.graphhopper.routing.weighting.ShortFastestWeighting",
      "com.graphhopper.routing.util.parsers.OSMRoadClassLinkParser",
      "com.graphhopper.storage.RoutingCHGraphImpl",
      "com.graphhopper.routing.AbstractBidirCHAlgo",
      "com.graphhopper.routing.ev.EncodedValue",
      "com.graphhopper.reader.dem.GMTEDProvider",
      "com.graphhopper.routing.BidirPathExtractor",
      "com.carrotsearch.hppc.LongLookupContainer",
      "com.graphhopper.storage.StorableProperties",
      "com.graphhopper.storage.CHConfig",
      "com.graphhopper.routing.weighting.AvoidEdgesWeighting",
      "org.locationtech.jts.geom.impl.CoordinateArraySequence",
      "com.graphhopper.storage.GraphStorage",
      "com.graphhopper.util.DouglasPeucker",
      "org.locationtech.jts.geom.Lineal",
      "com.graphhopper.coll.GHLongIntBTree$ReturnValue",
      "com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser",
      "com.graphhopper.storage.NodeAccess",
      "com.carrotsearch.hppc.IntObjectHashMap",
      "com.graphhopper.routing.weighting.QueryGraphWeighting",
      "org.locationtech.jts.geom.MultiPoint",
      "com.graphhopper.routing.ch.PrepareEncoder",
      "com.carrotsearch.hppc.predicates.LongLongPredicate",
      "com.graphhopper.util.BitUtilLittle",
      "com.carrotsearch.hppc.procedures.IntLongProcedure",
      "com.graphhopper.storage.RoutingCHEdgeIterator",
      "com.carrotsearch.hppc.cursors.IntCursor",
      "com.graphhopper.util.shapes.GHPoint3D",
      "org.locationtech.jts.geom.GeometryComponentFilter",
      "com.graphhopper.routing.ev.IntEncodedValue",
      "com.graphhopper.routing.ev.DefaultEncodedValueFactory",
      "com.graphhopper.storage.Directory",
      "com.graphhopper.routing.ev.Roundabout",
      "com.graphhopper.routing.weighting.WeightApproximator",
      "com.graphhopper.coll.GHLongIntBTree",
      "com.graphhopper.routing.util.parsers.OSMGetOffBikeParser",
      "com.graphhopper.routing.ev.DecimalEncodedValue",
      "com.graphhopper.util.ShallowImmutablePointList",
      "com.graphhopper.routing.weighting.AbstractWeighting",
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
      "org.locationtech.jts.geom.MultiPolygon",
      "com.graphhopper.routing.ev.RouteNetwork",
      "com.graphhopper.util.Instruction",
      "com.carrotsearch.hppc.IntObjectHashMap$KeysIterator",
      "com.graphhopper.routing.util.parsers.OSMMaxSpeedParser",
      "com.carrotsearch.hppc.predicates.LongPredicate",
      "com.graphhopper.storage.RoutingCHEdgeExplorer",
      "com.carrotsearch.hppc.IntArrayDeque",
      "com.graphhopper.util.DistanceCalcEuclidean",
      "com.graphhopper.routing.AlternativeRoute$1",
      "com.graphhopper.storage.BaseGraph",
      "com.graphhopper.reader.ReaderWay",
      "com.graphhopper.routing.util.HikeFlagEncoder",
      "com.carrotsearch.hppc.ObjectIntMap",
      "com.graphhopper.util.GHUtility",
      "com.graphhopper.storage.MMapDirectory",
      "com.graphhopper.util.InstructionList",
      "com.graphhopper.routing.AStar$AStarEntry",
      "com.carrotsearch.hppc.IntObjectAssociativeContainer",
      "com.graphhopper.routing.ev.RoadAccess",
      "com.graphhopper.routing.ev.FootNetwork",
      "com.carrotsearch.hppc.LongContainer",
      "com.carrotsearch.hppc.procedures.IntObjectProcedure",
      "com.graphhopper.storage.CHGraph",
      "com.graphhopper.routing.AlternativeRoute$AlternativeBidirSearch",
      "com.carrotsearch.hppc.IntLongHashMap",
      "com.graphhopper.storage.IntsRef",
      "com.graphhopper.routing.util.FerrySpeedCalculator",
      "com.graphhopper.util.BitUtilBig",
      "com.graphhopper.routing.AbstractBidirAlgo",
      "com.graphhopper.routing.Path$EdgeVisitor",
      "com.graphhopper.storage.CHEdgeFilter",
      "com.graphhopper.storage.RAMIntDataAccess",
      "com.graphhopper.reader.osm.conditional.DateRangeParser",
      "com.graphhopper.util.CHEdgeIterator",
      "com.graphhopper.routing.util.CarFlagEncoder",
      "com.graphhopper.routing.Path",
      "com.graphhopper.routing.AlternativeRouteCH",
      "com.carrotsearch.hppc.IntHashSet$EntryIterator",
      "com.graphhopper.routing.ev.EncodedValueLookup",
      "com.graphhopper.routing.ev.MaxSpeed",
      "com.graphhopper.routing.ev.UnsignedIntEncodedValue",
      "com.graphhopper.routing.util.EncodingManager$Access",
      "com.carrotsearch.hppc.HashOrderMixing$1",
      "com.carrotsearch.hppc.HashOrderMixing$2",
      "com.carrotsearch.hppc.AbstractIntCollection",
      "com.carrotsearch.hppc.LongSet",
      "com.graphhopper.storage.DAType",
      "com.graphhopper.storage.TurnCostStorage",
      "com.graphhopper.routing.util.parsers.OSMRoundaboutParser",
      "com.graphhopper.routing.weighting.Weighting",
      "com.graphhopper.storage.DataAccess",
      "com.graphhopper.routing.util.EncodingManager$AcceptWay",
      "com.graphhopper.reader.ReaderNode",
      "com.graphhopper.routing.weighting.ShortestWeighting",
      "com.carrotsearch.hppc.HashOrderMixing$3",
      "com.carrotsearch.hppc.ObjectLookupContainer",
      "org.locationtech.jts.geom.util.GeometryMapper$MapOp",
      "com.carrotsearch.hppc.LongCollection",
      "com.graphhopper.search.StringIndex$1",
      "com.carrotsearch.hppc.predicates.IntObjectPredicate",
      "org.locationtech.jts.geom.Coordinate",
      "com.graphhopper.routing.util.AbstractFlagEncoder",
      "com.graphhopper.routing.AlternativeRoute",
      "com.graphhopper.util.Translation",
      "com.graphhopper.util.DistancePlaneProjection",
      "com.carrotsearch.hppc.ObjectCollection",
      "com.graphhopper.routing.InstructionsFromEdges",
      "com.graphhopper.routing.util.parsers.TurnCostParser$ExternalInternalMap",
      "org.locationtech.jts.algorithm.RobustLineIntersector",
      "com.graphhopper.reader.PillarInfo",
      "com.graphhopper.storage.AbstractDataAccess",
      "com.graphhopper.storage.index.Snap$Position",
      "com.graphhopper.storage.DAType$MemRef",
      "com.graphhopper.util.shapes.BBox",
      "com.carrotsearch.hppc.AbstractObjectCollection",
      "com.carrotsearch.hppc.procedures.LongProcedure",
      "com.graphhopper.reader.ReaderRelation",
      "com.carrotsearch.hppc.ArraySizingStrategy",
      "com.graphhopper.reader.osm.conditional.ConditionalOSMTagInspector",
      "org.locationtech.jts.algorithm.NotRepresentableException",
      "com.graphhopper.routing.weighting.PriorityWeighting",
      "com.carrotsearch.hppc.IntArrayDeque$ValueIterator",
      "com.graphhopper.storage.GraphEdgeIdFinder$1",
      "org.locationtech.jts.geom.PrecisionModel$Type",
      "com.graphhopper.routing.weighting.AbstractAdjustedWeighting",
      "com.graphhopper.reader.osm.conditional.ConditionalValueParser$ConditionState",
      "com.carrotsearch.hppc.procedures.ObjectIntProcedure",
      "com.carrotsearch.hppc.LongIndexedContainer",
      "com.graphhopper.routing.ev.BikeNetwork",
      "com.carrotsearch.hppc.procedures.IntProcedure",
      "org.locationtech.jts.geom.GeometryFilter",
      "com.graphhopper.routing.util.DefaultFlagEncoderFactory",
      "com.graphhopper.routing.util.AllEdgesIterator",
      "com.graphhopper.util.CHEdgeExplorer",
      "com.graphhopper.storage.RoutingCHGraph",
      "com.graphhopper.storage.CHGraphImpl",
      "com.carrotsearch.hppc.LongLongAssociativeContainer",
      "com.graphhopper.reader.dem.MultiSourceElevationProvider",
      "com.graphhopper.routing.ev.EncodedValueFactory",
      "com.graphhopper.routing.util.EdgeFilter",
      "com.graphhopper.util.FinishInstruction$2",
      "com.graphhopper.util.FinishInstruction$1",
      "com.graphhopper.storage.RAMDataAccess",
      "com.graphhopper.routing.util.parsers.RelationTagParser",
      "org.locationtech.jts.geom.IntersectionMatrix",
      "com.carrotsearch.hppc.HashOrderMixing",
      "com.graphhopper.reader.dem.SRTMGL1Provider",
      "com.carrotsearch.hppc.IntLongAssociativeContainer",
      "com.carrotsearch.hppc.LongLongHashMap$KeysContainer",
      "com.graphhopper.routing.ev.RoadClass",
      "org.locationtech.jts.geom.impl.PackedCoordinateSequence",
      "com.carrotsearch.hppc.procedures.LongLongProcedure",
      "com.carrotsearch.hppc.IntLongHashMap$KeysContainer",
      "com.carrotsearch.hppc.predicates.IntLongPredicate",
      "com.graphhopper.routing.util.FlagEncoder",
      "com.graphhopper.routing.ev.EnumEncodedValue",
      "com.graphhopper.util.shapes.Polygon",
      "org.locationtech.jts.geom.impl.CoordinateArraySequenceFactory",
      "com.graphhopper.routing.util.parsers.OSMRoadEnvironmentParser",
      "com.graphhopper.routing.util.FootFlagEncoder",
      "com.carrotsearch.hppc.IntStack",
      "com.carrotsearch.hppc.HashContainers",
      "com.graphhopper.routing.RoutingAlgorithm",
      "com.graphhopper.storage.index.LocationIndex",
      "com.graphhopper.routing.util.PriorityCode",
      "com.carrotsearch.hppc.predicates.ObjectIntPredicate",
      "com.graphhopper.routing.ev.BooleanEncodedValue",
      "com.carrotsearch.hppc.IntObjectHashMap$ValuesIterator",
      "com.graphhopper.coll.GHIntHashSet",
      "com.graphhopper.reader.ConditionalTagInspector",
      "com.graphhopper.storage.MMapDataAccess",
      "com.graphhopper.routing.util.TransportationMode",
      "org.locationtech.jts.geom.GeometryCollection",
      "com.carrotsearch.hppc.IntObjectHashMap$ValuesContainer",
      "com.graphhopper.routing.util.parsers.TagParserFactory",
      "com.graphhopper.routing.ev.UnsignedDecimalEncodedValue",
      "com.graphhopper.reader.osm.conditional.DateRange",
      "com.carrotsearch.hppc.BoundedProportionalArraySizingStrategy",
      "com.graphhopper.coll.GHIntObjectHashMap",
      "com.graphhopper.routing.util.FiniteWeightFilter",
      "com.graphhopper.routing.util.Car4WDFlagEncoder",
      "com.graphhopper.util.shapes.GHPoint",
      "com.graphhopper.routing.AlternativeRoute$AlternativeInfo",
      "com.carrotsearch.hppc.AbstractIterator",
      "com.graphhopper.routing.AlternativeRouteCH$AlternativeInfo",
      "com.carrotsearch.hppc.BitUtil",
      "com.graphhopper.coll.LongIntMap",
      "com.graphhopper.storage.GraphHopperStorage$1",
      "com.graphhopper.routing.ev.GetOffBike",
      "org.locationtech.jts.geom.CoordinateSequence",
      "com.carrotsearch.hppc.IntArrayList$ValueIterator",
      "com.graphhopper.routing.weighting.CurvatureWeighting",
      "com.carrotsearch.hppc.HashOrderMixingStrategy",
      "com.graphhopper.coll.GHLongIntBTree$BTreeEntry",
      "com.graphhopper.routing.util.parsers.TurnCostParser",
      "com.graphhopper.routing.AbstractNonCHBidirAlgo",
      "com.graphhopper.util.DistanceCalc",
      "com.graphhopper.storage.GraphEdgeIdFinder$BlockArea",
      "com.graphhopper.routing.SPTEntry",
      "com.graphhopper.routing.util.parsers.helpers.OSMValueExtractor",
      "com.graphhopper.routing.util.parsers.TagParser",
      "com.graphhopper.util.GHUtility$DisabledEdgeIterator",
      "org.locationtech.jts.geom.Puntal",
      "com.graphhopper.routing.weighting.DefaultTurnCostProvider",
      "com.carrotsearch.hppc.BufferAllocationException",
      "com.graphhopper.routing.weighting.TurnCostProvider$1",
      "org.locationtech.jts.geom.prep.PreparedGeometry",
      "com.graphhopper.routing.util.BikeFlagEncoder",
      "com.graphhopper.routing.ev.StringEncodedValue",
      "com.carrotsearch.hppc.AbstractLongCollection",
      "com.carrotsearch.hppc.IntScatterSet",
      "com.graphhopper.util.EdgeIteratorState",
      "com.graphhopper.coll.GHLongLongHashMap",
      "com.graphhopper.util.CHEdgeIteratorState",
      "com.graphhopper.util.PMap",
      "org.locationtech.jts.geom.Point",
      "com.graphhopper.routing.util.FlagEncoderFactory",
      "com.graphhopper.util.EdgeIterator",
      "com.graphhopper.reader.OSMTurnRelation$Type",
      "com.graphhopper.util.PointList",
      "com.carrotsearch.hppc.LongLongHashMap",
      "com.graphhopper.routing.util.Bike2WeightFlagEncoder",
      "com.graphhopper.routing.AlternativeRoute$PlateauInfo",
      "com.graphhopper.util.shapes.Circle",
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
      "com.graphhopper.storage.InternalGraphEventListener",
      "com.carrotsearch.hppc.Preallocable",
      "com.graphhopper.util.RoundaboutInstruction",
      "com.graphhopper.storage.RAMDirectory",
      "com.carrotsearch.hppc.IntSet",
      "com.carrotsearch.hppc.IntHashSet",
      "com.carrotsearch.hppc.predicates.IntPredicate",
      "com.carrotsearch.hppc.IntCollection",
      "org.locationtech.jts.geom.Polygonal",
      "com.graphhopper.reader.dem.CGIARProvider",
      "com.graphhopper.routing.AStarBidirection",
      "com.carrotsearch.hppc.IntLongMap",
      "com.carrotsearch.hppc.IntObjectMap",
      "com.graphhopper.routing.ch.NodeOrderingProvider",
      "org.locationtech.jts.geom.CoordinateSequenceFactory",
      "org.locationtech.jts.geom.LineString",
      "com.graphhopper.storage.GraphEdgeIdFinder",
      "com.graphhopper.routing.util.parsers.OSMRoadAccessParser$1",
      "com.graphhopper.util.DistanceCalcEarth",
      "com.carrotsearch.hppc.LongLongMap",
      "org.locationtech.jts.geom.Envelope",
      "org.locationtech.jts.geom.CoordinateSequenceComparator",
      "com.graphhopper.routing.BidirRoutingAlgorithm",
      "com.graphhopper.util.FetchMode",
      "com.carrotsearch.hppc.LongHashSet"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AlternativeRouteCH_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.graphhopper.routing.AbstractBidirAlgo",
      "com.graphhopper.routing.AbstractBidirCHAlgo",
      "com.graphhopper.routing.DijkstraBidirectionCHNoSOD",
      "com.graphhopper.routing.AlternativeRouteCH",
      "com.graphhopper.routing.AlternativeRouteCH$AlternativeInfo",
      "com.graphhopper.routing.AlternativeRouteCH$PotentialAlternativeInfo",
      "com.graphhopper.storage.GHDirectory",
      "com.graphhopper.storage.RAMDirectory",
      "com.graphhopper.storage.DAType",
      "com.graphhopper.util.Helper",
      "com.graphhopper.routing.util.EncodingManager",
      "com.graphhopper.routing.util.DefaultFlagEncoderFactory",
      "com.graphhopper.routing.ev.DefaultEncodedValueFactory",
      "com.graphhopper.storage.StorableProperties",
      "com.graphhopper.storage.AbstractDataAccess",
      "com.graphhopper.storage.RAMDataAccess",
      "com.graphhopper.util.BitUtilLittle",
      "com.graphhopper.util.BitUtilBig",
      "com.graphhopper.util.BitUtil",
      "com.graphhopper.routing.util.EncodingManager$Builder",
      "com.graphhopper.routing.ev.EncodedValue$InitializerConfig",
      "com.graphhopper.routing.util.parsers.OSMRoundaboutParser",
      "com.graphhopper.routing.ev.Roundabout",
      "com.graphhopper.routing.ev.UnsignedIntEncodedValue",
      "com.graphhopper.routing.ev.SimpleBooleanEncodedValue",
      "com.graphhopper.routing.util.parsers.OSMRoadClassParser",
      "com.graphhopper.routing.ev.EnumEncodedValue",
      "com.graphhopper.routing.ev.RoadClass",
      "com.graphhopper.routing.util.parsers.OSMRoadClassLinkParser",
      "com.graphhopper.routing.util.parsers.OSMRoadEnvironmentParser",
      "com.graphhopper.routing.ev.RoadEnvironment",
      "com.graphhopper.routing.util.parsers.OSMMaxSpeedParser",
      "com.graphhopper.routing.ev.MaxSpeed",
      "com.graphhopper.routing.ev.UnsignedDecimalEncodedValue",
      "com.graphhopper.routing.util.parsers.OSMRoadAccessParser",
      "com.graphhopper.routing.ev.RoadAccess",
      "com.graphhopper.routing.util.TransportationMode",
      "com.graphhopper.routing.util.parsers.OSMRoadAccessParser$1",
      "com.graphhopper.reader.osm.conditional.DateRangeParser",
      "com.graphhopper.storage.GraphHopperStorage",
      "com.graphhopper.storage.GraphHopperStorage$1",
      "com.graphhopper.storage.BaseGraph",
      "com.graphhopper.search.StringIndex",
      "com.graphhopper.search.StringIndex$1",
      "com.graphhopper.storage.RAMIntDataAccess",
      "com.graphhopper.util.shapes.BBox",
      "com.graphhopper.storage.GHNodeAccess",
      "com.graphhopper.routing.Path",
      "com.carrotsearch.hppc.AbstractIntCollection",
      "com.carrotsearch.hppc.IntArrayList",
      "com.carrotsearch.hppc.BoundedProportionalArraySizingStrategy",
      "com.graphhopper.storage.MMapDirectory",
      "com.graphhopper.util.PMap",
      "com.graphhopper.storage.RoutingCHGraphImpl",
      "com.graphhopper.storage.TurnCostStorage",
      "com.graphhopper.util.GHUtility$DisabledEdgeIterator",
      "com.graphhopper.routing.util.AbstractFlagEncoder",
      "com.graphhopper.routing.util.FootFlagEncoder",
      "com.graphhopper.routing.util.HikeFlagEncoder",
      "com.graphhopper.routing.ev.RouteNetwork",
      "com.graphhopper.routing.util.PriorityCode",
      "com.graphhopper.routing.util.BikeCommonFlagEncoder",
      "com.graphhopper.routing.util.MountainBikeFlagEncoder",
      "com.graphhopper.routing.util.CarFlagEncoder",
      "com.graphhopper.routing.util.MotorcycleFlagEncoder",
      "com.graphhopper.routing.util.BikeFlagEncoder",
      "com.graphhopper.storage.MMapDataAccess",
      "com.graphhopper.routing.util.Bike2WeightFlagEncoder",
      "com.graphhopper.routing.util.parsers.OSMBikeNetworkTagParser",
      "com.graphhopper.routing.ev.BikeNetwork",
      "com.graphhopper.routing.util.parsers.OSMGetOffBikeParser",
      "com.graphhopper.routing.ev.GetOffBike",
      "com.graphhopper.routing.util.parsers.OSMFootNetworkTagParser",
      "com.graphhopper.routing.ev.FootNetwork",
      "com.graphhopper.routing.util.FerrySpeedCalculator",
      "com.graphhopper.reader.osm.conditional.ConditionalOSMTagInspector",
      "com.graphhopper.reader.osm.conditional.ConditionalParser",
      "com.graphhopper.routing.weighting.AbstractWeighting",
      "com.graphhopper.routing.weighting.ShortestWeighting",
      "com.graphhopper.routing.weighting.TurnCostProvider$1",
      "com.graphhopper.routing.weighting.TurnCostProvider",
      "com.graphhopper.routing.util.WheelchairFlagEncoder",
      "com.graphhopper.routing.util.Car4WDFlagEncoder",
      "com.carrotsearch.hppc.IntStack",
      "com.graphhopper.routing.weighting.QueryGraphWeighting",
      "com.graphhopper.routing.weighting.FastestWeighting",
      "com.graphhopper.routing.util.RacingBikeFlagEncoder",
      "com.graphhopper.routing.weighting.ShortFastestWeighting",
      "com.graphhopper.storage.IntsRef",
      "com.graphhopper.reader.ReaderElement",
      "com.graphhopper.reader.ReaderWay",
      "com.carrotsearch.hppc.AbstractLongCollection",
      "com.carrotsearch.hppc.LongArrayList",
      "com.graphhopper.routing.weighting.DefaultTurnCostProvider",
      "com.graphhopper.routing.util.EncodingManager$AcceptWay",
      "com.graphhopper.routing.util.parsers.helpers.OSMValueExtractor",
      "com.graphhopper.storage.CHGraphImpl",
      "com.graphhopper.routing.ch.PrepareEncoder",
      "org.locationtech.jts.geom.GeometryFactory",
      "org.locationtech.jts.geom.PrecisionModel$Type",
      "org.locationtech.jts.geom.PrecisionModel",
      "org.locationtech.jts.geom.impl.CoordinateArraySequenceFactory",
      "com.graphhopper.util.PointList$1",
      "com.graphhopper.util.PointList",
      "com.graphhopper.storage.BaseGraph$EdgeIteratorStateImpl",
      "com.graphhopper.storage.BaseGraph$AllEdgeIterator",
      "com.graphhopper.routing.AbstractNonCHBidirAlgo",
      "com.graphhopper.routing.AStarBidirection",
      "com.graphhopper.routing.AlternativeRoute$AlternativeBidirSearch",
      "com.graphhopper.util.ShallowImmutablePointList",
      "com.graphhopper.routing.weighting.AbstractAdjustedWeighting",
      "com.graphhopper.routing.weighting.AvoidEdgesWeighting",
      "com.graphhopper.util.Instruction",
      "org.locationtech.jts.geom.impl.PackedCoordinateSequence",
      "org.locationtech.jts.geom.impl.PackedCoordinateSequence$Double",
      "org.locationtech.jts.geom.Coordinate",
      "org.locationtech.jts.geom.impl.PackedCoordinateSequence$Float",
      "com.graphhopper.storage.CHConfig",
      "com.graphhopper.config.Profile",
      "com.graphhopper.storage.BaseGraph$EdgeIteratorImpl",
      "com.graphhopper.reader.ReaderNode",
      "com.graphhopper.reader.ReaderRelation",
      "com.graphhopper.routing.weighting.PriorityWeighting",
      "com.graphhopper.routing.weighting.CurvatureWeighting",
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
      "com.graphhopper.coll.GHLongIntBTree",
      "com.graphhopper.coll.GHLongIntBTree$BTreeEntry",
      "com.carrotsearch.hppc.LongLongHashMap",
      "com.graphhopper.coll.GHLongLongHashMap",
      "com.graphhopper.reader.PillarInfo",
      "com.graphhopper.routing.util.EdgeFilter",
      "com.graphhopper.util.GHUtility",
      "com.graphhopper.routing.ev.StringEncodedValue",
      "com.graphhopper.reader.dem.AbstractElevationProvider",
      "com.graphhopper.reader.dem.AbstractSRTMElevationProvider",
      "com.graphhopper.reader.dem.SRTMGL1Provider",
      "com.graphhopper.util.Downloader",
      "com.carrotsearch.hppc.IntLongHashMap",
      "com.graphhopper.coll.GHIntLongHashMap",
      "com.graphhopper.routing.SPTEntry",
      "com.carrotsearch.hppc.IntObjectHashMap$KeysContainer",
      "com.carrotsearch.hppc.AbstractIterator",
      "com.carrotsearch.hppc.IntObjectHashMap$KeysIterator",
      "com.carrotsearch.hppc.cursors.IntCursor",
      "com.carrotsearch.hppc.IntArrayDeque",
      "com.carrotsearch.hppc.IntArrayList$ValueIterator",
      "com.carrotsearch.hppc.IntArrayDeque$ValueIterator",
      "org.locationtech.jts.geom.impl.CoordinateArraySequence",
      "org.locationtech.jts.geom.Geometry$1",
      "org.locationtech.jts.geom.Geometry",
      "org.locationtech.jts.geom.GeometryCollection",
      "org.locationtech.jts.geom.MultiLineString",
      "org.locationtech.jts.geom.DefaultCoordinateSequenceFactory",
      "com.graphhopper.util.shapes.GHPoint",
      "com.graphhopper.util.TranslationMap$TranslationHashMap",
      "com.graphhopper.util.InstructionList",
      "com.carrotsearch.hppc.IntHashSet",
      "com.carrotsearch.hppc.IntScatterSet",
      "com.carrotsearch.hppc.HashOrderMixing$3",
      "com.carrotsearch.hppc.IntHashSet$EntryIterator",
      "com.graphhopper.reader.dem.MultiSourceElevationProvider",
      "com.graphhopper.reader.dem.AbstractTiffElevationProvider",
      "com.graphhopper.reader.dem.CGIARProvider",
      "com.graphhopper.reader.dem.GMTEDProvider",
      "org.locationtech.jts.geom.Polygon",
      "org.locationtech.jts.geom.LineString",
      "org.locationtech.jts.geom.LinearRing",
      "com.graphhopper.storage.GraphEdgeIdFinder$BlockArea",
      "com.graphhopper.util.EdgeIteratorState$1",
      "com.graphhopper.util.EdgeIteratorState",
      "com.graphhopper.routing.util.DefaultEdgeFilter",
      "com.graphhopper.routing.InstructionsFromEdges",
      "com.graphhopper.util.DistanceCalcEuclidean",
      "com.graphhopper.routing.util.FiniteWeightFilter",
      "com.graphhopper.routing.util.TraversalMode",
      "com.graphhopper.storage.DAType$MemRef"
    );
  }
}
