class Solution {
    public int findUnsortedSubarray(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int low = nums.length - 1;
        int high = 0;
        
        for (int i = 0; i < nums.length; ) {
            if (st.empty()) {
                st.push(i);
                i++;
            } else {
                if (nums[st.peek()] > nums[i]) {
                    low = Math.min(low, st.peek());
                    st.pop();
                } else {
                    st.push(i);
                    i++;
                }
            }
        }
        
        st.clear();
        for (int i = nums.length - 1; i >= 0;) {
            if (st.empty()) {
                st.push(i);
                i--;
            } else {
                if (nums[st.peek()] < nums[i]) {
                    high = Math.max(high, st.peek());
                    st.pop();
                } else {
                    st.push(i);
                    i--;
                }
            }
        }
        
        if (low >= high)
            return 0;
        else 
            return high - low + 1;
    }
}