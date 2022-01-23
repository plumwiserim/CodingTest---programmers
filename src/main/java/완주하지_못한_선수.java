import java.util.*;

public class 완주하지_못한_선수 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for(String par : participant) {
            map.put(par, 0);
        }
        for(String par : participant) {
            map.put(par, map.get(par)+1);
        }
        for(String com : completion) {
            map.put(com, map.get(com)-1);
        }
        String answer = "";
        for(Map.Entry<String, Integer> m : map.entrySet()) {
            if(m.getValue()!=0) {
                answer = m.getKey();
            }
        }
        return answer;
    }
}
