class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int[] output = new int[k];

        HashMap<Integer, Integer> counters = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            counters.put(nums[i], counters.getOrDefault(nums[i], 0) + 1);
        }
        
        ArrayList<ArrayList<Integer>> freq = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            freq.add(new ArrayList<>());
        }

        for (Map.Entry<Integer, Integer> entry : counters.entrySet()) {
            int index = entry.getValue();
            freq.get(index).add(entry.getKey());
        }

        int c = 0;
        for(int j = freq.size()-1; j >= 0; j--){
            if(c==k) break;
            for(int i = 0; i < freq.get(j).size(); i++){
                output[c] = freq.get(j).get(i);
                c++;
                if(c == k) break;
            }
        }
        return output; 
    }
}
