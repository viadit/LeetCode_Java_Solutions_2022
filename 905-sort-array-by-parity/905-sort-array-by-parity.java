class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        
        if (nums.length == 1)
            return nums;
        
        while (low < high) {
            if (nums[low] % 2 != 0 && nums[high] % 2 == 0) {
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                low++;
                high--;
            }
            
            if (nums[low] % 2 == 0)
                low++;
            if (nums[high] % 2 != 0)
                high--;
            
        }
        return nums;
    }
}