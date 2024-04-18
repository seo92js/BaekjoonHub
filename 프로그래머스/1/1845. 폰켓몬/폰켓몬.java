import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int n : nums) {
            set.add(n);
        }
        
        int max = nums.length / 2;
        
        if(max < set.size()) {
            return max;
        } else {
            return set.size();
        }
    
    }
}