import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> result = new ArrayList<>();
        
        int sub = (int) Math.ceil((100F - progresses[0]) / speeds[0]); 
        int count = 1;
        
        for(int i = 1; i < progresses.length; i++) {
            if(sub >= (int) Math.ceil((100F - progresses[i]) / speeds[i])) {
                count++;
            } else {
                result.add(count);
                sub = (int) Math.ceil((100F - progresses[i]) / speeds[i]);
                count = 1;
            }
        }
        
        result.add(count);
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}