class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int length = arr.length;
        
        answer = new int[length];
        
        for(int i = 0; i < length; i++){
            if (arr[i] >= 50 && arr[i] % 2 == 0){
                answer[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 != 0){
                answer[i] = arr[i] * 2;
            } else {
                answer[i] = arr[i];
            }
        }
        
        return answer;
    }
}