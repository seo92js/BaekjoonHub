class Solution {
    public int solution(String my_string, String is_suffix) {

        int length = my_string.length();
        int sufLength = is_suffix.length();

        if (length >= sufLength){
            String sub = my_string.substring(length-sufLength, length);

            if (sub.equals(is_suffix))
                return 1;
            else
                return 0;
        } else {
            return 0;
        }
    }
}