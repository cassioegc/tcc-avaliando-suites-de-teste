/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Mar 25 02:12:39 GMT 2021
 */

package com.unifacisa.tcc.config;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class DateTimeFormatConfiguration_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.unifacisa.tcc.config.DateTimeFormatConfiguration"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DateTimeFormatConfiguration_ESTest_scaffolding.class.getClassLoader() ,
      "org.springframework.format.datetime.standard.DateTimeConverters$ZonedDateTimeToLocalDateTimeConverter",
      "org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer",
      "org.springframework.validation.Validator",
      "org.springframework.format.datetime.standard.TemporalAccessorParser",
      "org.springframework.format.datetime.DateFormatterRegistrar$DateToLongConverter",
      "org.springframework.format.AnnotationFormatterFactory",
      "org.springframework.format.datetime.standard.DateTimeConverters$LongToInstantConverter",
      "org.springframework.format.datetime.standard.DateTimeFormatterFactory$1",
      "org.springframework.format.datetime.standard.DateTimeFormatterRegistrar",
      "org.springframework.format.annotation.DateTimeFormat$ISO",
      "org.springframework.format.datetime.standard.DateTimeConverters$LocalDateTimeToLocalTimeConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters",
      "org.springframework.format.datetime.standard.MonthDayFormatter",
      "org.springframework.format.datetime.standard.DateTimeConverters$InstantToLongConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$CalendarToLocalTimeConverter",
      "org.springframework.web.servlet.config.annotation.InterceptorRegistry",
      "org.springframework.core.convert.converter.GenericConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$CalendarToInstantConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$ZonedDateTimeToLocalDateConverter",
      "org.springframework.web.servlet.config.annotation.PathMatchConfigurer",
      "org.springframework.format.FormatterRegistry",
      "org.springframework.format.Parser",
      "org.springframework.format.datetime.DateFormatterRegistrar$LongToCalendarConverter",
      "org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer",
      "org.springframework.format.datetime.standard.DateTimeFormatterRegistrar$Type",
      "org.springframework.format.datetime.standard.DateTimeConverters$OffsetDateTimeToZonedDateTimeConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$CalendarToLocalDateConverter",
      "org.springframework.core.convert.converter.ConverterRegistry",
      "org.springframework.format.datetime.DateFormatterRegistrar",
      "org.springframework.format.datetime.standard.DateTimeConverters$OffsetDateTimeToLocalDateConverter",
      "org.springframework.context.annotation.Configuration",
      "org.springframework.format.datetime.standard.DateTimeFormatterRegistrar$1",
      "org.springframework.format.datetime.DateFormatterRegistrar$CalendarToDateConverter",
      "org.springframework.format.datetime.DateFormatterRegistrar$CalendarToLongConverter",
      "org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer",
      "org.springframework.format.datetime.standard.DateTimeConverters$ZonedDateTimeToOffsetDateTimeConverter",
      "org.springframework.format.FormatterRegistrar",
      "com.unifacisa.tcc.config.DateTimeFormatConfiguration",
      "org.springframework.format.datetime.standard.DateTimeConverters$ZonedDateTimeToLocalTimeConverter",
      "org.springframework.format.datetime.standard.InstantFormatter",
      "org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter",
      "org.springframework.web.servlet.config.annotation.ViewControllerRegistry",
      "org.springframework.format.datetime.standard.TemporalAccessorPrinter",
      "org.springframework.beans.factory.Aware",
      "org.springframework.format.Printer",
      "org.springframework.web.servlet.config.annotation.CorsRegistry",
      "org.springframework.format.datetime.standard.DurationFormatter",
      "org.springframework.format.datetime.standard.DateTimeConverters$CalendarToZonedDateTimeConverter",
      "org.springframework.format.datetime.standard.Jsr310DateTimeFormatAnnotationFormatterFactory",
      "org.springframework.format.datetime.standard.DateTimeConverters$OffsetDateTimeToLocalDateTimeConverter",
      "org.springframework.format.datetime.standard.YearMonthFormatter",
      "org.springframework.format.datetime.standard.DateTimeConverters$LocalDateTimeToLocalDateConverter",
      "org.springframework.format.Formatter",
      "org.springframework.format.datetime.standard.DateTimeConverters$ZonedDateTimeToInstantConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$CalendarToLocalDateTimeConverter",
      "org.springframework.validation.MessageCodesResolver",
      "org.springframework.format.datetime.DateFormatterRegistrar$DateToCalendarConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$OffsetDateTimeToInstantConverter",
      "org.springframework.core.convert.converter.Converter",
      "org.springframework.format.datetime.standard.DateTimeFormatterFactory",
      "org.springframework.core.convert.converter.ConverterFactory",
      "org.springframework.format.datetime.standard.DateTimeConverters$OffsetDateTimeToLocalTimeConverter",
      "org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry",
      "org.springframework.format.datetime.standard.PeriodFormatter",
      "org.springframework.stereotype.Component",
      "org.springframework.web.servlet.config.annotation.ViewResolverRegistry",
      "org.springframework.format.datetime.DateFormatterRegistrar$LongToDateConverter",
      "org.springframework.context.EmbeddedValueResolverAware",
      "org.springframework.format.datetime.standard.DateTimeConverters$CalendarToOffsetDateTimeConverter",
      "org.springframework.web.servlet.config.annotation.WebMvcConfigurer",
      "org.springframework.context.support.EmbeddedValueResolutionSupport",
      "org.springframework.util.StringUtils"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.springframework.format.FormatterRegistry", false, DateTimeFormatConfiguration_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DateTimeFormatConfiguration_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter",
      "com.unifacisa.tcc.config.DateTimeFormatConfiguration",
      "org.springframework.format.datetime.standard.DateTimeFormatterRegistrar",
      "org.springframework.format.datetime.standard.DateTimeFormatterRegistrar$Type",
      "org.springframework.format.datetime.standard.DateTimeFormatterFactory",
      "org.springframework.format.annotation.DateTimeFormat$ISO",
      "org.springframework.format.datetime.standard.DateTimeConverters",
      "org.springframework.format.datetime.DateFormatterRegistrar",
      "org.springframework.format.datetime.DateFormatterRegistrar$DateToLongConverter",
      "org.springframework.format.datetime.DateFormatterRegistrar$DateToCalendarConverter",
      "org.springframework.format.datetime.DateFormatterRegistrar$CalendarToDateConverter",
      "org.springframework.format.datetime.DateFormatterRegistrar$CalendarToLongConverter",
      "org.springframework.format.datetime.DateFormatterRegistrar$LongToDateConverter",
      "org.springframework.format.datetime.DateFormatterRegistrar$LongToCalendarConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$LocalDateTimeToLocalDateConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$LocalDateTimeToLocalTimeConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$ZonedDateTimeToLocalDateConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$ZonedDateTimeToLocalTimeConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$ZonedDateTimeToLocalDateTimeConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$ZonedDateTimeToOffsetDateTimeConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$ZonedDateTimeToInstantConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$OffsetDateTimeToLocalDateConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$OffsetDateTimeToLocalTimeConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$OffsetDateTimeToLocalDateTimeConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$OffsetDateTimeToZonedDateTimeConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$OffsetDateTimeToInstantConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$CalendarToZonedDateTimeConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$CalendarToOffsetDateTimeConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$CalendarToLocalDateConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$CalendarToLocalTimeConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$CalendarToLocalDateTimeConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$CalendarToInstantConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$LongToInstantConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$InstantToLongConverter",
      "org.springframework.format.datetime.standard.DateTimeFormatterRegistrar$1",
      "org.springframework.util.StringUtils",
      "org.springframework.format.datetime.standard.DateTimeFormatterFactory$1",
      "org.springframework.format.datetime.standard.TemporalAccessorPrinter",
      "org.springframework.format.datetime.standard.TemporalAccessorParser",
      "org.springframework.format.datetime.standard.InstantFormatter",
      "org.springframework.format.datetime.standard.PeriodFormatter",
      "org.springframework.format.datetime.standard.DurationFormatter",
      "org.springframework.format.datetime.standard.YearMonthFormatter",
      "org.springframework.format.datetime.standard.MonthDayFormatter",
      "org.springframework.context.support.EmbeddedValueResolutionSupport",
      "org.springframework.format.datetime.standard.Jsr310DateTimeFormatAnnotationFormatterFactory"
    );
  }
}
