import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String [] arr = my_string.split("");
        
        for(int i : indices) {
            arr[i] = "";
        }
        
        return String.join("", arr);
    }
}