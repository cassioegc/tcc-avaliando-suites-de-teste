/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Mar 13 17:10:07 GMT 2021
 */

package org.apache.xml.security.algorithms;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class SignatureAlgorithmSpi_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.xml.security.algorithms.SignatureAlgorithmSpi"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SignatureAlgorithmSpi_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.xml.security.algorithms.JCEMapper$Algorithm",
      "org.apache.xml.security.algorithms.implementations.IntegrityHmac$IntegrityHmacSHA1",
      "org.apache.xml.security.algorithms.JCEMapper",
      "org.apache.xml.security.algorithms.implementations.SignatureDSA",
      "org.apache.xml.security.algorithms.implementations.IntegrityHmac$IntegrityHmacSHA384",
      "org.apache.xml.security.algorithms.implementations.IntegrityHmac$IntegrityHmacSHA224",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA",
      "org.apache.xml.security.algorithms.implementations.SignatureECDSA",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASHA256MGF1",
      "org.apache.xml.security.algorithms.implementations.SignatureECDSA$SignatureECDSASHA224",
      "org.apache.xml.security.algorithms.implementations.SignatureECDSA$SignatureECDSASHA384",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASHA384MGF1",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASHA512",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASHA256",
      "org.apache.xml.security.algorithms.implementations.ECDSAUtils$ECCurveDefinition",
      "org.apache.xml.security.algorithms.implementations.SignatureECDSA$SignatureECDSARIPEMD160",
      "org.apache.xml.security.algorithms.implementations.SignatureDSA$SHA256",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSAMD5",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASSAPSS",
      "org.apache.xml.security.algorithms.implementations.IntegrityHmac$IntegrityHmacRIPEMD160",
      "org.apache.xml.security.algorithms.implementations.SignatureECDSA$SignatureECDSASHA512",
      "org.apache.xml.security.algorithms.SignatureAlgorithmSpi",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASHA512MGF1",
      "org.apache.xml.security.algorithms.implementations.IntegrityHmac$IntegrityHmacSHA256",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASHA3_512MGF1",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASHA3_224MGF1",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSARIPEMD160",
      "org.apache.xml.security.algorithms.implementations.SignatureECDSA$SignatureECDSASHA256",
      "org.apache.xml.security.utils.I18n",
      "org.apache.xml.security.algorithms.implementations.IntegrityHmac$IntegrityHmacMD5",
      "org.apache.xml.security.algorithms.implementations.IntegrityHmac$IntegrityHmacSHA512",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASHA224MGF1",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASHA3_384MGF1",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASHA224",
      "org.apache.xml.security.algorithms.implementations.IntegrityHmac",
      "org.apache.xml.security.exceptions.XMLSecurityException",
      "org.apache.xml.security.algorithms.implementations.IntegrityHmac$HMACOutputLength",
      "org.apache.xml.security.algorithms.implementations.SignatureECDSA$SignatureECDSASHA1",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASHA384",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASHA1MGF1",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASHA3_256MGF1",
      "org.apache.xml.security.Init",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASHA1",
      "org.apache.xml.security.signature.XMLSignatureException",
      "org.apache.xml.security.algorithms.implementations.ECDSAUtils"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SignatureAlgorithmSpi_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.xml.security.algorithms.SignatureAlgorithmSpi",
      "org.apache.xml.security.algorithms.implementations.SignatureDSA",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASHA1",
      "org.apache.xml.security.algorithms.JCEMapper",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASHA256MGF1",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASHA224MGF1",
      "org.apache.xml.security.algorithms.implementations.IntegrityHmac",
      "org.apache.xml.security.algorithms.implementations.IntegrityHmac$IntegrityHmacSHA256",
      "org.apache.xml.security.algorithms.implementations.SignatureECDSA",
      "org.apache.xml.security.algorithms.implementations.SignatureECDSA$SignatureECDSARIPEMD160",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASHA384",
      "org.apache.xml.security.algorithms.implementations.IntegrityHmac$IntegrityHmacMD5",
      "org.apache.xml.security.algorithms.implementations.SignatureECDSA$SignatureECDSASHA224",
      "org.apache.xml.security.algorithms.implementations.IntegrityHmac$IntegrityHmacSHA384",
      "org.apache.xml.security.algorithms.implementations.SignatureECDSA$SignatureECDSASHA512",
      "org.apache.xml.security.algorithms.implementations.IntegrityHmac$IntegrityHmacSHA512",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASHA256",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSARIPEMD160",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASHA3_384MGF1",
      "org.apache.xml.security.algorithms.implementations.SignatureECDSA$SignatureECDSASHA256",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASSAPSS",
      "org.apache.xml.security.algorithms.implementations.IntegrityHmac$IntegrityHmacSHA1",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASHA3_512MGF1",
      "org.apache.xml.security.algorithms.implementations.IntegrityHmac$IntegrityHmacSHA224",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSAMD5",
      "org.apache.xml.security.algorithms.implementations.SignatureECDSA$SignatureECDSASHA384",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASHA3_224MGF1",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASHA224",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASHA512MGF1",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASHA3_256MGF1",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASHA512",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASHA384MGF1",
      "org.apache.xml.security.algorithms.implementations.SignatureDSA$SHA256",
      "org.apache.xml.security.algorithms.implementations.SignatureECDSA$SignatureECDSASHA1",
      "org.apache.xml.security.algorithms.implementations.IntegrityHmac$IntegrityHmacRIPEMD160",
      "org.apache.xml.security.algorithms.implementations.SignatureBaseRSA$SignatureRSASHA1MGF1",
      "org.apache.xml.security.algorithms.implementations.ECDSAUtils$ECCurveDefinition",
      "org.apache.xml.security.algorithms.implementations.ECDSAUtils",
      "org.apache.xml.security.exceptions.XMLSecurityException",
      "org.apache.xml.security.signature.XMLSignatureException",
      "org.apache.xml.security.utils.I18n",
      "org.apache.xml.security.Init"
    );
  }
}
