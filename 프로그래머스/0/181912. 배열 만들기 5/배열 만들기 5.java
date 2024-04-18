import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        
        for(String str : intStrs) {
            String sub = str.substring(s, s + l);
            if(Integer.parseInt(sub) > k)
                list.add(Integer.parseInt(sub));
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}