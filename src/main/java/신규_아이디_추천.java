import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 신규_아이디_추천 {
    public String solution(String new_id) {
        String[] answers = new_id.toLowerCase().split("");
        String answer = String.join("", answers);
        System.out.println("step1 " + answer);
        List<String> characters = new ArrayList<>();
        for (int i = 65; i <= 90; i++) {
            characters.add(Character.toString((char) i).toLowerCase());
        }
        for (int i = 48; i <= 57; i++) {
            characters.add(Character.toString((char) i));
        }
        characters.add("-");
        characters.add("_");
        characters.add(".");
        for(int i = 0; i< answers.length;i++) {
            if(!characters.contains(answers[i])) {
                answers[i]= "";
            }
        }
        answer = String.join("", answers);
        System.out.println("step2 " + answer);
        Stack<String> fullStop = new Stack<>();
        fullStop.push(Character.toString(answer.charAt(0)));
        for (int i = 1; i < answer.length(); i++) {
            if (!(fullStop.peek().equals(".") && Character.toString(answer.charAt(i)).equals("."))) {
                fullStop.push(Character.toString(answer.charAt(i)));
            }
        }
        answer = String.join("", fullStop);
        System.out.println("step3 " + answer);
        if (Character.toString(answer.charAt(0)).equals(".")) {
            answer = answer.substring(1);
        }
        if (!answer.isEmpty()&&Character.toString(answer.charAt(answer.length()-1)).equals(".")) {
            answer = answer.substring(0, answer.length() - 1);
        }
        System.out.println("step4 " + answer);
        if (answer.isEmpty()) {
            answer = "a";
        }
        System.out.println("step5 " + answer);
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            if (Character.toString(answer.charAt(14)).equals(".")) {
                answer = answer.substring(0, 14);
            }
        }
        System.out.println("step6 " + answer);
        if (answer.length() <= 2) {
            int i = 1;
            List<String> repeat = new ArrayList<>();
            repeat.add(answer);
            while (answer.length() * i < 3) {
                repeat.add(Character.toString(answer.charAt(answer.length()-1)));
                i++;
            }
            answer = String.join("", repeat);
        }
        System.out.println("step7 " + answer);
        return answer;
    }
}