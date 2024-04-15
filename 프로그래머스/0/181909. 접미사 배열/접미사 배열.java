import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++) {
            String sub = my_string.substring(i, my_string.length());
            list.add(sub);
        }
        
        Collections.sort(list);
        
        return list.toArray(String[]::new);
    }
}