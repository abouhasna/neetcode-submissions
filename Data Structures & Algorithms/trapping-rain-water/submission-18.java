class Solution {
    public int trap(int[] height) {
    
        int result = 0, zeros = 0, left = 0, right;
        while(left < height.length && height[left] == 0){
            left++;
        }
        for(int i = left + 1; i < height.length; i++){
            if(height[i] == 0){
                    continue;
            }
            if(height[i] <  height[left])
                zeros += height[i];
            else {
                result += (height[left] * (i - left - 1)) - zeros;
                left = i;
                zeros = 0;
            }
        }

        right = height.length - 1;
        
        while(right >= 0 && height[right] == 0){
            right--;
        }
        zeros = 0;
        

        for(int i = right - 1; i >= left; i--){
                if(height[i] == 0){
                    continue;
                }
                if(height[i] < height[right])
                    zeros += height[i];
                else{
                    result += (height[right] * (right - i - 1)) - zeros;
                    right = i;
                    zeros = 0;
                }
            }
        
        return result;
    }
}
