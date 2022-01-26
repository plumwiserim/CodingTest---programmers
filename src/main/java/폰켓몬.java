import java.util.*;

public class 폰켓몬 {
    public int solution(int[] nums) {
        List<Integer> distinctNums = new ArrayList<>();
        for(int num : nums) {
            if(!distinctNums.contains(num)) {
                distinctNums.add(num);
            }
        }
        if(nums.length/2>distinctNums.size()) {
            return distinctNums.size();
        }
        if(nums.length/2<=distinctNums.size()) {
            return nums.length/2;
        }
        return 0;
    }
}
