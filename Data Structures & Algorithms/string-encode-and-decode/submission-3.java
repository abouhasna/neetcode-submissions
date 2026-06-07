class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < strs.size(); i++){
            sb.append(String.format("%03d", strs.get(i).length()));
            sb.append(strs.get(i));
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<String>();
        int length;
        int i = 0;
        while (i < str.length()) {
            length = Integer.parseInt(str.substring(i, i + 3));
            result.add(str.substring(i + 3, i + 3 + length));
            i += 3 + length;
        }
        return result;
    }
}
