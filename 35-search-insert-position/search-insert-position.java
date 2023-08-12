class Solution {
    public int searchInsert(int[] nums, int target) {
        int temp = target;
        int c=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]<temp)
            {
                c++;
            }
            else
            {
                break;
            }            
        }
    return c;    
    }
}