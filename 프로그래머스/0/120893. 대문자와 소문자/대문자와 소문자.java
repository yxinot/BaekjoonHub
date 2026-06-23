class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        char[] string = my_string.toCharArray();
        for(char c : string){
            if(Character.isLowerCase(c))
                sb.append(String.valueOf(c).toUpperCase());
            else
                sb.append(String.valueOf(c).toLowerCase());
        }
        return sb.toString();
    }
}