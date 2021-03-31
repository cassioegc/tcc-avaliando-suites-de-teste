/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 31 14:46:29 GMT 2021
 */

package org.la4j.vector;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.matrix.sparse.CCSMatrix;
import org.la4j.matrix.sparse.CRSMatrix;
import org.la4j.operation.VectorOperation;
import org.la4j.operation.VectorVectorOperation;
import org.la4j.operation.ooplace.OoPlaceInnerProduct;
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;
import org.la4j.vector.VectorFactory;
import org.la4j.vector.functor.VectorAccumulator;
import org.la4j.vector.functor.VectorProcedure;
import org.la4j.vector.sparse.CompressedVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SparseVector_ESTest extends SparseVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(1470, 1470);
      Matrix matrix0 = sparseVector0.toDiagonalMatrix();
      assertEquals(1470, matrix0.rows());
      assertEquals(1470, matrix0.columns());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      Matrix matrix0 = sparseVector0.toRowMatrix();
      assertEquals(6, matrix0.columns());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[3] = (-1.0);
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      sparseVector0.hashCode();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CompressedVector compressedVector0 = (CompressedVector)SparseVector.zero(1, 1);
      ((SparseVector)compressedVector0).ensureIndexIsInBounds(0);
      assertEquals(1, compressedVector0.length());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(0);
      sparseVector0.eachNonZero((VectorProcedure) null);
      assertEquals(0, sparseVector0.length());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 1.0;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      Locale locale0 = Locale.FRANCE;
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance(locale0);
      String string0 = sparseVector0.toMatrixMarket(numberFormat0);
      assertEquals("%%MatrixMarket vector coordinate real\n9 1\n1 1\n", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      SparseVector sparseVector0 = SparseVector.fromCollection(linkedList0);
      Matrix matrix0 = sparseVector0.toColumnMatrix();
      assertEquals(0, matrix0.rows());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(0);
      VectorFactory<SparseVector> vectorFactory0 = (VectorFactory<SparseVector>) mock(VectorFactory.class, new ViolatedAssumptionAnswer());
      doReturn((Vector) null).when(vectorFactory0).apply(anyInt());
      sparseVector0.to(vectorFactory0);
      assertEquals(Double.NaN, sparseVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<Short> linkedList0 = new LinkedList<Short>();
      SparseVector sparseVector0 = SparseVector.fromCollection(linkedList0);
      VectorFactory<SparseVector> vectorFactory0 = (VectorFactory<SparseVector>) mock(VectorFactory.class, new ViolatedAssumptionAnswer());
      doReturn(sparseVector0).when(vectorFactory0).apply(anyInt());
      SparseVector sparseVector1 = sparseVector0.to(vectorFactory0);
      assertSame(sparseVector1, sparseVector0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(1L);
      SparseVector sparseVector0 = SparseVector.random(0, 1.0, (Random) mockRandom0);
      assertEquals(0, sparseVector0.length());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(49);
      SparseVector sparseVector0 = SparseVector.random(49, 1.0, (Random) mockRandom0);
      double double0 = sparseVector0.min();
      assertEquals(0.0, double0, 0.01);
      assertEquals(49, sparseVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.random(1391, 0.0, (Random) null);
      sparseVector0.nonZeroIterator();
      assertEquals(1391, sparseVector0.length());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = (-460.264);
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      boolean boolean0 = sparseVector0.nonZeroAt(3);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(1);
      sparseVector0.nonZeroAt(0);
      assertEquals(1, sparseVector0.length());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(0);
      CompressedVector compressedVector0 = (CompressedVector)sparseVector0.multiply((double) 0);
      assertEquals(Double.NaN, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(2734, 386);
      sparseVector0.getOrElse(386, 0.0);
      assertEquals(2734, sparseVector0.length());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(1470, 1470);
      sparseVector0.getOrElse(0, 1601.3065895194);
      assertEquals(1470, sparseVector0.length());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[4] = (-535.724746760305);
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      double double0 = sparseVector0.getOrElse(4, 3642.2);
      assertEquals((-535.724746760305), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<Integer, Short> hashMap0 = new HashMap<Integer, Short>();
      SparseVector sparseVector0 = SparseVector.fromMap(hashMap0, 2861);
      double double0 = sparseVector0.get(361);
      assertEquals(0.0, double0, 0.01);
      assertEquals(2861, sparseVector0.length());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = 1648.14386793402;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      double double0 = sparseVector0.get(1);
      assertEquals(1648.14386793402, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      Double double0 = new Double((-1.0));
      linkedList0.offer(double0);
      SparseVector sparseVector0 = SparseVector.fromCollection(linkedList0);
      double double1 = sparseVector0.get(0);
      assertEquals((-1.0), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<Integer, Byte> hashMap0 = new HashMap<Integer, Byte>();
      SparseVector sparseVector0 = SparseVector.fromMap(hashMap0, 0);
      assertEquals(0, sparseVector0.length());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<Integer, Float> hashMap0 = new HashMap<Integer, Float>();
      Integer integer0 = Integer.valueOf(17);
      Float float0 = new Float((double) 17);
      hashMap0.put(integer0, float0);
      SparseVector sparseVector0 = SparseVector.fromMap(hashMap0, 2459);
      assertEquals(4.0666937779585197E-4, sparseVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(0);
      linkedList0.add(integer0);
      SparseVector sparseVector0 = SparseVector.fromCollection(linkedList0);
      assertEquals(0, sparseVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.fromCSV("");
      assertEquals(0, sparseVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      assertEquals(Double.NaN, sparseVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(1);
      VectorAccumulator vectorAccumulator0 = mock(VectorAccumulator.class, new ViolatedAssumptionAnswer());
      doReturn(1.0).when(vectorAccumulator0).accumulate();
      sparseVector0.foldNonZero(vectorAccumulator0);
      assertEquals(1, sparseVector0.length());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      VectorAccumulator vectorAccumulator0 = mock(VectorAccumulator.class, new ViolatedAssumptionAnswer());
      doReturn((-1554.2924)).when(vectorAccumulator0).accumulate();
      double double0 = sparseVector0.foldNonZero(vectorAccumulator0);
      assertEquals((-1554.2924), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1537.86;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      double double0 = sparseVector0.euclideanNorm();
      assertEquals(1537.86, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HashMap<Integer, Double> hashMap0 = new HashMap<Integer, Double>();
      SparseVector sparseVector0 = SparseVector.fromMap(hashMap0, 32);
      double double0 = sparseVector0.density();
      assertEquals(32, sparseVector0.length());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 178.55166;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      double double0 = sparseVector0.density();
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 1517.8273787;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      int int0 = sparseVector0.cardinality();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(0);
      Vector vector0 = sparseVector0.add((double) 0);
      assertEquals(0, vector0.length());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        SparseVector.zero((-2957), 2374);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong vector length: -2957
         //
         verifyException("org.la4j.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        SparseVector.zero((-982));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong vector length: -982
         //
         verifyException("org.la4j.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-1.0);
      SparseVector.fromArray(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.fromCSV("9");
      // Undeclared exception!
      try { 
        sparseVector0.getOrElse(1419, 1419);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index '1419' is invalid.
         //
         verifyException("org.la4j.vector.SparseVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        SparseVector.fromMatrixMarket((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 17, 1);
      // Undeclared exception!
      try { 
        SparseVector.fromMatrixMarket(byteArrayInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong input file format: can not read header '%%MatrixMarket'.
         //
         verifyException("org.la4j.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        SparseVector.fromMap((Map<Integer, ? extends Number>) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      HashMap<Integer, Double> hashMap0 = new HashMap<Integer, Double>();
      // Undeclared exception!
      try { 
        SparseVector.fromMap(hashMap0, (-787));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong vector length: -787
         //
         verifyException("org.la4j.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        SparseVector.fromCollection((Collection<? extends Number>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.vector.dense.BasicVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        SparseVector.fromCSV((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.StringTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        SparseVector.fromArray((double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      // Undeclared exception!
      try { 
        sparseVector0.foldNonZero((VectorAccumulator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.vector.SparseVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = Double.NEGATIVE_INFINITY;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      // Undeclared exception!
      try { 
        sparseVector0.euclideanNorm();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CompressedVector compressedVector0 = (CompressedVector)SparseVector.zero(0);
      // Undeclared exception!
      try { 
        ((SparseVector)compressedVector0).ensureIndexIsInBounds(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index '0' is invalid.
         //
         verifyException("org.la4j.vector.SparseVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 1.0;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      // Undeclared exception!
      try { 
        sparseVector0.eachNonZero((VectorProcedure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(1);
      Vector vector0 = sparseVector0.add((double) 1);
      // Undeclared exception!
      try { 
        sparseVector0.apply((VectorVectorOperation<Double>) null, vector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.vector.SparseVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LinkedList<Byte> linkedList0 = new LinkedList<Byte>();
      SparseVector sparseVector0 = SparseVector.fromCollection(linkedList0);
      OoPlaceInnerProduct ooPlaceInnerProduct0 = new OoPlaceInnerProduct();
      double[] doubleArray0 = new double[7];
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      VectorOperation<Double> vectorOperation0 = ooPlaceInnerProduct0.partiallyApply(denseVector0);
      // Undeclared exception!
      try { 
        sparseVector0.apply(vectorOperation0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given vectors should have the same length: 7 does not equal to 0.
         //
         verifyException("org.la4j.operation.ooplace.OoPlaceInnerProduct", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      Double double0 = new Double((-1.0));
      linkedList0.offer(double0);
      SparseVector sparseVector0 = SparseVector.fromCollection(linkedList0);
      Matrix matrix0 = sparseVector0.toRowMatrix();
      assertEquals((-1.0), matrix0.min(), 0.01);
      assertEquals(1, matrix0.columns());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      try { 
        SparseVector.fromMatrixMarket(mockFileInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(0, 0);
      SparseVector sparseVector1 = sparseVector0.toSparseVector();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Vector.fromCollection(linkedList0);
      sparseVector1.toRowMatrix();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(1);
      VectorAccumulator vectorAccumulator0 = mock(VectorAccumulator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(vectorAccumulator0).accumulate();
      sparseVector0.foldNonZero(vectorAccumulator0);
      assertEquals(1, sparseVector0.length());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      OoPlaceInnerProduct ooPlaceInnerProduct0 = new OoPlaceInnerProduct();
      LinkedList<Long> linkedList0 = new LinkedList<Long>();
      DenseVector denseVector0 = DenseVector.fromCollection(linkedList0);
      // Undeclared exception!
      try { 
        sparseVector0.apply((VectorVectorOperation<Double>) ooPlaceInnerProduct0, (Vector) denseVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given vectors should have the same length: 7 does not equal to 0.
         //
         verifyException("org.la4j.operation.ooplace.OoPlaceInnerProduct", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(1101);
      // Undeclared exception!
      try { 
        sparseVector0.get((-1357));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index '-1357' is invalid.
         //
         verifyException("org.la4j.vector.SparseVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      Double double0 = new Double((-1.0));
      linkedList0.offer(double0);
      SparseVector sparseVector0 = SparseVector.fromCollection(linkedList0);
      // Undeclared exception!
      try { 
        sparseVector0.toMatrixMarket((NumberFormat) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.vector.SparseVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      Double double0 = new Double((-1.0));
      linkedList0.offer(double0);
      SparseVector sparseVector0 = SparseVector.fromCollection(linkedList0);
      CRSMatrix cRSMatrix0 = (CRSMatrix)sparseVector0.toDiagonalMatrix();
      assertEquals(0.0, cRSMatrix0.max(), 0.01);
      assertEquals(1.0, cRSMatrix0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(0, 0);
      Matrix matrix0 = sparseVector0.toDiagonalMatrix();
      assertEquals(0, matrix0.rows());
      assertEquals(0, matrix0.columns());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-1121.907);
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      CCSMatrix cCSMatrix0 = (CCSMatrix)sparseVector0.toColumnMatrix();
      assertEquals(0.14285714285714285, cCSMatrix0.density(), 0.01);
      assertEquals(0.0, cCSMatrix0.max(), 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(1, 1);
      sparseVector0.setAll(2152.205696133428);
      sparseVector0.hashCode();
      assertEquals(1, sparseVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-1.273794854434447);
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      double double0 = sparseVector0.infinityNorm();
      assertEquals(1.273794854434447, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      HashMap<Integer, Double> hashMap0 = new HashMap<Integer, Double>();
      SparseVector sparseVector0 = SparseVector.fromMap(hashMap0, 32);
      double double0 = sparseVector0.infinityNorm();
      assertEquals(0.0, double0, 0.01);
      assertEquals(32, sparseVector0.length());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[4] = (-3127.237110630843);
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      double double0 = sparseVector0.min();
      assertEquals((-3127.237110630843), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(0, 0);
      double double0 = sparseVector0.min();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, sparseVector0.length());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(1, 1);
      sparseVector0.setAll(2152.205696133428);
      double double0 = sparseVector0.max();
      assertEquals(1, sparseVector0.cardinality());
      assertEquals(2152.205696133428, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(0, 0);
      double double0 = sparseVector0.max();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, sparseVector0.length());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-1.273794854434447);
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      CompressedVector compressedVector0 = (CompressedVector)sparseVector0.multiply((double) (byte)15);
      assertFalse(compressedVector0.equals((Object)sparseVector0));
      assertEquals(1, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-1.273794854434447);
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      Vector vector0 = sparseVector0.add((-3127.237110630843));
      assertEquals(5, vector0.length());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      HashMap<Integer, Byte> hashMap0 = new HashMap<Integer, Byte>();
      SparseVector sparseVector0 = SparseVector.fromMap(hashMap0, 397);
      assertEquals(0, sparseVector0.cardinality());
      
      boolean boolean0 = sparseVector0.isZeroAt(397);
      assertTrue(boolean0);
      assertEquals(397, sparseVector0.length());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1.0;
      double double0 = 1652.4591688;
      doubleArray0[1] = 1652.4591688;
      doubleArray0[3] = Double.POSITIVE_INFINITY;
      doubleArray0[4] = 1204.1812;
      doubleArray0[5] = 245.49301;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      sparseVector0.manhattanNorm();
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      // Undeclared exception!
      try { 
        SparseVector.fromCSV("%%MatrixMarket vector coordinate real\n370 0\n");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      HashMap<Integer, Double> hashMap0 = new HashMap<Integer, Double>();
      SparseVector sparseVector0 = SparseVector.fromMap(hashMap0, 32);
      sparseVector0.euclideanNorm();
      assertEquals(32, sparseVector0.length());
      assertEquals(0.0, sparseVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(0, 0);
      int int0 = sparseVector0.cardinality();
      assertEquals(0, sparseVector0.length());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        SparseVector.random(397, (double) 397, (Random) mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The density value should be between 0 and 1.0
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      sparseVector0.manhattanNorm();
      assertEquals(0.0, sparseVector0.density(), 0.01);
  }
}
