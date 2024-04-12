import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> temp = new ArrayList<>();
        
        for (int a : arr) {
            temp.add(a);
        }
        
        for (int d : delete_list) {
            temp.remove(Integer.valueOf(d));
        }
        
        return temp.stream().mapToInt(Integer::intValue).toArray();
    }
}