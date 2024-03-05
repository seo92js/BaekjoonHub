import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list) {
        
        Arrays.sort(num_list);
        
        int [] result = IntStream.range(0, 5).map(i -> num_list[i]).toArray();
        
        return result;
    }
}