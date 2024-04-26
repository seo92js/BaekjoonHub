import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for(int s : scoville) {
            queue.add(s);
        }
        
        int num = 0;
        
        while(queue.peek() < K) {
            if(num == scoville.length - 1)
                return -1;
            
            int peek = queue.poll();
            int second = queue.poll();

            int mix = peek + (second * 2);
            queue.add(mix);
            num++;
        }
        
        return num;
    }
}