class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        int imbal=0;
        int i = 0;
        int ans = 0;

        while(i<s.length()){
            if(s.charAt(i) == '('){
               count++; // ye open wale badhata hi jayega 
            }
            else if(s.charAt(i) == ')' && count == 0){
                count = 0;
                imbal++; // ye sare without open wale close count karlega jo ki pakka
            }
            else if(s.charAt(i) == ')'){
                count--;                        
            }
            i++;
        }

        return imbal+count;        
        
    }
}