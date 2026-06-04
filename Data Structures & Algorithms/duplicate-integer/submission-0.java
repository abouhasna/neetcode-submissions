class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> prevNums = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(prevNums.containsValue(nums[i])) return true;
            prevNums.put(i, nums[i]);
        }
        return false;
    }
}