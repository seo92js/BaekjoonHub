import java.util.*;

class Solution {
    public String[] solution(String myString) {
        List<String> result = new ArrayList<>();
        
        String [] arr = myString.trim().split("x");
        
        Arrays.sort(arr);
        
        for(String s : arr) {
            if(!s.isEmpty())
                result.add(s);
        }
        
        return result.toArray(new String[result.size()]);
    }
}