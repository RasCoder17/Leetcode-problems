class Solution {
    public int findMin(int[] nums) {
        int n1 = 0;
        int n2 = nums.length-1;
        while(n1 < n2 && nums[n1] > nums[n2])
        {
            int m = (n1+n2)/2;
            if(nums[m] < nums[n2])
            {
                n2 = m;
            }
            else
            {
                n1 = m+1;
            }
        }
        return nums[n1];
    }
}