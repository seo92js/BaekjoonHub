class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int mult = 1;
        
        for (int num : num_list){
            sum+=num;
            mult*=num;
        }
        
        if (sum * sum > mult)
            return 1;
        else
            return 0;
    }
}