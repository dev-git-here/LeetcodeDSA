class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        int count = 0;
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i<n; i++){
            if(count==0 && s.charAt(i) == '('){
                count++;
                continue;
            }
            if(s.charAt(i) == '('){
                ans.append(s.charAt(i));
                count++;
            }
            else{
                count--;
                if(count!=0){
                    ans.append(s.charAt(i));
                }
            }
            
        }

        return ans.toString();
    }
}