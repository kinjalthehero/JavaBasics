package practiceProblems.array;

public class Array_SubtractPerfectSquare {

    public int subtractPerfectSquares2(int n) {

        if (n <= 0)
            return 1;

        boolean[] isWinningCase = new boolean[n + 1];

        // if we reach 0, we win
        isWinningCase[0] = true;

        // 1 is a win
        isWinningCase[1] = true;

        // 2 is a losing condition
        // We must define this as this state dictates losing scenarios for further states
        isWinningCase[2] = false;

        // we start from 3
        for (int i = 3; i <= n; i++) {

            for (int num = 1; num * num <= i; num++) {

                int prefectSquare = num * num;

                // if we get to 0 from current number
                // or if we get to a losing scenario (to be faced by next player) from current number,
                // then the current state is a winning position
                if (i - prefectSquare == 0 || !isWinningCase[i - prefectSquare]) {
                    isWinningCase[i] = true;
                    break;
                }
            }
        }

        // return player 1 if given number is a winning state else player 2 wins
        return isWinningCase[n] ? 1 : 2;
    }
}
