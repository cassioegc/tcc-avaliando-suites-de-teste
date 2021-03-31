import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.la4j.Vector vector1 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str2 = vector1.toCSV();
        org.la4j.vector.SparseVector sparseVector3 = vector1.toSparseVector();
        double double4 = sparseVector3.euclideanNorm();
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
        sparseVector8.eachNonZero(vectorProcedure28);
        sparseVector3.each(vectorProcedure28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector1 and sparseVector8", vector1.equals(sparseVector8) ? vector1.hashCode() == sparseVector8.hashCode() : true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double7 = rowMajorSparseMatrix3.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix8 = rowMajorSparseMatrix3.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct9 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean10 = sparseMatrix8.equals((java.lang.Object) ooPlaceOuterProduct9);
        org.la4j.vector.DenseVector denseVector12 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random14 = null;
        org.la4j.vector.DenseVector denseVector15 = org.la4j.vector.DenseVector.random(0, random14);
        java.lang.String str16 = denseVector15.toString();
        ooPlaceOuterProduct9.ensureApplicableTo((org.la4j.Vector) denseVector12, (org.la4j.Vector) denseVector15);
        org.la4j.vector.DenseVector denseVector19 = org.la4j.vector.DenseVector.fromCSV("1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000");
        org.la4j.Vector vector21 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str22 = vector21.toCSV();
        org.la4j.vector.SparseVector sparseVector23 = vector21.toSparseVector();
        boolean boolean25 = sparseVector23.isZeroAt(52);
        org.la4j.iterator.VectorIterator vectorIterator26 = sparseVector23.iterator();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct27 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix32 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator33 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray34 = cCSMatrix32.foldRows(vectorAccumulator33);
        org.la4j.matrix.DenseMatrix denseMatrix35 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray34);
        org.la4j.vector.dense.BasicVector basicVector36 = new org.la4j.vector.dense.BasicVector(doubleArray34);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix41 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator42 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray43 = cCSMatrix41.foldRows(vectorAccumulator42);
        org.la4j.matrix.DenseMatrix denseMatrix44 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray43);
        org.la4j.vector.dense.BasicVector basicVector45 = new org.la4j.vector.dense.BasicVector(doubleArray43);
        ooPlaceOuterProduct27.ensureApplicableTo((org.la4j.Vector) basicVector36, (org.la4j.Vector) basicVector45);
        org.la4j.vector.sparse.CompressedVector compressedVector48 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix49 = compressedVector48.toColumnMatrix();
        org.la4j.Matrix matrix50 = sparseVector23.apply((org.la4j.operation.VectorVectorOperation<org.la4j.Matrix>) ooPlaceOuterProduct27, (org.la4j.Vector) compressedVector48);
        org.la4j.Matrix matrix51 = ooPlaceOuterProduct9.apply(denseVector19, (org.la4j.vector.SparseVector) compressedVector48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on denseVector12 and sparseVector23", denseVector12.equals(sparseVector23) ? denseVector12.hashCode() == sparseVector23.hashCode() : true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random2 = null;
        org.la4j.vector.DenseVector denseVector3 = org.la4j.vector.DenseVector.random(0, random2);
        java.util.Random random5 = null;
        org.la4j.vector.DenseVector denseVector6 = org.la4j.vector.DenseVector.random(0, random5);
        org.la4j.Matrix matrix7 = ooPlaceOuterProduct0.apply(denseVector3, denseVector6);
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct8 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.Vector vector10 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str11 = vector10.toCSV();
        org.la4j.vector.SparseVector sparseVector12 = vector10.toSparseVector();
        double double13 = sparseVector12.euclideanNorm();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct14 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix19 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator20 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray21 = cCSMatrix19.foldRows(vectorAccumulator20);
        org.la4j.matrix.DenseMatrix denseMatrix22 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray21);
        org.la4j.vector.dense.BasicVector basicVector23 = new org.la4j.vector.dense.BasicVector(doubleArray21);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix28 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator29 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray30 = cCSMatrix28.foldRows(vectorAccumulator29);
        org.la4j.matrix.DenseMatrix denseMatrix31 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray30);
        org.la4j.vector.dense.BasicVector basicVector32 = new org.la4j.vector.dense.BasicVector(doubleArray30);
        ooPlaceOuterProduct14.ensureApplicableTo((org.la4j.Vector) basicVector23, (org.la4j.Vector) basicVector32);
        org.la4j.vector.sparse.CompressedVector compressedVector35 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector35.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector40 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix41 = ooPlaceOuterProduct14.apply((org.la4j.vector.SparseVector) compressedVector35, (org.la4j.vector.SparseVector) compressedVector40);
        double double42 = compressedVector40.min();
        java.lang.Double double43 = ooPlaceInnerProduct8.apply(sparseVector12, (org.la4j.vector.SparseVector) compressedVector40);
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct44 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix48 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double52 = rowMajorSparseMatrix48.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix53 = rowMajorSparseMatrix48.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct54 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean55 = sparseMatrix53.equals((java.lang.Object) ooPlaceOuterProduct54);
        org.la4j.vector.DenseVector denseVector57 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random59 = null;
        org.la4j.vector.DenseVector denseVector60 = org.la4j.vector.DenseVector.random(0, random59);
        java.lang.String str61 = denseVector60.toString();
        ooPlaceOuterProduct54.ensureApplicableTo((org.la4j.Vector) denseVector57, (org.la4j.Vector) denseVector60);
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation63 = ooPlaceInnerProduct44.partiallyApply(denseVector60);
        org.la4j.Matrix matrix64 = ooPlaceOuterProduct0.apply((org.la4j.vector.SparseVector) compressedVector40, denseVector60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector10 and sparseVector12", vector10.equals(sparseVector12) ? vector10.hashCode() == sparseVector12.hashCode() : true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct0 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.Vector vector2 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str3 = vector2.toCSV();
        org.la4j.vector.SparseVector sparseVector4 = vector2.toSparseVector();
        double double5 = sparseVector4.euclideanNorm();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct6 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix11 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator12 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray13 = cCSMatrix11.foldRows(vectorAccumulator12);
        org.la4j.matrix.DenseMatrix denseMatrix14 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray13);
        org.la4j.vector.dense.BasicVector basicVector15 = new org.la4j.vector.dense.BasicVector(doubleArray13);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix20 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator21 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray22 = cCSMatrix20.foldRows(vectorAccumulator21);
        org.la4j.matrix.DenseMatrix denseMatrix23 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray22);
        org.la4j.vector.dense.BasicVector basicVector24 = new org.la4j.vector.dense.BasicVector(doubleArray22);
        ooPlaceOuterProduct6.ensureApplicableTo((org.la4j.Vector) basicVector15, (org.la4j.Vector) basicVector24);
        org.la4j.vector.sparse.CompressedVector compressedVector27 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector27.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector32 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix33 = ooPlaceOuterProduct6.apply((org.la4j.vector.SparseVector) compressedVector27, (org.la4j.vector.SparseVector) compressedVector32);
        double double34 = compressedVector32.min();
        java.lang.Double double35 = ooPlaceInnerProduct0.apply(sparseVector4, (org.la4j.vector.SparseVector) compressedVector32);
        double double36 = compressedVector32.euclideanNorm();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector2 and sparseVector4", vector2.equals(sparseVector4) ? vector2.hashCode() == sparseVector4.hashCode() : true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix8 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator9 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray10 = cCSMatrix8.foldRows(vectorAccumulator9);
        org.la4j.matrix.DenseMatrix denseMatrix11 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray10);
        org.la4j.vector.dense.BasicVector basicVector12 = new org.la4j.vector.dense.BasicVector(doubleArray10);
        double[] doubleArray13 = basicVector12.toArray();
        int[] intArray19 = new int[] { 52, (byte) -1, ' ', (byte) 100, 0 };
        org.la4j.vector.sparse.CompressedVector compressedVector20 = new org.la4j.vector.sparse.CompressedVector((int) (byte) 0, (int) (short) 1, doubleArray13, intArray19);
        org.la4j.vector.sparse.CompressedVector compressedVector21 = org.la4j.vector.sparse.CompressedVector.fromArray(doubleArray13);
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix22 = org.la4j.matrix.dense.Basic2DMatrix.from1DArray((int) ' ', (int) (byte) 0, doubleArray13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on basicVector12 and compressedVector21", basicVector12.equals(compressedVector21) ? basicVector12.hashCode() == compressedVector21.hashCode() : true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct0 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.Vector vector2 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str3 = vector2.toCSV();
        org.la4j.vector.SparseVector sparseVector4 = vector2.toSparseVector();
        double double5 = sparseVector4.euclideanNorm();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct6 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix11 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator12 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray13 = cCSMatrix11.foldRows(vectorAccumulator12);
        org.la4j.matrix.DenseMatrix denseMatrix14 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray13);
        org.la4j.vector.dense.BasicVector basicVector15 = new org.la4j.vector.dense.BasicVector(doubleArray13);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix20 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator21 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray22 = cCSMatrix20.foldRows(vectorAccumulator21);
        org.la4j.matrix.DenseMatrix denseMatrix23 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray22);
        org.la4j.vector.dense.BasicVector basicVector24 = new org.la4j.vector.dense.BasicVector(doubleArray22);
        ooPlaceOuterProduct6.ensureApplicableTo((org.la4j.Vector) basicVector15, (org.la4j.Vector) basicVector24);
        org.la4j.vector.sparse.CompressedVector compressedVector27 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector27.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector32 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix33 = ooPlaceOuterProduct6.apply((org.la4j.vector.SparseVector) compressedVector27, (org.la4j.vector.SparseVector) compressedVector32);
        double double34 = compressedVector32.min();
        java.lang.Double double35 = ooPlaceInnerProduct0.apply(sparseVector4, (org.la4j.vector.SparseVector) compressedVector32);
        org.la4j.vector.dense.BasicVector basicVector37 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector38 = basicVector37.copy();
        org.la4j.Matrix matrix39 = basicVector37.toDiagonalMatrix();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix43 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double47 = rowMajorSparseMatrix43.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix48 = rowMajorSparseMatrix43.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct49 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean50 = sparseMatrix48.equals((java.lang.Object) ooPlaceOuterProduct49);
        org.la4j.vector.DenseVector denseVector52 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random54 = null;
        org.la4j.vector.DenseVector denseVector55 = org.la4j.vector.DenseVector.random(0, random54);
        java.lang.String str56 = denseVector55.toString();
        ooPlaceOuterProduct49.ensureApplicableTo((org.la4j.Vector) denseVector52, (org.la4j.Vector) denseVector55);
        java.lang.Double double58 = ooPlaceInnerProduct0.apply((org.la4j.vector.DenseVector) basicVector37, denseVector52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector2 and sparseVector4", vector2.equals(sparseVector4) ? vector2.hashCode() == sparseVector4.hashCode() : true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct0 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.Vector vector2 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str3 = vector2.toCSV();
        org.la4j.vector.SparseVector sparseVector4 = vector2.toSparseVector();
        double double5 = sparseVector4.euclideanNorm();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct6 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix11 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator12 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray13 = cCSMatrix11.foldRows(vectorAccumulator12);
        org.la4j.matrix.DenseMatrix denseMatrix14 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray13);
        org.la4j.vector.dense.BasicVector basicVector15 = new org.la4j.vector.dense.BasicVector(doubleArray13);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix20 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator21 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray22 = cCSMatrix20.foldRows(vectorAccumulator21);
        org.la4j.matrix.DenseMatrix denseMatrix23 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray22);
        org.la4j.vector.dense.BasicVector basicVector24 = new org.la4j.vector.dense.BasicVector(doubleArray22);
        ooPlaceOuterProduct6.ensureApplicableTo((org.la4j.Vector) basicVector15, (org.la4j.Vector) basicVector24);
        org.la4j.vector.sparse.CompressedVector compressedVector27 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector27.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector32 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix33 = ooPlaceOuterProduct6.apply((org.la4j.vector.SparseVector) compressedVector27, (org.la4j.vector.SparseVector) compressedVector32);
        double double34 = compressedVector32.min();
        java.lang.Double double35 = ooPlaceInnerProduct0.apply(sparseVector4, (org.la4j.vector.SparseVector) compressedVector32);
        double double36 = sparseVector4.min();
        org.la4j.Matrix matrix37 = sparseVector4.toDiagonalMatrix();
        org.la4j.linear.SquareRootSolver squareRootSolver38 = new org.la4j.linear.SquareRootSolver(matrix37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector2 and sparseVector4", vector2.equals(sparseVector4) ? vector2.hashCode() == sparseVector4.hashCode() : true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct0 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.Vector vector2 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str3 = vector2.toCSV();
        org.la4j.vector.SparseVector sparseVector4 = vector2.toSparseVector();
        double double5 = sparseVector4.euclideanNorm();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct6 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix11 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator12 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray13 = cCSMatrix11.foldRows(vectorAccumulator12);
        org.la4j.matrix.DenseMatrix denseMatrix14 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray13);
        org.la4j.vector.dense.BasicVector basicVector15 = new org.la4j.vector.dense.BasicVector(doubleArray13);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix20 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator21 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray22 = cCSMatrix20.foldRows(vectorAccumulator21);
        org.la4j.matrix.DenseMatrix denseMatrix23 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray22);
        org.la4j.vector.dense.BasicVector basicVector24 = new org.la4j.vector.dense.BasicVector(doubleArray22);
        ooPlaceOuterProduct6.ensureApplicableTo((org.la4j.Vector) basicVector15, (org.la4j.Vector) basicVector24);
        org.la4j.vector.sparse.CompressedVector compressedVector27 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector27.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector32 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix33 = ooPlaceOuterProduct6.apply((org.la4j.vector.SparseVector) compressedVector27, (org.la4j.vector.SparseVector) compressedVector32);
        double double34 = compressedVector32.min();
        java.lang.Double double35 = ooPlaceInnerProduct0.apply(sparseVector4, (org.la4j.vector.SparseVector) compressedVector32);
        org.la4j.Vector vector37 = compressedVector32.add((double) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector2 and sparseVector4", vector2.equals(sparseVector4) ? vector2.hashCode() == sparseVector4.hashCode() : true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix8 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator9 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray10 = cCSMatrix8.foldRows(vectorAccumulator9);
        org.la4j.matrix.DenseMatrix denseMatrix11 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray10);
        org.la4j.vector.dense.BasicVector basicVector12 = new org.la4j.vector.dense.BasicVector(doubleArray10);
        double[] doubleArray13 = basicVector12.toArray();
        int[] intArray19 = new int[] { 52, (byte) -1, ' ', (byte) 100, 0 };
        org.la4j.vector.sparse.CompressedVector compressedVector20 = new org.la4j.vector.sparse.CompressedVector((int) (byte) 0, (int) (short) 1, doubleArray13, intArray19);
        org.la4j.vector.sparse.CompressedVector compressedVector21 = org.la4j.vector.sparse.CompressedVector.fromArray(doubleArray13);
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix22 = org.la4j.matrix.dense.Basic2DMatrix.from1DArray(1, (int) ' ', doubleArray13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on basicVector12 and compressedVector21", basicVector12.equals(compressedVector21) ? basicVector12.hashCode() == compressedVector21.hashCode() : true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.la4j.vector.sparse.CompressedVector compressedVector1 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix2 = compressedVector1.toColumnMatrix();
        org.la4j.Vector vector4 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str5 = vector4.toCSV();
        org.la4j.vector.SparseVector sparseVector6 = vector4.toSparseVector();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix9 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator10 = columnMajorSparseMatrix9.nonZeroIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix15 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double19 = rowMajorSparseMatrix15.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix20 = rowMajorSparseMatrix15.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate21 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean22 = sparseMatrix20.is(advancedMatrixPredicate21);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator24 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double25 = sparseMatrix20.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator24);
        org.la4j.vector.functor.VectorProcedure vectorProcedure26 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator24);
        columnMajorSparseMatrix9.eachNonZeroInRow((-1), vectorProcedure26);
        sparseVector6.eachNonZero(vectorProcedure26);
        compressedVector1.each(vectorProcedure26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector4 and sparseVector6", vector4.equals(sparseVector6) ? vector4.hashCode() == sparseVector6.hashCode() : true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct0 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double8 = rowMajorSparseMatrix4.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix9 = rowMajorSparseMatrix4.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct10 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean11 = sparseMatrix9.equals((java.lang.Object) ooPlaceOuterProduct10);
        org.la4j.vector.DenseVector denseVector13 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random15 = null;
        org.la4j.vector.DenseVector denseVector16 = org.la4j.vector.DenseVector.random(0, random15);
        java.lang.String str17 = denseVector16.toString();
        ooPlaceOuterProduct10.ensureApplicableTo((org.la4j.Vector) denseVector13, (org.la4j.Vector) denseVector16);
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation19 = ooPlaceInnerProduct0.partiallyApply(denseVector16);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix23 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double27 = rowMajorSparseMatrix23.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix28 = rowMajorSparseMatrix23.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct29 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean30 = sparseMatrix28.equals((java.lang.Object) ooPlaceOuterProduct29);
        org.la4j.vector.DenseVector denseVector32 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random34 = null;
        org.la4j.vector.DenseVector denseVector35 = org.la4j.vector.DenseVector.random(0, random34);
        java.lang.String str36 = denseVector35.toString();
        ooPlaceOuterProduct29.ensureApplicableTo((org.la4j.Vector) denseVector32, (org.la4j.Vector) denseVector35);
        org.la4j.Vector vector39 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str40 = vector39.toCSV();
        org.la4j.vector.SparseVector sparseVector41 = vector39.toSparseVector();
        boolean boolean43 = sparseVector41.isZeroAt(52);
        org.la4j.iterator.VectorIterator vectorIterator44 = sparseVector41.iterator();
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
        org.la4j.Matrix matrix67 = compressedVector66.toColumnMatrix();
        org.la4j.Matrix matrix68 = sparseVector41.apply((org.la4j.operation.VectorVectorOperation<org.la4j.Matrix>) ooPlaceOuterProduct45, (org.la4j.Vector) compressedVector66);
        java.lang.Double double69 = ooPlaceInnerProduct0.apply(denseVector32, (org.la4j.vector.SparseVector) compressedVector66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on denseVector13 and sparseVector41", denseVector13.equals(sparseVector41) ? denseVector13.hashCode() == sparseVector41.hashCode() : true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.la4j.vector.sparse.CompressedVector compressedVector1 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix2 = compressedVector1.toColumnMatrix();
        org.la4j.Vector vector4 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str5 = vector4.toCSV();
        org.la4j.vector.SparseVector sparseVector6 = vector4.toSparseVector();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix9 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator10 = columnMajorSparseMatrix9.nonZeroIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix15 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double19 = rowMajorSparseMatrix15.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix20 = rowMajorSparseMatrix15.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate21 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean22 = sparseMatrix20.is(advancedMatrixPredicate21);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator24 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double25 = sparseMatrix20.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator24);
        org.la4j.vector.functor.VectorProcedure vectorProcedure26 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator24);
        columnMajorSparseMatrix9.eachNonZeroInRow((-1), vectorProcedure26);
        sparseVector6.each(vectorProcedure26);
        compressedVector1.each(vectorProcedure26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector4 and sparseVector6", vector4.equals(sparseVector6) ? vector4.hashCode() == sparseVector6.hashCode() : true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct0 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.Vector vector2 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str3 = vector2.toCSV();
        org.la4j.vector.SparseVector sparseVector4 = vector2.toSparseVector();
        double double5 = sparseVector4.euclideanNorm();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct6 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix11 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator12 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray13 = cCSMatrix11.foldRows(vectorAccumulator12);
        org.la4j.matrix.DenseMatrix denseMatrix14 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray13);
        org.la4j.vector.dense.BasicVector basicVector15 = new org.la4j.vector.dense.BasicVector(doubleArray13);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix20 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator21 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray22 = cCSMatrix20.foldRows(vectorAccumulator21);
        org.la4j.matrix.DenseMatrix denseMatrix23 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray22);
        org.la4j.vector.dense.BasicVector basicVector24 = new org.la4j.vector.dense.BasicVector(doubleArray22);
        ooPlaceOuterProduct6.ensureApplicableTo((org.la4j.Vector) basicVector15, (org.la4j.Vector) basicVector24);
        org.la4j.vector.sparse.CompressedVector compressedVector27 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector27.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector32 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix33 = ooPlaceOuterProduct6.apply((org.la4j.vector.SparseVector) compressedVector27, (org.la4j.vector.SparseVector) compressedVector32);
        double double34 = compressedVector32.min();
        java.lang.Double double35 = ooPlaceInnerProduct0.apply(sparseVector4, (org.la4j.vector.SparseVector) compressedVector32);
        java.util.Random random37 = null;
        org.la4j.vector.DenseVector denseVector38 = org.la4j.vector.DenseVector.random(0, random37);
        java.lang.String str39 = denseVector38.toString();
        org.la4j.Matrix matrix40 = denseVector38.toColumnMatrix();
        double double41 = denseVector38.manhattanNorm();
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
        java.lang.String str62 = basicVector51.toMatrixMarket();
        double double64 = basicVector51.get((int) (short) 0);
        java.lang.Double double65 = ooPlaceInnerProduct0.apply(denseVector38, (org.la4j.vector.DenseVector) basicVector51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector2 and sparseVector4", vector2.equals(sparseVector4) ? vector2.hashCode() == sparseVector4.hashCode() : true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
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
        compressedVector28.setAll((double) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector1 and sparseVector3", vector1.equals(sparseVector3) ? vector1.hashCode() == sparseVector3.hashCode() : true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.la4j.operation.ooplace.OoPlaceVectorHadamardProduct ooPlaceVectorHadamardProduct0 = new org.la4j.operation.ooplace.OoPlaceVectorHadamardProduct();
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
        java.lang.String str21 = basicVector10.toMatrixMarket();
        org.la4j.operation.ooplace.OoPlaceVectorsSubtraction ooPlaceVectorsSubtraction22 = new org.la4j.operation.ooplace.OoPlaceVectorsSubtraction();
        org.la4j.Vector vector24 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str25 = vector24.toCSV();
        org.la4j.vector.SparseVector sparseVector26 = vector24.toSparseVector();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct27 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix32 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator33 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray34 = cCSMatrix32.foldRows(vectorAccumulator33);
        org.la4j.matrix.DenseMatrix denseMatrix35 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray34);
        org.la4j.vector.dense.BasicVector basicVector36 = new org.la4j.vector.dense.BasicVector(doubleArray34);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix41 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator42 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray43 = cCSMatrix41.foldRows(vectorAccumulator42);
        org.la4j.matrix.DenseMatrix denseMatrix44 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray43);
        org.la4j.vector.dense.BasicVector basicVector45 = new org.la4j.vector.dense.BasicVector(doubleArray43);
        ooPlaceOuterProduct27.ensureApplicableTo((org.la4j.Vector) basicVector36, (org.la4j.Vector) basicVector45);
        org.la4j.vector.sparse.CompressedVector compressedVector48 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector48.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector53 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix54 = ooPlaceOuterProduct27.apply((org.la4j.vector.SparseVector) compressedVector48, (org.la4j.vector.SparseVector) compressedVector53);
        org.la4j.Vector vector55 = ooPlaceVectorsSubtraction22.apply(sparseVector26, (org.la4j.vector.SparseVector) compressedVector48);
        org.la4j.Vector vector56 = ooPlaceVectorHadamardProduct0.apply((org.la4j.vector.DenseVector) basicVector10, (org.la4j.vector.SparseVector) compressedVector48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector24 and sparseVector26", vector24.equals(sparseVector26) ? vector24.hashCode() == sparseVector26.hashCode() : true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct0 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.Vector vector2 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str3 = vector2.toCSV();
        org.la4j.vector.SparseVector sparseVector4 = vector2.toSparseVector();
        boolean boolean6 = sparseVector4.isZeroAt(52);
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation7 = ooPlaceInnerProduct0.partiallyApply(sparseVector4);
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct8 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.Vector vector10 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str11 = vector10.toCSV();
        org.la4j.vector.SparseVector sparseVector12 = vector10.toSparseVector();
        boolean boolean14 = sparseVector12.isZeroAt(52);
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation15 = ooPlaceInnerProduct8.partiallyApply(sparseVector12);
        org.la4j.vector.dense.BasicVector basicVector17 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        int int18 = basicVector17.length();
        org.la4j.Vector vector19 = basicVector17.shuffle();
        java.lang.Double double20 = ooPlaceInnerProduct0.apply(sparseVector12, (org.la4j.vector.DenseVector) basicVector17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector2 and sparseVector4", vector2.equals(sparseVector4) ? vector2.hashCode() == sparseVector4.hashCode() : true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct0 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.Vector vector2 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str3 = vector2.toCSV();
        org.la4j.vector.SparseVector sparseVector4 = vector2.toSparseVector();
        boolean boolean6 = sparseVector4.isZeroAt(52);
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation7 = ooPlaceInnerProduct0.partiallyApply(sparseVector4);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix12 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator13 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray14 = cCSMatrix12.foldRows(vectorAccumulator13);
        org.la4j.matrix.DenseMatrix denseMatrix15 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray14);
        org.la4j.vector.dense.BasicVector basicVector16 = new org.la4j.vector.dense.BasicVector(doubleArray14);
        double[] doubleArray17 = basicVector16.toArray();
        org.la4j.Vector vector19 = basicVector16.blankOfLength((int) 'a');
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
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct40 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random42 = null;
        org.la4j.vector.DenseVector denseVector43 = org.la4j.vector.DenseVector.random(0, random42);
        java.util.Random random45 = null;
        org.la4j.vector.DenseVector denseVector46 = org.la4j.vector.DenseVector.random(0, random45);
        org.la4j.Matrix matrix47 = ooPlaceOuterProduct40.apply(denseVector43, denseVector46);
        org.la4j.vector.sparse.CompressedVector compressedVector49 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix50 = ooPlaceOuterProduct20.apply(denseVector43, (org.la4j.vector.SparseVector) compressedVector49);
        java.lang.Double double51 = ooPlaceInnerProduct0.applySymmetric((org.la4j.vector.DenseVector) basicVector16, (org.la4j.vector.SparseVector) compressedVector49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector2 and sparseVector4", vector2.equals(sparseVector4) ? vector2.hashCode() == sparseVector4.hashCode() : true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix6 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator7 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray8 = cCSMatrix6.foldRows(vectorAccumulator7);
        org.la4j.matrix.DenseMatrix denseMatrix9 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray8);
        org.la4j.vector.dense.BasicVector basicVector10 = new org.la4j.vector.dense.BasicVector(doubleArray8);
        double[] doubleArray11 = basicVector10.toArray();
        int[] intArray17 = new int[] { 52, (byte) -1, ' ', (byte) 100, 0 };
        org.la4j.vector.sparse.CompressedVector compressedVector18 = new org.la4j.vector.sparse.CompressedVector((int) (byte) 0, (int) (short) 1, doubleArray11, intArray17);
        org.la4j.vector.sparse.CompressedVector compressedVector19 = org.la4j.vector.sparse.CompressedVector.fromArray(doubleArray11);
        org.la4j.vector.dense.BasicVector basicVector20 = new org.la4j.vector.dense.BasicVector(doubleArray11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on basicVector10 and compressedVector19", basicVector10.equals(compressedVector19) ? basicVector10.hashCode() == compressedVector19.hashCode() : true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct0 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.Vector vector2 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str3 = vector2.toCSV();
        org.la4j.vector.SparseVector sparseVector4 = vector2.toSparseVector();
        boolean boolean6 = sparseVector4.isZeroAt(52);
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation7 = ooPlaceInnerProduct0.partiallyApply(sparseVector4);
        org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication8 = new org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication();
        org.la4j.vector.sparse.CompressedVector compressedVector10 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector10.swapElements(10, (int) (byte) 100);
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct14 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix18 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix19 = rowMajorSparseMatrix18.removeLastRow();
        double double23 = rowMajorSparseMatrix18.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int24 = rowMajorSparseMatrix18.cardinality();
        org.la4j.Vector vector26 = rowMajorSparseMatrix18.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix29 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix30 = ooPlaceMatrixHadamardProduct14.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix18, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix29);
        org.la4j.Vector vector31 = ooPlaceVectorByMatrixMultiplication8.apply((org.la4j.vector.SparseVector) compressedVector10, columnMajorSparseMatrix29);
        org.la4j.vector.SparseVector sparseVector33 = org.la4j.vector.SparseVector.zero(0);
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction34 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix38 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix39 = rowMajorSparseMatrix38.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix41 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix42 = ooPlaceMatricesSubtraction34.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix38, denseMatrix41);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix45 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double46 = columnMajorSparseMatrix45.determinant();
        org.la4j.matrix.DenseMatrix denseMatrix49 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        double double50 = denseMatrix49.min();
        double double51 = denseMatrix49.sum();
        org.la4j.Matrix matrix52 = ooPlaceMatricesSubtraction34.apply(columnMajorSparseMatrix45, denseMatrix49);
        org.la4j.Vector vector53 = ooPlaceVectorByMatrixMultiplication8.apply(sparseVector33, columnMajorSparseMatrix45);
        org.la4j.operation.VectorVectorOperation<org.la4j.Matrix> matrixVectorVectorOperation54 = org.la4j.LinearAlgebra.OO_PLACE_OUTER_PRODUCT;
        org.la4j.vector.SparseVector sparseVector56 = org.la4j.vector.SparseVector.zero(0);
        java.util.Random random58 = null;
        org.la4j.vector.DenseVector denseVector59 = org.la4j.vector.DenseVector.random(0, random58);
        org.la4j.Matrix matrix60 = matrixVectorVectorOperation54.apply(sparseVector56, denseVector59);
        org.la4j.Vector vector62 = denseVector59.divide((double) (-1L));
        ooPlaceInnerProduct0.ensureApplicableTo((org.la4j.Vector) sparseVector33, (org.la4j.Vector) denseVector59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector2 and sparseVector4", vector2.equals(sparseVector4) ? vector2.hashCode() == sparseVector4.hashCode() : true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.la4j.operation.ooplace.OoPlaceVectorsSubtraction ooPlaceVectorsSubtraction0 = new org.la4j.operation.ooplace.OoPlaceVectorsSubtraction();
        org.la4j.Vector vector2 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str3 = vector2.toCSV();
        org.la4j.vector.SparseVector sparseVector4 = vector2.toSparseVector();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct5 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix10 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator11 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray12 = cCSMatrix10.foldRows(vectorAccumulator11);
        org.la4j.matrix.DenseMatrix denseMatrix13 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray12);
        org.la4j.vector.dense.BasicVector basicVector14 = new org.la4j.vector.dense.BasicVector(doubleArray12);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix19 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator20 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray21 = cCSMatrix19.foldRows(vectorAccumulator20);
        org.la4j.matrix.DenseMatrix denseMatrix22 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray21);
        org.la4j.vector.dense.BasicVector basicVector23 = new org.la4j.vector.dense.BasicVector(doubleArray21);
        ooPlaceOuterProduct5.ensureApplicableTo((org.la4j.Vector) basicVector14, (org.la4j.Vector) basicVector23);
        org.la4j.vector.sparse.CompressedVector compressedVector26 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector26.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector31 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix32 = ooPlaceOuterProduct5.apply((org.la4j.vector.SparseVector) compressedVector26, (org.la4j.vector.SparseVector) compressedVector31);
        org.la4j.Vector vector33 = ooPlaceVectorsSubtraction0.apply(sparseVector4, (org.la4j.vector.SparseVector) compressedVector26);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix37 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double41 = rowMajorSparseMatrix37.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix42 = rowMajorSparseMatrix37.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate43 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean44 = sparseMatrix42.is(advancedMatrixPredicate43);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator46 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double47 = sparseMatrix42.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator46);
        org.la4j.vector.functor.VectorProcedure vectorProcedure48 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator46);
        org.la4j.vector.functor.VectorProcedure vectorProcedure49 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator46);
        double double50 = compressedVector26.foldNonZero(vectorAccumulator46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector2 and sparseVector4", vector2.equals(sparseVector4) ? vector2.hashCode() == sparseVector4.hashCode() : true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct0 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.Vector vector2 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str3 = vector2.toCSV();
        org.la4j.vector.SparseVector sparseVector4 = vector2.toSparseVector();
        double double5 = sparseVector4.euclideanNorm();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct6 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix11 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator12 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray13 = cCSMatrix11.foldRows(vectorAccumulator12);
        org.la4j.matrix.DenseMatrix denseMatrix14 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray13);
        org.la4j.vector.dense.BasicVector basicVector15 = new org.la4j.vector.dense.BasicVector(doubleArray13);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix20 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator21 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray22 = cCSMatrix20.foldRows(vectorAccumulator21);
        org.la4j.matrix.DenseMatrix denseMatrix23 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray22);
        org.la4j.vector.dense.BasicVector basicVector24 = new org.la4j.vector.dense.BasicVector(doubleArray22);
        ooPlaceOuterProduct6.ensureApplicableTo((org.la4j.Vector) basicVector15, (org.la4j.Vector) basicVector24);
        org.la4j.vector.sparse.CompressedVector compressedVector27 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector27.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector32 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix33 = ooPlaceOuterProduct6.apply((org.la4j.vector.SparseVector) compressedVector27, (org.la4j.vector.SparseVector) compressedVector32);
        double double34 = compressedVector32.min();
        java.lang.Double double35 = ooPlaceInnerProduct0.apply(sparseVector4, (org.la4j.vector.SparseVector) compressedVector32);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix38 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator39 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray40 = cCSMatrix38.foldRows(vectorAccumulator39);
        org.la4j.vector.dense.BasicVector basicVector41 = org.la4j.vector.dense.BasicVector.fromArray(doubleArray40);
        org.la4j.Matrix matrix42 = basicVector41.toDiagonalMatrix();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix45 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator46 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray47 = cCSMatrix45.foldRows(vectorAccumulator46);
        org.la4j.Vector vector48 = org.la4j.Vector.fromArray(doubleArray47);
        org.la4j.vector.SparseVector sparseVector49 = vector48.toSparseVector();
        double double50 = sparseVector49.sum();
        java.lang.Double double51 = ooPlaceInnerProduct0.apply((org.la4j.vector.DenseVector) basicVector41, sparseVector49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector2 and sparseVector4", vector2.equals(sparseVector4) ? vector2.hashCode() == sparseVector4.hashCode() : true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct0 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct1 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.Vector vector3 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str4 = vector3.toCSV();
        org.la4j.vector.SparseVector sparseVector5 = vector3.toSparseVector();
        double double6 = sparseVector5.euclideanNorm();
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
        compressedVector28.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector33 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix34 = ooPlaceOuterProduct7.apply((org.la4j.vector.SparseVector) compressedVector28, (org.la4j.vector.SparseVector) compressedVector33);
        double double35 = compressedVector33.min();
        java.lang.Double double36 = ooPlaceInnerProduct1.apply(sparseVector5, (org.la4j.vector.SparseVector) compressedVector33);
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation37 = ooPlaceInnerProduct0.partiallyApply((org.la4j.vector.SparseVector) compressedVector33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3 and sparseVector5", vector3.equals(sparseVector5) ? vector3.hashCode() == sparseVector5.hashCode() : true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.Vector vector5 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str6 = vector5.toCSV();
        org.la4j.vector.SparseVector sparseVector7 = vector5.toSparseVector();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix10 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator11 = columnMajorSparseMatrix10.nonZeroIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix16 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double20 = rowMajorSparseMatrix16.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix21 = rowMajorSparseMatrix16.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate22 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean23 = sparseMatrix21.is(advancedMatrixPredicate22);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator25 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double26 = sparseMatrix21.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator25);
        org.la4j.vector.functor.VectorProcedure vectorProcedure27 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator25);
        columnMajorSparseMatrix10.eachNonZeroInRow((-1), vectorProcedure27);
        sparseVector7.eachNonZero(vectorProcedure27);
        org.la4j.Vector vector30 = ooPlaceMatrixByVectorMultiplication0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, sparseVector7);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix33 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator34 = columnMajorSparseMatrix33.nonZeroIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix39 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double43 = rowMajorSparseMatrix39.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix44 = rowMajorSparseMatrix39.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate45 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean46 = sparseMatrix44.is(advancedMatrixPredicate45);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator48 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double49 = sparseMatrix44.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator48);
        org.la4j.vector.functor.VectorProcedure vectorProcedure50 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator48);
        columnMajorSparseMatrix33.eachNonZeroInRow((-1), vectorProcedure50);
        boolean boolean52 = columnMajorSparseMatrix33.isRowMajor();
        org.la4j.vector.SparseVector sparseVector54 = org.la4j.vector.SparseVector.fromCSV("1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct55 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix60 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator61 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray62 = cCSMatrix60.foldRows(vectorAccumulator61);
        org.la4j.matrix.DenseMatrix denseMatrix63 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray62);
        org.la4j.vector.dense.BasicVector basicVector64 = new org.la4j.vector.dense.BasicVector(doubleArray62);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix69 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator70 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray71 = cCSMatrix69.foldRows(vectorAccumulator70);
        org.la4j.matrix.DenseMatrix denseMatrix72 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray71);
        org.la4j.vector.dense.BasicVector basicVector73 = new org.la4j.vector.dense.BasicVector(doubleArray71);
        ooPlaceOuterProduct55.ensureApplicableTo((org.la4j.Vector) basicVector64, (org.la4j.Vector) basicVector73);
        org.la4j.Matrix matrix75 = basicVector73.toColumnMatrix();
        org.la4j.Matrix matrix76 = sparseVector54.outerProduct((org.la4j.Vector) basicVector73);
        org.la4j.Vector vector77 = ooPlaceMatrixByVectorMultiplication0.apply(columnMajorSparseMatrix33, sparseVector54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector5 and sparseVector7", vector5.equals(sparseVector7) ? vector5.hashCode() == sparseVector7.hashCode() : true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct0 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.Vector vector2 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str3 = vector2.toCSV();
        org.la4j.vector.SparseVector sparseVector4 = vector2.toSparseVector();
        double double5 = sparseVector4.euclideanNorm();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct6 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix11 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator12 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray13 = cCSMatrix11.foldRows(vectorAccumulator12);
        org.la4j.matrix.DenseMatrix denseMatrix14 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray13);
        org.la4j.vector.dense.BasicVector basicVector15 = new org.la4j.vector.dense.BasicVector(doubleArray13);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix20 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator21 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray22 = cCSMatrix20.foldRows(vectorAccumulator21);
        org.la4j.matrix.DenseMatrix denseMatrix23 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray22);
        org.la4j.vector.dense.BasicVector basicVector24 = new org.la4j.vector.dense.BasicVector(doubleArray22);
        ooPlaceOuterProduct6.ensureApplicableTo((org.la4j.Vector) basicVector15, (org.la4j.Vector) basicVector24);
        org.la4j.vector.sparse.CompressedVector compressedVector27 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector27.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector32 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix33 = ooPlaceOuterProduct6.apply((org.la4j.vector.SparseVector) compressedVector27, (org.la4j.vector.SparseVector) compressedVector32);
        double double34 = compressedVector32.min();
        java.lang.Double double35 = ooPlaceInnerProduct0.apply(sparseVector4, (org.la4j.vector.SparseVector) compressedVector32);
        java.text.NumberFormat numberFormat36 = null;
        java.lang.String str37 = compressedVector32.toMatrixMarket(numberFormat36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector2 and sparseVector4", vector2.equals(sparseVector4) ? vector2.hashCode() == sparseVector4.hashCode() : true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.Vector vector5 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str6 = vector5.toCSV();
        org.la4j.vector.SparseVector sparseVector7 = vector5.toSparseVector();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix10 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator11 = columnMajorSparseMatrix10.nonZeroIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix16 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double20 = rowMajorSparseMatrix16.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix21 = rowMajorSparseMatrix16.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate22 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean23 = sparseMatrix21.is(advancedMatrixPredicate22);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator25 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double26 = sparseMatrix21.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator25);
        org.la4j.vector.functor.VectorProcedure vectorProcedure27 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator25);
        columnMajorSparseMatrix10.eachNonZeroInRow((-1), vectorProcedure27);
        sparseVector7.eachNonZero(vectorProcedure27);
        org.la4j.Vector vector30 = ooPlaceMatrixByVectorMultiplication0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, sparseVector7);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix33 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        double double36 = cCSMatrix33.get((int) (byte) 0, (int) (short) 1);
        double double40 = cCSMatrix33.getOrElse(10, (int) ' ', (double) 10);
        org.la4j.operation.VectorOperation<org.la4j.Vector> vectorVectorOperation41 = ooPlaceMatrixByVectorMultiplication0.partiallyApply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector5 and sparseVector7", vector5.equals(sparseVector7) ? vector5.hashCode() == sparseVector7.hashCode() : true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.la4j.operation.ooplace.OoPlaceVectorsSubtraction ooPlaceVectorsSubtraction0 = new org.la4j.operation.ooplace.OoPlaceVectorsSubtraction();
        org.la4j.Vector vector2 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str3 = vector2.toCSV();
        org.la4j.vector.SparseVector sparseVector4 = vector2.toSparseVector();
        boolean boolean6 = sparseVector4.isZeroAt(52);
        org.la4j.iterator.VectorIterator vectorIterator7 = sparseVector4.iterator();
        org.la4j.iterator.VectorIterator vectorIterator8 = sparseVector4.nonZeroIterator();
        org.la4j.vector.SparseVector sparseVector9 = sparseVector4.toSparseVector();
        org.la4j.vector.SparseVector sparseVector11 = org.la4j.vector.SparseVector.zero((int) '4');
        org.la4j.Vector vector12 = ooPlaceVectorsSubtraction0.apply(sparseVector9, sparseVector11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector2 and sparseVector9", vector2.equals(sparseVector9) ? vector2.hashCode() == sparseVector9.hashCode() : true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix5 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator6 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray7 = cCSMatrix5.foldRows(vectorAccumulator6);
        org.la4j.matrix.DenseMatrix denseMatrix8 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray7);
        org.la4j.vector.dense.BasicVector basicVector9 = new org.la4j.vector.dense.BasicVector(doubleArray7);
        double[] doubleArray10 = basicVector9.toArray();
        org.la4j.Vector vector12 = basicVector9.blankOfLength((int) 'a');
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction13 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix16 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean17 = cCSMatrix16.isRowMajor();
        org.la4j.Matrix matrix20 = cCSMatrix16.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator21 = cCSMatrix16.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix25 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix27 = rowMajorSparseMatrix25.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix31 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double35 = rowMajorSparseMatrix31.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix36 = rowMajorSparseMatrix31.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct37 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean38 = sparseMatrix36.equals((java.lang.Object) ooPlaceOuterProduct37);
        org.la4j.Matrix matrix39 = rowMajorSparseMatrix25.hadamardProduct((org.la4j.Matrix) sparseMatrix36);
        org.la4j.Matrix matrix40 = ooPlaceMatricesSubtraction13.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix16, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix25);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix44 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix45 = rowMajorSparseMatrix44.removeLastRow();
        double double49 = rowMajorSparseMatrix44.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int50 = rowMajorSparseMatrix44.cardinality();
        org.la4j.Vector vector52 = rowMajorSparseMatrix44.getRow(0);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation53 = ooPlaceMatricesSubtraction13.partiallyApply(rowMajorSparseMatrix44);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix56 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator57 = cRSMatrix56.nonZeroIterator();
        org.la4j.Vector vector59 = cRSMatrix56.getColumn(100);
        boolean boolean62 = cRSMatrix56.nonZeroAt(1, (int) (short) 0);
        org.la4j.decomposition.RawLUDecompositor rawLUDecompositor63 = new org.la4j.decomposition.RawLUDecompositor((org.la4j.Matrix) cRSMatrix56);
        org.la4j.Matrix matrix64 = rawLUDecompositor63.self();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix67 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        ooPlaceMatricesSubtraction13.ensureApplicableTo(matrix64, (org.la4j.Matrix) cRSMatrix67);
        org.la4j.Vector vector69 = ooPlaceVectorByMatrixMultiplication0.apply((org.la4j.vector.DenseVector) basicVector9, (org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix67);
        org.la4j.Vector vector71 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str72 = vector71.toCSV();
        org.la4j.vector.SparseVector sparseVector73 = vector71.toSparseVector();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix76 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator77 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray78 = cCSMatrix76.foldRows(vectorAccumulator77);
        double double79 = sparseVector73.fold(vectorAccumulator77);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix82 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator83 = columnMajorSparseMatrix82.nonZeroIterator();
        double double84 = columnMajorSparseMatrix82.density();
        org.la4j.Vector vector85 = ooPlaceVectorByMatrixMultiplication0.apply(sparseVector73, columnMajorSparseMatrix82);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix88 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean89 = cCSMatrix88.isRowMajor();
        org.la4j.Matrix matrix92 = cCSMatrix88.blankOfShape((int) '#', (int) (short) 100);
        boolean boolean94 = columnMajorSparseMatrix82.equals((org.la4j.Matrix) cCSMatrix88, (double) (-1.0f));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector71 and sparseVector73", vector71.equals(sparseVector73) ? vector71.hashCode() == sparseVector73.hashCode() : true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
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
        org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication28 = new org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication();
        org.la4j.vector.sparse.CompressedVector compressedVector30 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector30.swapElements(10, (int) (byte) 100);
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct34 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix38 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix39 = rowMajorSparseMatrix38.removeLastRow();
        double double43 = rowMajorSparseMatrix38.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int44 = rowMajorSparseMatrix38.cardinality();
        org.la4j.Vector vector46 = rowMajorSparseMatrix38.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix49 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix50 = ooPlaceMatrixHadamardProduct34.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix38, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix49);
        org.la4j.Vector vector51 = ooPlaceVectorByMatrixMultiplication28.apply((org.la4j.vector.SparseVector) compressedVector30, columnMajorSparseMatrix49);
        boolean boolean53 = compressedVector30.isZeroAt((int) ' ');
        boolean boolean55 = compressedVector30.isZeroAt((int) '4');
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct56 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.Vector vector58 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str59 = vector58.toCSV();
        org.la4j.vector.SparseVector sparseVector60 = vector58.toSparseVector();
        double double61 = sparseVector60.euclideanNorm();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct62 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix67 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator68 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray69 = cCSMatrix67.foldRows(vectorAccumulator68);
        org.la4j.matrix.DenseMatrix denseMatrix70 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray69);
        org.la4j.vector.dense.BasicVector basicVector71 = new org.la4j.vector.dense.BasicVector(doubleArray69);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix76 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator77 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray78 = cCSMatrix76.foldRows(vectorAccumulator77);
        org.la4j.matrix.DenseMatrix denseMatrix79 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray78);
        org.la4j.vector.dense.BasicVector basicVector80 = new org.la4j.vector.dense.BasicVector(doubleArray78);
        ooPlaceOuterProduct62.ensureApplicableTo((org.la4j.Vector) basicVector71, (org.la4j.Vector) basicVector80);
        org.la4j.vector.sparse.CompressedVector compressedVector83 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector83.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector88 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix89 = ooPlaceOuterProduct62.apply((org.la4j.vector.SparseVector) compressedVector83, (org.la4j.vector.SparseVector) compressedVector88);
        double double90 = compressedVector88.min();
        java.lang.Double double91 = ooPlaceInnerProduct56.apply(sparseVector60, (org.la4j.vector.SparseVector) compressedVector88);
        org.la4j.Matrix matrix92 = ooPlaceOuterProduct0.apply((org.la4j.vector.SparseVector) compressedVector30, (org.la4j.vector.SparseVector) compressedVector88);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector58 and sparseVector60", vector58.equals(sparseVector60) ? vector58.hashCode() == sparseVector60.hashCode() : true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct0 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.Vector vector2 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str3 = vector2.toCSV();
        org.la4j.vector.SparseVector sparseVector4 = vector2.toSparseVector();
        boolean boolean6 = sparseVector4.isZeroAt(52);
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation7 = ooPlaceInnerProduct0.partiallyApply(sparseVector4);
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct8 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.Vector vector10 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str11 = vector10.toCSV();
        org.la4j.vector.SparseVector sparseVector12 = vector10.toSparseVector();
        double double13 = sparseVector12.euclideanNorm();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct14 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix19 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator20 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray21 = cCSMatrix19.foldRows(vectorAccumulator20);
        org.la4j.matrix.DenseMatrix denseMatrix22 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray21);
        org.la4j.vector.dense.BasicVector basicVector23 = new org.la4j.vector.dense.BasicVector(doubleArray21);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix28 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator29 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray30 = cCSMatrix28.foldRows(vectorAccumulator29);
        org.la4j.matrix.DenseMatrix denseMatrix31 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray30);
        org.la4j.vector.dense.BasicVector basicVector32 = new org.la4j.vector.dense.BasicVector(doubleArray30);
        ooPlaceOuterProduct14.ensureApplicableTo((org.la4j.Vector) basicVector23, (org.la4j.Vector) basicVector32);
        org.la4j.vector.sparse.CompressedVector compressedVector35 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector35.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector40 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix41 = ooPlaceOuterProduct14.apply((org.la4j.vector.SparseVector) compressedVector35, (org.la4j.vector.SparseVector) compressedVector40);
        double double42 = compressedVector40.min();
        java.lang.Double double43 = ooPlaceInnerProduct8.apply(sparseVector12, (org.la4j.vector.SparseVector) compressedVector40);
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation44 = ooPlaceInnerProduct0.partiallyApply((org.la4j.vector.SparseVector) compressedVector40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector2 and sparseVector4", vector2.equals(sparseVector4) ? vector2.hashCode() == sparseVector4.hashCode() : true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double7 = rowMajorSparseMatrix3.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix8 = rowMajorSparseMatrix3.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct9 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean10 = sparseMatrix8.equals((java.lang.Object) ooPlaceOuterProduct9);
        org.la4j.vector.DenseVector denseVector12 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random14 = null;
        org.la4j.vector.DenseVector denseVector15 = org.la4j.vector.DenseVector.random(0, random14);
        java.lang.String str16 = denseVector15.toString();
        ooPlaceOuterProduct9.ensureApplicableTo((org.la4j.Vector) denseVector12, (org.la4j.Vector) denseVector15);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix21 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double25 = rowMajorSparseMatrix21.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix26 = rowMajorSparseMatrix21.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct27 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean28 = sparseMatrix26.equals((java.lang.Object) ooPlaceOuterProduct27);
        org.la4j.vector.dense.BasicVector basicVector30 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector31 = basicVector30.copy();
        org.la4j.Matrix matrix32 = basicVector30.toDiagonalMatrix();
        org.la4j.Vector vector34 = basicVector30.blankOfLength(52);
        org.la4j.vector.SparseVector sparseVector36 = org.la4j.vector.SparseVector.fromCSV("1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct37 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix42 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator43 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray44 = cCSMatrix42.foldRows(vectorAccumulator43);
        org.la4j.matrix.DenseMatrix denseMatrix45 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray44);
        org.la4j.vector.dense.BasicVector basicVector46 = new org.la4j.vector.dense.BasicVector(doubleArray44);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix51 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator52 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray53 = cCSMatrix51.foldRows(vectorAccumulator52);
        org.la4j.matrix.DenseMatrix denseMatrix54 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray53);
        org.la4j.vector.dense.BasicVector basicVector55 = new org.la4j.vector.dense.BasicVector(doubleArray53);
        ooPlaceOuterProduct37.ensureApplicableTo((org.la4j.Vector) basicVector46, (org.la4j.Vector) basicVector55);
        org.la4j.Matrix matrix57 = basicVector55.toColumnMatrix();
        org.la4j.Matrix matrix58 = sparseVector36.outerProduct((org.la4j.Vector) basicVector55);
        org.la4j.Matrix matrix59 = basicVector55.toRowMatrix();
        org.la4j.Matrix matrix60 = ooPlaceOuterProduct27.apply((org.la4j.vector.DenseVector) basicVector30, (org.la4j.vector.DenseVector) basicVector55);
        org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication61 = new org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication();
        org.la4j.vector.sparse.CompressedVector compressedVector63 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector63.swapElements(10, (int) (byte) 100);
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct67 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix71 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix72 = rowMajorSparseMatrix71.removeLastRow();
        double double76 = rowMajorSparseMatrix71.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int77 = rowMajorSparseMatrix71.cardinality();
        org.la4j.Vector vector79 = rowMajorSparseMatrix71.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix82 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix83 = ooPlaceMatrixHadamardProduct67.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix71, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix82);
        org.la4j.Vector vector84 = ooPlaceVectorByMatrixMultiplication61.apply((org.la4j.vector.SparseVector) compressedVector63, columnMajorSparseMatrix82);
        boolean boolean86 = compressedVector63.isZeroAt((int) ' ');
        boolean boolean88 = compressedVector63.isZeroAt((int) '4');
        org.la4j.vector.VectorFactory<org.la4j.vector.dense.BasicVector> basicVectorVectorFactory89 = org.la4j.Vectors.DENSE;
        org.la4j.vector.dense.BasicVector basicVector90 = compressedVector63.to(basicVectorVectorFactory89);
        org.la4j.Matrix matrix91 = ooPlaceOuterProduct9.apply((org.la4j.vector.DenseVector) basicVector55, (org.la4j.vector.DenseVector) basicVector90);
        byte[] byteArray92 = basicVector55.toBinary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on compressedVector63 and basicVector90", compressedVector63.equals(basicVector90) ? compressedVector63.hashCode() == basicVector90.hashCode() : true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.la4j.Vector vector1 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str2 = vector1.toCSV();
        org.la4j.vector.SparseVector sparseVector3 = vector1.toSparseVector();
        boolean boolean5 = sparseVector3.isZeroAt(52);
        org.la4j.iterator.VectorIterator vectorIterator6 = sparseVector3.iterator();
        org.la4j.iterator.VectorIterator vectorIterator7 = sparseVector3.nonZeroIterator();
        org.la4j.vector.DenseVector denseVector9 = org.la4j.vector.DenseVector.unit(0);
        java.text.NumberFormat numberFormat10 = null;
        java.lang.String str11 = denseVector9.toMatrixMarket(numberFormat10);
        org.la4j.iterator.VectorIterator vectorIterator12 = denseVector9.iterator();
        org.la4j.iterator.VectorIterator vectorIterator13 = vectorIterator7.orElseAdd(vectorIterator12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector1 and sparseVector3", vector1.equals(sparseVector3) ? vector1.hashCode() == sparseVector3.hashCode() : true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
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
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix33 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean34 = cCSMatrix33.isRowMajor();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix39 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double43 = rowMajorSparseMatrix39.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix44 = rowMajorSparseMatrix39.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate45 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean46 = sparseMatrix44.is(advancedMatrixPredicate45);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator48 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double49 = sparseMatrix44.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator48);
        org.la4j.vector.functor.VectorProcedure vectorProcedure50 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator48);
        cCSMatrix33.eachInRow((int) (short) 1, vectorProcedure50);
        compressedVector28.each(vectorProcedure50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector1 and sparseVector3", vector1.equals(sparseVector3) ? vector1.hashCode() == sparseVector3.hashCode() : true);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random2 = null;
        org.la4j.vector.DenseVector denseVector3 = org.la4j.vector.DenseVector.random(0, random2);
        java.util.Random random5 = null;
        org.la4j.vector.DenseVector denseVector6 = org.la4j.vector.DenseVector.random(0, random5);
        org.la4j.Matrix matrix7 = ooPlaceOuterProduct0.apply(denseVector3, denseVector6);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix12 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator13 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray14 = cCSMatrix12.foldRows(vectorAccumulator13);
        org.la4j.matrix.DenseMatrix denseMatrix15 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray14);
        org.la4j.vector.dense.BasicVector basicVector16 = new org.la4j.vector.dense.BasicVector(doubleArray14);
        org.la4j.Vector vector17 = org.la4j.Vector.fromArray(doubleArray14);
        org.la4j.Vector vector18 = vector17.blank();
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct19 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix23 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double27 = rowMajorSparseMatrix23.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix28 = rowMajorSparseMatrix23.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct29 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean30 = sparseMatrix28.equals((java.lang.Object) ooPlaceOuterProduct29);
        org.la4j.vector.DenseVector denseVector32 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random34 = null;
        org.la4j.vector.DenseVector denseVector35 = org.la4j.vector.DenseVector.random(0, random34);
        java.lang.String str36 = denseVector35.toString();
        ooPlaceOuterProduct29.ensureApplicableTo((org.la4j.Vector) denseVector32, (org.la4j.Vector) denseVector35);
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation38 = ooPlaceInnerProduct19.partiallyApply(denseVector35);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix43 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator44 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray45 = cCSMatrix43.foldRows(vectorAccumulator44);
        org.la4j.matrix.DenseMatrix denseMatrix46 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray45);
        org.la4j.vector.dense.BasicVector basicVector47 = new org.la4j.vector.dense.BasicVector(doubleArray45);
        org.la4j.vector.sparse.CompressedVector compressedVector49 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector49.swapElements(10, (int) (byte) 100);
        java.lang.Double double53 = ooPlaceInnerProduct19.apply((org.la4j.vector.DenseVector) basicVector47, (org.la4j.vector.SparseVector) compressedVector49);
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct54 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random56 = null;
        org.la4j.vector.DenseVector denseVector57 = org.la4j.vector.DenseVector.random(0, random56);
        java.util.Random random59 = null;
        org.la4j.vector.DenseVector denseVector60 = org.la4j.vector.DenseVector.random(0, random59);
        org.la4j.Matrix matrix61 = ooPlaceOuterProduct54.apply(denseVector57, denseVector60);
        org.la4j.vector.sparse.CompressedVector compressedVector63 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        java.text.NumberFormat numberFormat64 = null;
        java.lang.String str65 = compressedVector63.toMatrixMarket(numberFormat64);
        org.la4j.Vector vector67 = compressedVector63.add((double) 52);
        org.la4j.Vector vector69 = compressedVector63.sliceRight((int) (byte) 10);
        java.lang.Double double70 = ooPlaceInnerProduct19.apply(denseVector57, (org.la4j.vector.SparseVector) compressedVector63);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix75 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator76 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray77 = cCSMatrix75.foldRows(vectorAccumulator76);
        org.la4j.matrix.DenseMatrix denseMatrix78 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray77);
        org.la4j.vector.dense.BasicVector basicVector79 = new org.la4j.vector.dense.BasicVector(doubleArray77);
        double[] doubleArray80 = basicVector79.toArray();
        org.la4j.vector.sparse.CompressedVector compressedVector82 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        double double83 = compressedVector82.euclideanNorm();
        org.la4j.Vector vector85 = compressedVector82.blankOfLength(52);
        boolean boolean87 = basicVector79.equals((org.la4j.Vector) compressedVector82, 7.211102550927978d);
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation88 = ooPlaceInnerProduct19.partiallyApply((org.la4j.vector.DenseVector) basicVector79);
        ooPlaceOuterProduct0.ensureApplicableTo(vector17, (org.la4j.Vector) basicVector79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector18 and vector85", vector18.equals(vector85) ? vector18.hashCode() == vector85.hashCode() : true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct0 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.Vector vector2 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str3 = vector2.toCSV();
        org.la4j.vector.SparseVector sparseVector4 = vector2.toSparseVector();
        double double5 = sparseVector4.euclideanNorm();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct6 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix11 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator12 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray13 = cCSMatrix11.foldRows(vectorAccumulator12);
        org.la4j.matrix.DenseMatrix denseMatrix14 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray13);
        org.la4j.vector.dense.BasicVector basicVector15 = new org.la4j.vector.dense.BasicVector(doubleArray13);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix20 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator21 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray22 = cCSMatrix20.foldRows(vectorAccumulator21);
        org.la4j.matrix.DenseMatrix denseMatrix23 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray22);
        org.la4j.vector.dense.BasicVector basicVector24 = new org.la4j.vector.dense.BasicVector(doubleArray22);
        ooPlaceOuterProduct6.ensureApplicableTo((org.la4j.Vector) basicVector15, (org.la4j.Vector) basicVector24);
        org.la4j.vector.sparse.CompressedVector compressedVector27 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector27.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector32 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix33 = ooPlaceOuterProduct6.apply((org.la4j.vector.SparseVector) compressedVector27, (org.la4j.vector.SparseVector) compressedVector32);
        double double34 = compressedVector32.min();
        java.lang.Double double35 = ooPlaceInnerProduct0.apply(sparseVector4, (org.la4j.vector.SparseVector) compressedVector32);
        org.la4j.vector.dense.BasicVector basicVector37 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector38 = basicVector37.copy();
        org.la4j.vector.sparse.CompressedVector compressedVector40 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        java.lang.Double double41 = ooPlaceInnerProduct0.apply((org.la4j.vector.DenseVector) basicVector37, (org.la4j.vector.SparseVector) compressedVector40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector2 and sparseVector4", vector2.equals(sparseVector4) ? vector2.hashCode() == sparseVector4.hashCode() : true);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.Vector vector5 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str6 = vector5.toCSV();
        org.la4j.vector.SparseVector sparseVector7 = vector5.toSparseVector();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix10 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator11 = columnMajorSparseMatrix10.nonZeroIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix16 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double20 = rowMajorSparseMatrix16.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix21 = rowMajorSparseMatrix16.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate22 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean23 = sparseMatrix21.is(advancedMatrixPredicate22);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator25 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double26 = sparseMatrix21.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator25);
        org.la4j.vector.functor.VectorProcedure vectorProcedure27 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator25);
        columnMajorSparseMatrix10.eachNonZeroInRow((-1), vectorProcedure27);
        sparseVector7.eachNonZero(vectorProcedure27);
        org.la4j.Vector vector30 = ooPlaceMatrixByVectorMultiplication0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, sparseVector7);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix33 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        double double36 = cCSMatrix33.get((int) (byte) 0, (int) (short) 1);
        double double37 = cCSMatrix33.min();
        org.la4j.operation.VectorOperation<org.la4j.Vector> vectorVectorOperation38 = ooPlaceMatrixByVectorMultiplication0.partiallyApply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector5 and sparseVector7", vector5.equals(sparseVector7) ? vector5.hashCode() == sparseVector7.hashCode() : true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix3 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean4 = cCSMatrix3.isRowMajor();
        org.la4j.Matrix matrix7 = cCSMatrix3.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator8 = cCSMatrix3.nonZeroColumnMajorIterator();
        org.la4j.Vector vector10 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str11 = vector10.toCSV();
        org.la4j.vector.SparseVector sparseVector12 = vector10.toSparseVector();
        boolean boolean14 = sparseVector12.isZeroAt(52);
        org.la4j.iterator.VectorIterator vectorIterator15 = sparseVector12.iterator();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct16 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix21 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator22 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray23 = cCSMatrix21.foldRows(vectorAccumulator22);
        org.la4j.matrix.DenseMatrix denseMatrix24 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray23);
        org.la4j.vector.dense.BasicVector basicVector25 = new org.la4j.vector.dense.BasicVector(doubleArray23);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix30 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator31 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray32 = cCSMatrix30.foldRows(vectorAccumulator31);
        org.la4j.matrix.DenseMatrix denseMatrix33 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray32);
        org.la4j.vector.dense.BasicVector basicVector34 = new org.la4j.vector.dense.BasicVector(doubleArray32);
        ooPlaceOuterProduct16.ensureApplicableTo((org.la4j.Vector) basicVector25, (org.la4j.Vector) basicVector34);
        org.la4j.vector.sparse.CompressedVector compressedVector37 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix38 = compressedVector37.toColumnMatrix();
        org.la4j.Matrix matrix39 = sparseVector12.apply((org.la4j.operation.VectorVectorOperation<org.la4j.Matrix>) ooPlaceOuterProduct16, (org.la4j.Vector) compressedVector37);
        org.la4j.Vector vector40 = ooPlaceMatrixByVectorMultiplication0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix3, sparseVector12);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix43 = org.la4j.matrix.dense.Basic1DMatrix.unit((int) (byte) 10, (int) (byte) 0);
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory44 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix45 = basic1DMatrix43.to(basic1DMatrixMatrixFactory44);
        java.util.Random random47 = null;
        org.la4j.vector.DenseVector denseVector48 = org.la4j.vector.DenseVector.random(0, random47);
        java.lang.String str49 = denseVector48.toString();
        org.la4j.Matrix matrix50 = denseVector48.toColumnMatrix();
        double double51 = denseVector48.manhattanNorm();
        org.la4j.Vector vector52 = ooPlaceMatrixByVectorMultiplication0.apply((org.la4j.matrix.DenseMatrix) basic1DMatrix43, denseVector48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector10 and sparseVector12", vector10.equals(sparseVector12) ? vector10.hashCode() == sparseVector12.hashCode() : true);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct0 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double8 = rowMajorSparseMatrix4.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix9 = rowMajorSparseMatrix4.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct10 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean11 = sparseMatrix9.equals((java.lang.Object) ooPlaceOuterProduct10);
        org.la4j.vector.DenseVector denseVector13 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random15 = null;
        org.la4j.vector.DenseVector denseVector16 = org.la4j.vector.DenseVector.random(0, random15);
        java.lang.String str17 = denseVector16.toString();
        ooPlaceOuterProduct10.ensureApplicableTo((org.la4j.Vector) denseVector13, (org.la4j.Vector) denseVector16);
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation19 = ooPlaceInnerProduct0.partiallyApply(denseVector16);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix24 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator25 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray26 = cCSMatrix24.foldRows(vectorAccumulator25);
        org.la4j.matrix.DenseMatrix denseMatrix27 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray26);
        org.la4j.vector.dense.BasicVector basicVector28 = new org.la4j.vector.dense.BasicVector(doubleArray26);
        org.la4j.vector.sparse.CompressedVector compressedVector30 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector30.swapElements(10, (int) (byte) 100);
        java.lang.Double double34 = ooPlaceInnerProduct0.apply((org.la4j.vector.DenseVector) basicVector28, (org.la4j.vector.SparseVector) compressedVector30);
        org.la4j.vector.SparseVector sparseVector37 = org.la4j.vector.SparseVector.zero((int) (byte) 10, (int) (byte) -1);
        org.la4j.Vector vector39 = sparseVector37.multiply((double) (byte) 1);
        double double40 = sparseVector37.min();
        org.la4j.operation.VectorVectorOperation<org.la4j.Matrix> matrixVectorVectorOperation41 = org.la4j.LinearAlgebra.OO_PLACE_OUTER_PRODUCT;
        org.la4j.vector.SparseVector sparseVector43 = org.la4j.vector.SparseVector.zero(0);
        java.util.Random random45 = null;
        org.la4j.vector.DenseVector denseVector46 = org.la4j.vector.DenseVector.random(0, random45);
        org.la4j.Matrix matrix47 = matrixVectorVectorOperation41.apply(sparseVector43, denseVector46);
        org.la4j.vector.dense.BasicVector basicVector49 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector50 = basicVector49.copy();
        org.la4j.Matrix matrix51 = basicVector49.toDiagonalMatrix();
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
        org.la4j.Matrix matrix72 = basicVector70.toColumnMatrix();
        org.la4j.Matrix matrix73 = matrixVectorVectorOperation41.apply((org.la4j.vector.DenseVector) basicVector49, (org.la4j.vector.DenseVector) basicVector70);
        java.lang.Double double74 = ooPlaceInnerProduct0.apply(sparseVector37, (org.la4j.vector.DenseVector) basicVector49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector39 and vector50", vector39.equals(vector50) ? vector39.hashCode() == vector50.hashCode() : true);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.la4j.operation.ooplace.OoPlaceVectorsSubtraction ooPlaceVectorsSubtraction0 = new org.la4j.operation.ooplace.OoPlaceVectorsSubtraction();
        org.la4j.Vector vector2 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str3 = vector2.toCSV();
        org.la4j.vector.SparseVector sparseVector4 = vector2.toSparseVector();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct5 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix10 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator11 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray12 = cCSMatrix10.foldRows(vectorAccumulator11);
        org.la4j.matrix.DenseMatrix denseMatrix13 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray12);
        org.la4j.vector.dense.BasicVector basicVector14 = new org.la4j.vector.dense.BasicVector(doubleArray12);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix19 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator20 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray21 = cCSMatrix19.foldRows(vectorAccumulator20);
        org.la4j.matrix.DenseMatrix denseMatrix22 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray21);
        org.la4j.vector.dense.BasicVector basicVector23 = new org.la4j.vector.dense.BasicVector(doubleArray21);
        ooPlaceOuterProduct5.ensureApplicableTo((org.la4j.Vector) basicVector14, (org.la4j.Vector) basicVector23);
        org.la4j.vector.sparse.CompressedVector compressedVector26 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector26.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector31 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix32 = ooPlaceOuterProduct5.apply((org.la4j.vector.SparseVector) compressedVector26, (org.la4j.vector.SparseVector) compressedVector31);
        org.la4j.Vector vector33 = ooPlaceVectorsSubtraction0.apply(sparseVector4, (org.la4j.vector.SparseVector) compressedVector26);
        org.la4j.Vector vector35 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str36 = vector35.toCSV();
        org.la4j.vector.SparseVector sparseVector37 = vector35.toSparseVector();
        boolean boolean39 = sparseVector37.isZeroAt(52);
        org.la4j.iterator.VectorIterator vectorIterator40 = sparseVector37.iterator();
        org.la4j.iterator.VectorIterator vectorIterator41 = sparseVector37.nonZeroIterator();
        double double42 = sparseVector37.manhattanNorm();
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct43 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix47 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double51 = rowMajorSparseMatrix47.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix52 = rowMajorSparseMatrix47.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct53 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean54 = sparseMatrix52.equals((java.lang.Object) ooPlaceOuterProduct53);
        org.la4j.vector.DenseVector denseVector56 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random58 = null;
        org.la4j.vector.DenseVector denseVector59 = org.la4j.vector.DenseVector.random(0, random58);
        java.lang.String str60 = denseVector59.toString();
        ooPlaceOuterProduct53.ensureApplicableTo((org.la4j.Vector) denseVector56, (org.la4j.Vector) denseVector59);
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation62 = ooPlaceInnerProduct43.partiallyApply(denseVector59);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix67 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator68 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray69 = cCSMatrix67.foldRows(vectorAccumulator68);
        org.la4j.matrix.DenseMatrix denseMatrix70 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray69);
        org.la4j.vector.dense.BasicVector basicVector71 = new org.la4j.vector.dense.BasicVector(doubleArray69);
        org.la4j.vector.sparse.CompressedVector compressedVector73 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector73.swapElements(10, (int) (byte) 100);
        java.lang.Double double77 = ooPlaceInnerProduct43.apply((org.la4j.vector.DenseVector) basicVector71, (org.la4j.vector.SparseVector) compressedVector73);
        org.la4j.Vector vector78 = ooPlaceVectorsSubtraction0.apply(sparseVector37, (org.la4j.vector.SparseVector) compressedVector73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector2 and sparseVector4", vector2.equals(sparseVector4) ? vector2.hashCode() == sparseVector4.hashCode() : true);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct0 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.Vector vector2 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str3 = vector2.toCSV();
        org.la4j.vector.SparseVector sparseVector4 = vector2.toSparseVector();
        double double5 = sparseVector4.euclideanNorm();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct6 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix11 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator12 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray13 = cCSMatrix11.foldRows(vectorAccumulator12);
        org.la4j.matrix.DenseMatrix denseMatrix14 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray13);
        org.la4j.vector.dense.BasicVector basicVector15 = new org.la4j.vector.dense.BasicVector(doubleArray13);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix20 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator21 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray22 = cCSMatrix20.foldRows(vectorAccumulator21);
        org.la4j.matrix.DenseMatrix denseMatrix23 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray22);
        org.la4j.vector.dense.BasicVector basicVector24 = new org.la4j.vector.dense.BasicVector(doubleArray22);
        ooPlaceOuterProduct6.ensureApplicableTo((org.la4j.Vector) basicVector15, (org.la4j.Vector) basicVector24);
        org.la4j.vector.sparse.CompressedVector compressedVector27 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector27.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector32 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix33 = ooPlaceOuterProduct6.apply((org.la4j.vector.SparseVector) compressedVector27, (org.la4j.vector.SparseVector) compressedVector32);
        double double34 = compressedVector32.min();
        java.lang.Double double35 = ooPlaceInnerProduct0.apply(sparseVector4, (org.la4j.vector.SparseVector) compressedVector32);
        org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication36 = new org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct37 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix42 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator43 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray44 = cCSMatrix42.foldRows(vectorAccumulator43);
        org.la4j.matrix.DenseMatrix denseMatrix45 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray44);
        org.la4j.vector.dense.BasicVector basicVector46 = new org.la4j.vector.dense.BasicVector(doubleArray44);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix51 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator52 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray53 = cCSMatrix51.foldRows(vectorAccumulator52);
        org.la4j.matrix.DenseMatrix denseMatrix54 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray53);
        org.la4j.vector.dense.BasicVector basicVector55 = new org.la4j.vector.dense.BasicVector(doubleArray53);
        ooPlaceOuterProduct37.ensureApplicableTo((org.la4j.Vector) basicVector46, (org.la4j.Vector) basicVector55);
        java.lang.String str57 = basicVector55.toString();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix60 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double61 = columnMajorSparseMatrix60.determinant();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory62 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix63 = columnMajorSparseMatrix60.to(basic1DMatrixMatrixFactory62);
        org.la4j.Vector vector64 = ooPlaceVectorByMatrixMultiplication36.apply((org.la4j.vector.DenseVector) basicVector55, columnMajorSparseMatrix60);
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
        double double93 = compressedVector91.min();
        org.la4j.Vector vector94 = compressedVector91.blank();
        java.lang.Double double95 = ooPlaceInnerProduct0.apply((org.la4j.vector.DenseVector) basicVector55, (org.la4j.vector.SparseVector) compressedVector91);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector2 and sparseVector4", vector2.equals(sparseVector4) ? vector2.hashCode() == sparseVector4.hashCode() : true);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
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
        org.la4j.vector.dense.BasicVector basicVector22 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector23 = squareRootSolver14.solve((org.la4j.Vector) basicVector22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector16 and sparseVector18", vector16.equals(sparseVector18) ? vector16.hashCode() == sparseVector18.hashCode() : true);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.la4j.operation.ooplace.OoPlaceVectorsSubtraction ooPlaceVectorsSubtraction0 = new org.la4j.operation.ooplace.OoPlaceVectorsSubtraction();
        org.la4j.Vector vector2 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str3 = vector2.toCSV();
        org.la4j.vector.SparseVector sparseVector4 = vector2.toSparseVector();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct5 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix10 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator11 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray12 = cCSMatrix10.foldRows(vectorAccumulator11);
        org.la4j.matrix.DenseMatrix denseMatrix13 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray12);
        org.la4j.vector.dense.BasicVector basicVector14 = new org.la4j.vector.dense.BasicVector(doubleArray12);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix19 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator20 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray21 = cCSMatrix19.foldRows(vectorAccumulator20);
        org.la4j.matrix.DenseMatrix denseMatrix22 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray21);
        org.la4j.vector.dense.BasicVector basicVector23 = new org.la4j.vector.dense.BasicVector(doubleArray21);
        ooPlaceOuterProduct5.ensureApplicableTo((org.la4j.Vector) basicVector14, (org.la4j.Vector) basicVector23);
        org.la4j.vector.sparse.CompressedVector compressedVector26 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector26.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector31 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix32 = ooPlaceOuterProduct5.apply((org.la4j.vector.SparseVector) compressedVector26, (org.la4j.vector.SparseVector) compressedVector31);
        org.la4j.Vector vector33 = ooPlaceVectorsSubtraction0.apply(sparseVector4, (org.la4j.vector.SparseVector) compressedVector26);
        org.la4j.Vector vector35 = sparseVector4.multiply((double) 100L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector2 and vector33", vector2.equals(vector33) ? vector2.hashCode() == vector33.hashCode() : true);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
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
        org.la4j.Vector vector27 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str28 = vector27.toCSV();
        org.la4j.vector.SparseVector sparseVector29 = vector27.toSparseVector();
        boolean boolean31 = sparseVector29.isZeroAt(52);
        org.la4j.iterator.VectorIterator vectorIterator32 = sparseVector29.iterator();
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
        org.la4j.Matrix matrix55 = compressedVector54.toColumnMatrix();
        org.la4j.Matrix matrix56 = sparseVector29.apply((org.la4j.operation.VectorVectorOperation<org.la4j.Matrix>) ooPlaceOuterProduct33, (org.la4j.Vector) compressedVector54);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix60 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double64 = rowMajorSparseMatrix60.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix65 = rowMajorSparseMatrix60.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct66 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean67 = sparseMatrix65.equals((java.lang.Object) ooPlaceOuterProduct66);
        org.la4j.vector.DenseVector denseVector69 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random71 = null;
        org.la4j.vector.DenseVector denseVector72 = org.la4j.vector.DenseVector.random(0, random71);
        java.lang.String str73 = denseVector72.toString();
        ooPlaceOuterProduct66.ensureApplicableTo((org.la4j.Vector) denseVector69, (org.la4j.Vector) denseVector72);
        org.la4j.Matrix matrix75 = ooPlaceOuterProduct0.apply((org.la4j.vector.SparseVector) compressedVector54, denseVector69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector27 and sparseVector29", vector27.equals(sparseVector29) ? vector27.hashCode() == sparseVector29.hashCode() : true);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix3 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean4 = cCSMatrix3.isRowMajor();
        org.la4j.Matrix matrix7 = cCSMatrix3.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator8 = cCSMatrix3.nonZeroColumnMajorIterator();
        org.la4j.Vector vector10 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str11 = vector10.toCSV();
        org.la4j.vector.SparseVector sparseVector12 = vector10.toSparseVector();
        boolean boolean14 = sparseVector12.isZeroAt(52);
        org.la4j.iterator.VectorIterator vectorIterator15 = sparseVector12.iterator();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct16 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix21 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator22 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray23 = cCSMatrix21.foldRows(vectorAccumulator22);
        org.la4j.matrix.DenseMatrix denseMatrix24 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray23);
        org.la4j.vector.dense.BasicVector basicVector25 = new org.la4j.vector.dense.BasicVector(doubleArray23);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix30 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator31 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray32 = cCSMatrix30.foldRows(vectorAccumulator31);
        org.la4j.matrix.DenseMatrix denseMatrix33 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray32);
        org.la4j.vector.dense.BasicVector basicVector34 = new org.la4j.vector.dense.BasicVector(doubleArray32);
        ooPlaceOuterProduct16.ensureApplicableTo((org.la4j.Vector) basicVector25, (org.la4j.Vector) basicVector34);
        org.la4j.vector.sparse.CompressedVector compressedVector37 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix38 = compressedVector37.toColumnMatrix();
        org.la4j.Matrix matrix39 = sparseVector12.apply((org.la4j.operation.VectorVectorOperation<org.la4j.Matrix>) ooPlaceOuterProduct16, (org.la4j.Vector) compressedVector37);
        org.la4j.Vector vector40 = ooPlaceMatrixByVectorMultiplication0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix3, sparseVector12);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix43 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (short) 1, 0);
        org.la4j.Matrix matrix44 = rowMajorSparseMatrix43.shuffle();
        org.la4j.Matrix matrix49 = org.la4j.Matrix.diagonal((int) (short) 10, (double) 0);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator51 = org.la4j.Vectors.asSumAccumulator(100.0d);
        double[] doubleArray52 = matrix49.foldColumns(vectorAccumulator51);
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix53 = org.la4j.matrix.dense.Basic2DMatrix.from1DArray((int) 'a', (int) (byte) 0, doubleArray52);
        org.la4j.vector.DenseVector denseVector54 = org.la4j.vector.DenseVector.fromArray(doubleArray52);
        org.la4j.Vector vector55 = ooPlaceMatrixByVectorMultiplication0.apply(rowMajorSparseMatrix43, denseVector54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector10 and sparseVector12", vector10.equals(sparseVector12) ? vector10.hashCode() == sparseVector12.hashCode() : true);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        byte[] byteArray4 = cRSMatrix3.toBinary();
        org.la4j.vector.functor.VectorFunction vectorFunction6 = org.la4j.Vectors.DEC_FUNCTION;
        cRSMatrix3.updateColumn(0, vectorFunction6);
        org.la4j.Matrix matrix9 = cRSMatrix3.removeRow(0);
        org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication10 = new org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication();
        org.la4j.vector.sparse.CompressedVector compressedVector12 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector12.swapElements(10, (int) (byte) 100);
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct16 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix20 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix21 = rowMajorSparseMatrix20.removeLastRow();
        double double25 = rowMajorSparseMatrix20.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int26 = rowMajorSparseMatrix20.cardinality();
        org.la4j.Vector vector28 = rowMajorSparseMatrix20.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix31 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix32 = ooPlaceMatrixHadamardProduct16.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix20, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix31);
        org.la4j.Vector vector33 = ooPlaceVectorByMatrixMultiplication10.apply((org.la4j.vector.SparseVector) compressedVector12, columnMajorSparseMatrix31);
        boolean boolean35 = compressedVector12.isZeroAt((int) ' ');
        boolean boolean37 = compressedVector12.isZeroAt((int) '4');
        org.la4j.vector.VectorFactory<org.la4j.vector.dense.BasicVector> basicVectorVectorFactory38 = org.la4j.Vectors.DENSE;
        org.la4j.vector.dense.BasicVector basicVector39 = compressedVector12.to(basicVectorVectorFactory38);
        java.util.Spliterator<java.lang.Double> doubleSpliterator40 = compressedVector12.spliterator();
        org.la4j.Vector vector41 = ooPlaceMatrixByVectorMultiplication0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, (org.la4j.vector.SparseVector) compressedVector12);
        double double42 = vector41.infinityNorm();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on compressedVector12 and basicVector39", compressedVector12.equals(basicVector39) ? compressedVector12.hashCode() == basicVector39.hashCode() : true);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.la4j.Vector vector1 = org.la4j.Vector.unit((int) (short) 10);
        org.la4j.vector.functor.VectorFunction vectorFunction3 = org.la4j.Vectors.asMinusFunction((double) (byte) 100);
        org.la4j.Vector vector4 = vector1.transform(vectorFunction3);
        org.la4j.Matrix matrix5 = vector1.toColumnMatrix();
        org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication6 = new org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication();
        org.la4j.vector.sparse.CompressedVector compressedVector8 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector8.swapElements(10, (int) (byte) 100);
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct12 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix16 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix17 = rowMajorSparseMatrix16.removeLastRow();
        double double21 = rowMajorSparseMatrix16.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int22 = rowMajorSparseMatrix16.cardinality();
        org.la4j.Vector vector24 = rowMajorSparseMatrix16.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix27 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix28 = ooPlaceMatrixHadamardProduct12.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix16, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix27);
        org.la4j.Vector vector29 = ooPlaceVectorByMatrixMultiplication6.apply((org.la4j.vector.SparseVector) compressedVector8, columnMajorSparseMatrix27);
        boolean boolean31 = compressedVector8.isZeroAt((int) ' ');
        boolean boolean33 = compressedVector8.isZeroAt((int) '4');
        org.la4j.vector.VectorFactory<org.la4j.vector.dense.BasicVector> basicVectorVectorFactory34 = org.la4j.Vectors.DENSE;
        org.la4j.vector.dense.BasicVector basicVector35 = compressedVector8.to(basicVectorVectorFactory34);
        org.la4j.vector.dense.BasicVector basicVector36 = vector1.to(basicVectorVectorFactory34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on compressedVector8 and basicVector35", compressedVector8.equals(basicVector35) ? compressedVector8.hashCode() == basicVector35.hashCode() : true);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.Vector vector5 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str6 = vector5.toCSV();
        org.la4j.vector.SparseVector sparseVector7 = vector5.toSparseVector();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix10 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator11 = columnMajorSparseMatrix10.nonZeroIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix16 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double20 = rowMajorSparseMatrix16.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix21 = rowMajorSparseMatrix16.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate22 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean23 = sparseMatrix21.is(advancedMatrixPredicate22);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator25 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double26 = sparseMatrix21.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator25);
        org.la4j.vector.functor.VectorProcedure vectorProcedure27 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator25);
        columnMajorSparseMatrix10.eachNonZeroInRow((-1), vectorProcedure27);
        sparseVector7.eachNonZero(vectorProcedure27);
        org.la4j.Vector vector30 = ooPlaceMatrixByVectorMultiplication0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, sparseVector7);
        boolean boolean31 = cRSMatrix3.isRowMajor();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector5 and sparseVector7", vector5.equals(sparseVector7) ? vector5.hashCode() == sparseVector7.hashCode() : true);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator3 = cRSMatrix2.nonZeroIterator();
        org.la4j.Vector vector5 = cRSMatrix2.getColumn(100);
        boolean boolean8 = cRSMatrix2.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator10 = cRSMatrix2.nonZeroIteratorOfColumn((-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix11 = cRSMatrix2.toRowMajorSparseMatrix();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory12 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix13 = cRSMatrix2.to(basic1DMatrixMatrixFactory12);
        org.la4j.linear.SquareRootSolver squareRootSolver14 = new org.la4j.linear.SquareRootSolver((org.la4j.Matrix) basic1DMatrix13);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix18 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double22 = rowMajorSparseMatrix18.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix23 = rowMajorSparseMatrix18.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct24 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean25 = sparseMatrix23.equals((java.lang.Object) ooPlaceOuterProduct24);
        org.la4j.vector.dense.BasicVector basicVector27 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector28 = basicVector27.copy();
        org.la4j.Matrix matrix29 = basicVector27.toDiagonalMatrix();
        org.la4j.Vector vector31 = basicVector27.blankOfLength(52);
        org.la4j.vector.SparseVector sparseVector33 = org.la4j.vector.SparseVector.fromCSV("1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000");
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
        org.la4j.Matrix matrix54 = basicVector52.toColumnMatrix();
        org.la4j.Matrix matrix55 = sparseVector33.outerProduct((org.la4j.Vector) basicVector52);
        org.la4j.Matrix matrix56 = basicVector52.toRowMatrix();
        org.la4j.Matrix matrix57 = ooPlaceOuterProduct24.apply((org.la4j.vector.DenseVector) basicVector27, (org.la4j.vector.DenseVector) basicVector52);
        org.la4j.Matrix matrix58 = basicVector27.toColumnMatrix();
        org.la4j.Vector vector59 = squareRootSolver14.solve((org.la4j.Vector) basicVector27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector5 and vector28", vector5.equals(vector28) ? vector5.hashCode() == vector28.hashCode() : true);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        double[] doubleArray6 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray13 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray20 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray27 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray34 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray35 = new double[][] { doubleArray6, doubleArray13, doubleArray20, doubleArray27, doubleArray34 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix36 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray35);
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix37 = new org.la4j.matrix.dense.Basic2DMatrix(doubleArray35);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix38 = org.la4j.matrix.RowMajorSparseMatrix.from2DArray(doubleArray35);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix39 = org.la4j.matrix.sparse.CCSMatrix.from2DArray(doubleArray35);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix40 = org.la4j.matrix.RowMajorSparseMatrix.from2DArray(doubleArray35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on basic2DMatrix36 and cCSMatrix39", basic2DMatrix36.equals(cCSMatrix39) ? basic2DMatrix36.hashCode() == cCSMatrix39.hashCode() : true);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.la4j.vector.dense.BasicVector basicVector1 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix5 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double9 = rowMajorSparseMatrix5.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix10 = rowMajorSparseMatrix5.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct11 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean12 = sparseMatrix10.equals((java.lang.Object) ooPlaceOuterProduct11);
        org.la4j.vector.dense.BasicVector basicVector14 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector15 = basicVector14.copy();
        org.la4j.Matrix matrix16 = basicVector1.apply((org.la4j.operation.VectorVectorOperation<org.la4j.Matrix>) ooPlaceOuterProduct11, (org.la4j.Vector) basicVector14);
        org.la4j.operation.VectorVectorOperation<org.la4j.Matrix> matrixVectorVectorOperation17 = org.la4j.LinearAlgebra.OO_PLACE_OUTER_PRODUCT;
        org.la4j.Vector vector19 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str20 = vector19.toCSV();
        org.la4j.vector.SparseVector sparseVector21 = vector19.toSparseVector();
        boolean boolean23 = sparseVector21.isZeroAt(52);
        org.la4j.iterator.VectorIterator vectorIterator24 = sparseVector21.iterator();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct25 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix30 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator31 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray32 = cCSMatrix30.foldRows(vectorAccumulator31);
        org.la4j.matrix.DenseMatrix denseMatrix33 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray32);
        org.la4j.vector.dense.BasicVector basicVector34 = new org.la4j.vector.dense.BasicVector(doubleArray32);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix39 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator40 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray41 = cCSMatrix39.foldRows(vectorAccumulator40);
        org.la4j.matrix.DenseMatrix denseMatrix42 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray41);
        org.la4j.vector.dense.BasicVector basicVector43 = new org.la4j.vector.dense.BasicVector(doubleArray41);
        ooPlaceOuterProduct25.ensureApplicableTo((org.la4j.Vector) basicVector34, (org.la4j.Vector) basicVector43);
        org.la4j.vector.sparse.CompressedVector compressedVector46 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix47 = compressedVector46.toColumnMatrix();
        org.la4j.Matrix matrix48 = sparseVector21.apply((org.la4j.operation.VectorVectorOperation<org.la4j.Matrix>) ooPlaceOuterProduct25, (org.la4j.Vector) compressedVector46);
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct49 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix53 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double57 = rowMajorSparseMatrix53.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix58 = rowMajorSparseMatrix53.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct59 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean60 = sparseMatrix58.equals((java.lang.Object) ooPlaceOuterProduct59);
        org.la4j.vector.DenseVector denseVector62 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random64 = null;
        org.la4j.vector.DenseVector denseVector65 = org.la4j.vector.DenseVector.random(0, random64);
        java.lang.String str66 = denseVector65.toString();
        ooPlaceOuterProduct59.ensureApplicableTo((org.la4j.Vector) denseVector62, (org.la4j.Vector) denseVector65);
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation68 = ooPlaceInnerProduct49.partiallyApply(denseVector65);
        org.la4j.Vector vector69 = denseVector65.blank();
        org.la4j.Matrix matrix70 = matrixVectorVectorOperation17.apply(sparseVector21, denseVector65);
        org.la4j.vector.dense.BasicVector basicVector72 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        int int73 = basicVector72.length();
        org.la4j.Vector vector74 = basicVector72.shuffle();
        org.la4j.Matrix matrix75 = basicVector14.apply(matrixVectorVectorOperation17, vector74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector19 and sparseVector21", vector19.equals(sparseVector21) ? vector19.hashCode() == sparseVector21.hashCode() : true);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct0 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.Vector vector2 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str3 = vector2.toCSV();
        org.la4j.vector.SparseVector sparseVector4 = vector2.toSparseVector();
        boolean boolean6 = sparseVector4.isZeroAt(52);
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation7 = ooPlaceInnerProduct0.partiallyApply(sparseVector4);
        org.la4j.vector.DenseVector denseVector9 = org.la4j.vector.DenseVector.unit(0);
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation10 = ooPlaceInnerProduct0.partiallyApply(denseVector9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector2 and sparseVector4", vector2.equals(sparseVector4) ? vector2.hashCode() == sparseVector4.hashCode() : true);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
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
        org.la4j.Vector vector32 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str33 = vector32.toCSV();
        org.la4j.vector.SparseVector sparseVector34 = vector32.toSparseVector();
        boolean boolean36 = sparseVector34.isZeroAt(52);
        org.la4j.iterator.VectorIterator vectorIterator37 = sparseVector34.iterator();
        org.la4j.iterator.VectorIterator vectorIterator38 = sparseVector34.nonZeroIterator();
        double double39 = sparseVector34.manhattanNorm();
        double double40 = sparseVector34.density();
        double double41 = sparseVector34.infinityNorm();
        org.la4j.operation.VectorOperation<org.la4j.Matrix> matrixVectorOperation42 = ooPlaceOuterProduct7.partiallyApply(sparseVector34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector1 and sparseVector3", vector1.equals(sparseVector3) ? vector1.hashCode() == sparseVector3.hashCode() : true);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.la4j.operation.ooplace.OoPlaceVectorsAddition ooPlaceVectorsAddition0 = new org.la4j.operation.ooplace.OoPlaceVectorsAddition();
        org.la4j.Vector vector2 = org.la4j.Vector.unit((int) (short) 10);
        org.la4j.vector.functor.VectorFunction vectorFunction4 = org.la4j.Vectors.asMinusFunction((double) (byte) 100);
        org.la4j.Vector vector5 = vector2.transform(vectorFunction4);
        double double6 = vector2.product();
        org.la4j.vector.DenseVector denseVector7 = vector2.toDenseVector();
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
        org.la4j.Vector vector34 = ooPlaceVectorsAddition0.apply(denseVector7, (org.la4j.vector.DenseVector) basicVector27);
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct35 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.Vector vector37 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str38 = vector37.toCSV();
        org.la4j.vector.SparseVector sparseVector39 = vector37.toSparseVector();
        double double40 = sparseVector39.euclideanNorm();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct41 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix46 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator47 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray48 = cCSMatrix46.foldRows(vectorAccumulator47);
        org.la4j.matrix.DenseMatrix denseMatrix49 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray48);
        org.la4j.vector.dense.BasicVector basicVector50 = new org.la4j.vector.dense.BasicVector(doubleArray48);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix55 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator56 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray57 = cCSMatrix55.foldRows(vectorAccumulator56);
        org.la4j.matrix.DenseMatrix denseMatrix58 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray57);
        org.la4j.vector.dense.BasicVector basicVector59 = new org.la4j.vector.dense.BasicVector(doubleArray57);
        ooPlaceOuterProduct41.ensureApplicableTo((org.la4j.Vector) basicVector50, (org.la4j.Vector) basicVector59);
        org.la4j.vector.sparse.CompressedVector compressedVector62 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector62.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector67 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix68 = ooPlaceOuterProduct41.apply((org.la4j.vector.SparseVector) compressedVector62, (org.la4j.vector.SparseVector) compressedVector67);
        double double69 = compressedVector67.min();
        java.lang.Double double70 = ooPlaceInnerProduct35.apply(sparseVector39, (org.la4j.vector.SparseVector) compressedVector67);
        org.la4j.vector.sparse.CompressedVector compressedVector71 = new org.la4j.vector.sparse.CompressedVector();
        org.la4j.Vector vector72 = ooPlaceVectorsAddition0.apply((org.la4j.vector.SparseVector) compressedVector67, (org.la4j.vector.SparseVector) compressedVector71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector2 and sparseVector39", vector2.equals(sparseVector39) ? vector2.hashCode() == sparseVector39.hashCode() : true);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix3 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean4 = cCSMatrix3.isRowMajor();
        org.la4j.Matrix matrix7 = cCSMatrix3.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator8 = cCSMatrix3.nonZeroColumnMajorIterator();
        org.la4j.Vector vector10 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str11 = vector10.toCSV();
        org.la4j.vector.SparseVector sparseVector12 = vector10.toSparseVector();
        boolean boolean14 = sparseVector12.isZeroAt(52);
        org.la4j.iterator.VectorIterator vectorIterator15 = sparseVector12.iterator();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct16 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix21 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator22 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray23 = cCSMatrix21.foldRows(vectorAccumulator22);
        org.la4j.matrix.DenseMatrix denseMatrix24 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray23);
        org.la4j.vector.dense.BasicVector basicVector25 = new org.la4j.vector.dense.BasicVector(doubleArray23);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix30 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator31 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray32 = cCSMatrix30.foldRows(vectorAccumulator31);
        org.la4j.matrix.DenseMatrix denseMatrix33 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray32);
        org.la4j.vector.dense.BasicVector basicVector34 = new org.la4j.vector.dense.BasicVector(doubleArray32);
        ooPlaceOuterProduct16.ensureApplicableTo((org.la4j.Vector) basicVector25, (org.la4j.Vector) basicVector34);
        org.la4j.vector.sparse.CompressedVector compressedVector37 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix38 = compressedVector37.toColumnMatrix();
        org.la4j.Matrix matrix39 = sparseVector12.apply((org.la4j.operation.VectorVectorOperation<org.la4j.Matrix>) ooPlaceOuterProduct16, (org.la4j.Vector) compressedVector37);
        org.la4j.Vector vector40 = ooPlaceMatrixByVectorMultiplication0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix3, sparseVector12);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition41 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix44 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double45 = cRSMatrix44.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix49 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix50 = rowMajorSparseMatrix49.removeLastRow();
        org.la4j.Matrix matrix51 = ooPlaceMatricesAddition41.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix44, rowMajorSparseMatrix49);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix54 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator55 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray56 = cCSMatrix54.foldRows(vectorAccumulator55);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix59 = org.la4j.matrix.RowMajorSparseMatrix.zero(0, (int) (short) 10);
        org.la4j.Matrix matrix60 = ooPlaceMatricesAddition41.applySymmetric((org.la4j.matrix.SparseMatrix) cCSMatrix54, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix59);
        double double61 = rowMajorSparseMatrix59.norm();
        org.la4j.operation.VectorOperation<org.la4j.Vector> vectorVectorOperation62 = ooPlaceMatrixByVectorMultiplication0.partiallyApply(rowMajorSparseMatrix59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector10 and sparseVector12", vector10.equals(sparseVector12) ? vector10.hashCode() == sparseVector12.hashCode() : true);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.la4j.operation.ooplace.OoPlaceKroneckerProduct ooPlaceKroneckerProduct0 = new org.la4j.operation.ooplace.OoPlaceKroneckerProduct();
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix3 = org.la4j.matrix.dense.Basic1DMatrix.unit((int) (byte) 10, (int) (byte) 0);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix6 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double7 = cRSMatrix6.min();
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator8 = cRSMatrix6.nonZeroRowMajorIterator();
        org.la4j.decomposition.RawLUDecompositor rawLUDecompositor9 = new org.la4j.decomposition.RawLUDecompositor((org.la4j.Matrix) cRSMatrix6);
        org.la4j.Matrix matrix10 = ooPlaceKroneckerProduct0.apply((org.la4j.matrix.DenseMatrix) basic1DMatrix3, (org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix6);
        org.la4j.matrix.DenseMatrix denseMatrix13 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication14 = new org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix17 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        byte[] byteArray18 = cRSMatrix17.toBinary();
        org.la4j.vector.functor.VectorFunction vectorFunction20 = org.la4j.Vectors.DEC_FUNCTION;
        cRSMatrix17.updateColumn(0, vectorFunction20);
        org.la4j.Matrix matrix23 = cRSMatrix17.removeRow(0);
        org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication24 = new org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication();
        org.la4j.vector.sparse.CompressedVector compressedVector26 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector26.swapElements(10, (int) (byte) 100);
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct30 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix34 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix35 = rowMajorSparseMatrix34.removeLastRow();
        double double39 = rowMajorSparseMatrix34.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int40 = rowMajorSparseMatrix34.cardinality();
        org.la4j.Vector vector42 = rowMajorSparseMatrix34.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix45 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix46 = ooPlaceMatrixHadamardProduct30.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix34, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix45);
        org.la4j.Vector vector47 = ooPlaceVectorByMatrixMultiplication24.apply((org.la4j.vector.SparseVector) compressedVector26, columnMajorSparseMatrix45);
        boolean boolean49 = compressedVector26.isZeroAt((int) ' ');
        boolean boolean51 = compressedVector26.isZeroAt((int) '4');
        org.la4j.vector.VectorFactory<org.la4j.vector.dense.BasicVector> basicVectorVectorFactory52 = org.la4j.Vectors.DENSE;
        org.la4j.vector.dense.BasicVector basicVector53 = compressedVector26.to(basicVectorVectorFactory52);
        java.util.Spliterator<java.lang.Double> doubleSpliterator54 = compressedVector26.spliterator();
        org.la4j.Vector vector55 = ooPlaceMatrixByVectorMultiplication14.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix17, (org.la4j.vector.SparseVector) compressedVector26);
        org.la4j.Matrix matrix56 = ooPlaceKroneckerProduct0.apply(denseMatrix13, (org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on compressedVector26 and basicVector53", compressedVector26.equals(basicVector53) ? compressedVector26.hashCode() == basicVector53.hashCode() : true);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
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
        org.la4j.vector.SparseVector sparseVector51 = org.la4j.vector.SparseVector.zero(0);
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction52 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix56 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix57 = rowMajorSparseMatrix56.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix59 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix60 = ooPlaceMatricesSubtraction52.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix56, denseMatrix59);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix63 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double64 = columnMajorSparseMatrix63.determinant();
        org.la4j.matrix.DenseMatrix denseMatrix67 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        double double68 = denseMatrix67.min();
        double double69 = denseMatrix67.sum();
        org.la4j.Matrix matrix70 = ooPlaceMatricesSubtraction52.apply(columnMajorSparseMatrix63, denseMatrix67);
        org.la4j.Vector vector71 = ooPlaceVectorByMatrixMultiplication26.apply(sparseVector51, columnMajorSparseMatrix63);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix78 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator79 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray80 = cCSMatrix78.foldRows(vectorAccumulator79);
        org.la4j.matrix.DenseMatrix denseMatrix81 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray80);
        org.la4j.vector.dense.BasicVector basicVector82 = new org.la4j.vector.dense.BasicVector(doubleArray80);
        double[] doubleArray83 = basicVector82.toArray();
        int[] intArray89 = new int[] { 52, (byte) -1, ' ', (byte) 100, 0 };
        org.la4j.vector.sparse.CompressedVector compressedVector90 = new org.la4j.vector.sparse.CompressedVector((int) (byte) 0, (int) (short) 1, doubleArray83, intArray89);
        org.la4j.vector.sparse.CompressedVector compressedVector91 = org.la4j.vector.sparse.CompressedVector.fromArray(doubleArray83);
        org.la4j.Matrix matrix92 = ooPlaceOuterProduct0.apply(sparseVector51, (org.la4j.vector.SparseVector) compressedVector91);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on denseVector3 and compressedVector90", denseVector3.equals(compressedVector90) ? denseVector3.hashCode() == compressedVector90.hashCode() : true);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.la4j.Vector vector1 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str2 = vector1.toCSV();
        org.la4j.vector.SparseVector sparseVector3 = vector1.toSparseVector();
        boolean boolean5 = sparseVector3.isZeroAt(52);
        org.la4j.iterator.VectorIterator vectorIterator6 = sparseVector3.iterator();
        org.la4j.iterator.VectorIterator vectorIterator7 = sparseVector3.nonZeroIterator();
        org.la4j.vector.SparseVector sparseVector8 = sparseVector3.toSparseVector();
        org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication9 = new org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication();
        org.la4j.vector.sparse.CompressedVector compressedVector11 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector11.swapElements(10, (int) (byte) 100);
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct15 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix19 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix20 = rowMajorSparseMatrix19.removeLastRow();
        double double24 = rowMajorSparseMatrix19.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int25 = rowMajorSparseMatrix19.cardinality();
        org.la4j.Vector vector27 = rowMajorSparseMatrix19.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix30 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix31 = ooPlaceMatrixHadamardProduct15.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix19, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix30);
        org.la4j.Vector vector32 = ooPlaceVectorByMatrixMultiplication9.apply((org.la4j.vector.SparseVector) compressedVector11, columnMajorSparseMatrix30);
        boolean boolean34 = compressedVector11.isZeroAt((int) ' ');
        boolean boolean36 = compressedVector11.isZeroAt((int) '4');
        org.la4j.vector.VectorFactory<org.la4j.vector.dense.BasicVector> basicVectorVectorFactory37 = org.la4j.Vectors.DENSE;
        org.la4j.vector.dense.BasicVector basicVector38 = compressedVector11.to(basicVectorVectorFactory37);
        org.la4j.vector.dense.BasicVector basicVector39 = sparseVector3.to(basicVectorVectorFactory37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector1 and sparseVector3", vector1.equals(sparseVector3) ? vector1.hashCode() == sparseVector3.hashCode() : true);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double7 = rowMajorSparseMatrix3.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix8 = rowMajorSparseMatrix3.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct9 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean10 = sparseMatrix8.equals((java.lang.Object) ooPlaceOuterProduct9);
        org.la4j.vector.DenseVector denseVector12 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random14 = null;
        org.la4j.vector.DenseVector denseVector15 = org.la4j.vector.DenseVector.random(0, random14);
        java.lang.String str16 = denseVector15.toString();
        ooPlaceOuterProduct9.ensureApplicableTo((org.la4j.Vector) denseVector12, (org.la4j.Vector) denseVector15);
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct18 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix23 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator24 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray25 = cCSMatrix23.foldRows(vectorAccumulator24);
        org.la4j.matrix.DenseMatrix denseMatrix26 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray25);
        org.la4j.vector.dense.BasicVector basicVector27 = new org.la4j.vector.dense.BasicVector(doubleArray25);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix32 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator33 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray34 = cCSMatrix32.foldRows(vectorAccumulator33);
        org.la4j.matrix.DenseMatrix denseMatrix35 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray34);
        org.la4j.vector.dense.BasicVector basicVector36 = new org.la4j.vector.dense.BasicVector(doubleArray34);
        ooPlaceOuterProduct18.ensureApplicableTo((org.la4j.Vector) basicVector27, (org.la4j.Vector) basicVector36);
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct38 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random40 = null;
        org.la4j.vector.DenseVector denseVector41 = org.la4j.vector.DenseVector.random(0, random40);
        java.util.Random random43 = null;
        org.la4j.vector.DenseVector denseVector44 = org.la4j.vector.DenseVector.random(0, random43);
        org.la4j.Matrix matrix45 = ooPlaceOuterProduct38.apply(denseVector41, denseVector44);
        org.la4j.vector.sparse.CompressedVector compressedVector47 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix48 = ooPlaceOuterProduct18.apply(denseVector41, (org.la4j.vector.SparseVector) compressedVector47);
        java.text.NumberFormat numberFormat49 = null;
        java.lang.String str51 = denseVector41.mkString(numberFormat49, "hi!");
        org.la4j.vector.sparse.CompressedVector compressedVector53 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        double double54 = compressedVector53.euclideanNorm();
        org.la4j.Matrix matrix55 = ooPlaceOuterProduct9.apply(denseVector41, (org.la4j.vector.SparseVector) compressedVector53);
        org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication56 = new org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication();
        org.la4j.vector.sparse.CompressedVector compressedVector58 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector58.swapElements(10, (int) (byte) 100);
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct62 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix66 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix67 = rowMajorSparseMatrix66.removeLastRow();
        double double71 = rowMajorSparseMatrix66.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int72 = rowMajorSparseMatrix66.cardinality();
        org.la4j.Vector vector74 = rowMajorSparseMatrix66.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix77 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix78 = ooPlaceMatrixHadamardProduct62.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix66, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix77);
        org.la4j.Vector vector79 = ooPlaceVectorByMatrixMultiplication56.apply((org.la4j.vector.SparseVector) compressedVector58, columnMajorSparseMatrix77);
        boolean boolean81 = compressedVector58.isZeroAt((int) ' ');
        boolean boolean83 = compressedVector58.isZeroAt((int) '4');
        org.la4j.vector.VectorFactory<org.la4j.vector.dense.BasicVector> basicVectorVectorFactory84 = org.la4j.Vectors.DENSE;
        org.la4j.vector.dense.BasicVector basicVector85 = compressedVector58.to(basicVectorVectorFactory84);
        org.la4j.vector.sparse.CompressedVector compressedVector87 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        java.text.NumberFormat numberFormat88 = null;
        java.lang.String str89 = compressedVector87.toMatrixMarket(numberFormat88);
        org.la4j.Vector vector91 = compressedVector87.add((double) 52);
        compressedVector87.swapElements((int) (short) 1, (int) (byte) 1);
        org.la4j.Matrix matrix95 = ooPlaceOuterProduct9.apply((org.la4j.vector.DenseVector) basicVector85, (org.la4j.vector.SparseVector) compressedVector87);
        org.la4j.Matrix matrix97 = matrix95.removeRow((int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on compressedVector47 and basicVector85", compressedVector47.equals(basicVector85) ? compressedVector47.hashCode() == basicVector85.hashCode() : true);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double7 = rowMajorSparseMatrix3.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix8 = rowMajorSparseMatrix3.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct9 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean10 = sparseMatrix8.equals((java.lang.Object) ooPlaceOuterProduct9);
        org.la4j.vector.DenseVector denseVector12 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random14 = null;
        org.la4j.vector.DenseVector denseVector15 = org.la4j.vector.DenseVector.random(0, random14);
        java.lang.String str16 = denseVector15.toString();
        ooPlaceOuterProduct9.ensureApplicableTo((org.la4j.Vector) denseVector12, (org.la4j.Vector) denseVector15);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix21 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double25 = rowMajorSparseMatrix21.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix26 = rowMajorSparseMatrix21.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct27 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean28 = sparseMatrix26.equals((java.lang.Object) ooPlaceOuterProduct27);
        org.la4j.vector.dense.BasicVector basicVector30 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector31 = basicVector30.copy();
        org.la4j.Matrix matrix32 = basicVector30.toDiagonalMatrix();
        org.la4j.Vector vector34 = basicVector30.blankOfLength(52);
        org.la4j.vector.SparseVector sparseVector36 = org.la4j.vector.SparseVector.fromCSV("1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct37 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix42 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator43 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray44 = cCSMatrix42.foldRows(vectorAccumulator43);
        org.la4j.matrix.DenseMatrix denseMatrix45 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray44);
        org.la4j.vector.dense.BasicVector basicVector46 = new org.la4j.vector.dense.BasicVector(doubleArray44);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix51 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator52 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray53 = cCSMatrix51.foldRows(vectorAccumulator52);
        org.la4j.matrix.DenseMatrix denseMatrix54 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray53);
        org.la4j.vector.dense.BasicVector basicVector55 = new org.la4j.vector.dense.BasicVector(doubleArray53);
        ooPlaceOuterProduct37.ensureApplicableTo((org.la4j.Vector) basicVector46, (org.la4j.Vector) basicVector55);
        org.la4j.Matrix matrix57 = basicVector55.toColumnMatrix();
        org.la4j.Matrix matrix58 = sparseVector36.outerProduct((org.la4j.Vector) basicVector55);
        org.la4j.Matrix matrix59 = basicVector55.toRowMatrix();
        org.la4j.Matrix matrix60 = ooPlaceOuterProduct27.apply((org.la4j.vector.DenseVector) basicVector30, (org.la4j.vector.DenseVector) basicVector55);
        org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication61 = new org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication();
        org.la4j.vector.sparse.CompressedVector compressedVector63 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector63.swapElements(10, (int) (byte) 100);
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct67 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix71 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix72 = rowMajorSparseMatrix71.removeLastRow();
        double double76 = rowMajorSparseMatrix71.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int77 = rowMajorSparseMatrix71.cardinality();
        org.la4j.Vector vector79 = rowMajorSparseMatrix71.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix82 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix83 = ooPlaceMatrixHadamardProduct67.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix71, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix82);
        org.la4j.Vector vector84 = ooPlaceVectorByMatrixMultiplication61.apply((org.la4j.vector.SparseVector) compressedVector63, columnMajorSparseMatrix82);
        boolean boolean86 = compressedVector63.isZeroAt((int) ' ');
        boolean boolean88 = compressedVector63.isZeroAt((int) '4');
        org.la4j.vector.VectorFactory<org.la4j.vector.dense.BasicVector> basicVectorVectorFactory89 = org.la4j.Vectors.DENSE;
        org.la4j.vector.dense.BasicVector basicVector90 = compressedVector63.to(basicVectorVectorFactory89);
        org.la4j.Matrix matrix91 = ooPlaceOuterProduct9.apply((org.la4j.vector.DenseVector) basicVector55, (org.la4j.vector.DenseVector) basicVector90);
        org.la4j.vector.functor.VectorPredicate vectorPredicate92 = org.la4j.Vectors.ZERO_VECTOR;
        boolean boolean93 = basicVector55.non(vectorPredicate92);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on compressedVector63 and basicVector90", compressedVector63.equals(basicVector90) ? compressedVector63.hashCode() == basicVector90.hashCode() : true);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix3 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean4 = cCSMatrix3.isRowMajor();
        org.la4j.Matrix matrix7 = cCSMatrix3.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator8 = cCSMatrix3.nonZeroColumnMajorIterator();
        org.la4j.Vector vector10 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str11 = vector10.toCSV();
        org.la4j.vector.SparseVector sparseVector12 = vector10.toSparseVector();
        boolean boolean14 = sparseVector12.isZeroAt(52);
        org.la4j.iterator.VectorIterator vectorIterator15 = sparseVector12.iterator();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct16 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix21 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator22 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray23 = cCSMatrix21.foldRows(vectorAccumulator22);
        org.la4j.matrix.DenseMatrix denseMatrix24 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray23);
        org.la4j.vector.dense.BasicVector basicVector25 = new org.la4j.vector.dense.BasicVector(doubleArray23);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix30 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator31 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray32 = cCSMatrix30.foldRows(vectorAccumulator31);
        org.la4j.matrix.DenseMatrix denseMatrix33 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray32);
        org.la4j.vector.dense.BasicVector basicVector34 = new org.la4j.vector.dense.BasicVector(doubleArray32);
        ooPlaceOuterProduct16.ensureApplicableTo((org.la4j.Vector) basicVector25, (org.la4j.Vector) basicVector34);
        org.la4j.vector.sparse.CompressedVector compressedVector37 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix38 = compressedVector37.toColumnMatrix();
        org.la4j.Matrix matrix39 = sparseVector12.apply((org.la4j.operation.VectorVectorOperation<org.la4j.Matrix>) ooPlaceOuterProduct16, (org.la4j.Vector) compressedVector37);
        org.la4j.Vector vector40 = ooPlaceMatrixByVectorMultiplication0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix3, sparseVector12);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix44 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix45 = rowMajorSparseMatrix44.removeLastRow();
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure46 = null;
        rowMajorSparseMatrix44.eachNonZero(matrixProcedure46);
        double double48 = rowMajorSparseMatrix44.max();
        org.la4j.vector.dense.BasicVector basicVector49 = new org.la4j.vector.dense.BasicVector();
        org.la4j.Vector vector50 = ooPlaceMatrixByVectorMultiplication0.apply(rowMajorSparseMatrix44, (org.la4j.vector.DenseVector) basicVector49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector10 and sparseVector12", vector10.equals(sparseVector12) ? vector10.hashCode() == sparseVector12.hashCode() : true);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
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
        org.la4j.vector.SparseVector sparseVector21 = vector20.toSparseVector();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector16 and sparseVector18", vector16.equals(sparseVector18) ? vector16.hashCode() == sparseVector18.hashCode() : true);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        org.la4j.vector.sparse.CompressedVector compressedVector1 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        double double2 = compressedVector1.euclideanNorm();
        org.la4j.vector.VectorFactory<org.la4j.vector.dense.BasicVector> basicVectorVectorFactory3 = org.la4j.Vectors.DENSE;
        java.lang.Class<org.la4j.vector.dense.BasicVector> basicVectorClass4 = basicVectorVectorFactory3.outputClass;
        org.la4j.vector.dense.BasicVector basicVector5 = compressedVector1.to(basicVectorVectorFactory3);
        java.lang.Class<org.la4j.vector.dense.BasicVector> basicVectorClass6 = basicVectorVectorFactory3.outputClass;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on compressedVector1 and basicVector5", compressedVector1.equals(basicVector5) ? compressedVector1.hashCode() == basicVector5.hashCode() : true);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        byte[] byteArray4 = cRSMatrix3.toBinary();
        org.la4j.vector.functor.VectorFunction vectorFunction6 = org.la4j.Vectors.DEC_FUNCTION;
        cRSMatrix3.updateColumn(0, vectorFunction6);
        org.la4j.Matrix matrix9 = cRSMatrix3.removeRow(0);
        org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication10 = new org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication();
        org.la4j.vector.sparse.CompressedVector compressedVector12 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector12.swapElements(10, (int) (byte) 100);
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct16 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix20 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix21 = rowMajorSparseMatrix20.removeLastRow();
        double double25 = rowMajorSparseMatrix20.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int26 = rowMajorSparseMatrix20.cardinality();
        org.la4j.Vector vector28 = rowMajorSparseMatrix20.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix31 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix32 = ooPlaceMatrixHadamardProduct16.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix20, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix31);
        org.la4j.Vector vector33 = ooPlaceVectorByMatrixMultiplication10.apply((org.la4j.vector.SparseVector) compressedVector12, columnMajorSparseMatrix31);
        boolean boolean35 = compressedVector12.isZeroAt((int) ' ');
        boolean boolean37 = compressedVector12.isZeroAt((int) '4');
        org.la4j.vector.VectorFactory<org.la4j.vector.dense.BasicVector> basicVectorVectorFactory38 = org.la4j.Vectors.DENSE;
        org.la4j.vector.dense.BasicVector basicVector39 = compressedVector12.to(basicVectorVectorFactory38);
        java.util.Spliterator<java.lang.Double> doubleSpliterator40 = compressedVector12.spliterator();
        org.la4j.Vector vector41 = ooPlaceMatrixByVectorMultiplication0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, (org.la4j.vector.SparseVector) compressedVector12);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition42 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix45 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double46 = cRSMatrix45.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix50 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix51 = rowMajorSparseMatrix50.removeLastRow();
        org.la4j.Matrix matrix52 = ooPlaceMatricesAddition42.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix45, rowMajorSparseMatrix50);
        org.la4j.operation.ooplace.OoPlaceVectorHadamardProduct ooPlaceVectorHadamardProduct53 = new org.la4j.operation.ooplace.OoPlaceVectorHadamardProduct();
        java.util.Random random55 = null;
        org.la4j.vector.DenseVector denseVector56 = org.la4j.vector.DenseVector.random(0, random55);
        org.la4j.vector.sparse.CompressedVector compressedVector58 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        java.text.NumberFormat numberFormat59 = null;
        java.lang.String str60 = compressedVector58.toMatrixMarket(numberFormat59);
        org.la4j.Vector vector62 = compressedVector58.add((double) 52);
        org.la4j.Vector vector64 = compressedVector58.sliceRight((int) (byte) 10);
        org.la4j.Vector vector65 = ooPlaceVectorHadamardProduct53.apply(denseVector56, (org.la4j.vector.SparseVector) compressedVector58);
        org.la4j.vector.VectorFactory<org.la4j.vector.dense.BasicVector> basicVectorVectorFactory66 = org.la4j.Vectors.DENSE;
        org.la4j.vector.dense.BasicVector basicVector67 = compressedVector58.to(basicVectorVectorFactory66);
        org.la4j.Vector vector68 = ooPlaceMatrixByVectorMultiplication0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix45, (org.la4j.vector.DenseVector) basicVector67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on compressedVector12 and basicVector39", compressedVector12.equals(basicVector39) ? compressedVector12.hashCode() == basicVector39.hashCode() : true);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double7 = rowMajorSparseMatrix3.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix8 = rowMajorSparseMatrix3.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct9 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean10 = sparseMatrix8.equals((java.lang.Object) ooPlaceOuterProduct9);
        org.la4j.vector.DenseVector denseVector12 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random14 = null;
        org.la4j.vector.DenseVector denseVector15 = org.la4j.vector.DenseVector.random(0, random14);
        java.lang.String str16 = denseVector15.toString();
        ooPlaceOuterProduct9.ensureApplicableTo((org.la4j.Vector) denseVector12, (org.la4j.Vector) denseVector15);
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct18 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix23 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator24 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray25 = cCSMatrix23.foldRows(vectorAccumulator24);
        org.la4j.matrix.DenseMatrix denseMatrix26 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray25);
        org.la4j.vector.dense.BasicVector basicVector27 = new org.la4j.vector.dense.BasicVector(doubleArray25);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix32 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator33 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray34 = cCSMatrix32.foldRows(vectorAccumulator33);
        org.la4j.matrix.DenseMatrix denseMatrix35 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray34);
        org.la4j.vector.dense.BasicVector basicVector36 = new org.la4j.vector.dense.BasicVector(doubleArray34);
        ooPlaceOuterProduct18.ensureApplicableTo((org.la4j.Vector) basicVector27, (org.la4j.Vector) basicVector36);
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct38 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random40 = null;
        org.la4j.vector.DenseVector denseVector41 = org.la4j.vector.DenseVector.random(0, random40);
        java.util.Random random43 = null;
        org.la4j.vector.DenseVector denseVector44 = org.la4j.vector.DenseVector.random(0, random43);
        org.la4j.Matrix matrix45 = ooPlaceOuterProduct38.apply(denseVector41, denseVector44);
        org.la4j.vector.sparse.CompressedVector compressedVector47 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix48 = ooPlaceOuterProduct18.apply(denseVector41, (org.la4j.vector.SparseVector) compressedVector47);
        java.text.NumberFormat numberFormat49 = null;
        java.lang.String str51 = denseVector41.mkString(numberFormat49, "hi!");
        org.la4j.vector.sparse.CompressedVector compressedVector53 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        double double54 = compressedVector53.euclideanNorm();
        org.la4j.Matrix matrix55 = ooPlaceOuterProduct9.apply(denseVector41, (org.la4j.vector.SparseVector) compressedVector53);
        org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication56 = new org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication();
        org.la4j.vector.sparse.CompressedVector compressedVector58 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector58.swapElements(10, (int) (byte) 100);
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct62 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix66 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix67 = rowMajorSparseMatrix66.removeLastRow();
        double double71 = rowMajorSparseMatrix66.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int72 = rowMajorSparseMatrix66.cardinality();
        org.la4j.Vector vector74 = rowMajorSparseMatrix66.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix77 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix78 = ooPlaceMatrixHadamardProduct62.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix66, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix77);
        org.la4j.Vector vector79 = ooPlaceVectorByMatrixMultiplication56.apply((org.la4j.vector.SparseVector) compressedVector58, columnMajorSparseMatrix77);
        boolean boolean81 = compressedVector58.isZeroAt((int) ' ');
        boolean boolean83 = compressedVector58.isZeroAt((int) '4');
        org.la4j.vector.VectorFactory<org.la4j.vector.dense.BasicVector> basicVectorVectorFactory84 = org.la4j.Vectors.DENSE;
        org.la4j.vector.dense.BasicVector basicVector85 = compressedVector58.to(basicVectorVectorFactory84);
        org.la4j.vector.sparse.CompressedVector compressedVector87 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        java.text.NumberFormat numberFormat88 = null;
        java.lang.String str89 = compressedVector87.toMatrixMarket(numberFormat88);
        org.la4j.Vector vector91 = compressedVector87.add((double) 52);
        compressedVector87.swapElements((int) (short) 1, (int) (byte) 1);
        org.la4j.Matrix matrix95 = ooPlaceOuterProduct9.apply((org.la4j.vector.DenseVector) basicVector85, (org.la4j.vector.SparseVector) compressedVector87);
        byte[] byteArray96 = compressedVector87.toBinary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on compressedVector47 and basicVector85", compressedVector47.equals(basicVector85) ? compressedVector47.hashCode() == basicVector85.hashCode() : true);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct0 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double8 = rowMajorSparseMatrix4.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix9 = rowMajorSparseMatrix4.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct10 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean11 = sparseMatrix9.equals((java.lang.Object) ooPlaceOuterProduct10);
        org.la4j.vector.DenseVector denseVector13 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random15 = null;
        org.la4j.vector.DenseVector denseVector16 = org.la4j.vector.DenseVector.random(0, random15);
        java.lang.String str17 = denseVector16.toString();
        ooPlaceOuterProduct10.ensureApplicableTo((org.la4j.Vector) denseVector13, (org.la4j.Vector) denseVector16);
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation19 = ooPlaceInnerProduct0.partiallyApply(denseVector16);
        org.la4j.vector.dense.BasicVector basicVector21 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector22 = basicVector21.copy();
        org.la4j.Matrix matrix23 = basicVector21.toDiagonalMatrix();
        org.la4j.Vector vector25 = basicVector21.copyOfLength(10);
        double double26 = basicVector21.product();
        org.la4j.Vector vector28 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str29 = vector28.toCSV();
        org.la4j.vector.SparseVector sparseVector30 = vector28.toSparseVector();
        boolean boolean32 = sparseVector30.isZeroAt(52);
        org.la4j.iterator.VectorIterator vectorIterator33 = sparseVector30.iterator();
        org.la4j.iterator.VectorIterator vectorIterator34 = sparseVector30.nonZeroIterator();
        double double35 = sparseVector30.manhattanNorm();
        double double36 = sparseVector30.density();
        byte[] byteArray37 = sparseVector30.toBinary();
        java.lang.Double double38 = ooPlaceInnerProduct0.applySymmetric((org.la4j.vector.DenseVector) basicVector21, sparseVector30);
        double double39 = basicVector21.max();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on denseVector13 and sparseVector30", denseVector13.equals(sparseVector30) ? denseVector13.hashCode() == sparseVector30.hashCode() : true);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
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
        byte[] byteArray31 = compressedVector28.toBinary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector1 and sparseVector3", vector1.equals(sparseVector3) ? vector1.hashCode() == sparseVector3.hashCode() : true);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        double[] doubleArray6 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray13 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray20 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray27 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray34 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray35 = new double[][] { doubleArray6, doubleArray13, doubleArray20, doubleArray27, doubleArray34 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix36 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray35);
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix37 = new org.la4j.matrix.dense.Basic2DMatrix(doubleArray35);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix38 = org.la4j.matrix.RowMajorSparseMatrix.from2DArray(doubleArray35);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix39 = org.la4j.matrix.sparse.CCSMatrix.from2DArray(doubleArray35);
        org.la4j.matrix.DenseMatrix denseMatrix40 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on basic2DMatrix36 and cCSMatrix39", basic2DMatrix36.equals(cCSMatrix39) ? basic2DMatrix36.hashCode() == cCSMatrix39.hashCode() : true);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.Vector vector5 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str6 = vector5.toCSV();
        org.la4j.vector.SparseVector sparseVector7 = vector5.toSparseVector();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix10 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator11 = columnMajorSparseMatrix10.nonZeroIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix16 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double20 = rowMajorSparseMatrix16.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix21 = rowMajorSparseMatrix16.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate22 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean23 = sparseMatrix21.is(advancedMatrixPredicate22);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator25 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double26 = sparseMatrix21.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator25);
        org.la4j.vector.functor.VectorProcedure vectorProcedure27 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator25);
        columnMajorSparseMatrix10.eachNonZeroInRow((-1), vectorProcedure27);
        sparseVector7.eachNonZero(vectorProcedure27);
        org.la4j.Vector vector30 = ooPlaceMatrixByVectorMultiplication0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, sparseVector7);
        double double31 = vector30.manhattanNorm();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector5 and sparseVector7", vector5.equals(sparseVector7) ? vector5.hashCode() == sparseVector7.hashCode() : true);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        double[] doubleArray6 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray13 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray20 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray27 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray34 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray35 = new double[][] { doubleArray6, doubleArray13, doubleArray20, doubleArray27, doubleArray34 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix36 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray35);
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix37 = new org.la4j.matrix.dense.Basic2DMatrix(doubleArray35);
        org.la4j.matrix.SparseMatrix sparseMatrix38 = org.la4j.matrix.SparseMatrix.from2DArray(doubleArray35);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix39 = org.la4j.matrix.dense.Basic1DMatrix.from2DArray(doubleArray35);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix40 = org.la4j.matrix.sparse.CCSMatrix.from2DArray(doubleArray35);
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix41 = new org.la4j.matrix.dense.Basic2DMatrix(doubleArray35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on basic2DMatrix36 and cCSMatrix40", basic2DMatrix36.equals(cCSMatrix40) ? basic2DMatrix36.hashCode() == cCSMatrix40.hashCode() : true);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        byte[] byteArray4 = cRSMatrix3.toBinary();
        org.la4j.vector.functor.VectorFunction vectorFunction6 = org.la4j.Vectors.DEC_FUNCTION;
        cRSMatrix3.updateColumn(0, vectorFunction6);
        org.la4j.Matrix matrix9 = cRSMatrix3.removeRow(0);
        org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication10 = new org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication();
        org.la4j.vector.sparse.CompressedVector compressedVector12 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector12.swapElements(10, (int) (byte) 100);
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct16 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix20 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix21 = rowMajorSparseMatrix20.removeLastRow();
        double double25 = rowMajorSparseMatrix20.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int26 = rowMajorSparseMatrix20.cardinality();
        org.la4j.Vector vector28 = rowMajorSparseMatrix20.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix31 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix32 = ooPlaceMatrixHadamardProduct16.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix20, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix31);
        org.la4j.Vector vector33 = ooPlaceVectorByMatrixMultiplication10.apply((org.la4j.vector.SparseVector) compressedVector12, columnMajorSparseMatrix31);
        boolean boolean35 = compressedVector12.isZeroAt((int) ' ');
        boolean boolean37 = compressedVector12.isZeroAt((int) '4');
        org.la4j.vector.VectorFactory<org.la4j.vector.dense.BasicVector> basicVectorVectorFactory38 = org.la4j.Vectors.DENSE;
        org.la4j.vector.dense.BasicVector basicVector39 = compressedVector12.to(basicVectorVectorFactory38);
        java.util.Spliterator<java.lang.Double> doubleSpliterator40 = compressedVector12.spliterator();
        org.la4j.Vector vector41 = ooPlaceMatrixByVectorMultiplication0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, (org.la4j.vector.SparseVector) compressedVector12);
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction42 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix45 = org.la4j.matrix.dense.Basic2DMatrix.unit((int) (byte) 1, (int) '4');
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction46 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix49 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean50 = cCSMatrix49.isRowMajor();
        org.la4j.Matrix matrix53 = cCSMatrix49.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator54 = cCSMatrix49.nonZeroColumnMajorIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix58 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix60 = rowMajorSparseMatrix58.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix64 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double68 = rowMajorSparseMatrix64.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix69 = rowMajorSparseMatrix64.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct70 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean71 = sparseMatrix69.equals((java.lang.Object) ooPlaceOuterProduct70);
        org.la4j.Matrix matrix72 = rowMajorSparseMatrix58.hadamardProduct((org.la4j.Matrix) sparseMatrix69);
        org.la4j.Matrix matrix73 = ooPlaceMatricesSubtraction46.applySimple((org.la4j.matrix.SparseMatrix) cCSMatrix49, (org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix58);
        org.la4j.Matrix matrix74 = ooPlaceMatricesSubtraction42.apply((org.la4j.matrix.DenseMatrix) basic2DMatrix45, rowMajorSparseMatrix58);
        org.la4j.decomposition.SingularValueDecompositor singularValueDecompositor75 = new org.la4j.decomposition.SingularValueDecompositor((org.la4j.Matrix) rowMajorSparseMatrix58);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix78 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator79 = cRSMatrix78.nonZeroIterator();
        org.la4j.Vector vector81 = cRSMatrix78.getColumn(100);
        boolean boolean84 = cRSMatrix78.nonZeroAt(1, (int) (short) 0);
        org.la4j.decomposition.RawLUDecompositor rawLUDecompositor85 = new org.la4j.decomposition.RawLUDecompositor((org.la4j.Matrix) cRSMatrix78);
        double double86 = cRSMatrix78.infinityNorm();
        boolean boolean87 = singularValueDecompositor75.applicableTo((org.la4j.Matrix) cRSMatrix78);
        org.la4j.operation.VectorOperation<org.la4j.Vector> vectorVectorOperation88 = ooPlaceMatrixByVectorMultiplication0.partiallyApply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix78);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on compressedVector12 and basicVector39", compressedVector12.equals(basicVector39) ? compressedVector12.hashCode() == basicVector39.hashCode() : true);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
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
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix33 = new org.la4j.matrix.sparse.CCSMatrix((int) (byte) 1, (int) (byte) 0);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix37 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix38 = rowMajorSparseMatrix37.removeLastRow();
        org.la4j.matrix.functor.MatrixFunction matrixFunction40 = null;
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator41 = org.la4j.Matrices.asSumFunctionAccumulator((double) (-1), matrixFunction40);
        double double42 = matrix38.fold(matrixAccumulator41);
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure43 = org.la4j.Matrices.asAccumulatorProcedure(matrixAccumulator41);
        cCSMatrix33.eachNonZero(matrixProcedure43);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix48 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator49 = columnMajorSparseMatrix48.nonZeroIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix54 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double58 = rowMajorSparseMatrix54.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix59 = rowMajorSparseMatrix54.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate60 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean61 = sparseMatrix59.is(advancedMatrixPredicate60);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator63 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double64 = sparseMatrix59.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator63);
        org.la4j.vector.functor.VectorProcedure vectorProcedure65 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator63);
        columnMajorSparseMatrix48.eachNonZeroInRow((-1), vectorProcedure65);
        vectorProcedure65.apply(10, (double) (byte) 100);
        cCSMatrix33.eachNonZeroInRow((int) '4', vectorProcedure65);
        compressedVector28.each(vectorProcedure65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector1 and sparseVector3", vector1.equals(sparseVector3) ? vector1.hashCode() == sparseVector3.hashCode() : true);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix8 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator9 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray10 = cCSMatrix8.foldRows(vectorAccumulator9);
        org.la4j.matrix.DenseMatrix denseMatrix11 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray10);
        org.la4j.vector.dense.BasicVector basicVector12 = new org.la4j.vector.dense.BasicVector(doubleArray10);
        org.la4j.matrix.SparseMatrix sparseMatrix13 = org.la4j.matrix.SparseMatrix.from1DArray((int) (byte) 0, (int) '4', doubleArray10);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix14 = org.la4j.matrix.RowMajorSparseMatrix.from1DArray(0, 52, doubleArray10);
        org.la4j.Vector vector17 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str18 = vector17.toCSV();
        org.la4j.vector.SparseVector sparseVector19 = vector17.toSparseVector();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix22 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator23 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray24 = cCSMatrix22.foldRows(vectorAccumulator23);
        double double25 = sparseVector19.fold(vectorAccumulator23);
        double double26 = rowMajorSparseMatrix14.foldNonZeroInColumn((int) (short) -1, vectorAccumulator23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector17 and sparseVector19", vector17.equals(sparseVector19) ? vector17.hashCode() == sparseVector19.hashCode() : true);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
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
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction52 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix53 = new org.la4j.matrix.dense.Basic1DMatrix();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix56 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double57 = columnMajorSparseMatrix56.determinant();
        boolean boolean58 = columnMajorSparseMatrix56.isRowMajor();
        org.la4j.Matrix matrix59 = ooPlaceMatricesSubtraction52.apply((org.la4j.matrix.DenseMatrix) basic1DMatrix53, columnMajorSparseMatrix56);
        org.la4j.Vector vector61 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str62 = vector61.toCSV();
        org.la4j.vector.SparseVector sparseVector63 = vector61.toSparseVector();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix66 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator67 = columnMajorSparseMatrix66.nonZeroIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix72 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double76 = rowMajorSparseMatrix72.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix77 = rowMajorSparseMatrix72.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate78 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean79 = sparseMatrix77.is(advancedMatrixPredicate78);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator81 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double82 = sparseMatrix77.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator81);
        org.la4j.vector.functor.VectorProcedure vectorProcedure83 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator81);
        columnMajorSparseMatrix66.eachNonZeroInRow((-1), vectorProcedure83);
        sparseVector63.each(vectorProcedure83);
        java.lang.Object obj86 = new java.lang.Object();
        boolean boolean87 = sparseVector63.equals(obj86);
        boolean boolean89 = sparseVector63.nonZeroAt((int) (short) -1);
        org.la4j.Vector vector90 = ooPlaceMatrixByVectorMultiplication0.apply((org.la4j.matrix.DenseMatrix) basic1DMatrix53, sparseVector63);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix92 = org.la4j.matrix.sparse.CRSMatrix.fromCSV("");
        byte[] byteArray93 = cRSMatrix92.toBinary();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix94 = org.la4j.matrix.sparse.CRSMatrix.fromBinary(byteArray93);
        org.la4j.operation.VectorOperation<org.la4j.Vector> vectorVectorOperation95 = ooPlaceMatrixByVectorMultiplication0.partiallyApply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix94);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector61 and sparseVector63", vector61.equals(sparseVector63) ? vector61.hashCode() == sparseVector63.hashCode() : true);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        org.la4j.operation.ooplace.OoPlaceVectorsAddition ooPlaceVectorsAddition0 = new org.la4j.operation.ooplace.OoPlaceVectorsAddition();
        org.la4j.Vector vector2 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str3 = vector2.toCSV();
        org.la4j.vector.SparseVector sparseVector4 = vector2.toSparseVector();
        boolean boolean6 = sparseVector4.isZeroAt(52);
        org.la4j.iterator.VectorIterator vectorIterator7 = sparseVector4.iterator();
        org.la4j.iterator.VectorIterator vectorIterator8 = sparseVector4.nonZeroIterator();
        double double9 = sparseVector4.manhattanNorm();
        double double10 = sparseVector4.density();
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct11 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix15 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double19 = rowMajorSparseMatrix15.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix20 = rowMajorSparseMatrix15.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct21 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean22 = sparseMatrix20.equals((java.lang.Object) ooPlaceOuterProduct21);
        org.la4j.vector.DenseVector denseVector24 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random26 = null;
        org.la4j.vector.DenseVector denseVector27 = org.la4j.vector.DenseVector.random(0, random26);
        java.lang.String str28 = denseVector27.toString();
        ooPlaceOuterProduct21.ensureApplicableTo((org.la4j.Vector) denseVector24, (org.la4j.Vector) denseVector27);
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation30 = ooPlaceInnerProduct11.partiallyApply(denseVector27);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix35 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator36 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray37 = cCSMatrix35.foldRows(vectorAccumulator36);
        org.la4j.matrix.DenseMatrix denseMatrix38 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray37);
        org.la4j.vector.dense.BasicVector basicVector39 = new org.la4j.vector.dense.BasicVector(doubleArray37);
        org.la4j.vector.sparse.CompressedVector compressedVector41 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector41.swapElements(10, (int) (byte) 100);
        java.lang.Double double45 = ooPlaceInnerProduct11.apply((org.la4j.vector.DenseVector) basicVector39, (org.la4j.vector.SparseVector) compressedVector41);
        org.la4j.vector.dense.BasicVector basicVector47 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector48 = basicVector47.copy();
        org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication49 = new org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication();
        org.la4j.vector.sparse.CompressedVector compressedVector51 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector51.swapElements(10, (int) (byte) 100);
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct55 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix59 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix60 = rowMajorSparseMatrix59.removeLastRow();
        double double64 = rowMajorSparseMatrix59.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int65 = rowMajorSparseMatrix59.cardinality();
        org.la4j.Vector vector67 = rowMajorSparseMatrix59.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix70 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix71 = ooPlaceMatrixHadamardProduct55.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix59, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix70);
        org.la4j.Vector vector72 = ooPlaceVectorByMatrixMultiplication49.apply((org.la4j.vector.SparseVector) compressedVector51, columnMajorSparseMatrix70);
        org.la4j.vector.SparseVector sparseVector74 = org.la4j.vector.SparseVector.zero(0);
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction75 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix79 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix80 = rowMajorSparseMatrix79.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix82 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix83 = ooPlaceMatricesSubtraction75.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix79, denseMatrix82);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix86 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double87 = columnMajorSparseMatrix86.determinant();
        org.la4j.matrix.DenseMatrix denseMatrix90 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        double double91 = denseMatrix90.min();
        double double92 = denseMatrix90.sum();
        org.la4j.Matrix matrix93 = ooPlaceMatricesSubtraction75.apply(columnMajorSparseMatrix86, denseMatrix90);
        org.la4j.Vector vector94 = ooPlaceVectorByMatrixMultiplication49.apply(sparseVector74, columnMajorSparseMatrix86);
        java.lang.Double double95 = ooPlaceInnerProduct11.applySymmetric((org.la4j.vector.DenseVector) basicVector47, sparseVector74);
        org.la4j.Vector vector96 = ooPlaceVectorsAddition0.apply(sparseVector4, sparseVector74);
        org.la4j.Vector vector98 = sparseVector74.subtract((-0.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector2 and sparseVector4", vector2.equals(sparseVector4) ? vector2.hashCode() == sparseVector4.hashCode() : true);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
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
        int int21 = squareRootSolver14.equations();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector16 and sparseVector18", vector16.equals(sparseVector18) ? vector16.hashCode() == sparseVector18.hashCode() : true);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct0 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.Vector vector2 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str3 = vector2.toCSV();
        org.la4j.vector.SparseVector sparseVector4 = vector2.toSparseVector();
        boolean boolean6 = sparseVector4.isZeroAt(52);
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation7 = ooPlaceInnerProduct0.partiallyApply(sparseVector4);
        org.la4j.operation.ooplace.OoPlaceVectorsSubtraction ooPlaceVectorsSubtraction8 = new org.la4j.operation.ooplace.OoPlaceVectorsSubtraction();
        org.la4j.Matrix matrix15 = org.la4j.Matrix.diagonal((int) (short) 10, (double) 0);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator17 = org.la4j.Vectors.asSumAccumulator(100.0d);
        double[] doubleArray18 = matrix15.foldColumns(vectorAccumulator17);
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix19 = org.la4j.matrix.dense.Basic2DMatrix.from1DArray((int) 'a', (int) (byte) 0, doubleArray18);
        org.la4j.vector.DenseVector denseVector20 = org.la4j.vector.DenseVector.fromArray(doubleArray18);
        org.la4j.matrix.SparseMatrix sparseMatrix21 = org.la4j.matrix.SparseMatrix.from1DArray((int) (byte) 1, (int) (byte) 0, doubleArray18);
        org.la4j.vector.DenseVector denseVector22 = org.la4j.vector.DenseVector.fromArray(doubleArray18);
        org.la4j.vector.SparseVector sparseVector24 = org.la4j.vector.SparseVector.zero(0);
        org.la4j.Vector vector25 = ooPlaceVectorsSubtraction8.apply(denseVector22, sparseVector24);
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct26 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix31 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator32 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray33 = cCSMatrix31.foldRows(vectorAccumulator32);
        org.la4j.matrix.DenseMatrix denseMatrix34 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray33);
        org.la4j.vector.dense.BasicVector basicVector35 = new org.la4j.vector.dense.BasicVector(doubleArray33);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix40 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator41 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray42 = cCSMatrix40.foldRows(vectorAccumulator41);
        org.la4j.matrix.DenseMatrix denseMatrix43 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray42);
        org.la4j.vector.dense.BasicVector basicVector44 = new org.la4j.vector.dense.BasicVector(doubleArray42);
        ooPlaceOuterProduct26.ensureApplicableTo((org.la4j.Vector) basicVector35, (org.la4j.Vector) basicVector44);
        org.la4j.vector.sparse.CompressedVector compressedVector47 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector47.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector52 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix53 = ooPlaceOuterProduct26.apply((org.la4j.vector.SparseVector) compressedVector47, (org.la4j.vector.SparseVector) compressedVector52);
        boolean boolean55 = compressedVector52.isZeroAt((int) (short) 1);
        org.la4j.Vector vector56 = compressedVector52.blank();
        java.lang.Double double57 = ooPlaceInnerProduct0.apply(denseVector22, (org.la4j.vector.SparseVector) compressedVector52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector2 and sparseVector4", vector2.equals(sparseVector4) ? vector2.hashCode() == sparseVector4.hashCode() : true);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        org.la4j.operation.ooplace.OoPlaceVectorsSubtraction ooPlaceVectorsSubtraction0 = new org.la4j.operation.ooplace.OoPlaceVectorsSubtraction();
        org.la4j.Vector vector2 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str3 = vector2.toCSV();
        org.la4j.vector.SparseVector sparseVector4 = vector2.toSparseVector();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct5 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix10 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator11 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray12 = cCSMatrix10.foldRows(vectorAccumulator11);
        org.la4j.matrix.DenseMatrix denseMatrix13 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray12);
        org.la4j.vector.dense.BasicVector basicVector14 = new org.la4j.vector.dense.BasicVector(doubleArray12);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix19 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator20 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray21 = cCSMatrix19.foldRows(vectorAccumulator20);
        org.la4j.matrix.DenseMatrix denseMatrix22 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray21);
        org.la4j.vector.dense.BasicVector basicVector23 = new org.la4j.vector.dense.BasicVector(doubleArray21);
        ooPlaceOuterProduct5.ensureApplicableTo((org.la4j.Vector) basicVector14, (org.la4j.Vector) basicVector23);
        org.la4j.vector.sparse.CompressedVector compressedVector26 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector26.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector31 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix32 = ooPlaceOuterProduct5.apply((org.la4j.vector.SparseVector) compressedVector26, (org.la4j.vector.SparseVector) compressedVector31);
        org.la4j.Vector vector33 = ooPlaceVectorsSubtraction0.apply(sparseVector4, (org.la4j.vector.SparseVector) compressedVector26);
        org.la4j.vector.SparseVector sparseVector36 = org.la4j.vector.SparseVector.zero((int) (short) 0, (int) (byte) 1);
        org.la4j.vector.sparse.CompressedVector compressedVector37 = new org.la4j.vector.sparse.CompressedVector();
        org.la4j.Vector vector38 = ooPlaceVectorsSubtraction0.apply(sparseVector36, (org.la4j.vector.SparseVector) compressedVector37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector2 and sparseVector4", vector2.equals(sparseVector4) ? vector2.hashCode() == sparseVector4.hashCode() : true);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
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
        compressedVector28.setAll((double) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector1 and sparseVector3", vector1.equals(sparseVector3) ? vector1.hashCode() == sparseVector3.hashCode() : true);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        org.la4j.operation.ooplace.OoPlaceVectorHadamardProduct ooPlaceVectorHadamardProduct0 = new org.la4j.operation.ooplace.OoPlaceVectorHadamardProduct();
        java.util.Random random2 = null;
        org.la4j.vector.DenseVector denseVector3 = org.la4j.vector.DenseVector.random(0, random2);
        org.la4j.vector.sparse.CompressedVector compressedVector5 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        java.text.NumberFormat numberFormat6 = null;
        java.lang.String str7 = compressedVector5.toMatrixMarket(numberFormat6);
        org.la4j.Vector vector9 = compressedVector5.add((double) 52);
        org.la4j.Vector vector11 = compressedVector5.sliceRight((int) (byte) 10);
        org.la4j.Vector vector12 = ooPlaceVectorHadamardProduct0.apply(denseVector3, (org.la4j.vector.SparseVector) compressedVector5);
        org.la4j.vector.VectorFactory<org.la4j.vector.dense.BasicVector> basicVectorVectorFactory13 = org.la4j.Vectors.DENSE;
        org.la4j.vector.dense.BasicVector basicVector14 = compressedVector5.to(basicVectorVectorFactory13);
        org.la4j.vector.dense.BasicVector basicVector16 = basicVectorVectorFactory13.apply((int) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on compressedVector5 and basicVector14", compressedVector5.equals(basicVector14) ? compressedVector5.hashCode() == basicVector14.hashCode() : true);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        org.la4j.operation.ooplace.OoPlaceVectorsSubtraction ooPlaceVectorsSubtraction0 = new org.la4j.operation.ooplace.OoPlaceVectorsSubtraction();
        org.la4j.Vector vector2 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str3 = vector2.toCSV();
        org.la4j.vector.SparseVector sparseVector4 = vector2.toSparseVector();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct5 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix10 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator11 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray12 = cCSMatrix10.foldRows(vectorAccumulator11);
        org.la4j.matrix.DenseMatrix denseMatrix13 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray12);
        org.la4j.vector.dense.BasicVector basicVector14 = new org.la4j.vector.dense.BasicVector(doubleArray12);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix19 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator20 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray21 = cCSMatrix19.foldRows(vectorAccumulator20);
        org.la4j.matrix.DenseMatrix denseMatrix22 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray21);
        org.la4j.vector.dense.BasicVector basicVector23 = new org.la4j.vector.dense.BasicVector(doubleArray21);
        ooPlaceOuterProduct5.ensureApplicableTo((org.la4j.Vector) basicVector14, (org.la4j.Vector) basicVector23);
        org.la4j.vector.sparse.CompressedVector compressedVector26 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector26.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector31 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix32 = ooPlaceOuterProduct5.apply((org.la4j.vector.SparseVector) compressedVector26, (org.la4j.vector.SparseVector) compressedVector31);
        org.la4j.Vector vector33 = ooPlaceVectorsSubtraction0.apply(sparseVector4, (org.la4j.vector.SparseVector) compressedVector26);
        org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication34 = new org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication();
        org.la4j.vector.sparse.CompressedVector compressedVector36 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector36.swapElements(10, (int) (byte) 100);
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct40 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix44 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix45 = rowMajorSparseMatrix44.removeLastRow();
        double double49 = rowMajorSparseMatrix44.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int50 = rowMajorSparseMatrix44.cardinality();
        org.la4j.Vector vector52 = rowMajorSparseMatrix44.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix55 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix56 = ooPlaceMatrixHadamardProduct40.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix44, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix55);
        org.la4j.Vector vector57 = ooPlaceVectorByMatrixMultiplication34.apply((org.la4j.vector.SparseVector) compressedVector36, columnMajorSparseMatrix55);
        org.la4j.vector.dense.BasicVector basicVector59 = new org.la4j.vector.dense.BasicVector((int) (byte) 0);
        org.la4j.Matrix matrix60 = compressedVector36.outerProduct((org.la4j.Vector) basicVector59);
        org.la4j.vector.VectorFactory<org.la4j.vector.dense.BasicVector> basicVectorVectorFactory61 = org.la4j.Vectors.DENSE;
        java.lang.Class<org.la4j.vector.dense.BasicVector> basicVectorClass62 = basicVectorVectorFactory61.outputClass;
        org.la4j.vector.dense.BasicVector basicVector63 = basicVector59.to(basicVectorVectorFactory61);
        org.la4j.vector.sparse.CompressedVector compressedVector65 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        double double66 = compressedVector65.euclideanNorm();
        org.la4j.Vector vector67 = ooPlaceVectorsSubtraction0.apply((org.la4j.vector.DenseVector) basicVector59, (org.la4j.vector.SparseVector) compressedVector65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector2 and sparseVector4", vector2.equals(sparseVector4) ? vector2.hashCode() == sparseVector4.hashCode() : true);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random2 = null;
        org.la4j.vector.DenseVector denseVector3 = org.la4j.vector.DenseVector.random(0, random2);
        java.util.Random random5 = null;
        org.la4j.vector.DenseVector denseVector6 = org.la4j.vector.DenseVector.random(0, random5);
        org.la4j.Matrix matrix7 = ooPlaceOuterProduct0.apply(denseVector3, denseVector6);
        org.la4j.Vector vector9 = denseVector3.copyOfLength((int) 'a');
        org.la4j.Matrix matrix10 = vector9.toDiagonalMatrix();
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct11 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.Vector vector13 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str14 = vector13.toCSV();
        org.la4j.vector.SparseVector sparseVector15 = vector13.toSparseVector();
        boolean boolean17 = sparseVector15.isZeroAt(52);
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation18 = ooPlaceInnerProduct11.partiallyApply(sparseVector15);
        boolean boolean20 = vector9.equals((org.la4j.Vector) sparseVector15, (double) 100.0f);
        org.la4j.vector.sparse.CompressedVector compressedVector22 = new org.la4j.vector.sparse.CompressedVector((int) (byte) 10);
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
        org.la4j.vector.sparse.CompressedVector compressedVector44 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector44.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector49 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix50 = ooPlaceOuterProduct23.apply((org.la4j.vector.SparseVector) compressedVector44, (org.la4j.vector.SparseVector) compressedVector49);
        org.la4j.vector.functor.VectorFunction vectorFunction52 = org.la4j.Vectors.INC_FUNCTION;
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator53 = org.la4j.Vectors.asProductFunctionAccumulator((double) (byte) 100, vectorFunction52);
        double double54 = compressedVector44.fold(vectorAccumulator53);
        org.la4j.vector.functor.VectorProcedure vectorProcedure55 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator53);
        compressedVector22.eachNonZero(vectorProcedure55);
        vector9.each(vectorProcedure55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector13 and sparseVector15", vector13.equals(sparseVector15) ? vector13.hashCode() == sparseVector15.hashCode() : true);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        org.la4j.operation.ooplace.OoPlaceVectorHadamardProduct ooPlaceVectorHadamardProduct0 = new org.la4j.operation.ooplace.OoPlaceVectorHadamardProduct();
        java.util.Random random2 = null;
        org.la4j.vector.DenseVector denseVector3 = org.la4j.vector.DenseVector.random(0, random2);
        org.la4j.vector.sparse.CompressedVector compressedVector5 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        java.text.NumberFormat numberFormat6 = null;
        java.lang.String str7 = compressedVector5.toMatrixMarket(numberFormat6);
        org.la4j.Vector vector9 = compressedVector5.add((double) 52);
        org.la4j.Vector vector11 = compressedVector5.sliceRight((int) (byte) 10);
        org.la4j.Vector vector12 = ooPlaceVectorHadamardProduct0.apply(denseVector3, (org.la4j.vector.SparseVector) compressedVector5);
        org.la4j.vector.VectorFactory<org.la4j.vector.dense.BasicVector> basicVectorVectorFactory13 = org.la4j.Vectors.DENSE;
        org.la4j.vector.dense.BasicVector basicVector14 = compressedVector5.to(basicVectorVectorFactory13);
        java.lang.Class<org.la4j.vector.dense.BasicVector> basicVectorClass15 = basicVectorVectorFactory13.outputClass;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on compressedVector5 and basicVector14", compressedVector5.equals(basicVector14) ? compressedVector5.hashCode() == basicVector14.hashCode() : true);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test82");
        org.la4j.vector.sparse.CompressedVector compressedVector1 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        double double2 = compressedVector1.euclideanNorm();
        org.la4j.vector.VectorFactory<org.la4j.vector.dense.BasicVector> basicVectorVectorFactory3 = org.la4j.Vectors.DENSE;
        java.lang.Class<org.la4j.vector.dense.BasicVector> basicVectorClass4 = basicVectorVectorFactory3.outputClass;
        org.la4j.vector.dense.BasicVector basicVector5 = compressedVector1.to(basicVectorVectorFactory3);
        org.la4j.vector.dense.BasicVector basicVector7 = basicVectorVectorFactory3.apply(100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on compressedVector1 and basicVector5", compressedVector1.equals(basicVector5) ? compressedVector1.hashCode() == basicVector5.hashCode() : true);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test83");
        org.la4j.operation.ooplace.OoPlaceVectorHadamardProduct ooPlaceVectorHadamardProduct0 = new org.la4j.operation.ooplace.OoPlaceVectorHadamardProduct();
        org.la4j.vector.SparseVector sparseVector3 = org.la4j.vector.SparseVector.zero(0, 52);
        org.la4j.Matrix matrix4 = sparseVector3.toColumnMatrix();
        org.la4j.Vector vector6 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str7 = vector6.toCSV();
        org.la4j.vector.SparseVector sparseVector8 = vector6.toSparseVector();
        org.la4j.Vector vector9 = ooPlaceVectorHadamardProduct0.apply(sparseVector3, sparseVector8);
        org.la4j.vector.sparse.CompressedVector compressedVector11 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        java.text.NumberFormat numberFormat12 = null;
        java.lang.String str13 = compressedVector11.toMatrixMarket(numberFormat12);
        java.text.NumberFormat numberFormat14 = null;
        java.lang.String str15 = compressedVector11.toMatrixMarket(numberFormat14);
        org.la4j.Vector vector17 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str18 = vector17.toCSV();
        org.la4j.vector.SparseVector sparseVector19 = vector17.toSparseVector();
        boolean boolean21 = sparseVector19.isZeroAt(52);
        org.la4j.iterator.VectorIterator vectorIterator22 = sparseVector19.iterator();
        org.la4j.iterator.VectorIterator vectorIterator23 = sparseVector19.nonZeroIterator();
        double double24 = sparseVector19.manhattanNorm();
        double double25 = sparseVector19.density();
        org.la4j.Vector vector26 = ooPlaceVectorHadamardProduct0.apply((org.la4j.vector.SparseVector) compressedVector11, sparseVector19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector6 and sparseVector8", vector6.equals(sparseVector8) ? vector6.hashCode() == sparseVector8.hashCode() : true);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test84");
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
        org.la4j.vector.SparseVector sparseVector25 = org.la4j.vector.SparseVector.zero(0);
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction26 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix30 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix31 = rowMajorSparseMatrix30.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix33 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix34 = ooPlaceMatricesSubtraction26.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix30, denseMatrix33);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix37 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double38 = columnMajorSparseMatrix37.determinant();
        org.la4j.matrix.DenseMatrix denseMatrix41 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        double double42 = denseMatrix41.min();
        double double43 = denseMatrix41.sum();
        org.la4j.Matrix matrix44 = ooPlaceMatricesSubtraction26.apply(columnMajorSparseMatrix37, denseMatrix41);
        org.la4j.Vector vector45 = ooPlaceVectorByMatrixMultiplication0.apply(sparseVector25, columnMajorSparseMatrix37);
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct46 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix50 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double54 = rowMajorSparseMatrix50.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix55 = rowMajorSparseMatrix50.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct56 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean57 = sparseMatrix55.equals((java.lang.Object) ooPlaceOuterProduct56);
        org.la4j.vector.DenseVector denseVector59 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random61 = null;
        org.la4j.vector.DenseVector denseVector62 = org.la4j.vector.DenseVector.random(0, random61);
        java.lang.String str63 = denseVector62.toString();
        ooPlaceOuterProduct56.ensureApplicableTo((org.la4j.Vector) denseVector59, (org.la4j.Vector) denseVector62);
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation65 = ooPlaceInnerProduct46.partiallyApply(denseVector62);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix70 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator71 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray72 = cCSMatrix70.foldRows(vectorAccumulator71);
        org.la4j.matrix.DenseMatrix denseMatrix73 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray72);
        org.la4j.vector.dense.BasicVector basicVector74 = new org.la4j.vector.dense.BasicVector(doubleArray72);
        org.la4j.vector.sparse.CompressedVector compressedVector76 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector76.swapElements(10, (int) (byte) 100);
        java.lang.Double double80 = ooPlaceInnerProduct46.apply((org.la4j.vector.DenseVector) basicVector74, (org.la4j.vector.SparseVector) compressedVector76);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix83 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator84 = cRSMatrix83.nonZeroIterator();
        org.la4j.Vector vector86 = cRSMatrix83.getColumn(100);
        org.la4j.Vector vector87 = ooPlaceVectorByMatrixMultiplication0.apply((org.la4j.vector.SparseVector) compressedVector76, (org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix83);
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct88 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.Vector vector90 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str91 = vector90.toCSV();
        org.la4j.vector.SparseVector sparseVector92 = vector90.toSparseVector();
        boolean boolean94 = sparseVector92.isZeroAt(52);
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation95 = ooPlaceInnerProduct88.partiallyApply(sparseVector92);
        org.la4j.operation.MatrixOperation<org.la4j.Vector> vectorMatrixOperation96 = ooPlaceVectorByMatrixMultiplication0.partiallyApply(sparseVector92);
        org.la4j.vector.DenseVector denseVector98 = org.la4j.vector.DenseVector.fromCSV("1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000, 1,000");
        org.la4j.operation.MatrixOperation<org.la4j.Vector> vectorMatrixOperation99 = ooPlaceVectorByMatrixMultiplication0.partiallyApply(denseVector98);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on denseVector59 and sparseVector92", denseVector59.equals(sparseVector92) ? denseVector59.hashCode() == sparseVector92.hashCode() : true);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test85");
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct0 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.Vector vector2 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str3 = vector2.toCSV();
        org.la4j.vector.SparseVector sparseVector4 = vector2.toSparseVector();
        double double5 = sparseVector4.euclideanNorm();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct6 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix11 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator12 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray13 = cCSMatrix11.foldRows(vectorAccumulator12);
        org.la4j.matrix.DenseMatrix denseMatrix14 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray13);
        org.la4j.vector.dense.BasicVector basicVector15 = new org.la4j.vector.dense.BasicVector(doubleArray13);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix20 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator21 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray22 = cCSMatrix20.foldRows(vectorAccumulator21);
        org.la4j.matrix.DenseMatrix denseMatrix23 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray22);
        org.la4j.vector.dense.BasicVector basicVector24 = new org.la4j.vector.dense.BasicVector(doubleArray22);
        ooPlaceOuterProduct6.ensureApplicableTo((org.la4j.Vector) basicVector15, (org.la4j.Vector) basicVector24);
        org.la4j.vector.sparse.CompressedVector compressedVector27 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector27.swapElements(10, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector32 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix33 = ooPlaceOuterProduct6.apply((org.la4j.vector.SparseVector) compressedVector27, (org.la4j.vector.SparseVector) compressedVector32);
        double double34 = compressedVector32.min();
        java.lang.Double double35 = ooPlaceInnerProduct0.apply(sparseVector4, (org.la4j.vector.SparseVector) compressedVector32);
        org.la4j.Vector vector37 = compressedVector32.blankOfLength((int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector2 and sparseVector4", vector2.equals(sparseVector4) ? vector2.hashCode() == sparseVector4.hashCode() : true);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test86");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double7 = rowMajorSparseMatrix3.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix8 = rowMajorSparseMatrix3.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct9 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean10 = sparseMatrix8.equals((java.lang.Object) ooPlaceOuterProduct9);
        org.la4j.vector.DenseVector denseVector12 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random14 = null;
        org.la4j.vector.DenseVector denseVector15 = org.la4j.vector.DenseVector.random(0, random14);
        java.lang.String str16 = denseVector15.toString();
        ooPlaceOuterProduct9.ensureApplicableTo((org.la4j.Vector) denseVector12, (org.la4j.Vector) denseVector15);
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct18 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix23 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator24 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray25 = cCSMatrix23.foldRows(vectorAccumulator24);
        org.la4j.matrix.DenseMatrix denseMatrix26 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray25);
        org.la4j.vector.dense.BasicVector basicVector27 = new org.la4j.vector.dense.BasicVector(doubleArray25);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix32 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator33 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray34 = cCSMatrix32.foldRows(vectorAccumulator33);
        org.la4j.matrix.DenseMatrix denseMatrix35 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray34);
        org.la4j.vector.dense.BasicVector basicVector36 = new org.la4j.vector.dense.BasicVector(doubleArray34);
        ooPlaceOuterProduct18.ensureApplicableTo((org.la4j.Vector) basicVector27, (org.la4j.Vector) basicVector36);
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct38 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random40 = null;
        org.la4j.vector.DenseVector denseVector41 = org.la4j.vector.DenseVector.random(0, random40);
        java.util.Random random43 = null;
        org.la4j.vector.DenseVector denseVector44 = org.la4j.vector.DenseVector.random(0, random43);
        org.la4j.Matrix matrix45 = ooPlaceOuterProduct38.apply(denseVector41, denseVector44);
        org.la4j.vector.sparse.CompressedVector compressedVector47 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix48 = ooPlaceOuterProduct18.apply(denseVector41, (org.la4j.vector.SparseVector) compressedVector47);
        java.text.NumberFormat numberFormat49 = null;
        java.lang.String str51 = denseVector41.mkString(numberFormat49, "hi!");
        org.la4j.vector.sparse.CompressedVector compressedVector53 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        double double54 = compressedVector53.euclideanNorm();
        org.la4j.Matrix matrix55 = ooPlaceOuterProduct9.apply(denseVector41, (org.la4j.vector.SparseVector) compressedVector53);
        org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication56 = new org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication();
        org.la4j.vector.sparse.CompressedVector compressedVector58 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector58.swapElements(10, (int) (byte) 100);
        org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct62 = new org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix66 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix67 = rowMajorSparseMatrix66.removeLastRow();
        double double71 = rowMajorSparseMatrix66.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int72 = rowMajorSparseMatrix66.cardinality();
        org.la4j.Vector vector74 = rowMajorSparseMatrix66.getRow(0);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix77 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.Matrix matrix78 = ooPlaceMatrixHadamardProduct62.applySymmetric((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix66, (org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix77);
        org.la4j.Vector vector79 = ooPlaceVectorByMatrixMultiplication56.apply((org.la4j.vector.SparseVector) compressedVector58, columnMajorSparseMatrix77);
        boolean boolean81 = compressedVector58.isZeroAt((int) ' ');
        boolean boolean83 = compressedVector58.isZeroAt((int) '4');
        org.la4j.vector.VectorFactory<org.la4j.vector.dense.BasicVector> basicVectorVectorFactory84 = org.la4j.Vectors.DENSE;
        org.la4j.vector.dense.BasicVector basicVector85 = compressedVector58.to(basicVectorVectorFactory84);
        org.la4j.vector.sparse.CompressedVector compressedVector87 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        java.text.NumberFormat numberFormat88 = null;
        java.lang.String str89 = compressedVector87.toMatrixMarket(numberFormat88);
        org.la4j.Vector vector91 = compressedVector87.add((double) 52);
        compressedVector87.swapElements((int) (short) 1, (int) (byte) 1);
        org.la4j.Matrix matrix95 = ooPlaceOuterProduct9.apply((org.la4j.vector.DenseVector) basicVector85, (org.la4j.vector.SparseVector) compressedVector87);
        org.la4j.iterator.VectorIterator vectorIterator96 = compressedVector87.iterator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on compressedVector47 and basicVector85", compressedVector47.equals(basicVector85) ? compressedVector47.hashCode() == basicVector85.hashCode() : true);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test87");
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
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction52 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix53 = new org.la4j.matrix.dense.Basic1DMatrix();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix56 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double57 = columnMajorSparseMatrix56.determinant();
        boolean boolean58 = columnMajorSparseMatrix56.isRowMajor();
        org.la4j.Matrix matrix59 = ooPlaceMatricesSubtraction52.apply((org.la4j.matrix.DenseMatrix) basic1DMatrix53, columnMajorSparseMatrix56);
        org.la4j.Vector vector61 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str62 = vector61.toCSV();
        org.la4j.vector.SparseVector sparseVector63 = vector61.toSparseVector();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix66 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator67 = columnMajorSparseMatrix66.nonZeroIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix72 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double76 = rowMajorSparseMatrix72.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix77 = rowMajorSparseMatrix72.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate78 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean79 = sparseMatrix77.is(advancedMatrixPredicate78);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator81 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double82 = sparseMatrix77.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator81);
        org.la4j.vector.functor.VectorProcedure vectorProcedure83 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator81);
        columnMajorSparseMatrix66.eachNonZeroInRow((-1), vectorProcedure83);
        sparseVector63.each(vectorProcedure83);
        java.lang.Object obj86 = new java.lang.Object();
        boolean boolean87 = sparseVector63.equals(obj86);
        boolean boolean89 = sparseVector63.nonZeroAt((int) (short) -1);
        org.la4j.Vector vector90 = ooPlaceMatrixByVectorMultiplication0.apply((org.la4j.matrix.DenseMatrix) basic1DMatrix53, sparseVector63);
        int int91 = basic1DMatrix53.columns();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector61 and sparseVector63", vector61.equals(sparseVector63) ? vector61.hashCode() == sparseVector63.hashCode() : true);
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test88");
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
        org.la4j.Vector vector22 = sparseVector18.add((double) (-1.0f));
        double double23 = sparseVector18.max();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector5 and vector22", vector5.equals(vector22) ? vector5.hashCode() == vector22.hashCode() : true);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test89");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix6 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator7 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray8 = cCSMatrix6.foldRows(vectorAccumulator7);
        org.la4j.matrix.DenseMatrix denseMatrix9 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray8);
        org.la4j.vector.dense.BasicVector basicVector10 = new org.la4j.vector.dense.BasicVector(doubleArray8);
        double[] doubleArray11 = basicVector10.toArray();
        int[] intArray17 = new int[] { 52, (byte) -1, ' ', (byte) 100, 0 };
        org.la4j.vector.sparse.CompressedVector compressedVector18 = new org.la4j.vector.sparse.CompressedVector((int) (byte) 0, (int) (short) 1, doubleArray11, intArray17);
        org.la4j.vector.sparse.CompressedVector compressedVector19 = org.la4j.vector.sparse.CompressedVector.fromArray(doubleArray11);
        org.la4j.Matrix matrix20 = compressedVector19.toRowMatrix();
        org.la4j.Matrix matrix21 = compressedVector19.toRowMatrix();
        org.la4j.Vector vector23 = compressedVector19.multiply((double) (short) 0);
        byte[] byteArray24 = compressedVector19.toBinary();
        org.la4j.vector.sparse.CompressedVector compressedVector25 = org.la4j.vector.sparse.CompressedVector.fromBinary(byteArray24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on basicVector10 and compressedVector19", basicVector10.equals(compressedVector19) ? basicVector10.hashCode() == compressedVector19.hashCode() : true);
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test90");
        org.la4j.Matrix matrix6 = org.la4j.Matrix.diagonal((int) (short) 10, (double) 0);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator8 = org.la4j.Vectors.asSumAccumulator(100.0d);
        double[] doubleArray9 = matrix6.foldColumns(vectorAccumulator8);
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix10 = org.la4j.matrix.dense.Basic2DMatrix.from1DArray((int) 'a', (int) (byte) 0, doubleArray9);
        org.la4j.vector.DenseVector denseVector11 = org.la4j.vector.DenseVector.fromArray(doubleArray9);
        org.la4j.matrix.SparseMatrix sparseMatrix12 = org.la4j.matrix.SparseMatrix.from1DArray((int) (byte) 1, (int) (byte) 0, doubleArray9);
        org.la4j.vector.sparse.CompressedVector compressedVector13 = org.la4j.vector.sparse.CompressedVector.fromArray(doubleArray9);
        org.la4j.vector.sparse.CompressedVector compressedVector14 = org.la4j.vector.sparse.CompressedVector.fromArray(doubleArray9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on denseVector11 and compressedVector13", denseVector11.equals(compressedVector13) ? denseVector11.hashCode() == compressedVector13.hashCode() : true);
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test91");
        double[] doubleArray6 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray13 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray20 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray27 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray34 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray35 = new double[][] { doubleArray6, doubleArray13, doubleArray20, doubleArray27, doubleArray34 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix36 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray35);
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix37 = new org.la4j.matrix.dense.Basic2DMatrix(doubleArray35);
        org.la4j.matrix.SparseMatrix sparseMatrix38 = org.la4j.matrix.SparseMatrix.from2DArray(doubleArray35);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix39 = org.la4j.matrix.dense.Basic1DMatrix.from2DArray(doubleArray35);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix40 = org.la4j.matrix.sparse.CCSMatrix.from2DArray(doubleArray35);
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix41 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on basic2DMatrix36 and cCSMatrix40", basic2DMatrix36.equals(cCSMatrix40) ? basic2DMatrix36.hashCode() == cCSMatrix40.hashCode() : true);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test92");
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
        org.la4j.vector.SparseVector sparseVector25 = org.la4j.vector.SparseVector.zero(0);
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction26 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix30 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix31 = rowMajorSparseMatrix30.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix33 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix34 = ooPlaceMatricesSubtraction26.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix30, denseMatrix33);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix37 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double38 = columnMajorSparseMatrix37.determinant();
        org.la4j.matrix.DenseMatrix denseMatrix41 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        double double42 = denseMatrix41.min();
        double double43 = denseMatrix41.sum();
        org.la4j.Matrix matrix44 = ooPlaceMatricesSubtraction26.apply(columnMajorSparseMatrix37, denseMatrix41);
        org.la4j.Vector vector45 = ooPlaceVectorByMatrixMultiplication0.apply(sparseVector25, columnMajorSparseMatrix37);
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct46 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix50 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double54 = rowMajorSparseMatrix50.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix55 = rowMajorSparseMatrix50.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct56 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean57 = sparseMatrix55.equals((java.lang.Object) ooPlaceOuterProduct56);
        org.la4j.vector.DenseVector denseVector59 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random61 = null;
        org.la4j.vector.DenseVector denseVector62 = org.la4j.vector.DenseVector.random(0, random61);
        java.lang.String str63 = denseVector62.toString();
        ooPlaceOuterProduct56.ensureApplicableTo((org.la4j.Vector) denseVector59, (org.la4j.Vector) denseVector62);
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation65 = ooPlaceInnerProduct46.partiallyApply(denseVector62);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix70 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator71 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray72 = cCSMatrix70.foldRows(vectorAccumulator71);
        org.la4j.matrix.DenseMatrix denseMatrix73 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray72);
        org.la4j.vector.dense.BasicVector basicVector74 = new org.la4j.vector.dense.BasicVector(doubleArray72);
        org.la4j.vector.sparse.CompressedVector compressedVector76 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector76.swapElements(10, (int) (byte) 100);
        java.lang.Double double80 = ooPlaceInnerProduct46.apply((org.la4j.vector.DenseVector) basicVector74, (org.la4j.vector.SparseVector) compressedVector76);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix83 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator84 = cRSMatrix83.nonZeroIterator();
        org.la4j.Vector vector86 = cRSMatrix83.getColumn(100);
        org.la4j.Vector vector87 = ooPlaceVectorByMatrixMultiplication0.apply((org.la4j.vector.SparseVector) compressedVector76, (org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix83);
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct88 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.Vector vector90 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str91 = vector90.toCSV();
        org.la4j.vector.SparseVector sparseVector92 = vector90.toSparseVector();
        boolean boolean94 = sparseVector92.isZeroAt(52);
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation95 = ooPlaceInnerProduct88.partiallyApply(sparseVector92);
        org.la4j.operation.MatrixOperation<org.la4j.Vector> vectorMatrixOperation96 = ooPlaceVectorByMatrixMultiplication0.partiallyApply(sparseVector92);
        org.la4j.vector.dense.BasicVector basicVector98 = new org.la4j.vector.dense.BasicVector((int) (short) 100);
        org.la4j.operation.MatrixOperation<org.la4j.Vector> vectorMatrixOperation99 = ooPlaceVectorByMatrixMultiplication0.partiallyApply((org.la4j.vector.DenseVector) basicVector98);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on denseVector59 and sparseVector92", denseVector59.equals(sparseVector92) ? denseVector59.hashCode() == sparseVector92.hashCode() : true);
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test93");
        org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.Vector vector5 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str6 = vector5.toCSV();
        org.la4j.vector.SparseVector sparseVector7 = vector5.toSparseVector();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix10 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator11 = columnMajorSparseMatrix10.nonZeroIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix16 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double20 = rowMajorSparseMatrix16.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix21 = rowMajorSparseMatrix16.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate22 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean23 = sparseMatrix21.is(advancedMatrixPredicate22);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator25 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double26 = sparseMatrix21.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator25);
        org.la4j.vector.functor.VectorProcedure vectorProcedure27 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator25);
        columnMajorSparseMatrix10.eachNonZeroInRow((-1), vectorProcedure27);
        sparseVector7.eachNonZero(vectorProcedure27);
        org.la4j.Vector vector30 = ooPlaceMatrixByVectorMultiplication0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, sparseVector7);
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction31 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix35 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix36 = rowMajorSparseMatrix35.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix38 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix39 = ooPlaceMatricesSubtraction31.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix35, denseMatrix38);
        org.la4j.operation.VectorOperation<org.la4j.Vector> vectorVectorOperation40 = ooPlaceMatrixByVectorMultiplication0.partiallyApply(denseMatrix38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector5 and sparseVector7", vector5.equals(sparseVector7) ? vector5.hashCode() == sparseVector7.hashCode() : true);
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test94");
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
        org.la4j.Vector vector83 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str84 = vector83.toCSV();
        org.la4j.vector.SparseVector sparseVector85 = vector83.toSparseVector();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix88 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator89 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray90 = cCSMatrix88.foldRows(vectorAccumulator89);
        double double91 = sparseVector85.fold(vectorAccumulator89);
        boolean boolean93 = sparseVector85.nonZeroAt(0);
        org.la4j.operation.VectorOperation<org.la4j.Matrix> matrixVectorOperation94 = ooPlaceOuterProduct0.partiallyApply(sparseVector85);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector71 and sparseVector73", vector71.equals(sparseVector73) ? vector71.hashCode() == sparseVector73.hashCode() : true);
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test95");
        org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix3 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean4 = cCSMatrix3.isRowMajor();
        org.la4j.Matrix matrix7 = cCSMatrix3.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator8 = cCSMatrix3.nonZeroColumnMajorIterator();
        org.la4j.Vector vector10 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str11 = vector10.toCSV();
        org.la4j.vector.SparseVector sparseVector12 = vector10.toSparseVector();
        boolean boolean14 = sparseVector12.isZeroAt(52);
        org.la4j.iterator.VectorIterator vectorIterator15 = sparseVector12.iterator();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct16 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix21 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator22 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray23 = cCSMatrix21.foldRows(vectorAccumulator22);
        org.la4j.matrix.DenseMatrix denseMatrix24 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray23);
        org.la4j.vector.dense.BasicVector basicVector25 = new org.la4j.vector.dense.BasicVector(doubleArray23);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix30 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator31 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray32 = cCSMatrix30.foldRows(vectorAccumulator31);
        org.la4j.matrix.DenseMatrix denseMatrix33 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray32);
        org.la4j.vector.dense.BasicVector basicVector34 = new org.la4j.vector.dense.BasicVector(doubleArray32);
        ooPlaceOuterProduct16.ensureApplicableTo((org.la4j.Vector) basicVector25, (org.la4j.Vector) basicVector34);
        org.la4j.vector.sparse.CompressedVector compressedVector37 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix38 = compressedVector37.toColumnMatrix();
        org.la4j.Matrix matrix39 = sparseVector12.apply((org.la4j.operation.VectorVectorOperation<org.la4j.Matrix>) ooPlaceOuterProduct16, (org.la4j.Vector) compressedVector37);
        org.la4j.Vector vector40 = ooPlaceMatrixByVectorMultiplication0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix3, sparseVector12);
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix43 = org.la4j.matrix.dense.Basic2DMatrix.diagonal((int) (short) 1, 10.0d);
        org.la4j.Matrix matrix46 = basic2DMatrix43.copyOfShape(0, (int) (byte) 100);
        org.la4j.vector.sparse.CompressedVector compressedVector48 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        compressedVector48.swapElements(10, (int) (byte) 100);
        boolean boolean53 = compressedVector48.isZeroAt((-1));
        org.la4j.Vector vector54 = ooPlaceMatrixByVectorMultiplication0.apply((org.la4j.matrix.DenseMatrix) basic2DMatrix43, (org.la4j.vector.SparseVector) compressedVector48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector10 and sparseVector12", vector10.equals(sparseVector12) ? vector10.hashCode() == sparseVector12.hashCode() : true);
    }

    @Test
    public void test96() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test96");
        org.la4j.operation.ooplace.OoPlaceVectorsSubtraction ooPlaceVectorsSubtraction0 = new org.la4j.operation.ooplace.OoPlaceVectorsSubtraction();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix7 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator8 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray9 = cCSMatrix7.foldRows(vectorAccumulator8);
        org.la4j.matrix.DenseMatrix denseMatrix10 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray9);
        org.la4j.vector.dense.BasicVector basicVector11 = new org.la4j.vector.dense.BasicVector(doubleArray9);
        double[] doubleArray12 = basicVector11.toArray();
        int[] intArray18 = new int[] { 52, (byte) -1, ' ', (byte) 100, 0 };
        org.la4j.vector.sparse.CompressedVector compressedVector19 = new org.la4j.vector.sparse.CompressedVector((int) (byte) 0, (int) (short) 1, doubleArray12, intArray18);
        org.la4j.vector.sparse.CompressedVector compressedVector20 = org.la4j.vector.sparse.CompressedVector.fromArray(doubleArray12);
        org.la4j.Matrix matrix21 = compressedVector20.toRowMatrix();
        org.la4j.Matrix matrix22 = compressedVector20.toRowMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct23 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random25 = null;
        org.la4j.vector.DenseVector denseVector26 = org.la4j.vector.DenseVector.random(0, random25);
        java.util.Random random28 = null;
        org.la4j.vector.DenseVector denseVector29 = org.la4j.vector.DenseVector.random(0, random28);
        org.la4j.Matrix matrix30 = ooPlaceOuterProduct23.apply(denseVector26, denseVector29);
        org.la4j.vector.sparse.CompressedVector compressedVector32 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        java.text.NumberFormat numberFormat33 = null;
        java.lang.String str34 = compressedVector32.toMatrixMarket(numberFormat33);
        org.la4j.Vector vector36 = compressedVector32.add((double) 52);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix39 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator40 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray41 = cCSMatrix39.foldRows(vectorAccumulator40);
        org.la4j.vector.dense.BasicVector basicVector42 = org.la4j.vector.dense.BasicVector.fromArray(doubleArray41);
        org.la4j.Matrix matrix43 = basicVector42.toRowMatrix();
        org.la4j.vector.functor.VectorPredicate vectorPredicate44 = org.la4j.Vectors.ZERO_VECTOR;
        boolean boolean45 = basicVector42.non(vectorPredicate44);
        org.la4j.Vector vector47 = basicVector42.blankOfLength((int) 'a');
        org.la4j.Matrix matrix48 = ooPlaceOuterProduct23.apply((org.la4j.vector.SparseVector) compressedVector32, (org.la4j.vector.DenseVector) basicVector42);
        org.la4j.Vector vector50 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str51 = vector50.toCSV();
        org.la4j.vector.SparseVector sparseVector52 = vector50.toSparseVector();
        boolean boolean54 = sparseVector52.isZeroAt(52);
        org.la4j.iterator.VectorIterator vectorIterator55 = sparseVector52.iterator();
        org.la4j.iterator.VectorIterator vectorIterator56 = sparseVector52.nonZeroIterator();
        org.la4j.Vector vector58 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str59 = vector58.toCSV();
        org.la4j.vector.SparseVector sparseVector60 = vector58.toSparseVector();
        boolean boolean62 = sparseVector60.isZeroAt(52);
        org.la4j.iterator.VectorIterator vectorIterator63 = sparseVector60.iterator();
        org.la4j.iterator.VectorIterator vectorIterator64 = sparseVector60.nonZeroIterator();
        double double65 = sparseVector60.manhattanNorm();
        double double66 = sparseVector60.density();
        byte[] byteArray67 = sparseVector60.toBinary();
        org.la4j.Matrix matrix68 = ooPlaceOuterProduct23.apply(sparseVector52, sparseVector60);
        org.la4j.Vector vector69 = ooPlaceVectorsSubtraction0.apply((org.la4j.vector.SparseVector) compressedVector20, sparseVector52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on compressedVector19 and denseVector26", compressedVector19.equals(denseVector26) ? compressedVector19.hashCode() == denseVector26.hashCode() : true);
    }
}

