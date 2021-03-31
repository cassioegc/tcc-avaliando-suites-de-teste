/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 31 14:08:41 GMT 2021
 */

package org.la4j.decomposition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Random;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.decomposition.EigenDecompositor;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.sparse.CRSMatrix;
import org.la4j.operation.ooplace.OoPlaceOuterProduct;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositor_ESTest extends EigenDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Matrix matrix0 = Matrix.constant(0, 0, 0);
      assertEquals(0, matrix0.rows());
      assertEquals(0, matrix0.columns());
      assertNotNull(matrix0);
      
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      assertEquals(0, matrix0.rows());
      assertEquals(0, matrix0.columns());
      assertNotNull(eigenDecompositor0);
      
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(0, matrix0.rows());
      assertEquals(0, matrix0.columns());
      assertNotNull(matrixArray0);
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[5][9];
      double[] doubleArray1 = new double[5];
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[3];
      assertFalse(doubleArray2.equals((Object)doubleArray1));
      
      doubleArray0[1] = doubleArray2;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      assertEquals(5, denseMatrix0.columns());
      assertEquals(5, denseMatrix0.rows());
      assertNotNull(denseMatrix0);
      assertEquals(5, doubleArray0.length);
      
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      assertEquals(5, denseMatrix0.columns());
      assertEquals(5, denseMatrix0.rows());
      assertNotNull(eigenDecompositor0);
      assertEquals(5, doubleArray0.length);
      
      // Undeclared exception!
      try { 
        eigenDecompositor0.decompose();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from1DArray(0, 0, doubleArray0);
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertEquals(0, columnMajorSparseMatrix0.cardinality());
      assertEquals(Double.NaN, columnMajorSparseMatrix0.density(), 0.01);
      assertEquals(0, columnMajorSparseMatrix0.rows());
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(0, columnMajorSparseMatrix0.columns());
      assertEquals(0.0, columnMajorSparseMatrix0.max(), 0.01);
      assertNotNull(columnMajorSparseMatrix0);
      assertEquals(6, doubleArray0.length);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(columnMajorSparseMatrix0);
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertEquals(0, columnMajorSparseMatrix0.cardinality());
      assertEquals(Double.NaN, columnMajorSparseMatrix0.density(), 0.01);
      assertEquals(0, columnMajorSparseMatrix0.rows());
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(0, columnMajorSparseMatrix0.columns());
      assertEquals(0.0, columnMajorSparseMatrix0.max(), 0.01);
      assertNotNull(eigenDecompositor0);
      assertEquals(6, doubleArray0.length);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      // Undeclared exception!
      try { 
        eigenDecompositor0.applicableTo((Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.decomposition.EigenDecompositor", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EigenDecompositor eigenDecompositor0 = null;
      try {
        eigenDecompositor0 = new EigenDecompositor((Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.decomposition.EigenDecompositor", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0);
      assertNotNull(mockRandom0);
      
      DenseMatrix denseMatrix0 = DenseMatrix.unit(3, 0);
      assertEquals(0, denseMatrix0.columns());
      assertEquals(3, denseMatrix0.rows());
      assertNotNull(denseMatrix0);
      
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.randomSymmetric(0, (double) 0, (Random) mockRandom0);
      assertTrue(rowMajorSparseMatrix0.isRowMajor());
      assertEquals(0, rowMajorSparseMatrix0.cardinality());
      assertEquals(Double.NaN, rowMajorSparseMatrix0.density(), 0.01);
      assertEquals(0.0, rowMajorSparseMatrix0.min(), 0.01);
      assertEquals(0, rowMajorSparseMatrix0.rows());
      assertEquals(0, rowMajorSparseMatrix0.columns());
      assertEquals(0.0, rowMajorSparseMatrix0.max(), 0.01);
      assertNotNull(rowMajorSparseMatrix0);
      
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
      assertTrue(rowMajorSparseMatrix0.isRowMajor());
      assertEquals(0, rowMajorSparseMatrix0.cardinality());
      assertEquals(Double.NaN, rowMajorSparseMatrix0.density(), 0.01);
      assertEquals(0.0, rowMajorSparseMatrix0.min(), 0.01);
      assertEquals(0, rowMajorSparseMatrix0.rows());
      assertEquals(0, rowMajorSparseMatrix0.columns());
      assertEquals(0.0, rowMajorSparseMatrix0.max(), 0.01);
      assertNotNull(eigenDecompositor0);
      
      boolean boolean0 = eigenDecompositor0.applicableTo(denseMatrix0);
      assertEquals(0, denseMatrix0.columns());
      assertEquals(3, denseMatrix0.rows());
      assertTrue(rowMajorSparseMatrix0.isRowMajor());
      assertEquals(0, rowMajorSparseMatrix0.cardinality());
      assertEquals(Double.NaN, rowMajorSparseMatrix0.density(), 0.01);
      assertEquals(0.0, rowMajorSparseMatrix0.min(), 0.01);
      assertEquals(0, rowMajorSparseMatrix0.rows());
      assertEquals(0, rowMajorSparseMatrix0.columns());
      assertEquals(0.0, rowMajorSparseMatrix0.max(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0);
      assertNotNull(mockRandom0);
      
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.randomSymmetric(0, (double) 0, (Random) mockRandom0);
      assertEquals(0, rowMajorSparseMatrix0.rows());
      assertEquals(Double.NaN, rowMajorSparseMatrix0.density(), 0.01);
      assertEquals(0.0, rowMajorSparseMatrix0.min(), 0.01);
      assertEquals(0, rowMajorSparseMatrix0.columns());
      assertTrue(rowMajorSparseMatrix0.isRowMajor());
      assertEquals(0, rowMajorSparseMatrix0.cardinality());
      assertEquals(0.0, rowMajorSparseMatrix0.max(), 0.01);
      assertNotNull(rowMajorSparseMatrix0);
      
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
      assertEquals(0, rowMajorSparseMatrix0.rows());
      assertEquals(Double.NaN, rowMajorSparseMatrix0.density(), 0.01);
      assertEquals(0.0, rowMajorSparseMatrix0.min(), 0.01);
      assertEquals(0, rowMajorSparseMatrix0.columns());
      assertTrue(rowMajorSparseMatrix0.isRowMajor());
      assertEquals(0, rowMajorSparseMatrix0.cardinality());
      assertEquals(0.0, rowMajorSparseMatrix0.max(), 0.01);
      assertNotNull(eigenDecompositor0);
      
      boolean boolean0 = eigenDecompositor0.applicableTo(rowMajorSparseMatrix0);
      assertEquals(0, rowMajorSparseMatrix0.rows());
      assertEquals(Double.NaN, rowMajorSparseMatrix0.density(), 0.01);
      assertEquals(0.0, rowMajorSparseMatrix0.min(), 0.01);
      assertEquals(0, rowMajorSparseMatrix0.columns());
      assertTrue(rowMajorSparseMatrix0.isRowMajor());
      assertEquals(0, rowMajorSparseMatrix0.cardinality());
      assertEquals(0.0, rowMajorSparseMatrix0.max(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[][] doubleArray0 = new double[5][9];
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (-105.85754);
      doubleArray1[2] = 0.128062484748657;
      doubleArray1[3] = 1935.079373305864;
      doubleArray1[4] = (-105.85754);
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      doubleArray0[2] = doubleArray1;
      doubleArray0[3] = doubleArray1;
      double[] doubleArray2 = new double[9];
      assertFalse(doubleArray2.equals((Object)doubleArray1));
      
      doubleArray2[0] = (-1417.343);
      doubleArray2[3] = 2202.64;
      doubleArray2[4] = 1935.079373305864;
      doubleArray0[4] = doubleArray2;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      assertEquals(5, denseMatrix0.rows());
      assertEquals(5, denseMatrix0.columns());
      assertNotNull(denseMatrix0);
      assertEquals(5, doubleArray0.length);
      
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      assertEquals(5, denseMatrix0.rows());
      assertEquals(5, denseMatrix0.columns());
      assertNotNull(eigenDecompositor0);
      assertEquals(5, doubleArray0.length);
      
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(5, denseMatrix0.rows());
      assertEquals(5, denseMatrix0.columns());
      assertNotNull(matrixArray0);
      assertEquals(5, doubleArray0.length);
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[][] doubleArray0 = new double[5][9];
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (-105.85754);
      doubleArray1[4] = (-105.85754);
      doubleArray0[0] = doubleArray1;
      doubleArray1[1] = (-105.85754);
      doubleArray0[1] = doubleArray1;
      doubleArray0[2] = doubleArray1;
      double[] doubleArray2 = new double[9];
      assertFalse(doubleArray2.equals((Object)doubleArray1));
      
      doubleArray2[1] = (-105.85754);
      doubleArray0[4] = doubleArray2;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      assertEquals(5, denseMatrix0.columns());
      assertEquals(5, denseMatrix0.rows());
      assertNotNull(denseMatrix0);
      assertEquals(5, doubleArray0.length);
      
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      assertEquals(5, denseMatrix0.columns());
      assertEquals(5, denseMatrix0.rows());
      assertNotNull(eigenDecompositor0);
      assertEquals(5, doubleArray0.length);
      
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(5, denseMatrix0.columns());
      assertEquals(5, denseMatrix0.rows());
      assertNotNull(matrixArray0);
      assertEquals(5, doubleArray0.length);
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[][] doubleArray0 = new double[5][9];
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (-105.85754);
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      double[] doubleArray2 = new double[9];
      doubleArray2[3] = Double.NEGATIVE_INFINITY;
      doubleArray0[4] = doubleArray2;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[][] doubleArray0 = new double[5][9];
      double[] doubleArray1 = new double[5];
      doubleArray1[1] = 0.128062484748657;
      doubleArray0[0] = doubleArray1;
      doubleArray0[4] = doubleArray1;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[][] doubleArray0 = new double[5][9];
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (-105.85754);
      doubleArray1[1] = 0.128062484748657;
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      double[] doubleArray2 = new double[9];
      doubleArray2[0] = (-1417.343);
      doubleArray0[4] = doubleArray2;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      MockRandom mockRandom0 = new MockRandom(5);
      mockRandom0.nextLong();
      SparseVector sparseVector0 = SparseVector.random(5, 1.0, (Random) mockRandom0);
      CRSMatrix cRSMatrix0 = (CRSMatrix)ooPlaceOuterProduct0.apply(sparseVector0, sparseVector0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(cRSMatrix0);
      eigenDecompositor0.decompose();
      assertEquals(1.0, cRSMatrix0.density(), 0.01);
      assertEquals(25, cRSMatrix0.cardinality());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      MockRandom mockRandom0 = new MockRandom(5);
      SparseVector sparseVector0 = SparseVector.random(5, 1.0, (Random) mockRandom0);
      Matrix matrix0 = ooPlaceOuterProduct0.apply(sparseVector0, sparseVector0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      eigenDecompositor0.decompose();
      assertEquals(0.16000000000000003, matrix0.max(), 0.01);
      assertEquals(0.0, matrix0.min(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero(2, 2057);
      EigenDecompositor eigenDecompositor0 = null;
      try {
        eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given matrix can not be used with this decompositor.
         //
         verifyException("org.la4j.decomposition.AbstractDecompositor", e);
      }
  }
}
