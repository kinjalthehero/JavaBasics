package practiceProblems.array;


public class Arrays_WaysToReachACell {

    // Time complexity of the above dynamic programming solution is O(mn).
    // Space complexity of the above solution is O(mn).
    static int numberOfPaths(int m, int n)
    {
        // To store results of the subproblems
        int count[][] = new int[m][n];

        // Paths to reach any cell in first row is 1
        for (int i = 0; i < m; i++)
            count[i][0] = 1;

        // Paths to reach any cell in first column is 1
        for (int j = 0; j < n; j++)
            count[0][j] = 1;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++)

                // last part if the diagonal Movements are allowed
                // current cell = left cell + top cell //+ digonal prev cell
                count[i][j] = count[i - 1][j] + count[i][j - 1]; //+ count[i-1][j-1];
        }

        return count[m - 1][n - 1];
    }

    public static void main(String args[]) {
        System.out.println(numberOfPaths(3, 3));
    }


}
