import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        
        list.add(arr[0]);
        int index = 1;
        
        for(int i = 1; i < arr.length; i++) {
            if(list.get(index - 1) != arr[i]) {
                index++;
                list.add(arr[i]);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}