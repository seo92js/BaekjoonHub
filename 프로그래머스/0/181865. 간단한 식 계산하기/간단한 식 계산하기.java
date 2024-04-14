class Solution {
    public int solution(String binomial) {
        int result = 0;
        int a, b;
        String[] array;
        String temp;
        
        binomial.replace(" ", "");
        
        System.out.println(binomial);
        
        if (binomial.contains("+")) {
            array = binomial.split("\\+");
            
            a = Integer.parseInt(array[0].trim());
            b = Integer.parseInt(array[1].trim());
            
            result = a + b;
        } else if (binomial.contains("-")) {
            array = binomial.split("-");
        
            a = Integer.parseInt(array[0].trim());
            b = Integer.parseInt(array[1].trim());
            
            result = a - b;
        } else if (binomial.contains("*")) {
            array = binomial.split("\\*");

            a = Integer.parseInt(array[0].trim());
            b = Integer.parseInt(array[1].trim());
            
            result = a * b;
        }
        
        return result;
    }
}