package practiceProblems.array;

import java.util.Arrays;

public class Array_Leet_FloodFill {

    public int[][] floodFill(int[][] image, int row, int col, int newColor)
    {
        if (image[row][col] == newColor)
            return image;

        fill(image, row, col, image[row][col], newColor);

        return image;
    }

    private void fill(int[][] image, int row, int col, int color, int newColor)
    {
        if (row < 0 || row >= image.length || col < 0 || col >= image[0].length || image[row][col] != color)
            return;

        image[row][col] = newColor;

        fill(image, row + 1, col, color, newColor);
        fill(image, row - 1, col, color, newColor);
        fill(image, row, col + 1, color, newColor);
        fill(image, row, col - 1, color, newColor);
    }

    public static void main(String[] args) {
        Array_Leet_FloodFill obj = new Array_Leet_FloodFill();
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        obj.floodFill(image, 1, 1, 2);

        System.out.println(Arrays.deepToString(image));
    }

}
