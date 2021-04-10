/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Apr 10 03:58:54 GMT 2021
 */

package org.apache.dubbo.remoting;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class TimeoutException_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.dubbo.remoting.TimeoutException"; 
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
    java.lang.System.setProperty("user.dir", "/home/cassioegc/incubator-dubbo/dubbo-remoting/dubbo-remoting-api"); 
    java.lang.System.setProperty("user.home", "/home/cassioegc"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "cassioegc"); 
    java.lang.System.setProperty("user.timezone", "America/Recife"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TimeoutException_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.dubbo.remoting.RemotingException",
      "org.apache.dubbo.remoting.ChannelHandler",
      "org.apache.dubbo.common.URL",
      "org.apache.dubbo.remoting.Endpoint",
      "org.apache.dubbo.remoting.codec.AbstractMockChannel",
      "org.apache.dubbo.remoting.transport.ChannelDelegate",
      "org.apache.dubbo.remoting.Channel",
      "org.apache.dubbo.remoting.TimeoutException"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TimeoutException_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.dubbo.remoting.RemotingException",
      "org.apache.dubbo.remoting.TimeoutException",
      "org.apache.dubbo.remoting.transport.ClientDelegate",
      "org.apache.dubbo.remoting.transport.ChannelDelegate",
      "org.apache.dubbo.remoting.codec.AbstractMockChannel",
      "org.apache.dubbo.common.logger.log4j.Log4jLoggerAdapter",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.helpers.NullEnumeration",
      "org.apache.dubbo.common.logger.log4j.Log4jLogger",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "org.apache.dubbo.common.logger.LoggerFactory",
      "org.apache.dubbo.common.logger.support.FailsafeLogger",
      "org.apache.dubbo.common.timer.HashedWheelTimer",
      "org.apache.dubbo.common.utils.NamedThreadFactory",
      "org.apache.dubbo.common.timer.HashedWheelTimer$Worker",
      "org.apache.dubbo.common.timer.HashedWheelTimer$HashedWheelBucket",
      "org.apache.dubbo.remoting.exchange.support.header.HeaderExchangeClient",
      "org.apache.dubbo.common.utils.Assert",
      "org.apache.dubbo.common.URL",
      "org.apache.dubbo.common.utils.LRUCache",
      "org.apache.dubbo.common.utils.NetUtils",
      "org.apache.dubbo.common.utils.StringUtils",
      "org.apache.dubbo.remoting.handler.MockedChannel",
      "org.apache.dubbo.remoting.transport.ChannelHandlerAdapter",
      "org.apache.dubbo.remoting.telnet.support.TelnetHandlerAdapter",
      "org.apache.dubbo.remoting.exchange.support.ExchangeHandlerAdapter",
      "org.apache.dubbo.remoting.ChanelHandlerTest$PeformanceTestHandler",
      "org.apache.dubbo.common.lang.Prioritized",
      "org.apache.dubbo.common.extension.DubboInternalLoadingStrategy",
      "org.apache.dubbo.common.extension.DubboLoadingStrategy",
      "org.apache.dubbo.common.extension.ServicesLoadingStrategy",
      "org.apache.dubbo.common.extension.ExtensionLoader",
      "org.apache.dubbo.common.utils.Holder",
      "org.apache.dubbo.common.utils.CollectionUtils",
      "org.apache.dubbo.common.utils.ClassUtils",
      "org.apache.dubbo.common.extension.factory.AdaptiveExtensionFactory",
      "org.apache.dubbo.common.extension.factory.SpiExtensionFactory",
      "org.apache.dubbo.common.utils.ArrayUtils",
      "org.apache.dubbo.remoting.exchange.support.header.HeaderExchangeChannel",
      "org.apache.dubbo.remoting.PerformanceClientTest$PeformanceTestHandler",
      "org.apache.dubbo.common.threadlocal.NamedInternalThreadFactory"
    );
  }
}
