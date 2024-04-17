class Solution {
    public String solution(String my_string, int m, int c) {
        char [] arr = my_string.toCharArray();
        String result = "";

        for(int i = 0; i < arr.length; i++) {
            int index = c + (m * i) - 1;
            
            if (index < arr.length)
                result += arr[index];
        }
        
        return result;
    }
}