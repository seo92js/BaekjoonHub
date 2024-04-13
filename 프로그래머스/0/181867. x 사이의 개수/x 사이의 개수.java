import java.util.*;

class Solution {
    public int[] solution(String myString) {
        char [] arr = myString.toCharArray();
        List<Integer> list = new ArrayList<>();
        
        int num = 0;
        
        for(char c : arr) {
            if(c == 'x') {
                list.add(num);
                num = 0;
            } else {
                num++;
            }
        }
        list.add(num);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}