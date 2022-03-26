class Solution {
    public int search(int[] nums, int target) {
        
        int len = nums.length;
        int low = 0;
        int high = len - 1;
        int index = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] == target) {
                index = mid;
            }
            
            if (nums[mid] < target) {
                low = mid + 1;
            }
            
            else {
                high = mid - 1;
            }
        }
        
        return index;
    }
}