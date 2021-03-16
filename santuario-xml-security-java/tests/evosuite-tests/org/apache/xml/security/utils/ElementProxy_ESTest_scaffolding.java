/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Mar 13 20:53:37 GMT 2021
 */

package org.apache.xml.security.utils;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@EvoSuiteClassExclude
public class ElementProxy_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  protected static ExecutorService executor; 

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.xml.security.utils.ElementProxy"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    executor.shutdownNow(); 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ElementProxy_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.xml.security.utils.XPathAPI",
      "org.apache.xml.security.signature.SignedInfo",
      "org.apache.xml.security.keys.content.x509.XMLX509CRL",
      "org.apache.xml.security.keys.content.x509.XMLX509Certificate",
      "org.apache.xml.security.keys.keyresolver.implementations.DEREncodedKeyValueResolver",
      "org.apache.xml.security.algorithms.MessageDigestAlgorithm",
      "org.apache.xml.security.signature.Reference",
      "org.apache.xml.security.transforms.implementations.TransformC14N",
      "org.apache.xml.security.keys.content.KeyInfoContent",
      "org.apache.xml.security.signature.XMLSignature",
      "org.apache.xml.security.utils.XPathFactory",
      "org.apache.xml.security.keys.content.RetrievalMethod",
      "org.apache.xml.security.utils.resolver.implementations.ResolverLocalFilesystem",
      "org.apache.xml.security.encryption.ReferenceList",
      "org.apache.xml.security.c14n.implementations.NameSpaceSymbTable",
      "org.apache.xml.security.keys.content.SPKIData",
      "org.apache.xml.security.keys.storage.StorageResolver",
      "org.apache.xml.security.utils.HelperNodeList",
      "org.apache.xml.security.c14n.implementations.Canonicalizer20010315Excl",
      "org.apache.xml.security.encryption.EncryptionMethod",
      "org.apache.xml.security.keys.keyresolver.KeyResolverException",
      "org.apache.xml.security.encryption.EncryptionProperties",
      "org.apache.xml.security.utils.Signature11ElementProxy",
      "org.apache.xml.security.c14n.implementations.Canonicalizer11_OmitComments",
      "org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments",
      "org.apache.xml.security.utils.XMLUtils",
      "org.apache.xml.security.keys.content.KeyName",
      "org.apache.xml.security.keys.content.keyvalues.ECKeyValue$Curve",
      "org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial",
      "org.apache.xml.security.Init",
      "org.apache.xml.security.utils.resolver.ResourceResolverSpi",
      "org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclOmitComments",
      "org.apache.xml.security.encryption.Transforms",
      "org.apache.xml.security.signature.ObjectContainer",
      "org.apache.xml.security.utils.XalanXPathFactory",
      "org.apache.xml.security.transforms.implementations.TransformC14NExclusiveWithComments",
      "org.apache.xml.security.utils.SignatureElementProxy",
      "org.apache.xml.security.transforms.InvalidTransformException",
      "org.apache.xml.security.utils.SignerOutputStream",
      "org.apache.xml.security.c14n.implementations.Canonicalizer20010315",
      "org.apache.xml.security.keys.content.x509.XMLX509DataContent",
      "org.apache.xml.security.transforms.implementations.TransformC14N11",
      "org.apache.xml.security.transforms.implementations.TransformXPath2Filter",
      "org.apache.xml.security.c14n.implementations.SymbMap",
      "org.apache.xml.security.signature.Reference$1",
      "org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP",
      "org.apache.xml.security.encryption.Reference",
      "org.apache.xml.security.utils.resolver.ResourceResolverException",
      "org.apache.xml.security.algorithms.SignatureAlgorithm",
      "org.apache.xml.security.keys.storage.StorageResolverSpi",
      "org.apache.xml.security.encryption.CipherReference",
      "org.apache.xml.security.transforms.implementations.TransformEnvelopedSignature",
      "org.apache.xml.security.keys.keyresolver.implementations.X509DigestResolver",
      "org.apache.xml.security.encryption.EncryptedKey",
      "org.apache.xml.security.signature.Manifest",
      "org.apache.xml.security.keys.content.keyvalues.KeyValueContent",
      "org.apache.xml.security.transforms.implementations.TransformXPath",
      "org.apache.xml.security.keys.storage.StorageResolverException",
      "org.apache.xml.security.keys.storage.implementations.SingleCertificateResolver",
      "org.apache.xml.security.c14n.implementations.Canonicalizer11_WithComments",
      "org.apache.xml.security.keys.content.keyvalues.DSAKeyValue",
      "org.apache.xml.security.utils.DigesterOutputStream",
      "org.apache.xml.security.parser.XMLParser",
      "org.apache.xml.security.transforms.TransformSpi",
      "org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException",
      "org.apache.xml.security.keys.content.X509Data",
      "org.apache.xml.security.c14n.implementations.CanonicalizerBase",
      "org.apache.xml.security.transforms.implementations.TransformC14N11_WithComments",
      "org.apache.xml.security.keys.KeyInfo",
      "org.apache.xml.security.keys.content.KeyInfoReference",
      "org.apache.xml.security.utils.JavaUtils",
      "org.apache.xml.security.transforms.TransformationException",
      "org.apache.xml.security.keys.content.keyvalues.RSAKeyValue",
      "org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver",
      "org.apache.xml.security.utils.ClassLoaderUtils",
      "org.apache.xml.security.parser.XMLParserImpl",
      "org.apache.xml.security.keys.content.keyvalues.ECKeyValue",
      "org.apache.xml.security.transforms.implementations.TransformBase64Decode",
      "org.apache.xml.security.algorithms.SignatureAlgorithmSpi",
      "org.apache.xml.security.c14n.implementations.NameSpaceSymbEntry",
      "org.apache.xml.security.keys.content.KeyValue",
      "org.apache.xml.security.signature.SignatureProperty",
      "org.apache.xml.security.keys.content.x509.XMLX509SubjectName",
      "org.apache.xml.security.c14n.CanonicalizerSpi",
      "org.apache.xml.security.exceptions.XMLSecurityException",
      "org.apache.xml.security.algorithms.Algorithm",
      "org.apache.xml.security.c14n.InvalidCanonicalizerException",
      "org.apache.xml.security.utils.resolver.ResourceResolverContext",
      "org.apache.xml.security.encryption.CipherData",
      "org.apache.xml.security.utils.UnsyncBufferedOutputStream",
      "org.apache.xml.security.utils.ElementProxy",
      "org.apache.xml.security.signature.MissingResourceFailureException",
      "org.apache.xml.security.exceptions.XMLSecurityRuntimeException",
      "org.apache.xml.security.keys.content.x509.XMLX509Digest",
      "org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments",
      "org.apache.xml.security.utils.resolver.implementations.ResolverFragment",
      "org.apache.xml.security.c14n.helper.AttrCompare",
      "org.apache.xml.security.transforms.implementations.TransformXSLT",
      "org.apache.xml.security.signature.XMLSignatureInput",
      "org.apache.xml.security.encryption.EncryptedType",
      "org.apache.xml.security.transforms.Transform",
      "org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments",
      "org.apache.xml.security.keys.content.x509.XMLX509SKI",
      "org.apache.xml.security.signature.NodeFilter",
      "org.apache.xml.security.transforms.Transforms",
      "org.apache.xml.security.utils.JDKXPathFactory",
      "org.apache.xml.security.keys.content.PGPData",
      "org.apache.xml.security.keys.content.MgmtData",
      "org.apache.xml.security.encryption.EncryptionProperty",
      "org.apache.xml.security.utils.I18n",
      "org.apache.xml.security.signature.ReferenceNotInitializedException",
      "org.apache.xml.security.transforms.implementations.TransformC14NWithComments",
      "org.apache.xml.security.c14n.CanonicalizationException",
      "org.apache.xml.security.signature.reference.ReferenceData",
      "org.apache.xml.security.encryption.XMLEncryptionException",
      "org.apache.xml.security.transforms.implementations.TransformC14NExclusive",
      "org.apache.xml.security.encryption.CipherValue",
      "org.apache.xml.security.keys.content.DEREncodedKeyValue",
      "org.apache.xml.security.signature.SignatureProperties",
      "org.apache.xml.security.keys.storage.implementations.KeyStoreResolver",
      "org.apache.xml.security.parser.XMLParserException",
      "org.apache.xml.security.keys.keyresolver.KeyResolverSpi",
      "org.apache.xml.security.signature.XMLSignatureException"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ElementProxy_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.xml.security.utils.ElementProxy",
      "org.apache.xml.security.utils.SignatureElementProxy",
      "org.apache.xml.security.algorithms.Algorithm",
      "org.apache.xml.security.algorithms.MessageDigestAlgorithm",
      "org.apache.xml.security.signature.Reference",
      "org.apache.xml.security.signature.XMLSignature",
      "org.apache.xml.security.transforms.Transforms",
      "org.apache.xml.security.utils.I18n",
      "org.apache.xml.security.Init",
      "org.apache.xml.security.parser.XMLParserImpl",
      "org.apache.xml.security.utils.XMLUtils",
      "org.apache.xml.security.utils.JavaUtils",
      "org.apache.xml.security.algorithms.SignatureAlgorithm",
      "org.apache.xml.security.exceptions.XMLSecurityException",
      "org.apache.xml.security.utils.Signature11ElementProxy",
      "org.apache.xml.security.keys.content.x509.XMLX509Digest",
      "org.apache.xml.security.keys.KeyInfo",
      "org.apache.xml.security.utils.HelperNodeList",
      "org.apache.xml.security.transforms.Transform",
      "org.apache.xml.security.signature.Manifest",
      "org.apache.xml.security.signature.SignedInfo",
      "org.apache.xml.security.keys.content.DEREncodedKeyValue",
      "org.apache.xml.security.keys.content.X509Data",
      "org.apache.xml.security.signature.ObjectContainer",
      "org.apache.xml.security.signature.SignatureProperties",
      "org.apache.xml.security.keys.content.keyvalues.DSAKeyValue",
      "org.apache.xml.security.keys.content.x509.XMLX509SKI",
      "org.apache.xml.security.keys.content.x509.XMLX509CRL",
      "org.apache.xml.security.keys.keyresolver.KeyResolverSpi",
      "org.apache.xml.security.keys.keyresolver.implementations.DEREncodedKeyValueResolver",
      "org.apache.xml.security.keys.storage.StorageResolver",
      "org.apache.xml.security.keys.storage.StorageResolverSpi",
      "org.apache.xml.security.keys.storage.implementations.KeyStoreResolver",
      "org.apache.xml.security.signature.SignatureProperty",
      "org.apache.xml.security.keys.content.RetrievalMethod",
      "org.apache.xml.security.transforms.TransformSpi",
      "org.apache.xml.security.transforms.implementations.TransformBase64Decode",
      "org.apache.xml.security.transforms.implementations.TransformC14N",
      "org.apache.xml.security.transforms.implementations.TransformC14NWithComments",
      "org.apache.xml.security.transforms.implementations.TransformC14N11",
      "org.apache.xml.security.transforms.implementations.TransformC14N11_WithComments",
      "org.apache.xml.security.transforms.implementations.TransformC14NExclusive",
      "org.apache.xml.security.transforms.implementations.TransformC14NExclusiveWithComments",
      "org.apache.xml.security.transforms.implementations.TransformXPath",
      "org.apache.xml.security.transforms.implementations.TransformEnvelopedSignature",
      "org.apache.xml.security.transforms.implementations.TransformXSLT",
      "org.apache.xml.security.transforms.implementations.TransformXPath2Filter",
      "org.apache.xml.security.utils.resolver.ResourceResolverSpi",
      "org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP",
      "org.apache.xml.security.signature.XMLSignatureInput",
      "org.apache.xml.security.keys.content.KeyInfoReference",
      "org.apache.xml.security.utils.resolver.implementations.ResolverFragment",
      "org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver",
      "org.apache.xml.security.keys.keyresolver.implementations.X509DigestResolver",
      "org.apache.xml.security.keys.content.x509.XMLX509Certificate",
      "org.apache.xml.security.keys.content.KeyValue",
      "org.apache.xml.security.keys.content.keyvalues.RSAKeyValue",
      "org.apache.xml.security.utils.resolver.implementations.ResolverLocalFilesystem",
      "org.apache.xml.security.keys.content.MgmtData",
      "org.apache.xml.security.keys.content.x509.XMLX509SubjectName",
      "org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial",
      "org.apache.xml.security.keys.content.KeyName",
      "org.apache.xml.security.signature.XMLSignatureException"
    );
  }
}
