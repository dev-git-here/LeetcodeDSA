class Solution {
    public String largestOddNumber(String num) {

        int number = 0;
        int i = num.length()-1 ;

        while(i>=0){
            number =  Integer.parseInt(String.valueOf(num.charAt(i)));
            if(number%2 != 0){
               return num.substring(0,i+1);
            //    break;
            }
            i--;
        }
        return "";
    }
}