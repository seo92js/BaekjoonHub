class Solution {
    public int solution(String number) {
        int sum = 0;
        String [] arr = number.split("");
        
        for(String s : arr) {
            sum += Integer.parseInt(s);
        }
            
        return sum % 9;
    }
}