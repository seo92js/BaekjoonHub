class Solution {
    public int solution(String num_str) {
        return num_str.chars().map(m -> m - 48).sum();
    }
}