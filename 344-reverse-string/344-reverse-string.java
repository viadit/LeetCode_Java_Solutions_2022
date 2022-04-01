class Solution {
    public void reverseString(char[] s) {
        int low = 0;
        int high = s.length - 1;
        solve(s, low, high);
    }
    
    public void solve(char[] s, int low, int high) {
        if (low >= high) {
            return;
        }
        
        char temp = s[low];
        s[low] = s[high];
        s[high] = temp;
        
        solve(s, ++low, --high);
    }
}