/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 31 14:59:12 GMT 2021
 */

package org.la4j.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.linear.SquareRootSolver;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.operation.ooplace.OoPlaceOuterProduct;
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;
import org.la4j.vector.sparse.CompressedVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SquareRootSolver_ESTest extends SquareRootSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Collection<Integer> collection0 = hashMap0.values();
      DenseVector denseVector0 = DenseVector.fromCollection(collection0);
      Matrix matrix0 = ooPlaceOuterProduct0.apply(denseVector0, denseVector0);
      SquareRootSolver squareRootSolver0 = new SquareRootSolver(matrix0);
      Vector vector0 = squareRootSolver0.solve(denseVector0);
      assertTrue(vector0.equals((Object)denseVector0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(1, 1);
      Matrix matrix0 = columnMajorSparseMatrix0.add(1.0);
      SquareRootSolver squareRootSolver0 = new SquareRootSolver(matrix0);
      DenseMatrix denseMatrix0 = DenseMatrix.zero(1, 829);
      boolean boolean0 = squareRootSolver0.applicableTo(denseMatrix0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.identity(43);
      SquareRootSolver squareRootSolver0 = new SquareRootSolver(rowMajorSparseMatrix0);
      SparseVector sparseVector0 = SparseVector.zero(43);
      // Undeclared exception!
      squareRootSolver0.solve(sparseVector0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Matrix matrix0 = Matrix.identity(1);
      SquareRootSolver squareRootSolver0 = new SquareRootSolver(matrix0);
      // Undeclared exception!
      try { 
        squareRootSolver0.solve((Vector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Matrix matrix0 = Matrix.identity(4604);
      SquareRootSolver squareRootSolver0 = new SquareRootSolver(matrix0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SquareRootSolver squareRootSolver0 = null;
      try {
        squareRootSolver0 = new SquareRootSolver((Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.linear.SquareRootSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      DenseVector denseVector0 = DenseVector.fromCollection(linkedList0);
      Matrix matrix0 = denseVector0.toRowMatrix();
      SquareRootSolver squareRootSolver0 = null;
      try {
        squareRootSolver0 = new SquareRootSolver(matrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given coefficient matrix can not be used with this solver.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Matrix matrix0 = Matrix.identity(1);
      SquareRootSolver squareRootSolver0 = new SquareRootSolver(matrix0);
      boolean boolean0 = squareRootSolver0.applicableTo(matrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DenseVector denseVector0 = DenseVector.unit(6);
      DenseMatrix denseMatrix0 = DenseMatrix.diagonal(6, 0);
      SquareRootSolver squareRootSolver0 = new SquareRootSolver(denseMatrix0);
      // Undeclared exception!
      try { 
        squareRootSolver0.solve(denseVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // This matrix is singular. We can't solve it.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.identity(16);
      SquareRootSolver squareRootSolver0 = new SquareRootSolver(rowMajorSparseMatrix0);
      SparseVector sparseVector0 = SparseVector.zero(16);
      CompressedVector compressedVector0 = (CompressedVector)squareRootSolver0.solve(sparseVector0);
      assertEquals(0.0, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(6, 6, 0);
      Matrix matrix0 = columnMajorSparseMatrix0.rotate();
      SquareRootSolver squareRootSolver0 = new SquareRootSolver(matrix0);
      squareRootSolver0.unknowns = (-233);
      DenseVector denseVector0 = DenseVector.unit(6);
      // Undeclared exception!
      try { 
        squareRootSolver0.solve(denseVector0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.vector.dense.BasicVector", e);
      }
  }
}
