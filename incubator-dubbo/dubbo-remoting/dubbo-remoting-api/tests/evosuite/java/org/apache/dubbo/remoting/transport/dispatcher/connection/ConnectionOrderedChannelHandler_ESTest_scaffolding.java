/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Apr 10 04:03:09 GMT 2021
 */

package org.apache.dubbo.remoting.transport.dispatcher.connection;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ConnectionOrderedChannelHandler_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.dubbo.remoting.transport.dispatcher.connection.ConnectionOrderedChannelHandler"; 
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
    java.lang.System.setProperty("user.dir", "/home/cassioegc/incubator-dubbo/dubbo-remoting/dubbo-remoting-api"); 
    java.lang.System.setProperty("user.home", "/home/cassioegc"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "cassioegc"); 
    java.lang.System.setProperty("user.timezone", "America/Recife"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ConnectionOrderedChannelHandler_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.dubbo.remoting.ChannelHandler",
      "javassist.util.proxy.DefineClassHelper$SecuredPrivileged$1$ReferencedUnsafe",
      "org.apache.dubbo.common.compiler.support.JavassistCompiler",
      "org.apache.dubbo.remoting.transport.dispatcher.ChannelEventRunnable",
      "org.apache.dubbo.common.extension.Adaptive",
      "javassist.bytecode.DuplicateMemberException",
      "javassist.bytecode.stackmap.TypedBlock",
      "javassist.CtClass",
      "javassist.compiler.Lex",
      "javassist.bytecode.SignatureAttribute$Type",
      "org.apache.dubbo.common.logger.slf4j.Slf4jLoggerAdapter",
      "javassist.bytecode.BootstrapMethodsAttribute",
      "org.apache.log4j.Level",
      "javassist.bytecode.Utf8Info",
      "javassist.bytecode.SignatureAttribute$BaseType",
      "javassist.bytecode.stackmap.TypeTag",
      "org.apache.dubbo.common.utils.Holder",
      "javassist.compiler.CompileError",
      "javassist.bytecode.StringInfo",
      "javassist.Modifier",
      "javassist.compiler.ast.DoubleConst",
      "javassist.ClassMap",
      "javassist.bytecode.NameAndTypeInfo",
      "javassist.bytecode.CodeIterator$Jump16",
      "javassist.bytecode.CodeIterator$If16",
      "javassist.bytecode.SignatureAttribute",
      "javassist.bytecode.Opcode",
      "org.apache.dubbo.remoting.transport.dispatcher.ChannelEventRunnable$ChannelState",
      "javassist.ClassPathList",
      "javassist.bytecode.StackMap",
      "org.apache.dubbo.remoting.Channel",
      "javassist.util.proxy.SecurityActions",
      "org.apache.dubbo.common.logger.log4j.Log4jLogger",
      "org.apache.dubbo.remoting.transport.dispatcher.WrappedChannelHandler",
      "javassist.bytecode.stackmap.BasicBlock$Mark",
      "javassist.ClassPoolTail",
      "javassist.bytecode.SyntheticAttribute",
      "javassist.compiler.NoFieldException",
      "org.apache.dubbo.common.extension.factory.AdaptiveExtensionFactory",
      "org.apache.dubbo.event.EventDispatcher",
      "javassist.util.proxy.DefineClassHelper",
      "javassist.bytecode.EnclosingMethodAttribute",
      "javassist.bytecode.StackMapTable$RuntimeCopyException",
      "org.apache.dubbo.common.context.Lifecycle",
      "org.apache.dubbo.common.utils.ClassUtils",
      "org.apache.dubbo.common.logger.LoggerAdapter",
      "org.apache.dubbo.common.io.UnsafeStringWriter",
      "javassist.bytecode.ParameterAnnotationsAttribute",
      "javassist.bytecode.ByteArray",
      "org.apache.dubbo.remoting.exchange.Request",
      "org.apache.dubbo.common.compiler.support.ClassUtils",
      "javassist.bytecode.DoubleInfo",
      "org.apache.dubbo.common.utils.NamedThreadFactory",
      "org.apache.log4j.Hierarchy",
      "javassist.bytecode.LongVector",
      "javassist.CtNewMethod",
      "javassist.util.proxy.SecurityActions$8",
      "org.apache.dubbo.common.compiler.support.JdkCompiler",
      "javassist.compiler.ast.InstanceOfExpr",
      "javassist.compiler.SyntaxError",
      "javassist.compiler.KeywordTable",
      "javassist.util.proxy.SecurityActions$4",
      "javassist.util.proxy.SecurityActions$3",
      "org.apache.log4j.helpers.NullEnumeration",
      "javassist.bytecode.CodeIterator$AlignmentException",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.dubbo.common.utils.CollectionUtils",
      "javassist.bytecode.MethodrefInfo",
      "javassist.compiler.ast.CondExpr",
      "javassist.compiler.ast.ASTree",
      "javassist.bytecode.stackmap.TypeData$BasicType",
      "org.apache.dubbo.common.extension.DubboInternalLoadingStrategy",
      "org.apache.dubbo.common.extension.AdaptiveClassCodeGenerator",
      "javassist.bytecode.Bytecode",
      "javassist.bytecode.stackmap.BasicBlock$JsrBytecode",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.dubbo.common.logger.LoggerFactory",
      "org.apache.dubbo.common.lang.Prioritized",
      "javassist.CtNewClass",
      "javassist.CtNewWrappedConstructor",
      "javassist.compiler.ast.MethodDecl",
      "org.apache.dubbo.common.Version",
      "org.apache.log4j.or.ObjectRenderer",
      "javassist.compiler.ast.FieldDecl",
      "javassist.bytecode.InnerClassesAttribute",
      "javassist.compiler.ast.CastExpr",
      "javassist.bytecode.SignatureAttribute$TypeVariable",
      "javassist.bytecode.stackmap.TypeData",
      "org.apache.dubbo.common.threadpool.support.cached.CachedThreadPool",
      "javassist.bytecode.ClassInfo",
      "javassist.bytecode.stackmap.Tracer",
      "javassist.bytecode.ConstInfo",
      "org.apache.dubbo.common.utils.ReflectUtils",
      "javassist.NotFoundException",
      "javassist.CtConstructor",
      "org.apache.log4j.Category",
      "javassist.CtClassType",
      "javassist.compiler.MemberCodeGen$JsrHook2",
      "javassist.ClassPath",
      "javassist.bytecode.stackmap.TypeData$AbsTypeVar",
      "javassist.bytecode.InterfaceMethodrefInfo",
      "javassist.bytecode.MethodParametersAttribute",
      "javassist.CtField",
      "javassist.bytecode.FloatInfo",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "javassist.CtBehavior",
      "org.apache.dubbo.event.EventListener",
      "org.apache.dubbo.remoting.exchange.Response",
      "javassist.compiler.ast.Member",
      "javassist.ClassPool",
      "javassist.bytecode.LocalVariableTypeAttribute",
      "javassist.CtPrimitiveType",
      "org.apache.log4j.PropertyWatchdog",
      "javassist.compiler.ast.Symbol",
      "javassist.compiler.Javac$CtFieldWithInit",
      "javassist.compiler.MemberResolver",
      "javassist.compiler.ProceedHandler",
      "org.apache.dubbo.common.constants.CommonConstants",
      "org.apache.dubbo.common.utils.StringUtils",
      "javassist.bytecode.LocalVariableAttribute",
      "org.apache.dubbo.common.logger.jdk.JdkLoggerAdapter",
      "javassist.CtNewWrappedMethod",
      "javassist.bytecode.stackmap.MapMaker",
      "javassist.bytecode.SourceFileAttribute",
      "javassist.CannotCompileException",
      "org.apache.dubbo.common.logger.Logger",
      "javassist.compiler.MemberCodeGen",
      "javassist.compiler.ast.Expr",
      "org.apache.log4j.spi.AppenderAttachable",
      "javassist.bytecode.AnnotationsAttribute",
      "org.apache.dubbo.remoting.transport.ChannelHandlerDelegate",
      "org.apache.log4j.Priority",
      "javassist.bytecode.stackmap.BasicBlock",
      "javassist.bytecode.SignatureAttribute$ClassType",
      "javassist.bytecode.DeprecatedAttribute",
      "javassist.compiler.ast.Variable",
      "org.apache.log4j.LogManager",
      "javassist.bytecode.Descriptor",
      "javassist.bytecode.SignatureAttribute$ArrayType",
      "javassist.bytecode.ConstPool",
      "javassist.bytecode.AccessFlag",
      "javassist.bytecode.stackmap.TypeData$UninitTypeVar",
      "org.apache.dubbo.remoting.Endpoint",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.dubbo.common.utils.ArrayUtils",
      "org.apache.log4j.or.RendererMap",
      "org.apache.dubbo.common.utils.NetUtils",
      "javassist.CtClass$1",
      "javassist.bytecode.CodeAttribute",
      "javassist.bytecode.FieldInfo",
      "javassist.CtArray",
      "javassist.bytecode.stackmap.BasicBlock$Maker",
      "org.apache.dubbo.event.Event",
      "javassist.compiler.CodeGen$1",
      "org.apache.dubbo.common.compiler.support.AdaptiveCompiler",
      "javassist.bytecode.ConstantAttribute",
      "org.apache.dubbo.common.threadpool.manager.DefaultExecutorRepository",
      "javassist.compiler.JvstTypeChecker",
      "javassist.bytecode.stackmap.TypeData$UninitData",
      "org.apache.dubbo.remoting.transport.ChannelHandlerAdapter",
      "org.apache.dubbo.common.extension.DisableInject",
      "javassist.bytecode.MemberrefInfo",
      "javassist.compiler.TypeChecker",
      "org.apache.dubbo.common.config.Configuration",
      "org.apache.dubbo.event.AbstractEventDispatcher",
      "javassist.compiler.CodeGen$ReturnHook",
      "org.apache.dubbo.common.extension.DubboLoadingStrategy",
      "javassist.compiler.ast.BinExpr",
      "org.apache.dubbo.common.compiler.support.CtClassBuilder",
      "org.apache.dubbo.common.extension.SPI",
      "javassist.util.proxy.DefineClassHelper$SecuredPrivileged",
      "org.apache.log4j.CategoryKey",
      "javassist.bytecode.SignatureAttribute$ObjectType",
      "javassist.bytecode.stackmap.TypeData$ClassName",
      "javassist.bytecode.AnnotationDefaultAttribute",
      "javassist.bytecode.LongInfo",
      "javassist.bytecode.PackageInfo",
      "org.apache.dubbo.common.threadpool.support.AbortPolicyWithReport",
      "org.apache.dubbo.common.extension.ExtensionLoader",
      "org.apache.dubbo.common.extension.ServicesLoadingStrategy",
      "javassist.CtMember",
      "javassist.CtClass$DelayedFileOutputStream",
      "javassist.compiler.ast.Stmnt",
      "javassist.CtMember$Cache",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "org.apache.dubbo.common.extension.Activate",
      "org.apache.dubbo.remoting.transport.dispatcher.connection.ConnectionOrderedChannelHandler",
      "org.apache.log4j.helpers.FileWatchdog",
      "javassist.compiler.SymbolTable",
      "org.apache.dubbo.common.utils.JVMUtil$1",
      "org.apache.dubbo.common.extension.LoadingStrategy",
      "org.apache.dubbo.common.threadpool.support.fixed.FixedThreadPool",
      "javassist.bytecode.TypeAnnotationsAttribute",
      "javassist.CtNewConstructor",
      "javassist.bytecode.StackMapTable",
      "org.apache.dubbo.common.threadpool.event.ThreadPoolExhaustedEvent",
      "javassist.LoaderClassPath",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.dubbo.common.extension.ExtensionFactory",
      "javassist.bytecode.ExceptionsAttribute",
      "javassist.compiler.ast.AssignExpr",
      "org.apache.log4j.spi.RendererSupport",
      "org.apache.dubbo.event.ParallelEventDispatcher",
      "javassist.compiler.ast.Keyword",
      "javassist.bytecode.ModuleInfo",
      "javassist.compiler.ast.ArrayInit",
      "javassist.bytecode.MethodTypeInfo",
      "org.apache.dubbo.common.threadpool.support.eager.EagerThreadPool",
      "javassist.bytecode.StackMapTable$Writer",
      "org.apache.dubbo.remoting.RemotingException",
      "javassist.bytecode.stackmap.TypeData$NullType",
      "javassist.ClassClassPath",
      "javassist.CtMethod",
      "javassist.compiler.ast.StringL",
      "javassist.compiler.ast.Declarator",
      "org.apache.dubbo.common.threadpool.support.limited.LimitedThreadPool",
      "javassist.compiler.ast.Pair",
      "javassist.util.proxy.SecurityActions$TheUnsafe",
      "org.apache.dubbo.common.logger.jcl.JclLoggerAdapter",
      "org.apache.log4j.Logger",
      "javassist.compiler.CodeGen",
      "org.apache.dubbo.event.DirectEventDispatcher",
      "org.apache.dubbo.common.URL",
      "javassist.bytecode.CodeIterator$Branch",
      "javassist.bytecode.ByteVector",
      "org.apache.dubbo.common.extension.factory.SpiExtensionFactory",
      "javassist.compiler.MemberResolver$Method",
      "javassist.compiler.ast.CallExpr",
      "org.apache.log4j.helpers.LogLog",
      "com.alibaba.dubbo.common.extension.Activate",
      "org.apache.dubbo.common.logger.support.FailsafeLogger",
      "org.apache.dubbo.common.compiler.support.AbstractCompiler",
      "javassist.bytecode.ExceptionTable",
      "javassist.bytecode.ConstInfoPadding",
      "org.apache.dubbo.common.logger.log4j.Log4jLoggerAdapter",
      "javassist.compiler.ast.Visitor",
      "javassist.bytecode.InvokeDynamicInfo",
      "javassist.util.proxy.DefineClassHelper$SecuredPrivileged$3",
      "org.apache.log4j.spi.RepositorySelector",
      "org.apache.dubbo.common.utils.JVMUtil",
      "javassist.util.proxy.DefineClassHelper$SecuredPrivileged$2",
      "org.apache.dubbo.remoting.ExecutionException",
      "javassist.util.proxy.DefineClassHelper$SecuredPrivileged$1",
      "javassist.bytecode.MethodInfo",
      "org.apache.dubbo.common.logger.log4j2.Log4j2LoggerAdapter",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.dubbo.common.compiler.Compiler",
      "javassist.bytecode.CodeIterator$Branch16",
      "javassist.compiler.ast.NewExpr",
      "javassist.bytecode.BadBytecode",
      "javassist.bytecode.MethodHandleInfo",
      "org.apache.log4j.spi.ThrowableRendererSupport",
      "org.apache.log4j.PropertyConfigurator",
      "javassist.bytecode.IntegerInfo",
      "javassist.bytecode.stackmap.TypeData$TypeVar",
      "javassist.compiler.ast.IntConst",
      "javassist.bytecode.FieldrefInfo",
      "javassist.compiler.TokenId",
      "javassist.compiler.Token",
      "javassist.bytecode.CodeIterator",
      "javassist.bytecode.ExceptionTableEntry",
      "javassist.compiler.JvstCodeGen",
      "javassist.bytecode.ClassFile",
      "org.apache.dubbo.common.threadpool.ThreadPool",
      "org.apache.dubbo.event.Listenable",
      "org.apache.dubbo.common.threadpool.manager.ExecutorRepository",
      "javassist.compiler.Javac",
      "org.apache.dubbo.common.threadpool.manager.Ring",
      "javassist.compiler.Parser",
      "org.apache.dubbo.common.utils.LRUCache",
      "javassist.bytecode.CodeAttribute$RuntimeCopyException",
      "javassist.bytecode.stackmap.TypedBlock$Maker",
      "org.apache.log4j.spi.LoggerRepository",
      "javassist.bytecode.AttributeInfo",
      "javassist.bytecode.LineNumberAttribute",
      "javassist.compiler.ast.ASTList"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.lang.Throwable", false, ConnectionOrderedChannelHandler_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.dubbo.common.URL", false, ConnectionOrderedChannelHandler_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.dubbo.remoting.Channel", false, ConnectionOrderedChannelHandler_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.dubbo.remoting.ChannelHandler", false, ConnectionOrderedChannelHandler_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ConnectionOrderedChannelHandler_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
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
      "org.apache.dubbo.remoting.transport.dispatcher.WrappedChannelHandler",
      "org.apache.dubbo.remoting.transport.dispatcher.connection.ConnectionOrderedChannelHandler",
      "org.apache.dubbo.remoting.transport.dispatcher.ChannelEventRunnable$ChannelState",
      "org.apache.dubbo.common.URL",
      "org.apache.dubbo.common.utils.NamedThreadFactory",
      "org.apache.dubbo.common.threadpool.support.AbortPolicyWithReport",
      "org.apache.dubbo.remoting.transport.dispatcher.ChannelEventRunnable",
      "org.apache.dubbo.common.lang.Prioritized",
      "org.apache.dubbo.common.extension.DubboInternalLoadingStrategy",
      "org.apache.dubbo.common.extension.DubboLoadingStrategy",
      "org.apache.dubbo.common.extension.ServicesLoadingStrategy",
      "org.apache.dubbo.common.extension.ExtensionLoader",
      "org.apache.dubbo.common.utils.Holder",
      "org.apache.dubbo.common.utils.CollectionUtils",
      "org.apache.dubbo.common.utils.ClassUtils",
      "org.apache.dubbo.common.utils.StringUtils",
      "org.apache.dubbo.common.extension.factory.AdaptiveExtensionFactory",
      "org.apache.dubbo.common.extension.factory.SpiExtensionFactory",
      "org.apache.dubbo.common.utils.ArrayUtils",
      "org.apache.dubbo.common.threadpool.manager.DefaultExecutorRepository",
      "org.apache.dubbo.common.threadpool.manager.Ring",
      "org.apache.dubbo.common.constants.CommonConstants",
      "org.apache.dubbo.common.Version",
      "org.apache.dubbo.common.utils.LRUCache",
      "org.apache.dubbo.common.utils.NetUtils",
      "org.apache.dubbo.common.threadpool.support.fixed.FixedThreadPool",
      "org.apache.dubbo.common.threadpool.support.cached.CachedThreadPool",
      "org.apache.dubbo.common.threadpool.support.limited.LimitedThreadPool",
      "org.apache.dubbo.common.threadpool.support.eager.EagerThreadPool",
      "org.apache.dubbo.common.extension.AdaptiveClassCodeGenerator",
      "org.apache.dubbo.common.compiler.support.AdaptiveCompiler",
      "org.apache.dubbo.common.compiler.support.AbstractCompiler",
      "org.apache.dubbo.common.compiler.support.JdkCompiler",
      "org.apache.dubbo.common.compiler.support.JavassistCompiler",
      "org.apache.dubbo.common.utils.ReflectUtils",
      "org.apache.dubbo.common.compiler.support.CtClassBuilder",
      "org.apache.dubbo.common.compiler.support.ClassUtils",
      "javassist.ClassPool",
      "javassist.ClassPoolTail",
      "javassist.CtPrimitiveType",
      "javassist.CtClass",
      "javassist.bytecode.ClassFile",
      "javassist.ClassClassPath",
      "javassist.ClassPathList",
      "javassist.LoaderClassPath",
      "javassist.CtClassType",
      "javassist.CtNewClass",
      "javassist.bytecode.ConstPool",
      "javassist.bytecode.LongVector",
      "javassist.bytecode.Descriptor",
      "javassist.bytecode.ConstInfo",
      "javassist.bytecode.Utf8Info",
      "javassist.bytecode.ClassInfo",
      "javassist.bytecode.AttributeInfo",
      "javassist.bytecode.SourceFileAttribute",
      "javassist.bytecode.AccessFlag",
      "javassist.Modifier",
      "javassist.CtNewMethod",
      "javassist.compiler.Javac",
      "javassist.bytecode.ByteVector",
      "javassist.bytecode.Bytecode",
      "javassist.bytecode.ExceptionTable",
      "javassist.compiler.ast.Visitor",
      "javassist.compiler.CodeGen",
      "javassist.compiler.MemberCodeGen",
      "javassist.compiler.JvstCodeGen",
      "org.apache.dubbo.event.EventDispatcher",
      "org.apache.dubbo.common.utils.JVMUtil",
      "org.apache.dubbo.event.AbstractEventDispatcher",
      "org.apache.dubbo.event.DirectEventDispatcher",
      "org.apache.dubbo.event.ParallelEventDispatcher",
      "org.apache.dubbo.event.Event",
      "org.apache.dubbo.common.threadpool.event.ThreadPoolExhaustedEvent",
      "org.apache.dubbo.common.utils.JVMUtil$1",
      "org.apache.dubbo.remoting.RemotingException",
      "org.apache.dubbo.remoting.ExecutionException",
      "net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper",
      "org.apache.dubbo.remoting.handler.MockedChannel",
      "org.apache.dubbo.remoting.transport.ChannelHandlerDispatcher",
      "org.apache.dubbo.remoting.handler.MockedChannelHandler",
      "org.apache.dubbo.common.utils.ConcurrentHashSet",
      "org.apache.dubbo.remoting.codec.AbstractMockChannel",
      "org.apache.dubbo.remoting.transport.AbstractChannelHandlerDelegate",
      "org.apache.dubbo.remoting.transport.MultiMessageHandler",
      "org.apache.dubbo.common.utils.Assert",
      "org.apache.dubbo.remoting.transport.ClientDelegate",
      "org.apache.dubbo.remoting.transport.ChannelHandlerAdapter",
      "org.apache.dubbo.remoting.transport.ChannelDelegate",
      "org.apache.dubbo.remoting.transport.DecodeHandler",
      "javassist.compiler.MemberResolver",
      "javassist.compiler.TypeChecker",
      "javassist.compiler.JvstTypeChecker",
      "javassist.compiler.SymbolTable",
      "javassist.compiler.Parser",
      "javassist.compiler.KeywordTable",
      "javassist.compiler.Lex",
      "javassist.compiler.Token",
      "javassist.compiler.ast.ASTree",
      "javassist.compiler.ast.ASTList",
      "javassist.compiler.ast.Keyword",
      "javassist.compiler.ast.Symbol",
      "javassist.compiler.ast.Declarator",
      "javassist.compiler.ast.MethodDecl",
      "javassist.compiler.ast.Variable",
      "javassist.compiler.ast.Expr",
      "javassist.compiler.ast.BinExpr",
      "javassist.compiler.ast.StringL",
      "javassist.compiler.ast.NewExpr",
      "javassist.compiler.ast.Stmnt",
      "javassist.compiler.ast.Member",
      "javassist.compiler.ast.CallExpr",
      "javassist.compiler.ast.CastExpr",
      "javassist.CtMember",
      "javassist.CtBehavior",
      "javassist.CtMethod",
      "javassist.bytecode.MethodInfo",
      "javassist.bytecode.Opcode",
      "javassist.NotFoundException",
      "javassist.bytecode.MemberrefInfo",
      "javassist.bytecode.MethodrefInfo",
      "javassist.bytecode.LongInfo",
      "javassist.bytecode.ConstInfoPadding",
      "javassist.bytecode.NameAndTypeInfo",
      "javassist.bytecode.FieldInfo",
      "javassist.bytecode.ConstantAttribute",
      "javassist.bytecode.CodeAttribute",
      "javassist.bytecode.LineNumberAttribute",
      "javassist.compiler.MemberResolver$Method",
      "javassist.bytecode.StringInfo",
      "javassist.bytecode.FieldrefInfo",
      "javassist.bytecode.InterfaceMethodrefInfo",
      "javassist.bytecode.InvokeDynamicInfo",
      "javassist.bytecode.MethodHandleInfo",
      "javassist.bytecode.MethodTypeInfo",
      "javassist.bytecode.SignatureAttribute",
      "javassist.bytecode.LocalVariableAttribute",
      "javassist.bytecode.MethodParametersAttribute",
      "javassist.bytecode.LocalVariableTypeAttribute",
      "javassist.bytecode.StackMapTable",
      "javassist.bytecode.ExceptionTableEntry",
      "javassist.bytecode.DeprecatedAttribute",
      "javassist.bytecode.AnnotationsAttribute",
      "javassist.bytecode.InnerClassesAttribute",
      "javassist.bytecode.BootstrapMethodsAttribute",
      "javassist.bytecode.IntegerInfo",
      "javassist.bytecode.ExceptionsAttribute",
      "javassist.bytecode.ByteArray",
      "javassist.CtMember$Cache",
      "javassist.CtConstructor",
      "javassist.compiler.CompileError",
      "javassist.compiler.NoFieldException",
      "javassist.bytecode.stackmap.Tracer",
      "javassist.bytecode.stackmap.MapMaker",
      "javassist.bytecode.stackmap.BasicBlock",
      "javassist.bytecode.stackmap.TypedBlock",
      "javassist.bytecode.stackmap.BasicBlock$Maker",
      "javassist.bytecode.stackmap.TypedBlock$Maker",
      "javassist.bytecode.CodeIterator",
      "javassist.bytecode.stackmap.BasicBlock$Mark",
      "javassist.bytecode.stackmap.TypeData",
      "javassist.bytecode.stackmap.TypeData$BasicType",
      "javassist.bytecode.stackmap.TypeTag",
      "javassist.bytecode.stackmap.TypeData$ClassName",
      "javassist.bytecode.stackmap.TypeData$NullType",
      "javassist.bytecode.stackmap.TypeData$AbsTypeVar",
      "javassist.bytecode.stackmap.TypeData$TypeVar",
      "javassist.bytecode.stackmap.TypeData$UninitData",
      "javassist.bytecode.StackMapTable$Writer",
      "javassist.CtNewConstructor",
      "javassist.CtNewWrappedMethod",
      "javassist.CtNewWrappedConstructor",
      "javassist.util.proxy.SecurityActions",
      "javassist.util.proxy.SecurityActions$8",
      "javassist.util.proxy.SecurityActions$TheUnsafe",
      "javassist.util.proxy.DefineClassHelper$SecuredPrivileged$1$ReferencedUnsafe",
      "javassist.util.proxy.SecurityActions$3",
      "javassist.util.proxy.SecurityActions$4",
      "javassist.util.proxy.DefineClassHelper$SecuredPrivileged",
      "javassist.util.proxy.DefineClassHelper"
    );
  }
}
