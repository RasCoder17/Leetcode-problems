class Solution {
    public int climbStairs(int n) {
        int a[] = new int[n];
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
        a[0] = 1;
        a[1] = 1;
        int sum=0;
        for(int i=2; i<n; i++)
        {
            a[i] = a[i-1] + a[i-2];
        }
        
        return a[n-1] + a[n-2];
        }
    }
}