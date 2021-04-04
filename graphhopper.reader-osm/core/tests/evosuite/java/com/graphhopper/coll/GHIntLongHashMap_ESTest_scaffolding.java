/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Apr 04 06:11:58 GMT 2021
 */

package com.graphhopper.coll;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class GHIntLongHashMap_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.graphhopper.coll.GHIntLongHashMap"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(GHIntLongHashMap_ESTest_scaffolding.class.getClassLoader() ,
      "com.carrotsearch.hppc.procedures.IntLongProcedure",
      "com.carrotsearch.hppc.HashOrderMixingStrategy",
      "com.carrotsearch.hppc.LongCollection",
      "com.carrotsearch.hppc.HashOrderMixing",
      "com.carrotsearch.hppc.BitMixer",
      "com.carrotsearch.hppc.IntLongAssociativeContainer",
      "com.carrotsearch.hppc.ObjectContainer",
      "com.carrotsearch.hppc.ObjectCollection",
      "com.carrotsearch.hppc.BufferAllocationException",
      "com.carrotsearch.hppc.IntObjectAssociativeContainer",
      "com.carrotsearch.hppc.LongContainer",
      "com.carrotsearch.hppc.IntLongHashMap$KeysContainer",
      "com.carrotsearch.hppc.predicates.IntLongPredicate",
      "com.carrotsearch.hppc.IntLongHashMap",
      "com.graphhopper.coll.GHIntLongHashMap",
      "com.carrotsearch.hppc.HashContainers",
      "com.carrotsearch.hppc.Preallocable",
      "com.carrotsearch.hppc.IntContainer",
      "com.carrotsearch.hppc.predicates.IntPredicate",
      "com.carrotsearch.hppc.IntCollection",
      "com.carrotsearch.hppc.IntLongMap",
      "com.carrotsearch.hppc.IntObjectMap",
      "com.carrotsearch.hppc.HashOrderMixing$1",
      "com.carrotsearch.hppc.HashOrderMixing$2",
      "com.carrotsearch.hppc.AbstractIntCollection",
      "com.carrotsearch.hppc.IntObjectHashMap",
      "com.graphhopper.coll.GHIntObjectHashMap",
      "com.carrotsearch.hppc.IntLookupContainer",
      "com.carrotsearch.hppc.BitUtil"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.carrotsearch.hppc.HashOrderMixingStrategy", false, GHIntLongHashMap_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(GHIntLongHashMap_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.carrotsearch.hppc.IntLongHashMap",
      "com.graphhopper.coll.GHIntLongHashMap",
      "com.carrotsearch.hppc.IntObjectHashMap",
      "com.carrotsearch.hppc.HashOrderMixing$1",
      "com.carrotsearch.hppc.HashOrderMixing",
      "com.carrotsearch.hppc.HashOrderMixing$2",
      "com.graphhopper.coll.GHIntObjectHashMap",
      "com.carrotsearch.hppc.HashContainers",
      "com.carrotsearch.hppc.BitUtil",
      "com.carrotsearch.hppc.BitMixer",
      "com.carrotsearch.hppc.AbstractIntCollection",
      "com.carrotsearch.hppc.IntLongHashMap$KeysContainer",
      "com.carrotsearch.hppc.BufferAllocationException",
      "com.carrotsearch.hppc.AbstractIterator",
      "com.carrotsearch.hppc.IntLongHashMap$EntryIterator",
      "com.carrotsearch.hppc.cursors.IntLongCursor",
      "com.carrotsearch.hppc.HashOrderMixing$4",
      "com.carrotsearch.hppc.HashOrderMixing$Strategy",
      "com.carrotsearch.hppc.Containers",
      "com.carrotsearch.hppc.Containers$1",
      "com.carrotsearch.hppc.RandomizedHashOrderMixer",
      "com.carrotsearch.hppc.IntBufferVisualizer",
      "com.carrotsearch.hppc.AbstractLongCollection",
      "com.carrotsearch.hppc.IntLongHashMap$ValuesContainer"
    );
  }
}
