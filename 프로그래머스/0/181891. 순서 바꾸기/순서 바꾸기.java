import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = num_list.length;
        
        int[] backArr = Arrays.copyOfRange(num_list, 0, n);
        int[] frontArr = Arrays.copyOfRange(num_list, n, length);
        
        System.arraycopy(frontArr, 0, num_list, 0, frontArr.length);
        System.arraycopy(backArr, 0, num_list, frontArr.length, backArr.length);
        
        return num_list;
    }
}