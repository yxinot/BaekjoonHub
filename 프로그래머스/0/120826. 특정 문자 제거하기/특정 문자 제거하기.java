class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char[] mystr = my_string.toCharArray();
        for(char c : mystr){
            if(String.valueOf(c).equals(letter))
                continue;
            answer += String.valueOf(c);
            
        }
        return answer;
    }
}