package practiceProblems.array;

public class Array_Leet_Islands {

    public int numIslands(char[][] grid)
    {
        if (grid == null)
            return 0;

        int numOfIslands = 0;

        for (int row = 0; row < grid.length; row++){
            for (int column = 0; column < grid[row].length; column++)

                if (grid[row][column] == '1') {
                    ++numOfIslands;
                    changeLandToWater (grid, row, column);
                }
        }

        return numOfIslands;
    }

    private void changeLandToWater(char[][] grid, int row, int column) {

        if (row < 0 || column < 0 || row >= grid.length || column >= grid[row].length || grid[row][column] == '0')
            return;

        // We know that this position is 1 so change from land (land = 1) to water (water = 0)
        grid[row][column] = '0';

        // Change any neighbor vertically or horizontally from 1 to 0 (recursively change neighbor's neighbor as well)
        changeLandToWater(grid, row + 1, column);
        changeLandToWater(grid, row - 1, column);
        changeLandToWater(grid, row, column + 1);
        changeLandToWater(grid, row, column - 1);
    }
}