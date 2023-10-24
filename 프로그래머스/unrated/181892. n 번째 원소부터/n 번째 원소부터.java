class Solution {
    public int[] solution(int[] num_list, int n) {

        int length = num_list.length;
        
        int newLength = length - n + 1;
        
        int [] arr = new int[newLength];
        
        int startIndex = length - newLength;
        
        for (int i = 0; i < newLength; i++){
            arr[i] = num_list[startIndex + i];
        }
        
        return arr;
    }
}