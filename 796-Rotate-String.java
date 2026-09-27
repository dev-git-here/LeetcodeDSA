class Solution {
    public boolean rotateString(String s, String goal) {
        for(int i = 0; i<s.length(); i++){
            if(s.equals(goal)){
                return true;
            }
            else{
                s = s.substring(1,s.length()).concat(s.substring(0,1));
            }
        }
        return false;
    }
}