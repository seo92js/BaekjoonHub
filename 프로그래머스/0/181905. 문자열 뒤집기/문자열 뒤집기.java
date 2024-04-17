class Solution {
    public String solution(String my_string, int s, int e) {
        String [] arr = my_string.split("");

        while (s < e) {
            String temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }
        
        return String.join("", arr);
    }
}