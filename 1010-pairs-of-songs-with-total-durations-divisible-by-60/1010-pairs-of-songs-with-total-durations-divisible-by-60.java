class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] remainderMap = new int[60];
        int ans = 0;
        
        for (int songTime : time) {
            int remainder = songTime % 60;
            remainderMap[remainder]++;
        }
        
        for (int i = 1; i < 30; i++) {
            ans += (remainderMap[i] * remainderMap[60 - i]);
        }
        
        if (remainderMap[0] > 0) {
            ans += remainderMap[0] * (remainderMap[0] - 1) / 2;
        }
        
        if (remainderMap[30] > 0) {
            ans += remainderMap[30] * (remainderMap[30] - 1) / 2;
        }
        
        return ans;
    }
}