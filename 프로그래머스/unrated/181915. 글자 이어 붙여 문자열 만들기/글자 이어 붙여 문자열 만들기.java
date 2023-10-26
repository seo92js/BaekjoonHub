class Solution {
    public String solution(String my_string, int[] index_list) {

        char[] c = my_string.toCharArray();
        
        char[] arr = new char[index_list.length];
        
        int index = 0;
        
        for (int n : index_list){
            arr[index++] = c[n];
        }
        
        return new String(arr);
    }
}