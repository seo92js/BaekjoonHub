import java.util.*;
//첫번쨰 원소를 1번원소,
// 0, 2 , 4를 odd 에 저장
// 1,3,5 를 even 에 저장
class Solution {
    public int solution(int[] num_list) {
        int even = 0;
        int odd = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                odd+=num_list[i];
            } else {
                even+=num_list[i];
            }
        }
        
        if (even > odd) {
            return even;
        } else if (even < odd) {
            return odd;
        } else {
            return even;
        } 
    }
}
