class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) return false;

        StringBuilder tb = new StringBuilder(t);
        int index;
        for(int i = 0; i < s.length(); i++){
            index = tb.indexOf(String.valueOf(s.charAt(i)));
            if(index < 0) return false;
            tb.deleteCharAt(index);
        }
        return true;
    }
}
