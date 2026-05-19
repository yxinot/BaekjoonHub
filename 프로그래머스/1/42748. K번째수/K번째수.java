import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int x = 0;x<commands.length;x++){
            int[] arr = new int[commands[x][1] - commands[x][0] + 1];
            int idx = 0;
            for(int i=commands[x][0]-1;i<=commands[x][1]-1;i++){
                arr[idx] = array[i];
                idx++;
            }
            Arrays.sort(arr);
            answer[x] = arr[commands[x][2]-1];
        }
        return answer;
    }
}