import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> type = new HashMap<>();
        for(int n : nums){
            if(type.get(n) == null)
                type.put(n, 1);
            else
                continue;
        }
        for(int key : type.keySet())
            answer++;
        if(answer > nums.length/2)
            answer = nums.length/2;
        return answer;
    }
}