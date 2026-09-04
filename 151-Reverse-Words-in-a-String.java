class Solution {
    public String reverseWords(String s) {
        // String[] words = s.trim().split("\\s+");
        // int left=0;
        // int right = words.length-1;
        // // String[] temp = 
        // while(right>left){
        //    String temp = words[left];
        //    words[left] = words[right];
        //    words[right]= temp;
        //    right--;
        //    left++;
        // }

        // return String.join(" ",words);

        StringBuilder ans = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) {
                break;
            }

            int end = i;

            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            if (ans.length() > 0) {
                ans.append(" ");
            }

            ans.append(s.substring(i + 1, end + 1));
        }

        return ans.toString();

    }
}