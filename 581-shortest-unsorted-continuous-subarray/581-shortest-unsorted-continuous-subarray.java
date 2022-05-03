class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int low = 0;
        int n = nums.length;
        int high = nums.length - 1;
        int max = 0;
        int min = nums.length - 1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[max]) {
                max = i;
            } else if (nums[max] > nums[i]) {
                low = i;
            }
            if (nums[n - i - 1] < nums[min]) {
                min = n - i - 1;
            } else if (nums[n - i - 1] > nums[min]) {
                high = n - i - 1;
            }
        }
        
        if (high >= low) {
            return 0;
        } else
            return low - high + 1;
    }
}