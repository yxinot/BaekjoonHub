import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        HashMap<String, Integer> cache = new HashMap<>();
        Queue<String> queue = new LinkedList<>();
        for(String c : cities){
            String city = c.toLowerCase();
            if(cache.containsKey(city)){
                answer += 1;
                queue.remove(city);
                queue.add(city);
                continue;
            }
            else
                answer += 5;
            if(cacheSize == 0)
                continue;
            if(queue.size() < cacheSize){
                cache.put(city, 1);
                queue.add(city);
            }
            else{
                cache.remove(queue.peek());
                queue.remove();
                queue.add(city);
                cache.put(city,1);
            }
        }
        return answer;
    }
}