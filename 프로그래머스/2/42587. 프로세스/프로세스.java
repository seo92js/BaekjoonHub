import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int p : priorities) {
            queue.offer(p);
        }
        
        int answer = 0;
        
        while(!queue.isEmpty()){
            System.out.println("한 바퀴");
            
            for(int i = 0; i < priorities.length; i++) {
                System.out.println("peek = " + queue.peek());
                if(queue.peek() == priorities[i]) {
                    queue.poll();
                    answer++;
                    System.out.println("queue = " + queue);
                 
                    
                    if(location == i) {
                        System.out.println("answer = " + answer);
                        return answer;                 
                    }
                }
            }
        }


        return answer;
    }
}