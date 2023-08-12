class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int count = 0;
        String arr[] = new String[n];
        String m = s.toLowerCase();
        for (int i = 0; i < n; i++) {
            char c = m.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                String l1 = String.valueOf(c);
                arr[count] = l1;
                count++;
            }
        }

        for (int j = 0; j < count / 2; j++) {
            if (!arr[j].equals(arr[count - j - 1])) {
                return false;
            }
        }

        return true;
    }
}