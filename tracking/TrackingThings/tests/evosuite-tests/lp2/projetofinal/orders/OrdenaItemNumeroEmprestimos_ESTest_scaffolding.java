/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Feb 23 18:07:53 GMT 2021
 */

package lp2.projetofinal.orders;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class OrdenaItemNumeroEmprestimos_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos"; 
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
    java.lang.System.setProperty("user.dir", "/home/cassioegc/M\u00FAsica/TrackingThings/TrackingThings/tests"); 
    java.lang.System.setProperty("user.home", "/home/cassioegc"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "cassioegc"); 
    java.lang.System.setProperty("user.timezone", "America/Recife"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(OrdenaItemNumeroEmprestimos_ESTest_scaffolding.class.getClassLoader() ,
      "lp2.projetofinal.enums.PlataformaJogoEletronico",
      "lp2.projetofinal.entidades.BluRayShow",
      "lp2.projetofinal.entidades.Item",
      "lp2.projetofinal.entidades.BluRay",
      "lp2.projetofinal.enums.ClassificacaoBluRay",
      "lp2.projetofinal.entidades.EpisodioSerie",
      "lp2.projetofinal.entidades.BluRaySerie",
      "lp2.projetofinal.entidades.JogoTabuleiro",
      "lp2.projetofinal.enums.GeneroBluRay",
      "lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos",
      "lp2.projetofinal.entidades.JogoEletronico",
      "lp2.projetofinal.entidades.BluRayFilme",
      "lp2.projetofinal.enums.EstadoItem"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(OrdenaItemNumeroEmprestimos_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "lp2.projetofinal.orders.OrdenaItemNumeroEmprestimos",
      "lp2.projetofinal.entidades.Item",
      "lp2.projetofinal.entidades.JogoEletronico",
      "lp2.projetofinal.enums.EstadoItem",
      "lp2.projetofinal.enums.PlataformaJogoEletronico",
      "lp2.projetofinal.entidades.JogoTabuleiro",
      "lp2.projetofinal.entidades.BluRay",
      "lp2.projetofinal.entidades.BluRayFilme",
      "lp2.projetofinal.enums.ClassificacaoBluRay",
      "lp2.projetofinal.enums.GeneroBluRay",
      "lp2.projetofinal.entidades.BluRayShow",
      "lp2.projetofinal.entidades.BluRaySerie",
      "lp2.projetofinal.entidades.EpisodioSerie"
    );
  }
}
