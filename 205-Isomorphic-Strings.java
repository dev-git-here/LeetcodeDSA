class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length()!=t.length()){return false;}

        int n = s.length();
        Map<Character, Character> charMapS = new HashMap<>();
        Map<Character, Character> charMapT = new HashMap<>();
        

        for (int i = 0; i < n; i++) {
            if (charMapS.containsKey(s.charAt(i))) {
                if (charMapS.get(s.charAt(i)) == t.charAt(i)) {
                    continue;
                } else {
                    return false;
                }
            } else {
                charMapS.put(s.charAt(i), t.charAt(i));
            }

            if (charMapT.containsKey(t.charAt(i))) {
                if (charMapT.get(t.charAt(i)) == s.charAt(i)) {
                    continue;
                } else {
                    return false;
                }
            } else {
                charMapT.put(t.charAt(i), s.charAt(i));
            }


        }

        return true;
    }
}