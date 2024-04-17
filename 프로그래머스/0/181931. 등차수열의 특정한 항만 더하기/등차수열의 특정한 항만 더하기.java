class Solution {
    public int solution(int a, int d, boolean[] included) {
        int index = 0;
        int result = 0;
        
        for(boolean b : included) {
            if (b) {
                result+=a + (d * index);
            }
            
            index++;
        }
        
        return result;
    }
}