/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 28 14:14:53 GMT 2021
 */

package com.ufcg.sad.services.csv;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class CsvUploaderImpl_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.ufcg.sad.services.csv.CsvUploaderImpl"; 
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
    java.lang.System.setProperty("user.dir", "/home/cassioegc/tcc/sad-ufcg"); 
    java.lang.System.setProperty("user.home", "/home/cassioegc"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "cassioegc"); 
    java.lang.System.setProperty("user.timezone", "America/Recife"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CsvUploaderImpl_ESTest_scaffolding.class.getClassLoader() ,
      "com.ufcg.sad.services.csv.CsvUploaderImpl",
      "com.ufcg.sad.services.disciplina.DisciplinaServiceImpl",
      "org.springframework.data.jpa.repository.Query",
      "com.ufcg.sad.repositories.AlunoRepository",
      "com.ufcg.sad.models.disciplina.Disciplina",
      "com.ufcg.sad.services.professor.ProfessorServiceImpl",
      "org.springframework.http.HttpStatus$Series",
      "org.springframework.beans.factory.annotation.Autowired",
      "com.ufcg.sad.repositories.DisciplinaRepository",
      "com.ufcg.sad.repositories.ProfessorRepository",
      "org.springframework.data.repository.CrudRepository",
      "com.ufcg.sad.services.disciplina.DisciplinaService",
      "org.springframework.data.annotation.QueryAnnotation",
      "org.springframework.data.repository.NoRepositoryBean",
      "org.springframework.data.domain.Sort$Direction",
      "com.ufcg.sad.models.aluno.Aluno",
      "com.ufcg.sad.services.professor.ProfessorService",
      "com.ufcg.sad.models.matricula.Matricula",
      "org.springframework.stereotype.Service",
      "com.ufcg.sad.exceptions.EntidadeNotFoundException",
      "org.springframework.data.repository.Repository",
      "com.ufcg.sad.models.professor.Professor",
      "com.ufcg.sad.services.csv.CsvUploader",
      "org.springframework.data.domain.Sort",
      "org.springframework.data.domain.Pageable",
      "org.springframework.stereotype.Repository",
      "org.springframework.web.bind.annotation.ResponseStatus",
      "org.springframework.core.convert.converter.Converter",
      "com.ufcg.sad.services.aluno.AlunoService",
      "org.springframework.data.repository.PagingAndSortingRepository",
      "org.springframework.data.domain.ExampleMatcher",
      "org.springframework.data.domain.Page",
      "org.springframework.data.domain.Example",
      "org.springframework.data.domain.Sort$Order",
      "org.springframework.data.domain.Slice",
      "org.springframework.data.repository.query.QueryByExampleExecutor",
      "org.springframework.http.HttpStatus",
      "org.springframework.stereotype.Component",
      "org.springframework.core.io.InputStreamSource",
      "org.springframework.web.multipart.MultipartFile",
      "com.ufcg.sad.exceptions.EntidadeInvalidaException",
      "com.ufcg.sad.services.aluno.AlunoServiceImpl",
      "org.springframework.data.jpa.repository.JpaRepository"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.ufcg.sad.repositories.AlunoRepository", false, CsvUploaderImpl_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.ufcg.sad.repositories.DisciplinaRepository", false, CsvUploaderImpl_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.ufcg.sad.repositories.ProfessorRepository", false, CsvUploaderImpl_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.springframework.web.multipart.MultipartFile", false, CsvUploaderImpl_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CsvUploaderImpl_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.ufcg.sad.services.csv.CsvUploaderImpl",
      "com.ufcg.sad.services.aluno.AlunoServiceImpl",
      "com.ufcg.sad.services.disciplina.DisciplinaServiceImpl",
      "com.ufcg.sad.services.professor.ProfessorServiceImpl",
      "com.ufcg.sad.models.disciplina.Disciplina",
      "com.ufcg.sad.exceptions.EntidadeInvalidaException",
      "com.ufcg.sad.exceptions.EntidadeNotFoundException",
      "com.ufcg.sad.models.professor.Professor",
      "com.ufcg.sad.models.aluno.Aluno",
      "com.ufcg.sad.models.matricula.Matricula"
    );
  }
}
