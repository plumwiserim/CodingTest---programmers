import java.util.ArrayList;
import java.util.List;

public class 로또의_최고_순위와_최저_순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        List<Integer> win_numbers = new ArrayList<>();
        for (int num : win_nums) {
            win_numbers.add(num);
        }
        int countZero = 0;
        for (int lotto : lottos) {
            if (lotto == 0) {
                countZero++;
            }
        }
        int countWinNumbers = 0;
        for (int lotto : lottos) {
            if (win_numbers.contains(lotto)) {
                countWinNumbers++;
            }
        }
        int[] numberAnswer = new int[2];
        numberAnswer[0] = countWinNumbers + countZero;
        numberAnswer[1] = countWinNumbers;
        int[] answer = new int[2];
        for (int i = 0; i < numberAnswer.length; i++) {
            if (numberAnswer[i] == 6) {
                answer[i] = 1;
            }
            if (numberAnswer[i] == 5) {
                answer[i] = 2;
            }
            if (numberAnswer[i] == 4) {
                answer[i] = 3;
            }
            if (numberAnswer[i] == 3) {
                answer[i] = 4;
            }
            if (numberAnswer[i] == 2) {
                answer[i] = 5;
            }
            if (numberAnswer[i] == 1 || numberAnswer[i] == 0) {
                answer[i] = 6;
            }
        }
        return answer;
    }
}