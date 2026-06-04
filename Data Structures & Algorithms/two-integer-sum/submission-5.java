class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevNums = new HashMap<>();
        int difference;
        for(int i = 0; i < nums.length; i++){
            difference = target - nums[i];
            if(prevNums.containsKey(difference))
                return new int[] { prevNums.get(difference), i };
            
            prevNums.put(nums[i], i);
        }
        return new int[] {};
    }
}
