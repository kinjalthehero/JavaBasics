package practiceProblems.linkedList;

import java.util.LinkedList;

public class LL_Snake {

    int[][] foodPositions;
    int currIndex;
    int row, col;
    int x, y;
    int score_snakeLength;
    LinkedList<int[]> snake;

    // e.g foodPositions = [[1,1], [1,0]] means the first foodPositions is positioned at [1,1], the second is at [1,0]
    public LL_Snake(int width, int height, int[][] foodPositions) {

        this.foodPositions = foodPositions;
        this.currIndex = 0;
        this.x = 0;
        this.y = 0;
        this.row = height;
        this.col = width;
        snake = new LinkedList<>();
        this.snake.offer(new int[]{0, 0});
    }

    /** Moves the snake.
     @param direction - 'U' = Up, 'L' = Left, 'R' = Right, 'D' = Down
     @return The game's score after the move. Return -1 if game over.
     Game over when snake crosses the screen boundary or bites its body. */
    public int move(String direction) {

        switch(direction) {
            case "U":
                x--;
                break;
            case "L":
                y--;
                break;
            case "R":
                y++;
                break;
            case "D":
                x++;
                break;
        }

        if (!isValid(x,y)){
            return -1;
        }

        return process(x, y);
    }

    public boolean isValid(int x, int y){

        if (x < 0 || x >= row || y < 0 || y >= col)
            return false;

        return true;
    }

    public int process(int x, int y) {

        if (currIndex == foodPositions.length)
            snake.poll();
        else if (foodPositions[currIndex][0] == x && foodPositions[currIndex][1] == y) {
            score_snakeLength++;
            currIndex++;
        } else
            snake.poll();

        for(int[] p: snake)
            if(p[0] == x && p[1] == y)
                return -1;

        snake.offer(new int[]{x,y});

        return score_snakeLength;
    }

}
