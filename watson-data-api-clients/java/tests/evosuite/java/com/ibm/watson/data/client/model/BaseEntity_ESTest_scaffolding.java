/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 14 15:01:09 GMT 2021
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
public class BaseEntity_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.ibm.watson.data.client.model.BaseEntity"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BaseEntity_ESTest_scaffolding.class.getClassLoader() ,
      "io.netty.util.AttributeKey",
      "io.netty.util.internal.SystemPropertyUtil$1",
      "io.netty.channel.unix.DomainSocketChannelConfig",
      "com.fasterxml.jackson.annotation.JsonProperty",
      "io.netty.channel.unix.Errors$NativeIoException",
      "io.netty.util.AttributeMap",
      "org.testng.annotations.IConfigurationAnnotation",
      "io.netty.channel.epoll.EpollDomainSocketChannel$EpollDomainUnsafe",
      "io.netty.util.internal.logging.LocationAwareSlf4JLogger",
      "org.testng.xml.XmlScript",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "com.ibm.watson.data.client.model.enums.ElementOrigin",
      "io.netty.channel.unix.DomainSocketAddress",
      "org.testng.IAnnotationTransformer",
      "org.testng.IConfigurationListener",
      "io.netty.channel.unix.Errors$NativeConnectException",
      "org.testng.xml.XmlTest",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "org.testng.annotations.IAnnotation",
      "org.testng.xml.XmlDependencies",
      "org.testng.xml.XmlSuite",
      "org.testng.SuiteRunState",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "org.testng.xml.XmlSuite$FailurePolicy",
      "org.testng.ITestNGListener",
      "io.netty.channel.ChannelOutboundBuffer$MessageProcessor",
      "org.testng.IAttributes",
      "io.netty.channel.ChannelPipeline",
      "org.testng.internal.RuntimeBehavior",
      "io.netty.channel.ChannelException",
      "org.testng.ITestNGMethod",
      "org.testng.xml.XmlSuite$ParallelMode",
      "org.testng.collections.SetMultiMap",
      "org.testng.thread.IThreadWorkerFactory",
      "io.netty.util.internal.logging.InternalLogger",
      "io.netty.util.concurrent.ProgressivePromise",
      "org.testng.internal.ConstructorOrMethod",
      "org.testng.collections.Maps",
      "io.netty.util.concurrent.EventExecutor",
      "io.netty.util.Constant",
      "com.ibm.watson.data.client.model.Classification",
      "io.netty.util.concurrent.ProgressiveFuture",
      "io.netty.channel.unix.Errors",
      "io.netty.channel.AbstractChannel",
      "io.netty.util.internal.StringUtil",
      "org.testng.collections.MultiMap",
      "com.ibm.watson.data.client.model.BaseEntity",
      "io.netty.channel.unix.DomainSocketChannel",
      "io.netty.channel.epoll.AbstractEpollChannel",
      "org.testng.IHookable",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "org.testng.TestNG",
      "io.netty.util.internal.ThrowableUtil",
      "io.netty.channel.ChannelMetadata",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "io.netty.channel.ChannelFlushPromiseNotifier$FlushCheckpoint",
      "io.netty.util.Attribute",
      "io.netty.util.concurrent.AbstractFuture",
      "org.testng.ITestObjectFactory",
      "io.netty.util.concurrent.Promise",
      "org.testng.internal.SuiteRunnerMap",
      "org.testng.annotations.IDataProviderAnnotation",
      "org.testng.xml.IPostProcessor",
      "io.netty.util.ReferenceCounted",
      "io.netty.channel.unix.FileDescriptor",
      "org.testng.annotations.ITestAnnotation",
      "com.fasterxml.jackson.annotation.JacksonAnnotationValue",
      "io.netty.channel.Channel",
      "org.testng.internal.OverrideProcessor",
      "org.testng.IDynamicGraph",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.concurrent.Future",
      "org.testng.IObjectFactory",
      "org.testng.xml.XmlClass",
      "org.testng.collections.Lists",
      "com.beust.jcommander.ParameterException",
      "org.testng.internal.annotations.IDataProvidable",
      "org.testng.annotations.IFactoryAnnotation",
      "io.netty.buffer.ByteBufAllocator",
      "io.netty.channel.DefaultChannelConfig",
      "org.testng.IObjectFactory2",
      "io.netty.channel.ChannelId",
      "com.ibm.watson.data.client.model.ElementType",
      "io.netty.channel.epoll.AbstractEpollStreamChannel",
      "io.netty.util.AbstractConstant",
      "com.fasterxml.jackson.annotation.JacksonAnnotation",
      "org.testng.annotations.IParameterizable",
      "io.netty.channel.unix.Socket",
      "org.testng.IInvokedMethodListener",
      "com.fasterxml.jackson.annotation.JsonInclude$Value",
      "io.netty.channel.ChannelProgressiveFuture",
      "org.testng.IInjectorFactory",
      "io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe",
      "io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods",
      "org.testng.util.Strings",
      "io.netty.channel.ChannelPromise",
      "org.testng.xml.XmlDefine",
      "io.netty.handler.logging.ByteBufFormat",
      "org.testng.xml.XmlMethodSelectors",
      "io.netty.util.concurrent.OrderedEventExecutor",
      "io.netty.util.internal.ObjectUtil",
      "org.testng.CommandLineArgs",
      "io.netty.channel.epoll.EpollDomainSocketChannel",
      "io.netty.channel.DefaultChannelPromise",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceInChannelTask",
      "org.testng.annotations.ITestOrConfiguration",
      "org.testng.xml.XmlRun",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceInTask",
      "org.testng.IDynamicGraph$Status",
      "org.springframework.web.bind.annotation.RequestMethod",
      "io.netty.util.internal.logging.InternalLogLevel",
      "org.testng.xml.XmlGroups",
      "io.netty.channel.AbstractChannel$AbstractUnsafe",
      "io.netty.channel.EventLoop",
      "io.netty.channel.epoll.EpollChannelConfig",
      "io.netty.channel.ChannelOutboundBuffer",
      "io.netty.util.concurrent.DefaultPromise",
      "io.netty.channel.unix.PeerCredentials",
      "io.netty.channel.DefaultFileRegion",
      "io.netty.channel.epoll.EpollDomainSocketChannelConfig",
      "io.netty.channel.ChannelOutboundInvoker",
      "com.ibm.watson.data.client.model.Meaning",
      "org.testng.internal.annotations.IAnnotationFinder",
      "io.netty.channel.DefaultChannelPipeline",
      "org.testng.IMethodInterceptor",
      "org.testng.SuiteRunner",
      "org.testng.log4testng.Logger",
      "io.netty.util.DefaultAttributeMap$DefaultAttribute",
      "io.netty.util.AbstractReferenceCounted",
      "org.testng.xml.XmlMethodSelector",
      "org.testng.IExecutionListener",
      "io.netty.channel.epoll.LinuxSocket",
      "org.testng.TestNGException",
      "io.netty.channel.unix.UnixChannel",
      "org.testng.ITestListener",
      "org.testng.IConfigurable",
      "io.netty.buffer.ByteBuf",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.util.DefaultAttributeMap",
      "io.netty.channel.socket.DuplexChannel",
      "io.netty.channel.ChannelFutureListener",
      "org.testng.collections.ListMultiMap",
      "org.testng.ISuite",
      "org.testng.internal.IConfiguration",
      "org.testng.thread.IExecutorFactory",
      "org.testng.internal.ReporterConfig",
      "io.netty.channel.FileRegion",
      "io.netty.channel.unix.IovArray",
      "io.netty.channel.ChannelProgressivePromise",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceFdTask",
      "io.netty.channel.EventLoopGroup",
      "org.testng.annotations.IListenersAnnotation",
      "com.beust.jcommander.JCommander",
      "org.springframework.context.annotation.ScopedProxyMode",
      "io.netty.util.concurrent.GenericFutureListener",
      "org.testng.ITestRunnerFactory",
      "io.netty.util.concurrent.EventExecutorGroup",
      "io.netty.channel.ChannelInboundInvoker",
      "io.netty.channel.Channel$Unsafe",
      "io.netty.channel.ChannelFuture",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.channel.VoidChannelPromise",
      "io.netty.channel.AbstractChannel$CloseFuture",
      "com.google.inject.Injector",
      "io.netty.channel.ChannelConfig",
      "com.fasterxml.jackson.annotation.JsonCreator",
      "com.fasterxml.jackson.annotation.JsonInclude"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BaseEntity_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.ibm.watson.data.client.model.BaseEntity",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "org.springframework.web.bind.annotation.RequestMethod",
      "org.springframework.context.annotation.ScopedProxyMode",
      "com.ibm.watson.data.client.model.Classification",
      "com.ibm.watson.data.client.model.ElementType",
      "org.testng.xml.XmlSuite$ParallelMode",
      "org.testng.xml.XmlSuite$FailurePolicy",
      "org.testng.xml.XmlSuite",
      "org.testng.collections.Lists",
      "org.testng.collections.Maps",
      "org.testng.util.Strings",
      "org.testng.internal.RuntimeBehavior",
      "org.testng.log4testng.Logger",
      "org.testng.TestNG",
      "io.netty.util.DefaultAttributeMap",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.internal.logging.LocationAwareSlf4JLogger",
      "io.netty.util.internal.ObjectUtil",
      "io.netty.channel.AbstractChannel",
      "io.netty.util.internal.ThrowableUtil",
      "io.netty.channel.ChannelMetadata",
      "io.netty.channel.epoll.AbstractEpollChannel",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.util.internal.SystemPropertyUtil$1",
      "io.netty.util.internal.StringUtil",
      "io.netty.channel.epoll.AbstractEpollStreamChannel",
      "io.netty.channel.epoll.EpollDomainSocketChannel",
      "io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods",
      "io.netty.channel.unix.Errors",
      "io.netty.channel.unix.FileDescriptor",
      "com.ibm.watson.data.client.model.Meaning",
      "io.netty.channel.ChannelHandlerAdapter",
      "io.netty.channel.ChannelInboundHandlerAdapter",
      "io.netty.channel.ChannelDuplexHandler",
      "io.netty.handler.logging.LoggingHandler",
      "org.testng.xml.XmlClass",
      "org.testng.internal.ClassHelper",
      "org.testng.internal.Utils",
      "org.testng.TestRunner",
      "org.testng.TestNGException",
      "org.testng.junit.JUnitTestClass",
      "org.testng.junit.JUnit4TestClass",
      "org.testng.internal.NoOpTestClass",
      "org.testng.xml.XmlDependencies",
      "io.netty.channel.embedded.EmbeddedSocketAddress",
      "io.netty.channel.embedded.EmbeddedChannel",
      "io.netty.util.concurrent.AbstractFuture",
      "io.netty.channel.VoidChannelPromise",
      "io.netty.util.concurrent.DefaultPromise$CauseHolder",
      "io.netty.util.concurrent.DefaultPromise$StacklessCancellationException",
      "io.netty.util.concurrent.DefaultPromise",
      "io.netty.channel.DefaultChannelPromise",
      "io.netty.channel.AbstractChannel$CloseFuture",
      "io.netty.channel.AbstractChannel$AbstractUnsafe",
      "io.netty.channel.embedded.EmbeddedChannel$EmbeddedUnsafe",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "io.netty.util.internal.InternalThreadLocalMap",
      "io.netty.util.concurrent.FastThreadLocal",
      "io.netty.channel.ChannelOutboundBuffer$1",
      "io.netty.channel.ChannelOutboundBuffer",
      "io.netty.channel.embedded.EmbeddedChannel$EmbeddedUnsafe$1",
      "io.netty.channel.DefaultChannelPipeline$1",
      "io.netty.channel.DefaultChannelPipeline",
      "io.netty.channel.embedded.EmbeddedChannel$EmbeddedChannelPipeline",
      "io.netty.util.ResourceLeakDetector$Level",
      "io.netty.util.internal.EmptyArrays",
      "io.netty.util.ResourceLeakDetector",
      "io.netty.util.concurrent.CompleteFuture",
      "io.netty.channel.CompleteChannelFuture",
      "io.netty.channel.SucceededChannelFuture",
      "io.netty.channel.VoidChannelPromise$1",
      "io.netty.channel.AbstractChannelHandlerContext",
      "io.netty.channel.DefaultChannelPipeline$TailContext",
      "io.netty.channel.ChannelHandlerMask$1",
      "io.netty.channel.ChannelHandlerMask",
      "io.netty.channel.ChannelHandlerMask$2",
      "io.netty.channel.DefaultChannelPipeline$HeadContext",
      "io.netty.util.concurrent.AbstractEventExecutor",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$1",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$2",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor",
      "io.netty.channel.embedded.EmbeddedEventLoop",
      "io.netty.channel.embedded.EmbeddedChannel$1",
      "io.netty.channel.DefaultMessageSizeEstimator$HandleImpl",
      "io.netty.channel.DefaultMessageSizeEstimator",
      "io.netty.channel.DefaultChannelConfig",
      "io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator",
      "io.netty.channel.AdaptiveRecvByteBufAllocator",
      "io.netty.buffer.ByteBufUtil$1",
      "io.netty.util.CharsetUtil",
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
      "io.netty.buffer.AbstractByteBufAllocator",
      "io.netty.util.NettyRuntime$AvailableProcessorsHolder",
      "io.netty.util.NettyRuntime",
      "io.netty.buffer.ByteBuf",
      "io.netty.buffer.EmptyByteBuf",
      "io.netty.buffer.PooledByteBufAllocator$1",
      "io.netty.buffer.PooledByteBufAllocator$PoolThreadLocalCache",
      "io.netty.buffer.SizeClasses",
      "io.netty.buffer.PoolArena",
      "io.netty.buffer.PoolArena$DirectArena",
      "io.netty.buffer.PoolThreadCache",
      "io.netty.util.internal.LongAdderCounter",
      "io.netty.buffer.PoolSubpage",
      "io.netty.buffer.PoolChunkList",
      "io.netty.buffer.PooledByteBufAllocatorMetric",
      "io.netty.buffer.PooledByteBufAllocator",
      "io.netty.buffer.ByteBufUtil$2",
      "io.netty.buffer.ByteBufUtil",
      "io.netty.buffer.ByteBufAllocator",
      "io.netty.channel.WriteBufferWaterMark",
      "io.netty.channel.ChannelInitializer",
      "io.netty.channel.embedded.EmbeddedChannel$2",
      "io.netty.channel.DefaultChannelHandlerContext",
      "io.netty.channel.DefaultChannelPipeline$PendingHandlerCallback",
      "io.netty.channel.DefaultChannelPipeline$PendingHandlerAddedTask",
      "org.testng.junit.JUnit3TestClass",
      "org.testng.xml.XmlTest",
      "org.testng.internal.WrappedTestNGMethod",
      "io.netty.util.concurrent.SingleThreadEventExecutor$1",
      "io.netty.util.concurrent.SingleThreadEventExecutor",
      "io.netty.util.concurrent.DefaultEventExecutor",
      "io.netty.util.concurrent.DefaultThreadFactory",
      "io.netty.util.concurrent.ThreadPerTaskExecutor",
      "io.netty.util.concurrent.RejectedExecutionHandlers$1",
      "io.netty.util.concurrent.RejectedExecutionHandlers",
      "io.netty.util.concurrent.PromiseTask$SentinelRunnable",
      "io.netty.util.concurrent.PromiseTask",
      "io.netty.util.concurrent.ScheduledFutureTask",
      "io.netty.util.concurrent.GlobalEventExecutor$1",
      "io.netty.util.concurrent.GlobalEventExecutor$TaskRunner",
      "io.netty.util.concurrent.FailedFuture",
      "io.netty.util.internal.DefaultPriorityQueue",
      "io.netty.util.internal.ThreadExecutorMap",
      "io.netty.util.internal.ThreadExecutorMap$3",
      "io.netty.util.concurrent.GlobalEventExecutor",
      "io.netty.util.internal.ThreadExecutorMap$1",
      "io.netty.util.concurrent.SingleThreadEventExecutor$4",
      "io.netty.util.internal.ThreadExecutorMap$2",
      "io.netty.util.concurrent.FastThreadLocalRunnable",
      "io.netty.util.concurrent.FastThreadLocalThread",
      "org.testng.internal.annotations.BaseAnnotation",
      "org.testng.internal.annotations.TestOrConfiguration",
      "org.testng.internal.annotations.ConfigurationAnnotation",
      "org.testng.internal.ClonedMethod",
      "org.testng.xml.XmlDefine",
      "io.netty.util.concurrent.ImmediateEventExecutor$1",
      "io.netty.util.concurrent.ImmediateEventExecutor$2",
      "io.netty.util.concurrent.ImmediateEventExecutor",
      "io.netty.channel.embedded.EmbeddedChannelId",
      "io.netty.channel.embedded.EmbeddedChannel$State",
      "io.netty.util.internal.logging.AbstractInternalLogger$1",
      "org.mockserver.scheduler.Scheduler$SchedulerThreadFactory",
      "org.springframework.http.server.reactive.ServerHttpResponseDecorator",
      "org.springframework.util.Assert",
      "org.springframework.http.server.reactive.HttpHeadResponseDecorator",
      "org.testng.xml.XmlRun",
      "org.testng.reporters.RuntimeBehavior",
      "org.testng.reporters.XMLStringBuffer",
      "org.testng.reporters.Buffer",
      "org.testng.reporters.FileStringBuffer",
      "org.testng.collections.CollectionUtils",
      "org.testng.internal.annotations.IgnoreListener",
      "org.testng.internal.annotations.DefaultAnnotationTransformer",
      "org.testng.internal.annotations.JDK15AnnotationFinder",
      "org.testng.internal.annotations.JDK15TagFactory",
      "org.testng.internal.BaseTestMethod",
      "org.testng.internal.TestNGMethod",
      "org.testng.xml.XmlPackage",
      "org.testng.internal.ConstructorOrMethod",
      "org.testng.internal.ConfigurationMethod",
      "io.netty.util.internal.PlatformDependent0$8",
      "io.netty.util.internal.MacAddressUtil",
      "io.netty.util.NetUtilInitializations",
      "io.netty.util.NetUtil",
      "io.netty.channel.DefaultChannelId",
      "io.netty.channel.local.LocalChannel",
      "io.netty.util.concurrent.DefaultProgressivePromise",
      "io.netty.channel.DefaultChannelProgressivePromise",
      "io.netty.util.concurrent.AbstractEventExecutorGroup",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup",
      "io.netty.channel.MultithreadEventLoopGroup",
      "io.netty.channel.DefaultEventLoopGroup",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory",
      "io.netty.util.concurrent.SucceededFuture",
      "io.netty.channel.epoll.AbstractEpollServerChannel",
      "io.netty.channel.epoll.EpollServerSocketChannel",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor",
      "io.netty.channel.epoll.EpollSocketChannel",
      "io.netty.util.concurrent.ImmediateEventExecutor$ImmediateProgressivePromise",
      "io.netty.channel.AbstractServerChannel",
      "io.netty.channel.local.LocalServerChannel",
      "org.testng.junit.JUnitTestMethod",
      "org.testng.junit.JUnit3TestMethod",
      "io.netty.util.concurrent.NonStickyEventExecutorGroup",
      "io.netty.util.concurrent.PromiseTask$RunnableAdapter",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor$NonNotifyRunnable",
      "io.netty.channel.DelegatingChannelPromiseNotifier",
      "io.netty.channel.ReflectiveChannelFactory",
      "io.netty.channel.ChannelException",
      "org.testng.internal.DynamicGraph",
      "org.testng.collections.Sets",
      "org.testng.internal.DynamicGraph$Edges",
      "org.testng.internal.DynamicGraph$1",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor$RunnableScheduledFutureTask",
      "org.testng.junit.JUnit4TestMethod",
      "org.testng.junit.JUnit4SpockMethod",
      "org.testng.junit.JUnit4ConfigurationMethod",
      "io.netty.channel.SingleThreadEventLoop",
      "io.netty.channel.DefaultEventLoop",
      "io.netty.channel.epoll.EpollDatagramChannel",
      "io.netty.util.concurrent.DefaultEventExecutorGroup",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory$GenericEventExecutorChooser",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup$1",
      "io.netty.channel.epoll.EpollServerDomainSocketChannel",
      "org.testng.internal.Configuration",
      "org.testng.internal.thread.DefaultThreadPoolExecutorFactory",
      "org.testng.internal.GuiceBackedInjectorFactory",
      "org.testng.SuiteRunner",
      "org.testng.DataProviderHolder",
      "org.testng.TestListenerAdapter",
      "org.testng.SuiteRunState",
      "org.testng.internal.Attributes",
      "org.testng.SuiteRunner$ProxyTestRunnerFactory",
      "org.testng.reporters.TextReporter",
      "org.hsqldb.jdbc.JDBCDriver",
      "org.testng.xml.XmlWeaver",
      "org.testng.xml.DefaultXmlWeaver",
      "org.testng.xml.XmlUtils",
      "org.testng.reporters.XMLUtils",
      "org.testng.reporters.Tag",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory$PowerOfTwoEventExecutorChooser",
      "io.netty.util.concurrent.ImmediateEventExecutor$ImmediatePromise",
      "io.netty.handler.logging.ByteBufFormat"
    );
  }
}
