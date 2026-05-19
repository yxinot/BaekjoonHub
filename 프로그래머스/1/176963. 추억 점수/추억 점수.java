import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> score = new HashMap<>();
        for(int i=0;i<name.length;i++){
            score.put(name[i], yearning[i]);
        }
        for(int i=0;i<photo.length;i++){
            for(String s : photo[i]){
                if(score.get(s) == null)
                    answer[i] += 0;
                else
                    answer[i] += score.get(s);
            }
        }
        return answer;
    }
}