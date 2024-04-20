import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        int sum = 0; //다리 위 트럭 무게
        
        for(int t : truck_weights) {
            while(true) {
                //큐가 비어 있으면
                if(queue.isEmpty()) {
                    queue.offer(t);
                    sum+=t;
                    answer++;
                    break;
                }
                //큐가 비어있지 않으면
                else {
                    //큐 사이즈와 다리 길이가 같으면 큐에서 처음 값을 뺌
                    if(queue.size() == bridge_length) {
                        sum-=queue.poll();
                    }
                    //다음 트럭이 최대 무게 초과
                    else if(sum + t > weight) {
                        queue.offer(0);
                        answer++;
                    }
                    //다음 트럭이 최대 무게 이내 면
                    else {
                        queue.offer(t);
                        sum += t;
                        answer++;
                        break;
                    }
                }
            }
        }
        
        //시간 + 마지막 트럭의 통과시간
        return answer + bridge_length;
        
    }
}