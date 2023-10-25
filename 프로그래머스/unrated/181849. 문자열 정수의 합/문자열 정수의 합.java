class Solution {
    public int solution(String num_str) {
        char[] arr = num_str.toCharArray();
        
        int sum = 0;
        
        for (char c : arr){
            sum += (c - 48);
        }
        
        return sum;
    }
}