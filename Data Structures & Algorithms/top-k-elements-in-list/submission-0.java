class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int[] output = new int[k];

        HashMap<Integer, Integer> counters = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            counters.put(nums[i], counters.getOrDefault(nums[i], 0) + 1);
        }
        
        int[][] sorted = new int[counters.size()][2];
        int i = 0;
        for(Map.Entry<Integer, Integer> entry : counters.entrySet()){
            sorted[i][0] = entry.getValue();
            sorted[i][1] = entry.getKey();
            i++;
        }

        Arrays.sort(sorted, (a, b) -> Integer.compare(b[0], a[0]));
        for(int j = 0; j < k; j++){
            output[j] = sorted[j][1];
        }
        return output; 
    }
}
