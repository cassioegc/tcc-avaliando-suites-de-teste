/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 15 00:17:15 GMT 2021
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
public class RelationshipObject_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.ibm.watson.data.client.model.RelationshipObject"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(RelationshipObject_ESTest_scaffolding.class.getClassLoader() ,
      "io.netty.channel.ChannelInboundHandlerAdapter",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.util.ResourceLeakDetector$TraceRecord",
      "org.testng.xml.XmlScript",
      "io.netty.util.internal.ReflectionUtil",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup$1",
      "io.netty.channel.DefaultChannelPipeline$PendingHandlerRemovedTask",
      "io.netty.channel.unix.Errors$NativeConnectException",
      "io.netty.util.concurrent.FastThreadLocalThread",
      "io.netty.util.internal.ThreadLocalRandom",
      "io.netty.util.internal.ThreadExecutorMap",
      "org.testng.internal.annotations.IgnoreListener",
      "io.netty.channel.MaxMessagesRecvByteBufAllocator",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue",
      "io.netty.channel.ChannelOutboundBuffer$MessageProcessor",
      "io.netty.util.internal.PlatformDependent0$3",
      "io.netty.util.internal.PlatformDependent0$4",
      "io.netty.util.internal.PlatformDependent0$5",
      "org.testng.IAttributes",
      "io.netty.buffer.PooledByteBufAllocator",
      "io.netty.util.concurrent.DefaultProgressivePromise",
      "io.netty.util.internal.PlatformDependent0$1",
      "io.netty.util.internal.PlatformDependent0$2",
      "io.netty.channel.socket.ServerSocketChannelConfig",
      "org.testng.ITestNGMethod",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor",
      "io.netty.util.internal.PlatformDependent0$8",
      "org.testng.TestRunner",
      "io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator",
      "io.netty.util.internal.PlatformDependent$1",
      "io.netty.util.internal.PlatformDependent$2",
      "io.netty.util.internal.PlatformDependent$4",
      "io.netty.util.ResourceLeakDetector$DefaultResourceLeak",
      "io.netty.util.concurrent.EventExecutorChooserFactory",
      "io.netty.buffer.AdvancedLeakAwareByteBuf",
      "io.netty.channel.embedded.EmbeddedChannel$1",
      "io.netty.channel.embedded.EmbeddedChannel$2",
      "io.netty.util.internal.StringUtil",
      "org.testng.collections.MultiMap",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "org.testng.IInvokedMethod",
      "io.netty.channel.AbstractChannelHandlerContext",
      "io.netty.util.internal.LongAdderCounter",
      "io.netty.util.internal.ThrowableUtil",
      "io.netty.buffer.PoolArena$SizeClass",
      "io.netty.channel.ChannelFlushPromiseNotifier$FlushCheckpoint",
      "org.testng.ISuiteListener",
      "io.netty.channel.CombinedChannelDuplexHandler",
      "io.netty.channel.ChannelOutboundHandler",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "org.testng.internal.annotations.JDK15AnnotationFinder",
      "io.netty.buffer.PooledByteBuf",
      "org.testng.internal.ITestResultNotifier",
      "io.netty.util.concurrent.DefaultEventExecutor",
      "io.netty.util.concurrent.SingleThreadEventExecutor$4",
      "io.netty.util.concurrent.SingleThreadEventExecutor$1",
      "org.testng.internal.Configuration",
      "io.netty.util.concurrent.Future",
      "com.ibm.watson.data.client.model.enums.GlossaryObjectState",
      "io.netty.channel.epoll.EpollDatagramChannel$EpollDatagramChannelUnsafe",
      "org.testng.xml.XmlClass",
      "io.netty.util.concurrent.DefaultThreadFactory",
      "org.testng.internal.annotations.IDataProvidable",
      "org.testng.collections.Lists",
      "io.netty.channel.MultithreadEventLoopGroup",
      "org.testng.ITestMethodFinder",
      "io.netty.buffer.ByteBufAllocator",
      "io.netty.channel.embedded.EmbeddedChannel$State",
      "io.netty.buffer.PoolChunkList",
      "io.netty.channel.embedded.EmbeddedChannel$EmbeddedChannelPipeline",
      "io.netty.channel.embedded.EmbeddedEventLoop",
      "io.netty.buffer.PoolSubpage",
      "io.netty.buffer.PooledByteBufAllocator$1",
      "io.netty.channel.ChannelProgressiveFuture",
      "io.netty.util.internal.DefaultPriorityQueue",
      "io.netty.util.NettyRuntime$AvailableProcessorsHolder",
      "io.netty.handler.logging.ByteBufFormat",
      "org.testng.thread.ITestNGThreadPoolExecutor",
      "org.testng.IDataProviderInterceptor",
      "io.netty.util.internal.ThreadExecutorMap$1",
      "org.testng.IMethodSelectorContext",
      "io.netty.util.internal.ThreadExecutorMap$2",
      "io.netty.util.internal.ThreadExecutorMap$3",
      "org.testng.IResultMap",
      "io.netty.buffer.AbstractByteBufAllocator",
      "io.netty.util.internal.PriorityQueueNode",
      "io.netty.util.internal.MacAddressUtil",
      "org.testng.internal.annotations.IAnnotationTransformer",
      "io.netty.util.internal.shaded.org.jctools.queues.SupportsIterator",
      "io.netty.channel.embedded.EmbeddedSocketAddress",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad2",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad0",
      "io.netty.channel.DefaultFileRegion",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad1",
      "io.netty.channel.SingleThreadEventLoop",
      "org.testng.internal.annotations.DefaultAnnotationTransformer",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerIndexField",
      "io.netty.util.internal.InternalThreadLocalMap",
      "io.netty.util.ResourceLeak",
      "io.netty.channel.ChannelHandlerContext",
      "io.netty.channel.unix.UnixChannel",
      "io.netty.channel.ChannelFutureListener",
      "org.testng.internal.IConfiguration",
      "io.netty.util.concurrent.BlockingOperationException",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerLimitField",
      "io.netty.channel.FileRegion",
      "io.netty.util.concurrent.DefaultPromise$LeanCancellationException",
      "io.netty.channel.EventLoopGroup",
      "io.netty.channel.Channel$Unsafe",
      "org.testng.annotations.Guice",
      "io.netty.channel.VoidChannelPromise",
      "io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators",
      "io.netty.buffer.EmptyByteBuf",
      "io.netty.channel.unix.Errors$NativeIoException",
      "org.testng.internal.Utils$StackTraceType",
      "org.testng.internal.collections.Pair",
      "io.netty.util.AsciiString",
      "io.netty.channel.DefaultMessageSizeEstimator",
      "org.hsqldb.jdbc.JDBCDriver",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL2Pad",
      "io.netty.util.CharsetUtil",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor$RunnableScheduledFutureTask",
      "org.testng.internal.Systematiser",
      "org.hsqldb.jdbc.JDBCDriver$1",
      "io.netty.util.concurrent.GenericProgressiveFutureListener",
      "org.testng.IDataProviderListener",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue",
      "io.netty.channel.AbstractChannel$AnnotatedSocketException",
      "io.netty.channel.DefaultChannelPipeline$PendingHandlerCallback",
      "io.netty.util.internal.shaded.org.jctools.queues.SpscLinkedQueue",
      "io.netty.util.NettyRuntime",
      "io.netty.channel.ChannelPipeline",
      "io.netty.channel.RecvByteBufAllocator",
      "com.ibm.watson.data.client.model.enums.GlossaryObjectDraftMode",
      "io.netty.channel.ChannelException",
      "io.netty.handler.logging.LogLevel",
      "org.testng.xml.XmlSuite$ParallelMode",
      "io.netty.util.concurrent.ProgressivePromise",
      "io.netty.channel.VoidChannelPromise$1",
      "io.netty.util.internal.PlatformDependent0$10",
      "org.testng.internal.ConstructorOrMethod",
      "io.netty.channel.CompleteChannelFuture",
      "io.netty.util.Constant",
      "org.testng.internal.Attributes",
      "io.netty.util.concurrent.RejectedExecutionHandlers$1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad0",
      "io.netty.buffer.PooledByteBufAllocator$PoolThreadLocalCache",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueue",
      "io.netty.util.concurrent.CompleteFuture",
      "com.ibm.watson.data.client.model.GlossaryObjectMetadata",
      "io.netty.channel.AddressedEnvelope",
      "io.netty.channel.epoll.EpollDatagramChannel",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueMidPad",
      "io.netty.util.concurrent.ImmediateEventExecutor$2",
      "io.netty.util.concurrent.ImmediateEventExecutor$1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad2",
      "io.netty.util.NetUtilInitializations$NetworkIfaceAndInetAddress",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "org.testng.ITestObjectFactory",
      "io.netty.util.concurrent.SingleThreadEventExecutor",
      "io.netty.util.ByteProcessor",
      "org.testng.annotations.ITestAnnotation",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueueL0Pad",
      "io.netty.channel.Channel",
      "io.netty.util.concurrent.DefaultPromise$StacklessCancellationException",
      "io.netty.channel.RecvByteBufAllocator$Handle",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "org.testng.IObjectFactory",
      "org.testng.annotations.Ignore",
      "com.google.inject.Module",
      "org.testng.IExecutionVisualiser",
      "io.netty.channel.DefaultChannelPipeline$TailContext",
      "io.netty.channel.DefaultChannelConfig",
      "org.testng.IObjectFactory2",
      "org.testng.internal.RunInfo",
      "io.netty.buffer.PoolSubpageMetric",
      "io.netty.channel.AbstractServerChannel",
      "io.netty.buffer.WrappedCompositeByteBuf",
      "org.testng.TestRunner$ConfigurationListener",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerLimitField",
      "io.netty.channel.ChannelPromise",
      "io.netty.channel.local.LocalChannel",
      "io.netty.channel.ChannelHandlerMask$2",
      "io.netty.channel.epoll.AbstractEpollServerChannel$EpollServerSocketUnsafe",
      "io.netty.channel.socket.ChannelOutputShutdownException",
      "io.netty.channel.ChannelDuplexHandler",
      "org.testng.annotations.ITestOrConfiguration",
      "io.netty.channel.DefaultChannelId",
      "io.netty.channel.ChannelInitializer",
      "io.netty.channel.ChannelHandlerMask$1",
      "org.testng.internal.ResultMap",
      "org.testng.xml.XmlGroups",
      "io.netty.channel.StacklessClosedChannelException",
      "io.netty.channel.ChannelOutboundBuffer",
      "io.netty.buffer.PoolChunkMetric",
      "io.netty.channel.DefaultChannelPipeline",
      "io.netty.channel.epoll.EpollServerSocketChannelConfig",
      "org.testng.log4testng.Logger",
      "io.netty.util.DefaultAttributeMap$DefaultAttribute",
      "org.testng.IExecutionListener",
      "org.testng.TestNGException",
      "io.netty.buffer.ByteBuf",
      "io.netty.channel.socket.DatagramChannelConfig",
      "org.testng.ISuite",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory$GenericEventExecutorChooser",
      "io.netty.buffer.SimpleLeakAwareCompositeByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.SpscLinkedAtomicQueue",
      "io.netty.channel.embedded.EmbeddedChannel",
      "org.testng.ITestRunnerFactory",
      "io.netty.util.NetUtil",
      "org.testng.internal.IResultListener",
      "io.netty.buffer.WrappedByteBuf",
      "io.netty.buffer.ByteBufUtil$ThreadLocalUnsafeDirectByteBuf",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory",
      "io.netty.channel.ChannelFuture",
      "com.google.inject.Injector",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL1Pad",
      "io.netty.channel.ChannelConfig",
      "io.netty.util.concurrent.FailedFuture",
      "com.fasterxml.jackson.annotation.JsonProperty",
      "io.netty.util.internal.SystemPropertyUtil$1",
      "io.netty.channel.AbstractChannel$AnnotatedNoRouteToHostException",
      "io.netty.util.AttributeMap",
      "io.netty.util.internal.Cleaner",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL1Pad",
      "io.netty.util.IllegalReferenceCountException",
      "io.netty.util.concurrent.ScheduledFuture",
      "io.netty.util.internal.logging.LocationAwareSlf4JLogger",
      "io.netty.buffer.ByteBufUtil$1",
      "io.netty.buffer.ByteBufUtil$2",
      "io.netty.buffer.ByteBufHolder",
      "org.testng.internal.IInvoker",
      "io.netty.channel.socket.DatagramChannel",
      "org.testng.IConfigurationListener",
      "io.netty.util.concurrent.AbstractEventExecutorGroup",
      "org.testng.GuiceHelper",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue",
      "io.netty.channel.epoll.EpollServerChannelConfig",
      "org.testng.annotations.IAnnotation",
      "org.testng.xml.XmlSuite$FailurePolicy",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef",
      "io.netty.channel.ChannelPipelineException",
      "org.testng.internal.RuntimeBehavior",
      "org.testng.collections.SetMultiMap",
      "io.netty.util.internal.logging.InternalLogger",
      "org.testng.thread.IThreadWorkerFactory",
      "io.netty.channel.embedded.EmbeddedChannel$EmbeddedUnsafe",
      "io.netty.buffer.AbstractReferenceCountedByteBuf",
      "org.testng.collections.Maps",
      "io.netty.buffer.UnpooledHeapByteBuf",
      "io.netty.util.concurrent.EventExecutor",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueProducerNodeRef",
      "io.netty.channel.SucceededChannelFuture",
      "io.netty.channel.ChannelOption",
      "io.netty.util.internal.LongCounter",
      "org.testng.ITestResult",
      "io.netty.util.ResourceLeakHint",
      "org.testng.IHookable",
      "org.mockserver.scheduler.Scheduler",
      "io.netty.channel.epoll.EpollServerSocketChannel",
      "io.netty.util.concurrent.ImmediateEventExecutor",
      "io.netty.channel.DefaultChannelPipeline$PendingHandlerAddedTask",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueConsumerIndexField",
      "org.testng.internal.Systematiser$Order",
      "io.netty.channel.ChannelMetadata",
      "io.netty.channel.ChannelOutboundBuffer$1",
      "io.netty.buffer.SimpleLeakAwareByteBuf",
      "io.netty.util.Attribute",
      "io.netty.util.concurrent.GlobalEventExecutor$TaskRunner",
      "io.netty.util.concurrent.AbstractFuture",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL2Pad",
      "io.netty.util.ReferenceCounted",
      "org.testng.internal.Utils",
      "io.netty.util.concurrent.DefaultFutureListeners",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueConsumerIndexField",
      "org.mockserver.scheduler.Scheduler$SchedulerThreadFactory",
      "io.netty.channel.epoll.EpollDatagramChannelConfig",
      "org.testng.TestListenerAdapter",
      "io.netty.buffer.ByteBufUtil$ThreadLocalDirectByteBuf",
      "io.netty.buffer.ByteBufAllocatorMetricProvider",
      "io.netty.channel.ChannelId",
      "io.netty.util.AbstractConstant",
      "com.fasterxml.jackson.annotation.JacksonAnnotation",
      "io.netty.util.concurrent.GlobalEventExecutor",
      "io.netty.channel.DefaultChannelProgressivePromise",
      "io.netty.channel.unix.Socket",
      "org.testng.IInvokedMethodListener",
      "io.netty.channel.MessageSizeEstimator",
      "org.testng.IInjectorFactory",
      "io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.util.concurrent.OrderedEventExecutor",
      "org.testng.xml.XmlMethodSelectors",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor",
      "org.testng.internal.XmlMethodSelector",
      "io.netty.channel.ChannelHandlerAdapter",
      "org.testng.ITestContext",
      "io.netty.channel.AbstractChannel$AbstractUnsafe",
      "io.netty.channel.EventLoop",
      "io.netty.channel.epoll.EpollChannelConfig",
      "io.netty.buffer.PoolArenaMetric",
      "io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext",
      "com.google.inject.Stage",
      "io.netty.buffer.PoolThreadCache",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL3Pad",
      "org.testng.IMethodInterceptor",
      "io.netty.channel.ChannelHandlerMask",
      "org.testng.SuiteRunner",
      "io.netty.handler.logging.LoggingHandler",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL3Pad",
      "io.netty.util.internal.PriorityQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueue",
      "io.netty.channel.epoll.LinuxSocket",
      "io.netty.buffer.PooledByteBufAllocatorMetric",
      "io.netty.util.concurrent.AbstractEventExecutor",
      "org.testng.IConfigurable",
      "io.netty.buffer.PooledUnsafeDirectByteBuf",
      "org.testng.IReporter",
      "org.testng.thread.IExecutorFactory",
      "io.netty.channel.embedded.EmbeddedChannel$EmbeddedUnsafe$1",
      "io.netty.channel.AdaptiveRecvByteBufAllocator",
      "io.netty.util.ResourceLeakTracker",
      "io.netty.channel.ChannelProgressivePromise",
      "io.netty.util.concurrent.GenericFutureListener",
      "io.netty.util.internal.CleanerJava6$1",
      "com.fasterxml.jackson.annotation.JsonCreator",
      "io.netty.util.concurrent.GlobalEventExecutor$1",
      "io.netty.util.AttributeKey",
      "io.netty.util.concurrent.ScheduledFutureTask",
      "io.netty.util.concurrent.RejectedExecutionHandlers",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueConsumerNodeRef",
      "io.netty.channel.local.LocalServerChannel",
      "io.netty.channel.ChannelInboundHandler",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "io.netty.channel.local.LocalAddress",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerIndexField",
      "org.testng.IAnnotationTransformer",
      "org.testng.xml.XmlTest",
      "io.netty.channel.DefaultChannelHandlerContext",
      "io.netty.util.concurrent.RejectedExecutionHandler",
      "io.netty.buffer.PooledDirectByteBuf",
      "io.netty.channel.local.LocalChannel$State",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.util.concurrent.SucceededFuture",
      "io.netty.channel.ChannelHandler$Sharable",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "org.testng.xml.XmlSuite",
      "org.testng.SuiteRunState",
      "org.testng.ITestNGListener",
      "io.netty.util.NetUtilInitializations",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueMidPad",
      "io.netty.util.concurrent.DefaultPromise$CauseHolder",
      "org.testng.internal.GuiceBackedInjectorFactory",
      "io.netty.channel.ServerChannel",
      "org.testng.SuiteRunner$ProxyTestRunnerFactory",
      "org.testng.internal.thread.DefaultThreadPoolExecutorFactory",
      "io.netty.buffer.UnpooledDirectByteBuf",
      "org.testng.internal.IResultListener2",
      "io.netty.util.concurrent.ThreadProperties",
      "io.netty.buffer.UnpooledByteBufAllocator",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue",
      "io.netty.util.ResourceLeakDetector$Level",
      "io.netty.channel.DefaultEventLoop",
      "io.netty.util.concurrent.ProgressiveFuture",
      "io.netty.channel.unix.Errors",
      "io.netty.channel.AbstractChannel",
      "io.netty.util.concurrent.FastThreadLocalRunnable",
      "io.netty.util.concurrent.PromiseTask",
      "io.netty.util.internal.logging.AbstractInternalLogger$1",
      "io.netty.channel.MessageSizeEstimator$Handle",
      "io.netty.channel.socket.ServerSocketChannel",
      "io.netty.channel.epoll.AbstractEpollChannel",
      "io.netty.util.internal.EmptyArrays",
      "com.ibm.watson.data.client.model.RelationshipObject",
      "io.netty.util.concurrent.Promise",
      "io.netty.channel.DefaultEventLoopGroup",
      "io.netty.buffer.SizeClasses",
      "com.fasterxml.jackson.annotation.JacksonAnnotationValue",
      "io.netty.channel.unix.FileDescriptor",
      "io.netty.channel.AbstractChannel$AnnotatedConnectException",
      "io.netty.buffer.ByteBufAllocatorMetric",
      "org.testng.IDynamicGraph",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueConsumerNodeRef",
      "io.netty.buffer.PoolArena$DirectArena",
      "io.netty.util.internal.PlatformDependent$ThreadLocalRandomProvider",
      "io.netty.channel.local.LocalChannel$LocalUnsafe",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory$PowerOfTwoEventExecutorChooser",
      "org.testng.reporters.XMLStringBuffer",
      "org.testng.internal.InvokedMethod",
      "org.testng.IMethodSelector",
      "io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil$IndexedQueue",
      "io.netty.buffer.AdvancedLeakAwareCompositeByteBuf",
      "org.testng.annotations.IParameterizable",
      "com.fasterxml.jackson.annotation.JsonInclude$Value",
      "io.netty.channel.DefaultMessageSizeEstimator$HandleImpl",
      "io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe",
      "io.netty.channel.epoll.AbstractEpollServerChannel",
      "io.netty.buffer.UnpooledUnsafeHeapByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueue",
      "io.netty.util.internal.ObjectUtil",
      "io.netty.channel.DefaultChannelPromise",
      "io.netty.buffer.AbstractByteBuf",
      "org.testng.IClass",
      "io.netty.util.concurrent.FutureListener",
      "io.netty.buffer.PoolArena",
      "io.netty.buffer.UnpooledUnsafeDirectByteBuf",
      "io.netty.util.internal.logging.InternalLogLevel",
      "io.netty.util.ResourceLeakDetector",
      "io.netty.util.concurrent.DefaultPromise",
      "io.netty.buffer.CompositeByteBuf",
      "org.testng.internal.annotations.JDK15TagFactory",
      "io.netty.channel.ChannelOutboundInvoker",
      "io.netty.buffer.PoolChunk",
      "io.netty.channel.CombinedChannelDuplexHandler$1",
      "org.testng.internal.annotations.IAnnotationFinder",
      "io.netty.channel.ChannelOutboundBuffer$Entry",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup",
      "io.netty.channel.WriteBufferWaterMark",
      "org.testng.internal.Systematiser$4",
      "org.testng.internal.Systematiser$3",
      "io.netty.buffer.SizeClassesMetric",
      "io.netty.util.AbstractReferenceCounted",
      "org.testng.ITestListener",
      "io.netty.channel.DefaultChannelPipeline$HeadContext",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.util.DefaultAttributeMap",
      "io.netty.util.concurrent.FastThreadLocal",
      "io.netty.util.concurrent.EventExecutorChooserFactory$EventExecutorChooser",
      "org.testng.collections.ListMultiMap",
      "org.testng.internal.annotations.JDK15TagFactory$Default",
      "io.netty.util.internal.OutOfDirectMemoryError",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$2",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$1",
      "io.netty.util.internal.IntegerHolder",
      "io.netty.buffer.PoolThreadCache$MemoryRegionCache",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor$NonNotifyRunnable",
      "io.netty.util.concurrent.PromiseTask$SentinelRunnable",
      "io.netty.util.concurrent.EventExecutorGroup",
      "io.netty.channel.ChannelInboundInvoker",
      "org.testng.DataProviderHolder",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.channel.AbstractChannel$CloseFuture",
      "io.netty.util.concurrent.ThreadPerTaskExecutor",
      "io.netty.buffer.ByteBufUtil",
      "io.netty.buffer.PoolChunkListMetric",
      "com.fasterxml.jackson.annotation.JsonInclude",
      "io.netty.channel.ChannelHandler",
      "org.testng.collections.Sets",
      "io.netty.channel.DefaultChannelPipeline$1"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(RelationshipObject_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.ibm.watson.data.client.model.RelationshipObject",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "com.ibm.watson.data.client.model.GlossaryObjectMetadata",
      "io.netty.channel.ChannelHandlerAdapter",
      "io.netty.channel.ChannelInboundHandlerAdapter",
      "io.netty.channel.ChannelDuplexHandler",
      "io.netty.handler.logging.LoggingHandler",
      "io.netty.util.internal.ObjectUtil",
      "io.netty.util.DefaultAttributeMap",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.internal.logging.LocationAwareSlf4JLogger",
      "io.netty.channel.AbstractChannel",
      "io.netty.util.internal.ThrowableUtil",
      "io.netty.channel.ChannelMetadata",
      "io.netty.channel.epoll.AbstractEpollChannel",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.util.internal.SystemPropertyUtil$1",
      "io.netty.util.internal.StringUtil",
      "io.netty.channel.epoll.EpollDatagramChannel",
      "io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods",
      "io.netty.channel.unix.Errors",
      "io.netty.channel.unix.FileDescriptor",
      "io.netty.util.internal.logging.AbstractInternalLogger$1",
      "io.netty.channel.epoll.AbstractEpollServerChannel",
      "io.netty.channel.epoll.EpollServerSocketChannel",
      "org.testng.xml.XmlSuite$ParallelMode",
      "org.testng.xml.XmlSuite$FailurePolicy",
      "org.testng.xml.XmlSuite",
      "io.netty.util.concurrent.AbstractEventExecutor",
      "io.netty.util.concurrent.AbstractFuture",
      "io.netty.util.concurrent.CompleteFuture",
      "io.netty.util.concurrent.FailedFuture",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$1",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$2",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor",
      "io.netty.util.concurrent.DefaultPromise$CauseHolder",
      "io.netty.util.concurrent.DefaultPromise$StacklessCancellationException",
      "io.netty.util.concurrent.DefaultPromise",
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
      "org.hsqldb.jdbc.JDBCDriver",
      "io.netty.util.concurrent.DefaultProgressivePromise",
      "org.testng.internal.Configuration",
      "org.testng.collections.Maps",
      "org.testng.internal.thread.DefaultThreadPoolExecutorFactory",
      "org.testng.internal.GuiceBackedInjectorFactory",
      "org.testng.internal.annotations.JDK15AnnotationFinder",
      "org.testng.internal.annotations.IgnoreListener",
      "org.testng.internal.annotations.DefaultAnnotationTransformer",
      "org.testng.internal.annotations.JDK15TagFactory",
      "org.testng.collections.Lists",
      "org.testng.SuiteRunner",
      "org.testng.DataProviderHolder",
      "org.testng.collections.Sets",
      "org.testng.TestListenerAdapter",
      "org.testng.SuiteRunState",
      "org.testng.internal.Attributes",
      "org.testng.internal.RuntimeBehavior",
      "org.testng.log4testng.Logger",
      "org.testng.internal.Utils",
      "org.testng.SuiteRunner$ProxyTestRunnerFactory",
      "org.mockserver.scheduler.Scheduler$SchedulerThreadFactory",
      "io.netty.util.concurrent.SingleThreadEventExecutor$1",
      "io.netty.util.concurrent.SingleThreadEventExecutor",
      "io.netty.util.concurrent.DefaultEventExecutor",
      "io.netty.util.concurrent.ThreadPerTaskExecutor",
      "io.netty.util.concurrent.RejectedExecutionHandlers$1",
      "io.netty.util.concurrent.RejectedExecutionHandlers",
      "io.netty.util.internal.ThreadExecutorMap$1",
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
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor",
      "io.netty.util.concurrent.SucceededFuture",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor$RunnableScheduledFutureTask",
      "io.netty.util.concurrent.FastThreadLocalRunnable",
      "io.netty.util.concurrent.FastThreadLocalThread",
      "io.netty.channel.CombinedChannelDuplexHandler",
      "io.netty.channel.SingleThreadEventLoop",
      "io.netty.channel.DefaultEventLoop",
      "io.netty.util.concurrent.SingleThreadEventExecutor$4",
      "io.netty.util.internal.ThreadExecutorMap$2",
      "io.netty.channel.DefaultChannelProgressivePromise",
      "org.testng.xml.XmlTest",
      "io.netty.util.concurrent.AbstractEventExecutorGroup",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup",
      "io.netty.util.NettyRuntime$AvailableProcessorsHolder",
      "io.netty.util.NettyRuntime",
      "io.netty.channel.MultithreadEventLoopGroup",
      "io.netty.channel.DefaultEventLoopGroup",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory$PowerOfTwoEventExecutorChooser",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup$1",
      "io.netty.channel.embedded.EmbeddedSocketAddress",
      "io.netty.channel.embedded.EmbeddedChannel",
      "io.netty.channel.AbstractChannel$AbstractUnsafe",
      "io.netty.channel.embedded.EmbeddedChannel$EmbeddedUnsafe",
      "io.netty.channel.ChannelOutboundBuffer$1",
      "io.netty.channel.ChannelOutboundBuffer",
      "io.netty.channel.embedded.EmbeddedChannel$EmbeddedUnsafe$1",
      "io.netty.channel.DefaultChannelPipeline$1",
      "io.netty.channel.DefaultChannelPipeline",
      "io.netty.channel.embedded.EmbeddedChannel$EmbeddedChannelPipeline",
      "io.netty.util.ResourceLeakDetector$Level",
      "io.netty.util.ResourceLeakDetector",
      "io.netty.channel.CompleteChannelFuture",
      "io.netty.channel.SucceededChannelFuture",
      "io.netty.channel.VoidChannelPromise$1",
      "io.netty.channel.AbstractChannelHandlerContext",
      "io.netty.channel.DefaultChannelPipeline$TailContext",
      "io.netty.channel.ChannelHandlerMask$1",
      "io.netty.channel.ChannelHandlerMask",
      "io.netty.channel.ChannelHandlerMask$2",
      "io.netty.channel.DefaultChannelPipeline$HeadContext",
      "io.netty.channel.embedded.EmbeddedEventLoop",
      "io.netty.channel.embedded.EmbeddedChannel$1",
      "io.netty.channel.DefaultMessageSizeEstimator$HandleImpl",
      "io.netty.channel.DefaultMessageSizeEstimator",
      "io.netty.channel.DefaultChannelConfig",
      "io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator",
      "io.netty.channel.AdaptiveRecvByteBufAllocator",
      "io.netty.buffer.ByteBufUtil$1",
      "io.netty.util.CharsetUtil",
      "io.netty.buffer.AbstractByteBufAllocator",
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
      "io.netty.channel.embedded.EmbeddedChannel$State",
      "org.testng.TestRunner",
      "org.testng.GuiceHelper",
      "org.testng.TestRunner$ConfigurationListener",
      "org.testng.internal.XmlMethodSelector",
      "org.testng.collections.MultiMap",
      "org.testng.collections.ListMultiMap",
      "org.testng.internal.ResultMap",
      "org.testng.internal.RunInfo",
      "org.testng.internal.Systematiser",
      "org.testng.internal.Systematiser$Order",
      "org.testng.internal.Systematiser$4",
      "org.testng.internal.Systematiser$3"
    );
  }
}
