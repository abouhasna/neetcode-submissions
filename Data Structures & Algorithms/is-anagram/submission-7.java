class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> sHash = new HashMap<>(), tHash = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            sHash.put(s.charAt(i), sHash.getOrDefault(s.charAt(i), 0) + 1);
            tHash.put(t.charAt(i), tHash.getOrDefault(t.charAt(i), 0) + 1);
        }
        for(int i = 0; i < s.length(); i++){
            if (!sHash.getOrDefault(s.charAt(i), 0).equals(tHash.getOrDefault(s.charAt(i), 0))) 
                return false;
            
        }
        return true;
    }
}
