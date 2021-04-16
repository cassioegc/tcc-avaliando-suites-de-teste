/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 15 00:55:59 GMT 2021
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
public class UpdatableDataClassEntity_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.ibm.watson.data.client.model.UpdatableDataClassEntity"; 
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
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(UpdatableDataClassEntity_ESTest_scaffolding.class.getClassLoader() ,
      "org.testng.internal.annotations.IBaseBeforeAfter",
      "org.springframework.web.server.adapter.ForwardedHeaderTransformer",
      "io.netty.channel.ChannelInboundHandlerAdapter",
      "org.testng.xml.DefaultXmlWeaver",
      "org.testng.xml.XmlScript",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup$1",
      "org.testng.internal.ITestInvoker",
      "org.testng.internal.annotations.IAfterSuite",
      "io.netty.channel.unix.Errors$NativeConnectException",
      "io.netty.util.concurrent.FastThreadLocalThread",
      "reactor.core.publisher.InnerProducer",
      "io.netty.util.internal.ThreadLocalRandom",
      "io.netty.util.internal.ThreadExecutorMap",
      "org.testng.internal.annotations.IgnoreListener",
      "org.testng.internal.annotations.TestAnnotation",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe",
      "org.testng.IMethodInstance",
      "org.testng.xml.XmlDependencies",
      "io.netty.channel.ChannelOutboundBuffer$MessageProcessor",
      "org.testng.IAttributes",
      "io.netty.util.concurrent.DefaultProgressivePromise",
      "io.netty.channel.socket.ServerSocketChannelConfig",
      "org.testng.junit.JUnit3TestMethod",
      "org.testng.ITestNGMethod",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor",
      "org.testng.junit.JUnit4SpockMethod",
      "org.springframework.http.server.reactive.ServerHttpRequestDecorator",
      "reactor.core.CorePublisher",
      "org.testng.TestRunner",
      "reactor.core.Scannable$Attr",
      "io.netty.util.concurrent.EventExecutorChooserFactory",
      "org.testng.internal.MethodHelper",
      "io.netty.util.internal.StringUtil",
      "org.testng.collections.MultiMap",
      "org.testng.internal.GroupConfigMethodArguments",
      "org.testng.DataProviderInvocationException",
      "org.testng.internal.TestMethodArguments",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "org.testng.TestNG",
      "org.testng.IInvokedMethod",
      "io.netty.util.internal.ThrowableUtil",
      "io.netty.channel.ChannelFlushPromiseNotifier$FlushCheckpoint",
      "org.testng.ISuiteListener",
      "io.netty.channel.CombinedChannelDuplexHandler",
      "io.netty.channel.ChannelOutboundHandler",
      "org.testng.internal.annotations.IAfterGroups",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "org.testng.internal.annotations.JDK15AnnotationFinder",
      "org.testng.internal.ITestResultNotifier",
      "org.testng.ITestClassFinder",
      "io.netty.util.concurrent.DefaultEventExecutor",
      "io.netty.util.concurrent.SingleThreadEventExecutor$4",
      "org.testng.internal.TestListenerHelper",
      "io.netty.util.concurrent.SingleThreadEventExecutor$1",
      "org.testng.internal.Configuration",
      "org.testng.xml.XmlWeaver",
      "io.netty.util.concurrent.Future",
      "com.ibm.watson.data.client.model.enums.GlossaryObjectState",
      "org.testng.xml.XmlClass",
      "io.netty.util.concurrent.DefaultThreadFactory",
      "org.testng.collections.Lists",
      "org.testng.internal.annotations.IDataProvidable",
      "com.beust.jcommander.ParameterException",
      "org.springframework.util.LinkedCaseInsensitiveMap$EntrySetIterator",
      "org.testng.ITestMethodFinder",
      "io.netty.buffer.ByteBufAllocator",
      "io.netty.channel.epoll.AbstractEpollStreamChannel",
      "org.springframework.http.HttpCookie",
      "io.netty.channel.ChannelProgressiveFuture",
      "io.netty.util.internal.DefaultPriorityQueue",
      "org.testng.internal.annotations.BaseAnnotation",
      "org.testng.util.Strings",
      "io.netty.handler.logging.ByteBufFormat",
      "org.testng.thread.ITestNGThreadPoolExecutor",
      "org.testng.IDataProviderInterceptor",
      "org.springframework.util.LinkedCaseInsensitiveMap$KeySetIterator",
      "io.netty.util.internal.ThreadExecutorMap$1",
      "org.testng.IMethodSelectorContext",
      "org.springframework.http.HttpMessage",
      "io.netty.util.internal.ThreadExecutorMap$2",
      "io.netty.util.internal.ThreadExecutorMap$3",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceInTask",
      "org.testng.IResultMap",
      "org.springframework.http.HttpHeaders",
      "io.netty.util.internal.PriorityQueueNode",
      "org.testng.internal.annotations.IAnnotationTransformer",
      "io.netty.util.concurrent.PromiseTask$RunnableAdapter",
      "io.netty.channel.DefaultFileRegion",
      "io.netty.channel.SingleThreadEventLoop",
      "org.testng.internal.annotations.DefaultAnnotationTransformer",
      "io.netty.util.internal.InternalThreadLocalMap",
      "org.testng.internal.BaseInvoker",
      "io.netty.channel.ChannelHandlerContext",
      "io.netty.channel.unix.UnixChannel",
      "org.testng.IRetryAnalyzer",
      "io.netty.channel.ChannelFutureListener",
      "org.testng.internal.IConfiguration",
      "io.netty.util.concurrent.BlockingOperationException",
      "io.netty.channel.FileRegion",
      "org.reactivestreams.Subscriber",
      "org.testng.internal.TestListenerHelper$ListenerHolder",
      "org.testng.SuiteRunner$DefaultTestRunnerFactory",
      "io.netty.util.concurrent.DefaultPromise$LeanCancellationException",
      "io.netty.channel.EventLoopGroup",
      "org.testng.internal.ObjectFactoryImpl",
      "reactor.core.publisher.InnerOperator",
      "org.springframework.http.server.PathContainer",
      "io.netty.channel.Channel$Unsafe",
      "org.testng.annotations.Guice",
      "io.netty.channel.VoidChannelPromise",
      "org.testng.PreserveOrderMethodInterceptor",
      "org.testng.internal.BaseClassFinder",
      "org.springframework.http.ReactiveHttpInputMessage",
      "org.springframework.util.LinkedCaseInsensitiveMap$KeySet",
      "org.reactivestreams.Subscription",
      "reactor.core.Fuseable$SynchronousSubscription",
      "org.testng.internal.ITestInvoker$FailureContext",
      "org.springframework.util.Assert",
      "io.netty.channel.unix.Errors$NativeIoException",
      "org.testng.internal.Utils$StackTraceType",
      "org.springframework.http.server.reactive.ServerHttpResponse",
      "org.springframework.http.server.reactive.SslInfo",
      "org.testng.internal.collections.Pair",
      "org.hsqldb.jdbc.JDBCDriver",
      "reactor.core.CoreSubscriber",
      "com.ibm.watson.data.client.model.NewDataClassEntity",
      "org.testng.internal.annotations.IBaseBeforeAfterMethod",
      "io.netty.util.concurrent.DefaultEventExecutorGroup",
      "org.testng.internal.Systematiser",
      "org.hsqldb.jdbc.JDBCDriver$1",
      "io.netty.util.concurrent.GenericProgressiveFutureListener",
      "org.testng.IDataProviderListener",
      "org.testng.internal.annotations.TestOrConfiguration",
      "reactor.core.publisher.Operators$MultiSubscriptionSubscriber",
      "io.netty.channel.ChannelPipeline",
      "reactor.core.publisher.Operators$ConditionalSubscriberAdapter",
      "io.netty.channel.ChannelException",
      "io.netty.handler.logging.LogLevel",
      "org.testng.xml.XmlSuite$ParallelMode",
      "org.springframework.util.CollectionUtils",
      "io.netty.util.concurrent.ProgressivePromise",
      "com.ibm.watson.data.client.model.NewRelationship",
      "org.testng.internal.ConstructorOrMethod",
      "org.testng.internal.annotations.IBeforeGroups",
      "io.netty.util.Constant",
      "org.testng.internal.Attributes",
      "io.netty.util.concurrent.RejectedExecutionHandlers$1",
      "com.ibm.watson.data.client.model.UpdatableDataClassEntity",
      "io.netty.util.concurrent.CompleteFuture",
      "org.testng.internal.DefaultListenerFactory",
      "io.netty.channel.epoll.EpollSocketChannel",
      "io.netty.util.concurrent.ImmediateEventExecutor$2",
      "io.netty.util.concurrent.ImmediateEventExecutor$1",
      "org.testng.xml.XmlUtils",
      "org.testng.ClassMethodMap",
      "org.testng.internal.Arguments",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "org.testng.ITestObjectFactory",
      "io.netty.util.concurrent.SingleThreadEventExecutor",
      "org.testng.internal.SuiteRunnerMap",
      "org.reactivestreams.Publisher",
      "org.springframework.util.LinkedCaseInsensitiveMap$ValuesIterator",
      "org.testng.annotations.ITestAnnotation",
      "io.netty.channel.Channel",
      "org.springframework.util.LinkedCaseInsensitiveMap$1",
      "io.netty.util.concurrent.DefaultPromise$StacklessCancellationException",
      "org.testng.internal.annotations.IAfterClass",
      "org.testng.internal.TestInvoker",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "org.testng.internal.Graph$Node",
      "reactor.core.Fuseable$QueueSubscription",
      "org.testng.IObjectFactory",
      "org.testng.annotations.Ignore",
      "com.google.inject.Module",
      "org.testng.IExecutionVisualiser",
      "org.testng.reporters.RuntimeBehavior",
      "org.testng.internal.NoOpTestClass",
      "io.netty.channel.DefaultChannelConfig",
      "org.testng.IObjectFactory2",
      "org.testng.internal.RunInfo",
      "org.springframework.http.HttpRequest",
      "org.testng.TestRunner$ConfigurationListener",
      "io.netty.channel.ChannelPromise",
      "io.netty.channel.epoll.AbstractEpollServerChannel$EpollServerSocketUnsafe",
      "org.testng.CommandLineArgs",
      "org.springframework.http.server.reactive.ServerHttpRequest",
      "io.netty.channel.ChannelDuplexHandler",
      "org.testng.annotations.ITestOrConfiguration",
      "org.testng.xml.XmlRun",
      "org.testng.internal.ResultMap",
      "org.testng.junit.JUnit4TestClass",
      "org.testng.xml.XmlGroups",
      "io.netty.channel.ChannelOutboundBuffer",
      "org.testng.internal.TestInvoker$StatusHolder",
      "io.netty.channel.DefaultChannelPipeline",
      "org.testng.internal.annotations.IBeforeMethod",
      "io.netty.channel.epoll.EpollServerSocketChannelConfig",
      "org.testng.log4testng.Logger",
      "org.testng.internal.MethodArguments",
      "io.netty.util.DefaultAttributeMap$DefaultAttribute",
      "org.testng.IExecutionListener",
      "io.netty.util.concurrent.ImmediateEventExecutor$ImmediateProgressivePromise",
      "org.testng.TestNGException",
      "org.springframework.util.LinkedCaseInsensitiveMap$EntrySet",
      "reactor.core.publisher.Operators$ScalarSubscription",
      "io.netty.buffer.ByteBuf",
      "io.netty.channel.socket.DuplexChannel",
      "org.testng.ISuite",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory$GenericEventExecutorChooser",
      "org.testng.internal.annotations.IBeforeClass",
      "org.testng.ITestRunnerFactory",
      "org.testng.internal.IResultListener",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory",
      "org.testng.internal.annotations.DisabledRetryAnalyzer",
      "io.netty.channel.ChannelFuture",
      "com.google.inject.Injector",
      "org.testng.internal.MethodGroupsHelper",
      "io.netty.channel.ChannelConfig",
      "org.testng.IExpectedExceptionsHolder",
      "io.netty.util.concurrent.FailedFuture",
      "com.fasterxml.jackson.annotation.JsonProperty",
      "io.netty.util.internal.SystemPropertyUtil$1",
      "io.netty.util.AttributeMap",
      "org.testng.annotations.IConfigurationAnnotation",
      "io.netty.util.concurrent.ScheduledFuture",
      "io.netty.util.internal.logging.LocationAwareSlf4JLogger",
      "io.netty.buffer.ByteBufHolder",
      "org.testng.internal.ClassInfoMap",
      "org.testng.internal.IInvoker",
      "org.testng.xml.IWeaveXml",
      "org.testng.junit.JUnit4TestMethod",
      "org.testng.IConfigurationListener",
      "org.testng.junit.JUnit4ConfigurationMethod",
      "org.testng.reporters.IBuffer",
      "io.netty.util.concurrent.AbstractEventExecutorGroup",
      "org.testng.GuiceHelper",
      "io.netty.channel.epoll.EpollServerChannelConfig",
      "org.testng.annotations.IAnnotation",
      "org.testng.xml.XmlSuite$FailurePolicy",
      "org.testng.internal.ConfigInvoker",
      "org.testng.internal.RuntimeBehavior",
      "reactor.core.Fuseable",
      "org.testng.collections.SetMultiMap",
      "io.netty.util.internal.logging.InternalLogger",
      "org.testng.thread.IThreadWorkerFactory",
      "io.netty.util.concurrent.NonStickyEventExecutorGroup$NonStickyOrderedEventExecutor",
      "org.testng.internal.IConfigInvoker",
      "org.testng.collections.Maps",
      "io.netty.util.concurrent.EventExecutor",
      "reactor.core.Scannable",
      "org.springframework.util.LinkedCaseInsensitiveMap",
      "org.springframework.http.server.RequestPath",
      "org.testng.ITestResult",
      "org.springframework.http.ReactiveHttpOutputMessage",
      "org.testng.IHookable",
      "org.mockserver.scheduler.Scheduler",
      "io.netty.channel.epoll.EpollServerSocketChannel",
      "io.netty.util.concurrent.ImmediateEventExecutor",
      "org.testng.xml.XmlInclude",
      "org.testng.internal.Systematiser$Order",
      "io.netty.channel.ChannelMetadata",
      "io.netty.util.Attribute",
      "io.netty.util.concurrent.GlobalEventExecutor$TaskRunner",
      "org.testng.TestException",
      "io.netty.util.concurrent.AbstractFuture",
      "org.springframework.http.HttpMethod",
      "io.netty.util.ReferenceCounted",
      "org.testng.internal.Utils",
      "io.netty.util.concurrent.DefaultFutureListeners",
      "reactor.core.publisher.Flux",
      "org.testng.internal.IMethodRunner",
      "org.springframework.http.HttpStatus",
      "org.testng.internal.OverrideProcessor",
      "org.springframework.core.io.buffer.DataBufferFactory",
      "org.testng.internal.ConfigurationGroupMethods",
      "io.netty.channel.epoll.EpollTcpInfo",
      "org.mockserver.scheduler.Scheduler$SchedulerThreadFactory",
      "org.testng.TestListenerAdapter",
      "reactor.core.publisher.Operators$LiftFunction",
      "org.testng.annotations.IFactoryAnnotation",
      "io.netty.channel.socket.DuplexChannelConfig",
      "io.netty.channel.ChannelId",
      "org.testng.internal.ClassHelper",
      "org.testng.internal.thread.ThreadExecutionException",
      "com.fasterxml.jackson.annotation.JacksonAnnotation",
      "io.netty.util.AbstractConstant",
      "org.testng.internal.annotations.IBeforeTest",
      "io.netty.util.concurrent.GlobalEventExecutor",
      "io.netty.channel.unix.Socket",
      "org.testng.IInvokedMethodListener",
      "org.testng.reporters.XMLUtils",
      "org.testng.IInjectorFactory",
      "io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods",
      "org.testng.internal.GroupsHelper",
      "io.netty.util.concurrent.OrderedEventExecutor",
      "org.testng.xml.XmlMethodSelectors",
      "org.testng.internal.annotations.IAfterTest",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor",
      "org.springframework.http.server.reactive.ServerHttpResponseDecorator",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceInChannelTask",
      "org.springframework.util.LinkedCaseInsensitiveMap$EntryIterator",
      "org.testng.internal.XmlMethodSelector",
      "io.netty.channel.ChannelHandlerAdapter",
      "org.testng.ITestContext",
      "org.testng.IInstanceInfo",
      "org.testng.junit.JUnitTestClass",
      "io.netty.channel.AbstractChannel$AbstractUnsafe",
      "io.netty.channel.EventLoop",
      "io.netty.channel.epoll.EpollChannelConfig",
      "org.testng.reporters.Tag",
      "io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext",
      "com.google.inject.Stage",
      "org.testng.internal.ConfigMethodArguments",
      "org.testng.IMethodInterceptor",
      "org.testng.SuiteRunner",
      "io.netty.handler.logging.LoggingHandler",
      "org.testng.internal.MethodSelectorDescriptor",
      "io.netty.util.internal.PriorityQueue",
      "io.netty.channel.epoll.LinuxSocket",
      "io.netty.util.concurrent.AbstractEventExecutor",
      "org.testng.IConfigurable",
      "org.testng.IReporter",
      "org.testng.internal.FactoryMethod",
      "org.testng.thread.IExecutorFactory",
      "org.testng.internal.ReporterConfig",
      "org.testng.ITestNGListenerFactory",
      "io.netty.channel.unix.IovArray",
      "io.netty.channel.ChannelProgressivePromise",
      "com.ibm.watson.data.client.model.CustomAttributeValueObject",
      "io.netty.util.concurrent.GenericFutureListener",
      "org.testng.internal.MethodHelper$MatchResults",
      "reactor.core.Fuseable$ConditionalSubscriber",
      "com.fasterxml.jackson.annotation.JsonCreator",
      "io.netty.util.concurrent.GlobalEventExecutor$1",
      "io.netty.util.AttributeKey",
      "io.netty.util.concurrent.ScheduledFutureTask",
      "io.netty.util.concurrent.RejectedExecutionHandlers",
      "org.testng.internal.IParameterInfo",
      "com.ibm.watson.data.client.model.CustomAttribute",
      "org.testng.internal.Graph",
      "io.netty.channel.ChannelInboundHandler",
      "org.testng.internal.ClonedMethod",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "org.testng.internal.TestResult",
      "org.testng.IAnnotationTransformer",
      "org.testng.xml.XmlTest",
      "io.netty.channel.socket.SocketChannel",
      "io.netty.util.concurrent.RejectedExecutionHandler",
      "org.testng.IDataProviderMethod",
      "org.testng.internal.ConfigurationMethod",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.util.concurrent.SucceededFuture",
      "org.testng.internal.TestNGMethod",
      "io.netty.channel.ChannelHandler$Sharable",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "org.testng.xml.XmlSuite",
      "org.testng.SuiteRunState",
      "org.testng.ITestNGListener",
      "io.netty.util.concurrent.DefaultPromise$CauseHolder",
      "org.springframework.util.LinkedCaseInsensitiveMap$Values",
      "org.testng.internal.GuiceBackedInjectorFactory",
      "io.netty.channel.ServerChannel",
      "org.testng.ITestClass",
      "org.testng.SuiteRunner$ProxyTestRunnerFactory",
      "org.testng.internal.thread.DefaultThreadPoolExecutorFactory",
      "org.testng.internal.IResultListener2",
      "io.netty.util.concurrent.NonStickyEventExecutorGroup",
      "io.netty.util.concurrent.ThreadProperties",
      "io.netty.channel.DefaultEventLoop",
      "io.netty.util.concurrent.ProgressiveFuture",
      "io.netty.channel.unix.Errors",
      "io.netty.channel.AbstractChannel",
      "io.netty.util.concurrent.FastThreadLocalRunnable",
      "io.netty.util.concurrent.PromiseTask",
      "io.netty.util.internal.logging.AbstractInternalLogger$1",
      "io.netty.channel.socket.ServerSocketChannel",
      "io.netty.channel.epoll.AbstractEpollChannel",
      "org.testng.annotations.CustomAttribute",
      "org.testng.internal.BaseTestMethod",
      "org.testng.internal.Invoker",
      "io.netty.util.concurrent.Promise",
      "org.testng.internal.annotations.IBeforeSuite",
      "org.testng.xml.IPostProcessor",
      "org.springframework.util.MultiValueMap",
      "reactor.core.publisher.Mono",
      "com.fasterxml.jackson.annotation.JacksonAnnotationValue",
      "io.netty.channel.unix.FileDescriptor",
      "org.testng.internal.invokers.InvokedMethodListenerMethod",
      "org.testng.internal.TestListenerHelper$ListenerInvocationException",
      "org.testng.IDynamicGraph",
      "org.testng.reporters.Buffer",
      "org.springframework.http.server.reactive.ServerHttpRequest$Builder",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory$PowerOfTwoEventExecutorChooser",
      "io.netty.channel.epoll.EpollSocketChannel$EpollSocketChannelUnsafe",
      "org.testng.reporters.XMLStringBuffer",
      "org.testng.reporters.FileStringBuffer",
      "org.testng.internal.InvokedMethod",
      "org.testng.IMethodSelector",
      "org.testng.annotations.IParameterizable",
      "com.fasterxml.jackson.annotation.JsonInclude$Value",
      "io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe",
      "io.netty.channel.epoll.AbstractEpollServerChannel",
      "org.testng.xml.XmlDefine",
      "io.netty.util.internal.ObjectUtil",
      "io.netty.channel.DefaultChannelPromise",
      "org.testng.IClass",
      "io.netty.util.concurrent.FutureListener",
      "io.netty.util.internal.logging.InternalLogLevel",
      "io.netty.util.concurrent.DefaultPromise",
      "org.testng.internal.annotations.JDK15TagFactory",
      "reactor.core.publisher.InnerConsumer",
      "io.netty.channel.ChannelOutboundInvoker",
      "org.testng.internal.ExpectedExceptionsHolder",
      "io.netty.channel.CombinedChannelDuplexHandler$1",
      "org.testng.internal.annotations.IAnnotationFinder",
      "org.testng.junit.JUnit3TestClass",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup",
      "org.testng.internal.TestNGClassFinder",
      "org.testng.internal.Systematiser$4",
      "io.netty.channel.socket.SocketChannelConfig",
      "org.testng.internal.Systematiser$3",
      "org.testng.internal.annotations.ConfigurationAnnotation",
      "io.netty.util.AbstractReferenceCounted",
      "org.testng.xml.XmlMethodSelector",
      "io.netty.channel.epoll.EpollSocketChannelConfig",
      "org.testng.ITestListener",
      "io.netty.util.internal.logging.Slf4JLogger",
      "com.ibm.watson.data.client.model.DataClassEntity",
      "io.netty.util.DefaultAttributeMap",
      "io.netty.util.concurrent.FastThreadLocal",
      "io.netty.util.concurrent.EventExecutorChooserFactory$EventExecutorChooser",
      "org.testng.collections.ListMultiMap",
      "org.testng.internal.annotations.JDK15TagFactory$Default",
      "reactor.core.publisher.Operators$MonoSubscriber",
      "org.springframework.http.ResponseCookie",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$2",
      "io.netty.util.concurrent.AbstractScheduledEventExecutor$1",
      "io.netty.util.internal.IntegerHolder",
      "org.testng.internal.annotations.IAfterMethod",
      "io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceFdTask",
      "reactor.core.publisher.Operators",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor$NonNotifyRunnable",
      "io.netty.util.concurrent.PromiseTask$SentinelRunnable",
      "io.netty.util.concurrent.EventExecutorGroup",
      "io.netty.channel.ChannelInboundInvoker",
      "org.testng.DataProviderHolder",
      "org.testng.internal.TestNGMethodFinder",
      "org.testng.junit.JUnitTestMethod",
      "io.netty.util.internal.SystemPropertyUtil",
      "reactor.core.publisher.Operators$DrainSubscriber",
      "io.netty.channel.AbstractChannel$CloseFuture",
      "io.netty.util.concurrent.ThreadPerTaskExecutor",
      "org.testng.internal.TestNGMethodFinder$MethodType",
      "com.fasterxml.jackson.annotation.JsonInclude",
      "io.netty.channel.ChannelHandler",
      "org.testng.collections.Sets"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(UpdatableDataClassEntity_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.ibm.watson.data.client.model.DataClassEntity",
      "com.ibm.watson.data.client.model.NewDataClassEntity",
      "com.ibm.watson.data.client.model.UpdatableDataClassEntity",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
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
      "io.netty.channel.epoll.EpollSocketChannel",
      "io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods",
      "io.netty.channel.unix.Errors",
      "io.netty.channel.unix.FileDescriptor",
      "org.springframework.util.LinkedCaseInsensitiveMap",
      "org.springframework.util.LinkedCaseInsensitiveMap$1",
      "org.springframework.util.CollectionUtils",
      "org.springframework.util.LinkedCaseInsensitiveMap$KeySet",
      "org.springframework.web.server.adapter.ForwardedHeaderTransformer",
      "org.springframework.http.server.reactive.ServerHttpRequestDecorator",
      "org.springframework.util.Assert",
      "org.springframework.util.LinkedCaseInsensitiveMap$EntryIterator",
      "org.springframework.util.LinkedCaseInsensitiveMap$KeySetIterator",
      "com.ibm.watson.data.client.model.CustomAttribute",
      "com.ibm.watson.data.client.model.NewRelationship",
      "com.ibm.watson.data.client.model.CustomAttributeValueObject",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor",
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
      "io.netty.util.concurrent.DefaultThreadFactory",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "io.netty.util.internal.InternalThreadLocalMap",
      "io.netty.util.concurrent.FastThreadLocal",
      "io.netty.util.internal.ThreadExecutorMap",
      "io.netty.util.internal.ThreadExecutorMap$3",
      "io.netty.util.concurrent.GlobalEventExecutor",
      "org.hsqldb.jdbc.JDBCDriver",
      "io.netty.channel.ChannelHandlerAdapter",
      "io.netty.channel.ChannelInboundHandlerAdapter",
      "io.netty.channel.ChannelDuplexHandler",
      "io.netty.handler.logging.LoggingHandler",
      "io.netty.channel.epoll.AbstractEpollServerChannel",
      "io.netty.channel.epoll.EpollServerSocketChannel",
      "io.netty.util.internal.logging.AbstractInternalLogger$1",
      "io.netty.util.concurrent.DefaultProgressivePromise",
      "io.netty.channel.CombinedChannelDuplexHandler",
      "io.netty.util.concurrent.SingleThreadEventExecutor$1",
      "io.netty.util.concurrent.SingleThreadEventExecutor",
      "io.netty.util.concurrent.DefaultEventExecutor",
      "io.netty.util.concurrent.ThreadPerTaskExecutor",
      "io.netty.util.concurrent.RejectedExecutionHandlers$1",
      "io.netty.util.concurrent.RejectedExecutionHandlers",
      "io.netty.util.internal.ThreadExecutorMap$1",
      "org.testng.xml.XmlSuite$ParallelMode",
      "org.testng.xml.XmlSuite$FailurePolicy",
      "org.testng.xml.XmlSuite",
      "org.testng.internal.annotations.BaseAnnotation",
      "org.testng.internal.annotations.TestOrConfiguration",
      "org.testng.internal.annotations.ConfigurationAnnotation",
      "org.mockserver.scheduler.Scheduler$SchedulerThreadFactory",
      "io.netty.channel.SingleThreadEventLoop",
      "io.netty.channel.DefaultEventLoop",
      "io.netty.util.concurrent.ImmediateEventExecutor$1",
      "io.netty.util.concurrent.ImmediateEventExecutor$2",
      "io.netty.util.concurrent.ImmediateEventExecutor",
      "io.netty.util.concurrent.ImmediateEventExecutor$ImmediateProgressivePromise",
      "org.testng.internal.annotations.JDK15AnnotationFinder",
      "org.testng.internal.annotations.JDK15TagFactory",
      "org.testng.internal.Configuration",
      "org.testng.collections.Maps",
      "org.testng.internal.thread.DefaultThreadPoolExecutorFactory",
      "org.testng.internal.GuiceBackedInjectorFactory",
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
      "org.testng.xml.XmlTest",
      "org.testng.TestRunner",
      "org.testng.GuiceHelper",
      "org.testng.TestRunner$ConfigurationListener",
      "org.testng.internal.XmlMethodSelector",
      "org.testng.collections.MultiMap",
      "org.testng.collections.ListMultiMap",
      "org.testng.internal.ResultMap",
      "org.testng.internal.RunInfo",
      "reactor.core.Scannable",
      "reactor.core.publisher.Operators$MonoSubscriber",
      "io.netty.util.concurrent.AbstractEventExecutorGroup",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup",
      "io.netty.util.concurrent.DefaultEventExecutorGroup",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory",
      "io.netty.util.concurrent.DefaultEventExecutorChooserFactory$PowerOfTwoEventExecutorChooser",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup$1",
      "io.netty.util.concurrent.SingleThreadEventExecutor$4",
      "io.netty.util.internal.ThreadExecutorMap$2",
      "io.netty.util.concurrent.UnorderedThreadPoolEventExecutor$NonNotifyRunnable",
      "io.netty.util.concurrent.FastThreadLocalRunnable",
      "io.netty.util.concurrent.FastThreadLocalThread",
      "io.netty.util.concurrent.SucceededFuture",
      "org.testng.internal.annotations.IgnoreListener",
      "org.testng.internal.annotations.DefaultAnnotationTransformer",
      "org.testng.TestNG",
      "org.testng.PreserveOrderMethodInterceptor",
      "org.testng.internal.Invoker",
      "org.testng.internal.BaseInvoker",
      "org.testng.internal.ConfigInvoker",
      "org.testng.internal.TestInvoker",
      "org.testng.internal.GroupsHelper",
      "org.testng.internal.MethodSelectorDescriptor",
      "org.testng.internal.ClassInfoMap",
      "org.testng.internal.BaseClassFinder",
      "org.testng.internal.TestNGClassFinder",
      "org.testng.internal.ObjectFactoryImpl",
      "org.testng.internal.TestNGMethodFinder",
      "org.testng.internal.MethodGroupsHelper",
      "org.testng.internal.MethodHelper",
      "org.testng.internal.Graph",
      "org.testng.ClassMethodMap",
      "org.testng.internal.ConfigurationGroupMethods",
      "org.testng.internal.TestListenerHelper",
      "org.testng.internal.DefaultListenerFactory",
      "org.testng.internal.Systematiser",
      "org.testng.internal.Systematiser$Order",
      "org.testng.internal.Systematiser$4",
      "org.testng.internal.Systematiser$3",
      "org.testng.util.Strings",
      "io.netty.util.concurrent.NonStickyEventExecutorGroup",
      "org.testng.SuiteRunner$DefaultTestRunnerFactory",
      "org.testng.internal.BaseTestMethod",
      "org.testng.junit.JUnitTestMethod",
      "org.testng.junit.JUnit4TestMethod",
      "org.testng.xml.XmlWeaver",
      "org.testng.xml.DefaultXmlWeaver",
      "org.testng.reporters.RuntimeBehavior",
      "org.testng.reporters.XMLStringBuffer",
      "org.testng.reporters.Buffer",
      "org.testng.reporters.FileStringBuffer",
      "org.testng.internal.TestNGMethod",
      "org.testng.junit.JUnitTestClass",
      "org.testng.junit.JUnit3TestClass",
      "org.testng.junit.JUnit3TestMethod",
      "org.testng.internal.ConfigurationMethod",
      "org.testng.xml.XmlGroups",
      "org.testng.xml.XmlRun",
      "io.netty.util.concurrent.PromiseTask$RunnableAdapter",
      "org.testng.internal.annotations.DisabledRetryAnalyzer",
      "org.testng.xml.XmlUtils",
      "org.testng.reporters.XMLUtils",
      "org.testng.reporters.Tag",
      "org.testng.internal.ConstructorOrMethod",
      "org.testng.internal.NoOpTestClass",
      "org.testng.junit.JUnit4TestClass",
      "org.testng.internal.ClassHelper",
      "org.testng.internal.annotations.TestAnnotation",
      "org.testng.internal.ClonedMethod",
      "org.testng.junit.JUnit4SpockMethod",
      "org.testng.junit.JUnit4ConfigurationMethod",
      "org.testng.xml.XmlMethodSelectors",
      "org.springframework.http.server.reactive.ServerHttpResponseDecorator"
    );
  }
}
