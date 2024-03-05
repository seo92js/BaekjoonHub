class Solution {
    public int solution(int a, int b) {
        String result = Integer.toString(a) + Integer.toString(b);
        
        int result1 = Integer.valueOf(result);
        int result2 = 2 * a * b;
        
        if (result1 >= result2) {
            return result1;
        } else {
            return result2;
        } 
    }
}