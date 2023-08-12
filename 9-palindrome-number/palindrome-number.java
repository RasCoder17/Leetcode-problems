class Solution {
    public boolean isPalindrome(int x) {
    if(x>=0)
    {
        int c=0;
        String s = Integer.toString(x);
        for(int i=0;i<s.length();i++)
        {
            char m = s.charAt(i);
            char l = s.charAt(s.length() - i - 1);
            if(m==l)
            {
                c=c+1;
            }
        }
        if(s.length()==c)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    // else if(x==0)
    // {
    //     return true;
    // }
    else
    {
        return false;
    }
    }
}