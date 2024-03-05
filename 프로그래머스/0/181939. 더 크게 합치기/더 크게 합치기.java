class Solution {
    public int solution(int a, int b) {
        int result1 = Integer.valueOf(a + "" + b);
        int result2 = Integer.valueOf(b + "" + a);
        
        if (result1 >= result2) {
            return result1;
        } else {
            return result2;
        }
    }
}