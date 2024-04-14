class Solution {
    public int solution(int[] arr, int idx) {
        int index = 0;
        
        for(int a : arr) {
            if(index >= idx && a == 1)
                return index;
            
            index++;
        }
        
        return -1;
    }
}