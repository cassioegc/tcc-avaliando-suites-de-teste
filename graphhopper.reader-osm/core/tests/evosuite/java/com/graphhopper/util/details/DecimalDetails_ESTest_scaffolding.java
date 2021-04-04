/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Apr 04 05:20:31 GMT 2021
 */

package com.graphhopper.util.details;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class DecimalDetails_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.graphhopper.util.details.DecimalDetails"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DecimalDetails_ESTest_scaffolding.class.getClassLoader() ,
      "com.graphhopper.routing.ev.EncodedValue",
      "com.graphhopper.util.EdgeIteratorState",
      "com.graphhopper.util.details.AbstractPathDetailsBuilder",
      "com.graphhopper.routing.ev.IntEncodedValue",
      "com.graphhopper.util.details.DecimalDetails",
      "com.graphhopper.routing.ev.BooleanEncodedValue",
      "com.graphhopper.routing.ev.EncodedValue$InitializerConfig",
      "com.graphhopper.routing.util.FlagEncoderFactory",
      "com.graphhopper.util.EdgeIteratorState$1",
      "com.graphhopper.util.PointList",
      "com.graphhopper.routing.ev.EncodedValueLookup",
      "com.graphhopper.storage.Directory",
      "com.graphhopper.routing.util.EncodingManager",
      "com.graphhopper.routing.ev.UnsignedIntEncodedValue",
      "com.graphhopper.routing.ev.SimpleBooleanEncodedValue",
      "com.graphhopper.util.details.PathDetailsBuilder",
      "com.graphhopper.routing.ev.DecimalEncodedValue",
      "com.graphhopper.util.PointAccess",
      "com.graphhopper.storage.IntsRef",
      "com.graphhopper.routing.ev.StringEncodedValue",
      "com.graphhopper.util.FetchMode",
      "com.graphhopper.routing.ev.EnumEncodedValue"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.graphhopper.routing.ev.DecimalEncodedValue", false, DecimalDetails_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.graphhopper.util.EdgeIteratorState", false, DecimalDetails_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DecimalDetails_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.graphhopper.util.details.AbstractPathDetailsBuilder",
      "com.graphhopper.util.details.DecimalDetails",
      "com.graphhopper.coll.MapEntry",
      "com.graphhopper.util.details.PathDetail",
      "com.graphhopper.routing.ev.UnsignedIntEncodedValue",
      "com.graphhopper.routing.ev.SimpleBooleanEncodedValue",
      "com.graphhopper.routing.util.EncodingManager",
      "com.graphhopper.util.EdgeIteratorState$1",
      "com.graphhopper.util.EdgeIteratorState"
    );
  }
}
