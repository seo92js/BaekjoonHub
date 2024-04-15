class Solution {
    public String solution(int[] numLog) {
        int start = 0;
        String result = "";
        
        for(int i = 1; i < numLog.length; i++) {
            int r = numLog[i] - numLog[i - 1];
            
            if(r == 1) {
                result+="w";
            } else if(r == -1) {
                result+="s";
            } else if (r == 10) {
                result+="d";
            } else if (r == -10) {
                result+="a";
            }
        }
        
        return result;
    }
}