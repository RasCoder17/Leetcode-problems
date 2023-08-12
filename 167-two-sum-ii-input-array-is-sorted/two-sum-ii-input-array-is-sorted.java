class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int arr[] = new int[2];
        int r = numbers.length - 1;
	while (numbers[l] + numbers[r] != target) {
		if (numbers[l] + numbers[r] < target) l++;
		else r--;
	}
        arr[0] = l+1;
        arr[1] = r+1;
        return arr;
    }
}