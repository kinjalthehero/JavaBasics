package practiceProblems.array;

import java.util.Scanner;

/*
 * Java Program to add and subtract two matrices. 
 * A matrix can be represented as two dimensional array in Java
 */
public class Array_MatrixAddition {

  // Populate the matrix
  public static int[][] read(Scanner s, int rows, int columns) {
    
	  int[][] result = new int[rows][columns];;
	  
	  for (int i = 0; i < rows; i++) {
		  for (int j = 0; j < columns; j++) {
			  System.out.println("Enter value of [" + (i+1) + "][" + (j+1) +"]");
			  result[i][j] = s.nextInt();
		  }
	  }
	  return result;
  }

  public static int[][] add(int[][] a, int[][] b) {

	  // Important: How to get rows and column values
	  int rows = a.length;
	  int columns = a[0].length;
	  int[][] result = new int[rows][columns];
	  
	  for (int i = 0; i < rows; i++)
	  {
		  for (int j = 0; j < columns; j++)
		  {
			  result[i][j] = a[i][j] + b[i][j];
		  }
	  }
	  return result;
  }

  public static int[][] subtract(int[][] a, int[][] b) {
    
  	  // Important: How to get rows and column values
	  int rows = a.length;
	  int columns = a[0].length;
	  int[][] result = new int[rows][columns];
    
	  for (int i = 0; i < rows; i++)
	  {
		  for (int j = 0; j < columns; j++)
		  {
			  result[i][j] = a[i][j] - b[i][j];
		  }
	  }
	  return result;
  }

  public static void printMatrix(int[][] matrix) {
    
	  int rows = matrix.length;
	  int columns = matrix[0].length;
	  
	  for (int i = 0; i < rows; i++) {
		  for (int j = 0; j < columns; j++) {
			  System.out.print(matrix[i][j] + " ");
		  }
		  System.out.println();
	  }
  }
  
  public static void main(String[] args) {

	    System.out.println("Welcome to Java program for calculating sum and difference of two matrices");

	    // we need a Scanner to read input from Console
	    Scanner scnr = new Scanner(System.in);

	    System.out.print("Please Enter number of rows: ");
	    int rows = scnr.nextInt();

	    System.out.print("Please Enter number of columns: ");
	    int columns = scnr.nextInt();
	    System.out.println();

	    System.out.println("Please Enter first matrix");
	    int[][] a = read(scnr, rows, columns);
	    System.out.println();

	    System.out.println("Please Enter second matrix");
	    int[][] b = read(scnr, rows, columns);

	    scnr.close();
	    
	    // adding two matrices
	    int[][] sum = add(a, b);

	    // subtracting two matrices
	    int[][] difference1 = subtract(a, b);
	    int[][] difference2 = subtract(b, a);

	    System.out.println("The sum of two matrices is: ");
	    System.out.println("A + B =");
	    printMatrix(sum);

	    System.out.println("The differnece of two matrices is: ");
	    System.out.println("A - B =");
	    printMatrix(difference1);

	    System.out.println("Subtraction of matrix in opposite order");
	    System.out.println("B - A =");
	    printMatrix(difference2);

	    scnr.close();
	  }
}