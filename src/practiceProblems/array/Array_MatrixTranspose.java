package practiceProblems.array;

import java.util.Scanner;

/*
 * Java class to represent a Matrix. It uses a two dimensional array to
 * represent a Matrix.
 */

class Matrix {

    private int rows;
    private int columns;
    private int[][] data;

    public Matrix(int row, int column) {
    	this.rows = row;
        this.columns = column;
        data = new int[rows][columns];
    }

    public Matrix(int[][] data) {
        this.data = data;
        this.rows = data.length;
        this.columns = data[0].length;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    //fills matrix from data entered by user in console 
    public void read(Scanner s) {    
    	for (int i = 0; i < rows; i++) 
    		for (int j = 0; j < columns; j++) 
    			data[i][j] = s.nextInt();
    }

	public void transpose() {
		for (int i = 0; i < rows; i++) {
			for (int j = i + 1; j < columns; j++) {
				int temp = data[i][j];
				data[i][j] = data[j][i];
				data[j][i] = temp;
			}
		}
	}

    public void print() {
    	for (int i = 0; i < rows; i++) {
    		for (int j = 0; j < columns; j++) 
    			System.out.print(data[i][j] + " ");        
        System.out.println();      
    	}
    }
}

//Java Program to transpose a Matrix. When you transpose a matrix rows are replaced by columns. 
public class Array_MatrixTranspose {

	public static void main(String[] args) {
	
		  System.out.println("Welcome to Java program to transpose a Matrix");
		  Scanner scnr = new Scanner(System.in);
		
		  System.out.println("Please enter details of matrix");
		  System.out.print("Please Enter number of rows: ");
		  
		  int row1 = scnr.nextInt();
		  
		  System.out.print("Please Enter number of columns: ");
		  
		  int column1 = scnr.nextInt();
		  
		  System.out.println();
		  System.out.println("Enter first matrix elements");
		  
		  Matrix first = new Matrix(row1, column1);
		  first.read(scnr);
		
		  System.out.println("original matrix: ");
		  first.print();
		
		  // let's transpose the matrix now
		  first.transpose();
		
		  System.out.println("transpose of the matrix is ");
		  first.print();
		  scnr.close();
	
	}

}