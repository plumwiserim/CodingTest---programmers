public class x만큼_간격이_있는_n개의_숫자 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (long) x + (long) x * i;
        }
        return answer;
    }
}