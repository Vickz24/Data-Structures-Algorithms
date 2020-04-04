/*Given an integer array nums, 
 *find the contiguous subarray (containing at least one number)
 *which has the largest sum and return its sum.
**/

class Solution {
    public int maxSubArray(int[] nums) {
        int cur_max = nums[0], max = nums[0];
        for(int i=1;i<nums.length;++i)
        {
            cur_max = Math.max(cur_max+ nums[i], nums[i]);
            if(cur_max>max)
                max = cur_max;
        }
        return max;
    }
}
