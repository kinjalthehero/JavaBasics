package practiceProblems.array;

public class Array_WordSearch
{
    static boolean[][] visited;

    static public boolean exist (char[][] inputBoard, String inputWord) {

        visited = new boolean[inputBoard.length][inputBoard[0].length];

        for (int row = 0; row < inputBoard.length; row++)
            for (int col = 0; col < inputBoard[row].length; col++)
                if ((inputWord.charAt(0) == inputBoard[row][col]) && search(inputBoard, inputWord, row, col, 0))
                    return true;

        return false;
    }

    private static boolean search(char[][] inputBoard, String inputWord, int row, int col, int wordIndex) {

        if(wordIndex == inputWord.length())
            return true;

        if (row >= inputBoard.length ||
            row < 0 ||
            col >= inputBoard[row].length ||
            col < 0 ||
            inputBoard[row][col] != inputWord.charAt(wordIndex) ||
            visited[row][col])
        return false;

        visited[row][col] = true;

        if (search(inputBoard, inputWord, row-1, col, wordIndex+1) ||
            search(inputBoard, inputWord, row+1, col, wordIndex+1) ||
            search(inputBoard, inputWord, row, col-1, wordIndex+1) ||
            search(inputBoard, inputWord, row, col+1, wordIndex+1))
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
