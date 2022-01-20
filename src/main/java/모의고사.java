public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (i % 5 == 0 && answers[i] == person1[0]) {
                scores[0]++;
            }
            if (i % 5 == 1 && answers[i] == person1[1]) {
                scores[0]++;
            }
            if (i % 5 == 2 && answers[i] == person1[2]) {
                scores[0]++;
            }
            if (i % 5 == 3 && answers[i] == person1[3]) {
                scores[0]++;
            }
            if (i % 5 == 4 && answers[i] == person1[4]) {
                scores[0]++;
            }

            if (i % 8 == 0 && answers[i] == person2[0]) {
                scores[1]++;
            }
            if (i % 8 == 1 && answers[i] == person2[1]) {
                scores[1]++;
            }
            if (i % 8 == 2 && answers[i] == person2[2]) {
                scores[1]++;
            }
            if (i % 8 == 3 && answers[i] == person2[3]) {
                scores[1]++;
            }
            if (i % 8 == 4 && answers[i] == person2[4]) {
                scores[1]++;
            }
            if (i % 8 == 5 && answers[i] == person2[5]) {
                scores[1]++;
            }
            if (i % 8 == 6 && answers[i] == person2[6]) {
                scores[1]++;
            }
            if (i % 8 == 7 && answers[i] == person2[7]) {
                scores[1]++;
            }

            if (i % 10 == 0 && answers[i] == person3[0]) {
                scores[2]++;
            }
            if (i % 10 == 1 && answers[i] == person3[1]) {
                scores[2]++;
            }
            if (i % 10 == 2 && answers[i] == person3[2]) {
                scores[2]++;
            }
            if (i % 10 == 3 && answers[i] == person3[3]) {
                scores[2]++;
            }
            if (i % 10 == 4 && answers[i] == person3[4]) {
                scores[2]++;
            }
            if (i % 10 == 5 && answers[i] == person3[5]) {
                scores[2]++;
            }
            if (i % 10 == 6 && answers[i] == person3[6]) {
                scores[2]++;
            }
            if (i % 10 == 7 && answers[i] == person3[7]) {
                scores[2]++;
            }
            if (i % 10 == 8 && answers[i] == person3[8]) {
                scores[2]++;
            }
            if (i % 10 == 9 && answers[i] == person3[9]) {
                scores[2]++;
            }
        }
        int maxScore = scores[0];
        for (int score : scores) {
            maxScore = Math.max(maxScore, score);
        }
        int count = 0;
        for (int score : scores) {
            if (score == maxScore) {
                count++;
            }
        }
        int[] answer = new int[count];
        int j = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                answer[j] = i + 1;
                j++;
            }
        }
        return answer;
    }
}
