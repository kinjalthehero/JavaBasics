package practiceProblems.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_SpiralMatrix {

    public static List<Integer> spiralMatrix (int[][] matrix)
    {
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        int direction = 0;
        List<Integer> answer = new ArrayList<>();

        while (left <= right && top <= bottom)
        {
            if (direction == 0)
            {
                for (int i = left; i <= right; i++)
                {
                    answer.add(matrix[top][i]);
                }
                top++;
            }
            else if (direction == 1)
            {
                for (int i = top; i <= bottom; i++)
                {
                    answer.add(matrix[i][right]);
                }
                right--;
            }
            else if (direction == 2)
            {
                for (int i = right; i >= left; i--)
                {
                    answer.add(matrix[bottom][i]);
                }
                bottom--;
            }
            else if (direction == 3)
            {
                for (int i = bottom; i >= top; i--)
                {
                    answer.add(matrix[i][left]);
                }
                left++;
            }

            direction = (direction+1) % 4;
        }

        return answer;
    }

    static void spiral (int[][] arr) {

        int direction = 0;

        int left = 0;
        int right = arr[0].length-1;
        int top = 0;
        int bottom = arr.length-1;

        while (left <= right && top <= bottom) {
            if (direction == 0) {
                for (int i = left; i <= right; i++)
                    System.out.print(arr[top][i] + " ");
                top++;
                direction = 2;
            } else if (direction == 2) {
                for (int i = top; i <= bottom; i++)
                    System.out.print(arr[i][right] + " ");
                right--;
                direction = 3;
            } else if (direction == 3) {
                for (int i = right; i >= left; i--)
                    System.out.print(arr[bottom][i] + " ");
                bottom--;
                direction = 4;
            } else if (direction == 4) {

                for (int i = bottom; i >= top; i--)
                    System.out.print(arr[i][left] + " ");
                left++;
                direction = 0;
            }
        }
    }

    public static void main(String[] args) {

        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(Arrays.toString(spiralMatrix(input).toArray()));

        int[][] input2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        spiral(input2);

    }

}
