class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){return false;}
        int[] sList = new int[256];
        int i =0;
        int j = 0;
        while(i<s.length()){
            sList[s.charAt(i)]++;
            i++;
        }

        while(j<t.length()){
            if(sList[t.charAt(j)]!=0){
                sList[t.charAt(j)]--;
            }
            else{
                return false;
            }
            j++;
        }
        return true;
    }
}