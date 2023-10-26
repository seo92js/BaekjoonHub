class Solution {
    public int solution(String my_string, String is_prefix) {

        int n = my_string.indexOf(is_prefix);
        
        if (n == 0)
            return 1;
        else
            return 0;

    }
}