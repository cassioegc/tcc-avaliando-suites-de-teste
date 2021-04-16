/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 14 22:12:18 GMT 2021
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
public class ListTrashResponse_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.ibm.watson.data.client.model.ListTrashResponse"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ListTrashResponse_ESTest_scaffolding.class.getClassLoader() ,
      "com.fasterxml.jackson.annotation.JsonProperty",
      "io.netty.util.internal.SystemPropertyUtil$1",
      "io.netty.channel.AbstractChannel$AnnotatedNoRouteToHostException",
      "io.netty.util.AttributeMap",
      "io.netty.util.internal.Cleaner",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL1Pad",
      "io.netty.util.concurrent.ScheduledFuture",
      "io.netty.util.internal.logging.LocationAwareSlf4JLogger",
      "io.netty.util.internal.PlatformDependent0",
      "org.testng.xml.XmlScript",
      "io.netty.util.internal.ReflectionUtil",
      "io.netty.channel.socket.DatagramChannel",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup$1",
      "io.netty.channel.unix.Errors$NativeConnectException",
      "io.netty.util.concurrent.FastThreadLocalThread",
      "org.testng.IConfigurationListener",
      "io.netty.util.concurrent.AbstractEventExecutorGroup",
      "io.netty.util.internal.ThreadLocalRandom",
      "io.netty.util.internal.ThreadExecutorMap",
      "org.testng.internal.annotations.IgnoreListener",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue",
      "io.netty.channel.ChannelOutboundHandlerAdapter",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue",
      "org.testng.annotations.IAnnotation",
      "io.netty.util.internal.PlatformDependent0$3",
      "org.testng.xml.XmlSuite$FailurePolicy",
      "io.netty.channel.ChannelOutboundBuffer$MessageProcessor",
      "io.netty.util.internal.PlatformDependent0$4",
      "io.netty.util.internal.PlatformDependent0$5",
      "org.testng.IAttributes",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef",
      "io.netty.util.internal.PlatformDependent0$1",
      "io.netty.util.internal.PlatformDependent0$2",
      "org.testng.ITestNGMethod",
      "org.testng.internal.RuntimeBehavior",
      "io.netty.util.internal.PlatformDependent0$8",
      "org.testng.collections.SetMultiMap",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor",
      "io.netty.util.internal.logging.InternalLogger",
      "org.testng.thread.IThreadWorkerFactory",
      "io.netty.util.concurrent.NonStickyEventExecutorGroup$NonStickyOrderedEventExecutor",
      "reactor.core.CorePublisher",
      "org.testng.TestRunner",
      "org.testng.collections.Maps",
      "io.netty.util.concurrent.EventExecutor",
      "io.netty.util.internal.PlatformDependent$1",
      "io.netty.util.internal.PlatformDependent$2",
      "io.netty.util.internal.PlatformDependent$4",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueProducerNodeRef",
      "com.ibm.watson.data.client.model.MetadataRov",
      "io.netty.util.concurrent.EventExecutorChooserFactory",
      "io.netty.util.internal.LongCounter",
      "io.netty.util.internal.StringUtil",
      "org.testng.collections.MultiMap",
      "org.testng.ITestResult",
      "org.springframework.http.ReactiveHttpOutputMessage",
      "com.ibm.watson.data.client.model.AttachmentHeader",
      "org.testng.IHookable",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "org.mockserver.scheduler.Scheduler",
      "io.netty.util.concurrent.ImmediateEventExecutor",
      "org.testng.TestNG",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueConsumerIndexField",
      "org.testng.IInvokedMethod",
      "io.netty.channel.ChannelMetadata",
      "io.netty.util.internal.ThrowableUtil",
      "io.netty.channel.ChannelFlushPromiseNotifier$FlushCheckpoint",
      "org.testng.ISuiteListener",
      "io.netty.util.Attribute",
      "io.netty.util.concurrent.GlobalEventExecutor$TaskRunner",
      "io.netty.util.concurrent.AbstractFuture",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL2Pad",
      "io.netty.channel.ChannelOutboundHandler",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "org.testng.internal.annotations.JDK15AnnotationFinder",
      "io.netty.util.ReferenceCounted",
      "org.testng.internal.ITestResultNotifier",
      "com.ibm.watson.data.client.model.SourceAsset",
      "org.testng.internal.Utils",
      "io.netty.util.concurrent.DefaultFutureListeners",
      "io.netty.util.concurrent.SingleThreadEventExecutor$4",
      "io.netty.util.concurrent.DefaultEventExecutor",
      "org.springframework.http.HttpStatus",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueConsumerIndexField",
      "org.testng.internal.OverrideProcessor",
      "io.netty.util.concurrent.SingleThreadEventExecutor$1",
      "org.springframework.core.io.buffer.DataBufferFactory",
      "org.testng.internal.Configuration",
      "org.mockserver.scheduler.Scheduler$SchedulerThreadFactory",
      "io.netty.util.concurrent.Future",
      "io.netty.channel.epoll.EpollDatagramChannelConfig",
      "org.testng.TestListenerAdapter",
      "io.netty.channel.epoll.EpollDatagramChannel$EpollDatagramChannelUnsafe",
      "org.testng.xml.XmlClass",
      "org.testng.collections.Lists",
      "com.beust.jcommander.ParameterException",
      "io.netty.util.concurrent.DefaultThreadFactory",
      "org.testng.internal.annotations.IDataProvidable",
      "io.netty.channel.MultithreadEventLoopGroup",
      "io.netty.buffer.ByteBufAllocator",
      "io.netty.channel.ChannelId",
      "com.fasterxml.jackson.annotation.JacksonAnnotation",
      "io.netty.util.AbstractConstant",
      "io.netty.util.concurrent.GlobalEventExecutor",
      "io.netty.channel.unix.Socket",
      "org.testng.IInvokedMethodListener",
      "org.springframework.http.HttpCookie",
      "io.netty.channel.ChannelProgressiveFuture",
      "org.testng.IInjectorFactory",
      "io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods",
      "io.netty.util.internal.DefaultPriorityQueue",
      "io.netty.util.NettyRuntime$AvailableProcessorsHolder",
      "io.netty.util.internal.PlatformDependent",
      "org.testng.util.Strings",
      "org.testng.thread.ITestNGThreadPoolExecutor",
      "org.testng.IDataProviderInterceptor",
      "io.netty.util.concurrent.OrderedEventExecutor",
      "org.testng.xml.XmlMethodSelectors",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor",
      "org.springframework.http.server.reactive.ServerHttpResponseDecorator",
      "io.netty.util.internal.ThreadExecutorMap$1",
      "io.netty.util.internal.ThreadExecutorMap$2",
      "org.springframework.http.HttpMessage",
      "io.netty.util.internal.ThreadExecutorMap$3",
      "org.testng.ITestContext",
      "io.netty.channel.ChannelHandlerAdapter",
      "org.springframework.http.HttpHeaders",
      "io.netty.channel.AbstractChannel$AbstractUnsafe",
      "io.netty.channel.EventLoop",
      "io.netty.util.internal.PriorityQueueNode",
      "io.netty.util.internal.MacAddressUtil",
      "io.netty.channel.epoll.EpollChannelConfig",
      "com.google.inject.Stage",
      "org.testng.internal.annotations.IAnnotationTransformer",
      "io.netty.util.internal.shaded.org.jctools.queues.SupportsIterator",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL3Pad",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad2",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad0",
      "io.netty.channel.DefaultFileRegion",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad1",
      "io.netty.channel.SingleThreadEventLoop",
      "org.testng.internal.annotations.DefaultAnnotationTransformer",
      "org.testng.IMethodInterceptor",
      "org.testng.SuiteRunner",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL3Pad",
      "com.ibm.watson.data.client.model.BaseRov",
      "io.netty.util.internal.PriorityQueue",
      "io.netty.util.internal.InternalThreadLocalMap",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueue",
      "io.netty.channel.epoll.LinuxSocket",
      "io.netty.util.concurrent.AbstractEventExecutor",
      "io.netty.channel.ChannelHandlerContext",
      "io.netty.channel.unix.UnixChannel",
      "org.testng.IConfigurable",
      "org.testng.IReporter",
      "io.netty.channel.ChannelFutureListener",
      "org.testng.internal.IConfiguration",
      "org.testng.thread.IExecutorFactory",
      "io.netty.util.concurrent.BlockingOperationException",
      "org.testng.internal.ReporterConfig",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerLimitField",
      "io.netty.channel.FileRegion",
      "io.netty.channel.ChannelProgressivePromise",
      "io.netty.util.concurrent.DefaultPromise$LeanCancellationException",
      "io.netty.channel.EventLoopGroup",
      "io.netty.channel.AbstractServerChannel$DefaultServerUnsafe",
      "org.springframework.context.annotation.ScopedProxyMode",
      "io.netty.util.concurrent.GenericFutureListener",
      "org.springframework.core.io.buffer.DataBuffer",
      "io.netty.channel.Channel$Unsafe",
      "io.netty.channel.VoidChannelPromise",
      "io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators",
      "io.netty.util.internal.CleanerJava6$1",
      "com.fasterxml.jackson.annotation.JsonCreator",
      "com.ibm.watson.data.client.model.AttachmentHandle",
      "io.netty.util.concurrent.GlobalEventExecutor$1",
      "org.springframework.util.Assert",
      "io.netty.util.AttributeKey",
      "io.netty.util.concurrent.ScheduledFutureTask",
      "io.netty.channel.unix.Errors$NativeIoException",
      "io.netty.util.concurrent.RejectedExecutionHandlers",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueConsumerNodeRef",
      "org.testng.internal.Utils$StackTraceType",
      "org.springframework.http.server.reactive.ServerHttpResponse",
      "io.netty.channel.local.LocalServerChannel",
      "org.testng.internal.collections.Pair",
      "io.netty.util.AsciiString",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "io.netty.channel.local.LocalAddress",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL2Pad",
      "org.testng.internal.TestResult",
      "org.testng.IAnnotationTransformer",
      "org.testng.xml.XmlTest",
      "io.netty.util.concurrent.RejectedExecutionHandler",
      "io.netty.util.concurrent.GenericProgressiveFutureListener",
      "io.netty.channel.local.LocalChannel$State",
      "org.testng.IDataProviderListener",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.channel.AbstractChannel$AnnotatedSocketException",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "org.testng.xml.XmlSuite",
      "org.testng.SuiteRunState",
      "io.netty.util.internal.shaded.org.jctools.queues.SpscLinkedQueue",
      "io.netty.util.NetUtilInitializations",
      "org.testng.ITestNGListener",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueMidPad",
      "io.netty.util.NettyRuntime",
      "io.netty.channel.ChannelPipeline",
      "io.netty.util.concurrent.DefaultPromise$CauseHolder",
      "org.testng.internal.GuiceBackedInjectorFactory",
      "io.netty.channel.ServerChannel",
      "io.netty.channel.ChannelException",
      "org.testng.SuiteRunner$ProxyTestRunnerFactory",
      "com.ibm.watson.data.client.model.CommitInfo",
      "org.testng.internal.thread.DefaultThreadPoolExecutorFactory",
      "org.testng.xml.XmlSuite$ParallelMode",
      "io.netty.util.concurrent.ProgressivePromise",
      "io.netty.util.internal.PlatformDependent0$10",
      "org.testng.internal.IResultListener2",
      "io.netty.util.concurrent.NonStickyEventExecutorGroup",
      "io.netty.util.concurrent.ThreadProperties",
      "org.testng.internal.ConstructorOrMethod",
      "io.netty.util.Constant",
      "org.testng.internal.Attributes",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad0",
      "io.netty.util.concurrent.RejectedExecutionHandlers$1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueue",
      "io.netty.channel.DefaultEventLoop",
      "io.netty.util.concurrent.CompleteFuture",
      "io.netty.util.concurrent.ProgressiveFuture",
      "io.netty.channel.unix.Errors",
      "io.netty.channel.AbstractChannel",
      "io.netty.util.concurrent.PromiseTask",
      "com.ibm.watson.data.client.model.Metadata",
      "io.netty.channel.AddressedEnvelope",
      "io.netty.channel.epoll.EpollDatagramChannel",
      "io.netty.channel.epoll.AbstractEpollChannel",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueMidPad",
      "io.netty.util.internal.EmptyArrays",
      "io.netty.util.concurrent.ImmediateEventExecutor$2",
      "io.netty.util.concurrent.ImmediateEventExecutor$1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad2",
      "io.netty.util.NetUtilInitializations$NetworkIfaceAndInetAddress",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "org.testng.ITestObjectFactory",
      "io.netty.util.concurrent.Promise",
      "org.testng.internal.SuiteRunnerMap",
      "io.netty.util.concurrent.SingleThreadEventExecutor",
      "io.netty.channel.DefaultEventLoopGroup",
      "org.reactivestreams.Publisher",
      "org.testng.xml.IPostProcessor",
      "com.ibm.watson.data.client.model.SourceSystem",
      "org.springframework.util.MultiValueMap",
      "reactor.core.publisher.Mono",
      "org.springframework.http.server.reactive.HttpHeadResponseDecorator",
      "com.fasterxml.jackson.annotation.JacksonAnnotationValue",
      "io.netty.channel.unix.FileDescriptor",
      "org.testng.annotations.ITestAnnotation",
      "com.ibm.watson.data.client.model.MetadataAsset",
      "io.netty.channel.AbstractChannel$AnnotatedConnectException",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueueL0Pad",
      "io.netty.channel.Channel",
      "io.netty.util.concurrent.DefaultPromise$StacklessCancellationException",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueConsumerNodeRef",
      "org.testng.IDynamicGraph",
      "io.netty.util.internal.PlatformDependent$ThreadLocalRandomProvider",
      "io.netty.channel.local.LocalChannel$LocalUnsafe",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory$PowerOfTwoEventExecutorChooser",
      "org.testng.reporters.XMLStringBuffer",
      "org.testng.IObjectFactory",
      "org.testng.annotations.Ignore",
      "com.google.inject.Module",
      "io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil$IndexedQueue",
      "com.ibm.watson.data.client.model.MetadataUsage",
      "org.testng.IExecutionVisualiser",
      "io.netty.channel.DefaultChannelConfig",
      "org.testng.IObjectFactory2",
      "io.netty.channel.AbstractServerChannel",
      "org.testng.annotations.IParameterizable",
      "com.fasterxml.jackson.annotation.JsonInclude$Value",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerLimitField",
      "io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe",
      "io.netty.channel.ChannelPromise",
      "io.netty.channel.local.LocalChannel",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueue",
      "io.netty.util.internal.ObjectUtil",
      "org.testng.CommandLineArgs",
      "com.ibm.watson.data.client.model.MetadataAssetResult",
      "io.netty.channel.DefaultChannelPromise",
      "com.ibm.watson.data.client.model.Attachment",
      "org.testng.annotations.ITestOrConfiguration",
      "io.netty.channel.DefaultChannelId",
      "org.testng.IClass",
      "io.netty.util.concurrent.FutureListener",
      "io.netty.util.internal.logging.InternalLogLevel",
      "org.springframework.web.bind.annotation.RequestMethod",
      "org.testng.xml.XmlGroups",
      "io.netty.channel.ChannelOutboundBuffer",
      "io.netty.util.concurrent.DefaultPromise",
      "org.testng.internal.annotations.JDK15TagFactory",
      "io.netty.channel.ChannelOutboundInvoker",
      "org.testng.internal.annotations.IAnnotationFinder",
      "io.netty.channel.DefaultChannelPipeline",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup",
      "org.testng.log4testng.Logger",
      "io.netty.util.DefaultAttributeMap$DefaultAttribute",
      "io.netty.util.AbstractReferenceCounted",
      "org.testng.xml.XmlMethodSelector",
      "org.testng.IExecutionListener",
      "org.testng.TestNGException",
      "org.testng.ITestListener",
      "com.ibm.watson.data.client.model.enums.AssetCategory",
      "io.netty.buffer.ByteBuf",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.channel.socket.DatagramChannelConfig",
      "io.netty.util.DefaultAttributeMap",
      "io.netty.util.concurrent.FastThreadLocal",
      "io.netty.util.concurrent.EventExecutorChooserFactory$EventExecutorChooser",
      "com.ibm.watson.data.client.model.ListTrashResponse",
      "org.testng.collections.ListMultiMap",
      "org.testng.ISuite",
      "org.testng.internal.annotations.JDK15TagFactory$Default",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory$GenericEventExecutorChooser",
      "io.netty.util.internal.OutOfDirectMemoryError",
      "org.springframework.http.ResponseCookie",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$2",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.SpscLinkedAtomicQueue",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$1",
      "io.netty.util.internal.IntegerHolder",
      "io.netty.util.NetUtil",
      "org.testng.ITestRunnerFactory",
      "io.netty.util.concurrent.PromiseTask$SentinelRunnable",
      "org.testng.internal.IResultListener",
      "io.netty.util.concurrent.EventExecutorGroup",
      "io.netty.channel.ChannelInboundInvoker",
      "org.testng.DataProviderHolder",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory",
      "io.netty.channel.ChannelFuture",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.channel.AbstractChannel$CloseFuture",
      "com.google.inject.Injector",
      "io.netty.util.concurrent.ThreadPerTaskExecutor",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL1Pad",
      "io.netty.channel.ChannelConfig",
      "com.fasterxml.jackson.annotation.JsonInclude",
      "com.ibm.watson.data.client.model.MetadataHeader",
      "org.testng.collections.Sets",
      "io.netty.channel.ChannelHandler",
      "io.netty.util.concurrent.FailedFuture"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ListTrashResponse_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.ibm.watson.data.client.model.ListTrashResponse",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "com.ibm.watson.data.client.model.MetadataAssetResult",
      "com.ibm.watson.data.client.model.AttachmentHeader",
      "com.ibm.watson.data.client.model.Attachment",
      "com.ibm.watson.data.client.model.BaseRov",
      "com.ibm.watson.data.client.model.MetadataRov",
      "com.ibm.watson.data.client.model.Metadata",
      "com.ibm.watson.data.client.model.MetadataHeader",
      "com.ibm.watson.data.client.model.MetadataAsset",
      "com.ibm.watson.data.client.model.SourceSystem",
      "com.ibm.watson.data.client.model.MetadataUsage",
      "io.netty.util.DefaultAttributeMap",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.internal.logging.LocationAwareSlf4JLogger",
      "io.netty.util.internal.ObjectUtil",
      "io.netty.channel.AbstractChannel",
      "io.netty.channel.ChannelMetadata",
      "io.netty.channel.AbstractServerChannel",
      "io.netty.channel.local.LocalServerChannel",
      "io.netty.util.concurrent.AbstractFuture",
      "io.netty.channel.VoidChannelPromise",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.util.internal.SystemPropertyUtil$1",
      "io.netty.util.concurrent.DefaultPromise$CauseHolder",
      "io.netty.util.concurrent.DefaultPromise$StacklessCancellationException",
      "io.netty.util.internal.ThrowableUtil",
      "io.netty.util.concurrent.DefaultPromise",
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
      "org.springframework.web.bind.annotation.RequestMethod",
      "org.springframework.context.annotation.ScopedProxyMode",
      "io.netty.channel.local.LocalChannel",
      "com.ibm.watson.data.client.model.CommitInfo",
      "com.ibm.watson.data.client.model.SourceAsset",
      "org.testng.xml.XmlSuite$ParallelMode",
      "org.testng.xml.XmlSuite$FailurePolicy",
      "org.testng.xml.XmlSuite",
      "org.testng.collections.Lists",
      "org.testng.collections.Maps",
      "io.netty.channel.epoll.AbstractEpollChannel",
      "io.netty.util.internal.StringUtil",
      "io.netty.channel.epoll.EpollDatagramChannel",
      "io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods",
      "io.netty.channel.unix.Errors",
      "io.netty.channel.unix.FileDescriptor",
      "org.testng.log4testng.Logger",
      "org.testng.TestNG",
      "io.netty.util.concurrent.AbstractEventExecutor",
      "io.netty.util.concurrent.CompleteFuture",
      "io.netty.util.concurrent.FailedFuture",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$1",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$2",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor",
      "io.netty.util.concurrent.PromiseTask$SentinelRunnable",
      "io.netty.util.concurrent.PromiseTask",
      "io.netty.util.concurrent.ScheduledFutureTask",
      "io.netty.util.concurrent.GlobalEventExecutor$1",
      "io.netty.util.concurrent.GlobalEventExecutor$TaskRunner",
      "io.netty.util.internal.DefaultPriorityQueue",
      "io.netty.util.concurrent.DefaultThreadFactory",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "io.netty.util.internal.InternalThreadLocalMap",
      "io.netty.util.concurrent.FastThreadLocal",
      "io.netty.util.internal.ThreadExecutorMap",
      "io.netty.util.internal.ThreadExecutorMap$3",
      "io.netty.util.concurrent.GlobalEventExecutor",
      "io.netty.util.concurrent.ImmediateEventExecutor$1",
      "io.netty.util.concurrent.ImmediateEventExecutor$2",
      "io.netty.util.concurrent.ImmediateEventExecutor",
      "com.ibm.watson.data.client.model.AttachmentHandle",
      "org.mockserver.scheduler.Scheduler$SchedulerThreadFactory",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor",
      "org.testng.internal.Configuration",
      "org.testng.internal.thread.DefaultThreadPoolExecutorFactory",
      "org.testng.internal.GuiceBackedInjectorFactory",
      "org.testng.internal.annotations.JDK15AnnotationFinder",
      "org.testng.internal.annotations.IgnoreListener",
      "org.testng.internal.annotations.DefaultAnnotationTransformer",
      "org.testng.internal.annotations.JDK15TagFactory",
      "org.testng.SuiteRunner",
      "org.testng.DataProviderHolder",
      "org.testng.collections.Sets",
      "org.testng.TestListenerAdapter",
      "org.testng.SuiteRunState",
      "org.testng.internal.Attributes",
      "org.testng.internal.RuntimeBehavior",
      "org.testng.internal.Utils",
      "org.testng.SuiteRunner$ProxyTestRunnerFactory",
      "org.testng.internal.TestResult",
      "org.testng.xml.XmlTest",
      "io.netty.util.concurrent.AbstractEventExecutorGroup",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup",
      "io.netty.util.NettyRuntime$AvailableProcessorsHolder",
      "io.netty.util.NettyRuntime",
      "io.netty.channel.MultithreadEventLoopGroup",
      "io.netty.channel.DefaultEventLoopGroup",
      "io.netty.util.concurrent.ThreadPerTaskExecutor",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory",
      "io.netty.util.concurrent.SingleThreadEventExecutor$1",
      "io.netty.util.concurrent.SingleThreadEventExecutor",
      "io.netty.channel.SingleThreadEventLoop",
      "io.netty.channel.DefaultEventLoop",
      "io.netty.util.concurrent.RejectedExecutionHandlers$1",
      "io.netty.util.concurrent.RejectedExecutionHandlers",
      "io.netty.util.internal.ThreadExecutorMap$1",
      "io.netty.util.concurrent.SingleThreadEventExecutor$4",
      "io.netty.util.internal.ThreadExecutorMap$2",
      "io.netty.util.concurrent.DefaultEventExecutor",
      "io.netty.util.concurrent.NonStickyEventExecutorGroup",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory$PowerOfTwoEventExecutorChooser",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup$1",
      "org.springframework.http.server.reactive.ServerHttpResponseDecorator",
      "org.springframework.util.Assert",
      "org.springframework.http.server.reactive.HttpHeadResponseDecorator",
      "org.testng.util.Strings",
      "io.netty.channel.ChannelHandlerAdapter",
      "io.netty.channel.ChannelOutboundHandlerAdapter"
    );
  }
}
