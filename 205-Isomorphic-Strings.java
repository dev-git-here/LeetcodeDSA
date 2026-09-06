class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length()!=t.length()){return false;}

        // int n = s.length();
        // Map<Character, Character> charMapS = new HashMap<>();
        // Map<Character, Character> charMapT = new HashMap<>();
        

        // for (int i = 0; i < n; i++) {
        //     if (charMapS.containsKey(s.charAt(i))) {
        //         if (charMapS.get(s.charAt(i)) == t.charAt(i)) {
        //             continue;
        //         } else {
        //             return false;
        //         }
        //     } else {
        //         charMapS.put(s.charAt(i), t.charAt(i));
        //     }

        //     if (charMapT.containsKey(t.charAt(i))) {
        //         if (charMapT.get(t.charAt(i)) == s.charAt(i)) {
        //             continue;
        //         } else {
        //             return false;
        //         }
        //     } else {
        //         charMapT.put(t.charAt(i), s.charAt(i));
        //     }


        // }

        // return true;

        char[]arrS = new char[256];
        char[]arrT = new char[256];
        
        for(int i = 0; i<s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(arrS[a] == 0 && arrT[b] == 0){
                arrS[a] = b; 
                arrT[b] = a;
            }
            else{
                if(arrS[a] != b && arrT[b] != a){
                    return false;
                }
                else{
                    continue;
                }

            }

        }
        return true;

    }
}