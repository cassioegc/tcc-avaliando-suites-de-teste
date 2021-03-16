/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Mar 13 19:29:19 GMT 2021
 */

package org.apache.xml.security.stax.impl.transformer.canonicalizer;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Canonicalizer20010315_ExclWithCommentsTransformer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer20010315_ExclWithCommentsTransformer"; 
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
    java.lang.System.setProperty("user.dir", "/home/cassioegc/tcc/santuario-xml-security-java"); 
    java.lang.System.setProperty("user.home", "/home/cassioegc"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "cassioegc"); 
    java.lang.System.setProperty("user.timezone", "America/Recife"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Canonicalizer20010315_ExclWithCommentsTransformer_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.xml.security.c14n.implementations.UtfHelpper",
      "org.apache.xml.security.stax.ext.AbstractOutputProcessor",
      "org.apache.xml.security.configuration.PropertiesType",
      "org.apache.xml.security.stax.ext.SecurePart",
      "org.apache.xml.security.stax.ext.ComparableType",
      "org.apache.xml.security.stax.ext.XMLSecurityProperties",
      "org.apache.xml.security.stax.impl.transformer.canonicalizer.CanonicalizerBase$DocumentLevel",
      "org.apache.xml.security.stax.securityToken.SecurityToken",
      "org.apache.xml.security.stax.securityToken.SecurityTokenConstants$TokenType",
      "org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer20010315_Excl",
      "org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer20010315_ExclWithCommentsTransformer",
      "org.apache.xml.security.utils.UnsyncByteArrayInputStream",
      "org.apache.xml.security.stax.impl.stax.XMLSecAttributeImpl",
      "org.apache.xml.security.stax.ext.XMLSecurityConstants$Phase",
      "org.apache.xml.security.stax.ext.OutboundSecurityContext",
      "org.apache.xml.security.stax.ext.InputProcessorChain",
      "org.apache.xml.security.stax.impl.transformer.TransformEnvelopedSignature",
      "org.apache.xml.security.stax.ext.XMLSecurityUtils",
      "org.apache.xml.security.stax.impl.stax.XMLSecEventBaseImpl$EmptyIterator",
      "org.apache.xml.security.stax.ext.InboundSecurityContext",
      "org.apache.xml.security.stax.securityToken.SecurityTokenConstants$KeyIdentifier",
      "org.apache.xml.security.stax.securityToken.InboundSecurityToken",
      "org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl",
      "org.apache.xml.security.stax.impl.transformer.canonicalizer.CanonicalizerBase$C14NStack",
      "org.apache.xml.security.stax.ext.stax.XMLSecProcessingInstruction",
      "org.apache.xml.security.stax.ext.stax.XMLSecNamespace",
      "org.apache.xml.security.stax.securityEvent.SecurityEventListener",
      "org.apache.xml.security.stax.ext.DocumentContext",
      "org.apache.xml.security.exceptions.XMLSecurityException",
      "org.apache.xml.security.stax.ext.stax.XMLSecEndElement",
      "org.apache.xml.security.stax.impl.stax.XMLSecProcessingInstructionImpl",
      "org.apache.xml.security.stax.securityToken.SecurityTokenConstants$TokenUsage",
      "org.apache.xml.security.stax.impl.stax.XMLSecStartDocumentImpl",
      "org.apache.xml.security.stax.ext.SecurityContext",
      "org.apache.xml.security.stax.ext.stax.XMLSecEvent",
      "org.apache.xml.security.stax.ext.XMLSecurityConstants$DIRECTION",
      "org.apache.xml.security.stax.ext.OutputProcessorChain",
      "org.apache.xml.security.stax.ext.Transformer",
      "org.apache.xml.security.stax.ext.InputProcessor",
      "org.apache.xml.security.stax.ext.AbstractInputProcessor",
      "org.apache.xml.security.utils.UnsyncByteArrayOutputStream",
      "org.apache.xml.security.stax.impl.stax.XMLSecNamespaceImpl",
      "org.apache.xml.security.stax.ext.stax.XMLSecComment",
      "org.apache.xml.security.stax.ext.stax.XMLSecAttribute",
      "org.apache.xml.security.stax.ext.OutputProcessor",
      "org.apache.xml.security.stax.impl.transformer.TransformIdentity$ChildOutputMethod",
      "org.apache.xml.security.stax.securityEvent.EncryptedKeyTokenSecurityEvent",
      "org.apache.xml.security.stax.securityEvent.SecurityEventConstants$Event",
      "org.apache.xml.security.stax.config.ConfigurationProperties",
      "org.apache.xml.security.stax.securityEvent.KeyValueTokenSecurityEvent",
      "org.apache.xml.security.stax.securityEvent.TokenSecurityEvent",
      "org.apache.xml.security.stax.securityEvent.X509TokenSecurityEvent",
      "org.apache.xml.security.stax.ext.stax.XMLSecStartElement",
      "org.apache.xml.security.stax.impl.transformer.TransformIdentity$1",
      "org.apache.xml.security.stax.ext.stax.XMLSecCharacters",
      "org.apache.xml.security.stax.securityEvent.DefaultTokenSecurityEvent",
      "org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl",
      "org.apache.xml.security.stax.impl.stax.XMLSecEventBaseImpl",
      "org.apache.xml.security.stax.ext.XMLSecurityConstants$TransformMethod",
      "org.apache.xml.security.stax.ext.stax.XMLSecStartDocument",
      "org.apache.xml.security.stax.ext.XMLSecurityConstants$Action",
      "org.apache.xml.security.stax.securityEvent.SecurityEvent",
      "org.apache.xml.security.stax.impl.transformer.TransformIdentity",
      "org.apache.xml.security.stax.securityEvent.KeyNameTokenSecurityEvent",
      "org.apache.xml.security.stax.ext.XMLSecurityConstants$AlgorithmUsage",
      "org.apache.xml.security.stax.impl.processor.input.XMLEventReaderInputProcessor",
      "org.apache.xml.security.stax.ext.ProcessorChain",
      "org.apache.xml.security.stax.securityEvent.KeyValueTokenSecurityEvent$KeyValueTokenType",
      "org.apache.xml.security.stax.impl.transformer.canonicalizer.CanonicalizerBase",
      "org.apache.xml.security.stax.impl.transformer.canonicalizer.CanonicalizerBase$1"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Canonicalizer20010315_ExclWithCommentsTransformer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.xml.security.stax.impl.transformer.TransformIdentity",
      "org.apache.xml.security.stax.impl.transformer.canonicalizer.CanonicalizerBase",
      "org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer20010315_Excl",
      "org.apache.xml.security.stax.impl.transformer.canonicalizer.Canonicalizer20010315_ExclWithCommentsTransformer",
      "org.apache.xml.security.stax.impl.transformer.canonicalizer.CanonicalizerBase$C14NStack",
      "org.apache.xml.security.stax.impl.transformer.canonicalizer.CanonicalizerBase$DocumentLevel",
      "org.apache.xml.security.c14n.implementations.UtfHelpper",
      "org.apache.xml.security.utils.UnsyncByteArrayOutputStream",
      "org.apache.xml.security.stax.impl.stax.XMLSecEventBaseImpl$EmptyIterator",
      "org.apache.xml.security.stax.impl.stax.XMLSecEventBaseImpl",
      "org.apache.xml.security.stax.impl.stax.XMLSecAttributeImpl",
      "org.apache.xml.security.stax.ext.AbstractInputProcessor",
      "org.apache.xml.security.stax.config.ConfigurationProperties",
      "org.apache.xml.security.stax.impl.processor.input.XMLEventReaderInputProcessor",
      "org.apache.xml.security.stax.impl.stax.XMLSecStartDocumentImpl",
      "org.apache.xml.security.stax.impl.transformer.canonicalizer.CanonicalizerBase$1",
      "org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl",
      "org.apache.xml.security.stax.impl.stax.XMLSecNamespaceImpl",
      "org.apache.xml.security.stax.impl.transformer.TransformEnvelopedSignature",
      "org.apache.xml.security.stax.impl.stax.XMLSecProcessingInstructionImpl",
      "org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl",
      "org.apache.xml.security.stax.ext.XMLSecurityUtils",
      "org.apache.xml.security.utils.UnsyncByteArrayInputStream"
    );
  }
}
