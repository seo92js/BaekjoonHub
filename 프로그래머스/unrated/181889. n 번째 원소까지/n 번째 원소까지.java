class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = num_list.length;
        
        int[] answer = new int[n];
        
        for (int i = 0; i < n; i++){
            answer[i] = num_list[i];
        }
        
        return answer;
    }
}