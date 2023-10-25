class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        
        int[] arr = new int[length + 1];
        
        for(int i = 0; i < length + 1; i++){
            if (i == length){
                if (num_list[length - 1] > num_list[length - 2]){
                    arr[i] = num_list[length - 1] - num_list[length - 2];
                } else {
                    arr[i] = num_list[length - 1] * 2;
                }
            } else{
                arr[i] = num_list[i];
            }
        }
            
        return arr;
    }
}