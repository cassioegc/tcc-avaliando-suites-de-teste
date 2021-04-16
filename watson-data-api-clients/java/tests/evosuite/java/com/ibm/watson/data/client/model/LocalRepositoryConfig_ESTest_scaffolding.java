/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 14 15:56:26 GMT 2021
 */

package com.ibm.watson.data.client.model;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class LocalRepositoryConfig_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.ibm.watson.data.client.model.LocalRepositoryConfig"; 
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
    java.lang.System.setProperty("user.dir", "/home/cassioegc/tcc/watson-data-api-clients/java"); 
    java.lang.System.setProperty("user.home", "/home/cassioegc"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "cassioegc"); 
    java.lang.System.setProperty("user.timezone", "America/Recife"); 
    java.lang.System.setProperty("sun.arch.data.model", "64"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(LocalRepositoryConfig_ESTest_scaffolding.class.getClassLoader() ,
      "com.fasterxml.jackson.annotation.JsonProperty",
      "io.netty.util.internal.SystemPropertyUtil$1",
      "io.netty.channel.AbstractChannel$AnnotatedNoRouteToHostException",
      "io.netty.channel.unix.DomainSocketChannelConfig",
      "io.netty.util.AttributeMap",
      "org.testng.internal.annotations.IBaseBeforeAfter",
      "io.netty.util.internal.Cleaner",
      "org.testng.annotations.IConfigurationAnnotation",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL1Pad",
      "io.netty.channel.ChannelInboundHandlerAdapter",
      "io.netty.util.concurrent.ScheduledFuture",
      "io.netty.util.internal.logging.LocationAwareSlf4JLogger",
      "io.netty.util.internal.PlatformDependent0",
      "org.testng.xml.XmlScript",
      "io.netty.buffer.ByteBufHolder",
      "org.testng.internal.IInvoker",
      "io.netty.util.internal.ReflectionUtil",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup$1",
      "io.netty.channel.socket.DatagramChannel",
      "org.testng.internal.annotations.IAfterSuite",
      "io.netty.channel.unix.DomainSocketAddress",
      "io.netty.channel.unix.Errors$NativeConnectException",
      "io.netty.util.concurrent.FastThreadLocalThread",
      "org.testng.IConfigurationListener",
      "io.netty.util.concurrent.AbstractEventExecutorGroup",
      "io.netty.util.internal.ThreadLocalRandom",
      "io.netty.util.internal.ThreadExecutorMap",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe",
      "io.netty.channel.epoll.EpollServerChannelConfig",
      "io.netty.channel.ChannelOutboundHandlerAdapter",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue",
      "org.testng.annotations.IAnnotation",
      "org.testng.xml.XmlDependencies",
      "org.testng.xml.XmlSuite$FailurePolicy",
      "io.netty.util.internal.PlatformDependent0$3",
      "io.netty.channel.ChannelOutboundBuffer$MessageProcessor",
      "io.netty.util.internal.PlatformDependent0$4",
      "io.netty.util.internal.PlatformDependent0$5",
      "org.testng.IAttributes",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef",
      "io.netty.util.internal.PlatformDependent0$1",
      "io.netty.util.concurrent.DefaultProgressivePromise",
      "io.netty.util.internal.PlatformDependent0$2",
      "io.netty.channel.socket.ServerSocketChannelConfig",
      "org.testng.ITestNGMethod",
      "org.testng.internal.RuntimeBehavior",
      "org.testng.collections.SetMultiMap",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor",
      "io.netty.util.internal.PlatformDependent0$8",
      "io.netty.util.internal.logging.InternalLogger",
      "io.netty.util.concurrent.NonStickyEventExecutorGroup$NonStickyOrderedEventExecutor",
      "org.testng.thread.IThreadWorkerFactory",
      "org.testng.TestRunner",
      "org.testng.collections.Maps",
      "io.netty.util.concurrent.EventExecutor",
      "io.netty.util.internal.PlatformDependent$1",
      "io.netty.util.internal.PlatformDependent$2",
      "com.ibm.watson.data.client.model.Classification",
      "io.netty.util.internal.PlatformDependent$4",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueProducerNodeRef",
      "io.netty.util.concurrent.EventExecutorChooserFactory",
      "io.netty.util.internal.LongCounter",
      "io.netty.util.internal.StringUtil",
      "org.testng.collections.MultiMap",
      "org.testng.ITestResult",
      "com.ibm.watson.data.client.model.BaseEntity",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "org.mockserver.scheduler.Scheduler",
      "io.netty.channel.epoll.EpollServerSocketChannel",
      "io.netty.util.concurrent.ImmediateEventExecutor",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueConsumerIndexField",
      "org.testng.IInvokedMethod",
      "io.netty.util.internal.ThrowableUtil",
      "io.netty.channel.ChannelMetadata",
      "io.netty.channel.ChannelFlushPromiseNotifier$FlushCheckpoint",
      "io.netty.util.Attribute",
      "io.netty.util.concurrent.GlobalEventExecutor$TaskRunner",
      "io.netty.util.concurrent.AbstractFuture",
      "io.netty.channel.CombinedChannelDuplexHandler",
      "io.netty.channel.ChannelOutboundHandler",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL2Pad",
      "org.testng.internal.annotations.IAfterGroups",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "io.netty.util.ReferenceCounted",
      "org.testng.internal.ITestResultNotifier",
      "org.testng.internal.Utils",
      "io.netty.util.concurrent.DefaultFutureListeners",
      "io.netty.util.concurrent.DefaultEventExecutor",
      "io.netty.util.concurrent.SingleThreadEventExecutor$4",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueConsumerIndexField",
      "io.netty.util.concurrent.SingleThreadEventExecutor$1",
      "com.ibm.watson.data.client.model.ConnectorType",
      "org.mockserver.scheduler.Scheduler$SchedulerThreadFactory",
      "io.netty.channel.epoll.EpollTcpInfo",
      "io.netty.util.concurrent.Future",
      "io.netty.channel.epoll.EpollDatagramChannelConfig",
      "io.netty.channel.epoll.EpollDatagramChannel$EpollDatagramChannelUnsafe",
      "org.testng.xml.XmlClass",
      "org.testng.collections.Lists",
      "io.netty.util.concurrent.DefaultThreadFactory",
      "org.testng.internal.annotations.IDataProvidable",
      "org.testng.annotations.IFactoryAnnotation",
      "org.testng.ITestMethodFinder",
      "io.netty.channel.MultithreadEventLoopGroup",
      "io.netty.buffer.ByteBufAllocator",
      "io.netty.channel.socket.DuplexChannelConfig",
      "io.netty.channel.ChannelId",
      "com.ibm.watson.data.client.model.ElementType",
      "org.testng.internal.ClassHelper",
      "io.netty.channel.epoll.AbstractEpollStreamChannel",
      "com.fasterxml.jackson.annotation.JacksonAnnotation",
      "io.netty.util.AbstractConstant",
      "org.testng.internal.annotations.IBeforeTest",
      "io.netty.util.concurrent.GlobalEventExecutor",
      "io.netty.channel.unix.Socket",
      "io.netty.channel.ChannelProgressiveFuture",
      "io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods",
      "io.netty.util.internal.DefaultPriorityQueue",
      "org.testng.internal.annotations.BaseAnnotation",
      "io.netty.util.NettyRuntime$AvailableProcessorsHolder",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.handler.logging.ByteBufFormat",
      "org.testng.xml.XmlMethodSelectors",
      "io.netty.util.concurrent.OrderedEventExecutor",
      "org.testng.internal.annotations.IAfterTest",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor",
      "io.netty.util.internal.ThreadExecutorMap$1",
      "io.netty.util.internal.ThreadExecutorMap$2",
      "io.netty.util.internal.ThreadExecutorMap$3",
      "io.netty.channel.epoll.EpollDomainSocketChannel",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceInChannelTask",
      "io.netty.channel.ChannelHandlerAdapter",
      "org.testng.ITestContext",
      "org.testng.IResultMap",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceInTask",
      "org.testng.junit.JUnitTestClass",
      "io.netty.channel.AbstractChannel$AbstractUnsafe",
      "io.netty.channel.EventLoop",
      "io.netty.util.internal.PriorityQueueNode",
      "io.netty.channel.epoll.EpollChannelConfig",
      "io.netty.util.internal.MacAddressUtil",
      "io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext",
      "io.netty.channel.unix.PeerCredentials",
      "io.netty.util.internal.shaded.org.jctools.queues.SupportsIterator",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL3Pad",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad2",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad0",
      "io.netty.channel.DefaultFileRegion",
      "io.netty.channel.SingleThreadEventLoop",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad1",
      "com.ibm.watson.data.client.model.Meaning",
      "org.testng.IMethodInterceptor",
      "io.netty.handler.logging.LoggingHandler",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL3Pad",
      "io.netty.util.internal.PriorityQueue",
      "io.netty.util.internal.InternalThreadLocalMap",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueue",
      "io.netty.channel.epoll.LinuxSocket",
      "io.netty.util.concurrent.AbstractEventExecutor",
      "io.netty.channel.ChannelHandlerContext",
      "io.netty.channel.unix.UnixChannel",
      "org.testng.IRetryAnalyzer",
      "io.netty.channel.ChannelFutureListener",
      "org.testng.internal.IConfiguration",
      "com.ibm.watson.data.client.model.enums.EventTypeFilter",
      "io.netty.util.concurrent.BlockingOperationException",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerLimitField",
      "io.netty.channel.FileRegion",
      "io.netty.channel.unix.IovArray",
      "io.netty.channel.ChannelProgressivePromise",
      "io.netty.util.concurrent.DefaultPromise$LeanCancellationException",
      "io.netty.channel.EventLoopGroup",
      "com.ibm.watson.data.client.model.enums.TypeDefCategory",
      "io.netty.channel.AbstractServerChannel$DefaultServerUnsafe",
      "org.springframework.context.annotation.ScopedProxyMode",
      "io.netty.util.concurrent.GenericFutureListener",
      "io.netty.channel.Channel$Unsafe",
      "io.netty.channel.VoidChannelPromise",
      "io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators",
      "io.netty.util.internal.CleanerJava6$1",
      "com.fasterxml.jackson.annotation.JsonCreator",
      "io.netty.util.concurrent.GlobalEventExecutor$1",
      "io.netty.util.AttributeKey",
      "io.netty.util.concurrent.ScheduledFutureTask",
      "com.ibm.watson.data.client.model.Endpoint",
      "io.netty.channel.unix.Errors$NativeIoException",
      "io.netty.util.concurrent.RejectedExecutionHandlers",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueConsumerNodeRef",
      "org.testng.internal.Utils$StackTraceType",
      "io.netty.channel.local.LocalServerChannel",
      "io.netty.channel.epoll.EpollDomainSocketChannel$EpollDomainUnsafe",
      "io.netty.channel.ChannelInboundHandler",
      "io.netty.util.AsciiString",
      "org.testng.internal.ClonedMethod",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "io.netty.channel.local.LocalAddress",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL2Pad",
      "org.hsqldb.jdbc.JDBCDriver",
      "com.ibm.watson.data.client.model.LocalRepositoryConfig",
      "com.ibm.watson.data.client.model.enums.ElementOrigin",
      "io.netty.util.concurrent.DefaultEventExecutorGroup",
      "org.testng.internal.annotations.IBaseBeforeAfterMethod",
      "org.testng.xml.XmlTest",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor$RunnableScheduledFutureTask",
      "io.netty.util.concurrent.RejectedExecutionHandler",
      "io.netty.channel.socket.SocketChannel",
      "org.hsqldb.jdbc.JDBCDriver$1",
      "io.netty.util.concurrent.GenericProgressiveFutureListener",
      "io.netty.channel.local.LocalChannel$State",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.channel.ChannelHandler$Sharable",
      "io.netty.channel.AbstractChannel$AnnotatedSocketException",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "org.testng.xml.XmlSuite",
      "org.testng.internal.annotations.TestOrConfiguration",
      "io.netty.util.internal.shaded.org.jctools.queues.SpscLinkedQueue",
      "io.netty.util.NetUtilInitializations",
      "org.testng.ITestNGListener",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueMidPad",
      "io.netty.util.NettyRuntime",
      "io.netty.channel.ChannelPipeline",
      "io.netty.util.concurrent.DefaultPromise$CauseHolder",
      "io.netty.channel.ServerChannel",
      "org.testng.ITestClass",
      "io.netty.channel.ChannelException",
      "io.netty.handler.logging.LogLevel",
      "org.testng.xml.XmlSuite$ParallelMode",
      "io.netty.util.concurrent.ProgressivePromise",
      "io.netty.util.concurrent.NonStickyEventExecutorGroup",
      "io.netty.util.internal.PlatformDependent0$10",
      "io.netty.util.concurrent.ThreadProperties",
      "org.testng.internal.ConstructorOrMethod",
      "org.testng.internal.annotations.IBeforeGroups",
      "io.netty.util.Constant",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue",
      "com.ibm.watson.data.client.model.TypeDefSummary",
      "io.netty.util.concurrent.RejectedExecutionHandlers$1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad0",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueue",
      "io.netty.channel.DefaultEventLoop",
      "io.netty.util.concurrent.CompleteFuture",
      "io.netty.util.concurrent.ProgressiveFuture",
      "io.netty.channel.unix.Errors",
      "io.netty.channel.AbstractChannel",
      "io.netty.util.concurrent.FastThreadLocalRunnable",
      "io.netty.util.concurrent.PromiseTask",
      "io.netty.channel.AddressedEnvelope",
      "io.netty.channel.epoll.EpollDatagramChannel",
      "io.netty.util.internal.logging.AbstractInternalLogger$1",
      "io.netty.channel.socket.ServerSocketChannel",
      "io.netty.channel.epoll.EpollSocketChannel",
      "io.netty.channel.epoll.AbstractEpollChannel",
      "io.netty.channel.unix.DomainSocketChannel",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueMidPad",
      "io.netty.util.internal.EmptyArrays",
      "io.netty.util.concurrent.ImmediateEventExecutor$2",
      "io.netty.util.concurrent.ImmediateEventExecutor$1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad2",
      "io.netty.util.NetUtilInitializations$NetworkIfaceAndInetAddress",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "io.netty.util.concurrent.ImmediateEventExecutor$ImmediatePromise",
      "org.testng.ITestObjectFactory",
      "io.netty.util.concurrent.Promise",
      "io.netty.util.concurrent.SingleThreadEventExecutor",
      "org.testng.internal.annotations.IBeforeSuite",
      "io.netty.channel.DefaultEventLoopGroup",
      "com.fasterxml.jackson.annotation.JacksonAnnotationValue",
      "io.netty.channel.unix.FileDescriptor",
      "io.netty.channel.AbstractChannel$AnnotatedConnectException",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueueL0Pad",
      "io.netty.channel.Channel",
      "io.netty.util.concurrent.DefaultPromise$StacklessCancellationException",
      "org.testng.internal.annotations.IAfterClass",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueConsumerNodeRef",
      "org.testng.IDynamicGraph",
      "io.netty.util.internal.PlatformDependent$ThreadLocalRandomProvider",
      "io.netty.channel.local.LocalChannel$LocalUnsafe",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory$PowerOfTwoEventExecutorChooser",
      "org.testng.reporters.XMLStringBuffer",
      "io.netty.channel.epoll.EpollSocketChannel$EpollSocketChannelUnsafe",
      "org.testng.internal.DynamicGraph$Edges",
      "org.testng.internal.InvokedMethod",
      "org.testng.IMethodSelector",
      "io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil$IndexedQueue",
      "org.testng.IExecutionVisualiser",
      "io.netty.channel.DefaultChannelConfig",
      "io.netty.channel.AbstractServerChannel",
      "org.testng.annotations.IParameterizable",
      "com.fasterxml.jackson.annotation.JsonInclude$Value",
      "io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerLimitField",
      "io.netty.channel.ChannelPromise",
      "io.netty.channel.epoll.AbstractEpollServerChannel",
      "io.netty.channel.local.LocalChannel",
      "org.testng.xml.XmlDefine",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueue",
      "io.netty.channel.epoll.AbstractEpollServerChannel$EpollServerSocketUnsafe",
      "io.netty.util.internal.ObjectUtil",
      "io.netty.channel.DefaultChannelPromise",
      "io.netty.channel.ChannelDuplexHandler",
      "org.testng.annotations.ITestOrConfiguration",
      "io.netty.channel.DefaultChannelId",
      "org.testng.IClass",
      "org.testng.xml.XmlRun",
      "io.netty.util.concurrent.FutureListener",
      "org.springframework.web.bind.annotation.RequestMethod",
      "io.netty.util.internal.logging.InternalLogLevel",
      "org.testng.IDynamicGraph$Status",
      "org.testng.xml.XmlGroups",
      "io.netty.channel.ChannelOutboundBuffer",
      "io.netty.util.concurrent.DefaultPromise",
      "com.ibm.watson.data.client.model.Connection",
      "io.netty.channel.epoll.EpollDomainSocketChannelConfig",
      "io.netty.channel.ChannelOutboundInvoker",
      "io.netty.channel.CombinedChannelDuplexHandler$1",
      "org.testng.internal.annotations.IAnnotationFinder",
      "io.netty.channel.DefaultChannelPipeline",
      "org.testng.junit.JUnit3TestClass",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup",
      "io.netty.channel.socket.SocketChannelConfig",
      "org.testng.internal.annotations.ConfigurationAnnotation",
      "org.testng.internal.annotations.IBeforeMethod",
      "io.netty.channel.epoll.EpollServerSocketChannelConfig",
      "org.testng.log4testng.Logger",
      "io.netty.util.DefaultAttributeMap$DefaultAttribute",
      "io.netty.util.AbstractReferenceCounted",
      "io.netty.channel.epoll.EpollSocketChannelConfig",
      "org.testng.TestNGException",
      "io.netty.util.concurrent.ImmediateEventExecutor$ImmediateProgressivePromise",
      "org.testng.ITestListener",
      "io.netty.buffer.ByteBuf",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.channel.socket.DatagramChannelConfig",
      "io.netty.util.DefaultAttributeMap",
      "io.netty.util.concurrent.FastThreadLocal",
      "io.netty.util.concurrent.EventExecutorChooserFactory$EventExecutorChooser",
      "org.testng.collections.ListMultiMap",
      "io.netty.channel.socket.DuplexChannel",
      "org.testng.ISuite",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory$GenericEventExecutorChooser",
      "io.netty.util.internal.OutOfDirectMemoryError",
      "org.testng.internal.annotations.IBeforeClass",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$2",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$1",
      "io.netty.util.internal.IntegerHolder",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.SpscLinkedAtomicQueue",
      "org.testng.internal.annotations.IAfterMethod",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceFdTask",
      "org.testng.internal.DynamicGraph",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor$NonNotifyRunnable",
      "io.netty.util.NetUtil",
      "io.netty.util.concurrent.PromiseTask$SentinelRunnable",
      "io.netty.util.concurrent.EventExecutorGroup",
      "io.netty.channel.ChannelInboundInvoker",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory",
      "io.netty.channel.ChannelFuture",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.channel.AbstractChannel$CloseFuture",
      "io.netty.util.concurrent.ThreadPerTaskExecutor",
      "com.google.inject.Injector",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL1Pad",
      "io.netty.channel.ChannelConfig",
      "com.fasterxml.jackson.annotation.JsonInclude",
      "io.netty.channel.ChannelHandler",
      "org.testng.collections.Sets",
      "io.netty.util.concurrent.FailedFuture"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(LocalRepositoryConfig_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.ibm.watson.data.client.model.LocalRepositoryConfig",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "org.springframework.web.bind.annotation.RequestMethod",
      "org.springframework.context.annotation.ScopedProxyMode",
      "com.ibm.watson.data.client.model.TypeDefSummary",
      "com.ibm.watson.data.client.model.BaseEntity",
      "com.ibm.watson.data.client.model.Connection",
      "io.netty.channel.ChannelHandlerAdapter",
      "io.netty.channel.ChannelOutboundHandlerAdapter",
      "com.ibm.watson.data.client.model.ConnectorType",
      "io.netty.channel.ChannelInboundHandlerAdapter",
      "io.netty.channel.ChannelDuplexHandler",
      "io.netty.handler.logging.LoggingHandler",
      "io.netty.util.internal.ObjectUtil",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.internal.logging.LocationAwareSlf4JLogger",
      "org.testng.xml.XmlSuite$ParallelMode",
      "org.testng.xml.XmlSuite$FailurePolicy",
      "org.testng.xml.XmlSuite",
      "org.testng.collections.Lists",
      "org.testng.collections.Maps",
      "com.ibm.watson.data.client.model.Classification",
      "io.netty.util.DefaultAttributeMap",
      "io.netty.channel.AbstractChannel",
      "io.netty.util.internal.ThrowableUtil",
      "io.netty.channel.ChannelMetadata",
      "io.netty.channel.epoll.AbstractEpollChannel",
      "io.netty.channel.epoll.AbstractEpollServerChannel",
      "io.netty.channel.epoll.EpollServerSocketChannel",
      "io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods",
      "io.netty.channel.unix.Errors",
      "io.netty.channel.unix.FileDescriptor",
      "com.ibm.watson.data.client.model.Endpoint",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor",
      "io.netty.util.concurrent.DefaultThreadFactory",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.util.internal.SystemPropertyUtil$1",
      "io.netty.util.internal.StringUtil",
      "io.netty.util.concurrent.AbstractEventExecutor",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$1",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$2",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor",
      "io.netty.util.concurrent.AbstractFuture",
      "io.netty.util.concurrent.DefaultPromise$CauseHolder",
      "io.netty.util.concurrent.DefaultPromise$StacklessCancellationException",
      "io.netty.util.concurrent.DefaultPromise",
      "io.netty.util.concurrent.PromiseTask$SentinelRunnable",
      "io.netty.util.concurrent.PromiseTask",
      "io.netty.util.concurrent.ScheduledFutureTask",
      "io.netty.util.concurrent.GlobalEventExecutor$1",
      "io.netty.util.concurrent.GlobalEventExecutor$TaskRunner",
      "io.netty.util.concurrent.CompleteFuture",
      "io.netty.util.concurrent.FailedFuture",
      "io.netty.util.internal.DefaultPriorityQueue",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "io.netty.util.internal.InternalThreadLocalMap",
      "io.netty.util.concurrent.FastThreadLocal",
      "io.netty.util.internal.ThreadExecutorMap",
      "io.netty.util.internal.ThreadExecutorMap$3",
      "io.netty.util.concurrent.GlobalEventExecutor",
      "io.netty.util.concurrent.AbstractEventExecutorGroup",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup",
      "io.netty.util.concurrent.DefaultEventExecutorGroup",
      "io.netty.util.concurrent.SingleThreadEventExecutor$1",
      "io.netty.util.concurrent.SingleThreadEventExecutor",
      "io.netty.util.concurrent.RejectedExecutionHandlers$1",
      "io.netty.util.concurrent.RejectedExecutionHandlers",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory",
      "io.netty.util.concurrent.ThreadPerTaskExecutor",
      "io.netty.util.concurrent.DefaultEventExecutor",
      "io.netty.util.internal.ThreadExecutorMap$1",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory$GenericEventExecutorChooser",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup$1",
      "io.netty.util.concurrent.NonStickyEventExecutorGroup",
      "com.ibm.watson.data.client.model.Meaning",
      "com.ibm.watson.data.client.model.ElementType",
      "io.netty.channel.SingleThreadEventLoop",
      "io.netty.channel.DefaultEventLoop",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor$RunnableScheduledFutureTask",
      "io.netty.util.concurrent.FastThreadLocalRunnable",
      "io.netty.util.concurrent.FastThreadLocalThread",
      "io.netty.channel.local.LocalChannel",
      "io.netty.channel.VoidChannelPromise",
      "io.netty.channel.DefaultChannelPromise",
      "io.netty.channel.AbstractChannel$CloseFuture",
      "io.netty.util.internal.PlatformDependent0$1",
      "io.netty.util.internal.ReflectionUtil",
      "io.netty.util.internal.PlatformDependent0$2",
      "io.netty.util.internal.PlatformDependent0$3",
      "io.netty.util.internal.PlatformDependent0$4",
      "io.netty.util.internal.PlatformDependent0$5",
      "io.netty.util.internal.PlatformDependent0$10",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.util.internal.PlatformDependent$1",
      "io.netty.util.internal.PlatformDependent$2",
      "io.netty.util.internal.CleanerJava6$1",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.util.internal.PlatformDependent$4",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.util.internal.PlatformDependent0$8",
      "io.netty.util.internal.EmptyArrays",
      "io.netty.util.internal.MacAddressUtil",
      "io.netty.util.NetUtilInitializations",
      "io.netty.util.NetUtil",
      "io.netty.channel.DefaultChannelId",
      "org.mockserver.scheduler.Scheduler$SchedulerThreadFactory",
      "io.netty.channel.AbstractServerChannel",
      "io.netty.channel.local.LocalServerChannel",
      "io.netty.channel.epoll.EpollDatagramChannel",
      "org.testng.internal.annotations.BaseAnnotation",
      "org.testng.internal.annotations.TestOrConfiguration",
      "org.testng.internal.annotations.ConfigurationAnnotation",
      "org.testng.internal.ClonedMethod",
      "org.testng.xml.XmlTest",
      "org.testng.xml.XmlClass",
      "org.testng.internal.ClassHelper",
      "org.testng.internal.RuntimeBehavior",
      "org.testng.log4testng.Logger",
      "org.testng.internal.Utils",
      "org.testng.TestRunner",
      "org.testng.TestNGException",
      "io.netty.util.concurrent.ImmediateEventExecutor$1",
      "io.netty.util.concurrent.ImmediateEventExecutor$2",
      "io.netty.util.concurrent.ImmediateEventExecutor",
      "io.netty.util.internal.logging.AbstractInternalLogger$1",
      "io.netty.channel.epoll.AbstractEpollStreamChannel",
      "io.netty.channel.epoll.EpollDomainSocketChannel",
      "org.testng.xml.XmlRun",
      "io.netty.channel.epoll.EpollSocketChannel",
      "io.netty.util.concurrent.DefaultProgressivePromise",
      "io.netty.util.concurrent.ImmediateEventExecutor$ImmediatePromise",
      "org.testng.junit.JUnitTestClass",
      "org.testng.junit.JUnit3TestClass",
      "io.netty.util.concurrent.SingleThreadEventExecutor$4",
      "io.netty.util.internal.ThreadExecutorMap$2",
      "io.netty.channel.CombinedChannelDuplexHandler",
      "org.testng.internal.DynamicGraph",
      "org.testng.collections.Sets",
      "org.testng.internal.DynamicGraph$Edges",
      "org.testng.xml.XmlDependencies",
      "org.testng.xml.XmlDefine",
      "io.netty.util.NettyRuntime$AvailableProcessorsHolder",
      "io.netty.util.NettyRuntime",
      "io.netty.channel.MultithreadEventLoopGroup",
      "io.netty.channel.DefaultEventLoopGroup",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory$PowerOfTwoEventExecutorChooser",
      "org.hsqldb.jdbc.JDBCDriver"
    );
  }
}
