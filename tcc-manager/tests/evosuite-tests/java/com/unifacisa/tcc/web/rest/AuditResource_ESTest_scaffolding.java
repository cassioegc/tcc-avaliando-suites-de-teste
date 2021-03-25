/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Mar 25 02:10:34 GMT 2021
 */

package com.unifacisa.tcc.web.rest;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class AuditResource_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.unifacisa.tcc.web.rest.AuditResource"; 
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
    java.lang.System.setProperty("user.dir", "/home/cassioegc/tcc/tcc-manager"); 
    java.lang.System.setProperty("user.home", "/home/cassioegc"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "cassioegc"); 
    java.lang.System.setProperty("user.timezone", "America/Recife"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AuditResource_ESTest_scaffolding.class.getClassLoader() ,
      "org.springframework.web.util.UriComponentsBuilder",
      "com.unifacisa.tcc.domain.PersistentAuditEvent",
      "org.springframework.web.util.HierarchicalUriComponents$1",
      "com.unifacisa.tcc.web.rest.util.PaginationUtil",
      "com.unifacisa.tcc.service.AuditEventService",
      "org.springframework.web.util.UriComponentsBuilder$FullPathComponentBuilder",
      "org.springframework.data.domain.Sort$Direction",
      "org.springframework.web.util.HierarchicalUriComponents",
      "org.springframework.data.repository.Repository",
      "org.springframework.data.domain.Pageable",
      "org.springframework.data.domain.Sort",
      "com.unifacisa.tcc.repository.PersistenceAuditEventRepository",
      "org.springframework.web.util.HierarchicalUriComponents$Type$11",
      "org.springframework.web.util.HierarchicalUriComponents$Type$12",
      "org.springframework.data.repository.PagingAndSortingRepository",
      "com.unifacisa.tcc.web.rest.AuditResource",
      "org.springframework.web.util.HierarchicalUriComponents$Type$10",
      "org.springframework.http.HttpHeaders",
      "org.springframework.data.domain.PageRequest",
      "org.springframework.web.bind.annotation.RequestMethod",
      "org.springframework.web.util.UriComponents$UriTemplateVariables",
      "org.springframework.data.domain.Page",
      "org.springframework.data.domain.Example",
      "org.springframework.web.util.HierarchicalUriComponents$FullPathComponent",
      "org.springframework.web.bind.annotation.RestController",
      "org.springframework.data.domain.Slice",
      "org.springframework.data.domain.Sort$NullHandling",
      "org.springframework.http.HttpEntity",
      "org.springframework.web.util.UriComponentsBuilder$CompositePathComponentBuilder",
      "org.springframework.web.util.UriComponentsBuilder$PathSegmentComponentBuilder",
      "org.springframework.util.CollectionUtils",
      "org.springframework.web.util.HierarchicalUriComponents$Type",
      "org.springframework.http.ResponseEntity$HeadersBuilder",
      "org.springframework.transaction.annotation.Isolation",
      "org.springframework.data.jpa.repository.JpaRepository",
      "org.springframework.web.util.OpaqueUriComponents",
      "org.springframework.util.LinkedCaseInsensitiveMap",
      "com.unifacisa.tcc.config.audit.AuditEventConverter",
      "org.springframework.web.bind.annotation.RequestMapping",
      "org.springframework.data.domain.AbstractPageRequest",
      "io.github.jhipster.web.util.ResponseUtil",
      "org.springframework.stereotype.Controller",
      "org.springframework.http.ResponseEntity$BodyBuilder",
      "org.springframework.data.repository.CrudRepository",
      "org.springframework.web.util.UriComponentsBuilder$PathComponentBuilder",
      "org.springframework.transaction.annotation.Propagation",
      "org.springframework.web.util.HierarchicalUriComponents$PathComponent",
      "org.springframework.boot.actuate.audit.AuditEvent",
      "org.springframework.stereotype.Service",
      "org.springframework.web.util.HierarchicalUriComponents$Type$8",
      "org.springframework.web.util.HierarchicalUriComponents$Type$9",
      "org.springframework.web.util.HierarchicalUriComponents$Type$4",
      "org.springframework.web.util.HierarchicalUriComponents$Type$5",
      "org.springframework.web.util.HierarchicalUriComponents$Type$6",
      "org.springframework.web.util.HierarchicalUriComponents$Type$7",
      "org.springframework.core.convert.converter.Converter",
      "org.springframework.web.util.HierarchicalUriComponents$Type$1",
      "org.springframework.web.util.HierarchicalUriComponents$Type$2",
      "org.springframework.web.util.HierarchicalUriComponents$Type$3",
      "org.springframework.util.ObjectUtils",
      "org.springframework.util.MultiValueMap",
      "org.springframework.web.bind.annotation.ResponseBody",
      "org.springframework.data.domain.Sort$Order",
      "org.springframework.util.CollectionUtils$MultiValueMapAdapter",
      "org.springframework.util.LinkedCaseInsensitiveMap$1",
      "org.springframework.data.repository.query.QueryByExampleExecutor",
      "org.springframework.http.HttpStatus",
      "org.springframework.stereotype.Component",
      "org.springframework.http.ResponseEntity",
      "org.springframework.util.LinkedMultiValueMap",
      "org.springframework.transaction.annotation.Transactional",
      "org.springframework.web.bind.annotation.Mapping",
      "org.springframework.util.Assert",
      "org.springframework.web.util.UriComponents",
      "org.springframework.util.StringUtils"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.unifacisa.tcc.domain.PersistentAuditEvent", false, AuditResource_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.unifacisa.tcc.repository.PersistenceAuditEventRepository", false, AuditResource_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.unifacisa.tcc.service.AuditEventService", false, AuditResource_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.springframework.data.domain.Page", false, AuditResource_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AuditResource_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.unifacisa.tcc.web.rest.AuditResource",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "org.springframework.transaction.annotation.Propagation",
      "org.springframework.transaction.annotation.Isolation",
      "org.springframework.web.util.UriComponentsBuilder",
      "org.springframework.http.HttpStatus",
      "com.unifacisa.tcc.service.AuditEventService",
      "com.unifacisa.tcc.web.rest.util.PaginationUtil",
      "org.springframework.http.HttpHeaders",
      "org.springframework.util.LinkedCaseInsensitiveMap",
      "org.springframework.util.LinkedCaseInsensitiveMap$1",
      "org.springframework.util.Assert",
      "com.unifacisa.tcc.config.audit.AuditEventConverter",
      "org.springframework.data.domain.AbstractPageRequest",
      "org.springframework.data.domain.PageRequest",
      "org.springframework.data.domain.Sort",
      "org.springframework.data.domain.Sort$Order",
      "org.springframework.util.StringUtils",
      "io.github.jhipster.web.util.ResponseUtil",
      "org.springframework.http.HttpEntity",
      "org.springframework.http.ResponseEntity",
      "org.springframework.boot.actuate.audit.AuditEvent",
      "com.unifacisa.tcc.domain.PersistentAuditEvent",
      "org.springframework.util.LinkedMultiValueMap",
      "org.springframework.web.util.UriComponentsBuilder$CompositePathComponentBuilder",
      "org.springframework.web.util.UriComponentsBuilder$FullPathComponentBuilder",
      "org.springframework.util.ObjectUtils",
      "org.springframework.web.util.UriComponents",
      "org.springframework.web.util.HierarchicalUriComponents$1",
      "org.springframework.web.util.HierarchicalUriComponents",
      "org.springframework.web.util.HierarchicalUriComponents$FullPathComponent",
      "org.springframework.util.CollectionUtils",
      "org.springframework.util.CollectionUtils$MultiValueMapAdapter",
      "org.springframework.web.util.HierarchicalUriComponents$Type",
      "org.springframework.data.domain.Sort$NullHandling"
    );
  }
}
