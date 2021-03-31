/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 31 15:41:33 GMT 2021
 */

package org.la4j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.la4j.Vectors;
import org.la4j.vector.functor.VectorAccumulator;
import org.la4j.vector.functor.VectorFunction;
import org.la4j.vector.functor.VectorProcedure;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Vectors_ESTest extends Vectors_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        Vectors.asSumFunctionAccumulator(Double.POSITIVE_INFINITY, (VectorFunction) null);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        Vectors.asSumAccumulator(Double.NEGATIVE_INFINITY);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VectorFunction vectorFunction0 = Vectors.asConstFunction(0.0);
      // Undeclared exception!
      try { 
        Vectors.asProductFunctionAccumulator(Double.NEGATIVE_INFINITY, vectorFunction0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        Vectors.asProductAccumulator(Double.NEGATIVE_INFINITY);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VectorAccumulator vectorAccumulator0 = Vectors.asProductAccumulator(5654.148973733);
      assertNotNull(vectorAccumulator0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VectorAccumulator vectorAccumulator0 = Vectors.asSumAccumulator(0.0);
      assertNotNull(vectorAccumulator0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VectorAccumulator vectorAccumulator0 = Vectors.mkManhattanNormAccumulator();
      assertNotNull(vectorAccumulator0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VectorFunction vectorFunction0 = Vectors.asPlusFunction(100.0);
      assertNotNull(vectorFunction0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VectorFunction vectorFunction0 = Vectors.asMinusFunction(100.0);
      assertNotNull(vectorFunction0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VectorFunction vectorFunction0 = Vectors.asMulFunction(100.0);
      assertNotNull(vectorFunction0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VectorAccumulator vectorAccumulator0 = Vectors.mkInfinityNormAccumulator();
      assertNotNull(vectorAccumulator0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VectorAccumulator vectorAccumulator0 = Vectors.mkMaxAccumulator();
      assertNotNull(vectorAccumulator0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      VectorAccumulator vectorAccumulator0 = Vectors.mkEuclideanNormAccumulator();
      assertNotNull(vectorAccumulator0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VectorFunction vectorFunction0 = Vectors.asModFunction(100.0);
      assertNotNull(vectorFunction0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      VectorFunction vectorFunction0 = Vectors.asDivFunction(100.0);
      VectorAccumulator vectorAccumulator0 = Vectors.asSumFunctionAccumulator(100.0, vectorFunction0);
      assertNotNull(vectorAccumulator0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      VectorFunction vectorFunction0 = Vectors.asDivFunction(100.0);
      VectorAccumulator vectorAccumulator0 = Vectors.asProductFunctionAccumulator(100.0, vectorFunction0);
      assertNotNull(vectorAccumulator0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      VectorAccumulator vectorAccumulator0 = Vectors.mkMinAccumulator();
      VectorProcedure vectorProcedure0 = Vectors.asAccumulatorProcedure(vectorAccumulator0);
      assertNotNull(vectorProcedure0);
  }
}
