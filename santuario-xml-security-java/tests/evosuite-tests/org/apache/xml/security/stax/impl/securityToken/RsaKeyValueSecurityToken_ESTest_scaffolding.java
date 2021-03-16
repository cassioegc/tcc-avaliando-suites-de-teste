/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Mar 13 19:13:58 GMT 2021
 */

package org.apache.xml.security.stax.impl.securityToken;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class RsaKeyValueSecurityToken_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.xml.security.stax.impl.securityToken.RsaKeyValueSecurityToken"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(RsaKeyValueSecurityToken_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.xml.security.stax.securityEvent.AlgorithmSuiteSecurityEvent",
      "org.apache.xml.security.configuration.PropertiesType",
      "org.apache.xml.security.stax.ext.SecurePart",
      "org.apache.xml.security.stax.ext.ComparableType",
      "org.apache.xml.security.stax.impl.securityToken.X509SubjectNameSecurityToken",
      "org.apache.xml.security.binding.xmldsig.ReferenceType",
      "org.apache.xml.security.stax.securityToken.SecurityToken",
      "org.apache.xml.security.binding.xmlenc.EncryptedDataType",
      "org.apache.xml.security.stax.impl.util.MultiInputStream",
      "org.apache.xml.security.stax.impl.stax.XMLSecAttributeImpl",
      "org.apache.xml.security.utils.UnsyncByteArrayInputStream",
      "org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl",
      "org.apache.xml.security.stax.ext.stax.XMLSecEndDocument",
      "org.apache.xml.security.stax.impl.stax.XMLSecCommentImpl",
      "org.apache.xml.security.binding.xmldsig.DigestMethodType",
      "org.apache.xml.security.binding.xmldsig11.TnBFieldParamsType",
      "org.apache.xml.security.stax.impl.util.IDGenerator",
      "org.apache.xml.security.stax.ext.InputProcessorChain",
      "org.apache.xml.security.stax.ext.XMLSecurityConstants$ContentType",
      "org.apache.xml.security.stax.securityToken.SecurityTokenConstants$KeyIdentifier",
      "org.apache.xml.security.binding.xmldsig11.ECValidationDataType",
      "org.apache.xml.security.stax.impl.AbstractSecurityContextImpl",
      "org.apache.xml.security.stax.impl.processor.output.AbstractSignatureOutputProcessor",
      "org.apache.xml.security.binding.xmlenc.EncryptedKeyType",
      "org.apache.xml.security.binding.xmldsig.SignedInfoType",
      "org.apache.xml.security.stax.ext.stax.XMLSecNamespace",
      "org.apache.xml.security.stax.impl.stax.XMLSecEndDocumentImpl",
      "org.apache.xml.security.stax.securityToken.SecurityTokenConstants$KeyUsage",
      "org.apache.xml.security.binding.xmldsig.SignatureValueType",
      "org.apache.xml.security.stax.ext.DocumentContext",
      "org.apache.xml.security.stax.impl.util.DigestOutputStream",
      "org.apache.xml.security.binding.xmldsig.SignatureMethodType",
      "org.apache.xml.security.stax.securityToken.SecurityTokenConstants$TokenUsage",
      "org.apache.xml.security.Init",
      "org.apache.xml.security.stax.impl.InputProcessorChainImpl",
      "org.apache.xml.security.binding.xmldsig11.FieldIDType",
      "org.apache.xml.security.binding.xmlenc.EncryptedType",
      "org.apache.xml.security.stax.securityEvent.ContentEncryptedElementSecurityEvent",
      "org.apache.xml.security.stax.securityToken.OutboundSecurityToken",
      "org.apache.xml.security.stax.ext.InputProcessor",
      "org.apache.xml.security.stax.impl.stax.XMLSecNamespaceImpl",
      "org.apache.xml.security.stax.ext.stax.XMLSecAttribute",
      "org.apache.xml.security.binding.xmldsig11.ECParametersType",
      "org.apache.xml.security.binding.xmldsig.KeyInfoType",
      "org.apache.xml.security.stax.impl.securityToken.KeyNameSecurityToken",
      "org.apache.xml.security.stax.ext.stax.XMLSecCharacters",
      "org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor",
      "org.apache.xml.security.stax.impl.stax.XMLSecEntityReferenceImpl",
      "org.apache.xml.security.stax.impl.processor.output.XMLSignatureOutputProcessor",
      "org.apache.xml.security.stax.impl.EncryptionPartDef",
      "org.apache.xml.security.stax.ext.XMLSecurityConstants$TransformMethod",
      "org.apache.xml.security.stax.impl.processor.output.AbstractEncryptOutputProcessor$AbstractInternalEncryptionOutputProcessor",
      "org.apache.xml.security.binding.xmldsig11.NamedCurveType",
      "org.apache.xml.security.stax.ext.stax.XMLSecStartDocument",
      "org.apache.xml.security.stax.impl.processor.input.LogInputProcessor",
      "org.apache.xml.security.stax.securityEvent.SecurityEventConstants",
      "org.apache.xml.security.stax.securityEvent.SecurityEvent",
      "org.apache.xml.security.binding.xmlenc.CipherValueType",
      "org.apache.xml.security.stax.impl.processor.input.XMLEventReaderInputProcessor",
      "org.apache.xml.security.stax.securityEvent.AbstractElementSecurityEvent",
      "org.apache.xml.security.binding.xmldsig.RSAKeyValueType",
      "org.apache.xml.security.stax.impl.InboundSecurityContextImpl",
      "org.apache.xml.security.binding.xmlenc.EncryptionPropertiesType",
      "org.apache.xml.security.stax.ext.SecurePart$Modifier",
      "org.apache.xml.security.stax.impl.processor.output.AbstractEncryptOutputProcessor",
      "org.apache.xml.security.stax.ext.stax.XMLSecDTD",
      "org.apache.xml.security.stax.impl.securityToken.X509SKISecurityToken",
      "org.apache.xml.security.stax.impl.stax.XMLSecDTDImpl",
      "org.apache.xml.security.stax.impl.securityToken.ECKeyValueSecurityToken",
      "org.apache.xml.security.stax.ext.stax.XMLSecEntityReference",
      "org.apache.xml.security.stax.ext.AbstractOutputProcessor",
      "org.apache.xml.security.stax.impl.XMLSecurityStreamWriter",
      "org.apache.xml.security.stax.impl.processor.input.AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor",
      "org.apache.xml.security.binding.xmldsig11.CurveType",
      "org.apache.xml.security.stax.securityToken.SecurityTokenConstants",
      "org.apache.xml.security.stax.ext.XMLSecurityProperties",
      "org.apache.xml.security.stax.impl.XMLSecurityEventWriter",
      "org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken",
      "org.apache.xml.security.stax.securityToken.SecurityTokenConstants$TokenType",
      "org.apache.xml.security.binding.xmldsig.SignatureType",
      "org.apache.xml.security.stax.impl.securityToken.RsaKeyValueSecurityToken",
      "org.apache.xml.security.stax.ext.XMLSecurityConstants$Phase",
      "org.apache.xml.security.stax.impl.processor.output.XMLEncryptOutputProcessor",
      "org.apache.xml.security.stax.ext.OutboundSecurityContext",
      "org.apache.xml.security.stax.impl.securityToken.X509SecurityToken",
      "org.apache.xml.security.stax.ext.InboundSecurityContext",
      "org.apache.xml.security.stax.impl.stax.XMLSecEventBaseImpl$EmptyIterator",
      "org.apache.xml.security.stax.ext.XMLSecurityConstants",
      "org.apache.xml.security.stax.securityToken.InboundSecurityToken",
      "org.apache.xml.security.binding.xmlenc.EncryptionMethodType",
      "org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl",
      "org.apache.xml.security.stax.securityEvent.AbstractSecuredElementSecurityEvent",
      "org.apache.xml.security.stax.ext.stax.XMLSecEntityDeclaration",
      "org.apache.xml.security.stax.impl.XMLSecurityStreamWriter$NSContext",
      "org.apache.xml.security.stax.ext.stax.XMLSecProcessingInstruction",
      "org.apache.xml.security.stax.impl.OutboundSecurityContextImpl",
      "org.apache.xml.security.binding.xmlenc.TransformsType",
      "org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken",
      "org.apache.xml.security.binding.xmlenc.ReferenceList",
      "org.apache.xml.security.stax.securityEvent.SecurityEventListener",
      "org.apache.xml.security.stax.impl.processor.input.AbstractSignatureReferenceVerifyInputProcessor",
      "org.apache.xml.security.stax.impl.securityToken.AbstractSecurityToken",
      "org.apache.xml.security.binding.xmldsig11.ECKeyValueType",
      "org.apache.xml.security.exceptions.XMLSecurityException",
      "org.apache.xml.security.stax.ext.stax.XMLSecEndElement",
      "org.apache.xml.security.stax.impl.DocumentContextImpl",
      "org.apache.xml.security.stax.impl.processor.input.XMLSecurityInputProcessor",
      "org.apache.xml.security.stax.impl.stax.XMLSecProcessingInstructionImpl",
      "org.apache.xml.security.binding.xmldsig.CanonicalizationMethodType",
      "org.apache.xml.security.stax.impl.processor.input.AbstractSignatureReferenceVerifyInputProcessor$InternalSignatureReferenceVerifier",
      "org.apache.xml.security.stax.impl.stax.XMLSecStartDocumentImpl",
      "org.apache.xml.security.stax.impl.processor.input.XMLSecurityInputProcessor$InternalBufferProcessor",
      "org.apache.xml.security.utils.UnsyncBufferedOutputStream",
      "org.apache.xml.security.stax.ext.SecurityContext",
      "org.apache.xml.security.binding.xmlenc.CipherReferenceType",
      "org.apache.xml.security.binding.xmlenc.CipherDataType",
      "org.apache.xml.security.stax.ext.stax.XMLSecEvent",
      "org.apache.xml.security.stax.ext.OutputProcessorChain",
      "org.apache.xml.security.stax.ext.XMLSecurityConstants$DIRECTION",
      "org.apache.xml.security.stax.ext.Transformer",
      "org.apache.xml.security.stax.impl.processor.output.AbstractEncryptOutputProcessor$CharacterEventGeneratorOutputStream",
      "org.apache.xml.security.stax.ext.AbstractInputProcessor",
      "org.apache.xml.security.stax.ext.stax.XMLSecComment",
      "org.apache.xml.security.stax.ext.OutputProcessor",
      "org.apache.xml.security.stax.securityEvent.SecurityEventConstants$Event",
      "org.apache.xml.security.binding.xmlenc.ReferenceType",
      "org.apache.xml.security.stax.config.ConfigurationProperties",
      "org.apache.xml.security.stax.securityToken.SecurityTokenProvider",
      "org.apache.xml.security.stax.impl.securityToken.AbstractInboundSecurityToken",
      "org.apache.xml.security.stax.ext.stax.XMLSecStartElement",
      "org.apache.xml.security.binding.xmldsig11.PnBFieldParamsType",
      "org.apache.xml.security.stax.ext.stax.XMLSecEventFactory",
      "org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl",
      "org.apache.xml.security.stax.impl.processor.input.AbstractDecryptInputProcessor",
      "org.apache.xml.security.stax.impl.stax.XMLSecEventBaseImpl",
      "org.apache.xml.security.stax.impl.SignaturePartDef",
      "org.apache.xml.security.binding.xmldsig.DSAKeyValueType",
      "org.apache.xml.security.stax.ext.XMLSecurityConstants$Action",
      "org.apache.xml.security.utils.I18n",
      "org.apache.xml.security.stax.impl.processor.output.AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor",
      "org.apache.xml.security.stax.impl.processor.output.XMLEncryptOutputProcessor$1",
      "org.apache.xml.security.stax.impl.securityToken.X509IssuerSerialSecurityToken",
      "org.apache.xml.security.stax.impl.stax.XMLSecEndElementImpl",
      "org.apache.xml.security.stax.impl.processor.input.XMLSecurityInputProcessor$InternalReplayProcessor",
      "org.apache.xml.security.stax.impl.OutputProcessorChainImpl",
      "org.apache.xml.security.stax.ext.XMLSecurityConstants$AlgorithmUsage",
      "org.apache.xml.security.stax.ext.ProcessorChain",
      "org.apache.xml.security.stax.impl.processor.input.XMLSecurityInputProcessor$1",
      "org.apache.xml.security.binding.xmldsig.TransformsType",
      "org.apache.xml.security.binding.xmldsig11.PrimeFieldParamsType",
      "org.apache.xml.security.binding.xmldsig11.CharTwoFieldParamsType"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(RsaKeyValueSecurityToken_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.xml.security.stax.impl.securityToken.AbstractSecurityToken",
      "org.apache.xml.security.stax.impl.securityToken.AbstractInboundSecurityToken",
      "org.apache.xml.security.stax.impl.securityToken.RsaKeyValueSecurityToken",
      "org.apache.xml.security.stax.ext.ComparableType",
      "org.apache.xml.security.stax.securityToken.SecurityTokenConstants$TokenUsage",
      "org.apache.xml.security.stax.securityToken.SecurityTokenConstants$KeyUsage",
      "org.apache.xml.security.stax.securityToken.SecurityTokenConstants$KeyIdentifier",
      "org.apache.xml.security.stax.securityToken.SecurityTokenConstants$TokenType",
      "org.apache.xml.security.stax.securityToken.SecurityTokenConstants",
      "org.apache.xml.security.binding.xmldsig.RSAKeyValueType",
      "org.apache.xml.security.stax.impl.AbstractSecurityContextImpl",
      "org.apache.xml.security.stax.config.ConfigurationProperties",
      "org.apache.xml.security.stax.impl.InboundSecurityContextImpl",
      "org.apache.xml.security.stax.impl.util.IDGenerator",
      "org.apache.xml.security.stax.securityEvent.SecurityEvent",
      "org.apache.xml.security.stax.securityEvent.AlgorithmSuiteSecurityEvent",
      "org.apache.xml.security.stax.securityEvent.SecurityEventConstants$Event",
      "org.apache.xml.security.stax.securityEvent.SecurityEventConstants",
      "org.apache.xml.security.stax.ext.XMLSecurityConstants$AlgorithmUsage",
      "org.apache.xml.security.stax.ext.XMLSecurityProperties",
      "org.apache.xml.security.stax.ext.XMLSecurityConstants$Action",
      "org.apache.xml.security.stax.ext.XMLSecurityConstants",
      "org.apache.xml.security.stax.ext.AbstractOutputProcessor",
      "org.apache.xml.security.stax.impl.processor.output.AbstractSignatureOutputProcessor",
      "org.apache.xml.security.stax.impl.processor.output.XMLSignatureOutputProcessor",
      "org.apache.xml.security.stax.ext.XMLSecurityConstants$Phase",
      "org.apache.xml.security.stax.impl.stax.XMLSecEventBaseImpl$EmptyIterator",
      "org.apache.xml.security.stax.impl.stax.XMLSecEventBaseImpl",
      "org.apache.xml.security.stax.impl.stax.XMLSecAttributeImpl",
      "org.apache.xml.security.exceptions.XMLSecurityException",
      "org.apache.xml.security.stax.impl.SignaturePartDef",
      "org.apache.xml.security.stax.impl.securityToken.X509SecurityToken",
      "org.apache.xml.security.stax.impl.stax.XMLSecStartElementImpl",
      "org.apache.xml.security.stax.impl.processor.output.AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor",
      "org.apache.xml.security.binding.xmldsig11.ECKeyValueType",
      "org.apache.xml.security.stax.impl.securityToken.ECKeyValueSecurityToken",
      "org.apache.xml.security.utils.I18n",
      "org.apache.xml.security.Init",
      "org.apache.xml.security.binding.xmldsig.DSAKeyValueType",
      "org.apache.xml.security.stax.impl.securityToken.DsaKeyValueSecurityToken",
      "org.apache.xml.security.stax.impl.securityToken.X509SubjectNameSecurityToken",
      "org.apache.xml.security.stax.impl.securityToken.X509SKISecurityToken",
      "org.apache.xml.security.stax.impl.InputProcessorChainImpl",
      "org.apache.xml.security.stax.impl.DocumentContextImpl",
      "org.apache.xml.security.binding.xmldsig.SignatureType",
      "org.apache.xml.security.stax.ext.AbstractInputProcessor",
      "org.apache.xml.security.stax.impl.processor.input.AbstractSignatureReferenceVerifyInputProcessor",
      "org.apache.xml.security.stax.ext.stax.XMLSecEventFactory",
      "org.apache.xml.security.stax.impl.stax.XMLSecEndElementImpl",
      "org.apache.xml.security.stax.impl.processor.output.AbstractEncryptOutputProcessor",
      "org.apache.xml.security.stax.impl.processor.output.XMLEncryptOutputProcessor",
      "org.apache.xml.security.stax.impl.stax.XMLSecEntityDeclarationImpl",
      "org.apache.xml.security.stax.impl.securityToken.KeyNameSecurityToken",
      "org.apache.xml.security.stax.impl.stax.XMLSecNamespaceImpl",
      "org.apache.xml.security.stax.impl.OutboundSecurityContextImpl",
      "org.apache.xml.security.stax.impl.OutputProcessorChainImpl",
      "org.apache.xml.security.stax.impl.XMLSecurityStreamWriter",
      "org.apache.xml.security.stax.impl.XMLSecurityStreamWriter$NSContext",
      "org.apache.xml.security.stax.impl.processor.output.FinalOutputProcessor",
      "org.apache.xml.security.stax.impl.XMLSecurityEventWriter",
      "org.apache.xml.security.stax.impl.stax.XMLSecCharactersImpl",
      "org.apache.xml.security.stax.impl.securityToken.X509IssuerSerialSecurityToken",
      "org.apache.xml.security.stax.impl.stax.XMLSecStartDocumentImpl",
      "org.apache.xml.security.stax.impl.processor.input.XMLEventReaderInputProcessor",
      "org.apache.xml.security.stax.securityEvent.AbstractElementSecurityEvent",
      "org.apache.xml.security.stax.securityEvent.AbstractSecuredElementSecurityEvent",
      "org.apache.xml.security.stax.securityEvent.ContentEncryptedElementSecurityEvent",
      "org.apache.xml.security.stax.impl.processor.input.LogInputProcessor",
      "org.apache.xml.security.stax.impl.processor.input.XMLSecurityInputProcessor$InternalReplayProcessor",
      "org.apache.xml.security.binding.xmldsig11.NamedCurveType",
      "org.apache.xml.security.stax.impl.processor.input.XMLSecurityInputProcessor",
      "org.apache.xml.security.stax.impl.processor.input.AbstractDecryptInputProcessor",
      "org.apache.xml.security.stax.impl.stax.XMLSecCommentImpl",
      "org.apache.xml.security.binding.xmldsig11.ECParametersType",
      "org.apache.xml.security.stax.impl.securityToken.GenericOutboundSecurityToken",
      "org.apache.xml.security.stax.impl.processor.input.XMLSecurityInputProcessor$InternalBufferProcessor",
      "org.apache.xml.security.binding.xmldsig.ReferenceType",
      "org.apache.xml.security.stax.impl.stax.XMLSecEndDocumentImpl",
      "org.apache.xml.security.stax.impl.stax.XMLSecDTDImpl",
      "org.apache.xml.security.stax.impl.stax.XMLSecProcessingInstructionImpl",
      "org.apache.xml.security.stax.impl.stax.XMLSecEntityReferenceImpl",
      "org.apache.xml.security.binding.xmlenc.EncryptedType",
      "org.apache.xml.security.binding.xmlenc.EncryptedDataType"
    );
  }
}
