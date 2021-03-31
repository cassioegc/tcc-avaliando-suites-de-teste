/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 31 15:44:52 GMT 2021
 */

package org.la4j.operation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Random;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix;
import org.la4j.operation.ooplace.OoPlaceKroneckerProduct;
import org.la4j.operation.ooplace.OoPlaceMatricesAddition;
import org.la4j.operation.ooplace.OoPlaceMatricesMultiplication;
import org.la4j.operation.ooplace.OoPlaceMatricesSubtraction;
import org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MatrixMatrixOperation_ESTest extends MatrixMatrixOperation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new InPlaceCopyMatrixToMatrix();
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 1308;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 1308;
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = (double) 0;
      doubleArray0[6] = (double) 0;
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from1DArray(1308, 0, doubleArray0);
      ColumnMajorSparseMatrix columnMajorSparseMatrix1 = columnMajorSparseMatrix0.toColumnMajorSparseMatrix();
      columnMajorSparseMatrix0.subtract((Matrix) columnMajorSparseMatrix1);
      DenseMatrix denseMatrix0 = columnMajorSparseMatrix0.toDenseMatrix();
      int int0 = (-1);
      columnMajorSparseMatrix1.copy();
      columnMajorSparseMatrix1.equals((Matrix) denseMatrix0, 0.0);
      HashMap<Integer, Integer> hashMap0 = null;
      try {
        hashMap0 = new HashMap<Integer, Integer>((-1), 886.18024F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -1
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new OoPlaceMatricesMultiplication();
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(0);
      Matrix matrix0 = Matrix.unit(0, 0);
      columnMajorSparseMatrix0.kroneckerProduct(matrix0);
      double[][] doubleArray0 = new double[3][1];
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = (double) 0;
      doubleArray1[1] = (double) 0;
      doubleArray1[2] = (double) 0;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[2];
      doubleArray2[0] = (double) 0;
      doubleArray2[1] = (double) 0;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[6];
      doubleArray3[0] = (double) 0;
      doubleArray3[1] = (double) 0;
      doubleArray3[2] = (double) 0;
      doubleArray3[3] = (double) 0;
      doubleArray3[4] = (double) 0;
      doubleArray3[5] = (double) 0;
      doubleArray0[2] = doubleArray3;
      // Undeclared exception!
      try { 
        RowMajorSparseMatrix.from2DArray(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.la4j.matrix.sparse.CRSMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct0 = new OoPlaceMatrixHadamardProduct();
      InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new InPlaceCopyMatrixToMatrix();
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(0);
      columnMajorSparseMatrix0.multiplyByItsTranspose();
      Matrix.diagonal(1017, 0);
      // Undeclared exception!
      try { 
        RowMajorSparseMatrix.fromMatrixMarket((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new OoPlaceMatricesMultiplication();
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.fromCSV("");
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(0, 17);
      ooPlaceMatricesMultiplication0.partiallyApply(columnMajorSparseMatrix0);
      ColumnMajorSparseMatrix columnMajorSparseMatrix1 = ColumnMajorSparseMatrix.zero(0, 0, 0);
      Matrix matrix0 = columnMajorSparseMatrix0.insert((Matrix) rowMajorSparseMatrix0);
      SparseMatrix.block(columnMajorSparseMatrix0, matrix0, columnMajorSparseMatrix0, matrix0);
      ooPlaceMatricesMultiplication0.apply(columnMajorSparseMatrix1, columnMajorSparseMatrix1);
      ColumnMajorSparseMatrix columnMajorSparseMatrix2 = ColumnMajorSparseMatrix.block(rowMajorSparseMatrix0, rowMajorSparseMatrix0, rowMajorSparseMatrix0, rowMajorSparseMatrix0);
      ooPlaceMatricesMultiplication0.apply(rowMajorSparseMatrix0, columnMajorSparseMatrix2);
      InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new InPlaceCopyMatrixToMatrix();
      Matrix matrix1 = inPlaceCopyMatrixToMatrix0.applySimple((SparseMatrix) columnMajorSparseMatrix2, (SparseMatrix) columnMajorSparseMatrix2);
      inPlaceCopyMatrixToMatrix0.applySimple((DenseMatrix) null, (SparseMatrix) columnMajorSparseMatrix2);
      OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new OoPlaceMatricesSubtraction();
      Matrix matrix2 = ooPlaceMatricesSubtraction0.apply(columnMajorSparseMatrix2, rowMajorSparseMatrix0);
      assertNotSame(matrix2, matrix1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new InPlaceCopyMatrixToMatrix();
      DenseMatrix denseMatrix0 = DenseMatrix.identity(0);
      inPlaceCopyMatrixToMatrix0.partiallyApply(denseMatrix0);
      MockRandom mockRandom0 = new MockRandom(574L);
      // Undeclared exception!
      try { 
        SparseMatrix.randomSymmetric((-1), 245.0613097, (Random) mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -1x-1
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct0 = new OoPlaceMatrixHadamardProduct();
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.identity(0);
      rowMajorSparseMatrix0.setColumn(10, (double) 10);
      rowMajorSparseMatrix0.toColumnVector();
      ooPlaceMatrixHadamardProduct0.applySymmetric((SparseMatrix) rowMajorSparseMatrix0, (SparseMatrix) rowMajorSparseMatrix0);
      OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new OoPlaceMatricesSubtraction();
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(10, 811, mockRandom0);
      ooPlaceMatricesSubtraction0.applySimple(denseMatrix0, (SparseMatrix) rowMajorSparseMatrix0);
      OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new OoPlaceMatricesMultiplication();
      DenseMatrix denseMatrix1 = DenseMatrix.unit(10, 0);
      double[][] doubleArray0 = new double[8][2];
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = (double) 0;
      doubleArray1[1] = (double) 10;
      doubleArray1[2] = 3463.3261749238;
      doubleArray1[3] = (double) 0;
      doubleArray1[4] = (double) 811;
      doubleArray1[5] = (double) 0;
      doubleArray1[6] = (double) 0;
      doubleArray1[7] = (double) 0;
      doubleArray1[8] = (double) 76;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[9];
      doubleArray2[0] = (double) 0;
      doubleArray2[1] = 2016.97;
      doubleArray2[2] = (double) 0;
      doubleArray2[3] = 1.0;
      doubleArray2[4] = (double) 76;
      doubleArray2[5] = (double) 0;
      doubleArray2[6] = (double) 0;
      doubleArray2[7] = (double) 811;
      doubleArray2[8] = (double) 0;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[6];
      doubleArray3[0] = (double) 0;
      doubleArray3[1] = (double) 0;
      doubleArray3[2] = (double) 811;
      doubleArray3[3] = (double) 10;
      doubleArray3[4] = 1.0;
      doubleArray3[5] = 3463.3261749238;
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[2];
      doubleArray4[0] = Double.POSITIVE_INFINITY;
      doubleArray4[1] = (double) 76;
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[6];
      doubleArray5[0] = (double) 0;
      doubleArray5[1] = Double.POSITIVE_INFINITY;
      doubleArray5[2] = (double) 10;
      doubleArray5[3] = (double) 76;
      doubleArray5[4] = 0.0;
      doubleArray5[5] = (double) 0;
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[1];
      doubleArray6[0] = (double) 0;
      doubleArray0[5] = doubleArray6;
      double[] doubleArray7 = new double[9];
      doubleArray7[0] = Double.POSITIVE_INFINITY;
      doubleArray7[1] = 0.0;
      doubleArray7[2] = (double) 76;
      doubleArray7[3] = (double) 0;
      doubleArray7[4] = Double.POSITIVE_INFINITY;
      doubleArray7[5] = (double) 10;
      doubleArray7[6] = 2016.97;
      doubleArray7[7] = (double) 0;
      doubleArray7[8] = 509.4781;
      doubleArray0[6] = doubleArray7;
      double[] doubleArray8 = new double[0];
      doubleArray0[7] = doubleArray8;
      Matrix.from2DArray(doubleArray0);
      rowMajorSparseMatrix0.maxInColumn(76);
      denseMatrix1.manhattanNorm();
      denseMatrix0.kroneckerProduct(denseMatrix1);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(0, 76);
      // Undeclared exception!
      try { 
        columnMajorSparseMatrix0.determinant();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Can not compute determinant of non-square matrix.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new InPlaceCopyMatrixToMatrix();
      ColumnMajorSparseMatrix.fromCSV("");
      // Undeclared exception!
      try { 
        RowMajorSparseMatrix.from1DArray((-1), 0, (double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -1x0
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new OoPlaceMatricesMultiplication();
      int int0 = 0;
      ooPlaceMatricesMultiplication0.partiallyApply((RowMajorSparseMatrix) null);
      DenseMatrix.constant(0, 0, 2515.04529118);
      MockRandom mockRandom0 = new MockRandom(0L);
      // Undeclared exception!
      try { 
        ColumnMajorSparseMatrix.randomSymmetric((-1819), (double) 0, (Random) mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -1819x-1819
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new InPlaceCopyMatrixToMatrix();
      double[] doubleArray0 = new double[0];
      double[][] doubleArray1 = new double[6][3];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = doubleArray0;
      double[] doubleArray2 = new double[9];
      doubleArray2[0] = (double) 48;
      doubleArray2[1] = (double) 48;
      doubleArray2[2] = (double) 48;
      doubleArray2[3] = (double) 48;
      doubleArray2[4] = (double) 48;
      doubleArray2[5] = (double) 48;
      doubleArray2[6] = (double) 48;
      doubleArray2[7] = (double) 48;
      doubleArray2[8] = (double) 48;
      doubleArray1[5] = doubleArray2;
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from2DArray(doubleArray1);
      inPlaceCopyMatrixToMatrix0.apply(columnMajorSparseMatrix0, columnMajorSparseMatrix0);
      DenseMatrix denseMatrix0 = DenseMatrix.from1DArray(48, 48, doubleArray0);
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.diagonal(48, 48);
      rowMajorSparseMatrix0.toColumnMajorSparseMatrix();
      // Undeclared exception!
      try { 
        inPlaceCopyMatrixToMatrix0.applySimple(denseMatrix0, (SparseMatrix) rowMajorSparseMatrix0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OoPlaceKroneckerProduct ooPlaceKroneckerProduct0 = new OoPlaceKroneckerProduct();
      // Undeclared exception!
      try { 
        ooPlaceKroneckerProduct0.applyCommon((Matrix) null, (Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.operation.ooplace.OoPlaceKroneckerProduct", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new OoPlaceMatricesAddition();
  }
}
