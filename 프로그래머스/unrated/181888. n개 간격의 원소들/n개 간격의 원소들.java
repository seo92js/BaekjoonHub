class Solution {
    public int[] solution(int[] num_list, int n) {
   
        int length = num_list.length;
        
        int newLength;
        
        if (length % n == 0)
            newLength = length / n;
        else
            newLength = length / n + 1;
        
        int[] answer = new int[newLength];
        
        for (int i = 0; i < newLength; i++){
            answer[i] = num_list[n * i]; 
        }

        return answer;
    }
}