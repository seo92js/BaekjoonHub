import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int n) {
        int length = arr.length;
        
        if (length % 2 != 0) 
            return IntStream.range(0, length).map(i -> i % 2 == 0 ? arr[i] + n : arr[i]).toArray();
        else
            return IntStream.range(0, length).map(i -> i % 2 != 0 ? arr[i] + n : arr[i]).toArray();
    }
}