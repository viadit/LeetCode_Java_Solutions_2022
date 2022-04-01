class Solution {
    public void reverseString(char[] s) {
        Stack<Character> stack = new Stack<>();
        String str = new String(s);
        
        for (int i = 0; i < s.length; i++) {
            stack.push(s[i]);
        }
        
        char[] ans = new char[s.length];
        int i = 0;
        
        while (stack.size() > 0) {
            s[i++] = stack.pop();
        }
        
        for (int j = 0; j < str.length(); j++) {
            ans[j] = str.charAt(j);
        }
    }
}