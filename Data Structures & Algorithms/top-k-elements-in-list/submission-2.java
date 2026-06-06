class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int[] output = new int[k];

        HashMap<Integer, Integer> counters = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            counters.put(nums[i], counters.getOrDefault(nums[i], 0) + 1);
        }
        
        ArrayList<int[]> sorted = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : counters.entrySet()){
            sorted.add(new int[]{entry.getValue(), entry.getKey()});
        }

        sorted.sort((a, b) -> b[0] - a[0]);

        for(int j = 0; j < k; j++){
            output[j] = sorted.get(j)[1];
        }
        return output; 
    }
}
