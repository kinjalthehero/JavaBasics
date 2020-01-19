package practiceProblems.array;

import java.util.Scanner;

// column of first matrix must be equal to rows of the second
public class Array_MatrixMultiplication {
	
	public static int[][] product(int[][] matrix1, int[][] matrix2) {
        
		int columnsOfFirstMatrix = matrix1[0].length;
        int rowsOfFirstMatrix = matrix1.length;

        int columnsofSecondMatrix = matrix2[0].length;
        int rowsOfSecondMatrix = matrix2.length;

        int[][] result = new int[rowsOfFirstMatrix][columnsofSecondMatrix];

        // condition for matrix multiplication
        if (columnsOfFirstMatrix != rowsOfSecondMatrix) {
            throw new IllegalArgumentException(String.format("Can't multiply matrices, columns of first matrix" + " %d is not equal to rows of second matrix %d",  columnsOfFirstMatrix, rowsOfSecondMatrix));
        }

        // Take one row at a time from the first matrix
        for (int i = 0; i < rowsOfFirstMatrix; i++) {
        	// Take one column at a time from the second matrix
            for (int j = 0; j < columnsofSecondMatrix; j++) {

                int sum = 0;

                // How many times we multiply and sum depends on rowsOfSecondMatrix or columnsOfFirstMatrix
                // Iterate for rowsOfSecondMatrix or columnsOfFirstMatrix times. They both have to be equal.
                for (int k = 0; k < rowsOfSecondMatrix; k++) {
                    sum = sum + matrix1[i][k] * matrix2[k][j];
                }

                // Put that value in the final result
                // Result will have rowsOfFirstMatrix and columnsOfSecondMatrix
                result[i][j] = sum;
            }
        }

        return result;
    }

    public static void main(String args[]) {

        Scanner cmd = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of first matrix");

        int rowsOfFirstMatrix = cmd.nextInt();
        int columnsOfFirstMatrix = cmd.nextInt();
        int[][] aMatrix = new int[rowsOfFirstMatrix][columnsOfFirstMatrix];

        System.out.println("Enter the elements of first matrix");
        for (int i = 0; i < rowsOfFirstMatrix; i++) {
            for (int j = 0; j < columnsOfFirstMatrix; j++) {
                aMatrix[i][j] = cmd.nextInt();
            }
        }

        System.out.println("Enter the number of rows and columns of the second matrix");
        int rowsOfSecondMatrix = cmd.nextInt();
        int columnsOfSecondMatrix = cmd.nextInt();

        // safety net - check order or each matrix, whether eligible for
        // multiplication or not
        while (columnsOfFirstMatrix != rowsOfSecondMatrix) {
            System.out.printf("Matrices with entered orders can't be multiplied with each other, " + "columnsOfFirstMatrix [%d] != rowsOfSecondMatrix [%d] %n", columnsOfFirstMatrix, rowsOfSecondMatrix);
            System.out.println("Enter the number of rows and columns of second matrix");
            rowsOfSecondMatrix = cmd.nextInt();
            columnsOfSecondMatrix = cmd.nextInt();
        }

        int[][] bMatrix = new int[rowsOfSecondMatrix][columnsOfSecondMatrix];
        System.out.println("Enter numbers of second matrix");
        for (int i = 0; i < rowsOfSecondMatrix; i++) {
            for (int j = 0; j < columnsOfSecondMatrix; j++) {
                bMatrix[i][j] = cmd.nextInt();
            }
        }

        // calculating product of two matrices in Java
        int[][] product = product(aMatrix, bMatrix);
        System.out.println("Product of entered matrices:-");

        for (int i = 0; i < rowsOfFirstMatrix; i++) {
            for (int j = 0; j < columnsOfSecondMatrix; j++) {
                System.out.printf("%d ", product[i][j]);
            }
            System.out.printf("%n");
        }
        cmd.close();
    }

}


