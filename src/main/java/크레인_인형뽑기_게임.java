import java.util.*;

public class 크레인_인형뽑기_게임 {
    public int solution(int[][] board, int[] moves) {
        for (int i = 0; i < moves.length; i++) {
            moves[i] -= 1;
        }
        int answer = 0;
        Stack<Integer> result = new Stack<>();
        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move] != 0) {
                    System.out.println(board[j][move]);
                    if (result.isEmpty()) {
                        result.push(board[j][move]);
                        board[j][move] = 0;
                    } else if (result.peek() != board[j][move]) {
                        result.push(board[j][move]);
                        board[j][move] = 0;
                    } else if (result.peek() == board[j][move]) {
                        result.pop();
                        board[j][move] = 0;
                        answer += 2;
                    }
                    break;
                }
            }
        }
        return answer;
    }
}