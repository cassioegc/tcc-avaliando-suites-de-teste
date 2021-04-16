/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 14 18:00:52 GMT 2021
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
public class UserTaskMetadata_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.ibm.watson.data.client.model.UserTaskMetadata"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(UserTaskMetadata_ESTest_scaffolding.class.getClassLoader() ,
      "io.netty.channel.unix.DomainSocketChannelConfig",
      "io.netty.channel.ChannelInboundHandlerAdapter",
      "io.netty.util.ResourceLeakDetector$TraceRecord",
      "io.netty.util.internal.PlatformDependent0",
      "org.testng.xml.XmlScript",
      "io.netty.util.internal.ReflectionUtil",
      "io.netty.channel.DefaultChannelPipeline$PendingHandlerRemovedTask",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup$1",
      "io.netty.util.concurrent.FastThreadLocalThread",
      "io.netty.channel.unix.Errors$NativeConnectException",
      "reactor.core.publisher.InnerProducer",
      "io.netty.util.internal.ThreadLocalRandom",
      "io.netty.util.internal.ThreadExecutorMap",
      "io.netty.channel.MaxMessagesRecvByteBufAllocator",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe",
      "io.netty.channel.ChannelOutboundHandlerAdapter",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue",
      "io.netty.channel.ChannelOutboundBuffer$MessageProcessor",
      "io.netty.util.internal.PlatformDependent0$3",
      "io.netty.util.internal.PlatformDependent0$4",
      "io.netty.util.internal.PlatformDependent0$5",
      "org.testng.IAttributes",
      "io.netty.buffer.PooledByteBufAllocator",
      "io.netty.util.internal.PlatformDependent0$1",
      "io.netty.util.concurrent.DefaultProgressivePromise",
      "io.netty.util.internal.PlatformDependent0$2",
      "org.testng.ITestNGMethod",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor",
      "io.netty.util.internal.PlatformDependent0$8",
      "org.testng.TestRunner",
      "reactor.core.Scannable$Attr",
      "io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator",
      "io.netty.util.internal.PlatformDependent$1",
      "io.netty.util.internal.PlatformDependent$2",
      "io.netty.util.ResourceLeakDetector$DefaultResourceLeak",
      "io.netty.util.internal.PlatformDependent$4",
      "com.ibm.watson.data.client.model.UserTaskMetadata",
      "io.netty.buffer.AdvancedLeakAwareByteBuf",
      "io.netty.util.concurrent.EventExecutorChooserFactory",
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
      "io.netty.channel.ChannelOutboundHandler",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "io.netty.buffer.PooledByteBuf",
      "org.testng.internal.ITestResultNotifier",
      "io.netty.util.concurrent.DefaultEventExecutor",
      "io.netty.util.concurrent.SingleThreadEventExecutor$4",
      "io.netty.util.concurrent.SingleThreadEventExecutor$1",
      "io.netty.util.concurrent.Future",
      "org.testng.xml.XmlClass",
      "io.netty.channel.epoll.EpollDatagramChannel$EpollDatagramChannelUnsafe",
      "org.testng.collections.Lists",
      "org.testng.internal.annotations.IDataProvidable",
      "io.netty.util.concurrent.DefaultThreadFactory",
      "org.testng.ITestMethodFinder",
      "io.netty.channel.MultithreadEventLoopGroup",
      "io.netty.buffer.ByteBufAllocator",
      "io.netty.channel.embedded.EmbeddedChannel$State",
      "io.netty.buffer.PoolChunkList",
      "io.netty.channel.epoll.AbstractEpollStreamChannel",
      "io.netty.channel.embedded.EmbeddedChannel$EmbeddedChannelPipeline",
      "io.netty.channel.embedded.EmbeddedEventLoop",
      "io.netty.buffer.PoolSubpage",
      "io.netty.buffer.PooledByteBufAllocator$1",
      "io.netty.channel.ChannelProgressiveFuture",
      "io.netty.util.NettyRuntime$AvailableProcessorsHolder",
      "io.netty.util.internal.DefaultPriorityQueue",
      "io.netty.handler.logging.ByteBufFormat",
      "org.testng.IDataProviderInterceptor",
      "org.testng.IMethodSelectorContext",
      "io.netty.util.internal.ThreadExecutorMap$1",
      "io.netty.util.internal.ThreadExecutorMap$2",
      "io.netty.util.internal.ThreadExecutorMap$3",
      "org.testng.IResultMap",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceInTask",
      "io.netty.buffer.AbstractByteBufAllocator",
      "io.netty.util.internal.PriorityQueueNode",
      "io.netty.util.internal.MacAddressUtil",
      "io.netty.channel.embedded.EmbeddedSocketAddress",
      "io.netty.util.internal.shaded.org.jctools.queues.SupportsIterator",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad2",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad0",
      "io.netty.channel.DefaultFileRegion",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad1",
      "io.netty.channel.SingleThreadEventLoop",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerIndexField",
      "io.netty.util.internal.InternalThreadLocalMap",
      "io.netty.util.ResourceLeak",
      "io.netty.channel.ChannelHandlerContext",
      "io.netty.channel.unix.UnixChannel",
      "org.testng.IRetryAnalyzer",
      "io.netty.channel.ChannelFutureListener",
      "org.testng.internal.IConfiguration",
      "io.netty.util.concurrent.BlockingOperationException",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerLimitField",
      "io.netty.channel.FileRegion",
      "org.reactivestreams.Subscriber",
      "io.netty.util.concurrent.DefaultPromise$LeanCancellationException",
      "io.netty.channel.EventLoopGroup",
      "reactor.core.publisher.InnerOperator",
      "io.netty.channel.embedded.EmbeddedChannelId",
      "org.testng.annotations.Guice",
      "io.netty.channel.Channel$Unsafe",
      "io.netty.channel.VoidChannelPromise",
      "io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators",
      "io.netty.buffer.EmptyByteBuf",
      "org.reactivestreams.Subscription",
      "reactor.core.Fuseable$SynchronousSubscription",
      "io.netty.channel.unix.Errors$NativeIoException",
      "io.netty.channel.epoll.EpollDomainSocketChannel$EpollDomainUnsafe",
      "io.netty.util.AsciiString",
      "io.netty.channel.DefaultMessageSizeEstimator",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL2Pad",
      "reactor.core.CoreSubscriber",
      "io.netty.util.concurrent.DefaultEventExecutorGroup",
      "io.netty.util.CharsetUtil",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor$RunnableScheduledFutureTask",
      "org.testng.internal.Systematiser",
      "io.netty.util.concurrent.GenericProgressiveFutureListener",
      "org.testng.IDataProviderListener",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue",
      "io.netty.channel.AbstractChannel$AnnotatedSocketException",
      "io.netty.channel.DefaultChannelPipeline$PendingHandlerCallback",
      "io.netty.util.internal.shaded.org.jctools.queues.SpscLinkedQueue",
      "reactor.core.publisher.Operators$MultiSubscriptionSubscriber",
      "io.netty.util.NettyRuntime",
      "io.netty.channel.ChannelPipeline",
      "io.netty.channel.RecvByteBufAllocator",
      "reactor.core.publisher.Operators$ConditionalSubscriberAdapter",
      "io.netty.channel.ChannelException",
      "io.netty.handler.logging.LogLevel",
      "org.testng.xml.XmlSuite$ParallelMode",
      "io.netty.util.concurrent.ProgressivePromise",
      "io.netty.channel.VoidChannelPromise$1",
      "io.netty.util.internal.PlatformDependent0$10",
      "org.testng.internal.ConstructorOrMethod",
      "io.netty.channel.CompleteChannelFuture",
      "org.testng.internal.Attributes",
      "io.netty.util.Constant",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad0",
      "io.netty.buffer.PooledByteBufAllocator$PoolThreadLocalCache",
      "io.netty.util.concurrent.RejectedExecutionHandlers$1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueue",
      "io.netty.util.concurrent.CompleteFuture",
      "io.netty.channel.AddressedEnvelope",
      "io.netty.channel.epoll.EpollDatagramChannel",
      "io.netty.channel.unix.DomainSocketChannel",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueMidPad",
      "io.netty.util.concurrent.ImmediateEventExecutor$2",
      "io.netty.util.concurrent.ImmediateEventExecutor$1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad2",
      "io.netty.util.NetUtilInitializations$NetworkIfaceAndInetAddress",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "io.netty.util.concurrent.SingleThreadEventExecutor",
      "io.netty.util.ByteProcessor",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueueL0Pad",
      "io.netty.channel.Channel",
      "io.netty.util.concurrent.DefaultPromise$StacklessCancellationException",
      "io.netty.channel.RecvByteBufAllocator$Handle",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "reactor.core.Fuseable$QueueSubscription",
      "com.google.inject.Module",
      "io.netty.channel.DefaultChannelPipeline$TailContext",
      "org.testng.internal.NoOpTestClass",
      "org.testng.internal.RunInfo",
      "io.netty.channel.DefaultChannelConfig",
      "io.netty.buffer.PoolSubpageMetric",
      "io.netty.buffer.WrappedCompositeByteBuf",
      "org.testng.TestRunner$ConfigurationListener",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerLimitField",
      "io.netty.channel.ChannelPromise",
      "io.netty.channel.ChannelHandlerMask$2",
      "io.netty.channel.socket.ChannelOutputShutdownException",
      "io.netty.channel.ChannelDuplexHandler",
      "io.netty.channel.DefaultChannelId",
      "io.netty.channel.ChannelInitializer",
      "org.testng.internal.ResultMap",
      "io.netty.channel.ChannelHandlerMask$1",
      "org.testng.junit.JUnit4TestClass",
      "org.testng.xml.XmlGroups",
      "io.netty.channel.StacklessClosedChannelException",
      "io.netty.channel.ChannelOutboundBuffer",
      "io.netty.buffer.PoolChunkMetric",
      "io.netty.channel.DefaultChannelPipeline",
      "org.testng.log4testng.Logger",
      "io.netty.util.DefaultAttributeMap$DefaultAttribute",
      "org.testng.TestNGException",
      "reactor.core.publisher.Operators$ScalarSubscription",
      "io.netty.buffer.ByteBuf",
      "io.netty.channel.socket.DatagramChannelConfig",
      "io.netty.channel.socket.DuplexChannel",
      "org.testng.ISuite",
      "io.netty.buffer.SimpleLeakAwareCompositeByteBuf",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory$GenericEventExecutorChooser",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.SpscLinkedAtomicQueue",
      "io.netty.channel.embedded.EmbeddedChannel",
      "io.netty.util.NetUtil",
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
      "io.netty.channel.unix.DomainSocketAddress",
      "org.testng.IConfigurationListener",
      "io.netty.util.concurrent.AbstractEventExecutorGroup",
      "org.testng.GuiceHelper",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue",
      "org.testng.annotations.IAnnotation",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef",
      "io.netty.channel.ChannelPipelineException",
      "org.testng.internal.RuntimeBehavior",
      "reactor.core.Fuseable",
      "org.testng.collections.SetMultiMap",
      "org.testng.thread.IThreadWorkerFactory",
      "io.netty.util.internal.logging.InternalLogger",
      "io.netty.util.concurrent.NonStickyEventExecutorGroup$NonStickyOrderedEventExecutor",
      "io.netty.channel.embedded.EmbeddedChannel$EmbeddedUnsafe",
      "io.netty.buffer.AbstractReferenceCountedByteBuf",
      "org.testng.collections.Maps",
      "io.netty.buffer.UnpooledHeapByteBuf",
      "io.netty.util.concurrent.EventExecutor",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueProducerNodeRef",
      "io.netty.channel.SucceededChannelFuture",
      "io.netty.channel.ChannelOption",
      "reactor.core.Scannable",
      "io.netty.util.internal.LongCounter",
      "org.testng.ITestResult",
      "io.netty.util.ResourceLeakHint",
      "org.mockserver.scheduler.Scheduler",
      "io.netty.channel.DefaultChannelPipeline$PendingHandlerAddedTask",
      "io.netty.util.concurrent.ImmediateEventExecutor",
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
      "io.netty.util.concurrent.DefaultFutureListeners",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueConsumerIndexField",
      "org.mockserver.scheduler.Scheduler$SchedulerThreadFactory",
      "io.netty.channel.epoll.EpollDatagramChannelConfig",
      "io.netty.buffer.ByteBufUtil$ThreadLocalDirectByteBuf",
      "reactor.core.publisher.Operators$LiftFunction",
      "io.netty.buffer.ByteBufAllocatorMetricProvider",
      "org.testng.annotations.IFactoryAnnotation",
      "io.netty.channel.ChannelId",
      "org.testng.internal.ClassHelper",
      "com.fasterxml.jackson.annotation.JacksonAnnotation",
      "io.netty.util.AbstractConstant",
      "io.netty.channel.DefaultChannelProgressivePromise",
      "io.netty.util.concurrent.GlobalEventExecutor",
      "io.netty.channel.MessageSizeEstimator",
      "io.netty.channel.unix.Socket",
      "org.testng.IInjectorFactory",
      "io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.util.concurrent.OrderedEventExecutor",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor",
      "io.netty.channel.epoll.EpollDomainSocketChannel",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceInChannelTask",
      "org.testng.internal.XmlMethodSelector",
      "org.testng.ITestContext",
      "io.netty.channel.ChannelHandlerAdapter",
      "org.testng.junit.JUnitTestClass",
      "io.netty.channel.AbstractChannel$AbstractUnsafe",
      "io.netty.channel.EventLoop",
      "io.netty.buffer.PoolArenaMetric",
      "io.netty.channel.epoll.EpollChannelConfig",
      "io.netty.buffer.PoolThreadCache",
      "io.netty.channel.unix.PeerCredentials",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL3Pad",
      "org.testng.IMethodInterceptor",
      "io.netty.channel.ChannelHandlerMask",
      "io.netty.handler.logging.LoggingHandler",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL3Pad",
      "io.netty.util.internal.PriorityQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueue",
      "io.netty.channel.epoll.LinuxSocket",
      "io.netty.buffer.PooledByteBufAllocatorMetric",
      "io.netty.util.concurrent.AbstractEventExecutor",
      "io.netty.buffer.PooledUnsafeDirectByteBuf",
      "io.netty.channel.embedded.EmbeddedChannel$EmbeddedUnsafe$1",
      "io.netty.channel.AdaptiveRecvByteBufAllocator",
      "io.netty.util.ResourceLeakTracker",
      "io.netty.channel.unix.IovArray",
      "io.netty.channel.ChannelProgressivePromise",
      "io.netty.util.concurrent.GenericFutureListener",
      "reactor.core.Fuseable$ConditionalSubscriber",
      "io.netty.util.internal.CleanerJava6$1",
      "com.fasterxml.jackson.annotation.JsonCreator",
      "io.netty.util.concurrent.GlobalEventExecutor$1",
      "io.netty.util.AttributeKey",
      "io.netty.util.concurrent.ScheduledFutureTask",
      "io.netty.util.concurrent.RejectedExecutionHandlers",
      "org.testng.internal.IParameterInfo",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueConsumerNodeRef",
      "io.netty.channel.ChannelInboundHandler",
      "org.testng.internal.ClonedMethod",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerIndexField",
      "org.testng.xml.XmlTest",
      "io.netty.channel.DefaultChannelHandlerContext",
      "io.netty.util.concurrent.RejectedExecutionHandler",
      "io.netty.buffer.PooledDirectByteBuf",
      "org.testng.internal.ConfigurationMethod",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.channel.ChannelHandler$Sharable",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "org.testng.xml.XmlSuite",
      "org.testng.ITestNGListener",
      "io.netty.util.NetUtilInitializations",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueMidPad",
      "io.netty.util.concurrent.DefaultPromise$CauseHolder",
      "org.testng.ITestClass",
      "io.netty.buffer.UnpooledDirectByteBuf",
      "io.netty.util.concurrent.NonStickyEventExecutorGroup",
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
      "io.netty.channel.epoll.AbstractEpollChannel",
      "io.netty.util.internal.EmptyArrays",
      "org.testng.internal.BaseTestMethod",
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
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory$PowerOfTwoEventExecutorChooser",
      "com.ibm.watson.data.client.model.enums.UserTaskState",
      "org.testng.internal.InvokedMethod",
      "org.testng.IMethodSelector",
      "io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil$IndexedQueue",
      "io.netty.buffer.AdvancedLeakAwareCompositeByteBuf",
      "org.testng.annotations.IParameterizable",
      "com.fasterxml.jackson.annotation.JsonInclude$Value",
      "io.netty.channel.DefaultMessageSizeEstimator$HandleImpl",
      "io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe",
      "io.netty.buffer.UnpooledUnsafeHeapByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueue",
      "io.netty.util.internal.ObjectUtil",
      "io.netty.channel.DefaultChannelPromise",
      "org.testng.internal.WrappedTestNGMethod",
      "org.testng.IClass",
      "io.netty.buffer.AbstractByteBuf",
      "io.netty.util.concurrent.FutureListener",
      "io.netty.buffer.PoolArena",
      "io.netty.buffer.UnpooledUnsafeDirectByteBuf",
      "io.netty.util.internal.logging.InternalLogLevel",
      "io.netty.util.ResourceLeakDetector",
      "io.netty.util.concurrent.DefaultPromise",
      "io.netty.buffer.CompositeByteBuf",
      "reactor.core.publisher.InnerConsumer",
      "io.netty.channel.epoll.EpollDomainSocketChannelConfig",
      "io.netty.channel.ChannelOutboundInvoker",
      "io.netty.buffer.PoolChunk",
      "org.testng.internal.annotations.IAnnotationFinder",
      "io.netty.channel.ChannelOutboundBuffer$Entry",
      "org.testng.junit.JUnit3TestClass",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup",
      "org.testng.internal.Systematiser$4",
      "io.netty.channel.WriteBufferWaterMark",
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
      "reactor.core.publisher.Operators$MonoSubscriber",
      "io.netty.util.internal.OutOfDirectMemoryError",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$2",
      "io.netty.util.internal.IntegerHolder",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$1",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceFdTask",
      "reactor.core.publisher.Operators",
      "io.netty.buffer.PoolThreadCache$MemoryRegionCache",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor$NonNotifyRunnable",
      "io.netty.util.concurrent.PromiseTask$SentinelRunnable",
      "io.netty.util.concurrent.EventExecutorGroup",
      "io.netty.channel.ChannelInboundInvoker",
      "org.testng.DataProviderHolder",
      "io.netty.util.internal.SystemPropertyUtil",
      "reactor.core.publisher.Operators$DrainSubscriber",
      "io.netty.channel.AbstractChannel$CloseFuture",
      "io.netty.util.concurrent.ThreadPerTaskExecutor",
      "io.netty.buffer.ByteBufUtil",
      "io.netty.buffer.PoolChunkListMetric",
      "com.fasterxml.jackson.annotation.JsonInclude",
      "org.testng.collections.Sets",
      "io.netty.channel.ChannelHandler",
      "io.netty.channel.DefaultChannelPipeline$1"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(UserTaskMetadata_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.ibm.watson.data.client.model.UserTaskMetadata",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "org.testng.junit.JUnitTestClass",
      "org.testng.junit.JUnit3TestClass",
      "org.testng.collections.Lists",
      "org.testng.internal.NoOpTestClass",
      "org.testng.collections.Maps",
      "org.testng.log4testng.Logger",
      "org.testng.TestRunner",
      "org.testng.GuiceHelper",
      "org.testng.collections.Sets",
      "org.testng.TestRunner$ConfigurationListener",
      "org.testng.DataProviderHolder",
      "org.testng.internal.XmlMethodSelector",
      "org.testng.collections.MultiMap",
      "org.testng.collections.ListMultiMap",
      "org.testng.internal.ResultMap",
      "org.testng.internal.RunInfo",
      "org.testng.internal.Attributes",
      "org.testng.internal.Systematiser",
      "org.testng.internal.RuntimeBehavior",
      "org.testng.internal.Systematiser$Order",
      "org.testng.internal.Systematiser$4",
      "org.testng.internal.Systematiser$3",
      "io.netty.channel.ChannelHandlerAdapter",
      "io.netty.channel.ChannelInboundHandlerAdapter",
      "io.netty.channel.ChannelDuplexHandler",
      "io.netty.handler.logging.LoggingHandler",
      "io.netty.util.internal.ObjectUtil",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.internal.logging.LocationAwareSlf4JLogger",
      "org.testng.junit.JUnit4TestClass",
      "org.testng.internal.ClassHelper",
      "org.testng.xml.XmlTest",
      "io.netty.util.DefaultAttributeMap",
      "io.netty.channel.AbstractChannel",
      "io.netty.channel.embedded.EmbeddedSocketAddress",
      "io.netty.channel.ChannelMetadata",
      "io.netty.channel.embedded.EmbeddedChannel",
      "io.netty.channel.embedded.EmbeddedChannelId",
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
      "io.netty.channel.AbstractChannel$AbstractUnsafe",
      "io.netty.channel.embedded.EmbeddedChannel$EmbeddedUnsafe",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "io.netty.util.internal.InternalThreadLocalMap",
      "io.netty.util.concurrent.FastThreadLocal",
      "io.netty.channel.ChannelOutboundBuffer$1",
      "io.netty.channel.ChannelOutboundBuffer",
      "io.netty.channel.embedded.EmbeddedChannel$EmbeddedUnsafe$1",
      "io.netty.util.internal.StringUtil",
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
      "io.netty.channel.embedded.EmbeddedChannel$State",
      "io.netty.util.internal.logging.AbstractInternalLogger$1",
      "io.netty.util.concurrent.PromiseTask$SentinelRunnable",
      "io.netty.util.concurrent.PromiseTask",
      "io.netty.util.concurrent.ScheduledFutureTask",
      "io.netty.util.concurrent.DefaultProgressivePromise",
      "io.netty.channel.DefaultChannelProgressivePromise",
      "org.mockserver.scheduler.Scheduler$SchedulerThreadFactory",
      "io.netty.util.concurrent.AbstractEventExecutorGroup",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup",
      "io.netty.util.concurrent.DefaultEventExecutorGroup",
      "io.netty.util.concurrent.SingleThreadEventExecutor$1",
      "io.netty.util.concurrent.SingleThreadEventExecutor",
      "io.netty.util.concurrent.RejectedExecutionHandlers$1",
      "io.netty.util.concurrent.RejectedExecutionHandlers",
      "io.netty.util.concurrent.ThreadPerTaskExecutor",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory",
      "io.netty.util.concurrent.GlobalEventExecutor$1",
      "io.netty.util.concurrent.GlobalEventExecutor$TaskRunner",
      "io.netty.util.concurrent.FailedFuture",
      "io.netty.util.internal.DefaultPriorityQueue",
      "io.netty.util.concurrent.DefaultThreadFactory",
      "io.netty.util.internal.ThreadExecutorMap",
      "io.netty.util.internal.ThreadExecutorMap$3",
      "io.netty.util.concurrent.GlobalEventExecutor",
      "io.netty.util.concurrent.DefaultEventExecutor",
      "io.netty.util.internal.ThreadExecutorMap$1",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory$GenericEventExecutorChooser",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup$1",
      "io.netty.util.concurrent.SingleThreadEventExecutor$4",
      "io.netty.util.internal.ThreadExecutorMap$2",
      "io.netty.channel.epoll.AbstractEpollChannel",
      "io.netty.channel.epoll.AbstractEpollStreamChannel",
      "io.netty.channel.epoll.EpollDomainSocketChannel",
      "io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods",
      "io.netty.channel.unix.Errors",
      "io.netty.channel.unix.FileDescriptor",
      "io.netty.util.concurrent.NonStickyEventExecutorGroup",
      "org.testng.internal.WrappedTestNGMethod",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor",
      "io.netty.channel.MultithreadEventLoopGroup",
      "io.netty.channel.DefaultEventLoopGroup",
      "io.netty.channel.SingleThreadEventLoop",
      "io.netty.channel.DefaultEventLoop",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory$PowerOfTwoEventExecutorChooser",
      "io.netty.util.internal.PlatformDependent0$8",
      "io.netty.util.internal.MacAddressUtil",
      "io.netty.util.NetUtilInitializations",
      "io.netty.util.NetUtil",
      "io.netty.channel.DefaultChannelId",
      "org.testng.internal.ClonedMethod",
      "org.testng.internal.BaseTestMethod",
      "org.testng.internal.ConfigurationMethod",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor$RunnableScheduledFutureTask",
      "io.netty.channel.epoll.EpollDatagramChannel",
      "io.netty.util.concurrent.FastThreadLocalRunnable",
      "io.netty.util.concurrent.FastThreadLocalThread",
      "io.netty.util.concurrent.ImmediateEventExecutor$1",
      "io.netty.util.concurrent.ImmediateEventExecutor$2",
      "io.netty.util.concurrent.ImmediateEventExecutor",
      "reactor.core.Scannable",
      "reactor.core.publisher.Operators$MonoSubscriber",
      "io.netty.channel.ChannelOutboundHandlerAdapter"
    );
  }
}
