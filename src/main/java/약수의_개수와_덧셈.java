import java.util.ArrayList;
import java.util.List;

public class 약수의_개수와_덧셈 {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            if (findNumberOfDivisors(i) % 2 == 0) {
                answer += i;
            }
            if (findNumberOfDivisors(i) % 2 != 0) {
                answer -= i;
            }
        }
        return answer;
    }

    private int findNumberOfDivisors(int number) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisors.add(i);
            }
        }
        return divisors.size();
    }
}
