class Solution {
    public int solution(String my_string, String target) {

        boolean result = my_string.contains(target);
        
        if (result == true)
            return 1;
        else
            return 0;
    }
}