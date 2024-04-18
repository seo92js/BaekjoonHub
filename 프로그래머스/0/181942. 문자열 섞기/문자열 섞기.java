class Solution {
    public String solution(String str1, String str2) {
        String [] arr1 = str1.split("");
        String [] arr2 = str2.split("");
        
        String result = "";
        
        for(int i = 0; i < arr1.length; i++) {
            result += arr1[i];
            result += arr2[i];
        }
        
        return result;
    }
}