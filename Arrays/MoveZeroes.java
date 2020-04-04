/*Given an array nums, write a function to move all 0's to the end of it 
 *while maintaining the relative order of the non-zero elements.
 *You must do this in-place without making a copy of the array.
 *Minimize the total number of operations.
**/

class Solution {
    public void moveZeroes(int[] nums) {
        
        int min_index = -1, max_index = -1, swap = -1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                if(min_index==-1)
                    min_index = max_index = i;
                else
                    max_index = i;
            }
            else if(nums[i]!=0 && min_index!=-1)
            {
                swap = nums[min_index];
                nums[min_index] = nums[i];
                nums[i] = swap;
                max_index = i;
                min_index++;
            }
        }
    }
}
