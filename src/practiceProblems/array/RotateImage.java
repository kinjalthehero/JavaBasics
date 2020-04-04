package practiceProblems.array;

public class RotateImage {

    public void rotate(int[][] matrix) {

        int start = 0, end = matrix.length - 1;

        // swap top rows with bottom rows
        while(start < end) {
            // store top row in temp
            int[] temp = matrix[start];

            // store bottom row in top row
            matrix[start++] = matrix[end];

            // store top row in bottom row
            matrix[end--] = temp;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
