/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 14 20:31:28 GMT 2021
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
public class ObjectLocation_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.ibm.watson.data.client.model.ObjectLocation"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ObjectLocation_ESTest_scaffolding.class.getClassLoader() ,
      "io.netty.channel.ChannelInboundHandlerAdapter",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledDirectByteBuf",
      "org.testng.xml.XmlScript",
      "io.netty.util.internal.ReflectionUtil",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup$1",
      "io.netty.channel.DefaultChannelPipeline$PendingHandlerRemovedTask",
      "io.netty.buffer.DuplicatedByteBuf",
      "io.netty.channel.unix.Errors$NativeConnectException",
      "io.netty.util.concurrent.FastThreadLocalThread",
      "io.netty.util.internal.ThreadLocalRandom",
      "io.netty.util.internal.ThreadExecutorMap",
      "io.netty.channel.MaxMessagesRecvByteBufAllocator",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe",
      "io.netty.channel.ChannelOutboundHandlerAdapter",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue",
      "org.testng.xml.XmlDependencies",
      "io.netty.channel.ChannelOutboundBuffer$MessageProcessor",
      "io.netty.util.internal.PlatformDependent0$3",
      "io.netty.util.internal.PlatformDependent0$4",
      "io.netty.util.internal.PlatformDependent0$5",
      "io.netty.util.internal.ObjectPool$RecyclerObjectPool",
      "io.netty.buffer.PooledByteBufAllocator",
      "io.netty.util.internal.PlatformDependent0$1",
      "io.netty.util.internal.PlatformDependent0$2",
      "io.netty.channel.socket.ServerSocketChannelConfig",
      "io.netty.channel.epoll.EpollRecvByteAllocatorStreamingHandle",
      "io.netty.util.internal.PlatformDependent0$8",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor",
      "io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator",
      "org.mockserver.model.RequestDefinition",
      "io.netty.util.internal.PlatformDependent$1",
      "io.netty.util.internal.PlatformDependent$2",
      "io.netty.util.internal.PlatformDependent$4",
      "io.netty.util.ResourceLeakDetector$DefaultResourceLeak",
      "org.mockserver.model.HttpRequest",
      "io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode",
      "io.netty.util.concurrent.EventExecutorChooserFactory",
      "io.netty.buffer.AdvancedLeakAwareByteBuf",
      "io.netty.buffer.FixedCompositeByteBuf",
      "io.netty.util.internal.StringUtil",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.internal.LongAdderCounter",
      "io.netty.channel.AbstractChannelHandlerContext",
      "io.netty.util.internal.ThrowableUtil",
      "io.netty.buffer.PoolArena$SizeClass",
      "io.netty.channel.ChannelFlushPromiseNotifier$FlushCheckpoint",
      "org.mockserver.model.Not",
      "io.netty.channel.ChannelOutboundHandler",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "io.netty.buffer.PooledByteBuf",
      "io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory",
      "io.netty.util.concurrent.DefaultEventExecutor",
      "io.netty.util.concurrent.SingleThreadEventExecutor$4",
      "io.netty.util.concurrent.SingleThreadEventExecutor$1",
      "io.netty.util.concurrent.Future",
      "io.netty.util.HashingStrategy$1",
      "io.netty.channel.epoll.EpollDatagramChannel$EpollDatagramChannelUnsafe",
      "io.netty.util.concurrent.DefaultThreadFactory",
      "io.netty.channel.epoll.EpollServerDomainSocketChannel",
      "io.netty.buffer.ByteBufAllocator",
      "io.netty.channel.epoll.AbstractEpollStreamChannel",
      "io.netty.buffer.PoolChunkList",
      "io.netty.buffer.PoolSubpage",
      "io.netty.buffer.SwappedByteBuf",
      "io.netty.buffer.Unpooled",
      "io.netty.buffer.PooledByteBufAllocator$1",
      "io.netty.channel.ChannelProgressiveFuture",
      "io.netty.util.internal.DefaultPriorityQueue",
      "io.netty.util.NettyRuntime$AvailableProcessorsHolder",
      "io.netty.handler.logging.ByteBufFormat",
      "io.netty.channel.socket.DatagramPacket",
      "io.netty.util.Recycler$Handle",
      "io.netty.util.internal.ThreadExecutorMap$1",
      "io.netty.util.internal.ThreadExecutorMap$2",
      "io.netty.util.internal.ThreadExecutorMap$3",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceInTask",
      "org.mockserver.model.MediaType",
      "io.netty.buffer.AbstractByteBufAllocator",
      "io.netty.buffer.WrappedUnpooledUnsafeDirectByteBuf",
      "io.netty.util.internal.PriorityQueueNode",
      "io.netty.util.internal.MacAddressUtil",
      "org.mockserver.client.SocketCommunicationException",
      "io.netty.util.internal.shaded.org.jctools.queues.SupportsIterator",
      "io.netty.buffer.PooledDuplicatedByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad2",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad0",
      "io.netty.channel.DefaultFileRegion",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad1",
      "io.netty.util.AbstractReferenceCounted$1",
      "org.mockserver.model.ObjectWithReflectiveEqualsHashCodeToString",
      "io.netty.util.UncheckedBooleanSupplier",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerIndexField",
      "io.netty.util.internal.InternalThreadLocalMap",
      "org.mockserver.model.KeysToMultiValues",
      "io.netty.util.ResourceLeak",
      "io.netty.channel.ChannelHandlerContext",
      "io.netty.channel.unix.UnixChannel",
      "io.netty.util.HashingStrategy",
      "io.netty.util.internal.MathUtil",
      "io.netty.channel.FixedRecvByteBufAllocator",
      "io.netty.channel.ChannelFutureListener",
      "io.netty.channel.epoll.EpollRecvByteAllocatorHandle",
      "io.netty.util.concurrent.BlockingOperationException",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerLimitField",
      "io.netty.channel.FileRegion",
      "org.mockserver.model.Header",
      "io.netty.util.concurrent.DefaultPromise$LeanCancellationException",
      "io.netty.channel.EventLoopGroup",
      "io.netty.buffer.AbstractUnpooledSlicedByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue$Supplier",
      "io.netty.channel.Channel$Unsafe",
      "io.netty.channel.VoidChannelPromise",
      "io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators",
      "io.netty.buffer.EmptyByteBuf",
      "io.netty.channel.ChannelOutboundBuffer$Entry$1",
      "io.netty.channel.unix.Errors$NativeIoException",
      "org.mockserver.model.Cookie",
      "io.netty.buffer.ReadOnlyByteBuf",
      "io.netty.util.AsciiString",
      "io.netty.util.internal.ObjectPool$RecyclerObjectPool$1",
      "io.netty.channel.DefaultMessageSizeEstimator",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL2Pad",
      "org.hsqldb.jdbc.JDBCDriver",
      "io.netty.util.concurrent.DefaultEventExecutorGroup",
      "io.netty.util.CharsetUtil",
      "org.hsqldb.jdbc.JDBCDriver$1",
      "io.netty.util.concurrent.GenericProgressiveFutureListener",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue",
      "io.netty.channel.AbstractChannel$AnnotatedSocketException",
      "io.netty.channel.DefaultChannelPipeline$PendingHandlerCallback",
      "io.netty.util.internal.shaded.org.jctools.queues.SpscLinkedQueue",
      "io.netty.buffer.UnsafeDirectSwappedByteBuf",
      "io.netty.util.NettyRuntime",
      "io.netty.buffer.PooledSlicedByteBuf",
      "io.netty.channel.ChannelPipeline",
      "io.netty.channel.RecvByteBufAllocator",
      "io.netty.channel.ChannelException",
      "org.testng.xml.XmlSuite$ParallelMode",
      "io.netty.handler.logging.LogLevel",
      "io.netty.util.concurrent.ProgressivePromise",
      "io.netty.util.internal.PlatformDependent0$10",
      "io.netty.util.Constant",
      "io.netty.channel.ChannelOption$1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad0",
      "io.netty.util.concurrent.RejectedExecutionHandlers$1",
      "io.netty.buffer.PooledByteBufAllocator$PoolThreadLocalCache",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueue",
      "io.netty.util.concurrent.CompleteFuture",
      "io.netty.channel.AddressedEnvelope",
      "io.netty.channel.epoll.EpollDatagramChannel",
      "io.netty.util.internal.ReferenceCountUpdater",
      "io.netty.channel.epoll.EpollSocketChannel",
      "io.netty.channel.ChannelException$StacklessChannelException",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueMidPad",
      "io.netty.util.concurrent.ImmediateEventExecutor$2",
      "io.netty.util.concurrent.ImmediateEventExecutor$1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad2",
      "io.netty.util.NetUtilInitializations$NetworkIfaceAndInetAddress",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "io.netty.buffer.UnsafeHeapSwappedByteBuf",
      "org.testng.ITestObjectFactory",
      "org.mockserver.model.Action",
      "io.netty.util.ByteProcessor$IndexOfProcessor",
      "io.netty.util.concurrent.SingleThreadEventExecutor",
      "io.netty.util.ByteProcessor",
      "org.mockserver.model.BodyWithContentType",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueueL0Pad",
      "io.netty.channel.Channel",
      "io.netty.util.concurrent.DefaultPromise$StacklessCancellationException",
      "io.netty.channel.RecvByteBufAllocator$Handle",
      "org.mockserver.model.KeysAndValues",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "org.mockserver.model.Headers",
      "io.netty.channel.DefaultChannelPipeline$TailContext",
      "io.netty.channel.DefaultChannelConfig",
      "io.netty.buffer.PoolSubpageMetric",
      "io.netty.channel.AbstractServerChannel",
      "io.netty.buffer.WrappedCompositeByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerLimitField",
      "io.netty.channel.ChannelPromise",
      "io.netty.channel.local.LocalChannel",
      "io.netty.channel.epoll.AbstractEpollServerChannel$EpollServerSocketUnsafe",
      "io.netty.channel.socket.ChannelOutputShutdownException",
      "io.netty.channel.ChannelDuplexHandler",
      "io.netty.channel.DefaultChannelId",
      "org.testng.xml.XmlRun",
      "org.testng.xml.XmlGroups",
      "io.netty.channel.StacklessClosedChannelException",
      "io.netty.buffer.ByteBufUtil$ThreadLocalDirectByteBuf$1",
      "io.netty.channel.ChannelOutboundBuffer",
      "io.netty.buffer.UnpooledDuplicatedByteBuf",
      "io.netty.buffer.AbstractDerivedByteBuf",
      "io.netty.buffer.PoolChunkMetric",
      "io.netty.channel.DefaultChannelPipeline",
      "io.netty.buffer.UnpooledSlicedByteBuf",
      "io.netty.channel.epoll.EpollServerSocketChannelConfig",
      "io.netty.util.DefaultAttributeMap$DefaultAttribute",
      "org.testng.TestNGException",
      "io.netty.buffer.ByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode",
      "io.netty.channel.socket.DatagramChannelConfig",
      "io.netty.channel.socket.DuplexChannel",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory$GenericEventExecutorChooser",
      "io.netty.buffer.SimpleLeakAwareCompositeByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.SpscLinkedAtomicQueue",
      "io.netty.util.NetUtil",
      "io.netty.buffer.ByteBufUtil$ThreadLocalUnsafeDirectByteBuf",
      "io.netty.buffer.WrappedByteBuf",
      "org.mockserver.mock.action.http.HttpForwardActionResult",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory",
      "io.netty.channel.ChannelFuture",
      "io.netty.channel.unix.ServerDomainSocketChannel",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL1Pad",
      "io.netty.buffer.CompositeByteBuf$1",
      "io.netty.channel.ChannelConfig",
      "io.netty.buffer.CompositeByteBuf$2",
      "org.mockserver.model.Cookies",
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
      "io.netty.buffer.CompositeByteBuf$Component",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue$ExitCondition",
      "io.netty.channel.socket.DatagramChannel",
      "io.netty.channel.unix.DatagramSocketAddress",
      "io.netty.channel.unix.DomainSocketAddress",
      "io.netty.util.concurrent.AbstractEventExecutorGroup",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue",
      "io.netty.channel.epoll.EpollServerChannelConfig",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeNoCleanerDirectByteBuf",
      "org.testng.xml.XmlSuite$FailurePolicy",
      "org.mockserver.model.HttpMessage",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef",
      "io.netty.channel.ChannelPipelineException",
      "io.netty.util.ByteProcessor$1",
      "io.netty.util.internal.logging.InternalLogger",
      "org.mockserver.model.Body",
      "io.netty.buffer.AbstractReferenceCountedByteBuf",
      "io.netty.buffer.UnpooledHeapByteBuf",
      "io.netty.util.concurrent.EventExecutor",
      "org.mockserver.model.BinaryBody",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueProducerNodeRef",
      "io.netty.channel.ChannelOption",
      "io.netty.util.internal.LongCounter",
      "io.netty.util.ByteProcessor$4",
      "io.netty.util.internal.ThreadLocalRandom$1",
      "io.netty.util.ByteProcessor$3",
      "io.netty.util.ByteProcessor$2",
      "io.netty.util.ResourceLeakHint",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue$Consumer",
      "org.mockserver.scheduler.Scheduler",
      "io.netty.channel.epoll.EpollServerSocketChannel",
      "io.netty.util.concurrent.ImmediateEventExecutor",
      "io.netty.channel.DefaultChannelPipeline$PendingHandlerAddedTask",
      "io.netty.channel.unix.LimitsStaticallyReferencedJniMethods",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueConsumerIndexField",
      "io.netty.channel.ChannelMetadata",
      "io.netty.util.Recycler$3",
      "io.netty.buffer.SimpleLeakAwareByteBuf",
      "io.netty.channel.ChannelOutboundBuffer$1",
      "io.netty.util.Recycler$1",
      "io.netty.util.Recycler$2",
      "io.netty.util.Attribute",
      "io.netty.util.concurrent.GlobalEventExecutor$TaskRunner",
      "io.netty.util.concurrent.AbstractFuture",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL2Pad",
      "org.mockserver.model.NottableString",
      "org.mockserver.model.KeyToMultiValue",
      "io.netty.util.ReferenceCounted",
      "io.netty.util.concurrent.DefaultFutureListeners",
      "io.netty.buffer.AbstractPooledDerivedByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueConsumerIndexField",
      "io.netty.util.ResourceLeakDetectorFactory",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeHeapByteBuf",
      "org.mockserver.scheduler.Scheduler$SchedulerThreadFactory",
      "io.netty.channel.epoll.EpollTcpInfo",
      "io.netty.channel.epoll.EpollDatagramChannelConfig",
      "io.netty.buffer.ByteBufUtil$ThreadLocalDirectByteBuf",
      "io.netty.buffer.ByteBufAllocatorMetricProvider",
      "io.netty.channel.RecvByteBufAllocator$ExtendedHandle",
      "io.netty.buffer.UnreleasableByteBuf",
      "org.mockserver.model.Action$Type",
      "io.netty.channel.socket.DuplexChannelConfig",
      "io.netty.buffer.ByteBufUtil$ThreadLocalUnsafeDirectByteBuf$1",
      "io.netty.channel.ChannelId",
      "io.netty.util.AbstractConstant",
      "com.fasterxml.jackson.annotation.JacksonAnnotation",
      "io.netty.util.concurrent.GlobalEventExecutor",
      "io.netty.channel.unix.Socket",
      "io.netty.channel.MessageSizeEstimator",
      "io.netty.buffer.ReadOnlyByteBufferBuf",
      "io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods",
      "io.netty.util.internal.PlatformDependent",
      "org.testng.xml.XmlMethodSelectors",
      "io.netty.util.concurrent.OrderedEventExecutor",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor",
      "com.google.errorprone.annotations.DoNotMock",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceInChannelTask",
      "io.netty.channel.ChannelHandlerAdapter",
      "io.netty.channel.AbstractChannel$AbstractUnsafe",
      "io.netty.channel.EventLoop",
      "io.netty.channel.epoll.EpollChannelConfig",
      "io.netty.buffer.PoolArenaMetric",
      "io.netty.buffer.UnpooledUnsafeNoCleanerDirectByteBuf",
      "io.netty.buffer.PooledDirectByteBuf$1",
      "io.netty.buffer.PoolThreadCache",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL3Pad",
      "io.netty.util.AsciiString$2",
      "io.netty.handler.logging.LoggingHandler",
      "org.mockserver.model.BinaryMessage",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL3Pad",
      "io.netty.util.internal.PriorityQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueue",
      "io.netty.channel.ChannelFutureListener$3",
      "io.netty.channel.ChannelFutureListener$2",
      "io.netty.channel.ChannelFutureListener$1",
      "io.netty.channel.epoll.LinuxSocket",
      "io.netty.buffer.PooledByteBufAllocatorMetric",
      "io.netty.util.AsciiString$1",
      "io.netty.util.concurrent.AbstractEventExecutor",
      "io.netty.buffer.PooledUnsafeDirectByteBuf",
      "io.netty.channel.unix.IovArray",
      "io.netty.util.ResourceLeakTracker",
      "io.netty.channel.ChannelProgressivePromise",
      "io.netty.channel.AbstractServerChannel$DefaultServerUnsafe",
      "org.springframework.context.annotation.ScopedProxyMode",
      "io.netty.util.concurrent.GenericFutureListener",
      "io.netty.util.internal.CleanerJava6$1",
      "com.fasterxml.jackson.annotation.JsonCreator",
      "io.netty.util.internal.ObjectPool$ObjectCreator",
      "io.netty.util.concurrent.GlobalEventExecutor$1",
      "io.netty.util.ByteProcessor$IndexNotOfProcessor",
      "io.netty.util.AttributeKey",
      "io.netty.util.concurrent.ScheduledFutureTask",
      "io.netty.util.concurrent.RejectedExecutionHandlers",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueConsumerNodeRef",
      "io.netty.channel.local.LocalServerChannel",
      "io.netty.channel.ChannelInboundHandler",
      "io.netty.channel.epoll.EpollMode",
      "org.mockserver.model.HttpResponse",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "io.netty.channel.local.LocalAddress",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerIndexField",
      "com.ibm.watson.data.client.model.enums.DataConnectionType",
      "org.testng.xml.XmlTest",
      "io.netty.channel.DefaultChannelHandlerContext",
      "io.netty.util.concurrent.RejectedExecutionHandler",
      "io.netty.channel.socket.SocketChannel",
      "io.netty.buffer.PooledDirectByteBuf",
      "io.netty.buffer.AbstractReferenceCountedByteBuf$1",
      "io.netty.buffer.AbstractUnsafeSwappedByteBuf",
      "io.netty.channel.local.LocalChannel$State",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.util.concurrent.SucceededFuture",
      "io.netty.channel.ChannelHandler$Sharable",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "org.testng.xml.XmlSuite",
      "io.netty.util.NetUtilInitializations",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueMidPad",
      "io.netty.util.concurrent.DefaultPromise$CauseHolder",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeDirectByteBuf",
      "io.netty.channel.ServerChannel",
      "io.netty.util.Recycler",
      "io.netty.util.AttributeKey$1",
      "io.netty.buffer.UnpooledDirectByteBuf",
      "io.netty.buffer.UnpooledByteBufAllocator$UnpooledByteBufAllocatorMetric",
      "io.netty.util.concurrent.ThreadProperties",
      "io.netty.buffer.UnpooledByteBufAllocator",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue",
      "io.netty.util.ResourceLeakDetector$Level",
      "io.netty.util.concurrent.ProgressiveFuture",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledHeapByteBuf",
      "io.netty.channel.unix.Errors",
      "io.netty.channel.AbstractChannel",
      "io.netty.util.concurrent.PromiseTask",
      "io.netty.util.internal.logging.AbstractInternalLogger$1",
      "io.netty.channel.MessageSizeEstimator$Handle",
      "io.netty.channel.socket.ServerSocketChannel",
      "io.netty.channel.epoll.AbstractEpollChannel",
      "io.netty.util.internal.EmptyArrays",
      "io.netty.buffer.PooledUnsafeDirectByteBuf$1",
      "io.netty.channel.AbstractChannelHandlerContext$Tasks",
      "org.mockserver.model.KeyAndValue",
      "io.netty.util.concurrent.Promise",
      "io.netty.buffer.SizeClasses",
      "com.fasterxml.jackson.annotation.JacksonAnnotationValue",
      "io.netty.channel.unix.FileDescriptor",
      "io.netty.channel.AbstractChannel$AnnotatedConnectException",
      "io.netty.buffer.ByteBufAllocatorMetric",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueConsumerNodeRef",
      "io.netty.buffer.PoolArena$DirectArena",
      "io.netty.channel.unix.Buffer",
      "io.netty.util.internal.PlatformDependent$ThreadLocalRandomProvider",
      "io.netty.buffer.ReadOnlyUnsafeDirectByteBuf",
      "io.netty.channel.local.LocalChannel$LocalUnsafe",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory$PowerOfTwoEventExecutorChooser",
      "io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess",
      "org.mockserver.model.StringBody",
      "io.netty.channel.epoll.EpollSocketChannel$EpollSocketChannelUnsafe",
      "io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil$IndexedQueue",
      "io.netty.buffer.AdvancedLeakAwareCompositeByteBuf",
      "io.netty.channel.DefaultAddressedEnvelope",
      "org.mockserver.model.Message",
      "io.netty.util.ConstantPool",
      "com.ibm.watson.data.client.model.ObjectLocation",
      "org.mockserver.model.ConnectionOptions",
      "io.netty.util.BooleanSupplier",
      "com.fasterxml.jackson.annotation.JsonInclude$Value",
      "io.netty.channel.DefaultMessageSizeEstimator$HandleImpl",
      "io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe",
      "io.netty.channel.epoll.AbstractEpollServerChannel",
      "io.netty.buffer.UnpooledUnsafeHeapByteBuf",
      "org.testng.xml.XmlDefine",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueue",
      "io.netty.util.internal.ObjectUtil",
      "io.netty.channel.DefaultChannelPromise",
      "org.mockserver.model.Delay",
      "io.netty.buffer.AbstractByteBuf",
      "io.netty.util.concurrent.FutureListener",
      "io.netty.buffer.UnpooledUnsafeDirectByteBuf",
      "io.netty.buffer.PoolArena",
      "io.netty.util.AsciiString$CharEqualityComparator",
      "org.springframework.web.bind.annotation.RequestMethod",
      "io.netty.util.internal.logging.InternalLogLevel",
      "io.netty.util.ResourceLeakDetector",
      "io.netty.util.concurrent.DefaultPromise",
      "io.netty.buffer.CompositeByteBuf",
      "io.netty.channel.unix.Limits",
      "io.netty.channel.ChannelOutboundInvoker",
      "io.netty.buffer.PoolChunk",
      "io.netty.channel.ChannelOutboundBuffer$Entry",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup",
      "io.netty.channel.WriteBufferWaterMark",
      "io.netty.channel.socket.SocketChannelConfig",
      "io.netty.buffer.SizeClassesMetric",
      "io.netty.util.AbstractReferenceCounted",
      "org.testng.xml.XmlMethodSelector",
      "io.netty.util.internal.ObjectPool",
      "io.netty.channel.epoll.EpollSocketChannelConfig",
      "com.google.common.collect.Multimap",
      "io.netty.channel.DefaultChannelPipeline$HeadContext",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.util.DefaultAttributeMap",
      "io.netty.util.concurrent.EventExecutorChooserFactory$EventExecutorChooser",
      "io.netty.util.concurrent.FastThreadLocal",
      "io.netty.util.internal.OutOfDirectMemoryError",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$2",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$1",
      "io.netty.util.internal.IntegerHolder",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceFdTask",
      "io.netty.buffer.PoolThreadCache$MemoryRegionCache",
      "io.netty.util.concurrent.PromiseTask$SentinelRunnable",
      "io.netty.util.concurrent.EventExecutorGroup",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue$WaitStrategy",
      "io.netty.channel.ChannelInboundInvoker",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.channel.AbstractChannel$CloseFuture",
      "io.netty.util.concurrent.ThreadPerTaskExecutor",
      "io.netty.buffer.ByteBufUtil",
      "io.netty.buffer.PoolChunkListMetric",
      "io.netty.buffer.CompositeByteBuf$ByteWrapper",
      "com.fasterxml.jackson.annotation.JsonInclude",
      "io.netty.channel.ChannelHandler",
      "io.netty.util.internal.ObjectPool$Handle",
      "io.netty.channel.DefaultChannelPipeline$1",
      "org.mockserver.model.ObjectWithJsonToString"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ObjectLocation_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.ibm.watson.data.client.model.ObjectLocation",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "org.springframework.web.bind.annotation.RequestMethod",
      "org.springframework.context.annotation.ScopedProxyMode",
      "org.testng.xml.XmlSuite$ParallelMode",
      "org.testng.xml.XmlSuite$FailurePolicy",
      "org.testng.xml.XmlSuite",
      "io.netty.channel.ChannelHandlerAdapter",
      "io.netty.channel.ChannelOutboundHandlerAdapter",
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
      "io.netty.channel.epoll.EpollDatagramChannel",
      "io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods",
      "io.netty.channel.unix.Errors",
      "io.netty.channel.unix.FileDescriptor",
      "io.netty.channel.ChannelInboundHandlerAdapter",
      "io.netty.channel.local.LocalChannel",
      "io.netty.util.concurrent.AbstractFuture",
      "io.netty.channel.VoidChannelPromise",
      "io.netty.util.concurrent.DefaultPromise$CauseHolder",
      "io.netty.util.concurrent.DefaultPromise$StacklessCancellationException",
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
      "io.netty.channel.AbstractServerChannel",
      "io.netty.channel.local.LocalServerChannel",
      "org.mockserver.scheduler.Scheduler$SchedulerThreadFactory",
      "io.netty.util.concurrent.AbstractEventExecutorGroup",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup",
      "io.netty.util.concurrent.DefaultEventExecutorGroup",
      "io.netty.util.concurrent.AbstractEventExecutor",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$1",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$2",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor",
      "io.netty.util.concurrent.SingleThreadEventExecutor$1",
      "io.netty.util.concurrent.SingleThreadEventExecutor",
      "io.netty.util.concurrent.RejectedExecutionHandlers$1",
      "io.netty.util.concurrent.RejectedExecutionHandlers",
      "io.netty.util.concurrent.ThreadPerTaskExecutor",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory",
      "io.netty.util.concurrent.PromiseTask$SentinelRunnable",
      "io.netty.util.concurrent.PromiseTask",
      "io.netty.util.concurrent.ScheduledFutureTask",
      "io.netty.util.concurrent.GlobalEventExecutor$1",
      "io.netty.util.concurrent.GlobalEventExecutor$TaskRunner",
      "io.netty.util.concurrent.CompleteFuture",
      "io.netty.util.concurrent.FailedFuture",
      "io.netty.util.internal.DefaultPriorityQueue",
      "io.netty.util.concurrent.DefaultThreadFactory",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "io.netty.util.internal.InternalThreadLocalMap",
      "io.netty.util.concurrent.FastThreadLocal",
      "io.netty.util.internal.ThreadExecutorMap",
      "io.netty.util.internal.ThreadExecutorMap$3",
      "io.netty.util.concurrent.GlobalEventExecutor",
      "io.netty.util.concurrent.DefaultEventExecutor",
      "io.netty.util.internal.ThreadExecutorMap$1",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory$PowerOfTwoEventExecutorChooser",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup$1",
      "io.netty.channel.epoll.AbstractEpollServerChannel",
      "io.netty.channel.epoll.EpollServerSocketChannel",
      "io.netty.channel.ChannelDuplexHandler",
      "io.netty.handler.logging.LoggingHandler",
      "io.netty.util.internal.logging.AbstractInternalLogger$1",
      "io.netty.channel.epoll.AbstractEpollStreamChannel",
      "io.netty.channel.epoll.EpollSocketChannel",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor",
      "io.netty.util.concurrent.ImmediateEventExecutor$1",
      "io.netty.util.concurrent.ImmediateEventExecutor$2",
      "io.netty.util.concurrent.ImmediateEventExecutor",
      "io.netty.util.concurrent.SucceededFuture",
      "io.netty.util.concurrent.SingleThreadEventExecutor$4",
      "io.netty.util.internal.ThreadExecutorMap$2",
      "io.netty.channel.epoll.EpollServerDomainSocketChannel",
      "org.hsqldb.jdbc.JDBCDriver"
    );
  }
}
