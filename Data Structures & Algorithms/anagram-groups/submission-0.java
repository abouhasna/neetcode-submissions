class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> charCounts = new HashMap<>();
        for (int i = 0; i < strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            
            String sorted = new String(chars);
            charCounts.computeIfAbsent(sorted, k -> new ArrayList<>()).add(strs[i]);
        }
        
        return new ArrayList<>(charCounts.values());
    }
}
