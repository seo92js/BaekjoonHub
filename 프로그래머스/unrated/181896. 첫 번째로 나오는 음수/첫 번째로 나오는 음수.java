class Solution {
    public int solution(int[] num_list) {

        int length = num_list.length;
        
        for (int i = 0; i < length; i++){
            if(num_list[i] < 0)
                return i;
        }
        
        return -1;
    }
}