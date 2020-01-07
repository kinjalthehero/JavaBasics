package practiceProblems.array;

public class Array_WordSearch
{
    static boolean[][] visited;

    static public boolean exist (char[][] board, String word)
    {
        visited = new boolean[board.length][board[0].length];

        for(int row = 0; row < board.length; row++)
            for(int col = 0; col < board[row].length; col++)
                if((word.charAt(0) == board[row][col]) && search(board, word, row, col, 0))
                    return true;

        return false;
    }

    private static boolean search(char[][]board, String word, int row, int col, int wordIndex)
    {
        if(wordIndex == word.length())
            return true;

        if (row >= board.length || row < 0 || col >= board[row].length || col < 0 || board[row][col] != word.charAt(wordIndex) || visited[row][col])
            return false;

        visited[row][col] = true;

        if (search(board, word, row-1, col, wordIndex+1) || search(board, word, row+1, col, wordIndex+1) ||
            search(board, word, row, col-1, wordIndex+1) || search(board, word, row, col+1, wordIndex+1))
            return true;

        visited[row][col] = false;
        return false;
    }

    public static void main(String[] args) {

        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        System.out.println(exist(board, "ABCCED"));
        System.out.println(exist(board, "SEE"));
        System.out.println(exist(board, "ABCB"));
    }
}
