package practiceProblems.array;

public class Array_Leet_Islands {

    public int numIslands(int[][] grid)
    {
        if (grid == null)
            return 0;

        int numOfIslands = 0;

        for (int row = 0; row < grid.length; row++){
            for (int column = 0; column < grid[row].length; column++)

                if (grid[row][column] == 1) {
                    ++numOfIslands;
                    changeLandToWater (grid, row, column);
                }
        }

        return numOfIslands;
    }

    private void changeLandToWater(int[][] grid, int row, int column) {

        if (row < 0 || column < 0 || row >= grid.length || column >= grid[row].length || grid[row][column] == 0)
            return;

        // We know that this position is 1 so change from land (land = 1) to water (water = 0)
        grid[row][column] = 0;

        // Change any neighbor vertically or horizontally from 1 to 0 (recursively change neighbor's neighbor as well)
        changeLandToWater(grid, row + 1, column);
        changeLandToWater(grid, row - 1, column);
        changeLandToWater(grid, row, column + 1);
        changeLandToWater(grid, row, column - 1);
    }

    public int maxAreaOfIsland(int[][] grid) {

        int max_area = 0;

        for(int i = 0; i < grid.length; i++)
            for(int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1)
                    max_area = Math.max(max_area, AreaOfIsland(grid, i, j));

                System.out.println(max_area);
            }

        return max_area;
    }

    public int AreaOfIsland(int[][] grid, int row, int col) {

        if (row < 0 || col < 0 || row >= grid.length || col >= grid[row].length || grid[row][col] == 0)
            return 0;

        grid[row][col] = 0;

        return 1 + AreaOfIsland(grid, row+1, col)
                + AreaOfIsland(grid, row-1, col)
                + AreaOfIsland(grid, row, col-1)
                + AreaOfIsland(grid, row, col+1);
    }

    public static void main(String[] args) {

        int[][] arr = {
                {1,1,0,0,0},
                {1,1,0,0,0},
                {0,0,1,0,0},
                {0,0,0,1,1},
                {0,0,0,1,1}
        };

        int[][] arr2 = {
                {1,1,0,0,0},
                {1,1,0,0,0},
                {0,0,1,0,0},
                {0,0,1,1,1},
                {0,0,0,1,1}
        };

        Array_Leet_Islands island = new Array_Leet_Islands();
        System.out.println(island.numIslands(arr));
        System.out.println(island.maxAreaOfIsland(arr2));
    }
}