import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix5 = rowMajorSparseMatrix3.divide((double) (-1));
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory6 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix7 = matrix5.to(basic1DMatrixMatrixFactory6);
        double double9 = matrix5.maxInColumn(0);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory6);
        org.junit.Assert.assertNotNull(basic1DMatrix7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix1 = org.la4j.matrix.RowMajorSparseMatrix.identity((int) 'a');
        org.la4j.linear.GaussianSolver gaussianSolver2 = new org.la4j.linear.GaussianSolver((org.la4j.Matrix) rowMajorSparseMatrix1);
        double double3 = rowMajorSparseMatrix1.norm();
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.848857801796104d + "'", double3 == 9.848857801796104d);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix3 = org.la4j.matrix.dense.Basic2DMatrix.unit((int) (byte) 1, (int) '4');
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction4 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix7 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean8 = cCSMatrix7.isRowMajor();
        org.la4j.Matrix matrix11 = cCSMatrix7.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator12 = cCSMatrix7.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix16 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix18 = rowMajorSparseMatrix16.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix22 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double26 = rowMajorSparseMatrix22.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix27 = rowMajorSparseMatrix22.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct28 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean29 = sparseMatrix27.equals((java.lang.Object) ooPlaceOuterProduct28);
        org.la4j.Matrix matrix30 = rowMajorSparseMatrix16.hadamardProduct((org.la4j.Matrix) sparseMatrix27);
        org.la4j.Matrix matrix31 = ooPlaceMatricesSubtraction4.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix7, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix16);
        org.la4j.Matrix matrix32 = ooPlaceMatricesSubtraction0.apply((org.la4j.matrix.DenseMatrix) basic2DMatrix3, rowMajorSparseMatrix16);
        org.la4j.decomposition.SingularValueDecompositor singularValueDecompositor33 = new org.la4j.decomposition.SingularValueDecompositor((org.la4j.Matrix) rowMajorSparseMatrix16);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix36 = org.la4j.matrix.RowMajorSparseMatrix.zero(10, (int) (byte) 1);
        java.text.NumberFormat numberFormat37 = null;
        java.lang.String str38 = rowMajorSparseMatrix36.toMatrixMarket(numberFormat37);
        boolean boolean39 = singularValueDecompositor33.applicableTo((org.la4j.Matrix) rowMajorSparseMatrix36);
        int int40 = rowMajorSparseMatrix36.cardinality();
        org.junit.Assert.assertNotNull(basic2DMatrix3);
        org.junit.Assert.assertNotNull(cCSMatrix7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator12);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix16);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix22);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(matrix30);
        org.junit.Assert.assertNotNull(matrix31);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "%%MatrixMarket matrix coordinate real general row-major\n10 1 0\n" + "'", str38, "%%MatrixMarket matrix coordinate real general row-major\n10 1 0\n");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication();
        org.la4j.vector.sparse.CompressedVector compressedVector2 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector2.swapElements(10, (int) (byte) 100);
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct6 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix10 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix11 = rowMajorSparseMatrix10.removeLastRow();
        double double15 = rowMajorSparseMatrix10.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int16 = rowMajorSparseMatrix10.cardinality();
        org.la4j.Vector vector18 = rowMajorSparseMatrix10.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix21 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix22 = ooPlaceMatrixHadamardProduct6.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix10, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix21);
        org.la4j.Vector vector23 = ooPlaceVectorByMatrixMultiplication0.apply((org.la4j.vector.SparseVector) compressedVector2, columnMajorSparseMatrix21);
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct24 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random26 = null;
        org.la4j.vector.DenseVector denseVector27 = org.la4j.vector.DenseVector.random(0, random26);
        java.util.Random random29 = null;
        org.la4j.vector.DenseVector denseVector30 = org.la4j.vector.DenseVector.random(0, random29);
        org.la4j.Matrix matrix31 = ooPlaceOuterProduct24.apply(denseVector27, denseVector30);
        org.la4j.Vector vector33 = denseVector27.copyOfLength((int) 'a');
        org.la4j.Matrix matrix34 = vector33.toDiagonalMatrix();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix37 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator38 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray39 = cCSMatrix37.foldRows(vectorAccumulator38);
        org.la4j.vector.dense.BasicVector basicVector40 = org.la4j.vector.dense.BasicVector.fromArray(doubleArray39);
        org.la4j.Matrix matrix41 = basicVector40.toRowMatrix();
        org.la4j.vector.functor.VectorPredicate vectorPredicate42 = org.la4j.Vectors.ZERO_VECTOR;
        boolean boolean43 = basicVector40.non(vectorPredicate42);
        boolean boolean44 = vector33.is(vectorPredicate42);
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct45 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix50 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator51 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray52 = cCSMatrix50.foldRows(vectorAccumulator51);
        org.la4j.matrix.DenseMatrix denseMatrix53 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray52);
        org.la4j.vector.dense.BasicVector basicVector54 = new org.la4j.vector.dense.BasicVector(doubleArray52);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix59 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator60 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray61 = cCSMatrix59.foldRows(vectorAccumulator60);
        org.la4j.matrix.DenseMatrix denseMatrix62 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray61);
        org.la4j.vector.dense.BasicVector basicVector63 = new org.la4j.vector.dense.BasicVector(doubleArray61);
        ooPlaceOuterProduct45.ensureApplicableTo((org.la4j.Vector) basicVector54, (org.la4j.Vector) basicVector63);
        org.la4j.vector.sparse.CompressedVector compressedVector66 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector66.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector71 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix72 = ooPlaceOuterProduct45.apply((org.la4j.vector.SparseVector) compressedVector66, (org.la4j.vector.SparseVector) compressedVector71);
        boolean boolean74 = compressedVector71.isZeroAt((int) (short) 1);
        org.la4j.Vector vector76 = compressedVector71.blankOfLength((int) (byte) 100);
        boolean boolean77 = vector33.equals((java.lang.Object) compressedVector71);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition78 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix81 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double82 = cRSMatrix81.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix86 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix87 = rowMajorSparseMatrix86.removeLastRow();
        org.la4j.Matrix matrix88 = ooPlaceMatricesAddition78.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix81, rowMajorSparseMatrix86);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix91 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.matrix.DenseMatrix denseMatrix93 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix94 = ooPlaceMatricesAddition78.apply(columnMajorSparseMatrix91, denseMatrix93);
        java.lang.String str97 = columnMajorSparseMatrix91.mkString("0.5.5", "hi!");
        org.la4j.Vector vector98 = ooPlaceVectorByMatrixMultiplication0.apply((org.la4j.vector.SparseVector) compressedVector71, columnMajorSparseMatrix91);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator99 = columnMajorSparseMatrix91.columnMajorIterator();
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix10);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(vector18);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix21);
        org.junit.Assert.assertNotNull(matrix22);
        org.junit.Assert.assertNotNull(vector23);
        org.junit.Assert.assertNotNull(denseVector27);
        org.junit.Assert.assertNotNull(denseVector30);
        org.junit.Assert.assertNotNull(matrix31);
        org.junit.Assert.assertNotNull(vector33);
        org.junit.Assert.assertNotNull(matrix34);
        org.junit.Assert.assertNotNull(cCSMatrix37);
        org.junit.Assert.assertNotNull(vectorAccumulator38);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(basicVector40);
        org.junit.Assert.assertNotNull(matrix41);
        org.junit.Assert.assertNotNull(vectorPredicate42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(cCSMatrix50);
        org.junit.Assert.assertNotNull(vectorAccumulator51);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix53);
        org.junit.Assert.assertNotNull(cCSMatrix59);
        org.junit.Assert.assertNotNull(vectorAccumulator60);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix62);
        org.junit.Assert.assertNotNull(matrix72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(vector76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(cRSMatrix81);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix86);
        org.junit.Assert.assertNotNull(matrix87);
        org.junit.Assert.assertNotNull(matrix88);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix91);
        org.junit.Assert.assertNotNull(denseMatrix93);
        org.junit.Assert.assertNotNull(matrix94);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "" + "'", str97, "");
        org.junit.Assert.assertNotNull(vector98);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator99);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix4 = rowMajorSparseMatrix3.removeLastRow();
        double double8 = rowMajorSparseMatrix3.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int9 = rowMajorSparseMatrix3.cardinality();
        org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication10 = new org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix13 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator14 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray15 = cCSMatrix13.foldRows(vectorAccumulator14);
        org.la4j.Matrix matrix16 = ooPlaceMatrixByItsTransposeMultiplication10.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix13);
        double double18 = cCSMatrix13.minInColumn(0);
        org.la4j.iterator.MatrixIterator matrixIterator19 = cCSMatrix13.nonZeroIterator();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix22 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator23 = cRSMatrix22.nonZeroIterator();
        org.la4j.Vector vector25 = cRSMatrix22.getColumn(100);
        boolean boolean28 = cRSMatrix22.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator30 = cRSMatrix22.nonZeroIteratorOfColumn((-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix31 = cRSMatrix22.toRowMajorSparseMatrix();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory32 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix33 = cRSMatrix22.to(basic1DMatrixMatrixFactory32);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix34 = cCSMatrix13.to(basic1DMatrixMatrixFactory32);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix35 = rowMajorSparseMatrix3.to(basic1DMatrixMatrixFactory32);
        // The following exception was thrown during execution in test generation
        try {
            double double38 = basic1DMatrix35.get(10, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Row '10' is invalid.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(cCSMatrix13);
        org.junit.Assert.assertNotNull(vectorAccumulator14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertNotNull(matrixIterator19);
        org.junit.Assert.assertNotNull(cRSMatrix22);
        org.junit.Assert.assertNotNull(matrixIterator23);
        org.junit.Assert.assertNotNull(vector25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(vectorIterator30);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix31);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory32);
        org.junit.Assert.assertNotNull(basic1DMatrix33);
        org.junit.Assert.assertNotNull(basic1DMatrix34);
        org.junit.Assert.assertNotNull(basic1DMatrix35);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation5 = inPlaceCopyMatrixToMatrix0.partiallyApply(rowMajorSparseMatrix4);
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation6 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray13 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray20 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray27 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray34 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray41 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray42 = new double[][] { doubleArray13, doubleArray20, doubleArray27, doubleArray34, doubleArray41 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix43 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray42);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation44 = matrixMatrixMatrixOperation6.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix43);
        org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix45 = new org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix();
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction46 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix49 = org.la4j.matrix.dense.Basic2DMatrix.unit((int) (byte) 1, (int) '4');
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction50 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix53 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean54 = cCSMatrix53.isRowMajor();
        org.la4j.Matrix matrix57 = cCSMatrix53.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator58 = cCSMatrix53.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix62 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix64 = rowMajorSparseMatrix62.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix68 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double72 = rowMajorSparseMatrix68.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix73 = rowMajorSparseMatrix68.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct74 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean75 = sparseMatrix73.equals((java.lang.Object) ooPlaceOuterProduct74);
        org.la4j.Matrix matrix76 = rowMajorSparseMatrix62.hadamardProduct((org.la4j.Matrix) sparseMatrix73);
        org.la4j.Matrix matrix77 = ooPlaceMatricesSubtraction50.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix53, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix62);
        org.la4j.Matrix matrix78 = ooPlaceMatricesSubtraction46.apply((org.la4j.matrix.DenseMatrix) basic2DMatrix49, rowMajorSparseMatrix62);
        org.la4j.decomposition.SingularValueDecompositor singularValueDecompositor79 = new org.la4j.decomposition.SingularValueDecompositor((org.la4j.Matrix) rowMajorSparseMatrix62);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix81 = org.la4j.matrix.sparse.CRSMatrix.fromCSV("");
        org.la4j.Matrix matrix82 = inPlaceCopyMatrixToMatrix45.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix62, (org.la4j.matrix.SparseMatrix) cRSMatrix81);
        org.la4j.Matrix matrix83 = inPlaceCopyMatrixToMatrix0.apply((org.la4j.matrix.DenseMatrix) basic2DMatrix43, (org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix81);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix85 = org.la4j.matrix.sparse.CCSMatrix.fromCSV("");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix88 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double89 = cRSMatrix88.min();
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator90 = cRSMatrix88.nonZeroRowMajorIterator();
        org.la4j.decomposition.RawLUDecompositor rawLUDecompositor91 = new org.la4j.decomposition.RawLUDecompositor((org.la4j.Matrix) cRSMatrix88);
        org.la4j.Matrix matrix92 = inPlaceCopyMatrixToMatrix0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix85, (org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix88);
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator93 = cRSMatrix88.rowMajorIterator();
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix4);
        org.junit.Assert.assertNotNull(matrixMatrixOperation5);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation6);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(basic2DMatrix43);
        org.junit.Assert.assertNotNull(matrixMatrixOperation44);
        org.junit.Assert.assertNotNull(basic2DMatrix49);
        org.junit.Assert.assertNotNull(cCSMatrix53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(matrix57);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator58);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix62);
        org.junit.Assert.assertNotNull(matrix64);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix68);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(matrix76);
        org.junit.Assert.assertNotNull(matrix77);
        org.junit.Assert.assertNotNull(matrix78);
        org.junit.Assert.assertNotNull(cRSMatrix81);
        org.junit.Assert.assertNotNull(matrix82);
        org.junit.Assert.assertNotNull(matrix83);
        org.junit.Assert.assertNotNull(cCSMatrix85);
        org.junit.Assert.assertNotNull(cRSMatrix88);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator90);
        org.junit.Assert.assertNotNull(matrix92);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator93);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator3 = cRSMatrix2.nonZeroIterator();
        org.la4j.Vector vector5 = cRSMatrix2.getColumn(100);
        boolean boolean8 = cRSMatrix2.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator10 = cRSMatrix2.nonZeroIteratorOfColumn((-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix11 = cRSMatrix2.toRowMajorSparseMatrix();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix15 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double19 = rowMajorSparseMatrix15.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix20 = rowMajorSparseMatrix15.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate21 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean22 = sparseMatrix20.is(advancedMatrixPredicate21);
        boolean boolean23 = rowMajorSparseMatrix11.non(advancedMatrixPredicate21);
        org.la4j.matrix.DenseMatrix denseMatrix24 = rowMajorSparseMatrix11.toDenseMatrix();
        org.la4j.decomposition.RawLUDecompositor rawLUDecompositor25 = new org.la4j.decomposition.RawLUDecompositor((org.la4j.Matrix) rowMajorSparseMatrix11);
        org.la4j.operation.ooplace.OoPlaceKroneckerProduct ooPlaceKroneckerProduct26 = new org.la4j.operation.ooplace.OoPlaceKroneckerProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix29 = org.la4j.matrix.RowMajorSparseMatrix.diagonal(100, 10.0d);
        org.la4j.iterator.VectorIterator vectorIterator31 = rowMajorSparseMatrix29.nonZeroIteratorOfRow(30);
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction32 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix36 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix37 = rowMajorSparseMatrix36.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix39 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix40 = ooPlaceMatricesSubtraction32.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix36, denseMatrix39);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix43 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double44 = columnMajorSparseMatrix43.determinant();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory45 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix46 = columnMajorSparseMatrix43.to(basic1DMatrixMatrixFactory45);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix50 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix51 = rowMajorSparseMatrix50.removeLastRow();
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure52 = null;
        rowMajorSparseMatrix50.eachNonZero(matrixProcedure52);
        org.la4j.Matrix matrix54 = ooPlaceMatricesSubtraction32.applySimple((org.la4j.matrix.DenseMatrix) basic1DMatrix46, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix50);
        org.la4j.Matrix matrix55 = basic1DMatrix46.shuffle();
        basic1DMatrix46.swapColumns(10, (int) (short) 100);
        org.la4j.Matrix matrix61 = basic1DMatrix46.copyOfShape(30, (int) (short) 100);
        org.la4j.Matrix matrix62 = ooPlaceKroneckerProduct26.apply(rowMajorSparseMatrix29, (org.la4j.matrix.DenseMatrix) basic1DMatrix46);
        basic1DMatrix46.swapRows((int) (byte) 100, (int) (short) 0);
        boolean boolean66 = rawLUDecompositor25.applicableTo((org.la4j.Matrix) basic1DMatrix46);
        // The following exception was thrown during execution in test generation
        try {
            double double69 = basic1DMatrix46.get((int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Row '0' is invalid.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertNotNull(matrixIterator3);
        org.junit.Assert.assertNotNull(vector5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(vectorIterator10);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix11);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix20);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(denseMatrix24);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix29);
        org.junit.Assert.assertNotNull(vectorIterator31);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix36);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(denseMatrix39);
        org.junit.Assert.assertNotNull(matrix40);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory45);
        org.junit.Assert.assertNotNull(basic1DMatrix46);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix50);
        org.junit.Assert.assertNotNull(matrix51);
        org.junit.Assert.assertNotNull(matrix54);
        org.junit.Assert.assertNotNull(matrix55);
        org.junit.Assert.assertNotNull(matrix61);
        org.junit.Assert.assertNotNull(matrix62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        java.util.Random random1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix2 = org.la4j.matrix.dense.Basic2DMatrix.randomSymmetric((int) (byte) 1, random1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix2 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double3 = columnMajorSparseMatrix2.determinant();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory4 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix5 = columnMajorSparseMatrix2.to(basic1DMatrixMatrixFactory4);
        org.la4j.Matrix matrix8 = basic1DMatrix5.copyOfShape((int) (byte) 0, (int) (short) 1);
        basic1DMatrix5.swapRows((int) ' ', (int) (byte) 1);
        basic1DMatrix5.setAll(1.0d);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory4);
        org.junit.Assert.assertNotNull(basic1DMatrix5);
        org.junit.Assert.assertNotNull(matrix8);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.identity((int) (byte) 0);
        org.la4j.Matrix matrix3 = ooPlaceMatrixByItsTransposeMultiplication0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix2);
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation4 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray11 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray18 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray25 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray32 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray39 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray40 = new double[][] { doubleArray11, doubleArray18, doubleArray25, doubleArray32, doubleArray39 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix41 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray40);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation42 = matrixMatrixMatrixOperation4.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix41);
        java.util.Spliterator<java.lang.Double> doubleSpliterator43 = basic2DMatrix41.spliterator();
        basic2DMatrix41.setAll((double) (byte) 10);
        ooPlaceMatrixByItsTransposeMultiplication0.ensureApplicableTo((org.la4j.Matrix) basic2DMatrix41);
        // The following exception was thrown during execution in test generation
        try {
            double double49 = basic2DMatrix41.get((int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix2);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertNotNull(basic2DMatrix41);
        org.junit.Assert.assertNotNull(matrixMatrixOperation42);
        org.junit.Assert.assertNotNull(doubleSpliterator43);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.la4j.Matrix matrix8 = org.la4j.Matrix.diagonal((int) (short) 10, (double) 0);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator10 = org.la4j.Vectors.asSumAccumulator(100.0d);
        double[] doubleArray11 = matrix8.foldColumns(vectorAccumulator10);
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix12 = org.la4j.matrix.dense.Basic2DMatrix.from1DArray((int) 'a', (int) (byte) 0, doubleArray11);
        org.la4j.vector.DenseVector denseVector13 = org.la4j.vector.DenseVector.fromArray(doubleArray11);
        org.la4j.matrix.SparseMatrix sparseMatrix14 = org.la4j.matrix.SparseMatrix.from1DArray((int) (byte) 1, (int) (byte) 0, doubleArray11);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix15 = org.la4j.matrix.dense.Basic1DMatrix.from1DArray((int) (byte) 1, (int) '4', doubleArray11);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(vectorAccumulator10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(basic2DMatrix12);
        org.junit.Assert.assertNotNull(denseVector13);
        org.junit.Assert.assertNotNull(sparseMatrix14);
        org.junit.Assert.assertNotNull(basic1DMatrix15);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix5 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator6 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray7 = cCSMatrix5.foldRows(vectorAccumulator6);
        org.la4j.matrix.DenseMatrix denseMatrix8 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray7);
        org.la4j.vector.dense.BasicVector basicVector9 = new org.la4j.vector.dense.BasicVector(doubleArray7);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix14 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator15 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray16 = cCSMatrix14.foldRows(vectorAccumulator15);
        org.la4j.matrix.DenseMatrix denseMatrix17 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray16);
        org.la4j.vector.dense.BasicVector basicVector18 = new org.la4j.vector.dense.BasicVector(doubleArray16);
        ooPlaceOuterProduct0.ensureApplicableTo((org.la4j.Vector) basicVector9, (org.la4j.Vector) basicVector18);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix23 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double27 = rowMajorSparseMatrix23.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix28 = rowMajorSparseMatrix23.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct29 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean30 = sparseMatrix28.equals((java.lang.Object) ooPlaceOuterProduct29);
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct31 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix36 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator37 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray38 = cCSMatrix36.foldRows(vectorAccumulator37);
        org.la4j.matrix.DenseMatrix denseMatrix39 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray38);
        org.la4j.vector.dense.BasicVector basicVector40 = new org.la4j.vector.dense.BasicVector(doubleArray38);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix45 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator46 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray47 = cCSMatrix45.foldRows(vectorAccumulator46);
        org.la4j.matrix.DenseMatrix denseMatrix48 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray47);
        org.la4j.vector.dense.BasicVector basicVector49 = new org.la4j.vector.dense.BasicVector(doubleArray47);
        ooPlaceOuterProduct31.ensureApplicableTo((org.la4j.Vector) basicVector40, (org.la4j.Vector) basicVector49);
        org.la4j.vector.sparse.CompressedVector compressedVector52 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector52.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector57 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix58 = ooPlaceOuterProduct31.apply((org.la4j.vector.SparseVector) compressedVector52, (org.la4j.vector.SparseVector) compressedVector57);
        double double59 = compressedVector57.min();
        org.la4j.iterator.VectorIterator vectorIterator60 = compressedVector57.iterator();
        org.la4j.Matrix matrix61 = basicVector9.apply((org.la4j.operation.VectorVectorOperation<org.la4j.Matrix>) ooPlaceOuterProduct29, (org.la4j.Vector) compressedVector57);
        java.util.Random random63 = null;
        org.la4j.Vector vector64 = org.la4j.Vector.random((int) (byte) 0, random63);
        org.la4j.Vector vector65 = null;
        ooPlaceOuterProduct29.ensureApplicableTo(vector64, vector65);
        org.la4j.vector.dense.BasicVector basicVector68 = new org.la4j.vector.dense.BasicVector((int) (byte) 0);
        double double69 = basicVector68.norm();
        org.la4j.operation.VectorOperation<org.la4j.Matrix> matrixVectorOperation70 = ooPlaceOuterProduct29.partiallyApply((org.la4j.vector.DenseVector) basicVector68);
        org.junit.Assert.assertNotNull(cCSMatrix5);
        org.junit.Assert.assertNotNull(vectorAccumulator6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix8);
        org.junit.Assert.assertNotNull(cCSMatrix14);
        org.junit.Assert.assertNotNull(vectorAccumulator15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix17);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix23);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(cCSMatrix36);
        org.junit.Assert.assertNotNull(vectorAccumulator37);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix39);
        org.junit.Assert.assertNotNull(cCSMatrix45);
        org.junit.Assert.assertNotNull(vectorAccumulator46);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix48);
        org.junit.Assert.assertNotNull(matrix58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNotNull(vectorIterator60);
        org.junit.Assert.assertNotNull(matrix61);
        org.junit.Assert.assertNotNull(vector64);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertNotNull(matrixVectorOperation70);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix2 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (short) 1, 0);
        org.la4j.Matrix matrix3 = rowMajorSparseMatrix2.shuffle();
        org.la4j.Matrix matrix4 = matrix3.copy();
        double double5 = matrix4.norm();
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix2);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.la4j.operation.ooplace.OoPlaceVectorsAddition ooPlaceVectorsAddition0 = new org.la4j.operation.ooplace.OoPlaceVectorsAddition();
        org.la4j.vector.dense.BasicVector basicVector2 = new org.la4j.vector.dense.BasicVector((int) (byte) 1);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = new org.la4j.matrix.sparse.CRSMatrix();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix6 = new org.la4j.matrix.sparse.CCSMatrix((int) (byte) 1, (int) (byte) 0);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix10 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix11 = rowMajorSparseMatrix10.removeLastRow();
        org.la4j.matrix.functor.MatrixFunction matrixFunction13 = null;
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator14 = org.la4j.Matrices.asSumFunctionAccumulator((double) (-1), matrixFunction13);
        double double15 = matrix11.fold(matrixAccumulator14);
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure16 = org.la4j.Matrices.asAccumulatorProcedure(matrixAccumulator14);
        cCSMatrix6.eachNonZero(matrixProcedure16);
        cRSMatrix3.eachNonZero(matrixProcedure16);
        org.la4j.Matrix matrix20 = cRSMatrix3.multiply((double) 100L);
        boolean boolean21 = basicVector2.equals((java.lang.Object) 100L);
        org.la4j.Vector vector23 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str24 = vector23.toCSV();
        org.la4j.vector.SparseVector sparseVector25 = vector23.toSparseVector();
        boolean boolean27 = sparseVector25.isZeroAt(52);
        org.la4j.iterator.VectorIterator vectorIterator28 = sparseVector25.iterator();
        org.la4j.iterator.VectorIterator vectorIterator29 = sparseVector25.nonZeroIterator();
        double double30 = sparseVector25.manhattanNorm();
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector31 = ooPlaceVectorsAddition0.apply((org.la4j.vector.DenseVector) basicVector2, sparseVector25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix10);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(matrixAccumulator14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(matrixProcedure16);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(vector23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000" + "'", str24, "1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000");
        org.junit.Assert.assertNotNull(sparseVector25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(vectorIterator28);
        org.junit.Assert.assertNotNull(vectorIterator29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix2 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (short) 1, 0);
        org.la4j.Matrix matrix3 = rowMajorSparseMatrix2.shuffle();
        org.la4j.Matrix matrix4 = rowMajorSparseMatrix2.shuffle();
        org.la4j.vector.sparse.CompressedVector compressedVector6 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        double double7 = compressedVector6.euclideanNorm();
        org.la4j.Vector vector9 = compressedVector6.blankOfLength(52);
        org.la4j.iterator.VectorIterator vectorIterator10 = vector9.iterator();
        double double11 = vector9.euclideanNorm();
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector12 = matrix4.multiply(vector9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given vector should have the same length as number of columns in the given matrix: 52 does not equal to 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix2);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(vector9);
        org.junit.Assert.assertNotNull(vectorIterator10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.la4j.matrix.DenseMatrix denseMatrix1 = org.la4j.matrix.DenseMatrix.identity((int) (byte) 100);
        org.junit.Assert.assertNotNull(denseMatrix1);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix3 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean4 = cCSMatrix3.isRowMajor();
        org.la4j.Matrix matrix7 = cCSMatrix3.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator8 = cCSMatrix3.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix12 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix14 = rowMajorSparseMatrix12.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix18 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double22 = rowMajorSparseMatrix18.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix23 = rowMajorSparseMatrix18.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct24 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean25 = sparseMatrix23.equals((java.lang.Object) ooPlaceOuterProduct24);
        org.la4j.Matrix matrix26 = rowMajorSparseMatrix12.hadamardProduct((org.la4j.Matrix) sparseMatrix23);
        org.la4j.Matrix matrix27 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix3, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix12);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix31 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix32 = rowMajorSparseMatrix31.removeLastRow();
        double double36 = rowMajorSparseMatrix31.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int37 = rowMajorSparseMatrix31.cardinality();
        org.la4j.Vector vector39 = rowMajorSparseMatrix31.getRow(0);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation40 = ooPlaceMatricesSubtraction0.partiallyApply(rowMajorSparseMatrix31);
        org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication41 = new org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix44 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator45 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray46 = cCSMatrix44.foldRows(vectorAccumulator45);
        org.la4j.Matrix matrix47 = ooPlaceMatrixByItsTransposeMultiplication41.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix44);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation48 = ooPlaceMatricesSubtraction0.partiallyApply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix44);
        double double50 = cCSMatrix44.minInColumn((int) (short) 10);
        org.junit.Assert.assertNotNull(cCSMatrix3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator8);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(matrix26);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix31);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(vector39);
        org.junit.Assert.assertNotNull(matrixMatrixOperation40);
        org.junit.Assert.assertNotNull(cCSMatrix44);
        org.junit.Assert.assertNotNull(vectorAccumulator45);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(matrix47);
        org.junit.Assert.assertNotNull(matrixMatrixOperation48);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator3 = cRSMatrix2.nonZeroRowMajorIterator();
        boolean boolean4 = cRSMatrix2.isRowMajor();
        org.la4j.iterator.VectorIterator vectorIterator6 = cRSMatrix2.nonZeroIteratorOfColumn((int) (byte) 0);
        java.util.Spliterator<java.lang.Double> doubleSpliterator7 = cRSMatrix2.spliterator();
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(vectorIterator6);
        org.junit.Assert.assertNotNull(doubleSpliterator7);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.la4j.vector.dense.BasicVector basicVector2 = org.la4j.vector.dense.BasicVector.constant((int) (byte) 1, (double) 100.0f);
        org.la4j.Vector vector4 = basicVector2.multiply((double) 0.0f);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix8 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double12 = rowMajorSparseMatrix8.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix13 = rowMajorSparseMatrix8.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct14 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean15 = sparseMatrix13.equals((java.lang.Object) ooPlaceOuterProduct14);
        org.la4j.vector.DenseVector denseVector17 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random19 = null;
        org.la4j.vector.DenseVector denseVector20 = org.la4j.vector.DenseVector.random(0, random19);
        java.lang.String str21 = denseVector20.toString();
        ooPlaceOuterProduct14.ensureApplicableTo((org.la4j.Vector) denseVector17, (org.la4j.Vector) denseVector20);
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct23 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix28 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator29 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray30 = cCSMatrix28.foldRows(vectorAccumulator29);
        org.la4j.matrix.DenseMatrix denseMatrix31 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray30);
        org.la4j.vector.dense.BasicVector basicVector32 = new org.la4j.vector.dense.BasicVector(doubleArray30);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix37 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator38 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray39 = cCSMatrix37.foldRows(vectorAccumulator38);
        org.la4j.matrix.DenseMatrix denseMatrix40 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray39);
        org.la4j.vector.dense.BasicVector basicVector41 = new org.la4j.vector.dense.BasicVector(doubleArray39);
        ooPlaceOuterProduct23.ensureApplicableTo((org.la4j.Vector) basicVector32, (org.la4j.Vector) basicVector41);
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct43 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random45 = null;
        org.la4j.vector.DenseVector denseVector46 = org.la4j.vector.DenseVector.random(0, random45);
        java.util.Random random48 = null;
        org.la4j.vector.DenseVector denseVector49 = org.la4j.vector.DenseVector.random(0, random48);
        org.la4j.Matrix matrix50 = ooPlaceOuterProduct43.apply(denseVector46, denseVector49);
        org.la4j.vector.sparse.CompressedVector compressedVector52 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix53 = ooPlaceOuterProduct23.apply(denseVector46, (org.la4j.vector.SparseVector) compressedVector52);
        java.text.NumberFormat numberFormat54 = null;
        java.lang.String str56 = denseVector46.mkString(numberFormat54, "hi!");
        org.la4j.vector.sparse.CompressedVector compressedVector58 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        double double59 = compressedVector58.euclideanNorm();
        org.la4j.Matrix matrix60 = ooPlaceOuterProduct14.apply(denseVector46, (org.la4j.vector.SparseVector) compressedVector58);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix63 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean64 = cCSMatrix63.isRowMajor();
        org.la4j.Matrix matrix67 = cCSMatrix63.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator68 = cCSMatrix63.nonZeroColumnMajorIterator();
        org.la4j.Vector vector70 = cCSMatrix63.getRow((int) (byte) 100);
        org.la4j.Matrix matrix71 = basicVector2.apply((org.la4j.operation.VectorVectorOperation<org.la4j.Matrix>) ooPlaceOuterProduct14, vector70);
        org.junit.Assert.assertNotNull(basicVector2);
        org.junit.Assert.assertNotNull(vector4);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(denseVector17);
        org.junit.Assert.assertNotNull(denseVector20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(cCSMatrix28);
        org.junit.Assert.assertNotNull(vectorAccumulator29);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix31);
        org.junit.Assert.assertNotNull(cCSMatrix37);
        org.junit.Assert.assertNotNull(vectorAccumulator38);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix40);
        org.junit.Assert.assertNotNull(denseVector46);
        org.junit.Assert.assertNotNull(denseVector49);
        org.junit.Assert.assertNotNull(matrix50);
        org.junit.Assert.assertNotNull(matrix53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNotNull(matrix60);
        org.junit.Assert.assertNotNull(cCSMatrix63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(matrix67);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator68);
        org.junit.Assert.assertNotNull(vector70);
        org.junit.Assert.assertNotNull(matrix71);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.la4j.vector.functor.VectorFunction vectorFunction1 = org.la4j.Vectors.asMinusFunction((double) 0);
        org.junit.Assert.assertNotNull(vectorFunction1);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.la4j.operation.ooplace.OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatricesMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix3 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator4 = cCSMatrix3.nonZeroColumnMajorIterator();
        org.la4j.Matrix matrix5 = cCSMatrix3.transpose();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix8 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean9 = cCSMatrix8.isRowMajor();
        org.la4j.Matrix matrix10 = cCSMatrix8.transpose();
        ooPlaceMatricesMultiplication0.ensureApplicableTo((org.la4j.Matrix) cCSMatrix3, matrix10);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix14 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double15 = columnMajorSparseMatrix14.determinant();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory16 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix17 = columnMajorSparseMatrix14.to(basic1DMatrixMatrixFactory16);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition18 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix21 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double22 = cRSMatrix21.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix26 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix27 = rowMajorSparseMatrix26.removeLastRow();
        org.la4j.Matrix matrix28 = ooPlaceMatricesAddition18.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix21, rowMajorSparseMatrix26);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition29 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix32 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double33 = cRSMatrix32.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix37 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix38 = rowMajorSparseMatrix37.removeLastRow();
        org.la4j.Matrix matrix39 = ooPlaceMatricesAddition29.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix32, rowMajorSparseMatrix37);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix42 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.matrix.DenseMatrix denseMatrix44 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix45 = ooPlaceMatricesAddition29.apply(columnMajorSparseMatrix42, denseMatrix44);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix49 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix50 = rowMajorSparseMatrix49.removeLastRow();
        double double54 = rowMajorSparseMatrix49.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        org.la4j.Vector vector55 = rowMajorSparseMatrix49.toRowVector();
        org.la4j.Matrix matrix56 = ooPlaceMatricesAddition18.apply(denseMatrix44, rowMajorSparseMatrix49);
        org.la4j.matrix.SparseMatrix sparseMatrix57 = denseMatrix44.toSparseMatrix();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix58 = denseMatrix44.toRowMajorSparseMatrix();
        org.la4j.Matrix matrix59 = ooPlaceMatricesMultiplication0.apply(columnMajorSparseMatrix14, rowMajorSparseMatrix58);
        org.la4j.operation.ooplace.OoPlaceKroneckerProduct ooPlaceKroneckerProduct60 = new org.la4j.operation.ooplace.OoPlaceKroneckerProduct();
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix63 = org.la4j.matrix.dense.Basic1DMatrix.unit((int) (byte) 10, (int) (byte) 0);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix66 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double67 = cRSMatrix66.min();
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator68 = cRSMatrix66.nonZeroRowMajorIterator();
        org.la4j.decomposition.RawLUDecompositor rawLUDecompositor69 = new org.la4j.decomposition.RawLUDecompositor((org.la4j.Matrix) cRSMatrix66);
        org.la4j.Matrix matrix70 = ooPlaceKroneckerProduct60.apply((org.la4j.matrix.DenseMatrix) basic1DMatrix63, (org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix66);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix72 = org.la4j.matrix.RowMajorSparseMatrix.fromCSV("");
        org.la4j.Matrix matrix73 = ooPlaceMatricesMultiplication0.apply((org.la4j.matrix.DenseMatrix) basic1DMatrix63, rowMajorSparseMatrix72);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix75 = org.la4j.matrix.RowMajorSparseMatrix.fromCSV("");
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate76 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix79 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        boolean boolean80 = advancedMatrixPredicate76.test((org.la4j.Matrix) columnMajorSparseMatrix79);
        org.la4j.vector.functor.VectorFunction vectorFunction82 = null;
        org.la4j.Matrix matrix83 = columnMajorSparseMatrix79.transformRow(0, vectorFunction82);
        org.la4j.Matrix matrix84 = ooPlaceMatricesMultiplication0.apply(rowMajorSparseMatrix75, columnMajorSparseMatrix79);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix88 = org.la4j.matrix.dense.Basic1DMatrix.constant((int) (short) 100, (int) '4', 1.0d);
        double double89 = basic1DMatrix88.norm();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix90 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix91 = ooPlaceMatricesMultiplication0.apply((org.la4j.matrix.DenseMatrix) basic1DMatrix88, columnMajorSparseMatrix90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix3);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator4);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(cCSMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory16);
        org.junit.Assert.assertNotNull(basic1DMatrix17);
        org.junit.Assert.assertNotNull(cRSMatrix21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix26);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertNotNull(cRSMatrix32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix37);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix42);
        org.junit.Assert.assertNotNull(denseMatrix44);
        org.junit.Assert.assertNotNull(matrix45);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix49);
        org.junit.Assert.assertNotNull(matrix50);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertNotNull(vector55);
        org.junit.Assert.assertNotNull(matrix56);
        org.junit.Assert.assertNotNull(sparseMatrix57);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix58);
        org.junit.Assert.assertNotNull(matrix59);
        org.junit.Assert.assertNotNull(basic1DMatrix63);
        org.junit.Assert.assertNotNull(cRSMatrix66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator68);
        org.junit.Assert.assertNotNull(matrix70);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix72);
        org.junit.Assert.assertNotNull(matrix73);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix75);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate76);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(matrix83);
        org.junit.Assert.assertNotNull(matrix84);
        org.junit.Assert.assertNotNull(basic1DMatrix88);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 72.11102550927978d + "'", double89 == 72.11102550927978d);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix2 = org.la4j.matrix.dense.Basic1DMatrix.zero(10, 6);
        org.junit.Assert.assertNotNull(basic1DMatrix2);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean3 = cCSMatrix2.isRowMajor();
        org.la4j.Matrix matrix6 = cCSMatrix2.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator7 = cCSMatrix2.nonZeroColumnMajorIterator();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix10 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double11 = cRSMatrix10.min();
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator12 = cRSMatrix10.nonZeroRowMajorIterator();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix15 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator16 = columnMajorSparseMatrix15.nonZeroIterator();
        org.la4j.iterator.MatrixIterator matrixIterator17 = rowMajorMatrixIterator12.orElseSubtract(matrixIterator16);
        org.la4j.iterator.MatrixIterator matrixIterator18 = columnMajorMatrixIterator7.orElseAdd(matrixIterator16);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix21 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator22 = columnMajorSparseMatrix21.nonZeroIterator();
        org.la4j.iterator.MatrixIterator matrixIterator23 = columnMajorMatrixIterator7.orElseSubtract(matrixIterator22);
        org.junit.Assert.assertNotNull(cCSMatrix2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(matrix6);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator7);
        org.junit.Assert.assertNotNull(cRSMatrix10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator12);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix15);
        org.junit.Assert.assertNotNull(matrixIterator16);
        org.junit.Assert.assertNotNull(matrixIterator17);
        org.junit.Assert.assertNotNull(matrixIterator18);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix21);
        org.junit.Assert.assertNotNull(matrixIterator22);
        org.junit.Assert.assertNotNull(matrixIterator23);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix3 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean4 = cCSMatrix3.isRowMajor();
        org.la4j.Matrix matrix7 = cCSMatrix3.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator8 = cCSMatrix3.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix12 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix14 = rowMajorSparseMatrix12.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix18 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double22 = rowMajorSparseMatrix18.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix23 = rowMajorSparseMatrix18.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct24 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean25 = sparseMatrix23.equals((java.lang.Object) ooPlaceOuterProduct24);
        org.la4j.Matrix matrix26 = rowMajorSparseMatrix12.hadamardProduct((org.la4j.Matrix) sparseMatrix23);
        org.la4j.Matrix matrix27 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix3, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix12);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix29 = org.la4j.matrix.sparse.CRSMatrix.fromCSV("");
        org.la4j.matrix.DenseMatrix denseMatrix32 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        double double33 = denseMatrix32.min();
        org.la4j.Matrix matrix34 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.SparseMatrix) cRSMatrix29, denseMatrix32);
        java.util.Random random36 = null;
        org.la4j.matrix.DenseMatrix denseMatrix37 = org.la4j.matrix.DenseMatrix.randomSymmetric(0, random36);
        double[][] doubleArray38 = new double[][] {};
        org.la4j.matrix.DenseMatrix denseMatrix39 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray38);
        org.la4j.matrix.DenseMatrix denseMatrix40 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray38);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix41 = denseMatrix40.toRowMajorSparseMatrix();
        org.la4j.Matrix matrix42 = ooPlaceMatricesSubtraction0.apply(denseMatrix37, denseMatrix40);
        matrix42.setAll(10.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix47 = matrix42.copyOfShape((int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrong matrix dimensions: -1x-1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator8);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(matrix26);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(cRSMatrix29);
        org.junit.Assert.assertNotNull(denseMatrix32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + Double.POSITIVE_INFINITY + "'", double33 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(matrix34);
        org.junit.Assert.assertNotNull(denseMatrix37);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertNotNull(denseMatrix39);
        org.junit.Assert.assertNotNull(denseMatrix40);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix41);
        org.junit.Assert.assertNotNull(matrix42);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix1 = org.la4j.matrix.ColumnMajorSparseMatrix.identity(6);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix1);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix5 = rowMajorSparseMatrix4.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix7 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix8 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix4, denseMatrix7);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix11 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double12 = columnMajorSparseMatrix11.determinant();
        org.la4j.matrix.DenseMatrix denseMatrix15 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        double double16 = denseMatrix15.min();
        double double17 = denseMatrix15.sum();
        org.la4j.Matrix matrix18 = ooPlaceMatricesSubtraction0.apply(columnMajorSparseMatrix11, denseMatrix15);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix21 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator22 = cRSMatrix21.nonZeroIterator();
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation23 = ooPlaceMatricesSubtraction0.partiallyApply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix21);
        org.la4j.Matrix matrix28 = org.la4j.Matrix.diagonal((int) (short) 10, (double) 0);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator30 = org.la4j.Vectors.asSumAccumulator(100.0d);
        double[] doubleArray31 = matrix28.foldColumns(vectorAccumulator30);
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix32 = org.la4j.matrix.dense.Basic2DMatrix.from1DArray((int) 'a', (int) (byte) 0, doubleArray31);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix36 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix38 = rowMajorSparseMatrix36.divide((double) (-1));
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory39 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix40 = matrix38.to(basic1DMatrixMatrixFactory39);
        java.lang.Class<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixClass41 = basic1DMatrixMatrixFactory39.outputClass;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix42 = basic2DMatrix32.to(basic1DMatrixMatrixFactory39);
        java.util.Random random45 = null;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix46 = org.la4j.matrix.dense.Basic1DMatrix.random(10, (int) (byte) 0, random45);
        org.la4j.Matrix matrix47 = ooPlaceMatricesSubtraction0.apply((org.la4j.matrix.DenseMatrix) basic2DMatrix32, (org.la4j.matrix.DenseMatrix) basic1DMatrix46);
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct48 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix51 = org.la4j.matrix.dense.Basic2DMatrix.unit((int) (byte) 1, (int) '4');
        java.lang.String str52 = basic2DMatrix51.toCSV();
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition53 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix56 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double57 = cRSMatrix56.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix61 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix62 = rowMajorSparseMatrix61.removeLastRow();
        org.la4j.Matrix matrix63 = ooPlaceMatricesAddition53.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix56, rowMajorSparseMatrix61);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix66 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.matrix.DenseMatrix denseMatrix68 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix69 = ooPlaceMatricesAddition53.apply(columnMajorSparseMatrix66, denseMatrix68);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix72 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        byte[] byteArray73 = columnMajorSparseMatrix72.toBinary();
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation74 = ooPlaceMatricesAddition53.partiallyApply(columnMajorSparseMatrix72);
        org.la4j.Matrix matrix75 = ooPlaceMatrixHadamardProduct48.apply((org.la4j.matrix.DenseMatrix) basic2DMatrix51, columnMajorSparseMatrix72);
        org.la4j.Vector vector77 = columnMajorSparseMatrix72.getRow((int) (short) 10);
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct78 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix81 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator82 = cRSMatrix81.nonZeroIterator();
        org.la4j.Vector vector84 = cRSMatrix81.getColumn(100);
        boolean boolean87 = cRSMatrix81.nonZeroAt(1, (int) (short) 0);
        org.la4j.decomposition.RawLUDecompositor rawLUDecompositor88 = new org.la4j.decomposition.RawLUDecompositor((org.la4j.Matrix) cRSMatrix81);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix92 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix93 = rowMajorSparseMatrix92.removeLastRow();
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure94 = null;
        rowMajorSparseMatrix92.eachNonZero(matrixProcedure94);
        org.la4j.Matrix matrix96 = ooPlaceMatrixHadamardProduct78.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix81, rowMajorSparseMatrix92);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix97 = ooPlaceMatricesSubtraction0.apply(columnMajorSparseMatrix72, (org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix81);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix4);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(denseMatrix7);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(denseMatrix15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.POSITIVE_INFINITY + "'", double16 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertNotNull(cRSMatrix21);
        org.junit.Assert.assertNotNull(matrixIterator22);
        org.junit.Assert.assertNotNull(matrixMatrixOperation23);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertNotNull(vectorAccumulator30);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(basic2DMatrix32);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix36);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory39);
        org.junit.Assert.assertNotNull(basic1DMatrix40);
        org.junit.Assert.assertNotNull(basic1DMatrixClass41);
        org.junit.Assert.assertNotNull(basic1DMatrix42);
        org.junit.Assert.assertNotNull(basic1DMatrix46);
        org.junit.Assert.assertNotNull(matrix47);
        org.junit.Assert.assertNotNull(basic2DMatrix51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000\n" + "'", str52, "1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000\n");
        org.junit.Assert.assertNotNull(cRSMatrix56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix61);
        org.junit.Assert.assertNotNull(matrix62);
        org.junit.Assert.assertNotNull(matrix63);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix66);
        org.junit.Assert.assertNotNull(denseMatrix68);
        org.junit.Assert.assertNotNull(matrix69);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix72);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[48, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(matrixMatrixOperation74);
        org.junit.Assert.assertNotNull(matrix75);
        org.junit.Assert.assertNotNull(vector77);
        org.junit.Assert.assertNotNull(cRSMatrix81);
        org.junit.Assert.assertNotNull(matrixIterator82);
        org.junit.Assert.assertNotNull(vector84);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix92);
        org.junit.Assert.assertNotNull(matrix93);
        org.junit.Assert.assertNotNull(matrix96);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double7 = rowMajorSparseMatrix3.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix8 = rowMajorSparseMatrix3.toSparseMatrix();
        org.la4j.Matrix matrix9 = rowMajorSparseMatrix3.copy();
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation10 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation11 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray18 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray25 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray32 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray39 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray46 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray47 = new double[][] { doubleArray18, doubleArray25, doubleArray32, doubleArray39, doubleArray46 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix48 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray47);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation49 = matrixMatrixMatrixOperation11.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix48);
        org.la4j.Matrix matrix51 = basic2DMatrix48.blankOfColumns(52);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix55 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix56 = rowMajorSparseMatrix55.removeLastRow();
        org.la4j.matrix.functor.MatrixFunction matrixFunction58 = null;
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator59 = org.la4j.Matrices.asSumFunctionAccumulator((double) (-1), matrixFunction58);
        double double60 = matrix56.fold(matrixAccumulator59);
        double double61 = matrix56.manhattanNorm();
        matrixMatrixMatrixOperation10.ensureApplicableTo(matrix51, matrix56);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix66 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix68 = rowMajorSparseMatrix66.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix72 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double76 = rowMajorSparseMatrix72.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix77 = rowMajorSparseMatrix72.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct78 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean79 = sparseMatrix77.equals((java.lang.Object) ooPlaceOuterProduct78);
        org.la4j.Matrix matrix80 = rowMajorSparseMatrix66.hadamardProduct((org.la4j.Matrix) sparseMatrix77);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix83 = org.la4j.matrix.sparse.CRSMatrix.diagonal(0, (double) (short) 100);
        matrixMatrixMatrixOperation10.ensureApplicableTo(matrix80, (org.la4j.Matrix) cRSMatrix83);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix88 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix89 = rowMajorSparseMatrix88.removeLastRow();
        org.la4j.matrix.functor.MatrixFunction matrixFunction91 = null;
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator92 = org.la4j.Matrices.asSumFunctionAccumulator((double) (-1), matrixFunction91);
        double double93 = matrix89.fold(matrixAccumulator92);
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure94 = org.la4j.Matrices.asAccumulatorProcedure(matrixAccumulator92);
        cRSMatrix83.each(matrixProcedure94);
        rowMajorSparseMatrix3.eachNonZero(matrixProcedure94);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation10);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation11);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertNotNull(basic2DMatrix48);
        org.junit.Assert.assertNotNull(matrixMatrixOperation49);
        org.junit.Assert.assertNotNull(matrix51);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix55);
        org.junit.Assert.assertNotNull(matrix56);
        org.junit.Assert.assertNotNull(matrixAccumulator59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-1.0d) + "'", double60 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix66);
        org.junit.Assert.assertNotNull(matrix68);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix72);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 1.0d + "'", double76 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(matrix80);
        org.junit.Assert.assertNotNull(cRSMatrix83);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix88);
        org.junit.Assert.assertNotNull(matrix89);
        org.junit.Assert.assertNotNull(matrixAccumulator92);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + (-1.0d) + "'", double93 == (-1.0d));
        org.junit.Assert.assertNotNull(matrixProcedure94);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.la4j.vector.SparseVector sparseVector2 = org.la4j.vector.SparseVector.zero((int) ' ', (int) '4');
        org.junit.Assert.assertNotNull(sparseVector2);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.la4j.vector.functor.VectorPredicate vectorPredicate0 = org.la4j.Vectors.ZERO_VECTOR;
        boolean boolean3 = vectorPredicate0.test((int) (byte) 1, (double) 100L);
        org.junit.Assert.assertNotNull(vectorPredicate0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication();
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct1 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix4 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double5 = cRSMatrix4.min();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate6 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix9 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        boolean boolean10 = advancedMatrixPredicate6.test((org.la4j.Matrix) columnMajorSparseMatrix9);
        org.la4j.inversion.NoPivotGaussInverter noPivotGaussInverter11 = new org.la4j.inversion.NoPivotGaussInverter((org.la4j.Matrix) columnMajorSparseMatrix9);
        org.la4j.Matrix matrix12 = ooPlaceMatrixHadamardProduct1.applySymmetric((org.la4j.matrix.SparseMatrix) cRSMatrix4, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix9);
        org.la4j.operation.VectorOperation<org.la4j.Vector> vectorVectorOperation13 = ooPlaceMatrixByVectorMultiplication0.partiallyApply(columnMajorSparseMatrix9);
        columnMajorSparseMatrix9.setColumn(0, 3.1622776601683795d);
        org.junit.Assert.assertNotNull(cRSMatrix4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate6);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(matrix12);
        org.junit.Assert.assertNotNull(vectorVectorOperation13);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct0 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator4 = cRSMatrix3.nonZeroIterator();
        org.la4j.Vector vector6 = cRSMatrix3.getColumn(100);
        boolean boolean9 = cRSMatrix3.nonZeroAt(1, (int) (short) 0);
        org.la4j.decomposition.RawLUDecompositor rawLUDecompositor10 = new org.la4j.decomposition.RawLUDecompositor((org.la4j.Matrix) cRSMatrix3);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix14 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix15 = rowMajorSparseMatrix14.removeLastRow();
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure16 = null;
        rowMajorSparseMatrix14.eachNonZero(matrixProcedure16);
        org.la4j.Matrix matrix18 = ooPlaceMatrixHadamardProduct0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, rowMajorSparseMatrix14);
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation19 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray26 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray33 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray40 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray47 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray54 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray55 = new double[][] { doubleArray26, doubleArray33, doubleArray40, doubleArray47, doubleArray54 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix56 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray55);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation57 = matrixMatrixMatrixOperation19.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix56);
        java.util.Spliterator<java.lang.Double> doubleSpliterator58 = basic2DMatrix56.spliterator();
        org.la4j.Matrix matrix61 = basic2DMatrix56.copyOfShape(0, (int) (byte) 100);
        double[][] doubleArray62 = basic2DMatrix56.toArray();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix63 = org.la4j.matrix.sparse.CRSMatrix.from2DArray(doubleArray62);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix64 = org.la4j.matrix.RowMajorSparseMatrix.from2DArray(doubleArray62);
        org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication65 = new org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix68 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator69 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray70 = cCSMatrix68.foldRows(vectorAccumulator69);
        org.la4j.Matrix matrix71 = ooPlaceMatrixByItsTransposeMultiplication65.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix68);
        double double73 = cCSMatrix68.minInColumn(0);
        org.la4j.iterator.MatrixIterator matrixIterator74 = cCSMatrix68.nonZeroIterator();
        int int75 = cCSMatrix68.rank();
        org.la4j.Matrix matrix76 = ooPlaceMatrixHadamardProduct0.applySymmetric(rowMajorSparseMatrix64, (org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix68);
        org.junit.Assert.assertNotNull(cRSMatrix3);
        org.junit.Assert.assertNotNull(matrixIterator4);
        org.junit.Assert.assertNotNull(vector6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix14);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation19);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertNotNull(basic2DMatrix56);
        org.junit.Assert.assertNotNull(matrixMatrixOperation57);
        org.junit.Assert.assertNotNull(doubleSpliterator58);
        org.junit.Assert.assertNotNull(matrix61);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertNotNull(cRSMatrix63);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix64);
        org.junit.Assert.assertNotNull(cCSMatrix68);
        org.junit.Assert.assertNotNull(vectorAccumulator69);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(matrix71);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertNotNull(matrixIterator74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 52 + "'", int75 == 52);
        org.junit.Assert.assertNotNull(matrix76);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random2 = null;
        org.la4j.vector.DenseVector denseVector3 = org.la4j.vector.DenseVector.random(0, random2);
        java.util.Random random5 = null;
        org.la4j.vector.DenseVector denseVector6 = org.la4j.vector.DenseVector.random(0, random5);
        org.la4j.Matrix matrix7 = ooPlaceOuterProduct0.apply(denseVector3, denseVector6);
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct8 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix13 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator14 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray15 = cCSMatrix13.foldRows(vectorAccumulator14);
        org.la4j.matrix.DenseMatrix denseMatrix16 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray15);
        org.la4j.vector.dense.BasicVector basicVector17 = new org.la4j.vector.dense.BasicVector(doubleArray15);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix22 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator23 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray24 = cCSMatrix22.foldRows(vectorAccumulator23);
        org.la4j.matrix.DenseMatrix denseMatrix25 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray24);
        org.la4j.vector.dense.BasicVector basicVector26 = new org.la4j.vector.dense.BasicVector(doubleArray24);
        ooPlaceOuterProduct8.ensureApplicableTo((org.la4j.Vector) basicVector17, (org.la4j.Vector) basicVector26);
        org.la4j.vector.sparse.CompressedVector compressedVector29 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector29.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector34 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix35 = ooPlaceOuterProduct8.apply((org.la4j.vector.SparseVector) compressedVector29, (org.la4j.vector.SparseVector) compressedVector34);
        org.la4j.Matrix matrix36 = compressedVector34.toDiagonalMatrix();
        org.la4j.Vector vector38 = compressedVector34.copyOfLength((int) (byte) 100);
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct39 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix44 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator45 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray46 = cCSMatrix44.foldRows(vectorAccumulator45);
        org.la4j.matrix.DenseMatrix denseMatrix47 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray46);
        org.la4j.vector.dense.BasicVector basicVector48 = new org.la4j.vector.dense.BasicVector(doubleArray46);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix53 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator54 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray55 = cCSMatrix53.foldRows(vectorAccumulator54);
        org.la4j.matrix.DenseMatrix denseMatrix56 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray55);
        org.la4j.vector.dense.BasicVector basicVector57 = new org.la4j.vector.dense.BasicVector(doubleArray55);
        ooPlaceOuterProduct39.ensureApplicableTo((org.la4j.Vector) basicVector48, (org.la4j.Vector) basicVector57);
        org.la4j.vector.sparse.CompressedVector compressedVector60 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector60.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector65 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix66 = ooPlaceOuterProduct39.apply((org.la4j.vector.SparseVector) compressedVector60, (org.la4j.vector.SparseVector) compressedVector65);
        double double67 = compressedVector65.min();
        org.la4j.Matrix matrix68 = compressedVector65.toColumnMatrix();
        org.la4j.Matrix matrix69 = ooPlaceOuterProduct0.apply((org.la4j.vector.SparseVector) compressedVector34, (org.la4j.vector.SparseVector) compressedVector65);
        org.la4j.Vector vector71 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str72 = vector71.toCSV();
        org.la4j.vector.SparseVector sparseVector73 = vector71.toSparseVector();
        boolean boolean75 = sparseVector73.isZeroAt(52);
        org.la4j.iterator.VectorIterator vectorIterator76 = sparseVector73.iterator();
        org.la4j.iterator.VectorIterator vectorIterator77 = sparseVector73.nonZeroIterator();
        double double78 = sparseVector73.manhattanNorm();
        double double79 = sparseVector73.density();
        byte[] byteArray80 = sparseVector73.toBinary();
        org.la4j.operation.VectorOperation<org.la4j.Matrix> matrixVectorOperation81 = ooPlaceOuterProduct0.partiallyApply(sparseVector73);
        org.junit.Assert.assertNotNull(denseVector3);
        org.junit.Assert.assertNotNull(denseVector6);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(cCSMatrix13);
        org.junit.Assert.assertNotNull(vectorAccumulator14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix16);
        org.junit.Assert.assertNotNull(cCSMatrix22);
        org.junit.Assert.assertNotNull(vectorAccumulator23);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix25);
        org.junit.Assert.assertNotNull(matrix35);
        org.junit.Assert.assertNotNull(matrix36);
        org.junit.Assert.assertNotNull(vector38);
        org.junit.Assert.assertNotNull(cCSMatrix44);
        org.junit.Assert.assertNotNull(vectorAccumulator45);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix47);
        org.junit.Assert.assertNotNull(cCSMatrix53);
        org.junit.Assert.assertNotNull(vectorAccumulator54);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix56);
        org.junit.Assert.assertNotNull(matrix66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertNotNull(matrix68);
        org.junit.Assert.assertNotNull(matrix69);
        org.junit.Assert.assertNotNull(vector71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000" + "'", str72, "1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000");
        org.junit.Assert.assertNotNull(sparseVector73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(vectorIterator76);
        org.junit.Assert.assertNotNull(vectorIterator77);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 10.0d + "'", double78 == 10.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 1.0d + "'", double79 == 1.0d);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray80), "[16, 0, 0, 0, 10, 0, 0, 0, 10, 0, 0, 0, 0, 63, -16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 63, -16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 63, -16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 63, -16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 63, -16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 63, -16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 63, -16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 63, -16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 63, -16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 63, -16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(matrixVectorOperation81);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        java.util.Random random1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix2 = org.la4j.Matrix.randomSymmetric((int) (short) 10, random1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.la4j.operation.ooplace.OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatricesMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix3 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator4 = cCSMatrix3.nonZeroColumnMajorIterator();
        org.la4j.Matrix matrix5 = cCSMatrix3.transpose();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix8 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean9 = cCSMatrix8.isRowMajor();
        org.la4j.Matrix matrix10 = cCSMatrix8.transpose();
        ooPlaceMatricesMultiplication0.ensureApplicableTo((org.la4j.Matrix) cCSMatrix3, matrix10);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix14 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double15 = columnMajorSparseMatrix14.determinant();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory16 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix17 = columnMajorSparseMatrix14.to(basic1DMatrixMatrixFactory16);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition18 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix21 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double22 = cRSMatrix21.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix26 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix27 = rowMajorSparseMatrix26.removeLastRow();
        org.la4j.Matrix matrix28 = ooPlaceMatricesAddition18.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix21, rowMajorSparseMatrix26);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition29 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix32 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double33 = cRSMatrix32.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix37 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix38 = rowMajorSparseMatrix37.removeLastRow();
        org.la4j.Matrix matrix39 = ooPlaceMatricesAddition29.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix32, rowMajorSparseMatrix37);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix42 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.matrix.DenseMatrix denseMatrix44 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix45 = ooPlaceMatricesAddition29.apply(columnMajorSparseMatrix42, denseMatrix44);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix49 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix50 = rowMajorSparseMatrix49.removeLastRow();
        double double54 = rowMajorSparseMatrix49.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        org.la4j.Vector vector55 = rowMajorSparseMatrix49.toRowVector();
        org.la4j.Matrix matrix56 = ooPlaceMatricesAddition18.apply(denseMatrix44, rowMajorSparseMatrix49);
        org.la4j.matrix.SparseMatrix sparseMatrix57 = denseMatrix44.toSparseMatrix();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix58 = denseMatrix44.toRowMajorSparseMatrix();
        org.la4j.Matrix matrix59 = ooPlaceMatricesMultiplication0.apply(columnMajorSparseMatrix14, rowMajorSparseMatrix58);
        org.la4j.operation.ooplace.OoPlaceKroneckerProduct ooPlaceKroneckerProduct60 = new org.la4j.operation.ooplace.OoPlaceKroneckerProduct();
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix63 = org.la4j.matrix.dense.Basic1DMatrix.unit((int) (byte) 10, (int) (byte) 0);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix66 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double67 = cRSMatrix66.min();
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator68 = cRSMatrix66.nonZeroRowMajorIterator();
        org.la4j.decomposition.RawLUDecompositor rawLUDecompositor69 = new org.la4j.decomposition.RawLUDecompositor((org.la4j.Matrix) cRSMatrix66);
        org.la4j.Matrix matrix70 = ooPlaceKroneckerProduct60.apply((org.la4j.matrix.DenseMatrix) basic1DMatrix63, (org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix66);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix72 = org.la4j.matrix.RowMajorSparseMatrix.fromCSV("");
        org.la4j.Matrix matrix73 = ooPlaceMatricesMultiplication0.apply((org.la4j.matrix.DenseMatrix) basic1DMatrix63, rowMajorSparseMatrix72);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix75 = org.la4j.matrix.RowMajorSparseMatrix.fromCSV("0,000 0,000 0,000 0,000 0,000\n0,000 0,000 0,000 0,000 0,000\n0,000 0,000 0,000 0,000 0,000\n0,000 0,000 0,000 0,000 0,000\n0,000 0,000 0,000 0,000 0,000\n");
        org.la4j.Matrix matrix76 = null;
        // The following exception was thrown during execution in test generation
        try {
            ooPlaceMatricesMultiplication0.ensureApplicableTo((org.la4j.Matrix) rowMajorSparseMatrix75, matrix76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix3);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator4);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(cCSMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory16);
        org.junit.Assert.assertNotNull(basic1DMatrix17);
        org.junit.Assert.assertNotNull(cRSMatrix21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix26);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertNotNull(cRSMatrix32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix37);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix42);
        org.junit.Assert.assertNotNull(denseMatrix44);
        org.junit.Assert.assertNotNull(matrix45);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix49);
        org.junit.Assert.assertNotNull(matrix50);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertNotNull(vector55);
        org.junit.Assert.assertNotNull(matrix56);
        org.junit.Assert.assertNotNull(sparseMatrix57);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix58);
        org.junit.Assert.assertNotNull(matrix59);
        org.junit.Assert.assertNotNull(basic1DMatrix63);
        org.junit.Assert.assertNotNull(cRSMatrix66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator68);
        org.junit.Assert.assertNotNull(matrix70);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix72);
        org.junit.Assert.assertNotNull(matrix73);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix75);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix2 = org.la4j.matrix.dense.Basic2DMatrix.zero(0, (int) 'a');
        org.junit.Assert.assertNotNull(basic2DMatrix2);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = new org.la4j.matrix.sparse.CCSMatrix(5, (int) (byte) 1);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation0 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray7 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray14 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray21 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray28 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray35 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray36 = new double[][] { doubleArray7, doubleArray14, doubleArray21, doubleArray28, doubleArray35 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix37 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray36);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation38 = matrixMatrixMatrixOperation0.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix37);
        java.util.Spliterator<java.lang.Double> doubleSpliterator39 = basic2DMatrix37.spliterator();
        org.la4j.Vector vector40 = basic2DMatrix37.toRowVector();
        double[][] doubleArray41 = basic2DMatrix37.toArray();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix42 = org.la4j.matrix.sparse.CRSMatrix.from2DArray(doubleArray41);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix43 = org.la4j.matrix.sparse.CCSMatrix.from2DArray(doubleArray41);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(basic2DMatrix37);
        org.junit.Assert.assertNotNull(matrixMatrixOperation38);
        org.junit.Assert.assertNotNull(doubleSpliterator39);
        org.junit.Assert.assertNotNull(vector40);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertNotNull(cRSMatrix42);
        org.junit.Assert.assertNotNull(cCSMatrix43);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix3 = org.la4j.matrix.dense.Basic1DMatrix.constant(6, 19, (double) 30);
        org.junit.Assert.assertNotNull(basic1DMatrix3);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(0, (double) (short) 100);
        org.la4j.Matrix matrix5 = cRSMatrix2.blankOfShape(30, (int) (byte) 1);
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction6 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix10 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix11 = rowMajorSparseMatrix10.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix13 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix14 = ooPlaceMatricesSubtraction6.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix10, denseMatrix13);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix17 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double18 = columnMajorSparseMatrix17.determinant();
        org.la4j.matrix.DenseMatrix denseMatrix21 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        double double22 = denseMatrix21.min();
        double double23 = denseMatrix21.sum();
        org.la4j.Matrix matrix24 = ooPlaceMatricesSubtraction6.apply(columnMajorSparseMatrix17, denseMatrix21);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix27 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator28 = cRSMatrix27.nonZeroIterator();
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation29 = ooPlaceMatricesSubtraction6.partiallyApply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix27);
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction30 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix34 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix35 = rowMajorSparseMatrix34.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix37 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix38 = ooPlaceMatricesSubtraction30.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix34, denseMatrix37);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix41 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double42 = columnMajorSparseMatrix41.determinant();
        org.la4j.matrix.DenseMatrix denseMatrix45 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        double double46 = denseMatrix45.min();
        double double47 = denseMatrix45.sum();
        org.la4j.Matrix matrix48 = ooPlaceMatricesSubtraction30.apply(columnMajorSparseMatrix41, denseMatrix45);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix51 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator52 = cRSMatrix51.nonZeroIterator();
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation53 = ooPlaceMatricesSubtraction30.partiallyApply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix51);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix54 = cRSMatrix2.apply((org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix>) ooPlaceMatricesSubtraction6, (org.la4j.Matrix) cRSMatrix51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given matrices should have the same shape: 0x0 does not equal to 10x10.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix10);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(denseMatrix13);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(denseMatrix21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + Double.POSITIVE_INFINITY + "'", double22 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(matrix24);
        org.junit.Assert.assertNotNull(cRSMatrix27);
        org.junit.Assert.assertNotNull(matrixIterator28);
        org.junit.Assert.assertNotNull(matrixMatrixOperation29);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix34);
        org.junit.Assert.assertNotNull(matrix35);
        org.junit.Assert.assertNotNull(denseMatrix37);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(denseMatrix45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + Double.POSITIVE_INFINITY + "'", double46 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(matrix48);
        org.junit.Assert.assertNotNull(cRSMatrix51);
        org.junit.Assert.assertNotNull(matrixIterator52);
        org.junit.Assert.assertNotNull(matrixMatrixOperation53);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double7 = rowMajorSparseMatrix3.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.iterator.VectorIterator vectorIterator9 = rowMajorSparseMatrix3.nonZeroIteratorOfRow((int) (byte) 0);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix12 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator13 = cRSMatrix12.nonZeroIterator();
        org.la4j.Vector vector15 = cRSMatrix12.getColumn(100);
        boolean boolean18 = cRSMatrix12.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator20 = cRSMatrix12.nonZeroIteratorOfColumn((-1));
        org.la4j.iterator.VectorIterator vectorIterator21 = vectorIterator9.orElseSubtract(vectorIterator20);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(vectorIterator9);
        org.junit.Assert.assertNotNull(cRSMatrix12);
        org.junit.Assert.assertNotNull(matrixIterator13);
        org.junit.Assert.assertNotNull(vector15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(vectorIterator20);
        org.junit.Assert.assertNotNull(vectorIterator21);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix2 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator3 = columnMajorSparseMatrix2.nonZeroIterator();
        org.la4j.iterator.MatrixIterator matrixIterator4 = columnMajorSparseMatrix2.nonZeroIterator();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix8 = new org.la4j.matrix.sparse.CCSMatrix((int) (byte) 1, (int) (byte) 0);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix12 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix13 = rowMajorSparseMatrix12.removeLastRow();
        org.la4j.matrix.functor.MatrixFunction matrixFunction15 = null;
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator16 = org.la4j.Matrices.asSumFunctionAccumulator((double) (-1), matrixFunction15);
        double double17 = matrix13.fold(matrixAccumulator16);
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure18 = org.la4j.Matrices.asAccumulatorProcedure(matrixAccumulator16);
        cCSMatrix8.eachNonZero(matrixProcedure18);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix23 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator24 = columnMajorSparseMatrix23.nonZeroIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix29 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double33 = rowMajorSparseMatrix29.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix34 = rowMajorSparseMatrix29.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate35 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean36 = sparseMatrix34.is(advancedMatrixPredicate35);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator38 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double39 = sparseMatrix34.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator38);
        org.la4j.vector.functor.VectorProcedure vectorProcedure40 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator38);
        columnMajorSparseMatrix23.eachNonZeroInRow((-1), vectorProcedure40);
        vectorProcedure40.apply(10, (double) (byte) 100);
        cCSMatrix8.eachNonZeroInRow((int) '4', vectorProcedure40);
        // The following exception was thrown during execution in test generation
        try {
            columnMajorSparseMatrix2.eachInRow((int) (byte) 10, vectorProcedure40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Row '10' is invalid.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix2);
        org.junit.Assert.assertNotNull(matrixIterator3);
        org.junit.Assert.assertNotNull(matrixIterator4);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix12);
        org.junit.Assert.assertNotNull(matrix13);
        org.junit.Assert.assertNotNull(matrixAccumulator16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(matrixProcedure18);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix23);
        org.junit.Assert.assertNotNull(matrixIterator24);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix29);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix34);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(vectorAccumulator38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(vectorProcedure40);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix0 = new org.la4j.matrix.sparse.CRSMatrix();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix3 = new org.la4j.matrix.sparse.CCSMatrix((int) (byte) 1, (int) (byte) 0);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix7 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix8 = rowMajorSparseMatrix7.removeLastRow();
        org.la4j.matrix.functor.MatrixFunction matrixFunction10 = null;
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator11 = org.la4j.Matrices.asSumFunctionAccumulator((double) (-1), matrixFunction10);
        double double12 = matrix8.fold(matrixAccumulator11);
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure13 = org.la4j.Matrices.asAccumulatorProcedure(matrixAccumulator11);
        cCSMatrix3.eachNonZero(matrixProcedure13);
        cRSMatrix0.eachNonZero(matrixProcedure13);
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator16 = cRSMatrix0.nonZeroRowMajorIterator();
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix7);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(matrixAccumulator11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(matrixProcedure13);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator16);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.la4j.vector.dense.BasicVector basicVector2 = org.la4j.vector.dense.BasicVector.constant((int) (byte) 1, (double) 100.0f);
        org.la4j.Vector vector4 = basicVector2.multiply((double) 0.0f);
        org.la4j.Matrix matrix5 = basicVector2.toRowMatrix();
        org.junit.Assert.assertNotNull(basicVector2);
        org.junit.Assert.assertNotNull(vector4);
        org.junit.Assert.assertNotNull(matrix5);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.sparse.CRSMatrix cRSMatrix1 = org.la4j.matrix.sparse.CRSMatrix.fromCSV("la4j");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"la4j\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.diagonal(0, (double) (byte) 0);
        cCSMatrix2.setAll((double) (short) 100);
        org.junit.Assert.assertNotNull(cCSMatrix2);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double4 = cRSMatrix3.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix8 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix9 = rowMajorSparseMatrix8.removeLastRow();
        org.la4j.Matrix matrix10 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, rowMajorSparseMatrix8);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition11 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix14 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double15 = cRSMatrix14.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix19 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix20 = rowMajorSparseMatrix19.removeLastRow();
        org.la4j.Matrix matrix21 = ooPlaceMatricesAddition11.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix14, rowMajorSparseMatrix19);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix24 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.matrix.DenseMatrix denseMatrix26 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix27 = ooPlaceMatricesAddition11.apply(columnMajorSparseMatrix24, denseMatrix26);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix31 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix32 = rowMajorSparseMatrix31.removeLastRow();
        double double36 = rowMajorSparseMatrix31.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        org.la4j.Vector vector37 = rowMajorSparseMatrix31.toRowVector();
        org.la4j.Matrix matrix38 = ooPlaceMatricesAddition0.apply(denseMatrix26, rowMajorSparseMatrix31);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix41 = org.la4j.matrix.RowMajorSparseMatrix.zero(0, (int) (short) 10);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix44 = new org.la4j.matrix.sparse.CCSMatrix((int) (byte) 1, (int) (byte) 0);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix48 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix49 = rowMajorSparseMatrix48.removeLastRow();
        org.la4j.matrix.functor.MatrixFunction matrixFunction51 = null;
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator52 = org.la4j.Matrices.asSumFunctionAccumulator((double) (-1), matrixFunction51);
        double double53 = matrix49.fold(matrixAccumulator52);
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure54 = org.la4j.Matrices.asAccumulatorProcedure(matrixAccumulator52);
        cCSMatrix44.eachNonZero(matrixProcedure54);
        org.la4j.Matrix matrix56 = ooPlaceMatricesAddition0.applySymmetric(rowMajorSparseMatrix41, (org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix44);
        double double57 = cCSMatrix44.max();
        // The following exception was thrown during execution in test generation
        try {
            double double59 = cCSMatrix44.minInColumn(30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 30");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cRSMatrix3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(cRSMatrix14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix19);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix24);
        org.junit.Assert.assertNotNull(denseMatrix26);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix31);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(vector37);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix41);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix48);
        org.junit.Assert.assertNotNull(matrix49);
        org.junit.Assert.assertNotNull(matrixAccumulator52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertNotNull(matrixProcedure54);
        org.junit.Assert.assertNotNull(matrix56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double4 = cRSMatrix3.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix8 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix9 = rowMajorSparseMatrix8.removeLastRow();
        org.la4j.Matrix matrix10 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, rowMajorSparseMatrix8);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition11 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix14 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double15 = cRSMatrix14.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix19 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix20 = rowMajorSparseMatrix19.removeLastRow();
        org.la4j.Matrix matrix21 = ooPlaceMatricesAddition11.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix14, rowMajorSparseMatrix19);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix24 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.matrix.DenseMatrix denseMatrix26 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix27 = ooPlaceMatricesAddition11.apply(columnMajorSparseMatrix24, denseMatrix26);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix31 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix32 = rowMajorSparseMatrix31.removeLastRow();
        double double36 = rowMajorSparseMatrix31.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        org.la4j.Vector vector37 = rowMajorSparseMatrix31.toRowVector();
        org.la4j.Matrix matrix38 = ooPlaceMatricesAddition0.apply(denseMatrix26, rowMajorSparseMatrix31);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix41 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        double double44 = cCSMatrix41.get((int) (byte) 0, (int) (short) 1);
        org.la4j.vector.functor.VectorFunction vectorFunction46 = org.la4j.Vectors.DEC_FUNCTION;
        org.la4j.Matrix matrix47 = cCSMatrix41.transformRow(10, vectorFunction46);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix50 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator51 = cRSMatrix50.nonZeroIterator();
        org.la4j.Vector vector53 = cRSMatrix50.getColumn(100);
        boolean boolean56 = cRSMatrix50.nonZeroAt(1, (int) (short) 0);
        org.la4j.decomposition.RawLUDecompositor rawLUDecompositor57 = new org.la4j.decomposition.RawLUDecompositor((org.la4j.Matrix) cRSMatrix50);
        org.la4j.Matrix matrix58 = ooPlaceMatricesAddition0.applySymmetric((org.la4j.matrix.SparseMatrix) cCSMatrix41, (org.la4j.matrix.SparseMatrix) cRSMatrix50);
        double double59 = cRSMatrix50.manhattanNorm();
        java.util.Iterator<java.lang.Integer> intItor60 = cRSMatrix50.iteratorOfNonZeroRows();
        org.junit.Assert.assertNotNull(cRSMatrix3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(cRSMatrix14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix19);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix24);
        org.junit.Assert.assertNotNull(denseMatrix26);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix31);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(vector37);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(cCSMatrix41);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(vectorFunction46);
        org.junit.Assert.assertNotNull(matrix47);
        org.junit.Assert.assertNotNull(cRSMatrix50);
        org.junit.Assert.assertNotNull(matrixIterator51);
        org.junit.Assert.assertNotNull(vector53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(matrix58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 100.0d + "'", double59 == 100.0d);
        org.junit.Assert.assertNotNull(intItor60);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.la4j.operation.ooplace.OoPlaceKroneckerProduct ooPlaceKroneckerProduct0 = new org.la4j.operation.ooplace.OoPlaceKroneckerProduct();
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction1 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix5 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix6 = rowMajorSparseMatrix5.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix8 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix9 = ooPlaceMatricesSubtraction1.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix5, denseMatrix8);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix12 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double13 = columnMajorSparseMatrix12.determinant();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory14 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix15 = columnMajorSparseMatrix12.to(basic1DMatrixMatrixFactory14);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix19 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix20 = rowMajorSparseMatrix19.removeLastRow();
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure21 = null;
        rowMajorSparseMatrix19.eachNonZero(matrixProcedure21);
        org.la4j.Matrix matrix23 = ooPlaceMatricesSubtraction1.applySimple((org.la4j.matrix.DenseMatrix) basic1DMatrix15, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix19);
        org.la4j.Matrix matrix24 = basic1DMatrix15.shuffle();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix27 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator28 = cRSMatrix27.nonZeroIterator();
        org.la4j.Vector vector30 = cRSMatrix27.getColumn(100);
        boolean boolean33 = cRSMatrix27.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator35 = cRSMatrix27.nonZeroIteratorOfColumn((-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix36 = cRSMatrix27.toRowMajorSparseMatrix();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory37 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix38 = cRSMatrix27.to(basic1DMatrixMatrixFactory37);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix39 = matrix24.to(basic1DMatrixMatrixFactory37);
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation40 = org.la4j.LinearAlgebra.OO_PLACE_MATRICES_MULTIPLICATION;
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix43 = org.la4j.matrix.ColumnMajorSparseMatrix.diagonal((int) (byte) 10, (double) 0L);
        org.la4j.decomposition.QRDecompositor qRDecompositor44 = new org.la4j.decomposition.QRDecompositor((org.la4j.Matrix) columnMajorSparseMatrix43);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation45 = matrixMatrixMatrixOperation40.partiallyApply(columnMajorSparseMatrix43);
        org.la4j.matrix.functor.MatrixFunction matrixFunction47 = org.la4j.Matrices.DEC_FUNCTION;
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator48 = org.la4j.Matrices.asSumFunctionAccumulator((double) (short) -1, matrixFunction47);
        double double49 = columnMajorSparseMatrix43.foldNonZero(matrixAccumulator48);
        org.la4j.Matrix matrix50 = ooPlaceKroneckerProduct0.apply((org.la4j.matrix.DenseMatrix) basic1DMatrix39, columnMajorSparseMatrix43);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition51 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix54 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double55 = cRSMatrix54.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix59 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix60 = rowMajorSparseMatrix59.removeLastRow();
        org.la4j.Matrix matrix61 = ooPlaceMatricesAddition51.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix54, rowMajorSparseMatrix59);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix64 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.matrix.DenseMatrix denseMatrix66 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix67 = ooPlaceMatricesAddition51.apply(columnMajorSparseMatrix64, denseMatrix66);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix70 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator71 = cRSMatrix70.nonZeroIterator();
        org.la4j.Vector vector73 = cRSMatrix70.getColumn(100);
        boolean boolean76 = cRSMatrix70.nonZeroAt(1, (int) (short) 0);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix79 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator80 = cRSMatrix79.nonZeroIterator();
        org.la4j.Vector vector82 = cRSMatrix79.getColumn(100);
        boolean boolean85 = cRSMatrix79.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator87 = cRSMatrix79.nonZeroIteratorOfColumn((-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix88 = cRSMatrix79.toRowMajorSparseMatrix();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory89 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix90 = cRSMatrix79.to(basic1DMatrixMatrixFactory89);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix91 = cRSMatrix70.to(basic1DMatrixMatrixFactory89);
        org.la4j.Matrix matrix94 = basic1DMatrix91.copyOfShape(0, (int) (short) 10);
        org.la4j.Matrix matrix95 = ooPlaceKroneckerProduct0.apply(columnMajorSparseMatrix64, (org.la4j.matrix.DenseMatrix) basic1DMatrix91);
        org.la4j.Vector vector97 = basic1DMatrix91.getRow((int) (byte) 0);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix5);
        org.junit.Assert.assertNotNull(matrix6);
        org.junit.Assert.assertNotNull(denseMatrix8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory14);
        org.junit.Assert.assertNotNull(basic1DMatrix15);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix19);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix23);
        org.junit.Assert.assertNotNull(matrix24);
        org.junit.Assert.assertNotNull(cRSMatrix27);
        org.junit.Assert.assertNotNull(matrixIterator28);
        org.junit.Assert.assertNotNull(vector30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(vectorIterator35);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix36);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory37);
        org.junit.Assert.assertNotNull(basic1DMatrix38);
        org.junit.Assert.assertNotNull(basic1DMatrix39);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation40);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix43);
        org.junit.Assert.assertNotNull(matrixMatrixOperation45);
        org.junit.Assert.assertNotNull(matrixFunction47);
        org.junit.Assert.assertNotNull(matrixAccumulator48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-11.0d) + "'", double49 == (-11.0d));
        org.junit.Assert.assertNotNull(matrix50);
        org.junit.Assert.assertNotNull(cRSMatrix54);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix59);
        org.junit.Assert.assertNotNull(matrix60);
        org.junit.Assert.assertNotNull(matrix61);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix64);
        org.junit.Assert.assertNotNull(denseMatrix66);
        org.junit.Assert.assertNotNull(matrix67);
        org.junit.Assert.assertNotNull(cRSMatrix70);
        org.junit.Assert.assertNotNull(matrixIterator71);
        org.junit.Assert.assertNotNull(vector73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(cRSMatrix79);
        org.junit.Assert.assertNotNull(matrixIterator80);
        org.junit.Assert.assertNotNull(vector82);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(vectorIterator87);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix88);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory89);
        org.junit.Assert.assertNotNull(basic1DMatrix90);
        org.junit.Assert.assertNotNull(basic1DMatrix91);
        org.junit.Assert.assertNotNull(matrix94);
        org.junit.Assert.assertNotNull(matrix95);
        org.junit.Assert.assertNotNull(vector97);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.la4j.operation.ooplace.OoPlaceKroneckerProduct ooPlaceKroneckerProduct0 = new org.la4j.operation.ooplace.OoPlaceKroneckerProduct();
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix3 = org.la4j.matrix.dense.Basic1DMatrix.unit((int) (byte) 10, (int) (byte) 0);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix6 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double7 = cRSMatrix6.min();
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator8 = cRSMatrix6.nonZeroRowMajorIterator();
        org.la4j.decomposition.RawLUDecompositor rawLUDecompositor9 = new org.la4j.decomposition.RawLUDecompositor((org.la4j.Matrix) cRSMatrix6);
        org.la4j.Matrix matrix10 = ooPlaceKroneckerProduct0.apply((org.la4j.matrix.DenseMatrix) basic1DMatrix3, (org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix6);
        org.la4j.matrix.DenseMatrix denseMatrix13 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix15 = org.la4j.matrix.dense.Basic1DMatrix.fromCSV("");
        org.la4j.Matrix matrix18 = basic1DMatrix15.blankOfShape(52, (int) (byte) 10);
        org.la4j.Matrix matrix19 = ooPlaceKroneckerProduct0.apply(denseMatrix13, (org.la4j.matrix.DenseMatrix) basic1DMatrix15);
        org.la4j.matrix.DenseMatrix denseMatrix22 = org.la4j.matrix.DenseMatrix.zero((int) '#', 30);
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction23 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix26 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean27 = cCSMatrix26.isRowMajor();
        org.la4j.Matrix matrix30 = cCSMatrix26.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator31 = cCSMatrix26.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix35 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix37 = rowMajorSparseMatrix35.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix41 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double45 = rowMajorSparseMatrix41.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix46 = rowMajorSparseMatrix41.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct47 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean48 = sparseMatrix46.equals((java.lang.Object) ooPlaceOuterProduct47);
        org.la4j.Matrix matrix49 = rowMajorSparseMatrix35.hadamardProduct((org.la4j.Matrix) sparseMatrix46);
        org.la4j.Matrix matrix50 = ooPlaceMatricesSubtraction23.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix26, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix35);
        org.la4j.Matrix matrix51 = ooPlaceKroneckerProduct0.apply(denseMatrix22, (org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix26);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix54 = new org.la4j.matrix.sparse.CCSMatrix((int) (byte) 1, (int) (byte) 0);
        int int55 = cCSMatrix54.cardinality();
        byte[] byteArray56 = cCSMatrix54.toBinary();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix59 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator60 = cCSMatrix59.nonZeroColumnMajorIterator();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix63 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator64 = cRSMatrix63.nonZeroIterator();
        org.la4j.Vector vector66 = cRSMatrix63.getColumn(100);
        boolean boolean69 = cRSMatrix63.nonZeroAt(1, (int) (short) 0);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix72 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator73 = cRSMatrix72.nonZeroIterator();
        org.la4j.Vector vector75 = cRSMatrix72.getColumn(100);
        boolean boolean78 = cRSMatrix72.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator80 = cRSMatrix72.nonZeroIteratorOfColumn((-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix81 = cRSMatrix72.toRowMajorSparseMatrix();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory82 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix83 = cRSMatrix72.to(basic1DMatrixMatrixFactory82);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix84 = cRSMatrix63.to(basic1DMatrixMatrixFactory82);
        java.lang.Class<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixClass85 = basic1DMatrixMatrixFactory82.outputClass;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix86 = cCSMatrix59.to(basic1DMatrixMatrixFactory82);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix87 = cCSMatrix54.to(basic1DMatrixMatrixFactory82);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix90 = org.la4j.matrix.sparse.CRSMatrix.diagonal(0, (double) (short) 100);
        double double91 = cRSMatrix90.product();
        org.la4j.Matrix matrix92 = ooPlaceKroneckerProduct0.applyCommon((org.la4j.Matrix) basic1DMatrix87, (org.la4j.Matrix) cRSMatrix90);
        org.junit.Assert.assertNotNull(basic1DMatrix3);
        org.junit.Assert.assertNotNull(cRSMatrix6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator8);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(denseMatrix13);
        org.junit.Assert.assertNotNull(basic1DMatrix15);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertNotNull(matrix19);
        org.junit.Assert.assertNotNull(denseMatrix22);
        org.junit.Assert.assertNotNull(cCSMatrix26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(matrix30);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator31);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix35);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix41);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(matrix49);
        org.junit.Assert.assertNotNull(matrix50);
        org.junit.Assert.assertNotNull(matrix51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[48, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(cCSMatrix59);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator60);
        org.junit.Assert.assertNotNull(cRSMatrix63);
        org.junit.Assert.assertNotNull(matrixIterator64);
        org.junit.Assert.assertNotNull(vector66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(cRSMatrix72);
        org.junit.Assert.assertNotNull(matrixIterator73);
        org.junit.Assert.assertNotNull(vector75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(vectorIterator80);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix81);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory82);
        org.junit.Assert.assertNotNull(basic1DMatrix83);
        org.junit.Assert.assertNotNull(basic1DMatrix84);
        org.junit.Assert.assertNotNull(basic1DMatrixClass85);
        org.junit.Assert.assertNotNull(basic1DMatrix86);
        org.junit.Assert.assertNotNull(basic1DMatrix87);
        org.junit.Assert.assertNotNull(cRSMatrix90);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 1.0d + "'", double91 == 1.0d);
        org.junit.Assert.assertNotNull(matrix92);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.la4j.operation.ooplace.OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatricesMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix3 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator4 = cCSMatrix3.nonZeroColumnMajorIterator();
        org.la4j.Matrix matrix5 = cCSMatrix3.transpose();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix8 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean9 = cCSMatrix8.isRowMajor();
        org.la4j.Matrix matrix10 = cCSMatrix8.transpose();
        ooPlaceMatricesMultiplication0.ensureApplicableTo((org.la4j.Matrix) cCSMatrix3, matrix10);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix14 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double15 = columnMajorSparseMatrix14.determinant();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory16 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix17 = columnMajorSparseMatrix14.to(basic1DMatrixMatrixFactory16);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition18 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix21 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double22 = cRSMatrix21.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix26 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix27 = rowMajorSparseMatrix26.removeLastRow();
        org.la4j.Matrix matrix28 = ooPlaceMatricesAddition18.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix21, rowMajorSparseMatrix26);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition29 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix32 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double33 = cRSMatrix32.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix37 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix38 = rowMajorSparseMatrix37.removeLastRow();
        org.la4j.Matrix matrix39 = ooPlaceMatricesAddition29.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix32, rowMajorSparseMatrix37);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix42 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.matrix.DenseMatrix denseMatrix44 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix45 = ooPlaceMatricesAddition29.apply(columnMajorSparseMatrix42, denseMatrix44);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix49 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix50 = rowMajorSparseMatrix49.removeLastRow();
        double double54 = rowMajorSparseMatrix49.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        org.la4j.Vector vector55 = rowMajorSparseMatrix49.toRowVector();
        org.la4j.Matrix matrix56 = ooPlaceMatricesAddition18.apply(denseMatrix44, rowMajorSparseMatrix49);
        org.la4j.matrix.SparseMatrix sparseMatrix57 = denseMatrix44.toSparseMatrix();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix58 = denseMatrix44.toRowMajorSparseMatrix();
        org.la4j.Matrix matrix59 = ooPlaceMatricesMultiplication0.apply(columnMajorSparseMatrix14, rowMajorSparseMatrix58);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix60 = new org.la4j.matrix.sparse.CRSMatrix();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix63 = new org.la4j.matrix.sparse.CCSMatrix((int) (byte) 1, (int) (byte) 0);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix67 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix68 = rowMajorSparseMatrix67.removeLastRow();
        org.la4j.matrix.functor.MatrixFunction matrixFunction70 = null;
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator71 = org.la4j.Matrices.asSumFunctionAccumulator((double) (-1), matrixFunction70);
        double double72 = matrix68.fold(matrixAccumulator71);
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure73 = org.la4j.Matrices.asAccumulatorProcedure(matrixAccumulator71);
        cCSMatrix63.eachNonZero(matrixProcedure73);
        cRSMatrix60.eachNonZero(matrixProcedure73);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix78 = org.la4j.matrix.dense.Basic1DMatrix.unit((int) (byte) 10, (int) (byte) 0);
        double[][] doubleArray79 = basic1DMatrix78.toArray();
        org.la4j.Matrix matrix80 = ooPlaceMatricesMultiplication0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix60, (org.la4j.matrix.DenseMatrix) basic1DMatrix78);
        java.text.NumberFormat numberFormat81 = null;
        java.lang.String str82 = cRSMatrix60.toMatrixMarket(numberFormat81);
        org.junit.Assert.assertNotNull(cCSMatrix3);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator4);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(cCSMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory16);
        org.junit.Assert.assertNotNull(basic1DMatrix17);
        org.junit.Assert.assertNotNull(cRSMatrix21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix26);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertNotNull(cRSMatrix32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix37);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix42);
        org.junit.Assert.assertNotNull(denseMatrix44);
        org.junit.Assert.assertNotNull(matrix45);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix49);
        org.junit.Assert.assertNotNull(matrix50);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertNotNull(vector55);
        org.junit.Assert.assertNotNull(matrix56);
        org.junit.Assert.assertNotNull(sparseMatrix57);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix58);
        org.junit.Assert.assertNotNull(matrix59);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix67);
        org.junit.Assert.assertNotNull(matrix68);
        org.junit.Assert.assertNotNull(matrixAccumulator71);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-1.0d) + "'", double72 == (-1.0d));
        org.junit.Assert.assertNotNull(matrixProcedure73);
        org.junit.Assert.assertNotNull(basic1DMatrix78);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertNotNull(matrix80);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "%%MatrixMarket matrix coordinate real general row-major\n0 0 0\n" + "'", str82, "%%MatrixMarket matrix coordinate real general row-major\n0 0 0\n");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct0 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix3 = org.la4j.matrix.dense.Basic2DMatrix.unit((int) (byte) 1, (int) '4');
        java.lang.String str4 = basic2DMatrix3.toCSV();
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition5 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix8 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double9 = cRSMatrix8.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix13 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix14 = rowMajorSparseMatrix13.removeLastRow();
        org.la4j.Matrix matrix15 = ooPlaceMatricesAddition5.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix8, rowMajorSparseMatrix13);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix18 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.matrix.DenseMatrix denseMatrix20 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix21 = ooPlaceMatricesAddition5.apply(columnMajorSparseMatrix18, denseMatrix20);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix24 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        byte[] byteArray25 = columnMajorSparseMatrix24.toBinary();
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation26 = ooPlaceMatricesAddition5.partiallyApply(columnMajorSparseMatrix24);
        org.la4j.Matrix matrix27 = ooPlaceMatrixHadamardProduct0.apply((org.la4j.matrix.DenseMatrix) basic2DMatrix3, columnMajorSparseMatrix24);
        org.la4j.Vector vector29 = columnMajorSparseMatrix24.getRow((int) (short) 10);
        org.la4j.Matrix matrix30 = vector29.toRowMatrix();
        org.junit.Assert.assertNotNull(basic2DMatrix3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000\n" + "'", str4, "1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000\n");
        org.junit.Assert.assertNotNull(cRSMatrix8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix13);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix18);
        org.junit.Assert.assertNotNull(denseMatrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[48, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(matrixMatrixOperation26);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(vector29);
        org.junit.Assert.assertNotNull(matrix30);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.la4j.operation.ooplace.OoPlaceKroneckerProduct ooPlaceKroneckerProduct0 = new org.la4j.operation.ooplace.OoPlaceKroneckerProduct();
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix3 = org.la4j.matrix.dense.Basic1DMatrix.unit((int) (byte) 10, (int) (byte) 0);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix6 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double7 = cRSMatrix6.min();
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator8 = cRSMatrix6.nonZeroRowMajorIterator();
        org.la4j.decomposition.RawLUDecompositor rawLUDecompositor9 = new org.la4j.decomposition.RawLUDecompositor((org.la4j.Matrix) cRSMatrix6);
        org.la4j.Matrix matrix10 = ooPlaceKroneckerProduct0.apply((org.la4j.matrix.DenseMatrix) basic1DMatrix3, (org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix6);
        org.la4j.matrix.DenseMatrix denseMatrix13 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix15 = org.la4j.matrix.dense.Basic1DMatrix.fromCSV("");
        org.la4j.Matrix matrix18 = basic1DMatrix15.blankOfShape(52, (int) (byte) 10);
        org.la4j.Matrix matrix19 = ooPlaceKroneckerProduct0.apply(denseMatrix13, (org.la4j.matrix.DenseMatrix) basic1DMatrix15);
        org.la4j.matrix.DenseMatrix denseMatrix22 = org.la4j.matrix.DenseMatrix.zero((int) '#', 30);
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction23 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix26 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean27 = cCSMatrix26.isRowMajor();
        org.la4j.Matrix matrix30 = cCSMatrix26.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator31 = cCSMatrix26.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix35 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix37 = rowMajorSparseMatrix35.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix41 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double45 = rowMajorSparseMatrix41.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix46 = rowMajorSparseMatrix41.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct47 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean48 = sparseMatrix46.equals((java.lang.Object) ooPlaceOuterProduct47);
        org.la4j.Matrix matrix49 = rowMajorSparseMatrix35.hadamardProduct((org.la4j.Matrix) sparseMatrix46);
        org.la4j.Matrix matrix50 = ooPlaceMatricesSubtraction23.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix26, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix35);
        org.la4j.Matrix matrix51 = ooPlaceKroneckerProduct0.apply(denseMatrix22, (org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix26);
        denseMatrix22.setRow((int) (short) 10, (double) 'a');
        org.junit.Assert.assertNotNull(basic1DMatrix3);
        org.junit.Assert.assertNotNull(cRSMatrix6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator8);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(denseMatrix13);
        org.junit.Assert.assertNotNull(basic1DMatrix15);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertNotNull(matrix19);
        org.junit.Assert.assertNotNull(denseMatrix22);
        org.junit.Assert.assertNotNull(cCSMatrix26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(matrix30);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator31);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix35);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix41);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(matrix49);
        org.junit.Assert.assertNotNull(matrix50);
        org.junit.Assert.assertNotNull(matrix51);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix3 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator4 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray5 = cCSMatrix3.foldRows(vectorAccumulator4);
        org.la4j.Matrix matrix6 = ooPlaceMatrixByItsTransposeMultiplication0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix3);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix9 = org.la4j.matrix.sparse.CRSMatrix.zero(0, (int) (short) 0);
        ooPlaceMatrixByItsTransposeMultiplication0.ensureApplicableTo((org.la4j.Matrix) cRSMatrix9);
        org.junit.Assert.assertNotNull(cCSMatrix3);
        org.junit.Assert.assertNotNull(vectorAccumulator4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(matrix6);
        org.junit.Assert.assertNotNull(cRSMatrix9);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double3 = cRSMatrix2.min();
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator4 = cRSMatrix2.nonZeroRowMajorIterator();
        org.la4j.decomposition.RawLUDecompositor rawLUDecompositor5 = new org.la4j.decomposition.RawLUDecompositor((org.la4j.Matrix) cRSMatrix2);
        double double6 = cRSMatrix2.max();
        org.la4j.vector.functor.VectorFunction vectorFunction9 = org.la4j.Vectors.asPlusFunction((double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            cRSMatrix2.updateColumn((int) (byte) 10, vectorFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Column '10' is invalid.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(vectorFunction9);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix2 = org.la4j.matrix.RowMajorSparseMatrix.zero(5, (int) '4');
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix2);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.la4j.vector.sparse.CompressedVector compressedVector1 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        double double2 = compressedVector1.euclideanNorm();
        org.la4j.Vector vector4 = compressedVector1.blankOfLength(52);
        org.la4j.iterator.VectorIterator vectorIterator5 = vector4.iterator();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix8 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator9 = cRSMatrix8.nonZeroIterator();
        org.la4j.Vector vector11 = cRSMatrix8.getColumn(100);
        boolean boolean14 = cRSMatrix8.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator16 = cRSMatrix8.nonZeroIteratorOfColumn((-1));
        int int17 = vectorIterator16.index();
        org.la4j.iterator.VectorIterator vectorIterator18 = null;
        org.la4j.iterator.VectorIterator vectorIterator19 = vectorIterator16.andAlsoDivide(vectorIterator18);
        org.la4j.iterator.VectorIterator vectorIterator20 = vectorIterator5.orElseAdd(vectorIterator18);
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct21 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix26 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator27 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray28 = cCSMatrix26.foldRows(vectorAccumulator27);
        org.la4j.matrix.DenseMatrix denseMatrix29 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray28);
        org.la4j.vector.dense.BasicVector basicVector30 = new org.la4j.vector.dense.BasicVector(doubleArray28);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix35 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator36 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray37 = cCSMatrix35.foldRows(vectorAccumulator36);
        org.la4j.matrix.DenseMatrix denseMatrix38 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray37);
        org.la4j.vector.dense.BasicVector basicVector39 = new org.la4j.vector.dense.BasicVector(doubleArray37);
        ooPlaceOuterProduct21.ensureApplicableTo((org.la4j.Vector) basicVector30, (org.la4j.Vector) basicVector39);
        org.la4j.vector.sparse.CompressedVector compressedVector42 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector42.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector47 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix48 = ooPlaceOuterProduct21.apply((org.la4j.vector.SparseVector) compressedVector42, (org.la4j.vector.SparseVector) compressedVector47);
        double double49 = compressedVector47.min();
        org.la4j.iterator.VectorIterator vectorIterator50 = compressedVector47.iterator();
        org.la4j.iterator.VectorIterator vectorIterator51 = vectorIterator5.orElseSubtract(vectorIterator50);
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct52 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix57 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator58 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray59 = cCSMatrix57.foldRows(vectorAccumulator58);
        org.la4j.matrix.DenseMatrix denseMatrix60 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray59);
        org.la4j.vector.dense.BasicVector basicVector61 = new org.la4j.vector.dense.BasicVector(doubleArray59);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix66 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator67 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray68 = cCSMatrix66.foldRows(vectorAccumulator67);
        org.la4j.matrix.DenseMatrix denseMatrix69 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray68);
        org.la4j.vector.dense.BasicVector basicVector70 = new org.la4j.vector.dense.BasicVector(doubleArray68);
        ooPlaceOuterProduct52.ensureApplicableTo((org.la4j.Vector) basicVector61, (org.la4j.Vector) basicVector70);
        org.la4j.vector.sparse.CompressedVector compressedVector73 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector73.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector78 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix79 = ooPlaceOuterProduct52.apply((org.la4j.vector.SparseVector) compressedVector73, (org.la4j.vector.SparseVector) compressedVector78);
        double double80 = compressedVector78.min();
        org.la4j.iterator.VectorIterator vectorIterator81 = compressedVector78.iterator();
        org.la4j.iterator.VectorIterator vectorIterator82 = vectorIterator50.orElseAdd(vectorIterator81);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(vector4);
        org.junit.Assert.assertNotNull(vectorIterator5);
        org.junit.Assert.assertNotNull(cRSMatrix8);
        org.junit.Assert.assertNotNull(matrixIterator9);
        org.junit.Assert.assertNotNull(vector11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(vectorIterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(vectorIterator19);
        org.junit.Assert.assertNotNull(vectorIterator20);
        org.junit.Assert.assertNotNull(cCSMatrix26);
        org.junit.Assert.assertNotNull(vectorAccumulator27);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix29);
        org.junit.Assert.assertNotNull(cCSMatrix35);
        org.junit.Assert.assertNotNull(vectorAccumulator36);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix38);
        org.junit.Assert.assertNotNull(matrix48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(vectorIterator50);
        org.junit.Assert.assertNotNull(vectorIterator51);
        org.junit.Assert.assertNotNull(cCSMatrix57);
        org.junit.Assert.assertNotNull(vectorAccumulator58);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix60);
        org.junit.Assert.assertNotNull(cCSMatrix66);
        org.junit.Assert.assertNotNull(vectorAccumulator67);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix69);
        org.junit.Assert.assertNotNull(matrix79);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertNotNull(vectorIterator81);
        org.junit.Assert.assertNotNull(vectorIterator82);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.la4j.operation.VectorVectorOperation<org.la4j.Vector> vectorVectorVectorOperation0 = org.la4j.LinearAlgebra.OO_PLACE_VECTORS_ADDITION;
        org.la4j.vector.DenseVector denseVector1 = null;
        org.la4j.operation.VectorOperation<org.la4j.Vector> vectorVectorOperation2 = vectorVectorVectorOperation0.partiallyApply(denseVector1);
        org.la4j.vector.SparseVector sparseVector3 = null;
        org.la4j.operation.VectorOperation<org.la4j.Vector> vectorVectorOperation4 = vectorVectorVectorOperation0.partiallyApply(sparseVector3);
        org.la4j.Vector vector6 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str7 = vector6.toCSV();
        org.la4j.vector.SparseVector sparseVector8 = vector6.toSparseVector();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix11 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator12 = columnMajorSparseMatrix11.nonZeroIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix17 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double21 = rowMajorSparseMatrix17.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix22 = rowMajorSparseMatrix17.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate23 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean24 = sparseMatrix22.is(advancedMatrixPredicate23);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator26 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double27 = sparseMatrix22.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator26);
        org.la4j.vector.functor.VectorProcedure vectorProcedure28 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator26);
        columnMajorSparseMatrix11.eachNonZeroInRow((-1), vectorProcedure28);
        sparseVector8.each(vectorProcedure28);
        java.lang.Object obj31 = new java.lang.Object();
        boolean boolean32 = sparseVector8.equals(obj31);
        boolean boolean34 = sparseVector8.nonZeroAt((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector35 = vectorVectorOperation4.apply(sparseVector8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorVectorVectorOperation0);
        org.junit.Assert.assertNotNull(vectorVectorOperation2);
        org.junit.Assert.assertNotNull(vectorVectorOperation4);
        org.junit.Assert.assertNotNull(vector6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000" + "'", str7, "1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000");
        org.junit.Assert.assertNotNull(sparseVector8);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix11);
        org.junit.Assert.assertNotNull(matrixIterator12);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix22);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(vectorAccumulator26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(vectorProcedure28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix2 = org.la4j.matrix.dense.Basic2DMatrix.unit((int) (byte) 1, (int) '4');
        double[][] doubleArray3 = basic2DMatrix2.toArray();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix6 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator7 = cRSMatrix6.nonZeroIterator();
        org.la4j.Vector vector9 = cRSMatrix6.getColumn(100);
        boolean boolean12 = cRSMatrix6.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator14 = cRSMatrix6.nonZeroIteratorOfColumn((-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix15 = cRSMatrix6.toRowMajorSparseMatrix();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory16 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix17 = cRSMatrix6.to(basic1DMatrixMatrixFactory16);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix18 = basic2DMatrix2.to(basic1DMatrixMatrixFactory16);
        org.junit.Assert.assertNotNull(basic2DMatrix2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(cRSMatrix6);
        org.junit.Assert.assertNotNull(matrixIterator7);
        org.junit.Assert.assertNotNull(vector9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(vectorIterator14);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix15);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory16);
        org.junit.Assert.assertNotNull(basic1DMatrix17);
        org.junit.Assert.assertNotNull(basic1DMatrix18);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix3 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator4 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray5 = cCSMatrix3.foldRows(vectorAccumulator4);
        org.la4j.Matrix matrix6 = ooPlaceMatrixByItsTransposeMultiplication0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix3);
        double double8 = cCSMatrix3.minInColumn(0);
        org.la4j.iterator.MatrixIterator matrixIterator9 = cCSMatrix3.nonZeroIterator();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix12 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator13 = cRSMatrix12.nonZeroIterator();
        org.la4j.Vector vector15 = cRSMatrix12.getColumn(100);
        boolean boolean18 = cRSMatrix12.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator20 = cRSMatrix12.nonZeroIteratorOfColumn((-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix21 = cRSMatrix12.toRowMajorSparseMatrix();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory22 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix23 = cRSMatrix12.to(basic1DMatrixMatrixFactory22);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix24 = cCSMatrix3.to(basic1DMatrixMatrixFactory22);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix27 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator28 = columnMajorSparseMatrix27.nonZeroIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix33 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double37 = rowMajorSparseMatrix33.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix38 = rowMajorSparseMatrix33.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate39 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean40 = sparseMatrix38.is(advancedMatrixPredicate39);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator42 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double43 = sparseMatrix38.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator42);
        org.la4j.vector.functor.VectorProcedure vectorProcedure44 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator42);
        columnMajorSparseMatrix27.eachNonZeroInRow((-1), vectorProcedure44);
        boolean boolean46 = columnMajorSparseMatrix27.isRowMajor();
        boolean boolean47 = columnMajorSparseMatrix27.isRowMajor();
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator48 = org.la4j.Matrices.mkInfinityNormAccumulator();
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure49 = org.la4j.Matrices.asAccumulatorProcedure(matrixAccumulator48);
        columnMajorSparseMatrix27.each(matrixProcedure49);
        cCSMatrix3.each(matrixProcedure49);
        org.junit.Assert.assertNotNull(cCSMatrix3);
        org.junit.Assert.assertNotNull(vectorAccumulator4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(matrix6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(matrixIterator9);
        org.junit.Assert.assertNotNull(cRSMatrix12);
        org.junit.Assert.assertNotNull(matrixIterator13);
        org.junit.Assert.assertNotNull(vector15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(vectorIterator20);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix21);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory22);
        org.junit.Assert.assertNotNull(basic1DMatrix23);
        org.junit.Assert.assertNotNull(basic1DMatrix24);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix27);
        org.junit.Assert.assertNotNull(matrixIterator28);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix33);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix38);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(vectorAccumulator42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(vectorProcedure44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(matrixAccumulator48);
        org.junit.Assert.assertNotNull(matrixProcedure49);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation2 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray9 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray16 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray23 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray30 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray37 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray38 = new double[][] { doubleArray9, doubleArray16, doubleArray23, doubleArray30, doubleArray37 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix39 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray38);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation40 = matrixMatrixMatrixOperation2.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix39);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix44 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix45 = rowMajorSparseMatrix44.removeLastRow();
        double double49 = rowMajorSparseMatrix44.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        org.la4j.Vector vector50 = rowMajorSparseMatrix44.toRowVector();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix54 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix55 = rowMajorSparseMatrix54.removeLastRow();
        double double59 = rowMajorSparseMatrix54.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        org.la4j.Vector vector60 = rowMajorSparseMatrix54.toRowVector();
        org.la4j.Matrix matrix61 = matrixMatrixMatrixOperation2.apply(rowMajorSparseMatrix44, rowMajorSparseMatrix54);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator62 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray63 = rowMajorSparseMatrix44.foldNonZeroInRows(vectorAccumulator62);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix64 = new org.la4j.matrix.dense.Basic1DMatrix(0, (int) 'a', doubleArray63);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation2);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertNotNull(basic2DMatrix39);
        org.junit.Assert.assertNotNull(matrixMatrixOperation40);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix44);
        org.junit.Assert.assertNotNull(matrix45);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertNotNull(vector50);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix54);
        org.junit.Assert.assertNotNull(matrix55);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertNotNull(vector60);
        org.junit.Assert.assertNotNull(matrix61);
        org.junit.Assert.assertNotNull(vectorAccumulator62);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0]");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.la4j.matrix.SparseMatrix sparseMatrix1 = org.la4j.matrix.SparseMatrix.fromCSV("1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000");
        org.junit.Assert.assertNotNull(sparseMatrix1);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.sparse.CRSMatrix cRSMatrix1 = org.la4j.matrix.sparse.CRSMatrix.fromCSV("%%MatrixMarket matrix coordinate real general row-major\n32 32 0\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"%%MatrixMarket\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.la4j.matrix.DenseMatrix denseMatrix2 = org.la4j.matrix.DenseMatrix.diagonal((int) '4', (double) (short) 1);
        org.junit.Assert.assertNotNull(denseMatrix2);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct0 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix5 = rowMajorSparseMatrix4.removeLastRow();
        double double9 = rowMajorSparseMatrix4.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int10 = rowMajorSparseMatrix4.cardinality();
        org.la4j.Vector vector12 = rowMajorSparseMatrix4.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix15 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix16 = ooPlaceMatrixHadamardProduct0.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix4, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix15);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix20 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix21 = rowMajorSparseMatrix20.removeLastRow();
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure22 = null;
        rowMajorSparseMatrix20.eachNonZero(matrixProcedure22);
        double[][] doubleArray24 = new double[][] {};
        org.la4j.matrix.DenseMatrix denseMatrix25 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray24);
        org.la4j.Matrix matrix26 = ooPlaceMatrixHadamardProduct0.apply(rowMajorSparseMatrix20, denseMatrix25);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix29 = org.la4j.matrix.ColumnMajorSparseMatrix.diagonal((int) (byte) 10, (double) 0L);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation30 = ooPlaceMatrixHadamardProduct0.partiallyApply(columnMajorSparseMatrix29);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix33 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double34 = cRSMatrix33.min();
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation35 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray42 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray49 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray56 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray63 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray70 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray71 = new double[][] { doubleArray42, doubleArray49, doubleArray56, doubleArray63, doubleArray70 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix72 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray71);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation73 = matrixMatrixMatrixOperation35.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix72);
        java.util.Spliterator<java.lang.Double> doubleSpliterator74 = basic2DMatrix72.spliterator();
        basic2DMatrix72.setAll((double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ooPlaceMatrixHadamardProduct0.ensureApplicableTo((org.la4j.Matrix) cRSMatrix33, (org.la4j.Matrix) basic2DMatrix72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given matrices should have the same shape: 10x10 does not equal to 5x6.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix4);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(vector12);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix15);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertNotNull(denseMatrix25);
        org.junit.Assert.assertNotNull(matrix26);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix29);
        org.junit.Assert.assertNotNull(matrixMatrixOperation30);
        org.junit.Assert.assertNotNull(cRSMatrix33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation35);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertNotNull(basic2DMatrix72);
        org.junit.Assert.assertNotNull(matrixMatrixOperation73);
        org.junit.Assert.assertNotNull(doubleSpliterator74);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random2 = null;
        org.la4j.vector.DenseVector denseVector3 = org.la4j.vector.DenseVector.random(0, random2);
        java.util.Random random5 = null;
        org.la4j.vector.DenseVector denseVector6 = org.la4j.vector.DenseVector.random(0, random5);
        org.la4j.Matrix matrix7 = ooPlaceOuterProduct0.apply(denseVector3, denseVector6);
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct8 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random10 = null;
        org.la4j.vector.DenseVector denseVector11 = org.la4j.vector.DenseVector.random(0, random10);
        java.util.Random random13 = null;
        org.la4j.vector.DenseVector denseVector14 = org.la4j.vector.DenseVector.random(0, random13);
        org.la4j.Matrix matrix15 = ooPlaceOuterProduct8.apply(denseVector11, denseVector14);
        org.la4j.vector.sparse.CompressedVector compressedVector17 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        java.text.NumberFormat numberFormat18 = null;
        java.lang.String str19 = compressedVector17.toMatrixMarket(numberFormat18);
        org.la4j.Vector vector21 = compressedVector17.add((double) 52);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix24 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator25 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray26 = cCSMatrix24.foldRows(vectorAccumulator25);
        org.la4j.vector.dense.BasicVector basicVector27 = org.la4j.vector.dense.BasicVector.fromArray(doubleArray26);
        org.la4j.Matrix matrix28 = basicVector27.toRowMatrix();
        org.la4j.vector.functor.VectorPredicate vectorPredicate29 = org.la4j.Vectors.ZERO_VECTOR;
        boolean boolean30 = basicVector27.non(vectorPredicate29);
        org.la4j.Vector vector32 = basicVector27.blankOfLength((int) 'a');
        org.la4j.Matrix matrix33 = ooPlaceOuterProduct8.apply((org.la4j.vector.SparseVector) compressedVector17, (org.la4j.vector.DenseVector) basicVector27);
        compressedVector17.setAll((double) '#');
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix38 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator39 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray40 = cCSMatrix38.foldRows(vectorAccumulator39);
        org.la4j.vector.dense.BasicVector basicVector41 = org.la4j.vector.dense.BasicVector.fromArray(doubleArray40);
        org.la4j.Matrix matrix42 = basicVector41.toDiagonalMatrix();
        org.la4j.Matrix matrix43 = ooPlaceOuterProduct0.apply((org.la4j.vector.SparseVector) compressedVector17, (org.la4j.vector.DenseVector) basicVector41);
        org.junit.Assert.assertNotNull(denseVector3);
        org.junit.Assert.assertNotNull(denseVector6);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(denseVector11);
        org.junit.Assert.assertNotNull(denseVector14);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "%%MatrixMarket vector coordinate real\n32 0\n" + "'", str19, "%%MatrixMarket vector coordinate real\n32 0\n");
        org.junit.Assert.assertNotNull(vector21);
        org.junit.Assert.assertNotNull(cCSMatrix24);
        org.junit.Assert.assertNotNull(vectorAccumulator25);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(basicVector27);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertNotNull(vectorPredicate29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(vector32);
        org.junit.Assert.assertNotNull(matrix33);
        org.junit.Assert.assertNotNull(cCSMatrix38);
        org.junit.Assert.assertNotNull(vectorAccumulator39);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(basicVector41);
        org.junit.Assert.assertNotNull(matrix42);
        org.junit.Assert.assertNotNull(matrix43);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        byte[] byteArray3 = cRSMatrix2.toBinary();
        org.la4j.Matrix matrix5 = cRSMatrix2.blankOfRows((int) (short) 1);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix9 = new org.la4j.matrix.sparse.CCSMatrix((int) (byte) 1, (int) (byte) 0);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix13 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix14 = rowMajorSparseMatrix13.removeLastRow();
        org.la4j.matrix.functor.MatrixFunction matrixFunction16 = null;
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator17 = org.la4j.Matrices.asSumFunctionAccumulator((double) (-1), matrixFunction16);
        double double18 = matrix14.fold(matrixAccumulator17);
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure19 = org.la4j.Matrices.asAccumulatorProcedure(matrixAccumulator17);
        cCSMatrix9.eachNonZero(matrixProcedure19);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix24 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator25 = columnMajorSparseMatrix24.nonZeroIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix30 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double34 = rowMajorSparseMatrix30.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix35 = rowMajorSparseMatrix30.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate36 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean37 = sparseMatrix35.is(advancedMatrixPredicate36);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator39 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double40 = sparseMatrix35.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator39);
        org.la4j.vector.functor.VectorProcedure vectorProcedure41 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator39);
        columnMajorSparseMatrix24.eachNonZeroInRow((-1), vectorProcedure41);
        vectorProcedure41.apply(10, (double) (byte) 100);
        cCSMatrix9.eachNonZeroInRow((int) '4', vectorProcedure41);
        // The following exception was thrown during execution in test generation
        try {
            cRSMatrix2.eachNonZeroInRow(30, vectorProcedure41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 30");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[32, 0, 0, 0, 10, 0, 0, 0, 10, 0, 0, 0, 10, 0, 0, 0, 0, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 0, 3, 0, 0, 0, 4, 0, 0, 0, 5, 0, 0, 0, 6, 0, 0, 0, 7, 0, 0, 0, 8, 0, 0, 0, 9, 0, 0, 0, 10]");
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix13);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(matrixAccumulator17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertNotNull(matrixProcedure19);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix24);
        org.junit.Assert.assertNotNull(matrixIterator25);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix30);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix35);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(vectorAccumulator39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(vectorProcedure41);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator3 = cCSMatrix2.nonZeroColumnMajorIterator();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix6 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator7 = cCSMatrix6.nonZeroColumnMajorIterator();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix10 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean11 = cCSMatrix10.isRowMajor();
        org.la4j.Matrix matrix14 = cCSMatrix10.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator15 = cCSMatrix10.nonZeroColumnMajorIterator();
        org.la4j.iterator.MatrixIterator matrixIterator16 = columnMajorMatrixIterator7.andAlsoDivide((org.la4j.iterator.MatrixIterator) columnMajorMatrixIterator15);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix19 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean20 = cCSMatrix19.isRowMajor();
        org.la4j.Matrix matrix23 = cCSMatrix19.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator24 = cCSMatrix19.nonZeroColumnMajorIterator();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix27 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double28 = cRSMatrix27.min();
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator29 = cRSMatrix27.nonZeroRowMajorIterator();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix32 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator33 = columnMajorSparseMatrix32.nonZeroIterator();
        org.la4j.iterator.MatrixIterator matrixIterator34 = rowMajorMatrixIterator29.orElseSubtract(matrixIterator33);
        org.la4j.iterator.MatrixIterator matrixIterator35 = columnMajorMatrixIterator24.orElseAdd(matrixIterator33);
        org.la4j.iterator.MatrixIterator matrixIterator36 = columnMajorMatrixIterator7.andAlsoDivide(matrixIterator33);
        org.la4j.iterator.MatrixIterator matrixIterator37 = columnMajorMatrixIterator3.orElseSubtract(matrixIterator33);
        // The following exception was thrown during execution in test generation
        try {
            double double38 = matrixIterator37.get();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix2);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator3);
        org.junit.Assert.assertNotNull(cCSMatrix6);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator7);
        org.junit.Assert.assertNotNull(cCSMatrix10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator15);
        org.junit.Assert.assertNotNull(matrixIterator16);
        org.junit.Assert.assertNotNull(cCSMatrix19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(matrix23);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator24);
        org.junit.Assert.assertNotNull(cRSMatrix27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator29);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix32);
        org.junit.Assert.assertNotNull(matrixIterator33);
        org.junit.Assert.assertNotNull(matrixIterator34);
        org.junit.Assert.assertNotNull(matrixIterator35);
        org.junit.Assert.assertNotNull(matrixIterator36);
        org.junit.Assert.assertNotNull(matrixIterator37);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.la4j.vector.dense.BasicVector basicVector1 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector2 = basicVector1.copy();
        org.la4j.Matrix matrix3 = basicVector1.toDiagonalMatrix();
        org.la4j.Vector vector5 = basicVector1.blankOfLength(52);
        org.la4j.Matrix matrix6 = basicVector1.toRowMatrix();
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.decomposition.RawLUDecompositor rawLUDecompositor7 = new org.la4j.decomposition.RawLUDecompositor(matrix6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given matrix can not be used with this decompositor.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector2);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertNotNull(vector5);
        org.junit.Assert.assertNotNull(matrix6);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.la4j.Vector vector1 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str2 = vector1.toCSV();
        org.la4j.vector.SparseVector sparseVector3 = vector1.toSparseVector();
        boolean boolean5 = sparseVector3.isZeroAt(52);
        org.la4j.iterator.VectorIterator vectorIterator6 = sparseVector3.iterator();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct7 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix12 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator13 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray14 = cCSMatrix12.foldRows(vectorAccumulator13);
        org.la4j.matrix.DenseMatrix denseMatrix15 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray14);
        org.la4j.vector.dense.BasicVector basicVector16 = new org.la4j.vector.dense.BasicVector(doubleArray14);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix21 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator22 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray23 = cCSMatrix21.foldRows(vectorAccumulator22);
        org.la4j.matrix.DenseMatrix denseMatrix24 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray23);
        org.la4j.vector.dense.BasicVector basicVector25 = new org.la4j.vector.dense.BasicVector(doubleArray23);
        ooPlaceOuterProduct7.ensureApplicableTo((org.la4j.Vector) basicVector16, (org.la4j.Vector) basicVector25);
        org.la4j.vector.sparse.CompressedVector compressedVector28 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix29 = compressedVector28.toColumnMatrix();
        org.la4j.Matrix matrix30 = sparseVector3.apply((org.la4j.operation.VectorVectorOperation<org.la4j.Matrix>) ooPlaceOuterProduct7, (org.la4j.Vector) compressedVector28);
        java.text.NumberFormat numberFormat31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = compressedVector28.mkString(numberFormat31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000" + "'", str2, "1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000");
        org.junit.Assert.assertNotNull(sparseVector3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(vectorIterator6);
        org.junit.Assert.assertNotNull(cCSMatrix12);
        org.junit.Assert.assertNotNull(vectorAccumulator13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix15);
        org.junit.Assert.assertNotNull(cCSMatrix21);
        org.junit.Assert.assertNotNull(vectorAccumulator22);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix24);
        org.junit.Assert.assertNotNull(matrix29);
        org.junit.Assert.assertNotNull(matrix30);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double4 = cRSMatrix3.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix8 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix9 = rowMajorSparseMatrix8.removeLastRow();
        org.la4j.Matrix matrix10 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, rowMajorSparseMatrix8);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix13 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator14 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray15 = cCSMatrix13.foldRows(vectorAccumulator14);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix18 = org.la4j.matrix.RowMajorSparseMatrix.zero(0, (int) (short) 10);
        org.la4j.Matrix matrix19 = ooPlaceMatricesAddition0.applySymmetric((org.la4j.matrix.SparseMatrix) cCSMatrix13, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix18);
        org.la4j.operation.ooplace.OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication20 = new org.la4j.operation.ooplace.OoPlaceMatricesMultiplication();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix23 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator24 = cRSMatrix23.nonZeroIterator();
        org.la4j.Vector vector26 = cRSMatrix23.getColumn(100);
        boolean boolean29 = cRSMatrix23.nonZeroAt(1, (int) (short) 0);
        java.util.Random random32 = null;
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix33 = org.la4j.matrix.dense.Basic2DMatrix.random((int) (short) 0, 1, random32);
        org.la4j.Matrix matrix34 = ooPlaceMatricesMultiplication20.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix23, (org.la4j.matrix.DenseMatrix) basic2DMatrix33);
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction35 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix39 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix40 = rowMajorSparseMatrix39.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix42 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix43 = ooPlaceMatricesSubtraction35.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix39, denseMatrix42);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix46 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double47 = columnMajorSparseMatrix46.determinant();
        org.la4j.matrix.DenseMatrix denseMatrix50 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        double double51 = denseMatrix50.min();
        double double52 = denseMatrix50.sum();
        org.la4j.Matrix matrix53 = ooPlaceMatricesSubtraction35.apply(columnMajorSparseMatrix46, denseMatrix50);
        org.la4j.Matrix matrix54 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.DenseMatrix) basic2DMatrix33, columnMajorSparseMatrix46);
        org.junit.Assert.assertNotNull(cRSMatrix3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(cCSMatrix13);
        org.junit.Assert.assertNotNull(vectorAccumulator14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix18);
        org.junit.Assert.assertNotNull(matrix19);
        org.junit.Assert.assertNotNull(cRSMatrix23);
        org.junit.Assert.assertNotNull(matrixIterator24);
        org.junit.Assert.assertNotNull(vector26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(basic2DMatrix33);
        org.junit.Assert.assertNotNull(matrix34);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix39);
        org.junit.Assert.assertNotNull(matrix40);
        org.junit.Assert.assertNotNull(denseMatrix42);
        org.junit.Assert.assertNotNull(matrix43);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(denseMatrix50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + Double.POSITIVE_INFINITY + "'", double51 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertNotNull(matrix53);
        org.junit.Assert.assertNotNull(matrix54);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix3 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean4 = cCSMatrix3.isRowMajor();
        org.la4j.Matrix matrix7 = cCSMatrix3.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator8 = cCSMatrix3.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix12 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix14 = rowMajorSparseMatrix12.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix18 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double22 = rowMajorSparseMatrix18.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix23 = rowMajorSparseMatrix18.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct24 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean25 = sparseMatrix23.equals((java.lang.Object) ooPlaceOuterProduct24);
        org.la4j.Matrix matrix26 = rowMajorSparseMatrix12.hadamardProduct((org.la4j.Matrix) sparseMatrix23);
        org.la4j.Matrix matrix27 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix3, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix12);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix29 = org.la4j.matrix.sparse.CRSMatrix.fromCSV("");
        org.la4j.matrix.DenseMatrix denseMatrix32 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        double double33 = denseMatrix32.min();
        org.la4j.Matrix matrix34 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.SparseMatrix) cRSMatrix29, denseMatrix32);
        java.util.Random random36 = null;
        org.la4j.matrix.DenseMatrix denseMatrix37 = org.la4j.matrix.DenseMatrix.randomSymmetric(0, random36);
        double[][] doubleArray38 = new double[][] {};
        org.la4j.matrix.DenseMatrix denseMatrix39 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray38);
        org.la4j.matrix.DenseMatrix denseMatrix40 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray38);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix41 = denseMatrix40.toRowMajorSparseMatrix();
        org.la4j.Matrix matrix42 = ooPlaceMatricesSubtraction0.apply(denseMatrix37, denseMatrix40);
        org.la4j.linear.JacobiSolver jacobiSolver43 = new org.la4j.linear.JacobiSolver(matrix42);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix46 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean49 = cCSMatrix46.nonZeroAt((int) ' ', (int) '#');
        org.la4j.Vector vector51 = cCSMatrix46.getRow(1);
        org.la4j.Vector vector52 = vector51.copy();
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector53 = jacobiSolver43.solve(vector52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrong length of RHS vector: 52.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator8);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(matrix26);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(cRSMatrix29);
        org.junit.Assert.assertNotNull(denseMatrix32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + Double.POSITIVE_INFINITY + "'", double33 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(matrix34);
        org.junit.Assert.assertNotNull(denseMatrix37);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertNotNull(denseMatrix39);
        org.junit.Assert.assertNotNull(denseMatrix40);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix41);
        org.junit.Assert.assertNotNull(matrix42);
        org.junit.Assert.assertNotNull(cCSMatrix46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(vector51);
        org.junit.Assert.assertNotNull(vector52);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        double[] doubleArray6 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray13 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray20 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray27 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray34 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray35 = new double[][] { doubleArray6, doubleArray13, doubleArray20, doubleArray27, doubleArray34 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix36 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray35);
        basic2DMatrix36.setAll((double) 100);
        org.la4j.Matrix matrix41 = basic2DMatrix36.blankOfShape((int) (byte) 10, 52);
        org.la4j.matrix.SparseMatrix sparseMatrix42 = matrix41.toSparseMatrix();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertNotNull(basic2DMatrix36);
        org.junit.Assert.assertNotNull(matrix41);
        org.junit.Assert.assertNotNull(sparseMatrix42);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.la4j.vector.dense.BasicVector basicVector1 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector2 = basicVector1.copy();
        org.la4j.Matrix matrix3 = basicVector1.toDiagonalMatrix();
        org.la4j.Vector vector5 = basicVector1.blankOfLength(52);
        org.la4j.Matrix matrix6 = basicVector1.toRowMatrix();
        java.lang.String str7 = basicVector1.toCSV();
        org.junit.Assert.assertNotNull(vector2);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertNotNull(vector5);
        org.junit.Assert.assertNotNull(matrix6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000" + "'", str7, "0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct0 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix5 = rowMajorSparseMatrix4.removeLastRow();
        double double9 = rowMajorSparseMatrix4.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int10 = rowMajorSparseMatrix4.cardinality();
        org.la4j.Vector vector12 = rowMajorSparseMatrix4.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix15 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix16 = ooPlaceMatrixHadamardProduct0.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix4, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix15);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix20 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix21 = rowMajorSparseMatrix20.removeLastRow();
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure22 = null;
        rowMajorSparseMatrix20.eachNonZero(matrixProcedure22);
        double[][] doubleArray24 = new double[][] {};
        org.la4j.matrix.DenseMatrix denseMatrix25 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray24);
        org.la4j.Matrix matrix26 = ooPlaceMatrixHadamardProduct0.apply(rowMajorSparseMatrix20, denseMatrix25);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix29 = org.la4j.matrix.sparse.CRSMatrix.zero(100, (int) (short) 100);
        org.la4j.Matrix matrix31 = cRSMatrix29.multiply((double) 100);
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction32 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix36 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix37 = rowMajorSparseMatrix36.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix39 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix40 = ooPlaceMatricesSubtraction32.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix36, denseMatrix39);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix43 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double44 = columnMajorSparseMatrix43.determinant();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory45 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix46 = columnMajorSparseMatrix43.to(basic1DMatrixMatrixFactory45);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix50 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix51 = rowMajorSparseMatrix50.removeLastRow();
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure52 = null;
        rowMajorSparseMatrix50.eachNonZero(matrixProcedure52);
        org.la4j.Matrix matrix54 = ooPlaceMatricesSubtraction32.applySimple((org.la4j.matrix.DenseMatrix) basic1DMatrix46, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix50);
        org.la4j.Matrix matrix55 = basic1DMatrix46.shuffle();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix58 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator59 = cRSMatrix58.nonZeroIterator();
        org.la4j.Vector vector61 = cRSMatrix58.getColumn(100);
        boolean boolean64 = cRSMatrix58.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator66 = cRSMatrix58.nonZeroIteratorOfColumn((-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix67 = cRSMatrix58.toRowMajorSparseMatrix();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory68 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix69 = cRSMatrix58.to(basic1DMatrixMatrixFactory68);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix70 = matrix55.to(basic1DMatrixMatrixFactory68);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix71 = cRSMatrix29.to(basic1DMatrixMatrixFactory68);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix75 = org.la4j.matrix.sparse.CCSMatrix.zero(10, (int) (short) 10, (int) '4');
        org.la4j.decomposition.QRDecompositor qRDecompositor76 = new org.la4j.decomposition.QRDecompositor((org.la4j.Matrix) cCSMatrix75);
        org.la4j.Matrix matrix77 = ooPlaceMatrixHadamardProduct0.applySymmetric((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix29, (org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix75);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix80 = org.la4j.matrix.dense.Basic1DMatrix.unit((int) (byte) 10, (int) (byte) 0);
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory81 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix82 = basic1DMatrix80.to(basic1DMatrixMatrixFactory81);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix83 = cCSMatrix75.to(basic1DMatrixMatrixFactory81);
        org.la4j.iterator.VectorIterator vectorIterator85 = cCSMatrix75.iteratorOfColumn(0);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix4);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(vector12);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix15);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertNotNull(denseMatrix25);
        org.junit.Assert.assertNotNull(matrix26);
        org.junit.Assert.assertNotNull(cRSMatrix29);
        org.junit.Assert.assertNotNull(matrix31);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix36);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(denseMatrix39);
        org.junit.Assert.assertNotNull(matrix40);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory45);
        org.junit.Assert.assertNotNull(basic1DMatrix46);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix50);
        org.junit.Assert.assertNotNull(matrix51);
        org.junit.Assert.assertNotNull(matrix54);
        org.junit.Assert.assertNotNull(matrix55);
        org.junit.Assert.assertNotNull(cRSMatrix58);
        org.junit.Assert.assertNotNull(matrixIterator59);
        org.junit.Assert.assertNotNull(vector61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(vectorIterator66);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix67);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory68);
        org.junit.Assert.assertNotNull(basic1DMatrix69);
        org.junit.Assert.assertNotNull(basic1DMatrix70);
        org.junit.Assert.assertNotNull(basic1DMatrix71);
        org.junit.Assert.assertNotNull(cCSMatrix75);
        org.junit.Assert.assertNotNull(matrix77);
        org.junit.Assert.assertNotNull(basic1DMatrix80);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory81);
        org.junit.Assert.assertNotNull(basic1DMatrix82);
        org.junit.Assert.assertNotNull(basic1DMatrix83);
        org.junit.Assert.assertNotNull(vectorIterator85);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix2 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (short) 1, 0);
        org.la4j.Matrix matrix3 = rowMajorSparseMatrix2.shuffle();
        org.la4j.Matrix matrix4 = matrix3.copy();
        org.la4j.Matrix matrix5 = matrix3.blank();
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix2);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertNotNull(matrix5);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.la4j.vector.dense.BasicVector basicVector1 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector2 = basicVector1.copy();
        org.la4j.Matrix matrix3 = basicVector1.toDiagonalMatrix();
        org.la4j.Vector vector5 = basicVector1.copyOfLength(10);
        org.la4j.Vector vector6 = vector5.copy();
        org.junit.Assert.assertNotNull(vector2);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertNotNull(vector5);
        org.junit.Assert.assertNotNull(vector6);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator3 = cRSMatrix2.nonZeroIterator();
        org.la4j.Vector vector5 = cRSMatrix2.getColumn(100);
        boolean boolean8 = cRSMatrix2.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator10 = cRSMatrix2.nonZeroIteratorOfColumn((-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix11 = cRSMatrix2.toRowMajorSparseMatrix();
        double double12 = rowMajorSparseMatrix11.determinant();
        org.la4j.Matrix matrix14 = rowMajorSparseMatrix11.add((-1.0E10d));
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition15 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix18 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double19 = cRSMatrix18.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix23 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix24 = rowMajorSparseMatrix23.removeLastRow();
        org.la4j.Matrix matrix25 = ooPlaceMatricesAddition15.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix18, rowMajorSparseMatrix23);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix28 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.matrix.DenseMatrix denseMatrix30 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix31 = ooPlaceMatricesAddition15.apply(columnMajorSparseMatrix28, denseMatrix30);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix34 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        byte[] byteArray35 = columnMajorSparseMatrix34.toBinary();
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation36 = ooPlaceMatricesAddition15.partiallyApply(columnMajorSparseMatrix34);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix39 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator40 = cCSMatrix39.iterator();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix43 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        double double46 = cCSMatrix43.get((int) (byte) 0, (int) (short) 1);
        double double47 = cCSMatrix43.min();
        org.la4j.Matrix matrix48 = ooPlaceMatricesAddition15.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix39, (org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix43);
        org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication49 = new org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication();
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix52 = org.la4j.matrix.dense.Basic2DMatrix.unit((int) (byte) 1, (int) '4');
        org.la4j.Matrix matrix53 = ooPlaceMatrixByItsTransposeMultiplication49.apply((org.la4j.matrix.DenseMatrix) basic2DMatrix52);
        org.la4j.Matrix matrix54 = cCSMatrix39.apply((org.la4j.operation.MatrixOperation<org.la4j.Matrix>) ooPlaceMatrixByItsTransposeMultiplication49);
        org.la4j.Matrix matrix55 = rowMajorSparseMatrix11.apply((org.la4j.operation.MatrixOperation<org.la4j.Matrix>) ooPlaceMatrixByItsTransposeMultiplication49);
        org.la4j.Matrix matrix56 = rowMajorSparseMatrix11.transpose();
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertNotNull(matrixIterator3);
        org.junit.Assert.assertNotNull(vector5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(vectorIterator10);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E10d + "'", double12 == 1.0E10d);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(cRSMatrix18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix23);
        org.junit.Assert.assertNotNull(matrix24);
        org.junit.Assert.assertNotNull(matrix25);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix28);
        org.junit.Assert.assertNotNull(denseMatrix30);
        org.junit.Assert.assertNotNull(matrix31);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[48, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(matrixMatrixOperation36);
        org.junit.Assert.assertNotNull(cCSMatrix39);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator40);
        org.junit.Assert.assertNotNull(cCSMatrix43);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertNotNull(matrix48);
        org.junit.Assert.assertNotNull(basic2DMatrix52);
        org.junit.Assert.assertNotNull(matrix53);
        org.junit.Assert.assertNotNull(matrix54);
        org.junit.Assert.assertNotNull(matrix55);
        org.junit.Assert.assertNotNull(matrix56);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix5 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator6 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray7 = cCSMatrix5.foldRows(vectorAccumulator6);
        org.la4j.matrix.DenseMatrix denseMatrix8 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray7);
        org.la4j.vector.dense.BasicVector basicVector10 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector11 = ooPlaceMatrixByVectorMultiplication0.apply(denseMatrix8, (org.la4j.vector.DenseVector) basicVector10);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix12 = null;
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct13 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix18 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator19 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray20 = cCSMatrix18.foldRows(vectorAccumulator19);
        org.la4j.matrix.DenseMatrix denseMatrix21 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray20);
        org.la4j.vector.dense.BasicVector basicVector22 = new org.la4j.vector.dense.BasicVector(doubleArray20);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix27 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator28 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray29 = cCSMatrix27.foldRows(vectorAccumulator28);
        org.la4j.matrix.DenseMatrix denseMatrix30 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray29);
        org.la4j.vector.dense.BasicVector basicVector31 = new org.la4j.vector.dense.BasicVector(doubleArray29);
        ooPlaceOuterProduct13.ensureApplicableTo((org.la4j.Vector) basicVector22, (org.la4j.Vector) basicVector31);
        org.la4j.Matrix matrix33 = basicVector31.toColumnMatrix();
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector34 = ooPlaceMatrixByVectorMultiplication0.apply(rowMajorSparseMatrix12, (org.la4j.vector.DenseVector) basicVector31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix5);
        org.junit.Assert.assertNotNull(vectorAccumulator6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix8);
        org.junit.Assert.assertNotNull(vector11);
        org.junit.Assert.assertNotNull(cCSMatrix18);
        org.junit.Assert.assertNotNull(vectorAccumulator19);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix21);
        org.junit.Assert.assertNotNull(cCSMatrix27);
        org.junit.Assert.assertNotNull(vectorAccumulator28);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix30);
        org.junit.Assert.assertNotNull(matrix33);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double4 = cRSMatrix3.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix8 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix9 = rowMajorSparseMatrix8.removeLastRow();
        org.la4j.Matrix matrix10 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, rowMajorSparseMatrix8);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition11 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix14 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double15 = cRSMatrix14.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix19 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix20 = rowMajorSparseMatrix19.removeLastRow();
        org.la4j.Matrix matrix21 = ooPlaceMatricesAddition11.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix14, rowMajorSparseMatrix19);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix24 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.matrix.DenseMatrix denseMatrix26 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix27 = ooPlaceMatricesAddition11.apply(columnMajorSparseMatrix24, denseMatrix26);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix31 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix32 = rowMajorSparseMatrix31.removeLastRow();
        double double36 = rowMajorSparseMatrix31.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        org.la4j.Vector vector37 = rowMajorSparseMatrix31.toRowVector();
        org.la4j.Matrix matrix38 = ooPlaceMatricesAddition0.apply(denseMatrix26, rowMajorSparseMatrix31);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix41 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        double double44 = cCSMatrix41.get((int) (byte) 0, (int) (short) 1);
        org.la4j.vector.functor.VectorFunction vectorFunction46 = org.la4j.Vectors.DEC_FUNCTION;
        org.la4j.Matrix matrix47 = cCSMatrix41.transformRow(10, vectorFunction46);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix50 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator51 = cRSMatrix50.nonZeroIterator();
        org.la4j.Vector vector53 = cRSMatrix50.getColumn(100);
        boolean boolean56 = cRSMatrix50.nonZeroAt(1, (int) (short) 0);
        org.la4j.decomposition.RawLUDecompositor rawLUDecompositor57 = new org.la4j.decomposition.RawLUDecompositor((org.la4j.Matrix) cRSMatrix50);
        org.la4j.Matrix matrix58 = ooPlaceMatricesAddition0.applySymmetric((org.la4j.matrix.SparseMatrix) cCSMatrix41, (org.la4j.matrix.SparseMatrix) cRSMatrix50);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix62 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix64 = rowMajorSparseMatrix62.divide((double) (-1));
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix67 = new org.la4j.matrix.sparse.CCSMatrix((int) (byte) 1, (int) (byte) 0);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix71 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix72 = rowMajorSparseMatrix71.removeLastRow();
        org.la4j.matrix.functor.MatrixFunction matrixFunction74 = null;
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator75 = org.la4j.Matrices.asSumFunctionAccumulator((double) (-1), matrixFunction74);
        double double76 = matrix72.fold(matrixAccumulator75);
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure77 = org.la4j.Matrices.asAccumulatorProcedure(matrixAccumulator75);
        cCSMatrix67.eachNonZero(matrixProcedure77);
        org.la4j.Matrix matrix79 = ooPlaceMatricesAddition0.applySymmetric(rowMajorSparseMatrix62, (org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix67);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix83 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix84 = rowMajorSparseMatrix83.removeLastRow();
        double double88 = rowMajorSparseMatrix83.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        org.la4j.Vector vector89 = rowMajorSparseMatrix83.toRowVector();
        java.util.Random random92 = null;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix93 = org.la4j.matrix.dense.Basic1DMatrix.random((int) 'a', 0, random92);
        org.la4j.Matrix matrix94 = ooPlaceMatricesAddition0.apply(rowMajorSparseMatrix83, (org.la4j.matrix.DenseMatrix) basic1DMatrix93);
        org.junit.Assert.assertNotNull(cRSMatrix3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(cRSMatrix14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix19);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix24);
        org.junit.Assert.assertNotNull(denseMatrix26);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix31);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(vector37);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(cCSMatrix41);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(vectorFunction46);
        org.junit.Assert.assertNotNull(matrix47);
        org.junit.Assert.assertNotNull(cRSMatrix50);
        org.junit.Assert.assertNotNull(matrixIterator51);
        org.junit.Assert.assertNotNull(vector53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(matrix58);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix62);
        org.junit.Assert.assertNotNull(matrix64);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix71);
        org.junit.Assert.assertNotNull(matrix72);
        org.junit.Assert.assertNotNull(matrixAccumulator75);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-1.0d) + "'", double76 == (-1.0d));
        org.junit.Assert.assertNotNull(matrixProcedure77);
        org.junit.Assert.assertNotNull(matrix79);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix83);
        org.junit.Assert.assertNotNull(matrix84);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 10.0d + "'", double88 == 10.0d);
        org.junit.Assert.assertNotNull(vector89);
        org.junit.Assert.assertNotNull(basic1DMatrix93);
        org.junit.Assert.assertNotNull(matrix94);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix2 = org.la4j.matrix.dense.Basic1DMatrix.diagonal(6, 10.0d);
        org.junit.Assert.assertNotNull(basic1DMatrix2);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        double[] doubleArray2 = null;
        org.la4j.matrix.DenseMatrix denseMatrix3 = org.la4j.matrix.DenseMatrix.from1DArray((int) (short) 100, (int) (short) 1, doubleArray2);
        org.junit.Assert.assertNotNull(denseMatrix3);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        double[] doubleArray2 = null;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix3 = new org.la4j.matrix.dense.Basic1DMatrix((int) ' ', 0, doubleArray2);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.la4j.matrix.DenseMatrix denseMatrix2 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        double double3 = denseMatrix2.min();
        org.la4j.decomposition.SingularValueDecompositor singularValueDecompositor4 = new org.la4j.decomposition.SingularValueDecompositor((org.la4j.Matrix) denseMatrix2);
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction5 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix9 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix10 = rowMajorSparseMatrix9.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix12 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix13 = ooPlaceMatricesSubtraction5.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix9, denseMatrix12);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix16 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double17 = columnMajorSparseMatrix16.determinant();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory18 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix19 = columnMajorSparseMatrix16.to(basic1DMatrixMatrixFactory18);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix23 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix24 = rowMajorSparseMatrix23.removeLastRow();
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure25 = null;
        rowMajorSparseMatrix23.eachNonZero(matrixProcedure25);
        org.la4j.Matrix matrix27 = ooPlaceMatricesSubtraction5.applySimple((org.la4j.matrix.DenseMatrix) basic1DMatrix19, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix23);
        org.la4j.Matrix matrix28 = basic1DMatrix19.shuffle();
        basic1DMatrix19.swapColumns(10, (int) (short) 100);
        org.la4j.Matrix matrix34 = basic1DMatrix19.copyOfShape(30, (int) (short) 100);
        boolean boolean35 = singularValueDecompositor4.applicableTo((org.la4j.Matrix) basic1DMatrix19);
        org.junit.Assert.assertNotNull(denseMatrix2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(denseMatrix12);
        org.junit.Assert.assertNotNull(matrix13);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory18);
        org.junit.Assert.assertNotNull(basic1DMatrix19);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix23);
        org.junit.Assert.assertNotNull(matrix24);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertNotNull(matrix34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix5 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator6 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray7 = cCSMatrix5.foldRows(vectorAccumulator6);
        org.la4j.matrix.DenseMatrix denseMatrix8 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray7);
        org.la4j.vector.dense.BasicVector basicVector9 = new org.la4j.vector.dense.BasicVector(doubleArray7);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix14 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator15 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray16 = cCSMatrix14.foldRows(vectorAccumulator15);
        org.la4j.matrix.DenseMatrix denseMatrix17 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray16);
        org.la4j.vector.dense.BasicVector basicVector18 = new org.la4j.vector.dense.BasicVector(doubleArray16);
        ooPlaceOuterProduct0.ensureApplicableTo((org.la4j.Vector) basicVector9, (org.la4j.Vector) basicVector18);
        org.la4j.vector.sparse.CompressedVector compressedVector21 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector21.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector26 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix27 = ooPlaceOuterProduct0.apply((org.la4j.vector.SparseVector) compressedVector21, (org.la4j.vector.SparseVector) compressedVector26);
        boolean boolean29 = compressedVector26.isZeroAt((int) (short) 1);
        double double30 = compressedVector26.infinityNorm();
        org.junit.Assert.assertNotNull(cCSMatrix5);
        org.junit.Assert.assertNotNull(vectorAccumulator6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix8);
        org.junit.Assert.assertNotNull(cCSMatrix14);
        org.junit.Assert.assertNotNull(vectorAccumulator15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix17);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix3 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator4 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray5 = cCSMatrix3.foldRows(vectorAccumulator4);
        org.la4j.Matrix matrix6 = ooPlaceMatrixByItsTransposeMultiplication0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix3);
        double double8 = cCSMatrix3.minInColumn(0);
        org.la4j.iterator.MatrixIterator matrixIterator9 = cCSMatrix3.nonZeroIterator();
        org.la4j.Matrix matrix10 = cCSMatrix3.copy();
        org.junit.Assert.assertNotNull(cCSMatrix3);
        org.junit.Assert.assertNotNull(vectorAccumulator4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(matrix6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(matrixIterator9);
        org.junit.Assert.assertNotNull(matrix10);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.la4j.matrix.functor.MatrixFunction matrixFunction1 = org.la4j.Matrices.asMulFunction((double) 19);
        org.junit.Assert.assertNotNull(matrixFunction1);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double3 = cRSMatrix2.min();
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator4 = cRSMatrix2.nonZeroRowMajorIterator();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix7 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator8 = columnMajorSparseMatrix7.nonZeroIterator();
        org.la4j.iterator.MatrixIterator matrixIterator9 = rowMajorMatrixIterator4.orElseSubtract(matrixIterator8);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix12 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean13 = cCSMatrix12.isRowMajor();
        org.la4j.Matrix matrix16 = cCSMatrix12.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator17 = cCSMatrix12.nonZeroColumnMajorIterator();
        org.la4j.iterator.MatrixIterator matrixIterator18 = matrixIterator9.orElseSubtract((org.la4j.iterator.MatrixIterator) columnMajorMatrixIterator17);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix21 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean22 = cCSMatrix21.isRowMajor();
        org.la4j.Matrix matrix25 = cCSMatrix21.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator26 = cCSMatrix21.nonZeroColumnMajorIterator();
        org.la4j.iterator.MatrixIterator matrixIterator27 = columnMajorMatrixIterator17.orElseAdd((org.la4j.iterator.MatrixIterator) columnMajorMatrixIterator26);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix30 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator31 = cCSMatrix30.iterator();
        org.la4j.iterator.MatrixIterator matrixIterator32 = columnMajorMatrixIterator17.orElseAdd((org.la4j.iterator.MatrixIterator) columnMajorMatrixIterator31);
        columnMajorMatrixIterator31.set((double) 0L);
        org.la4j.iterator.MatrixIterator matrixIterator35 = null;
        org.la4j.iterator.MatrixIterator matrixIterator36 = columnMajorMatrixIterator31.orElseSubtract(matrixIterator35);
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator4);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix7);
        org.junit.Assert.assertNotNull(matrixIterator8);
        org.junit.Assert.assertNotNull(matrixIterator9);
        org.junit.Assert.assertNotNull(cCSMatrix12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator17);
        org.junit.Assert.assertNotNull(matrixIterator18);
        org.junit.Assert.assertNotNull(cCSMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(matrix25);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator26);
        org.junit.Assert.assertNotNull(matrixIterator27);
        org.junit.Assert.assertNotNull(cCSMatrix30);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator31);
        org.junit.Assert.assertNotNull(matrixIterator32);
        org.junit.Assert.assertNotNull(matrixIterator36);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix3 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean4 = cCSMatrix3.isRowMajor();
        org.la4j.Matrix matrix7 = cCSMatrix3.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator8 = cCSMatrix3.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix12 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix14 = rowMajorSparseMatrix12.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix18 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double22 = rowMajorSparseMatrix18.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix23 = rowMajorSparseMatrix18.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct24 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean25 = sparseMatrix23.equals((java.lang.Object) ooPlaceOuterProduct24);
        org.la4j.Matrix matrix26 = rowMajorSparseMatrix12.hadamardProduct((org.la4j.Matrix) sparseMatrix23);
        org.la4j.Matrix matrix27 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix3, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix12);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix29 = org.la4j.matrix.sparse.CRSMatrix.fromCSV("");
        org.la4j.matrix.DenseMatrix denseMatrix32 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        double double33 = denseMatrix32.min();
        org.la4j.Matrix matrix34 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.SparseMatrix) cRSMatrix29, denseMatrix32);
        java.util.Random random36 = null;
        org.la4j.matrix.DenseMatrix denseMatrix37 = org.la4j.matrix.DenseMatrix.randomSymmetric(0, random36);
        double[][] doubleArray38 = new double[][] {};
        org.la4j.matrix.DenseMatrix denseMatrix39 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray38);
        org.la4j.matrix.DenseMatrix denseMatrix40 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray38);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix41 = denseMatrix40.toRowMajorSparseMatrix();
        org.la4j.Matrix matrix42 = ooPlaceMatricesSubtraction0.apply(denseMatrix37, denseMatrix40);
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct43 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix47 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix48 = rowMajorSparseMatrix47.removeLastRow();
        double double52 = rowMajorSparseMatrix47.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int53 = rowMajorSparseMatrix47.cardinality();
        org.la4j.Vector vector55 = rowMajorSparseMatrix47.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix58 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix59 = ooPlaceMatrixHadamardProduct43.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix47, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix58);
        org.la4j.matrix.DenseMatrix denseMatrix61 = org.la4j.matrix.DenseMatrix.identity((int) (short) 100);
        org.la4j.matrix.DenseMatrix denseMatrix63 = org.la4j.matrix.DenseMatrix.identity((int) (short) 100);
        org.la4j.Matrix matrix64 = ooPlaceMatrixHadamardProduct43.apply(denseMatrix61, denseMatrix63);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix67 = org.la4j.matrix.sparse.CCSMatrix.zero((int) (byte) 10, (int) (byte) 1);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix72 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double76 = rowMajorSparseMatrix72.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix77 = rowMajorSparseMatrix72.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate78 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean79 = sparseMatrix77.is(advancedMatrixPredicate78);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator81 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double82 = sparseMatrix77.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator81);
        org.la4j.vector.functor.VectorProcedure vectorProcedure83 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator81);
        cCSMatrix67.eachNonZeroInRow((int) '#', vectorProcedure83);
        double double85 = cCSMatrix67.min();
        org.la4j.Matrix matrix86 = ooPlaceMatricesSubtraction0.apply(denseMatrix63, (org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix67);
        org.la4j.matrix.DenseMatrix denseMatrix87 = null;
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix91 = org.la4j.matrix.sparse.CCSMatrix.zero(10, (int) (short) 10, (int) '4');
        org.la4j.decomposition.QRDecompositor qRDecompositor92 = new org.la4j.decomposition.QRDecompositor((org.la4j.Matrix) cCSMatrix91);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix93 = ooPlaceMatricesSubtraction0.applySimple(denseMatrix87, (org.la4j.matrix.SparseMatrix) cCSMatrix91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator8);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(matrix26);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(cRSMatrix29);
        org.junit.Assert.assertNotNull(denseMatrix32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + Double.POSITIVE_INFINITY + "'", double33 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(matrix34);
        org.junit.Assert.assertNotNull(denseMatrix37);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertNotNull(denseMatrix39);
        org.junit.Assert.assertNotNull(denseMatrix40);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix41);
        org.junit.Assert.assertNotNull(matrix42);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix47);
        org.junit.Assert.assertNotNull(matrix48);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(vector55);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix58);
        org.junit.Assert.assertNotNull(matrix59);
        org.junit.Assert.assertNotNull(denseMatrix61);
        org.junit.Assert.assertNotNull(denseMatrix63);
        org.junit.Assert.assertNotNull(matrix64);
        org.junit.Assert.assertNotNull(cCSMatrix67);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix72);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 1.0d + "'", double76 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix77);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(vectorAccumulator81);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertNotNull(vectorProcedure83);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertNotNull(matrix86);
        org.junit.Assert.assertNotNull(cCSMatrix91);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication();
        org.la4j.operation.ooplace.OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication1 = new org.la4j.operation.ooplace.OoPlaceMatricesMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix4 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator5 = cCSMatrix4.nonZeroColumnMajorIterator();
        org.la4j.Matrix matrix6 = cCSMatrix4.transpose();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix9 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean10 = cCSMatrix9.isRowMajor();
        org.la4j.Matrix matrix11 = cCSMatrix9.transpose();
        ooPlaceMatricesMultiplication1.ensureApplicableTo((org.la4j.Matrix) cCSMatrix4, matrix11);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix15 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double16 = columnMajorSparseMatrix15.determinant();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory17 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix18 = columnMajorSparseMatrix15.to(basic1DMatrixMatrixFactory17);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition19 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix22 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double23 = cRSMatrix22.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix27 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix28 = rowMajorSparseMatrix27.removeLastRow();
        org.la4j.Matrix matrix29 = ooPlaceMatricesAddition19.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix22, rowMajorSparseMatrix27);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition30 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix33 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double34 = cRSMatrix33.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix38 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix39 = rowMajorSparseMatrix38.removeLastRow();
        org.la4j.Matrix matrix40 = ooPlaceMatricesAddition30.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix33, rowMajorSparseMatrix38);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix43 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.matrix.DenseMatrix denseMatrix45 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix46 = ooPlaceMatricesAddition30.apply(columnMajorSparseMatrix43, denseMatrix45);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix50 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix51 = rowMajorSparseMatrix50.removeLastRow();
        double double55 = rowMajorSparseMatrix50.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        org.la4j.Vector vector56 = rowMajorSparseMatrix50.toRowVector();
        org.la4j.Matrix matrix57 = ooPlaceMatricesAddition19.apply(denseMatrix45, rowMajorSparseMatrix50);
        org.la4j.matrix.SparseMatrix sparseMatrix58 = denseMatrix45.toSparseMatrix();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix59 = denseMatrix45.toRowMajorSparseMatrix();
        org.la4j.Matrix matrix60 = ooPlaceMatricesMultiplication1.apply(columnMajorSparseMatrix15, rowMajorSparseMatrix59);
        org.la4j.decomposition.RawQRDecompositor rawQRDecompositor61 = new org.la4j.decomposition.RawQRDecompositor((org.la4j.Matrix) columnMajorSparseMatrix15);
        org.la4j.vector.dense.BasicVector basicVector63 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector64 = basicVector63.copy();
        org.la4j.Matrix matrix65 = basicVector63.toDiagonalMatrix();
        org.la4j.Vector vector67 = basicVector63.copyOfLength(10);
        double double68 = basicVector63.product();
        boolean boolean69 = columnMajorSparseMatrix15.equals((java.lang.Object) double68);
        org.la4j.Matrix matrix70 = columnMajorSparseMatrix15.transpose();
        ooPlaceMatrixByItsTransposeMultiplication0.ensureApplicableTo(matrix70);
        java.util.Random random74 = null;
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix75 = org.la4j.matrix.dense.Basic2DMatrix.random((int) (short) 0, 1, random74);
        org.la4j.Matrix matrix76 = ooPlaceMatrixByItsTransposeMultiplication0.apply((org.la4j.matrix.DenseMatrix) basic2DMatrix75);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix79 = new org.la4j.matrix.sparse.CRSMatrix((int) 'a', 10);
        ooPlaceMatrixByItsTransposeMultiplication0.ensureApplicableTo((org.la4j.Matrix) cRSMatrix79);
        org.junit.Assert.assertNotNull(cCSMatrix4);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator5);
        org.junit.Assert.assertNotNull(matrix6);
        org.junit.Assert.assertNotNull(cCSMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory17);
        org.junit.Assert.assertNotNull(basic1DMatrix18);
        org.junit.Assert.assertNotNull(cRSMatrix22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix27);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertNotNull(matrix29);
        org.junit.Assert.assertNotNull(cRSMatrix33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix38);
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertNotNull(matrix40);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix43);
        org.junit.Assert.assertNotNull(denseMatrix45);
        org.junit.Assert.assertNotNull(matrix46);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix50);
        org.junit.Assert.assertNotNull(matrix51);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertNotNull(vector56);
        org.junit.Assert.assertNotNull(matrix57);
        org.junit.Assert.assertNotNull(sparseMatrix58);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix59);
        org.junit.Assert.assertNotNull(matrix60);
        org.junit.Assert.assertNotNull(vector64);
        org.junit.Assert.assertNotNull(matrix65);
        org.junit.Assert.assertNotNull(vector67);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(matrix70);
        org.junit.Assert.assertNotNull(basic2DMatrix75);
        org.junit.Assert.assertNotNull(matrix76);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double4 = cRSMatrix3.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix8 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix9 = rowMajorSparseMatrix8.removeLastRow();
        org.la4j.Matrix matrix10 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, rowMajorSparseMatrix8);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition11 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix14 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double15 = cRSMatrix14.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix19 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix20 = rowMajorSparseMatrix19.removeLastRow();
        org.la4j.Matrix matrix21 = ooPlaceMatricesAddition11.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix14, rowMajorSparseMatrix19);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix24 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.matrix.DenseMatrix denseMatrix26 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix27 = ooPlaceMatricesAddition11.apply(columnMajorSparseMatrix24, denseMatrix26);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix31 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix32 = rowMajorSparseMatrix31.removeLastRow();
        double double36 = rowMajorSparseMatrix31.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        org.la4j.Vector vector37 = rowMajorSparseMatrix31.toRowVector();
        org.la4j.Matrix matrix38 = ooPlaceMatricesAddition0.apply(denseMatrix26, rowMajorSparseMatrix31);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix41 = org.la4j.matrix.RowMajorSparseMatrix.zero(0, (int) (short) 10);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix44 = new org.la4j.matrix.sparse.CCSMatrix((int) (byte) 1, (int) (byte) 0);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix48 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix49 = rowMajorSparseMatrix48.removeLastRow();
        org.la4j.matrix.functor.MatrixFunction matrixFunction51 = null;
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator52 = org.la4j.Matrices.asSumFunctionAccumulator((double) (-1), matrixFunction51);
        double double53 = matrix49.fold(matrixAccumulator52);
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure54 = org.la4j.Matrices.asAccumulatorProcedure(matrixAccumulator52);
        cCSMatrix44.eachNonZero(matrixProcedure54);
        org.la4j.Matrix matrix56 = ooPlaceMatricesAddition0.applySymmetric(rowMajorSparseMatrix41, (org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix44);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix59 = org.la4j.matrix.sparse.CRSMatrix.diagonal(0, (double) (short) 100);
        org.la4j.LinearAlgebra.SolverFactory solverFactory60 = org.la4j.LinearAlgebra.FORWARD_BACK_SUBSTITUTION;
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction61 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix64 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean65 = cCSMatrix64.isRowMajor();
        org.la4j.Matrix matrix68 = cCSMatrix64.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator69 = cCSMatrix64.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix73 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix75 = rowMajorSparseMatrix73.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix79 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double83 = rowMajorSparseMatrix79.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix84 = rowMajorSparseMatrix79.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct85 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean86 = sparseMatrix84.equals((java.lang.Object) ooPlaceOuterProduct85);
        org.la4j.Matrix matrix87 = rowMajorSparseMatrix73.hadamardProduct((org.la4j.Matrix) sparseMatrix84);
        org.la4j.Matrix matrix88 = ooPlaceMatricesSubtraction61.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix64, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix73);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator89 = cCSMatrix64.iterator();
        org.la4j.Matrix matrix92 = cCSMatrix64.blankOfShape(10, (int) '4');
        org.la4j.linear.LinearSystemSolver linearSystemSolver93 = solverFactory60.create((org.la4j.Matrix) cCSMatrix64);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix94 = cCSMatrix64.toRowMajorSparseMatrix();
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix95 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix59, (org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cRSMatrix3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(cRSMatrix14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix19);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix24);
        org.junit.Assert.assertNotNull(denseMatrix26);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix31);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(vector37);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix41);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix48);
        org.junit.Assert.assertNotNull(matrix49);
        org.junit.Assert.assertNotNull(matrixAccumulator52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertNotNull(matrixProcedure54);
        org.junit.Assert.assertNotNull(matrix56);
        org.junit.Assert.assertNotNull(cRSMatrix59);
        org.junit.Assert.assertNotNull(solverFactory60);
        org.junit.Assert.assertNotNull(cCSMatrix64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(matrix68);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator69);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix73);
        org.junit.Assert.assertNotNull(matrix75);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix79);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 1.0d + "'", double83 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(matrix87);
        org.junit.Assert.assertNotNull(matrix88);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator89);
        org.junit.Assert.assertNotNull(matrix92);
        org.junit.Assert.assertNotNull(linearSystemSolver93);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix94);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        java.util.Random random2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.randomSymmetric((int) (short) 100, 9.0d, random2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cardinality should be less then or equal to capacity: 10000.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix5 = rowMajorSparseMatrix4.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix7 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix8 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix4, denseMatrix7);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix11 = new org.la4j.matrix.sparse.CCSMatrix((int) (byte) 1, (int) (byte) 0);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix16 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator17 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray18 = cCSMatrix16.foldRows(vectorAccumulator17);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix19 = org.la4j.matrix.dense.Basic1DMatrix.from1DArray((int) (byte) 0, (int) (byte) 10, doubleArray18);
        double[][] doubleArray20 = basic1DMatrix19.toArray();
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix21 = new org.la4j.matrix.dense.Basic2DMatrix(doubleArray20);
        org.la4j.Matrix matrix24 = basic2DMatrix21.blankOfShape((int) '#', (int) ' ');
        org.la4j.vector.functor.VectorFunction vectorFunction27 = org.la4j.Vectors.asDivFunction((double) 10.0f);
        basic2DMatrix21.updateColumn((-1), vectorFunction27);
        org.la4j.Matrix matrix29 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix11, (org.la4j.matrix.DenseMatrix) basic2DMatrix21);
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction30 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix33 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean34 = cCSMatrix33.isRowMajor();
        org.la4j.Matrix matrix37 = cCSMatrix33.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator38 = cCSMatrix33.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix42 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix44 = rowMajorSparseMatrix42.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix48 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double52 = rowMajorSparseMatrix48.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix53 = rowMajorSparseMatrix48.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct54 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean55 = sparseMatrix53.equals((java.lang.Object) ooPlaceOuterProduct54);
        org.la4j.Matrix matrix56 = rowMajorSparseMatrix42.hadamardProduct((org.la4j.Matrix) sparseMatrix53);
        org.la4j.Matrix matrix57 = ooPlaceMatricesSubtraction30.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix33, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix42);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix61 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix63 = rowMajorSparseMatrix61.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix67 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double71 = rowMajorSparseMatrix67.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix72 = rowMajorSparseMatrix67.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct73 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean74 = sparseMatrix72.equals((java.lang.Object) ooPlaceOuterProduct73);
        org.la4j.Matrix matrix75 = rowMajorSparseMatrix61.hadamardProduct((org.la4j.Matrix) sparseMatrix72);
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator76 = org.la4j.Matrices.mkInfinityNormAccumulator();
        double double77 = sparseMatrix72.foldNonZero(matrixAccumulator76);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix81 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double85 = rowMajorSparseMatrix81.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix86 = rowMajorSparseMatrix81.toSparseMatrix();
        org.la4j.Matrix matrix87 = rowMajorSparseMatrix81.removeFirstColumn();
        org.la4j.Matrix matrix88 = ooPlaceMatricesSubtraction30.applySimple(sparseMatrix72, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix81);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix89 = matrix29.subtract((org.la4j.Matrix) rowMajorSparseMatrix81);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given matrices should have the same shape: 0x0 does not equal to 1x35.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix4);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(denseMatrix7);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(cCSMatrix16);
        org.junit.Assert.assertNotNull(vectorAccumulator17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(basic1DMatrix19);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertNotNull(matrix24);
        org.junit.Assert.assertNotNull(vectorFunction27);
        org.junit.Assert.assertNotNull(matrix29);
        org.junit.Assert.assertNotNull(cCSMatrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator38);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix42);
        org.junit.Assert.assertNotNull(matrix44);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix48);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(matrix56);
        org.junit.Assert.assertNotNull(matrix57);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix61);
        org.junit.Assert.assertNotNull(matrix63);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix67);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 1.0d + "'", double71 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(matrix75);
        org.junit.Assert.assertNotNull(matrixAccumulator76);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + Double.NEGATIVE_INFINITY + "'", double77 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix81);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 1.0d + "'", double85 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix86);
        org.junit.Assert.assertNotNull(matrix87);
        org.junit.Assert.assertNotNull(matrix88);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.identity((int) (byte) 0);
        org.la4j.Matrix matrix3 = ooPlaceMatrixByItsTransposeMultiplication0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix2);
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation4 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray11 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray18 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray25 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray32 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray39 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray40 = new double[][] { doubleArray11, doubleArray18, doubleArray25, doubleArray32, doubleArray39 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix41 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray40);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation42 = matrixMatrixMatrixOperation4.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix41);
        java.util.Spliterator<java.lang.Double> doubleSpliterator43 = basic2DMatrix41.spliterator();
        basic2DMatrix41.setAll((double) (byte) 10);
        ooPlaceMatrixByItsTransposeMultiplication0.ensureApplicableTo((org.la4j.Matrix) basic2DMatrix41);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix49 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double50 = cRSMatrix49.min();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix51 = cRSMatrix49.toColumnMajorSparseMatrix();
        org.la4j.Matrix matrix52 = ooPlaceMatrixByItsTransposeMultiplication0.apply(columnMajorSparseMatrix51);
        org.la4j.iterator.MatrixIterator matrixIterator53 = columnMajorSparseMatrix51.nonZeroIterator();
        org.junit.Assert.assertNotNull(cCSMatrix2);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertNotNull(basic2DMatrix41);
        org.junit.Assert.assertNotNull(matrixMatrixOperation42);
        org.junit.Assert.assertNotNull(doubleSpliterator43);
        org.junit.Assert.assertNotNull(cRSMatrix49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix51);
        org.junit.Assert.assertNotNull(matrix52);
        org.junit.Assert.assertNotNull(matrixIterator53);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct0 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix5 = rowMajorSparseMatrix4.removeLastRow();
        double double9 = rowMajorSparseMatrix4.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int10 = rowMajorSparseMatrix4.cardinality();
        org.la4j.Vector vector12 = rowMajorSparseMatrix4.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix15 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix16 = ooPlaceMatrixHadamardProduct0.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix4, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix15);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix20 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix21 = rowMajorSparseMatrix20.removeLastRow();
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure22 = null;
        rowMajorSparseMatrix20.eachNonZero(matrixProcedure22);
        double[][] doubleArray24 = new double[][] {};
        org.la4j.matrix.DenseMatrix denseMatrix25 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray24);
        org.la4j.Matrix matrix26 = ooPlaceMatrixHadamardProduct0.apply(rowMajorSparseMatrix20, denseMatrix25);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix29 = org.la4j.matrix.sparse.CCSMatrix.zero(0, 30);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator30 = cCSMatrix29.nonZeroColumnMajorIterator();
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction31 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix34 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean35 = cCSMatrix34.isRowMajor();
        org.la4j.Matrix matrix38 = cCSMatrix34.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator39 = cCSMatrix34.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix43 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix45 = rowMajorSparseMatrix43.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix49 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double53 = rowMajorSparseMatrix49.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix54 = rowMajorSparseMatrix49.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct55 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean56 = sparseMatrix54.equals((java.lang.Object) ooPlaceOuterProduct55);
        org.la4j.Matrix matrix57 = rowMajorSparseMatrix43.hadamardProduct((org.la4j.Matrix) sparseMatrix54);
        org.la4j.Matrix matrix58 = ooPlaceMatricesSubtraction31.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix34, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix43);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix60 = org.la4j.matrix.sparse.CRSMatrix.fromCSV("");
        org.la4j.matrix.DenseMatrix denseMatrix63 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        double double64 = denseMatrix63.min();
        org.la4j.Matrix matrix65 = ooPlaceMatricesSubtraction31.applySimple((org.la4j.matrix.SparseMatrix) cRSMatrix60, denseMatrix63);
        org.la4j.Matrix matrix66 = ooPlaceMatrixHadamardProduct0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix29, denseMatrix63);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix4);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(vector12);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix15);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertNotNull(denseMatrix25);
        org.junit.Assert.assertNotNull(matrix26);
        org.junit.Assert.assertNotNull(cCSMatrix29);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator30);
        org.junit.Assert.assertNotNull(cCSMatrix34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator39);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix43);
        org.junit.Assert.assertNotNull(matrix45);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix49);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(matrix57);
        org.junit.Assert.assertNotNull(matrix58);
        org.junit.Assert.assertNotNull(cRSMatrix60);
        org.junit.Assert.assertNotNull(denseMatrix63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + Double.POSITIVE_INFINITY + "'", double64 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(matrix65);
        org.junit.Assert.assertNotNull(matrix66);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) (byte) 1, (-1.0d));
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator3 = cCSMatrix2.nonZeroRowMajorIterator();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix6 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double7 = cRSMatrix6.min();
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator8 = cRSMatrix6.nonZeroRowMajorIterator();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix11 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double12 = cRSMatrix11.min();
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator13 = cRSMatrix11.nonZeroRowMajorIterator();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix16 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator17 = columnMajorSparseMatrix16.nonZeroIterator();
        org.la4j.iterator.MatrixIterator matrixIterator18 = rowMajorMatrixIterator13.orElseSubtract(matrixIterator17);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix21 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator22 = cCSMatrix21.nonZeroColumnMajorIterator();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix25 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean26 = cCSMatrix25.isRowMajor();
        org.la4j.Matrix matrix29 = cCSMatrix25.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator30 = cCSMatrix25.nonZeroColumnMajorIterator();
        org.la4j.iterator.MatrixIterator matrixIterator31 = columnMajorMatrixIterator22.andAlsoDivide((org.la4j.iterator.MatrixIterator) columnMajorMatrixIterator30);
        org.la4j.iterator.MatrixIterator matrixIterator32 = matrixIterator18.andAlsoMultiply(matrixIterator31);
        org.la4j.iterator.MatrixIterator matrixIterator33 = rowMajorMatrixIterator8.andAlsoDivide(matrixIterator18);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix36 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator37 = cCSMatrix36.nonZeroColumnMajorIterator();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix40 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean41 = cCSMatrix40.isRowMajor();
        org.la4j.Matrix matrix44 = cCSMatrix40.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator45 = cCSMatrix40.nonZeroColumnMajorIterator();
        org.la4j.iterator.MatrixIterator matrixIterator46 = columnMajorMatrixIterator37.andAlsoDivide((org.la4j.iterator.MatrixIterator) columnMajorMatrixIterator45);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix49 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean50 = cCSMatrix49.isRowMajor();
        org.la4j.Matrix matrix53 = cCSMatrix49.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator54 = cCSMatrix49.nonZeroColumnMajorIterator();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix57 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double58 = cRSMatrix57.min();
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator59 = cRSMatrix57.nonZeroRowMajorIterator();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix62 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator63 = columnMajorSparseMatrix62.nonZeroIterator();
        org.la4j.iterator.MatrixIterator matrixIterator64 = rowMajorMatrixIterator59.orElseSubtract(matrixIterator63);
        org.la4j.iterator.MatrixIterator matrixIterator65 = columnMajorMatrixIterator54.orElseAdd(matrixIterator63);
        org.la4j.iterator.MatrixIterator matrixIterator66 = columnMajorMatrixIterator37.andAlsoDivide(matrixIterator63);
        org.la4j.iterator.MatrixIterator matrixIterator67 = rowMajorMatrixIterator8.orElseAdd(matrixIterator66);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix70 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator71 = cRSMatrix70.nonZeroIterator();
        org.la4j.Vector vector73 = cRSMatrix70.getColumn(100);
        boolean boolean76 = cRSMatrix70.nonZeroAt(1, (int) (short) 0);
        org.la4j.decomposition.RawLUDecompositor rawLUDecompositor77 = new org.la4j.decomposition.RawLUDecompositor((org.la4j.Matrix) cRSMatrix70);
        org.la4j.Matrix matrix78 = rawLUDecompositor77.self();
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator79 = matrix78.columnMajorIterator();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix82 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator83 = cCSMatrix82.nonZeroColumnMajorIterator();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix86 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean87 = cCSMatrix86.isRowMajor();
        org.la4j.Matrix matrix90 = cCSMatrix86.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator91 = cCSMatrix86.nonZeroColumnMajorIterator();
        org.la4j.iterator.MatrixIterator matrixIterator92 = columnMajorMatrixIterator83.andAlsoDivide((org.la4j.iterator.MatrixIterator) columnMajorMatrixIterator91);
        org.la4j.iterator.MatrixIterator matrixIterator93 = columnMajorMatrixIterator79.orElseSubtract((org.la4j.iterator.MatrixIterator) columnMajorMatrixIterator91);
        org.la4j.iterator.MatrixIterator matrixIterator94 = rowMajorMatrixIterator8.andAlsoDivide(matrixIterator93);
        org.la4j.iterator.MatrixIterator matrixIterator95 = rowMajorMatrixIterator3.orElseSubtract(matrixIterator94);
        org.junit.Assert.assertNotNull(cCSMatrix2);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator3);
        org.junit.Assert.assertNotNull(cRSMatrix6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator8);
        org.junit.Assert.assertNotNull(cRSMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator13);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix16);
        org.junit.Assert.assertNotNull(matrixIterator17);
        org.junit.Assert.assertNotNull(matrixIterator18);
        org.junit.Assert.assertNotNull(cCSMatrix21);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator22);
        org.junit.Assert.assertNotNull(cCSMatrix25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(matrix29);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator30);
        org.junit.Assert.assertNotNull(matrixIterator31);
        org.junit.Assert.assertNotNull(matrixIterator32);
        org.junit.Assert.assertNotNull(matrixIterator33);
        org.junit.Assert.assertNotNull(cCSMatrix36);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator37);
        org.junit.Assert.assertNotNull(cCSMatrix40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(matrix44);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator45);
        org.junit.Assert.assertNotNull(matrixIterator46);
        org.junit.Assert.assertNotNull(cCSMatrix49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(matrix53);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator54);
        org.junit.Assert.assertNotNull(cRSMatrix57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator59);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix62);
        org.junit.Assert.assertNotNull(matrixIterator63);
        org.junit.Assert.assertNotNull(matrixIterator64);
        org.junit.Assert.assertNotNull(matrixIterator65);
        org.junit.Assert.assertNotNull(matrixIterator66);
        org.junit.Assert.assertNotNull(matrixIterator67);
        org.junit.Assert.assertNotNull(cRSMatrix70);
        org.junit.Assert.assertNotNull(matrixIterator71);
        org.junit.Assert.assertNotNull(vector73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(matrix78);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator79);
        org.junit.Assert.assertNotNull(cCSMatrix82);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator83);
        org.junit.Assert.assertNotNull(cCSMatrix86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(matrix90);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator91);
        org.junit.Assert.assertNotNull(matrixIterator92);
        org.junit.Assert.assertNotNull(matrixIterator93);
        org.junit.Assert.assertNotNull(matrixIterator94);
        org.junit.Assert.assertNotNull(matrixIterator95);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.la4j.operation.ooplace.OoPlaceKroneckerProduct ooPlaceKroneckerProduct0 = new org.la4j.operation.ooplace.OoPlaceKroneckerProduct();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate1 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix4 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        boolean boolean5 = advancedMatrixPredicate1.test((org.la4j.Matrix) columnMajorSparseMatrix4);
        org.la4j.vector.functor.VectorFunction vectorFunction7 = null;
        org.la4j.Matrix matrix8 = columnMajorSparseMatrix4.transformRow(0, vectorFunction7);
        org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix9 = new org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix13 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation14 = inPlaceCopyMatrixToMatrix9.partiallyApply(rowMajorSparseMatrix13);
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation15 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray22 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray29 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray36 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray43 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray50 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray51 = new double[][] { doubleArray22, doubleArray29, doubleArray36, doubleArray43, doubleArray50 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix52 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray51);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation53 = matrixMatrixMatrixOperation15.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix52);
        org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix54 = new org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix();
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction55 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix58 = org.la4j.matrix.dense.Basic2DMatrix.unit((int) (byte) 1, (int) '4');
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction59 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix62 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean63 = cCSMatrix62.isRowMajor();
        org.la4j.Matrix matrix66 = cCSMatrix62.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator67 = cCSMatrix62.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix71 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix73 = rowMajorSparseMatrix71.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix77 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double81 = rowMajorSparseMatrix77.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix82 = rowMajorSparseMatrix77.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct83 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean84 = sparseMatrix82.equals((java.lang.Object) ooPlaceOuterProduct83);
        org.la4j.Matrix matrix85 = rowMajorSparseMatrix71.hadamardProduct((org.la4j.Matrix) sparseMatrix82);
        org.la4j.Matrix matrix86 = ooPlaceMatricesSubtraction59.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix62, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix71);
        org.la4j.Matrix matrix87 = ooPlaceMatricesSubtraction55.apply((org.la4j.matrix.DenseMatrix) basic2DMatrix58, rowMajorSparseMatrix71);
        org.la4j.decomposition.SingularValueDecompositor singularValueDecompositor88 = new org.la4j.decomposition.SingularValueDecompositor((org.la4j.Matrix) rowMajorSparseMatrix71);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix90 = org.la4j.matrix.sparse.CRSMatrix.fromCSV("");
        org.la4j.Matrix matrix91 = inPlaceCopyMatrixToMatrix54.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix71, (org.la4j.matrix.SparseMatrix) cRSMatrix90);
        org.la4j.Matrix matrix92 = inPlaceCopyMatrixToMatrix9.apply((org.la4j.matrix.DenseMatrix) basic2DMatrix52, (org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix90);
        double[][] doubleArray93 = new double[][] {};
        org.la4j.matrix.DenseMatrix denseMatrix94 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray93);
        org.la4j.matrix.DenseMatrix denseMatrix95 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray93);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix96 = denseMatrix95.toRowMajorSparseMatrix();
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation97 = inPlaceCopyMatrixToMatrix9.partiallyApply(rowMajorSparseMatrix96);
        org.la4j.Matrix matrix98 = ooPlaceKroneckerProduct0.apply(columnMajorSparseMatrix4, rowMajorSparseMatrix96);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate1);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix13);
        org.junit.Assert.assertNotNull(matrixMatrixOperation14);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertNotNull(basic2DMatrix52);
        org.junit.Assert.assertNotNull(matrixMatrixOperation53);
        org.junit.Assert.assertNotNull(basic2DMatrix58);
        org.junit.Assert.assertNotNull(cCSMatrix62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(matrix66);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator67);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix71);
        org.junit.Assert.assertNotNull(matrix73);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix77);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 1.0d + "'", double81 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(matrix85);
        org.junit.Assert.assertNotNull(matrix86);
        org.junit.Assert.assertNotNull(matrix87);
        org.junit.Assert.assertNotNull(cRSMatrix90);
        org.junit.Assert.assertNotNull(matrix91);
        org.junit.Assert.assertNotNull(matrix92);
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertNotNull(denseMatrix94);
        org.junit.Assert.assertNotNull(denseMatrix95);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix96);
        org.junit.Assert.assertNotNull(matrixMatrixOperation97);
        org.junit.Assert.assertNotNull(matrix98);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.la4j.matrix.functor.MatrixFunction matrixFunction1 = org.la4j.Matrices.asMinusFunction((double) (byte) 10);
        org.junit.Assert.assertNotNull(matrixFunction1);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct0 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix5 = rowMajorSparseMatrix4.removeLastRow();
        double double9 = rowMajorSparseMatrix4.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int10 = rowMajorSparseMatrix4.cardinality();
        org.la4j.Vector vector12 = rowMajorSparseMatrix4.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix15 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix16 = ooPlaceMatrixHadamardProduct0.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix4, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix15);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix20 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix21 = rowMajorSparseMatrix20.removeLastRow();
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure22 = null;
        rowMajorSparseMatrix20.eachNonZero(matrixProcedure22);
        double[][] doubleArray24 = new double[][] {};
        org.la4j.matrix.DenseMatrix denseMatrix25 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray24);
        org.la4j.Matrix matrix26 = ooPlaceMatrixHadamardProduct0.apply(rowMajorSparseMatrix20, denseMatrix25);
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate27 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix30 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        boolean boolean31 = advancedMatrixPredicate27.test((org.la4j.Matrix) columnMajorSparseMatrix30);
        org.la4j.inversion.NoPivotGaussInverter noPivotGaussInverter32 = new org.la4j.inversion.NoPivotGaussInverter((org.la4j.Matrix) columnMajorSparseMatrix30);
        org.la4j.Matrix matrix33 = denseMatrix25.hadamardProduct((org.la4j.Matrix) columnMajorSparseMatrix30);
        org.la4j.vector.functor.VectorFunction vectorFunction36 = org.la4j.Vectors.asModFunction((double) (byte) 0);
        denseMatrix25.updateRow((int) (byte) 100, vectorFunction36);
        double double39 = denseMatrix25.maxInColumn(10);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix4);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(vector12);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix15);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertNotNull(denseMatrix25);
        org.junit.Assert.assertNotNull(matrix26);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate27);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(matrix33);
        org.junit.Assert.assertNotNull(vectorFunction36);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + Double.NEGATIVE_INFINITY + "'", double39 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix2 = org.la4j.matrix.dense.Basic2DMatrix.diagonal((int) (byte) 100, (double) (short) 10);
        org.la4j.decomposition.RawQRDecompositor rawQRDecompositor3 = new org.la4j.decomposition.RawQRDecompositor((org.la4j.Matrix) basic2DMatrix2);
        java.util.Random random6 = null;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix7 = org.la4j.matrix.dense.Basic1DMatrix.random((int) (short) 1, (int) (byte) 0, random6);
        boolean boolean8 = rawQRDecompositor3.applicableTo((org.la4j.Matrix) basic1DMatrix7);
        java.text.NumberFormat numberFormat9 = null;
        java.lang.String str10 = basic1DMatrix7.toCSV(numberFormat9);
        basic1DMatrix7.setAll((double) '#');
        org.junit.Assert.assertNotNull(basic2DMatrix2);
        org.junit.Assert.assertNotNull(basic1DMatrix7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct0 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix5 = rowMajorSparseMatrix4.removeLastRow();
        double double9 = rowMajorSparseMatrix4.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int10 = rowMajorSparseMatrix4.cardinality();
        org.la4j.Vector vector12 = rowMajorSparseMatrix4.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix15 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix16 = ooPlaceMatrixHadamardProduct0.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix4, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix15);
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate17 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix20 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        boolean boolean21 = advancedMatrixPredicate17.test((org.la4j.Matrix) columnMajorSparseMatrix20);
        org.la4j.vector.functor.VectorFunction vectorFunction23 = null;
        org.la4j.Matrix matrix24 = columnMajorSparseMatrix20.transformRow(0, vectorFunction23);
        org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix25 = new org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix();
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction26 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix29 = org.la4j.matrix.dense.Basic2DMatrix.unit((int) (byte) 1, (int) '4');
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction30 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix33 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean34 = cCSMatrix33.isRowMajor();
        org.la4j.Matrix matrix37 = cCSMatrix33.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator38 = cCSMatrix33.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix42 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix44 = rowMajorSparseMatrix42.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix48 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double52 = rowMajorSparseMatrix48.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix53 = rowMajorSparseMatrix48.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct54 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean55 = sparseMatrix53.equals((java.lang.Object) ooPlaceOuterProduct54);
        org.la4j.Matrix matrix56 = rowMajorSparseMatrix42.hadamardProduct((org.la4j.Matrix) sparseMatrix53);
        org.la4j.Matrix matrix57 = ooPlaceMatricesSubtraction30.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix33, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix42);
        org.la4j.Matrix matrix58 = ooPlaceMatricesSubtraction26.apply((org.la4j.matrix.DenseMatrix) basic2DMatrix29, rowMajorSparseMatrix42);
        org.la4j.decomposition.SingularValueDecompositor singularValueDecompositor59 = new org.la4j.decomposition.SingularValueDecompositor((org.la4j.Matrix) rowMajorSparseMatrix42);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix61 = org.la4j.matrix.sparse.CRSMatrix.fromCSV("");
        org.la4j.Matrix matrix62 = inPlaceCopyMatrixToMatrix25.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix42, (org.la4j.matrix.SparseMatrix) cRSMatrix61);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix66 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix67 = rowMajorSparseMatrix66.removeLastRow();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix71 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix73 = rowMajorSparseMatrix71.divide((double) (-1));
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory74 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix75 = matrix73.to(basic1DMatrixMatrixFactory74);
        org.la4j.Matrix matrix76 = inPlaceCopyMatrixToMatrix25.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix66, (org.la4j.matrix.DenseMatrix) basic1DMatrix75);
        org.la4j.Matrix matrix77 = ooPlaceMatrixHadamardProduct0.apply(columnMajorSparseMatrix20, (org.la4j.matrix.DenseMatrix) basic1DMatrix75);
        org.la4j.inversion.GaussJordanInverter gaussJordanInverter78 = new org.la4j.inversion.GaussJordanInverter(matrix77);
        org.la4j.linear.LeastSquaresSolver leastSquaresSolver79 = new org.la4j.linear.LeastSquaresSolver(matrix77);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix4);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(vector12);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix15);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate17);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(matrix24);
        org.junit.Assert.assertNotNull(basic2DMatrix29);
        org.junit.Assert.assertNotNull(cCSMatrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator38);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix42);
        org.junit.Assert.assertNotNull(matrix44);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix48);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(matrix56);
        org.junit.Assert.assertNotNull(matrix57);
        org.junit.Assert.assertNotNull(matrix58);
        org.junit.Assert.assertNotNull(cRSMatrix61);
        org.junit.Assert.assertNotNull(matrix62);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix66);
        org.junit.Assert.assertNotNull(matrix67);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix71);
        org.junit.Assert.assertNotNull(matrix73);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory74);
        org.junit.Assert.assertNotNull(basic1DMatrix75);
        org.junit.Assert.assertNotNull(matrix76);
        org.junit.Assert.assertNotNull(matrix77);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double8 = rowMajorSparseMatrix4.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix9 = rowMajorSparseMatrix4.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct10 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean11 = sparseMatrix9.equals((java.lang.Object) ooPlaceOuterProduct10);
        org.la4j.vector.dense.BasicVector basicVector13 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector14 = basicVector13.copy();
        org.la4j.Matrix matrix15 = basicVector13.toDiagonalMatrix();
        org.la4j.Vector vector17 = basicVector13.blankOfLength(52);
        org.la4j.vector.SparseVector sparseVector19 = org.la4j.vector.SparseVector.fromCSV("1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct20 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix25 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator26 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray27 = cCSMatrix25.foldRows(vectorAccumulator26);
        org.la4j.matrix.DenseMatrix denseMatrix28 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray27);
        org.la4j.vector.dense.BasicVector basicVector29 = new org.la4j.vector.dense.BasicVector(doubleArray27);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix34 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator35 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray36 = cCSMatrix34.foldRows(vectorAccumulator35);
        org.la4j.matrix.DenseMatrix denseMatrix37 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray36);
        org.la4j.vector.dense.BasicVector basicVector38 = new org.la4j.vector.dense.BasicVector(doubleArray36);
        ooPlaceOuterProduct20.ensureApplicableTo((org.la4j.Vector) basicVector29, (org.la4j.Vector) basicVector38);
        org.la4j.Matrix matrix40 = basicVector38.toColumnMatrix();
        org.la4j.Matrix matrix41 = sparseVector19.outerProduct((org.la4j.Vector) basicVector38);
        org.la4j.Matrix matrix42 = basicVector38.toRowMatrix();
        org.la4j.Matrix matrix43 = ooPlaceOuterProduct10.apply((org.la4j.vector.DenseVector) basicVector13, (org.la4j.vector.DenseVector) basicVector38);
        ooPlaceMatrixByItsTransposeMultiplication0.ensureApplicableTo(matrix43);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix47 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        double double50 = cCSMatrix47.get((int) (byte) 0, (int) (short) 1);
        org.la4j.Matrix matrix51 = ooPlaceMatrixByItsTransposeMultiplication0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix47);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertNotNull(vector17);
        org.junit.Assert.assertNotNull(sparseVector19);
        org.junit.Assert.assertNotNull(cCSMatrix25);
        org.junit.Assert.assertNotNull(vectorAccumulator26);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix28);
        org.junit.Assert.assertNotNull(cCSMatrix34);
        org.junit.Assert.assertNotNull(vectorAccumulator35);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix37);
        org.junit.Assert.assertNotNull(matrix40);
        org.junit.Assert.assertNotNull(matrix41);
        org.junit.Assert.assertNotNull(matrix42);
        org.junit.Assert.assertNotNull(matrix43);
        org.junit.Assert.assertNotNull(cCSMatrix47);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(matrix51);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix6 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator7 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray8 = cCSMatrix6.foldRows(vectorAccumulator7);
        org.la4j.matrix.DenseMatrix denseMatrix9 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix10 = org.la4j.matrix.ColumnMajorSparseMatrix.from1DArray((int) (short) 10, (int) (byte) 10, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 60");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix6);
        org.junit.Assert.assertNotNull(vectorAccumulator7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix9);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix3 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean4 = cCSMatrix3.isRowMajor();
        org.la4j.Matrix matrix7 = cCSMatrix3.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator8 = cCSMatrix3.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix12 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix14 = rowMajorSparseMatrix12.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix18 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double22 = rowMajorSparseMatrix18.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix23 = rowMajorSparseMatrix18.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct24 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean25 = sparseMatrix23.equals((java.lang.Object) ooPlaceOuterProduct24);
        org.la4j.Matrix matrix26 = rowMajorSparseMatrix12.hadamardProduct((org.la4j.Matrix) sparseMatrix23);
        org.la4j.Matrix matrix27 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix3, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix12);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix29 = org.la4j.matrix.sparse.CRSMatrix.fromCSV("");
        org.la4j.matrix.DenseMatrix denseMatrix32 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        double double33 = denseMatrix32.min();
        org.la4j.Matrix matrix34 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.SparseMatrix) cRSMatrix29, denseMatrix32);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix37 = org.la4j.matrix.sparse.CRSMatrix.zero(0, (int) (short) 0);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation38 = ooPlaceMatricesSubtraction0.partiallyApply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix37);
        org.la4j.vector.dense.BasicVector basicVector40 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix44 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double48 = rowMajorSparseMatrix44.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix49 = rowMajorSparseMatrix44.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct50 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean51 = sparseMatrix49.equals((java.lang.Object) ooPlaceOuterProduct50);
        org.la4j.vector.dense.BasicVector basicVector53 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector54 = basicVector53.copy();
        org.la4j.Matrix matrix55 = basicVector40.apply((org.la4j.operation.VectorVectorOperation<org.la4j.Matrix>) ooPlaceOuterProduct50, (org.la4j.Vector) basicVector53);
        // The following exception was thrown during execution in test generation
        try {
            matrixMatrixOperation38.ensureApplicableTo(matrix55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given matrices should have the same shape: 0x0 does not equal to 10x10.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator8);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(matrix26);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(cRSMatrix29);
        org.junit.Assert.assertNotNull(denseMatrix32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + Double.POSITIVE_INFINITY + "'", double33 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(matrix34);
        org.junit.Assert.assertNotNull(cRSMatrix37);
        org.junit.Assert.assertNotNull(matrixMatrixOperation38);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix44);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(vector54);
        org.junit.Assert.assertNotNull(matrix55);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.la4j.operation.ooplace.OoPlaceKroneckerProduct ooPlaceKroneckerProduct0 = new org.la4j.operation.ooplace.OoPlaceKroneckerProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.diagonal(100, 10.0d);
        org.la4j.iterator.VectorIterator vectorIterator5 = rowMajorSparseMatrix3.nonZeroIteratorOfRow(30);
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction6 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix10 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix11 = rowMajorSparseMatrix10.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix13 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix14 = ooPlaceMatricesSubtraction6.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix10, denseMatrix13);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix17 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double18 = columnMajorSparseMatrix17.determinant();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory19 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix20 = columnMajorSparseMatrix17.to(basic1DMatrixMatrixFactory19);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix24 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix25 = rowMajorSparseMatrix24.removeLastRow();
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure26 = null;
        rowMajorSparseMatrix24.eachNonZero(matrixProcedure26);
        org.la4j.Matrix matrix28 = ooPlaceMatricesSubtraction6.applySimple((org.la4j.matrix.DenseMatrix) basic1DMatrix20, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix24);
        org.la4j.Matrix matrix29 = basic1DMatrix20.shuffle();
        basic1DMatrix20.swapColumns(10, (int) (short) 100);
        org.la4j.Matrix matrix35 = basic1DMatrix20.copyOfShape(30, (int) (short) 100);
        org.la4j.Matrix matrix36 = ooPlaceKroneckerProduct0.apply(rowMajorSparseMatrix3, (org.la4j.matrix.DenseMatrix) basic1DMatrix20);
        java.util.Random random39 = null;
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix40 = org.la4j.matrix.ColumnMajorSparseMatrix.randomSymmetric((int) (short) 100, Double.NaN, random39);
        org.la4j.matrix.DenseMatrix denseMatrix43 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) 10);
        org.la4j.Matrix matrix44 = ooPlaceKroneckerProduct0.apply(columnMajorSparseMatrix40, denseMatrix43);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix47 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator48 = cRSMatrix47.nonZeroIterator();
        org.la4j.Vector vector50 = cRSMatrix47.getColumn(100);
        boolean boolean53 = cRSMatrix47.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator55 = cRSMatrix47.nonZeroIteratorOfColumn((-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix56 = cRSMatrix47.toRowMajorSparseMatrix();
        java.util.Iterator<java.lang.Integer> intItor57 = cRSMatrix47.iteratorOfNonZeroRows();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix61 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double65 = rowMajorSparseMatrix61.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.iterator.VectorIterator vectorIterator67 = rowMajorSparseMatrix61.nonZeroIteratorOfRow((int) (byte) 0);
        double double68 = rowMajorSparseMatrix61.norm();
        org.la4j.Matrix matrix69 = ooPlaceKroneckerProduct0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix47, rowMajorSparseMatrix61);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertNotNull(vectorIterator5);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix10);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(denseMatrix13);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory19);
        org.junit.Assert.assertNotNull(basic1DMatrix20);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix24);
        org.junit.Assert.assertNotNull(matrix25);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertNotNull(matrix29);
        org.junit.Assert.assertNotNull(matrix35);
        org.junit.Assert.assertNotNull(matrix36);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix40);
        org.junit.Assert.assertNotNull(denseMatrix43);
        org.junit.Assert.assertNotNull(matrix44);
        org.junit.Assert.assertNotNull(cRSMatrix47);
        org.junit.Assert.assertNotNull(matrixIterator48);
        org.junit.Assert.assertNotNull(vector50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(vectorIterator55);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix56);
        org.junit.Assert.assertNotNull(intItor57);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix61);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 1.0d + "'", double65 == 1.0d);
        org.junit.Assert.assertNotNull(vectorIterator67);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertNotNull(matrix69);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix5 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator6 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray7 = cCSMatrix5.foldRows(vectorAccumulator6);
        org.la4j.matrix.DenseMatrix denseMatrix8 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray7);
        org.la4j.vector.dense.BasicVector basicVector10 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector11 = ooPlaceMatrixByVectorMultiplication0.apply(denseMatrix8, (org.la4j.vector.DenseVector) basicVector10);
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation12 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray19 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray26 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray33 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray40 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray47 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray48 = new double[][] { doubleArray19, doubleArray26, doubleArray33, doubleArray40, doubleArray47 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix49 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray48);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation50 = matrixMatrixMatrixOperation12.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix49);
        org.la4j.operation.VectorOperation<org.la4j.Vector> vectorVectorOperation51 = ooPlaceMatrixByVectorMultiplication0.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix49);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix54 = org.la4j.matrix.sparse.CRSMatrix.zero((int) (byte) 0, (int) (short) 1);
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator55 = cRSMatrix54.nonZeroRowMajorIterator();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct56 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random58 = null;
        org.la4j.vector.DenseVector denseVector59 = org.la4j.vector.DenseVector.random(0, random58);
        java.util.Random random61 = null;
        org.la4j.vector.DenseVector denseVector62 = org.la4j.vector.DenseVector.random(0, random61);
        org.la4j.Matrix matrix63 = ooPlaceOuterProduct56.apply(denseVector59, denseVector62);
        java.text.NumberFormat numberFormat64 = null;
        java.lang.String str65 = denseVector62.toCSV(numberFormat64);
        org.la4j.Vector vector66 = ooPlaceMatrixByVectorMultiplication0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix54, denseVector62);
        cRSMatrix54.setAll((double) (short) 1);
        org.junit.Assert.assertNotNull(cCSMatrix5);
        org.junit.Assert.assertNotNull(vectorAccumulator6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix8);
        org.junit.Assert.assertNotNull(vector11);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation12);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(basic2DMatrix49);
        org.junit.Assert.assertNotNull(matrixMatrixOperation50);
        org.junit.Assert.assertNotNull(vectorVectorOperation51);
        org.junit.Assert.assertNotNull(cRSMatrix54);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator55);
        org.junit.Assert.assertNotNull(denseVector59);
        org.junit.Assert.assertNotNull(denseVector62);
        org.junit.Assert.assertNotNull(matrix63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(vector66);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication();
        org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication1 = new org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix4 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator5 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray6 = cCSMatrix4.foldRows(vectorAccumulator5);
        org.la4j.Matrix matrix7 = ooPlaceMatrixByItsTransposeMultiplication1.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix4);
        org.la4j.operation.VectorOperation<org.la4j.Vector> vectorVectorOperation8 = ooPlaceMatrixByVectorMultiplication0.partiallyApply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix4);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix12 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double16 = rowMajorSparseMatrix12.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix17 = rowMajorSparseMatrix12.toSparseMatrix();
        org.la4j.Matrix matrix18 = rowMajorSparseMatrix12.removeFirstColumn();
        org.la4j.Matrix matrix20 = matrix18.copyOfColumns((int) ' ');
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix23 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean26 = cCSMatrix23.nonZeroAt((int) ' ', (int) '#');
        org.la4j.Vector vector28 = cCSMatrix23.getRow(1);
        // The following exception was thrown during execution in test generation
        try {
            ooPlaceMatrixByVectorMultiplication0.ensureApplicableTo(matrix20, vector28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given vector should have the same length as number of columns in the given matrix: 52 does not equal to 32.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix4);
        org.junit.Assert.assertNotNull(vectorAccumulator5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(vectorVectorOperation8);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix17);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(cCSMatrix23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(vector28);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator3 = cRSMatrix2.nonZeroIterator();
        org.la4j.Vector vector5 = cRSMatrix2.getColumn(100);
        boolean boolean8 = cRSMatrix2.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator10 = cRSMatrix2.nonZeroIteratorOfColumn((-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix11 = cRSMatrix2.toRowMajorSparseMatrix();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory12 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix13 = cRSMatrix2.to(basic1DMatrixMatrixFactory12);
        org.la4j.linear.SquareRootSolver squareRootSolver14 = new org.la4j.linear.SquareRootSolver((org.la4j.Matrix) basic1DMatrix13);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition15 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix18 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double19 = cRSMatrix18.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix23 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix24 = rowMajorSparseMatrix23.removeLastRow();
        org.la4j.Matrix matrix25 = ooPlaceMatricesAddition15.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix18, rowMajorSparseMatrix23);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition26 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix29 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double30 = cRSMatrix29.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix34 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix35 = rowMajorSparseMatrix34.removeLastRow();
        org.la4j.Matrix matrix36 = ooPlaceMatricesAddition26.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix29, rowMajorSparseMatrix34);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix39 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.matrix.DenseMatrix denseMatrix41 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix42 = ooPlaceMatricesAddition26.apply(columnMajorSparseMatrix39, denseMatrix41);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix46 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix47 = rowMajorSparseMatrix46.removeLastRow();
        double double51 = rowMajorSparseMatrix46.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        org.la4j.Vector vector52 = rowMajorSparseMatrix46.toRowVector();
        org.la4j.Matrix matrix53 = ooPlaceMatricesAddition15.apply(denseMatrix41, rowMajorSparseMatrix46);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix56 = org.la4j.matrix.RowMajorSparseMatrix.zero(0, (int) (short) 10);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix59 = new org.la4j.matrix.sparse.CCSMatrix((int) (byte) 1, (int) (byte) 0);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix63 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix64 = rowMajorSparseMatrix63.removeLastRow();
        org.la4j.matrix.functor.MatrixFunction matrixFunction66 = null;
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator67 = org.la4j.Matrices.asSumFunctionAccumulator((double) (-1), matrixFunction66);
        double double68 = matrix64.fold(matrixAccumulator67);
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure69 = org.la4j.Matrices.asAccumulatorProcedure(matrixAccumulator67);
        cCSMatrix59.eachNonZero(matrixProcedure69);
        org.la4j.Matrix matrix71 = ooPlaceMatricesAddition15.applySymmetric(rowMajorSparseMatrix56, (org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix59);
        boolean boolean72 = squareRootSolver14.applicableTo((org.la4j.Matrix) cCSMatrix59);
        org.la4j.decomposition.SingularValueDecompositor singularValueDecompositor73 = new org.la4j.decomposition.SingularValueDecompositor((org.la4j.Matrix) cCSMatrix59);
        org.la4j.LinearAlgebra.InverterFactory inverterFactory74 = org.la4j.LinearAlgebra.InverterFactory.SMART;
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix77 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean78 = cCSMatrix77.isRowMajor();
        org.la4j.Matrix matrix81 = cCSMatrix77.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.inversion.MatrixInverter matrixInverter82 = inverterFactory74.create(matrix81);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix85 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        byte[] byteArray86 = cRSMatrix85.toBinary();
        org.la4j.Matrix matrix88 = cRSMatrix85.blankOfRows((int) (short) 1);
        org.la4j.inversion.MatrixInverter matrixInverter89 = inverterFactory74.create((org.la4j.Matrix) cRSMatrix85);
        org.la4j.Matrix matrix92 = cRSMatrix85.blankOfShape(1, 10);
        boolean boolean93 = singularValueDecompositor73.applicableTo(matrix92);
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertNotNull(matrixIterator3);
        org.junit.Assert.assertNotNull(vector5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(vectorIterator10);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix11);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory12);
        org.junit.Assert.assertNotNull(basic1DMatrix13);
        org.junit.Assert.assertNotNull(cRSMatrix18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix23);
        org.junit.Assert.assertNotNull(matrix24);
        org.junit.Assert.assertNotNull(matrix25);
        org.junit.Assert.assertNotNull(cRSMatrix29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix34);
        org.junit.Assert.assertNotNull(matrix35);
        org.junit.Assert.assertNotNull(matrix36);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix39);
        org.junit.Assert.assertNotNull(denseMatrix41);
        org.junit.Assert.assertNotNull(matrix42);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix46);
        org.junit.Assert.assertNotNull(matrix47);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertNotNull(vector52);
        org.junit.Assert.assertNotNull(matrix53);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix56);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix63);
        org.junit.Assert.assertNotNull(matrix64);
        org.junit.Assert.assertNotNull(matrixAccumulator67);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1.0d) + "'", double68 == (-1.0d));
        org.junit.Assert.assertNotNull(matrixProcedure69);
        org.junit.Assert.assertNotNull(matrix71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(inverterFactory74);
        org.junit.Assert.assertNotNull(cCSMatrix77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(matrix81);
        org.junit.Assert.assertNotNull(matrixInverter82);
        org.junit.Assert.assertNotNull(cRSMatrix85);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray86), "[32, 0, 0, 0, 10, 0, 0, 0, 10, 0, 0, 0, 10, 0, 0, 0, 0, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 0, 3, 0, 0, 0, 4, 0, 0, 0, 5, 0, 0, 0, 6, 0, 0, 0, 7, 0, 0, 0, 8, 0, 0, 0, 9, 0, 0, 0, 10]");
        org.junit.Assert.assertNotNull(matrix88);
        org.junit.Assert.assertNotNull(matrixInverter89);
        org.junit.Assert.assertNotNull(matrix92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.la4j.vector.functor.VectorPredicate vectorPredicate0 = org.la4j.Vectors.POSITIVE_VECTOR;
        org.junit.Assert.assertNotNull(vectorPredicate0);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.la4j.vector.sparse.CompressedVector compressedVector1 = new org.la4j.vector.sparse.CompressedVector((int) (short) 0);
        byte[] byteArray2 = compressedVector1.toBinary();
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix3 = org.la4j.matrix.dense.Basic2DMatrix.fromBinary(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix4 = org.la4j.matrix.dense.Basic1DMatrix.fromBinary(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not decode Basic1DMatrix from the given byte array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[16, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(basic2DMatrix3);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.la4j.vector.SparseVector sparseVector2 = org.la4j.vector.SparseVector.zero(0, 52);
        double double3 = sparseVector2.sum();
        org.junit.Assert.assertNotNull(sparseVector2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix6 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator7 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray8 = cCSMatrix6.foldRows(vectorAccumulator7);
        int[] intArray11 = new int[] { (short) 10, (short) 100 };
        org.la4j.vector.sparse.CompressedVector compressedVector12 = new org.la4j.vector.sparse.CompressedVector((int) (short) 1, 1, doubleArray8, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix13 = org.la4j.matrix.ColumnMajorSparseMatrix.from1DArray((-1), 6, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrong matrix dimensions: -1x6");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix6);
        org.junit.Assert.assertNotNull(vectorAccumulator7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 100]");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator0 = org.la4j.Matrices.mkManhattanNormAccumulator();
        matrixAccumulator0.update((int) (byte) 100, (int) (short) 1, (-0.0d));
        org.junit.Assert.assertNotNull(matrixAccumulator0);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.la4j.matrix.DenseMatrix denseMatrix2 = org.la4j.matrix.DenseMatrix.diagonal(19, 1.0E10d);
        org.junit.Assert.assertNotNull(denseMatrix2);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix1 = org.la4j.matrix.sparse.CCSMatrix.identity((int) (short) 100);
        org.la4j.iterator.VectorIterator vectorIterator3 = cCSMatrix1.nonZeroIteratorOfRow(1);
        org.junit.Assert.assertNotNull(cCSMatrix1);
        org.junit.Assert.assertNotNull(vectorIterator3);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication();
        org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication1 = new org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix4 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator5 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray6 = cCSMatrix4.foldRows(vectorAccumulator5);
        org.la4j.Matrix matrix7 = ooPlaceMatrixByItsTransposeMultiplication1.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix4);
        org.la4j.operation.VectorOperation<org.la4j.Vector> vectorVectorOperation8 = ooPlaceMatrixByVectorMultiplication0.partiallyApply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix4);
        double double12 = cCSMatrix4.getOrElse(30, (int) (byte) 0, (double) 10L);
        org.junit.Assert.assertNotNull(cCSMatrix4);
        org.junit.Assert.assertNotNull(vectorAccumulator5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(vectorVectorOperation8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.zero(100, (int) (short) 100);
        org.la4j.Matrix matrix4 = cRSMatrix2.multiply((double) 100);
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction5 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix9 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix10 = rowMajorSparseMatrix9.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix12 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix13 = ooPlaceMatricesSubtraction5.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix9, denseMatrix12);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix16 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double17 = columnMajorSparseMatrix16.determinant();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory18 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix19 = columnMajorSparseMatrix16.to(basic1DMatrixMatrixFactory18);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix23 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix24 = rowMajorSparseMatrix23.removeLastRow();
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure25 = null;
        rowMajorSparseMatrix23.eachNonZero(matrixProcedure25);
        org.la4j.Matrix matrix27 = ooPlaceMatricesSubtraction5.applySimple((org.la4j.matrix.DenseMatrix) basic1DMatrix19, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix23);
        org.la4j.Matrix matrix28 = basic1DMatrix19.shuffle();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix31 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator32 = cRSMatrix31.nonZeroIterator();
        org.la4j.Vector vector34 = cRSMatrix31.getColumn(100);
        boolean boolean37 = cRSMatrix31.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator39 = cRSMatrix31.nonZeroIteratorOfColumn((-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix40 = cRSMatrix31.toRowMajorSparseMatrix();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory41 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix42 = cRSMatrix31.to(basic1DMatrixMatrixFactory41);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix43 = matrix28.to(basic1DMatrixMatrixFactory41);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix44 = cRSMatrix2.to(basic1DMatrixMatrixFactory41);
        basic1DMatrix44.setAll((-100.0d));
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(denseMatrix12);
        org.junit.Assert.assertNotNull(matrix13);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory18);
        org.junit.Assert.assertNotNull(basic1DMatrix19);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix23);
        org.junit.Assert.assertNotNull(matrix24);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertNotNull(cRSMatrix31);
        org.junit.Assert.assertNotNull(matrixIterator32);
        org.junit.Assert.assertNotNull(vector34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(vectorIterator39);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix40);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory41);
        org.junit.Assert.assertNotNull(basic1DMatrix42);
        org.junit.Assert.assertNotNull(basic1DMatrix43);
        org.junit.Assert.assertNotNull(basic1DMatrix44);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double3 = cRSMatrix2.min();
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator4 = cRSMatrix2.nonZeroRowMajorIterator();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix7 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator8 = cCSMatrix7.nonZeroColumnMajorIterator();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix11 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean12 = cCSMatrix11.isRowMajor();
        org.la4j.Matrix matrix15 = cCSMatrix11.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator16 = cCSMatrix11.nonZeroColumnMajorIterator();
        org.la4j.iterator.MatrixIterator matrixIterator17 = columnMajorMatrixIterator8.andAlsoDivide((org.la4j.iterator.MatrixIterator) columnMajorMatrixIterator16);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix20 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator21 = columnMajorSparseMatrix20.nonZeroIterator();
        org.la4j.iterator.MatrixIterator matrixIterator22 = columnMajorMatrixIterator8.andAlsoMultiply(matrixIterator21);
        org.la4j.iterator.MatrixIterator matrixIterator23 = rowMajorMatrixIterator4.orElseSubtract(matrixIterator22);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix26 = org.la4j.matrix.sparse.CCSMatrix.zero((int) (byte) 10, (int) (byte) 1);
        cCSMatrix26.setAll((double) (-1L));
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator29 = cCSMatrix26.nonZeroColumnMajorIterator();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix32 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double33 = cRSMatrix32.min();
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator34 = cRSMatrix32.nonZeroRowMajorIterator();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix37 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double38 = cRSMatrix37.min();
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator39 = cRSMatrix37.nonZeroRowMajorIterator();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix42 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator43 = columnMajorSparseMatrix42.nonZeroIterator();
        org.la4j.iterator.MatrixIterator matrixIterator44 = rowMajorMatrixIterator39.orElseSubtract(matrixIterator43);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix47 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator48 = cCSMatrix47.nonZeroColumnMajorIterator();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix51 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean52 = cCSMatrix51.isRowMajor();
        org.la4j.Matrix matrix55 = cCSMatrix51.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator56 = cCSMatrix51.nonZeroColumnMajorIterator();
        org.la4j.iterator.MatrixIterator matrixIterator57 = columnMajorMatrixIterator48.andAlsoDivide((org.la4j.iterator.MatrixIterator) columnMajorMatrixIterator56);
        org.la4j.iterator.MatrixIterator matrixIterator58 = matrixIterator44.andAlsoMultiply(matrixIterator57);
        org.la4j.iterator.MatrixIterator matrixIterator59 = rowMajorMatrixIterator34.andAlsoDivide(matrixIterator44);
        org.la4j.iterator.MatrixIterator matrixIterator60 = columnMajorMatrixIterator29.orElseAdd((org.la4j.iterator.MatrixIterator) rowMajorMatrixIterator34);
        org.la4j.iterator.MatrixIterator matrixIterator61 = rowMajorMatrixIterator4.andAlsoMultiply((org.la4j.iterator.MatrixIterator) columnMajorMatrixIterator29);
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction62 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix66 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix67 = rowMajorSparseMatrix66.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix69 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix70 = ooPlaceMatricesSubtraction62.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix66, denseMatrix69);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix73 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double74 = columnMajorSparseMatrix73.determinant();
        org.la4j.matrix.DenseMatrix denseMatrix77 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        double double78 = denseMatrix77.min();
        double double79 = denseMatrix77.sum();
        org.la4j.Matrix matrix80 = ooPlaceMatricesSubtraction62.apply(columnMajorSparseMatrix73, denseMatrix77);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix83 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator84 = cRSMatrix83.nonZeroIterator();
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation85 = ooPlaceMatricesSubtraction62.partiallyApply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix83);
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator86 = cRSMatrix83.nonZeroRowMajorIterator();
        org.la4j.iterator.MatrixIterator matrixIterator87 = rowMajorMatrixIterator4.andAlsoMultiply((org.la4j.iterator.MatrixIterator) rowMajorMatrixIterator86);
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator4);
        org.junit.Assert.assertNotNull(cCSMatrix7);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator8);
        org.junit.Assert.assertNotNull(cCSMatrix11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator16);
        org.junit.Assert.assertNotNull(matrixIterator17);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix20);
        org.junit.Assert.assertNotNull(matrixIterator21);
        org.junit.Assert.assertNotNull(matrixIterator22);
        org.junit.Assert.assertNotNull(matrixIterator23);
        org.junit.Assert.assertNotNull(cCSMatrix26);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator29);
        org.junit.Assert.assertNotNull(cRSMatrix32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator34);
        org.junit.Assert.assertNotNull(cRSMatrix37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator39);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix42);
        org.junit.Assert.assertNotNull(matrixIterator43);
        org.junit.Assert.assertNotNull(matrixIterator44);
        org.junit.Assert.assertNotNull(cCSMatrix47);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator48);
        org.junit.Assert.assertNotNull(cCSMatrix51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(matrix55);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator56);
        org.junit.Assert.assertNotNull(matrixIterator57);
        org.junit.Assert.assertNotNull(matrixIterator58);
        org.junit.Assert.assertNotNull(matrixIterator59);
        org.junit.Assert.assertNotNull(matrixIterator60);
        org.junit.Assert.assertNotNull(matrixIterator61);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix66);
        org.junit.Assert.assertNotNull(matrix67);
        org.junit.Assert.assertNotNull(denseMatrix69);
        org.junit.Assert.assertNotNull(matrix70);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix73);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertNotNull(denseMatrix77);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + Double.POSITIVE_INFINITY + "'", double78 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertNotNull(matrix80);
        org.junit.Assert.assertNotNull(cRSMatrix83);
        org.junit.Assert.assertNotNull(matrixIterator84);
        org.junit.Assert.assertNotNull(matrixMatrixOperation85);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator86);
        org.junit.Assert.assertNotNull(matrixIterator87);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation5 = inPlaceCopyMatrixToMatrix0.partiallyApply(rowMajorSparseMatrix4);
        org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication6 = new org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix9 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator10 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray11 = cCSMatrix9.foldRows(vectorAccumulator10);
        org.la4j.Matrix matrix12 = ooPlaceMatrixByItsTransposeMultiplication6.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix9);
        double double14 = cCSMatrix9.minInColumn(0);
        org.la4j.iterator.MatrixIterator matrixIterator15 = cCSMatrix9.nonZeroIterator();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix18 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator19 = cRSMatrix18.nonZeroIterator();
        org.la4j.Vector vector21 = cRSMatrix18.getColumn(100);
        boolean boolean24 = cRSMatrix18.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator26 = cRSMatrix18.nonZeroIteratorOfColumn((-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix27 = cRSMatrix18.toRowMajorSparseMatrix();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory28 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix29 = cRSMatrix18.to(basic1DMatrixMatrixFactory28);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix30 = cCSMatrix9.to(basic1DMatrixMatrixFactory28);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix32 = org.la4j.matrix.ColumnMajorSparseMatrix.identity((int) '#');
        org.la4j.Matrix matrix33 = inPlaceCopyMatrixToMatrix0.apply((org.la4j.matrix.DenseMatrix) basic1DMatrix30, columnMajorSparseMatrix32);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix4);
        org.junit.Assert.assertNotNull(matrixMatrixOperation5);
        org.junit.Assert.assertNotNull(cCSMatrix9);
        org.junit.Assert.assertNotNull(vectorAccumulator10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(matrix12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(matrixIterator15);
        org.junit.Assert.assertNotNull(cRSMatrix18);
        org.junit.Assert.assertNotNull(matrixIterator19);
        org.junit.Assert.assertNotNull(vector21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(vectorIterator26);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix27);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory28);
        org.junit.Assert.assertNotNull(basic1DMatrix29);
        org.junit.Assert.assertNotNull(basic1DMatrix30);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix32);
        org.junit.Assert.assertNotNull(matrix33);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix1 = org.la4j.matrix.sparse.CCSMatrix.fromCSV("1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000");
        java.util.Random random5 = null;
        org.la4j.vector.sparse.CompressedVector compressedVector6 = org.la4j.vector.sparse.CompressedVector.random((int) (byte) 10, (double) (short) 0, random5);
        double double7 = compressedVector6.max();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix11 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double15 = rowMajorSparseMatrix11.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix16 = rowMajorSparseMatrix11.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate17 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean18 = sparseMatrix16.is(advancedMatrixPredicate17);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator20 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double21 = sparseMatrix16.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator20);
        org.la4j.vector.functor.VectorProcedure vectorProcedure22 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator20);
        org.la4j.vector.functor.VectorProcedure vectorProcedure23 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator20);
        compressedVector6.eachNonZero(vectorProcedure23);
        cCSMatrix1.eachNonZeroInColumn(6, vectorProcedure23);
        org.junit.Assert.assertNotNull(cCSMatrix1);
        org.junit.Assert.assertNotNull(compressedVector6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix16);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(vectorAccumulator20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(vectorProcedure22);
        org.junit.Assert.assertNotNull(vectorProcedure23);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct0 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix5 = rowMajorSparseMatrix4.removeLastRow();
        double double9 = rowMajorSparseMatrix4.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int10 = rowMajorSparseMatrix4.cardinality();
        org.la4j.Vector vector12 = rowMajorSparseMatrix4.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix15 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix16 = ooPlaceMatrixHadamardProduct0.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix4, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix15);
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate17 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix20 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        boolean boolean21 = advancedMatrixPredicate17.test((org.la4j.Matrix) columnMajorSparseMatrix20);
        org.la4j.vector.functor.VectorFunction vectorFunction23 = null;
        org.la4j.Matrix matrix24 = columnMajorSparseMatrix20.transformRow(0, vectorFunction23);
        org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix25 = new org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix();
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction26 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix29 = org.la4j.matrix.dense.Basic2DMatrix.unit((int) (byte) 1, (int) '4');
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction30 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix33 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean34 = cCSMatrix33.isRowMajor();
        org.la4j.Matrix matrix37 = cCSMatrix33.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator38 = cCSMatrix33.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix42 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix44 = rowMajorSparseMatrix42.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix48 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double52 = rowMajorSparseMatrix48.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix53 = rowMajorSparseMatrix48.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct54 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean55 = sparseMatrix53.equals((java.lang.Object) ooPlaceOuterProduct54);
        org.la4j.Matrix matrix56 = rowMajorSparseMatrix42.hadamardProduct((org.la4j.Matrix) sparseMatrix53);
        org.la4j.Matrix matrix57 = ooPlaceMatricesSubtraction30.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix33, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix42);
        org.la4j.Matrix matrix58 = ooPlaceMatricesSubtraction26.apply((org.la4j.matrix.DenseMatrix) basic2DMatrix29, rowMajorSparseMatrix42);
        org.la4j.decomposition.SingularValueDecompositor singularValueDecompositor59 = new org.la4j.decomposition.SingularValueDecompositor((org.la4j.Matrix) rowMajorSparseMatrix42);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix61 = org.la4j.matrix.sparse.CRSMatrix.fromCSV("");
        org.la4j.Matrix matrix62 = inPlaceCopyMatrixToMatrix25.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix42, (org.la4j.matrix.SparseMatrix) cRSMatrix61);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix66 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix67 = rowMajorSparseMatrix66.removeLastRow();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix71 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix73 = rowMajorSparseMatrix71.divide((double) (-1));
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory74 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix75 = matrix73.to(basic1DMatrixMatrixFactory74);
        org.la4j.Matrix matrix76 = inPlaceCopyMatrixToMatrix25.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix66, (org.la4j.matrix.DenseMatrix) basic1DMatrix75);
        org.la4j.Matrix matrix77 = ooPlaceMatrixHadamardProduct0.apply(columnMajorSparseMatrix20, (org.la4j.matrix.DenseMatrix) basic1DMatrix75);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix80 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator81 = cRSMatrix80.nonZeroIterator();
        org.la4j.Vector vector83 = cRSMatrix80.getColumn(100);
        boolean boolean86 = cRSMatrix80.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator88 = cRSMatrix80.nonZeroIteratorOfColumn((-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix89 = cRSMatrix80.toRowMajorSparseMatrix();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory90 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix91 = cRSMatrix80.to(basic1DMatrixMatrixFactory90);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix92 = basic1DMatrix75.to(basic1DMatrixMatrixFactory90);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix93 = basic1DMatrix75.toRowMajorSparseMatrix();
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix4);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(vector12);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix15);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate17);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(matrix24);
        org.junit.Assert.assertNotNull(basic2DMatrix29);
        org.junit.Assert.assertNotNull(cCSMatrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator38);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix42);
        org.junit.Assert.assertNotNull(matrix44);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix48);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(matrix56);
        org.junit.Assert.assertNotNull(matrix57);
        org.junit.Assert.assertNotNull(matrix58);
        org.junit.Assert.assertNotNull(cRSMatrix61);
        org.junit.Assert.assertNotNull(matrix62);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix66);
        org.junit.Assert.assertNotNull(matrix67);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix71);
        org.junit.Assert.assertNotNull(matrix73);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory74);
        org.junit.Assert.assertNotNull(basic1DMatrix75);
        org.junit.Assert.assertNotNull(matrix76);
        org.junit.Assert.assertNotNull(matrix77);
        org.junit.Assert.assertNotNull(cRSMatrix80);
        org.junit.Assert.assertNotNull(matrixIterator81);
        org.junit.Assert.assertNotNull(vector83);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(vectorIterator88);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix89);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory90);
        org.junit.Assert.assertNotNull(basic1DMatrix91);
        org.junit.Assert.assertNotNull(basic1DMatrix92);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix93);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix5 = rowMajorSparseMatrix4.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix7 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix8 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix4, denseMatrix7);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix11 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double12 = columnMajorSparseMatrix11.determinant();
        org.la4j.matrix.DenseMatrix denseMatrix15 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        double double16 = denseMatrix15.min();
        double double17 = denseMatrix15.sum();
        org.la4j.Matrix matrix18 = ooPlaceMatricesSubtraction0.apply(columnMajorSparseMatrix11, denseMatrix15);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix21 = org.la4j.matrix.ColumnMajorSparseMatrix.diagonal(1, (double) (short) -1);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix24 = new org.la4j.matrix.sparse.CRSMatrix((int) (short) 10, 30);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix28 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix30 = rowMajorSparseMatrix28.divide((double) (-1));
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory31 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix32 = matrix30.to(basic1DMatrixMatrixFactory31);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix33 = cRSMatrix24.to(basic1DMatrixMatrixFactory31);
        org.la4j.Matrix matrix34 = ooPlaceMatricesSubtraction0.apply(columnMajorSparseMatrix21, (org.la4j.matrix.DenseMatrix) basic1DMatrix33);
        org.la4j.vector.sparse.CompressedVector compressedVector37 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        double double38 = compressedVector37.euclideanNorm();
        java.text.NumberFormat numberFormat39 = null;
        java.lang.String str40 = compressedVector37.toMatrixMarket(numberFormat39);
        java.lang.String str41 = compressedVector37.toString();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct42 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix47 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator48 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray49 = cCSMatrix47.foldRows(vectorAccumulator48);
        org.la4j.matrix.DenseMatrix denseMatrix50 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray49);
        org.la4j.vector.dense.BasicVector basicVector51 = new org.la4j.vector.dense.BasicVector(doubleArray49);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix56 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator57 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray58 = cCSMatrix56.foldRows(vectorAccumulator57);
        org.la4j.matrix.DenseMatrix denseMatrix59 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray58);
        org.la4j.vector.dense.BasicVector basicVector60 = new org.la4j.vector.dense.BasicVector(doubleArray58);
        ooPlaceOuterProduct42.ensureApplicableTo((org.la4j.Vector) basicVector51, (org.la4j.Vector) basicVector60);
        org.la4j.vector.sparse.CompressedVector compressedVector63 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector63.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector68 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix69 = ooPlaceOuterProduct42.apply((org.la4j.vector.SparseVector) compressedVector63, (org.la4j.vector.SparseVector) compressedVector68);
        org.la4j.vector.functor.VectorFunction vectorFunction71 = org.la4j.Vectors.INC_FUNCTION;
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator72 = org.la4j.Vectors.asProductFunctionAccumulator((double) (byte) 100, vectorFunction71);
        double double73 = compressedVector63.fold(vectorAccumulator72);
        org.la4j.vector.functor.VectorProcedure vectorProcedure74 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator72);
        compressedVector37.eachNonZero(vectorProcedure74);
        vectorProcedure74.apply((int) (short) 10, (-11.0d));
        columnMajorSparseMatrix21.eachNonZeroInRow(52, vectorProcedure74);
        org.la4j.Matrix matrix80 = columnMajorSparseMatrix21.rotate();
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix4);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(denseMatrix7);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(denseMatrix15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.POSITIVE_INFINITY + "'", double16 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix21);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix28);
        org.junit.Assert.assertNotNull(matrix30);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory31);
        org.junit.Assert.assertNotNull(basic1DMatrix32);
        org.junit.Assert.assertNotNull(basic1DMatrix33);
        org.junit.Assert.assertNotNull(matrix34);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "%%MatrixMarket vector coordinate real\n32 0\n" + "'", str40, "%%MatrixMarket vector coordinate real\n32 0\n");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000" + "'", str41, "0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000 0,000");
        org.junit.Assert.assertNotNull(cCSMatrix47);
        org.junit.Assert.assertNotNull(vectorAccumulator48);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix50);
        org.junit.Assert.assertNotNull(cCSMatrix56);
        org.junit.Assert.assertNotNull(vectorAccumulator57);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix59);
        org.junit.Assert.assertNotNull(matrix69);
        org.junit.Assert.assertNotNull(vectorFunction71);
        org.junit.Assert.assertNotNull(vectorAccumulator72);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 100.0d + "'", double73 == 100.0d);
        org.junit.Assert.assertNotNull(vectorProcedure74);
        org.junit.Assert.assertNotNull(matrix80);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.la4j.operation.ooplace.OoPlaceVectorHadamardProduct ooPlaceVectorHadamardProduct0 = new org.la4j.operation.ooplace.OoPlaceVectorHadamardProduct();
        org.la4j.vector.SparseVector sparseVector3 = org.la4j.vector.SparseVector.zero(0, 52);
        org.la4j.Matrix matrix4 = sparseVector3.toColumnMatrix();
        org.la4j.Vector vector6 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str7 = vector6.toCSV();
        org.la4j.vector.SparseVector sparseVector8 = vector6.toSparseVector();
        org.la4j.Vector vector9 = ooPlaceVectorHadamardProduct0.apply(sparseVector3, sparseVector8);
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct10 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random12 = null;
        org.la4j.vector.DenseVector denseVector13 = org.la4j.vector.DenseVector.random(0, random12);
        java.util.Random random15 = null;
        org.la4j.vector.DenseVector denseVector16 = org.la4j.vector.DenseVector.random(0, random15);
        org.la4j.Matrix matrix17 = ooPlaceOuterProduct10.apply(denseVector13, denseVector16);
        org.la4j.vector.SparseVector sparseVector18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector19 = ooPlaceVectorHadamardProduct0.apply(denseVector13, sparseVector18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(sparseVector3);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertNotNull(vector6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000" + "'", str7, "1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000");
        org.junit.Assert.assertNotNull(sparseVector8);
        org.junit.Assert.assertNotNull(vector9);
        org.junit.Assert.assertNotNull(denseVector13);
        org.junit.Assert.assertNotNull(denseVector16);
        org.junit.Assert.assertNotNull(matrix17);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = new org.la4j.matrix.sparse.CCSMatrix((int) (byte) 1, (int) (byte) 0);
        org.la4j.Vector vector4 = cCSMatrix2.getRow((int) ' ');
        org.la4j.vector.DenseVector denseVector5 = vector4.toDenseVector();
        org.junit.Assert.assertNotNull(vector4);
        org.junit.Assert.assertNotNull(denseVector5);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double4 = cRSMatrix3.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix8 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix9 = rowMajorSparseMatrix8.removeLastRow();
        org.la4j.Matrix matrix10 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, rowMajorSparseMatrix8);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition11 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix14 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double15 = cRSMatrix14.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix19 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix20 = rowMajorSparseMatrix19.removeLastRow();
        org.la4j.Matrix matrix21 = ooPlaceMatricesAddition11.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix14, rowMajorSparseMatrix19);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix24 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.matrix.DenseMatrix denseMatrix26 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix27 = ooPlaceMatricesAddition11.apply(columnMajorSparseMatrix24, denseMatrix26);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix31 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix32 = rowMajorSparseMatrix31.removeLastRow();
        double double36 = rowMajorSparseMatrix31.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        org.la4j.Vector vector37 = rowMajorSparseMatrix31.toRowVector();
        org.la4j.Matrix matrix38 = ooPlaceMatricesAddition0.apply(denseMatrix26, rowMajorSparseMatrix31);
        org.la4j.matrix.SparseMatrix sparseMatrix39 = denseMatrix26.toSparseMatrix();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix40 = denseMatrix26.toRowMajorSparseMatrix();
        org.la4j.Matrix matrix42 = denseMatrix26.blankOfRows((int) (short) 0);
        org.la4j.Matrix matrix44 = denseMatrix26.subtract((double) 10);
        org.la4j.Matrix matrix45 = matrix44.removeLastRow();
        org.junit.Assert.assertNotNull(cRSMatrix3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(cRSMatrix14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix19);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix24);
        org.junit.Assert.assertNotNull(denseMatrix26);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix31);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(vector37);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(sparseMatrix39);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix40);
        org.junit.Assert.assertNotNull(matrix42);
        org.junit.Assert.assertNotNull(matrix44);
        org.junit.Assert.assertNotNull(matrix45);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.la4j.vector.sparse.CompressedVector compressedVector1 = org.la4j.vector.sparse.CompressedVector.zero((int) 'a');
        boolean boolean3 = compressedVector1.isZeroAt((int) (short) 100);
        org.junit.Assert.assertNotNull(compressedVector1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.la4j.operation.ooplace.OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatricesMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix3 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator4 = cCSMatrix3.nonZeroColumnMajorIterator();
        org.la4j.Matrix matrix5 = cCSMatrix3.transpose();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix8 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean9 = cCSMatrix8.isRowMajor();
        org.la4j.Matrix matrix10 = cCSMatrix8.transpose();
        ooPlaceMatricesMultiplication0.ensureApplicableTo((org.la4j.Matrix) cCSMatrix3, matrix10);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix13 = org.la4j.matrix.sparse.CCSMatrix.fromCSV("");
        org.la4j.Matrix matrix16 = cCSMatrix13.blankOfShape((int) (byte) 100, (int) '#');
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix19 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        byte[] byteArray20 = cRSMatrix19.toBinary();
        org.la4j.Matrix matrix21 = ooPlaceMatricesMultiplication0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix13, (org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix19);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix25 = org.la4j.matrix.sparse.CCSMatrix.zero((int) (byte) 1, (int) '4', (int) (short) 1);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix26 = cCSMatrix25.toColumnMajorSparseMatrix();
        double double28 = columnMajorSparseMatrix26.maxInColumn((int) (short) 10);
        double[][] doubleArray29 = new double[][] {};
        org.la4j.matrix.DenseMatrix denseMatrix30 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray29);
        org.la4j.matrix.DenseMatrix denseMatrix31 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray29);
        org.la4j.Matrix matrix32 = ooPlaceMatricesMultiplication0.apply(columnMajorSparseMatrix26, denseMatrix31);
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct34 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix39 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator40 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray41 = cCSMatrix39.foldRows(vectorAccumulator40);
        org.la4j.matrix.DenseMatrix denseMatrix42 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray41);
        org.la4j.vector.dense.BasicVector basicVector43 = new org.la4j.vector.dense.BasicVector(doubleArray41);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix48 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator49 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray50 = cCSMatrix48.foldRows(vectorAccumulator49);
        org.la4j.matrix.DenseMatrix denseMatrix51 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray50);
        org.la4j.vector.dense.BasicVector basicVector52 = new org.la4j.vector.dense.BasicVector(doubleArray50);
        ooPlaceOuterProduct34.ensureApplicableTo((org.la4j.Vector) basicVector43, (org.la4j.Vector) basicVector52);
        org.la4j.vector.sparse.CompressedVector compressedVector55 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector55.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector60 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix61 = ooPlaceOuterProduct34.apply((org.la4j.vector.SparseVector) compressedVector55, (org.la4j.vector.SparseVector) compressedVector60);
        double double62 = compressedVector60.min();
        org.la4j.Vector vector63 = compressedVector60.blank();
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix64 = denseMatrix31.insertRow(5, vector63);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Illegal row number, must be 0..0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix3);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator4);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(cCSMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(cCSMatrix13);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(cRSMatrix19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[32, 0, 0, 0, 10, 0, 0, 0, 10, 0, 0, 0, 10, 0, 0, 0, 0, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 64, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 0, 3, 0, 0, 0, 4, 0, 0, 0, 5, 0, 0, 0, 6, 0, 0, 0, 7, 0, 0, 0, 8, 0, 0, 0, 9, 0, 0, 0, 10]");
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(cCSMatrix25);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNotNull(denseMatrix30);
        org.junit.Assert.assertNotNull(denseMatrix31);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertNotNull(cCSMatrix39);
        org.junit.Assert.assertNotNull(vectorAccumulator40);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix42);
        org.junit.Assert.assertNotNull(cCSMatrix48);
        org.junit.Assert.assertNotNull(vectorAccumulator49);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix51);
        org.junit.Assert.assertNotNull(matrix61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(vector63);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix2 = org.la4j.matrix.dense.Basic1DMatrix.unit((int) (byte) 10, (int) (byte) 0);
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory3 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix4 = basic1DMatrix2.to(basic1DMatrixMatrixFactory3);
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation5 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray12 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray19 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray26 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray33 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray40 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray41 = new double[][] { doubleArray12, doubleArray19, doubleArray26, doubleArray33, doubleArray40 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix42 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray41);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation43 = matrixMatrixMatrixOperation5.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix42);
        org.la4j.Matrix matrix45 = basic2DMatrix42.blankOfColumns(52);
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate46 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean47 = matrix45.is(advancedMatrixPredicate46);
        boolean boolean48 = basic1DMatrix4.is(advancedMatrixPredicate46);
        // The following exception was thrown during execution in test generation
        try {
            basic1DMatrix4.swapColumns((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(basic1DMatrix2);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory3);
        org.junit.Assert.assertNotNull(basic1DMatrix4);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation5);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertNotNull(basic2DMatrix42);
        org.junit.Assert.assertNotNull(matrixMatrixOperation43);
        org.junit.Assert.assertNotNull(matrix45);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct0 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix5 = rowMajorSparseMatrix4.removeLastRow();
        double double9 = rowMajorSparseMatrix4.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int10 = rowMajorSparseMatrix4.cardinality();
        org.la4j.Vector vector12 = rowMajorSparseMatrix4.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix15 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix16 = ooPlaceMatrixHadamardProduct0.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix4, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix15);
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct17 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix21 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix22 = rowMajorSparseMatrix21.removeLastRow();
        double double26 = rowMajorSparseMatrix21.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int27 = rowMajorSparseMatrix21.cardinality();
        org.la4j.Vector vector29 = rowMajorSparseMatrix21.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix32 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix33 = ooPlaceMatrixHadamardProduct17.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix21, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix32);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix37 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix38 = rowMajorSparseMatrix37.removeLastRow();
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure39 = null;
        rowMajorSparseMatrix37.eachNonZero(matrixProcedure39);
        double[][] doubleArray41 = new double[][] {};
        org.la4j.matrix.DenseMatrix denseMatrix42 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray41);
        org.la4j.Matrix matrix43 = ooPlaceMatrixHadamardProduct17.apply(rowMajorSparseMatrix37, denseMatrix42);
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate44 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix47 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        boolean boolean48 = advancedMatrixPredicate44.test((org.la4j.Matrix) columnMajorSparseMatrix47);
        org.la4j.inversion.NoPivotGaussInverter noPivotGaussInverter49 = new org.la4j.inversion.NoPivotGaussInverter((org.la4j.Matrix) columnMajorSparseMatrix47);
        org.la4j.Matrix matrix50 = denseMatrix42.hadamardProduct((org.la4j.Matrix) columnMajorSparseMatrix47);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition51 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix54 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double55 = cRSMatrix54.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix59 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix60 = rowMajorSparseMatrix59.removeLastRow();
        org.la4j.Matrix matrix61 = ooPlaceMatricesAddition51.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix54, rowMajorSparseMatrix59);
        org.la4j.Matrix matrix62 = ooPlaceMatrixHadamardProduct0.applySymmetric(denseMatrix42, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix59);
        java.lang.String str63 = rowMajorSparseMatrix59.toMatrixMarket();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct65 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix70 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator71 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray72 = cCSMatrix70.foldRows(vectorAccumulator71);
        org.la4j.matrix.DenseMatrix denseMatrix73 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray72);
        org.la4j.vector.dense.BasicVector basicVector74 = new org.la4j.vector.dense.BasicVector(doubleArray72);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix79 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator80 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray81 = cCSMatrix79.foldRows(vectorAccumulator80);
        org.la4j.matrix.DenseMatrix denseMatrix82 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray81);
        org.la4j.vector.dense.BasicVector basicVector83 = new org.la4j.vector.dense.BasicVector(doubleArray81);
        ooPlaceOuterProduct65.ensureApplicableTo((org.la4j.Vector) basicVector74, (org.la4j.Vector) basicVector83);
        org.la4j.vector.sparse.CompressedVector compressedVector86 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector86.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector91 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix92 = ooPlaceOuterProduct65.apply((org.la4j.vector.SparseVector) compressedVector86, (org.la4j.vector.SparseVector) compressedVector91);
        org.la4j.vector.functor.VectorFunction vectorFunction94 = org.la4j.Vectors.INC_FUNCTION;
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator95 = org.la4j.Vectors.asProductFunctionAccumulator((double) (byte) 100, vectorFunction94);
        double double96 = compressedVector86.fold(vectorAccumulator95);
        // The following exception was thrown during execution in test generation
        try {
            rowMajorSparseMatrix59.setColumn(10, (org.la4j.Vector) compressedVector86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrong vector length: 32. Should be: 1.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix4);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(vector12);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix15);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix21);
        org.junit.Assert.assertNotNull(matrix22);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(vector29);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix32);
        org.junit.Assert.assertNotNull(matrix33);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix37);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertNotNull(denseMatrix42);
        org.junit.Assert.assertNotNull(matrix43);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate44);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(matrix50);
        org.junit.Assert.assertNotNull(cRSMatrix54);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix59);
        org.junit.Assert.assertNotNull(matrix60);
        org.junit.Assert.assertNotNull(matrix61);
        org.junit.Assert.assertNotNull(matrix62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "%%MatrixMarket matrix coordinate real general row-major\n1 35 0\n" + "'", str63, "%%MatrixMarket matrix coordinate real general row-major\n1 35 0\n");
        org.junit.Assert.assertNotNull(cCSMatrix70);
        org.junit.Assert.assertNotNull(vectorAccumulator71);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix73);
        org.junit.Assert.assertNotNull(cCSMatrix79);
        org.junit.Assert.assertNotNull(vectorAccumulator80);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix82);
        org.junit.Assert.assertNotNull(matrix92);
        org.junit.Assert.assertNotNull(vectorFunction94);
        org.junit.Assert.assertNotNull(vectorAccumulator95);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 100.0d + "'", double96 == 100.0d);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator3 = cRSMatrix2.nonZeroIterator();
        org.la4j.Vector vector5 = cRSMatrix2.getColumn(100);
        boolean boolean8 = cRSMatrix2.nonZeroAt(1, (int) (short) 0);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix11 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator12 = cRSMatrix11.nonZeroIterator();
        org.la4j.Vector vector14 = cRSMatrix11.getColumn(100);
        boolean boolean17 = cRSMatrix11.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator19 = cRSMatrix11.nonZeroIteratorOfColumn((-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix20 = cRSMatrix11.toRowMajorSparseMatrix();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory21 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix22 = cRSMatrix11.to(basic1DMatrixMatrixFactory21);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix23 = cRSMatrix2.to(basic1DMatrixMatrixFactory21);
        org.la4j.Matrix matrix26 = basic1DMatrix23.copyOfShape(0, (int) (short) 10);
        org.la4j.Matrix matrix29 = basic1DMatrix23.blankOfShape(0, (int) '4');
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertNotNull(matrixIterator3);
        org.junit.Assert.assertNotNull(vector5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cRSMatrix11);
        org.junit.Assert.assertNotNull(matrixIterator12);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(vectorIterator19);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix20);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory21);
        org.junit.Assert.assertNotNull(basic1DMatrix22);
        org.junit.Assert.assertNotNull(basic1DMatrix23);
        org.junit.Assert.assertNotNull(matrix26);
        org.junit.Assert.assertNotNull(matrix29);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.la4j.Vector vector1 = org.la4j.Vector.unit((int) (short) 10);
        org.la4j.vector.functor.VectorFunction vectorFunction3 = org.la4j.Vectors.asMinusFunction((double) (byte) 100);
        org.la4j.Vector vector4 = vector1.transform(vectorFunction3);
        double double5 = vector1.product();
        org.la4j.vector.DenseVector denseVector6 = vector1.toDenseVector();
        org.la4j.vector.DenseVector denseVector8 = org.la4j.vector.DenseVector.unit(0);
        java.text.NumberFormat numberFormat9 = null;
        java.lang.String str10 = denseVector8.toMatrixMarket(numberFormat9);
        org.la4j.iterator.VectorIterator vectorIterator11 = denseVector8.iterator();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix14 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator15 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray16 = cCSMatrix14.foldRows(vectorAccumulator15);
        org.la4j.vector.dense.BasicVector basicVector17 = org.la4j.vector.dense.BasicVector.fromArray(doubleArray16);
        org.la4j.Matrix matrix18 = basicVector17.toRowMatrix();
        org.la4j.vector.functor.VectorPredicate vectorPredicate19 = org.la4j.Vectors.ZERO_VECTOR;
        boolean boolean20 = basicVector17.non(vectorPredicate19);
        boolean boolean21 = denseVector8.is(vectorPredicate19);
        boolean boolean24 = vectorPredicate19.test((int) ' ', 1.0E100d);
        boolean boolean25 = vector1.non(vectorPredicate19);
        org.junit.Assert.assertNotNull(vector1);
        org.junit.Assert.assertNotNull(vectorFunction3);
        org.junit.Assert.assertNotNull(vector4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(denseVector6);
        org.junit.Assert.assertNotNull(denseVector8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "%%MatrixMarket vector array real\n0\n" + "'", str10, "%%MatrixMarket vector array real\n0\n");
        org.junit.Assert.assertNotNull(vectorIterator11);
        org.junit.Assert.assertNotNull(cCSMatrix14);
        org.junit.Assert.assertNotNull(vectorAccumulator15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(basicVector17);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertNotNull(vectorPredicate19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        java.util.Random random2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.vector.sparse.CompressedVector compressedVector3 = org.la4j.vector.sparse.CompressedVector.random((int) (byte) -1, 1.0E10d, random2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The density value should be between 0 and 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.la4j.LinearAlgebra.DecompositorFactory decompositorFactory0 = org.la4j.LinearAlgebra.DecompositorFactory.RAW_LU;
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix4 = org.la4j.matrix.sparse.CCSMatrix.zero((int) (byte) 1, (int) '4', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.decomposition.MatrixDecompositor matrixDecompositor5 = decompositorFactory0.create((org.la4j.Matrix) cCSMatrix4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given matrix can not be used with this decompositor.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(decompositorFactory0);
        org.junit.Assert.assertNotNull(cCSMatrix4);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.la4j.matrix.DenseMatrix denseMatrix3 = org.la4j.matrix.DenseMatrix.constant(6, (int) '4', 1.0E100d);
        org.junit.Assert.assertNotNull(denseMatrix3);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate0 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix3 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        boolean boolean4 = advancedMatrixPredicate0.test((org.la4j.Matrix) columnMajorSparseMatrix3);
        org.la4j.inversion.NoPivotGaussInverter noPivotGaussInverter5 = new org.la4j.inversion.NoPivotGaussInverter((org.la4j.Matrix) columnMajorSparseMatrix3);
        org.la4j.Matrix matrix6 = noPivotGaussInverter5.inverse();
        org.la4j.Matrix matrix7 = noPivotGaussInverter5.inverse();
        org.la4j.Matrix matrix8 = noPivotGaussInverter5.inverse();
        org.junit.Assert.assertNotNull(advancedMatrixPredicate0);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(matrix6);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(matrix8);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix1 = org.la4j.matrix.dense.Basic2DMatrix.identity((int) 'a');
        org.la4j.inversion.GaussJordanInverter gaussJordanInverter2 = new org.la4j.inversion.GaussJordanInverter((org.la4j.Matrix) basic2DMatrix1);
        org.la4j.Matrix matrix3 = gaussJordanInverter2.self();
        org.la4j.Matrix matrix4 = gaussJordanInverter2.self();
        org.la4j.Matrix matrix6 = matrix4.power((int) (short) 1);
        org.junit.Assert.assertNotNull(basic2DMatrix1);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertNotNull(matrix6);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator3 = cRSMatrix2.nonZeroIterator();
        org.la4j.Vector vector5 = cRSMatrix2.getColumn(100);
        boolean boolean8 = cRSMatrix2.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator10 = cRSMatrix2.nonZeroIteratorOfColumn((-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix11 = cRSMatrix2.toRowMajorSparseMatrix();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory12 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix13 = cRSMatrix2.to(basic1DMatrixMatrixFactory12);
        java.lang.Class<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixClass14 = basic1DMatrixMatrixFactory12.outputClass;
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertNotNull(matrixIterator3);
        org.junit.Assert.assertNotNull(vector5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(vectorIterator10);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix11);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory12);
        org.junit.Assert.assertNotNull(basic1DMatrix13);
        org.junit.Assert.assertNotNull(basic1DMatrixClass14);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix5 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator6 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray7 = cCSMatrix5.foldRows(vectorAccumulator6);
        org.la4j.matrix.DenseMatrix denseMatrix8 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray7);
        org.la4j.vector.dense.BasicVector basicVector9 = new org.la4j.vector.dense.BasicVector(doubleArray7);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix14 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator15 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray16 = cCSMatrix14.foldRows(vectorAccumulator15);
        org.la4j.matrix.DenseMatrix denseMatrix17 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray16);
        org.la4j.vector.dense.BasicVector basicVector18 = new org.la4j.vector.dense.BasicVector(doubleArray16);
        ooPlaceOuterProduct0.ensureApplicableTo((org.la4j.Vector) basicVector9, (org.la4j.Vector) basicVector18);
        org.la4j.vector.sparse.CompressedVector compressedVector21 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector21.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector26 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix27 = ooPlaceOuterProduct0.apply((org.la4j.vector.SparseVector) compressedVector21, (org.la4j.vector.SparseVector) compressedVector26);
        org.la4j.Matrix matrix28 = compressedVector26.toDiagonalMatrix();
        org.la4j.iterator.VectorIterator vectorIterator29 = compressedVector26.nonZeroIterator();
        org.junit.Assert.assertNotNull(cCSMatrix5);
        org.junit.Assert.assertNotNull(vectorAccumulator6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix8);
        org.junit.Assert.assertNotNull(cCSMatrix14);
        org.junit.Assert.assertNotNull(vectorAccumulator15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix17);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertNotNull(vectorIterator29);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        double double5 = cCSMatrix2.get((int) (byte) 0, (int) (short) 1);
        org.la4j.vector.functor.VectorFunction vectorFunction7 = org.la4j.Vectors.DEC_FUNCTION;
        org.la4j.Matrix matrix8 = cCSMatrix2.transformRow(10, vectorFunction7);
        boolean boolean11 = cCSMatrix2.nonZeroAt(10, (int) (byte) 1);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator12 = cCSMatrix2.nonZeroColumnMajorIterator();
        int int13 = columnMajorMatrixIterator12.columnIndex();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix16 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean17 = cCSMatrix16.isRowMajor();
        org.la4j.Matrix matrix20 = cCSMatrix16.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator21 = cCSMatrix16.nonZeroColumnMajorIterator();
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator22 = cCSMatrix16.iterator();
        org.la4j.iterator.MatrixIterator matrixIterator23 = columnMajorMatrixIterator12.orElseSubtract((org.la4j.iterator.MatrixIterator) columnMajorMatrixIterator22);
        org.junit.Assert.assertNotNull(cCSMatrix2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(vectorFunction7);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(cCSMatrix16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator21);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator22);
        org.junit.Assert.assertNotNull(matrixIterator23);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.la4j.operation.ooplace.OoPlaceKroneckerProduct ooPlaceKroneckerProduct0 = new org.la4j.operation.ooplace.OoPlaceKroneckerProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.diagonal(100, 10.0d);
        org.la4j.iterator.VectorIterator vectorIterator5 = rowMajorSparseMatrix3.nonZeroIteratorOfRow(30);
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction6 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix10 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix11 = rowMajorSparseMatrix10.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix13 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix14 = ooPlaceMatricesSubtraction6.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix10, denseMatrix13);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix17 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double18 = columnMajorSparseMatrix17.determinant();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory19 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix20 = columnMajorSparseMatrix17.to(basic1DMatrixMatrixFactory19);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix24 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix25 = rowMajorSparseMatrix24.removeLastRow();
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure26 = null;
        rowMajorSparseMatrix24.eachNonZero(matrixProcedure26);
        org.la4j.Matrix matrix28 = ooPlaceMatricesSubtraction6.applySimple((org.la4j.matrix.DenseMatrix) basic1DMatrix20, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix24);
        org.la4j.Matrix matrix29 = basic1DMatrix20.shuffle();
        basic1DMatrix20.swapColumns(10, (int) (short) 100);
        org.la4j.Matrix matrix35 = basic1DMatrix20.copyOfShape(30, (int) (short) 100);
        org.la4j.Matrix matrix36 = ooPlaceKroneckerProduct0.apply(rowMajorSparseMatrix3, (org.la4j.matrix.DenseMatrix) basic1DMatrix20);
        org.la4j.vector.functor.VectorFunction vectorFunction39 = org.la4j.Vectors.asPlusFunction(7.211102550927978d);
        org.la4j.Matrix matrix40 = matrix36.transformColumn(0, vectorFunction39);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertNotNull(vectorIterator5);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix10);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(denseMatrix13);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory19);
        org.junit.Assert.assertNotNull(basic1DMatrix20);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix24);
        org.junit.Assert.assertNotNull(matrix25);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertNotNull(matrix29);
        org.junit.Assert.assertNotNull(matrix35);
        org.junit.Assert.assertNotNull(matrix36);
        org.junit.Assert.assertNotNull(vectorFunction39);
        org.junit.Assert.assertNotNull(matrix40);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix5 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator6 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray7 = cCSMatrix5.foldRows(vectorAccumulator6);
        org.la4j.matrix.DenseMatrix denseMatrix8 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray7);
        org.la4j.vector.dense.BasicVector basicVector10 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector11 = ooPlaceMatrixByVectorMultiplication0.apply(denseMatrix8, (org.la4j.vector.DenseVector) basicVector10);
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation12 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray19 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray26 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray33 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray40 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray47 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray48 = new double[][] { doubleArray19, doubleArray26, doubleArray33, doubleArray40, doubleArray47 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix49 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray48);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation50 = matrixMatrixMatrixOperation12.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix49);
        org.la4j.operation.VectorOperation<org.la4j.Vector> vectorVectorOperation51 = ooPlaceMatrixByVectorMultiplication0.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix49);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix54 = org.la4j.matrix.sparse.CRSMatrix.zero((int) (byte) 0, (int) (short) 1);
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator55 = cRSMatrix54.nonZeroRowMajorIterator();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct56 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random58 = null;
        org.la4j.vector.DenseVector denseVector59 = org.la4j.vector.DenseVector.random(0, random58);
        java.util.Random random61 = null;
        org.la4j.vector.DenseVector denseVector62 = org.la4j.vector.DenseVector.random(0, random61);
        org.la4j.Matrix matrix63 = ooPlaceOuterProduct56.apply(denseVector59, denseVector62);
        java.text.NumberFormat numberFormat64 = null;
        java.lang.String str65 = denseVector62.toCSV(numberFormat64);
        org.la4j.Vector vector66 = ooPlaceMatrixByVectorMultiplication0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix54, denseVector62);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector68 = cRSMatrix54.getRow((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix5);
        org.junit.Assert.assertNotNull(vectorAccumulator6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix8);
        org.junit.Assert.assertNotNull(vector11);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation12);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(basic2DMatrix49);
        org.junit.Assert.assertNotNull(matrixMatrixOperation50);
        org.junit.Assert.assertNotNull(vectorVectorOperation51);
        org.junit.Assert.assertNotNull(cRSMatrix54);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator55);
        org.junit.Assert.assertNotNull(denseVector59);
        org.junit.Assert.assertNotNull(denseVector62);
        org.junit.Assert.assertNotNull(matrix63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(vector66);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.la4j.vector.DenseVector denseVector2 = org.la4j.vector.DenseVector.constant(32, (double) (short) -1);
        org.junit.Assert.assertNotNull(denseVector2);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix1 = org.la4j.matrix.ColumnMajorSparseMatrix.identity(32);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix1);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.la4j.operation.ooplace.OoPlaceKroneckerProduct ooPlaceKroneckerProduct0 = new org.la4j.operation.ooplace.OoPlaceKroneckerProduct();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix3 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator4 = columnMajorSparseMatrix3.nonZeroIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix9 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double13 = rowMajorSparseMatrix9.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix14 = rowMajorSparseMatrix9.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate15 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean16 = sparseMatrix14.is(advancedMatrixPredicate15);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator18 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double19 = sparseMatrix14.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator18);
        org.la4j.vector.functor.VectorProcedure vectorProcedure20 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator18);
        columnMajorSparseMatrix3.eachNonZeroInRow((-1), vectorProcedure20);
        boolean boolean22 = columnMajorSparseMatrix3.isRowMajor();
        org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication23 = new org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix25 = org.la4j.matrix.sparse.CCSMatrix.identity((int) (byte) 0);
        org.la4j.Matrix matrix26 = ooPlaceMatrixByItsTransposeMultiplication23.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix25);
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation27 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray34 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray41 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray48 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray55 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray62 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray63 = new double[][] { doubleArray34, doubleArray41, doubleArray48, doubleArray55, doubleArray62 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix64 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray63);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation65 = matrixMatrixMatrixOperation27.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix64);
        java.util.Spliterator<java.lang.Double> doubleSpliterator66 = basic2DMatrix64.spliterator();
        basic2DMatrix64.setAll((double) (byte) 10);
        ooPlaceMatrixByItsTransposeMultiplication23.ensureApplicableTo((org.la4j.Matrix) basic2DMatrix64);
        org.la4j.Matrix matrix70 = ooPlaceKroneckerProduct0.apply(columnMajorSparseMatrix3, (org.la4j.matrix.DenseMatrix) basic2DMatrix64);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix73 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        double double76 = cCSMatrix73.get((int) (byte) 0, (int) (short) 1);
        double double77 = cCSMatrix73.min();
        org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication78 = new org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication();
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix81 = org.la4j.matrix.dense.Basic2DMatrix.unit((int) (byte) 1, (int) '4');
        org.la4j.Matrix matrix82 = ooPlaceMatrixByItsTransposeMultiplication78.apply((org.la4j.matrix.DenseMatrix) basic2DMatrix81);
        org.la4j.Matrix matrix83 = ooPlaceKroneckerProduct0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix73, (org.la4j.matrix.DenseMatrix) basic2DMatrix81);
        // The following exception was thrown during execution in test generation
        try {
            basic2DMatrix81.swapRows((int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix3);
        org.junit.Assert.assertNotNull(matrixIterator4);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix14);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(vectorAccumulator18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(vectorProcedure20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cCSMatrix25);
        org.junit.Assert.assertNotNull(matrix26);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation27);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertNotNull(basic2DMatrix64);
        org.junit.Assert.assertNotNull(matrixMatrixOperation65);
        org.junit.Assert.assertNotNull(doubleSpliterator66);
        org.junit.Assert.assertNotNull(matrix70);
        org.junit.Assert.assertNotNull(cCSMatrix73);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-1.0d) + "'", double77 == (-1.0d));
        org.junit.Assert.assertNotNull(basic2DMatrix81);
        org.junit.Assert.assertNotNull(matrix82);
        org.junit.Assert.assertNotNull(matrix83);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct0 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix5 = rowMajorSparseMatrix4.removeLastRow();
        double double9 = rowMajorSparseMatrix4.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int10 = rowMajorSparseMatrix4.cardinality();
        org.la4j.Vector vector12 = rowMajorSparseMatrix4.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix15 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix16 = ooPlaceMatrixHadamardProduct0.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix4, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix15);
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate17 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix20 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        boolean boolean21 = advancedMatrixPredicate17.test((org.la4j.Matrix) columnMajorSparseMatrix20);
        org.la4j.vector.functor.VectorFunction vectorFunction23 = null;
        org.la4j.Matrix matrix24 = columnMajorSparseMatrix20.transformRow(0, vectorFunction23);
        org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix25 = new org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix();
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction26 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix29 = org.la4j.matrix.dense.Basic2DMatrix.unit((int) (byte) 1, (int) '4');
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction30 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix33 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean34 = cCSMatrix33.isRowMajor();
        org.la4j.Matrix matrix37 = cCSMatrix33.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator38 = cCSMatrix33.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix42 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix44 = rowMajorSparseMatrix42.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix48 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double52 = rowMajorSparseMatrix48.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix53 = rowMajorSparseMatrix48.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct54 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean55 = sparseMatrix53.equals((java.lang.Object) ooPlaceOuterProduct54);
        org.la4j.Matrix matrix56 = rowMajorSparseMatrix42.hadamardProduct((org.la4j.Matrix) sparseMatrix53);
        org.la4j.Matrix matrix57 = ooPlaceMatricesSubtraction30.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix33, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix42);
        org.la4j.Matrix matrix58 = ooPlaceMatricesSubtraction26.apply((org.la4j.matrix.DenseMatrix) basic2DMatrix29, rowMajorSparseMatrix42);
        org.la4j.decomposition.SingularValueDecompositor singularValueDecompositor59 = new org.la4j.decomposition.SingularValueDecompositor((org.la4j.Matrix) rowMajorSparseMatrix42);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix61 = org.la4j.matrix.sparse.CRSMatrix.fromCSV("");
        org.la4j.Matrix matrix62 = inPlaceCopyMatrixToMatrix25.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix42, (org.la4j.matrix.SparseMatrix) cRSMatrix61);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix66 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix67 = rowMajorSparseMatrix66.removeLastRow();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix71 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix73 = rowMajorSparseMatrix71.divide((double) (-1));
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory74 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix75 = matrix73.to(basic1DMatrixMatrixFactory74);
        org.la4j.Matrix matrix76 = inPlaceCopyMatrixToMatrix25.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix66, (org.la4j.matrix.DenseMatrix) basic1DMatrix75);
        org.la4j.Matrix matrix77 = ooPlaceMatrixHadamardProduct0.apply(columnMajorSparseMatrix20, (org.la4j.matrix.DenseMatrix) basic1DMatrix75);
        org.la4j.linear.SweepSolver sweepSolver78 = new org.la4j.linear.SweepSolver(matrix77);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix4);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(vector12);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix15);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate17);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(matrix24);
        org.junit.Assert.assertNotNull(basic2DMatrix29);
        org.junit.Assert.assertNotNull(cCSMatrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator38);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix42);
        org.junit.Assert.assertNotNull(matrix44);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix48);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(matrix56);
        org.junit.Assert.assertNotNull(matrix57);
        org.junit.Assert.assertNotNull(matrix58);
        org.junit.Assert.assertNotNull(cRSMatrix61);
        org.junit.Assert.assertNotNull(matrix62);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix66);
        org.junit.Assert.assertNotNull(matrix67);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix71);
        org.junit.Assert.assertNotNull(matrix73);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory74);
        org.junit.Assert.assertNotNull(basic1DMatrix75);
        org.junit.Assert.assertNotNull(matrix76);
        org.junit.Assert.assertNotNull(matrix77);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix2 = org.la4j.matrix.dense.Basic1DMatrix.unit((int) (byte) 10, (int) (byte) 0);
        double[][] doubleArray3 = basic1DMatrix2.toArray();
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix4 = new org.la4j.matrix.dense.Basic2DMatrix(doubleArray3);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix5 = org.la4j.matrix.sparse.CRSMatrix.from2DArray(doubleArray3);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix6 = org.la4j.matrix.sparse.CCSMatrix.from2DArray(doubleArray3);
        org.junit.Assert.assertNotNull(basic1DMatrix2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(cRSMatrix5);
        org.junit.Assert.assertNotNull(cCSMatrix6);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix3 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean4 = cCSMatrix3.isRowMajor();
        org.la4j.Matrix matrix7 = cCSMatrix3.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator8 = cCSMatrix3.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix12 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix14 = rowMajorSparseMatrix12.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix18 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double22 = rowMajorSparseMatrix18.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix23 = rowMajorSparseMatrix18.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct24 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean25 = sparseMatrix23.equals((java.lang.Object) ooPlaceOuterProduct24);
        org.la4j.Matrix matrix26 = rowMajorSparseMatrix12.hadamardProduct((org.la4j.Matrix) sparseMatrix23);
        org.la4j.Matrix matrix27 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix3, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix12);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix29 = org.la4j.matrix.sparse.CRSMatrix.fromCSV("");
        org.la4j.matrix.DenseMatrix denseMatrix32 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        double double33 = denseMatrix32.min();
        org.la4j.Matrix matrix34 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.SparseMatrix) cRSMatrix29, denseMatrix32);
        java.util.Random random36 = null;
        org.la4j.matrix.DenseMatrix denseMatrix37 = org.la4j.matrix.DenseMatrix.randomSymmetric(0, random36);
        double[][] doubleArray38 = new double[][] {};
        org.la4j.matrix.DenseMatrix denseMatrix39 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray38);
        org.la4j.matrix.DenseMatrix denseMatrix40 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray38);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix41 = denseMatrix40.toRowMajorSparseMatrix();
        org.la4j.Matrix matrix42 = ooPlaceMatricesSubtraction0.apply(denseMatrix37, denseMatrix40);
        org.la4j.linear.JacobiSolver jacobiSolver43 = new org.la4j.linear.JacobiSolver(matrix42);
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct44 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix49 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator50 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray51 = cCSMatrix49.foldRows(vectorAccumulator50);
        org.la4j.matrix.DenseMatrix denseMatrix52 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray51);
        org.la4j.vector.dense.BasicVector basicVector53 = new org.la4j.vector.dense.BasicVector(doubleArray51);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix58 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator59 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray60 = cCSMatrix58.foldRows(vectorAccumulator59);
        org.la4j.matrix.DenseMatrix denseMatrix61 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray60);
        org.la4j.vector.dense.BasicVector basicVector62 = new org.la4j.vector.dense.BasicVector(doubleArray60);
        ooPlaceOuterProduct44.ensureApplicableTo((org.la4j.Vector) basicVector53, (org.la4j.Vector) basicVector62);
        org.la4j.vector.sparse.CompressedVector compressedVector65 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix66 = compressedVector65.toColumnMatrix();
        org.la4j.vector.dense.BasicVector basicVector68 = org.la4j.vector.dense.BasicVector.unit((int) (short) 0);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition69 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix72 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double73 = cRSMatrix72.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix77 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix78 = rowMajorSparseMatrix77.removeLastRow();
        org.la4j.Matrix matrix79 = ooPlaceMatricesAddition69.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix72, rowMajorSparseMatrix77);
        boolean boolean80 = basicVector68.equals((java.lang.Object) rowMajorSparseMatrix77);
        org.la4j.Matrix matrix81 = ooPlaceOuterProduct44.apply((org.la4j.vector.SparseVector) compressedVector65, (org.la4j.vector.DenseVector) basicVector68);
        boolean boolean82 = jacobiSolver43.applicableTo(matrix81);
        int int83 = jacobiSolver43.equations();
        org.junit.Assert.assertNotNull(cCSMatrix3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator8);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(matrix26);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(cRSMatrix29);
        org.junit.Assert.assertNotNull(denseMatrix32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + Double.POSITIVE_INFINITY + "'", double33 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(matrix34);
        org.junit.Assert.assertNotNull(denseMatrix37);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertNotNull(denseMatrix39);
        org.junit.Assert.assertNotNull(denseMatrix40);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix41);
        org.junit.Assert.assertNotNull(matrix42);
        org.junit.Assert.assertNotNull(cCSMatrix49);
        org.junit.Assert.assertNotNull(vectorAccumulator50);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix52);
        org.junit.Assert.assertNotNull(cCSMatrix58);
        org.junit.Assert.assertNotNull(vectorAccumulator59);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix61);
        org.junit.Assert.assertNotNull(matrix66);
        org.junit.Assert.assertNotNull(basicVector68);
        org.junit.Assert.assertNotNull(cRSMatrix72);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix77);
        org.junit.Assert.assertNotNull(matrix78);
        org.junit.Assert.assertNotNull(matrix79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(matrix81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix1 = org.la4j.matrix.sparse.CCSMatrix.identity((int) '4');
        org.la4j.Matrix matrix2 = cCSMatrix1.rotate();
        double double3 = cCSMatrix1.max();
        org.junit.Assert.assertNotNull(cCSMatrix1);
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix3 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean4 = cCSMatrix3.isRowMajor();
        org.la4j.Matrix matrix7 = cCSMatrix3.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator8 = cCSMatrix3.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix12 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix14 = rowMajorSparseMatrix12.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix18 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double22 = rowMajorSparseMatrix18.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix23 = rowMajorSparseMatrix18.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct24 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean25 = sparseMatrix23.equals((java.lang.Object) ooPlaceOuterProduct24);
        org.la4j.Matrix matrix26 = rowMajorSparseMatrix12.hadamardProduct((org.la4j.Matrix) sparseMatrix23);
        org.la4j.Matrix matrix27 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix3, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix12);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix29 = org.la4j.matrix.sparse.CRSMatrix.fromCSV("");
        org.la4j.matrix.DenseMatrix denseMatrix32 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        double double33 = denseMatrix32.min();
        org.la4j.Matrix matrix34 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.SparseMatrix) cRSMatrix29, denseMatrix32);
        java.util.Random random36 = null;
        org.la4j.matrix.DenseMatrix denseMatrix37 = org.la4j.matrix.DenseMatrix.randomSymmetric(0, random36);
        double[][] doubleArray38 = new double[][] {};
        org.la4j.matrix.DenseMatrix denseMatrix39 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray38);
        org.la4j.matrix.DenseMatrix denseMatrix40 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray38);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix41 = denseMatrix40.toRowMajorSparseMatrix();
        org.la4j.Matrix matrix42 = ooPlaceMatricesSubtraction0.apply(denseMatrix37, denseMatrix40);
        org.la4j.linear.JacobiSolver jacobiSolver43 = new org.la4j.linear.JacobiSolver(matrix42);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix47 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double51 = rowMajorSparseMatrix47.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix52 = rowMajorSparseMatrix47.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct53 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean54 = sparseMatrix52.equals((java.lang.Object) ooPlaceOuterProduct53);
        org.la4j.vector.dense.BasicVector basicVector56 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector57 = basicVector56.copy();
        org.la4j.Matrix matrix58 = basicVector56.toDiagonalMatrix();
        org.la4j.Vector vector60 = basicVector56.blankOfLength(52);
        org.la4j.vector.SparseVector sparseVector62 = org.la4j.vector.SparseVector.fromCSV("1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct63 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix68 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator69 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray70 = cCSMatrix68.foldRows(vectorAccumulator69);
        org.la4j.matrix.DenseMatrix denseMatrix71 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray70);
        org.la4j.vector.dense.BasicVector basicVector72 = new org.la4j.vector.dense.BasicVector(doubleArray70);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix77 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator78 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray79 = cCSMatrix77.foldRows(vectorAccumulator78);
        org.la4j.matrix.DenseMatrix denseMatrix80 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray79);
        org.la4j.vector.dense.BasicVector basicVector81 = new org.la4j.vector.dense.BasicVector(doubleArray79);
        ooPlaceOuterProduct63.ensureApplicableTo((org.la4j.Vector) basicVector72, (org.la4j.Vector) basicVector81);
        org.la4j.Matrix matrix83 = basicVector81.toColumnMatrix();
        org.la4j.Matrix matrix84 = sparseVector62.outerProduct((org.la4j.Vector) basicVector81);
        org.la4j.Matrix matrix85 = basicVector81.toRowMatrix();
        org.la4j.Matrix matrix86 = ooPlaceOuterProduct53.apply((org.la4j.vector.DenseVector) basicVector56, (org.la4j.vector.DenseVector) basicVector81);
        org.la4j.Matrix matrix87 = basicVector56.toColumnMatrix();
        boolean boolean88 = jacobiSolver43.applicableTo(matrix87);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix91 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, 0.0d);
        boolean boolean92 = cRSMatrix91.isRowMajor();
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix93 = matrix87.multiply((org.la4j.Matrix) cRSMatrix91);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of rows in the left-hand matrix should be equal to the number of columns in the right-hand matrix: 10 does not equal to 10.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator8);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(matrix26);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(cRSMatrix29);
        org.junit.Assert.assertNotNull(denseMatrix32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + Double.POSITIVE_INFINITY + "'", double33 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(matrix34);
        org.junit.Assert.assertNotNull(denseMatrix37);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertNotNull(denseMatrix39);
        org.junit.Assert.assertNotNull(denseMatrix40);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix41);
        org.junit.Assert.assertNotNull(matrix42);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix47);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(vector57);
        org.junit.Assert.assertNotNull(matrix58);
        org.junit.Assert.assertNotNull(vector60);
        org.junit.Assert.assertNotNull(sparseVector62);
        org.junit.Assert.assertNotNull(cCSMatrix68);
        org.junit.Assert.assertNotNull(vectorAccumulator69);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix71);
        org.junit.Assert.assertNotNull(cCSMatrix77);
        org.junit.Assert.assertNotNull(vectorAccumulator78);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix80);
        org.junit.Assert.assertNotNull(matrix83);
        org.junit.Assert.assertNotNull(matrix84);
        org.junit.Assert.assertNotNull(matrix85);
        org.junit.Assert.assertNotNull(matrix86);
        org.junit.Assert.assertNotNull(matrix87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(cRSMatrix91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.zero(0, (int) (short) 0);
        org.la4j.linear.GaussianSolver gaussianSolver3 = new org.la4j.linear.GaussianSolver((org.la4j.Matrix) cRSMatrix2);
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct4 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix8 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double12 = rowMajorSparseMatrix8.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix13 = rowMajorSparseMatrix8.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct14 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean15 = sparseMatrix13.equals((java.lang.Object) ooPlaceOuterProduct14);
        org.la4j.vector.DenseVector denseVector17 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random19 = null;
        org.la4j.vector.DenseVector denseVector20 = org.la4j.vector.DenseVector.random(0, random19);
        java.lang.String str21 = denseVector20.toString();
        ooPlaceOuterProduct14.ensureApplicableTo((org.la4j.Vector) denseVector17, (org.la4j.Vector) denseVector20);
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation23 = ooPlaceInnerProduct4.partiallyApply(denseVector20);
        org.la4j.Vector vector24 = denseVector20.blank();
        org.la4j.Vector vector25 = gaussianSolver3.solve((org.la4j.Vector) denseVector20);
        org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication26 = new org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication();
        org.la4j.vector.sparse.CompressedVector compressedVector28 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector28.swapElements(10, (int) (byte) 100);
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct32 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix36 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix37 = rowMajorSparseMatrix36.removeLastRow();
        double double41 = rowMajorSparseMatrix36.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int42 = rowMajorSparseMatrix36.cardinality();
        org.la4j.Vector vector44 = rowMajorSparseMatrix36.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix47 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix48 = ooPlaceMatrixHadamardProduct32.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix36, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix47);
        org.la4j.Vector vector49 = ooPlaceVectorByMatrixMultiplication26.apply((org.la4j.vector.SparseVector) compressedVector28, columnMajorSparseMatrix47);
        boolean boolean51 = compressedVector28.isZeroAt((int) ' ');
        boolean boolean53 = compressedVector28.isZeroAt((int) '4');
        org.la4j.vector.VectorFactory<org.la4j.vector.dense.BasicVector> basicVectorVectorFactory54 = org.la4j.Vectors.DENSE;
        org.la4j.vector.dense.BasicVector basicVector55 = compressedVector28.to(basicVectorVectorFactory54);
        java.util.Spliterator<java.lang.Double> doubleSpliterator56 = compressedVector28.spliterator();
        org.la4j.Matrix matrix57 = compressedVector28.toRowMatrix();
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector58 = gaussianSolver3.solve((org.la4j.Vector) compressedVector28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrong length of RHS vector: 32.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(denseVector17);
        org.junit.Assert.assertNotNull(denseVector20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(doubleVectorOperation23);
        org.junit.Assert.assertNotNull(vector24);
        org.junit.Assert.assertNotNull(vector25);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix36);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(vector44);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix47);
        org.junit.Assert.assertNotNull(matrix48);
        org.junit.Assert.assertNotNull(vector49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(basicVectorVectorFactory54);
        org.junit.Assert.assertNotNull(basicVector55);
        org.junit.Assert.assertNotNull(doubleSpliterator56);
        org.junit.Assert.assertNotNull(matrix57);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double4 = cRSMatrix3.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix8 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix9 = rowMajorSparseMatrix8.removeLastRow();
        org.la4j.Matrix matrix10 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, rowMajorSparseMatrix8);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix13 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.matrix.DenseMatrix denseMatrix15 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix16 = ooPlaceMatricesAddition0.apply(columnMajorSparseMatrix13, denseMatrix15);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix19 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        byte[] byteArray20 = columnMajorSparseMatrix19.toBinary();
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation21 = ooPlaceMatricesAddition0.partiallyApply(columnMajorSparseMatrix19);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix24 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator25 = cCSMatrix24.iterator();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix28 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        double double31 = cCSMatrix28.get((int) (byte) 0, (int) (short) 1);
        double double32 = cCSMatrix28.min();
        org.la4j.Matrix matrix33 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix24, (org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix28);
        double double34 = cCSMatrix28.max();
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator35 = cCSMatrix28.columnMajorIterator();
        org.junit.Assert.assertNotNull(cRSMatrix3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix13);
        org.junit.Assert.assertNotNull(denseMatrix15);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[48, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(matrixMatrixOperation21);
        org.junit.Assert.assertNotNull(cCSMatrix24);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator25);
        org.junit.Assert.assertNotNull(cCSMatrix28);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertNotNull(matrix33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator35);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct0 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator4 = cRSMatrix3.nonZeroIterator();
        org.la4j.Vector vector6 = cRSMatrix3.getColumn(100);
        boolean boolean9 = cRSMatrix3.nonZeroAt(1, (int) (short) 0);
        org.la4j.decomposition.RawLUDecompositor rawLUDecompositor10 = new org.la4j.decomposition.RawLUDecompositor((org.la4j.Matrix) cRSMatrix3);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix14 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix15 = rowMajorSparseMatrix14.removeLastRow();
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure16 = null;
        rowMajorSparseMatrix14.eachNonZero(matrixProcedure16);
        org.la4j.Matrix matrix18 = ooPlaceMatrixHadamardProduct0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, rowMajorSparseMatrix14);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix21 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        double double24 = cCSMatrix21.get((int) (byte) 0, (int) (short) 1);
        double double25 = cCSMatrix21.min();
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction26 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix29 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean30 = cCSMatrix29.isRowMajor();
        org.la4j.Matrix matrix33 = cCSMatrix29.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator34 = cCSMatrix29.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix38 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix40 = rowMajorSparseMatrix38.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix44 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double48 = rowMajorSparseMatrix44.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix49 = rowMajorSparseMatrix44.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct50 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean51 = sparseMatrix49.equals((java.lang.Object) ooPlaceOuterProduct50);
        org.la4j.Matrix matrix52 = rowMajorSparseMatrix38.hadamardProduct((org.la4j.Matrix) sparseMatrix49);
        org.la4j.Matrix matrix53 = ooPlaceMatricesSubtraction26.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix29, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix38);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator54 = cCSMatrix29.iterator();
        org.la4j.Matrix matrix55 = ooPlaceMatrixHadamardProduct0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix21, (org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix29);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix57 = org.la4j.matrix.sparse.CCSMatrix.identity((int) (short) 0);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix60 = org.la4j.matrix.sparse.CRSMatrix.zero(1, 1);
        org.la4j.Matrix matrix61 = ooPlaceMatrixHadamardProduct0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix57, (org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix60);
        org.junit.Assert.assertNotNull(cRSMatrix3);
        org.junit.Assert.assertNotNull(matrixIterator4);
        org.junit.Assert.assertNotNull(vector6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix14);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertNotNull(cCSMatrix21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(cCSMatrix29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(matrix33);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator34);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix38);
        org.junit.Assert.assertNotNull(matrix40);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix44);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(matrix52);
        org.junit.Assert.assertNotNull(matrix53);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator54);
        org.junit.Assert.assertNotNull(matrix55);
        org.junit.Assert.assertNotNull(cCSMatrix57);
        org.junit.Assert.assertNotNull(cRSMatrix60);
        org.junit.Assert.assertNotNull(matrix61);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix5 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator6 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray7 = cCSMatrix5.foldRows(vectorAccumulator6);
        org.la4j.matrix.DenseMatrix denseMatrix8 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray7);
        org.la4j.vector.dense.BasicVector basicVector9 = new org.la4j.vector.dense.BasicVector(doubleArray7);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix14 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator15 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray16 = cCSMatrix14.foldRows(vectorAccumulator15);
        org.la4j.matrix.DenseMatrix denseMatrix17 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray16);
        org.la4j.vector.dense.BasicVector basicVector18 = new org.la4j.vector.dense.BasicVector(doubleArray16);
        ooPlaceOuterProduct0.ensureApplicableTo((org.la4j.Vector) basicVector9, (org.la4j.Vector) basicVector18);
        org.la4j.vector.sparse.CompressedVector compressedVector21 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector21.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector26 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix27 = ooPlaceOuterProduct0.apply((org.la4j.vector.SparseVector) compressedVector21, (org.la4j.vector.SparseVector) compressedVector26);
        double double28 = compressedVector26.min();
        org.la4j.Matrix matrix29 = compressedVector26.toColumnMatrix();
        double double31 = compressedVector26.get(0);
        org.junit.Assert.assertNotNull(cCSMatrix5);
        org.junit.Assert.assertNotNull(vectorAccumulator6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix8);
        org.junit.Assert.assertNotNull(cCSMatrix14);
        org.junit.Assert.assertNotNull(vectorAccumulator15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix17);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(matrix29);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.la4j.matrix.SparseMatrix sparseMatrix1 = org.la4j.matrix.SparseMatrix.identity(5);
        org.junit.Assert.assertNotNull(sparseMatrix1);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix3 = org.la4j.matrix.dense.Basic2DMatrix.unit((int) (byte) 1, (int) '4');
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction4 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix7 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean8 = cCSMatrix7.isRowMajor();
        org.la4j.Matrix matrix11 = cCSMatrix7.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator12 = cCSMatrix7.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix16 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix18 = rowMajorSparseMatrix16.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix22 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double26 = rowMajorSparseMatrix22.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix27 = rowMajorSparseMatrix22.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct28 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean29 = sparseMatrix27.equals((java.lang.Object) ooPlaceOuterProduct28);
        org.la4j.Matrix matrix30 = rowMajorSparseMatrix16.hadamardProduct((org.la4j.Matrix) sparseMatrix27);
        org.la4j.Matrix matrix31 = ooPlaceMatricesSubtraction4.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix7, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix16);
        org.la4j.Matrix matrix32 = ooPlaceMatricesSubtraction0.apply((org.la4j.matrix.DenseMatrix) basic2DMatrix3, rowMajorSparseMatrix16);
        org.la4j.decomposition.SingularValueDecompositor singularValueDecompositor33 = new org.la4j.decomposition.SingularValueDecompositor((org.la4j.Matrix) rowMajorSparseMatrix16);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix36 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator37 = cRSMatrix36.nonZeroIterator();
        org.la4j.Vector vector39 = cRSMatrix36.getColumn(100);
        boolean boolean42 = cRSMatrix36.nonZeroAt(1, (int) (short) 0);
        org.la4j.decomposition.RawLUDecompositor rawLUDecompositor43 = new org.la4j.decomposition.RawLUDecompositor((org.la4j.Matrix) cRSMatrix36);
        double double44 = cRSMatrix36.infinityNorm();
        boolean boolean45 = singularValueDecompositor33.applicableTo((org.la4j.Matrix) cRSMatrix36);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix48 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator49 = cRSMatrix48.nonZeroIterator();
        org.la4j.Vector vector51 = cRSMatrix48.getColumn(100);
        boolean boolean54 = cRSMatrix48.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator56 = cRSMatrix48.nonZeroIteratorOfColumn((-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix57 = cRSMatrix48.toRowMajorSparseMatrix();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix61 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double65 = rowMajorSparseMatrix61.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix66 = rowMajorSparseMatrix61.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate67 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean68 = sparseMatrix66.is(advancedMatrixPredicate67);
        boolean boolean69 = rowMajorSparseMatrix57.non(advancedMatrixPredicate67);
        boolean boolean70 = singularValueDecompositor33.applicableTo((org.la4j.Matrix) rowMajorSparseMatrix57);
        org.la4j.Matrix matrix71 = singularValueDecompositor33.self();
        org.junit.Assert.assertNotNull(basic2DMatrix3);
        org.junit.Assert.assertNotNull(cCSMatrix7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator12);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix16);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix22);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(matrix30);
        org.junit.Assert.assertNotNull(matrix31);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertNotNull(cRSMatrix36);
        org.junit.Assert.assertNotNull(matrixIterator37);
        org.junit.Assert.assertNotNull(vector39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(cRSMatrix48);
        org.junit.Assert.assertNotNull(matrixIterator49);
        org.junit.Assert.assertNotNull(vector51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(vectorIterator56);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix57);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix61);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 1.0d + "'", double65 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix66);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(matrix71);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator3 = cRSMatrix2.nonZeroIterator();
        org.la4j.Vector vector5 = cRSMatrix2.getColumn(100);
        boolean boolean8 = cRSMatrix2.nonZeroAt(1, (int) (short) 0);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix11 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator12 = cRSMatrix11.nonZeroIterator();
        org.la4j.Vector vector14 = cRSMatrix11.getColumn(100);
        boolean boolean17 = cRSMatrix11.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator19 = cRSMatrix11.nonZeroIteratorOfColumn((-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix20 = cRSMatrix11.toRowMajorSparseMatrix();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory21 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix22 = cRSMatrix11.to(basic1DMatrixMatrixFactory21);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix23 = cRSMatrix2.to(basic1DMatrixMatrixFactory21);
        org.la4j.Matrix matrix26 = basic1DMatrix23.copyOfShape(0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix29 = matrix26.sliceBottomRight((int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad row argument 10; out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertNotNull(matrixIterator3);
        org.junit.Assert.assertNotNull(vector5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cRSMatrix11);
        org.junit.Assert.assertNotNull(matrixIterator12);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(vectorIterator19);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix20);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory21);
        org.junit.Assert.assertNotNull(basic1DMatrix22);
        org.junit.Assert.assertNotNull(basic1DMatrix23);
        org.junit.Assert.assertNotNull(matrix26);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct2 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix6 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix7 = rowMajorSparseMatrix6.removeLastRow();
        double double11 = rowMajorSparseMatrix6.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int12 = rowMajorSparseMatrix6.cardinality();
        org.la4j.Vector vector14 = rowMajorSparseMatrix6.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix17 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix18 = ooPlaceMatrixHadamardProduct2.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix6, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix17);
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate19 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix22 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        boolean boolean23 = advancedMatrixPredicate19.test((org.la4j.Matrix) columnMajorSparseMatrix22);
        org.la4j.vector.functor.VectorFunction vectorFunction25 = null;
        org.la4j.Matrix matrix26 = columnMajorSparseMatrix22.transformRow(0, vectorFunction25);
        org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix27 = new org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix();
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction28 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix31 = org.la4j.matrix.dense.Basic2DMatrix.unit((int) (byte) 1, (int) '4');
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction32 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix35 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean36 = cCSMatrix35.isRowMajor();
        org.la4j.Matrix matrix39 = cCSMatrix35.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator40 = cCSMatrix35.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix44 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix46 = rowMajorSparseMatrix44.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix50 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double54 = rowMajorSparseMatrix50.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix55 = rowMajorSparseMatrix50.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct56 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean57 = sparseMatrix55.equals((java.lang.Object) ooPlaceOuterProduct56);
        org.la4j.Matrix matrix58 = rowMajorSparseMatrix44.hadamardProduct((org.la4j.Matrix) sparseMatrix55);
        org.la4j.Matrix matrix59 = ooPlaceMatricesSubtraction32.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix35, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix44);
        org.la4j.Matrix matrix60 = ooPlaceMatricesSubtraction28.apply((org.la4j.matrix.DenseMatrix) basic2DMatrix31, rowMajorSparseMatrix44);
        org.la4j.decomposition.SingularValueDecompositor singularValueDecompositor61 = new org.la4j.decomposition.SingularValueDecompositor((org.la4j.Matrix) rowMajorSparseMatrix44);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix63 = org.la4j.matrix.sparse.CRSMatrix.fromCSV("");
        org.la4j.Matrix matrix64 = inPlaceCopyMatrixToMatrix27.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix44, (org.la4j.matrix.SparseMatrix) cRSMatrix63);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix68 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix69 = rowMajorSparseMatrix68.removeLastRow();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix73 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix75 = rowMajorSparseMatrix73.divide((double) (-1));
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory76 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix77 = matrix75.to(basic1DMatrixMatrixFactory76);
        org.la4j.Matrix matrix78 = inPlaceCopyMatrixToMatrix27.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix68, (org.la4j.matrix.DenseMatrix) basic1DMatrix77);
        org.la4j.Matrix matrix79 = ooPlaceMatrixHadamardProduct2.apply(columnMajorSparseMatrix22, (org.la4j.matrix.DenseMatrix) basic1DMatrix77);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator80 = null;
        double[] doubleArray81 = columnMajorSparseMatrix22.foldNonZeroInRows(vectorAccumulator80);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.sparse.CCSMatrix cCSMatrix82 = org.la4j.matrix.sparse.CCSMatrix.from1DArray(6, (int) (byte) 1, doubleArray81);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix6);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix17);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate19);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(matrix26);
        org.junit.Assert.assertNotNull(basic2DMatrix31);
        org.junit.Assert.assertNotNull(cCSMatrix35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator40);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix44);
        org.junit.Assert.assertNotNull(matrix46);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix50);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(matrix58);
        org.junit.Assert.assertNotNull(matrix59);
        org.junit.Assert.assertNotNull(matrix60);
        org.junit.Assert.assertNotNull(cRSMatrix63);
        org.junit.Assert.assertNotNull(matrix64);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix68);
        org.junit.Assert.assertNotNull(matrix69);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix73);
        org.junit.Assert.assertNotNull(matrix75);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory76);
        org.junit.Assert.assertNotNull(basic1DMatrix77);
        org.junit.Assert.assertNotNull(matrix78);
        org.junit.Assert.assertNotNull(matrix79);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[]");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix3 = org.la4j.matrix.dense.Basic2DMatrix.unit((int) (byte) 1, (int) '4');
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction4 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix7 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean8 = cCSMatrix7.isRowMajor();
        org.la4j.Matrix matrix11 = cCSMatrix7.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator12 = cCSMatrix7.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix16 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix18 = rowMajorSparseMatrix16.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix22 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double26 = rowMajorSparseMatrix22.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix27 = rowMajorSparseMatrix22.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct28 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean29 = sparseMatrix27.equals((java.lang.Object) ooPlaceOuterProduct28);
        org.la4j.Matrix matrix30 = rowMajorSparseMatrix16.hadamardProduct((org.la4j.Matrix) sparseMatrix27);
        org.la4j.Matrix matrix31 = ooPlaceMatricesSubtraction4.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix7, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix16);
        org.la4j.Matrix matrix32 = ooPlaceMatricesSubtraction0.apply((org.la4j.matrix.DenseMatrix) basic2DMatrix3, rowMajorSparseMatrix16);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix36 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix38 = rowMajorSparseMatrix36.divide((double) (-1));
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix41 = org.la4j.matrix.dense.Basic2DMatrix.diagonal((int) (byte) 100, (double) (short) 10);
        org.la4j.decomposition.RawQRDecompositor rawQRDecompositor42 = new org.la4j.decomposition.RawQRDecompositor((org.la4j.Matrix) basic2DMatrix41);
        org.la4j.Matrix matrix43 = ooPlaceMatricesSubtraction0.apply(rowMajorSparseMatrix36, (org.la4j.matrix.DenseMatrix) basic2DMatrix41);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator45 = org.la4j.Vectors.mkInfinityNormAccumulator();
        double double46 = matrix43.foldRow((int) '4', vectorAccumulator45);
        org.junit.Assert.assertNotNull(basic2DMatrix3);
        org.junit.Assert.assertNotNull(cCSMatrix7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator12);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix16);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix22);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(matrix30);
        org.junit.Assert.assertNotNull(matrix31);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix36);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(basic2DMatrix41);
        org.junit.Assert.assertNotNull(matrix43);
        org.junit.Assert.assertNotNull(vectorAccumulator45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double4 = cRSMatrix3.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix8 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix9 = rowMajorSparseMatrix8.removeLastRow();
        org.la4j.Matrix matrix10 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, rowMajorSparseMatrix8);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition11 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix14 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double15 = cRSMatrix14.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix19 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix20 = rowMajorSparseMatrix19.removeLastRow();
        org.la4j.Matrix matrix21 = ooPlaceMatricesAddition11.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix14, rowMajorSparseMatrix19);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix24 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.matrix.DenseMatrix denseMatrix26 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix27 = ooPlaceMatricesAddition11.apply(columnMajorSparseMatrix24, denseMatrix26);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix31 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix32 = rowMajorSparseMatrix31.removeLastRow();
        double double36 = rowMajorSparseMatrix31.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        org.la4j.Vector vector37 = rowMajorSparseMatrix31.toRowVector();
        org.la4j.Matrix matrix38 = ooPlaceMatricesAddition0.apply(denseMatrix26, rowMajorSparseMatrix31);
        org.la4j.vector.functor.VectorFunction vectorFunction41 = org.la4j.Vectors.asMinusFunction((double) (byte) 100);
        denseMatrix26.updateRow(52, vectorFunction41);
        org.junit.Assert.assertNotNull(cRSMatrix3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(cRSMatrix14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix19);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix24);
        org.junit.Assert.assertNotNull(denseMatrix26);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix31);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(vector37);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(vectorFunction41);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct0 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double4 = cRSMatrix3.min();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate5 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix8 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        boolean boolean9 = advancedMatrixPredicate5.test((org.la4j.Matrix) columnMajorSparseMatrix8);
        org.la4j.inversion.NoPivotGaussInverter noPivotGaussInverter10 = new org.la4j.inversion.NoPivotGaussInverter((org.la4j.Matrix) columnMajorSparseMatrix8);
        org.la4j.Matrix matrix11 = ooPlaceMatrixHadamardProduct0.applySymmetric((org.la4j.matrix.SparseMatrix) cRSMatrix3, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix8);
        java.util.Random random13 = null;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix14 = org.la4j.matrix.dense.Basic1DMatrix.randomSymmetric(0, random13);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation15 = ooPlaceMatrixHadamardProduct0.partiallyApply((org.la4j.matrix.DenseMatrix) basic1DMatrix14);
        org.junit.Assert.assertNotNull(cRSMatrix3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate5);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(basic1DMatrix14);
        org.junit.Assert.assertNotNull(matrixMatrixOperation15);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.la4j.operation.ooplace.OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatricesMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix4 = org.la4j.matrix.sparse.CCSMatrix.zero(10, (int) (short) 10, (int) '4');
        org.la4j.LinearAlgebra.DecompositorFactory decompositorFactory5 = org.la4j.LinearAlgebra.DecompositorFactory.QR;
        org.la4j.decomposition.MatrixDecompositor matrixDecompositor6 = cCSMatrix4.withDecompositor(decompositorFactory5);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix10 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix11 = rowMajorSparseMatrix10.removeLastRow();
        double double15 = rowMajorSparseMatrix10.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int16 = rowMajorSparseMatrix10.cardinality();
        org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication17 = new org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix20 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator21 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray22 = cCSMatrix20.foldRows(vectorAccumulator21);
        org.la4j.Matrix matrix23 = ooPlaceMatrixByItsTransposeMultiplication17.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix20);
        double double25 = cCSMatrix20.minInColumn(0);
        org.la4j.iterator.MatrixIterator matrixIterator26 = cCSMatrix20.nonZeroIterator();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix29 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator30 = cRSMatrix29.nonZeroIterator();
        org.la4j.Vector vector32 = cRSMatrix29.getColumn(100);
        boolean boolean35 = cRSMatrix29.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator37 = cRSMatrix29.nonZeroIteratorOfColumn((-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix38 = cRSMatrix29.toRowMajorSparseMatrix();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory39 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix40 = cRSMatrix29.to(basic1DMatrixMatrixFactory39);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix41 = cCSMatrix20.to(basic1DMatrixMatrixFactory39);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix42 = rowMajorSparseMatrix10.to(basic1DMatrixMatrixFactory39);
        org.la4j.Matrix matrix43 = ooPlaceMatricesMultiplication0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix4, rowMajorSparseMatrix10);
        org.junit.Assert.assertNotNull(cCSMatrix4);
        org.junit.Assert.assertNotNull(decompositorFactory5);
        org.junit.Assert.assertNotNull(matrixDecompositor6);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix10);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(cCSMatrix20);
        org.junit.Assert.assertNotNull(vectorAccumulator21);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(matrix23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(matrixIterator26);
        org.junit.Assert.assertNotNull(cRSMatrix29);
        org.junit.Assert.assertNotNull(matrixIterator30);
        org.junit.Assert.assertNotNull(vector32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(vectorIterator37);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix38);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory39);
        org.junit.Assert.assertNotNull(basic1DMatrix40);
        org.junit.Assert.assertNotNull(basic1DMatrix41);
        org.junit.Assert.assertNotNull(basic1DMatrix42);
        org.junit.Assert.assertNotNull(matrix43);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator3 = cRSMatrix2.nonZeroIterator();
        org.la4j.Vector vector5 = cRSMatrix2.getColumn(100);
        boolean boolean8 = cRSMatrix2.nonZeroAt(1, (int) (short) 0);
        org.la4j.decomposition.RawLUDecompositor rawLUDecompositor9 = new org.la4j.decomposition.RawLUDecompositor((org.la4j.Matrix) cRSMatrix2);
        org.la4j.Matrix matrix10 = rawLUDecompositor9.self();
        org.la4j.Matrix[] matrixArray11 = rawLUDecompositor9.decompose();
        org.la4j.Matrix matrix12 = rawLUDecompositor9.self();
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertNotNull(matrixIterator3);
        org.junit.Assert.assertNotNull(vector5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(matrixArray11);
        org.junit.Assert.assertNotNull(matrix12);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.la4j.vector.sparse.CompressedVector compressedVector1 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        java.text.NumberFormat numberFormat2 = null;
        java.lang.String str3 = compressedVector1.toMatrixMarket(numberFormat2);
        org.la4j.Vector vector5 = compressedVector1.add((double) 52);
        compressedVector1.swapElements((int) (short) 1, (int) (byte) 1);
        java.lang.String str9 = compressedVector1.toCSV();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "%%MatrixMarket vector coordinate real\n32 0\n" + "'", str3, "%%MatrixMarket vector coordinate real\n32 0\n");
        org.junit.Assert.assertNotNull(vector5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000" + "'", str9, "0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.la4j.matrix.functor.MatrixFunction matrixFunction2 = org.la4j.Matrices.INV_FUNCTION;
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator3 = org.la4j.Matrices.asSumFunctionAccumulator((double) ' ', matrixFunction2);
        double double7 = matrixFunction2.evaluate((int) '#', (-1), (double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator8 = org.la4j.Matrices.asSumFunctionAccumulator(Double.NaN, matrixFunction2);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrixFunction2);
        org.junit.Assert.assertNotNull(matrixAccumulator3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.la4j.operation.ooplace.OoPlaceKroneckerProduct ooPlaceKroneckerProduct0 = new org.la4j.operation.ooplace.OoPlaceKroneckerProduct();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix3 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator4 = columnMajorSparseMatrix3.nonZeroIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix9 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double13 = rowMajorSparseMatrix9.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix14 = rowMajorSparseMatrix9.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate15 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean16 = sparseMatrix14.is(advancedMatrixPredicate15);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator18 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double19 = sparseMatrix14.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator18);
        org.la4j.vector.functor.VectorProcedure vectorProcedure20 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator18);
        columnMajorSparseMatrix3.eachNonZeroInRow((-1), vectorProcedure20);
        boolean boolean22 = columnMajorSparseMatrix3.isRowMajor();
        org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication23 = new org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix25 = org.la4j.matrix.sparse.CCSMatrix.identity((int) (byte) 0);
        org.la4j.Matrix matrix26 = ooPlaceMatrixByItsTransposeMultiplication23.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix25);
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation27 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray34 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray41 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray48 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray55 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray62 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray63 = new double[][] { doubleArray34, doubleArray41, doubleArray48, doubleArray55, doubleArray62 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix64 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray63);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation65 = matrixMatrixMatrixOperation27.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix64);
        java.util.Spliterator<java.lang.Double> doubleSpliterator66 = basic2DMatrix64.spliterator();
        basic2DMatrix64.setAll((double) (byte) 10);
        ooPlaceMatrixByItsTransposeMultiplication23.ensureApplicableTo((org.la4j.Matrix) basic2DMatrix64);
        org.la4j.Matrix matrix70 = ooPlaceKroneckerProduct0.apply(columnMajorSparseMatrix3, (org.la4j.matrix.DenseMatrix) basic2DMatrix64);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix73 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        double double76 = cCSMatrix73.get((int) (byte) 0, (int) (short) 1);
        double double77 = cCSMatrix73.min();
        org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication78 = new org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication();
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix81 = org.la4j.matrix.dense.Basic2DMatrix.unit((int) (byte) 1, (int) '4');
        org.la4j.Matrix matrix82 = ooPlaceMatrixByItsTransposeMultiplication78.apply((org.la4j.matrix.DenseMatrix) basic2DMatrix81);
        org.la4j.Matrix matrix83 = ooPlaceKroneckerProduct0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix73, (org.la4j.matrix.DenseMatrix) basic2DMatrix81);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix84 = null;
        double[][] doubleArray85 = new double[][] {};
        org.la4j.matrix.DenseMatrix denseMatrix86 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray85);
        org.la4j.matrix.DenseMatrix denseMatrix87 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray85);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix88 = denseMatrix87.toRowMajorSparseMatrix();
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix89 = ooPlaceKroneckerProduct0.apply(rowMajorSparseMatrix84, rowMajorSparseMatrix88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix3);
        org.junit.Assert.assertNotNull(matrixIterator4);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix14);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(vectorAccumulator18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(vectorProcedure20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cCSMatrix25);
        org.junit.Assert.assertNotNull(matrix26);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation27);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertNotNull(basic2DMatrix64);
        org.junit.Assert.assertNotNull(matrixMatrixOperation65);
        org.junit.Assert.assertNotNull(doubleSpliterator66);
        org.junit.Assert.assertNotNull(matrix70);
        org.junit.Assert.assertNotNull(cCSMatrix73);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-1.0d) + "'", double77 == (-1.0d));
        org.junit.Assert.assertNotNull(basic2DMatrix81);
        org.junit.Assert.assertNotNull(matrix82);
        org.junit.Assert.assertNotNull(matrix83);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertNotNull(denseMatrix86);
        org.junit.Assert.assertNotNull(denseMatrix87);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix88);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random2 = null;
        org.la4j.vector.DenseVector denseVector3 = org.la4j.vector.DenseVector.random(0, random2);
        java.util.Random random5 = null;
        org.la4j.vector.DenseVector denseVector6 = org.la4j.vector.DenseVector.random(0, random5);
        org.la4j.Matrix matrix7 = ooPlaceOuterProduct0.apply(denseVector3, denseVector6);
        org.la4j.vector.sparse.CompressedVector compressedVector9 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        java.text.NumberFormat numberFormat10 = null;
        java.lang.String str11 = compressedVector9.toMatrixMarket(numberFormat10);
        org.la4j.Vector vector13 = compressedVector9.add((double) 52);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix16 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator17 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray18 = cCSMatrix16.foldRows(vectorAccumulator17);
        org.la4j.vector.dense.BasicVector basicVector19 = org.la4j.vector.dense.BasicVector.fromArray(doubleArray18);
        org.la4j.Matrix matrix20 = basicVector19.toRowMatrix();
        org.la4j.vector.functor.VectorPredicate vectorPredicate21 = org.la4j.Vectors.ZERO_VECTOR;
        boolean boolean22 = basicVector19.non(vectorPredicate21);
        org.la4j.Vector vector24 = basicVector19.blankOfLength((int) 'a');
        org.la4j.Matrix matrix25 = ooPlaceOuterProduct0.apply((org.la4j.vector.SparseVector) compressedVector9, (org.la4j.vector.DenseVector) basicVector19);
        org.la4j.vector.sparse.CompressedVector compressedVector27 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        java.text.NumberFormat numberFormat28 = null;
        java.lang.String str29 = compressedVector27.toMatrixMarket(numberFormat28);
        org.la4j.Vector vector31 = compressedVector27.add((double) 52);
        compressedVector27.swapElements((int) (short) 1, (int) (byte) 1);
        org.la4j.Matrix matrix35 = compressedVector27.toColumnMatrix();
        org.la4j.Vector vector37 = compressedVector27.multiply((-2.0d));
        org.la4j.operation.VectorOperation<org.la4j.Matrix> matrixVectorOperation38 = ooPlaceOuterProduct0.partiallyApply((org.la4j.vector.SparseVector) compressedVector27);
        org.junit.Assert.assertNotNull(denseVector3);
        org.junit.Assert.assertNotNull(denseVector6);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "%%MatrixMarket vector coordinate real\n32 0\n" + "'", str11, "%%MatrixMarket vector coordinate real\n32 0\n");
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertNotNull(cCSMatrix16);
        org.junit.Assert.assertNotNull(vectorAccumulator17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(basicVector19);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(vectorPredicate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(vector24);
        org.junit.Assert.assertNotNull(matrix25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "%%MatrixMarket vector coordinate real\n32 0\n" + "'", str29, "%%MatrixMarket vector coordinate real\n32 0\n");
        org.junit.Assert.assertNotNull(vector31);
        org.junit.Assert.assertNotNull(matrix35);
        org.junit.Assert.assertNotNull(vector37);
        org.junit.Assert.assertNotNull(matrixVectorOperation38);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix2 = org.la4j.matrix.ColumnMajorSparseMatrix.diagonal((int) (short) 100, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix2);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix3 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean4 = cCSMatrix3.isRowMajor();
        org.la4j.Matrix matrix7 = cCSMatrix3.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator8 = cCSMatrix3.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix12 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix14 = rowMajorSparseMatrix12.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix18 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double22 = rowMajorSparseMatrix18.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix23 = rowMajorSparseMatrix18.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct24 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean25 = sparseMatrix23.equals((java.lang.Object) ooPlaceOuterProduct24);
        org.la4j.Matrix matrix26 = rowMajorSparseMatrix12.hadamardProduct((org.la4j.Matrix) sparseMatrix23);
        org.la4j.Matrix matrix27 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix3, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix12);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix31 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix32 = rowMajorSparseMatrix31.removeLastRow();
        double double36 = rowMajorSparseMatrix31.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int37 = rowMajorSparseMatrix31.cardinality();
        org.la4j.Vector vector39 = rowMajorSparseMatrix31.getRow(0);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation40 = ooPlaceMatricesSubtraction0.partiallyApply(rowMajorSparseMatrix31);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix43 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator44 = cRSMatrix43.nonZeroIterator();
        org.la4j.Vector vector46 = cRSMatrix43.getColumn(100);
        boolean boolean49 = cRSMatrix43.nonZeroAt(1, (int) (short) 0);
        org.la4j.decomposition.RawLUDecompositor rawLUDecompositor50 = new org.la4j.decomposition.RawLUDecompositor((org.la4j.Matrix) cRSMatrix43);
        org.la4j.Matrix matrix51 = rawLUDecompositor50.self();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix54 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        ooPlaceMatricesSubtraction0.ensureApplicableTo(matrix51, (org.la4j.Matrix) cRSMatrix54);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation56 = org.la4j.LinearAlgebra.OO_PLACE_MATRIX_BY_ITS_TRANSPOSE_MULTIPLICATION;
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix59 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator60 = cCSMatrix59.nonZeroColumnMajorIterator();
        matrixMatrixOperation56.ensureApplicableTo((org.la4j.Matrix) cCSMatrix59);
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix64 = org.la4j.matrix.dense.Basic2DMatrix.unit((int) (byte) 1, (int) '4');
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix67 = new org.la4j.matrix.sparse.CCSMatrix((int) (byte) 1, (int) (byte) 0);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix71 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix72 = rowMajorSparseMatrix71.removeLastRow();
        org.la4j.matrix.functor.MatrixFunction matrixFunction74 = null;
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator75 = org.la4j.Matrices.asSumFunctionAccumulator((double) (-1), matrixFunction74);
        double double76 = matrix72.fold(matrixAccumulator75);
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure77 = org.la4j.Matrices.asAccumulatorProcedure(matrixAccumulator75);
        cCSMatrix67.eachNonZero(matrixProcedure77);
        org.la4j.Matrix matrix79 = basic2DMatrix64.kroneckerProduct((org.la4j.Matrix) cCSMatrix67);
        org.la4j.Matrix matrix80 = ooPlaceMatricesSubtraction0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix59, (org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix67);
        java.util.Iterator<java.lang.Integer> intItor81 = cCSMatrix67.iteratorOrNonZeroColumns();
        org.junit.Assert.assertNotNull(cCSMatrix3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator8);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(matrix26);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix31);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(vector39);
        org.junit.Assert.assertNotNull(matrixMatrixOperation40);
        org.junit.Assert.assertNotNull(cRSMatrix43);
        org.junit.Assert.assertNotNull(matrixIterator44);
        org.junit.Assert.assertNotNull(vector46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(matrix51);
        org.junit.Assert.assertNotNull(cRSMatrix54);
        org.junit.Assert.assertNotNull(matrixMatrixOperation56);
        org.junit.Assert.assertNotNull(cCSMatrix59);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator60);
        org.junit.Assert.assertNotNull(basic2DMatrix64);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix71);
        org.junit.Assert.assertNotNull(matrix72);
        org.junit.Assert.assertNotNull(matrixAccumulator75);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-1.0d) + "'", double76 == (-1.0d));
        org.junit.Assert.assertNotNull(matrixProcedure77);
        org.junit.Assert.assertNotNull(matrix79);
        org.junit.Assert.assertNotNull(matrix80);
        org.junit.Assert.assertNotNull(intItor81);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct0 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix5 = rowMajorSparseMatrix4.removeLastRow();
        double double9 = rowMajorSparseMatrix4.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int10 = rowMajorSparseMatrix4.cardinality();
        org.la4j.Vector vector12 = rowMajorSparseMatrix4.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix15 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix16 = ooPlaceMatrixHadamardProduct0.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix4, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix15);
        org.la4j.matrix.DenseMatrix denseMatrix18 = org.la4j.matrix.DenseMatrix.identity((int) (short) 100);
        org.la4j.matrix.DenseMatrix denseMatrix20 = org.la4j.matrix.DenseMatrix.identity((int) (short) 100);
        org.la4j.Matrix matrix21 = ooPlaceMatrixHadamardProduct0.apply(denseMatrix18, denseMatrix20);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix24 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean25 = cCSMatrix24.isRowMajor();
        org.la4j.Matrix matrix28 = cCSMatrix24.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator29 = cCSMatrix24.nonZeroColumnMajorIterator();
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation30 = ooPlaceMatrixHadamardProduct0.partiallyApply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix24);
        org.la4j.matrix.DenseMatrix denseMatrix33 = org.la4j.matrix.DenseMatrix.diagonal(1, (double) (byte) 1);
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix36 = org.la4j.matrix.dense.Basic2DMatrix.unit((int) (byte) 1, (int) '4');
        java.lang.String str37 = basic2DMatrix36.toCSV();
        org.la4j.Matrix matrix38 = ooPlaceMatrixHadamardProduct0.apply(denseMatrix33, (org.la4j.matrix.DenseMatrix) basic2DMatrix36);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix42 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix43 = rowMajorSparseMatrix42.removeLastRow();
        double double47 = rowMajorSparseMatrix42.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix50 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean51 = cCSMatrix50.isRowMajor();
        org.la4j.Matrix matrix54 = cCSMatrix50.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator55 = cCSMatrix50.nonZeroColumnMajorIterator();
        double double58 = cCSMatrix50.get(0, (int) (byte) 1);
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator59 = org.la4j.Matrices.mkInfinityNormAccumulator();
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure60 = org.la4j.Matrices.asAccumulatorProcedure(matrixAccumulator59);
        cCSMatrix50.eachNonZero(matrixProcedure60);
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory62 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix63 = cCSMatrix50.to(basic1DMatrixMatrixFactory62);
        org.la4j.Matrix matrix64 = ooPlaceMatrixHadamardProduct0.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix42, (org.la4j.matrix.SparseMatrix) cCSMatrix50);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix4);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(vector12);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix15);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(denseMatrix18);
        org.junit.Assert.assertNotNull(denseMatrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(cCSMatrix24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator29);
        org.junit.Assert.assertNotNull(matrixMatrixOperation30);
        org.junit.Assert.assertNotNull(denseMatrix33);
        org.junit.Assert.assertNotNull(basic2DMatrix36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000\n" + "'", str37, "1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000\n");
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix42);
        org.junit.Assert.assertNotNull(matrix43);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertNotNull(cCSMatrix50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(matrix54);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator55);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(matrixAccumulator59);
        org.junit.Assert.assertNotNull(matrixProcedure60);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory62);
        org.junit.Assert.assertNotNull(basic1DMatrix63);
        org.junit.Assert.assertNotNull(matrix64);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.diagonal(2, 52.0d);
        org.junit.Assert.assertNotNull(cCSMatrix2);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix3 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean4 = cCSMatrix3.isRowMajor();
        org.la4j.Matrix matrix7 = cCSMatrix3.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator8 = cCSMatrix3.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix12 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix14 = rowMajorSparseMatrix12.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix18 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double22 = rowMajorSparseMatrix18.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix23 = rowMajorSparseMatrix18.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct24 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean25 = sparseMatrix23.equals((java.lang.Object) ooPlaceOuterProduct24);
        org.la4j.Matrix matrix26 = rowMajorSparseMatrix12.hadamardProduct((org.la4j.Matrix) sparseMatrix23);
        org.la4j.Matrix matrix27 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix3, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix12);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix31 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix32 = rowMajorSparseMatrix31.removeLastRow();
        double double36 = rowMajorSparseMatrix31.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int37 = rowMajorSparseMatrix31.cardinality();
        org.la4j.Vector vector39 = rowMajorSparseMatrix31.getRow(0);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation40 = ooPlaceMatricesSubtraction0.partiallyApply(rowMajorSparseMatrix31);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix41 = new org.la4j.matrix.dense.Basic1DMatrix();
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation42 = ooPlaceMatricesSubtraction0.partiallyApply((org.la4j.matrix.DenseMatrix) basic1DMatrix41);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix45 = org.la4j.matrix.sparse.CRSMatrix.zero(0, (int) (short) 0);
        double[][] doubleArray46 = new double[][] {};
        org.la4j.matrix.DenseMatrix denseMatrix47 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray46);
        org.la4j.matrix.DenseMatrix denseMatrix48 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray46);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix49 = denseMatrix48.toRowMajorSparseMatrix();
        org.la4j.Matrix matrix50 = ooPlaceMatricesSubtraction0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix45, denseMatrix48);
        org.la4j.Matrix matrix54 = org.la4j.Matrix.zero((int) (byte) 1, (int) (short) 0);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix58 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double59 = cRSMatrix58.min();
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator60 = cRSMatrix58.nonZeroRowMajorIterator();
        org.la4j.decomposition.RawLUDecompositor rawLUDecompositor61 = new org.la4j.decomposition.RawLUDecompositor((org.la4j.Matrix) cRSMatrix58);
        double double62 = cRSMatrix58.max();
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix64 = org.la4j.matrix.dense.Basic2DMatrix.identity(0);
        org.la4j.Matrix matrix65 = cRSMatrix58.kroneckerProduct((org.la4j.Matrix) basic2DMatrix64);
        org.la4j.vector.functor.VectorFunction vectorFunction69 = org.la4j.Vectors.asModFunction((double) (byte) 0);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator70 = org.la4j.Vectors.asProductFunctionAccumulator((double) (-1), vectorFunction69);
        matrix65.updateColumn((int) (short) 1, vectorFunction69);
        org.la4j.Matrix matrix72 = matrix54.transformRow(30, vectorFunction69);
        org.la4j.Matrix matrix73 = denseMatrix48.transformColumn(30, vectorFunction69);
        double double75 = denseMatrix48.minInColumn(19);
        org.junit.Assert.assertNotNull(cCSMatrix3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator8);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(matrix26);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix31);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(vector39);
        org.junit.Assert.assertNotNull(matrixMatrixOperation40);
        org.junit.Assert.assertNotNull(matrixMatrixOperation42);
        org.junit.Assert.assertNotNull(cRSMatrix45);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertNotNull(denseMatrix47);
        org.junit.Assert.assertNotNull(denseMatrix48);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix49);
        org.junit.Assert.assertNotNull(matrix50);
        org.junit.Assert.assertNotNull(matrix54);
        org.junit.Assert.assertNotNull(cRSMatrix58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator60);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertNotNull(basic2DMatrix64);
        org.junit.Assert.assertNotNull(matrix65);
        org.junit.Assert.assertNotNull(vectorFunction69);
        org.junit.Assert.assertNotNull(vectorAccumulator70);
        org.junit.Assert.assertNotNull(matrix72);
        org.junit.Assert.assertNotNull(matrix73);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + Double.POSITIVE_INFINITY + "'", double75 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix5 = rowMajorSparseMatrix4.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix7 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix8 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix4, denseMatrix7);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix11 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double12 = columnMajorSparseMatrix11.determinant();
        org.la4j.matrix.DenseMatrix denseMatrix15 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        double double16 = denseMatrix15.min();
        double double17 = denseMatrix15.sum();
        org.la4j.Matrix matrix18 = ooPlaceMatricesSubtraction0.apply(columnMajorSparseMatrix11, denseMatrix15);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix21 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator22 = cRSMatrix21.nonZeroIterator();
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation23 = ooPlaceMatricesSubtraction0.partiallyApply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix21);
        org.la4j.Matrix matrix28 = org.la4j.Matrix.diagonal((int) (short) 10, (double) 0);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator30 = org.la4j.Vectors.asSumAccumulator(100.0d);
        double[] doubleArray31 = matrix28.foldColumns(vectorAccumulator30);
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix32 = org.la4j.matrix.dense.Basic2DMatrix.from1DArray((int) 'a', (int) (byte) 0, doubleArray31);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix36 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix38 = rowMajorSparseMatrix36.divide((double) (-1));
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory39 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix40 = matrix38.to(basic1DMatrixMatrixFactory39);
        java.lang.Class<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixClass41 = basic1DMatrixMatrixFactory39.outputClass;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix42 = basic2DMatrix32.to(basic1DMatrixMatrixFactory39);
        java.util.Random random45 = null;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix46 = org.la4j.matrix.dense.Basic1DMatrix.random(10, (int) (byte) 0, random45);
        org.la4j.Matrix matrix47 = ooPlaceMatricesSubtraction0.apply((org.la4j.matrix.DenseMatrix) basic2DMatrix32, (org.la4j.matrix.DenseMatrix) basic1DMatrix46);
        java.text.NumberFormat numberFormat48 = null;
        java.lang.String str51 = matrix47.mkString(numberFormat48, "hi!", "\n");
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix4);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(denseMatrix7);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(denseMatrix15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.POSITIVE_INFINITY + "'", double16 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertNotNull(cRSMatrix21);
        org.junit.Assert.assertNotNull(matrixIterator22);
        org.junit.Assert.assertNotNull(matrixMatrixOperation23);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertNotNull(vectorAccumulator30);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(basic2DMatrix32);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix36);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory39);
        org.junit.Assert.assertNotNull(basic1DMatrix40);
        org.junit.Assert.assertNotNull(basic1DMatrixClass41);
        org.junit.Assert.assertNotNull(basic1DMatrix42);
        org.junit.Assert.assertNotNull(basic1DMatrix46);
        org.junit.Assert.assertNotNull(matrix47);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str51, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        java.util.Random random2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.DenseMatrix denseMatrix3 = org.la4j.matrix.DenseMatrix.random((int) 'a', 5, random2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.la4j.operation.ooplace.OoPlaceVectorsSubtraction ooPlaceVectorsSubtraction0 = new org.la4j.operation.ooplace.OoPlaceVectorsSubtraction();
        org.la4j.Matrix matrix7 = org.la4j.Matrix.diagonal((int) (short) 10, (double) 0);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator9 = org.la4j.Vectors.asSumAccumulator(100.0d);
        double[] doubleArray10 = matrix7.foldColumns(vectorAccumulator9);
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix11 = org.la4j.matrix.dense.Basic2DMatrix.from1DArray((int) 'a', (int) (byte) 0, doubleArray10);
        org.la4j.vector.DenseVector denseVector12 = org.la4j.vector.DenseVector.fromArray(doubleArray10);
        org.la4j.matrix.SparseMatrix sparseMatrix13 = org.la4j.matrix.SparseMatrix.from1DArray((int) (byte) 1, (int) (byte) 0, doubleArray10);
        org.la4j.vector.DenseVector denseVector14 = org.la4j.vector.DenseVector.fromArray(doubleArray10);
        org.la4j.vector.SparseVector sparseVector16 = org.la4j.vector.SparseVector.zero(0);
        org.la4j.Vector vector17 = ooPlaceVectorsSubtraction0.apply(denseVector14, sparseVector16);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition18 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix21 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double22 = cRSMatrix21.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix26 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix27 = rowMajorSparseMatrix26.removeLastRow();
        org.la4j.Matrix matrix28 = ooPlaceMatricesAddition18.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix21, rowMajorSparseMatrix26);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix31 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.matrix.DenseMatrix denseMatrix33 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix34 = ooPlaceMatricesAddition18.apply(columnMajorSparseMatrix31, denseMatrix33);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix37 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        byte[] byteArray38 = columnMajorSparseMatrix37.toBinary();
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation39 = ooPlaceMatricesAddition18.partiallyApply(columnMajorSparseMatrix37);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix42 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean43 = cCSMatrix42.isRowMajor();
        org.la4j.Matrix matrix46 = cCSMatrix42.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator47 = cCSMatrix42.nonZeroColumnMajorIterator();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate48 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix51 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        boolean boolean52 = advancedMatrixPredicate48.test((org.la4j.Matrix) columnMajorSparseMatrix51);
        org.la4j.Matrix matrix53 = columnMajorSparseMatrix51.rotate();
        boolean boolean54 = columnMajorSparseMatrix51.isRowMajor();
        boolean boolean55 = columnMajorSparseMatrix51.isRowMajor();
        org.la4j.Matrix matrix56 = ooPlaceMatricesAddition18.applySymmetric((org.la4j.matrix.SparseMatrix) cCSMatrix42, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix51);
        org.la4j.Vector vector58 = columnMajorSparseMatrix51.getRow((int) (short) 10);
        org.la4j.operation.MatrixVectorOperation<org.la4j.Vector> vectorMatrixVectorOperation59 = org.la4j.LinearAlgebra.OO_PLACE_MATRIX_BY_VECTOR_MULTIPLICATION;
        java.util.Random random61 = null;
        org.la4j.vector.DenseVector denseVector62 = org.la4j.vector.DenseVector.random(0, random61);
        java.lang.String str63 = denseVector62.toString();
        org.la4j.Matrix matrix64 = denseVector62.toColumnMatrix();
        org.la4j.Vector vector65 = columnMajorSparseMatrix51.apply(vectorMatrixVectorOperation59, (org.la4j.Vector) denseVector62);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator67 = org.la4j.Vectors.mkMaxAccumulator();
        double double68 = columnMajorSparseMatrix51.foldRow((int) (byte) 1, vectorAccumulator67);
        double double69 = vector17.fold(vectorAccumulator67);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(vectorAccumulator9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(basic2DMatrix11);
        org.junit.Assert.assertNotNull(denseVector12);
        org.junit.Assert.assertNotNull(sparseMatrix13);
        org.junit.Assert.assertNotNull(denseVector14);
        org.junit.Assert.assertNotNull(sparseVector16);
        org.junit.Assert.assertNotNull(vector17);
        org.junit.Assert.assertNotNull(cRSMatrix21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix26);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix31);
        org.junit.Assert.assertNotNull(denseMatrix33);
        org.junit.Assert.assertNotNull(matrix34);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix37);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[48, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(matrixMatrixOperation39);
        org.junit.Assert.assertNotNull(cCSMatrix42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(matrix46);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator47);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate48);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(matrix53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(matrix56);
        org.junit.Assert.assertNotNull(vector58);
        org.junit.Assert.assertNotNull(vectorMatrixVectorOperation59);
        org.junit.Assert.assertNotNull(denseVector62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(matrix64);
        org.junit.Assert.assertNotNull(vector65);
        org.junit.Assert.assertNotNull(vectorAccumulator67);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + Double.NEGATIVE_INFINITY + "'", double68 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 100.0d + "'", double69 == 100.0d);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.la4j.operation.VectorVectorOperation<org.la4j.Matrix> matrixVectorVectorOperation0 = org.la4j.LinearAlgebra.OO_PLACE_OUTER_PRODUCT;
        org.la4j.vector.SparseVector sparseVector2 = org.la4j.vector.SparseVector.zero(0);
        java.util.Random random4 = null;
        org.la4j.vector.DenseVector denseVector5 = org.la4j.vector.DenseVector.random(0, random4);
        org.la4j.Matrix matrix6 = matrixVectorVectorOperation0.apply(sparseVector2, denseVector5);
        org.la4j.vector.dense.BasicVector basicVector8 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector9 = basicVector8.copy();
        org.la4j.Matrix matrix10 = basicVector8.toDiagonalMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct11 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix16 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator17 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray18 = cCSMatrix16.foldRows(vectorAccumulator17);
        org.la4j.matrix.DenseMatrix denseMatrix19 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray18);
        org.la4j.vector.dense.BasicVector basicVector20 = new org.la4j.vector.dense.BasicVector(doubleArray18);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix25 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator26 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray27 = cCSMatrix25.foldRows(vectorAccumulator26);
        org.la4j.matrix.DenseMatrix denseMatrix28 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray27);
        org.la4j.vector.dense.BasicVector basicVector29 = new org.la4j.vector.dense.BasicVector(doubleArray27);
        ooPlaceOuterProduct11.ensureApplicableTo((org.la4j.Vector) basicVector20, (org.la4j.Vector) basicVector29);
        org.la4j.Matrix matrix31 = basicVector29.toColumnMatrix();
        org.la4j.Matrix matrix32 = matrixVectorVectorOperation0.apply((org.la4j.vector.DenseVector) basicVector8, (org.la4j.vector.DenseVector) basicVector29);
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct33 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix38 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator39 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray40 = cCSMatrix38.foldRows(vectorAccumulator39);
        org.la4j.matrix.DenseMatrix denseMatrix41 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray40);
        org.la4j.vector.dense.BasicVector basicVector42 = new org.la4j.vector.dense.BasicVector(doubleArray40);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix47 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator48 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray49 = cCSMatrix47.foldRows(vectorAccumulator48);
        org.la4j.matrix.DenseMatrix denseMatrix50 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray49);
        org.la4j.vector.dense.BasicVector basicVector51 = new org.la4j.vector.dense.BasicVector(doubleArray49);
        ooPlaceOuterProduct33.ensureApplicableTo((org.la4j.Vector) basicVector42, (org.la4j.Vector) basicVector51);
        org.la4j.vector.sparse.CompressedVector compressedVector54 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector54.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector59 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix60 = ooPlaceOuterProduct33.apply((org.la4j.vector.SparseVector) compressedVector54, (org.la4j.vector.SparseVector) compressedVector59);
        boolean boolean62 = compressedVector59.isZeroAt((int) (short) 1);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix65 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator66 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray67 = cCSMatrix65.foldRows(vectorAccumulator66);
        org.la4j.Vector vector68 = org.la4j.Vector.fromArray(doubleArray67);
        org.la4j.vector.dense.BasicVector basicVector69 = org.la4j.vector.dense.BasicVector.fromArray(doubleArray67);
        org.la4j.vector.dense.BasicVector basicVector70 = new org.la4j.vector.dense.BasicVector(doubleArray67);
        matrixVectorVectorOperation0.ensureApplicableTo((org.la4j.Vector) compressedVector59, (org.la4j.Vector) basicVector70);
        org.junit.Assert.assertNotNull(matrixVectorVectorOperation0);
        org.junit.Assert.assertNotNull(sparseVector2);
        org.junit.Assert.assertNotNull(denseVector5);
        org.junit.Assert.assertNotNull(matrix6);
        org.junit.Assert.assertNotNull(vector9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(cCSMatrix16);
        org.junit.Assert.assertNotNull(vectorAccumulator17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix19);
        org.junit.Assert.assertNotNull(cCSMatrix25);
        org.junit.Assert.assertNotNull(vectorAccumulator26);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix28);
        org.junit.Assert.assertNotNull(matrix31);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertNotNull(cCSMatrix38);
        org.junit.Assert.assertNotNull(vectorAccumulator39);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix41);
        org.junit.Assert.assertNotNull(cCSMatrix47);
        org.junit.Assert.assertNotNull(vectorAccumulator48);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix50);
        org.junit.Assert.assertNotNull(matrix60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(cCSMatrix65);
        org.junit.Assert.assertNotNull(vectorAccumulator66);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(vector68);
        org.junit.Assert.assertNotNull(basicVector69);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.la4j.vector.sparse.CompressedVector compressedVector1 = org.la4j.vector.sparse.CompressedVector.zero(1);
        org.junit.Assert.assertNotNull(compressedVector1);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator3 = cRSMatrix2.nonZeroIterator();
        org.la4j.Vector vector5 = cRSMatrix2.getColumn(100);
        boolean boolean8 = cRSMatrix2.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator10 = cRSMatrix2.nonZeroIteratorOfColumn((-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix11 = cRSMatrix2.toRowMajorSparseMatrix();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory12 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix13 = cRSMatrix2.to(basic1DMatrixMatrixFactory12);
        org.la4j.linear.SquareRootSolver squareRootSolver14 = new org.la4j.linear.SquareRootSolver((org.la4j.Matrix) basic1DMatrix13);
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction15 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix18 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator19 = cCSMatrix18.nonZeroColumnMajorIterator();
        org.la4j.matrix.DenseMatrix denseMatrix21 = org.la4j.matrix.DenseMatrix.identity((int) (short) 100);
        org.la4j.Matrix matrix22 = ooPlaceMatricesSubtraction15.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix18, denseMatrix21);
        boolean boolean23 = squareRootSolver14.applicableTo((org.la4j.Matrix) cCSMatrix18);
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertNotNull(matrixIterator3);
        org.junit.Assert.assertNotNull(vector5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(vectorIterator10);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix11);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory12);
        org.junit.Assert.assertNotNull(basic1DMatrix13);
        org.junit.Assert.assertNotNull(cCSMatrix18);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator19);
        org.junit.Assert.assertNotNull(denseMatrix21);
        org.junit.Assert.assertNotNull(matrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        double[] doubleArray6 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray13 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray20 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray27 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray34 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray35 = new double[][] { doubleArray6, doubleArray13, doubleArray20, doubleArray27, doubleArray34 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix36 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray35);
        org.la4j.Vector vector38 = basic2DMatrix36.getRow((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector40 = basic2DMatrix36.getRow((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertNotNull(basic2DMatrix36);
        org.junit.Assert.assertNotNull(vector38);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.identity((int) (byte) 0);
        org.la4j.Matrix matrix3 = ooPlaceMatrixByItsTransposeMultiplication0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix2);
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction4 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix7 = org.la4j.matrix.dense.Basic2DMatrix.unit((int) (byte) 1, (int) '4');
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction8 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix11 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean12 = cCSMatrix11.isRowMajor();
        org.la4j.Matrix matrix15 = cCSMatrix11.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator16 = cCSMatrix11.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix20 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix22 = rowMajorSparseMatrix20.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix26 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double30 = rowMajorSparseMatrix26.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix31 = rowMajorSparseMatrix26.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct32 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean33 = sparseMatrix31.equals((java.lang.Object) ooPlaceOuterProduct32);
        org.la4j.Matrix matrix34 = rowMajorSparseMatrix20.hadamardProduct((org.la4j.Matrix) sparseMatrix31);
        org.la4j.Matrix matrix35 = ooPlaceMatricesSubtraction8.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix11, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix20);
        org.la4j.Matrix matrix36 = ooPlaceMatricesSubtraction4.apply((org.la4j.matrix.DenseMatrix) basic2DMatrix7, rowMajorSparseMatrix20);
        org.la4j.decomposition.SingularValueDecompositor singularValueDecompositor37 = new org.la4j.decomposition.SingularValueDecompositor((org.la4j.Matrix) rowMajorSparseMatrix20);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix40 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator41 = cRSMatrix40.nonZeroIterator();
        org.la4j.Vector vector43 = cRSMatrix40.getColumn(100);
        boolean boolean46 = cRSMatrix40.nonZeroAt(1, (int) (short) 0);
        org.la4j.decomposition.RawLUDecompositor rawLUDecompositor47 = new org.la4j.decomposition.RawLUDecompositor((org.la4j.Matrix) cRSMatrix40);
        double double48 = cRSMatrix40.infinityNorm();
        boolean boolean49 = singularValueDecompositor37.applicableTo((org.la4j.Matrix) cRSMatrix40);
        org.la4j.Matrix matrix50 = ooPlaceMatrixByItsTransposeMultiplication0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix40);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix54 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double58 = rowMajorSparseMatrix54.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix59 = rowMajorSparseMatrix54.toSparseMatrix();
        org.la4j.Matrix matrix60 = rowMajorSparseMatrix54.removeFirstColumn();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix61 = rowMajorSparseMatrix54.toColumnMajorSparseMatrix();
        org.la4j.Matrix matrix62 = ooPlaceMatrixByItsTransposeMultiplication0.apply(rowMajorSparseMatrix54);
        org.la4j.Matrix matrix63 = matrix62.removeFirstColumn();
        org.junit.Assert.assertNotNull(cCSMatrix2);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertNotNull(basic2DMatrix7);
        org.junit.Assert.assertNotNull(cCSMatrix11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator16);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix20);
        org.junit.Assert.assertNotNull(matrix22);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix26);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(matrix34);
        org.junit.Assert.assertNotNull(matrix35);
        org.junit.Assert.assertNotNull(matrix36);
        org.junit.Assert.assertNotNull(cRSMatrix40);
        org.junit.Assert.assertNotNull(matrixIterator41);
        org.junit.Assert.assertNotNull(vector43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(matrix50);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix54);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix59);
        org.junit.Assert.assertNotNull(matrix60);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix61);
        org.junit.Assert.assertNotNull(matrix62);
        org.junit.Assert.assertNotNull(matrix63);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix2 = new org.la4j.matrix.dense.Basic2DMatrix((int) '#', (int) '4');
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct1 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix6 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator7 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray8 = cCSMatrix6.foldRows(vectorAccumulator7);
        org.la4j.matrix.DenseMatrix denseMatrix9 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray8);
        org.la4j.vector.dense.BasicVector basicVector10 = new org.la4j.vector.dense.BasicVector(doubleArray8);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix15 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator16 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray17 = cCSMatrix15.foldRows(vectorAccumulator16);
        org.la4j.matrix.DenseMatrix denseMatrix18 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray17);
        org.la4j.vector.dense.BasicVector basicVector19 = new org.la4j.vector.dense.BasicVector(doubleArray17);
        ooPlaceOuterProduct1.ensureApplicableTo((org.la4j.Vector) basicVector10, (org.la4j.Vector) basicVector19);
        java.lang.String str21 = basicVector19.toString();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix24 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double25 = columnMajorSparseMatrix24.determinant();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory26 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix27 = columnMajorSparseMatrix24.to(basic1DMatrixMatrixFactory26);
        org.la4j.Vector vector28 = ooPlaceVectorByMatrixMultiplication0.apply((org.la4j.vector.DenseVector) basicVector19, columnMajorSparseMatrix24);
        org.la4j.vector.dense.BasicVector basicVector30 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        int int31 = basicVector30.length();
        org.la4j.Vector vector32 = basicVector30.shuffle();
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct33 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix36 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator37 = cRSMatrix36.nonZeroIterator();
        org.la4j.Vector vector39 = cRSMatrix36.getColumn(100);
        boolean boolean42 = cRSMatrix36.nonZeroAt(1, (int) (short) 0);
        org.la4j.decomposition.RawLUDecompositor rawLUDecompositor43 = new org.la4j.decomposition.RawLUDecompositor((org.la4j.Matrix) cRSMatrix36);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix47 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix48 = rowMajorSparseMatrix47.removeLastRow();
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure49 = null;
        rowMajorSparseMatrix47.eachNonZero(matrixProcedure49);
        org.la4j.Matrix matrix51 = ooPlaceMatrixHadamardProduct33.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix36, rowMajorSparseMatrix47);
        org.la4j.Matrix matrix54 = org.la4j.Matrix.zero((int) (byte) 1, (int) (short) 0);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix55 = matrix54.toRowMajorSparseMatrix();
        org.la4j.matrix.DenseMatrix denseMatrix57 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix58 = ooPlaceMatrixHadamardProduct33.apply(rowMajorSparseMatrix55, denseMatrix57);
        org.la4j.Matrix matrix60 = matrix58.multiply(100.0d);
        // The following exception was thrown during execution in test generation
        try {
            ooPlaceVectorByMatrixMultiplication0.ensureApplicableTo((org.la4j.Vector) basicVector30, matrix58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given vector should have the same length as number of rows in the given matrix: 10 does not equal to 1.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix6);
        org.junit.Assert.assertNotNull(vectorAccumulator7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix9);
        org.junit.Assert.assertNotNull(cCSMatrix15);
        org.junit.Assert.assertNotNull(vectorAccumulator16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000" + "'", str21, "1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000");
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory26);
        org.junit.Assert.assertNotNull(basic1DMatrix27);
        org.junit.Assert.assertNotNull(vector28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(vector32);
        org.junit.Assert.assertNotNull(cRSMatrix36);
        org.junit.Assert.assertNotNull(matrixIterator37);
        org.junit.Assert.assertNotNull(vector39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix47);
        org.junit.Assert.assertNotNull(matrix48);
        org.junit.Assert.assertNotNull(matrix51);
        org.junit.Assert.assertNotNull(matrix54);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix55);
        org.junit.Assert.assertNotNull(denseMatrix57);
        org.junit.Assert.assertNotNull(matrix58);
        org.junit.Assert.assertNotNull(matrix60);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct0 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix3 = org.la4j.matrix.dense.Basic2DMatrix.diagonal((int) (byte) 100, (double) (short) 10);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix6 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator7 = cRSMatrix6.nonZeroIterator();
        org.la4j.Vector vector9 = cRSMatrix6.getColumn(100);
        boolean boolean12 = cRSMatrix6.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator14 = cRSMatrix6.nonZeroIteratorOfColumn((-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix15 = cRSMatrix6.toRowMajorSparseMatrix();
        org.la4j.Matrix matrix16 = ooPlaceMatrixHadamardProduct0.applySymmetric((org.la4j.matrix.DenseMatrix) basic2DMatrix3, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix15);
        double[][] doubleArray17 = basic2DMatrix3.toArray();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix18 = org.la4j.matrix.RowMajorSparseMatrix.from2DArray(doubleArray17);
        org.junit.Assert.assertNotNull(basic2DMatrix3);
        org.junit.Assert.assertNotNull(cRSMatrix6);
        org.junit.Assert.assertNotNull(matrixIterator7);
        org.junit.Assert.assertNotNull(vector9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(vectorIterator14);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix15);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix18);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix3 = org.la4j.matrix.ColumnMajorSparseMatrix.zero((int) ' ', 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix3);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix5 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator6 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray7 = cCSMatrix5.foldRows(vectorAccumulator6);
        org.la4j.matrix.DenseMatrix denseMatrix8 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray7);
        org.la4j.vector.dense.BasicVector basicVector9 = new org.la4j.vector.dense.BasicVector(doubleArray7);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix14 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator15 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray16 = cCSMatrix14.foldRows(vectorAccumulator15);
        org.la4j.matrix.DenseMatrix denseMatrix17 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray16);
        org.la4j.vector.dense.BasicVector basicVector18 = new org.la4j.vector.dense.BasicVector(doubleArray16);
        ooPlaceOuterProduct0.ensureApplicableTo((org.la4j.Vector) basicVector9, (org.la4j.Vector) basicVector18);
        org.la4j.vector.sparse.CompressedVector compressedVector21 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector21.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector26 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix27 = ooPlaceOuterProduct0.apply((org.la4j.vector.SparseVector) compressedVector21, (org.la4j.vector.SparseVector) compressedVector26);
        org.la4j.vector.functor.VectorFunction vectorFunction29 = org.la4j.Vectors.INC_FUNCTION;
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator30 = org.la4j.Vectors.asProductFunctionAccumulator((double) (byte) 100, vectorFunction29);
        double double31 = compressedVector21.fold(vectorAccumulator30);
        org.la4j.Vector vector33 = compressedVector21.subtract((double) 1.0f);
        org.la4j.Vector vector35 = compressedVector21.add((double) (byte) 10);
        compressedVector21.set(0, 1.0d);
        org.junit.Assert.assertNotNull(cCSMatrix5);
        org.junit.Assert.assertNotNull(vectorAccumulator6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix8);
        org.junit.Assert.assertNotNull(cCSMatrix14);
        org.junit.Assert.assertNotNull(vectorAccumulator15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix17);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(vectorFunction29);
        org.junit.Assert.assertNotNull(vectorAccumulator30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertNotNull(vector33);
        org.junit.Assert.assertNotNull(vector35);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        double[] doubleArray6 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray13 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray20 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray27 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray34 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray35 = new double[][] { doubleArray6, doubleArray13, doubleArray20, doubleArray27, doubleArray34 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix36 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray35);
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix37 = new org.la4j.matrix.dense.Basic2DMatrix(doubleArray35);
        // The following exception was thrown during execution in test generation
        try {
            double double39 = basic2DMatrix37.maxInRow((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertNotNull(basic2DMatrix36);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.la4j.vector.dense.BasicVector basicVector1 = org.la4j.vector.dense.BasicVector.unit((int) (short) 0);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition2 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix5 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double6 = cRSMatrix5.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix10 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix11 = rowMajorSparseMatrix10.removeLastRow();
        org.la4j.Matrix matrix12 = ooPlaceMatricesAddition2.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix5, rowMajorSparseMatrix10);
        boolean boolean13 = basicVector1.equals((java.lang.Object) rowMajorSparseMatrix10);
        org.la4j.Matrix matrix14 = basicVector1.toDiagonalMatrix();
        int int15 = matrix14.rank();
        org.junit.Assert.assertNotNull(basicVector1);
        org.junit.Assert.assertNotNull(cRSMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix10);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(matrix12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        double double5 = cCSMatrix2.get((int) (byte) 0, (int) (short) 1);
        org.la4j.vector.functor.VectorFunction vectorFunction7 = org.la4j.Vectors.DEC_FUNCTION;
        org.la4j.Matrix matrix8 = cCSMatrix2.transformRow(10, vectorFunction7);
        boolean boolean11 = cCSMatrix2.nonZeroAt(10, (int) (byte) 1);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator12 = cCSMatrix2.nonZeroColumnMajorIterator();
        int int13 = columnMajorMatrixIterator12.columnIndex();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix16 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator17 = cRSMatrix16.nonZeroIterator();
        org.la4j.Vector vector19 = cRSMatrix16.getColumn(100);
        boolean boolean22 = cRSMatrix16.nonZeroAt(1, (int) (short) 0);
        org.la4j.decomposition.RawLUDecompositor rawLUDecompositor23 = new org.la4j.decomposition.RawLUDecompositor((org.la4j.Matrix) cRSMatrix16);
        org.la4j.Matrix matrix24 = rawLUDecompositor23.self();
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator25 = matrix24.columnMajorIterator();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix28 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator29 = cCSMatrix28.nonZeroColumnMajorIterator();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix32 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean33 = cCSMatrix32.isRowMajor();
        org.la4j.Matrix matrix36 = cCSMatrix32.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator37 = cCSMatrix32.nonZeroColumnMajorIterator();
        org.la4j.iterator.MatrixIterator matrixIterator38 = columnMajorMatrixIterator29.andAlsoDivide((org.la4j.iterator.MatrixIterator) columnMajorMatrixIterator37);
        org.la4j.iterator.MatrixIterator matrixIterator39 = columnMajorMatrixIterator25.orElseSubtract((org.la4j.iterator.MatrixIterator) columnMajorMatrixIterator37);
        org.la4j.iterator.MatrixIterator matrixIterator40 = columnMajorMatrixIterator12.andAlsoMultiply(matrixIterator39);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix47 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator48 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray49 = cCSMatrix47.foldRows(vectorAccumulator48);
        org.la4j.matrix.DenseMatrix denseMatrix50 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray49);
        org.la4j.vector.dense.BasicVector basicVector51 = new org.la4j.vector.dense.BasicVector(doubleArray49);
        org.la4j.matrix.SparseMatrix sparseMatrix52 = org.la4j.matrix.SparseMatrix.from1DArray((int) (byte) 0, (int) '4', doubleArray49);
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator53 = sparseMatrix52.nonZeroRowMajorIterator();
        org.la4j.iterator.MatrixIterator matrixIterator54 = columnMajorMatrixIterator12.orElseSubtract((org.la4j.iterator.MatrixIterator) rowMajorMatrixIterator53);
        org.junit.Assert.assertNotNull(cCSMatrix2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(vectorFunction7);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(cRSMatrix16);
        org.junit.Assert.assertNotNull(matrixIterator17);
        org.junit.Assert.assertNotNull(vector19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(matrix24);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator25);
        org.junit.Assert.assertNotNull(cCSMatrix28);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator29);
        org.junit.Assert.assertNotNull(cCSMatrix32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(matrix36);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator37);
        org.junit.Assert.assertNotNull(matrixIterator38);
        org.junit.Assert.assertNotNull(matrixIterator39);
        org.junit.Assert.assertNotNull(matrixIterator40);
        org.junit.Assert.assertNotNull(cCSMatrix47);
        org.junit.Assert.assertNotNull(vectorAccumulator48);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix50);
        org.junit.Assert.assertNotNull(sparseMatrix52);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator53);
        org.junit.Assert.assertNotNull(matrixIterator54);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        double double3 = cCSMatrix2.max();
        cCSMatrix2.setAll((double) 100L);
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation6 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray13 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray20 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray27 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray34 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray41 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray42 = new double[][] { doubleArray13, doubleArray20, doubleArray27, doubleArray34, doubleArray41 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix43 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray42);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation44 = matrixMatrixMatrixOperation6.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix43);
        double[][] doubleArray45 = new double[][] {};
        org.la4j.matrix.DenseMatrix denseMatrix46 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray45);
        double[] doubleArray53 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray60 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray67 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray74 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray81 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray82 = new double[][] { doubleArray53, doubleArray60, doubleArray67, doubleArray74, doubleArray81 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix83 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray82);
        basic2DMatrix83.setAll((double) 100);
        org.la4j.Matrix matrix86 = matrixMatrixMatrixOperation6.apply(denseMatrix46, (org.la4j.matrix.DenseMatrix) basic2DMatrix83);
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory87 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix88 = basic2DMatrix83.to(basic1DMatrixMatrixFactory87);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix89 = cCSMatrix2.to(basic1DMatrixMatrixFactory87);
        org.junit.Assert.assertNotNull(cCSMatrix2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation6);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(basic2DMatrix43);
        org.junit.Assert.assertNotNull(matrixMatrixOperation44);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertNotNull(denseMatrix46);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertNotNull(basic2DMatrix83);
        org.junit.Assert.assertNotNull(matrix86);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory87);
        org.junit.Assert.assertNotNull(basic1DMatrix88);
        org.junit.Assert.assertNotNull(basic1DMatrix89);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.la4j.matrix.functor.MatrixFunction matrixFunction2 = org.la4j.Matrices.asMulFunction(0.0d);
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator3 = org.la4j.Matrices.asSumFunctionAccumulator(1.0E10d, matrixFunction2);
        double double7 = matrixFunction2.evaluate((int) (short) 0, (int) (short) -1, (double) 0);
        org.junit.Assert.assertNotNull(matrixFunction2);
        org.junit.Assert.assertNotNull(matrixAccumulator3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix8 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator9 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray10 = cCSMatrix8.foldRows(vectorAccumulator9);
        org.la4j.matrix.DenseMatrix denseMatrix11 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray10);
        org.la4j.vector.dense.BasicVector basicVector12 = new org.la4j.vector.dense.BasicVector(doubleArray10);
        org.la4j.Vector vector13 = org.la4j.Vector.fromArray(doubleArray10);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix14 = org.la4j.matrix.ColumnMajorSparseMatrix.from1DArray(1, 10, doubleArray10);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix19 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator20 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray21 = cCSMatrix19.foldRows(vectorAccumulator20);
        int[] intArray24 = new int[] { (short) 10, (short) 100 };
        org.la4j.vector.sparse.CompressedVector compressedVector25 = new org.la4j.vector.sparse.CompressedVector((int) (short) 1, 1, doubleArray21, intArray24);
        org.la4j.vector.sparse.CompressedVector compressedVector26 = new org.la4j.vector.sparse.CompressedVector((int) 'a', 52, doubleArray10, intArray24);
        org.junit.Assert.assertNotNull(cCSMatrix8);
        org.junit.Assert.assertNotNull(vectorAccumulator9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix11);
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix14);
        org.junit.Assert.assertNotNull(cCSMatrix19);
        org.junit.Assert.assertNotNull(vectorAccumulator20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 100]");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix5 = rowMajorSparseMatrix4.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix7 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix8 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix4, denseMatrix7);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix11 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double12 = columnMajorSparseMatrix11.determinant();
        org.la4j.matrix.DenseMatrix denseMatrix15 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        double double16 = denseMatrix15.min();
        double double17 = denseMatrix15.sum();
        org.la4j.Matrix matrix18 = ooPlaceMatricesSubtraction0.apply(columnMajorSparseMatrix11, denseMatrix15);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix21 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator22 = cRSMatrix21.nonZeroIterator();
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation23 = ooPlaceMatricesSubtraction0.partiallyApply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix21);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix26 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator27 = cRSMatrix26.nonZeroIterator();
        org.la4j.Vector vector29 = cRSMatrix26.getColumn(100);
        boolean boolean32 = cRSMatrix26.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator34 = cRSMatrix26.nonZeroIteratorOfColumn((-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix35 = cRSMatrix26.toRowMajorSparseMatrix();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory36 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix37 = cRSMatrix26.to(basic1DMatrixMatrixFactory36);
        org.la4j.linear.SquareRootSolver squareRootSolver38 = new org.la4j.linear.SquareRootSolver((org.la4j.Matrix) basic1DMatrix37);
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation39 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray46 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray53 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray60 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray67 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray74 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray75 = new double[][] { doubleArray46, doubleArray53, doubleArray60, doubleArray67, doubleArray74 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix76 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray75);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation77 = matrixMatrixMatrixOperation39.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix76);
        java.util.Spliterator<java.lang.Double> doubleSpliterator78 = basic2DMatrix76.spliterator();
        org.la4j.Matrix matrix81 = basic2DMatrix76.copyOfShape(0, (int) (byte) 100);
        double[][] doubleArray82 = basic2DMatrix76.toArray();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix83 = org.la4j.matrix.sparse.CRSMatrix.from2DArray(doubleArray82);
        org.la4j.Matrix matrix84 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.DenseMatrix) basic1DMatrix37, (org.la4j.matrix.SparseMatrix) cRSMatrix83);
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator85 = org.la4j.Matrices.mkInfinityNormAccumulator();
        double double86 = matrixAccumulator85.accumulate();
        double double87 = matrixAccumulator85.accumulate();
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure88 = org.la4j.Matrices.asAccumulatorProcedure(matrixAccumulator85);
        cRSMatrix83.each(matrixProcedure88);
        org.la4j.Matrix matrix90 = cRSMatrix83.transpose();
        org.la4j.Matrix matrix91 = cRSMatrix83.rotate();
        org.la4j.iterator.VectorIterator vectorIterator93 = cRSMatrix83.nonZeroIteratorOfRow((int) (byte) 0);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix4);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(denseMatrix7);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(denseMatrix15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.POSITIVE_INFINITY + "'", double16 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertNotNull(cRSMatrix21);
        org.junit.Assert.assertNotNull(matrixIterator22);
        org.junit.Assert.assertNotNull(matrixMatrixOperation23);
        org.junit.Assert.assertNotNull(cRSMatrix26);
        org.junit.Assert.assertNotNull(matrixIterator27);
        org.junit.Assert.assertNotNull(vector29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(vectorIterator34);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix35);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory36);
        org.junit.Assert.assertNotNull(basic1DMatrix37);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation39);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertNotNull(basic2DMatrix76);
        org.junit.Assert.assertNotNull(matrixMatrixOperation77);
        org.junit.Assert.assertNotNull(doubleSpliterator78);
        org.junit.Assert.assertNotNull(matrix81);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertNotNull(cRSMatrix83);
        org.junit.Assert.assertNotNull(matrix84);
        org.junit.Assert.assertNotNull(matrixAccumulator85);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + Double.NEGATIVE_INFINITY + "'", double86 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + Double.NEGATIVE_INFINITY + "'", double87 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(matrixProcedure88);
        org.junit.Assert.assertNotNull(matrix90);
        org.junit.Assert.assertNotNull(matrix91);
        org.junit.Assert.assertNotNull(vectorIterator93);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.la4j.Vector vector1 = org.la4j.Vector.unit(30);
        org.junit.Assert.assertNotNull(vector1);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.la4j.matrix.SparseMatrix sparseMatrix2 = org.la4j.matrix.SparseMatrix.diagonal(2, 9.0d);
        org.junit.Assert.assertNotNull(sparseMatrix2);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix5 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator6 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray7 = cCSMatrix5.foldRows(vectorAccumulator6);
        org.la4j.matrix.DenseMatrix denseMatrix8 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray7);
        org.la4j.vector.dense.BasicVector basicVector9 = new org.la4j.vector.dense.BasicVector(doubleArray7);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix14 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator15 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray16 = cCSMatrix14.foldRows(vectorAccumulator15);
        org.la4j.matrix.DenseMatrix denseMatrix17 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray16);
        org.la4j.vector.dense.BasicVector basicVector18 = new org.la4j.vector.dense.BasicVector(doubleArray16);
        ooPlaceOuterProduct0.ensureApplicableTo((org.la4j.Vector) basicVector9, (org.la4j.Vector) basicVector18);
        org.la4j.vector.DenseVector denseVector21 = org.la4j.vector.DenseVector.unit(0);
        double double22 = denseVector21.min();
        org.la4j.operation.VectorOperation<org.la4j.Matrix> matrixVectorOperation23 = ooPlaceOuterProduct0.partiallyApply(denseVector21);
        org.la4j.vector.sparse.CompressedVector compressedVector25 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        double double26 = compressedVector25.euclideanNorm();
        org.la4j.vector.VectorFactory<org.la4j.vector.dense.BasicVector> basicVectorVectorFactory27 = org.la4j.Vectors.DENSE;
        java.lang.Class<org.la4j.vector.dense.BasicVector> basicVectorClass28 = basicVectorVectorFactory27.outputClass;
        org.la4j.vector.dense.BasicVector basicVector29 = compressedVector25.to(basicVectorVectorFactory27);
        org.la4j.vector.DenseVector denseVector31 = org.la4j.vector.DenseVector.unit(0);
        java.text.NumberFormat numberFormat32 = null;
        java.lang.String str33 = denseVector31.toMatrixMarket(numberFormat32);
        org.la4j.iterator.VectorIterator vectorIterator34 = denseVector31.iterator();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix37 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator38 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray39 = cCSMatrix37.foldRows(vectorAccumulator38);
        org.la4j.vector.dense.BasicVector basicVector40 = org.la4j.vector.dense.BasicVector.fromArray(doubleArray39);
        org.la4j.Matrix matrix41 = basicVector40.toRowMatrix();
        org.la4j.vector.functor.VectorPredicate vectorPredicate42 = org.la4j.Vectors.ZERO_VECTOR;
        boolean boolean43 = basicVector40.non(vectorPredicate42);
        boolean boolean44 = denseVector31.is(vectorPredicate42);
        boolean boolean47 = vectorPredicate42.test((int) ' ', 1.0E100d);
        boolean boolean48 = basicVector29.is(vectorPredicate42);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector49 = denseVector21.subtract((org.la4j.Vector) basicVector29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given vectors should have the same length: 0 does not equal to 32.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix5);
        org.junit.Assert.assertNotNull(vectorAccumulator6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix8);
        org.junit.Assert.assertNotNull(cCSMatrix14);
        org.junit.Assert.assertNotNull(vectorAccumulator15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix17);
        org.junit.Assert.assertNotNull(denseVector21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + Double.POSITIVE_INFINITY + "'", double22 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(matrixVectorOperation23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(basicVectorVectorFactory27);
        org.junit.Assert.assertNotNull(basicVectorClass28);
        org.junit.Assert.assertNotNull(basicVector29);
        org.junit.Assert.assertNotNull(denseVector31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "%%MatrixMarket vector array real\n0\n" + "'", str33, "%%MatrixMarket vector array real\n0\n");
        org.junit.Assert.assertNotNull(vectorIterator34);
        org.junit.Assert.assertNotNull(cCSMatrix37);
        org.junit.Assert.assertNotNull(vectorAccumulator38);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(basicVector40);
        org.junit.Assert.assertNotNull(matrix41);
        org.junit.Assert.assertNotNull(vectorPredicate42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix2 = org.la4j.matrix.ColumnMajorSparseMatrix.diagonal((int) (byte) 10, (double) 0L);
        org.la4j.decomposition.QRDecompositor qRDecompositor3 = new org.la4j.decomposition.QRDecompositor((org.la4j.Matrix) columnMajorSparseMatrix2);
        org.la4j.Matrix matrix4 = qRDecompositor3.self();
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction5 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix8 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean9 = cCSMatrix8.isRowMajor();
        org.la4j.Matrix matrix12 = cCSMatrix8.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator13 = cCSMatrix8.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix17 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix19 = rowMajorSparseMatrix17.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix23 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double27 = rowMajorSparseMatrix23.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix28 = rowMajorSparseMatrix23.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct29 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean30 = sparseMatrix28.equals((java.lang.Object) ooPlaceOuterProduct29);
        org.la4j.Matrix matrix31 = rowMajorSparseMatrix17.hadamardProduct((org.la4j.Matrix) sparseMatrix28);
        org.la4j.Matrix matrix32 = ooPlaceMatricesSubtraction5.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix8, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix17);
        boolean boolean33 = qRDecompositor3.applicableTo(matrix32);
        org.la4j.Matrix matrix34 = qRDecompositor3.self();
        org.la4j.Matrix matrix36 = matrix34.copyOfColumns(10);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix2);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertNotNull(cCSMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(matrix12);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator13);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix17);
        org.junit.Assert.assertNotNull(matrix19);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix23);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(matrix31);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(matrix34);
        org.junit.Assert.assertNotNull(matrix36);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix5 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator6 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray7 = cCSMatrix5.foldRows(vectorAccumulator6);
        org.la4j.matrix.DenseMatrix denseMatrix8 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray7);
        org.la4j.vector.dense.BasicVector basicVector9 = new org.la4j.vector.dense.BasicVector(doubleArray7);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix14 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator15 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray16 = cCSMatrix14.foldRows(vectorAccumulator15);
        org.la4j.matrix.DenseMatrix denseMatrix17 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray16);
        org.la4j.vector.dense.BasicVector basicVector18 = new org.la4j.vector.dense.BasicVector(doubleArray16);
        ooPlaceOuterProduct0.ensureApplicableTo((org.la4j.Vector) basicVector9, (org.la4j.Vector) basicVector18);
        org.la4j.vector.sparse.CompressedVector compressedVector21 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector21.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector26 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix27 = ooPlaceOuterProduct0.apply((org.la4j.vector.SparseVector) compressedVector21, (org.la4j.vector.SparseVector) compressedVector26);
        org.la4j.Matrix matrix28 = compressedVector26.toDiagonalMatrix();
        double double29 = compressedVector26.infinityNorm();
        org.la4j.iterator.VectorIterator vectorIterator30 = compressedVector26.nonZeroIterator();
        org.junit.Assert.assertNotNull(cCSMatrix5);
        org.junit.Assert.assertNotNull(vectorAccumulator6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix8);
        org.junit.Assert.assertNotNull(cCSMatrix14);
        org.junit.Assert.assertNotNull(vectorAccumulator15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix17);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(vectorIterator30);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix1 = org.la4j.matrix.dense.Basic1DMatrix.identity((int) '#');
        org.junit.Assert.assertNotNull(basic1DMatrix1);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate0 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix3 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        boolean boolean4 = advancedMatrixPredicate0.test((org.la4j.Matrix) columnMajorSparseMatrix3);
        org.la4j.iterator.MatrixIterator matrixIterator5 = columnMajorSparseMatrix3.nonZeroIterator();
        org.junit.Assert.assertNotNull(advancedMatrixPredicate0);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(matrixIterator5);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.la4j.operation.VectorMatrixOperation<org.la4j.Vector> vectorVectorMatrixOperation0 = org.la4j.LinearAlgebra.OO_PLACE_VECTOR_BY_MATRIX_MULTIPLICATION;
        org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication1 = new org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix6 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator7 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray8 = cCSMatrix6.foldRows(vectorAccumulator7);
        org.la4j.matrix.DenseMatrix denseMatrix9 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray8);
        org.la4j.vector.dense.BasicVector basicVector11 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector12 = ooPlaceMatrixByVectorMultiplication1.apply(denseMatrix9, (org.la4j.vector.DenseVector) basicVector11);
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation13 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray20 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray27 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray34 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray41 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray48 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray49 = new double[][] { doubleArray20, doubleArray27, doubleArray34, doubleArray41, doubleArray48 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix50 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray49);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation51 = matrixMatrixMatrixOperation13.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix50);
        org.la4j.operation.VectorOperation<org.la4j.Vector> vectorVectorOperation52 = ooPlaceMatrixByVectorMultiplication1.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix50);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix55 = org.la4j.matrix.sparse.CRSMatrix.zero((int) (byte) 0, (int) (short) 1);
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator56 = cRSMatrix55.nonZeroRowMajorIterator();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct57 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random59 = null;
        org.la4j.vector.DenseVector denseVector60 = org.la4j.vector.DenseVector.random(0, random59);
        java.util.Random random62 = null;
        org.la4j.vector.DenseVector denseVector63 = org.la4j.vector.DenseVector.random(0, random62);
        org.la4j.Matrix matrix64 = ooPlaceOuterProduct57.apply(denseVector60, denseVector63);
        java.text.NumberFormat numberFormat65 = null;
        java.lang.String str66 = denseVector63.toCSV(numberFormat65);
        org.la4j.Vector vector67 = ooPlaceMatrixByVectorMultiplication1.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix55, denseVector63);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix70 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (short) 1, 0);
        org.la4j.Matrix matrix71 = rowMajorSparseMatrix70.shuffle();
        org.la4j.Vector vector72 = vectorVectorMatrixOperation0.apply(denseVector63, rowMajorSparseMatrix70);
        org.la4j.operation.ooplace.OoPlaceVectorHadamardProduct ooPlaceVectorHadamardProduct73 = new org.la4j.operation.ooplace.OoPlaceVectorHadamardProduct();
        org.la4j.vector.SparseVector sparseVector76 = org.la4j.vector.SparseVector.zero(0, 52);
        org.la4j.Matrix matrix77 = sparseVector76.toColumnMatrix();
        org.la4j.Vector vector79 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str80 = vector79.toCSV();
        org.la4j.vector.SparseVector sparseVector81 = vector79.toSparseVector();
        org.la4j.Vector vector82 = ooPlaceVectorHadamardProduct73.apply(sparseVector76, sparseVector81);
        org.la4j.Vector vector84 = sparseVector81.add((double) 10L);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix88 = org.la4j.matrix.dense.Basic1DMatrix.constant((int) ' ', (int) ' ', 0.0d);
        org.la4j.Vector vector89 = vectorVectorMatrixOperation0.apply(sparseVector81, (org.la4j.matrix.DenseMatrix) basic1DMatrix88);
        org.junit.Assert.assertNotNull(vectorVectorMatrixOperation0);
        org.junit.Assert.assertNotNull(cCSMatrix6);
        org.junit.Assert.assertNotNull(vectorAccumulator7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix9);
        org.junit.Assert.assertNotNull(vector12);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation13);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertNotNull(basic2DMatrix50);
        org.junit.Assert.assertNotNull(matrixMatrixOperation51);
        org.junit.Assert.assertNotNull(vectorVectorOperation52);
        org.junit.Assert.assertNotNull(cRSMatrix55);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator56);
        org.junit.Assert.assertNotNull(denseVector60);
        org.junit.Assert.assertNotNull(denseVector63);
        org.junit.Assert.assertNotNull(matrix64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(vector67);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix70);
        org.junit.Assert.assertNotNull(matrix71);
        org.junit.Assert.assertNotNull(vector72);
        org.junit.Assert.assertNotNull(sparseVector76);
        org.junit.Assert.assertNotNull(matrix77);
        org.junit.Assert.assertNotNull(vector79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000" + "'", str80, "1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000");
        org.junit.Assert.assertNotNull(sparseVector81);
        org.junit.Assert.assertNotNull(vector82);
        org.junit.Assert.assertNotNull(vector84);
        org.junit.Assert.assertNotNull(basic1DMatrix88);
        org.junit.Assert.assertNotNull(vector89);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator3 = cRSMatrix2.nonZeroIterator();
        org.la4j.Vector vector5 = cRSMatrix2.getColumn(100);
        boolean boolean8 = cRSMatrix2.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator10 = cRSMatrix2.nonZeroIteratorOfColumn((-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix11 = cRSMatrix2.toRowMajorSparseMatrix();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory12 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix13 = cRSMatrix2.to(basic1DMatrixMatrixFactory12);
        org.la4j.linear.SquareRootSolver squareRootSolver14 = new org.la4j.linear.SquareRootSolver((org.la4j.Matrix) basic1DMatrix13);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition15 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix18 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double19 = cRSMatrix18.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix23 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix24 = rowMajorSparseMatrix23.removeLastRow();
        org.la4j.Matrix matrix25 = ooPlaceMatricesAddition15.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix18, rowMajorSparseMatrix23);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition26 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix29 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double30 = cRSMatrix29.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix34 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix35 = rowMajorSparseMatrix34.removeLastRow();
        org.la4j.Matrix matrix36 = ooPlaceMatricesAddition26.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix29, rowMajorSparseMatrix34);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix39 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.matrix.DenseMatrix denseMatrix41 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix42 = ooPlaceMatricesAddition26.apply(columnMajorSparseMatrix39, denseMatrix41);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix46 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix47 = rowMajorSparseMatrix46.removeLastRow();
        double double51 = rowMajorSparseMatrix46.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        org.la4j.Vector vector52 = rowMajorSparseMatrix46.toRowVector();
        org.la4j.Matrix matrix53 = ooPlaceMatricesAddition15.apply(denseMatrix41, rowMajorSparseMatrix46);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix56 = org.la4j.matrix.RowMajorSparseMatrix.zero(0, (int) (short) 10);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix59 = new org.la4j.matrix.sparse.CCSMatrix((int) (byte) 1, (int) (byte) 0);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix63 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix64 = rowMajorSparseMatrix63.removeLastRow();
        org.la4j.matrix.functor.MatrixFunction matrixFunction66 = null;
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator67 = org.la4j.Matrices.asSumFunctionAccumulator((double) (-1), matrixFunction66);
        double double68 = matrix64.fold(matrixAccumulator67);
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure69 = org.la4j.Matrices.asAccumulatorProcedure(matrixAccumulator67);
        cCSMatrix59.eachNonZero(matrixProcedure69);
        org.la4j.Matrix matrix71 = ooPlaceMatricesAddition15.applySymmetric(rowMajorSparseMatrix56, (org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix59);
        boolean boolean72 = squareRootSolver14.applicableTo((org.la4j.Matrix) cCSMatrix59);
        org.la4j.decomposition.SingularValueDecompositor singularValueDecompositor73 = new org.la4j.decomposition.SingularValueDecompositor((org.la4j.Matrix) cCSMatrix59);
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix76 = org.la4j.matrix.dense.Basic2DMatrix.diagonal((int) (byte) 100, (double) (short) 10);
        org.la4j.decomposition.RawQRDecompositor rawQRDecompositor77 = new org.la4j.decomposition.RawQRDecompositor((org.la4j.Matrix) basic2DMatrix76);
        java.util.Random random80 = null;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix81 = org.la4j.matrix.dense.Basic1DMatrix.random((int) (short) 1, (int) (byte) 0, random80);
        boolean boolean82 = rawQRDecompositor77.applicableTo((org.la4j.Matrix) basic1DMatrix81);
        java.text.NumberFormat numberFormat83 = null;
        java.lang.String str84 = basic1DMatrix81.toCSV(numberFormat83);
        boolean boolean85 = singularValueDecompositor73.applicableTo((org.la4j.Matrix) basic1DMatrix81);
        double[][] doubleArray86 = basic1DMatrix81.toArray();
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertNotNull(matrixIterator3);
        org.junit.Assert.assertNotNull(vector5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(vectorIterator10);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix11);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory12);
        org.junit.Assert.assertNotNull(basic1DMatrix13);
        org.junit.Assert.assertNotNull(cRSMatrix18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix23);
        org.junit.Assert.assertNotNull(matrix24);
        org.junit.Assert.assertNotNull(matrix25);
        org.junit.Assert.assertNotNull(cRSMatrix29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix34);
        org.junit.Assert.assertNotNull(matrix35);
        org.junit.Assert.assertNotNull(matrix36);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix39);
        org.junit.Assert.assertNotNull(denseMatrix41);
        org.junit.Assert.assertNotNull(matrix42);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix46);
        org.junit.Assert.assertNotNull(matrix47);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertNotNull(vector52);
        org.junit.Assert.assertNotNull(matrix53);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix56);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix63);
        org.junit.Assert.assertNotNull(matrix64);
        org.junit.Assert.assertNotNull(matrixAccumulator67);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1.0d) + "'", double68 == (-1.0d));
        org.junit.Assert.assertNotNull(matrixProcedure69);
        org.junit.Assert.assertNotNull(matrix71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(basic2DMatrix76);
        org.junit.Assert.assertNotNull(basic1DMatrix81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "\n" + "'", str84, "\n");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(doubleArray86);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean3 = cCSMatrix2.isRowMajor();
        org.la4j.Matrix matrix4 = cCSMatrix2.transpose();
        org.la4j.Matrix matrix5 = cCSMatrix2.rotate();
        org.junit.Assert.assertNotNull(cCSMatrix2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertNotNull(matrix5);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix4 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator5 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray6 = cCSMatrix4.foldRows(vectorAccumulator5);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix7 = org.la4j.matrix.dense.Basic1DMatrix.from1DArray((int) (byte) 0, (int) (byte) 10, doubleArray6);
        double[][] doubleArray8 = basic1DMatrix7.toArray();
        org.la4j.Matrix matrix10 = basic1DMatrix7.multiply((double) (short) 0);
        org.junit.Assert.assertNotNull(cCSMatrix4);
        org.junit.Assert.assertNotNull(vectorAccumulator5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(basic1DMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(matrix10);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.la4j.matrix.DenseMatrix denseMatrix2 = org.la4j.matrix.DenseMatrix.zero((int) '#', 30);
        org.la4j.Matrix matrix3 = denseMatrix2.removeFirstColumn();
        org.junit.Assert.assertNotNull(denseMatrix2);
        org.junit.Assert.assertNotNull(matrix3);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator3 = cRSMatrix2.nonZeroIterator();
        org.la4j.Vector vector5 = cRSMatrix2.getColumn(100);
        boolean boolean8 = cRSMatrix2.nonZeroAt(1, (int) (short) 0);
        org.la4j.decomposition.RawLUDecompositor rawLUDecompositor9 = new org.la4j.decomposition.RawLUDecompositor((org.la4j.Matrix) cRSMatrix2);
        org.la4j.Matrix matrix10 = rawLUDecompositor9.self();
        org.la4j.Matrix matrix11 = rawLUDecompositor9.self();
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix14 = org.la4j.matrix.dense.Basic2DMatrix.unit((int) (byte) 1, (int) '4');
        double[][] doubleArray15 = basic2DMatrix14.toArray();
        boolean boolean16 = rawLUDecompositor9.applicableTo((org.la4j.Matrix) basic2DMatrix14);
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertNotNull(matrixIterator3);
        org.junit.Assert.assertNotNull(vector5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(basic2DMatrix14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix5 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator6 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray7 = cCSMatrix5.foldRows(vectorAccumulator6);
        org.la4j.matrix.DenseMatrix denseMatrix8 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray7);
        org.la4j.vector.dense.BasicVector basicVector9 = new org.la4j.vector.dense.BasicVector(doubleArray7);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix14 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator15 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray16 = cCSMatrix14.foldRows(vectorAccumulator15);
        org.la4j.matrix.DenseMatrix denseMatrix17 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray16);
        org.la4j.vector.dense.BasicVector basicVector18 = new org.la4j.vector.dense.BasicVector(doubleArray16);
        ooPlaceOuterProduct0.ensureApplicableTo((org.la4j.Vector) basicVector9, (org.la4j.Vector) basicVector18);
        org.la4j.vector.sparse.CompressedVector compressedVector21 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector21.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector26 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix27 = ooPlaceOuterProduct0.apply((org.la4j.vector.SparseVector) compressedVector21, (org.la4j.vector.SparseVector) compressedVector26);
        double double28 = compressedVector26.min();
        org.la4j.iterator.VectorIterator vectorIterator29 = compressedVector26.iterator();
        byte[] byteArray30 = compressedVector26.toBinary();
        double double31 = compressedVector26.max();
        org.la4j.vector.dense.BasicVector basicVector33 = new org.la4j.vector.dense.BasicVector((int) (short) 1);
        org.la4j.vector.VectorFactory<org.la4j.vector.dense.BasicVector> basicVectorVectorFactory34 = org.la4j.Vectors.DENSE;
        org.la4j.vector.dense.BasicVector basicVector35 = basicVector33.to(basicVectorVectorFactory34);
        org.la4j.vector.dense.BasicVector basicVector36 = compressedVector26.to(basicVectorVectorFactory34);
        org.junit.Assert.assertNotNull(cCSMatrix5);
        org.junit.Assert.assertNotNull(vectorAccumulator6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix8);
        org.junit.Assert.assertNotNull(cCSMatrix14);
        org.junit.Assert.assertNotNull(vectorAccumulator15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix17);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(vectorIterator29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[16, 0, 0, 0, 32, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(basicVectorVectorFactory34);
        org.junit.Assert.assertNotNull(basicVector35);
        org.junit.Assert.assertNotNull(basicVector36);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.la4j.vector.sparse.CompressedVector compressedVector2 = org.la4j.vector.sparse.CompressedVector.zero((int) (byte) 100, (int) '4');
        java.text.NumberFormat numberFormat3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = compressedVector2.mkString(numberFormat3, "0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000, 0,000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compressedVector2);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.la4j.vector.dense.BasicVector basicVector1 = org.la4j.vector.dense.BasicVector.unit((int) (short) 0);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition2 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix5 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double6 = cRSMatrix5.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix10 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix11 = rowMajorSparseMatrix10.removeLastRow();
        org.la4j.Matrix matrix12 = ooPlaceMatricesAddition2.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix5, rowMajorSparseMatrix10);
        boolean boolean13 = basicVector1.equals((java.lang.Object) rowMajorSparseMatrix10);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix16 = new org.la4j.matrix.sparse.CCSMatrix((int) (byte) 1, (int) (byte) 0);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix20 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix21 = rowMajorSparseMatrix20.removeLastRow();
        org.la4j.matrix.functor.MatrixFunction matrixFunction23 = null;
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator24 = org.la4j.Matrices.asSumFunctionAccumulator((double) (-1), matrixFunction23);
        double double25 = matrix21.fold(matrixAccumulator24);
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure26 = org.la4j.Matrices.asAccumulatorProcedure(matrixAccumulator24);
        cCSMatrix16.eachNonZero(matrixProcedure26);
        rowMajorSparseMatrix10.eachNonZero(matrixProcedure26);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator29 = rowMajorSparseMatrix10.nonZeroColumnMajorIterator();
        int int30 = columnMajorMatrixIterator29.rowIndex();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix33 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double34 = cRSMatrix33.min();
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator35 = cRSMatrix33.nonZeroRowMajorIterator();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix38 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator39 = columnMajorSparseMatrix38.nonZeroIterator();
        org.la4j.iterator.MatrixIterator matrixIterator40 = rowMajorMatrixIterator35.orElseSubtract(matrixIterator39);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix43 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator44 = cCSMatrix43.nonZeroColumnMajorIterator();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix47 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean48 = cCSMatrix47.isRowMajor();
        org.la4j.Matrix matrix51 = cCSMatrix47.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator52 = cCSMatrix47.nonZeroColumnMajorIterator();
        org.la4j.iterator.MatrixIterator matrixIterator53 = columnMajorMatrixIterator44.andAlsoDivide((org.la4j.iterator.MatrixIterator) columnMajorMatrixIterator52);
        org.la4j.iterator.MatrixIterator matrixIterator54 = matrixIterator40.andAlsoMultiply(matrixIterator53);
        int int55 = matrixIterator53.columnIndex();
        org.la4j.iterator.MatrixIterator matrixIterator56 = columnMajorMatrixIterator29.andAlsoMultiply(matrixIterator53);
        int int57 = columnMajorMatrixIterator29.rowIndex();
        org.junit.Assert.assertNotNull(basicVector1);
        org.junit.Assert.assertNotNull(cRSMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix10);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(matrix12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(matrixAccumulator24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(matrixProcedure26);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(cRSMatrix33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator35);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix38);
        org.junit.Assert.assertNotNull(matrixIterator39);
        org.junit.Assert.assertNotNull(matrixIterator40);
        org.junit.Assert.assertNotNull(cCSMatrix43);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator44);
        org.junit.Assert.assertNotNull(cCSMatrix47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(matrix51);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator52);
        org.junit.Assert.assertNotNull(matrixIterator53);
        org.junit.Assert.assertNotNull(matrixIterator54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(matrixIterator56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.sparse.CRSMatrix cRSMatrix1 = org.la4j.matrix.sparse.CRSMatrix.identity((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix5 = rowMajorSparseMatrix3.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix9 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double13 = rowMajorSparseMatrix9.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix14 = rowMajorSparseMatrix9.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct15 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean16 = sparseMatrix14.equals((java.lang.Object) ooPlaceOuterProduct15);
        org.la4j.Matrix matrix17 = rowMajorSparseMatrix3.hadamardProduct((org.la4j.Matrix) sparseMatrix14);
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator18 = org.la4j.Matrices.mkInfinityNormAccumulator();
        double double19 = sparseMatrix14.foldNonZero(matrixAccumulator18);
        matrixAccumulator18.update((int) (byte) 100, (int) (short) 10, 0.0d);
        matrixAccumulator18.update((int) (short) 10, 10, (-1.0d));
        matrixAccumulator18.update(10, (int) (short) -1, (double) (short) 10);
        matrixAccumulator18.update(30, 100, (double) '#');
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(matrix17);
        org.junit.Assert.assertNotNull(matrixAccumulator18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + Double.NEGATIVE_INFINITY + "'", double19 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.la4j.vector.VectorFactory<org.la4j.vector.dense.BasicVector> basicVectorVectorFactory0 = org.la4j.Vectors.BASIC;
        org.la4j.vector.dense.BasicVector basicVector2 = basicVectorVectorFactory0.apply((int) (short) 10);
        java.lang.Class<org.la4j.vector.dense.BasicVector> basicVectorClass3 = basicVectorVectorFactory0.outputClass;
        org.junit.Assert.assertNotNull(basicVectorVectorFactory0);
        org.junit.Assert.assertNotNull(basicVector2);
        org.junit.Assert.assertNotNull(basicVectorClass3);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.la4j.vector.dense.BasicVector basicVector1 = org.la4j.vector.dense.BasicVector.unit((int) (short) 0);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition2 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix5 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double6 = cRSMatrix5.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix10 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix11 = rowMajorSparseMatrix10.removeLastRow();
        org.la4j.Matrix matrix12 = ooPlaceMatricesAddition2.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix5, rowMajorSparseMatrix10);
        boolean boolean13 = basicVector1.equals((java.lang.Object) rowMajorSparseMatrix10);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix16 = new org.la4j.matrix.sparse.CCSMatrix((int) (byte) 1, (int) (byte) 0);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix20 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix21 = rowMajorSparseMatrix20.removeLastRow();
        org.la4j.matrix.functor.MatrixFunction matrixFunction23 = null;
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator24 = org.la4j.Matrices.asSumFunctionAccumulator((double) (-1), matrixFunction23);
        double double25 = matrix21.fold(matrixAccumulator24);
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure26 = org.la4j.Matrices.asAccumulatorProcedure(matrixAccumulator24);
        cCSMatrix16.eachNonZero(matrixProcedure26);
        rowMajorSparseMatrix10.eachNonZero(matrixProcedure26);
        org.la4j.Vector vector30 = rowMajorSparseMatrix10.getColumn((int) (byte) 100);
        org.junit.Assert.assertNotNull(basicVector1);
        org.junit.Assert.assertNotNull(cRSMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix10);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(matrix12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(matrixAccumulator24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(matrixProcedure26);
        org.junit.Assert.assertNotNull(vector30);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix();
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction1 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix4 = org.la4j.matrix.dense.Basic2DMatrix.unit((int) (byte) 1, (int) '4');
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction5 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix8 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean9 = cCSMatrix8.isRowMajor();
        org.la4j.Matrix matrix12 = cCSMatrix8.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator13 = cCSMatrix8.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix17 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix19 = rowMajorSparseMatrix17.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix23 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double27 = rowMajorSparseMatrix23.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix28 = rowMajorSparseMatrix23.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct29 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean30 = sparseMatrix28.equals((java.lang.Object) ooPlaceOuterProduct29);
        org.la4j.Matrix matrix31 = rowMajorSparseMatrix17.hadamardProduct((org.la4j.Matrix) sparseMatrix28);
        org.la4j.Matrix matrix32 = ooPlaceMatricesSubtraction5.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix8, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix17);
        org.la4j.Matrix matrix33 = ooPlaceMatricesSubtraction1.apply((org.la4j.matrix.DenseMatrix) basic2DMatrix4, rowMajorSparseMatrix17);
        org.la4j.decomposition.SingularValueDecompositor singularValueDecompositor34 = new org.la4j.decomposition.SingularValueDecompositor((org.la4j.Matrix) rowMajorSparseMatrix17);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix36 = org.la4j.matrix.sparse.CRSMatrix.fromCSV("");
        org.la4j.Matrix matrix37 = inPlaceCopyMatrixToMatrix0.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix17, (org.la4j.matrix.SparseMatrix) cRSMatrix36);
        org.la4j.Vector vector39 = cRSMatrix36.getColumn((-1));
        boolean boolean40 = cRSMatrix36.isRowMajor();
        java.util.Spliterator<java.lang.Double> doubleSpliterator41 = cRSMatrix36.spliterator();
        org.junit.Assert.assertNotNull(basic2DMatrix4);
        org.junit.Assert.assertNotNull(cCSMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(matrix12);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator13);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix17);
        org.junit.Assert.assertNotNull(matrix19);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix23);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(matrix31);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertNotNull(matrix33);
        org.junit.Assert.assertNotNull(cRSMatrix36);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(vector39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(doubleSpliterator41);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix2 = org.la4j.matrix.dense.Basic1DMatrix.diagonal(1, (double) (byte) 10);
        org.junit.Assert.assertNotNull(basic1DMatrix2);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix5 = rowMajorSparseMatrix4.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix7 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix8 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix4, denseMatrix7);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix11 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double12 = columnMajorSparseMatrix11.determinant();
        org.la4j.matrix.DenseMatrix denseMatrix15 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        double double16 = denseMatrix15.min();
        double double17 = denseMatrix15.sum();
        org.la4j.Matrix matrix18 = ooPlaceMatricesSubtraction0.apply(columnMajorSparseMatrix11, denseMatrix15);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix21 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator22 = cRSMatrix21.nonZeroIterator();
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation23 = ooPlaceMatricesSubtraction0.partiallyApply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix21);
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate24 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix27 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        boolean boolean28 = advancedMatrixPredicate24.test((org.la4j.Matrix) columnMajorSparseMatrix27);
        org.la4j.vector.functor.VectorFunction vectorFunction30 = null;
        org.la4j.Matrix matrix31 = columnMajorSparseMatrix27.transformRow(0, vectorFunction30);
        org.la4j.iterator.VectorIterator vectorIterator33 = columnMajorSparseMatrix27.nonZeroIteratorOfRow((int) (byte) 0);
        org.la4j.Matrix matrix34 = matrixMatrixOperation23.apply(columnMajorSparseMatrix27);
        org.la4j.Matrix matrix35 = columnMajorSparseMatrix27.blank();
        double double36 = columnMajorSparseMatrix27.infinityNorm();
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix4);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(denseMatrix7);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(denseMatrix15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.POSITIVE_INFINITY + "'", double16 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertNotNull(cRSMatrix21);
        org.junit.Assert.assertNotNull(matrixIterator22);
        org.junit.Assert.assertNotNull(matrixMatrixOperation23);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate24);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(matrix31);
        org.junit.Assert.assertNotNull(vectorIterator33);
        org.junit.Assert.assertNotNull(matrix34);
        org.junit.Assert.assertNotNull(matrix35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + Double.NEGATIVE_INFINITY + "'", double36 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.la4j.Matrix matrix2 = org.la4j.Matrix.zero((int) (byte) 1, (int) (short) 0);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = matrix2.toRowMajorSparseMatrix();
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.linear.GaussianSolver gaussianSolver4 = new org.la4j.linear.GaussianSolver((org.la4j.Matrix) rowMajorSparseMatrix3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given coefficient matrix can not be used with this solver.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix2 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double3 = columnMajorSparseMatrix2.determinant();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory4 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix5 = columnMajorSparseMatrix2.to(basic1DMatrixMatrixFactory4);
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction6 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix10 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix11 = rowMajorSparseMatrix10.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix13 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix14 = ooPlaceMatricesSubtraction6.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix10, denseMatrix13);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix17 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double18 = columnMajorSparseMatrix17.determinant();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory19 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix20 = columnMajorSparseMatrix17.to(basic1DMatrixMatrixFactory19);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix24 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix25 = rowMajorSparseMatrix24.removeLastRow();
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure26 = null;
        rowMajorSparseMatrix24.eachNonZero(matrixProcedure26);
        org.la4j.Matrix matrix28 = ooPlaceMatricesSubtraction6.applySimple((org.la4j.matrix.DenseMatrix) basic1DMatrix20, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix24);
        org.la4j.linear.ForwardBackSubstitutionSolver forwardBackSubstitutionSolver29 = new org.la4j.linear.ForwardBackSubstitutionSolver(matrix28);
        org.la4j.Matrix matrix30 = basic1DMatrix5.kroneckerProduct(matrix28);
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator31 = basic1DMatrix5.rowMajorIterator();
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory4);
        org.junit.Assert.assertNotNull(basic1DMatrix5);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix10);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(denseMatrix13);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory19);
        org.junit.Assert.assertNotNull(basic1DMatrix20);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix24);
        org.junit.Assert.assertNotNull(matrix25);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertNotNull(matrix30);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator31);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix1 = org.la4j.matrix.dense.Basic2DMatrix.identity((int) (short) 0);
        org.junit.Assert.assertNotNull(basic2DMatrix1);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        java.util.Random random1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.vector.DenseVector denseVector2 = org.la4j.vector.DenseVector.random(52, random1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct0 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation1 = org.la4j.LinearAlgebra.OO_PLACE_MATRICES_MULTIPLICATION;
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix4 = org.la4j.matrix.ColumnMajorSparseMatrix.diagonal((int) (byte) 10, (double) 0L);
        org.la4j.decomposition.QRDecompositor qRDecompositor5 = new org.la4j.decomposition.QRDecompositor((org.la4j.Matrix) columnMajorSparseMatrix4);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation6 = matrixMatrixMatrixOperation1.partiallyApply(columnMajorSparseMatrix4);
        org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix7 = new org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix();
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction8 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix11 = org.la4j.matrix.dense.Basic2DMatrix.unit((int) (byte) 1, (int) '4');
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction12 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix15 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean16 = cCSMatrix15.isRowMajor();
        org.la4j.Matrix matrix19 = cCSMatrix15.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator20 = cCSMatrix15.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix24 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix26 = rowMajorSparseMatrix24.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix30 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double34 = rowMajorSparseMatrix30.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix35 = rowMajorSparseMatrix30.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct36 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean37 = sparseMatrix35.equals((java.lang.Object) ooPlaceOuterProduct36);
        org.la4j.Matrix matrix38 = rowMajorSparseMatrix24.hadamardProduct((org.la4j.Matrix) sparseMatrix35);
        org.la4j.Matrix matrix39 = ooPlaceMatricesSubtraction12.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix15, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix24);
        org.la4j.Matrix matrix40 = ooPlaceMatricesSubtraction8.apply((org.la4j.matrix.DenseMatrix) basic2DMatrix11, rowMajorSparseMatrix24);
        org.la4j.decomposition.SingularValueDecompositor singularValueDecompositor41 = new org.la4j.decomposition.SingularValueDecompositor((org.la4j.Matrix) rowMajorSparseMatrix24);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix43 = org.la4j.matrix.sparse.CRSMatrix.fromCSV("");
        org.la4j.Matrix matrix44 = inPlaceCopyMatrixToMatrix7.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix24, (org.la4j.matrix.SparseMatrix) cRSMatrix43);
        org.la4j.matrix.DenseMatrix denseMatrix46 = org.la4j.matrix.DenseMatrix.identity(0);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix51 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator52 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray53 = cCSMatrix51.foldRows(vectorAccumulator52);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix54 = org.la4j.matrix.dense.Basic1DMatrix.from1DArray((int) (byte) 0, (int) (byte) 10, doubleArray53);
        double[][] doubleArray55 = basic1DMatrix54.toArray();
        org.la4j.Matrix matrix56 = inPlaceCopyMatrixToMatrix7.apply(denseMatrix46, (org.la4j.matrix.DenseMatrix) basic1DMatrix54);
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct57 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix61 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix62 = rowMajorSparseMatrix61.removeLastRow();
        double double66 = rowMajorSparseMatrix61.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int67 = rowMajorSparseMatrix61.cardinality();
        org.la4j.Vector vector69 = rowMajorSparseMatrix61.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix72 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix73 = ooPlaceMatrixHadamardProduct57.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix61, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix72);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition74 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix77 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double78 = cRSMatrix77.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix82 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix83 = rowMajorSparseMatrix82.removeLastRow();
        org.la4j.Matrix matrix84 = ooPlaceMatricesAddition74.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix77, rowMajorSparseMatrix82);
        org.la4j.Matrix matrix85 = inPlaceCopyMatrixToMatrix7.applySimple((org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix72, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix82);
        org.la4j.Matrix matrix87 = rowMajorSparseMatrix82.blankOfRows(52);
        org.la4j.Matrix matrix88 = ooPlaceMatrixHadamardProduct0.apply(columnMajorSparseMatrix4, rowMajorSparseMatrix82);
        org.la4j.decomposition.QRDecompositor qRDecompositor89 = new org.la4j.decomposition.QRDecompositor((org.la4j.Matrix) columnMajorSparseMatrix4);
        org.la4j.Matrix[] matrixArray90 = qRDecompositor89.decompose();
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation1);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix4);
        org.junit.Assert.assertNotNull(matrixMatrixOperation6);
        org.junit.Assert.assertNotNull(basic2DMatrix11);
        org.junit.Assert.assertNotNull(cCSMatrix15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(matrix19);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator20);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix24);
        org.junit.Assert.assertNotNull(matrix26);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix30);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertNotNull(matrix40);
        org.junit.Assert.assertNotNull(cRSMatrix43);
        org.junit.Assert.assertNotNull(matrix44);
        org.junit.Assert.assertNotNull(denseMatrix46);
        org.junit.Assert.assertNotNull(cCSMatrix51);
        org.junit.Assert.assertNotNull(vectorAccumulator52);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(basic1DMatrix54);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertNotNull(matrix56);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix61);
        org.junit.Assert.assertNotNull(matrix62);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(vector69);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix72);
        org.junit.Assert.assertNotNull(matrix73);
        org.junit.Assert.assertNotNull(cRSMatrix77);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix82);
        org.junit.Assert.assertNotNull(matrix83);
        org.junit.Assert.assertNotNull(matrix84);
        org.junit.Assert.assertNotNull(matrix85);
        org.junit.Assert.assertNotNull(matrix87);
        org.junit.Assert.assertNotNull(matrix88);
        org.junit.Assert.assertNotNull(matrixArray90);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix1 = org.la4j.matrix.sparse.CCSMatrix.fromCSV("1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000 1,000");
        org.la4j.vector.functor.VectorFunction vectorFunction4 = org.la4j.Vectors.asMulFunction((double) 'a');
        org.la4j.Matrix matrix5 = cCSMatrix1.transformRow(0, vectorFunction4);
        org.junit.Assert.assertNotNull(cCSMatrix1);
        org.junit.Assert.assertNotNull(vectorFunction4);
        org.junit.Assert.assertNotNull(matrix5);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.la4j.vector.dense.BasicVector basicVector1 = org.la4j.vector.dense.BasicVector.unit((int) (short) 0);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition2 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix5 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double6 = cRSMatrix5.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix10 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix11 = rowMajorSparseMatrix10.removeLastRow();
        org.la4j.Matrix matrix12 = ooPlaceMatricesAddition2.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix5, rowMajorSparseMatrix10);
        boolean boolean13 = basicVector1.equals((java.lang.Object) rowMajorSparseMatrix10);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix16 = new org.la4j.matrix.sparse.CCSMatrix((int) (byte) 1, (int) (byte) 0);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix20 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix21 = rowMajorSparseMatrix20.removeLastRow();
        org.la4j.matrix.functor.MatrixFunction matrixFunction23 = null;
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator24 = org.la4j.Matrices.asSumFunctionAccumulator((double) (-1), matrixFunction23);
        double double25 = matrix21.fold(matrixAccumulator24);
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure26 = org.la4j.Matrices.asAccumulatorProcedure(matrixAccumulator24);
        cCSMatrix16.eachNonZero(matrixProcedure26);
        rowMajorSparseMatrix10.eachNonZero(matrixProcedure26);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator29 = rowMajorSparseMatrix10.nonZeroColumnMajorIterator();
        int int30 = columnMajorMatrixIterator29.rowIndex();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix33 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double34 = cRSMatrix33.min();
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator35 = cRSMatrix33.nonZeroRowMajorIterator();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix38 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator39 = columnMajorSparseMatrix38.nonZeroIterator();
        org.la4j.iterator.MatrixIterator matrixIterator40 = rowMajorMatrixIterator35.orElseSubtract(matrixIterator39);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix43 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator44 = cCSMatrix43.nonZeroColumnMajorIterator();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix47 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean48 = cCSMatrix47.isRowMajor();
        org.la4j.Matrix matrix51 = cCSMatrix47.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator52 = cCSMatrix47.nonZeroColumnMajorIterator();
        org.la4j.iterator.MatrixIterator matrixIterator53 = columnMajorMatrixIterator44.andAlsoDivide((org.la4j.iterator.MatrixIterator) columnMajorMatrixIterator52);
        org.la4j.iterator.MatrixIterator matrixIterator54 = matrixIterator40.andAlsoMultiply(matrixIterator53);
        int int55 = matrixIterator53.columnIndex();
        org.la4j.iterator.MatrixIterator matrixIterator56 = columnMajorMatrixIterator29.andAlsoMultiply(matrixIterator53);
        int int57 = matrixIterator56.rowIndex();
        org.junit.Assert.assertNotNull(basicVector1);
        org.junit.Assert.assertNotNull(cRSMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix10);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(matrix12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(matrixAccumulator24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(matrixProcedure26);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(cRSMatrix33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator35);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix38);
        org.junit.Assert.assertNotNull(matrixIterator39);
        org.junit.Assert.assertNotNull(matrixIterator40);
        org.junit.Assert.assertNotNull(cCSMatrix43);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator44);
        org.junit.Assert.assertNotNull(cCSMatrix47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(matrix51);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator52);
        org.junit.Assert.assertNotNull(matrixIterator53);
        org.junit.Assert.assertNotNull(matrixIterator54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(matrixIterator56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix5 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator6 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray7 = cCSMatrix5.foldRows(vectorAccumulator6);
        org.la4j.matrix.DenseMatrix denseMatrix8 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray7);
        org.la4j.vector.dense.BasicVector basicVector9 = new org.la4j.vector.dense.BasicVector(doubleArray7);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix14 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator15 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray16 = cCSMatrix14.foldRows(vectorAccumulator15);
        org.la4j.matrix.DenseMatrix denseMatrix17 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray16);
        org.la4j.vector.dense.BasicVector basicVector18 = new org.la4j.vector.dense.BasicVector(doubleArray16);
        ooPlaceOuterProduct0.ensureApplicableTo((org.la4j.Vector) basicVector9, (org.la4j.Vector) basicVector18);
        org.la4j.vector.sparse.CompressedVector compressedVector21 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector21.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector26 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix27 = ooPlaceOuterProduct0.apply((org.la4j.vector.SparseVector) compressedVector21, (org.la4j.vector.SparseVector) compressedVector26);
        double double28 = compressedVector26.min();
        org.la4j.Matrix matrix29 = compressedVector26.toColumnMatrix();
        compressedVector26.swapElements((int) (byte) 100, 5);
        org.junit.Assert.assertNotNull(cCSMatrix5);
        org.junit.Assert.assertNotNull(vectorAccumulator6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix8);
        org.junit.Assert.assertNotNull(cCSMatrix14);
        org.junit.Assert.assertNotNull(vectorAccumulator15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix17);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(matrix29);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix6 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator7 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray8 = cCSMatrix6.foldRows(vectorAccumulator7);
        org.la4j.matrix.DenseMatrix denseMatrix9 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray8);
        org.la4j.vector.dense.BasicVector basicVector10 = new org.la4j.vector.dense.BasicVector(doubleArray8);
        org.la4j.Vector vector11 = org.la4j.Vector.fromArray(doubleArray8);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix18 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator19 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray20 = cCSMatrix18.foldRows(vectorAccumulator19);
        org.la4j.matrix.DenseMatrix denseMatrix21 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray20);
        org.la4j.vector.dense.BasicVector basicVector22 = new org.la4j.vector.dense.BasicVector(doubleArray20);
        double[] doubleArray23 = basicVector22.toArray();
        int[] intArray29 = new int[] { 52, (byte) -1, ' ', (byte) 100, 0 };
        org.la4j.vector.sparse.CompressedVector compressedVector30 = new org.la4j.vector.sparse.CompressedVector((int) (byte) 0, (int) (short) 1, doubleArray23, intArray29);
        org.la4j.vector.sparse.CompressedVector compressedVector31 = new org.la4j.vector.sparse.CompressedVector((int) (short) 1, 10, doubleArray8, intArray29);
        org.junit.Assert.assertNotNull(cCSMatrix6);
        org.junit.Assert.assertNotNull(vectorAccumulator7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix9);
        org.junit.Assert.assertNotNull(vector11);
        org.junit.Assert.assertNotNull(cCSMatrix18);
        org.junit.Assert.assertNotNull(vectorAccumulator19);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix21);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[52, -1, 32, 100, 0]");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator3 = cRSMatrix2.nonZeroIterator();
        org.la4j.Vector vector5 = cRSMatrix2.getColumn(100);
        boolean boolean8 = cRSMatrix2.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator10 = cRSMatrix2.nonZeroIteratorOfColumn((-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix11 = cRSMatrix2.toRowMajorSparseMatrix();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory12 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix13 = cRSMatrix2.to(basic1DMatrixMatrixFactory12);
        org.la4j.linear.SquareRootSolver squareRootSolver14 = new org.la4j.linear.SquareRootSolver((org.la4j.Matrix) basic1DMatrix13);
        org.la4j.Vector vector16 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str17 = vector16.toCSV();
        org.la4j.vector.SparseVector sparseVector18 = vector16.toSparseVector();
        double double19 = sparseVector18.euclideanNorm();
        org.la4j.Vector vector20 = squareRootSolver14.solve((org.la4j.Vector) sparseVector18);
        org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication21 = new org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix26 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator27 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray28 = cCSMatrix26.foldRows(vectorAccumulator27);
        org.la4j.matrix.DenseMatrix denseMatrix29 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray28);
        org.la4j.vector.dense.BasicVector basicVector31 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector32 = ooPlaceMatrixByVectorMultiplication21.apply(denseMatrix29, (org.la4j.vector.DenseVector) basicVector31);
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation33 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray40 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray47 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray54 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray61 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray68 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray69 = new double[][] { doubleArray40, doubleArray47, doubleArray54, doubleArray61, doubleArray68 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix70 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray69);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation71 = matrixMatrixMatrixOperation33.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix70);
        org.la4j.operation.VectorOperation<org.la4j.Vector> vectorVectorOperation72 = ooPlaceMatrixByVectorMultiplication21.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix70);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector73 = sparseVector18.apply(vectorVectorOperation72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given vector should have the same length as number of columns in the given matrix: 10 does not equal to 6.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertNotNull(matrixIterator3);
        org.junit.Assert.assertNotNull(vector5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(vectorIterator10);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix11);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory12);
        org.junit.Assert.assertNotNull(basic1DMatrix13);
        org.junit.Assert.assertNotNull(vector16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000" + "'", str17, "1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000");
        org.junit.Assert.assertNotNull(sparseVector18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3.1622776601683795d + "'", double19 == 3.1622776601683795d);
        org.junit.Assert.assertNotNull(vector20);
        org.junit.Assert.assertNotNull(cCSMatrix26);
        org.junit.Assert.assertNotNull(vectorAccumulator27);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix29);
        org.junit.Assert.assertNotNull(vector32);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation33);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertNotNull(basic2DMatrix70);
        org.junit.Assert.assertNotNull(matrixMatrixOperation71);
        org.junit.Assert.assertNotNull(vectorVectorOperation72);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.identity((int) (byte) 0);
        org.la4j.Matrix matrix3 = ooPlaceMatrixByItsTransposeMultiplication0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix2);
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction4 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix7 = org.la4j.matrix.dense.Basic2DMatrix.unit((int) (byte) 1, (int) '4');
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction8 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix11 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean12 = cCSMatrix11.isRowMajor();
        org.la4j.Matrix matrix15 = cCSMatrix11.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator16 = cCSMatrix11.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix20 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix22 = rowMajorSparseMatrix20.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix26 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double30 = rowMajorSparseMatrix26.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix31 = rowMajorSparseMatrix26.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct32 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean33 = sparseMatrix31.equals((java.lang.Object) ooPlaceOuterProduct32);
        org.la4j.Matrix matrix34 = rowMajorSparseMatrix20.hadamardProduct((org.la4j.Matrix) sparseMatrix31);
        org.la4j.Matrix matrix35 = ooPlaceMatricesSubtraction8.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix11, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix20);
        org.la4j.Matrix matrix36 = ooPlaceMatricesSubtraction4.apply((org.la4j.matrix.DenseMatrix) basic2DMatrix7, rowMajorSparseMatrix20);
        org.la4j.decomposition.SingularValueDecompositor singularValueDecompositor37 = new org.la4j.decomposition.SingularValueDecompositor((org.la4j.Matrix) rowMajorSparseMatrix20);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix40 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator41 = cRSMatrix40.nonZeroIterator();
        org.la4j.Vector vector43 = cRSMatrix40.getColumn(100);
        boolean boolean46 = cRSMatrix40.nonZeroAt(1, (int) (short) 0);
        org.la4j.decomposition.RawLUDecompositor rawLUDecompositor47 = new org.la4j.decomposition.RawLUDecompositor((org.la4j.Matrix) cRSMatrix40);
        double double48 = cRSMatrix40.infinityNorm();
        boolean boolean49 = singularValueDecompositor37.applicableTo((org.la4j.Matrix) cRSMatrix40);
        org.la4j.Matrix matrix50 = ooPlaceMatrixByItsTransposeMultiplication0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix40);
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction51 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix55 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix56 = rowMajorSparseMatrix55.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix58 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix59 = ooPlaceMatricesSubtraction51.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix55, denseMatrix58);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix62 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double63 = columnMajorSparseMatrix62.determinant();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory64 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix65 = columnMajorSparseMatrix62.to(basic1DMatrixMatrixFactory64);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix69 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix70 = rowMajorSparseMatrix69.removeLastRow();
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure71 = null;
        rowMajorSparseMatrix69.eachNonZero(matrixProcedure71);
        org.la4j.Matrix matrix73 = ooPlaceMatricesSubtraction51.applySimple((org.la4j.matrix.DenseMatrix) basic1DMatrix65, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix69);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix75 = org.la4j.matrix.sparse.CRSMatrix.fromCSV("");
        byte[] byteArray76 = cRSMatrix75.toBinary();
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction77 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix81 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix82 = rowMajorSparseMatrix81.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix84 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix85 = ooPlaceMatricesSubtraction77.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix81, denseMatrix84);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix88 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double89 = columnMajorSparseMatrix88.determinant();
        org.la4j.matrix.DenseMatrix denseMatrix92 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        double double93 = denseMatrix92.min();
        double double94 = denseMatrix92.sum();
        org.la4j.Matrix matrix95 = ooPlaceMatricesSubtraction77.apply(columnMajorSparseMatrix88, denseMatrix92);
        org.la4j.Matrix matrix96 = ooPlaceMatricesSubtraction51.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix75, denseMatrix92);
        ooPlaceMatrixByItsTransposeMultiplication0.ensureApplicableTo(matrix96);
        org.junit.Assert.assertNotNull(cCSMatrix2);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertNotNull(basic2DMatrix7);
        org.junit.Assert.assertNotNull(cCSMatrix11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator16);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix20);
        org.junit.Assert.assertNotNull(matrix22);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix26);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(matrix34);
        org.junit.Assert.assertNotNull(matrix35);
        org.junit.Assert.assertNotNull(matrix36);
        org.junit.Assert.assertNotNull(cRSMatrix40);
        org.junit.Assert.assertNotNull(matrixIterator41);
        org.junit.Assert.assertNotNull(vector43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(matrix50);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix55);
        org.junit.Assert.assertNotNull(matrix56);
        org.junit.Assert.assertNotNull(denseMatrix58);
        org.junit.Assert.assertNotNull(matrix59);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix62);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory64);
        org.junit.Assert.assertNotNull(basic1DMatrix65);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix69);
        org.junit.Assert.assertNotNull(matrix70);
        org.junit.Assert.assertNotNull(matrix73);
        org.junit.Assert.assertNotNull(cRSMatrix75);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix81);
        org.junit.Assert.assertNotNull(matrix82);
        org.junit.Assert.assertNotNull(denseMatrix84);
        org.junit.Assert.assertNotNull(matrix85);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix88);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
        org.junit.Assert.assertNotNull(denseMatrix92);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + Double.POSITIVE_INFINITY + "'", double93 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.0d + "'", double94 == 0.0d);
        org.junit.Assert.assertNotNull(matrix95);
        org.junit.Assert.assertNotNull(matrix96);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double4 = cRSMatrix3.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix8 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix9 = rowMajorSparseMatrix8.removeLastRow();
        org.la4j.Matrix matrix10 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, rowMajorSparseMatrix8);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition11 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix14 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double15 = cRSMatrix14.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix19 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix20 = rowMajorSparseMatrix19.removeLastRow();
        org.la4j.Matrix matrix21 = ooPlaceMatricesAddition11.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix14, rowMajorSparseMatrix19);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix24 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.matrix.DenseMatrix denseMatrix26 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix27 = ooPlaceMatricesAddition11.apply(columnMajorSparseMatrix24, denseMatrix26);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix31 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix32 = rowMajorSparseMatrix31.removeLastRow();
        double double36 = rowMajorSparseMatrix31.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        org.la4j.Vector vector37 = rowMajorSparseMatrix31.toRowVector();
        org.la4j.Matrix matrix38 = ooPlaceMatricesAddition0.apply(denseMatrix26, rowMajorSparseMatrix31);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator39 = denseMatrix26.columnMajorIterator();
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation40 = org.la4j.LinearAlgebra.OO_PLACE_KRONECKER_PRODUCT;
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix41 = null;
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation42 = matrixMatrixMatrixOperation40.partiallyApply(columnMajorSparseMatrix41);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix45 = org.la4j.matrix.sparse.CCSMatrix.zero((int) (byte) 10, (int) (byte) 1);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix50 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double54 = rowMajorSparseMatrix50.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix55 = rowMajorSparseMatrix50.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate56 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean57 = sparseMatrix55.is(advancedMatrixPredicate56);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator59 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double60 = sparseMatrix55.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator59);
        org.la4j.vector.functor.VectorProcedure vectorProcedure61 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator59);
        cCSMatrix45.eachNonZeroInRow((int) '#', vectorProcedure61);
        org.la4j.Matrix matrix63 = denseMatrix26.apply(matrixMatrixMatrixOperation40, (org.la4j.Matrix) cCSMatrix45);
        org.junit.Assert.assertNotNull(cRSMatrix3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(cRSMatrix14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix19);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix24);
        org.junit.Assert.assertNotNull(denseMatrix26);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix31);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(vector37);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator39);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation40);
        org.junit.Assert.assertNotNull(matrixMatrixOperation42);
        org.junit.Assert.assertNotNull(cCSMatrix45);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix50);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix55);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(vectorAccumulator59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(vectorProcedure61);
        org.junit.Assert.assertNotNull(matrix63);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator1 = org.la4j.Matrices.asProductAccumulator(3.1622776601683795d);
        org.junit.Assert.assertNotNull(matrixAccumulator1);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix3 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean4 = cCSMatrix3.isRowMajor();
        org.la4j.Matrix matrix7 = cCSMatrix3.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator8 = cCSMatrix3.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix12 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix14 = rowMajorSparseMatrix12.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix18 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double22 = rowMajorSparseMatrix18.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix23 = rowMajorSparseMatrix18.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct24 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean25 = sparseMatrix23.equals((java.lang.Object) ooPlaceOuterProduct24);
        org.la4j.Matrix matrix26 = rowMajorSparseMatrix12.hadamardProduct((org.la4j.Matrix) sparseMatrix23);
        org.la4j.Matrix matrix27 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix3, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix12);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix31 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix33 = rowMajorSparseMatrix31.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix37 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double41 = rowMajorSparseMatrix37.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix42 = rowMajorSparseMatrix37.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct43 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean44 = sparseMatrix42.equals((java.lang.Object) ooPlaceOuterProduct43);
        org.la4j.Matrix matrix45 = rowMajorSparseMatrix31.hadamardProduct((org.la4j.Matrix) sparseMatrix42);
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator46 = org.la4j.Matrices.mkInfinityNormAccumulator();
        double double47 = sparseMatrix42.foldNonZero(matrixAccumulator46);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix51 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double55 = rowMajorSparseMatrix51.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix56 = rowMajorSparseMatrix51.toSparseMatrix();
        org.la4j.Matrix matrix57 = rowMajorSparseMatrix51.removeFirstColumn();
        org.la4j.Matrix matrix58 = ooPlaceMatricesSubtraction0.applySimple(sparseMatrix42, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix51);
        double double59 = rowMajorSparseMatrix51.product();
        org.la4j.matrix.functor.MatrixPredicate matrixPredicate60 = org.la4j.Matrices.UPPER_BIDIAGONAL_MATRIX;
        boolean boolean63 = matrixPredicate60.test((int) ' ', (-1));
        boolean boolean66 = matrixPredicate60.test((int) (byte) 1, 30);
        boolean boolean67 = rowMajorSparseMatrix51.non(matrixPredicate60);
        org.junit.Assert.assertNotNull(cCSMatrix3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator8);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(matrix26);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix31);
        org.junit.Assert.assertNotNull(matrix33);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix37);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(matrix45);
        org.junit.Assert.assertNotNull(matrixAccumulator46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + Double.NEGATIVE_INFINITY + "'", double47 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix51);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 1.0d + "'", double55 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix56);
        org.junit.Assert.assertNotNull(matrix57);
        org.junit.Assert.assertNotNull(matrix58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNotNull(matrixPredicate60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix2 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double3 = columnMajorSparseMatrix2.determinant();
        org.la4j.decomposition.CholeskyDecompositor choleskyDecompositor4 = new org.la4j.decomposition.CholeskyDecompositor((org.la4j.Matrix) columnMajorSparseMatrix2);
        org.la4j.Matrix matrix5 = choleskyDecompositor4.self();
        org.la4j.Matrix[] matrixArray6 = choleskyDecompositor4.decompose();
        org.la4j.Matrix[] matrixArray7 = choleskyDecompositor4.decompose();
        org.la4j.Matrix matrix8 = choleskyDecompositor4.self();
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(matrixArray6);
        org.junit.Assert.assertNotNull(matrixArray7);
        org.junit.Assert.assertNotNull(matrix8);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.la4j.LinearAlgebra.SolverFactory solverFactory0 = org.la4j.LinearAlgebra.FORWARD_BACK_SUBSTITUTION;
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction1 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix4 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean5 = cCSMatrix4.isRowMajor();
        org.la4j.Matrix matrix8 = cCSMatrix4.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator9 = cCSMatrix4.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix13 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix15 = rowMajorSparseMatrix13.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix19 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double23 = rowMajorSparseMatrix19.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix24 = rowMajorSparseMatrix19.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct25 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean26 = sparseMatrix24.equals((java.lang.Object) ooPlaceOuterProduct25);
        org.la4j.Matrix matrix27 = rowMajorSparseMatrix13.hadamardProduct((org.la4j.Matrix) sparseMatrix24);
        org.la4j.Matrix matrix28 = ooPlaceMatricesSubtraction1.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix4, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix13);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator29 = cCSMatrix4.iterator();
        org.la4j.Matrix matrix32 = cCSMatrix4.blankOfShape(10, (int) '4');
        org.la4j.linear.LinearSystemSolver linearSystemSolver33 = solverFactory0.create((org.la4j.Matrix) cCSMatrix4);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix34 = cCSMatrix4.toRowMajorSparseMatrix();
        org.la4j.Vector vector36 = cCSMatrix4.getColumn(0);
        org.junit.Assert.assertNotNull(solverFactory0);
        org.junit.Assert.assertNotNull(cCSMatrix4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator9);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix13);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator29);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertNotNull(linearSystemSolver33);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix34);
        org.junit.Assert.assertNotNull(vector36);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation0 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition1 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix4 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double5 = cRSMatrix4.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix9 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix10 = rowMajorSparseMatrix9.removeLastRow();
        org.la4j.Matrix matrix11 = ooPlaceMatricesAddition1.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix4, rowMajorSparseMatrix9);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition12 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix15 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double16 = cRSMatrix15.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix20 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix21 = rowMajorSparseMatrix20.removeLastRow();
        org.la4j.Matrix matrix22 = ooPlaceMatricesAddition12.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix15, rowMajorSparseMatrix20);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix25 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.matrix.DenseMatrix denseMatrix27 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix28 = ooPlaceMatricesAddition12.apply(columnMajorSparseMatrix25, denseMatrix27);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix32 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix33 = rowMajorSparseMatrix32.removeLastRow();
        double double37 = rowMajorSparseMatrix32.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        org.la4j.Vector vector38 = rowMajorSparseMatrix32.toRowVector();
        org.la4j.Matrix matrix39 = ooPlaceMatricesAddition1.apply(denseMatrix27, rowMajorSparseMatrix32);
        org.la4j.matrix.SparseMatrix sparseMatrix40 = denseMatrix27.toSparseMatrix();
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation41 = matrixMatrixMatrixOperation0.partiallyApply(denseMatrix27);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator44 = org.la4j.Vectors.asSumAccumulator((-100.0d));
        double double45 = denseMatrix27.foldColumn(5, vectorAccumulator44);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation0);
        org.junit.Assert.assertNotNull(cRSMatrix4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(cRSMatrix15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(matrix22);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix25);
        org.junit.Assert.assertNotNull(denseMatrix27);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix32);
        org.junit.Assert.assertNotNull(matrix33);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertNotNull(vector38);
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertNotNull(sparseMatrix40);
        org.junit.Assert.assertNotNull(matrixMatrixOperation41);
        org.junit.Assert.assertNotNull(vectorAccumulator44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-99.0d) + "'", double45 == (-99.0d));
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        java.util.Random random2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix3 = org.la4j.matrix.ColumnMajorSparseMatrix.randomSymmetric((int) 'a', (double) (-1L), random2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cardinality should be positive: -9409.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation0 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray7 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray14 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray21 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray28 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray35 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray36 = new double[][] { doubleArray7, doubleArray14, doubleArray21, doubleArray28, doubleArray35 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix37 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray36);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation38 = matrixMatrixMatrixOperation0.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix37);
        double[][] doubleArray39 = new double[][] {};
        org.la4j.matrix.DenseMatrix denseMatrix40 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray39);
        double[] doubleArray47 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray54 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray61 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray68 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray75 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray76 = new double[][] { doubleArray47, doubleArray54, doubleArray61, doubleArray68, doubleArray75 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix77 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray76);
        basic2DMatrix77.setAll((double) 100);
        org.la4j.Matrix matrix80 = matrixMatrixMatrixOperation0.apply(denseMatrix40, (org.la4j.matrix.DenseMatrix) basic2DMatrix77);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix84 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double88 = rowMajorSparseMatrix84.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix89 = rowMajorSparseMatrix84.toSparseMatrix();
        org.la4j.Matrix matrix90 = rowMajorSparseMatrix84.copy();
        org.la4j.Matrix matrix91 = denseMatrix40.kroneckerProduct((org.la4j.Matrix) rowMajorSparseMatrix84);
        double double92 = denseMatrix40.norm();
        java.text.NumberFormat numberFormat93 = null;
        java.lang.String str94 = denseMatrix40.toMatrixMarket(numberFormat93);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(basic2DMatrix37);
        org.junit.Assert.assertNotNull(matrixMatrixOperation38);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertNotNull(denseMatrix40);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertNotNull(basic2DMatrix77);
        org.junit.Assert.assertNotNull(matrix80);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix84);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 1.0d + "'", double88 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix89);
        org.junit.Assert.assertNotNull(matrix90);
        org.junit.Assert.assertNotNull(matrix91);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.0d + "'", double92 == 0.0d);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "%%MatrixMarket matrix array real general\n0 0\n" + "'", str94, "%%MatrixMarket matrix array real general\n0 0\n");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal((int) '#', (double) (byte) -1);
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator3 = cRSMatrix2.nonZeroRowMajorIterator();
        boolean boolean6 = cRSMatrix2.nonZeroAt((int) (short) 10, 10);
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double4 = cRSMatrix3.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix8 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix9 = rowMajorSparseMatrix8.removeLastRow();
        org.la4j.Matrix matrix10 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, rowMajorSparseMatrix8);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix13 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.matrix.DenseMatrix denseMatrix15 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix16 = ooPlaceMatricesAddition0.apply(columnMajorSparseMatrix13, denseMatrix15);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix19 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        byte[] byteArray20 = columnMajorSparseMatrix19.toBinary();
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation21 = ooPlaceMatricesAddition0.partiallyApply(columnMajorSparseMatrix19);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix24 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean25 = cCSMatrix24.isRowMajor();
        org.la4j.Matrix matrix28 = cCSMatrix24.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator29 = cCSMatrix24.nonZeroColumnMajorIterator();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate30 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix33 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        boolean boolean34 = advancedMatrixPredicate30.test((org.la4j.Matrix) columnMajorSparseMatrix33);
        org.la4j.Matrix matrix35 = columnMajorSparseMatrix33.rotate();
        boolean boolean36 = columnMajorSparseMatrix33.isRowMajor();
        boolean boolean37 = columnMajorSparseMatrix33.isRowMajor();
        org.la4j.Matrix matrix38 = ooPlaceMatricesAddition0.applySymmetric((org.la4j.matrix.SparseMatrix) cCSMatrix24, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix33);
        org.la4j.Vector vector40 = columnMajorSparseMatrix33.getRow((int) (short) 10);
        org.la4j.operation.MatrixVectorOperation<org.la4j.Vector> vectorMatrixVectorOperation41 = org.la4j.LinearAlgebra.OO_PLACE_MATRIX_BY_VECTOR_MULTIPLICATION;
        java.util.Random random43 = null;
        org.la4j.vector.DenseVector denseVector44 = org.la4j.vector.DenseVector.random(0, random43);
        java.lang.String str45 = denseVector44.toString();
        org.la4j.Matrix matrix46 = denseVector44.toColumnMatrix();
        org.la4j.Vector vector47 = columnMajorSparseMatrix33.apply(vectorMatrixVectorOperation41, (org.la4j.Vector) denseVector44);
        org.la4j.iterator.VectorIterator vectorIterator49 = columnMajorSparseMatrix33.nonZeroIteratorOfRow((int) (short) 100);
        org.junit.Assert.assertNotNull(cRSMatrix3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix13);
        org.junit.Assert.assertNotNull(denseMatrix15);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[48, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(matrixMatrixOperation21);
        org.junit.Assert.assertNotNull(cCSMatrix24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator29);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate30);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(matrix35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(vector40);
        org.junit.Assert.assertNotNull(vectorMatrixVectorOperation41);
        org.junit.Assert.assertNotNull(denseVector44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(matrix46);
        org.junit.Assert.assertNotNull(vector47);
        org.junit.Assert.assertNotNull(vectorIterator49);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        java.util.Random random2 = null;
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix3 = org.la4j.matrix.sparse.CCSMatrix.randomSymmetric(0, (double) 0.0f, random2);
        org.la4j.Matrix matrix5 = cCSMatrix3.divide(52.0d);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix11 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator12 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray13 = cCSMatrix11.foldRows(vectorAccumulator12);
        org.la4j.matrix.DenseMatrix denseMatrix14 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray13);
        org.la4j.vector.dense.BasicVector basicVector15 = new org.la4j.vector.dense.BasicVector(doubleArray13);
        double[] doubleArray16 = basicVector15.toArray();
        org.la4j.vector.sparse.CompressedVector compressedVector18 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        double double19 = compressedVector18.euclideanNorm();
        org.la4j.Vector vector21 = compressedVector18.blankOfLength(52);
        boolean boolean23 = basicVector15.equals((org.la4j.Vector) compressedVector18, 7.211102550927978d);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix24 = cCSMatrix3.insertColumn((int) (byte) -1, (org.la4j.Vector) compressedVector18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Illegal column number, must be 0..0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix3);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(cCSMatrix11);
        org.junit.Assert.assertNotNull(vectorAccumulator12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix14);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(vector21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double3 = cRSMatrix2.min();
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator4 = cRSMatrix2.nonZeroRowMajorIterator();
        int[] intArray9 = new int[] { (short) 1, '#', 30, 100 };
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix16 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator17 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray18 = cCSMatrix16.foldRows(vectorAccumulator17);
        org.la4j.matrix.DenseMatrix denseMatrix19 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray18);
        org.la4j.vector.dense.BasicVector basicVector20 = new org.la4j.vector.dense.BasicVector(doubleArray18);
        double[] doubleArray21 = basicVector20.toArray();
        int[] intArray27 = new int[] { 52, (byte) -1, ' ', (byte) 100, 0 };
        org.la4j.vector.sparse.CompressedVector compressedVector28 = new org.la4j.vector.sparse.CompressedVector((int) (byte) 0, (int) (short) 1, doubleArray21, intArray27);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix29 = cRSMatrix2.select(intArray9, intArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Column '52' is invalid.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 35, 30, 100]");
        org.junit.Assert.assertNotNull(cCSMatrix16);
        org.junit.Assert.assertNotNull(vectorAccumulator17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix19);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[52, -1, 32, 100, 0]");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        java.util.Random random3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.SparseMatrix sparseMatrix4 = org.la4j.matrix.SparseMatrix.random(2, (int) (byte) 0, 30.0d, random3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The density value should be between 0 and 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix5 = rowMajorSparseMatrix4.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix7 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix8 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix4, denseMatrix7);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix11 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double12 = columnMajorSparseMatrix11.determinant();
        org.la4j.matrix.DenseMatrix denseMatrix15 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        double double16 = denseMatrix15.min();
        double double17 = denseMatrix15.sum();
        org.la4j.Matrix matrix18 = ooPlaceMatricesSubtraction0.apply(columnMajorSparseMatrix11, denseMatrix15);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix21 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator22 = cRSMatrix21.nonZeroIterator();
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation23 = ooPlaceMatricesSubtraction0.partiallyApply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix21);
        org.la4j.Matrix matrix28 = org.la4j.Matrix.diagonal((int) (short) 10, (double) 0);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator30 = org.la4j.Vectors.asSumAccumulator(100.0d);
        double[] doubleArray31 = matrix28.foldColumns(vectorAccumulator30);
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix32 = org.la4j.matrix.dense.Basic2DMatrix.from1DArray((int) 'a', (int) (byte) 0, doubleArray31);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix36 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix38 = rowMajorSparseMatrix36.divide((double) (-1));
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory39 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix40 = matrix38.to(basic1DMatrixMatrixFactory39);
        java.lang.Class<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixClass41 = basic1DMatrixMatrixFactory39.outputClass;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix42 = basic2DMatrix32.to(basic1DMatrixMatrixFactory39);
        java.util.Random random45 = null;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix46 = org.la4j.matrix.dense.Basic1DMatrix.random(10, (int) (byte) 0, random45);
        org.la4j.Matrix matrix47 = ooPlaceMatricesSubtraction0.apply((org.la4j.matrix.DenseMatrix) basic2DMatrix32, (org.la4j.matrix.DenseMatrix) basic1DMatrix46);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix50 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator51 = cRSMatrix50.nonZeroIterator();
        org.la4j.Vector vector53 = cRSMatrix50.getColumn(100);
        boolean boolean56 = cRSMatrix50.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator58 = cRSMatrix50.nonZeroIteratorOfColumn((-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix62 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix63 = rowMajorSparseMatrix62.removeLastRow();
        double double67 = rowMajorSparseMatrix62.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int68 = rowMajorSparseMatrix62.cardinality();
        org.la4j.matrix.DenseMatrix denseMatrix69 = rowMajorSparseMatrix62.toDenseMatrix();
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix70 = ooPlaceMatricesSubtraction0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix50, denseMatrix69);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix4);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(denseMatrix7);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(denseMatrix15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.POSITIVE_INFINITY + "'", double16 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertNotNull(cRSMatrix21);
        org.junit.Assert.assertNotNull(matrixIterator22);
        org.junit.Assert.assertNotNull(matrixMatrixOperation23);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertNotNull(vectorAccumulator30);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(basic2DMatrix32);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix36);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory39);
        org.junit.Assert.assertNotNull(basic1DMatrix40);
        org.junit.Assert.assertNotNull(basic1DMatrixClass41);
        org.junit.Assert.assertNotNull(basic1DMatrix42);
        org.junit.Assert.assertNotNull(basic1DMatrix46);
        org.junit.Assert.assertNotNull(matrix47);
        org.junit.Assert.assertNotNull(cRSMatrix50);
        org.junit.Assert.assertNotNull(matrixIterator51);
        org.junit.Assert.assertNotNull(vector53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(vectorIterator58);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix62);
        org.junit.Assert.assertNotNull(matrix63);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 10.0d + "'", double67 == 10.0d);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(denseMatrix69);
    }
}

