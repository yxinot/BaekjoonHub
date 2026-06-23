class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int idx = 0;
        for(int i=0;i<3;i++){
            if(max < sides[i]){
                max = sides[i];
                idx = i;
            }
        }
        
        switch(idx){
            case 0:
                if(sides[1] + sides[2] <= max)
                    return 2;
                else
                    return 1;
            case 1:
                if(sides[0] + sides[2] <= max)
                    return 2;
                else
                    return 1;
            case 2:
                if(sides[0] + sides[1] <= max)
                    return 2;
                else
                    return 1;
            default:
                return 0;
        }
    }
}