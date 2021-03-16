/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Mar 13 23:12:31 GMT 2021
 */

package org.apache.jcp.xml.dsig.internal.dom;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class DOMReference_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.jcp.xml.dsig.internal.dom.DOMReference"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DOMReference_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.jcp.xml.dsig.internal.dom.DOMDigestMethod",
      "org.apache.jcp.xml.dsig.internal.dom.ApacheData",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod$SHA256withDSA",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod$RIPEMD160withECDSA",
      "org.apache.jcp.xml.dsig.internal.dom.RSAPSSParameterSpec",
      "org.apache.jcp.xml.dsig.internal.dom.DOMKeyValue$DSA",
      "org.apache.jcp.xml.dsig.internal.SignerOutputStream",
      "org.apache.jcp.xml.dsig.internal.dom.DOMRSAPSSSignatureMethod",
      "org.apache.jcp.xml.dsig.internal.dom.DOMUtils",
      "org.apache.jcp.xml.dsig.internal.dom.DOMDigestMethod$RIPEMD160",
      "org.apache.xml.security.c14n.implementations.NameSpaceSymbTable",
      "org.apache.jcp.xml.dsig.internal.MacOutputStream",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureProperty",
      "org.apache.jcp.xml.dsig.internal.dom.DOMKeyName",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod$SHA512withRSA",
      "org.apache.xml.security.utils.HelperNodeList",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod$RIPEMD160withRSAandMGF1",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod$SHA384withRSAandMGF1",
      "org.apache.xml.security.signature.XMLSignatureInputDebugger",
      "org.apache.jcp.xml.dsig.internal.DigesterOutputStream",
      "org.apache.jcp.xml.dsig.internal.dom.DOMCryptoBinary",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureProperties",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod$SHA512withRSAandMGF1",
      "org.apache.jcp.xml.dsig.internal.dom.DOMX509IssuerSerial",
      "org.apache.xml.security.c14n.implementations.Canonicalizer11_OmitComments",
      "org.apache.jcp.xml.dsig.internal.dom.DOMHMACSignatureMethod$SHA512",
      "org.apache.jcp.xml.dsig.internal.dom.DOMReference$1",
      "org.apache.xml.security.utils.XMLUtils",
      "org.apache.xml.security.Init",
      "org.apache.jcp.xml.dsig.internal.dom.DOMPGPData",
      "org.apache.jcp.xml.dsig.internal.dom.DOMKeyInfo",
      "org.apache.xml.security.parser.XMLParserImpl$1",
      "org.apache.jcp.xml.dsig.internal.dom.AbstractDOMSignatureMethod$Type",
      "org.apache.jcp.xml.dsig.internal.dom.DOMDigestMethod$SHA3_384",
      "org.apache.jcp.xml.dsig.internal.dom.DOMKeyValue",
      "org.apache.xml.security.c14n.implementations.Canonicalizer20010315",
      "org.apache.jcp.xml.dsig.internal.dom.DOMRetrievalMethod",
      "org.apache.jcp.xml.dsig.internal.dom.DOMHMACSignatureMethod$RIPEMD160",
      "org.apache.xml.security.c14n.implementations.SymbMap",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod",
      "org.apache.jcp.xml.dsig.internal.dom.DOMKeyValue$EC",
      "org.apache.jcp.xml.dsig.internal.dom.DOMKeyValue$EC$Curve",
      "org.apache.jcp.xml.dsig.internal.dom.DOMDigestMethod$SHA224",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod$SHA224withRSAandMGF1",
      "org.apache.jcp.xml.dsig.internal.dom.DOMCanonicalizationMethod",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod$SHA256withRSA",
      "org.apache.jcp.xml.dsig.internal.dom.DOMDigestMethod$SHA1",
      "org.apache.xml.security.parser.XMLParser",
      "org.apache.jcp.xml.dsig.internal.dom.AbstractDOMSignatureMethod",
      "org.apache.xml.security.c14n.implementations.CanonicalizerBase",
      "org.apache.jcp.xml.dsig.internal.dom.DOMStructure",
      "org.apache.jcp.xml.dsig.internal.dom.ApacheNodeSetData",
      "org.apache.jcp.xml.dsig.internal.dom.DOMDigestMethod$SHA512",
      "org.apache.jcp.xml.dsig.internal.dom.ApacheOctetStreamData",
      "org.apache.xml.security.utils.JavaUtils",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod$SHA1withECDSA",
      "org.apache.jcp.xml.dsig.internal.dom.DOMHMACSignatureMethod$SHA384",
      "org.apache.jcp.xml.dsig.internal.dom.DOMKeyValue$Unknown",
      "org.apache.jcp.xml.dsig.internal.dom.DOMKeyValue$RSA",
      "org.apache.xml.security.parser.XMLParserImpl",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod$SHA256withECDSA",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod$SHA224withRSA",
      "org.apache.xml.security.c14n.implementations.NameSpaceSymbEntry",
      "org.apache.jcp.xml.dsig.internal.dom.DOMDigestMethod$SHA3_256",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod$SHA512withECDSA",
      "org.apache.xml.security.c14n.CanonicalizerSpi",
      "org.apache.xml.security.exceptions.XMLSecurityException",
      "org.apache.xml.security.c14n.InvalidCanonicalizerException",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod$SHA1withRSAandMGF1",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod$SHA384withRSA",
      "org.apache.xml.security.utils.UnsyncBufferedOutputStream",
      "org.apache.jcp.xml.dsig.internal.dom.DOMHMACSignatureMethod",
      "org.apache.xml.security.utils.ElementProxy",
      "org.apache.xml.security.exceptions.XMLSecurityRuntimeException",
      "org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments",
      "org.apache.xml.security.c14n.helper.AttrCompare",
      "org.apache.jcp.xml.dsig.internal.dom.DOMDigestMethod$SHA3_224",
      "org.apache.xml.security.signature.XMLSignatureInput",
      "org.apache.jcp.xml.dsig.internal.dom.DOMDigestMethod$SHA256",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod$RIPEMD160withRSA",
      "org.apache.jcp.xml.dsig.internal.dom.DOMDigestMethod$WHIRLPOOL",
      "org.apache.xml.security.signature.NodeFilter",
      "org.apache.jcp.xml.dsig.internal.dom.DOMURIDereferencer",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod$SHA224withECDSA",
      "org.apache.jcp.xml.dsig.internal.dom.DOMRSAPSSSignatureMethod$RSAPSS",
      "org.apache.jcp.xml.dsig.internal.dom.DOMDigestMethod$SHA384",
      "org.apache.xml.security.utils.I18n",
      "org.apache.jcp.xml.dsig.internal.dom.Utils",
      "org.apache.jcp.xml.dsig.internal.dom.DOMDigestMethod$SHA3_512",
      "org.apache.jcp.xml.dsig.internal.dom.DOMReference",
      "org.apache.xml.security.c14n.CanonicalizationException",
      "org.apache.jcp.xml.dsig.internal.dom.DOMTransform",
      "org.apache.jcp.xml.dsig.internal.dom.DOMHMACSignatureMethod$SHA256",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod$SHA384withECDSA",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod$SHA256withRSAandMGF1",
      "org.apache.xml.security.parser.XMLParserException",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod$SHA1withDSA",
      "org.apache.xml.security.signature.XMLSignatureException"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DOMReference_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.jcp.xml.dsig.internal.dom.DOMStructure",
      "org.apache.jcp.xml.dsig.internal.dom.DOMReference",
      "org.apache.jcp.xml.dsig.internal.dom.DOMReference$1",
      "org.apache.xml.security.parser.XMLParserImpl",
      "org.apache.xml.security.utils.XMLUtils",
      "org.apache.xml.security.Init",
      "org.apache.xml.security.utils.I18n",
      "org.apache.xml.security.utils.ElementProxy",
      "org.apache.xml.security.utils.JavaUtils",
      "org.apache.jcp.xml.dsig.internal.dom.DOMURIDereferencer",
      "org.apache.jcp.xml.dsig.internal.dom.DOMDigestMethod",
      "org.apache.jcp.xml.dsig.internal.dom.DOMDigestMethod$SHA224",
      "org.apache.jcp.xml.dsig.internal.dom.DOMUtils",
      "org.apache.xml.security.signature.XMLSignatureInput",
      "org.apache.jcp.xml.dsig.internal.dom.ApacheOctetStreamData",
      "org.apache.jcp.xml.dsig.internal.dom.DOMDigestMethod$WHIRLPOOL",
      "org.apache.jcp.xml.dsig.internal.dom.DOMDigestMethod$SHA3_256",
      "org.apache.jcp.xml.dsig.internal.dom.DOMDigestMethod$RIPEMD160",
      "org.apache.jcp.xml.dsig.internal.dom.DOMDigestMethod$SHA512",
      "org.apache.jcp.xml.dsig.internal.dom.DOMDigestMethod$SHA256",
      "org.apache.jcp.xml.dsig.internal.dom.DOMKeyValue",
      "org.apache.jcp.xml.dsig.internal.dom.DOMKeyValue$RSA",
      "org.apache.jcp.xml.dsig.internal.dom.DOMCryptoBinary",
      "org.apache.jcp.xml.dsig.internal.dom.ApacheNodeSetData",
      "org.apache.jcp.xml.dsig.internal.dom.DOMDigestMethod$SHA3_512",
      "org.apache.jcp.xml.dsig.internal.dom.AbstractDOMSignatureMethod",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod$RIPEMD160withECDSA",
      "org.apache.jcp.xml.dsig.internal.dom.DOMDigestMethod$SHA3_384",
      "org.apache.jcp.xml.dsig.internal.dom.Utils",
      "org.apache.jcp.xml.dsig.internal.dom.DOMRetrievalMethod",
      "org.apache.jcp.xml.dsig.internal.dom.DOMDigestMethod$SHA3_224",
      "org.apache.jcp.xml.dsig.internal.dom.DOMDigestMethod$SHA1",
      "org.apache.jcp.xml.dsig.internal.dom.DOMHMACSignatureMethod",
      "org.apache.jcp.xml.dsig.internal.dom.DOMHMACSignatureMethod$RIPEMD160",
      "org.apache.jcp.xml.dsig.internal.dom.DOMKeyValue$EC$Curve",
      "org.apache.jcp.xml.dsig.internal.dom.DOMKeyValue$EC",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod$SHA256withECDSA",
      "org.apache.jcp.xml.dsig.internal.dom.DOMDigestMethod$SHA384",
      "org.apache.jcp.xml.dsig.internal.dom.DOMKeyValue$DSA",
      "org.apache.jcp.xml.dsig.internal.dom.DOMRSAPSSSignatureMethod",
      "org.apache.jcp.xml.dsig.internal.dom.DOMRSAPSSSignatureMethod$RSAPSS",
      "org.apache.jcp.xml.dsig.internal.dom.RSAPSSParameterSpec",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod$SHA224withRSA",
      "org.apache.jcp.xml.dsig.internal.dom.DOMKeyValue$Unknown",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureProperties",
      "org.apache.jcp.xml.dsig.internal.dom.DOMTransform",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod$RIPEMD160withRSAandMGF1",
      "org.apache.xml.security.c14n.helper.AttrCompare",
      "org.apache.xml.security.signature.XMLSignatureInputDebugger",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod$SHA1withDSA",
      "org.apache.jcp.xml.dsig.internal.dom.DOMPGPData",
      "org.apache.jcp.xml.dsig.internal.dom.DOMKeyInfo",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureProperty",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod$SHA384withRSA",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod$SHA512withRSA",
      "org.apache.jcp.xml.dsig.internal.dom.DOMX509IssuerSerial",
      "org.apache.xml.security.parser.XMLParserImpl$1",
      "org.apache.xml.security.exceptions.XMLSecurityException",
      "org.apache.xml.security.parser.XMLParserException",
      "org.apache.jcp.xml.dsig.internal.dom.DOMHMACSignatureMethod$SHA256",
      "org.apache.xml.security.exceptions.XMLSecurityRuntimeException",
      "org.apache.jcp.xml.dsig.internal.dom.DOMCanonicalizationMethod",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod$SHA512withRSAandMGF1",
      "org.apache.jcp.xml.dsig.internal.dom.DOMSignatureMethod$SHA384withRSAandMGF1",
      "org.apache.jcp.xml.dsig.internal.dom.DOMKeyName"
    );
  }
}
