/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 14 22:26:30 GMT 2021
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
public class ImportRuleResponse_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.ibm.watson.data.client.model.ImportRuleResponse"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ImportRuleResponse_ESTest_scaffolding.class.getClassLoader() ,
      "com.fasterxml.jackson.annotation.JsonProperty",
      "io.netty.util.internal.SystemPropertyUtil$1",
      "io.netty.channel.unix.DomainSocketChannelConfig",
      "io.netty.util.AttributeMap",
      "io.netty.util.internal.Cleaner",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL1Pad",
      "io.netty.util.concurrent.ScheduledFuture",
      "io.netty.util.internal.logging.LocationAwareSlf4JLogger",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.util.internal.ReflectionUtil",
      "io.netty.channel.socket.DatagramChannel",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup$1",
      "io.netty.channel.unix.DomainSocketAddress",
      "io.netty.channel.unix.Errors$NativeConnectException",
      "io.netty.util.concurrent.FastThreadLocalThread",
      "reactor.core.publisher.InnerProducer",
      "io.netty.util.concurrent.AbstractEventExecutorGroup",
      "io.netty.util.internal.ThreadLocalRandom",
      "io.netty.util.internal.ThreadExecutorMap",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe",
      "io.netty.channel.epoll.EpollServerChannelConfig",
      "io.netty.channel.ChannelOutboundHandlerAdapter",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue",
      "io.netty.channel.ChannelOutboundBuffer$MessageProcessor",
      "org.testng.xml.XmlSuite$FailurePolicy",
      "io.netty.util.internal.PlatformDependent0$3",
      "io.netty.util.internal.PlatformDependent0$4",
      "io.netty.util.internal.PlatformDependent0$5",
      "org.testng.IAttributes",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef",
      "io.netty.util.internal.PlatformDependent0$1",
      "io.netty.util.concurrent.DefaultProgressivePromise",
      "io.netty.util.internal.PlatformDependent0$2",
      "io.netty.channel.socket.ServerSocketChannelConfig",
      "reactor.core.Fuseable",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor",
      "org.testng.collections.SetMultiMap",
      "io.netty.util.internal.PlatformDependent0$8",
      "io.netty.util.internal.logging.InternalLogger",
      "org.testng.thread.IThreadWorkerFactory",
      "io.netty.util.concurrent.NonStickyEventExecutorGroup$NonStickyOrderedEventExecutor",
      "reactor.core.CorePublisher",
      "reactor.core.Scannable$Attr",
      "org.testng.collections.Maps",
      "io.netty.util.concurrent.EventExecutor",
      "io.netty.util.internal.PlatformDependent$1",
      "io.netty.util.internal.PlatformDependent$2",
      "io.netty.util.internal.PlatformDependent$4",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueProducerNodeRef",
      "reactor.core.Scannable",
      "io.netty.util.concurrent.EventExecutorChooserFactory",
      "io.netty.util.internal.LongCounter",
      "io.netty.util.internal.StringUtil",
      "org.testng.collections.MultiMap",
      "org.springframework.http.ReactiveHttpOutputMessage",
      "org.testng.IHookable",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "org.mockserver.scheduler.Scheduler",
      "io.netty.util.concurrent.ImmediateEventExecutor",
      "io.netty.channel.epoll.EpollServerSocketChannel",
      "org.testng.TestNG",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueConsumerIndexField",
      "com.ibm.watson.data.client.model.ImportRuleResponse",
      "io.netty.util.internal.ThrowableUtil",
      "io.netty.channel.ChannelMetadata",
      "io.netty.channel.ChannelFlushPromiseNotifier$FlushCheckpoint",
      "io.netty.util.Attribute",
      "io.netty.util.concurrent.GlobalEventExecutor$TaskRunner",
      "io.netty.util.concurrent.AbstractFuture",
      "io.netty.channel.ChannelOutboundHandler",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL2Pad",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "io.netty.util.ReferenceCounted",
      "io.netty.util.concurrent.DefaultFutureListeners",
      "org.springframework.http.HttpStatus",
      "io.netty.util.concurrent.DefaultEventExecutor",
      "io.netty.util.concurrent.SingleThreadEventExecutor$4",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueConsumerIndexField",
      "org.testng.internal.OverrideProcessor",
      "io.netty.util.concurrent.SingleThreadEventExecutor$1",
      "org.springframework.core.io.buffer.DataBufferFactory",
      "io.netty.util.concurrent.SingleThreadEventExecutor$3",
      "org.mockserver.scheduler.Scheduler$SchedulerThreadFactory",
      "io.netty.util.concurrent.Future",
      "io.netty.channel.epoll.EpollDatagramChannelConfig",
      "org.testng.xml.XmlClass",
      "io.netty.channel.epoll.EpollDatagramChannel$EpollDatagramChannelUnsafe",
      "io.netty.util.concurrent.DefaultThreadFactory",
      "org.testng.collections.Lists",
      "com.beust.jcommander.ParameterException",
      "reactor.core.publisher.Operators$LiftFunction",
      "io.netty.channel.epoll.EpollServerDomainSocketChannel",
      "io.netty.channel.MultithreadEventLoopGroup",
      "io.netty.buffer.ByteBufAllocator",
      "io.netty.channel.ChannelId",
      "io.netty.channel.epoll.AbstractEpollStreamChannel",
      "com.fasterxml.jackson.annotation.JacksonAnnotation",
      "io.netty.util.AbstractConstant",
      "io.netty.util.concurrent.GlobalEventExecutor",
      "io.netty.channel.unix.Socket",
      "org.springframework.http.HttpCookie",
      "org.testng.IInvokedMethodListener",
      "io.netty.channel.ChannelProgressiveFuture",
      "org.testng.IInjectorFactory",
      "io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods",
      "io.netty.util.internal.DefaultPriorityQueue",
      "io.netty.util.NettyRuntime$AvailableProcessorsHolder",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.util.concurrent.OrderedEventExecutor",
      "org.testng.xml.XmlMethodSelectors",
      "org.springframework.http.server.reactive.ServerHttpResponseDecorator",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor",
      "io.netty.util.internal.ThreadExecutorMap$1",
      "org.springframework.http.HttpMessage",
      "io.netty.util.internal.ThreadExecutorMap$2",
      "io.netty.channel.epoll.EpollDomainSocketChannel",
      "io.netty.util.internal.ThreadExecutorMap$3",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceInChannelTask",
      "io.netty.channel.ChannelHandlerAdapter",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceInTask",
      "org.springframework.http.HttpHeaders",
      "io.netty.channel.AbstractChannel$AbstractUnsafe",
      "io.netty.channel.EventLoop",
      "io.netty.util.internal.PriorityQueueNode",
      "io.netty.channel.epoll.EpollChannelConfig",
      "io.netty.util.internal.MacAddressUtil",
      "io.netty.channel.unix.PeerCredentials",
      "io.netty.util.internal.shaded.org.jctools.queues.SupportsIterator",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL3Pad",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad2",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad0",
      "io.netty.channel.DefaultFileRegion",
      "io.netty.channel.SingleThreadEventLoop",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad1",
      "org.testng.IMethodInterceptor",
      "org.testng.SuiteRunner",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL3Pad",
      "io.netty.util.internal.PriorityQueue",
      "io.netty.util.internal.InternalThreadLocalMap",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueue",
      "io.netty.channel.epoll.LinuxSocket",
      "io.netty.util.concurrent.AbstractEventExecutor",
      "io.netty.channel.ChannelHandlerContext",
      "io.netty.channel.unix.UnixChannel",
      "org.testng.IConfigurable",
      "io.netty.channel.ChannelFutureListener",
      "org.testng.internal.IConfiguration",
      "org.testng.thread.IExecutorFactory",
      "io.netty.util.concurrent.BlockingOperationException",
      "org.testng.internal.ReporterConfig",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerLimitField",
      "io.netty.channel.FileRegion",
      "org.reactivestreams.Subscriber",
      "io.netty.channel.unix.IovArray",
      "io.netty.channel.ChannelProgressivePromise",
      "io.netty.util.concurrent.DefaultPromise$LeanCancellationException",
      "io.netty.channel.EventLoopGroup",
      "reactor.core.publisher.InnerOperator",
      "io.netty.util.concurrent.GenericFutureListener",
      "org.springframework.core.io.buffer.DataBuffer",
      "io.netty.channel.Channel$Unsafe",
      "io.netty.channel.VoidChannelPromise",
      "reactor.core.Fuseable$ConditionalSubscriber",
      "io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators",
      "io.netty.util.internal.CleanerJava6$1",
      "org.reactivestreams.Subscription",
      "reactor.core.Fuseable$SynchronousSubscription",
      "org.springframework.util.Assert",
      "io.netty.util.concurrent.GlobalEventExecutor$1",
      "io.netty.util.AttributeKey",
      "io.netty.util.concurrent.ScheduledFutureTask",
      "io.netty.channel.unix.Errors$NativeIoException",
      "io.netty.util.concurrent.RejectedExecutionHandlers",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueConsumerNodeRef",
      "org.springframework.http.server.reactive.ServerHttpResponse",
      "io.netty.channel.epoll.EpollDomainSocketChannel$EpollDomainUnsafe",
      "io.netty.util.AsciiString",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerIndexField",
      "reactor.core.CoreSubscriber",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL2Pad",
      "org.testng.IAnnotationTransformer",
      "io.netty.util.concurrent.DefaultEventExecutorGroup",
      "org.testng.xml.XmlTest",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor$RunnableScheduledFutureTask",
      "io.netty.util.concurrent.RejectedExecutionHandler",
      "com.ibm.watson.data.client.model.ImportedRule",
      "io.netty.util.concurrent.GenericProgressiveFutureListener",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.util.concurrent.SucceededFuture",
      "org.testng.xml.XmlSuite",
      "org.testng.ITestNGListener",
      "reactor.core.publisher.Operators$MultiSubscriptionSubscriber",
      "io.netty.util.internal.shaded.org.jctools.queues.SpscLinkedQueue",
      "io.netty.util.NetUtilInitializations",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueMidPad",
      "io.netty.util.NettyRuntime",
      "io.netty.channel.ChannelPipeline",
      "io.netty.util.concurrent.DefaultPromise$CauseHolder",
      "io.netty.channel.ServerChannel",
      "reactor.core.publisher.Operators$ConditionalSubscriberAdapter",
      "io.netty.channel.ChannelException",
      "org.testng.xml.XmlSuite$ParallelMode",
      "io.netty.handler.logging.LogLevel",
      "io.netty.util.concurrent.ProgressivePromise",
      "io.netty.util.concurrent.NonStickyEventExecutorGroup",
      "io.netty.util.internal.PlatformDependent0$10",
      "io.netty.util.concurrent.ThreadProperties",
      "io.netty.util.Constant",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue",
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
      "io.netty.channel.socket.ServerSocketChannel",
      "io.netty.channel.epoll.AbstractEpollChannel",
      "io.netty.channel.unix.DomainSocketChannel",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueMidPad",
      "io.netty.util.internal.EmptyArrays",
      "io.netty.util.concurrent.ImmediateEventExecutor$2",
      "io.netty.util.concurrent.ImmediateEventExecutor$1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad2",
      "io.netty.util.NetUtilInitializations$NetworkIfaceAndInetAddress",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "org.testng.ITestObjectFactory",
      "io.netty.util.concurrent.Promise",
      "io.netty.util.concurrent.SingleThreadEventExecutor",
      "org.testng.internal.SuiteRunnerMap",
      "org.reactivestreams.Publisher",
      "io.netty.channel.DefaultEventLoopGroup",
      "org.testng.xml.IPostProcessor",
      "org.springframework.util.MultiValueMap",
      "reactor.core.publisher.Mono",
      "org.springframework.http.server.reactive.HttpHeadResponseDecorator",
      "com.fasterxml.jackson.annotation.JacksonAnnotationValue",
      "io.netty.channel.unix.FileDescriptor",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueueL0Pad",
      "io.netty.channel.Channel",
      "io.netty.util.concurrent.DefaultPromise$StacklessCancellationException",
      "org.testng.IDynamicGraph",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueConsumerNodeRef",
      "io.netty.util.internal.PlatformDependent$ThreadLocalRandomProvider",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory$PowerOfTwoEventExecutorChooser",
      "reactor.core.Fuseable$QueueSubscription",
      "io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil$IndexedQueue",
      "io.netty.channel.DefaultChannelConfig",
      "com.fasterxml.jackson.annotation.JsonInclude$Value",
      "io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerLimitField",
      "io.netty.channel.ChannelPromise",
      "io.netty.channel.epoll.AbstractEpollServerChannel",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueue",
      "io.netty.channel.epoll.AbstractEpollServerChannel$EpollServerSocketUnsafe",
      "io.netty.util.internal.ObjectUtil",
      "org.testng.CommandLineArgs",
      "io.netty.channel.DefaultChannelPromise",
      "io.netty.channel.DefaultChannelId",
      "io.netty.util.concurrent.FutureListener",
      "io.netty.util.internal.logging.InternalLogLevel",
      "org.testng.xml.XmlGroups",
      "io.netty.channel.ChannelOutboundBuffer",
      "io.netty.util.concurrent.DefaultPromise",
      "reactor.core.publisher.InnerConsumer",
      "io.netty.channel.epoll.EpollDomainSocketChannelConfig",
      "io.netty.channel.ChannelOutboundInvoker",
      "org.testng.internal.annotations.IAnnotationFinder",
      "io.netty.channel.DefaultChannelPipeline",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup",
      "org.testng.log4testng.Logger",
      "io.netty.channel.epoll.EpollServerSocketChannelConfig",
      "io.netty.util.DefaultAttributeMap$DefaultAttribute",
      "io.netty.util.AbstractReferenceCounted",
      "org.testng.xml.XmlMethodSelector",
      "org.testng.TestNGException",
      "reactor.core.publisher.Operators$ScalarSubscription",
      "org.testng.ITestListener",
      "io.netty.buffer.ByteBuf",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.channel.socket.DatagramChannelConfig",
      "io.netty.util.DefaultAttributeMap",
      "io.netty.util.concurrent.FastThreadLocal",
      "io.netty.util.concurrent.EventExecutorChooserFactory$EventExecutorChooser",
      "io.netty.channel.socket.DuplexChannel",
      "org.testng.collections.ListMultiMap",
      "org.testng.ISuite",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory$GenericEventExecutorChooser",
      "reactor.core.publisher.Operators$MonoSubscriber",
      "io.netty.util.internal.OutOfDirectMemoryError",
      "org.springframework.http.ResponseCookie",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$2",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$1",
      "io.netty.util.internal.IntegerHolder",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.SpscLinkedAtomicQueue",
      "com.ibm.watson.data.client.model.FailedRule",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceFdTask",
      "reactor.core.publisher.Operators",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor$NonNotifyRunnable",
      "org.testng.ITestRunnerFactory",
      "io.netty.util.NetUtil",
      "io.netty.util.concurrent.PromiseTask$SentinelRunnable",
      "io.netty.util.concurrent.EventExecutorGroup",
      "io.netty.channel.ChannelInboundInvoker",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory",
      "io.netty.channel.ChannelFuture",
      "io.netty.util.internal.SystemPropertyUtil",
      "reactor.core.publisher.Operators$DrainSubscriber",
      "io.netty.channel.AbstractChannel$CloseFuture",
      "io.netty.util.concurrent.ThreadPerTaskExecutor",
      "io.netty.channel.unix.ServerDomainSocketChannel",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL1Pad",
      "io.netty.channel.ChannelConfig",
      "com.fasterxml.jackson.annotation.JsonInclude",
      "io.netty.channel.ChannelHandler",
      "io.netty.util.concurrent.FailedFuture"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ImportRuleResponse_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.ibm.watson.data.client.model.ImportRuleResponse",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "com.ibm.watson.data.client.model.ImportedRule",
      "com.ibm.watson.data.client.model.FailedRule",
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
      "org.testng.xml.XmlSuite$ParallelMode",
      "org.testng.xml.XmlSuite$FailurePolicy",
      "org.testng.xml.XmlSuite",
      "io.netty.channel.ChannelHandlerAdapter",
      "io.netty.channel.ChannelOutboundHandlerAdapter",
      "org.springframework.http.server.reactive.ServerHttpResponseDecorator",
      "org.springframework.util.Assert",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor",
      "io.netty.util.concurrent.DefaultThreadFactory",
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
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor$RunnableScheduledFutureTask",
      "io.netty.util.concurrent.FastThreadLocalRunnable",
      "io.netty.util.concurrent.FastThreadLocalThread",
      "io.netty.util.internal.logging.InternalLogLevel",
      "io.netty.handler.logging.LogLevel",
      "org.mockserver.scheduler.Scheduler$SchedulerThreadFactory",
      "io.netty.util.concurrent.SingleThreadEventExecutor$1",
      "io.netty.util.concurrent.SingleThreadEventExecutor",
      "io.netty.util.concurrent.DefaultEventExecutor",
      "io.netty.util.concurrent.ThreadPerTaskExecutor",
      "io.netty.util.concurrent.RejectedExecutionHandlers$1",
      "io.netty.util.concurrent.RejectedExecutionHandlers",
      "io.netty.util.internal.ThreadExecutorMap$1",
      "org.testng.collections.Lists",
      "org.testng.collections.Maps",
      "org.testng.log4testng.Logger",
      "org.testng.TestNG",
      "io.netty.util.concurrent.ImmediateEventExecutor$1",
      "io.netty.util.concurrent.ImmediateEventExecutor$2",
      "io.netty.util.concurrent.ImmediateEventExecutor",
      "io.netty.channel.epoll.AbstractEpollServerChannel",
      "io.netty.channel.epoll.EpollServerSocketChannel",
      "org.springframework.http.server.reactive.HttpHeadResponseDecorator",
      "io.netty.channel.epoll.EpollDatagramChannel",
      "io.netty.util.concurrent.AbstractEventExecutorGroup",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup",
      "io.netty.util.concurrent.DefaultEventExecutorGroup",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory$PowerOfTwoEventExecutorChooser",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup$1",
      "io.netty.util.concurrent.SingleThreadEventExecutor$4",
      "io.netty.util.internal.ThreadExecutorMap$2",
      "io.netty.util.concurrent.NonStickyEventExecutorGroup",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory$GenericEventExecutorChooser",
      "io.netty.util.NettyRuntime$AvailableProcessorsHolder",
      "io.netty.util.NettyRuntime",
      "io.netty.channel.MultithreadEventLoopGroup",
      "io.netty.channel.DefaultEventLoopGroup",
      "io.netty.channel.SingleThreadEventLoop",
      "io.netty.channel.DefaultEventLoop",
      "io.netty.util.concurrent.SingleThreadEventExecutor$3",
      "reactor.core.Scannable",
      "reactor.core.publisher.Operators$MonoSubscriber",
      "io.netty.channel.DefaultChannelPromise",
      "io.netty.util.concurrent.SucceededFuture",
      "io.netty.channel.VoidChannelPromise",
      "io.netty.channel.epoll.EpollServerDomainSocketChannel",
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
      "io.netty.util.concurrent.DefaultProgressivePromise"
    );
  }
}
