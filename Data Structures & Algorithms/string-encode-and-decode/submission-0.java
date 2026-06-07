class Solution {

    public String encode(List<String> strs) {
        int size = strs.size();
        for(int i = 0; i < size * 2; i += 2){
            strs.add(i, String.format("%03d", strs.get(i).length()));
        }
        return String.join("", strs);
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<String>();
        int length = 0;
        for(int i = 0; i < str.length(); i += length + 3){
            length = Integer.parseInt(str.substring(i, i + 3));
            result.add(str.substring(i + 3, i + 3 + length));
        }
        return result;
    }
}
