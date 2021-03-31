/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 31 14:49:43 GMT 2021
 */

package org.la4j.operation.ooplace;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.matrix.dense.Basic2DMatrix;
import org.la4j.matrix.sparse.CRSMatrix;
import org.la4j.operation.ooplace.OoPlaceMatricesSubtraction;
import org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication;
import org.la4j.operation.ooplace.OoPlaceVectorsAddition;
import org.la4j.operation.ooplace.OoPlaceVectorsSubtraction;
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;
import org.la4j.vector.dense.BasicVector;
import org.la4j.vector.sparse.CompressedVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OoPlaceVectorByMatrixMultiplication_ESTest extends OoPlaceVectorByMatrixMultiplication_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      int int0 = 1385;
      DenseVector denseVector0 = DenseVector.fromMap(hashMap0, 1385);
      Integer integer0 = new Integer(1385);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(1385);
      CompressedVector compressedVector0 = (CompressedVector)ooPlaceVectorByMatrixMultiplication0.apply(denseVector0, columnMajorSparseMatrix0);
      CompressedVector compressedVector1 = (CompressedVector)ooPlaceVectorByMatrixMultiplication0.apply((SparseVector) compressedVector0, columnMajorSparseMatrix0);
      int int1 = 1;
      int int2 = 2340;
      Basic2DMatrix basic2DMatrix0 = (Basic2DMatrix)DenseMatrix.zero(1, 2340);
      BasicVector basicVector0 = (BasicVector)ooPlaceVectorByMatrixMultiplication0.apply(denseVector0, (DenseMatrix) basic2DMatrix0);
      ooPlaceVectorByMatrixMultiplication0.apply((DenseVector) basicVector0, columnMajorSparseMatrix0);
      Random.setNextRandom(1385);
      // Undeclared exception!
      ooPlaceVectorByMatrixMultiplication0.apply((SparseVector) compressedVector1, columnMajorSparseMatrix0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      DenseVector denseVector0 = DenseVector.unit(4207);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 796;
      doubleArray0[1] = (double) 796;
      doubleArray0[3] = (double) 4207;
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      SparseVector sparseVector0 = SparseVector.fromMap(hashMap0, 4207);
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero(4207, 4207);
      ooPlaceVectorByMatrixMultiplication0.apply(sparseVector0, rowMajorSparseMatrix0);
      DenseMatrix denseMatrix0 = DenseMatrix.from1DArray(796, 3119, doubleArray0);
      // Undeclared exception!
      try { 
        ooPlaceVectorByMatrixMultiplication0.apply(denseVector0, denseMatrix0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3119
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      DenseVector denseVector0 = DenseVector.fromMap(hashMap0, 1414);
      hashMap0.remove((Object) "");
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(1414);
      ooPlaceVectorByMatrixMultiplication0.apply(denseVector0, columnMajorSparseMatrix0);
      Integer integer0 = new Integer(1414);
      Integer integer1 = new Integer(1414);
      hashMap0.put(integer0, integer1);
      DenseMatrix denseMatrix0 = DenseMatrix.identity(1414);
      // Undeclared exception!
      ooPlaceVectorByMatrixMultiplication0.apply(denseVector0, denseMatrix0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      HashMap<Integer, Double> hashMap0 = new HashMap<Integer, Double>();
      DenseVector denseVector0 = DenseVector.fromMap(hashMap0, 938);
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (double) 13;
      DenseMatrix denseMatrix0 = DenseMatrix.from1DArray(13, 13, doubleArray0);
      // Undeclared exception!
      try { 
        ooPlaceVectorByMatrixMultiplication0.apply(denseVector0, denseMatrix0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 13
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      double[] doubleArray0 = new double[1];
      SparseVector.fromArray(doubleArray0);
      DenseVector denseVector0 = DenseVector.constant(1, 1);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(2347);
      ColumnMajorSparseMatrix columnMajorSparseMatrix1 = columnMajorSparseMatrix0.toColumnMajorSparseMatrix();
      // Undeclared exception!
      try { 
        ooPlaceVectorByMatrixMultiplication0.apply(denseVector0, columnMajorSparseMatrix1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1983.5;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from1DArray(0, 0, doubleArray0);
      ooPlaceVectorByMatrixMultiplication0.apply(sparseVector0, rowMajorSparseMatrix0);
      DenseMatrix denseMatrix0 = DenseMatrix.identity(1392);
      Vector vector0 = ooPlaceVectorByMatrixMultiplication0.apply(sparseVector0, denseMatrix0);
      ooPlaceVectorByMatrixMultiplication0.ensureApplicableTo(vector0, denseMatrix0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      int int0 = 6;
      DenseVector.unit(6);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 6;
      doubleArray0[1] = (double) 6;
      doubleArray0[2] = (double) 6;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      MockRandom mockRandom0 = new MockRandom();
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(0, 5, 0);
      ColumnMajorSparseMatrix columnMajorSparseMatrix1 = columnMajorSparseMatrix0.toColumnMajorSparseMatrix();
      Matrix matrix0 = columnMajorSparseMatrix1.kroneckerProduct(columnMajorSparseMatrix0);
      // Undeclared exception!
      try { 
        sparseVector0.multiply(matrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given vector should have the same length as number of rows in the given matrix: 3 does not equal to 0.
         //
         verifyException("org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      OoPlaceVectorsSubtraction ooPlaceVectorsSubtraction0 = new OoPlaceVectorsSubtraction();
      SparseVector sparseVector0 = SparseVector.fromCSV("");
      DenseVector denseVector0 = DenseVector.unit(1649);
      BasicVector basicVector0 = (BasicVector)ooPlaceVectorsSubtraction0.apply(sparseVector0, denseVector0);
      CRSMatrix cRSMatrix0 = (CRSMatrix)RowMajorSparseMatrix.identity(1649);
      ooPlaceVectorByMatrixMultiplication0.ensureApplicableTo(basicVector0, cRSMatrix0);
      // Undeclared exception!
      ooPlaceVectorByMatrixMultiplication0.apply((DenseVector) basicVector0, (RowMajorSparseMatrix) cRSMatrix0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      int int0 = 1;
      SparseVector sparseVector0 = SparseVector.zero(1, 1);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(1);
      ooPlaceVectorByMatrixMultiplication0.apply(sparseVector0, columnMajorSparseMatrix0);
      DenseVector denseVector0 = null;
      columnMajorSparseMatrix0.mkString("EIGEN", (String) null);
      // Undeclared exception!
      try { 
        RowMajorSparseMatrix.fromCSV((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.StringTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      SparseVector sparseVector0 = null;
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = null;
      // Undeclared exception!
      try { 
        ooPlaceVectorByMatrixMultiplication0.apply((SparseVector) null, (ColumnMajorSparseMatrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      DenseVector denseVector0 = DenseVector.constant(0, 2838.233918);
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 2838.233918;
      doubleArray1[1] = 2838.233918;
      doubleArray1[2] = 2838.233918;
      doubleArray0[0] = doubleArray1;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      // Undeclared exception!
      try { 
        ooPlaceVectorByMatrixMultiplication0.apply(denseVector0, denseMatrix0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero(7, 405, 7);
      // Undeclared exception!
      try { 
        ooPlaceVectorByMatrixMultiplication0.apply((SparseVector) null, rowMajorSparseMatrix0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 2875.3;
      doubleArray0[1] = 403.1;
      doubleArray0[2] = (-2139.079311689891);
      doubleArray0[3] = (-162.2316);
      doubleArray0[4] = (-1.0);
      doubleArray0[5] = 0.0;
      doubleArray0[6] = (-1274.891);
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      MockRandom mockRandom0 = new MockRandom();
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.randomSymmetric(9, 0.0, (java.util.Random) mockRandom0);
      Vector vector0 = ooPlaceVectorByMatrixMultiplication0.apply(sparseVector0, rowMajorSparseMatrix0);
      ooPlaceVectorByMatrixMultiplication0.ensureApplicableTo(vector0, rowMajorSparseMatrix0);
      // Undeclared exception!
      try { 
        DenseVector.random((-112), mockRandom0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.vector.dense.BasicVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 2401.9;
      doubleArray0[1] = 3694.47897127;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 3996.37;
      doubleArray0[4] = (-1747.6);
      doubleArray0[5] = 2579.569622393601;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from1DArray(0, 0, doubleArray0);
      // Undeclared exception!
      try { 
        ooPlaceVectorByMatrixMultiplication0.apply(sparseVector0, rowMajorSparseMatrix0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.la4j.matrix.sparse.CRSMatrix$5", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1983.5;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from1DArray(0, 0, doubleArray0);
      ooPlaceVectorByMatrixMultiplication0.apply(sparseVector0, rowMajorSparseMatrix0);
      // Undeclared exception!
      try { 
        DenseMatrix.identity((-2590));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.dense.Basic2DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-574.67);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = Double.NEGATIVE_INFINITY;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from1DArray(2252, 0, doubleArray0);
      ooPlaceVectorByMatrixMultiplication0.apply(sparseVector0, columnMajorSparseMatrix0);
      // Undeclared exception!
      try { 
        DenseVector.fromCSV("6jtM^@Yl)5e'");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      OoPlaceVectorsAddition ooPlaceVectorsAddition0 = new OoPlaceVectorsAddition();
      HashMap<Integer, Double> hashMap0 = new HashMap<Integer, Double>();
      int int0 = 0;
      SparseVector sparseVector0 = SparseVector.fromMap(hashMap0, 0);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = (double) 0;
      doubleArray0[6] = (double) 0;
      SparseVector sparseVector1 = SparseVector.fromArray(doubleArray0);
      Vector vector0 = ooPlaceVectorsAddition0.apply(sparseVector0, sparseVector1);
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.diagonal(2022, 0.0);
      // Undeclared exception!
      try { 
        ooPlaceVectorByMatrixMultiplication0.ensureApplicableTo(vector0, rowMajorSparseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given vector should have the same length as number of rows in the given matrix: 0 does not equal to 2022.
         //
         verifyException("org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      HashMap<Integer, Double> hashMap0 = new HashMap<Integer, Double>();
      DenseVector denseVector0 = DenseVector.fromMap(hashMap0, 0);
      Vector vector0 = denseVector0.blankOfLength(1);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(5);
      OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new OoPlaceMatricesSubtraction();
      Matrix matrix0 = ooPlaceMatricesSubtraction0.applySimple((SparseMatrix) columnMajorSparseMatrix0, (SparseMatrix) columnMajorSparseMatrix0);
      Matrix matrix1 = columnMajorSparseMatrix0.subtract(matrix0);
      // Undeclared exception!
      try { 
        ooPlaceVectorByMatrixMultiplication0.ensureApplicableTo(vector0, matrix1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given vector should have the same length as number of rows in the given matrix: 1 does not equal to 5.
         //
         verifyException("org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-1160.9763);
      doubleArray0[1] = 1482.6;
      doubleArray0[2] = (-197.59073);
      doubleArray0[3] = (-296.4651);
      doubleArray0[4] = 0.0;
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(10, 0.0);
      ColumnMajorSparseMatrix columnMajorSparseMatrix1 = columnMajorSparseMatrix0.toColumnMajorSparseMatrix();
      RowMajorSparseMatrix rowMajorSparseMatrix0 = columnMajorSparseMatrix1.toRowMajorSparseMatrix();
      // Undeclared exception!
      try { 
        ooPlaceVectorByMatrixMultiplication0.apply(denseVector0, rowMajorSparseMatrix0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      DenseVector denseVector0 = DenseVector.fromMap(hashMap0, 0);
      Matrix matrix0 = null;
      // Undeclared exception!
      try { 
        ooPlaceVectorByMatrixMultiplication0.ensureApplicableTo(denseVector0, (Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      SparseVector sparseVector0 = SparseVector.fromCSV("");
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(37, 1108, 0);
      ooPlaceVectorByMatrixMultiplication0.apply(sparseVector0, columnMajorSparseMatrix0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      DenseVector denseVector0 = DenseVector.fromCSV("");
      double[][] doubleArray0 = new double[5][7];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (-2884.429785);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[2];
      doubleArray2[0] = (-2884.429785);
      doubleArray2[1] = (-2884.429785);
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[8];
      doubleArray3[0] = (-2884.429785);
      doubleArray3[1] = (-2884.429785);
      doubleArray3[2] = (-2884.429785);
      doubleArray3[3] = (-2884.429785);
      doubleArray3[4] = (-2884.429785);
      doubleArray3[5] = (-2884.429785);
      doubleArray3[6] = (-2884.429785);
      doubleArray3[7] = (-2884.429785);
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[9];
      doubleArray4[0] = (-2884.429785);
      doubleArray4[1] = (-2884.429785);
      doubleArray4[2] = (-2884.429785);
      doubleArray4[3] = (-2884.429785);
      doubleArray4[4] = (-2884.429785);
      doubleArray4[5] = (-160.45969919);
      doubleArray4[6] = (-2884.429785);
      doubleArray4[7] = (-2884.429785);
      doubleArray4[8] = (-2884.429785);
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[2];
      doubleArray5[0] = (-160.45969919);
      doubleArray5[1] = (-2884.429785);
      doubleArray0[4] = doubleArray5;
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from2DArray(doubleArray0);
      // Undeclared exception!
      try { 
        ooPlaceVectorByMatrixMultiplication0.apply(denseVector0, columnMajorSparseMatrix0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      DenseVector denseVector0 = DenseVector.fromCollection(linkedList0);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(0);
      RowMajorSparseMatrix rowMajorSparseMatrix0 = columnMajorSparseMatrix0.toRowMajorSparseMatrix();
      ooPlaceVectorByMatrixMultiplication0.apply(denseVector0, rowMajorSparseMatrix0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 1;
      doubleArray0[1] = (double) 1;
      doubleArray0[2] = (double) 1;
      doubleArray0[3] = (double) 1;
      doubleArray0[4] = (double) 1;
      doubleArray0[5] = (double) 1;
      doubleArray0[6] = (double) 1;
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from1DArray(1, 1, doubleArray0);
      // Undeclared exception!
      try { 
        ooPlaceVectorByMatrixMultiplication0.apply((DenseVector) null, rowMajorSparseMatrix0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      DenseVector denseVector0 = null;
      DenseMatrix denseMatrix0 = DenseMatrix.unit(2700, 2700);
      double[][] doubleArray0 = new double[3][3];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (double) 2700;
      doubleArray1[1] = 2.3596889;
      doubleArray1[2] = (double) 2700;
      doubleArray1[3] = (double) 2700;
      doubleArray1[4] = (double) 2700;
      doubleArray1[5] = (double) 2700;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[3];
      doubleArray2[0] = (double) 2700;
      doubleArray2[1] = (double) 2700;
      doubleArray2[2] = (double) 2700;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[8];
      doubleArray3[0] = (double) 2700;
      doubleArray3[1] = (double) 2700;
      doubleArray3[2] = 2.3596889;
      doubleArray3[3] = (double) 2700;
      doubleArray3[4] = (double) 2700;
      doubleArray3[5] = (double) 2700;
      doubleArray3[6] = (double) 2700;
      doubleArray3[7] = (double) 2700;
      doubleArray0[2] = doubleArray3;
      DenseMatrix.from2DArray(doubleArray0);
      // Undeclared exception!
      try { 
        ooPlaceVectorByMatrixMultiplication0.apply((DenseVector) null, denseMatrix0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      DenseVector denseVector0 = DenseVector.fromCSV("");
      int int0 = 0;
      Vector.unit(0);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = null;
      // Undeclared exception!
      try { 
        ooPlaceVectorByMatrixMultiplication0.apply(denseVector0, (ColumnMajorSparseMatrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      SparseVector sparseVector0 = SparseVector.zero(1275, 1275);
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      DenseVector denseVector0 = DenseVector.fromMap(hashMap0, 1275);
      Matrix matrix0 = denseVector0.toDiagonalMatrix();
      ooPlaceVectorByMatrixMultiplication0.ensureApplicableTo(sparseVector0, matrix0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      MockRandom mockRandom0 = new MockRandom((-1527L));
      SparseVector sparseVector0 = SparseVector.random(0, 0.0, (java.util.Random) mockRandom0);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(0);
      DenseMatrix denseMatrix0 = columnMajorSparseMatrix0.toDenseMatrix();
      ooPlaceVectorByMatrixMultiplication0.apply(sparseVector0, denseMatrix0);
      DenseVector denseVector0 = DenseVector.unit(0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Vector.fromCollection(linkedList0);
      denseVector0.toRowMatrix();
      ooPlaceVectorByMatrixMultiplication0.apply(denseVector0, columnMajorSparseMatrix0);
      ooPlaceVectorByMatrixMultiplication0.apply(denseVector0, denseMatrix0);
      // Undeclared exception!
      try { 
        RowMajorSparseMatrix.fromCSV("x");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      int int0 = 300;
      SparseVector sparseVector0 = SparseVector.zero(300);
      DenseMatrix denseMatrix0 = null;
      // Undeclared exception!
      try { 
        ooPlaceVectorByMatrixMultiplication0.apply(sparseVector0, (DenseMatrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      DenseVector denseVector0 = DenseVector.fromCSV("");
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(1446, 873, 873);
      ooPlaceVectorByMatrixMultiplication0.apply(denseVector0, columnMajorSparseMatrix0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      DenseVector denseVector0 = DenseVector.fromMap(hashMap0, 1385);
      Integer integer0 = new Integer(1385);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(1385);
      CompressedVector compressedVector0 = (CompressedVector)ooPlaceVectorByMatrixMultiplication0.apply(denseVector0, columnMajorSparseMatrix0);
      ooPlaceVectorByMatrixMultiplication0.apply((SparseVector) compressedVector0, columnMajorSparseMatrix0);
      Basic2DMatrix basic2DMatrix0 = (Basic2DMatrix)DenseMatrix.zero(1, 2340);
      BasicVector basicVector0 = (BasicVector)ooPlaceVectorByMatrixMultiplication0.apply(denseVector0, (DenseMatrix) basic2DMatrix0);
      assertEquals(2340, basicVector0.length());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      OoPlaceVectorsSubtraction ooPlaceVectorsSubtraction0 = new OoPlaceVectorsSubtraction();
      SparseVector sparseVector0 = SparseVector.fromCSV("");
      DenseVector denseVector0 = DenseVector.unit(1649);
      Vector vector0 = ooPlaceVectorsSubtraction0.apply(sparseVector0, denseVector0);
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.identity(1649);
      ooPlaceVectorByMatrixMultiplication0.ensureApplicableTo(vector0, rowMajorSparseMatrix0);
      SparseVector sparseVector1 = SparseVector.fromCSV("");
      Vector vector1 = ooPlaceVectorByMatrixMultiplication0.apply(sparseVector1, rowMajorSparseMatrix0);
      assertNotSame(sparseVector1, vector1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      DenseVector.unit(4207);
      int int0 = 796;
      int int1 = 3119;
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 3119;
      doubleArray0[1] = (double) 796;
      doubleArray0[2] = (double) 3119;
      doubleArray0[3] = (double) 4207;
      // Undeclared exception!
      try { 
        RowMajorSparseMatrix.diagonal((-305), (-305));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.sparse.CRSMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      // Undeclared exception!
      try { 
        SparseVector.fromCSV("!H EwVR[|yP{");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      HashMap<Integer, Double> hashMap0 = new HashMap<Integer, Double>();
      DenseVector denseVector0 = DenseVector.fromMap(hashMap0, 938);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 938;
      doubleArray0[1] = (double) 13;
      DenseMatrix denseMatrix0 = DenseMatrix.from1DArray(13, 13, doubleArray0);
      // Undeclared exception!
      try { 
        ooPlaceVectorByMatrixMultiplication0.apply(denseVector0, denseMatrix0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 13
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      HashMap<Integer, Double> hashMap0 = new HashMap<Integer, Double>();
      int int0 = 938;
      DenseVector.fromMap(hashMap0, 938);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = Double.NEGATIVE_INFINITY;
      doubleArray0[1] = (double) 938;
      doubleArray0[2] = (double) 938;
      doubleArray0[3] = (double) 938;
      doubleArray0[4] = (double) 938;
      doubleArray0[5] = (double) 938;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      DenseMatrix denseMatrix0 = DenseMatrix.zero(938, 938);
      // Undeclared exception!
      ooPlaceVectorByMatrixMultiplication0.apply(sparseVector0, denseMatrix0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      SparseVector sparseVector0 = SparseVector.zero(17, 17);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(17);
      RowMajorSparseMatrix rowMajorSparseMatrix0 = columnMajorSparseMatrix0.toRowMajorSparseMatrix();
      ooPlaceVectorByMatrixMultiplication0.apply(sparseVector0, rowMajorSparseMatrix0);
      DenseVector denseVector0 = DenseVector.unit(17);
      ooPlaceVectorByMatrixMultiplication0.apply(denseVector0, rowMajorSparseMatrix0);
      DenseMatrix denseMatrix0 = DenseMatrix.zero(17, 17);
      ooPlaceVectorByMatrixMultiplication0.apply(sparseVector0, denseMatrix0);
      double[][] doubleArray0 = new double[5][3];
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) 17;
      doubleArray1[1] = 0.0;
      doubleArray1[2] = (double) 17;
      doubleArray1[3] = (double) 17;
      doubleArray1[4] = (double) 17;
      doubleArray1[5] = 0.0;
      doubleArray1[6] = (double) 17;
      doubleArray1[7] = (double) 17;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[2];
      doubleArray2[0] = (double) 17;
      doubleArray2[1] = (-1061.0);
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[9];
      doubleArray3[0] = 0.0;
      doubleArray3[1] = (-1912.64);
      doubleArray3[2] = (-1061.0);
      doubleArray3[3] = 0.0;
      doubleArray3[4] = (double) 17;
      doubleArray3[5] = 0.0;
      doubleArray3[6] = (-1061.0);
      doubleArray3[7] = (-390.07967195685);
      doubleArray3[8] = (double) 17;
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[0];
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[0];
      doubleArray0[4] = doubleArray5;
      // Undeclared exception!
      try { 
        ColumnMajorSparseMatrix.from2DArray(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.la4j.matrix.sparse.CCSMatrix", e);
      }
  }
}
