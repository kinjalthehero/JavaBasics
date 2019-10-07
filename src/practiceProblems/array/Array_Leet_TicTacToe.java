package practiceProblems.array;

class Array_Leet_TicTacTow {

    int[] rows, cols;
    int diagonal, otherDiagonal, n;

    public Array_Leet_TicTacTow(int n)
    {
        rows = new int[n];
        cols = new int[n];
        diagonal = 0;
        otherDiagonal = 0;
        this.n = n;
    }

    public int move(int row, int col, int player)
    {
        int add = player==1?1:-1;

        rows[row] += add;
        cols[col] += add;

        if (row == col)
            diagonal += add;

        if (row + col == n-1)
            otherDiagonal += add;

        if (Math.abs(rows[row])==n || Math.abs(cols[col])==n || Math.abs(diagonal) == n || Math.abs(otherDiagonal)==n)
            return player;
        return 0;
    }

    public static void main(String[] args) {
        Array_Leet_TicTacTow toe = new Array_Leet_TicTacTow(3);
        System.out.println(toe.move(0, 0, 1));
        System.out.println(toe.move(0, 2, 2));
        System.out.println(toe.move(2, 2, 1));
        System.out.println(toe.move(1, 1, 2));
        System.out.println(toe.move(2, 0, 1));
        System.out.println(toe.move(1, 0, 2));
        System.out.println(toe.move(2, 1, 1));
    }

}

/*
class Array_Leet_TicTacToe {

    int[] rows, cols;
    int diagonal, otherDiagonal, n;

    */
/** Initialize your data structure here. *//*

    public Array_Leet_TicTacToe(int size) {

        rows = new int[n];
        cols = new int[n];
        diagonal = 0;
        otherDiagonal = 0;
        this.n = n;
    }

    */
/** Player {player} makes a move at ({row}, {col}).
     @param row The row of the board.
     @param col The column of the board.
     @param player The player, can be either 1 or 2.
     @return The current winning condition, can be either:
     0: No one wins.
     1: Player 1 wins.
     2: Player 2 wins. *//*

    public int move(int row, int col, int player)
    {
        int val = (player == 1) ? 1 : -1;
        int target = (player == 1) ? n : -n;

        // diagonal
        if(row == col)
        {
            diagonal += val;
            if (diagonal == target)
                return player;
        }

        // diagonal
        if(row + col + 1 == n)
        {
            otherDiagonal += val;
            if(otherDiagonal == target)
                return player;
        }

        rows[row] += val;
        cols[col] += val;

        if (rows[row] == target || cols[col] == target)
            return player;

        return 0;
    }

    public static void main(String[] args) {
        Array_Leet_TicTacToe toe = new Array_Leet_TicTacToe(3);
        System.out.println(toe.move(0, 0, 1));
        System.out.println(toe.move(0, 2, 2));
        System.out.println(toe.move(2, 2, 1));
        System.out.println(toe.move(1, 1, 2));
        System.out.println(toe.move(2, 0, 1));
        System.out.println(toe.move(1, 0, 2));
        System.out.println(toe.move(2, 1, 1));
    }
}*/
