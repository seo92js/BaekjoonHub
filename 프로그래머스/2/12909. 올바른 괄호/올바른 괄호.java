import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
  
        Stack<Character> stack = new Stack<>();
        
        char [] arr = s.toCharArray();
        
        for(char c : arr) {
            if(c == '(') {
                stack.push(c);
            } else {
                if(stack.isEmpty()){
                    answer = false;
                    break;
                }
                
                stack.pop();
            }
        }
        
        if(!stack.isEmpty()){
            answer = false;
        }
        
        return answer;
    }
}