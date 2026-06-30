class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int n = nums.length;

        while (n > 0) {
            int mid = left + n / 2;

            if (nums[mid] == target)
                return mid;

            if (nums[mid] < target) {
                left = mid + 1;
                n -= (n / 2 + 1);
            } else {
                n /= 2;
            }
        }

        return -1;
    }
}